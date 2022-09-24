import matplotlib.pyplot as plt
import numpy as np
from matplotlib.ticker import FormatStrFormatter
with open('Quadratic_Prober.txt','r') as file:
    quad = []
    ans = []
    # reading each line    
    for line in file:
   
        # reading each word        
        ans.append(line.split())

            # displaying the words
    file.close()

quad = ans[2]
r = [x for x in range(1000,100001,1000)]
for i in range(len(quad)):
    quad[i] = float(quad[i])

r = np.array(r)
quad = np.array(quad)
import numpy as np
import numpy as np
from scipy.interpolate import make_interp_spline
import matplotlib.pyplot as plt

quad_Spline = make_interp_spline(r,quad)

r_ = np.linspace(r.min(), r.max(), 500)
quad_ = quad_Spline(r_)

plt.plot(r_, quad_, color ='blue', 
         label ='Quadratic Probing')

#plt.legend()
plt.xlabel("Number of entries of data")
plt.ylabel("Time in seconds")
#plt.title("Double Hashing")
plt.title("Quadratic Probing")
#plt.show()
# Plotting the Graph
plt.savefig("Quadratic_Probing.png")





