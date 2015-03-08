object Main extends App {
  val inputs = Iterator.continually(scala.io.StdIn.readLine()).takeWhile(_ != null).map(_.split(" ").map(_.toInt)).toStream
  val n = inputs(0)(0)
  val m = inputs(0)(1)
  val k = inputs(1)

  // should print "Yes"
  // val m = 10
  // val k = Stream(1, 3, 5)

  // should print "No"
  // val m = 9
  // val k = Stream(1, 3, 5)

  // should print "No"
  // val m = 21584079
  // val k = Stream(52327675, 25447892, 65532241, 96794714, 60809123, 72422867, 83660219, 38114259, 98088003, 21734147, 17617949, 698619, 52463852, 94603497, 87255238, 14919937, 41214350, 52314337, 70820831, 75367563, 89733620, 39360724, 95487563, 39761775, 38941308, 11963831, 61027113, 2570662, 7578538, 77346242, 36259979, 96473511, 20728587, 74217877, 44155008, 39849151, 14405786, 26943390, 92129602, 39266841, 13686105, 34920179, 84002919, 22263103, 3433178, 39408698, 21408558, 46381455, 77105806, 72928875)

  // should print "Yes"
  // val m = 2525
  // val k = Stream(99, 996, 218, 297, 530, 54, 422, 158, 375, 530, 693, 777, 821, 331, 649, 32, 961, 720, 741, 659, 947, 16, 744, 490, 24, 270, 327, 99, 964, 360, 334, 185, 641, 593, 629, 781, 585, 765, 650, 482, 834, 296, 873, 211, 920, 290, 344, 182, 581, 995, 463, 435, 538, 745, 811, 596, 535, 310, 77, 23, 454, 449, 736, 602, 807, 469, 656, 938, 727, 403, 601, 219, 612, 651, 544, 946, 651, 558, 821, 964, 131, 348, 471, 967, 94, 258, 182, 285, 5, 568, 998, 898, 85, 589, 32, 77, 207, 449, 970, 937, 339)

  // should print "Yes"
  // val m = 2525
  // val k = Stream(99, 996, 218, 297, 530, 54, 422, 158, 375, 530, 693, 777, 821, 331, 649, 32, 961, 720, 741, 659, 947, 16, 744, 490, 24, 270, 327, 99, 964, 360, 334, 185, 641, 593, 629, 781, 585, 765, 650, 482, 834, 296, 873, 211, 920, 290, 344, 182, 581, 995, 463, 435, 538, 745, 811, 596, 535, 310, 77, 23, 454, 449, 736, 602, 807, 469, 656, 938, 727, 403, 601, 219, 612, 651, 544, 946, 651, 558, 821, 964, 131, 348, 471, 967, 94, 258, 182, 285, 5, 568, 998, 898, 85, 589, 32, 77, 207, 449, 970, 937)

  val result = for (a <- k; b <- k; c <- k; d <- k) yield m == a + b + c + d

  println(if (result.exists(identity)) "Yes" else "No")
}