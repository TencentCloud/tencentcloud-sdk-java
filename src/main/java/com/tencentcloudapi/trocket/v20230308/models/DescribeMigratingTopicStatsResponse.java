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

public class DescribeMigratingTopicStatsResponse extends AbstractModel {

    /**
    * 源集群的消费者数量
    */
    @SerializedName("SourceClusterConsumerCount")
    @Expose
    private Long SourceClusterConsumerCount;

    /**
    * 目标集群的消费者数量
    */
    @SerializedName("TargetClusterConsumerCount")
    @Expose
    private Long TargetClusterConsumerCount;

    /**
    * 源集群消费组列表
    */
    @SerializedName("SourceClusterConsumerGroups")
    @Expose
    private String [] SourceClusterConsumerGroups;

    /**
    * 目标集群消费组列表
    */
    @SerializedName("TargetClusterConsumerGroups")
    @Expose
    private String [] TargetClusterConsumerGroups;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 源集群的消费者数量 
     * @return SourceClusterConsumerCount 源集群的消费者数量
     */
    public Long getSourceClusterConsumerCount() {
        return this.SourceClusterConsumerCount;
    }

    /**
     * Set 源集群的消费者数量
     * @param SourceClusterConsumerCount 源集群的消费者数量
     */
    public void setSourceClusterConsumerCount(Long SourceClusterConsumerCount) {
        this.SourceClusterConsumerCount = SourceClusterConsumerCount;
    }

    /**
     * Get 目标集群的消费者数量 
     * @return TargetClusterConsumerCount 目标集群的消费者数量
     */
    public Long getTargetClusterConsumerCount() {
        return this.TargetClusterConsumerCount;
    }

    /**
     * Set 目标集群的消费者数量
     * @param TargetClusterConsumerCount 目标集群的消费者数量
     */
    public void setTargetClusterConsumerCount(Long TargetClusterConsumerCount) {
        this.TargetClusterConsumerCount = TargetClusterConsumerCount;
    }

    /**
     * Get 源集群消费组列表 
     * @return SourceClusterConsumerGroups 源集群消费组列表
     */
    public String [] getSourceClusterConsumerGroups() {
        return this.SourceClusterConsumerGroups;
    }

    /**
     * Set 源集群消费组列表
     * @param SourceClusterConsumerGroups 源集群消费组列表
     */
    public void setSourceClusterConsumerGroups(String [] SourceClusterConsumerGroups) {
        this.SourceClusterConsumerGroups = SourceClusterConsumerGroups;
    }

    /**
     * Get 目标集群消费组列表 
     * @return TargetClusterConsumerGroups 目标集群消费组列表
     */
    public String [] getTargetClusterConsumerGroups() {
        return this.TargetClusterConsumerGroups;
    }

    /**
     * Set 目标集群消费组列表
     * @param TargetClusterConsumerGroups 目标集群消费组列表
     */
    public void setTargetClusterConsumerGroups(String [] TargetClusterConsumerGroups) {
        this.TargetClusterConsumerGroups = TargetClusterConsumerGroups;
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

    public DescribeMigratingTopicStatsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMigratingTopicStatsResponse(DescribeMigratingTopicStatsResponse source) {
        if (source.SourceClusterConsumerCount != null) {
            this.SourceClusterConsumerCount = new Long(source.SourceClusterConsumerCount);
        }
        if (source.TargetClusterConsumerCount != null) {
            this.TargetClusterConsumerCount = new Long(source.TargetClusterConsumerCount);
        }
        if (source.SourceClusterConsumerGroups != null) {
            this.SourceClusterConsumerGroups = new String[source.SourceClusterConsumerGroups.length];
            for (int i = 0; i < source.SourceClusterConsumerGroups.length; i++) {
                this.SourceClusterConsumerGroups[i] = new String(source.SourceClusterConsumerGroups[i]);
            }
        }
        if (source.TargetClusterConsumerGroups != null) {
            this.TargetClusterConsumerGroups = new String[source.TargetClusterConsumerGroups.length];
            for (int i = 0; i < source.TargetClusterConsumerGroups.length; i++) {
                this.TargetClusterConsumerGroups[i] = new String(source.TargetClusterConsumerGroups[i]);
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
        this.setParamSimple(map, prefix + "SourceClusterConsumerCount", this.SourceClusterConsumerCount);
        this.setParamSimple(map, prefix + "TargetClusterConsumerCount", this.TargetClusterConsumerCount);
        this.setParamArraySimple(map, prefix + "SourceClusterConsumerGroups.", this.SourceClusterConsumerGroups);
        this.setParamArraySimple(map, prefix + "TargetClusterConsumerGroups.", this.TargetClusterConsumerGroups);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

