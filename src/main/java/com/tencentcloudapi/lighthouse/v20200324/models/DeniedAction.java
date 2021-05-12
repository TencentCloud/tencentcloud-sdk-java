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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeniedAction extends AbstractModel{

    /**
    * 限制操作名。
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 限制操作消息码。
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 限制操作消息。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get 限制操作名。 
     * @return Action 限制操作名。
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 限制操作名。
     * @param Action 限制操作名。
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 限制操作消息码。 
     * @return Code 限制操作消息码。
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 限制操作消息码。
     * @param Code 限制操作消息码。
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 限制操作消息。 
     * @return Message 限制操作消息。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 限制操作消息。
     * @param Message 限制操作消息。
     */
    public void setMessage(String Message) {
        this.Message = Message;
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
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

