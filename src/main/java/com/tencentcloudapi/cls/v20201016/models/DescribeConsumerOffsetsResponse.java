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

public class DescribeConsumerOffsetsResponse extends AbstractModel {

    /**
    * 消费者组标识
    */
    @SerializedName("ConsumerGroup")
    @Expose
    private String ConsumerGroup;

    /**
    * 消费点位信息
    */
    @SerializedName("TopicPartitionOffsetsInfo")
    @Expose
    private TopicPartitionOffsetInfo [] TopicPartitionOffsetsInfo;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 消费者组标识 
     * @return ConsumerGroup 消费者组标识
     */
    public String getConsumerGroup() {
        return this.ConsumerGroup;
    }

    /**
     * Set 消费者组标识
     * @param ConsumerGroup 消费者组标识
     */
    public void setConsumerGroup(String ConsumerGroup) {
        this.ConsumerGroup = ConsumerGroup;
    }

    /**
     * Get 消费点位信息 
     * @return TopicPartitionOffsetsInfo 消费点位信息
     */
    public TopicPartitionOffsetInfo [] getTopicPartitionOffsetsInfo() {
        return this.TopicPartitionOffsetsInfo;
    }

    /**
     * Set 消费点位信息
     * @param TopicPartitionOffsetsInfo 消费点位信息
     */
    public void setTopicPartitionOffsetsInfo(TopicPartitionOffsetInfo [] TopicPartitionOffsetsInfo) {
        this.TopicPartitionOffsetsInfo = TopicPartitionOffsetsInfo;
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

    public DescribeConsumerOffsetsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConsumerOffsetsResponse(DescribeConsumerOffsetsResponse source) {
        if (source.ConsumerGroup != null) {
            this.ConsumerGroup = new String(source.ConsumerGroup);
        }
        if (source.TopicPartitionOffsetsInfo != null) {
            this.TopicPartitionOffsetsInfo = new TopicPartitionOffsetInfo[source.TopicPartitionOffsetsInfo.length];
            for (int i = 0; i < source.TopicPartitionOffsetsInfo.length; i++) {
                this.TopicPartitionOffsetsInfo[i] = new TopicPartitionOffsetInfo(source.TopicPartitionOffsetsInfo[i]);
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
        this.setParamArrayObj(map, prefix + "TopicPartitionOffsetsInfo.", this.TopicPartitionOffsetsInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

