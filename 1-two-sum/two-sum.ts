function twoSum(nums: number[], target: number): number[] {
    const hashMap = new Map()

    for (let i = 0; i < nums.length; i++) {
        const complement = target - nums[i]
        if (hashMap.has(complement)) {
            return [hashMap.get(complement), i]
        } else {
            hashMap.set(nums[i], i)
        }
    }

    return []
};