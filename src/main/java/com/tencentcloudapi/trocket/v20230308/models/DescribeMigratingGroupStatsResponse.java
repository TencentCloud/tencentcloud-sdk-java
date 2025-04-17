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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMigratingGroupStatsResponse extends AbstractModel {

    /**
    * 源集群消费组堆积
    */
    @SerializedName("SourceConsumeLag")
    @Expose
    private Long SourceConsumeLag;

    /**
    * 目标集群消费组堆积
    */
    @SerializedName("TargetConsumeLag")
    @Expose
    private Long TargetConsumeLag;

    /**
    * 源集群连接客户端列表
    */
    @SerializedName("SourceConsumerClients")
    @Expose
    private ConsumerClient [] SourceConsumerClients;

    /**
    * 目标集群连接客户端列表
    */
    @SerializedName("TargetConsumerClients")
    @Expose
    private ConsumerClient [] TargetConsumerClients;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 源集群消费组堆积 
     * @return SourceConsumeLag 源集群消费组堆积
     */
    public Long getSourceConsumeLag() {
        return this.SourceConsumeLag;
    }

    /**
     * Set 源集群消费组堆积
     * @param SourceConsumeLag 源集群消费组堆积
     */
    public void setSourceConsumeLag(Long SourceConsumeLag) {
        this.SourceConsumeLag = SourceConsumeLag;
    }

    /**
     * Get 目标集群消费组堆积 
     * @return TargetConsumeLag 目标集群消费组堆积
     */
    public Long getTargetConsumeLag() {
        return this.TargetConsumeLag;
    }

    /**
     * Set 目标集群消费组堆积
     * @param TargetConsumeLag 目标集群消费组堆积
     */
    public void setTargetConsumeLag(Long TargetConsumeLag) {
        this.TargetConsumeLag = TargetConsumeLag;
    }

    /**
     * Get 源集群连接客户端列表 
     * @return SourceConsumerClients 源集群连接客户端列表
     */
    public ConsumerClient [] getSourceConsumerClients() {
        return this.SourceConsumerClients;
    }

    /**
     * Set 源集群连接客户端列表
     * @param SourceConsumerClients 源集群连接客户端列表
     */
    public void setSourceConsumerClients(ConsumerClient [] SourceConsumerClients) {
        this.SourceConsumerClients = SourceConsumerClients;
    }

    /**
     * Get 目标集群连接客户端列表 
     * @return TargetConsumerClients 目标集群连接客户端列表
     */
    public ConsumerClient [] getTargetConsumerClients() {
        return this.TargetConsumerClients;
    }

    /**
     * Set 目标集群连接客户端列表
     * @param TargetConsumerClients 目标集群连接客户端列表
     */
    public void setTargetConsumerClients(ConsumerClient [] TargetConsumerClients) {
        this.TargetConsumerClients = TargetConsumerClients;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeMigratingGroupStatsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMigratingGroupStatsResponse(DescribeMigratingGroupStatsResponse source) {
        if (source.SourceConsumeLag != null) {
            this.SourceConsumeLag = new Long(source.SourceConsumeLag);
        }
        if (source.TargetConsumeLag != null) {
            this.TargetConsumeLag = new Long(source.TargetConsumeLag);
        }
        if (source.SourceConsumerClients != null) {
            this.SourceConsumerClients = new ConsumerClient[source.SourceConsumerClients.length];
            for (int i = 0; i < source.SourceConsumerClients.length; i++) {
                this.SourceConsumerClients[i] = new ConsumerClient(source.SourceConsumerClients[i]);
            }
        }
        if (source.TargetConsumerClients != null) {
            this.TargetConsumerClients = new ConsumerClient[source.TargetConsumerClients.length];
            for (int i = 0; i < source.TargetConsumerClients.length; i++) {
                this.TargetConsumerClients[i] = new ConsumerClient(source.TargetConsumerClients[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceConsumeLag", this.SourceConsumeLag);
        this.setParamSimple(map, prefix + "TargetConsumeLag", this.TargetConsumeLag);
        this.setParamArrayObj(map, prefix + "SourceConsumerClients.", this.SourceConsumerClients);
        this.setParamArrayObj(map, prefix + "TargetConsumerClients.", this.TargetConsumerClients);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

