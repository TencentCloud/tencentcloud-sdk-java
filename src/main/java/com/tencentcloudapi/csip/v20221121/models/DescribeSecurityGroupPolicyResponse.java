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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecurityGroupPolicyResponse extends AbstractModel {

    /**
    * 关联安全组ID集合
    */
    @SerializedName("SecurityGroupIDList")
    @Expose
    private String [] SecurityGroupIDList;

    /**
    * 出站规则
    */
    @SerializedName("Egress")
    @Expose
    private SecurityGroupPolicyItem [] Egress;

    /**
    * 入站规则
    */
    @SerializedName("Ingress")
    @Expose
    private SecurityGroupPolicyItem [] Ingress;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 关联安全组ID集合 
     * @return SecurityGroupIDList 关联安全组ID集合
     */
    public String [] getSecurityGroupIDList() {
        return this.SecurityGroupIDList;
    }

    /**
     * Set 关联安全组ID集合
     * @param SecurityGroupIDList 关联安全组ID集合
     */
    public void setSecurityGroupIDList(String [] SecurityGroupIDList) {
        this.SecurityGroupIDList = SecurityGroupIDList;
    }

    /**
     * Get 出站规则 
     * @return Egress 出站规则
     */
    public SecurityGroupPolicyItem [] getEgress() {
        return this.Egress;
    }

    /**
     * Set 出站规则
     * @param Egress 出站规则
     */
    public void setEgress(SecurityGroupPolicyItem [] Egress) {
        this.Egress = Egress;
    }

    /**
     * Get 入站规则 
     * @return Ingress 入站规则
     */
    public SecurityGroupPolicyItem [] getIngress() {
        return this.Ingress;
    }

    /**
     * Set 入站规则
     * @param Ingress 入站规则
     */
    public void setIngress(SecurityGroupPolicyItem [] Ingress) {
        this.Ingress = Ingress;
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

    public DescribeSecurityGroupPolicyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityGroupPolicyResponse(DescribeSecurityGroupPolicyResponse source) {
        if (source.SecurityGroupIDList != null) {
            this.SecurityGroupIDList = new String[source.SecurityGroupIDList.length];
            for (int i = 0; i < source.SecurityGroupIDList.length; i++) {
                this.SecurityGroupIDList[i] = new String(source.SecurityGroupIDList[i]);
            }
        }
        if (source.Egress != null) {
            this.Egress = new SecurityGroupPolicyItem[source.Egress.length];
            for (int i = 0; i < source.Egress.length; i++) {
                this.Egress[i] = new SecurityGroupPolicyItem(source.Egress[i]);
            }
        }
        if (source.Ingress != null) {
            this.Ingress = new SecurityGroupPolicyItem[source.Ingress.length];
            for (int i = 0; i < source.Ingress.length; i++) {
                this.Ingress[i] = new SecurityGroupPolicyItem(source.Ingress[i]);
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
        this.setParamArraySimple(map, prefix + "SecurityGroupIDList.", this.SecurityGroupIDList);
        this.setParamArrayObj(map, prefix + "Egress.", this.Egress);
        this.setParamArrayObj(map, prefix + "Ingress.", this.Ingress);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

