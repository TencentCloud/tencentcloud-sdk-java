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

public class DescribeGPUResourcesRequest extends AbstractModel {

    /**
    * <p>按资源组 ID 过滤，可省略，最多 64 字节。</p>
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * <p>按GPU资源 ID 过滤，最多 500 个，每个为非空字符串且最多 64 字节；值之间为 OR，与其他条件为 AND。</p>
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
    * <p>按GPU状态过滤，可省略。大小写敏感：Delivering、Active、Isolated、Destroying。</p>
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * <p>按占用状态过滤，可省略。大小写敏感：Idle、Allocating、InUse、Returning、Unavailable。</p>
    */
    @SerializedName("AllocationState")
    @Expose
    private String AllocationState;

    /**
    * <p>分页偏移量，默认为 0，必须大于等于 0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>每页条数，省略或传 0 时取 100；非零取值范围 1–500。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>按资源组 ID 过滤，可省略，最多 64 字节。</p> 
     * @return ResourceGroupId <p>按资源组 ID 过滤，可省略，最多 64 字节。</p>
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set <p>按资源组 ID 过滤，可省略，最多 64 字节。</p>
     * @param ResourceGroupId <p>按资源组 ID 过滤，可省略，最多 64 字节。</p>
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get <p>按GPU资源 ID 过滤，最多 500 个，每个为非空字符串且最多 64 字节；值之间为 OR，与其他条件为 AND。</p> 
     * @return ResourceIds <p>按GPU资源 ID 过滤，最多 500 个，每个为非空字符串且最多 64 字节；值之间为 OR，与其他条件为 AND。</p>
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set <p>按GPU资源 ID 过滤，最多 500 个，每个为非空字符串且最多 64 字节；值之间为 OR，与其他条件为 AND。</p>
     * @param ResourceIds <p>按GPU资源 ID 过滤，最多 500 个，每个为非空字符串且最多 64 字节；值之间为 OR，与其他条件为 AND。</p>
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get <p>按GPU状态过滤，可省略。大小写敏感：Delivering、Active、Isolated、Destroying。</p> 
     * @return State <p>按GPU状态过滤，可省略。大小写敏感：Delivering、Active、Isolated、Destroying。</p>
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set <p>按GPU状态过滤，可省略。大小写敏感：Delivering、Active、Isolated、Destroying。</p>
     * @param State <p>按GPU状态过滤，可省略。大小写敏感：Delivering、Active、Isolated、Destroying。</p>
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get <p>按占用状态过滤，可省略。大小写敏感：Idle、Allocating、InUse、Returning、Unavailable。</p> 
     * @return AllocationState <p>按占用状态过滤，可省略。大小写敏感：Idle、Allocating、InUse、Returning、Unavailable。</p>
     */
    public String getAllocationState() {
        return this.AllocationState;
    }

    /**
     * Set <p>按占用状态过滤，可省略。大小写敏感：Idle、Allocating、InUse、Returning、Unavailable。</p>
     * @param AllocationState <p>按占用状态过滤，可省略。大小写敏感：Idle、Allocating、InUse、Returning、Unavailable。</p>
     */
    public void setAllocationState(String AllocationState) {
        this.AllocationState = AllocationState;
    }

    /**
     * Get <p>分页偏移量，默认为 0，必须大于等于 0。</p> 
     * @return Offset <p>分页偏移量，默认为 0，必须大于等于 0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量，默认为 0，必须大于等于 0。</p>
     * @param Offset <p>分页偏移量，默认为 0，必须大于等于 0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>每页条数，省略或传 0 时取 100；非零取值范围 1–500。</p> 
     * @return Limit <p>每页条数，省略或传 0 时取 100；非零取值范围 1–500。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页条数，省略或传 0 时取 100；非零取值范围 1–500。</p>
     * @param Limit <p>每页条数，省略或传 0 时取 100；非零取值范围 1–500。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeGPUResourcesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGPUResourcesRequest(DescribeGPUResourcesRequest source) {
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
        if (source.ResourceIds != null) {
            this.ResourceIds = new String[source.ResourceIds.length];
            for (int i = 0; i < source.ResourceIds.length; i++) {
                this.ResourceIds[i] = new String(source.ResourceIds[i]);
            }
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.AllocationState != null) {
            this.AllocationState = new String(source.AllocationState);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "AllocationState", this.AllocationState);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

