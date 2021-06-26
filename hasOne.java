public boolean hasOne(int n) {
  boolean bool = false;
  int rightMost = n;
  int discard = n/10;
  if (n == 1){
    bool = true;
  }else{
    for (int i = 0; i < n; i++){
      rightMost = discard%10;
      discard = discard/10;
      if(rightMost == 1){
        bool = true;
      }
    }
 }
 return bool;
}
