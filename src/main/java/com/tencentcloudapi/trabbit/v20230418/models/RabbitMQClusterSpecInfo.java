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
package com.tencentcloudapi.trabbit.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RabbitMQClusterSpecInfo extends AbstractModel {

    /**
    * 集群规格名称
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * 峰值tps
    */
    @SerializedName("MaxTps")
    @Expose
    private Long MaxTps;

    /**
    * 最大队列数
    */
    @SerializedName("MaxQueueNum")
    @Expose
    private Long MaxQueueNum;

    /**
    * 最大交换机数
    */
    @SerializedName("MaxExchangeNum")
    @Expose
    private Long MaxExchangeNum;

    /**
    * 最大vhost数
    */
    @SerializedName("MaxVhostNum")
    @Expose
    private Long MaxVhostNum;

    /**
    * 最大连接数
    */
    @SerializedName("MaxConnNum")
    @Expose
    private Long MaxConnNum;

    /**
    * 最大用户数
    */
    @SerializedName("MaxUserNum")
    @Expose
    private Long MaxUserNum;

    /**
    * 峰值带宽，已废弃
    */
    @SerializedName("MaxBandWidth")
    @Expose
    private Long MaxBandWidth;

    /**
    * 公网带宽，已废弃
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
     * Get 最大队列数 
     * @return MaxQueueNum 最大队列数
     */
    public Long getMaxQueueNum() {
        return this.MaxQueueNum;
    }

    /**
     * Set 最大队列数
     * @param MaxQueueNum 最大队列数
     */
    public void setMaxQueueNum(Long MaxQueueNum) {
        this.MaxQueueNum = MaxQueueNum;
    }

    /**
     * Get 最大交换机数 
     * @return MaxExchangeNum 最大交换机数
     */
    public Long getMaxExchangeNum() {
        return this.MaxExchangeNum;
    }

    /**
     * Set 最大交换机数
     * @param MaxExchangeNum 最大交换机数
     */
    public void setMaxExchangeNum(Long MaxExchangeNum) {
        this.MaxExchangeNum = MaxExchangeNum;
    }

    /**
     * Get 最大vhost数 
     * @return MaxVhostNum 最大vhost数
     */
    public Long getMaxVhostNum() {
        return this.MaxVhostNum;
    }

    /**
     * Set 最大vhost数
     * @param MaxVhostNum 最大vhost数
     */
    public void setMaxVhostNum(Long MaxVhostNum) {
        this.MaxVhostNum = MaxVhostNum;
    }

    /**
     * Get 最大连接数 
     * @return MaxConnNum 最大连接数
     */
    public Long getMaxConnNum() {
        return this.MaxConnNum;
    }

    /**
     * Set 最大连接数
     * @param MaxConnNum 最大连接数
     */
    public void setMaxConnNum(Long MaxConnNum) {
        this.MaxConnNum = MaxConnNum;
    }

    /**
     * Get 最大用户数 
     * @return MaxUserNum 最大用户数
     */
    public Long getMaxUserNum() {
        return this.MaxUserNum;
    }

    /**
     * Set 最大用户数
     * @param MaxUserNum 最大用户数
     */
    public void setMaxUserNum(Long MaxUserNum) {
        this.MaxUserNum = MaxUserNum;
    }

    /**
     * Get 峰值带宽，已废弃 
     * @return MaxBandWidth 峰值带宽，已废弃
     */
    public Long getMaxBandWidth() {
        return this.MaxBandWidth;
    }

    /**
     * Set 峰值带宽，已废弃
     * @param MaxBandWidth 峰值带宽，已废弃
     */
    public void setMaxBandWidth(Long MaxBandWidth) {
        this.MaxBandWidth = MaxBandWidth;
    }

    /**
     * Get 公网带宽，已废弃 
     * @return PublicNetworkTps 公网带宽，已废弃
     */
    public Long getPublicNetworkTps() {
        return this.PublicNetworkTps;
    }

    /**
     * Set 公网带宽，已废弃
     * @param PublicNetworkTps 公网带宽，已废弃
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
        if (source.MaxTps != null) {
            this.MaxTps = new Long(source.MaxTps);
        }
        if (source.MaxQueueNum != null) {
            this.MaxQueueNum = new Long(source.MaxQueueNum);
        }
        if (source.MaxExchangeNum != null) {
            this.MaxExchangeNum = new Long(source.MaxExchangeNum);
        }
        if (source.MaxVhostNum != null) {
            this.MaxVhostNum = new Long(source.MaxVhostNum);
        }
        if (source.MaxConnNum != null) {
            this.MaxConnNum = new Long(source.MaxConnNum);
        }
        if (source.MaxUserNum != null) {
            this.MaxUserNum = new Long(source.MaxUserNum);
        }
        if (source.MaxBandWidth != null) {
            this.MaxBandWidth = new Long(source.MaxBandWidth);
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
        this.setParamSimple(map, prefix + "MaxTps", this.MaxTps);
        this.setParamSimple(map, prefix + "MaxQueueNum", this.MaxQueueNum);
        this.setParamSimple(map, prefix + "MaxExchangeNum", this.MaxExchangeNum);
        this.setParamSimple(map, prefix + "MaxVhostNum", this.MaxVhostNum);
        this.setParamSimple(map, prefix + "MaxConnNum", this.MaxConnNum);
        this.setParamSimple(map, prefix + "MaxUserNum", this.MaxUserNum);
        this.setParamSimple(map, prefix + "MaxBandWidth", this.MaxBandWidth);
        this.setParamSimple(map, prefix + "PublicNetworkTps", this.PublicNetworkTps);

    }
}

