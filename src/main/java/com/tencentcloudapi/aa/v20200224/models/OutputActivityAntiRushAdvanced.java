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
package com.tencentcloudapi.aa.v20200224.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OutputActivityAntiRushAdvanced extends AbstractModel{

    /**
    * 返回码。0表示成功，非0标识失败错误码。
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * UTF-8编码，出错消息。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 服务调用结果。
    */
    @SerializedName("Value")
    @Expose
    private OutputActivityAntiRushAdvancedValue Value;

    /**
     * Get 返回码。0表示成功，非0标识失败错误码。 
     * @return Code 返回码。0表示成功，非0标识失败错误码。
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set 返回码。0表示成功，非0标识失败错误码。
     * @param Code 返回码。0表示成功，非0标识失败错误码。
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get UTF-8编码，出错消息。 
     * @return Message UTF-8编码，出错消息。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set UTF-8编码，出错消息。
     * @param Message UTF-8编码，出错消息。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 服务调用结果。 
     * @return Value 服务调用结果。
     */
    public OutputActivityAntiRushAdvancedValue getValue() {
        return this.Value;
    }

    /**
     * Set 服务调用结果。
     * @param Value 服务调用结果。
     */
    public void setValue(OutputActivityAntiRushAdvancedValue Value) {
        this.Value = Value;
    }

    public OutputActivityAntiRushAdvanced() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OutputActivityAntiRushAdvanced(OutputActivityAntiRushAdvanced source) {
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Value != null) {
            this.Value = new OutputActivityAntiRushAdvancedValue(source.Value);
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

