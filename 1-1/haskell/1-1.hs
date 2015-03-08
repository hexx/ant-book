import Control.Applicative
 
main = do
  [n, m] <- map read . words <$> getLine
  k <- map read . words <$> getLine
  putStrLn $ if or [m == a + b + c + d | a <- k, b <- k, c <- k, d <- k] then "Yes" else "No"
