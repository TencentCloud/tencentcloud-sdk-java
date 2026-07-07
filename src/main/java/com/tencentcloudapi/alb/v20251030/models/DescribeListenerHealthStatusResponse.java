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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeListenerHealthStatusResponse extends AbstractModel {

    /**
    * 监听器 ID，格式为 lst- 后接 8 位字母数字。
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 监听器端口。
    */
    @SerializedName("ListenerPort")
    @Expose
    private String ListenerPort;

    /**
    * 监听器协议。
    */
    @SerializedName("ListenerProtocol")
    @Expose
    private String ListenerProtocol;

    /**
    * 下一次查询的令牌（Token）。为空时表示这是最后一页。
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * 转发规则健康状态。
    */
    @SerializedName("RuleHealthStatusInfos")
    @Expose
    private RuleHealthStatusInfo [] RuleHealthStatusInfos;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 监听器 ID，格式为 lst- 后接 8 位字母数字。 
     * @return ListenerId 监听器 ID，格式为 lst- 后接 8 位字母数字。
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 监听器 ID，格式为 lst- 后接 8 位字母数字。
     * @param ListenerId 监听器 ID，格式为 lst- 后接 8 位字母数字。
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 监听器端口。 
     * @return ListenerPort 监听器端口。
     */
    public String getListenerPort() {
        return this.ListenerPort;
    }

    /**
     * Set 监听器端口。
     * @param ListenerPort 监听器端口。
     */
    public void setListenerPort(String ListenerPort) {
        this.ListenerPort = ListenerPort;
    }

    /**
     * Get 监听器协议。 
     * @return ListenerProtocol 监听器协议。
     */
    public String getListenerProtocol() {
        return this.ListenerProtocol;
    }

    /**
     * Set 监听器协议。
     * @param ListenerProtocol 监听器协议。
     */
    public void setListenerProtocol(String ListenerProtocol) {
        this.ListenerProtocol = ListenerProtocol;
    }

    /**
     * Get 下一次查询的令牌（Token）。为空时表示这是最后一页。 
     * @return NextToken 下一次查询的令牌（Token）。为空时表示这是最后一页。
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set 下一次查询的令牌（Token）。为空时表示这是最后一页。
     * @param NextToken 下一次查询的令牌（Token）。为空时表示这是最后一页。
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    /**
     * Get 转发规则健康状态。 
     * @return RuleHealthStatusInfos 转发规则健康状态。
     */
    public RuleHealthStatusInfo [] getRuleHealthStatusInfos() {
        return this.RuleHealthStatusInfos;
    }

    /**
     * Set 转发规则健康状态。
     * @param RuleHealthStatusInfos 转发规则健康状态。
     */
    public void setRuleHealthStatusInfos(RuleHealthStatusInfo [] RuleHealthStatusInfos) {
        this.RuleHealthStatusInfos = RuleHealthStatusInfos;
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

    public DescribeListenerHealthStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeListenerHealthStatusResponse(DescribeListenerHealthStatusResponse source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.ListenerPort != null) {
            this.ListenerPort = new String(source.ListenerPort);
        }
        if (source.ListenerProtocol != null) {
            this.ListenerProtocol = new String(source.ListenerProtocol);
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
        if (source.RuleHealthStatusInfos != null) {
            this.RuleHealthStatusInfos = new RuleHealthStatusInfo[source.RuleHealthStatusInfos.length];
            for (int i = 0; i < source.RuleHealthStatusInfos.length; i++) {
                this.RuleHealthStatusInfos[i] = new RuleHealthStatusInfo(source.RuleHealthStatusInfos[i]);
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
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ListenerPort", this.ListenerPort);
        this.setParamSimple(map, prefix + "ListenerProtocol", this.ListenerProtocol);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamArrayObj(map, prefix + "RuleHealthStatusInfos.", this.RuleHealthStatusInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

