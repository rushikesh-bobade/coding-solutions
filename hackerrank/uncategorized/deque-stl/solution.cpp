#include <iostream>
#include <deque>
using namespace std;

void printKMax(int arr[], int n, int k) {
    deque<int> dq;

    for (int i = 0; i < n; i++) {

        // Remove indices outside current window
        while (!dq.empty() && dq.front() <= i - k)
            dq.pop_front();

        // Remove smaller elements from back
        while (!dq.empty() && arr[dq.back()] <= arr[i])
            dq.pop_back();

        dq.push_back(i);

        // Print max once first window is formed
        if (i >= k - 1)
            cout << arr[dq.front()] << " ";
    }