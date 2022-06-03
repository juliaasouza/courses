function tratamentoErros(array, num){
    try{
        if(!array || !num) throw new ReferenceError('Parâmetros inválidos!');

        if(typeof array !== 'object') throw new TypeError('O primeiro elemento deve ser do tipo array!');

        if(typeof num !== 'number') throw new TypeError('O segundo elemento deve ser do tipo number!');

        if(array.length !== num) throw new RangeError('O tamanho do array não coincide com o número informado!');
    }

    catch(e){
        if(e instanceof ReferenceError){
            console.log('Reference Error.');
        }
        else if(e instanceof TypeError){
            console.log('Type Error.');
        }
        else if(e instanceof RangeError){
            console.log('Range Error.');
        }
        else{
            console.log('Outro erro!');
        }

        console.log(e.stack);
    }
}

console.log(validaArrays([1, 2, 3], 0));