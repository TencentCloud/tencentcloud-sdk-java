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

public class OverviewStats extends AbstractModel {

    /**
    * 应用节点状态
    */
    @SerializedName("ServiceStats")
    @Expose
    private TopologyNodeStats ServiceStats;

    /**
    * 数据库节点状态
    */
    @SerializedName("DatabaseStats")
    @Expose
    private TopologyNodeStats DatabaseStats;

    /**
    * 消息队列节点状态
    */
    @SerializedName("MQStats")
    @Expose
    private TopologyNodeStats MQStats;

    /**
    * 节点总数
    */
    @SerializedName("TotalNodes")
    @Expose
    private Long TotalNodes;

    /**
    * 健康节点总数
    */
    @SerializedName("HealthyNodes")
    @Expose
    private Long HealthyNodes;

    /**
    * 警告节点总数
    */
    @SerializedName("WarningNodes")
    @Expose
    private Long WarningNodes;

    /**
    * 错误节点总数
    */
    @SerializedName("ErrorNodes")
    @Expose
    private Long ErrorNodes;

    /**
     * Get 应用节点状态 
     * @return ServiceStats 应用节点状态
     */
    public TopologyNodeStats getServiceStats() {
        return this.ServiceStats;
    }

    /**
     * Set 应用节点状态
     * @param ServiceStats 应用节点状态
     */
    public void setServiceStats(TopologyNodeStats ServiceStats) {
        this.ServiceStats = ServiceStats;
    }

    /**
     * Get 数据库节点状态 
     * @return DatabaseStats 数据库节点状态
     */
    public TopologyNodeStats getDatabaseStats() {
        return this.DatabaseStats;
    }

    /**
     * Set 数据库节点状态
     * @param DatabaseStats 数据库节点状态
     */
    public void setDatabaseStats(TopologyNodeStats DatabaseStats) {
        this.DatabaseStats = DatabaseStats;
    }

    /**
     * Get 消息队列节点状态 
     * @return MQStats 消息队列节点状态
     */
    public TopologyNodeStats getMQStats() {
        return this.MQStats;
    }

    /**
     * Set 消息队列节点状态
     * @param MQStats 消息队列节点状态
     */
    public void setMQStats(TopologyNodeStats MQStats) {
        this.MQStats = MQStats;
    }

    /**
     * Get 节点总数 
     * @return TotalNodes 节点总数
     */
    public Long getTotalNodes() {
        return this.TotalNodes;
    }

    /**
     * Set 节点总数
     * @param TotalNodes 节点总数
     */
    public void setTotalNodes(Long TotalNodes) {
        this.TotalNodes = TotalNodes;
    }

    /**
     * Get 健康节点总数 
     * @return HealthyNodes 健康节点总数
     */
    public Long getHealthyNodes() {
        return this.HealthyNodes;
    }

    /**
     * Set 健康节点总数
     * @param HealthyNodes 健康节点总数
     */
    public void setHealthyNodes(Long HealthyNodes) {
        this.HealthyNodes = HealthyNodes;
    }

    /**
     * Get 警告节点总数 
     * @return WarningNodes 警告节点总数
     */
    public Long getWarningNodes() {
        return this.WarningNodes;
    }

    /**
     * Set 警告节点总数
     * @param WarningNodes 警告节点总数
     */
    public void setWarningNodes(Long WarningNodes) {
        this.WarningNodes = WarningNodes;
    }

    /**
     * Get 错误节点总数 
     * @return ErrorNodes 错误节点总数
     */
    public Long getErrorNodes() {
        return this.ErrorNodes;
    }

    /**
     * Set 错误节点总数
     * @param ErrorNodes 错误节点总数
     */
    public void setErrorNodes(Long ErrorNodes) {
        this.ErrorNodes = ErrorNodes;
    }

    public OverviewStats() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OverviewStats(OverviewStats source) {
        if (source.ServiceStats != null) {
            this.ServiceStats = new TopologyNodeStats(source.ServiceStats);
        }
        if (source.DatabaseStats != null) {
            this.DatabaseStats = new TopologyNodeStats(source.DatabaseStats);
        }
        if (source.MQStats != null) {
            this.MQStats = new TopologyNodeStats(source.MQStats);
        }
        if (source.TotalNodes != null) {
            this.TotalNodes = new Long(source.TotalNodes);
        }
        if (source.HealthyNodes != null) {
            this.HealthyNodes = new Long(source.HealthyNodes);
        }
        if (source.WarningNodes != null) {
            this.WarningNodes = new Long(source.WarningNodes);
        }
        if (source.ErrorNodes != null) {
            this.ErrorNodes = new Long(source.ErrorNodes);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ServiceStats.", this.ServiceStats);
        this.setParamObj(map, prefix + "DatabaseStats.", this.DatabaseStats);
        this.setParamObj(map, prefix + "MQStats.", this.MQStats);
        this.setParamSimple(map, prefix + "TotalNodes", this.TotalNodes);
        this.setParamSimple(map, prefix + "HealthyNodes", this.HealthyNodes);
        this.setParamSimple(map, prefix + "WarningNodes", this.WarningNodes);
        this.setParamSimple(map, prefix + "ErrorNodes", this.ErrorNodes);

    }
}

