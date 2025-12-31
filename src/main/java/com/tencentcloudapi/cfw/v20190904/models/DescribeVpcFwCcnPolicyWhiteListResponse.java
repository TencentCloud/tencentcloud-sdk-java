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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVpcFwCcnPolicyWhiteListResponse extends AbstractModel {

    /**
    * 支持自动接入和策略路由的CCN列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportCcnPolicy")
    @Expose
    private String [] SupportCcnPolicy;

    /**
    * 自动接入中支持自定义cidr的CCN列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportCcnPolicyCidr")
    @Expose
    private String [] SupportCcnPolicyCidr;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 支持自动接入和策略路由的CCN列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportCcnPolicy 支持自动接入和策略路由的CCN列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSupportCcnPolicy() {
        return this.SupportCcnPolicy;
    }

    /**
     * Set 支持自动接入和策略路由的CCN列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportCcnPolicy 支持自动接入和策略路由的CCN列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportCcnPolicy(String [] SupportCcnPolicy) {
        this.SupportCcnPolicy = SupportCcnPolicy;
    }

    /**
     * Get 自动接入中支持自定义cidr的CCN列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportCcnPolicyCidr 自动接入中支持自定义cidr的CCN列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSupportCcnPolicyCidr() {
        return this.SupportCcnPolicyCidr;
    }

    /**
     * Set 自动接入中支持自定义cidr的CCN列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportCcnPolicyCidr 自动接入中支持自定义cidr的CCN列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportCcnPolicyCidr(String [] SupportCcnPolicyCidr) {
        this.SupportCcnPolicyCidr = SupportCcnPolicyCidr;
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

    public DescribeVpcFwCcnPolicyWhiteListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVpcFwCcnPolicyWhiteListResponse(DescribeVpcFwCcnPolicyWhiteListResponse source) {
        if (source.SupportCcnPolicy != null) {
            this.SupportCcnPolicy = new String[source.SupportCcnPolicy.length];
            for (int i = 0; i < source.SupportCcnPolicy.length; i++) {
                this.SupportCcnPolicy[i] = new String(source.SupportCcnPolicy[i]);
            }
        }
        if (source.SupportCcnPolicyCidr != null) {
            this.SupportCcnPolicyCidr = new String[source.SupportCcnPolicyCidr.length];
            for (int i = 0; i < source.SupportCcnPolicyCidr.length; i++) {
                this.SupportCcnPolicyCidr[i] = new String(source.SupportCcnPolicyCidr[i]);
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
        this.setParamArraySimple(map, prefix + "SupportCcnPolicy.", this.SupportCcnPolicy);
        this.setParamArraySimple(map, prefix + "SupportCcnPolicyCidr.", this.SupportCcnPolicyCidr);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

