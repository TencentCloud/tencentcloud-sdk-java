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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRocketMQConsumerConnectionsResponse extends AbstractModel {

    /**
    * 总数目
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 在线消费者信息
    */
    @SerializedName("Connections")
    @Expose
    private RocketMQConsumerConnection [] Connections;

    /**
    * 订阅组信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupDetail")
    @Expose
    private RocketMQGroup GroupDetail;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总数目 
     * @return TotalCount 总数目
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数目
     * @param TotalCount 总数目
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 在线消费者信息 
     * @return Connections 在线消费者信息
     */
    public RocketMQConsumerConnection [] getConnections() {
        return this.Connections;
    }

    /**
     * Set 在线消费者信息
     * @param Connections 在线消费者信息
     */
    public void setConnections(RocketMQConsumerConnection [] Connections) {
        this.Connections = Connections;
    }

    /**
     * Get 订阅组信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupDetail 订阅组信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RocketMQGroup getGroupDetail() {
        return this.GroupDetail;
    }

    /**
     * Set 订阅组信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupDetail 订阅组信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupDetail(RocketMQGroup GroupDetail) {
        this.GroupDetail = GroupDetail;
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

    public DescribeRocketMQConsumerConnectionsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRocketMQConsumerConnectionsResponse(DescribeRocketMQConsumerConnectionsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Connections != null) {
            this.Connections = new RocketMQConsumerConnection[source.Connections.length];
            for (int i = 0; i < source.Connections.length; i++) {
                this.Connections[i] = new RocketMQConsumerConnection(source.Connections[i]);
            }
        }
        if (source.GroupDetail != null) {
            this.GroupDetail = new RocketMQGroup(source.GroupDetail);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Connections.", this.Connections);
        this.setParamObj(map, prefix + "GroupDetail.", this.GroupDetail);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

