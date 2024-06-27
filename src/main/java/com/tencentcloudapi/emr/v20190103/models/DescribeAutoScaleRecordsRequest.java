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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAutoScaleRecordsRequest extends AbstractModel {

    /**
    * 实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 记录过滤参数，目前仅能为“StartTime”,“EndTime”和“StrategyName”。StartTime和EndTime支持2006-01-02 15:04:05 或者2006/01/02 15:04:05的时间格式
    */
    @SerializedName("Filters")
    @Expose
    private KeyValue [] Filters;

    /**
    * 分页参数。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页参数。最大支持100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 表示是自动(0)还是托管伸缩(1)
    */
    @SerializedName("RecordSource")
    @Expose
    private Long RecordSource;

    /**
     * Get 实例ID。 
     * @return InstanceId 实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。
     * @param InstanceId 实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 记录过滤参数，目前仅能为“StartTime”,“EndTime”和“StrategyName”。StartTime和EndTime支持2006-01-02 15:04:05 或者2006/01/02 15:04:05的时间格式 
     * @return Filters 记录过滤参数，目前仅能为“StartTime”,“EndTime”和“StrategyName”。StartTime和EndTime支持2006-01-02 15:04:05 或者2006/01/02 15:04:05的时间格式
     */
    public KeyValue [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 记录过滤参数，目前仅能为“StartTime”,“EndTime”和“StrategyName”。StartTime和EndTime支持2006-01-02 15:04:05 或者2006/01/02 15:04:05的时间格式
     * @param Filters 记录过滤参数，目前仅能为“StartTime”,“EndTime”和“StrategyName”。StartTime和EndTime支持2006-01-02 15:04:05 或者2006/01/02 15:04:05的时间格式
     */
    public void setFilters(KeyValue [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 分页参数。 
     * @return Offset 分页参数。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页参数。
     * @param Offset 分页参数。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页参数。最大支持100 
     * @return Limit 分页参数。最大支持100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页参数。最大支持100
     * @param Limit 分页参数。最大支持100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 表示是自动(0)还是托管伸缩(1) 
     * @return RecordSource 表示是自动(0)还是托管伸缩(1)
     */
    public Long getRecordSource() {
        return this.RecordSource;
    }

    /**
     * Set 表示是自动(0)还是托管伸缩(1)
     * @param RecordSource 表示是自动(0)还是托管伸缩(1)
     */
    public void setRecordSource(Long RecordSource) {
        this.RecordSource = RecordSource;
    }

    public DescribeAutoScaleRecordsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAutoScaleRecordsRequest(DescribeAutoScaleRecordsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Filters != null) {
            this.Filters = new KeyValue[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new KeyValue(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.RecordSource != null) {
            this.RecordSource = new Long(source.RecordSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "RecordSource", this.RecordSource);

    }
}

