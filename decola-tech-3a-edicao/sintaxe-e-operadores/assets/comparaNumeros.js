function comparaNumeros(a, b){
    let soma = a + b;
    let saoIguais = 'não são iguais', maior10 = 'não é maior que 10', menor20 = 'não é menor que 20';

    if(soma > 10){
        maior10 = 'é maior que 10';
    }
    
    if(soma < 20){
        menor20 = 'é menor que 20';
    }

    if(a === b){
        saoIguais = 'são iguais';
    }
    

    console.log("Os números " + a + " e " + b + " " + saoIguais + ". A soma entre eles é " + soma + ", que " + maior10 + " e " + menor20 + ".");
}