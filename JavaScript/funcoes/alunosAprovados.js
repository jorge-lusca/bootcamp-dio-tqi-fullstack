const alunos = [
  {
    nome: "João",
    nota: 5,
    turma: "1B",
  },
  {
    nome: "Sofia",
    nota: 9,
    turma: "1B",
  },
  {
    nome: "Paulo",
    nota: 6,
    turma: "2C",
  },
  {
    nome: "Miguel",
    nota: 3,
    turma: "2C",
  },
];

function alunosAprovados(array, media) {
  let aprovados = []; //Declara aqui pois se declarar no for, criará um array pra cada loop.
  for (let i = 0; i < array.length; i++) {
    const { nota, nome } = array[i]; // object destructuring, assim utilizamos apenas as propriedades que queremos.

    if (nota >= media) {
      // com o destructuring, não precisa escrever array[i].nota, apenas "nota"
      aprovados.push(nome);
    }
  }

  return aprovados;
}

console.log(alunosAprovados(alunos, 5));
