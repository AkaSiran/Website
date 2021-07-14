$(function (){
    /*--------------------------------------- start site about ---------------------------------------*/
    $.ajax({
        url: "/site/about/list",
        type: 'get',
        contentType: "application/json",
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
        url: "/site/support/list",
        type: 'get',
        contentType: "application/json",
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
        url: "/site/team/list",
        type: 'get',
        contentType: "application/json",
        success: function (res) {
            if(res.code=="200"){
                var team = res.data;
                for(var i=0;i<team.length;i++){
                    var content = '';
                    content+='<img src="'+team[i].teamImg+'" class="img-responsive" alt="team img 3"><div class="team-des"><h4>'+team[i].teamName+'</h4>' +
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
        url: "/site/portfolio/list",
        type: 'get',
        contentType: "application/json",
        success: function (res) {
            if(res.code=="200"){
                var portfolio = res.data;
                for(var i=0;i<portfolio.length;i++){
                    var content = '';
                    content+='<img src="'+portfolio[i].portfolioImg+'" class="img-responsive"><div class="portfolio-overlay"><h4>'
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
})