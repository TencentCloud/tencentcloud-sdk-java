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

public class ListPoliciesForTargetRequest extends AbstractModel {

    /**
    * 账号uin或者节点id。
    */
    @SerializedName("TargetId")
    @Expose
    private Long TargetId;

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
    * 策略类型。默认值SERVICE_CONTROL_POLICY，取值范围：SERVICE_CONTROL_POLICY-服务控制策略、TAG_POLICY-标签策略
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * 搜索关键字。按照策略名称搜索
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
     * Get 账号uin或者节点id。 
     * @return TargetId 账号uin或者节点id。
     */
    public Long getTargetId() {
        return this.TargetId;
    }

    /**
     * Set 账号uin或者节点id。
     * @param TargetId 账号uin或者节点id。
     */
    public void setTargetId(Long TargetId) {
        this.TargetId = TargetId;
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
     * Get 搜索关键字。按照策略名称搜索 
     * @return Keyword 搜索关键字。按照策略名称搜索
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 搜索关键字。按照策略名称搜索
     * @param Keyword 搜索关键字。按照策略名称搜索
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    public ListPoliciesForTargetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListPoliciesForTargetRequest(ListPoliciesForTargetRequest source) {
        if (source.TargetId != null) {
            this.TargetId = new Long(source.TargetId);
        }
        if (source.Rp != null) {
            this.Rp = new Long(source.Rp);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
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
        this.setParamSimple(map, prefix + "TargetId", this.TargetId);
        this.setParamSimple(map, prefix + "Rp", this.Rp);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);

    }
}

