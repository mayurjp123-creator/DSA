package Sorting;

public class heap {
    static void heap_sort(int a[])
    {
        int temp, i, j, pc;
        boolean done;

        for(i = a.length - 1; i > 0; i--)   // heap size reduces
        {
            // Build max-heap
            for(j = 0; j <= i; j++)
            {
                done = false;
                pc = j;

                // bubble-up to maintain heap
                while (pc > 0)
                {
                    int parent = (pc - 1) / 2;

                    if(a[pc] > a[parent])
                    {
                        temp = a[pc];
                        a[pc] = a[parent];
                        a[parent] = temp;

                        pc = parent;
                    }
                    else
                    {
                        break;
                    }
                }
            }

            // swap max with last
            temp = a[0];
            a[0] = a[i];
            a[i] = temp;
        }
    }
    public static void main(String[] args) {
        
    }
    
}

