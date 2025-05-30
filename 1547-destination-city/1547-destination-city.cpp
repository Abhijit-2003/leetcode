class Solution {
public:
    string destCity(vector<vector<string>>& paths) {
        map<string,int>map1;
        map<string,int>map2;

        for(int i=0; i<paths.size(); i++) {

            if(map2.count(paths[i][0])) {
                map2.erase(paths[i][0]);
            } else {
                map1[paths[i][0]]++;
            }

            if(map1.count(paths[i][1])) {
                map1.erase(paths[i][1]);
            } else {
                map2[paths[i][1]]++;
            }
        }

        auto it=map2.begin();
        return it->first;
    }
};