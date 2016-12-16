package com.wlit.nileema.atmnepal1;

/**
 * Created by Nileema on 12/14/2016.
 */
public class BankItem {
    private String Bank_List;
    private int profile_pic_id;

    public BankItem(String Bank_List, int profile_pic_id){

        this.Bank_List= Bank_List;
        this.profile_pic_id= profile_pic_id;
    }
    public String getBank_List()
    { return Bank_List;}

    public void setBank_List(String Bank_List) {
        this.Bank_List = Bank_List;
    }

    public int getProfile_pic_id() {
        return profile_pic_id;
    }

    public void setProfile_pic_id(int profile_pic_id) {
        this.profile_pic_id = profile_pic_id;
    }
}


