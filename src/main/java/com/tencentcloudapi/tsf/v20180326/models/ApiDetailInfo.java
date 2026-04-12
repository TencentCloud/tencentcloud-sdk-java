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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApiDetailInfo extends AbstractModel {

    /**
    * <p>API ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiId")
    @Expose
    private String ApiId;

    /**
    * <p>命名空间ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * <p>命名空间名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * <p>服务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MicroserviceId")
    @Expose
    private String MicroserviceId;

    /**
    * <p>服务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MicroserviceName")
    @Expose
    private String MicroserviceName;

    /**
    * <p>API 请求路径</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>Api 映射路径</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PathMapping")
    @Expose
    private String PathMapping;

    /**
    * <p>请求方法</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * <p>所属分组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>是否禁用</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsableStatus")
    @Expose
    private String UsableStatus;

    /**
    * <p>发布状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReleaseStatus")
    @Expose
    private String ReleaseStatus;

    /**
    * <p>开启限流</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RateLimitStatus")
    @Expose
    private String RateLimitStatus;

    /**
    * <p>是否开启mock</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MockStatus")
    @Expose
    private String MockStatus;

    /**
    * <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * <p>发布时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReleasedTime")
    @Expose
    private String ReleasedTime;

    /**
    * <p>所属分组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>API 超时，单位毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * <p>Api所在服务host</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * <p>API类型。 ms ： 微服务API； external :外部服务Api</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiType")
    @Expose
    private String ApiType;

    /**
    * <p>Api描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>API路径匹配类型。normal：普通API；wildcard：通配API。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiMatchType")
    @Expose
    private String ApiMatchType;

    /**
    * <p>RPC 额外信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RpcExt")
    @Expose
    private String RpcExt;

    /**
    * <p>部署组id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GatewayDeployGroupId")
    @Expose
    private String GatewayDeployGroupId;

    /**
    * <p>md5</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * <p>RPC 类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RpcType")
    @Expose
    private String RpcType;

    /**
    * <p>是否禁用短路径访问开关</p>
    */
    @SerializedName("PathMappingUnsupported")
    @Expose
    private Boolean PathMappingUnsupported;

    /**
    * <p>禁用短路径访问开关原因</p>
    */
    @SerializedName("PathMappingUnsupportedMsg")
    @Expose
    private String PathMappingUnsupportedMsg;

    /**
     * Get <p>API ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiId <p>API ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApiId() {
        return this.ApiId;
    }

    /**
     * Set <p>API ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiId <p>API ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiId(String ApiId) {
        this.ApiId = ApiId;
    }

    /**
     * Get <p>命名空间ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NamespaceId <p>命名空间ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set <p>命名空间ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamespaceId <p>命名空间ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get <p>命名空间名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NamespaceName <p>命名空间名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set <p>命名空间名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamespaceName <p>命名空间名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get <p>服务ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MicroserviceId <p>服务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMicroserviceId() {
        return this.MicroserviceId;
    }

    /**
     * Set <p>服务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MicroserviceId <p>服务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMicroserviceId(String MicroserviceId) {
        this.MicroserviceId = MicroserviceId;
    }

    /**
     * Get <p>服务名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MicroserviceName <p>服务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMicroserviceName() {
        return this.MicroserviceName;
    }

    /**
     * Set <p>服务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MicroserviceName <p>服务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMicroserviceName(String MicroserviceName) {
        this.MicroserviceName = MicroserviceName;
    }

    /**
     * Get <p>API 请求路径</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Path <p>API 请求路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>API 请求路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Path <p>API 请求路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>Api 映射路径</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PathMapping <p>Api 映射路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPathMapping() {
        return this.PathMapping;
    }

    /**
     * Set <p>Api 映射路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PathMapping <p>Api 映射路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPathMapping(String PathMapping) {
        this.PathMapping = PathMapping;
    }

    /**
     * Get <p>请求方法</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Method <p>请求方法</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set <p>请求方法</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Method <p>请求方法</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get <p>所属分组ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupId <p>所属分组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>所属分组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupId <p>所属分组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>是否禁用</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsableStatus <p>是否禁用</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUsableStatus() {
        return this.UsableStatus;
    }

    /**
     * Set <p>是否禁用</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsableStatus <p>是否禁用</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsableStatus(String UsableStatus) {
        this.UsableStatus = UsableStatus;
    }

    /**
     * Get <p>发布状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReleaseStatus <p>发布状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReleaseStatus() {
        return this.ReleaseStatus;
    }

    /**
     * Set <p>发布状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReleaseStatus <p>发布状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReleaseStatus(String ReleaseStatus) {
        this.ReleaseStatus = ReleaseStatus;
    }

    /**
     * Get <p>开启限流</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RateLimitStatus <p>开启限流</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRateLimitStatus() {
        return this.RateLimitStatus;
    }

    /**
     * Set <p>开启限流</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RateLimitStatus <p>开启限流</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRateLimitStatus(String RateLimitStatus) {
        this.RateLimitStatus = RateLimitStatus;
    }

    /**
     * Get <p>是否开启mock</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MockStatus <p>是否开启mock</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMockStatus() {
        return this.MockStatus;
    }

    /**
     * Set <p>是否开启mock</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MockStatus <p>是否开启mock</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMockStatus(String MockStatus) {
        this.MockStatus = MockStatus;
    }

    /**
     * Get <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedTime <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedTime <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get <p>发布时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReleasedTime <p>发布时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReleasedTime() {
        return this.ReleasedTime;
    }

    /**
     * Set <p>发布时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReleasedTime <p>发布时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReleasedTime(String ReleasedTime) {
        this.ReleasedTime = ReleasedTime;
    }

    /**
     * Get <p>所属分组名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupName <p>所属分组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>所属分组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupName <p>所属分组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>API 超时，单位毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Timeout <p>API 超时，单位毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set <p>API 超时，单位毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Timeout <p>API 超时，单位毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get <p>Api所在服务host</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Host <p>Api所在服务host</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>Api所在服务host</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Host <p>Api所在服务host</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get <p>API类型。 ms ： 微服务API； external :外部服务Api</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiType <p>API类型。 ms ： 微服务API； external :外部服务Api</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApiType() {
        return this.ApiType;
    }

    /**
     * Set <p>API类型。 ms ： 微服务API； external :外部服务Api</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiType <p>API类型。 ms ： 微服务API； external :外部服务Api</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiType(String ApiType) {
        this.ApiType = ApiType;
    }

    /**
     * Get <p>Api描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>Api描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Api描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>Api描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>API路径匹配类型。normal：普通API；wildcard：通配API。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiMatchType <p>API路径匹配类型。normal：普通API；wildcard：通配API。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApiMatchType() {
        return this.ApiMatchType;
    }

    /**
     * Set <p>API路径匹配类型。normal：普通API；wildcard：通配API。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiMatchType <p>API路径匹配类型。normal：普通API；wildcard：通配API。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiMatchType(String ApiMatchType) {
        this.ApiMatchType = ApiMatchType;
    }

    /**
     * Get <p>RPC 额外信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RpcExt <p>RPC 额外信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRpcExt() {
        return this.RpcExt;
    }

    /**
     * Set <p>RPC 额外信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RpcExt <p>RPC 额外信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRpcExt(String RpcExt) {
        this.RpcExt = RpcExt;
    }

    /**
     * Get <p>部署组id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GatewayDeployGroupId <p>部署组id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGatewayDeployGroupId() {
        return this.GatewayDeployGroupId;
    }

    /**
     * Set <p>部署组id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GatewayDeployGroupId <p>部署组id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGatewayDeployGroupId(String GatewayDeployGroupId) {
        this.GatewayDeployGroupId = GatewayDeployGroupId;
    }

    /**
     * Get <p>md5</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Md5 <p>md5</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set <p>md5</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Md5 <p>md5</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Get <p>RPC 类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RpcType <p>RPC 类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRpcType() {
        return this.RpcType;
    }

    /**
     * Set <p>RPC 类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RpcType <p>RPC 类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRpcType(String RpcType) {
        this.RpcType = RpcType;
    }

    /**
     * Get <p>是否禁用短路径访问开关</p> 
     * @return PathMappingUnsupported <p>是否禁用短路径访问开关</p>
     */
    public Boolean getPathMappingUnsupported() {
        return this.PathMappingUnsupported;
    }

    /**
     * Set <p>是否禁用短路径访问开关</p>
     * @param PathMappingUnsupported <p>是否禁用短路径访问开关</p>
     */
    public void setPathMappingUnsupported(Boolean PathMappingUnsupported) {
        this.PathMappingUnsupported = PathMappingUnsupported;
    }

    /**
     * Get <p>禁用短路径访问开关原因</p> 
     * @return PathMappingUnsupportedMsg <p>禁用短路径访问开关原因</p>
     */
    public String getPathMappingUnsupportedMsg() {
        return this.PathMappingUnsupportedMsg;
    }

    /**
     * Set <p>禁用短路径访问开关原因</p>
     * @param PathMappingUnsupportedMsg <p>禁用短路径访问开关原因</p>
     */
    public void setPathMappingUnsupportedMsg(String PathMappingUnsupportedMsg) {
        this.PathMappingUnsupportedMsg = PathMappingUnsupportedMsg;
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
        if (source.ApiMatchType != null) {
            this.ApiMatchType = new String(source.ApiMatchType);
        }
        if (source.RpcExt != null) {
            this.RpcExt = new String(source.RpcExt);
        }
        if (source.GatewayDeployGroupId != null) {
            this.GatewayDeployGroupId = new String(source.GatewayDeployGroupId);
        }
        if (source.Md5 != null) {
            this.Md5 = new String(source.Md5);
        }
        if (source.RpcType != null) {
            this.RpcType = new String(source.RpcType);
        }
        if (source.PathMappingUnsupported != null) {
            this.PathMappingUnsupported = new Boolean(source.PathMappingUnsupported);
        }
        if (source.PathMappingUnsupportedMsg != null) {
            this.PathMappingUnsupportedMsg = new String(source.PathMappingUnsupportedMsg);
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
        this.setParamSimple(map, prefix + "ApiMatchType", this.ApiMatchType);
        this.setParamSimple(map, prefix + "RpcExt", this.RpcExt);
        this.setParamSimple(map, prefix + "GatewayDeployGroupId", this.GatewayDeployGroupId);
        this.setParamSimple(map, prefix + "Md5", this.Md5);
        this.setParamSimple(map, prefix + "RpcType", this.RpcType);
        this.setParamSimple(map, prefix + "PathMappingUnsupported", this.PathMappingUnsupported);
        this.setParamSimple(map, prefix + "PathMappingUnsupportedMsg", this.PathMappingUnsupportedMsg);

    }
}

