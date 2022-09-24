import matplotlib.pyplot as plt
import numpy as np
from matplotlib.ticker import FormatStrFormatter
with open('DH_Prober.txt','r') as file:

    ans = []
    double=[]
    # reading each line    
    for line in file:
   
        # reading each word        
        ans.append(line.split())
            
   
            # displaying the words
    file.close()

double = ans[2]
r = [x for x in range(1000,100001,1000)]
for i in range(len(double)):
    double[i] = float(double[i])

r = np.array(r)
double = np.array(double)
import numpy as np
import numpy as np
from scipy.interpolate import make_interp_spline
import matplotlib.pyplot as plt

double_Spline = make_interp_spline(r,double)

r_ = np.linspace(r.min(), r.max(), 500)
doub_ = double_Spline(r_)

plt.plot(r_, doub_, color ='red',
         label ='Double Hashing')

#plt.legend()
plt.xlabel("Number of entries of data")
plt.ylabel("Time in seconds")
#plt.title("Double Hashing")
plt.title("Double Hashing")
#plt.show()
# Plotting the Graph
plt.savefig("Double Hashing.png")





