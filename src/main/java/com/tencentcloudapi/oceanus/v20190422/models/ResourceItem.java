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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceItem extends AbstractModel {

    /**
    * 资源ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 资源类型
    */
    @SerializedName("ResourceType")
    @Expose
    private Long ResourceType;

    /**
    * 资源位置
    */
    @SerializedName("ResourceLoc")
    @Expose
    private ResourceLoc ResourceLoc;

    /**
    * 资源地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 应用ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 主账号Uin
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 子账号Uin
    */
    @SerializedName("CreatorUin")
    @Expose
    private String CreatorUin;

    /**
    * 资源创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 资源最后更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 资源的资源版本ID
    */
    @SerializedName("LatestResourceConfigVersion")
    @Expose
    private Long LatestResourceConfigVersion;

    /**
    * 资源备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 版本个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionCount")
    @Expose
    private Long VersionCount;

    /**
    * 关联作业数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RefJobCount")
    @Expose
    private Long RefJobCount;

    /**
    * 作业运行状态
    */
    @SerializedName("IsJobRun")
    @Expose
    private Long IsJobRun;

    /**
    * 文件名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 工作空间ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkSpaceId")
    @Expose
    private Long WorkSpaceId;

    /**
    * 分状态统计关联作业数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RefJobStatusCountSet")
    @Expose
    private RefJobStatusCountItem [] RefJobStatusCountSet;

    /**
    * 连接器名称
    */
    @SerializedName("Connector")
    @Expose
    private String Connector;

    /**
    * 连接器版本
    */
    @SerializedName("ConnectorVersion")
    @Expose
    private String ConnectorVersion;

    /**
    * 连接方式
    */
    @SerializedName("ConnectionMethod")
    @Expose
    private String ConnectionMethod;

    /**
    * connector关联的资源id
    */
    @SerializedName("RelatedResourceId")
    @Expose
    private String RelatedResourceId;

    /**
    * 图标
    */
    @SerializedName("Icon")
    @Expose
    private String Icon;

    /**
    * 连接器中文名
    */
    @SerializedName("ConnectorName")
    @Expose
    private String ConnectorName;

    /**
    * 连接器官网链接
    */
    @SerializedName("ConnectorUrl")
    @Expose
    private String ConnectorUrl;

    /**
     * Get 资源ID 
     * @return ResourceId 资源ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID
     * @param ResourceId 资源ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 资源名称 
     * @return Name 资源名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 资源名称
     * @param Name 资源名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 资源类型 
     * @return ResourceType 资源类型
     */
    public Long getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型
     * @param ResourceType 资源类型
     */
    public void setResourceType(Long ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 资源位置 
     * @return ResourceLoc 资源位置
     */
    public ResourceLoc getResourceLoc() {
        return this.ResourceLoc;
    }

    /**
     * Set 资源位置
     * @param ResourceLoc 资源位置
     */
    public void setResourceLoc(ResourceLoc ResourceLoc) {
        this.ResourceLoc = ResourceLoc;
    }

    /**
     * Get 资源地域 
     * @return Region 资源地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 资源地域
     * @param Region 资源地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 应用ID 
     * @return AppId 应用ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 应用ID
     * @param AppId 应用ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 主账号Uin 
     * @return OwnerUin 主账号Uin
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 主账号Uin
     * @param OwnerUin 主账号Uin
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 子账号Uin 
     * @return CreatorUin 子账号Uin
     */
    public String getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set 子账号Uin
     * @param CreatorUin 子账号Uin
     */
    public void setCreatorUin(String CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get 资源创建时间 
     * @return CreateTime 资源创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 资源创建时间
     * @param CreateTime 资源创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 资源最后更新时间 
     * @return UpdateTime 资源最后更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 资源最后更新时间
     * @param UpdateTime 资源最后更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 资源的资源版本ID 
     * @return LatestResourceConfigVersion 资源的资源版本ID
     */
    public Long getLatestResourceConfigVersion() {
        return this.LatestResourceConfigVersion;
    }

    /**
     * Set 资源的资源版本ID
     * @param LatestResourceConfigVersion 资源的资源版本ID
     */
    public void setLatestResourceConfigVersion(Long LatestResourceConfigVersion) {
        this.LatestResourceConfigVersion = LatestResourceConfigVersion;
    }

    /**
     * Get 资源备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 资源备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 资源备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 资源备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 版本个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionCount 版本个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVersionCount() {
        return this.VersionCount;
    }

    /**
     * Set 版本个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionCount 版本个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionCount(Long VersionCount) {
        this.VersionCount = VersionCount;
    }

    /**
     * Get 关联作业数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RefJobCount 关联作业数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRefJobCount() {
        return this.RefJobCount;
    }

    /**
     * Set 关联作业数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RefJobCount 关联作业数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRefJobCount(Long RefJobCount) {
        this.RefJobCount = RefJobCount;
    }

    /**
     * Get 作业运行状态 
     * @return IsJobRun 作业运行状态
     */
    public Long getIsJobRun() {
        return this.IsJobRun;
    }

    /**
     * Set 作业运行状态
     * @param IsJobRun 作业运行状态
     */
    public void setIsJobRun(Long IsJobRun) {
        this.IsJobRun = IsJobRun;
    }

    /**
     * Get 文件名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileName 文件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileName 文件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 工作空间ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkSpaceId 工作空间ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWorkSpaceId() {
        return this.WorkSpaceId;
    }

    /**
     * Set 工作空间ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkSpaceId 工作空间ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkSpaceId(Long WorkSpaceId) {
        this.WorkSpaceId = WorkSpaceId;
    }

    /**
     * Get 分状态统计关联作业数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RefJobStatusCountSet 分状态统计关联作业数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RefJobStatusCountItem [] getRefJobStatusCountSet() {
        return this.RefJobStatusCountSet;
    }

    /**
     * Set 分状态统计关联作业数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RefJobStatusCountSet 分状态统计关联作业数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRefJobStatusCountSet(RefJobStatusCountItem [] RefJobStatusCountSet) {
        this.RefJobStatusCountSet = RefJobStatusCountSet;
    }

    /**
     * Get 连接器名称 
     * @return Connector 连接器名称
     */
    public String getConnector() {
        return this.Connector;
    }

    /**
     * Set 连接器名称
     * @param Connector 连接器名称
     */
    public void setConnector(String Connector) {
        this.Connector = Connector;
    }

    /**
     * Get 连接器版本 
     * @return ConnectorVersion 连接器版本
     */
    public String getConnectorVersion() {
        return this.ConnectorVersion;
    }

    /**
     * Set 连接器版本
     * @param ConnectorVersion 连接器版本
     */
    public void setConnectorVersion(String ConnectorVersion) {
        this.ConnectorVersion = ConnectorVersion;
    }

    /**
     * Get 连接方式 
     * @return ConnectionMethod 连接方式
     */
    public String getConnectionMethod() {
        return this.ConnectionMethod;
    }

    /**
     * Set 连接方式
     * @param ConnectionMethod 连接方式
     */
    public void setConnectionMethod(String ConnectionMethod) {
        this.ConnectionMethod = ConnectionMethod;
    }

    /**
     * Get connector关联的资源id 
     * @return RelatedResourceId connector关联的资源id
     */
    public String getRelatedResourceId() {
        return this.RelatedResourceId;
    }

    /**
     * Set connector关联的资源id
     * @param RelatedResourceId connector关联的资源id
     */
    public void setRelatedResourceId(String RelatedResourceId) {
        this.RelatedResourceId = RelatedResourceId;
    }

    /**
     * Get 图标 
     * @return Icon 图标
     */
    public String getIcon() {
        return this.Icon;
    }

    /**
     * Set 图标
     * @param Icon 图标
     */
    public void setIcon(String Icon) {
        this.Icon = Icon;
    }

    /**
     * Get 连接器中文名 
     * @return ConnectorName 连接器中文名
     */
    public String getConnectorName() {
        return this.ConnectorName;
    }

    /**
     * Set 连接器中文名
     * @param ConnectorName 连接器中文名
     */
    public void setConnectorName(String ConnectorName) {
        this.ConnectorName = ConnectorName;
    }

    /**
     * Get 连接器官网链接 
     * @return ConnectorUrl 连接器官网链接
     */
    public String getConnectorUrl() {
        return this.ConnectorUrl;
    }

    /**
     * Set 连接器官网链接
     * @param ConnectorUrl 连接器官网链接
     */
    public void setConnectorUrl(String ConnectorUrl) {
        this.ConnectorUrl = ConnectorUrl;
    }

    public ResourceItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceItem(ResourceItem source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new Long(source.ResourceType);
        }
        if (source.ResourceLoc != null) {
            this.ResourceLoc = new ResourceLoc(source.ResourceLoc);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.CreatorUin != null) {
            this.CreatorUin = new String(source.CreatorUin);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.LatestResourceConfigVersion != null) {
            this.LatestResourceConfigVersion = new Long(source.LatestResourceConfigVersion);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.VersionCount != null) {
            this.VersionCount = new Long(source.VersionCount);
        }
        if (source.RefJobCount != null) {
            this.RefJobCount = new Long(source.RefJobCount);
        }
        if (source.IsJobRun != null) {
            this.IsJobRun = new Long(source.IsJobRun);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.WorkSpaceId != null) {
            this.WorkSpaceId = new Long(source.WorkSpaceId);
        }
        if (source.RefJobStatusCountSet != null) {
            this.RefJobStatusCountSet = new RefJobStatusCountItem[source.RefJobStatusCountSet.length];
            for (int i = 0; i < source.RefJobStatusCountSet.length; i++) {
                this.RefJobStatusCountSet[i] = new RefJobStatusCountItem(source.RefJobStatusCountSet[i]);
            }
        }
        if (source.Connector != null) {
            this.Connector = new String(source.Connector);
        }
        if (source.ConnectorVersion != null) {
            this.ConnectorVersion = new String(source.ConnectorVersion);
        }
        if (source.ConnectionMethod != null) {
            this.ConnectionMethod = new String(source.ConnectionMethod);
        }
        if (source.RelatedResourceId != null) {
            this.RelatedResourceId = new String(source.RelatedResourceId);
        }
        if (source.Icon != null) {
            this.Icon = new String(source.Icon);
        }
        if (source.ConnectorName != null) {
            this.ConnectorName = new String(source.ConnectorName);
        }
        if (source.ConnectorUrl != null) {
            this.ConnectorUrl = new String(source.ConnectorUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamObj(map, prefix + "ResourceLoc.", this.ResourceLoc);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "CreatorUin", this.CreatorUin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "LatestResourceConfigVersion", this.LatestResourceConfigVersion);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "VersionCount", this.VersionCount);
        this.setParamSimple(map, prefix + "RefJobCount", this.RefJobCount);
        this.setParamSimple(map, prefix + "IsJobRun", this.IsJobRun);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "WorkSpaceId", this.WorkSpaceId);
        this.setParamArrayObj(map, prefix + "RefJobStatusCountSet.", this.RefJobStatusCountSet);
        this.setParamSimple(map, prefix + "Connector", this.Connector);
        this.setParamSimple(map, prefix + "ConnectorVersion", this.ConnectorVersion);
        this.setParamSimple(map, prefix + "ConnectionMethod", this.ConnectionMethod);
        this.setParamSimple(map, prefix + "RelatedResourceId", this.RelatedResourceId);
        this.setParamSimple(map, prefix + "Icon", this.Icon);
        this.setParamSimple(map, prefix + "ConnectorName", this.ConnectorName);
        this.setParamSimple(map, prefix + "ConnectorUrl", this.ConnectorUrl);

    }
}

