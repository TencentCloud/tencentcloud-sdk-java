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
    * 策略Id。
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * 每页数量。默认值是 20，必须大于 0 且小于或等于 200
    */
    @SerializedName("Rp")
    @Expose
    private Long Rp;

    /**
    * 页码。默认值是 1，从 1开始，不能大于 200
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 策略类型。取值范围：All-全部、User-用户、Node-节点
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * 策略类型。默认值SERVICE_CONTROL_POLICY，取值范围：SERVICE_CONTROL_POLICY-服务控制策略、TAG_POLICY-标签策略
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * 按照多个策略id搜索，空格隔开。
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
     * Get 策略Id。 
     * @return PolicyId 策略Id。
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 策略Id。
     * @param PolicyId 策略Id。
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 每页数量。默认值是 20，必须大于 0 且小于或等于 200 
     * @return Rp 每页数量。默认值是 20，必须大于 0 且小于或等于 200
     */
    public Long getRp() {
        return this.Rp;
    }

    /**
     * Set 每页数量。默认值是 20，必须大于 0 且小于或等于 200
     * @param Rp 每页数量。默认值是 20，必须大于 0 且小于或等于 200
     */
    public void setRp(Long Rp) {
        this.Rp = Rp;
    }

    /**
     * Get 页码。默认值是 1，从 1开始，不能大于 200 
     * @return Page 页码。默认值是 1，从 1开始，不能大于 200
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 页码。默认值是 1，从 1开始，不能大于 200
     * @param Page 页码。默认值是 1，从 1开始，不能大于 200
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 策略类型。取值范围：All-全部、User-用户、Node-节点 
     * @return TargetType 策略类型。取值范围：All-全部、User-用户、Node-节点
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set 策略类型。取值范围：All-全部、User-用户、Node-节点
     * @param TargetType 策略类型。取值范围：All-全部、User-用户、Node-节点
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get 策略类型。默认值SERVICE_CONTROL_POLICY，取值范围：SERVICE_CONTROL_POLICY-服务控制策略、TAG_POLICY-标签策略 
     * @return PolicyType 策略类型。默认值SERVICE_CONTROL_POLICY，取值范围：SERVICE_CONTROL_POLICY-服务控制策略、TAG_POLICY-标签策略
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set 策略类型。默认值SERVICE_CONTROL_POLICY，取值范围：SERVICE_CONTROL_POLICY-服务控制策略、TAG_POLICY-标签策略
     * @param PolicyType 策略类型。默认值SERVICE_CONTROL_POLICY，取值范围：SERVICE_CONTROL_POLICY-服务控制策略、TAG_POLICY-标签策略
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get 按照多个策略id搜索，空格隔开。 
     * @return Keyword 按照多个策略id搜索，空格隔开。
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 按照多个策略id搜索，空格隔开。
     * @param Keyword 按照多个策略id搜索，空格隔开。
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

