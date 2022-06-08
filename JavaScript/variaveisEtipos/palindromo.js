//solução 1

function verificapalindromo(string) {
  if (!string) return "string inexistente";

  if (string.split("").reverse().join("") === string) return "É um palindromo";
  else return "não é um palindromo";
}

console.log(verificapalindromo("ovo"));
console.log(verificapalindromo("gato"));
console.log(verificapalindromo());

//solução 2

function verificapalindromo2(string) {
  if (!string) return "string inexistente";

  for (let i = 0; i < string.length / 2; i++) {
    if (string[i] !== string[string.length - 1 - i]) {
      return false;
    }
  }
}
