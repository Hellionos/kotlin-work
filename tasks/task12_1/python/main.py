# Task 12.1: program that uses a Point object

# Remember that you'll need an import statement to access the class!

from point import Point
#

p1 = Point(3.0,4.0)
print(f"{p1.x}, {p1.y}")
print(p1.distance())
p2 = Point(4.5,7.0)
print(p1.distanceTo(p2))
