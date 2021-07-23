
$(function (){
    /*--------------------------------------- start visit record ---------------------------------------*/
    $.ajax({
        url: getContextPath()+"/site/init/record",
        type: 'get',
        contentType: "application/json",
        headers: {sign : sign("record")},
        success: function (res) {},
        error: function () {
            $.shotTotal("出错了！", "error");
        }
    });

    /*--------------------------------------- end visit record ---------------------------------------*/
    $.ajax({
        url: getContextPath()+"/site/about/list",
        type: 'get',
        contentType: "application/json",
        headers: {sign : sign("about")},
        success: function (res) {
            if(res.code=="200"){
                var about = res.data;
                for(var i=0;i<about.length;i++){
                   var content = '';
                    content+='<div class="media-heading-wrapper"><div class="media-object pull-left"><i class="'+about[i].mediaIcon+'">' +
                        '</i></div><h3 class="media-heading">'+about[i].mediaHeading+'</h3></div><div class="media-body">' +
                        '<p>'+about[i].mediaBody+'</p></div>'
                   $("#media_"+i).html(content);
                }
            }
        },
        error: function () {
            $.shotTotal("出错了！", "error");
        }
    });
    /*--------------------------------------- end site about ---------------------------------------*/
    /*--------------------------------------- start site support ---------------------------------------*/
    $.ajax({
        url: getContextPath()+"/site/support/list",
        type: 'get',
        contentType: "application/json",
        headers: {sign : sign("support")},
        success: function (res) {
            if(res.code=="200"){
                var support = res.data;
                for(var i=0;i<support.length;i++){
                    var content = '';
                    content+='<i class="'+support[i].supportIcon+'"></i><h4>'+support[i].supportHeading+'</h4><p>'+support[i].supportBody+'</p>';
                    $("#service_"+i).html(content);
                }
            }
        },
        error: function () {
            $.shotTotal("出错了！", "error");
        }
    });
    /*--------------------------------------- end site support ---------------------------------------*/
    /*--------------------------------------- start site team ---------------------------------------*/
    $.ajax({
        url: getContextPath()+"/site/team/list",
        type: 'get',
        contentType: "application/json",
        headers: {sign : sign("team")},
        success: function (res) {
            if(res.code=="200"){
                var team = res.data;
                for(var i=0;i<team.length;i++){
                    var content = '';
                    content+='<img src="'+getContextPath()+team[i].teamImg+'" class="img-responsive" alt="team img 3"><div class="team-des"><h4>'+team[i].teamName+'</h4>' +
                        '<span>'+team[i].teamPosition+'</span><p>'+team[i].teamDescription+'</p></div>'
                    $("#team_"+i).html(content);
                }
            }
        },
        error: function () {
            $.shotTotal("出错了！", "error");
        }
    });
    /*--------------------------------------- end site team ---------------------------------------*/
    /*--------------------------------------- start portfolio team ---------------------------------------*/
    $.ajax({
        url: getContextPath()+"/site/portfolio/list",
        type: 'get',
        contentType: "application/json",
        headers: {sign : sign("portfolio")},
        success: function (res) {
            if(res.code=="200"){
                var portfolio = res.data;
                for(var i=0;i<portfolio.length;i++){
                    var content = '';
                    content+='<img src="'+getContextPath()+portfolio[i].portfolioImg+'" class="img-responsive"><div class="portfolio-overlay"><h4>'
                        +portfolio[i].portfolioHeading+'</h4><p>'+portfolio[i].portfolioBody+'</p><a href="'+portfolio[i].portfolioDetail
                        +'" class="btn btn-default">DETAIL</a></div>'
                    $("#portfolio_"+i).html(content);
                }
            }
        },
        error: function () {
            $.shotTotal("出错了！", "error");
        }
    });
    /*--------------------------------------- end portfolio team ---------------------------------------*/
    /*--------------------------------------- begin sign value ---------------------------------------*/
    function sign(apiName)
    {
        var currentTime = Date.parse(new Date());
        var value1 = apiName+'_'+currentTime;
        var value2 = hex_md5(value1);
        var base = new Base64();
        var value3 = base.encode(value1+'_'+value2);
        return value3;
    }
    /*--------------------------------------- end sign value ---------------------------------------*/
    /*--------------------------------------- begin context path ---------------------------------------*/
    function getContextPath()
    {
        var pathName = document.location.pathname;
        var index = pathName.substr(1).indexOf("/");
        var result = pathName.substr(0,index+1);
        return result;
    }
    /*--------------------------------------- end context path ---------------------------------------*/
})