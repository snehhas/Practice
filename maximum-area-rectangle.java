class maxArea{
    
    static int calculate_Area(Rectangle arr[]){
        
        int val=arr[0].area();
        for (int i=1;i<arr.length;i++){
        int max=arr[i].area();
        if (max>=val){
            val=max;
        }
        }
        return val;
    }
    
}
