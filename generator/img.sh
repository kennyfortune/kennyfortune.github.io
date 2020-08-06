cd E:/code/kennyfortune.github.io/_posts 
grep "../img/" -rl ./* | xargs sed -i "s?\.\./img/?https://github.com/kennyfortune/kennyfortune.github.io/raw/master/img/?g"
