#include <stdio.h>

// 时间复杂度 O(n^2)
int fibonacci_one(int num);
// 时间复杂度 O(n)
int fibonacci_two(int num);

int main(void) {
  // int x = fibonacci_one(50);
  int x = fibonacci_two(10000);

  printf("result = %d\n", x);
  return 0;
}


int fibonacci_one(int num) {
  if (num == 0 || num == 1) {
    return num;
  }
  return fibonacci_one(num - 1) + fibonacci_one(num - 2);
}

int fibonacci_two(int num) {
  int x = 0;
  int y = 1;
  while (num-- > 1) {
    int z = x;
    x = y;
    y += z;
  }
  return y;
}