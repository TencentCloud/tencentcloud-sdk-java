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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMonitorMetricsRequest extends AbstractModel{

    /**
    * IECP边缘单元ID
    */
    @SerializedName("EdgeUnitId")
    @Expose
    private Long EdgeUnitId;

    /**
    * 查询维度
    */
    @SerializedName("QueryType")
    @Expose
    private String QueryType;

    /**
    * 起始时间Unix秒时间戳
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 终止时间Unix秒时间戳
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 步长（分钟）
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * 节点名称，查询节点监控时必填
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 命名空间，不填则默认为default
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Pod名称，查询Pod监控时必填
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * Workload名称，查询Workload监控时必填
    */
    @SerializedName("WorkloadName")
    @Expose
    private String WorkloadName;

    /**
     * Get IECP边缘单元ID 
     * @return EdgeUnitId IECP边缘单元ID
     */
    public Long getEdgeUnitId() {
        return this.EdgeUnitId;
    }

    /**
     * Set IECP边缘单元ID
     * @param EdgeUnitId IECP边缘单元ID
     */
    public void setEdgeUnitId(Long EdgeUnitId) {
        this.EdgeUnitId = EdgeUnitId;
    }

    /**
     * Get 查询维度 
     * @return QueryType 查询维度
     */
    public String getQueryType() {
        return this.QueryType;
    }

    /**
     * Set 查询维度
     * @param QueryType 查询维度
     */
    public void setQueryType(String QueryType) {
        this.QueryType = QueryType;
    }

    /**
     * Get 起始时间Unix秒时间戳 
     * @return StartTime 起始时间Unix秒时间戳
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间Unix秒时间戳
     * @param StartTime 起始时间Unix秒时间戳
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 终止时间Unix秒时间戳 
     * @return EndTime 终止时间Unix秒时间戳
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 终止时间Unix秒时间戳
     * @param EndTime 终止时间Unix秒时间戳
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 步长（分钟） 
     * @return Interval 步长（分钟）
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set 步长（分钟）
     * @param Interval 步长（分钟）
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 节点名称，查询节点监控时必填 
     * @return NodeName 节点名称，查询节点监控时必填
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 节点名称，查询节点监控时必填
     * @param NodeName 节点名称，查询节点监控时必填
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get 命名空间，不填则默认为default 
     * @return Namespace 命名空间，不填则默认为default
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间，不填则默认为default
     * @param Namespace 命名空间，不填则默认为default
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Pod名称，查询Pod监控时必填 
     * @return PodName Pod名称，查询Pod监控时必填
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set Pod名称，查询Pod监控时必填
     * @param PodName Pod名称，查询Pod监控时必填
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get Workload名称，查询Workload监控时必填 
     * @return WorkloadName Workload名称，查询Workload监控时必填
     */
    public String getWorkloadName() {
        return this.WorkloadName;
    }

    /**
     * Set Workload名称，查询Workload监控时必填
     * @param WorkloadName Workload名称，查询Workload监控时必填
     */
    public void setWorkloadName(String WorkloadName) {
        this.WorkloadName = WorkloadName;
    }

    public DescribeMonitorMetricsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMonitorMetricsRequest(DescribeMonitorMetricsRequest source) {
        if (source.EdgeUnitId != null) {
            this.EdgeUnitId = new Long(source.EdgeUnitId);
        }
        if (source.QueryType != null) {
            this.QueryType = new String(source.QueryType);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.WorkloadName != null) {
            this.WorkloadName = new String(source.WorkloadName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EdgeUnitId", this.EdgeUnitId);
        this.setParamSimple(map, prefix + "QueryType", this.QueryType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "WorkloadName", this.WorkloadName);

    }
}

