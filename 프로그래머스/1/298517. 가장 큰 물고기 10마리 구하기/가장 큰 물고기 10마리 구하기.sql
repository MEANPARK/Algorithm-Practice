select ID, LENGTH 
from FISH_INFO 
where LENGTH > 10
order by LENGTH DESC, ID
limit 10