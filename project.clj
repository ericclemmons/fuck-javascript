; What's the equivalent of `nvm use latest` and `npm init -y`?
(defproject fuck-javascript "1.0.0" ; Can this be anything?
  :dependencies [[org.clojure/clojure "1.9.0-alpha14"] ; Howdy do I know what versions I should be using?
                 [org.clojure/clojurescript "1.9.456"] ; Same here
                 [cljsjs/react "15.4.2-0"]
                 [cljsjs/react-dom "15.4.2-0"]
                 [cljsjs/react-dom-server "15.4.2-0"]] ; Ok, I know these guys
  :jvm-opts ^:replace ["-Xmx1g" "-server"]) ; No idea what this does

