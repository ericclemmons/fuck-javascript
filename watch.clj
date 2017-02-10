(require '[cljs.build.api :as build]) ; What's the difference with '?

(build/watch "src"
  {:output-to    "build/bundle.js" ; Changed this because I don't like build artifacts in my root folder
   :output-dir   "build"
   :main         'fuck-javascript.core ; Surprised this isn't quoted with ""
   :target       :nodejs
   :foreign-libs [{:file "src"
                   :module-type :es6}] ;; or :commonjs / :amd
   :verbose      true})
