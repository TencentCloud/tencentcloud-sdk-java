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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAIGWCustomGuardrailPolicyResult extends AbstractModel {

    /**
    * <p>本次配置同步是否全部成功。即使云 API 未返回 Response.Error，仍须检查此值、SyncStatus 和 FailedResources。</p>
    */
    @SerializedName("Success")
    @Expose
    private Boolean Success;

    /**
    * <p>变更后的策略</p>
    */
    @SerializedName("Policy")
    @Expose
    private CustomGuardrailPolicy Policy;

    /**
    * <p>本次同步成功的业务资源引用；Modify 返回的不是严格的新增差集。</p>
    */
    @SerializedName("AddedResources")
    @Expose
    private CustomGuardrailResourceRef [] AddedResources;

    /**
    * <p>与修改前相比移除的 Route 绑定数量；一个业务资源可有多条 Route，因此不等于业务资源数量。</p>
    */
    @SerializedName("RemovedCount")
    @Expose
    private Long RemovedCount;

    /**
    * <p>失败资源及原因；非空表示配置同步仍需处理，不要因 HTTP 200 判定全部成功。</p>
    */
    @SerializedName("FailedResources")
    @Expose
    private CustomGuardrailSyncFailure [] FailedResources;

    /**
    * <p>同步状态：pending 待同步，synced 已完成本次配置同步，partial 部分失败，failed 失败。需结合 FailedResources/SyncError；synced 不等于已完成所有数据面实例的业务端到端验证。</p>
    */
    @SerializedName("SyncStatus")
    @Expose
    private String SyncStatus;

    /**
     * Get <p>本次配置同步是否全部成功。即使云 API 未返回 Response.Error，仍须检查此值、SyncStatus 和 FailedResources。</p> 
     * @return Success <p>本次配置同步是否全部成功。即使云 API 未返回 Response.Error，仍须检查此值、SyncStatus 和 FailedResources。</p>
     */
    public Boolean getSuccess() {
        return this.Success;
    }

    /**
     * Set <p>本次配置同步是否全部成功。即使云 API 未返回 Response.Error，仍须检查此值、SyncStatus 和 FailedResources。</p>
     * @param Success <p>本次配置同步是否全部成功。即使云 API 未返回 Response.Error，仍须检查此值、SyncStatus 和 FailedResources。</p>
     */
    public void setSuccess(Boolean Success) {
        this.Success = Success;
    }

    /**
     * Get <p>变更后的策略</p> 
     * @return Policy <p>变更后的策略</p>
     */
    public CustomGuardrailPolicy getPolicy() {
        return this.Policy;
    }

    /**
     * Set <p>变更后的策略</p>
     * @param Policy <p>变更后的策略</p>
     */
    public void setPolicy(CustomGuardrailPolicy Policy) {
        this.Policy = Policy;
    }

    /**
     * Get <p>本次同步成功的业务资源引用；Modify 返回的不是严格的新增差集。</p> 
     * @return AddedResources <p>本次同步成功的业务资源引用；Modify 返回的不是严格的新增差集。</p>
     */
    public CustomGuardrailResourceRef [] getAddedResources() {
        return this.AddedResources;
    }

    /**
     * Set <p>本次同步成功的业务资源引用；Modify 返回的不是严格的新增差集。</p>
     * @param AddedResources <p>本次同步成功的业务资源引用；Modify 返回的不是严格的新增差集。</p>
     */
    public void setAddedResources(CustomGuardrailResourceRef [] AddedResources) {
        this.AddedResources = AddedResources;
    }

    /**
     * Get <p>与修改前相比移除的 Route 绑定数量；一个业务资源可有多条 Route，因此不等于业务资源数量。</p> 
     * @return RemovedCount <p>与修改前相比移除的 Route 绑定数量；一个业务资源可有多条 Route，因此不等于业务资源数量。</p>
     */
    public Long getRemovedCount() {
        return this.RemovedCount;
    }

    /**
     * Set <p>与修改前相比移除的 Route 绑定数量；一个业务资源可有多条 Route，因此不等于业务资源数量。</p>
     * @param RemovedCount <p>与修改前相比移除的 Route 绑定数量；一个业务资源可有多条 Route，因此不等于业务资源数量。</p>
     */
    public void setRemovedCount(Long RemovedCount) {
        this.RemovedCount = RemovedCount;
    }

    /**
     * Get <p>失败资源及原因；非空表示配置同步仍需处理，不要因 HTTP 200 判定全部成功。</p> 
     * @return FailedResources <p>失败资源及原因；非空表示配置同步仍需处理，不要因 HTTP 200 判定全部成功。</p>
     */
    public CustomGuardrailSyncFailure [] getFailedResources() {
        return this.FailedResources;
    }

    /**
     * Set <p>失败资源及原因；非空表示配置同步仍需处理，不要因 HTTP 200 判定全部成功。</p>
     * @param FailedResources <p>失败资源及原因；非空表示配置同步仍需处理，不要因 HTTP 200 判定全部成功。</p>
     */
    public void setFailedResources(CustomGuardrailSyncFailure [] FailedResources) {
        this.FailedResources = FailedResources;
    }

    /**
     * Get <p>同步状态：pending 待同步，synced 已完成本次配置同步，partial 部分失败，failed 失败。需结合 FailedResources/SyncError；synced 不等于已完成所有数据面实例的业务端到端验证。</p> 
     * @return SyncStatus <p>同步状态：pending 待同步，synced 已完成本次配置同步，partial 部分失败，failed 失败。需结合 FailedResources/SyncError；synced 不等于已完成所有数据面实例的业务端到端验证。</p>
     */
    public String getSyncStatus() {
        return this.SyncStatus;
    }

    /**
     * Set <p>同步状态：pending 待同步，synced 已完成本次配置同步，partial 部分失败，failed 失败。需结合 FailedResources/SyncError；synced 不等于已完成所有数据面实例的业务端到端验证。</p>
     * @param SyncStatus <p>同步状态：pending 待同步，synced 已完成本次配置同步，partial 部分失败，failed 失败。需结合 FailedResources/SyncError；synced 不等于已完成所有数据面实例的业务端到端验证。</p>
     */
    public void setSyncStatus(String SyncStatus) {
        this.SyncStatus = SyncStatus;
    }

    public ModifyAIGWCustomGuardrailPolicyResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAIGWCustomGuardrailPolicyResult(ModifyAIGWCustomGuardrailPolicyResult source) {
        if (source.Success != null) {
            this.Success = new Boolean(source.Success);
        }
        if (source.Policy != null) {
            this.Policy = new CustomGuardrailPolicy(source.Policy);
        }
        if (source.AddedResources != null) {
            this.AddedResources = new CustomGuardrailResourceRef[source.AddedResources.length];
            for (int i = 0; i < source.AddedResources.length; i++) {
                this.AddedResources[i] = new CustomGuardrailResourceRef(source.AddedResources[i]);
            }
        }
        if (source.RemovedCount != null) {
            this.RemovedCount = new Long(source.RemovedCount);
        }
        if (source.FailedResources != null) {
            this.FailedResources = new CustomGuardrailSyncFailure[source.FailedResources.length];
            for (int i = 0; i < source.FailedResources.length; i++) {
                this.FailedResources[i] = new CustomGuardrailSyncFailure(source.FailedResources[i]);
            }
        }
        if (source.SyncStatus != null) {
            this.SyncStatus = new String(source.SyncStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Success", this.Success);
        this.setParamObj(map, prefix + "Policy.", this.Policy);
        this.setParamArrayObj(map, prefix + "AddedResources.", this.AddedResources);
        this.setParamSimple(map, prefix + "RemovedCount", this.RemovedCount);
        this.setParamArrayObj(map, prefix + "FailedResources.", this.FailedResources);
        this.setParamSimple(map, prefix + "SyncStatus", this.SyncStatus);

    }
}

