(ns app.macros
  (:require [app.macro-helpers :as helpers]))

(defmacro m [& forms]
  `(do
     (println (str "I'm a macro and I reload"))
     (println ~(helpers/helper "Foo"))
     ~@forms))
