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

public class DescribeAccountGroupsData extends AbstractModel {

    /**
    * <p>账号分组名全路径，点分格式</p>
    */
    @SerializedName("NamePath")
    @Expose
    private String NamePath;

    /**
    * <p>账号分组ID全路径，数组格式</p>
    */
    @SerializedName("IdPathArr")
    @Expose
    private Long [] IdPathArr;

    /**
    * <p>扩展信息</p>
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
    * <p>父分组ID</p>
    */
    @SerializedName("ParentId")
    @Expose
    private Long ParentId;

    /**
    * <p>源账号组织ID。使用第三方导入用户源时，记录该分组在源组织架构下的分组ID</p>
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
    * <p>同步数据源</p>
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * <p>账号分组ID全路径，点分格式</p>
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
    * <p>父源账号组织ID。使用第三方导入用户源时，记录该分组在源组织架构下的分组ID</p>
    */
    @SerializedName("ParentOrgId")
    @Expose
    private String ParentOrgId;

    /**
    * <p>导入类型</p>
    */
    @SerializedName("ImportType")
    @Expose
    private String ImportType;

    /**
    * <p>miniIAM id</p>
    */
    @SerializedName("MiniIamId")
    @Expose
    private String MiniIamId;

    /**
    * <p>该分组下含子组的所有用户总数</p>
    */
    @SerializedName("UserTotal")
    @Expose
    private Long UserTotal;

    /**
    * <p>是否叶子节点</p>
    */
    @SerializedName("IsLeaf")
    @Expose
    private Boolean IsLeaf;

    /**
    * <p>是否该账户的直接权限</p>
    */
    @SerializedName("ReadOnly")
    @Expose
    private Boolean ReadOnly;

    /**
    * <p>最新一次同步任务的结果</p>
    */
    @SerializedName("LatestSyncResult")
    @Expose
    private String LatestSyncResult;

    /**
    * <p>最新一次同步任务的结束时间</p>
    */
    @SerializedName("LatestSyncTime")
    @Expose
    private String LatestSyncTime;

    /**
    * <p>分组名称数组</p>
    */
    @SerializedName("NamePathArr")
    @Expose
    private String [] NamePathArr;

    /**
     * Get <p>账号分组名全路径，点分格式</p> 
     * @return NamePath <p>账号分组名全路径，点分格式</p>
     */
    public String getNamePath() {
        return this.NamePath;
    }

    /**
     * Set <p>账号分组名全路径，点分格式</p>
     * @param NamePath <p>账号分组名全路径，点分格式</p>
     */
    public void setNamePath(String NamePath) {
        this.NamePath = NamePath;
    }

    /**
     * Get <p>账号分组ID全路径，数组格式</p> 
     * @return IdPathArr <p>账号分组ID全路径，数组格式</p>
     */
    public Long [] getIdPathArr() {
        return this.IdPathArr;
    }

    /**
     * Set <p>账号分组ID全路径，数组格式</p>
     * @param IdPathArr <p>账号分组ID全路径，数组格式</p>
     */
    public void setIdPathArr(Long [] IdPathArr) {
        this.IdPathArr = IdPathArr;
    }

    /**
     * Get <p>扩展信息</p> 
     * @return ExtraInfo <p>扩展信息</p>
     */
    public String getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set <p>扩展信息</p>
     * @param ExtraInfo <p>扩展信息</p>
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
     * Get <p>父分组ID</p> 
     * @return ParentId <p>父分组ID</p>
     */
    public Long getParentId() {
        return this.ParentId;
    }

    /**
     * Set <p>父分组ID</p>
     * @param ParentId <p>父分组ID</p>
     */
    public void setParentId(Long ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get <p>源账号组织ID。使用第三方导入用户源时，记录该分组在源组织架构下的分组ID</p> 
     * @return OrgId <p>源账号组织ID。使用第三方导入用户源时，记录该分组在源组织架构下的分组ID</p>
     */
    public String getOrgId() {
        return this.OrgId;
    }

    /**
     * Set <p>源账号组织ID。使用第三方导入用户源时，记录该分组在源组织架构下的分组ID</p>
     * @param OrgId <p>源账号组织ID。使用第三方导入用户源时，记录该分组在源组织架构下的分组ID</p>
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
     * Get <p>同步数据源</p> 
     * @return Source <p>同步数据源</p>
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set <p>同步数据源</p>
     * @param Source <p>同步数据源</p>
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get <p>账号分组ID全路径，点分格式</p> 
     * @return IdPath <p>账号分组ID全路径，点分格式</p>
     */
    public String getIdPath() {
        return this.IdPath;
    }

    /**
     * Set <p>账号分组ID全路径，点分格式</p>
     * @param IdPath <p>账号分组ID全路径，点分格式</p>
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
     * Get <p>父源账号组织ID。使用第三方导入用户源时，记录该分组在源组织架构下的分组ID</p> 
     * @return ParentOrgId <p>父源账号组织ID。使用第三方导入用户源时，记录该分组在源组织架构下的分组ID</p>
     */
    public String getParentOrgId() {
        return this.ParentOrgId;
    }

    /**
     * Set <p>父源账号组织ID。使用第三方导入用户源时，记录该分组在源组织架构下的分组ID</p>
     * @param ParentOrgId <p>父源账号组织ID。使用第三方导入用户源时，记录该分组在源组织架构下的分组ID</p>
     */
    public void setParentOrgId(String ParentOrgId) {
        this.ParentOrgId = ParentOrgId;
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
     * Get <p>miniIAM id</p> 
     * @return MiniIamId <p>miniIAM id</p>
     */
    public String getMiniIamId() {
        return this.MiniIamId;
    }

    /**
     * Set <p>miniIAM id</p>
     * @param MiniIamId <p>miniIAM id</p>
     */
    public void setMiniIamId(String MiniIamId) {
        this.MiniIamId = MiniIamId;
    }

    /**
     * Get <p>该分组下含子组的所有用户总数</p> 
     * @return UserTotal <p>该分组下含子组的所有用户总数</p>
     */
    public Long getUserTotal() {
        return this.UserTotal;
    }

    /**
     * Set <p>该分组下含子组的所有用户总数</p>
     * @param UserTotal <p>该分组下含子组的所有用户总数</p>
     */
    public void setUserTotal(Long UserTotal) {
        this.UserTotal = UserTotal;
    }

    /**
     * Get <p>是否叶子节点</p> 
     * @return IsLeaf <p>是否叶子节点</p>
     */
    public Boolean getIsLeaf() {
        return this.IsLeaf;
    }

    /**
     * Set <p>是否叶子节点</p>
     * @param IsLeaf <p>是否叶子节点</p>
     */
    public void setIsLeaf(Boolean IsLeaf) {
        this.IsLeaf = IsLeaf;
    }

    /**
     * Get <p>是否该账户的直接权限</p> 
     * @return ReadOnly <p>是否该账户的直接权限</p>
     */
    public Boolean getReadOnly() {
        return this.ReadOnly;
    }

    /**
     * Set <p>是否该账户的直接权限</p>
     * @param ReadOnly <p>是否该账户的直接权限</p>
     */
    public void setReadOnly(Boolean ReadOnly) {
        this.ReadOnly = ReadOnly;
    }

    /**
     * Get <p>最新一次同步任务的结果</p> 
     * @return LatestSyncResult <p>最新一次同步任务的结果</p>
     */
    public String getLatestSyncResult() {
        return this.LatestSyncResult;
    }

    /**
     * Set <p>最新一次同步任务的结果</p>
     * @param LatestSyncResult <p>最新一次同步任务的结果</p>
     */
    public void setLatestSyncResult(String LatestSyncResult) {
        this.LatestSyncResult = LatestSyncResult;
    }

    /**
     * Get <p>最新一次同步任务的结束时间</p> 
     * @return LatestSyncTime <p>最新一次同步任务的结束时间</p>
     */
    public String getLatestSyncTime() {
        return this.LatestSyncTime;
    }

    /**
     * Set <p>最新一次同步任务的结束时间</p>
     * @param LatestSyncTime <p>最新一次同步任务的结束时间</p>
     */
    public void setLatestSyncTime(String LatestSyncTime) {
        this.LatestSyncTime = LatestSyncTime;
    }

    /**
     * Get <p>分组名称数组</p> 
     * @return NamePathArr <p>分组名称数组</p>
     */
    public String [] getNamePathArr() {
        return this.NamePathArr;
    }

    /**
     * Set <p>分组名称数组</p>
     * @param NamePathArr <p>分组名称数组</p>
     */
    public void setNamePathArr(String [] NamePathArr) {
        this.NamePathArr = NamePathArr;
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
        if (source.NamePathArr != null) {
            this.NamePathArr = new String[source.NamePathArr.length];
            for (int i = 0; i < source.NamePathArr.length; i++) {
                this.NamePathArr[i] = new String(source.NamePathArr[i]);
            }
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
        this.setParamArraySimple(map, prefix + "NamePathArr.", this.NamePathArr);

    }
}

