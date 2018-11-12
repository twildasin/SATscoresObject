package com.company;

public class HighSchool {


    public Records[] group;

    public HighSchool(Records[] r)
    {
        group = r;
    }

    //Prints the top three schools with the highest Math SAT score
    public void printTopThreeMath()
    {
        int high1 = 0, pos1 = 0, high2 = 0, pos2 = 0, high3 = 0, pos3 = 0;
        for(int i = 0; i < group.length ; i++)
        {
            //Makes sure the school does have recorded SAT math score (some schools in the file are 0 (no score given).
            if (group[i].satMath > 0) {

                //Replaces 3rd place if greater than third
                if(group[i].satMath > high3)
                {
                    pos3=i;
                    high3 = group[i].satMath;
                }
                //Replaces 2nd if greater than 2nd
                if(group[i].satMath > high2)
                {
                    pos3 = pos2;
                    high3 = high2;

                    pos2 = i;
                    high2 = group[i].satMath;
                }
                //Replaces first if greater than first
                if(group[i].satMath > high1)
                {
                    pos3 = pos2;
                    high3 = high2;
                    pos2 = pos1;
                    high2 = high1;

                    pos1 = i;
                    high1 = group[i].satMath;
                }

            }
        }
        //Prints out the top three
        System.out.println("\nTOP THREE SCHOOLS FOR MATH SAT SCORES:");
        System.out.println("1st-\t" + group[pos1].name + ":\t" + group[pos1].satMath);
        System.out.println("2nd-\t" + group[pos2].name + ":\t" + group[pos2].satMath);
        System.out.println("3rd-\t" + group[pos3].name + ":\t" + group[pos3].satMath);

    }


    //Same as "printTopThreeMath", but with Reading SAT scores. See "printTopThreeMath" method
    public void printTopThreeRead()
    {
        int high1 = 0, pos1 = 0, high2 = 0, pos2 = 0, high3 = 0, pos3 = 0;
        for(int i = 0; i < group.length ; i++)
        {
            if (group[i].satRead > 0) {


                if(group[i].satRead > high3)
                {
                    pos3=i;
                    high3 = group[i].satRead;
                }
                if(group[i].satRead > high2)
                {
                    pos3 = pos2;
                    high3 = high2;

                    pos2 = i;
                    high2 = group[i].satRead;
                }
                if(group[i].satRead > high1)
                {
                    pos3 = pos2;
                    high3 = high2;
                    pos2 = pos1;
                    high2 = high1;

                    pos1 = i;
                    high1 = group[i].satRead;
                }

            }
        }
        System.out.println("\nTOP THREE SCHOOLS FOR READING SAT SCORES:");
        System.out.println("1st-\t" + group[pos1].name + ":\t" + group[pos1].satRead);
        System.out.println("2nd-\t" + group[pos2].name + ":\t" + group[pos2].satRead);
        System.out.println("3rd-\t" + group[pos3].name + ":\t" + group[pos3].satRead);
    }

    //Same as "printTopThreeMath", but with Writing SAT scores. See "printTopThreeMath" method
    public void printTopThreeWrit()
    {
        int high1 = 0, pos1 = 0, high2 = 0, pos2 = 0, high3 = 0, pos3 = 0;
        for(int i = 0; i < group.length ; i++)
        {
            if (group[i].satWrit > 0) {


                if(group[i].satWrit > high3)
                {
                    pos3=i;
                    high3 = group[i].satWrit;
                }
                if(group[i].satWrit > high2)
                {
                    pos3 = pos2;
                    high3 = high2;

                    pos2 = i;
                    high2 = group[i].satWrit;
                }
                if(group[i].satWrit > high1)
                {
                    pos3 = pos2;
                    high3 = high2;
                    pos2 = pos1;
                    high2 = high1;

                    pos1 = i;
                    high1 = group[i].satWrit;
                }

            }
        }
        System.out.println("\nTOP THREE SCHOOLS FOR WRITING SAT SCORES:");
        System.out.println("1st-\t" + group[pos1].name + ":\t" + group[pos1].satWrit);
        System.out.println("2nd-\t" + group[pos2].name + ":\t" + group[pos2].satWrit);
        System.out.println("3rd-\t" + group[pos3].name + ":\t" + group[pos3].satWrit);
    }

    //Finds average math SAT score from all schools
    public int getMathAverage()
    {
        //must create a separate total variable rather than using group.length because some schools in the file did not have SAT scores and using them would mess up the data
        int total = 0;
        int mSum = 0;
        for(int i = 0; i < group.length ; i++)
        {
            //As earlier stated, some schools have no SAT math scores (stored as "0"). This bypasses those schools
            if(group[i].satMath > 0)
            {
                mSum += group[i].satMath;
            }
            total++;
        }
        return mSum / total;
    }

    //Same as "getMathAverage", but with Reading SAT scores. See "getMathAverage" method
    public int getReadAverage()
    {
        int total = 0;
        int rSum = 0;
        for(int i = 0; i < group.length ; i++)
        {
            if(group[i].satRead > 0)
            {
                rSum += group[i].satRead;
            }
            total++;
        }
        return rSum / total;
    }

    //Same as "getMathAverage", but with Writing SAT scores. See "getMathAverage" method
    public int getWritAverage()
    {
        int total = 0;
        int wSum = 0;
        for(int i = 0; i < group.length ; i++)
        {
            if(group[i].satWrit > 0)
            {
                wSum += group[i].satWrit;
            }
            total++;
        }
        return wSum / total;
    }

}


