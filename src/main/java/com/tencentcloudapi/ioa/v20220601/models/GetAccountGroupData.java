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

public class GetAccountGroupData extends AbstractModel {

    /**
    * 分组名称全路径，点分格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamePath")
    @Expose
    private String NamePath;

    /**
    * 分组ID全路径，数组格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdPathArr")
    @Expose
    private Long [] IdPathArr;

    /**
    * 分组扩展信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtraInfo")
    @Expose
    private String ExtraInfo;

    /**
    * 最后更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Utime")
    @Expose
    private String Utime;

    /**
    * 当前分组的父分组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentId")
    @Expose
    private Long ParentId;

    /**
    * 源账号组ID，该字段仅适用于第三方同步的组织架构，通过OrgId-Id构成源组织架构分组ID-现组织架构分组ID映射关系
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrgId")
    @Expose
    private String OrgId;

    /**
    * 分组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 分组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 分组描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 分组导入源(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * 分组ID全路径，点分格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdPath")
    @Expose
    private String IdPath;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Itime")
    @Expose
    private String Itime;

    /**
    * 父源账号组ID，该字段仅适用于第三方同步的组织架构
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentOrgId")
    @Expose
    private String ParentOrgId;

    /**
    * 导入信息,json格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Import")
    @Expose
    private String Import;

    /**
    * 是否开启导入架构
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImportEnable")
    @Expose
    private Boolean ImportEnable;

    /**
    * 导入类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImportType")
    @Expose
    private String ImportType;

    /**
    * miniIAMId，MiniIAM源才有
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MiniIamId")
    @Expose
    private String MiniIamId;

    /**
     * Get 分组名称全路径，点分格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NamePath 分组名称全路径，点分格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamePath() {
        return this.NamePath;
    }

    /**
     * Set 分组名称全路径，点分格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamePath 分组名称全路径，点分格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamePath(String NamePath) {
        this.NamePath = NamePath;
    }

    /**
     * Get 分组ID全路径，数组格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdPathArr 分组ID全路径，数组格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getIdPathArr() {
        return this.IdPathArr;
    }

    /**
     * Set 分组ID全路径，数组格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdPathArr 分组ID全路径，数组格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdPathArr(Long [] IdPathArr) {
        this.IdPathArr = IdPathArr;
    }

    /**
     * Get 分组扩展信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtraInfo 分组扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set 分组扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtraInfo 分组扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtraInfo(String ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
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

    /**
     * Get 当前分组的父分组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentId 当前分组的父分组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getParentId() {
        return this.ParentId;
    }

    /**
     * Set 当前分组的父分组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentId 当前分组的父分组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentId(Long ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get 源账号组ID，该字段仅适用于第三方同步的组织架构，通过OrgId-Id构成源组织架构分组ID-现组织架构分组ID映射关系
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrgId 源账号组ID，该字段仅适用于第三方同步的组织架构，通过OrgId-Id构成源组织架构分组ID-现组织架构分组ID映射关系
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrgId() {
        return this.OrgId;
    }

    /**
     * Set 源账号组ID，该字段仅适用于第三方同步的组织架构，通过OrgId-Id构成源组织架构分组ID-现组织架构分组ID映射关系
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrgId 源账号组ID，该字段仅适用于第三方同步的组织架构，通过OrgId-Id构成源组织架构分组ID-现组织架构分组ID映射关系
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrgId(String OrgId) {
        this.OrgId = OrgId;
    }

    /**
     * Get 分组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 分组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 分组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 分组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 分组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 分组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 分组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 分组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 分组描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 分组描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 分组描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 分组描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 分组导入源(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Source 分组导入源(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set 分组导入源(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Source 分组导入源(只支持32位)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get 分组ID全路径，点分格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdPath 分组ID全路径，点分格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdPath() {
        return this.IdPath;
    }

    /**
     * Set 分组ID全路径，点分格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdPath 分组ID全路径，点分格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdPath(String IdPath) {
        this.IdPath = IdPath;
    }

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
     * Get 父源账号组ID，该字段仅适用于第三方同步的组织架构
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentOrgId 父源账号组ID，该字段仅适用于第三方同步的组织架构
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParentOrgId() {
        return this.ParentOrgId;
    }

    /**
     * Set 父源账号组ID，该字段仅适用于第三方同步的组织架构
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentOrgId 父源账号组ID，该字段仅适用于第三方同步的组织架构
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentOrgId(String ParentOrgId) {
        this.ParentOrgId = ParentOrgId;
    }

    /**
     * Get 导入信息,json格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Import 导入信息,json格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImport() {
        return this.Import;
    }

    /**
     * Set 导入信息,json格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param Import 导入信息,json格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImport(String Import) {
        this.Import = Import;
    }

    /**
     * Get 是否开启导入架构
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImportEnable 是否开启导入架构
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getImportEnable() {
        return this.ImportEnable;
    }

    /**
     * Set 是否开启导入架构
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImportEnable 是否开启导入架构
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImportEnable(Boolean ImportEnable) {
        this.ImportEnable = ImportEnable;
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
     * Get miniIAMId，MiniIAM源才有
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MiniIamId miniIAMId，MiniIAM源才有
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMiniIamId() {
        return this.MiniIamId;
    }

    /**
     * Set miniIAMId，MiniIAM源才有
注意：此字段可能返回 null，表示取不到有效值。
     * @param MiniIamId miniIAMId，MiniIAM源才有
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMiniIamId(String MiniIamId) {
        this.MiniIamId = MiniIamId;
    }

    public GetAccountGroupData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetAccountGroupData(GetAccountGroupData source) {
        if (source.NamePath != null) {
            this.NamePath = new String(source.NamePath);
        }
        if (source.IdPathArr != null) {
            this.IdPathArr = new Long[source.IdPathArr.length];
            for (int i = 0; i < source.IdPathArr.length; i++) {
                this.IdPathArr[i] = new Long(source.IdPathArr[i]);
            }
        }
        if (source.ExtraInfo != null) {
            this.ExtraInfo = new String(source.ExtraInfo);
        }
        if (source.Utime != null) {
            this.Utime = new String(source.Utime);
        }
        if (source.ParentId != null) {
            this.ParentId = new Long(source.ParentId);
        }
        if (source.OrgId != null) {
            this.OrgId = new String(source.OrgId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.IdPath != null) {
            this.IdPath = new String(source.IdPath);
        }
        if (source.Itime != null) {
            this.Itime = new String(source.Itime);
        }
        if (source.ParentOrgId != null) {
            this.ParentOrgId = new String(source.ParentOrgId);
        }
        if (source.Import != null) {
            this.Import = new String(source.Import);
        }
        if (source.ImportEnable != null) {
            this.ImportEnable = new Boolean(source.ImportEnable);
        }
        if (source.ImportType != null) {
            this.ImportType = new String(source.ImportType);
        }
        if (source.MiniIamId != null) {
            this.MiniIamId = new String(source.MiniIamId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NamePath", this.NamePath);
        this.setParamArraySimple(map, prefix + "IdPathArr.", this.IdPathArr);
        this.setParamSimple(map, prefix + "ExtraInfo", this.ExtraInfo);
        this.setParamSimple(map, prefix + "Utime", this.Utime);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "OrgId", this.OrgId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "IdPath", this.IdPath);
        this.setParamSimple(map, prefix + "Itime", this.Itime);
        this.setParamSimple(map, prefix + "ParentOrgId", this.ParentOrgId);
        this.setParamSimple(map, prefix + "Import", this.Import);
        this.setParamSimple(map, prefix + "ImportEnable", this.ImportEnable);
        this.setParamSimple(map, prefix + "ImportType", this.ImportType);
        this.setParamSimple(map, prefix + "MiniIamId", this.MiniIamId);

    }
}

