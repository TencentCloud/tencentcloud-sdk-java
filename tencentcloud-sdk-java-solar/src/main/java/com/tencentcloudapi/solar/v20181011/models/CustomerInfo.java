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

public class CustomerInfo extends AbstractModel{

    /**
    * 总活跃度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Activity")
    @Expose
    private Long Activity;

    /**
    * 客户ID
    */
    @SerializedName("AudienceUserId")
    @Expose
    private String AudienceUserId;

    /**
    * 头像
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Avatar")
    @Expose
    private String Avatar;

    /**
    * 最近记录城市
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 最活跃时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastActiveTime")
    @Expose
    private String LastActiveTime;

    /**
    * 是否星标客户
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MarkFlag")
    @Expose
    private String MarkFlag;

    /**
    * 30天活跃度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MonthActive")
    @Expose
    private Long MonthActive;

    /**
    * 30天推荐度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MonthRecommend")
    @Expose
    private Long MonthRecommend;

    /**
    * 手机号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

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
    * 员工标识 0 未关联 1 已关联
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelChannelFlag")
    @Expose
    private Long RelChannelFlag;

    /**
    * 性别 1男 2女
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Sex")
    @Expose
    private Long Sex;

    /**
    * 传播力（好友数）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Spread")
    @Expose
    private Long Spread;

    /**
    * 7天活跃度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WeekActive")
    @Expose
    private Long WeekActive;

    /**
    * 7天推荐度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WeekRecommend")
    @Expose
    private Long WeekRecommend;

    /**
    * 微信城市
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WxCity")
    @Expose
    private String WxCity;

    /**
    * 微信国家或地区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WxCountry")
    @Expose
    private String WxCountry;

    /**
    * 微信呢称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WxNickname")
    @Expose
    private String WxNickname;

    /**
    * 微信省份
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WxProvince")
    @Expose
    private String WxProvince;

    /**
     * Get 总活跃度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Activity 总活跃度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getActivity() {
        return this.Activity;
    }

    /**
     * Set 总活跃度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Activity 总活跃度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActivity(Long Activity) {
        this.Activity = Activity;
    }

    /**
     * Get 客户ID 
     * @return AudienceUserId 客户ID
     */
    public String getAudienceUserId() {
        return this.AudienceUserId;
    }

    /**
     * Set 客户ID
     * @param AudienceUserId 客户ID
     */
    public void setAudienceUserId(String AudienceUserId) {
        this.AudienceUserId = AudienceUserId;
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
     * Get 最近记录城市
注意：此字段可能返回 null，表示取不到有效值。 
     * @return City 最近记录城市
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set 最近记录城市
注意：此字段可能返回 null，表示取不到有效值。
     * @param City 最近记录城市
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get 最活跃时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastActiveTime 最活跃时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastActiveTime() {
        return this.LastActiveTime;
    }

    /**
     * Set 最活跃时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastActiveTime 最活跃时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastActiveTime(String LastActiveTime) {
        this.LastActiveTime = LastActiveTime;
    }

    /**
     * Get 是否星标客户
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MarkFlag 是否星标客户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMarkFlag() {
        return this.MarkFlag;
    }

    /**
     * Set 是否星标客户
注意：此字段可能返回 null，表示取不到有效值。
     * @param MarkFlag 是否星标客户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMarkFlag(String MarkFlag) {
        this.MarkFlag = MarkFlag;
    }

    /**
     * Get 30天活跃度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MonthActive 30天活跃度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMonthActive() {
        return this.MonthActive;
    }

    /**
     * Set 30天活跃度
注意：此字段可能返回 null，表示取不到有效值。
     * @param MonthActive 30天活跃度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMonthActive(Long MonthActive) {
        this.MonthActive = MonthActive;
    }

    /**
     * Get 30天推荐度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MonthRecommend 30天推荐度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMonthRecommend() {
        return this.MonthRecommend;
    }

    /**
     * Set 30天推荐度
注意：此字段可能返回 null，表示取不到有效值。
     * @param MonthRecommend 30天推荐度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMonthRecommend(Long MonthRecommend) {
        this.MonthRecommend = MonthRecommend;
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
     * Get 员工标识 0 未关联 1 已关联
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelChannelFlag 员工标识 0 未关联 1 已关联
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRelChannelFlag() {
        return this.RelChannelFlag;
    }

    /**
     * Set 员工标识 0 未关联 1 已关联
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelChannelFlag 员工标识 0 未关联 1 已关联
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelChannelFlag(Long RelChannelFlag) {
        this.RelChannelFlag = RelChannelFlag;
    }

    /**
     * Get 性别 1男 2女
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Sex 性别 1男 2女
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSex() {
        return this.Sex;
    }

    /**
     * Set 性别 1男 2女
注意：此字段可能返回 null，表示取不到有效值。
     * @param Sex 性别 1男 2女
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSex(Long Sex) {
        this.Sex = Sex;
    }

    /**
     * Get 传播力（好友数）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Spread 传播力（好友数）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSpread() {
        return this.Spread;
    }

    /**
     * Set 传播力（好友数）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Spread 传播力（好友数）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpread(Long Spread) {
        this.Spread = Spread;
    }

    /**
     * Get 7天活跃度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WeekActive 7天活跃度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWeekActive() {
        return this.WeekActive;
    }

    /**
     * Set 7天活跃度
注意：此字段可能返回 null，表示取不到有效值。
     * @param WeekActive 7天活跃度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeekActive(Long WeekActive) {
        this.WeekActive = WeekActive;
    }

    /**
     * Get 7天推荐度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WeekRecommend 7天推荐度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWeekRecommend() {
        return this.WeekRecommend;
    }

    /**
     * Set 7天推荐度
注意：此字段可能返回 null，表示取不到有效值。
     * @param WeekRecommend 7天推荐度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeekRecommend(Long WeekRecommend) {
        this.WeekRecommend = WeekRecommend;
    }

    /**
     * Get 微信城市
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WxCity 微信城市
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWxCity() {
        return this.WxCity;
    }

    /**
     * Set 微信城市
注意：此字段可能返回 null，表示取不到有效值。
     * @param WxCity 微信城市
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWxCity(String WxCity) {
        this.WxCity = WxCity;
    }

    /**
     * Get 微信国家或地区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WxCountry 微信国家或地区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWxCountry() {
        return this.WxCountry;
    }

    /**
     * Set 微信国家或地区
注意：此字段可能返回 null，表示取不到有效值。
     * @param WxCountry 微信国家或地区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWxCountry(String WxCountry) {
        this.WxCountry = WxCountry;
    }

    /**
     * Get 微信呢称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WxNickname 微信呢称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWxNickname() {
        return this.WxNickname;
    }

    /**
     * Set 微信呢称
注意：此字段可能返回 null，表示取不到有效值。
     * @param WxNickname 微信呢称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWxNickname(String WxNickname) {
        this.WxNickname = WxNickname;
    }

    /**
     * Get 微信省份
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WxProvince 微信省份
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWxProvince() {
        return this.WxProvince;
    }

    /**
     * Set 微信省份
注意：此字段可能返回 null，表示取不到有效值。
     * @param WxProvince 微信省份
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWxProvince(String WxProvince) {
        this.WxProvince = WxProvince;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Activity", this.Activity);
        this.setParamSimple(map, prefix + "AudienceUserId", this.AudienceUserId);
        this.setParamSimple(map, prefix + "Avatar", this.Avatar);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "LastActiveTime", this.LastActiveTime);
        this.setParamSimple(map, prefix + "MarkFlag", this.MarkFlag);
        this.setParamSimple(map, prefix + "MonthActive", this.MonthActive);
        this.setParamSimple(map, prefix + "MonthRecommend", this.MonthRecommend);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "RealName", this.RealName);
        this.setParamSimple(map, prefix + "RelChannelFlag", this.RelChannelFlag);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "Spread", this.Spread);
        this.setParamSimple(map, prefix + "WeekActive", this.WeekActive);
        this.setParamSimple(map, prefix + "WeekRecommend", this.WeekRecommend);
        this.setParamSimple(map, prefix + "WxCity", this.WxCity);
        this.setParamSimple(map, prefix + "WxCountry", this.WxCountry);
        this.setParamSimple(map, prefix + "WxNickname", this.WxNickname);
        this.setParamSimple(map, prefix + "WxProvince", this.WxProvince);

    }
}

