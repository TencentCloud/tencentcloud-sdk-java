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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GPUResource extends AbstractModel {

    /**
    * <p>GPU 资源 ID，与沙箱 InstanceId、底层 VM ID 不同。</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>所属 GPU 资源组 ID。</p>
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * <p>GPU资源状态，大小写敏感：Delivering（准备中）、Active（已生效）、Isolated（已隔离）、Destroying（释放中）。不返回 Destroyed 和补偿完成的 Failed。</p>
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * <p>占用状态，大小写敏感：Idle（可领取）、Allocating（领取中）、InUse（使用中）、Returning（归还中）、Unavailable（暂不可用）。不能根据 InstanceId 是否存在判断是否空闲。</p>
    */
    @SerializedName("AllocationState")
    @Expose
    private String AllocationState;

    /**
    * <p>已绑定的最终 AGS 沙箱实例 ID；尚未绑定或未占用时可能不返回。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>生效时间，未生效时可能不返回。</p>
    */
    @SerializedName("ActiveAt")
    @Expose
    private String ActiveAt;

    /**
    * <p>到期时间，未生效时可能不返回。</p>
    */
    @SerializedName("ExpireAt")
    @Expose
    private String ExpireAt;

    /**
    * <p>续费标记：0 不自动续费，1 自动续费，2 不再续费。</p>
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * <p>安全的状态原因标识；空串表示无额外原因，PhysicalUnavailable 表示物理状态不可用，BindingPending 表示绑定身份尚待确认。未知值应作状态确认中处理。</p>
    */
    @SerializedName("StatusReason")
    @Expose
    private String StatusReason;

    /**
     * Get <p>GPU 资源 ID，与沙箱 InstanceId、底层 VM ID 不同。</p> 
     * @return ResourceId <p>GPU 资源 ID，与沙箱 InstanceId、底层 VM ID 不同。</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>GPU 资源 ID，与沙箱 InstanceId、底层 VM ID 不同。</p>
     * @param ResourceId <p>GPU 资源 ID，与沙箱 InstanceId、底层 VM ID 不同。</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>所属 GPU 资源组 ID。</p> 
     * @return ResourceGroupId <p>所属 GPU 资源组 ID。</p>
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set <p>所属 GPU 资源组 ID。</p>
     * @param ResourceGroupId <p>所属 GPU 资源组 ID。</p>
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get <p>GPU资源状态，大小写敏感：Delivering（准备中）、Active（已生效）、Isolated（已隔离）、Destroying（释放中）。不返回 Destroyed 和补偿完成的 Failed。</p> 
     * @return State <p>GPU资源状态，大小写敏感：Delivering（准备中）、Active（已生效）、Isolated（已隔离）、Destroying（释放中）。不返回 Destroyed 和补偿完成的 Failed。</p>
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set <p>GPU资源状态，大小写敏感：Delivering（准备中）、Active（已生效）、Isolated（已隔离）、Destroying（释放中）。不返回 Destroyed 和补偿完成的 Failed。</p>
     * @param State <p>GPU资源状态，大小写敏感：Delivering（准备中）、Active（已生效）、Isolated（已隔离）、Destroying（释放中）。不返回 Destroyed 和补偿完成的 Failed。</p>
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get <p>占用状态，大小写敏感：Idle（可领取）、Allocating（领取中）、InUse（使用中）、Returning（归还中）、Unavailable（暂不可用）。不能根据 InstanceId 是否存在判断是否空闲。</p> 
     * @return AllocationState <p>占用状态，大小写敏感：Idle（可领取）、Allocating（领取中）、InUse（使用中）、Returning（归还中）、Unavailable（暂不可用）。不能根据 InstanceId 是否存在判断是否空闲。</p>
     */
    public String getAllocationState() {
        return this.AllocationState;
    }

    /**
     * Set <p>占用状态，大小写敏感：Idle（可领取）、Allocating（领取中）、InUse（使用中）、Returning（归还中）、Unavailable（暂不可用）。不能根据 InstanceId 是否存在判断是否空闲。</p>
     * @param AllocationState <p>占用状态，大小写敏感：Idle（可领取）、Allocating（领取中）、InUse（使用中）、Returning（归还中）、Unavailable（暂不可用）。不能根据 InstanceId 是否存在判断是否空闲。</p>
     */
    public void setAllocationState(String AllocationState) {
        this.AllocationState = AllocationState;
    }

    /**
     * Get <p>已绑定的最终 AGS 沙箱实例 ID；尚未绑定或未占用时可能不返回。</p> 
     * @return InstanceId <p>已绑定的最终 AGS 沙箱实例 ID；尚未绑定或未占用时可能不返回。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>已绑定的最终 AGS 沙箱实例 ID；尚未绑定或未占用时可能不返回。</p>
     * @param InstanceId <p>已绑定的最终 AGS 沙箱实例 ID；尚未绑定或未占用时可能不返回。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>生效时间，未生效时可能不返回。</p> 
     * @return ActiveAt <p>生效时间，未生效时可能不返回。</p>
     */
    public String getActiveAt() {
        return this.ActiveAt;
    }

    /**
     * Set <p>生效时间，未生效时可能不返回。</p>
     * @param ActiveAt <p>生效时间，未生效时可能不返回。</p>
     */
    public void setActiveAt(String ActiveAt) {
        this.ActiveAt = ActiveAt;
    }

    /**
     * Get <p>到期时间，未生效时可能不返回。</p> 
     * @return ExpireAt <p>到期时间，未生效时可能不返回。</p>
     */
    public String getExpireAt() {
        return this.ExpireAt;
    }

    /**
     * Set <p>到期时间，未生效时可能不返回。</p>
     * @param ExpireAt <p>到期时间，未生效时可能不返回。</p>
     */
    public void setExpireAt(String ExpireAt) {
        this.ExpireAt = ExpireAt;
    }

    /**
     * Get <p>续费标记：0 不自动续费，1 自动续费，2 不再续费。</p> 
     * @return RenewFlag <p>续费标记：0 不自动续费，1 自动续费，2 不再续费。</p>
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>续费标记：0 不自动续费，1 自动续费，2 不再续费。</p>
     * @param RenewFlag <p>续费标记：0 不自动续费，1 自动续费，2 不再续费。</p>
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>安全的状态原因标识；空串表示无额外原因，PhysicalUnavailable 表示物理状态不可用，BindingPending 表示绑定身份尚待确认。未知值应作状态确认中处理。</p> 
     * @return StatusReason <p>安全的状态原因标识；空串表示无额外原因，PhysicalUnavailable 表示物理状态不可用，BindingPending 表示绑定身份尚待确认。未知值应作状态确认中处理。</p>
     */
    public String getStatusReason() {
        return this.StatusReason;
    }

    /**
     * Set <p>安全的状态原因标识；空串表示无额外原因，PhysicalUnavailable 表示物理状态不可用，BindingPending 表示绑定身份尚待确认。未知值应作状态确认中处理。</p>
     * @param StatusReason <p>安全的状态原因标识；空串表示无额外原因，PhysicalUnavailable 表示物理状态不可用，BindingPending 表示绑定身份尚待确认。未知值应作状态确认中处理。</p>
     */
    public void setStatusReason(String StatusReason) {
        this.StatusReason = StatusReason;
    }

    public GPUResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GPUResource(GPUResource source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.AllocationState != null) {
            this.AllocationState = new String(source.AllocationState);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ActiveAt != null) {
            this.ActiveAt = new String(source.ActiveAt);
        }
        if (source.ExpireAt != null) {
            this.ExpireAt = new String(source.ExpireAt);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.StatusReason != null) {
            this.StatusReason = new String(source.StatusReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "AllocationState", this.AllocationState);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ActiveAt", this.ActiveAt);
        this.setParamSimple(map, prefix + "ExpireAt", this.ExpireAt);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "StatusReason", this.StatusReason);

    }
}

