import Control.Applicative
import Data.List
 
main = do
  n <- getLine
  a <- map read . words <$> getLine
  print $ maximum $ 0 : [sum l | l <- subsequences $ sortBy (flip compare) a, length l == 3, head l <= sum (tail l)]
