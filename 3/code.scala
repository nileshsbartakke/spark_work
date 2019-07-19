val file3=sc.textFile("file:/home/nilesh/Desktop/Spark-Output/3/marks.csv")
file3.collect()
var list_mrks=file3.map(x => (x.split(',')(0),List(x.split(',')(1).toFloat,x.split(',')(2).toFloat,x.split(',')(3).toFloat,x.split(',')(4).toFloat,x.split(',')(5).toFloat,x.split(',')(6).toFloat)))
list_mrks.collect()
var per_mrks=list_mrks.mapValues(x => x.sum/x.length)
per_mrks.collect()

