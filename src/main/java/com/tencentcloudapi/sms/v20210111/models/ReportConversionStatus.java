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
package com.tencentcloudapi.sms.v20210111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReportConversionStatus extends AbstractModel{

    /**
    * 错误码。上报成功返回 ok。
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 错误码描述。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get 错误码。上报成功返回 ok。 
     * @return Code 错误码。上报成功返回 ok。
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 错误码。上报成功返回 ok。
     * @param Code 错误码。上报成功返回 ok。
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 错误码描述。 
     * @return Message 错误码描述。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 错误码描述。
     * @param Message 错误码描述。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public ReportConversionStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReportConversionStatus(ReportConversionStatus source) {
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

