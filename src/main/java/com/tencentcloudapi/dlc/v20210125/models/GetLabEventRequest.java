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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetLabEventRequest extends AbstractModel {

    /**
    * <p>数据实验室ID</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>每页数量</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>开始时间（毫秒时间戳）</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>结束时间（毫秒时间戳）</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>排序字段列表</p>
    */
    @SerializedName("SortFields")
    @Expose
    private SortField [] SortFields;

    /**
     * Get <p>数据实验室ID</p> 
     * @return Id <p>数据实验室ID</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>数据实验室ID</p>
     * @param Id <p>数据实验室ID</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>每页数量</p> 
     * @return PageSize <p>每页数量</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页数量</p>
     * @param PageSize <p>每页数量</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>开始时间（毫秒时间戳）</p> 
     * @return StartTime <p>开始时间（毫秒时间戳）</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间（毫秒时间戳）</p>
     * @param StartTime <p>开始时间（毫秒时间戳）</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间（毫秒时间戳）</p> 
     * @return EndTime <p>结束时间（毫秒时间戳）</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间（毫秒时间戳）</p>
     * @param EndTime <p>结束时间（毫秒时间戳）</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>排序字段列表</p> 
     * @return SortFields <p>排序字段列表</p>
     */
    public SortField [] getSortFields() {
        return this.SortFields;
    }

    /**
     * Set <p>排序字段列表</p>
     * @param SortFields <p>排序字段列表</p>
     */
    public void setSortFields(SortField [] SortFields) {
        this.SortFields = SortFields;
    }

    public GetLabEventRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetLabEventRequest(GetLabEventRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.SortFields != null) {
            this.SortFields = new SortField[source.SortFields.length];
            for (int i = 0; i < source.SortFields.length; i++) {
                this.SortFields[i] = new SortField(source.SortFields[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "SortFields.", this.SortFields);

    }
}

