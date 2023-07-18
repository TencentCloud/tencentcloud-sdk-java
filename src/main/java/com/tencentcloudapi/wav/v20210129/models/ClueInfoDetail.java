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
package com.tencentcloudapi.wav.v20210129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClueInfoDetail extends AbstractModel{

    /**
    * 线索id，线索唯一识别编码
    */
    @SerializedName("ClueId")
    @Expose
    private String ClueId;

    /**
    * 接待客户经销商顾问所属经销商code
    */
    @SerializedName("DealerId")
    @Expose
    private String DealerId;

    /**
    * 线索获取时间，用户添加企业微信时间，单位是秒
    */
    @SerializedName("EnquireTime")
    @Expose
    private Long EnquireTime;

    /**
    * 客户在微信生态中唯一识别码
    */
    @SerializedName("UnionId")
    @Expose
    private String UnionId;

    /**
    * 微信昵称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 联系方式
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 车系编号
    */
    @SerializedName("SeriesCode")
    @Expose
    private String SeriesCode;

    /**
    * 车型编号
    */
    @SerializedName("ModelCode")
    @Expose
    private String ModelCode;

    /**
    * 省份编号
    */
    @SerializedName("ProvinceCode")
    @Expose
    private String ProvinceCode;

    /**
    * 城市编号
    */
    @SerializedName("CityCode")
    @Expose
    private String CityCode;

    /**
    * 顾问名称
    */
    @SerializedName("SalesName")
    @Expose
    private String SalesName;

    /**
    * 顾问电话
    */
    @SerializedName("SalesPhone")
    @Expose
    private String SalesPhone;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 标签
    */
    @SerializedName("TagList")
    @Expose
    private String [] TagList;

    /**
    * 客户姓名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 线索属性，0：个人，1：企业
    */
    @SerializedName("LeadUserType")
    @Expose
    private Long LeadUserType;

    /**
    * 线索来源类型，1：线上，2：线下
    */
    @SerializedName("LeadType")
    @Expose
    private Long LeadType;

    /**
    * 线索渠道对应ID
    */
    @SerializedName("ChannelId")
    @Expose
    private Long ChannelId;

    /**
    * 线索渠道类型，与线索来源对应的渠道名称
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 线索渠道名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceChannelName")
    @Expose
    private String SourceChannelName;

    /**
    * 0：未知，1：男，2：女
    */
    @SerializedName("Gender")
    @Expose
    private Long Gender;

    /**
    * 线索创建时间戳，单位：秒
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 线索创建时间戳，单位：秒
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 线索所处状态，101-待分配 201-待建档 301-已建档 401-已邀约 501-跟进中 601-已下订单 701-已成交 801-战败申请中 901-已战败 1001-未知状态 1101-转移申请中 1201-已完成
    */
    @SerializedName("LeadStatus")
    @Expose
    private Long LeadStatus;

    /**
    * 线索意向等级
    */
    @SerializedName("LevelCode")
    @Expose
    private String LevelCode;

    /**
    * 线索成功导入的时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImportAtTime")
    @Expose
    private Long ImportAtTime;

    /**
    * 完成线索分配的时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DistributeTime")
    @Expose
    private Long DistributeTime;

    /**
    * 获取线索的时间戳，单位：秒
    */
    @SerializedName("CreateAtTime")
    @Expose
    private Long CreateAtTime;

    /**
    * 客户微信id
    */
    @SerializedName("WxId")
    @Expose
    private String WxId;

    /**
    * 意向车型对应品牌code
    */
    @SerializedName("BrandCode")
    @Expose
    private String BrandCode;

    /**
    * 建档时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BuildTime")
    @Expose
    private Long BuildTime;

    /**
    * 下订时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrderTime")
    @Expose
    private Long OrderTime;

    /**
    * 到店时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ArrivalTime")
    @Expose
    private Long ArrivalTime;

    /**
    * 交车时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeliveryTime")
    @Expose
    private Long DeliveryTime;

    /**
    * 上次跟进时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FollowTime")
    @Expose
    private Long FollowTime;

    /**
    * 下次跟进时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NextFollowTime")
    @Expose
    private Long NextFollowTime;

    /**
    * 线索所属组织id
    */
    @SerializedName("OrgId")
    @Expose
    private Long OrgId;

    /**
    * 线索所属组织名称
    */
    @SerializedName("OrgName")
    @Expose
    private String OrgName;

    /**
    * 介绍人姓名
    */
    @SerializedName("Introducer")
    @Expose
    private String Introducer;

    /**
    * 介绍人电话
    */
    @SerializedName("IntroducerPhone")
    @Expose
    private String IntroducerPhone;

    /**
    * 是否关联微信 1 是 0 否
    */
    @SerializedName("IsBindWx")
    @Expose
    private Long IsBindWx;

    /**
    * 是否经过合并 1 是 0 否
    */
    @SerializedName("IsMerge")
    @Expose
    private Long IsMerge;

    /**
    * 是否无效  1 是 0 否
    */
    @SerializedName("IsInvalid")
    @Expose
    private Long IsInvalid;

    /**
    * 无效类型
    */
    @SerializedName("InvalidType")
    @Expose
    private String InvalidType;

    /**
    * 无效类型枚举：
无意向购买、空错号、未接听、其他
    */
    @SerializedName("InvalidTypeName")
    @Expose
    private String InvalidTypeName;

    /**
    * 由顾问手动输入的无效原因文字
    */
    @SerializedName("InvalidRemark")
    @Expose
    private String InvalidRemark;

    /**
    * 无效时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvalidTime")
    @Expose
    private Long InvalidTime;

    /**
    * 经销商名称
    */
    @SerializedName("DealerName")
    @Expose
    private String DealerName;

    /**
    * 经销商下级门店ID
    */
    @SerializedName("ShopId")
    @Expose
    private Long ShopId;

    /**
    * 经销商下级门店名称
    */
    @SerializedName("ShopName")
    @Expose
    private String ShopName;

    /**
    * 职位
    */
    @SerializedName("Position")
    @Expose
    private String Position;

    /**
    * 自定义的门店id
    */
    @SerializedName("CorpShopId")
    @Expose
    private String CorpShopId;

    /**
     * Get 线索id，线索唯一识别编码 
     * @return ClueId 线索id，线索唯一识别编码
     */
    public String getClueId() {
        return this.ClueId;
    }

    /**
     * Set 线索id，线索唯一识别编码
     * @param ClueId 线索id，线索唯一识别编码
     */
    public void setClueId(String ClueId) {
        this.ClueId = ClueId;
    }

    /**
     * Get 接待客户经销商顾问所属经销商code 
     * @return DealerId 接待客户经销商顾问所属经销商code
     */
    public String getDealerId() {
        return this.DealerId;
    }

    /**
     * Set 接待客户经销商顾问所属经销商code
     * @param DealerId 接待客户经销商顾问所属经销商code
     */
    public void setDealerId(String DealerId) {
        this.DealerId = DealerId;
    }

    /**
     * Get 线索获取时间，用户添加企业微信时间，单位是秒 
     * @return EnquireTime 线索获取时间，用户添加企业微信时间，单位是秒
     */
    public Long getEnquireTime() {
        return this.EnquireTime;
    }

    /**
     * Set 线索获取时间，用户添加企业微信时间，单位是秒
     * @param EnquireTime 线索获取时间，用户添加企业微信时间，单位是秒
     */
    public void setEnquireTime(Long EnquireTime) {
        this.EnquireTime = EnquireTime;
    }

    /**
     * Get 客户在微信生态中唯一识别码 
     * @return UnionId 客户在微信生态中唯一识别码
     */
    public String getUnionId() {
        return this.UnionId;
    }

    /**
     * Set 客户在微信生态中唯一识别码
     * @param UnionId 客户在微信生态中唯一识别码
     */
    public void setUnionId(String UnionId) {
        this.UnionId = UnionId;
    }

    /**
     * Get 微信昵称 
     * @return Name 微信昵称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 微信昵称
     * @param Name 微信昵称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 联系方式 
     * @return Phone 联系方式
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 联系方式
     * @param Phone 联系方式
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 车系编号 
     * @return SeriesCode 车系编号
     */
    public String getSeriesCode() {
        return this.SeriesCode;
    }

    /**
     * Set 车系编号
     * @param SeriesCode 车系编号
     */
    public void setSeriesCode(String SeriesCode) {
        this.SeriesCode = SeriesCode;
    }

    /**
     * Get 车型编号 
     * @return ModelCode 车型编号
     */
    public String getModelCode() {
        return this.ModelCode;
    }

    /**
     * Set 车型编号
     * @param ModelCode 车型编号
     */
    public void setModelCode(String ModelCode) {
        this.ModelCode = ModelCode;
    }

    /**
     * Get 省份编号 
     * @return ProvinceCode 省份编号
     */
    public String getProvinceCode() {
        return this.ProvinceCode;
    }

    /**
     * Set 省份编号
     * @param ProvinceCode 省份编号
     */
    public void setProvinceCode(String ProvinceCode) {
        this.ProvinceCode = ProvinceCode;
    }

    /**
     * Get 城市编号 
     * @return CityCode 城市编号
     */
    public String getCityCode() {
        return this.CityCode;
    }

    /**
     * Set 城市编号
     * @param CityCode 城市编号
     */
    public void setCityCode(String CityCode) {
        this.CityCode = CityCode;
    }

    /**
     * Get 顾问名称 
     * @return SalesName 顾问名称
     */
    public String getSalesName() {
        return this.SalesName;
    }

    /**
     * Set 顾问名称
     * @param SalesName 顾问名称
     */
    public void setSalesName(String SalesName) {
        this.SalesName = SalesName;
    }

    /**
     * Get 顾问电话 
     * @return SalesPhone 顾问电话
     */
    public String getSalesPhone() {
        return this.SalesPhone;
    }

    /**
     * Set 顾问电话
     * @param SalesPhone 顾问电话
     */
    public void setSalesPhone(String SalesPhone) {
        this.SalesPhone = SalesPhone;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 标签 
     * @return TagList 标签
     */
    public String [] getTagList() {
        return this.TagList;
    }

    /**
     * Set 标签
     * @param TagList 标签
     */
    public void setTagList(String [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get 客户姓名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName 客户姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 客户姓名
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName 客户姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 线索属性，0：个人，1：企业 
     * @return LeadUserType 线索属性，0：个人，1：企业
     */
    public Long getLeadUserType() {
        return this.LeadUserType;
    }

    /**
     * Set 线索属性，0：个人，1：企业
     * @param LeadUserType 线索属性，0：个人，1：企业
     */
    public void setLeadUserType(Long LeadUserType) {
        this.LeadUserType = LeadUserType;
    }

    /**
     * Get 线索来源类型，1：线上，2：线下 
     * @return LeadType 线索来源类型，1：线上，2：线下
     */
    public Long getLeadType() {
        return this.LeadType;
    }

    /**
     * Set 线索来源类型，1：线上，2：线下
     * @param LeadType 线索来源类型，1：线上，2：线下
     */
    public void setLeadType(Long LeadType) {
        this.LeadType = LeadType;
    }

    /**
     * Get 线索渠道对应ID 
     * @return ChannelId 线索渠道对应ID
     */
    public Long getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 线索渠道对应ID
     * @param ChannelId 线索渠道对应ID
     */
    public void setChannelId(Long ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get 线索渠道类型，与线索来源对应的渠道名称 
     * @return ChannelName 线索渠道类型，与线索来源对应的渠道名称
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 线索渠道类型，与线索来源对应的渠道名称
     * @param ChannelName 线索渠道类型，与线索来源对应的渠道名称
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get 线索渠道名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceChannelName 线索渠道名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceChannelName() {
        return this.SourceChannelName;
    }

    /**
     * Set 线索渠道名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceChannelName 线索渠道名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceChannelName(String SourceChannelName) {
        this.SourceChannelName = SourceChannelName;
    }

    /**
     * Get 0：未知，1：男，2：女 
     * @return Gender 0：未知，1：男，2：女
     */
    public Long getGender() {
        return this.Gender;
    }

    /**
     * Set 0：未知，1：男，2：女
     * @param Gender 0：未知，1：男，2：女
     */
    public void setGender(Long Gender) {
        this.Gender = Gender;
    }

    /**
     * Get 线索创建时间戳，单位：秒 
     * @return CreateTime 线索创建时间戳，单位：秒
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 线索创建时间戳，单位：秒
     * @param CreateTime 线索创建时间戳，单位：秒
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 线索创建时间戳，单位：秒 
     * @return UpdateTime 线索创建时间戳，单位：秒
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 线索创建时间戳，单位：秒
     * @param UpdateTime 线索创建时间戳，单位：秒
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 线索所处状态，101-待分配 201-待建档 301-已建档 401-已邀约 501-跟进中 601-已下订单 701-已成交 801-战败申请中 901-已战败 1001-未知状态 1101-转移申请中 1201-已完成 
     * @return LeadStatus 线索所处状态，101-待分配 201-待建档 301-已建档 401-已邀约 501-跟进中 601-已下订单 701-已成交 801-战败申请中 901-已战败 1001-未知状态 1101-转移申请中 1201-已完成
     */
    public Long getLeadStatus() {
        return this.LeadStatus;
    }

    /**
     * Set 线索所处状态，101-待分配 201-待建档 301-已建档 401-已邀约 501-跟进中 601-已下订单 701-已成交 801-战败申请中 901-已战败 1001-未知状态 1101-转移申请中 1201-已完成
     * @param LeadStatus 线索所处状态，101-待分配 201-待建档 301-已建档 401-已邀约 501-跟进中 601-已下订单 701-已成交 801-战败申请中 901-已战败 1001-未知状态 1101-转移申请中 1201-已完成
     */
    public void setLeadStatus(Long LeadStatus) {
        this.LeadStatus = LeadStatus;
    }

    /**
     * Get 线索意向等级 
     * @return LevelCode 线索意向等级
     */
    public String getLevelCode() {
        return this.LevelCode;
    }

    /**
     * Set 线索意向等级
     * @param LevelCode 线索意向等级
     */
    public void setLevelCode(String LevelCode) {
        this.LevelCode = LevelCode;
    }

    /**
     * Get 线索成功导入的时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImportAtTime 线索成功导入的时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getImportAtTime() {
        return this.ImportAtTime;
    }

    /**
     * Set 线索成功导入的时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImportAtTime 线索成功导入的时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImportAtTime(Long ImportAtTime) {
        this.ImportAtTime = ImportAtTime;
    }

    /**
     * Get 完成线索分配的时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DistributeTime 完成线索分配的时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDistributeTime() {
        return this.DistributeTime;
    }

    /**
     * Set 完成线索分配的时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param DistributeTime 完成线索分配的时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDistributeTime(Long DistributeTime) {
        this.DistributeTime = DistributeTime;
    }

    /**
     * Get 获取线索的时间戳，单位：秒 
     * @return CreateAtTime 获取线索的时间戳，单位：秒
     */
    public Long getCreateAtTime() {
        return this.CreateAtTime;
    }

    /**
     * Set 获取线索的时间戳，单位：秒
     * @param CreateAtTime 获取线索的时间戳，单位：秒
     */
    public void setCreateAtTime(Long CreateAtTime) {
        this.CreateAtTime = CreateAtTime;
    }

    /**
     * Get 客户微信id 
     * @return WxId 客户微信id
     */
    public String getWxId() {
        return this.WxId;
    }

    /**
     * Set 客户微信id
     * @param WxId 客户微信id
     */
    public void setWxId(String WxId) {
        this.WxId = WxId;
    }

    /**
     * Get 意向车型对应品牌code 
     * @return BrandCode 意向车型对应品牌code
     */
    public String getBrandCode() {
        return this.BrandCode;
    }

    /**
     * Set 意向车型对应品牌code
     * @param BrandCode 意向车型对应品牌code
     */
    public void setBrandCode(String BrandCode) {
        this.BrandCode = BrandCode;
    }

    /**
     * Get 建档时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BuildTime 建档时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBuildTime() {
        return this.BuildTime;
    }

    /**
     * Set 建档时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param BuildTime 建档时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBuildTime(Long BuildTime) {
        this.BuildTime = BuildTime;
    }

    /**
     * Get 下订时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrderTime 下订时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOrderTime() {
        return this.OrderTime;
    }

    /**
     * Set 下订时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrderTime 下订时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrderTime(Long OrderTime) {
        this.OrderTime = OrderTime;
    }

    /**
     * Get 到店时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ArrivalTime 到店时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getArrivalTime() {
        return this.ArrivalTime;
    }

    /**
     * Set 到店时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param ArrivalTime 到店时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setArrivalTime(Long ArrivalTime) {
        this.ArrivalTime = ArrivalTime;
    }

    /**
     * Get 交车时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeliveryTime 交车时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDeliveryTime() {
        return this.DeliveryTime;
    }

    /**
     * Set 交车时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeliveryTime 交车时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeliveryTime(Long DeliveryTime) {
        this.DeliveryTime = DeliveryTime;
    }

    /**
     * Get 上次跟进时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FollowTime 上次跟进时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFollowTime() {
        return this.FollowTime;
    }

    /**
     * Set 上次跟进时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param FollowTime 上次跟进时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFollowTime(Long FollowTime) {
        this.FollowTime = FollowTime;
    }

    /**
     * Get 下次跟进时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NextFollowTime 下次跟进时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNextFollowTime() {
        return this.NextFollowTime;
    }

    /**
     * Set 下次跟进时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param NextFollowTime 下次跟进时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNextFollowTime(Long NextFollowTime) {
        this.NextFollowTime = NextFollowTime;
    }

    /**
     * Get 线索所属组织id 
     * @return OrgId 线索所属组织id
     */
    public Long getOrgId() {
        return this.OrgId;
    }

    /**
     * Set 线索所属组织id
     * @param OrgId 线索所属组织id
     */
    public void setOrgId(Long OrgId) {
        this.OrgId = OrgId;
    }

    /**
     * Get 线索所属组织名称 
     * @return OrgName 线索所属组织名称
     */
    public String getOrgName() {
        return this.OrgName;
    }

    /**
     * Set 线索所属组织名称
     * @param OrgName 线索所属组织名称
     */
    public void setOrgName(String OrgName) {
        this.OrgName = OrgName;
    }

    /**
     * Get 介绍人姓名 
     * @return Introducer 介绍人姓名
     */
    public String getIntroducer() {
        return this.Introducer;
    }

    /**
     * Set 介绍人姓名
     * @param Introducer 介绍人姓名
     */
    public void setIntroducer(String Introducer) {
        this.Introducer = Introducer;
    }

    /**
     * Get 介绍人电话 
     * @return IntroducerPhone 介绍人电话
     */
    public String getIntroducerPhone() {
        return this.IntroducerPhone;
    }

    /**
     * Set 介绍人电话
     * @param IntroducerPhone 介绍人电话
     */
    public void setIntroducerPhone(String IntroducerPhone) {
        this.IntroducerPhone = IntroducerPhone;
    }

    /**
     * Get 是否关联微信 1 是 0 否 
     * @return IsBindWx 是否关联微信 1 是 0 否
     */
    public Long getIsBindWx() {
        return this.IsBindWx;
    }

    /**
     * Set 是否关联微信 1 是 0 否
     * @param IsBindWx 是否关联微信 1 是 0 否
     */
    public void setIsBindWx(Long IsBindWx) {
        this.IsBindWx = IsBindWx;
    }

    /**
     * Get 是否经过合并 1 是 0 否 
     * @return IsMerge 是否经过合并 1 是 0 否
     */
    public Long getIsMerge() {
        return this.IsMerge;
    }

    /**
     * Set 是否经过合并 1 是 0 否
     * @param IsMerge 是否经过合并 1 是 0 否
     */
    public void setIsMerge(Long IsMerge) {
        this.IsMerge = IsMerge;
    }

    /**
     * Get 是否无效  1 是 0 否 
     * @return IsInvalid 是否无效  1 是 0 否
     */
    public Long getIsInvalid() {
        return this.IsInvalid;
    }

    /**
     * Set 是否无效  1 是 0 否
     * @param IsInvalid 是否无效  1 是 0 否
     */
    public void setIsInvalid(Long IsInvalid) {
        this.IsInvalid = IsInvalid;
    }

    /**
     * Get 无效类型 
     * @return InvalidType 无效类型
     */
    public String getInvalidType() {
        return this.InvalidType;
    }

    /**
     * Set 无效类型
     * @param InvalidType 无效类型
     */
    public void setInvalidType(String InvalidType) {
        this.InvalidType = InvalidType;
    }

    /**
     * Get 无效类型枚举：
无意向购买、空错号、未接听、其他 
     * @return InvalidTypeName 无效类型枚举：
无意向购买、空错号、未接听、其他
     */
    public String getInvalidTypeName() {
        return this.InvalidTypeName;
    }

    /**
     * Set 无效类型枚举：
无意向购买、空错号、未接听、其他
     * @param InvalidTypeName 无效类型枚举：
无意向购买、空错号、未接听、其他
     */
    public void setInvalidTypeName(String InvalidTypeName) {
        this.InvalidTypeName = InvalidTypeName;
    }

    /**
     * Get 由顾问手动输入的无效原因文字 
     * @return InvalidRemark 由顾问手动输入的无效原因文字
     */
    public String getInvalidRemark() {
        return this.InvalidRemark;
    }

    /**
     * Set 由顾问手动输入的无效原因文字
     * @param InvalidRemark 由顾问手动输入的无效原因文字
     */
    public void setInvalidRemark(String InvalidRemark) {
        this.InvalidRemark = InvalidRemark;
    }

    /**
     * Get 无效时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InvalidTime 无效时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInvalidTime() {
        return this.InvalidTime;
    }

    /**
     * Set 无效时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param InvalidTime 无效时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvalidTime(Long InvalidTime) {
        this.InvalidTime = InvalidTime;
    }

    /**
     * Get 经销商名称 
     * @return DealerName 经销商名称
     */
    public String getDealerName() {
        return this.DealerName;
    }

    /**
     * Set 经销商名称
     * @param DealerName 经销商名称
     */
    public void setDealerName(String DealerName) {
        this.DealerName = DealerName;
    }

    /**
     * Get 经销商下级门店ID 
     * @return ShopId 经销商下级门店ID
     */
    public Long getShopId() {
        return this.ShopId;
    }

    /**
     * Set 经销商下级门店ID
     * @param ShopId 经销商下级门店ID
     */
    public void setShopId(Long ShopId) {
        this.ShopId = ShopId;
    }

    /**
     * Get 经销商下级门店名称 
     * @return ShopName 经销商下级门店名称
     */
    public String getShopName() {
        return this.ShopName;
    }

    /**
     * Set 经销商下级门店名称
     * @param ShopName 经销商下级门店名称
     */
    public void setShopName(String ShopName) {
        this.ShopName = ShopName;
    }

    /**
     * Get 职位 
     * @return Position 职位
     */
    public String getPosition() {
        return this.Position;
    }

    /**
     * Set 职位
     * @param Position 职位
     */
    public void setPosition(String Position) {
        this.Position = Position;
    }

    /**
     * Get 自定义的门店id 
     * @return CorpShopId 自定义的门店id
     */
    public String getCorpShopId() {
        return this.CorpShopId;
    }

    /**
     * Set 自定义的门店id
     * @param CorpShopId 自定义的门店id
     */
    public void setCorpShopId(String CorpShopId) {
        this.CorpShopId = CorpShopId;
    }

    public ClueInfoDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClueInfoDetail(ClueInfoDetail source) {
        if (source.ClueId != null) {
            this.ClueId = new String(source.ClueId);
        }
        if (source.DealerId != null) {
            this.DealerId = new String(source.DealerId);
        }
        if (source.EnquireTime != null) {
            this.EnquireTime = new Long(source.EnquireTime);
        }
        if (source.UnionId != null) {
            this.UnionId = new String(source.UnionId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.SeriesCode != null) {
            this.SeriesCode = new String(source.SeriesCode);
        }
        if (source.ModelCode != null) {
            this.ModelCode = new String(source.ModelCode);
        }
        if (source.ProvinceCode != null) {
            this.ProvinceCode = new String(source.ProvinceCode);
        }
        if (source.CityCode != null) {
            this.CityCode = new String(source.CityCode);
        }
        if (source.SalesName != null) {
            this.SalesName = new String(source.SalesName);
        }
        if (source.SalesPhone != null) {
            this.SalesPhone = new String(source.SalesPhone);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.TagList != null) {
            this.TagList = new String[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new String(source.TagList[i]);
            }
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.LeadUserType != null) {
            this.LeadUserType = new Long(source.LeadUserType);
        }
        if (source.LeadType != null) {
            this.LeadType = new Long(source.LeadType);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new Long(source.ChannelId);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.SourceChannelName != null) {
            this.SourceChannelName = new String(source.SourceChannelName);
        }
        if (source.Gender != null) {
            this.Gender = new Long(source.Gender);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.LeadStatus != null) {
            this.LeadStatus = new Long(source.LeadStatus);
        }
        if (source.LevelCode != null) {
            this.LevelCode = new String(source.LevelCode);
        }
        if (source.ImportAtTime != null) {
            this.ImportAtTime = new Long(source.ImportAtTime);
        }
        if (source.DistributeTime != null) {
            this.DistributeTime = new Long(source.DistributeTime);
        }
        if (source.CreateAtTime != null) {
            this.CreateAtTime = new Long(source.CreateAtTime);
        }
        if (source.WxId != null) {
            this.WxId = new String(source.WxId);
        }
        if (source.BrandCode != null) {
            this.BrandCode = new String(source.BrandCode);
        }
        if (source.BuildTime != null) {
            this.BuildTime = new Long(source.BuildTime);
        }
        if (source.OrderTime != null) {
            this.OrderTime = new Long(source.OrderTime);
        }
        if (source.ArrivalTime != null) {
            this.ArrivalTime = new Long(source.ArrivalTime);
        }
        if (source.DeliveryTime != null) {
            this.DeliveryTime = new Long(source.DeliveryTime);
        }
        if (source.FollowTime != null) {
            this.FollowTime = new Long(source.FollowTime);
        }
        if (source.NextFollowTime != null) {
            this.NextFollowTime = new Long(source.NextFollowTime);
        }
        if (source.OrgId != null) {
            this.OrgId = new Long(source.OrgId);
        }
        if (source.OrgName != null) {
            this.OrgName = new String(source.OrgName);
        }
        if (source.Introducer != null) {
            this.Introducer = new String(source.Introducer);
        }
        if (source.IntroducerPhone != null) {
            this.IntroducerPhone = new String(source.IntroducerPhone);
        }
        if (source.IsBindWx != null) {
            this.IsBindWx = new Long(source.IsBindWx);
        }
        if (source.IsMerge != null) {
            this.IsMerge = new Long(source.IsMerge);
        }
        if (source.IsInvalid != null) {
            this.IsInvalid = new Long(source.IsInvalid);
        }
        if (source.InvalidType != null) {
            this.InvalidType = new String(source.InvalidType);
        }
        if (source.InvalidTypeName != null) {
            this.InvalidTypeName = new String(source.InvalidTypeName);
        }
        if (source.InvalidRemark != null) {
            this.InvalidRemark = new String(source.InvalidRemark);
        }
        if (source.InvalidTime != null) {
            this.InvalidTime = new Long(source.InvalidTime);
        }
        if (source.DealerName != null) {
            this.DealerName = new String(source.DealerName);
        }
        if (source.ShopId != null) {
            this.ShopId = new Long(source.ShopId);
        }
        if (source.ShopName != null) {
            this.ShopName = new String(source.ShopName);
        }
        if (source.Position != null) {
            this.Position = new String(source.Position);
        }
        if (source.CorpShopId != null) {
            this.CorpShopId = new String(source.CorpShopId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClueId", this.ClueId);
        this.setParamSimple(map, prefix + "DealerId", this.DealerId);
        this.setParamSimple(map, prefix + "EnquireTime", this.EnquireTime);
        this.setParamSimple(map, prefix + "UnionId", this.UnionId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "SeriesCode", this.SeriesCode);
        this.setParamSimple(map, prefix + "ModelCode", this.ModelCode);
        this.setParamSimple(map, prefix + "ProvinceCode", this.ProvinceCode);
        this.setParamSimple(map, prefix + "CityCode", this.CityCode);
        this.setParamSimple(map, prefix + "SalesName", this.SalesName);
        this.setParamSimple(map, prefix + "SalesPhone", this.SalesPhone);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArraySimple(map, prefix + "TagList.", this.TagList);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "LeadUserType", this.LeadUserType);
        this.setParamSimple(map, prefix + "LeadType", this.LeadType);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "SourceChannelName", this.SourceChannelName);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "LeadStatus", this.LeadStatus);
        this.setParamSimple(map, prefix + "LevelCode", this.LevelCode);
        this.setParamSimple(map, prefix + "ImportAtTime", this.ImportAtTime);
        this.setParamSimple(map, prefix + "DistributeTime", this.DistributeTime);
        this.setParamSimple(map, prefix + "CreateAtTime", this.CreateAtTime);
        this.setParamSimple(map, prefix + "WxId", this.WxId);
        this.setParamSimple(map, prefix + "BrandCode", this.BrandCode);
        this.setParamSimple(map, prefix + "BuildTime", this.BuildTime);
        this.setParamSimple(map, prefix + "OrderTime", this.OrderTime);
        this.setParamSimple(map, prefix + "ArrivalTime", this.ArrivalTime);
        this.setParamSimple(map, prefix + "DeliveryTime", this.DeliveryTime);
        this.setParamSimple(map, prefix + "FollowTime", this.FollowTime);
        this.setParamSimple(map, prefix + "NextFollowTime", this.NextFollowTime);
        this.setParamSimple(map, prefix + "OrgId", this.OrgId);
        this.setParamSimple(map, prefix + "OrgName", this.OrgName);
        this.setParamSimple(map, prefix + "Introducer", this.Introducer);
        this.setParamSimple(map, prefix + "IntroducerPhone", this.IntroducerPhone);
        this.setParamSimple(map, prefix + "IsBindWx", this.IsBindWx);
        this.setParamSimple(map, prefix + "IsMerge", this.IsMerge);
        this.setParamSimple(map, prefix + "IsInvalid", this.IsInvalid);
        this.setParamSimple(map, prefix + "InvalidType", this.InvalidType);
        this.setParamSimple(map, prefix + "InvalidTypeName", this.InvalidTypeName);
        this.setParamSimple(map, prefix + "InvalidRemark", this.InvalidRemark);
        this.setParamSimple(map, prefix + "InvalidTime", this.InvalidTime);
        this.setParamSimple(map, prefix + "DealerName", this.DealerName);
        this.setParamSimple(map, prefix + "ShopId", this.ShopId);
        this.setParamSimple(map, prefix + "ShopName", this.ShopName);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamSimple(map, prefix + "CorpShopId", this.CorpShopId);

    }
}

