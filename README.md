# WRAPI-java-sdk
Java SDK for interacting with Radioplayer's worldwide radio api

# Introduction

The WRAPI Java SDK provides convenient methods for authenticating against and communicating with Radioplayer's Worldwide Radio API.

More information on the API itself is available at <http://docs.api.radioplayer.org/>

# Getting Started

Before you can use the SDK, you will need to contact [contact@radioplayer.co.uk](mailto:contact@radioplayer.co.uk) in order to obtain an API key which will give you access to the APIs.

Once you have an API key, you can try your credentials by updating the test-application.properties to that it points to the your PEM file. Note that the test classes will use the name of the PEM file as your API key.

You can then run the WRAPITest.java as a unit test, which will use this pem file to authenticate requests that search for stations, look up stations, and get hold of stations schedules and on demand items.

# Using the SDK

The entry point to the SDK is the WrapiFactory class. When you provide this factory with the path to your PEM file, and your API key, it will return you a WrapiConnector.

The WrapiConnector provides service classes that lets you query for:
- stations
- on demand items
- recommendations
- categories

Queries against these services accept lookup and filter parameters as specified in the [API documentation](http://docs.api.radioplayer.org/endpoints.html)

These method return completed domain objects that contain information such as:
- station names and descriptions
- show information, start and end dates
- information on songs that a station is currently playing
- lists of podcasts and other on demand items offered by stations
- recommendations for stations that match a location or type of music

# Support and more information

If you are interested in trying the WRAPI please contact [contact@radioplayer.co.uk](mailto:contact@radioplayer.co.uk). In the case of issues or bugs, please use the GitHub issues feature.




