package com.javarush.task.task21.task2104;

import java.util.HashSet;
import java.util.Set;

/* 
Equals and HashCode
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o)
    {
        if (o == null)
            return false;

        if (!(o instanceof Solution)){
            return false;
        }

        if (this == o) return true;

        Solution solution = (Solution) o;

        if (first != null ? !first.equals(solution.first) : solution.first != null) return false;
        if (last != null ? !last.equals(solution.last) : solution.last != null) return false;

        return true;
    }

//        if(n==null){return false;}
//        if(!(n instanceof  Solution)) return false;
//        if(this==n){return true;}
//        if((first==null)&(n.first==null))
//        {
//            if((last==null)&(n.last==null))
//            {
//                return true;
//            }else
//                {
//                    return false;
//                }
//        }else
//            {
//                if((n.first==first) & (n.last==last))
//                {
//                    return true;
//                }
//            }
//
//        if (first != null ? !first.equals(solution.first) : solution.first != null) return false;
//        if (last != null ? !last.equals(solution.last) : solution.last != null) return false;
    //}

    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (last != null ? last.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));

        Solution s1 = new Solution("Donald", "Duck");

        System.out.println(s.contains(s1));


    }
}
