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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListTargetsForPolicyRequest extends AbstractModel {

    /**
    * <p>策略Id。</p>
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * <p>每页数量。默认值是 20，必须大于 0 且小于或等于 200</p>
    */
    @SerializedName("Rp")
    @Expose
    private Long Rp;

    /**
    * <p>页码。默认值是 1，从 1开始，不能大于 200</p>
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * <p>策略类型。取值范围：All-全部、User-用户、Node-节点</p>
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * <p>策略类型。默认值SERVICE_CONTROL_POLICY，取值范围：SERVICE_CONTROL_POLICY-服务控制策略、TAG_POLICY-标签策略</p>
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * <p>按照多个策略id搜索，空格隔开。</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
     * Get <p>策略Id。</p> 
     * @return PolicyId <p>策略Id。</p>
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set <p>策略Id。</p>
     * @param PolicyId <p>策略Id。</p>
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get <p>每页数量。默认值是 20，必须大于 0 且小于或等于 200</p> 
     * @return Rp <p>每页数量。默认值是 20，必须大于 0 且小于或等于 200</p>
     */
    public Long getRp() {
        return this.Rp;
    }

    /**
     * Set <p>每页数量。默认值是 20，必须大于 0 且小于或等于 200</p>
     * @param Rp <p>每页数量。默认值是 20，必须大于 0 且小于或等于 200</p>
     */
    public void setRp(Long Rp) {
        this.Rp = Rp;
    }

    /**
     * Get <p>页码。默认值是 1，从 1开始，不能大于 200</p> 
     * @return Page <p>页码。默认值是 1，从 1开始，不能大于 200</p>
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set <p>页码。默认值是 1，从 1开始，不能大于 200</p>
     * @param Page <p>页码。默认值是 1，从 1开始，不能大于 200</p>
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get <p>策略类型。取值范围：All-全部、User-用户、Node-节点</p> 
     * @return TargetType <p>策略类型。取值范围：All-全部、User-用户、Node-节点</p>
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set <p>策略类型。取值范围：All-全部、User-用户、Node-节点</p>
     * @param TargetType <p>策略类型。取值范围：All-全部、User-用户、Node-节点</p>
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get <p>策略类型。默认值SERVICE_CONTROL_POLICY，取值范围：SERVICE_CONTROL_POLICY-服务控制策略、TAG_POLICY-标签策略</p> 
     * @return PolicyType <p>策略类型。默认值SERVICE_CONTROL_POLICY，取值范围：SERVICE_CONTROL_POLICY-服务控制策略、TAG_POLICY-标签策略</p>
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set <p>策略类型。默认值SERVICE_CONTROL_POLICY，取值范围：SERVICE_CONTROL_POLICY-服务控制策略、TAG_POLICY-标签策略</p>
     * @param PolicyType <p>策略类型。默认值SERVICE_CONTROL_POLICY，取值范围：SERVICE_CONTROL_POLICY-服务控制策略、TAG_POLICY-标签策略</p>
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get <p>按照多个策略id搜索，空格隔开。</p> 
     * @return Keyword <p>按照多个策略id搜索，空格隔开。</p>
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set <p>按照多个策略id搜索，空格隔开。</p>
     * @param Keyword <p>按照多个策略id搜索，空格隔开。</p>
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    public ListTargetsForPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListTargetsForPolicyRequest(ListTargetsForPolicyRequest source) {
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.Rp != null) {
            this.Rp = new Long(source.Rp);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
        if (source.PolicyType != null) {
            this.PolicyType = new String(source.PolicyType);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "Rp", this.Rp);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);

    }
}

