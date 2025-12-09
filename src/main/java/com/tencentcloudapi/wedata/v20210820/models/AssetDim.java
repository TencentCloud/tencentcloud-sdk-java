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

public class AssetDim extends AbstractModel {

    /**
    * 文件夹 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FolderId")
    @Expose
    private Long FolderId;

    /**
    * 维度编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DimCode")
    @Expose
    private String DimCode;

    /**
    * 维度名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DimName")
    @Expose
    private String DimName;

    /**
    * 维度描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 维度负责人UserId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerAccount")
    @Expose
    private Long OwnerAccount;

    /**
    * 维度负责人名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * 变更人ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyUserId")
    @Expose
    private Long ModifyUserId;

    /**
    * 维度最近修改人名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyUser")
    @Expose
    private String ModifyUser;

    /**
    * 修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 维度录入方式， 取值：manual-手动录入；dict-关联字典表；
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DimType")
    @Expose
    private String DimType;

    /**
    * 枚举值数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValuePairCount")
    @Expose
    private Long ValuePairCount;

    /**
    * 关联指标数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndicatorPairCount")
    @Expose
    private Long IndicatorPairCount;

    /**
    * 关联字段数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableColumnCount")
    @Expose
    private Long TableColumnCount;

    /**
    * 维度 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DimId")
    @Expose
    private Long DimId;

    /**
    * 维度关联表字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DimTableLink")
    @Expose
    private DimTableLink DimTableLink;

    /**
    * 枚举值列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValuePairs")
    @Expose
    private Pair [] ValuePairs;

    /**
    * 维度关联字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableColumns")
    @Expose
    private AssetDimTableColumn [] TableColumns;

    /**
    * 关联指标列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceIndicatorIds")
    @Expose
    private IndicatorBaseSimpleInfo [] SourceIndicatorIds;

    /**
    * 权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DimPermission")
    @Expose
    private PermissionStatus DimPermission;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 项目名称
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
     * Get 文件夹 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FolderId 文件夹 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFolderId() {
        return this.FolderId;
    }

    /**
     * Set 文件夹 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param FolderId 文件夹 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFolderId(Long FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get 维度编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DimCode 维度编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDimCode() {
        return this.DimCode;
    }

    /**
     * Set 维度编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param DimCode 维度编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDimCode(String DimCode) {
        this.DimCode = DimCode;
    }

    /**
     * Get 维度名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DimName 维度名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDimName() {
        return this.DimName;
    }

    /**
     * Set 维度名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DimName 维度名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDimName(String DimName) {
        this.DimName = DimName;
    }

    /**
     * Get 维度描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 维度描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 维度描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 维度描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 维度负责人UserId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerAccount 维度负责人UserId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOwnerAccount() {
        return this.OwnerAccount;
    }

    /**
     * Set 维度负责人UserId
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerAccount 维度负责人UserId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerAccount(Long OwnerAccount) {
        this.OwnerAccount = OwnerAccount;
    }

    /**
     * Get 维度负责人名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Owner 维度负责人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set 维度负责人名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Owner 维度负责人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 变更人ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyUserId 变更人ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getModifyUserId() {
        return this.ModifyUserId;
    }

    /**
     * Set 变更人ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyUserId 变更人ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyUserId(Long ModifyUserId) {
        this.ModifyUserId = ModifyUserId;
    }

    /**
     * Get 维度最近修改人名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyUser 维度最近修改人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyUser() {
        return this.ModifyUser;
    }

    /**
     * Set 维度最近修改人名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyUser 维度最近修改人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyUser(String ModifyUser) {
        this.ModifyUser = ModifyUser;
    }

    /**
     * Get 修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
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
     * Get 维度录入方式， 取值：manual-手动录入；dict-关联字典表；
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DimType 维度录入方式， 取值：manual-手动录入；dict-关联字典表；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDimType() {
        return this.DimType;
    }

    /**
     * Set 维度录入方式， 取值：manual-手动录入；dict-关联字典表；
注意：此字段可能返回 null，表示取不到有效值。
     * @param DimType 维度录入方式， 取值：manual-手动录入；dict-关联字典表；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDimType(String DimType) {
        this.DimType = DimType;
    }

    /**
     * Get 枚举值数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValuePairCount 枚举值数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getValuePairCount() {
        return this.ValuePairCount;
    }

    /**
     * Set 枚举值数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValuePairCount 枚举值数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValuePairCount(Long ValuePairCount) {
        this.ValuePairCount = ValuePairCount;
    }

    /**
     * Get 关联指标数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndicatorPairCount 关联指标数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIndicatorPairCount() {
        return this.IndicatorPairCount;
    }

    /**
     * Set 关联指标数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndicatorPairCount 关联指标数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndicatorPairCount(Long IndicatorPairCount) {
        this.IndicatorPairCount = IndicatorPairCount;
    }

    /**
     * Get 关联字段数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableColumnCount 关联字段数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTableColumnCount() {
        return this.TableColumnCount;
    }

    /**
     * Set 关联字段数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableColumnCount 关联字段数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableColumnCount(Long TableColumnCount) {
        this.TableColumnCount = TableColumnCount;
    }

    /**
     * Get 维度 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DimId 维度 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDimId() {
        return this.DimId;
    }

    /**
     * Set 维度 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DimId 维度 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDimId(Long DimId) {
        this.DimId = DimId;
    }

    /**
     * Get 维度关联表字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DimTableLink 维度关联表字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DimTableLink getDimTableLink() {
        return this.DimTableLink;
    }

    /**
     * Set 维度关联表字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param DimTableLink 维度关联表字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDimTableLink(DimTableLink DimTableLink) {
        this.DimTableLink = DimTableLink;
    }

    /**
     * Get 枚举值列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValuePairs 枚举值列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Pair [] getValuePairs() {
        return this.ValuePairs;
    }

    /**
     * Set 枚举值列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValuePairs 枚举值列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValuePairs(Pair [] ValuePairs) {
        this.ValuePairs = ValuePairs;
    }

    /**
     * Get 维度关联字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableColumns 维度关联字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AssetDimTableColumn [] getTableColumns() {
        return this.TableColumns;
    }

    /**
     * Set 维度关联字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableColumns 维度关联字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableColumns(AssetDimTableColumn [] TableColumns) {
        this.TableColumns = TableColumns;
    }

    /**
     * Get 关联指标列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceIndicatorIds 关联指标列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IndicatorBaseSimpleInfo [] getSourceIndicatorIds() {
        return this.SourceIndicatorIds;
    }

    /**
     * Set 关联指标列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceIndicatorIds 关联指标列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceIndicatorIds(IndicatorBaseSimpleInfo [] SourceIndicatorIds) {
        this.SourceIndicatorIds = SourceIndicatorIds;
    }

    /**
     * Get 权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DimPermission 权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PermissionStatus getDimPermission() {
        return this.DimPermission;
    }

    /**
     * Set 权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param DimPermission 权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDimPermission(PermissionStatus DimPermission) {
        this.DimPermission = DimPermission;
    }

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 项目名称 
     * @return ProjectName 项目名称
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名称
     * @param ProjectName 项目名称
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    public AssetDim() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetDim(AssetDim source) {
        if (source.FolderId != null) {
            this.FolderId = new Long(source.FolderId);
        }
        if (source.DimCode != null) {
            this.DimCode = new String(source.DimCode);
        }
        if (source.DimName != null) {
            this.DimName = new String(source.DimName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.OwnerAccount != null) {
            this.OwnerAccount = new Long(source.OwnerAccount);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.ModifyUserId != null) {
            this.ModifyUserId = new Long(source.ModifyUserId);
        }
        if (source.ModifyUser != null) {
            this.ModifyUser = new String(source.ModifyUser);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DimType != null) {
            this.DimType = new String(source.DimType);
        }
        if (source.ValuePairCount != null) {
            this.ValuePairCount = new Long(source.ValuePairCount);
        }
        if (source.IndicatorPairCount != null) {
            this.IndicatorPairCount = new Long(source.IndicatorPairCount);
        }
        if (source.TableColumnCount != null) {
            this.TableColumnCount = new Long(source.TableColumnCount);
        }
        if (source.DimId != null) {
            this.DimId = new Long(source.DimId);
        }
        if (source.DimTableLink != null) {
            this.DimTableLink = new DimTableLink(source.DimTableLink);
        }
        if (source.ValuePairs != null) {
            this.ValuePairs = new Pair[source.ValuePairs.length];
            for (int i = 0; i < source.ValuePairs.length; i++) {
                this.ValuePairs[i] = new Pair(source.ValuePairs[i]);
            }
        }
        if (source.TableColumns != null) {
            this.TableColumns = new AssetDimTableColumn[source.TableColumns.length];
            for (int i = 0; i < source.TableColumns.length; i++) {
                this.TableColumns[i] = new AssetDimTableColumn(source.TableColumns[i]);
            }
        }
        if (source.SourceIndicatorIds != null) {
            this.SourceIndicatorIds = new IndicatorBaseSimpleInfo[source.SourceIndicatorIds.length];
            for (int i = 0; i < source.SourceIndicatorIds.length; i++) {
                this.SourceIndicatorIds[i] = new IndicatorBaseSimpleInfo(source.SourceIndicatorIds[i]);
            }
        }
        if (source.DimPermission != null) {
            this.DimPermission = new PermissionStatus(source.DimPermission);
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
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "DimCode", this.DimCode);
        this.setParamSimple(map, prefix + "DimName", this.DimName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "OwnerAccount", this.OwnerAccount);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "ModifyUserId", this.ModifyUserId);
        this.setParamSimple(map, prefix + "ModifyUser", this.ModifyUser);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DimType", this.DimType);
        this.setParamSimple(map, prefix + "ValuePairCount", this.ValuePairCount);
        this.setParamSimple(map, prefix + "IndicatorPairCount", this.IndicatorPairCount);
        this.setParamSimple(map, prefix + "TableColumnCount", this.TableColumnCount);
        this.setParamSimple(map, prefix + "DimId", this.DimId);
        this.setParamObj(map, prefix + "DimTableLink.", this.DimTableLink);
        this.setParamArrayObj(map, prefix + "ValuePairs.", this.ValuePairs);
        this.setParamArrayObj(map, prefix + "TableColumns.", this.TableColumns);
        this.setParamArrayObj(map, prefix + "SourceIndicatorIds.", this.SourceIndicatorIds);
        this.setParamObj(map, prefix + "DimPermission.", this.DimPermission);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);

    }
}

