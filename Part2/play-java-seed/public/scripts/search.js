function search() {
    let query = document.getElementById("searchContent").value;
    if (query == "") {
        window.location.href = "/search";
    } else {
        window.location.href = "/search?query=" + query;
    }  
}