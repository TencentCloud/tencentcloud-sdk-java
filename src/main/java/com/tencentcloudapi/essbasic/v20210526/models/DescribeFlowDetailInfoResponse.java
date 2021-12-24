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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFlowDetailInfoResponse extends AbstractModel{

    /**
    * 渠道侧应用号Id
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 渠道侧企业第三方Id
    */
    @SerializedName("ProxyOrganizationOpenId")
    @Expose
    private String ProxyOrganizationOpenId;

    /**
    * 合同(流程)的具体详细描述信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowInfo")
    @Expose
    private FlowDetailInfo [] FlowInfo;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 渠道侧应用号Id 
     * @return ApplicationId 渠道侧应用号Id
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 渠道侧应用号Id
     * @param ApplicationId 渠道侧应用号Id
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 渠道侧企业第三方Id 
     * @return ProxyOrganizationOpenId 渠道侧企业第三方Id
     */
    public String getProxyOrganizationOpenId() {
        return this.ProxyOrganizationOpenId;
    }

    /**
     * Set 渠道侧企业第三方Id
     * @param ProxyOrganizationOpenId 渠道侧企业第三方Id
     */
    public void setProxyOrganizationOpenId(String ProxyOrganizationOpenId) {
        this.ProxyOrganizationOpenId = ProxyOrganizationOpenId;
    }

    /**
     * Get 合同(流程)的具体详细描述信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowInfo 合同(流程)的具体详细描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FlowDetailInfo [] getFlowInfo() {
        return this.FlowInfo;
    }

    /**
     * Set 合同(流程)的具体详细描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowInfo 合同(流程)的具体详细描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowInfo(FlowDetailInfo [] FlowInfo) {
        this.FlowInfo = FlowInfo;
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

    public DescribeFlowDetailInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFlowDetailInfoResponse(DescribeFlowDetailInfoResponse source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ProxyOrganizationOpenId != null) {
            this.ProxyOrganizationOpenId = new String(source.ProxyOrganizationOpenId);
        }
        if (source.FlowInfo != null) {
            this.FlowInfo = new FlowDetailInfo[source.FlowInfo.length];
            for (int i = 0; i < source.FlowInfo.length; i++) {
                this.FlowInfo[i] = new FlowDetailInfo(source.FlowInfo[i]);
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
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ProxyOrganizationOpenId", this.ProxyOrganizationOpenId);
        this.setParamArrayObj(map, prefix + "FlowInfo.", this.FlowInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

