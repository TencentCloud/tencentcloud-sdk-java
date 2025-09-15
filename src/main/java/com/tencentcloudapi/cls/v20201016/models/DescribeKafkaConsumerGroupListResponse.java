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

public class DescribeKafkaConsumerGroupListResponse extends AbstractModel {

    /**
    * 日志主题名称
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * 日志集id
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * 总个数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 消费组信息列表
    */
    @SerializedName("Groups")
    @Expose
    private ConsumerGroup [] Groups;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 日志主题名称 
     * @return TopicName 日志主题名称
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 日志主题名称
     * @param TopicName 日志主题名称
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get 日志集id 
     * @return LogsetId 日志集id
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set 日志集id
     * @param LogsetId 日志集id
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get 总个数 
     * @return Total 总个数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总个数
     * @param Total 总个数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 消费组信息列表 
     * @return Groups 消费组信息列表
     */
    public ConsumerGroup [] getGroups() {
        return this.Groups;
    }

    /**
     * Set 消费组信息列表
     * @param Groups 消费组信息列表
     */
    public void setGroups(ConsumerGroup [] Groups) {
        this.Groups = Groups;
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

    public DescribeKafkaConsumerGroupListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKafkaConsumerGroupListResponse(DescribeKafkaConsumerGroupListResponse source) {
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Groups != null) {
            this.Groups = new ConsumerGroup[source.Groups.length];
            for (int i = 0; i < source.Groups.length; i++) {
                this.Groups[i] = new ConsumerGroup(source.Groups[i]);
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
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "Groups.", this.Groups);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

