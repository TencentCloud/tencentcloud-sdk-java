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
    * 接待客户经销商顾问所属组织id,多个组织使用逗号分割
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
     * Get 接待客户经销商顾问所属组织id,多个组织使用逗号分割 
     * @return DealerId 接待客户经销商顾问所属组织id,多个组织使用逗号分割
     */
    public String getDealerId() {
        return this.DealerId;
    }

    /**
     * Set 接待客户经销商顾问所属组织id,多个组织使用逗号分割
     * @param DealerId 接待客户经销商顾问所属组织id,多个组织使用逗号分割
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
        this.setParamSimple(map, prefix + "LeadStatus", this.LeadStatus);
        this.setParamSimple(map, prefix + "LevelCode", this.LevelCode);
        this.setParamSimple(map, prefix + "ImportAtTime", this.ImportAtTime);
        this.setParamSimple(map, prefix + "DistributeTime", this.DistributeTime);
        this.setParamSimple(map, prefix + "CreateAtTime", this.CreateAtTime);

    }
}

