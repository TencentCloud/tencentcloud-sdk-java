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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyGroupInfo extends AbstractModel{

    /**
    * 通道组id
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 通道组域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 通道组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 目标地域
    */
    @SerializedName("RealServerRegionInfo")
    @Expose
    private RegionDetail RealServerRegionInfo;

    /**
    * 通道组状态。
其中，
RUNNING表示运行中；
CREATING表示创建中；
DESTROYING表示销毁中；
MOVING表示通道迁移中；
CHANGING表示部分部署中。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 标签列表。
    */
    @SerializedName("TagSet")
    @Expose
    private TagPair [] TagSet;

    /**
    * 通道组版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 通道组是否包含微软通道
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyType")
    @Expose
    private Long ProxyType;

    /**
    * 支持Http3特性的标识，其中：
0表示关闭；
1表示启用。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Http3Supported")
    @Expose
    private Long Http3Supported;

    /**
     * Get 通道组id 
     * @return GroupId 通道组id
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 通道组id
     * @param GroupId 通道组id
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 通道组域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Domain 通道组域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 通道组域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Domain 通道组域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 通道组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupName 通道组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 通道组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupName 通道组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 目标地域 
     * @return RealServerRegionInfo 目标地域
     */
    public RegionDetail getRealServerRegionInfo() {
        return this.RealServerRegionInfo;
    }

    /**
     * Set 目标地域
     * @param RealServerRegionInfo 目标地域
     */
    public void setRealServerRegionInfo(RegionDetail RealServerRegionInfo) {
        this.RealServerRegionInfo = RealServerRegionInfo;
    }

    /**
     * Get 通道组状态。
其中，
RUNNING表示运行中；
CREATING表示创建中；
DESTROYING表示销毁中；
MOVING表示通道迁移中；
CHANGING表示部分部署中。 
     * @return Status 通道组状态。
其中，
RUNNING表示运行中；
CREATING表示创建中；
DESTROYING表示销毁中；
MOVING表示通道迁移中；
CHANGING表示部分部署中。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 通道组状态。
其中，
RUNNING表示运行中；
CREATING表示创建中；
DESTROYING表示销毁中；
MOVING表示通道迁移中；
CHANGING表示部分部署中。
     * @param Status 通道组状态。
其中，
RUNNING表示运行中；
CREATING表示创建中；
DESTROYING表示销毁中；
MOVING表示通道迁移中；
CHANGING表示部分部署中。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 标签列表。 
     * @return TagSet 标签列表。
     */
    public TagPair [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 标签列表。
     * @param TagSet 标签列表。
     */
    public void setTagSet(TagPair [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get 通道组版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version 通道组版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 通道组版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version 通道组版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 通道组是否包含微软通道
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyType 通道组是否包含微软通道
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProxyType() {
        return this.ProxyType;
    }

    /**
     * Set 通道组是否包含微软通道
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyType 通道组是否包含微软通道
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyType(Long ProxyType) {
        this.ProxyType = ProxyType;
    }

    /**
     * Get 支持Http3特性的标识，其中：
0表示关闭；
1表示启用。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Http3Supported 支持Http3特性的标识，其中：
0表示关闭；
1表示启用。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHttp3Supported() {
        return this.Http3Supported;
    }

    /**
     * Set 支持Http3特性的标识，其中：
0表示关闭；
1表示启用。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Http3Supported 支持Http3特性的标识，其中：
0表示关闭；
1表示启用。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttp3Supported(Long Http3Supported) {
        this.Http3Supported = Http3Supported;
    }

    public ProxyGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyGroupInfo(ProxyGroupInfo source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.RealServerRegionInfo != null) {
            this.RealServerRegionInfo = new RegionDetail(source.RealServerRegionInfo);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TagSet != null) {
            this.TagSet = new TagPair[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new TagPair(source.TagSet[i]);
            }
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.ProxyType != null) {
            this.ProxyType = new Long(source.ProxyType);
        }
        if (source.Http3Supported != null) {
            this.Http3Supported = new Long(source.Http3Supported);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamObj(map, prefix + "RealServerRegionInfo.", this.RealServerRegionInfo);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ProxyType", this.ProxyType);
        this.setParamSimple(map, prefix + "Http3Supported", this.Http3Supported);

    }
}

