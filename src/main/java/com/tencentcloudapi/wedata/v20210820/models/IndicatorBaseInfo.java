/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IndicatorBaseInfo extends AbstractModel {

    /**
    * 名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 指标编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndicatorCode")
    @Expose
    private String IndicatorCode;

    /**
    * 指标类型（1-原子指标 2-衍生指标 3-复合指标）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndicatorType")
    @Expose
    private Long IndicatorType;

    /**
    * 业务负责人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BizOwner")
    @Expose
    private String BizOwner;

    /**
    * 技术负责人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TechOwner")
    @Expose
    private String TechOwner;

    /**
    * 业务口径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BizCaliber")
    @Expose
    private String BizCaliber;

    /**
    * 指标描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 等级：40-L4核心 30-L3重要 20-L2一般 10-L1临时
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 计算逻辑
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CalLogic")
    @Expose
    private String CalLogic;

    /**
    * 计算频次
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CalFreq")
    @Expose
    private String CalFreq;

    /**
    * 度量单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MeasureUnit")
    @Expose
    private Long MeasureUnit;

    /**
    * 精度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Accuracy")
    @Expose
    private Long Accuracy;

    /**
    * 关联指标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceIndicatorIds")
    @Expose
    private IndicatorBaseSimpleInfo [] SourceIndicatorIds;

    /**
    * ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 维度列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DimensionIds")
    @Expose
    private AssetDimSimpleVO [] DimensionIds;

    /**
    * 文件夹ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FolderId")
    @Expose
    private Long FolderId;

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 业务负责人名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BizOwnerName")
    @Expose
    private String BizOwnerName;

    /**
    * 技术负责人名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TechOwnerName")
    @Expose
    private String TechOwnerName;

    /**
    * 发布时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublishTime")
    @Expose
    private String PublishTime;

    /**
    * 发布人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublishAccount")
    @Expose
    private String PublishAccount;

    /**
    * 发布人名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublishAccountName")
    @Expose
    private String PublishAccountName;

    /**
    * 最后修订时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastModifyTime")
    @Expose
    private String LastModifyTime;

    /**
    * 最后修订人ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastModifyAccount")
    @Expose
    private String LastModifyAccount;

    /**
    * 最后修订人名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastModifyAccountName")
    @Expose
    private String LastModifyAccountName;

    /**
    * 变更日志
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChangeLogList")
    @Expose
    private ChangeLog [] ChangeLogList;

    /**
    * 字段列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableColumns")
    @Expose
    private AssetDimTableColumn [] TableColumns;

    /**
    * 关联指标(包含多层级关联指标)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllSourceIndicatorIds")
    @Expose
    private IndicatorBaseInfo [] AllSourceIndicatorIds;

    /**
    * 资产guid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * 类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * 资产编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetCode")
    @Expose
    private String AssetCode;

    /**
    * 被关联的指标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelatedIndicatorIds")
    @Expose
    private IndicatorBaseInfo [] RelatedIndicatorIds;

    /**
    * 数据目录ID列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BizCatalogIds")
    @Expose
    private Long [] BizCatalogIds;

    /**
    * 数据目录名称列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BizCatalogNames")
    @Expose
    private String [] BizCatalogNames;

    /**
    * 资产等级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetLevel")
    @Expose
    private Long AssetLevel;

    /**
    * 资产发布状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetStatus")
    @Expose
    private Long AssetStatus;

    /**
    * 资产发布时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetPublishTime")
    @Expose
    private String AssetPublishTime;

    /**
    * 资产发布人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetPublishAccount")
    @Expose
    private String AssetPublishAccount;

    /**
    * 资产发布人名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetPublishAccountName")
    @Expose
    private String AssetPublishAccountName;

    /**
    * 指标权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndicatorPermission")
    @Expose
    private PermissionStatus IndicatorPermission;

    /**
    * 资产权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperateOption")
    @Expose
    private DataAssetOption OperateOption;

    /**
    * 项目 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 项目名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
     * Get 名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 指标编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndicatorCode 指标编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndicatorCode() {
        return this.IndicatorCode;
    }

    /**
     * Set 指标编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndicatorCode 指标编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndicatorCode(String IndicatorCode) {
        this.IndicatorCode = IndicatorCode;
    }

    /**
     * Get 指标类型（1-原子指标 2-衍生指标 3-复合指标）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndicatorType 指标类型（1-原子指标 2-衍生指标 3-复合指标）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIndicatorType() {
        return this.IndicatorType;
    }

    /**
     * Set 指标类型（1-原子指标 2-衍生指标 3-复合指标）
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndicatorType 指标类型（1-原子指标 2-衍生指标 3-复合指标）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndicatorType(Long IndicatorType) {
        this.IndicatorType = IndicatorType;
    }

    /**
     * Get 业务负责人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BizOwner 业务负责人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBizOwner() {
        return this.BizOwner;
    }

    /**
     * Set 业务负责人
注意：此字段可能返回 null，表示取不到有效值。
     * @param BizOwner 业务负责人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBizOwner(String BizOwner) {
        this.BizOwner = BizOwner;
    }

    /**
     * Get 技术负责人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TechOwner 技术负责人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTechOwner() {
        return this.TechOwner;
    }

    /**
     * Set 技术负责人
注意：此字段可能返回 null，表示取不到有效值。
     * @param TechOwner 技术负责人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTechOwner(String TechOwner) {
        this.TechOwner = TechOwner;
    }

    /**
     * Get 业务口径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BizCaliber 业务口径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBizCaliber() {
        return this.BizCaliber;
    }

    /**
     * Set 业务口径
注意：此字段可能返回 null，表示取不到有效值。
     * @param BizCaliber 业务口径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBizCaliber(String BizCaliber) {
        this.BizCaliber = BizCaliber;
    }

    /**
     * Get 指标描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 指标描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 指标描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 指标描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 等级：40-L4核心 30-L3重要 20-L2一般 10-L1临时
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Level 等级：40-L4核心 30-L3重要 20-L2一般 10-L1临时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 等级：40-L4核心 30-L3重要 20-L2一般 10-L1临时
注意：此字段可能返回 null，表示取不到有效值。
     * @param Level 等级：40-L4核心 30-L3重要 20-L2一般 10-L1临时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 计算逻辑
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CalLogic 计算逻辑
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCalLogic() {
        return this.CalLogic;
    }

    /**
     * Set 计算逻辑
注意：此字段可能返回 null，表示取不到有效值。
     * @param CalLogic 计算逻辑
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCalLogic(String CalLogic) {
        this.CalLogic = CalLogic;
    }

    /**
     * Get 计算频次
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CalFreq 计算频次
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCalFreq() {
        return this.CalFreq;
    }

    /**
     * Set 计算频次
注意：此字段可能返回 null，表示取不到有效值。
     * @param CalFreq 计算频次
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCalFreq(String CalFreq) {
        this.CalFreq = CalFreq;
    }

    /**
     * Get 度量单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MeasureUnit 度量单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMeasureUnit() {
        return this.MeasureUnit;
    }

    /**
     * Set 度量单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param MeasureUnit 度量单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMeasureUnit(Long MeasureUnit) {
        this.MeasureUnit = MeasureUnit;
    }

    /**
     * Get 精度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Accuracy 精度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAccuracy() {
        return this.Accuracy;
    }

    /**
     * Set 精度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Accuracy 精度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccuracy(Long Accuracy) {
        this.Accuracy = Accuracy;
    }

    /**
     * Get 关联指标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceIndicatorIds 关联指标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IndicatorBaseSimpleInfo [] getSourceIndicatorIds() {
        return this.SourceIndicatorIds;
    }

    /**
     * Set 关联指标
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceIndicatorIds 关联指标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceIndicatorIds(IndicatorBaseSimpleInfo [] SourceIndicatorIds) {
        this.SourceIndicatorIds = SourceIndicatorIds;
    }

    /**
     * Get ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 维度列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DimensionIds 维度列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AssetDimSimpleVO [] getDimensionIds() {
        return this.DimensionIds;
    }

    /**
     * Set 维度列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param DimensionIds 维度列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDimensionIds(AssetDimSimpleVO [] DimensionIds) {
        this.DimensionIds = DimensionIds;
    }

    /**
     * Get 文件夹ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FolderId 文件夹ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFolderId() {
        return this.FolderId;
    }

    /**
     * Set 文件夹ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param FolderId 文件夹ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFolderId(Long FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get 状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 业务负责人名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BizOwnerName 业务负责人名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBizOwnerName() {
        return this.BizOwnerName;
    }

    /**
     * Set 业务负责人名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param BizOwnerName 业务负责人名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBizOwnerName(String BizOwnerName) {
        this.BizOwnerName = BizOwnerName;
    }

    /**
     * Get 技术负责人名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TechOwnerName 技术负责人名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTechOwnerName() {
        return this.TechOwnerName;
    }

    /**
     * Set 技术负责人名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param TechOwnerName 技术负责人名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTechOwnerName(String TechOwnerName) {
        this.TechOwnerName = TechOwnerName;
    }

    /**
     * Get 发布时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublishTime 发布时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublishTime() {
        return this.PublishTime;
    }

    /**
     * Set 发布时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublishTime 发布时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublishTime(String PublishTime) {
        this.PublishTime = PublishTime;
    }

    /**
     * Get 发布人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublishAccount 发布人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublishAccount() {
        return this.PublishAccount;
    }

    /**
     * Set 发布人
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublishAccount 发布人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublishAccount(String PublishAccount) {
        this.PublishAccount = PublishAccount;
    }

    /**
     * Get 发布人名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublishAccountName 发布人名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublishAccountName() {
        return this.PublishAccountName;
    }

    /**
     * Set 发布人名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublishAccountName 发布人名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublishAccountName(String PublishAccountName) {
        this.PublishAccountName = PublishAccountName;
    }

    /**
     * Get 最后修订时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastModifyTime 最后修订时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastModifyTime() {
        return this.LastModifyTime;
    }

    /**
     * Set 最后修订时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastModifyTime 最后修订时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastModifyTime(String LastModifyTime) {
        this.LastModifyTime = LastModifyTime;
    }

    /**
     * Get 最后修订人ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastModifyAccount 最后修订人ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastModifyAccount() {
        return this.LastModifyAccount;
    }

    /**
     * Set 最后修订人ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastModifyAccount 最后修订人ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastModifyAccount(String LastModifyAccount) {
        this.LastModifyAccount = LastModifyAccount;
    }

    /**
     * Get 最后修订人名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastModifyAccountName 最后修订人名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastModifyAccountName() {
        return this.LastModifyAccountName;
    }

    /**
     * Set 最后修订人名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastModifyAccountName 最后修订人名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastModifyAccountName(String LastModifyAccountName) {
        this.LastModifyAccountName = LastModifyAccountName;
    }

    /**
     * Get 变更日志
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChangeLogList 变更日志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ChangeLog [] getChangeLogList() {
        return this.ChangeLogList;
    }

    /**
     * Set 变更日志
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChangeLogList 变更日志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChangeLogList(ChangeLog [] ChangeLogList) {
        this.ChangeLogList = ChangeLogList;
    }

    /**
     * Get 字段列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableColumns 字段列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AssetDimTableColumn [] getTableColumns() {
        return this.TableColumns;
    }

    /**
     * Set 字段列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableColumns 字段列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableColumns(AssetDimTableColumn [] TableColumns) {
        this.TableColumns = TableColumns;
    }

    /**
     * Get 关联指标(包含多层级关联指标)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllSourceIndicatorIds 关联指标(包含多层级关联指标)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IndicatorBaseInfo [] getAllSourceIndicatorIds() {
        return this.AllSourceIndicatorIds;
    }

    /**
     * Set 关联指标(包含多层级关联指标)
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllSourceIndicatorIds 关联指标(包含多层级关联指标)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllSourceIndicatorIds(IndicatorBaseInfo [] AllSourceIndicatorIds) {
        this.AllSourceIndicatorIds = AllSourceIndicatorIds;
    }

    /**
     * Get 资产guid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetId 资产guid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set 资产guid
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetId 资产guid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get 类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetType 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set 类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetType 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get 资产编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetCode 资产编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetCode() {
        return this.AssetCode;
    }

    /**
     * Set 资产编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetCode 资产编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetCode(String AssetCode) {
        this.AssetCode = AssetCode;
    }

    /**
     * Get 被关联的指标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelatedIndicatorIds 被关联的指标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IndicatorBaseInfo [] getRelatedIndicatorIds() {
        return this.RelatedIndicatorIds;
    }

    /**
     * Set 被关联的指标
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelatedIndicatorIds 被关联的指标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelatedIndicatorIds(IndicatorBaseInfo [] RelatedIndicatorIds) {
        this.RelatedIndicatorIds = RelatedIndicatorIds;
    }

    /**
     * Get 数据目录ID列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BizCatalogIds 数据目录ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getBizCatalogIds() {
        return this.BizCatalogIds;
    }

    /**
     * Set 数据目录ID列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param BizCatalogIds 数据目录ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBizCatalogIds(Long [] BizCatalogIds) {
        this.BizCatalogIds = BizCatalogIds;
    }

    /**
     * Get 数据目录名称列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BizCatalogNames 数据目录名称列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getBizCatalogNames() {
        return this.BizCatalogNames;
    }

    /**
     * Set 数据目录名称列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param BizCatalogNames 数据目录名称列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBizCatalogNames(String [] BizCatalogNames) {
        this.BizCatalogNames = BizCatalogNames;
    }

    /**
     * Get 资产等级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetLevel 资产等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAssetLevel() {
        return this.AssetLevel;
    }

    /**
     * Set 资产等级
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetLevel 资产等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetLevel(Long AssetLevel) {
        this.AssetLevel = AssetLevel;
    }

    /**
     * Get 资产发布状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetStatus 资产发布状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAssetStatus() {
        return this.AssetStatus;
    }

    /**
     * Set 资产发布状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetStatus 资产发布状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetStatus(Long AssetStatus) {
        this.AssetStatus = AssetStatus;
    }

    /**
     * Get 资产发布时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetPublishTime 资产发布时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetPublishTime() {
        return this.AssetPublishTime;
    }

    /**
     * Set 资产发布时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetPublishTime 资产发布时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetPublishTime(String AssetPublishTime) {
        this.AssetPublishTime = AssetPublishTime;
    }

    /**
     * Get 资产发布人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetPublishAccount 资产发布人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetPublishAccount() {
        return this.AssetPublishAccount;
    }

    /**
     * Set 资产发布人
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetPublishAccount 资产发布人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetPublishAccount(String AssetPublishAccount) {
        this.AssetPublishAccount = AssetPublishAccount;
    }

    /**
     * Get 资产发布人名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetPublishAccountName 资产发布人名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetPublishAccountName() {
        return this.AssetPublishAccountName;
    }

    /**
     * Set 资产发布人名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetPublishAccountName 资产发布人名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetPublishAccountName(String AssetPublishAccountName) {
        this.AssetPublishAccountName = AssetPublishAccountName;
    }

    /**
     * Get 指标权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndicatorPermission 指标权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PermissionStatus getIndicatorPermission() {
        return this.IndicatorPermission;
    }

    /**
     * Set 指标权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndicatorPermission 指标权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndicatorPermission(PermissionStatus IndicatorPermission) {
        this.IndicatorPermission = IndicatorPermission;
    }

    /**
     * Get 资产权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperateOption 资产权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DataAssetOption getOperateOption() {
        return this.OperateOption;
    }

    /**
     * Set 资产权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperateOption 资产权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperateOption(DataAssetOption OperateOption) {
        this.OperateOption = OperateOption;
    }

    /**
     * Get 项目 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 项目名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectName 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectName 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    public IndicatorBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IndicatorBaseInfo(IndicatorBaseInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IndicatorCode != null) {
            this.IndicatorCode = new String(source.IndicatorCode);
        }
        if (source.IndicatorType != null) {
            this.IndicatorType = new Long(source.IndicatorType);
        }
        if (source.BizOwner != null) {
            this.BizOwner = new String(source.BizOwner);
        }
        if (source.TechOwner != null) {
            this.TechOwner = new String(source.TechOwner);
        }
        if (source.BizCaliber != null) {
            this.BizCaliber = new String(source.BizCaliber);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.CalLogic != null) {
            this.CalLogic = new String(source.CalLogic);
        }
        if (source.CalFreq != null) {
            this.CalFreq = new String(source.CalFreq);
        }
        if (source.MeasureUnit != null) {
            this.MeasureUnit = new Long(source.MeasureUnit);
        }
        if (source.Accuracy != null) {
            this.Accuracy = new Long(source.Accuracy);
        }
        if (source.SourceIndicatorIds != null) {
            this.SourceIndicatorIds = new IndicatorBaseSimpleInfo[source.SourceIndicatorIds.length];
            for (int i = 0; i < source.SourceIndicatorIds.length; i++) {
                this.SourceIndicatorIds[i] = new IndicatorBaseSimpleInfo(source.SourceIndicatorIds[i]);
            }
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.DimensionIds != null) {
            this.DimensionIds = new AssetDimSimpleVO[source.DimensionIds.length];
            for (int i = 0; i < source.DimensionIds.length; i++) {
                this.DimensionIds[i] = new AssetDimSimpleVO(source.DimensionIds[i]);
            }
        }
        if (source.FolderId != null) {
            this.FolderId = new Long(source.FolderId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.BizOwnerName != null) {
            this.BizOwnerName = new String(source.BizOwnerName);
        }
        if (source.TechOwnerName != null) {
            this.TechOwnerName = new String(source.TechOwnerName);
        }
        if (source.PublishTime != null) {
            this.PublishTime = new String(source.PublishTime);
        }
        if (source.PublishAccount != null) {
            this.PublishAccount = new String(source.PublishAccount);
        }
        if (source.PublishAccountName != null) {
            this.PublishAccountName = new String(source.PublishAccountName);
        }
        if (source.LastModifyTime != null) {
            this.LastModifyTime = new String(source.LastModifyTime);
        }
        if (source.LastModifyAccount != null) {
            this.LastModifyAccount = new String(source.LastModifyAccount);
        }
        if (source.LastModifyAccountName != null) {
            this.LastModifyAccountName = new String(source.LastModifyAccountName);
        }
        if (source.ChangeLogList != null) {
            this.ChangeLogList = new ChangeLog[source.ChangeLogList.length];
            for (int i = 0; i < source.ChangeLogList.length; i++) {
                this.ChangeLogList[i] = new ChangeLog(source.ChangeLogList[i]);
            }
        }
        if (source.TableColumns != null) {
            this.TableColumns = new AssetDimTableColumn[source.TableColumns.length];
            for (int i = 0; i < source.TableColumns.length; i++) {
                this.TableColumns[i] = new AssetDimTableColumn(source.TableColumns[i]);
            }
        }
        if (source.AllSourceIndicatorIds != null) {
            this.AllSourceIndicatorIds = new IndicatorBaseInfo[source.AllSourceIndicatorIds.length];
            for (int i = 0; i < source.AllSourceIndicatorIds.length; i++) {
                this.AllSourceIndicatorIds[i] = new IndicatorBaseInfo(source.AllSourceIndicatorIds[i]);
            }
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.AssetCode != null) {
            this.AssetCode = new String(source.AssetCode);
        }
        if (source.RelatedIndicatorIds != null) {
            this.RelatedIndicatorIds = new IndicatorBaseInfo[source.RelatedIndicatorIds.length];
            for (int i = 0; i < source.RelatedIndicatorIds.length; i++) {
                this.RelatedIndicatorIds[i] = new IndicatorBaseInfo(source.RelatedIndicatorIds[i]);
            }
        }
        if (source.BizCatalogIds != null) {
            this.BizCatalogIds = new Long[source.BizCatalogIds.length];
            for (int i = 0; i < source.BizCatalogIds.length; i++) {
                this.BizCatalogIds[i] = new Long(source.BizCatalogIds[i]);
            }
        }
        if (source.BizCatalogNames != null) {
            this.BizCatalogNames = new String[source.BizCatalogNames.length];
            for (int i = 0; i < source.BizCatalogNames.length; i++) {
                this.BizCatalogNames[i] = new String(source.BizCatalogNames[i]);
            }
        }
        if (source.AssetLevel != null) {
            this.AssetLevel = new Long(source.AssetLevel);
        }
        if (source.AssetStatus != null) {
            this.AssetStatus = new Long(source.AssetStatus);
        }
        if (source.AssetPublishTime != null) {
            this.AssetPublishTime = new String(source.AssetPublishTime);
        }
        if (source.AssetPublishAccount != null) {
            this.AssetPublishAccount = new String(source.AssetPublishAccount);
        }
        if (source.AssetPublishAccountName != null) {
            this.AssetPublishAccountName = new String(source.AssetPublishAccountName);
        }
        if (source.IndicatorPermission != null) {
            this.IndicatorPermission = new PermissionStatus(source.IndicatorPermission);
        }
        if (source.OperateOption != null) {
            this.OperateOption = new DataAssetOption(source.OperateOption);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IndicatorCode", this.IndicatorCode);
        this.setParamSimple(map, prefix + "IndicatorType", this.IndicatorType);
        this.setParamSimple(map, prefix + "BizOwner", this.BizOwner);
        this.setParamSimple(map, prefix + "TechOwner", this.TechOwner);
        this.setParamSimple(map, prefix + "BizCaliber", this.BizCaliber);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "CalLogic", this.CalLogic);
        this.setParamSimple(map, prefix + "CalFreq", this.CalFreq);
        this.setParamSimple(map, prefix + "MeasureUnit", this.MeasureUnit);
        this.setParamSimple(map, prefix + "Accuracy", this.Accuracy);
        this.setParamArrayObj(map, prefix + "SourceIndicatorIds.", this.SourceIndicatorIds);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArrayObj(map, prefix + "DimensionIds.", this.DimensionIds);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BizOwnerName", this.BizOwnerName);
        this.setParamSimple(map, prefix + "TechOwnerName", this.TechOwnerName);
        this.setParamSimple(map, prefix + "PublishTime", this.PublishTime);
        this.setParamSimple(map, prefix + "PublishAccount", this.PublishAccount);
        this.setParamSimple(map, prefix + "PublishAccountName", this.PublishAccountName);
        this.setParamSimple(map, prefix + "LastModifyTime", this.LastModifyTime);
        this.setParamSimple(map, prefix + "LastModifyAccount", this.LastModifyAccount);
        this.setParamSimple(map, prefix + "LastModifyAccountName", this.LastModifyAccountName);
        this.setParamArrayObj(map, prefix + "ChangeLogList.", this.ChangeLogList);
        this.setParamArrayObj(map, prefix + "TableColumns.", this.TableColumns);
        this.setParamArrayObj(map, prefix + "AllSourceIndicatorIds.", this.AllSourceIndicatorIds);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "AssetCode", this.AssetCode);
        this.setParamArrayObj(map, prefix + "RelatedIndicatorIds.", this.RelatedIndicatorIds);
        this.setParamArraySimple(map, prefix + "BizCatalogIds.", this.BizCatalogIds);
        this.setParamArraySimple(map, prefix + "BizCatalogNames.", this.BizCatalogNames);
        this.setParamSimple(map, prefix + "AssetLevel", this.AssetLevel);
        this.setParamSimple(map, prefix + "AssetStatus", this.AssetStatus);
        this.setParamSimple(map, prefix + "AssetPublishTime", this.AssetPublishTime);
        this.setParamSimple(map, prefix + "AssetPublishAccount", this.AssetPublishAccount);
        this.setParamSimple(map, prefix + "AssetPublishAccountName", this.AssetPublishAccountName);
        this.setParamObj(map, prefix + "IndicatorPermission.", this.IndicatorPermission);
        this.setParamObj(map, prefix + "OperateOption.", this.OperateOption);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);

    }
}

