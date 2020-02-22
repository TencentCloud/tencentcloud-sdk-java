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
package com.tencentcloudapi.bmlb.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTrafficMirrorReceiversRequest extends AbstractModel{

    /**
    * 流量镜像实例ID。
    */
    @SerializedName("TrafficMirrorId")
    @Expose
    private String TrafficMirrorId;

    /**
    * 接收机黑石物理机实例ID数组。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 接收机接收端口数组。
    */
    @SerializedName("Ports")
    @Expose
    private Long [] Ports;

    /**
    * 接收机实例权重数组。
    */
    @SerializedName("Weights")
    @Expose
    private Long [] Weights;

    /**
    * 分页的偏移量，也即从第几条记录开始查询
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 单次查询返回的条目数，默认值：500。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 搜索instance或者alias
    */
    @SerializedName("VagueStr")
    @Expose
    private String VagueStr;

    /**
    * 搜索IP
    */
    @SerializedName("VagueIp")
    @Expose
    private String VagueIp;

    /**
     * Get 流量镜像实例ID。 
     * @return TrafficMirrorId 流量镜像实例ID。
     */
    public String getTrafficMirrorId() {
        return this.TrafficMirrorId;
    }

    /**
     * Set 流量镜像实例ID。
     * @param TrafficMirrorId 流量镜像实例ID。
     */
    public void setTrafficMirrorId(String TrafficMirrorId) {
        this.TrafficMirrorId = TrafficMirrorId;
    }

    /**
     * Get 接收机黑石物理机实例ID数组。 
     * @return InstanceIds 接收机黑石物理机实例ID数组。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 接收机黑石物理机实例ID数组。
     * @param InstanceIds 接收机黑石物理机实例ID数组。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 接收机接收端口数组。 
     * @return Ports 接收机接收端口数组。
     */
    public Long [] getPorts() {
        return this.Ports;
    }

    /**
     * Set 接收机接收端口数组。
     * @param Ports 接收机接收端口数组。
     */
    public void setPorts(Long [] Ports) {
        this.Ports = Ports;
    }

    /**
     * Get 接收机实例权重数组。 
     * @return Weights 接收机实例权重数组。
     */
    public Long [] getWeights() {
        return this.Weights;
    }

    /**
     * Set 接收机实例权重数组。
     * @param Weights 接收机实例权重数组。
     */
    public void setWeights(Long [] Weights) {
        this.Weights = Weights;
    }

    /**
     * Get 分页的偏移量，也即从第几条记录开始查询 
     * @return Offset 分页的偏移量，也即从第几条记录开始查询
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页的偏移量，也即从第几条记录开始查询
     * @param Offset 分页的偏移量，也即从第几条记录开始查询
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 单次查询返回的条目数，默认值：500。 
     * @return Limit 单次查询返回的条目数，默认值：500。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单次查询返回的条目数，默认值：500。
     * @param Limit 单次查询返回的条目数，默认值：500。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 搜索instance或者alias 
     * @return VagueStr 搜索instance或者alias
     */
    public String getVagueStr() {
        return this.VagueStr;
    }

    /**
     * Set 搜索instance或者alias
     * @param VagueStr 搜索instance或者alias
     */
    public void setVagueStr(String VagueStr) {
        this.VagueStr = VagueStr;
    }

    /**
     * Get 搜索IP 
     * @return VagueIp 搜索IP
     */
    public String getVagueIp() {
        return this.VagueIp;
    }

    /**
     * Set 搜索IP
     * @param VagueIp 搜索IP
     */
    public void setVagueIp(String VagueIp) {
        this.VagueIp = VagueIp;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TrafficMirrorId", this.TrafficMirrorId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArraySimple(map, prefix + "Ports.", this.Ports);
        this.setParamArraySimple(map, prefix + "Weights.", this.Weights);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "VagueStr", this.VagueStr);
        this.setParamSimple(map, prefix + "VagueIp", this.VagueIp);

    }
}

