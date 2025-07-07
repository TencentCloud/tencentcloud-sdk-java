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

public class DescribeTaskMonitorInfosRequest extends AbstractModel {

    /**
    * 任务ID列表，上限50个
    */
    @SerializedName("TaskIdList")
    @Expose
    private String [] TaskIdList;

    /**
    * 引擎名称
    */
    @SerializedName("HouseName")
    @Expose
    private String HouseName;

    /**
    * 任务创建时间的起始时间
    */
    @SerializedName("CreateTimeStart")
    @Expose
    private String CreateTimeStart;

    /**
    * 任务创建时间的结束时间
    */
    @SerializedName("CreateTimeEnd")
    @Expose
    private String CreateTimeEnd;

    /**
    * 每一页条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 任务ID列表，上限50个 
     * @return TaskIdList 任务ID列表，上限50个
     */
    public String [] getTaskIdList() {
        return this.TaskIdList;
    }

    /**
     * Set 任务ID列表，上限50个
     * @param TaskIdList 任务ID列表，上限50个
     */
    public void setTaskIdList(String [] TaskIdList) {
        this.TaskIdList = TaskIdList;
    }

    /**
     * Get 引擎名称 
     * @return HouseName 引擎名称
     */
    public String getHouseName() {
        return this.HouseName;
    }

    /**
     * Set 引擎名称
     * @param HouseName 引擎名称
     */
    public void setHouseName(String HouseName) {
        this.HouseName = HouseName;
    }

    /**
     * Get 任务创建时间的起始时间 
     * @return CreateTimeStart 任务创建时间的起始时间
     */
    public String getCreateTimeStart() {
        return this.CreateTimeStart;
    }

    /**
     * Set 任务创建时间的起始时间
     * @param CreateTimeStart 任务创建时间的起始时间
     */
    public void setCreateTimeStart(String CreateTimeStart) {
        this.CreateTimeStart = CreateTimeStart;
    }

    /**
     * Get 任务创建时间的结束时间 
     * @return CreateTimeEnd 任务创建时间的结束时间
     */
    public String getCreateTimeEnd() {
        return this.CreateTimeEnd;
    }

    /**
     * Set 任务创建时间的结束时间
     * @param CreateTimeEnd 任务创建时间的结束时间
     */
    public void setCreateTimeEnd(String CreateTimeEnd) {
        this.CreateTimeEnd = CreateTimeEnd;
    }

    /**
     * Get 每一页条数 
     * @return Limit 每一页条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每一页条数
     * @param Limit 每一页条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeTaskMonitorInfosRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskMonitorInfosRequest(DescribeTaskMonitorInfosRequest source) {
        if (source.TaskIdList != null) {
            this.TaskIdList = new String[source.TaskIdList.length];
            for (int i = 0; i < source.TaskIdList.length; i++) {
                this.TaskIdList[i] = new String(source.TaskIdList[i]);
            }
        }
        if (source.HouseName != null) {
            this.HouseName = new String(source.HouseName);
        }
        if (source.CreateTimeStart != null) {
            this.CreateTimeStart = new String(source.CreateTimeStart);
        }
        if (source.CreateTimeEnd != null) {
            this.CreateTimeEnd = new String(source.CreateTimeEnd);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TaskIdList.", this.TaskIdList);
        this.setParamSimple(map, prefix + "HouseName", this.HouseName);
        this.setParamSimple(map, prefix + "CreateTimeStart", this.CreateTimeStart);
        this.setParamSimple(map, prefix + "CreateTimeEnd", this.CreateTimeEnd);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

