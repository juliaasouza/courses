const form = document.getElementById('form');

form.onsubmit = function (e){
    e.preventDefault();
    const input = document.getElementById('input');
    addTask(input.value);
    form.reset;
}

// eu tentei fazer o addTask com uma lista, mas nao consegui terminar

function addTask(task){
    const taskContainer = document.createElement('div');
    const taskCBox = document.createElement('input');
    const taskLabel = document.createElement('label');
    const taskContent = document.createTextNode(task);

    taskCBox.setAttribute('type', 'checkbox');
    taskCBox.setAttribute('name', task);
    taskCBox.setAttribute('id', task);

    taskLabel.setAttribute('for', task);
    taskLabel.appendChild(taskContent);

    taskContainer.classList.add("item");
    taskContainer.appendChild(taskCBox);
    taskContainer.appendChild(taskLabel);

    document.getElementById('tasks').appendChild(taskContainer);
}