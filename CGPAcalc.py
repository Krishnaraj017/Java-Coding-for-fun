from tkinter import *
master = Tk()
master.title("CGPA Calculator")
marks=[]
credits=[]
#Function To Calculate CGPA
def CGPA() :
    i=0
    sum=0
    csum=0
    cgpa.delete(0, END)
    while(i<8 and float(marks[i].get()!=0.0) and int(credits[i].get()!=0 )):
        sum=sum+float(marks[i].get())*int(credits[i].get())
        csum=csum+int(credits[i].get())
        i=i+1
    ans=sum/csum
    cgpa.insert(0,ans)
#Function To Clear Values
def clear():
    cgpa.delete(0, END)
    for x in range (0,8):
        marks[x].delete(0, END)
        credits[x].delete(0, END)
    
#Labels        
Label(master, text='1st Sem SGPA').grid(row=0)
Label(master, text='Credit').grid(row=0,column=2)
Label(master, text='2nd Sem SGPA').grid(row=1)
Label(master, text='Credit').grid(row=1,column=2)
Label(master, text='3rd Sem SGPA').grid(row=2)
Label(master, text='Credit').grid(row=2,column=2)
Label(master, text='4th Sem SGPA').grid(row=3)
Label(master, text='Credit').grid(row=3,column=2)
Label(master, text='5th Sem SGPA').grid(row=4)
Label(master, text='Credit').grid(row=4,column=2)
Label(master, text='6th Sem SGPA').grid(row=5)
Label(master, text='Credit').grid(row=5,column=2)
Label(master, text='7th Sem SGPA').grid(row=6)
Label(master, text='Credit').grid(row=6,column=2)
Label(master, text='8th Sem SGPA').grid(row=7)
Label(master, text='Credit').grid(row=7,column=2)
Label(master, text='CGPA').grid(row=8,column=1)
Label(master, text='Note: If marks Not available the please give 0 for both the fields').grid(row=9,column=2)

#Creating Input Fileds
for x in range (0,8):
    marks.append(Entry(master))
    credits.append(Entry(master))
    marks[x].grid(row=x, column=1)
    credits[x].grid(row=x, column=3)

cgpa=Entry(master)
cgpa.grid(row=8, column=2)

Button(master, text='Calculate', command=CGPA).grid(row=9, column=1, sticky=W)
Button(master, text='Clear', command=clear).grid(row=9, column=3, sticky=W)

mainloop()