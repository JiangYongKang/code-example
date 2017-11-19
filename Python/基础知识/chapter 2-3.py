# -*- coding: utf-8 -*-
# dict
# 无顺序，查找快，占用内存多，键不可重复

# 定义一个 dict
d = {
    'Adam': 95, 'Lisa': 85, 'Bart': 59
}

# 计算大小
len(d);

# 判断指定的 key 是否存在
'Adam' in d

# 访问元素
d['Adam'] # key 不存在会直接报错
d.get('Adam') # key 不存在会返回 None

# 更新 dict
d['Bart'] = 100 # 如果 key 存在，那就更新 value。不存在，则新添加一组键值对

# 遍历
for key in d:
    print key , ':' , d[key]
