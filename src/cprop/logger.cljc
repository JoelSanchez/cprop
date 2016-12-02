(ns cprop.logger
  #?@(:cljs [(:require [goog.log :as glog])
             (:import [goog.debug Console])]))

#?(:cljs
    (defonce *logger*
      (do
        (.setCapturing (Console.) true)
        (glog/getLogger "cprop"))))

#?(:clj
    (defn log [msg]
      (prn msg)))

#?(:cljs
    (defn log [msg]
      (glog/info *logger* msg)))
