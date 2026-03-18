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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MessageLocalized extends AbstractModel {

    /**
    * 字符串
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 在该语言中
    */
    @SerializedName("Locale")
    @Expose
    private String Locale;

    /**
     * Get 字符串 
     * @return Message 字符串
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 字符串
     * @param Message 字符串
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 在该语言中 
     * @return Locale 在该语言中
     */
    public String getLocale() {
        return this.Locale;
    }

    /**
     * Set 在该语言中
     * @param Locale 在该语言中
     */
    public void setLocale(String Locale) {
        this.Locale = Locale;
    }

    public MessageLocalized() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MessageLocalized(MessageLocalized source) {
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Locale != null) {
            this.Locale = new String(source.Locale);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Locale", this.Locale);

    }
}

