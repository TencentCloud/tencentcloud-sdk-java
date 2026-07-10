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

public class DescribeDataEngineEventsRequest extends AbstractModel {

    /**
    * <p>虚拟集群名称</p>
    */
    @SerializedName("DataEngineName")
    @Expose
    private String DataEngineName;

    /**
    * <p>返回数量，默认为10，最大为100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>偏移量，默认为0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>资源组id</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>查询开始时间，用于筛选资源组启停事件的时间范围，不传则不限制开始时间</p><p>参数格式：YYYY-mm-dd HH:MM:SS</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>查询结束时间，用于筛选资源组启停事件的时间范围，不传则不限制结束时间。需大于等于 StartTime</p><p>参数格式：YYYY-mm-dd HH:MM:SS</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get <p>虚拟集群名称</p> 
     * @return DataEngineName <p>虚拟集群名称</p>
     */
    public String getDataEngineName() {
        return this.DataEngineName;
    }

    /**
     * Set <p>虚拟集群名称</p>
     * @param DataEngineName <p>虚拟集群名称</p>
     */
    public void setDataEngineName(String DataEngineName) {
        this.DataEngineName = DataEngineName;
    }

    /**
     * Get <p>返回数量，默认为10，最大为100</p> 
     * @return Limit <p>返回数量，默认为10，最大为100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量，默认为10，最大为100</p>
     * @param Limit <p>返回数量，默认为10，最大为100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>偏移量，默认为0</p> 
     * @return Offset <p>偏移量，默认为0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认为0</p>
     * @param Offset <p>偏移量，默认为0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>资源组id</p> 
     * @return SessionId <p>资源组id</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>资源组id</p>
     * @param SessionId <p>资源组id</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>查询开始时间，用于筛选资源组启停事件的时间范围，不传则不限制开始时间</p><p>参数格式：YYYY-mm-dd HH:MM:SS</p> 
     * @return StartTime <p>查询开始时间，用于筛选资源组启停事件的时间范围，不传则不限制开始时间</p><p>参数格式：YYYY-mm-dd HH:MM:SS</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>查询开始时间，用于筛选资源组启停事件的时间范围，不传则不限制开始时间</p><p>参数格式：YYYY-mm-dd HH:MM:SS</p>
     * @param StartTime <p>查询开始时间，用于筛选资源组启停事件的时间范围，不传则不限制开始时间</p><p>参数格式：YYYY-mm-dd HH:MM:SS</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>查询结束时间，用于筛选资源组启停事件的时间范围，不传则不限制结束时间。需大于等于 StartTime</p><p>参数格式：YYYY-mm-dd HH:MM:SS</p> 
     * @return EndTime <p>查询结束时间，用于筛选资源组启停事件的时间范围，不传则不限制结束时间。需大于等于 StartTime</p><p>参数格式：YYYY-mm-dd HH:MM:SS</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>查询结束时间，用于筛选资源组启停事件的时间范围，不传则不限制结束时间。需大于等于 StartTime</p><p>参数格式：YYYY-mm-dd HH:MM:SS</p>
     * @param EndTime <p>查询结束时间，用于筛选资源组启停事件的时间范围，不传则不限制结束时间。需大于等于 StartTime</p><p>参数格式：YYYY-mm-dd HH:MM:SS</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeDataEngineEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDataEngineEventsRequest(DescribeDataEngineEventsRequest source) {
        if (source.DataEngineName != null) {
            this.DataEngineName = new String(source.DataEngineName);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataEngineName", this.DataEngineName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

