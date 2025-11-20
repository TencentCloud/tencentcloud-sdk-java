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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccountGroup extends AbstractModel {

    /**
    * 账号组id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 账号组名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 账号组id路径
    */
    @SerializedName("IdPath")
    @Expose
    private String IdPath;

    /**
    * 账号组名称路径
    */
    @SerializedName("NamePath")
    @Expose
    private String NamePath;

    /**
    * 父账号组id
    */
    @SerializedName("ParentId")
    @Expose
    private Long ParentId;

    /**
    * 账号组来源
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * 账号组下用户总数
    */
    @SerializedName("UserTotal")
    @Expose
    private Long UserTotal;

    /**
    * 是否叶子节点
    */
    @SerializedName("IsLeaf")
    @Expose
    private Boolean IsLeaf;

    /**
    * 账号组导入类型
    */
    @SerializedName("ImportType")
    @Expose
    private String ImportType;

    /**
    * 账号组描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 父源账号组织ID。使用第三方导入用户源时，记录该分组在源组织架构下的分组ID
    */
    @SerializedName("ParentOrgId")
    @Expose
    private String ParentOrgId;

    /**
    * 源账号组织ID。使用第三方导入用户源时，记录该分组在源组织架构下的分组ID
    */
    @SerializedName("OrgId")
    @Expose
    private String OrgId;

    /**
    * 账号组是否已经接入，0表示未接入，1表示接入
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 账号组id 
     * @return Id 账号组id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 账号组id
     * @param Id 账号组id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 账号组名称 
     * @return Name 账号组名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 账号组名称
     * @param Name 账号组名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 账号组id路径 
     * @return IdPath 账号组id路径
     */
    public String getIdPath() {
        return this.IdPath;
    }

    /**
     * Set 账号组id路径
     * @param IdPath 账号组id路径
     */
    public void setIdPath(String IdPath) {
        this.IdPath = IdPath;
    }

    /**
     * Get 账号组名称路径 
     * @return NamePath 账号组名称路径
     */
    public String getNamePath() {
        return this.NamePath;
    }

    /**
     * Set 账号组名称路径
     * @param NamePath 账号组名称路径
     */
    public void setNamePath(String NamePath) {
        this.NamePath = NamePath;
    }

    /**
     * Get 父账号组id 
     * @return ParentId 父账号组id
     */
    public Long getParentId() {
        return this.ParentId;
    }

    /**
     * Set 父账号组id
     * @param ParentId 父账号组id
     */
    public void setParentId(Long ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get 账号组来源 
     * @return Source 账号组来源
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set 账号组来源
     * @param Source 账号组来源
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get 账号组下用户总数 
     * @return UserTotal 账号组下用户总数
     */
    public Long getUserTotal() {
        return this.UserTotal;
    }

    /**
     * Set 账号组下用户总数
     * @param UserTotal 账号组下用户总数
     */
    public void setUserTotal(Long UserTotal) {
        this.UserTotal = UserTotal;
    }

    /**
     * Get 是否叶子节点 
     * @return IsLeaf 是否叶子节点
     */
    public Boolean getIsLeaf() {
        return this.IsLeaf;
    }

    /**
     * Set 是否叶子节点
     * @param IsLeaf 是否叶子节点
     */
    public void setIsLeaf(Boolean IsLeaf) {
        this.IsLeaf = IsLeaf;
    }

    /**
     * Get 账号组导入类型 
     * @return ImportType 账号组导入类型
     */
    public String getImportType() {
        return this.ImportType;
    }

    /**
     * Set 账号组导入类型
     * @param ImportType 账号组导入类型
     */
    public void setImportType(String ImportType) {
        this.ImportType = ImportType;
    }

    /**
     * Get 账号组描述 
     * @return Description 账号组描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 账号组描述
     * @param Description 账号组描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 父源账号组织ID。使用第三方导入用户源时，记录该分组在源组织架构下的分组ID 
     * @return ParentOrgId 父源账号组织ID。使用第三方导入用户源时，记录该分组在源组织架构下的分组ID
     */
    public String getParentOrgId() {
        return this.ParentOrgId;
    }

    /**
     * Set 父源账号组织ID。使用第三方导入用户源时，记录该分组在源组织架构下的分组ID
     * @param ParentOrgId 父源账号组织ID。使用第三方导入用户源时，记录该分组在源组织架构下的分组ID
     */
    public void setParentOrgId(String ParentOrgId) {
        this.ParentOrgId = ParentOrgId;
    }

    /**
     * Get 源账号组织ID。使用第三方导入用户源时，记录该分组在源组织架构下的分组ID 
     * @return OrgId 源账号组织ID。使用第三方导入用户源时，记录该分组在源组织架构下的分组ID
     */
    public String getOrgId() {
        return this.OrgId;
    }

    /**
     * Set 源账号组织ID。使用第三方导入用户源时，记录该分组在源组织架构下的分组ID
     * @param OrgId 源账号组织ID。使用第三方导入用户源时，记录该分组在源组织架构下的分组ID
     */
    public void setOrgId(String OrgId) {
        this.OrgId = OrgId;
    }

    /**
     * Get 账号组是否已经接入，0表示未接入，1表示接入 
     * @return Status 账号组是否已经接入，0表示未接入，1表示接入
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 账号组是否已经接入，0表示未接入，1表示接入
     * @param Status 账号组是否已经接入，0表示未接入，1表示接入
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public AccountGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccountGroup(AccountGroup source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IdPath != null) {
            this.IdPath = new String(source.IdPath);
        }
        if (source.NamePath != null) {
            this.NamePath = new String(source.NamePath);
        }
        if (source.ParentId != null) {
            this.ParentId = new Long(source.ParentId);
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.UserTotal != null) {
            this.UserTotal = new Long(source.UserTotal);
        }
        if (source.IsLeaf != null) {
            this.IsLeaf = new Boolean(source.IsLeaf);
        }
        if (source.ImportType != null) {
            this.ImportType = new String(source.ImportType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ParentOrgId != null) {
            this.ParentOrgId = new String(source.ParentOrgId);
        }
        if (source.OrgId != null) {
            this.OrgId = new String(source.OrgId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IdPath", this.IdPath);
        this.setParamSimple(map, prefix + "NamePath", this.NamePath);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "UserTotal", this.UserTotal);
        this.setParamSimple(map, prefix + "IsLeaf", this.IsLeaf);
        this.setParamSimple(map, prefix + "ImportType", this.ImportType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ParentOrgId", this.ParentOrgId);
        this.setParamSimple(map, prefix + "OrgId", this.OrgId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

