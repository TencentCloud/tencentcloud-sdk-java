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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTagsOfInstanceIdsRequest extends AbstractModel {

    /**
    * 实例列表。实例 ID 可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。可传入的数组长度暂无限制。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 分页偏移量。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页大小。默认为15。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 实例列表。实例 ID 可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。可传入的数组长度暂无限制。 
     * @return InstanceIds 实例列表。实例 ID 可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。可传入的数组长度暂无限制。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 实例列表。实例 ID 可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。可传入的数组长度暂无限制。
     * @param InstanceIds 实例列表。实例 ID 可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。可传入的数组长度暂无限制。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 分页偏移量。 
     * @return Offset 分页偏移量。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量。
     * @param Offset 分页偏移量。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页大小。默认为15。 
     * @return Limit 分页大小。默认为15。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页大小。默认为15。
     * @param Limit 分页大小。默认为15。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeTagsOfInstanceIdsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTagsOfInstanceIdsRequest(DescribeTagsOfInstanceIdsRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
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
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

