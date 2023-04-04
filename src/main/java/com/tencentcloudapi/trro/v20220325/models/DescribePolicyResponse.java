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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePolicyResponse extends AbstractModel{

    /**
    * 权限模式
    */
    @SerializedName("PolicyMode")
    @Expose
    private String PolicyMode;

    /**
    * 返回的权限模式是否为当前生效的权限模式
    */
    @SerializedName("PolicyEnabled")
    @Expose
    private Boolean PolicyEnabled;

    /**
    * 权限信息列表
    */
    @SerializedName("PolicyInfo")
    @Expose
    private PolicyInfo [] PolicyInfo;

    /**
    * 本次返回的权限信息数量
    */
    @SerializedName("Num")
    @Expose
    private Long Num;

    /**
    * 权限信息总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 权限模式 
     * @return PolicyMode 权限模式
     */
    public String getPolicyMode() {
        return this.PolicyMode;
    }

    /**
     * Set 权限模式
     * @param PolicyMode 权限模式
     */
    public void setPolicyMode(String PolicyMode) {
        this.PolicyMode = PolicyMode;
    }

    /**
     * Get 返回的权限模式是否为当前生效的权限模式 
     * @return PolicyEnabled 返回的权限模式是否为当前生效的权限模式
     */
    public Boolean getPolicyEnabled() {
        return this.PolicyEnabled;
    }

    /**
     * Set 返回的权限模式是否为当前生效的权限模式
     * @param PolicyEnabled 返回的权限模式是否为当前生效的权限模式
     */
    public void setPolicyEnabled(Boolean PolicyEnabled) {
        this.PolicyEnabled = PolicyEnabled;
    }

    /**
     * Get 权限信息列表 
     * @return PolicyInfo 权限信息列表
     */
    public PolicyInfo [] getPolicyInfo() {
        return this.PolicyInfo;
    }

    /**
     * Set 权限信息列表
     * @param PolicyInfo 权限信息列表
     */
    public void setPolicyInfo(PolicyInfo [] PolicyInfo) {
        this.PolicyInfo = PolicyInfo;
    }

    /**
     * Get 本次返回的权限信息数量 
     * @return Num 本次返回的权限信息数量
     */
    public Long getNum() {
        return this.Num;
    }

    /**
     * Set 本次返回的权限信息数量
     * @param Num 本次返回的权限信息数量
     */
    public void setNum(Long Num) {
        this.Num = Num;
    }

    /**
     * Get 权限信息总数 
     * @return Total 权限信息总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 权限信息总数
     * @param Total 权限信息总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
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

    public DescribePolicyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePolicyResponse(DescribePolicyResponse source) {
        if (source.PolicyMode != null) {
            this.PolicyMode = new String(source.PolicyMode);
        }
        if (source.PolicyEnabled != null) {
            this.PolicyEnabled = new Boolean(source.PolicyEnabled);
        }
        if (source.PolicyInfo != null) {
            this.PolicyInfo = new PolicyInfo[source.PolicyInfo.length];
            for (int i = 0; i < source.PolicyInfo.length; i++) {
                this.PolicyInfo[i] = new PolicyInfo(source.PolicyInfo[i]);
            }
        }
        if (source.Num != null) {
            this.Num = new Long(source.Num);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyMode", this.PolicyMode);
        this.setParamSimple(map, prefix + "PolicyEnabled", this.PolicyEnabled);
        this.setParamArrayObj(map, prefix + "PolicyInfo.", this.PolicyInfo);
        this.setParamSimple(map, prefix + "Num", this.Num);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

