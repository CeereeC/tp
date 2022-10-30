---
layout: page
title: User Guide
---
* Table of Contents 
{:toc}

--------------------------------------------------------------------------------------------------------------------
Travelr allows you to plan trips around the activities in your bucket list. You will be able to keep track of your bucket list, travel dates, locations, and itineraries, all within the same app!

--------------------------------------------------------------------------------------------------------------------
## Quick start

1. Ensure you have Java `11` or above installed in your Computer.
2. Download the latest `Travelr.jar` from [here](https://github.com/AY2223S1-CS2103T-W17-1/tp/releases).
3. Copy the file to the folder you want to use as the _home folder_ for Travelr.
4. Double-click the file to start the app. The GUI similar to the below should appear in a few seconds. Note how the app contains some sample data.<br>
   ![Ui](images/Ui.png)
5. Type the command in the command box and press Enter to execute it. e.g. typing **`help`** and pressing Enter will open the help window.<br>
   Some example commands you can try:

   * **`list-e`** : Lists all events.

   * **`add-e`**`n/Sightseeing d/Visit Mountains` : Adds an event with the respective title and description into your event list.

   * **`delete-e`**`3` : Deletes the 3rd event shown in the current event list.

   * **`exit`** : Exits the app.
6. Refer to the [Features](#features) below for details of each command.

--------------------------------------------------------------------------------------------------------------------

## Before Using

<div markdown="block" class="alert alert-info">

**:information_source: Explanation of our User Interface:**<br>

![UI_Explanation](images/UI_Explanation.png)
 
|`Component`|`Explanation`|
|:-:|:--|
|**Input Box**|where you enter your commands.|
|**Output Box**|where the results of your command are shown.
|**Selected Trip Box**| where the current selected trip is shown.<br><br> Use `select` to select a trip.|
|**Trip List Display** |where the Trips stored in Travelr are shown.<br><br> Commands to change the types of trips being shown:
- `completed`
- `view`
- `list` 

See feature list for more information about the commands.|
| **Event List Display** |where the Events stored in Travelr are shown.<br><br> Commands to change the types of events being shown:
- `completed`
- `view`
- `list-e`
- `select`

See feature list for more information about the commands.
 
 </div>
 
--------------------------------------------------------------------------------------------------------------------

## Features
**Notes about the UI:**

On app startup, the Trip List Display will show all trips and the Event List Display will display
the events in the bucket list i.e Events that haven't been added to any trips.

The trips display sorts the trips by completion automatically. Completed trips will remain at the bottom of the list.

Titles, Locations and Descriptions that are too long will be truncated. To view the full details of an event or trip, use `display-e` and `display` commands respectively.

**Notes about the command format:**

Words in UPPER_CASE are the parameters to be supplied by the user.
e.g. in `add n/TITLE`, TITLE is a parameter which can be used as `add n/Switzerland Trip`

Items in square brackets are optional.
e.g `NAME [t/TAG]` can be used as `John Doe t/Friend` or as `John Doe`.

The relevant prefixes must be used to separate parameters supplied by the user.
e.g. in `add-e n/TITLE d/DESCRIPTION`, `n/`  and `d/` are two designated used to separate the two parameters supplied which can be used as `add-e n/Sightseeing d/Visit mountains`.

Extraneous parameters for commands that do not take in parameters (such as bye) will be ignored.
e.g. if the command specifies `exit 123`, it will be interpreted as `exit`.

Parameters can be in any order. e.g. if the command specifies `n/TITLE d/DESCRIPTION`, `d/DESCRIPTION n/TITLE` is also acceptable.

If a parameter is expected only once in the command but you specified it multiple times, only the last occurrence of the parameter will be taken.
e.g. if you specify `n/title1 n/title2`, only `n/title2` will be taken.

`TITLE` is case-sensitive, so titles with the same letters and spacing but different capitalizations will be considered different.

Events with the same title are considered duplicates, and duplicate events are not allowed.

Trips with the same title are considered duplicates, and duplicate trips are not allowed.


### Adding events: `add-e`
Adds an event to the events list.

Format: `add-e n/TITLE d/DESCRIPTION`

Examples:
- `add-e n/Skydiving d/Skydiving with crew`
- `add-e n/Sailing d/Sail in the Danube River`

### Deleting events: `delete-e`
Deletes the specified event from the bucket list.

Format: `delete-e INDEX`
- Deletes the event at the specified INDEX.
- The index refers to the index number shown in the bucket list.
- The index must be a positive integer 1, 2, 3, …

Examples:
- `delete-e 2` deletes the 2nd event in the bucket list.

### Viewing events list: `list-e`
Shows a list of all events present in the bucket list.

Format: `list-e`

### Adding trips: `add`
Adds a trip to the trip list.

Format: `add n/TITLE d/DESCRIPTION l/LOCATION D/DATE`
- All fields are compulsory.
- Date must follow the format {dd-mm-yyyy}.

Examples:
- `add n/Trip to Iceland d/Skiing in Iceland l/Iceland D/26-12-2023`

### Delete trips: `delete`
Deletes a trip at the specified INDEX of the displayed trip list. Events in the deleted trip will be returned to the bucket list.

Format: `delete INDEX`

Examples:
- `delete 1`

### Viewing trips list: `list`
Shows a list of all trips added.

Format: `list`

### Marking trips as done: `mark`
Mark the trip in the specified INDEX as done.

![MarkCompletedUi](images/MarkCompletedUi.png)

Format: `mark INDEX`
- Marks the trip at the specified INDEX as done.
- The index refers to the index number shown in the trip list.
- The index must be a positive integer 1, 2, 3, …

Examples:
- `mark 1` marks the first trip in the trip list as done.

### Marking trips as not done: `unmark`
Mark the trip in the specified INDEX as not done.

Format: `unmark INDEX`
- Marks the trip at the specified INDEX as not done.
- The index refers to the index number shown in the trip list.
- The index must be a positive integer 1, 2, 3, …

Examples:
- `unmark 1` marks the first trip in the trip list as not done.

### Adding events to trips: `add-et`
Adds the specified event from the bucket list to the specified trip.

Format: `add-et n/EVENT NAME t/TRIP NAME`
- Adds the event with the specified EVENT NAME
- Event is added to the trip at the specified TRIP NAME
- The TRIP NAME must exist in the trips list.
- The EVENT NAME must exist in the events list.

Examples:
- `add-et n/asd t/qwe` adds the event titled asd in the bucket list to the itinerary of the trip with the title qwe

### Removing events from trips: `delete-et`
Remove the specified event from the specified trip to the bucket list.

Format: `delete-et n/EVENT NAME t/TRIP NAME`
- Remove the event with the specified event titled EVENT NAME from the specified trip titled TRIP NAME
- Event is added to the bucket list.
- The TRIP NAME must exist in the trips list.
- The EVENT NAME must exist in the trip itinerary.

Examples:
- `delete-et n/asd t/qwe` remove the event titled asd from the itinerary of the trip titled qwe's and returns it to the bucket list.

### Select trip `select`
Selects the trip in the specified INDEX and displays all events added to that trip in the events list panel.
Format: `select INDEX`
- Selects the trip at the specified INDEX.
- The index refers to the index number shown in the current displayed trip list.
- The index must be a positive integer 1, 2, 3, …

### Sorting trips: `sort`
Sorts the trips according to the provided factor.

Format: `sort [by/FACTOR] [r/]`
- Sorts the trip according to provided FACTOR.
- FACTOR is case-insensitive
- Marked and unmarked trips are sorted separately.
- Order of sort reversed when the `r/` prefix is provided.
- The trips will be sorted by their title in alphabetical order by default.
- A valid FACTOR must be provided if the `by/` prefix is provided.
- Extraneous parameters for `r/` prefix will be ignored.

Examples:
- `sort by/time r/` sorts the trip by reversed chronological order.

| FACTOR | Description |
| --- | --- |
| nothing | Default sort will be used |
| `title` | Sort by trips' title in alphabetical order |
| `time` | Sort by trips' date in chronological order |
| `location` | Sort by trips' location in alphabetical order |
| `eventcount` | Sort by trips' number of events in ascending order |

### Sorting Events within Bucket List: `sort-e`
Sorts the events in Bucket List according to alphabetical order.

Format: `sort-e [r/]`
- Order of sort reversed when the `r/` prefix is provided.
- Extraneous parameters for `r/` prefix will be ignored.

### View all completed trips and events: `completed`
Displays all completed trips and events.

Format: `completed`

### View all trips and events: `view`
Displays all trips and events

Format: `view`

### Display single trip: `display`
Displays the full title, description, location (if a location has been defined for the trip),
date (if a date has been defined for the trip) of the trip at the specified INDEX of the displayed trip list in the command box.

Format: `display INDEX`

### Display single event: `display-e`
Displays the full title, description of the event at the specified INDEX of the displayed events list in the command box.

Format: `display-e INDEX`

### View lifetime summary: `summary`
Displays a summary window of your lifetime travels.

![Summary_Window](images/SummaryScreenshot.png)

Format: `summary`

- Calculates the number of unique locations you visited.
- Includes list of completed trips.
- Total number of completed trips and events.
- Progress indicator for trips and events.
- Command must be used again to view updates to the summary.

### Clearing all entries: `clear`

Clears all entries from Travelr, which includes the trips and the events.

Format: `clear`


### Viewing help: `help`

Shows a command summary as well as link to the User Guide page. The link can be copied by clicking the `Copy URL` button.

![help message](images/helpMessage.png)

Format: `help`

### Saving data
Travelr data are saved locally automatically after any command that changes the data. There is no need to save manually.

### Exiting the program: `exit`
Exits the program.

Format: `exit`

## Glossary

* **Bucket list**: List of events that haven't been added to any trips
* **Displayed events list**: List of events being displayed in the right panel of the UI
* **Displayed trips list**: List of trips being displayed in the left panel of the UI


