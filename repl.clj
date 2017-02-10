(require '[cljs.repl :as repl])
(require '[cljs.repl.node :as node])

(repl/repl* (node/repl-env)
  {:watch "src"
   :foreign-libs [{:file "src" :module-type :es6}]})
