import math
import random

n = 0

coprime = 0
cofactor = 0

# change the 6660 to any number you like to get an approximation of π
while (n < 6660)

  # must also match here in the range for an accurate estimation
  a = random.randint (1, 6660)
  b = random.randint (1, 6660)
  
  i = 2
  
  while (True) :
  
    if i == a or i == b
    
      coprime += 1
      break
      
    elif a % i == 0 and b % i == 0 :
    
      cofactor += 1
      
    i += 1
    
  j += 1
  
print ("Pi is approximately " + str (math.sqrt (6 / (coprimt / (cofactor + coprime)))))

# the probability of two randomly chosen integers being coprime is 6 / π^2
# using numerical analysis, we can approximate π through a series of randomly
# generating integers and rearranging the equation to solve for π
