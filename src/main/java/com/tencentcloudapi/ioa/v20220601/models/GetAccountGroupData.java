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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetAccountGroupData extends AbstractModel {

    /**
    * <p>分组名称全路径，点分格式</p>
    */
    @SerializedName("NamePath")
    @Expose
    private String NamePath;

    /**
    * <p>分组ID全路径，数组格式</p>
    */
    @SerializedName("IdPathArr")
    @Expose
    private Long [] IdPathArr;

    /**
    * <p>分组扩展信息</p>
    */
    @SerializedName("ExtraInfo")
    @Expose
    private String ExtraInfo;

    /**
    * <p>最后更新时间</p>
    */
    @SerializedName("Utime")
    @Expose
    private String Utime;

    /**
    * <p>当前分组的父分组ID</p>
    */
    @SerializedName("ParentId")
    @Expose
    private Long ParentId;

    /**
    * <p>源账号组ID，该字段仅适用于第三方同步的组织架构，通过OrgId-Id构成源组织架构分组ID-现组织架构分组ID映射关系</p>
    */
    @SerializedName("OrgId")
    @Expose
    private String OrgId;

    /**
    * <p>分组名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>分组ID</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>分组描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>分组导入源(只支持32位)</p>
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * <p>分组ID全路径，点分格式</p>
    */
    @SerializedName("IdPath")
    @Expose
    private String IdPath;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("Itime")
    @Expose
    private String Itime;

    /**
    * <p>父源账号组ID，该字段仅适用于第三方同步的组织架构</p>
    */
    @SerializedName("ParentOrgId")
    @Expose
    private String ParentOrgId;

    /**
    * <p>导入信息,json格式</p>
    */
    @SerializedName("Import")
    @Expose
    private String Import;

    /**
    * <p>是否开启导入架构</p>
    */
    @SerializedName("ImportEnable")
    @Expose
    private Boolean ImportEnable;

    /**
    * <p>导入类型</p>
    */
    @SerializedName("ImportType")
    @Expose
    private String ImportType;

    /**
    * <p>miniIAMId，MiniIAM源才有</p>
    */
    @SerializedName("MiniIamId")
    @Expose
    private String MiniIamId;

    /**
     * Get <p>分组名称全路径，点分格式</p> 
     * @return NamePath <p>分组名称全路径，点分格式</p>
     */
    public String getNamePath() {
        return this.NamePath;
    }

    /**
     * Set <p>分组名称全路径，点分格式</p>
     * @param NamePath <p>分组名称全路径，点分格式</p>
     */
    public void setNamePath(String NamePath) {
        this.NamePath = NamePath;
    }

    /**
     * Get <p>分组ID全路径，数组格式</p> 
     * @return IdPathArr <p>分组ID全路径，数组格式</p>
     */
    public Long [] getIdPathArr() {
        return this.IdPathArr;
    }

    /**
     * Set <p>分组ID全路径，数组格式</p>
     * @param IdPathArr <p>分组ID全路径，数组格式</p>
     */
    public void setIdPathArr(Long [] IdPathArr) {
        this.IdPathArr = IdPathArr;
    }

    /**
     * Get <p>分组扩展信息</p> 
     * @return ExtraInfo <p>分组扩展信息</p>
     */
    public String getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set <p>分组扩展信息</p>
     * @param ExtraInfo <p>分组扩展信息</p>
     */
    public void setExtraInfo(String ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
    }

    /**
     * Get <p>最后更新时间</p> 
     * @return Utime <p>最后更新时间</p>
     */
    public String getUtime() {
        return this.Utime;
    }

    /**
     * Set <p>最后更新时间</p>
     * @param Utime <p>最后更新时间</p>
     */
    public void setUtime(String Utime) {
        this.Utime = Utime;
    }

    /**
     * Get <p>当前分组的父分组ID</p> 
     * @return ParentId <p>当前分组的父分组ID</p>
     */
    public Long getParentId() {
        return this.ParentId;
    }

    /**
     * Set <p>当前分组的父分组ID</p>
     * @param ParentId <p>当前分组的父分组ID</p>
     */
    public void setParentId(Long ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get <p>源账号组ID，该字段仅适用于第三方同步的组织架构，通过OrgId-Id构成源组织架构分组ID-现组织架构分组ID映射关系</p> 
     * @return OrgId <p>源账号组ID，该字段仅适用于第三方同步的组织架构，通过OrgId-Id构成源组织架构分组ID-现组织架构分组ID映射关系</p>
     */
    public String getOrgId() {
        return this.OrgId;
    }

    /**
     * Set <p>源账号组ID，该字段仅适用于第三方同步的组织架构，通过OrgId-Id构成源组织架构分组ID-现组织架构分组ID映射关系</p>
     * @param OrgId <p>源账号组ID，该字段仅适用于第三方同步的组织架构，通过OrgId-Id构成源组织架构分组ID-现组织架构分组ID映射关系</p>
     */
    public void setOrgId(String OrgId) {
        this.OrgId = OrgId;
    }

    /**
     * Get <p>分组名称</p> 
     * @return Name <p>分组名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>分组名称</p>
     * @param Name <p>分组名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>分组ID</p> 
     * @return Id <p>分组ID</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>分组ID</p>
     * @param Id <p>分组ID</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>分组描述</p> 
     * @return Description <p>分组描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>分组描述</p>
     * @param Description <p>分组描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>分组导入源(只支持32位)</p> 
     * @return Source <p>分组导入源(只支持32位)</p>
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set <p>分组导入源(只支持32位)</p>
     * @param Source <p>分组导入源(只支持32位)</p>
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get <p>分组ID全路径，点分格式</p> 
     * @return IdPath <p>分组ID全路径，点分格式</p>
     */
    public String getIdPath() {
        return this.IdPath;
    }

    /**
     * Set <p>分组ID全路径，点分格式</p>
     * @param IdPath <p>分组ID全路径，点分格式</p>
     */
    public void setIdPath(String IdPath) {
        this.IdPath = IdPath;
    }

    /**
     * Get <p>创建时间</p> 
     * @return Itime <p>创建时间</p>
     */
    public String getItime() {
        return this.Itime;
    }

    /**
     * Set <p>创建时间</p>
     * @param Itime <p>创建时间</p>
     */
    public void setItime(String Itime) {
        this.Itime = Itime;
    }

    /**
     * Get <p>父源账号组ID，该字段仅适用于第三方同步的组织架构</p> 
     * @return ParentOrgId <p>父源账号组ID，该字段仅适用于第三方同步的组织架构</p>
     */
    public String getParentOrgId() {
        return this.ParentOrgId;
    }

    /**
     * Set <p>父源账号组ID，该字段仅适用于第三方同步的组织架构</p>
     * @param ParentOrgId <p>父源账号组ID，该字段仅适用于第三方同步的组织架构</p>
     */
    public void setParentOrgId(String ParentOrgId) {
        this.ParentOrgId = ParentOrgId;
    }

    /**
     * Get <p>导入信息,json格式</p> 
     * @return Import <p>导入信息,json格式</p>
     */
    public String getImport() {
        return this.Import;
    }

    /**
     * Set <p>导入信息,json格式</p>
     * @param Import <p>导入信息,json格式</p>
     */
    public void setImport(String Import) {
        this.Import = Import;
    }

    /**
     * Get <p>是否开启导入架构</p> 
     * @return ImportEnable <p>是否开启导入架构</p>
     */
    public Boolean getImportEnable() {
        return this.ImportEnable;
    }

    /**
     * Set <p>是否开启导入架构</p>
     * @param ImportEnable <p>是否开启导入架构</p>
     */
    public void setImportEnable(Boolean ImportEnable) {
        this.ImportEnable = ImportEnable;
    }

    /**
     * Get <p>导入类型</p> 
     * @return ImportType <p>导入类型</p>
     */
    public String getImportType() {
        return this.ImportType;
    }

    /**
     * Set <p>导入类型</p>
     * @param ImportType <p>导入类型</p>
     */
    public void setImportType(String ImportType) {
        this.ImportType = ImportType;
    }

    /**
     * Get <p>miniIAMId，MiniIAM源才有</p> 
     * @return MiniIamId <p>miniIAMId，MiniIAM源才有</p>
     */
    public String getMiniIamId() {
        return this.MiniIamId;
    }

    /**
     * Set <p>miniIAMId，MiniIAM源才有</p>
     * @param MiniIamId <p>miniIAMId，MiniIAM源才有</p>
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

