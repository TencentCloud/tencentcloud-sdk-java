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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApiDetailInfo extends AbstractModel{

    /**
    * API ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
    * 命名空间ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 命名空间名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * 服务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MicroserviceId")
    @Expose
    private String MicroserviceId;

    /**
    * 服务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MicroserviceName")
    @Expose
    private String MicroserviceName;

    /**
    * API 请求路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Api 映射路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PathMapping")
    @Expose
    private String PathMapping;

    /**
    * 请求方法
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 所属分组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 是否禁用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsableStatus")
    @Expose
    private String UsableStatus;

    /**
    * 发布状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReleaseStatus")
    @Expose
    private String ReleaseStatus;

    /**
    * 开启限流
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RateLimitStatus")
    @Expose
    private String RateLimitStatus;

    /**
    * 是否开启mock
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MockStatus")
    @Expose
    private String MockStatus;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * 发布时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReleasedTime")
    @Expose
    private String ReleasedTime;

    /**
    * 所属分组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * API 超时，单位毫秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * Api所在服务host
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * API类型。 ms ： 微服务API； external :外部服务Api
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiType")
    @Expose
    private String ApiType;

    /**
    * Api描述信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get API ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiId API ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set API ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiId API ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    /**
     * Get 命名空间ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NamespaceId 命名空间ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 命名空间ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamespaceId 命名空间ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 命名空间名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NamespaceName 命名空间名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set 命名空间名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamespaceName 命名空间名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get 服务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MicroserviceId 服务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMicroserviceId() {
        return this.MicroserviceId;
    }

    /**
     * Set 服务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param MicroserviceId 服务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMicroserviceId(String MicroserviceId) {
        this.MicroserviceId = MicroserviceId;
    }

    /**
     * Get 服务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MicroserviceName 服务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMicroserviceName() {
        return this.MicroserviceName;
    }

    /**
     * Set 服务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param MicroserviceName 服务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMicroserviceName(String MicroserviceName) {
        this.MicroserviceName = MicroserviceName;
    }

    /**
     * Get API 请求路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Path API 请求路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set API 请求路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param Path API 请求路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Api 映射路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PathMapping Api 映射路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPathMapping() {
        return this.PathMapping;
    }

    /**
     * Set Api 映射路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param PathMapping Api 映射路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPathMapping(String PathMapping) {
        this.PathMapping = PathMapping;
    }

    /**
     * Get 请求方法
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Method 请求方法
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set 请求方法
注意：此字段可能返回 null，表示取不到有效值。
     * @param Method 请求方法
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get 所属分组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupId 所属分组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 所属分组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupId 所属分组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 是否禁用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsableStatus 是否禁用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUsableStatus() {
        return this.UsableStatus;
    }

    /**
     * Set 是否禁用
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsableStatus 是否禁用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsableStatus(String UsableStatus) {
        this.UsableStatus = UsableStatus;
    }

    /**
     * Get 发布状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReleaseStatus 发布状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReleaseStatus() {
        return this.ReleaseStatus;
    }

    /**
     * Set 发布状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReleaseStatus 发布状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReleaseStatus(String ReleaseStatus) {
        this.ReleaseStatus = ReleaseStatus;
    }

    /**
     * Get 开启限流
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RateLimitStatus 开启限流
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRateLimitStatus() {
        return this.RateLimitStatus;
    }

    /**
     * Set 开启限流
注意：此字段可能返回 null，表示取不到有效值。
     * @param RateLimitStatus 开启限流
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRateLimitStatus(String RateLimitStatus) {
        this.RateLimitStatus = RateLimitStatus;
    }

    /**
     * Get 是否开启mock
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MockStatus 是否开启mock
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMockStatus() {
        return this.MockStatus;
    }

    /**
     * Set 是否开启mock
注意：此字段可能返回 null，表示取不到有效值。
     * @param MockStatus 是否开启mock
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMockStatus(String MockStatus) {
        this.MockStatus = MockStatus;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get 发布时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReleasedTime 发布时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReleasedTime() {
        return this.ReleasedTime;
    }

    /**
     * Set 发布时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReleasedTime 发布时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReleasedTime(String ReleasedTime) {
        this.ReleasedTime = ReleasedTime;
    }

    /**
     * Get 所属分组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupName 所属分组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 所属分组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupName 所属分组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get API 超时，单位毫秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Timeout API 超时，单位毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set API 超时，单位毫秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param Timeout API 超时，单位毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get Api所在服务host
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Host Api所在服务host
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Api所在服务host
注意：此字段可能返回 null，表示取不到有效值。
     * @param Host Api所在服务host
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get API类型。 ms ： 微服务API； external :外部服务Api
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiType API类型。 ms ： 微服务API； external :外部服务Api
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApiType() {
        return this.ApiType;
    }

    /**
     * Set API类型。 ms ： 微服务API； external :外部服务Api
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiType API类型。 ms ： 微服务API； external :外部服务Api
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiType(String ApiType) {
        this.ApiType = ApiType;
    }

    /**
     * Get Api描述信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description Api描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Api描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description Api描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ApiDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiDetailInfo(ApiDetailInfo source) {
        if (source.ApiId != null) {
            this.ApiId = new String(source.ApiId);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.MicroserviceId != null) {
            this.MicroserviceId = new String(source.MicroserviceId);
        }
        if (source.MicroserviceName != null) {
            this.MicroserviceName = new String(source.MicroserviceName);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.PathMapping != null) {
            this.PathMapping = new String(source.PathMapping);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.UsableStatus != null) {
            this.UsableStatus = new String(source.UsableStatus);
        }
        if (source.ReleaseStatus != null) {
            this.ReleaseStatus = new String(source.ReleaseStatus);
        }
        if (source.RateLimitStatus != null) {
            this.RateLimitStatus = new String(source.RateLimitStatus);
        }
        if (source.MockStatus != null) {
            this.MockStatus = new String(source.MockStatus);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
        if (source.ReleasedTime != null) {
            this.ReleasedTime = new String(source.ReleasedTime);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.ApiType != null) {
            this.ApiType = new String(source.ApiType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiId", this.ApiId);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "MicroserviceId", this.MicroserviceId);
        this.setParamSimple(map, prefix + "MicroserviceName", this.MicroserviceName);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "PathMapping", this.PathMapping);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "UsableStatus", this.UsableStatus);
        this.setParamSimple(map, prefix + "ReleaseStatus", this.ReleaseStatus);
        this.setParamSimple(map, prefix + "RateLimitStatus", this.RateLimitStatus);
        this.setParamSimple(map, prefix + "MockStatus", this.MockStatus);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);
        this.setParamSimple(map, prefix + "ReleasedTime", this.ReleasedTime);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "ApiType", this.ApiType);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

