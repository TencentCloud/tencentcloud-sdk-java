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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyOrganizationBusinessInfoResponse extends AbstractModel {

    /**
    * <p>业务状态码。<br>0 表示正常（无阻断）；非 0 表示存在阻断，例如企业名称变更且存在未完结合同时返回 1。</p><p>枚举值：</p><ul><li>0： 正常（无阻断）</li><li>1： 存在未完结合同</li></ul>
    */
    @SerializedName("ErrorCode")
    @Expose
    private Long ErrorCode;

    /**
    * <p>提示文案。<br>例如企业名称变更且存在未完结合同时返回「存在 X 份未完结的合同，请先撤销或者完成合同」。</p>
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * <p>未完结合同总数。<br>仅当企业名称变更且存在未完结合同时有值。</p>
    */
    @SerializedName("UnfinishedCount")
    @Expose
    private Long UnfinishedCount;

    /**
    * <p>SaaS 企业下未完结合同的 flowId 列表。</p>
    */
    @SerializedName("FlowIds")
    @Expose
    private String [] FlowIds;

    /**
    * <p>渠道子客企业下未完结合同的 flowId 列表。</p>
    */
    @SerializedName("ChannelFlowIds")
    @Expose
    private String [] ChannelFlowIds;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>业务状态码。<br>0 表示正常（无阻断）；非 0 表示存在阻断，例如企业名称变更且存在未完结合同时返回 1。</p><p>枚举值：</p><ul><li>0： 正常（无阻断）</li><li>1： 存在未完结合同</li></ul> 
     * @return ErrorCode <p>业务状态码。<br>0 表示正常（无阻断）；非 0 表示存在阻断，例如企业名称变更且存在未完结合同时返回 1。</p><p>枚举值：</p><ul><li>0： 正常（无阻断）</li><li>1： 存在未完结合同</li></ul>
     */
    public Long getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set <p>业务状态码。<br>0 表示正常（无阻断）；非 0 表示存在阻断，例如企业名称变更且存在未完结合同时返回 1。</p><p>枚举值：</p><ul><li>0： 正常（无阻断）</li><li>1： 存在未完结合同</li></ul>
     * @param ErrorCode <p>业务状态码。<br>0 表示正常（无阻断）；非 0 表示存在阻断，例如企业名称变更且存在未完结合同时返回 1。</p><p>枚举值：</p><ul><li>0： 正常（无阻断）</li><li>1： 存在未完结合同</li></ul>
     */
    public void setErrorCode(Long ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get <p>提示文案。<br>例如企业名称变更且存在未完结合同时返回「存在 X 份未完结的合同，请先撤销或者完成合同」。</p> 
     * @return ErrorMessage <p>提示文案。<br>例如企业名称变更且存在未完结合同时返回「存在 X 份未完结的合同，请先撤销或者完成合同」。</p>
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set <p>提示文案。<br>例如企业名称变更且存在未完结合同时返回「存在 X 份未完结的合同，请先撤销或者完成合同」。</p>
     * @param ErrorMessage <p>提示文案。<br>例如企业名称变更且存在未完结合同时返回「存在 X 份未完结的合同，请先撤销或者完成合同」。</p>
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get <p>未完结合同总数。<br>仅当企业名称变更且存在未完结合同时有值。</p> 
     * @return UnfinishedCount <p>未完结合同总数。<br>仅当企业名称变更且存在未完结合同时有值。</p>
     */
    public Long getUnfinishedCount() {
        return this.UnfinishedCount;
    }

    /**
     * Set <p>未完结合同总数。<br>仅当企业名称变更且存在未完结合同时有值。</p>
     * @param UnfinishedCount <p>未完结合同总数。<br>仅当企业名称变更且存在未完结合同时有值。</p>
     */
    public void setUnfinishedCount(Long UnfinishedCount) {
        this.UnfinishedCount = UnfinishedCount;
    }

    /**
     * Get <p>SaaS 企业下未完结合同的 flowId 列表。</p> 
     * @return FlowIds <p>SaaS 企业下未完结合同的 flowId 列表。</p>
     */
    public String [] getFlowIds() {
        return this.FlowIds;
    }

    /**
     * Set <p>SaaS 企业下未完结合同的 flowId 列表。</p>
     * @param FlowIds <p>SaaS 企业下未完结合同的 flowId 列表。</p>
     */
    public void setFlowIds(String [] FlowIds) {
        this.FlowIds = FlowIds;
    }

    /**
     * Get <p>渠道子客企业下未完结合同的 flowId 列表。</p> 
     * @return ChannelFlowIds <p>渠道子客企业下未完结合同的 flowId 列表。</p>
     */
    public String [] getChannelFlowIds() {
        return this.ChannelFlowIds;
    }

    /**
     * Set <p>渠道子客企业下未完结合同的 flowId 列表。</p>
     * @param ChannelFlowIds <p>渠道子客企业下未完结合同的 flowId 列表。</p>
     */
    public void setChannelFlowIds(String [] ChannelFlowIds) {
        this.ChannelFlowIds = ChannelFlowIds;
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

    public ModifyOrganizationBusinessInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyOrganizationBusinessInfoResponse(ModifyOrganizationBusinessInfoResponse source) {
        if (source.ErrorCode != null) {
            this.ErrorCode = new Long(source.ErrorCode);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.UnfinishedCount != null) {
            this.UnfinishedCount = new Long(source.UnfinishedCount);
        }
        if (source.FlowIds != null) {
            this.FlowIds = new String[source.FlowIds.length];
            for (int i = 0; i < source.FlowIds.length; i++) {
                this.FlowIds[i] = new String(source.FlowIds[i]);
            }
        }
        if (source.ChannelFlowIds != null) {
            this.ChannelFlowIds = new String[source.ChannelFlowIds.length];
            for (int i = 0; i < source.ChannelFlowIds.length; i++) {
                this.ChannelFlowIds[i] = new String(source.ChannelFlowIds[i]);
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
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "UnfinishedCount", this.UnfinishedCount);
        this.setParamArraySimple(map, prefix + "FlowIds.", this.FlowIds);
        this.setParamArraySimple(map, prefix + "ChannelFlowIds.", this.ChannelFlowIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

