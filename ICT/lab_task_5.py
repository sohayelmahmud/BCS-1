word = input("Enter a word: ")
if(len(word)>5):
    print("This word has more than 5 latters.")
elif(len(word)<5):
    print("This word has less than 5 latters.")
else:
    print("This word has exactly 5 latters.")