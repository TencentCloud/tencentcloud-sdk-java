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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SaDivulgeScanRuleSetList extends AbstractModel{

    /**
    * Value
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Code
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * Message
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get Value 
     * @return Value Value
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Value
     * @param Value Value
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Code 
     * @return Code Code
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set Code
     * @param Code Code
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get Message 
     * @return Message Message
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Message
     * @param Message Message
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public SaDivulgeScanRuleSetList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SaDivulgeScanRuleSetList(SaDivulgeScanRuleSetList source) {
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

