# App-Hand-In
Android Studio

# REUSE

## General Info

The idea for this project arose as I recently threw out a sofa with small damages, but perfectly fine. 
I order the garbage collector from Affaldvarme Aarhus, also known as  "Storskrald". 
However, after a discussion with friends, who have collector several items from "Storskrald", I figured it could be interesting to develop an optimised system, with the pupose of recycling better.

Affaldvarme Aarhus, actually has a great website with various of good information on how to recycle and reuse better. 
The challenge is however, that the process of ordering the garbage collector is complicated and the website is messy as the website has a scattered purpose of: district heating and garbage.

### The REUSE App
As a first priority REUSE should be able to order the garbage collector, in a simple way. Moreover customers should be able to take a picture of the items, that are to be collected.

If it is possible the idea is to sort of create a Marketplace like Facebooks´ for items that would be thrown away otherwise. The pupose is to make it easy for users to get rid of goods/items in the city, but rather than throwing it away, recycling the items. Discuss this with teachers :) 

The REUSE App will be heavily inspired by the content of https://www.affaldvarme.dk/

## Requirements ordered by the MoSCoW method

### Must have
- [ ] Sign-In and login
- [ ] Navigation bar
- [ ] Search bar
- [ ] Roles (End-user and Affaldvarme Aarhus)
- [ ] Booking system for garbage collector
  - [ ] Title, description
  - [ ] Maps
  - [ ] Camera
- [ ] Permission to: use camera, track location.
- [ ] Tips and tricks page
- [ ] Sorting advice page
- [ ] About us page
- [ ] Editable for certain roles (ex. delete)


### Should have
- [ ] Post items on REUSE
     - [ ] Title, description, condition, color, picture.
     - [ ] Maps
     - [ ] Camera
- [ ] Browse through items on REUSE + description 
- [ ] Chat function
- [ ] Booking system: Automated date


### Could have
- [ ] Prompt message when ordering garbage car (“Are you sure your items are not reusable? Try our feature REUSE”)
      (Customers should be informed of others options than to throw the item(s) away) 
- [ ] REUSE: Choose item --> track location --> let user “take” the item by confirming 
  - (Delete item, cancel garbage car)


### Wil not include
- [ ] Admin features
    - [ ] Ability moderate users and Affaldvarme Aarhus users
    - [ ] Logs into username/ password secured, admin portal on any app, and see user analytics (number of users on the app, new downloads, their email IDs/ contact details).
    
- [ ] Notify function: 
  If left behind garbage is found around the city, a user can notify the system with a picture and a quick description.
  A quick description is the same formula as when a user orders the garbage collector on their own, however the formula is optional to fulfill, and thereby easier for users 	to quickly notify the system.
  If confirmed by a certain number of people over a specified period of time the garbage car will be ordered automatically. 
 

## First draft sketch

![alt text](https://github.com/Camilla-Moller/App-Hand-In/blob/master/app/src/158432612_3587778344665668_989699080335319988_n.jpg)


## User Story
Lou has decided she wants a new couch. The old one does not really go with the new painting in the living room. So Lou now has an extra couch. Lou would like an app where she can order the “storskrald” car to some and collect her couch, as she does not have a car on her own. And do not have the surplus to set it for sale and deal with all of the communication back and forth. Lou never uses her computer, so she wants to use her phone to order the pick-up. 

Lou, thinks it would be nice if the couch could be used some way else, as it is not broken or have any damages to it. Lou finds out that when she orders the “storskrald” car, the couch is considered as garbage, and will not be reused. Lou thinks this is sad.

Lou considers to put it on Facebook Marketplace. But has prior experience with selling things on the platform, and thinks it is not worth the time.
Lou often goes for walks, and she sees “storskrald” all over the town. Ones Lou took a dresser, with her home that she painted and made it look nice. This is her favorite dresser now. She thought it would be smart if you could see a picture of “Storskrald” around the town. That way she would maybe be able to see if there was something interesting out there that she could reuse. However, Lou does not want to take unnecessary trips to pick up stuff that has been already collected. She thinks it could be nice if people could confirm a pickup. 

Lou often makes dinner. But she does not know how to sort her garbage, furthermore she does not have a lot of space and cares a great deal about interior. But she has not yet found any good tips or tricks that is functional in a busy weekday. 

### Requirements prioritized by users 
(Same as the first requirements list, just ordered differently)

Functionality for End User
-	Sign Up
-	Allows permission to track location
-	Allows permission to access camera
-	Booking system – book the garbage car
    - Calendar
    - Time interval
-	Post items on REUSE
    - Enter: item, description, condition, color, picture
-	See list of items posted in REUSE (Coming from backend)
-	See individual description of items on REUSE
-	Choose item --> track location --> let user “take” the item by confirming.
    - Delete
-	On tips and tricks page users shall be inspired on how to make garbage interior look good.
-	On Sorting the user shall see good advice on how to sort garbage properly. 
-	Chat function, to ask questions to experts.
-	See about us, and the concept of REUSE

Functionality of App for Affaldvarme Aarhus
-	Signup, registration after authentication (employee id)
-	See map over registered pick-up
-	Delete items/pick-ups
-	Edit calendar and time interval for pick-ups
-	Edit tips and tricks
-	Edit Sorting
-	Edit About Us

Admin features
-	Ability moderate users and Affaldvarme Aarhus users
-	Logs into username/ password secured, admin portal on any app, and see user analytics (number of users on the app, new downloads, their email IDs/ contact details).
-	Edit all pages


