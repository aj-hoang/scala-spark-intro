package com.sparkintro

import org.apache.spark.sql.SparkSession

object SimpleSparkApp extends App {

  val spark = SparkSession.builder()
    .master("local[*]")
    .getOrCreate()

  spark.sql("select 'hello' as value").show()

}
