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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterSchedulerPolicyResponse extends AbstractModel {

    /**
    * <p>调度策略json字符串</p>
    */
    @SerializedName("Policy")
    @Expose
    private String Policy;

    /**
    * <p>SchedulerPolicy配置信息</p>
    */
    @SerializedName("SchedulerPolicyConfig")
    @Expose
    private SchedulerPolicyConfig [] SchedulerPolicyConfig;

    /**
    * <p>客户端连接</p>
    */
    @SerializedName("ClientConnection")
    @Expose
    private ClientConnection ClientConnection;

    /**
    * <p>扩展调度器</p>
    */
    @SerializedName("Extenders")
    @Expose
    private Extenders [] Extenders;

    /**
    * <p>高性能模式</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HighPerformance")
    @Expose
    private Boolean HighPerformance;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>调度策略json字符串</p> 
     * @return Policy <p>调度策略json字符串</p>
     */
    public String getPolicy() {
        return this.Policy;
    }

    /**
     * Set <p>调度策略json字符串</p>
     * @param Policy <p>调度策略json字符串</p>
     */
    public void setPolicy(String Policy) {
        this.Policy = Policy;
    }

    /**
     * Get <p>SchedulerPolicy配置信息</p> 
     * @return SchedulerPolicyConfig <p>SchedulerPolicy配置信息</p>
     */
    public SchedulerPolicyConfig [] getSchedulerPolicyConfig() {
        return this.SchedulerPolicyConfig;
    }

    /**
     * Set <p>SchedulerPolicy配置信息</p>
     * @param SchedulerPolicyConfig <p>SchedulerPolicy配置信息</p>
     */
    public void setSchedulerPolicyConfig(SchedulerPolicyConfig [] SchedulerPolicyConfig) {
        this.SchedulerPolicyConfig = SchedulerPolicyConfig;
    }

    /**
     * Get <p>客户端连接</p> 
     * @return ClientConnection <p>客户端连接</p>
     */
    public ClientConnection getClientConnection() {
        return this.ClientConnection;
    }

    /**
     * Set <p>客户端连接</p>
     * @param ClientConnection <p>客户端连接</p>
     */
    public void setClientConnection(ClientConnection ClientConnection) {
        this.ClientConnection = ClientConnection;
    }

    /**
     * Get <p>扩展调度器</p> 
     * @return Extenders <p>扩展调度器</p>
     */
    public Extenders [] getExtenders() {
        return this.Extenders;
    }

    /**
     * Set <p>扩展调度器</p>
     * @param Extenders <p>扩展调度器</p>
     */
    public void setExtenders(Extenders [] Extenders) {
        this.Extenders = Extenders;
    }

    /**
     * Get <p>高性能模式</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HighPerformance <p>高性能模式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHighPerformance() {
        return this.HighPerformance;
    }

    /**
     * Set <p>高性能模式</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HighPerformance <p>高性能模式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHighPerformance(Boolean HighPerformance) {
        this.HighPerformance = HighPerformance;
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

    public DescribeClusterSchedulerPolicyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterSchedulerPolicyResponse(DescribeClusterSchedulerPolicyResponse source) {
        if (source.Policy != null) {
            this.Policy = new String(source.Policy);
        }
        if (source.SchedulerPolicyConfig != null) {
            this.SchedulerPolicyConfig = new SchedulerPolicyConfig[source.SchedulerPolicyConfig.length];
            for (int i = 0; i < source.SchedulerPolicyConfig.length; i++) {
                this.SchedulerPolicyConfig[i] = new SchedulerPolicyConfig(source.SchedulerPolicyConfig[i]);
            }
        }
        if (source.ClientConnection != null) {
            this.ClientConnection = new ClientConnection(source.ClientConnection);
        }
        if (source.Extenders != null) {
            this.Extenders = new Extenders[source.Extenders.length];
            for (int i = 0; i < source.Extenders.length; i++) {
                this.Extenders[i] = new Extenders(source.Extenders[i]);
            }
        }
        if (source.HighPerformance != null) {
            this.HighPerformance = new Boolean(source.HighPerformance);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Policy", this.Policy);
        this.setParamArrayObj(map, prefix + "SchedulerPolicyConfig.", this.SchedulerPolicyConfig);
        this.setParamObj(map, prefix + "ClientConnection.", this.ClientConnection);
        this.setParamArrayObj(map, prefix + "Extenders.", this.Extenders);
        this.setParamSimple(map, prefix + "HighPerformance", this.HighPerformance);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

