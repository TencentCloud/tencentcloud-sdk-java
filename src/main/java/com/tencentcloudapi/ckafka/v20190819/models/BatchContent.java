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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchContent extends AbstractModel{

    /**
    * 发送的消息体
    */
    @SerializedName("Body")
    @Expose
    private String Body;

    /**
    * 发送消息的键名
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
     * Get 发送的消息体 
     * @return Body 发送的消息体
     */
    public String getBody() {
        return this.Body;
    }

    /**
     * Set 发送的消息体
     * @param Body 发送的消息体
     */
    public void setBody(String Body) {
        this.Body = Body;
    }

    /**
     * Get 发送消息的键名 
     * @return Key 发送消息的键名
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 发送消息的键名
     * @param Key 发送消息的键名
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    public BatchContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchContent(BatchContent source) {
        if (source.Body != null) {
            this.Body = new String(source.Body);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Body", this.Body);
        this.setParamSimple(map, prefix + "Key", this.Key);

    }
}

