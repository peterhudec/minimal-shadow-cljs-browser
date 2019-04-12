
(ns app.main
  ;(:require-macros [app.macros])
  (:require [app.macros :as macros :refer-macros [m]]))

(defn main! []
  (println "Main"))

(defn reload! []
  (println "--------------------")
  (println "Reloaded")
  (println (m "I'm wrapped in a macro")))
