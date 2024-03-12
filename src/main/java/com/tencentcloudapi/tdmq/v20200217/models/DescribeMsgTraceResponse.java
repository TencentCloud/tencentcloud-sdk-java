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

public class DescribeMsgTraceResponse extends AbstractModel {

    /**
    * 生产信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProducerLog")
    @Expose
    private ProducerLog ProducerLog;

    /**
    * 服务方信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServerLog")
    @Expose
    private ServerLog ServerLog;

    /**
    * 消费信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConsumerLogs")
    @Expose
    private ConsumerLogs ConsumerLogs;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 生产信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProducerLog 生产信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProducerLog getProducerLog() {
        return this.ProducerLog;
    }

    /**
     * Set 生产信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProducerLog 生产信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProducerLog(ProducerLog ProducerLog) {
        this.ProducerLog = ProducerLog;
    }

    /**
     * Get 服务方信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServerLog 服务方信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServerLog getServerLog() {
        return this.ServerLog;
    }

    /**
     * Set 服务方信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServerLog 服务方信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServerLog(ServerLog ServerLog) {
        this.ServerLog = ServerLog;
    }

    /**
     * Get 消费信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConsumerLogs 消费信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConsumerLogs getConsumerLogs() {
        return this.ConsumerLogs;
    }

    /**
     * Set 消费信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConsumerLogs 消费信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsumerLogs(ConsumerLogs ConsumerLogs) {
        this.ConsumerLogs = ConsumerLogs;
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

    public DescribeMsgTraceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMsgTraceResponse(DescribeMsgTraceResponse source) {
        if (source.ProducerLog != null) {
            this.ProducerLog = new ProducerLog(source.ProducerLog);
        }
        if (source.ServerLog != null) {
            this.ServerLog = new ServerLog(source.ServerLog);
        }
        if (source.ConsumerLogs != null) {
            this.ConsumerLogs = new ConsumerLogs(source.ConsumerLogs);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ProducerLog.", this.ProducerLog);
        this.setParamObj(map, prefix + "ServerLog.", this.ServerLog);
        this.setParamObj(map, prefix + "ConsumerLogs.", this.ConsumerLogs);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

