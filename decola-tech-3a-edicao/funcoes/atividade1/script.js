const alunos = [
{ 
    nome: 'José',
    nota: 5,
},
{
    nome: 'Fernanda',
    nota: 7,
},
{
    nome: 'Rosana',
    nota: 4,
},
{
    nome: 'Julia',
    nota: 6,
}
];

function alunosAprovados(array, mediaFinal){
    let aprovados = [];

    for(let i = 0; i < array.length; ++i){
        if(array[i].nota >= mediaFinal) aprovados.push(array[i].nome);
    }

    return aprovados;
}

//console.log(alunosAprovados(alunos, 5));
//console.log(alunosAprovados(alunos, 7));