$(document).ready(function() {
	
	var groupColumn = 0;
    var table = $('#rs').DataTable({
    	"columnDefs": [
            { "width": "30%", "targets": 9 }
        ],
        
        "responsive" : false,
        "paging" : false,
        "searching" : false,
        "info":     false
    } );
    
} );
