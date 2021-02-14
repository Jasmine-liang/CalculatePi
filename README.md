## Calculating PI using MonteCarlo Method
I visualize this process using Java Swing. Also write a calculation without the Graphics things, it's faster:)
- VisualizedPi: The Visualized version
- Pi: Non-visualized version
### This is the result of Visualization
![PiImg](/img/pi.png "Calculating PI")
---
### Explaination of this design
Pi = (4 * circleArea) / squareArea
<br>
But how do we know the circleArea without knowing Pi?  
Here we use points:
- First we generate random points
- Those that fall in the cirlce represent the area of the circle: **circleArea**
- The total number of points represents the area of the square: **squareArea**
### Reference 
- [Monte Carlo method - Wikipedia](https://en.wikipedia.org/wiki/Monte_Carlo_method)
- 看得见的算法，幕课网
