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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Error extends AbstractModel {

    /**
    * 异常错误码
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 异常错误信息
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get 异常错误码 
     * @return Code 异常错误码
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 异常错误码
     * @param Code 异常错误码
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 异常错误信息 
     * @return Message 异常错误信息
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 异常错误信息
     * @param Message 异常错误信息
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public Error() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Error(Error source) {
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

