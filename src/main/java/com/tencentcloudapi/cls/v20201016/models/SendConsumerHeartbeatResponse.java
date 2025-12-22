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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendConsumerHeartbeatResponse extends AbstractModel {

    /**
    * 日志主题对应的消费组标识
    */
    @SerializedName("ConsumerGroup")
    @Expose
    private String ConsumerGroup;

    /**
    * 分区信息
    */
    @SerializedName("TopicPartitionsInfo")
    @Expose
    private TopicPartitionInfo [] TopicPartitionsInfo;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 日志主题对应的消费组标识 
     * @return ConsumerGroup 日志主题对应的消费组标识
     */
    public String getConsumerGroup() {
        return this.ConsumerGroup;
    }

    /**
     * Set 日志主题对应的消费组标识
     * @param ConsumerGroup 日志主题对应的消费组标识
     */
    public void setConsumerGroup(String ConsumerGroup) {
        this.ConsumerGroup = ConsumerGroup;
    }

    /**
     * Get 分区信息 
     * @return TopicPartitionsInfo 分区信息
     */
    public TopicPartitionInfo [] getTopicPartitionsInfo() {
        return this.TopicPartitionsInfo;
    }

    /**
     * Set 分区信息
     * @param TopicPartitionsInfo 分区信息
     */
    public void setTopicPartitionsInfo(TopicPartitionInfo [] TopicPartitionsInfo) {
        this.TopicPartitionsInfo = TopicPartitionsInfo;
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

    public SendConsumerHeartbeatResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendConsumerHeartbeatResponse(SendConsumerHeartbeatResponse source) {
        if (source.ConsumerGroup != null) {
            this.ConsumerGroup = new String(source.ConsumerGroup);
        }
        if (source.TopicPartitionsInfo != null) {
            this.TopicPartitionsInfo = new TopicPartitionInfo[source.TopicPartitionsInfo.length];
            for (int i = 0; i < source.TopicPartitionsInfo.length; i++) {
                this.TopicPartitionsInfo[i] = new TopicPartitionInfo(source.TopicPartitionsInfo[i]);
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
        this.setParamSimple(map, prefix + "ConsumerGroup", this.ConsumerGroup);
        this.setParamArrayObj(map, prefix + "TopicPartitionsInfo.", this.TopicPartitionsInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

