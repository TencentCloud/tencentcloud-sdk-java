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
package com.tencentcloudapi.solar.v20181011.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCustomerResponse extends AbstractModel{

    /**
    * 地址列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddressList")
    @Expose
    private String [] AddressList;

    /**
    * 用户id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 头像
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Avatar")
    @Expose
    private String Avatar;

    /**
    * 生日
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * 城市
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 设备
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Device")
    @Expose
    private String Device;

    /**
    * 行业
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Industrys")
    @Expose
    private String [] Industrys;

    /**
    * 上次登录时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastActiveTime")
    @Expose
    private String LastActiveTime;

    /**
    * 是否星标 1是 0否
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MarkFlag")
    @Expose
    private String MarkFlag;

    /**
    * 手机型号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * 微信openid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 消费特点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayFeature")
    @Expose
    private String PayFeature;

    /**
    * 手机号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 手机号码列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PhoneList")
    @Expose
    private String PhoneList;

    /**
    * 最近记录省份
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * 姓名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealName")
    @Expose
    private String RealName;

    /**
    * 员工标识 0：非员工 1：员工
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelChannelFlag")
    @Expose
    private String RelChannelFlag;

    /**
    * 备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 性别 1男 2女
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * 最初来源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceAudienceVo")
    @Expose
    private String SourceAudienceVo;

    /**
    * 关注公众号列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubWechats")
    @Expose
    private String [] SubWechats;

    /**
    * 微信unionid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnionId")
    @Expose
    private String UnionId;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 用户类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserTypes")
    @Expose
    private String [] UserTypes;

    /**
    * 城市
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WxCity")
    @Expose
    private String WxCity;

    /**
    * 国家
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WxCountry")
    @Expose
    private String WxCountry;

    /**
    * 昵称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WxNickname")
    @Expose
    private String WxNickname;

    /**
    * 省份
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WxProvince")
    @Expose
    private String WxProvince;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 地址列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AddressList 地址列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAddressList() {
        return this.AddressList;
    }

    /**
     * Set 地址列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddressList 地址列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddressList(String [] AddressList) {
        this.AddressList = AddressList;
    }

    /**
     * Get 用户id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserId 用户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户id
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserId 用户id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 头像
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Avatar 头像
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAvatar() {
        return this.Avatar;
    }

    /**
     * Set 头像
注意：此字段可能返回 null，表示取不到有效值。
     * @param Avatar 头像
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvatar(String Avatar) {
        this.Avatar = Avatar;
    }

    /**
     * Get 生日
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Birthday 生日
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBirthday() {
        return this.Birthday;
    }

    /**
     * Set 生日
注意：此字段可能返回 null，表示取不到有效值。
     * @param Birthday 生日
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

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
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 设备
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Device 设备
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDevice() {
        return this.Device;
    }

    /**
     * Set 设备
注意：此字段可能返回 null，表示取不到有效值。
     * @param Device 设备
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDevice(String Device) {
        this.Device = Device;
    }

    /**
     * Get 行业
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Industrys 行业
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getIndustrys() {
        return this.Industrys;
    }

    /**
     * Set 行业
注意：此字段可能返回 null，表示取不到有效值。
     * @param Industrys 行业
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndustrys(String [] Industrys) {
        this.Industrys = Industrys;
    }

    /**
     * Get 上次登录时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastActiveTime 上次登录时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastActiveTime() {
        return this.LastActiveTime;
    }

    /**
     * Set 上次登录时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastActiveTime 上次登录时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastActiveTime(String LastActiveTime) {
        this.LastActiveTime = LastActiveTime;
    }

    /**
     * Get 是否星标 1是 0否
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MarkFlag 是否星标 1是 0否
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMarkFlag() {
        return this.MarkFlag;
    }

    /**
     * Set 是否星标 1是 0否
注意：此字段可能返回 null，表示取不到有效值。
     * @param MarkFlag 是否星标 1是 0否
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMarkFlag(String MarkFlag) {
        this.MarkFlag = MarkFlag;
    }

    /**
     * Get 手机型号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Model 手机型号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 手机型号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Model 手机型号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get 微信openid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OpenId 微信openid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 微信openid
注意：此字段可能返回 null，表示取不到有效值。
     * @param OpenId 微信openid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 消费特点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayFeature 消费特点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayFeature() {
        return this.PayFeature;
    }

    /**
     * Set 消费特点
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayFeature 消费特点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayFeature(String PayFeature) {
        this.PayFeature = PayFeature;
    }

    /**
     * Get 手机号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Phone 手机号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 手机号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Phone 手机号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 手机号码列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PhoneList 手机号码列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPhoneList() {
        return this.PhoneList;
    }

    /**
     * Set 手机号码列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param PhoneList 手机号码列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhoneList(String PhoneList) {
        this.PhoneList = PhoneList;
    }

    /**
     * Get 最近记录省份
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Province 最近记录省份
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set 最近记录省份
注意：此字段可能返回 null，表示取不到有效值。
     * @param Province 最近记录省份
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get 姓名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealName 姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRealName() {
        return this.RealName;
    }

    /**
     * Set 姓名
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealName 姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealName(String RealName) {
        this.RealName = RealName;
    }

    /**
     * Get 员工标识 0：非员工 1：员工
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelChannelFlag 员工标识 0：非员工 1：员工
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRelChannelFlag() {
        return this.RelChannelFlag;
    }

    /**
     * Set 员工标识 0：非员工 1：员工
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelChannelFlag 员工标识 0：非员工 1：员工
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelChannelFlag(String RelChannelFlag) {
        this.RelChannelFlag = RelChannelFlag;
    }

    /**
     * Get 备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 性别 1男 2女
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Sex 性别 1男 2女
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set 性别 1男 2女
注意：此字段可能返回 null，表示取不到有效值。
     * @param Sex 性别 1男 2女
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get 最初来源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceAudienceVo 最初来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceAudienceVo() {
        return this.SourceAudienceVo;
    }

    /**
     * Set 最初来源
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceAudienceVo 最初来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceAudienceVo(String SourceAudienceVo) {
        this.SourceAudienceVo = SourceAudienceVo;
    }

    /**
     * Get 关注公众号列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubWechats 关注公众号列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSubWechats() {
        return this.SubWechats;
    }

    /**
     * Set 关注公众号列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubWechats 关注公众号列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubWechats(String [] SubWechats) {
        this.SubWechats = SubWechats;
    }

    /**
     * Get 微信unionid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnionId 微信unionid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUnionId() {
        return this.UnionId;
    }

    /**
     * Set 微信unionid
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnionId 微信unionid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnionId(String UnionId) {
        this.UnionId = UnionId;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 用户类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserTypes 用户类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getUserTypes() {
        return this.UserTypes;
    }

    /**
     * Set 用户类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserTypes 用户类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserTypes(String [] UserTypes) {
        this.UserTypes = UserTypes;
    }

    /**
     * Get 城市
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WxCity 城市
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWxCity() {
        return this.WxCity;
    }

    /**
     * Set 城市
注意：此字段可能返回 null，表示取不到有效值。
     * @param WxCity 城市
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWxCity(String WxCity) {
        this.WxCity = WxCity;
    }

    /**
     * Get 国家
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WxCountry 国家
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWxCountry() {
        return this.WxCountry;
    }

    /**
     * Set 国家
注意：此字段可能返回 null，表示取不到有效值。
     * @param WxCountry 国家
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWxCountry(String WxCountry) {
        this.WxCountry = WxCountry;
    }

    /**
     * Get 昵称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WxNickname 昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWxNickname() {
        return this.WxNickname;
    }

    /**
     * Set 昵称
注意：此字段可能返回 null，表示取不到有效值。
     * @param WxNickname 昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWxNickname(String WxNickname) {
        this.WxNickname = WxNickname;
    }

    /**
     * Get 省份
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WxProvince 省份
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWxProvince() {
        return this.WxProvince;
    }

    /**
     * Set 省份
注意：此字段可能返回 null，表示取不到有效值。
     * @param WxProvince 省份
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWxProvince(String WxProvince) {
        this.WxProvince = WxProvince;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AddressList.", this.AddressList);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Avatar", this.Avatar);
        this.setParamSimple(map, prefix + "Birthday", this.Birthday);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Device", this.Device);
        this.setParamArraySimple(map, prefix + "Industrys.", this.Industrys);
        this.setParamSimple(map, prefix + "LastActiveTime", this.LastActiveTime);
        this.setParamSimple(map, prefix + "MarkFlag", this.MarkFlag);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "PayFeature", this.PayFeature);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "PhoneList", this.PhoneList);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "RealName", this.RealName);
        this.setParamSimple(map, prefix + "RelChannelFlag", this.RelChannelFlag);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "SourceAudienceVo", this.SourceAudienceVo);
        this.setParamArraySimple(map, prefix + "SubWechats.", this.SubWechats);
        this.setParamSimple(map, prefix + "UnionId", this.UnionId);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArraySimple(map, prefix + "UserTypes.", this.UserTypes);
        this.setParamSimple(map, prefix + "WxCity", this.WxCity);
        this.setParamSimple(map, prefix + "WxCountry", this.WxCountry);
        this.setParamSimple(map, prefix + "WxNickname", this.WxNickname);
        this.setParamSimple(map, prefix + "WxProvince", this.WxProvince);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

