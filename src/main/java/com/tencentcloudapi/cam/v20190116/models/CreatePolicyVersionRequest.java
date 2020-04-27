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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePolicyVersionRequest extends AbstractModel{

    /**
    * 策略ID
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * 策略文本信息
    */
    @SerializedName("PolicyDocument")
    @Expose
    private String PolicyDocument;

    /**
    * 是否设置为当前策略的版本
    */
    @SerializedName("SetAsDefault")
    @Expose
    private Boolean SetAsDefault;

    /**
     * Get 策略ID 
     * @return PolicyId 策略ID
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 策略ID
     * @param PolicyId 策略ID
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 策略文本信息 
     * @return PolicyDocument 策略文本信息
     */
    public String getPolicyDocument() {
        return this.PolicyDocument;
    }

    /**
     * Set 策略文本信息
     * @param PolicyDocument 策略文本信息
     */
    public void setPolicyDocument(String PolicyDocument) {
        this.PolicyDocument = PolicyDocument;
    }

    /**
     * Get 是否设置为当前策略的版本 
     * @return SetAsDefault 是否设置为当前策略的版本
     */
    public Boolean getSetAsDefault() {
        return this.SetAsDefault;
    }

    /**
     * Set 是否设置为当前策略的版本
     * @param SetAsDefault 是否设置为当前策略的版本
     */
    public void setSetAsDefault(Boolean SetAsDefault) {
        this.SetAsDefault = SetAsDefault;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyDocument", this.PolicyDocument);
        this.setParamSimple(map, prefix + "SetAsDefault", this.SetAsDefault);

    }
}

