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

public class ViewShopResult extends AbstractModel{

    /**
    * 城市
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 门店简称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShopName")
    @Expose
    private String ShopName;

    /**
    * 百度地图纬度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Latitude")
    @Expose
    private String Latitude;

    /**
    * 品牌名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BrandName")
    @Expose
    private String BrandName;

    /**
    * 开通应用数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppCount")
    @Expose
    private String AppCount;

    /**
    * 负责人手机号码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContactTelephone")
    @Expose
    private String ContactTelephone;

    /**
    * 商户名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MerchantName")
    @Expose
    private String MerchantName;

    /**
    * 省份
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * 县/区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("County")
    @Expose
    private String County;

    /**
    * 更新时间（yyyy-mm-dd hh:ii:ss）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 终端数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TerminalCount")
    @Expose
    private String TerminalCount;

    /**
    * 收银台图片【公共区】
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PictureTwo")
    @Expose
    private String PictureTwo;

    /**
    * 高德地图纬度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatitudeTwo")
    @Expose
    private String LatitudeTwo;

    /**
    * 机构名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentName")
    @Expose
    private String AgentName;

    /**
    * 其他照片【公共区】
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PictureFour")
    @Expose
    private String PictureFour;

    /**
    * 高德地图经度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LongitudeTwo")
    @Expose
    private String LongitudeTwo;

    /**
    * 门店状态（0未审核，1已审核，2审核未通过，3待审核，4已删除，5初审通过）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 审核备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 机构编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentNo")
    @Expose
    private String AgentNo;

    /**
    * 商户编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MerchantNo")
    @Expose
    private String MerchantNo;

    /**
    * 添加时间（yyyy-mm-dd hh:ii:ss）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * 详细地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 百度地图经度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Longitude")
    @Expose
    private String Longitude;

    /**
    * 门店编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShopNo")
    @Expose
    private String ShopNo;

    /**
    * 门店全称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShopFullName")
    @Expose
    private String ShopFullName;

    /**
    * 门店负责人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Contact")
    @Expose
    private String Contact;

    /**
    * 店内环境图片【公共区】
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PictureThree")
    @Expose
    private String PictureThree;

    /**
    * 整体门面（含招牌）图片【公共区】
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PictureOne")
    @Expose
    private String PictureOne;

    /**
    * 门店电话
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Telephone")
    @Expose
    private String Telephone;

    /**
    * 机构门店主键
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutShopId")
    @Expose
    private String OutShopId;

    /**
    * 城市编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CityId")
    @Expose
    private String CityId;

    /**
     * Get 城市
注意：此字段可能返回 null，表示取不到有效值。 
     * @return City 城市
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set 城市
注意：此字段可能返回 null，表示取不到有效值。
     * @param City 城市
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get 门店简称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShopName 门店简称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getShopName() {
        return this.ShopName;
    }

    /**
     * Set 门店简称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShopName 门店简称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShopName(String ShopName) {
        this.ShopName = ShopName;
    }

    /**
     * Get 百度地图纬度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Latitude 百度地图纬度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatitude() {
        return this.Latitude;
    }

    /**
     * Set 百度地图纬度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Latitude 百度地图纬度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatitude(String Latitude) {
        this.Latitude = Latitude;
    }

    /**
     * Get 品牌名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BrandName 品牌名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBrandName() {
        return this.BrandName;
    }

    /**
     * Set 品牌名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param BrandName 品牌名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
    }

    /**
     * Get 开通应用数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppCount 开通应用数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppCount() {
        return this.AppCount;
    }

    /**
     * Set 开通应用数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppCount 开通应用数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppCount(String AppCount) {
        this.AppCount = AppCount;
    }

    /**
     * Get 负责人手机号码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContactTelephone 负责人手机号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContactTelephone() {
        return this.ContactTelephone;
    }

    /**
     * Set 负责人手机号码
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContactTelephone 负责人手机号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContactTelephone(String ContactTelephone) {
        this.ContactTelephone = ContactTelephone;
    }

    /**
     * Get 商户名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MerchantName 商户名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMerchantName() {
        return this.MerchantName;
    }

    /**
     * Set 商户名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param MerchantName 商户名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMerchantName(String MerchantName) {
        this.MerchantName = MerchantName;
    }

    /**
     * Get 省份
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Province 省份
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set 省份
注意：此字段可能返回 null，表示取不到有效值。
     * @param Province 省份
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get 县/区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return County 县/区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCounty() {
        return this.County;
    }

    /**
     * Set 县/区
注意：此字段可能返回 null，表示取不到有效值。
     * @param County 县/区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCounty(String County) {
        this.County = County;
    }

    /**
     * Get 更新时间（yyyy-mm-dd hh:ii:ss）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间（yyyy-mm-dd hh:ii:ss）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间（yyyy-mm-dd hh:ii:ss）
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间（yyyy-mm-dd hh:ii:ss）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 终端数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TerminalCount 终端数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTerminalCount() {
        return this.TerminalCount;
    }

    /**
     * Set 终端数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TerminalCount 终端数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTerminalCount(String TerminalCount) {
        this.TerminalCount = TerminalCount;
    }

    /**
     * Get 收银台图片【公共区】
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PictureTwo 收银台图片【公共区】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPictureTwo() {
        return this.PictureTwo;
    }

    /**
     * Set 收银台图片【公共区】
注意：此字段可能返回 null，表示取不到有效值。
     * @param PictureTwo 收银台图片【公共区】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPictureTwo(String PictureTwo) {
        this.PictureTwo = PictureTwo;
    }

    /**
     * Get 高德地图纬度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatitudeTwo 高德地图纬度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatitudeTwo() {
        return this.LatitudeTwo;
    }

    /**
     * Set 高德地图纬度
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatitudeTwo 高德地图纬度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatitudeTwo(String LatitudeTwo) {
        this.LatitudeTwo = LatitudeTwo;
    }

    /**
     * Get 机构名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentName 机构名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAgentName() {
        return this.AgentName;
    }

    /**
     * Set 机构名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentName 机构名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentName(String AgentName) {
        this.AgentName = AgentName;
    }

    /**
     * Get 其他照片【公共区】
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PictureFour 其他照片【公共区】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPictureFour() {
        return this.PictureFour;
    }

    /**
     * Set 其他照片【公共区】
注意：此字段可能返回 null，表示取不到有效值。
     * @param PictureFour 其他照片【公共区】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPictureFour(String PictureFour) {
        this.PictureFour = PictureFour;
    }

    /**
     * Get 高德地图经度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LongitudeTwo 高德地图经度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLongitudeTwo() {
        return this.LongitudeTwo;
    }

    /**
     * Set 高德地图经度
注意：此字段可能返回 null，表示取不到有效值。
     * @param LongitudeTwo 高德地图经度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLongitudeTwo(String LongitudeTwo) {
        this.LongitudeTwo = LongitudeTwo;
    }

    /**
     * Get 门店状态（0未审核，1已审核，2审核未通过，3待审核，4已删除，5初审通过）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 门店状态（0未审核，1已审核，2审核未通过，3待审核，4已删除，5初审通过）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 门店状态（0未审核，1已审核，2审核未通过，3待审核，4已删除，5初审通过）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 门店状态（0未审核，1已审核，2审核未通过，3待审核，4已删除，5初审通过）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 审核备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 审核备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 审核备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 审核备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 机构编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentNo 机构编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAgentNo() {
        return this.AgentNo;
    }

    /**
     * Set 机构编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentNo 机构编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentNo(String AgentNo) {
        this.AgentNo = AgentNo;
    }

    /**
     * Get 商户编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MerchantNo 商户编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMerchantNo() {
        return this.MerchantNo;
    }

    /**
     * Set 商户编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param MerchantNo 商户编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMerchantNo(String MerchantNo) {
        this.MerchantNo = MerchantNo;
    }

    /**
     * Get 添加时间（yyyy-mm-dd hh:ii:ss）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AddTime 添加时间（yyyy-mm-dd hh:ii:ss）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set 添加时间（yyyy-mm-dd hh:ii:ss）
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddTime 添加时间（yyyy-mm-dd hh:ii:ss）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get 详细地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Address 详细地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 详细地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Address 详细地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 百度地图经度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Longitude 百度地图经度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLongitude() {
        return this.Longitude;
    }

    /**
     * Set 百度地图经度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Longitude 百度地图经度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLongitude(String Longitude) {
        this.Longitude = Longitude;
    }

    /**
     * Get 门店编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShopNo 门店编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getShopNo() {
        return this.ShopNo;
    }

    /**
     * Set 门店编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShopNo 门店编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShopNo(String ShopNo) {
        this.ShopNo = ShopNo;
    }

    /**
     * Get 门店全称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShopFullName 门店全称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getShopFullName() {
        return this.ShopFullName;
    }

    /**
     * Set 门店全称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShopFullName 门店全称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShopFullName(String ShopFullName) {
        this.ShopFullName = ShopFullName;
    }

    /**
     * Get 门店负责人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Contact 门店负责人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContact() {
        return this.Contact;
    }

    /**
     * Set 门店负责人
注意：此字段可能返回 null，表示取不到有效值。
     * @param Contact 门店负责人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContact(String Contact) {
        this.Contact = Contact;
    }

    /**
     * Get 店内环境图片【公共区】
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PictureThree 店内环境图片【公共区】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPictureThree() {
        return this.PictureThree;
    }

    /**
     * Set 店内环境图片【公共区】
注意：此字段可能返回 null，表示取不到有效值。
     * @param PictureThree 店内环境图片【公共区】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPictureThree(String PictureThree) {
        this.PictureThree = PictureThree;
    }

    /**
     * Get 整体门面（含招牌）图片【公共区】
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PictureOne 整体门面（含招牌）图片【公共区】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPictureOne() {
        return this.PictureOne;
    }

    /**
     * Set 整体门面（含招牌）图片【公共区】
注意：此字段可能返回 null，表示取不到有效值。
     * @param PictureOne 整体门面（含招牌）图片【公共区】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPictureOne(String PictureOne) {
        this.PictureOne = PictureOne;
    }

    /**
     * Get 门店电话
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Telephone 门店电话
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTelephone() {
        return this.Telephone;
    }

    /**
     * Set 门店电话
注意：此字段可能返回 null，表示取不到有效值。
     * @param Telephone 门店电话
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTelephone(String Telephone) {
        this.Telephone = Telephone;
    }

    /**
     * Get 机构门店主键
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutShopId 机构门店主键
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutShopId() {
        return this.OutShopId;
    }

    /**
     * Set 机构门店主键
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutShopId 机构门店主键
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutShopId(String OutShopId) {
        this.OutShopId = OutShopId;
    }

    /**
     * Get 城市编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CityId 城市编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCityId() {
        return this.CityId;
    }

    /**
     * Set 城市编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param CityId 城市编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCityId(String CityId) {
        this.CityId = CityId;
    }

    public ViewShopResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ViewShopResult(ViewShopResult source) {
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.ShopName != null) {
            this.ShopName = new String(source.ShopName);
        }
        if (source.Latitude != null) {
            this.Latitude = new String(source.Latitude);
        }
        if (source.BrandName != null) {
            this.BrandName = new String(source.BrandName);
        }
        if (source.AppCount != null) {
            this.AppCount = new String(source.AppCount);
        }
        if (source.ContactTelephone != null) {
            this.ContactTelephone = new String(source.ContactTelephone);
        }
        if (source.MerchantName != null) {
            this.MerchantName = new String(source.MerchantName);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.County != null) {
            this.County = new String(source.County);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.TerminalCount != null) {
            this.TerminalCount = new String(source.TerminalCount);
        }
        if (source.PictureTwo != null) {
            this.PictureTwo = new String(source.PictureTwo);
        }
        if (source.LatitudeTwo != null) {
            this.LatitudeTwo = new String(source.LatitudeTwo);
        }
        if (source.AgentName != null) {
            this.AgentName = new String(source.AgentName);
        }
        if (source.PictureFour != null) {
            this.PictureFour = new String(source.PictureFour);
        }
        if (source.LongitudeTwo != null) {
            this.LongitudeTwo = new String(source.LongitudeTwo);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.AgentNo != null) {
            this.AgentNo = new String(source.AgentNo);
        }
        if (source.MerchantNo != null) {
            this.MerchantNo = new String(source.MerchantNo);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Longitude != null) {
            this.Longitude = new String(source.Longitude);
        }
        if (source.ShopNo != null) {
            this.ShopNo = new String(source.ShopNo);
        }
        if (source.ShopFullName != null) {
            this.ShopFullName = new String(source.ShopFullName);
        }
        if (source.Contact != null) {
            this.Contact = new String(source.Contact);
        }
        if (source.PictureThree != null) {
            this.PictureThree = new String(source.PictureThree);
        }
        if (source.PictureOne != null) {
            this.PictureOne = new String(source.PictureOne);
        }
        if (source.Telephone != null) {
            this.Telephone = new String(source.Telephone);
        }
        if (source.OutShopId != null) {
            this.OutShopId = new String(source.OutShopId);
        }
        if (source.CityId != null) {
            this.CityId = new String(source.CityId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "ShopName", this.ShopName);
        this.setParamSimple(map, prefix + "Latitude", this.Latitude);
        this.setParamSimple(map, prefix + "BrandName", this.BrandName);
        this.setParamSimple(map, prefix + "AppCount", this.AppCount);
        this.setParamSimple(map, prefix + "ContactTelephone", this.ContactTelephone);
        this.setParamSimple(map, prefix + "MerchantName", this.MerchantName);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "County", this.County);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "TerminalCount", this.TerminalCount);
        this.setParamSimple(map, prefix + "PictureTwo", this.PictureTwo);
        this.setParamSimple(map, prefix + "LatitudeTwo", this.LatitudeTwo);
        this.setParamSimple(map, prefix + "AgentName", this.AgentName);
        this.setParamSimple(map, prefix + "PictureFour", this.PictureFour);
        this.setParamSimple(map, prefix + "LongitudeTwo", this.LongitudeTwo);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "AgentNo", this.AgentNo);
        this.setParamSimple(map, prefix + "MerchantNo", this.MerchantNo);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Longitude", this.Longitude);
        this.setParamSimple(map, prefix + "ShopNo", this.ShopNo);
        this.setParamSimple(map, prefix + "ShopFullName", this.ShopFullName);
        this.setParamSimple(map, prefix + "Contact", this.Contact);
        this.setParamSimple(map, prefix + "PictureThree", this.PictureThree);
        this.setParamSimple(map, prefix + "PictureOne", this.PictureOne);
        this.setParamSimple(map, prefix + "Telephone", this.Telephone);
        this.setParamSimple(map, prefix + "OutShopId", this.OutShopId);
        this.setParamSimple(map, prefix + "CityId", this.CityId);

    }
}

