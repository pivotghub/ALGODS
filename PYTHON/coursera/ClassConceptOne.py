#class definition
class parentc:

   #create variable
   x = 0;
   name = ""

   #create constructor
   def __init__(self, nam):
       print(self, 'constructed')
       self.name = nam
       print("name: ", nam)

   def party(self):
       self.x = self.x + 1
       print("count: ",self.x)

   #create destructor
   def __del__(self):
       print(self, 'destructed')

#extended/child class
class chclass(parentc):
    points = 0
    def td(self):
        self.points = self.points + 7
        self.party()
        print(self.name," and ", self.points)

s = parentc("nihar")
s.party();

c = chclass("mamulu")
c.party()
c.td()
