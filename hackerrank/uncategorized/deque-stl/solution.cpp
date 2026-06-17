    cout << endl;
}

int main() {
    int t;
    cin >> t;

    while (t--) {
        int n, k;
        cin >> n >> k;

        int arr[n];

        for (int i = 0; i < n; i++)
            cin >> arr[i];

        printKMax(arr, n, k);
    }

    return 0;
}