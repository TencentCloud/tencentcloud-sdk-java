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

public class AMQPClusterConfig extends AbstractModel{

    /**
    * 单Vhost TPS上限
    */
    @SerializedName("MaxTpsPerVHost")
    @Expose
    private Long MaxTpsPerVHost;

    /**
    * 单Vhost客户端连接数上限
    */
    @SerializedName("MaxConnNumPerVHost")
    @Expose
    private Long MaxConnNumPerVHost;

    /**
    * 最大Vhost数量
    */
    @SerializedName("MaxVHostNum")
    @Expose
    private Long MaxVHostNum;

    /**
    * 最大exchange数量
    */
    @SerializedName("MaxExchangeNum")
    @Expose
    private Long MaxExchangeNum;

    /**
    * 最大Queue数量
    */
    @SerializedName("MaxQueueNum")
    @Expose
    private Long MaxQueueNum;

    /**
    * 消息最大保留时间，以毫秒为单位
    */
    @SerializedName("MaxRetentionTime")
    @Expose
    private Long MaxRetentionTime;

    /**
    * 已使用Vhost数量
    */
    @SerializedName("UsedVHostNum")
    @Expose
    private Long UsedVHostNum;

    /**
    * 已使用exchange数量
    */
    @SerializedName("UsedExchangeNum")
    @Expose
    private Long UsedExchangeNum;

    /**
    * 已使用queue数量
    */
    @SerializedName("UsedQueueNum")
    @Expose
    private Long UsedQueueNum;

    /**
     * Get 单Vhost TPS上限 
     * @return MaxTpsPerVHost 单Vhost TPS上限
     */
    public Long getMaxTpsPerVHost() {
        return this.MaxTpsPerVHost;
    }

    /**
     * Set 单Vhost TPS上限
     * @param MaxTpsPerVHost 单Vhost TPS上限
     */
    public void setMaxTpsPerVHost(Long MaxTpsPerVHost) {
        this.MaxTpsPerVHost = MaxTpsPerVHost;
    }

    /**
     * Get 单Vhost客户端连接数上限 
     * @return MaxConnNumPerVHost 单Vhost客户端连接数上限
     */
    public Long getMaxConnNumPerVHost() {
        return this.MaxConnNumPerVHost;
    }

    /**
     * Set 单Vhost客户端连接数上限
     * @param MaxConnNumPerVHost 单Vhost客户端连接数上限
     */
    public void setMaxConnNumPerVHost(Long MaxConnNumPerVHost) {
        this.MaxConnNumPerVHost = MaxConnNumPerVHost;
    }

    /**
     * Get 最大Vhost数量 
     * @return MaxVHostNum 最大Vhost数量
     */
    public Long getMaxVHostNum() {
        return this.MaxVHostNum;
    }

    /**
     * Set 最大Vhost数量
     * @param MaxVHostNum 最大Vhost数量
     */
    public void setMaxVHostNum(Long MaxVHostNum) {
        this.MaxVHostNum = MaxVHostNum;
    }

    /**
     * Get 最大exchange数量 
     * @return MaxExchangeNum 最大exchange数量
     */
    public Long getMaxExchangeNum() {
        return this.MaxExchangeNum;
    }

    /**
     * Set 最大exchange数量
     * @param MaxExchangeNum 最大exchange数量
     */
    public void setMaxExchangeNum(Long MaxExchangeNum) {
        this.MaxExchangeNum = MaxExchangeNum;
    }

    /**
     * Get 最大Queue数量 
     * @return MaxQueueNum 最大Queue数量
     */
    public Long getMaxQueueNum() {
        return this.MaxQueueNum;
    }

    /**
     * Set 最大Queue数量
     * @param MaxQueueNum 最大Queue数量
     */
    public void setMaxQueueNum(Long MaxQueueNum) {
        this.MaxQueueNum = MaxQueueNum;
    }

    /**
     * Get 消息最大保留时间，以毫秒为单位 
     * @return MaxRetentionTime 消息最大保留时间，以毫秒为单位
     */
    public Long getMaxRetentionTime() {
        return this.MaxRetentionTime;
    }

    /**
     * Set 消息最大保留时间，以毫秒为单位
     * @param MaxRetentionTime 消息最大保留时间，以毫秒为单位
     */
    public void setMaxRetentionTime(Long MaxRetentionTime) {
        this.MaxRetentionTime = MaxRetentionTime;
    }

    /**
     * Get 已使用Vhost数量 
     * @return UsedVHostNum 已使用Vhost数量
     */
    public Long getUsedVHostNum() {
        return this.UsedVHostNum;
    }

    /**
     * Set 已使用Vhost数量
     * @param UsedVHostNum 已使用Vhost数量
     */
    public void setUsedVHostNum(Long UsedVHostNum) {
        this.UsedVHostNum = UsedVHostNum;
    }

    /**
     * Get 已使用exchange数量 
     * @return UsedExchangeNum 已使用exchange数量
     */
    public Long getUsedExchangeNum() {
        return this.UsedExchangeNum;
    }

    /**
     * Set 已使用exchange数量
     * @param UsedExchangeNum 已使用exchange数量
     */
    public void setUsedExchangeNum(Long UsedExchangeNum) {
        this.UsedExchangeNum = UsedExchangeNum;
    }

    /**
     * Get 已使用queue数量 
     * @return UsedQueueNum 已使用queue数量
     */
    public Long getUsedQueueNum() {
        return this.UsedQueueNum;
    }

    /**
     * Set 已使用queue数量
     * @param UsedQueueNum 已使用queue数量
     */
    public void setUsedQueueNum(Long UsedQueueNum) {
        this.UsedQueueNum = UsedQueueNum;
    }

    public AMQPClusterConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AMQPClusterConfig(AMQPClusterConfig source) {
        if (source.MaxTpsPerVHost != null) {
            this.MaxTpsPerVHost = new Long(source.MaxTpsPerVHost);
        }
        if (source.MaxConnNumPerVHost != null) {
            this.MaxConnNumPerVHost = new Long(source.MaxConnNumPerVHost);
        }
        if (source.MaxVHostNum != null) {
            this.MaxVHostNum = new Long(source.MaxVHostNum);
        }
        if (source.MaxExchangeNum != null) {
            this.MaxExchangeNum = new Long(source.MaxExchangeNum);
        }
        if (source.MaxQueueNum != null) {
            this.MaxQueueNum = new Long(source.MaxQueueNum);
        }
        if (source.MaxRetentionTime != null) {
            this.MaxRetentionTime = new Long(source.MaxRetentionTime);
        }
        if (source.UsedVHostNum != null) {
            this.UsedVHostNum = new Long(source.UsedVHostNum);
        }
        if (source.UsedExchangeNum != null) {
            this.UsedExchangeNum = new Long(source.UsedExchangeNum);
        }
        if (source.UsedQueueNum != null) {
            this.UsedQueueNum = new Long(source.UsedQueueNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxTpsPerVHost", this.MaxTpsPerVHost);
        this.setParamSimple(map, prefix + "MaxConnNumPerVHost", this.MaxConnNumPerVHost);
        this.setParamSimple(map, prefix + "MaxVHostNum", this.MaxVHostNum);
        this.setParamSimple(map, prefix + "MaxExchangeNum", this.MaxExchangeNum);
        this.setParamSimple(map, prefix + "MaxQueueNum", this.MaxQueueNum);
        this.setParamSimple(map, prefix + "MaxRetentionTime", this.MaxRetentionTime);
        this.setParamSimple(map, prefix + "UsedVHostNum", this.UsedVHostNum);
        this.setParamSimple(map, prefix + "UsedExchangeNum", this.UsedExchangeNum);
        this.setParamSimple(map, prefix + "UsedQueueNum", this.UsedQueueNum);

    }
}

