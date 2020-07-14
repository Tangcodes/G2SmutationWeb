$(document).ready(function() {
	
	var groupColumn = 0;
    var table = $('#database').DataTable({
    	"columnDefs": [
    	    { "orderable": false, "targets": 4},
    	    { "orderable": false, "targets": 5},
    	    { "orderable": false, "targets": 6},
    	    { "orderable": false, "targets": 7}, 
    	    { "visible": false, "targets": 0 },
    	    //18+12+40
    	    //{ "width": "8%", "targets": 6 },
    	    //{ "width": "40%", "targets": 7 }
            //{ "width": "30%", "targets": 8 }
            //{ "width": "30%", "targets": 9 }
        ],
        
        "order": [[ groupColumn, 'asc' ],[2,'asc'],[4,'asc']],
        "scrollX": false,
        //"scrollY": "600px",
        "responsive" : false,
        "paging" : false,
        "searching" : false,
        "info":  false,
    } );
    
    var rowsOne = [],nodesOne = table.column(1).nodes();
    var rowsTwo = [],nodesTwo = table.column(2).nodes();
    var rowsThree = [],nodesThree = table.column(3).nodes();
    var rowsFour = [],nodesFour = table.column(4).nodes();
    
    nodesOne.each(function(cellOne,iOne){
        if(iOne != 0) {
            if($(cellOne).text() == $(nodesOne[iOne-1]).text()) {
                var rowOne = rowsOne.pop();
                rowsOne.push({
                    cell: cellOne,
                    rowspan: rowOne.rowspan+1,
                });
            } else {
            	rowsOne.push({
                    cell : cellOne,
                    rowspan: 1,
                });
            }
        } else {
        	rowsOne.push({
                cell : cellOne,
                rowspan: 1,
            });
        }
    });
    
    nodesTwo.each(function(cellTwo,iTwo){
        if(iTwo != 0) {
            if($(cellTwo).text() == $(nodesTwo[iTwo-1]).text()) {
                var rowTwo = rowsTwo.pop();
                rowsTwo.push({
                    cell: cellTwo,
                    rowspan: rowTwo.rowspan+1,
                });
            } else {
            	rowsTwo.push({
                    cell : cellTwo,
                    rowspan: 1,
                });
            }
        } else {
        	rowsTwo.push({
                cell : cellTwo,
                rowspan: 1,
            });
        }
    });
    
    
    nodesThree.each(function(cellThree,iThree){
        if(iThree != 0) {
            if($(cellThree).text() == $(nodesThree[iThree-1]).text()) {
                var rowThree = rowsThree.pop();
                rowsThree.push({
                    cell: cellThree,
                    rowspan: rowThree.rowspan+1,
                });
            } else {
            	rowsThree.push({
                    cell : cellThree,
                    rowspan: 1,
                });
            }
        } else {
        	rowsThree.push({
                cell : cellThree,
                rowspan: 1,
            });
        }
    });
    
    
    nodesFour.each(function(cellFour,iFour){
        if(iFour != 0) {
            if($(cellFour).text() == $(nodesFour[iFour-1]).text()) {
                var rowFour = rowsFour.pop();
                rowsFour.push({
                    cell: cellFour,
                    rowspan: rowFour.rowspan+1,
                });
            } else {
            	rowsFour.push({
                    cell : cellFour,
                    rowspan: 1,
                });
            }
        } else {
        	rowsFour.push({
                cell : cellFour,
                rowspan: 1,
            });
        }
    });
    
    //
    var index = 0;
    $(rowsOne).each(function(cellOne,itemOne){
        $(nodesOne[index]).attr('rowspan',itemOne.rowspan);
        for(var i = 1; i<itemOne.rowspan;i++){
            $(nodesOne[index+i]).remove();
        }
        index += itemOne.rowspan;
    });
    
    index = 0;
    $(rowsTwo).each(function(cellTwo,itemTwo){
        $(nodesTwo[index]).attr('rowspan',itemTwo.rowspan);
        for(var i = 1; i<itemTwo.rowspan;i++){
            $(nodesTwo[index+i]).remove();
        }
        index += itemTwo.rowspan;
    });
    
    index = 0;
    $(rowsThree).each(function(cellThree,itemThree){
        $(nodesThree[index]).attr('rowspan',itemThree.rowspan);
        for(var i = 1; i<itemThree.rowspan;i++){
            $(nodesThree[index+i]).remove();
        }
        index += itemThree.rowspan;
    });
	
    index = 0;
    $(rowsFour).each(function(cellFour,itemFour){
        $(nodesFour[index]).attr('rowspan',itemFour.rowspan);
        for(var i = 1; i<itemFour.rowspan;i++){
            $(nodesFour[index+i]).remove();
        }
        index += itemFour.rowspan;
    });
    
} );
