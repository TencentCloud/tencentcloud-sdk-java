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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RabbitMQClusterSpecInfo extends AbstractModel{

    /**
    * 集群规格名称
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * 节点数量
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * 峰值tps
    */
    @SerializedName("MaxTps")
    @Expose
    private Long MaxTps;

    /**
    * 峰值带宽。单位：mbps
    */
    @SerializedName("MaxBandWidth")
    @Expose
    private Long MaxBandWidth;

    /**
    * 存储容量。单位：GB
    */
    @SerializedName("MaxStorage")
    @Expose
    private Long MaxStorage;

    /**
    * 公网带宽tps。单位：Mbps
    */
    @SerializedName("PublicNetworkTps")
    @Expose
    private Long PublicNetworkTps;

    /**
     * Get 集群规格名称 
     * @return SpecName 集群规格名称
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set 集群规格名称
     * @param SpecName 集群规格名称
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get 节点数量 
     * @return NodeCount 节点数量
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set 节点数量
     * @param NodeCount 节点数量
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get 峰值tps 
     * @return MaxTps 峰值tps
     */
    public Long getMaxTps() {
        return this.MaxTps;
    }

    /**
     * Set 峰值tps
     * @param MaxTps 峰值tps
     */
    public void setMaxTps(Long MaxTps) {
        this.MaxTps = MaxTps;
    }

    /**
     * Get 峰值带宽。单位：mbps 
     * @return MaxBandWidth 峰值带宽。单位：mbps
     */
    public Long getMaxBandWidth() {
        return this.MaxBandWidth;
    }

    /**
     * Set 峰值带宽。单位：mbps
     * @param MaxBandWidth 峰值带宽。单位：mbps
     */
    public void setMaxBandWidth(Long MaxBandWidth) {
        this.MaxBandWidth = MaxBandWidth;
    }

    /**
     * Get 存储容量。单位：GB 
     * @return MaxStorage 存储容量。单位：GB
     */
    public Long getMaxStorage() {
        return this.MaxStorage;
    }

    /**
     * Set 存储容量。单位：GB
     * @param MaxStorage 存储容量。单位：GB
     */
    public void setMaxStorage(Long MaxStorage) {
        this.MaxStorage = MaxStorage;
    }

    /**
     * Get 公网带宽tps。单位：Mbps 
     * @return PublicNetworkTps 公网带宽tps。单位：Mbps
     */
    public Long getPublicNetworkTps() {
        return this.PublicNetworkTps;
    }

    /**
     * Set 公网带宽tps。单位：Mbps
     * @param PublicNetworkTps 公网带宽tps。单位：Mbps
     */
    public void setPublicNetworkTps(Long PublicNetworkTps) {
        this.PublicNetworkTps = PublicNetworkTps;
    }

    public RabbitMQClusterSpecInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQClusterSpecInfo(RabbitMQClusterSpecInfo source) {
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.MaxTps != null) {
            this.MaxTps = new Long(source.MaxTps);
        }
        if (source.MaxBandWidth != null) {
            this.MaxBandWidth = new Long(source.MaxBandWidth);
        }
        if (source.MaxStorage != null) {
            this.MaxStorage = new Long(source.MaxStorage);
        }
        if (source.PublicNetworkTps != null) {
            this.PublicNetworkTps = new Long(source.PublicNetworkTps);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "MaxTps", this.MaxTps);
        this.setParamSimple(map, prefix + "MaxBandWidth", this.MaxBandWidth);
        this.setParamSimple(map, prefix + "MaxStorage", this.MaxStorage);
        this.setParamSimple(map, prefix + "PublicNetworkTps", this.PublicNetworkTps);

    }
}

