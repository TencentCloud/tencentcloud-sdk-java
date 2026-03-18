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

public class LocalizedMessage extends AbstractModel {

    /**
    * 默认展示的文本
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 针对每种语言展示的文字
    */
    @SerializedName("Localized")
    @Expose
    private MessageLocalized [] Localized;

    /**
     * Get 默认展示的文本 
     * @return Message 默认展示的文本
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 默认展示的文本
     * @param Message 默认展示的文本
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 针对每种语言展示的文字 
     * @return Localized 针对每种语言展示的文字
     */
    public MessageLocalized [] getLocalized() {
        return this.Localized;
    }

    /**
     * Set 针对每种语言展示的文字
     * @param Localized 针对每种语言展示的文字
     */
    public void setLocalized(MessageLocalized [] Localized) {
        this.Localized = Localized;
    }

    public LocalizedMessage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LocalizedMessage(LocalizedMessage source) {
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Localized != null) {
            this.Localized = new MessageLocalized[source.Localized.length];
            for (int i = 0; i < source.Localized.length; i++) {
                this.Localized[i] = new MessageLocalized(source.Localized[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamArrayObj(map, prefix + "Localized.", this.Localized);

    }
}

