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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRelatedServicesOnTraceRequest extends AbstractModel {

    /**
    * 业务系统 ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 查询开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 查询结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 应用名
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 是否为应用拓扑查询
    */
    @SerializedName("IsServiceTopology")
    @Expose
    private Boolean IsServiceTopology;

    /**
     * Get 业务系统 ID 
     * @return InstanceId 业务系统 ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 业务系统 ID
     * @param InstanceId 业务系统 ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 查询开始时间 
     * @return StartTime 查询开始时间
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询开始时间
     * @param StartTime 查询开始时间
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询结束时间 
     * @return EndTime 查询结束时间
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询结束时间
     * @param EndTime 查询结束时间
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 应用名 
     * @return ServiceName 应用名
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 应用名
     * @param ServiceName 应用名
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get 是否为应用拓扑查询 
     * @return IsServiceTopology 是否为应用拓扑查询
     */
    public Boolean getIsServiceTopology() {
        return this.IsServiceTopology;
    }

    /**
     * Set 是否为应用拓扑查询
     * @param IsServiceTopology 是否为应用拓扑查询
     */
    public void setIsServiceTopology(Boolean IsServiceTopology) {
        this.IsServiceTopology = IsServiceTopology;
    }

    public DescribeRelatedServicesOnTraceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRelatedServicesOnTraceRequest(DescribeRelatedServicesOnTraceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.IsServiceTopology != null) {
            this.IsServiceTopology = new Boolean(source.IsServiceTopology);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "IsServiceTopology", this.IsServiceTopology);

    }
}

