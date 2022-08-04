/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author 19168
 */
public class ChangeHistory {
    private ArrayList<Double> list;
    
    public ChangeHistory(){
        this.list = new ArrayList<>();
        
    }
    public void add(double status){
        this.list.add(status);
        
    }
    public void clear(){
        this.list.clear();
    }
    public double maxValue(){
        if(this.list.isEmpty()){
            return 0;
        }
        return Collections.max(list);
    }
    public double minValue(){
        if(this.list.isEmpty()){
            return 0;
        }
        return Collections.min(list);
        
    }
    public double average(){
        if(this.list.isEmpty()){
            return 0;
        }
        double sum = 0;
        for (double value : list){

            sum+=value;
        }
        return sum/this.list.size();
    }
    @Override
    public String toString(){
        return this.list.toString();
    }
    
}
