import matplotlib.pyplot as plt
import numpy as np
from matplotlib.ticker import FormatStrFormatter
with open('Prober.txt','r') as file:
    binary = []
    linear = []
    quad = []
    ans = []
    # reading each line    
    for line in file:
   
        # reading each word        
        ans.append(line.split())
            
   
            # displaying the words
    file.close()

binary = ans[1]
linear = ans[3]
quad = ans[5]
doub = ans[7]
r = [x for x in range(1000,100001,1000)]
for i in range(len(binary)):
    binary[i] = float(binary[i])
for i in range(len(linear)):
    linear[i] = float(linear[i])
for i in range(len(quad)):
    quad[i] = float(quad[i])
for i in range(len(doub)):
    doub[i] = float(doub[i])

binary = np.array(binary)
r = np.array(r)
linear = np.array(linear)
doub = np.array(doub)
quad = np.array(quad)
import numpy as np
import numpy as np
from scipy.interpolate import make_interp_spline
import matplotlib.pyplot as plt

lin_Spline = make_interp_spline(r,linear)

r_ = np.linspace(r.min(), r.max(), 500)
lin_ = lin_Spline(r_)

plt.plot(r_, lin_, color ='green', 
         label ='Linear Probing')

bin_Spline = make_interp_spline(r,binary)

# Returns evenly spaced numbers
# over a specified interval.
r_ = np.linspace(r.min(), r.max(), 500)
bin_ = bin_Spline(r_)
plt.plot(r_, bin_, color ='orange', 
         label ='Binary Probing (Proposed Algorithm)')

quad_Spline = make_interp_spline(r,quad)

r_ = np.linspace(r.min(), r.max(), 500)
quad_ = quad_Spline(r_)

plt.plot(r_, quad_, color ='blue', 
         label ='Quadratic Probing')

doub_Spline = make_interp_spline(r,doub)

r_ = np.linspace(r.min(), r.max(), 500)
doub_ = doub_Spline(r_)

plt.plot(r_, doub_, color ='red', 
         label ='Double Hashing')

#plt.legend()
plt.xlabel("Number of entries of data")
plt.ylabel("Time in seconds")
#plt.title("Double Hashing")
plt.title("Comparison between various probing techniques")
#plt.show()
# Plotting the Graph
plt.savefig("Hashing_Probing.png")





