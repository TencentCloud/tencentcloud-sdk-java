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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeniedAction extends AbstractModel {

    /**
    * 不能操作的接口名。
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 接口不能操作的原因。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 接口不能操作对应提示的错误码。
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
     * Get 不能操作的接口名。 
     * @return Action 不能操作的接口名。
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 不能操作的接口名。
     * @param Action 不能操作的接口名。
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 接口不能操作的原因。 
     * @return Message 接口不能操作的原因。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 接口不能操作的原因。
     * @param Message 接口不能操作的原因。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 接口不能操作对应提示的错误码。 
     * @return Code 接口不能操作对应提示的错误码。
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 接口不能操作对应提示的错误码。
     * @param Code 接口不能操作对应提示的错误码。
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    public DeniedAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeniedAction(DeniedAction source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Code", this.Code);

    }
}

