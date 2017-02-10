export const sayHello = () => console.log("Hello ClojureScript!");

export const sayThings = (xs) => {
  for (const x of xs) {
    console.log(x);
  }
};
