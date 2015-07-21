function populateListView()
{
    var data = Get("/cats");
    var json_obj = JSON.parse(data);
    var ul = document.getElementById("catListView");
    for(i = 0; i < json_obj.length; i++) {
        var li = document.createElement("option");
        li.setAttribute("value",
        json_obj[i].catid + ";" +
        json_obj[i].name + ";" +
        json_obj[i].color + ";" +
        json_obj[i].pic + ";" +
        json_obj[i].race + ";" +
        json_obj[i].gender);
        li.appendChild(document.createTextNode(json_obj[i].name));
        ul.appendChild(li);
    }
}
populateListView();

function populateForm()
{
    var data = Get("/catFormInit");
    var json_obj = JSON.parse(data);

    var pic = document.getElementById("pic");
    var picImg = document.getElementById("picImg");
    pic.setAttribute("value", json_obj.pic);
    picImg.setAttribute("src", json_obj.pic);
}

function Get(yourUrl)
{
    var Httpreq = new XMLHttpRequest(); // a new request
    Httpreq.open("GET",yourUrl,false);
    Httpreq.send(null);
    return Httpreq.responseText;

}
function getSelectedCat()
{
    var e = document.getElementById("catListView");
    var value = e.options[e.selectedIndex].value;
    var text = e.options[e.selectedIndex].text;

    var catid = document.getElementById("catid");
    var name = document.getElementById("name");
    var color = document.getElementById("color");
    var pic = document.getElementById("pic");
    var race = document.getElementById("race");
    var gender = document.getElementById("gender");

    var fields = value.split(";");
    if(fields.length == 6){
        catid.setAttribute("value", fields[0]);
        name.setAttribute("value", fields[1]);
        color.setAttribute("value", fields[2]);
        pic.setAttribute("value", fields[3]);
        picImg.setAttribute("src", fields[3]);
        race.setAttribute("value", fields[4]);

        for (var i = 0; i < gender.options.length; i++) {
            if (gender.options[i].value == fields[5]) {
                gender.options[i].selected = true;
                return;
            }
        }
    }
}

function emptyIdField()
{
    var catid = document.getElementById("catid");
    catid.setAttribute("value", "");
}

function emptyFormFields()
{
    var catid = document.getElementById("catid");
    var name = document.getElementById("name");
    var color = document.getElementById("color");
    var pic = document.getElementById("pic");
    var picImg = document.getElementById("picImg");
    var race = document.getElementById("race");
    var gender = document.getElementById("gender");

    catid.setAttribute("value", "");
    name.setAttribute("value", "");
    color.setAttribute("value", "");
    pic.setAttribute("value", "");
    picImg.setAttribute("src", "");
    race.setAttribute("value", "");

    for (var i = 0; i < gender.options.length; i++) {
        if (gender.options[i].value == "m") {
            gender.options[i].selected = true;
            return;
        }
    }

}


