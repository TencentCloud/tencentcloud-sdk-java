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

public class DoHealthCheckOnMigratingTopicResponse extends AbstractModel {

    /**
    * 是否通过	
    */
    @SerializedName("Passed")
    @Expose
    private Boolean Passed;

    /**
    * 健康检查返回的错误信息
NotChecked 未执行检查， 
Unknown 未知错误, 
TopicNotImported 主题未导入,
TopicNotExistsInSourceCluster 主题在源集群中不存在, 
TopicNotExistsInTargetCluster 主题在目标集群中不存在, 
ConsumerConnectedOnTarget 目标集群上存在消费者连接, 
SourceTopicHasNewMessagesIn5Minutes 源集群主题前5分钟内有新消息写入, 
TargetTopicHasNewMessagesIn5Minutes 目标集群主题前5分钟内有新消息写入, 
SourceTopicHasNoMessagesIn5Minutes 源集群前5分钟内没有新消息写入, 
TargetTopicHasNoMessagesIn5Minutes 源集群前5分钟内没有新消息写入, 
ConsumerGroupCountNotMatch 订阅组数量不一致, 
SourceTopicHasUnconsumedMessages 源集群主题存在未消费消息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 健康检查返回的错误信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReasonList")
    @Expose
    private String [] ReasonList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 是否通过	 
     * @return Passed 是否通过	
     */
    public Boolean getPassed() {
        return this.Passed;
    }

    /**
     * Set 是否通过	
     * @param Passed 是否通过	
     */
    public void setPassed(Boolean Passed) {
        this.Passed = Passed;
    }

    /**
     * Get 健康检查返回的错误信息
NotChecked 未执行检查， 
Unknown 未知错误, 
TopicNotImported 主题未导入,
TopicNotExistsInSourceCluster 主题在源集群中不存在, 
TopicNotExistsInTargetCluster 主题在目标集群中不存在, 
ConsumerConnectedOnTarget 目标集群上存在消费者连接, 
SourceTopicHasNewMessagesIn5Minutes 源集群主题前5分钟内有新消息写入, 
TargetTopicHasNewMessagesIn5Minutes 目标集群主题前5分钟内有新消息写入, 
SourceTopicHasNoMessagesIn5Minutes 源集群前5分钟内没有新消息写入, 
TargetTopicHasNoMessagesIn5Minutes 源集群前5分钟内没有新消息写入, 
ConsumerGroupCountNotMatch 订阅组数量不一致, 
SourceTopicHasUnconsumedMessages 源集群主题存在未消费消息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Reason 健康检查返回的错误信息
NotChecked 未执行检查， 
Unknown 未知错误, 
TopicNotImported 主题未导入,
TopicNotExistsInSourceCluster 主题在源集群中不存在, 
TopicNotExistsInTargetCluster 主题在目标集群中不存在, 
ConsumerConnectedOnTarget 目标集群上存在消费者连接, 
SourceTopicHasNewMessagesIn5Minutes 源集群主题前5分钟内有新消息写入, 
TargetTopicHasNewMessagesIn5Minutes 目标集群主题前5分钟内有新消息写入, 
SourceTopicHasNoMessagesIn5Minutes 源集群前5分钟内没有新消息写入, 
TargetTopicHasNoMessagesIn5Minutes 源集群前5分钟内没有新消息写入, 
ConsumerGroupCountNotMatch 订阅组数量不一致, 
SourceTopicHasUnconsumedMessages 源集群主题存在未消费消息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 健康检查返回的错误信息
NotChecked 未执行检查， 
Unknown 未知错误, 
TopicNotImported 主题未导入,
TopicNotExistsInSourceCluster 主题在源集群中不存在, 
TopicNotExistsInTargetCluster 主题在目标集群中不存在, 
ConsumerConnectedOnTarget 目标集群上存在消费者连接, 
SourceTopicHasNewMessagesIn5Minutes 源集群主题前5分钟内有新消息写入, 
TargetTopicHasNewMessagesIn5Minutes 目标集群主题前5分钟内有新消息写入, 
SourceTopicHasNoMessagesIn5Minutes 源集群前5分钟内没有新消息写入, 
TargetTopicHasNoMessagesIn5Minutes 源集群前5分钟内没有新消息写入, 
ConsumerGroupCountNotMatch 订阅组数量不一致, 
SourceTopicHasUnconsumedMessages 源集群主题存在未消费消息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Reason 健康检查返回的错误信息
NotChecked 未执行检查， 
Unknown 未知错误, 
TopicNotImported 主题未导入,
TopicNotExistsInSourceCluster 主题在源集群中不存在, 
TopicNotExistsInTargetCluster 主题在目标集群中不存在, 
ConsumerConnectedOnTarget 目标集群上存在消费者连接, 
SourceTopicHasNewMessagesIn5Minutes 源集群主题前5分钟内有新消息写入, 
TargetTopicHasNewMessagesIn5Minutes 目标集群主题前5分钟内有新消息写入, 
SourceTopicHasNoMessagesIn5Minutes 源集群前5分钟内没有新消息写入, 
TargetTopicHasNoMessagesIn5Minutes 源集群前5分钟内没有新消息写入, 
ConsumerGroupCountNotMatch 订阅组数量不一致, 
SourceTopicHasUnconsumedMessages 源集群主题存在未消费消息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 健康检查返回的错误信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReasonList 健康检查返回的错误信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getReasonList() {
        return this.ReasonList;
    }

    /**
     * Set 健康检查返回的错误信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReasonList 健康检查返回的错误信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReasonList(String [] ReasonList) {
        this.ReasonList = ReasonList;
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

    public DoHealthCheckOnMigratingTopicResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DoHealthCheckOnMigratingTopicResponse(DoHealthCheckOnMigratingTopicResponse source) {
        if (source.Passed != null) {
            this.Passed = new Boolean(source.Passed);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.ReasonList != null) {
            this.ReasonList = new String[source.ReasonList.length];
            for (int i = 0; i < source.ReasonList.length; i++) {
                this.ReasonList[i] = new String(source.ReasonList[i]);
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
        this.setParamSimple(map, prefix + "Passed", this.Passed);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamArraySimple(map, prefix + "ReasonList.", this.ReasonList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

