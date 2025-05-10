class Solution {
public:
    bool checkTwoChessboards(string coordinate1, string coordinate2) {
        string cord1="";
        string cord2="";
        if(((coordinate1[0]%2==0) && ((coordinate1[1]-'0')%2==0)) || ((coordinate1[0]%2==1) && ((coordinate1[1]-'0')%2==1)) ){
            cord1="black";
        }

        if(((coordinate2[0]%2==0) && ((coordinate2[1]-'0')%2==0)) || ((coordinate2[0]%2==1) && ((coordinate2[1]-'0')%2==1)) ){
            cord2="black";
        }

        if(cord1.empty()) cord1="white";
        if(cord2.empty()) cord2="white";
        return cord1==cord2;

    }
};