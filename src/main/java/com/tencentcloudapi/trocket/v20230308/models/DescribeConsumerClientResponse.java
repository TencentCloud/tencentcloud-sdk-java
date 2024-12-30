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

public class DescribeConsumerClientResponse extends AbstractModel {

    /**
    * 客户端详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Client")
    @Expose
    private ConsumerClient Client;

    /**
    * 主题消费信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicList")
    @Expose
    private TopicConsumeStats [] TopicList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 客户端详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Client 客户端详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConsumerClient getClient() {
        return this.Client;
    }

    /**
     * Set 客户端详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param Client 客户端详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClient(ConsumerClient Client) {
        this.Client = Client;
    }

    /**
     * Get 主题消费信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicList 主题消费信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TopicConsumeStats [] getTopicList() {
        return this.TopicList;
    }

    /**
     * Set 主题消费信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicList 主题消费信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicList(TopicConsumeStats [] TopicList) {
        this.TopicList = TopicList;
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

    public DescribeConsumerClientResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConsumerClientResponse(DescribeConsumerClientResponse source) {
        if (source.Client != null) {
            this.Client = new ConsumerClient(source.Client);
        }
        if (source.TopicList != null) {
            this.TopicList = new TopicConsumeStats[source.TopicList.length];
            for (int i = 0; i < source.TopicList.length; i++) {
                this.TopicList[i] = new TopicConsumeStats(source.TopicList[i]);
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
        this.setParamObj(map, prefix + "Client.", this.Client);
        this.setParamArrayObj(map, prefix + "TopicList.", this.TopicList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

