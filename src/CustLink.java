/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mithun
 */
public class CustLink {
    private int customer_id;
    private String customer_name;
    private String gender;
    private String business_type;
    private int contact_no;
    private String date;
    private String address;
    
    public CustLink(int customer_id,String customer_name,String gender,String business_type,int contact_no,String address,String date)
    {
        this.customer_id=customer_id;
        this.customer_name=customer_name;
        this.gender=gender;
        this.address=address;
        this.business_type=business_type;
        this.contact_no=contact_no;
        this.date=date;
        
    }

    CustLink(int aInt, String string, String string0, String string1, String string2, String string3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int getId()
    {
        return customer_id;
    }
    public String getCname()
    {
        return customer_name;
        
    }
    public String getgender()
    {
        return gender;
        
    }
    public String getaddress()
    {
        return address;
        
    }
    public String getbusiness()
    {
        return business_type;
        
    }
    public int getcontact()
    {
        return contact_no;
        
    }
    public String getdate()
    {
        return date;
        
    }
    
}
