function calculaIdade(anos) {
	return `Daqui a ${anos} anos, ${this.nome} terá ${
		this.idade + anos
	} anos de idade.`;
}

const pessoa = {
    nome: "Josefina",
    idade: 20,
};
const pessoa2 = {
    nome: "Álvaro",
    idade: 32,
};

console.log(calculaIdade.apply(pessoa, [3]));
console.log(calculaIdade.call(pessoa, 1));

console.log(calculaIdade.apply(pessoa2, [5]));
console.log(calculaIdade.call(pessoa2, 7));