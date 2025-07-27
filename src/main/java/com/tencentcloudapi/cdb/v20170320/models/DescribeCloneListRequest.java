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

public class DescribeCloneListRequest extends AbstractModel {

    /**
    * 查询指定源实例的克隆任务列表。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/api/236/15872) 接口获取实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 分页查询时的偏移量，默认值为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页查询时的每页条目数，默认值为20，建议最大取值100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 查询指定源实例的克隆任务列表。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/api/236/15872) 接口获取实例 ID。 
     * @return InstanceId 查询指定源实例的克隆任务列表。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/api/236/15872) 接口获取实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 查询指定源实例的克隆任务列表。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/api/236/15872) 接口获取实例 ID。
     * @param InstanceId 查询指定源实例的克隆任务列表。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/api/236/15872) 接口获取实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 分页查询时的偏移量，默认值为0。 
     * @return Offset 分页查询时的偏移量，默认值为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页查询时的偏移量，默认值为0。
     * @param Offset 分页查询时的偏移量，默认值为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页查询时的每页条目数，默认值为20，建议最大取值100。 
     * @return Limit 分页查询时的每页条目数，默认值为20，建议最大取值100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页查询时的每页条目数，默认值为20，建议最大取值100。
     * @param Limit 分页查询时的每页条目数，默认值为20，建议最大取值100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeCloneListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloneListRequest(DescribeCloneListRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
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
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

