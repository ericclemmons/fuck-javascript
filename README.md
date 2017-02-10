# fuck-javascript

> Trying out https://clojurescript.org/guides/javascript-modules

Check out the comments in the code to see where my ignorance of ClojureScript is.

## Dependencies

I think I installed all of these with `brew`:

- `lein`
- `rlwrap`

## Watching

```shell
lein trampoline run -m clojure.main watch.clj
```

### Running

```
node build/bundle
```

### REPL

```shell
rlwrap lein trampoline run -m clojure.main repl.clj
```

I noticed that I get an error when doing:

```cljs
(require '[fuck-javascript.hello :as hello] :reload)
; SyntaxError: Identifier 'sayHello$$module$src$fuck_javascript$hello' has already been declared
;     at /Users/Eric/Projects/ericclemmons/fuck-javascript/.cljs_node_repl/src/fuck-javascript/hello.js:1:1
```

So no idea if I'm supposed to be doing something when the instructions say:

> Reload your JavaScript module and try the new functionality:

---

Skipped the entire part about downloading:

```shell
curl -O https://cdnjs.cloudflare.com/ajax/libs/babel-standalone/6.18.1/babel.min.js
```

Because, there are already existing Babel needs I'm aware of (e.g. decorators)
that make this not applicable.

---

