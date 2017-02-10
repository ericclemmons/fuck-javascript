(ns fuck-javascript.core
  (:require [cljs.nodejs :as nodejs]
            [fuck-javascript.hello :as hello])) ; What's the equivalent of `import { sayHello } from "fuck-javascript/hello"`?

(nodejs/enable-util-print!) ; I guess I should look this up...

(defn -main [& args] ; Gotta learn the -main syntax
  (hello/sayHello))

(set! *main-cli-fn* -main) ; This looks like code golf.
