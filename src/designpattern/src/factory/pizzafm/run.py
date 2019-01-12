import os
import sys

if __name__ == "__main__":

        ClassesDir = os.path.join(os.getcwd(), 'classes')
        if not os.path.exists(ClassesDir):
            os.mkdir(ClassesDir)
        ProjectJar = "pizzafm.jar"
        ProjectMainClass = "PizzaTestDrive"
        packageName = "headfirst/designpatterns/factory/pizzafm/"
        if sys.argv[1] == "c":
                print("Compile program.")

                src = "./*.java"
                os.system("javac -d classes " + src)
                os.system("jar -cvf " + ProjectJar + " -C classes/ .")

        if sys.argv[1] == "r":
                print("Run program.")
                os.system("java -cp " + ProjectJar + " " + packageName + ProjectMainClass)

        print("Over!")

'''
javac -d classes src/*.java src/inner/*.java
jar -cvf Test.jar -C classes/ .
java -cp Test.jar Main
'''