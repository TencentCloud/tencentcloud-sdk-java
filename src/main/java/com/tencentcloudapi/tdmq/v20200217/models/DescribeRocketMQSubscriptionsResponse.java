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

public class DescribeRocketMQSubscriptionsResponse extends AbstractModel {

    /**
    * 总条数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 订阅关系列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Subscriptions")
    @Expose
    private RocketMQSubscription [] Subscriptions;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总条数 
     * @return TotalCount 总条数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总条数
     * @param TotalCount 总条数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 订阅关系列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Subscriptions 订阅关系列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RocketMQSubscription [] getSubscriptions() {
        return this.Subscriptions;
    }

    /**
     * Set 订阅关系列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Subscriptions 订阅关系列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubscriptions(RocketMQSubscription [] Subscriptions) {
        this.Subscriptions = Subscriptions;
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

    public DescribeRocketMQSubscriptionsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRocketMQSubscriptionsResponse(DescribeRocketMQSubscriptionsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Subscriptions != null) {
            this.Subscriptions = new RocketMQSubscription[source.Subscriptions.length];
            for (int i = 0; i < source.Subscriptions.length; i++) {
                this.Subscriptions[i] = new RocketMQSubscription(source.Subscriptions[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Subscriptions.", this.Subscriptions);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

