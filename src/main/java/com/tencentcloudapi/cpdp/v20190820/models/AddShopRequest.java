/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddShopRequest extends AbstractModel{

    /**
    * 收单系统分配的开放ID
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 收单系统分配的密钥
    */
    @SerializedName("OpenKey")
    @Expose
    private String OpenKey;

    /**
    * 机构门店主键（系统有唯一性校验），建议使用门店表的主键ID，防止重复添加门店
    */
    @SerializedName("OutShopId")
    @Expose
    private String OutShopId;

    /**
    * 门店简称（例如：南山店）
    */
    @SerializedName("ShopName")
    @Expose
    private String ShopName;

    /**
    * 门店全称（例如：江山小厨（南山店））
    */
    @SerializedName("ShopFullName")
    @Expose
    private String ShopFullName;

    /**
    * 商户编号
    */
    @SerializedName("MerchantNo")
    @Expose
    private String MerchantNo;

    /**
    * 门店电话
    */
    @SerializedName("Telephone")
    @Expose
    private String Telephone;

    /**
    * 营业时间，多个以小写逗号分开(9:00-12:00,13:00-18:00)
    */
    @SerializedName("OpenHours")
    @Expose
    private String OpenHours;

    /**
    * 门店所在的城市编码
    */
    @SerializedName("CityId")
    @Expose
    private String CityId;

    /**
    * 门店详细地址，不含省市区县名称
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 整体门面（含招牌）图片【公共区】
    */
    @SerializedName("PictureOne")
    @Expose
    private String PictureOne;

    /**
    * 整体门面（含招牌）图片【公共区】
    */
    @SerializedName("PictureTwo")
    @Expose
    private String PictureTwo;

    /**
    * 店内环境图片【公共区】
    */
    @SerializedName("PictureThree")
    @Expose
    private String PictureThree;

    /**
    * 负责人手机号码
    */
    @SerializedName("FinancialTelephone")
    @Expose
    private String FinancialTelephone;

    /**
    * 门店负责人
    */
    @SerializedName("Contact")
    @Expose
    private String Contact;

    /**
    * 百度地图纬度
    */
    @SerializedName("Latitude")
    @Expose
    private String Latitude;

    /**
    * 高德地图纬度
    */
    @SerializedName("LatitudeTwo")
    @Expose
    private String LatitudeTwo;

    /**
    * 百度地图经度
    */
    @SerializedName("Longitude")
    @Expose
    private String Longitude;

    /**
    * 高德地图经度
    */
    @SerializedName("LongitudeTwo")
    @Expose
    private String LongitudeTwo;

    /**
    * 其他照片【公共区】
    */
    @SerializedName("OtherPicture")
    @Expose
    private String OtherPicture;

    /**
    * 沙箱环境填sandbox，正式环境不填
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
     * Get 收单系统分配的开放ID 
     * @return OpenId 收单系统分配的开放ID
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 收单系统分配的开放ID
     * @param OpenId 收单系统分配的开放ID
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 收单系统分配的密钥 
     * @return OpenKey 收单系统分配的密钥
     */
    public String getOpenKey() {
        return this.OpenKey;
    }

    /**
     * Set 收单系统分配的密钥
     * @param OpenKey 收单系统分配的密钥
     */
    public void setOpenKey(String OpenKey) {
        this.OpenKey = OpenKey;
    }

    /**
     * Get 机构门店主键（系统有唯一性校验），建议使用门店表的主键ID，防止重复添加门店 
     * @return OutShopId 机构门店主键（系统有唯一性校验），建议使用门店表的主键ID，防止重复添加门店
     */
    public String getOutShopId() {
        return this.OutShopId;
    }

    /**
     * Set 机构门店主键（系统有唯一性校验），建议使用门店表的主键ID，防止重复添加门店
     * @param OutShopId 机构门店主键（系统有唯一性校验），建议使用门店表的主键ID，防止重复添加门店
     */
    public void setOutShopId(String OutShopId) {
        this.OutShopId = OutShopId;
    }

    /**
     * Get 门店简称（例如：南山店） 
     * @return ShopName 门店简称（例如：南山店）
     */
    public String getShopName() {
        return this.ShopName;
    }

    /**
     * Set 门店简称（例如：南山店）
     * @param ShopName 门店简称（例如：南山店）
     */
    public void setShopName(String ShopName) {
        this.ShopName = ShopName;
    }

    /**
     * Get 门店全称（例如：江山小厨（南山店）） 
     * @return ShopFullName 门店全称（例如：江山小厨（南山店））
     */
    public String getShopFullName() {
        return this.ShopFullName;
    }

    /**
     * Set 门店全称（例如：江山小厨（南山店））
     * @param ShopFullName 门店全称（例如：江山小厨（南山店））
     */
    public void setShopFullName(String ShopFullName) {
        this.ShopFullName = ShopFullName;
    }

    /**
     * Get 商户编号 
     * @return MerchantNo 商户编号
     */
    public String getMerchantNo() {
        return this.MerchantNo;
    }

    /**
     * Set 商户编号
     * @param MerchantNo 商户编号
     */
    public void setMerchantNo(String MerchantNo) {
        this.MerchantNo = MerchantNo;
    }

    /**
     * Get 门店电话 
     * @return Telephone 门店电话
     */
    public String getTelephone() {
        return this.Telephone;
    }

    /**
     * Set 门店电话
     * @param Telephone 门店电话
     */
    public void setTelephone(String Telephone) {
        this.Telephone = Telephone;
    }

    /**
     * Get 营业时间，多个以小写逗号分开(9:00-12:00,13:00-18:00) 
     * @return OpenHours 营业时间，多个以小写逗号分开(9:00-12:00,13:00-18:00)
     */
    public String getOpenHours() {
        return this.OpenHours;
    }

    /**
     * Set 营业时间，多个以小写逗号分开(9:00-12:00,13:00-18:00)
     * @param OpenHours 营业时间，多个以小写逗号分开(9:00-12:00,13:00-18:00)
     */
    public void setOpenHours(String OpenHours) {
        this.OpenHours = OpenHours;
    }

    /**
     * Get 门店所在的城市编码 
     * @return CityId 门店所在的城市编码
     */
    public String getCityId() {
        return this.CityId;
    }

    /**
     * Set 门店所在的城市编码
     * @param CityId 门店所在的城市编码
     */
    public void setCityId(String CityId) {
        this.CityId = CityId;
    }

    /**
     * Get 门店详细地址，不含省市区县名称 
     * @return Address 门店详细地址，不含省市区县名称
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 门店详细地址，不含省市区县名称
     * @param Address 门店详细地址，不含省市区县名称
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 整体门面（含招牌）图片【公共区】 
     * @return PictureOne 整体门面（含招牌）图片【公共区】
     */
    public String getPictureOne() {
        return this.PictureOne;
    }

    /**
     * Set 整体门面（含招牌）图片【公共区】
     * @param PictureOne 整体门面（含招牌）图片【公共区】
     */
    public void setPictureOne(String PictureOne) {
        this.PictureOne = PictureOne;
    }

    /**
     * Get 整体门面（含招牌）图片【公共区】 
     * @return PictureTwo 整体门面（含招牌）图片【公共区】
     */
    public String getPictureTwo() {
        return this.PictureTwo;
    }

    /**
     * Set 整体门面（含招牌）图片【公共区】
     * @param PictureTwo 整体门面（含招牌）图片【公共区】
     */
    public void setPictureTwo(String PictureTwo) {
        this.PictureTwo = PictureTwo;
    }

    /**
     * Get 店内环境图片【公共区】 
     * @return PictureThree 店内环境图片【公共区】
     */
    public String getPictureThree() {
        return this.PictureThree;
    }

    /**
     * Set 店内环境图片【公共区】
     * @param PictureThree 店内环境图片【公共区】
     */
    public void setPictureThree(String PictureThree) {
        this.PictureThree = PictureThree;
    }

    /**
     * Get 负责人手机号码 
     * @return FinancialTelephone 负责人手机号码
     */
    public String getFinancialTelephone() {
        return this.FinancialTelephone;
    }

    /**
     * Set 负责人手机号码
     * @param FinancialTelephone 负责人手机号码
     */
    public void setFinancialTelephone(String FinancialTelephone) {
        this.FinancialTelephone = FinancialTelephone;
    }

    /**
     * Get 门店负责人 
     * @return Contact 门店负责人
     */
    public String getContact() {
        return this.Contact;
    }

    /**
     * Set 门店负责人
     * @param Contact 门店负责人
     */
    public void setContact(String Contact) {
        this.Contact = Contact;
    }

    /**
     * Get 百度地图纬度 
     * @return Latitude 百度地图纬度
     */
    public String getLatitude() {
        return this.Latitude;
    }

    /**
     * Set 百度地图纬度
     * @param Latitude 百度地图纬度
     */
    public void setLatitude(String Latitude) {
        this.Latitude = Latitude;
    }

    /**
     * Get 高德地图纬度 
     * @return LatitudeTwo 高德地图纬度
     */
    public String getLatitudeTwo() {
        return this.LatitudeTwo;
    }

    /**
     * Set 高德地图纬度
     * @param LatitudeTwo 高德地图纬度
     */
    public void setLatitudeTwo(String LatitudeTwo) {
        this.LatitudeTwo = LatitudeTwo;
    }

    /**
     * Get 百度地图经度 
     * @return Longitude 百度地图经度
     */
    public String getLongitude() {
        return this.Longitude;
    }

    /**
     * Set 百度地图经度
     * @param Longitude 百度地图经度
     */
    public void setLongitude(String Longitude) {
        this.Longitude = Longitude;
    }

    /**
     * Get 高德地图经度 
     * @return LongitudeTwo 高德地图经度
     */
    public String getLongitudeTwo() {
        return this.LongitudeTwo;
    }

    /**
     * Set 高德地图经度
     * @param LongitudeTwo 高德地图经度
     */
    public void setLongitudeTwo(String LongitudeTwo) {
        this.LongitudeTwo = LongitudeTwo;
    }

    /**
     * Get 其他照片【公共区】 
     * @return OtherPicture 其他照片【公共区】
     */
    public String getOtherPicture() {
        return this.OtherPicture;
    }

    /**
     * Set 其他照片【公共区】
     * @param OtherPicture 其他照片【公共区】
     */
    public void setOtherPicture(String OtherPicture) {
        this.OtherPicture = OtherPicture;
    }

    /**
     * Get 沙箱环境填sandbox，正式环境不填 
     * @return Profile 沙箱环境填sandbox，正式环境不填
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set 沙箱环境填sandbox，正式环境不填
     * @param Profile 沙箱环境填sandbox，正式环境不填
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    public AddShopRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddShopRequest(AddShopRequest source) {
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.OpenKey != null) {
            this.OpenKey = new String(source.OpenKey);
        }
        if (source.OutShopId != null) {
            this.OutShopId = new String(source.OutShopId);
        }
        if (source.ShopName != null) {
            this.ShopName = new String(source.ShopName);
        }
        if (source.ShopFullName != null) {
            this.ShopFullName = new String(source.ShopFullName);
        }
        if (source.MerchantNo != null) {
            this.MerchantNo = new String(source.MerchantNo);
        }
        if (source.Telephone != null) {
            this.Telephone = new String(source.Telephone);
        }
        if (source.OpenHours != null) {
            this.OpenHours = new String(source.OpenHours);
        }
        if (source.CityId != null) {
            this.CityId = new String(source.CityId);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.PictureOne != null) {
            this.PictureOne = new String(source.PictureOne);
        }
        if (source.PictureTwo != null) {
            this.PictureTwo = new String(source.PictureTwo);
        }
        if (source.PictureThree != null) {
            this.PictureThree = new String(source.PictureThree);
        }
        if (source.FinancialTelephone != null) {
            this.FinancialTelephone = new String(source.FinancialTelephone);
        }
        if (source.Contact != null) {
            this.Contact = new String(source.Contact);
        }
        if (source.Latitude != null) {
            this.Latitude = new String(source.Latitude);
        }
        if (source.LatitudeTwo != null) {
            this.LatitudeTwo = new String(source.LatitudeTwo);
        }
        if (source.Longitude != null) {
            this.Longitude = new String(source.Longitude);
        }
        if (source.LongitudeTwo != null) {
            this.LongitudeTwo = new String(source.LongitudeTwo);
        }
        if (source.OtherPicture != null) {
            this.OtherPicture = new String(source.OtherPicture);
        }
        if (source.Profile != null) {
            this.Profile = new String(source.Profile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "OpenKey", this.OpenKey);
        this.setParamSimple(map, prefix + "OutShopId", this.OutShopId);
        this.setParamSimple(map, prefix + "ShopName", this.ShopName);
        this.setParamSimple(map, prefix + "ShopFullName", this.ShopFullName);
        this.setParamSimple(map, prefix + "MerchantNo", this.MerchantNo);
        this.setParamSimple(map, prefix + "Telephone", this.Telephone);
        this.setParamSimple(map, prefix + "OpenHours", this.OpenHours);
        this.setParamSimple(map, prefix + "CityId", this.CityId);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "PictureOne", this.PictureOne);
        this.setParamSimple(map, prefix + "PictureTwo", this.PictureTwo);
        this.setParamSimple(map, prefix + "PictureThree", this.PictureThree);
        this.setParamSimple(map, prefix + "FinancialTelephone", this.FinancialTelephone);
        this.setParamSimple(map, prefix + "Contact", this.Contact);
        this.setParamSimple(map, prefix + "Latitude", this.Latitude);
        this.setParamSimple(map, prefix + "LatitudeTwo", this.LatitudeTwo);
        this.setParamSimple(map, prefix + "Longitude", this.Longitude);
        this.setParamSimple(map, prefix + "LongitudeTwo", this.LongitudeTwo);
        this.setParamSimple(map, prefix + "OtherPicture", this.OtherPicture);
        this.setParamSimple(map, prefix + "Profile", this.Profile);

    }
}

