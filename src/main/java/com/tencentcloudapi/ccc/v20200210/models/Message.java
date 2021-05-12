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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Message extends AbstractModel{

    /**
    * 消息类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 消息内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get 消息类型 
     * @return Type 消息类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 消息类型
     * @param Type 消息类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 消息内容 
     * @return Content 消息内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 消息内容
     * @param Content 消息内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public Message() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Message(Message source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

