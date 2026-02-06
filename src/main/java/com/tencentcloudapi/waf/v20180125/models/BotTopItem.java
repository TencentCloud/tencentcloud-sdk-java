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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BotTopItem extends AbstractModel {

    /**
    * 对应的key
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 对应的值
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
    * key对应的展示描述语
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
     * Get 对应的key 
     * @return Key 对应的key
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 对应的key
     * @param Key 对应的key
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 对应的值 
     * @return Value 对应的值
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set 对应的值
     * @param Value 对应的值
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    /**
     * Get key对应的展示描述语 
     * @return Label key对应的展示描述语
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set key对应的展示描述语
     * @param Label key对应的展示描述语
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    public BotTopItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotTopItem(BotTopItem source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Label", this.Label);

    }
}

