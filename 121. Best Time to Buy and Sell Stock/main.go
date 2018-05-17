func maxProfit(prices []int) int {
    if prices == nil || len(prices) < 2 {
        return 0;
    }
    
    max := prices[0]
    min := prices[0]
    profit := 0
    
    for _, item := range prices {
        if item < min {
            max = item
            min = item
        } else if item > min || item < max {
            max = item
            if tmp := max - min; tmp > profit {
                profit = tmp
            }
        }
    }
    
    return profit
}
