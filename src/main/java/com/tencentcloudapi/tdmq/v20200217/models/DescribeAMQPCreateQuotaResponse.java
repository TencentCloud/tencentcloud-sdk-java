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

public class DescribeAMQPCreateQuotaResponse extends AbstractModel{

    /**
    * 租户总共可使用集群数量
    */
    @SerializedName("MaxClusterNum")
    @Expose
    private Long MaxClusterNum;

    /**
    * 租户已创建集群数量
    */
    @SerializedName("UsedClusterNum")
    @Expose
    private Long UsedClusterNum;

    /**
    * Exchange容量
    */
    @SerializedName("ExchangeCapacity")
    @Expose
    private Long ExchangeCapacity;

    /**
    * Queue容量
    */
    @SerializedName("QueueCapacity")
    @Expose
    private Long QueueCapacity;

    /**
    * 单Vhost TPS
    */
    @SerializedName("MaxTpsPerVHost")
    @Expose
    private Long MaxTpsPerVHost;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 租户总共可使用集群数量 
     * @return MaxClusterNum 租户总共可使用集群数量
     */
    public Long getMaxClusterNum() {
        return this.MaxClusterNum;
    }

    /**
     * Set 租户总共可使用集群数量
     * @param MaxClusterNum 租户总共可使用集群数量
     */
    public void setMaxClusterNum(Long MaxClusterNum) {
        this.MaxClusterNum = MaxClusterNum;
    }

    /**
     * Get 租户已创建集群数量 
     * @return UsedClusterNum 租户已创建集群数量
     */
    public Long getUsedClusterNum() {
        return this.UsedClusterNum;
    }

    /**
     * Set 租户已创建集群数量
     * @param UsedClusterNum 租户已创建集群数量
     */
    public void setUsedClusterNum(Long UsedClusterNum) {
        this.UsedClusterNum = UsedClusterNum;
    }

    /**
     * Get Exchange容量 
     * @return ExchangeCapacity Exchange容量
     */
    public Long getExchangeCapacity() {
        return this.ExchangeCapacity;
    }

    /**
     * Set Exchange容量
     * @param ExchangeCapacity Exchange容量
     */
    public void setExchangeCapacity(Long ExchangeCapacity) {
        this.ExchangeCapacity = ExchangeCapacity;
    }

    /**
     * Get Queue容量 
     * @return QueueCapacity Queue容量
     */
    public Long getQueueCapacity() {
        return this.QueueCapacity;
    }

    /**
     * Set Queue容量
     * @param QueueCapacity Queue容量
     */
    public void setQueueCapacity(Long QueueCapacity) {
        this.QueueCapacity = QueueCapacity;
    }

    /**
     * Get 单Vhost TPS 
     * @return MaxTpsPerVHost 单Vhost TPS
     */
    public Long getMaxTpsPerVHost() {
        return this.MaxTpsPerVHost;
    }

    /**
     * Set 单Vhost TPS
     * @param MaxTpsPerVHost 单Vhost TPS
     */
    public void setMaxTpsPerVHost(Long MaxTpsPerVHost) {
        this.MaxTpsPerVHost = MaxTpsPerVHost;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeAMQPCreateQuotaResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAMQPCreateQuotaResponse(DescribeAMQPCreateQuotaResponse source) {
        if (source.MaxClusterNum != null) {
            this.MaxClusterNum = new Long(source.MaxClusterNum);
        }
        if (source.UsedClusterNum != null) {
            this.UsedClusterNum = new Long(source.UsedClusterNum);
        }
        if (source.ExchangeCapacity != null) {
            this.ExchangeCapacity = new Long(source.ExchangeCapacity);
        }
        if (source.QueueCapacity != null) {
            this.QueueCapacity = new Long(source.QueueCapacity);
        }
        if (source.MaxTpsPerVHost != null) {
            this.MaxTpsPerVHost = new Long(source.MaxTpsPerVHost);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxClusterNum", this.MaxClusterNum);
        this.setParamSimple(map, prefix + "UsedClusterNum", this.UsedClusterNum);
        this.setParamSimple(map, prefix + "ExchangeCapacity", this.ExchangeCapacity);
        this.setParamSimple(map, prefix + "QueueCapacity", this.QueueCapacity);
        this.setParamSimple(map, prefix + "MaxTpsPerVHost", this.MaxTpsPerVHost);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

