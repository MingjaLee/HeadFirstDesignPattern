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
    ProjectJar = "chocolate.jar"
    ProjectMainClass = "ChocolateController"
    packageName = "headfirst/designpatterns/singleton/chocolate"
    if sys.argv[1] == "c":
            print("Compile program.")

            src = "./*.java"
            os.system("javac -d classes " + src)
            os.system("jar -cvf " + ProjectJar + " -C classes/ .")

    if sys.argv[1] == "r":
            print("Run program.")
            runPath = os.path.join(packageName, ProjectMainClass)
            os.system("java -cp " + ProjectJar + " " + runPath)

    print("Over!")    

if __name__ == "__main__":
    main()