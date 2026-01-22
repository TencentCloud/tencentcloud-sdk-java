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

public class DetachPolicyRequest extends AbstractModel {

    /**
    * <p>解绑策略目标ID。成员Uin或部门ID</p>
    */
    @SerializedName("TargetId")
    @Expose
    private Long TargetId;

    /**
    * <p>目标类型。取值范围：NODE-部门、MEMBER-成员</p>
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * <p>策略Id。可以调用<a href="https://cloud.tencent.com/document/product/850/105311">ListPolicies</a>获取</p>
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * <p>策略类型。默认值SERVICE_CONTROL_POLICY，取值范围：SERVICE_CONTROL_POLICY-服务控制策略、TAG_POLICY-标签策略</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get <p>解绑策略目标ID。成员Uin或部门ID</p> 
     * @return TargetId <p>解绑策略目标ID。成员Uin或部门ID</p>
     */
    public Long getTargetId() {
        return this.TargetId;
    }

    /**
     * Set <p>解绑策略目标ID。成员Uin或部门ID</p>
     * @param TargetId <p>解绑策略目标ID。成员Uin或部门ID</p>
     */
    public void setTargetId(Long TargetId) {
        this.TargetId = TargetId;
    }

    /**
     * Get <p>目标类型。取值范围：NODE-部门、MEMBER-成员</p> 
     * @return TargetType <p>目标类型。取值范围：NODE-部门、MEMBER-成员</p>
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set <p>目标类型。取值范围：NODE-部门、MEMBER-成员</p>
     * @param TargetType <p>目标类型。取值范围：NODE-部门、MEMBER-成员</p>
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get <p>策略Id。可以调用<a href="https://cloud.tencent.com/document/product/850/105311">ListPolicies</a>获取</p> 
     * @return PolicyId <p>策略Id。可以调用<a href="https://cloud.tencent.com/document/product/850/105311">ListPolicies</a>获取</p>
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set <p>策略Id。可以调用<a href="https://cloud.tencent.com/document/product/850/105311">ListPolicies</a>获取</p>
     * @param PolicyId <p>策略Id。可以调用<a href="https://cloud.tencent.com/document/product/850/105311">ListPolicies</a>获取</p>
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get <p>策略类型。默认值SERVICE_CONTROL_POLICY，取值范围：SERVICE_CONTROL_POLICY-服务控制策略、TAG_POLICY-标签策略</p> 
     * @return Type <p>策略类型。默认值SERVICE_CONTROL_POLICY，取值范围：SERVICE_CONTROL_POLICY-服务控制策略、TAG_POLICY-标签策略</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>策略类型。默认值SERVICE_CONTROL_POLICY，取值范围：SERVICE_CONTROL_POLICY-服务控制策略、TAG_POLICY-标签策略</p>
     * @param Type <p>策略类型。默认值SERVICE_CONTROL_POLICY，取值范围：SERVICE_CONTROL_POLICY-服务控制策略、TAG_POLICY-标签策略</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public DetachPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetachPolicyRequest(DetachPolicyRequest source) {
        if (source.TargetId != null) {
            this.TargetId = new Long(source.TargetId);
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetId", this.TargetId);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

