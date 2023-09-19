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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RiskItemInfo extends AbstractModel{

    /**
    * 最新风险项id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 数据源id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataSourceId")
    @Expose
    private String DataSourceId;

    /**
    * 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataSourceName")
    @Expose
    private String DataSourceName;

    /**
    * 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataSourceType")
    @Expose
    private String DataSourceType;

    /**
    * 资源地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * 资产名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * 风险类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskType")
    @Expose
    private String RiskType;

    /**
    * 风险项
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskName")
    @Expose
    private String RiskName;

    /**
    * 风险级别
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * 风险描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskDescription")
    @Expose
    private String RiskDescription;

    /**
    * 建议措施
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuggestAction")
    @Expose
    private String SuggestAction;

    /**
    * 安全产品（可能有多个）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecurityProduct")
    @Expose
    private SecurityProduct [] SecurityProduct;

    /**
    * 状态(waiting:待处理，processing:处理中，finished:已处理，ignored:已忽略)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 扫描时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScanTime")
    @Expose
    private String ScanTime;

    /**
    * 最后处置时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastProcessTime")
    @Expose
    private String LastProcessTime;

    /**
    * 分类分级合规组Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdentifyComplianceId")
    @Expose
    private Long IdentifyComplianceId;

    /**
    * 类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ItemSubType")
    @Expose
    private String ItemSubType;

    /**
    * 风险面
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskSide")
    @Expose
    private String RiskSide;

    /**
    * API安全风险链接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("APIRiskLinkURL")
    @Expose
    private String APIRiskLinkURL;

    /**
    * 备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 最新风险项id 
     * @return Id 最新风险项id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 最新风险项id
     * @param Id 最新风险项id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 数据源id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataSourceId 数据源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataSourceId() {
        return this.DataSourceId;
    }

    /**
     * Set 数据源id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataSourceId 数据源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataSourceId(String DataSourceId) {
        this.DataSourceId = DataSourceId;
    }

    /**
     * Get 数据源名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataSourceName 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataSourceName() {
        return this.DataSourceName;
    }

    /**
     * Set 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataSourceName 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataSourceName(String DataSourceName) {
        this.DataSourceName = DataSourceName;
    }

    /**
     * Get 数据源类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataSourceType 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataSourceType() {
        return this.DataSourceType;
    }

    /**
     * Set 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataSourceType 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataSourceType(String DataSourceType) {
        this.DataSourceType = DataSourceType;
    }

    /**
     * Get 资源地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceRegion 资源地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set 资源地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceRegion 资源地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get 资产名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetName 资产名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set 资产名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetName 资产名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get 风险类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskType 风险类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRiskType() {
        return this.RiskType;
    }

    /**
     * Set 风险类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskType 风险类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskType(String RiskType) {
        this.RiskType = RiskType;
    }

    /**
     * Get 风险项
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskName 风险项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRiskName() {
        return this.RiskName;
    }

    /**
     * Set 风险项
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskName 风险项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskName(String RiskName) {
        this.RiskName = RiskName;
    }

    /**
     * Get 风险级别
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskLevel 风险级别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 风险级别
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskLevel 风险级别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 风险描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskDescription 风险描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRiskDescription() {
        return this.RiskDescription;
    }

    /**
     * Set 风险描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskDescription 风险描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskDescription(String RiskDescription) {
        this.RiskDescription = RiskDescription;
    }

    /**
     * Get 建议措施
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuggestAction 建议措施
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSuggestAction() {
        return this.SuggestAction;
    }

    /**
     * Set 建议措施
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuggestAction 建议措施
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuggestAction(String SuggestAction) {
        this.SuggestAction = SuggestAction;
    }

    /**
     * Get 安全产品（可能有多个）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecurityProduct 安全产品（可能有多个）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SecurityProduct [] getSecurityProduct() {
        return this.SecurityProduct;
    }

    /**
     * Set 安全产品（可能有多个）
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecurityProduct 安全产品（可能有多个）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecurityProduct(SecurityProduct [] SecurityProduct) {
        this.SecurityProduct = SecurityProduct;
    }

    /**
     * Get 状态(waiting:待处理，processing:处理中，finished:已处理，ignored:已忽略)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态(waiting:待处理，processing:处理中，finished:已处理，ignored:已忽略)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态(waiting:待处理，processing:处理中，finished:已处理，ignored:已忽略)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态(waiting:待处理，processing:处理中，finished:已处理，ignored:已忽略)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 扫描时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScanTime 扫描时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScanTime() {
        return this.ScanTime;
    }

    /**
     * Set 扫描时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScanTime 扫描时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScanTime(String ScanTime) {
        this.ScanTime = ScanTime;
    }

    /**
     * Get 最后处置时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastProcessTime 最后处置时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastProcessTime() {
        return this.LastProcessTime;
    }

    /**
     * Set 最后处置时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastProcessTime 最后处置时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastProcessTime(String LastProcessTime) {
        this.LastProcessTime = LastProcessTime;
    }

    /**
     * Get 分类分级合规组Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdentifyComplianceId 分类分级合规组Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIdentifyComplianceId() {
        return this.IdentifyComplianceId;
    }

    /**
     * Set 分类分级合规组Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdentifyComplianceId 分类分级合规组Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdentifyComplianceId(Long IdentifyComplianceId) {
        this.IdentifyComplianceId = IdentifyComplianceId;
    }

    /**
     * Get 类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ItemSubType 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getItemSubType() {
        return this.ItemSubType;
    }

    /**
     * Set 类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ItemSubType 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItemSubType(String ItemSubType) {
        this.ItemSubType = ItemSubType;
    }

    /**
     * Get 风险面
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskSide 风险面
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRiskSide() {
        return this.RiskSide;
    }

    /**
     * Set 风险面
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskSide 风险面
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskSide(String RiskSide) {
        this.RiskSide = RiskSide;
    }

    /**
     * Get API安全风险链接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return APIRiskLinkURL API安全风险链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAPIRiskLinkURL() {
        return this.APIRiskLinkURL;
    }

    /**
     * Set API安全风险链接
注意：此字段可能返回 null，表示取不到有效值。
     * @param APIRiskLinkURL API安全风险链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAPIRiskLinkURL(String APIRiskLinkURL) {
        this.APIRiskLinkURL = APIRiskLinkURL;
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

    public RiskItemInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskItemInfo(RiskItemInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.DataSourceId != null) {
            this.DataSourceId = new String(source.DataSourceId);
        }
        if (source.DataSourceName != null) {
            this.DataSourceName = new String(source.DataSourceName);
        }
        if (source.DataSourceType != null) {
            this.DataSourceType = new String(source.DataSourceType);
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.RiskType != null) {
            this.RiskType = new String(source.RiskType);
        }
        if (source.RiskName != null) {
            this.RiskName = new String(source.RiskName);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.RiskDescription != null) {
            this.RiskDescription = new String(source.RiskDescription);
        }
        if (source.SuggestAction != null) {
            this.SuggestAction = new String(source.SuggestAction);
        }
        if (source.SecurityProduct != null) {
            this.SecurityProduct = new SecurityProduct[source.SecurityProduct.length];
            for (int i = 0; i < source.SecurityProduct.length; i++) {
                this.SecurityProduct[i] = new SecurityProduct(source.SecurityProduct[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ScanTime != null) {
            this.ScanTime = new String(source.ScanTime);
        }
        if (source.LastProcessTime != null) {
            this.LastProcessTime = new String(source.LastProcessTime);
        }
        if (source.IdentifyComplianceId != null) {
            this.IdentifyComplianceId = new Long(source.IdentifyComplianceId);
        }
        if (source.ItemSubType != null) {
            this.ItemSubType = new String(source.ItemSubType);
        }
        if (source.RiskSide != null) {
            this.RiskSide = new String(source.RiskSide);
        }
        if (source.APIRiskLinkURL != null) {
            this.APIRiskLinkURL = new String(source.APIRiskLinkURL);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "DataSourceId", this.DataSourceId);
        this.setParamSimple(map, prefix + "DataSourceName", this.DataSourceName);
        this.setParamSimple(map, prefix + "DataSourceType", this.DataSourceType);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "RiskType", this.RiskType);
        this.setParamSimple(map, prefix + "RiskName", this.RiskName);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "RiskDescription", this.RiskDescription);
        this.setParamSimple(map, prefix + "SuggestAction", this.SuggestAction);
        this.setParamArrayObj(map, prefix + "SecurityProduct.", this.SecurityProduct);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ScanTime", this.ScanTime);
        this.setParamSimple(map, prefix + "LastProcessTime", this.LastProcessTime);
        this.setParamSimple(map, prefix + "IdentifyComplianceId", this.IdentifyComplianceId);
        this.setParamSimple(map, prefix + "ItemSubType", this.ItemSubType);
        this.setParamSimple(map, prefix + "RiskSide", this.RiskSide);
        this.setParamSimple(map, prefix + "APIRiskLinkURL", this.APIRiskLinkURL);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

