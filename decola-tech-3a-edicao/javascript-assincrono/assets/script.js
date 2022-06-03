const getCats = async() => {
    try{
        const data = await fetch('https://thatcopy.pw/catapi/rest/');
        const json = await data.json();
        return json.webpurl;
    }
    catch(e){
        console.log(e.message);
    }
};

const loadImg = async() => {
    const img = document.getElementById('img');
    img.src = await getCats();
};

loadImg();

const button = document.getElementById('button');
button.addEventListener('click', loadImg);