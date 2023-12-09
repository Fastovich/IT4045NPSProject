// src/main/resources/static/js/national-parks.js

function searchParks() {
    // Get the search query from the input
    var query = $('#searchInput').val();
    debugger;

    // Make an AJAX request to your /parks endpoint
    $.ajax({
        url: '/parks',
        method: 'GET',
        data: { query: query },
        success: function(data) {
            // Handle the successful response
            displayResults(data);
        },
        error: function() {
            // Handle errors if any
            console.log('Error fetching data');
        }
    });
}

function displayResults(results) {
    const resultsContainer = $('#resultsContainer');
    resultsContainer.empty();

    if (results.length === 0) {
        resultsContainer.append('<p>No national parks found.</p>');
    } else {
        const list = $('<ul>');
        results.forEach(function (park) {
            list.append(`<li>${park.fullName} - ${park.states}</li>`);
        });
        resultsContainer.append(list);
    }
}