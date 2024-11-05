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
    * 账号分组名全路径，点分格式
    */
    @SerializedName("NamePath")
    @Expose
    private String NamePath;

    /**
    * 账号分组ID全路径，数组格式
    */
    @SerializedName("IdPathArr")
    @Expose
    private Long [] IdPathArr;

    /**
    * 扩展信息
    */
    @SerializedName("ExtraInfo")
    @Expose
    private String ExtraInfo;

    /**
    * 最后更新时间
    */
    @SerializedName("Utime")
    @Expose
    private String Utime;

    /**
    * 父分组ID
    */
    @SerializedName("ParentId")
    @Expose
    private Long ParentId;

    /**
    * 源账号组织ID。使用第三方导入用户源时，记录该分组在源组织架构下的分组ID
    */
    @SerializedName("OrgId")
    @Expose
    private String OrgId;

    /**
    * 分组名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 分组ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 分组描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 同步数据源
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * 账号分组ID全路径，点分格式
    */
    @SerializedName("IdPath")
    @Expose
    private String IdPath;

    /**
    * 创建时间
    */
    @SerializedName("Itime")
    @Expose
    private String Itime;

    /**
    * 父源账号组织ID。使用第三方导入用户源时，记录该分组在源组织架构下的分组ID
    */
    @SerializedName("ParentOrgId")
    @Expose
    private String ParentOrgId;

    /**
    * 导入类型
    */
    @SerializedName("ImportType")
    @Expose
    private String ImportType;

    /**
    * miniIAM id
    */
    @SerializedName("MiniIamId")
    @Expose
    private String MiniIamId;

    /**
    * 该分组下含子组的所有用户总数
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
    * 是否该账户的直接权限
    */
    @SerializedName("ReadOnly")
    @Expose
    private Boolean ReadOnly;

    /**
    * 最新一次同步任务的结果
    */
    @SerializedName("LatestSyncResult")
    @Expose
    private String LatestSyncResult;

    /**
    * 最新一次同步任务的结束时间
    */
    @SerializedName("LatestSyncTime")
    @Expose
    private String LatestSyncTime;

    /**
     * Get 账号分组名全路径，点分格式 
     * @return NamePath 账号分组名全路径，点分格式
     */
    public String getNamePath() {
        return this.NamePath;
    }

    /**
     * Set 账号分组名全路径，点分格式
     * @param NamePath 账号分组名全路径，点分格式
     */
    public void setNamePath(String NamePath) {
        this.NamePath = NamePath;
    }

    /**
     * Get 账号分组ID全路径，数组格式 
     * @return IdPathArr 账号分组ID全路径，数组格式
     */
    public Long [] getIdPathArr() {
        return this.IdPathArr;
    }

    /**
     * Set 账号分组ID全路径，数组格式
     * @param IdPathArr 账号分组ID全路径，数组格式
     */
    public void setIdPathArr(Long [] IdPathArr) {
        this.IdPathArr = IdPathArr;
    }

    /**
     * Get 扩展信息 
     * @return ExtraInfo 扩展信息
     */
    public String getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set 扩展信息
     * @param ExtraInfo 扩展信息
     */
    public void setExtraInfo(String ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
    }

    /**
     * Get 最后更新时间 
     * @return Utime 最后更新时间
     */
    public String getUtime() {
        return this.Utime;
    }

    /**
     * Set 最后更新时间
     * @param Utime 最后更新时间
     */
    public void setUtime(String Utime) {
        this.Utime = Utime;
    }

    /**
     * Get 父分组ID 
     * @return ParentId 父分组ID
     */
    public Long getParentId() {
        return this.ParentId;
    }

    /**
     * Set 父分组ID
     * @param ParentId 父分组ID
     */
    public void setParentId(Long ParentId) {
        this.ParentId = ParentId;
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
     * Get 分组名称 
     * @return Name 分组名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 分组名称
     * @param Name 分组名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 分组ID 
     * @return Id 分组ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 分组ID
     * @param Id 分组ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 分组描述 
     * @return Description 分组描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 分组描述
     * @param Description 分组描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 同步数据源 
     * @return Source 同步数据源
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set 同步数据源
     * @param Source 同步数据源
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get 账号分组ID全路径，点分格式 
     * @return IdPath 账号分组ID全路径，点分格式
     */
    public String getIdPath() {
        return this.IdPath;
    }

    /**
     * Set 账号分组ID全路径，点分格式
     * @param IdPath 账号分组ID全路径，点分格式
     */
    public void setIdPath(String IdPath) {
        this.IdPath = IdPath;
    }

    /**
     * Get 创建时间 
     * @return Itime 创建时间
     */
    public String getItime() {
        return this.Itime;
    }

    /**
     * Set 创建时间
     * @param Itime 创建时间
     */
    public void setItime(String Itime) {
        this.Itime = Itime;
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
     * Get 导入类型 
     * @return ImportType 导入类型
     */
    public String getImportType() {
        return this.ImportType;
    }

    /**
     * Set 导入类型
     * @param ImportType 导入类型
     */
    public void setImportType(String ImportType) {
        this.ImportType = ImportType;
    }

    /**
     * Get miniIAM id 
     * @return MiniIamId miniIAM id
     */
    public String getMiniIamId() {
        return this.MiniIamId;
    }

    /**
     * Set miniIAM id
     * @param MiniIamId miniIAM id
     */
    public void setMiniIamId(String MiniIamId) {
        this.MiniIamId = MiniIamId;
    }

    /**
     * Get 该分组下含子组的所有用户总数 
     * @return UserTotal 该分组下含子组的所有用户总数
     */
    public Long getUserTotal() {
        return this.UserTotal;
    }

    /**
     * Set 该分组下含子组的所有用户总数
     * @param UserTotal 该分组下含子组的所有用户总数
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
     * Get 是否该账户的直接权限 
     * @return ReadOnly 是否该账户的直接权限
     */
    public Boolean getReadOnly() {
        return this.ReadOnly;
    }

    /**
     * Set 是否该账户的直接权限
     * @param ReadOnly 是否该账户的直接权限
     */
    public void setReadOnly(Boolean ReadOnly) {
        this.ReadOnly = ReadOnly;
    }

    /**
     * Get 最新一次同步任务的结果 
     * @return LatestSyncResult 最新一次同步任务的结果
     */
    public String getLatestSyncResult() {
        return this.LatestSyncResult;
    }

    /**
     * Set 最新一次同步任务的结果
     * @param LatestSyncResult 最新一次同步任务的结果
     */
    public void setLatestSyncResult(String LatestSyncResult) {
        this.LatestSyncResult = LatestSyncResult;
    }

    /**
     * Get 最新一次同步任务的结束时间 
     * @return LatestSyncTime 最新一次同步任务的结束时间
     */
    public String getLatestSyncTime() {
        return this.LatestSyncTime;
    }

    /**
     * Set 最新一次同步任务的结束时间
     * @param LatestSyncTime 最新一次同步任务的结束时间
     */
    public void setLatestSyncTime(String LatestSyncTime) {
        this.LatestSyncTime = LatestSyncTime;
    }

    public DescribeAccountGroupsData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccountGroupsData(DescribeAccountGroupsData source) {
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
        if (source.ImportType != null) {
            this.ImportType = new String(source.ImportType);
        }
        if (source.MiniIamId != null) {
            this.MiniIamId = new String(source.MiniIamId);
        }
        if (source.UserTotal != null) {
            this.UserTotal = new Long(source.UserTotal);
        }
        if (source.IsLeaf != null) {
            this.IsLeaf = new Boolean(source.IsLeaf);
        }
        if (source.ReadOnly != null) {
            this.ReadOnly = new Boolean(source.ReadOnly);
        }
        if (source.LatestSyncResult != null) {
            this.LatestSyncResult = new String(source.LatestSyncResult);
        }
        if (source.LatestSyncTime != null) {
            this.LatestSyncTime = new String(source.LatestSyncTime);
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
        this.setParamSimple(map, prefix + "ImportType", this.ImportType);
        this.setParamSimple(map, prefix + "MiniIamId", this.MiniIamId);
        this.setParamSimple(map, prefix + "UserTotal", this.UserTotal);
        this.setParamSimple(map, prefix + "IsLeaf", this.IsLeaf);
        this.setParamSimple(map, prefix + "ReadOnly", this.ReadOnly);
        this.setParamSimple(map, prefix + "LatestSyncResult", this.LatestSyncResult);
        this.setParamSimple(map, prefix + "LatestSyncTime", this.LatestSyncTime);

    }
}

