let counter = 0;

const CURRENT_NUMBER = document.getElementById('currentNumber');
document.getElementById('adicionar').addEventListener("click", increment);
document.getElementById('subtrair').addEventListener("click", decrement);

function increment(){
    if(counter >= 10){
        window.alert("Não é possível incrementar mais!");
        return;
    }
    
    counter++;
    CURRENT_NUMBER.innerHTML = counter;

    if(counter >= 0){
        document.getElementById('currentNumber').style.color = "black";
    }
}

function decrement(){
    if(counter <= -5){
        window.alert("Não é possível decrementar mais!");
        return;
    }

    counter--;
    CURRENT_NUMBER.innerHTML = counter;
    
    if(counter < 0){
        document.getElementById('currentNumber').style.color = "red";
    }
}