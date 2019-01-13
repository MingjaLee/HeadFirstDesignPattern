import os
import sys


def main():
    '''
    javac -d classes src/*.java src/inner/*.java
    jar -cvf Test.jar -C classes/ .
    java -cp Test.jar Main
    '''

    ClassesDir = os.path.join(os.getcwd(), 'classes')
    if not os.path.exists(ClassesDir):
        os.mkdir(ClassesDir)
    ProjectJar = "pizzaaf.jar"
    ProjectMainClass = "PizzaTestDrive"
    packageName = "headfirst/designpatterns/factory/pizzaaf/"
    if sys.argv[1] == "c":
            print("Compile program.")

            src = "./*.java"
            os.system("javac -d classes " + src)
            os.system("jar -cvf " + ProjectJar + " -C classes/ .")

    if sys.argv[1] == "r":
            print("Run program.")
            os.system("java -cp " + ProjectJar + " " + packageName + ProjectMainClass)

    print("Over!")    

if __name__ == "__main__":
    main()