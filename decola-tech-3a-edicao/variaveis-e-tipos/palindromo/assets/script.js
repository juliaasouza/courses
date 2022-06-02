function palindromoReverse(string){
    if(!string) return;

    return string.split("").reverse().join("") === string;
}

function palindromoFor(string){
    if(!string) return;

    let fim = string.length() - 1;        //-1 pq queremos apenas o último índice possível
    let meio = string.length() / 2;

    for(let i =  0; i < meio; ++i){
        if(string[i] != string[fim-i]) return false;
    }

    return true;
}
