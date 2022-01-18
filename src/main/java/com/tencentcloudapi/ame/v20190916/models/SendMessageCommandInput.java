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
package com.tencentcloudapi.ame.v20190916.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendMessageCommandInput extends AbstractModel{

    /**
    * 自定义消息，json格式字符串。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 消息重复次数，默认为 1。
    */
    @SerializedName("Repeat")
    @Expose
    private Long Repeat;

    /**
     * Get 自定义消息，json格式字符串。 
     * @return Message 自定义消息，json格式字符串。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 自定义消息，json格式字符串。
     * @param Message 自定义消息，json格式字符串。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 消息重复次数，默认为 1。 
     * @return Repeat 消息重复次数，默认为 1。
     */
    public Long getRepeat() {
        return this.Repeat;
    }

    /**
     * Set 消息重复次数，默认为 1。
     * @param Repeat 消息重复次数，默认为 1。
     */
    public void setRepeat(Long Repeat) {
        this.Repeat = Repeat;
    }

    public SendMessageCommandInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendMessageCommandInput(SendMessageCommandInput source) {
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Repeat != null) {
            this.Repeat = new Long(source.Repeat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Repeat", this.Repeat);

    }
}

