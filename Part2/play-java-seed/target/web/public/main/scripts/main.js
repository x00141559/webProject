function search() {
    let query = document.getElementById("searchContent").value;
    if (query == "") {
        window.location.href = "/search";
    } else {
        window.location.href = "/search?query=" + query;
    }  
}


function purchase() {
    let divs = document.getElementsByTagName("div");
    for(var i = 0; i < divs.length; i++){
       if(divs[i].classList.contains("hidden")) {
        divs[i].classList.remove("hidden");
       }
    }
}