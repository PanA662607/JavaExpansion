public class PMath
{
    public double mean(int [] arr)
    {
        int sum = 0;
        for (int i : arr)
        {
            sum += i;
        }
        return sum/arr.length;
    }
    public int max(int [] arr)
    {
        int max = Integer.MIN_VALUE;
        for (int i : arr)
        {
            if (i > max)
                max = i;
        }
        return max;
    }
        public int min(int [] arr)
    {
        int max = Integer.MAX_VALUE;
        for (int i : arr)
        {
            if (i < max)
                max = i;
        }
        return max;
    }
}