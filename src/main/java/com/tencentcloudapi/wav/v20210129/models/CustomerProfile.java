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

public class CustomerProfile extends AbstractModel{

    /**
    * 客户档案id，客户唯一识别编码
    */
    @SerializedName("CustomerId")
    @Expose
    private Long CustomerId;

    /**
    * 所属经销商id
    */
    @SerializedName("DealerCode")
    @Expose
    private String DealerCode;

    /**
    * 客户在微信生态中唯一识别码
    */
    @SerializedName("UnionId")
    @Expose
    private String UnionId;

    /**
    * 档案创建时间戳，单位：秒
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 客户姓名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 0未知，1：男，2：女
    */
    @SerializedName("Gender")
    @Expose
    private Long Gender;

    /**
    * 客户联系手机号
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 客户年龄段名称
    */
    @SerializedName("AgeRangeName")
    @Expose
    private String AgeRangeName;

    /**
    * 客户行业类型名称信息，如教师、医生
    */
    @SerializedName("JobTypeName")
    @Expose
    private String JobTypeName;

    /**
    * 客户居住地址
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 客户所处状态
 0:已分配 1:未分配 1 待建档, 2 已建档， 3 已到店 4 已经试驾 5 战败申请中 6 已战败 7 已成交 
    */
    @SerializedName("LeadsProcessStatus")
    @Expose
    private Long LeadsProcessStatus;

    /**
    * 客户来源类型，1：线上，2：线下
    */
    @SerializedName("LeadType")
    @Expose
    private Long LeadType;

    /**
    * 与客户来源类型对应的渠道名称
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * 客户购车的意向等级
    */
    @SerializedName("LeadsLevelCode")
    @Expose
    private String LeadsLevelCode;

    /**
    * 客户意向品牌编号
    */
    @SerializedName("VehicleBrandCode")
    @Expose
    private String VehicleBrandCode;

    /**
    * 客户意向车系编号
    */
    @SerializedName("VehicleSeriesCode")
    @Expose
    private String VehicleSeriesCode;

    /**
    * 客户意向车型编号
    */
    @SerializedName("VehicleTypeCode")
    @Expose
    private String VehicleTypeCode;

    /**
    * 购车用途信息
    */
    @SerializedName("VehiclePurpose")
    @Expose
    private VehiclePurpose VehiclePurpose;

    /**
    * 购车关注点信息
    */
    @SerializedName("PurchaseConcern")
    @Expose
    private PurchaseConcern [] PurchaseConcern;

    /**
    * 客户所属顾问姓名
    */
    @SerializedName("SalesName")
    @Expose
    private String SalesName;

    /**
    * 客户所属顾问手机号
    */
    @SerializedName("SalesPhone")
    @Expose
    private String SalesPhone;

    /**
    * 客户实际到店时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealArrivalTime")
    @Expose
    private Long RealArrivalTime;

    /**
    * 客户到店完成试乘试驾时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompleteTestDriveTime")
    @Expose
    private String CompleteTestDriveTime;

    /**
    * 客户完成下订的时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrderTime")
    @Expose
    private Long OrderTime;

    /**
    * 客户成交的时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeliveryTime")
    @Expose
    private Long DeliveryTime;

    /**
    * 开票时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvoiceTime")
    @Expose
    private Long InvoiceTime;

    /**
    * 完成对此客户战败审批的时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LoseTime")
    @Expose
    private Long LoseTime;

    /**
    * 线索成功获取的时间戳，单位：秒
    */
    @SerializedName("CreatedAtTime")
    @Expose
    private Long CreatedAtTime;

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
    * 线索成功创建的时间戳，单位：秒
    */
    @SerializedName("LeadCreateTime")
    @Expose
    private Long LeadCreateTime;

    /**
    * 线索关联微信昵称
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * 线索归属部门节点
    */
    @SerializedName("OrgIdList")
    @Expose
    private String [] OrgIdList;

    /**
    * 客户的介绍人姓名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Introducer")
    @Expose
    private String Introducer;

    /**
    * 客户的介绍人手机号码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntroducerPhone")
    @Expose
    private String IntroducerPhone;

    /**
    * 最近一次完成跟进的时间戳，单位：秒
    */
    @SerializedName("FollowTime")
    @Expose
    private Long FollowTime;

    /**
    * 最近一次计划跟进的时间戳，单位：秒
    */
    @SerializedName("NextFollowTime")
    @Expose
    private Long NextFollowTime;

    /**
    * 已为该客户添加的企业标签信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnterpriseTags")
    @Expose
    private EnterpriseTag [] EnterpriseTags;

    /**
    * 已为该客户添加的渠道标签信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelTags")
    @Expose
    private ChannelTag [] ChannelTags;

    /**
    * 关联线索id
    */
    @SerializedName("LeadId")
    @Expose
    private Long LeadId;

    /**
    * 客户微信id
    */
    @SerializedName("WxId")
    @Expose
    private String WxId;

    /**
    * 顾问职位
    */
    @SerializedName("Position")
    @Expose
    private String Position;

    /**
    * 是否关联微信 1 是 0 否
    */
    @SerializedName("IsBindWx")
    @Expose
    private Long IsBindWx;

    /**
    * 是否无效
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
    * 无效类型名称
    */
    @SerializedName("InvalidTypeName")
    @Expose
    private String InvalidTypeName;

    /**
    * 无效时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvalidTime")
    @Expose
    private Long InvalidTime;

    /**
    * 由顾问手动输入的无效原因文字
    */
    @SerializedName("InvalidRemark")
    @Expose
    private String InvalidRemark;

    /**
    * 线索是否战败
    */
    @SerializedName("IsLose")
    @Expose
    private Long IsLose;

    /**
    * 战败类型
    */
    @SerializedName("LoseType")
    @Expose
    private String LoseType;

    /**
    * 战败类型名称
    */
    @SerializedName("LoseTypeName")
    @Expose
    private String LoseTypeName;

    /**
    * 战败申请原因
    */
    @SerializedName("LoseRemark")
    @Expose
    private String LoseRemark;

    /**
     * Get 客户档案id，客户唯一识别编码 
     * @return CustomerId 客户档案id，客户唯一识别编码
     */
    public Long getCustomerId() {
        return this.CustomerId;
    }

    /**
     * Set 客户档案id，客户唯一识别编码
     * @param CustomerId 客户档案id，客户唯一识别编码
     */
    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    /**
     * Get 所属经销商id 
     * @return DealerCode 所属经销商id
     */
    public String getDealerCode() {
        return this.DealerCode;
    }

    /**
     * Set 所属经销商id
     * @param DealerCode 所属经销商id
     */
    public void setDealerCode(String DealerCode) {
        this.DealerCode = DealerCode;
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
     * Get 档案创建时间戳，单位：秒 
     * @return CreateTime 档案创建时间戳，单位：秒
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 档案创建时间戳，单位：秒
     * @param CreateTime 档案创建时间戳，单位：秒
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 客户姓名 
     * @return UserName 客户姓名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 客户姓名
     * @param UserName 客户姓名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 0未知，1：男，2：女 
     * @return Gender 0未知，1：男，2：女
     */
    public Long getGender() {
        return this.Gender;
    }

    /**
     * Set 0未知，1：男，2：女
     * @param Gender 0未知，1：男，2：女
     */
    public void setGender(Long Gender) {
        this.Gender = Gender;
    }

    /**
     * Get 客户联系手机号 
     * @return Phone 客户联系手机号
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 客户联系手机号
     * @param Phone 客户联系手机号
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 客户年龄段名称 
     * @return AgeRangeName 客户年龄段名称
     */
    public String getAgeRangeName() {
        return this.AgeRangeName;
    }

    /**
     * Set 客户年龄段名称
     * @param AgeRangeName 客户年龄段名称
     */
    public void setAgeRangeName(String AgeRangeName) {
        this.AgeRangeName = AgeRangeName;
    }

    /**
     * Get 客户行业类型名称信息，如教师、医生 
     * @return JobTypeName 客户行业类型名称信息，如教师、医生
     */
    public String getJobTypeName() {
        return this.JobTypeName;
    }

    /**
     * Set 客户行业类型名称信息，如教师、医生
     * @param JobTypeName 客户行业类型名称信息，如教师、医生
     */
    public void setJobTypeName(String JobTypeName) {
        this.JobTypeName = JobTypeName;
    }

    /**
     * Get 客户居住地址 
     * @return Address 客户居住地址
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 客户居住地址
     * @param Address 客户居住地址
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 客户所处状态
 0:已分配 1:未分配 1 待建档, 2 已建档， 3 已到店 4 已经试驾 5 战败申请中 6 已战败 7 已成交  
     * @return LeadsProcessStatus 客户所处状态
 0:已分配 1:未分配 1 待建档, 2 已建档， 3 已到店 4 已经试驾 5 战败申请中 6 已战败 7 已成交 
     */
    public Long getLeadsProcessStatus() {
        return this.LeadsProcessStatus;
    }

    /**
     * Set 客户所处状态
 0:已分配 1:未分配 1 待建档, 2 已建档， 3 已到店 4 已经试驾 5 战败申请中 6 已战败 7 已成交 
     * @param LeadsProcessStatus 客户所处状态
 0:已分配 1:未分配 1 待建档, 2 已建档， 3 已到店 4 已经试驾 5 战败申请中 6 已战败 7 已成交 
     */
    public void setLeadsProcessStatus(Long LeadsProcessStatus) {
        this.LeadsProcessStatus = LeadsProcessStatus;
    }

    /**
     * Get 客户来源类型，1：线上，2：线下 
     * @return LeadType 客户来源类型，1：线上，2：线下
     */
    public Long getLeadType() {
        return this.LeadType;
    }

    /**
     * Set 客户来源类型，1：线上，2：线下
     * @param LeadType 客户来源类型，1：线上，2：线下
     */
    public void setLeadType(Long LeadType) {
        this.LeadType = LeadType;
    }

    /**
     * Get 与客户来源类型对应的渠道名称 
     * @return SourceName 与客户来源类型对应的渠道名称
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set 与客户来源类型对应的渠道名称
     * @param SourceName 与客户来源类型对应的渠道名称
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    /**
     * Get 客户购车的意向等级 
     * @return LeadsLevelCode 客户购车的意向等级
     */
    public String getLeadsLevelCode() {
        return this.LeadsLevelCode;
    }

    /**
     * Set 客户购车的意向等级
     * @param LeadsLevelCode 客户购车的意向等级
     */
    public void setLeadsLevelCode(String LeadsLevelCode) {
        this.LeadsLevelCode = LeadsLevelCode;
    }

    /**
     * Get 客户意向品牌编号 
     * @return VehicleBrandCode 客户意向品牌编号
     */
    public String getVehicleBrandCode() {
        return this.VehicleBrandCode;
    }

    /**
     * Set 客户意向品牌编号
     * @param VehicleBrandCode 客户意向品牌编号
     */
    public void setVehicleBrandCode(String VehicleBrandCode) {
        this.VehicleBrandCode = VehicleBrandCode;
    }

    /**
     * Get 客户意向车系编号 
     * @return VehicleSeriesCode 客户意向车系编号
     */
    public String getVehicleSeriesCode() {
        return this.VehicleSeriesCode;
    }

    /**
     * Set 客户意向车系编号
     * @param VehicleSeriesCode 客户意向车系编号
     */
    public void setVehicleSeriesCode(String VehicleSeriesCode) {
        this.VehicleSeriesCode = VehicleSeriesCode;
    }

    /**
     * Get 客户意向车型编号 
     * @return VehicleTypeCode 客户意向车型编号
     */
    public String getVehicleTypeCode() {
        return this.VehicleTypeCode;
    }

    /**
     * Set 客户意向车型编号
     * @param VehicleTypeCode 客户意向车型编号
     */
    public void setVehicleTypeCode(String VehicleTypeCode) {
        this.VehicleTypeCode = VehicleTypeCode;
    }

    /**
     * Get 购车用途信息 
     * @return VehiclePurpose 购车用途信息
     */
    public VehiclePurpose getVehiclePurpose() {
        return this.VehiclePurpose;
    }

    /**
     * Set 购车用途信息
     * @param VehiclePurpose 购车用途信息
     */
    public void setVehiclePurpose(VehiclePurpose VehiclePurpose) {
        this.VehiclePurpose = VehiclePurpose;
    }

    /**
     * Get 购车关注点信息 
     * @return PurchaseConcern 购车关注点信息
     */
    public PurchaseConcern [] getPurchaseConcern() {
        return this.PurchaseConcern;
    }

    /**
     * Set 购车关注点信息
     * @param PurchaseConcern 购车关注点信息
     */
    public void setPurchaseConcern(PurchaseConcern [] PurchaseConcern) {
        this.PurchaseConcern = PurchaseConcern;
    }

    /**
     * Get 客户所属顾问姓名 
     * @return SalesName 客户所属顾问姓名
     */
    public String getSalesName() {
        return this.SalesName;
    }

    /**
     * Set 客户所属顾问姓名
     * @param SalesName 客户所属顾问姓名
     */
    public void setSalesName(String SalesName) {
        this.SalesName = SalesName;
    }

    /**
     * Get 客户所属顾问手机号 
     * @return SalesPhone 客户所属顾问手机号
     */
    public String getSalesPhone() {
        return this.SalesPhone;
    }

    /**
     * Set 客户所属顾问手机号
     * @param SalesPhone 客户所属顾问手机号
     */
    public void setSalesPhone(String SalesPhone) {
        this.SalesPhone = SalesPhone;
    }

    /**
     * Get 客户实际到店时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealArrivalTime 客户实际到店时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRealArrivalTime() {
        return this.RealArrivalTime;
    }

    /**
     * Set 客户实际到店时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealArrivalTime 客户实际到店时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealArrivalTime(Long RealArrivalTime) {
        this.RealArrivalTime = RealArrivalTime;
    }

    /**
     * Get 客户到店完成试乘试驾时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompleteTestDriveTime 客户到店完成试乘试驾时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCompleteTestDriveTime() {
        return this.CompleteTestDriveTime;
    }

    /**
     * Set 客户到店完成试乘试驾时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompleteTestDriveTime 客户到店完成试乘试驾时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompleteTestDriveTime(String CompleteTestDriveTime) {
        this.CompleteTestDriveTime = CompleteTestDriveTime;
    }

    /**
     * Get 客户完成下订的时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrderTime 客户完成下订的时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOrderTime() {
        return this.OrderTime;
    }

    /**
     * Set 客户完成下订的时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrderTime 客户完成下订的时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrderTime(Long OrderTime) {
        this.OrderTime = OrderTime;
    }

    /**
     * Get 客户成交的时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeliveryTime 客户成交的时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDeliveryTime() {
        return this.DeliveryTime;
    }

    /**
     * Set 客户成交的时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeliveryTime 客户成交的时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeliveryTime(Long DeliveryTime) {
        this.DeliveryTime = DeliveryTime;
    }

    /**
     * Get 开票时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InvoiceTime 开票时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInvoiceTime() {
        return this.InvoiceTime;
    }

    /**
     * Set 开票时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param InvoiceTime 开票时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvoiceTime(Long InvoiceTime) {
        this.InvoiceTime = InvoiceTime;
    }

    /**
     * Get 完成对此客户战败审批的时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LoseTime 完成对此客户战败审批的时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLoseTime() {
        return this.LoseTime;
    }

    /**
     * Set 完成对此客户战败审批的时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param LoseTime 完成对此客户战败审批的时间戳，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoseTime(Long LoseTime) {
        this.LoseTime = LoseTime;
    }

    /**
     * Get 线索成功获取的时间戳，单位：秒 
     * @return CreatedAtTime 线索成功获取的时间戳，单位：秒
     */
    public Long getCreatedAtTime() {
        return this.CreatedAtTime;
    }

    /**
     * Set 线索成功获取的时间戳，单位：秒
     * @param CreatedAtTime 线索成功获取的时间戳，单位：秒
     */
    public void setCreatedAtTime(Long CreatedAtTime) {
        this.CreatedAtTime = CreatedAtTime;
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
     * Get 线索成功创建的时间戳，单位：秒 
     * @return LeadCreateTime 线索成功创建的时间戳，单位：秒
     */
    public Long getLeadCreateTime() {
        return this.LeadCreateTime;
    }

    /**
     * Set 线索成功创建的时间戳，单位：秒
     * @param LeadCreateTime 线索成功创建的时间戳，单位：秒
     */
    public void setLeadCreateTime(Long LeadCreateTime) {
        this.LeadCreateTime = LeadCreateTime;
    }

    /**
     * Get 线索关联微信昵称 
     * @return Nickname 线索关联微信昵称
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set 线索关联微信昵称
     * @param Nickname 线索关联微信昵称
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get 线索归属部门节点 
     * @return OrgIdList 线索归属部门节点
     */
    public String [] getOrgIdList() {
        return this.OrgIdList;
    }

    /**
     * Set 线索归属部门节点
     * @param OrgIdList 线索归属部门节点
     */
    public void setOrgIdList(String [] OrgIdList) {
        this.OrgIdList = OrgIdList;
    }

    /**
     * Get 客户的介绍人姓名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Introducer 客户的介绍人姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIntroducer() {
        return this.Introducer;
    }

    /**
     * Set 客户的介绍人姓名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Introducer 客户的介绍人姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntroducer(String Introducer) {
        this.Introducer = Introducer;
    }

    /**
     * Get 客户的介绍人手机号码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IntroducerPhone 客户的介绍人手机号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIntroducerPhone() {
        return this.IntroducerPhone;
    }

    /**
     * Set 客户的介绍人手机号码
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntroducerPhone 客户的介绍人手机号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntroducerPhone(String IntroducerPhone) {
        this.IntroducerPhone = IntroducerPhone;
    }

    /**
     * Get 最近一次完成跟进的时间戳，单位：秒 
     * @return FollowTime 最近一次完成跟进的时间戳，单位：秒
     */
    public Long getFollowTime() {
        return this.FollowTime;
    }

    /**
     * Set 最近一次完成跟进的时间戳，单位：秒
     * @param FollowTime 最近一次完成跟进的时间戳，单位：秒
     */
    public void setFollowTime(Long FollowTime) {
        this.FollowTime = FollowTime;
    }

    /**
     * Get 最近一次计划跟进的时间戳，单位：秒 
     * @return NextFollowTime 最近一次计划跟进的时间戳，单位：秒
     */
    public Long getNextFollowTime() {
        return this.NextFollowTime;
    }

    /**
     * Set 最近一次计划跟进的时间戳，单位：秒
     * @param NextFollowTime 最近一次计划跟进的时间戳，单位：秒
     */
    public void setNextFollowTime(Long NextFollowTime) {
        this.NextFollowTime = NextFollowTime;
    }

    /**
     * Get 已为该客户添加的企业标签信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnterpriseTags 已为该客户添加的企业标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EnterpriseTag [] getEnterpriseTags() {
        return this.EnterpriseTags;
    }

    /**
     * Set 已为该客户添加的企业标签信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnterpriseTags 已为该客户添加的企业标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnterpriseTags(EnterpriseTag [] EnterpriseTags) {
        this.EnterpriseTags = EnterpriseTags;
    }

    /**
     * Get 已为该客户添加的渠道标签信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelTags 已为该客户添加的渠道标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ChannelTag [] getChannelTags() {
        return this.ChannelTags;
    }

    /**
     * Set 已为该客户添加的渠道标签信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelTags 已为该客户添加的渠道标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelTags(ChannelTag [] ChannelTags) {
        this.ChannelTags = ChannelTags;
    }

    /**
     * Get 关联线索id 
     * @return LeadId 关联线索id
     */
    public Long getLeadId() {
        return this.LeadId;
    }

    /**
     * Set 关联线索id
     * @param LeadId 关联线索id
     */
    public void setLeadId(Long LeadId) {
        this.LeadId = LeadId;
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
     * Get 顾问职位 
     * @return Position 顾问职位
     */
    public String getPosition() {
        return this.Position;
    }

    /**
     * Set 顾问职位
     * @param Position 顾问职位
     */
    public void setPosition(String Position) {
        this.Position = Position;
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
     * Get 是否无效 
     * @return IsInvalid 是否无效
     */
    public Long getIsInvalid() {
        return this.IsInvalid;
    }

    /**
     * Set 是否无效
     * @param IsInvalid 是否无效
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
     * Get 无效类型名称 
     * @return InvalidTypeName 无效类型名称
     */
    public String getInvalidTypeName() {
        return this.InvalidTypeName;
    }

    /**
     * Set 无效类型名称
     * @param InvalidTypeName 无效类型名称
     */
    public void setInvalidTypeName(String InvalidTypeName) {
        this.InvalidTypeName = InvalidTypeName;
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
     * Get 线索是否战败 
     * @return IsLose 线索是否战败
     */
    public Long getIsLose() {
        return this.IsLose;
    }

    /**
     * Set 线索是否战败
     * @param IsLose 线索是否战败
     */
    public void setIsLose(Long IsLose) {
        this.IsLose = IsLose;
    }

    /**
     * Get 战败类型 
     * @return LoseType 战败类型
     */
    public String getLoseType() {
        return this.LoseType;
    }

    /**
     * Set 战败类型
     * @param LoseType 战败类型
     */
    public void setLoseType(String LoseType) {
        this.LoseType = LoseType;
    }

    /**
     * Get 战败类型名称 
     * @return LoseTypeName 战败类型名称
     */
    public String getLoseTypeName() {
        return this.LoseTypeName;
    }

    /**
     * Set 战败类型名称
     * @param LoseTypeName 战败类型名称
     */
    public void setLoseTypeName(String LoseTypeName) {
        this.LoseTypeName = LoseTypeName;
    }

    /**
     * Get 战败申请原因 
     * @return LoseRemark 战败申请原因
     */
    public String getLoseRemark() {
        return this.LoseRemark;
    }

    /**
     * Set 战败申请原因
     * @param LoseRemark 战败申请原因
     */
    public void setLoseRemark(String LoseRemark) {
        this.LoseRemark = LoseRemark;
    }

    public CustomerProfile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomerProfile(CustomerProfile source) {
        if (source.CustomerId != null) {
            this.CustomerId = new Long(source.CustomerId);
        }
        if (source.DealerCode != null) {
            this.DealerCode = new String(source.DealerCode);
        }
        if (source.UnionId != null) {
            this.UnionId = new String(source.UnionId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Gender != null) {
            this.Gender = new Long(source.Gender);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.AgeRangeName != null) {
            this.AgeRangeName = new String(source.AgeRangeName);
        }
        if (source.JobTypeName != null) {
            this.JobTypeName = new String(source.JobTypeName);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.LeadsProcessStatus != null) {
            this.LeadsProcessStatus = new Long(source.LeadsProcessStatus);
        }
        if (source.LeadType != null) {
            this.LeadType = new Long(source.LeadType);
        }
        if (source.SourceName != null) {
            this.SourceName = new String(source.SourceName);
        }
        if (source.LeadsLevelCode != null) {
            this.LeadsLevelCode = new String(source.LeadsLevelCode);
        }
        if (source.VehicleBrandCode != null) {
            this.VehicleBrandCode = new String(source.VehicleBrandCode);
        }
        if (source.VehicleSeriesCode != null) {
            this.VehicleSeriesCode = new String(source.VehicleSeriesCode);
        }
        if (source.VehicleTypeCode != null) {
            this.VehicleTypeCode = new String(source.VehicleTypeCode);
        }
        if (source.VehiclePurpose != null) {
            this.VehiclePurpose = new VehiclePurpose(source.VehiclePurpose);
        }
        if (source.PurchaseConcern != null) {
            this.PurchaseConcern = new PurchaseConcern[source.PurchaseConcern.length];
            for (int i = 0; i < source.PurchaseConcern.length; i++) {
                this.PurchaseConcern[i] = new PurchaseConcern(source.PurchaseConcern[i]);
            }
        }
        if (source.SalesName != null) {
            this.SalesName = new String(source.SalesName);
        }
        if (source.SalesPhone != null) {
            this.SalesPhone = new String(source.SalesPhone);
        }
        if (source.RealArrivalTime != null) {
            this.RealArrivalTime = new Long(source.RealArrivalTime);
        }
        if (source.CompleteTestDriveTime != null) {
            this.CompleteTestDriveTime = new String(source.CompleteTestDriveTime);
        }
        if (source.OrderTime != null) {
            this.OrderTime = new Long(source.OrderTime);
        }
        if (source.DeliveryTime != null) {
            this.DeliveryTime = new Long(source.DeliveryTime);
        }
        if (source.InvoiceTime != null) {
            this.InvoiceTime = new Long(source.InvoiceTime);
        }
        if (source.LoseTime != null) {
            this.LoseTime = new Long(source.LoseTime);
        }
        if (source.CreatedAtTime != null) {
            this.CreatedAtTime = new Long(source.CreatedAtTime);
        }
        if (source.ImportAtTime != null) {
            this.ImportAtTime = new Long(source.ImportAtTime);
        }
        if (source.DistributeTime != null) {
            this.DistributeTime = new Long(source.DistributeTime);
        }
        if (source.LeadCreateTime != null) {
            this.LeadCreateTime = new Long(source.LeadCreateTime);
        }
        if (source.Nickname != null) {
            this.Nickname = new String(source.Nickname);
        }
        if (source.OrgIdList != null) {
            this.OrgIdList = new String[source.OrgIdList.length];
            for (int i = 0; i < source.OrgIdList.length; i++) {
                this.OrgIdList[i] = new String(source.OrgIdList[i]);
            }
        }
        if (source.Introducer != null) {
            this.Introducer = new String(source.Introducer);
        }
        if (source.IntroducerPhone != null) {
            this.IntroducerPhone = new String(source.IntroducerPhone);
        }
        if (source.FollowTime != null) {
            this.FollowTime = new Long(source.FollowTime);
        }
        if (source.NextFollowTime != null) {
            this.NextFollowTime = new Long(source.NextFollowTime);
        }
        if (source.EnterpriseTags != null) {
            this.EnterpriseTags = new EnterpriseTag[source.EnterpriseTags.length];
            for (int i = 0; i < source.EnterpriseTags.length; i++) {
                this.EnterpriseTags[i] = new EnterpriseTag(source.EnterpriseTags[i]);
            }
        }
        if (source.ChannelTags != null) {
            this.ChannelTags = new ChannelTag[source.ChannelTags.length];
            for (int i = 0; i < source.ChannelTags.length; i++) {
                this.ChannelTags[i] = new ChannelTag(source.ChannelTags[i]);
            }
        }
        if (source.LeadId != null) {
            this.LeadId = new Long(source.LeadId);
        }
        if (source.WxId != null) {
            this.WxId = new String(source.WxId);
        }
        if (source.Position != null) {
            this.Position = new String(source.Position);
        }
        if (source.IsBindWx != null) {
            this.IsBindWx = new Long(source.IsBindWx);
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
        if (source.InvalidTime != null) {
            this.InvalidTime = new Long(source.InvalidTime);
        }
        if (source.InvalidRemark != null) {
            this.InvalidRemark = new String(source.InvalidRemark);
        }
        if (source.IsLose != null) {
            this.IsLose = new Long(source.IsLose);
        }
        if (source.LoseType != null) {
            this.LoseType = new String(source.LoseType);
        }
        if (source.LoseTypeName != null) {
            this.LoseTypeName = new String(source.LoseTypeName);
        }
        if (source.LoseRemark != null) {
            this.LoseRemark = new String(source.LoseRemark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerId", this.CustomerId);
        this.setParamSimple(map, prefix + "DealerCode", this.DealerCode);
        this.setParamSimple(map, prefix + "UnionId", this.UnionId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "AgeRangeName", this.AgeRangeName);
        this.setParamSimple(map, prefix + "JobTypeName", this.JobTypeName);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "LeadsProcessStatus", this.LeadsProcessStatus);
        this.setParamSimple(map, prefix + "LeadType", this.LeadType);
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamSimple(map, prefix + "LeadsLevelCode", this.LeadsLevelCode);
        this.setParamSimple(map, prefix + "VehicleBrandCode", this.VehicleBrandCode);
        this.setParamSimple(map, prefix + "VehicleSeriesCode", this.VehicleSeriesCode);
        this.setParamSimple(map, prefix + "VehicleTypeCode", this.VehicleTypeCode);
        this.setParamObj(map, prefix + "VehiclePurpose.", this.VehiclePurpose);
        this.setParamArrayObj(map, prefix + "PurchaseConcern.", this.PurchaseConcern);
        this.setParamSimple(map, prefix + "SalesName", this.SalesName);
        this.setParamSimple(map, prefix + "SalesPhone", this.SalesPhone);
        this.setParamSimple(map, prefix + "RealArrivalTime", this.RealArrivalTime);
        this.setParamSimple(map, prefix + "CompleteTestDriveTime", this.CompleteTestDriveTime);
        this.setParamSimple(map, prefix + "OrderTime", this.OrderTime);
        this.setParamSimple(map, prefix + "DeliveryTime", this.DeliveryTime);
        this.setParamSimple(map, prefix + "InvoiceTime", this.InvoiceTime);
        this.setParamSimple(map, prefix + "LoseTime", this.LoseTime);
        this.setParamSimple(map, prefix + "CreatedAtTime", this.CreatedAtTime);
        this.setParamSimple(map, prefix + "ImportAtTime", this.ImportAtTime);
        this.setParamSimple(map, prefix + "DistributeTime", this.DistributeTime);
        this.setParamSimple(map, prefix + "LeadCreateTime", this.LeadCreateTime);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamArraySimple(map, prefix + "OrgIdList.", this.OrgIdList);
        this.setParamSimple(map, prefix + "Introducer", this.Introducer);
        this.setParamSimple(map, prefix + "IntroducerPhone", this.IntroducerPhone);
        this.setParamSimple(map, prefix + "FollowTime", this.FollowTime);
        this.setParamSimple(map, prefix + "NextFollowTime", this.NextFollowTime);
        this.setParamArrayObj(map, prefix + "EnterpriseTags.", this.EnterpriseTags);
        this.setParamArrayObj(map, prefix + "ChannelTags.", this.ChannelTags);
        this.setParamSimple(map, prefix + "LeadId", this.LeadId);
        this.setParamSimple(map, prefix + "WxId", this.WxId);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamSimple(map, prefix + "IsBindWx", this.IsBindWx);
        this.setParamSimple(map, prefix + "IsInvalid", this.IsInvalid);
        this.setParamSimple(map, prefix + "InvalidType", this.InvalidType);
        this.setParamSimple(map, prefix + "InvalidTypeName", this.InvalidTypeName);
        this.setParamSimple(map, prefix + "InvalidTime", this.InvalidTime);
        this.setParamSimple(map, prefix + "InvalidRemark", this.InvalidRemark);
        this.setParamSimple(map, prefix + "IsLose", this.IsLose);
        this.setParamSimple(map, prefix + "LoseType", this.LoseType);
        this.setParamSimple(map, prefix + "LoseTypeName", this.LoseTypeName);
        this.setParamSimple(map, prefix + "LoseRemark", this.LoseRemark);

    }
}

