// src/main/resources/static/js/national-parks.js

function searchNationalParks() {
    const locationInput = $('#locationInput').val();

    // Perform API request to get national parks based on the location
    $.get(`https://developer.nps.gov/api/v1/parks?q=${locationInput}&api_key=YOUR_NPS_API_KEY`, function (data) {

        displayResults(data.data);
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