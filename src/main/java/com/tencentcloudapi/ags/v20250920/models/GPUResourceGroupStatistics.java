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

public class GPUResourceGroupStatistics extends AbstractModel {

    /**
    * <p>组内当前资源总数，单位台；不含已销毁和补偿完成的失败资源。</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>Active、无占用且物理状态当前可领取的资源数量，单位台。</p>
    */
    @SerializedName("AvailableCount")
    @Expose
    private Long AvailableCount;

    /**
    * <p>仍被占用或绑定的资源数量，含领取中、使用中及归还未完成，单位台。</p>
    */
    @SerializedName("AllocatedCount")
    @Expose
    private Long AllocatedCount;

    /**
    * <p>资源状态计数，四项之和等于本组 TotalCount。</p>
    */
    @SerializedName("StateCounts")
    @Expose
    private GPUResourceStateCount StateCounts;

    /**
     * Get <p>组内当前资源总数，单位台；不含已销毁和补偿完成的失败资源。</p> 
     * @return TotalCount <p>组内当前资源总数，单位台；不含已销毁和补偿完成的失败资源。</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>组内当前资源总数，单位台；不含已销毁和补偿完成的失败资源。</p>
     * @param TotalCount <p>组内当前资源总数，单位台；不含已销毁和补偿完成的失败资源。</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>Active、无占用且物理状态当前可领取的资源数量，单位台。</p> 
     * @return AvailableCount <p>Active、无占用且物理状态当前可领取的资源数量，单位台。</p>
     */
    public Long getAvailableCount() {
        return this.AvailableCount;
    }

    /**
     * Set <p>Active、无占用且物理状态当前可领取的资源数量，单位台。</p>
     * @param AvailableCount <p>Active、无占用且物理状态当前可领取的资源数量，单位台。</p>
     */
    public void setAvailableCount(Long AvailableCount) {
        this.AvailableCount = AvailableCount;
    }

    /**
     * Get <p>仍被占用或绑定的资源数量，含领取中、使用中及归还未完成，单位台。</p> 
     * @return AllocatedCount <p>仍被占用或绑定的资源数量，含领取中、使用中及归还未完成，单位台。</p>
     */
    public Long getAllocatedCount() {
        return this.AllocatedCount;
    }

    /**
     * Set <p>仍被占用或绑定的资源数量，含领取中、使用中及归还未完成，单位台。</p>
     * @param AllocatedCount <p>仍被占用或绑定的资源数量，含领取中、使用中及归还未完成，单位台。</p>
     */
    public void setAllocatedCount(Long AllocatedCount) {
        this.AllocatedCount = AllocatedCount;
    }

    /**
     * Get <p>资源状态计数，四项之和等于本组 TotalCount。</p> 
     * @return StateCounts <p>资源状态计数，四项之和等于本组 TotalCount。</p>
     */
    public GPUResourceStateCount getStateCounts() {
        return this.StateCounts;
    }

    /**
     * Set <p>资源状态计数，四项之和等于本组 TotalCount。</p>
     * @param StateCounts <p>资源状态计数，四项之和等于本组 TotalCount。</p>
     */
    public void setStateCounts(GPUResourceStateCount StateCounts) {
        this.StateCounts = StateCounts;
    }

    public GPUResourceGroupStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GPUResourceGroupStatistics(GPUResourceGroupStatistics source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.AvailableCount != null) {
            this.AvailableCount = new Long(source.AvailableCount);
        }
        if (source.AllocatedCount != null) {
            this.AllocatedCount = new Long(source.AllocatedCount);
        }
        if (source.StateCounts != null) {
            this.StateCounts = new GPUResourceStateCount(source.StateCounts);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "AvailableCount", this.AvailableCount);
        this.setParamSimple(map, prefix + "AllocatedCount", this.AllocatedCount);
        this.setParamObj(map, prefix + "StateCounts.", this.StateCounts);

    }
}

