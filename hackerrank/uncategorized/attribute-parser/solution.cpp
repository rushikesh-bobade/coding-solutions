        while (ss >> attr) {
            ss >> eq >> value;

            value = value.substr(1, value.size() - 2);

            mp[path + "~" + attr] = value;
        }
    }

    while (q--) {
        string query;
        getline(cin, query);

        if (mp.find(query) != mp.end())
            cout << mp[query] << '\n';
        else
            cout << "Not Found!" << '\n';
    }

    return 0;
}