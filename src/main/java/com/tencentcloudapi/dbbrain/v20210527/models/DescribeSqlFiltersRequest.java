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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSqlFiltersRequest extends AbstractModel{

    /**
    * 实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 任务ID列表，用于筛选任务列表。
    */
    @SerializedName("FilterIds")
    @Expose
    private Long [] FilterIds;

    /**
    * 任务状态列表，用于筛选任务列表，取值包括RUNNING - 运行中, FINISHED - 已完成, TERMINATED - 已终止。
    */
    @SerializedName("Statuses")
    @Expose
    private String [] Statuses;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为20，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

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
     * Get 任务ID列表，用于筛选任务列表。 
     * @return FilterIds 任务ID列表，用于筛选任务列表。
     */
    public Long [] getFilterIds() {
        return this.FilterIds;
    }

    /**
     * Set 任务ID列表，用于筛选任务列表。
     * @param FilterIds 任务ID列表，用于筛选任务列表。
     */
    public void setFilterIds(Long [] FilterIds) {
        this.FilterIds = FilterIds;
    }

    /**
     * Get 任务状态列表，用于筛选任务列表，取值包括RUNNING - 运行中, FINISHED - 已完成, TERMINATED - 已终止。 
     * @return Statuses 任务状态列表，用于筛选任务列表，取值包括RUNNING - 运行中, FINISHED - 已完成, TERMINATED - 已终止。
     */
    public String [] getStatuses() {
        return this.Statuses;
    }

    /**
     * Set 任务状态列表，用于筛选任务列表，取值包括RUNNING - 运行中, FINISHED - 已完成, TERMINATED - 已终止。
     * @param Statuses 任务状态列表，用于筛选任务列表，取值包括RUNNING - 运行中, FINISHED - 已完成, TERMINATED - 已终止。
     */
    public void setStatuses(String [] Statuses) {
        this.Statuses = Statuses;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为20，最大值为100。 
     * @return Limit 返回数量，默认为20，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。
     * @param Limit 返回数量，默认为20，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeSqlFiltersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSqlFiltersRequest(DescribeSqlFiltersRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.FilterIds != null) {
            this.FilterIds = new Long[source.FilterIds.length];
            for (int i = 0; i < source.FilterIds.length; i++) {
                this.FilterIds[i] = new Long(source.FilterIds[i]);
            }
        }
        if (source.Statuses != null) {
            this.Statuses = new String[source.Statuses.length];
            for (int i = 0; i < source.Statuses.length; i++) {
                this.Statuses[i] = new String(source.Statuses[i]);
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
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "FilterIds.", this.FilterIds);
        this.setParamArraySimple(map, prefix + "Statuses.", this.Statuses);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

