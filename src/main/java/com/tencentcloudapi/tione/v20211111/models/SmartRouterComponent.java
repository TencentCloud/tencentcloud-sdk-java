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

public class SmartRouterComponent extends AbstractModel {

    /**
    * <p>组件名称：{ServiceGroupId}-gateway / {ServiceGroupId}-scheduler</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>组件类型：&quot;Gateway&quot; / &quot;Scheduler&quot;</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>组件镜像（从 K8s Deployment 实时查询）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageInfo")
    @Expose
    private ImageInfo ImageInfo;

    /**
    * <p>期望配置（Replicas/Cpu/Memory/Env）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceConfig")
    @Expose
    private SmartRouterResourceConfig ResourceConfig;

    /**
    * <p>组件状态：CREATING 创建中 / CREATE_FAILED 创建失败 / Normal 正常运行中 / Stopped 已停止 / Stopping 停止中 / Abnormal 异常 / Pending 启动中 / Waiting 就绪中</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>资源规格（查询时回显用户创建/修改时的资源选择）。公有云场景展示：ChargeType / Zone / ResourceSupplyAttribute；内网版场景展示：QueueId</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceSpec")
    @Expose
    private SmartRouterResourceSpec ResourceSpec;

    /**
    * <p>业务状态（组件级计费状态，Gateway/Scheduler 独立判定）：Billing 计费中 / Normal 正常（未计费或已停止计费）/ WhitelistUsing 白名单使用中（免计费）</p>
    */
    @SerializedName("BusinessStatus")
    @Expose
    private String BusinessStatus;

    /**
    * <p>费用信息（组件级计费明细 JSON 字符串，格式与 Service.BillingInfo 一致，前端可复用同一渲染逻辑）</p>
    */
    @SerializedName("BillingInfo")
    @Expose
    private String BillingInfo;

    /**
     * Get <p>组件名称：{ServiceGroupId}-gateway / {ServiceGroupId}-scheduler</p> 
     * @return Name <p>组件名称：{ServiceGroupId}-gateway / {ServiceGroupId}-scheduler</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>组件名称：{ServiceGroupId}-gateway / {ServiceGroupId}-scheduler</p>
     * @param Name <p>组件名称：{ServiceGroupId}-gateway / {ServiceGroupId}-scheduler</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>组件类型：&quot;Gateway&quot; / &quot;Scheduler&quot;</p> 
     * @return Type <p>组件类型：&quot;Gateway&quot; / &quot;Scheduler&quot;</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>组件类型：&quot;Gateway&quot; / &quot;Scheduler&quot;</p>
     * @param Type <p>组件类型：&quot;Gateway&quot; / &quot;Scheduler&quot;</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>组件镜像（从 K8s Deployment 实时查询）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageInfo <p>组件镜像（从 K8s Deployment 实时查询）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageInfo getImageInfo() {
        return this.ImageInfo;
    }

    /**
     * Set <p>组件镜像（从 K8s Deployment 实时查询）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageInfo <p>组件镜像（从 K8s Deployment 实时查询）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageInfo(ImageInfo ImageInfo) {
        this.ImageInfo = ImageInfo;
    }

    /**
     * Get <p>期望配置（Replicas/Cpu/Memory/Env）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceConfig <p>期望配置（Replicas/Cpu/Memory/Env）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SmartRouterResourceConfig getResourceConfig() {
        return this.ResourceConfig;
    }

    /**
     * Set <p>期望配置（Replicas/Cpu/Memory/Env）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceConfig <p>期望配置（Replicas/Cpu/Memory/Env）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceConfig(SmartRouterResourceConfig ResourceConfig) {
        this.ResourceConfig = ResourceConfig;
    }

    /**
     * Get <p>组件状态：CREATING 创建中 / CREATE_FAILED 创建失败 / Normal 正常运行中 / Stopped 已停止 / Stopping 停止中 / Abnormal 异常 / Pending 启动中 / Waiting 就绪中</p> 
     * @return Status <p>组件状态：CREATING 创建中 / CREATE_FAILED 创建失败 / Normal 正常运行中 / Stopped 已停止 / Stopping 停止中 / Abnormal 异常 / Pending 启动中 / Waiting 就绪中</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>组件状态：CREATING 创建中 / CREATE_FAILED 创建失败 / Normal 正常运行中 / Stopped 已停止 / Stopping 停止中 / Abnormal 异常 / Pending 启动中 / Waiting 就绪中</p>
     * @param Status <p>组件状态：CREATING 创建中 / CREATE_FAILED 创建失败 / Normal 正常运行中 / Stopped 已停止 / Stopping 停止中 / Abnormal 异常 / Pending 启动中 / Waiting 就绪中</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>资源规格（查询时回显用户创建/修改时的资源选择）。公有云场景展示：ChargeType / Zone / ResourceSupplyAttribute；内网版场景展示：QueueId</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceSpec <p>资源规格（查询时回显用户创建/修改时的资源选择）。公有云场景展示：ChargeType / Zone / ResourceSupplyAttribute；内网版场景展示：QueueId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SmartRouterResourceSpec getResourceSpec() {
        return this.ResourceSpec;
    }

    /**
     * Set <p>资源规格（查询时回显用户创建/修改时的资源选择）。公有云场景展示：ChargeType / Zone / ResourceSupplyAttribute；内网版场景展示：QueueId</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceSpec <p>资源规格（查询时回显用户创建/修改时的资源选择）。公有云场景展示：ChargeType / Zone / ResourceSupplyAttribute；内网版场景展示：QueueId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceSpec(SmartRouterResourceSpec ResourceSpec) {
        this.ResourceSpec = ResourceSpec;
    }

    /**
     * Get <p>业务状态（组件级计费状态，Gateway/Scheduler 独立判定）：Billing 计费中 / Normal 正常（未计费或已停止计费）/ WhitelistUsing 白名单使用中（免计费）</p> 
     * @return BusinessStatus <p>业务状态（组件级计费状态，Gateway/Scheduler 独立判定）：Billing 计费中 / Normal 正常（未计费或已停止计费）/ WhitelistUsing 白名单使用中（免计费）</p>
     */
    public String getBusinessStatus() {
        return this.BusinessStatus;
    }

    /**
     * Set <p>业务状态（组件级计费状态，Gateway/Scheduler 独立判定）：Billing 计费中 / Normal 正常（未计费或已停止计费）/ WhitelistUsing 白名单使用中（免计费）</p>
     * @param BusinessStatus <p>业务状态（组件级计费状态，Gateway/Scheduler 独立判定）：Billing 计费中 / Normal 正常（未计费或已停止计费）/ WhitelistUsing 白名单使用中（免计费）</p>
     */
    public void setBusinessStatus(String BusinessStatus) {
        this.BusinessStatus = BusinessStatus;
    }

    /**
     * Get <p>费用信息（组件级计费明细 JSON 字符串，格式与 Service.BillingInfo 一致，前端可复用同一渲染逻辑）</p> 
     * @return BillingInfo <p>费用信息（组件级计费明细 JSON 字符串，格式与 Service.BillingInfo 一致，前端可复用同一渲染逻辑）</p>
     */
    public String getBillingInfo() {
        return this.BillingInfo;
    }

    /**
     * Set <p>费用信息（组件级计费明细 JSON 字符串，格式与 Service.BillingInfo 一致，前端可复用同一渲染逻辑）</p>
     * @param BillingInfo <p>费用信息（组件级计费明细 JSON 字符串，格式与 Service.BillingInfo 一致，前端可复用同一渲染逻辑）</p>
     */
    public void setBillingInfo(String BillingInfo) {
        this.BillingInfo = BillingInfo;
    }

    public SmartRouterComponent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartRouterComponent(SmartRouterComponent source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ImageInfo != null) {
            this.ImageInfo = new ImageInfo(source.ImageInfo);
        }
        if (source.ResourceConfig != null) {
            this.ResourceConfig = new SmartRouterResourceConfig(source.ResourceConfig);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ResourceSpec != null) {
            this.ResourceSpec = new SmartRouterResourceSpec(source.ResourceSpec);
        }
        if (source.BusinessStatus != null) {
            this.BusinessStatus = new String(source.BusinessStatus);
        }
        if (source.BillingInfo != null) {
            this.BillingInfo = new String(source.BillingInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "ImageInfo.", this.ImageInfo);
        this.setParamObj(map, prefix + "ResourceConfig.", this.ResourceConfig);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "ResourceSpec.", this.ResourceSpec);
        this.setParamSimple(map, prefix + "BusinessStatus", this.BusinessStatus);
        this.setParamSimple(map, prefix + "BillingInfo", this.BillingInfo);

    }
}

