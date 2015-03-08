import Control.Applicative
import Data.List
 
main = do
  l <- readLn
  n <- getLine
  x <- map read . words <$> getLine
  putStrLn $ "min = " ++ show (maximum [min i (l - i) | i <- x])
  putStrLn $ "max = " ++ show (maximum [max i (l - i) | i <- x])
