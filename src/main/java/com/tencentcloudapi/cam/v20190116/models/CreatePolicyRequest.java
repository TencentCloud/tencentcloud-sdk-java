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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePolicyRequest extends AbstractModel {

    /**
    * 策略名称。长度为1~128个字符，可包含英文字母、数字和+=,.@-_。
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 策略文档
    */
    @SerializedName("PolicyDocument")
    @Expose
    private String PolicyDocument;

    /**
    * 策略描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 策略名称。长度为1~128个字符，可包含英文字母、数字和+=,.@-_。 
     * @return PolicyName 策略名称。长度为1~128个字符，可包含英文字母、数字和+=,.@-_。
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 策略名称。长度为1~128个字符，可包含英文字母、数字和+=,.@-_。
     * @param PolicyName 策略名称。长度为1~128个字符，可包含英文字母、数字和+=,.@-_。
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get 策略文档 
     * @return PolicyDocument 策略文档
     */
    public String getPolicyDocument() {
        return this.PolicyDocument;
    }

    /**
     * Set 策略文档
     * @param PolicyDocument 策略文档
     */
    public void setPolicyDocument(String PolicyDocument) {
        this.PolicyDocument = PolicyDocument;
    }

    /**
     * Get 策略描述 
     * @return Description 策略描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 策略描述
     * @param Description 策略描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreatePolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePolicyRequest(CreatePolicyRequest source) {
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.PolicyDocument != null) {
            this.PolicyDocument = new String(source.PolicyDocument);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "PolicyDocument", this.PolicyDocument);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

