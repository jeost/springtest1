alert("js테스트");
//ajax를 쓰기 위해 jquery cdn이 필요

$.ajax({
    url:"getdata",
    success:function(re){
        alert("통신확인"+re);
        $("#divbox").html(re);
    }
})