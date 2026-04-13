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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceGroup extends AbstractModel {

    /**
    * <p>服务组id</p>
    */
    @SerializedName("ServiceGroupId")
    @Expose
    private String ServiceGroupId;

    /**
    * <p>服务组名</p>
    */
    @SerializedName("ServiceGroupName")
    @Expose
    private String ServiceGroupName;

    /**
    * <p>创建者</p>
    */
    @SerializedName("CreatedBy")
    @Expose
    private String CreatedBy;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>主账号</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>服务组下服务总数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceCount")
    @Expose
    private Long ServiceCount;

    /**
    * <p>服务组下在运行的服务数量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunningServiceCount")
    @Expose
    private Long RunningServiceCount;

    /**
    * <p>服务描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Services")
    @Expose
    private Service [] Services;

    /**
    * <p>服务组状态，与服务一致<br> CREATING 创建中<br>     CREATE_FAILED 创建失败<br>     Normal    正常运行中<br>     Stopped  已停止<br>     Stopping 停止中<br>     Abnormal 异常<br>     Pending 启动中<br>     Waiting 就绪中</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>服务组标签</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>服务组下最高版本</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestVersion")
    @Expose
    private String LatestVersion;

    /**
    * <p>服务的业务状态<br>CREATING 创建中<br>     CREATE_FAILED 创建失败<br>     ARREARS_STOP 因欠费被强制停止<br>     BILLING 计费中<br>     WHITELIST_USING 白名单试用中<br>     WHITELIST_STOP 白名单额度不足</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BusinessStatus")
    @Expose
    private String BusinessStatus;

    /**
    * <p>服务的计费信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BillingInfo")
    @Expose
    private String BillingInfo;

    /**
    * <p>服务的创建来源</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateSource")
    @Expose
    private String CreateSource;

    /**
    * <p>服务组的权重更新状态<br>UPDATING 更新中<br>     UPDATED 更新成功<br>     UPDATE_FAILED 更新失败</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WeightUpdateStatus")
    @Expose
    private String WeightUpdateStatus;

    /**
    * <p>服务组下运行的pod数量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReplicasCount")
    @Expose
    private Long ReplicasCount;

    /**
    * <p>服务组下期望的pod数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AvailableReplicasCount")
    @Expose
    private Long AvailableReplicasCount;

    /**
    * <p>服务组的subuin</p>
    */
    @SerializedName("SubUin")
    @Expose
    private String SubUin;

    /**
    * <p>服务组的app_id</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>是否开启鉴权</p>
    */
    @SerializedName("AuthorizationEnable")
    @Expose
    private Boolean AuthorizationEnable;

    /**
    * <p>限流鉴权 token 列表</p>
    */
    @SerializedName("AuthTokens")
    @Expose
    private AuthToken [] AuthTokens;

    /**
    * <p>用于监控的创建来源字段</p>
    */
    @SerializedName("MonitorSource")
    @Expose
    private String MonitorSource;

    /**
    * <p>子用户的 nickname</p>
    */
    @SerializedName("SubUinName")
    @Expose
    private String SubUinName;

    /**
    * <p>网关日志投递相关配置</p>
    */
    @SerializedName("GatewayLogConfig")
    @Expose
    private LogConfig GatewayLogConfig;

    /**
    * <p>网关路由相关配置</p>
    */
    @SerializedName("GatewayConfig")
    @Expose
    private GatewayConfig GatewayConfig;

    /**
     * Get <p>服务组id</p> 
     * @return ServiceGroupId <p>服务组id</p>
     */
    public String getServiceGroupId() {
        return this.ServiceGroupId;
    }

    /**
     * Set <p>服务组id</p>
     * @param ServiceGroupId <p>服务组id</p>
     */
    public void setServiceGroupId(String ServiceGroupId) {
        this.ServiceGroupId = ServiceGroupId;
    }

    /**
     * Get <p>服务组名</p> 
     * @return ServiceGroupName <p>服务组名</p>
     */
    public String getServiceGroupName() {
        return this.ServiceGroupName;
    }

    /**
     * Set <p>服务组名</p>
     * @param ServiceGroupName <p>服务组名</p>
     */
    public void setServiceGroupName(String ServiceGroupName) {
        this.ServiceGroupName = ServiceGroupName;
    }

    /**
     * Get <p>创建者</p> 
     * @return CreatedBy <p>创建者</p>
     */
    public String getCreatedBy() {
        return this.CreatedBy;
    }

    /**
     * Set <p>创建者</p>
     * @param CreatedBy <p>创建者</p>
     */
    public void setCreatedBy(String CreatedBy) {
        this.CreatedBy = CreatedBy;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>主账号</p> 
     * @return Uin <p>主账号</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>主账号</p>
     * @param Uin <p>主账号</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>服务组下服务总数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceCount <p>服务组下服务总数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getServiceCount() {
        return this.ServiceCount;
    }

    /**
     * Set <p>服务组下服务总数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceCount <p>服务组下服务总数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceCount(Long ServiceCount) {
        this.ServiceCount = ServiceCount;
    }

    /**
     * Get <p>服务组下在运行的服务数量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunningServiceCount <p>服务组下在运行的服务数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRunningServiceCount() {
        return this.RunningServiceCount;
    }

    /**
     * Set <p>服务组下在运行的服务数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunningServiceCount <p>服务组下在运行的服务数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunningServiceCount(Long RunningServiceCount) {
        this.RunningServiceCount = RunningServiceCount;
    }

    /**
     * Get <p>服务描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Services <p>服务描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Service [] getServices() {
        return this.Services;
    }

    /**
     * Set <p>服务描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Services <p>服务描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServices(Service [] Services) {
        this.Services = Services;
    }

    /**
     * Get <p>服务组状态，与服务一致<br> CREATING 创建中<br>     CREATE_FAILED 创建失败<br>     Normal    正常运行中<br>     Stopped  已停止<br>     Stopping 停止中<br>     Abnormal 异常<br>     Pending 启动中<br>     Waiting 就绪中</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>服务组状态，与服务一致<br> CREATING 创建中<br>     CREATE_FAILED 创建失败<br>     Normal    正常运行中<br>     Stopped  已停止<br>     Stopping 停止中<br>     Abnormal 异常<br>     Pending 启动中<br>     Waiting 就绪中</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>服务组状态，与服务一致<br> CREATING 创建中<br>     CREATE_FAILED 创建失败<br>     Normal    正常运行中<br>     Stopped  已停止<br>     Stopping 停止中<br>     Abnormal 异常<br>     Pending 启动中<br>     Waiting 就绪中</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>服务组状态，与服务一致<br> CREATING 创建中<br>     CREATE_FAILED 创建失败<br>     Normal    正常运行中<br>     Stopped  已停止<br>     Stopping 停止中<br>     Abnormal 异常<br>     Pending 启动中<br>     Waiting 就绪中</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>服务组标签</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags <p>服务组标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>服务组标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags <p>服务组标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>服务组下最高版本</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestVersion <p>服务组下最高版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestVersion() {
        return this.LatestVersion;
    }

    /**
     * Set <p>服务组下最高版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestVersion <p>服务组下最高版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestVersion(String LatestVersion) {
        this.LatestVersion = LatestVersion;
    }

    /**
     * Get <p>服务的业务状态<br>CREATING 创建中<br>     CREATE_FAILED 创建失败<br>     ARREARS_STOP 因欠费被强制停止<br>     BILLING 计费中<br>     WHITELIST_USING 白名单试用中<br>     WHITELIST_STOP 白名单额度不足</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BusinessStatus <p>服务的业务状态<br>CREATING 创建中<br>     CREATE_FAILED 创建失败<br>     ARREARS_STOP 因欠费被强制停止<br>     BILLING 计费中<br>     WHITELIST_USING 白名单试用中<br>     WHITELIST_STOP 白名单额度不足</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBusinessStatus() {
        return this.BusinessStatus;
    }

    /**
     * Set <p>服务的业务状态<br>CREATING 创建中<br>     CREATE_FAILED 创建失败<br>     ARREARS_STOP 因欠费被强制停止<br>     BILLING 计费中<br>     WHITELIST_USING 白名单试用中<br>     WHITELIST_STOP 白名单额度不足</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BusinessStatus <p>服务的业务状态<br>CREATING 创建中<br>     CREATE_FAILED 创建失败<br>     ARREARS_STOP 因欠费被强制停止<br>     BILLING 计费中<br>     WHITELIST_USING 白名单试用中<br>     WHITELIST_STOP 白名单额度不足</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusinessStatus(String BusinessStatus) {
        this.BusinessStatus = BusinessStatus;
    }

    /**
     * Get <p>服务的计费信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BillingInfo <p>服务的计费信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBillingInfo() {
        return this.BillingInfo;
    }

    /**
     * Set <p>服务的计费信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BillingInfo <p>服务的计费信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBillingInfo(String BillingInfo) {
        this.BillingInfo = BillingInfo;
    }

    /**
     * Get <p>服务的创建来源</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateSource <p>服务的创建来源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateSource() {
        return this.CreateSource;
    }

    /**
     * Set <p>服务的创建来源</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateSource <p>服务的创建来源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateSource(String CreateSource) {
        this.CreateSource = CreateSource;
    }

    /**
     * Get <p>服务组的权重更新状态<br>UPDATING 更新中<br>     UPDATED 更新成功<br>     UPDATE_FAILED 更新失败</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WeightUpdateStatus <p>服务组的权重更新状态<br>UPDATING 更新中<br>     UPDATED 更新成功<br>     UPDATE_FAILED 更新失败</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWeightUpdateStatus() {
        return this.WeightUpdateStatus;
    }

    /**
     * Set <p>服务组的权重更新状态<br>UPDATING 更新中<br>     UPDATED 更新成功<br>     UPDATE_FAILED 更新失败</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WeightUpdateStatus <p>服务组的权重更新状态<br>UPDATING 更新中<br>     UPDATED 更新成功<br>     UPDATE_FAILED 更新失败</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeightUpdateStatus(String WeightUpdateStatus) {
        this.WeightUpdateStatus = WeightUpdateStatus;
    }

    /**
     * Get <p>服务组下运行的pod数量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReplicasCount <p>服务组下运行的pod数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReplicasCount() {
        return this.ReplicasCount;
    }

    /**
     * Set <p>服务组下运行的pod数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReplicasCount <p>服务组下运行的pod数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplicasCount(Long ReplicasCount) {
        this.ReplicasCount = ReplicasCount;
    }

    /**
     * Get <p>服务组下期望的pod数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AvailableReplicasCount <p>服务组下期望的pod数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAvailableReplicasCount() {
        return this.AvailableReplicasCount;
    }

    /**
     * Set <p>服务组下期望的pod数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AvailableReplicasCount <p>服务组下期望的pod数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvailableReplicasCount(Long AvailableReplicasCount) {
        this.AvailableReplicasCount = AvailableReplicasCount;
    }

    /**
     * Get <p>服务组的subuin</p> 
     * @return SubUin <p>服务组的subuin</p>
     */
    public String getSubUin() {
        return this.SubUin;
    }

    /**
     * Set <p>服务组的subuin</p>
     * @param SubUin <p>服务组的subuin</p>
     */
    public void setSubUin(String SubUin) {
        this.SubUin = SubUin;
    }

    /**
     * Get <p>服务组的app_id</p> 
     * @return AppId <p>服务组的app_id</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>服务组的app_id</p>
     * @param AppId <p>服务组的app_id</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>是否开启鉴权</p> 
     * @return AuthorizationEnable <p>是否开启鉴权</p>
     */
    public Boolean getAuthorizationEnable() {
        return this.AuthorizationEnable;
    }

    /**
     * Set <p>是否开启鉴权</p>
     * @param AuthorizationEnable <p>是否开启鉴权</p>
     */
    public void setAuthorizationEnable(Boolean AuthorizationEnable) {
        this.AuthorizationEnable = AuthorizationEnable;
    }

    /**
     * Get <p>限流鉴权 token 列表</p> 
     * @return AuthTokens <p>限流鉴权 token 列表</p>
     */
    public AuthToken [] getAuthTokens() {
        return this.AuthTokens;
    }

    /**
     * Set <p>限流鉴权 token 列表</p>
     * @param AuthTokens <p>限流鉴权 token 列表</p>
     */
    public void setAuthTokens(AuthToken [] AuthTokens) {
        this.AuthTokens = AuthTokens;
    }

    /**
     * Get <p>用于监控的创建来源字段</p> 
     * @return MonitorSource <p>用于监控的创建来源字段</p>
     */
    public String getMonitorSource() {
        return this.MonitorSource;
    }

    /**
     * Set <p>用于监控的创建来源字段</p>
     * @param MonitorSource <p>用于监控的创建来源字段</p>
     */
    public void setMonitorSource(String MonitorSource) {
        this.MonitorSource = MonitorSource;
    }

    /**
     * Get <p>子用户的 nickname</p> 
     * @return SubUinName <p>子用户的 nickname</p>
     */
    public String getSubUinName() {
        return this.SubUinName;
    }

    /**
     * Set <p>子用户的 nickname</p>
     * @param SubUinName <p>子用户的 nickname</p>
     */
    public void setSubUinName(String SubUinName) {
        this.SubUinName = SubUinName;
    }

    /**
     * Get <p>网关日志投递相关配置</p> 
     * @return GatewayLogConfig <p>网关日志投递相关配置</p>
     */
    public LogConfig getGatewayLogConfig() {
        return this.GatewayLogConfig;
    }

    /**
     * Set <p>网关日志投递相关配置</p>
     * @param GatewayLogConfig <p>网关日志投递相关配置</p>
     */
    public void setGatewayLogConfig(LogConfig GatewayLogConfig) {
        this.GatewayLogConfig = GatewayLogConfig;
    }

    /**
     * Get <p>网关路由相关配置</p> 
     * @return GatewayConfig <p>网关路由相关配置</p>
     */
    public GatewayConfig getGatewayConfig() {
        return this.GatewayConfig;
    }

    /**
     * Set <p>网关路由相关配置</p>
     * @param GatewayConfig <p>网关路由相关配置</p>
     */
    public void setGatewayConfig(GatewayConfig GatewayConfig) {
        this.GatewayConfig = GatewayConfig;
    }

    public ServiceGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceGroup(ServiceGroup source) {
        if (source.ServiceGroupId != null) {
            this.ServiceGroupId = new String(source.ServiceGroupId);
        }
        if (source.ServiceGroupName != null) {
            this.ServiceGroupName = new String(source.ServiceGroupName);
        }
        if (source.CreatedBy != null) {
            this.CreatedBy = new String(source.CreatedBy);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.ServiceCount != null) {
            this.ServiceCount = new Long(source.ServiceCount);
        }
        if (source.RunningServiceCount != null) {
            this.RunningServiceCount = new Long(source.RunningServiceCount);
        }
        if (source.Services != null) {
            this.Services = new Service[source.Services.length];
            for (int i = 0; i < source.Services.length; i++) {
                this.Services[i] = new Service(source.Services[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.LatestVersion != null) {
            this.LatestVersion = new String(source.LatestVersion);
        }
        if (source.BusinessStatus != null) {
            this.BusinessStatus = new String(source.BusinessStatus);
        }
        if (source.BillingInfo != null) {
            this.BillingInfo = new String(source.BillingInfo);
        }
        if (source.CreateSource != null) {
            this.CreateSource = new String(source.CreateSource);
        }
        if (source.WeightUpdateStatus != null) {
            this.WeightUpdateStatus = new String(source.WeightUpdateStatus);
        }
        if (source.ReplicasCount != null) {
            this.ReplicasCount = new Long(source.ReplicasCount);
        }
        if (source.AvailableReplicasCount != null) {
            this.AvailableReplicasCount = new Long(source.AvailableReplicasCount);
        }
        if (source.SubUin != null) {
            this.SubUin = new String(source.SubUin);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.AuthorizationEnable != null) {
            this.AuthorizationEnable = new Boolean(source.AuthorizationEnable);
        }
        if (source.AuthTokens != null) {
            this.AuthTokens = new AuthToken[source.AuthTokens.length];
            for (int i = 0; i < source.AuthTokens.length; i++) {
                this.AuthTokens[i] = new AuthToken(source.AuthTokens[i]);
            }
        }
        if (source.MonitorSource != null) {
            this.MonitorSource = new String(source.MonitorSource);
        }
        if (source.SubUinName != null) {
            this.SubUinName = new String(source.SubUinName);
        }
        if (source.GatewayLogConfig != null) {
            this.GatewayLogConfig = new LogConfig(source.GatewayLogConfig);
        }
        if (source.GatewayConfig != null) {
            this.GatewayConfig = new GatewayConfig(source.GatewayConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceGroupId", this.ServiceGroupId);
        this.setParamSimple(map, prefix + "ServiceGroupName", this.ServiceGroupName);
        this.setParamSimple(map, prefix + "CreatedBy", this.CreatedBy);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "ServiceCount", this.ServiceCount);
        this.setParamSimple(map, prefix + "RunningServiceCount", this.RunningServiceCount);
        this.setParamArrayObj(map, prefix + "Services.", this.Services);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "LatestVersion", this.LatestVersion);
        this.setParamSimple(map, prefix + "BusinessStatus", this.BusinessStatus);
        this.setParamSimple(map, prefix + "BillingInfo", this.BillingInfo);
        this.setParamSimple(map, prefix + "CreateSource", this.CreateSource);
        this.setParamSimple(map, prefix + "WeightUpdateStatus", this.WeightUpdateStatus);
        this.setParamSimple(map, prefix + "ReplicasCount", this.ReplicasCount);
        this.setParamSimple(map, prefix + "AvailableReplicasCount", this.AvailableReplicasCount);
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AuthorizationEnable", this.AuthorizationEnable);
        this.setParamArrayObj(map, prefix + "AuthTokens.", this.AuthTokens);
        this.setParamSimple(map, prefix + "MonitorSource", this.MonitorSource);
        this.setParamSimple(map, prefix + "SubUinName", this.SubUinName);
        this.setParamObj(map, prefix + "GatewayLogConfig.", this.GatewayLogConfig);
        this.setParamObj(map, prefix + "GatewayConfig.", this.GatewayConfig);

    }
}

