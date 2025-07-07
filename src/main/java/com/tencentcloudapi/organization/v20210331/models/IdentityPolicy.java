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

public class IdentityPolicy extends AbstractModel {

    /**
    * CAM预设策略ID。PolicyType 为预设策略时有效且必选
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * CAM预设策略名称。PolicyType 为预设策略时有效且必选
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 策略类型。取值 1-自定义策略  2-预设策略；默认值2
    */
    @SerializedName("PolicyType")
    @Expose
    private Long PolicyType;

    /**
    * 自定义策略内容，遵循CAM策略语法。PolicyType 为自定义策略时有效且必选
    */
    @SerializedName("PolicyDocument")
    @Expose
    private String PolicyDocument;

    /**
     * Get CAM预设策略ID。PolicyType 为预设策略时有效且必选 
     * @return PolicyId CAM预设策略ID。PolicyType 为预设策略时有效且必选
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set CAM预设策略ID。PolicyType 为预设策略时有效且必选
     * @param PolicyId CAM预设策略ID。PolicyType 为预设策略时有效且必选
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get CAM预设策略名称。PolicyType 为预设策略时有效且必选 
     * @return PolicyName CAM预设策略名称。PolicyType 为预设策略时有效且必选
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set CAM预设策略名称。PolicyType 为预设策略时有效且必选
     * @param PolicyName CAM预设策略名称。PolicyType 为预设策略时有效且必选
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get 策略类型。取值 1-自定义策略  2-预设策略；默认值2 
     * @return PolicyType 策略类型。取值 1-自定义策略  2-预设策略；默认值2
     */
    public Long getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set 策略类型。取值 1-自定义策略  2-预设策略；默认值2
     * @param PolicyType 策略类型。取值 1-自定义策略  2-预设策略；默认值2
     */
    public void setPolicyType(Long PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get 自定义策略内容，遵循CAM策略语法。PolicyType 为自定义策略时有效且必选 
     * @return PolicyDocument 自定义策略内容，遵循CAM策略语法。PolicyType 为自定义策略时有效且必选
     */
    public String getPolicyDocument() {
        return this.PolicyDocument;
    }

    /**
     * Set 自定义策略内容，遵循CAM策略语法。PolicyType 为自定义策略时有效且必选
     * @param PolicyDocument 自定义策略内容，遵循CAM策略语法。PolicyType 为自定义策略时有效且必选
     */
    public void setPolicyDocument(String PolicyDocument) {
        this.PolicyDocument = PolicyDocument;
    }

    public IdentityPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IdentityPolicy(IdentityPolicy source) {
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.PolicyType != null) {
            this.PolicyType = new Long(source.PolicyType);
        }
        if (source.PolicyDocument != null) {
            this.PolicyDocument = new String(source.PolicyDocument);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "PolicyDocument", this.PolicyDocument);

    }
}

