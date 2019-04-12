(ns app.macro-helpers
  "Updates to this namespace will not be detected
  by shadow-cljs watch, because it is only used inside of a macro.")

(defn helper [x]
  (str "I'm a macro helper and I don't reload. "
       [x x x]))
