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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccountGroupsData extends AbstractModel {

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Itime")
    @Expose
    private String Itime;

    /**
    * 账户组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * id patch数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdPathArr")
    @Expose
    private Long [] IdPathArr;

    /**
    * 该分组下用户总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserTotal")
    @Expose
    private Long UserTotal;

    /**
    * 扩展信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtraInfo")
    @Expose
    private String ExtraInfo;

    /**
    * 导入类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImportType")
    @Expose
    private String ImportType;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 同步数据源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * miniIAM id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MiniIamId")
    @Expose
    private String MiniIamId;

    /**
    * 组织id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrgId")
    @Expose
    private String OrgId;

    /**
    * 是否该账户的直接权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReadOnly")
    @Expose
    private Boolean ReadOnly;

    /**
    * 父id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentId")
    @Expose
    private Long ParentId;

    /**
    * 名称path
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamePath")
    @Expose
    private String NamePath;

    /**
    * 父组织id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentOrgId")
    @Expose
    private String ParentOrgId;

    /**
    * id path
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdPath")
    @Expose
    private String IdPath;

    /**
    * 自增id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 是否叶子节点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsLeaf")
    @Expose
    private Boolean IsLeaf;

    /**
    * 最后更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Utime")
    @Expose
    private String Utime;

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Itime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getItime() {
        return this.Itime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Itime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItime(String Itime) {
        this.Itime = Itime;
    }

    /**
     * Get 账户组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 账户组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 账户组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 账户组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get id patch数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdPathArr id patch数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getIdPathArr() {
        return this.IdPathArr;
    }

    /**
     * Set id patch数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdPathArr id patch数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdPathArr(Long [] IdPathArr) {
        this.IdPathArr = IdPathArr;
    }

    /**
     * Get 该分组下用户总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserTotal 该分组下用户总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUserTotal() {
        return this.UserTotal;
    }

    /**
     * Set 该分组下用户总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserTotal 该分组下用户总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserTotal(Long UserTotal) {
        this.UserTotal = UserTotal;
    }

    /**
     * Get 扩展信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtraInfo 扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set 扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtraInfo 扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtraInfo(String ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
    }

    /**
     * Get 导入类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImportType 导入类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImportType() {
        return this.ImportType;
    }

    /**
     * Set 导入类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImportType 导入类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImportType(String ImportType) {
        this.ImportType = ImportType;
    }

    /**
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 同步数据源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Source 同步数据源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set 同步数据源
注意：此字段可能返回 null，表示取不到有效值。
     * @param Source 同步数据源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get miniIAM id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MiniIamId miniIAM id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMiniIamId() {
        return this.MiniIamId;
    }

    /**
     * Set miniIAM id
注意：此字段可能返回 null，表示取不到有效值。
     * @param MiniIamId miniIAM id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMiniIamId(String MiniIamId) {
        this.MiniIamId = MiniIamId;
    }

    /**
     * Get 组织id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrgId 组织id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrgId() {
        return this.OrgId;
    }

    /**
     * Set 组织id
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrgId 组织id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrgId(String OrgId) {
        this.OrgId = OrgId;
    }

    /**
     * Get 是否该账户的直接权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReadOnly 是否该账户的直接权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getReadOnly() {
        return this.ReadOnly;
    }

    /**
     * Set 是否该账户的直接权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReadOnly 是否该账户的直接权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReadOnly(Boolean ReadOnly) {
        this.ReadOnly = ReadOnly;
    }

    /**
     * Get 父id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentId 父id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getParentId() {
        return this.ParentId;
    }

    /**
     * Set 父id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentId 父id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentId(Long ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get 名称path
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NamePath 名称path
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamePath() {
        return this.NamePath;
    }

    /**
     * Set 名称path
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamePath 名称path
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamePath(String NamePath) {
        this.NamePath = NamePath;
    }

    /**
     * Get 父组织id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentOrgId 父组织id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParentOrgId() {
        return this.ParentOrgId;
    }

    /**
     * Set 父组织id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentOrgId 父组织id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentOrgId(String ParentOrgId) {
        this.ParentOrgId = ParentOrgId;
    }

    /**
     * Get id path
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdPath id path
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdPath() {
        return this.IdPath;
    }

    /**
     * Set id path
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdPath id path
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdPath(String IdPath) {
        this.IdPath = IdPath;
    }

    /**
     * Get 自增id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 自增id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 自增id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 自增id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 是否叶子节点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsLeaf 是否叶子节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsLeaf() {
        return this.IsLeaf;
    }

    /**
     * Set 是否叶子节点
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsLeaf 是否叶子节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsLeaf(Boolean IsLeaf) {
        this.IsLeaf = IsLeaf;
    }

    /**
     * Get 最后更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Utime 最后更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUtime() {
        return this.Utime;
    }

    /**
     * Set 最后更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Utime 最后更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUtime(String Utime) {
        this.Utime = Utime;
    }

    public DescribeAccountGroupsData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccountGroupsData(DescribeAccountGroupsData source) {
        if (source.Itime != null) {
            this.Itime = new String(source.Itime);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IdPathArr != null) {
            this.IdPathArr = new Long[source.IdPathArr.length];
            for (int i = 0; i < source.IdPathArr.length; i++) {
                this.IdPathArr[i] = new Long(source.IdPathArr[i]);
            }
        }
        if (source.UserTotal != null) {
            this.UserTotal = new Long(source.UserTotal);
        }
        if (source.ExtraInfo != null) {
            this.ExtraInfo = new String(source.ExtraInfo);
        }
        if (source.ImportType != null) {
            this.ImportType = new String(source.ImportType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.MiniIamId != null) {
            this.MiniIamId = new String(source.MiniIamId);
        }
        if (source.OrgId != null) {
            this.OrgId = new String(source.OrgId);
        }
        if (source.ReadOnly != null) {
            this.ReadOnly = new Boolean(source.ReadOnly);
        }
        if (source.ParentId != null) {
            this.ParentId = new Long(source.ParentId);
        }
        if (source.NamePath != null) {
            this.NamePath = new String(source.NamePath);
        }
        if (source.ParentOrgId != null) {
            this.ParentOrgId = new String(source.ParentOrgId);
        }
        if (source.IdPath != null) {
            this.IdPath = new String(source.IdPath);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.IsLeaf != null) {
            this.IsLeaf = new Boolean(source.IsLeaf);
        }
        if (source.Utime != null) {
            this.Utime = new String(source.Utime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Itime", this.Itime);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "IdPathArr.", this.IdPathArr);
        this.setParamSimple(map, prefix + "UserTotal", this.UserTotal);
        this.setParamSimple(map, prefix + "ExtraInfo", this.ExtraInfo);
        this.setParamSimple(map, prefix + "ImportType", this.ImportType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "MiniIamId", this.MiniIamId);
        this.setParamSimple(map, prefix + "OrgId", this.OrgId);
        this.setParamSimple(map, prefix + "ReadOnly", this.ReadOnly);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "NamePath", this.NamePath);
        this.setParamSimple(map, prefix + "ParentOrgId", this.ParentOrgId);
        this.setParamSimple(map, prefix + "IdPath", this.IdPath);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "IsLeaf", this.IsLeaf);
        this.setParamSimple(map, prefix + "Utime", this.Utime);

    }
}

