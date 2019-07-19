val big_file=sc.textFile(file:/home/nilesh/Desktop/big.txt")
val count=big_file.flatmap(line=>line.split(" ")).map(word=>(word,1)).reduceByKey(_+_)
count.saveAsTextFile("file:/home/nilesh/output")
