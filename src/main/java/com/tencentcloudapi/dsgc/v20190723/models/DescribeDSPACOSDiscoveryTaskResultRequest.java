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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDSPACOSDiscoveryTaskResultRequest extends AbstractModel {

    /**
    * DSPA实例ID
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * 偏移量，默认值为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认值为20，最大值为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Array of Filter	此参数对外不可见。过滤数组。支持的Name：
BucketName 对象桶名
TaskID 任务ID，
TaskName 任务名，
DataSourceId：数据源ID，
ResourceRegion：资源所在地域
每项过滤条件最多支持5个。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get DSPA实例ID 
     * @return DspaId DSPA实例ID
     */
    public String getDspaId() {
        return this.DspaId;
    }

    /**
     * Set DSPA实例ID
     * @param DspaId DSPA实例ID
     */
    public void setDspaId(String DspaId) {
        this.DspaId = DspaId;
    }

    /**
     * Get 偏移量，默认值为0 
     * @return Offset 偏移量，默认值为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认值为0
     * @param Offset 偏移量，默认值为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认值为20，最大值为100 
     * @return Limit 返回数量，默认值为20，最大值为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认值为20，最大值为100
     * @param Limit 返回数量，默认值为20，最大值为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Array of Filter	此参数对外不可见。过滤数组。支持的Name：
BucketName 对象桶名
TaskID 任务ID，
TaskName 任务名，
DataSourceId：数据源ID，
ResourceRegion：资源所在地域
每项过滤条件最多支持5个。 
     * @return Filters Array of Filter	此参数对外不可见。过滤数组。支持的Name：
BucketName 对象桶名
TaskID 任务ID，
TaskName 任务名，
DataSourceId：数据源ID，
ResourceRegion：资源所在地域
每项过滤条件最多支持5个。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Array of Filter	此参数对外不可见。过滤数组。支持的Name：
BucketName 对象桶名
TaskID 任务ID，
TaskName 任务名，
DataSourceId：数据源ID，
ResourceRegion：资源所在地域
每项过滤条件最多支持5个。
     * @param Filters Array of Filter	此参数对外不可见。过滤数组。支持的Name：
BucketName 对象桶名
TaskID 任务ID，
TaskName 任务名，
DataSourceId：数据源ID，
ResourceRegion：资源所在地域
每项过滤条件最多支持5个。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeDSPACOSDiscoveryTaskResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDSPACOSDiscoveryTaskResultRequest(DescribeDSPACOSDiscoveryTaskResultRequest source) {
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

