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
package com.tencentcloudapi.rce.v20250425.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManageIPPortraitRiskOutput extends AbstractModel {

    /**
    * 返回码
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * 返回消息
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 结果
    */
    @SerializedName("Value")
    @Expose
    private ManageIPPortraitRiskValueOutput Value;

    /**
     * Get 返回码 
     * @return Code 返回码
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set 返回码
     * @param Code 返回码
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get 返回消息 
     * @return Message 返回消息
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 返回消息
     * @param Message 返回消息
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 结果 
     * @return Value 结果
     */
    public ManageIPPortraitRiskValueOutput getValue() {
        return this.Value;
    }

    /**
     * Set 结果
     * @param Value 结果
     */
    public void setValue(ManageIPPortraitRiskValueOutput Value) {
        this.Value = Value;
    }

    public ManageIPPortraitRiskOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManageIPPortraitRiskOutput(ManageIPPortraitRiskOutput source) {
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Value != null) {
            this.Value = new ManageIPPortraitRiskValueOutput(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamObj(map, prefix + "Value.", this.Value);

    }
}

