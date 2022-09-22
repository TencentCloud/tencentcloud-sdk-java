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

public class JsonPathReplaceParam extends AbstractModel{

    /**
    * 被替换值，Jsonpath表达式
    */
    @SerializedName("OldValue")
    @Expose
    private String OldValue;

    /**
    * 替换值，Jsonpath表达式或字符串
    */
    @SerializedName("NewValue")
    @Expose
    private String NewValue;

    /**
     * Get 被替换值，Jsonpath表达式 
     * @return OldValue 被替换值，Jsonpath表达式
     */
    public String getOldValue() {
        return this.OldValue;
    }

    /**
     * Set 被替换值，Jsonpath表达式
     * @param OldValue 被替换值，Jsonpath表达式
     */
    public void setOldValue(String OldValue) {
        this.OldValue = OldValue;
    }

    /**
     * Get 替换值，Jsonpath表达式或字符串 
     * @return NewValue 替换值，Jsonpath表达式或字符串
     */
    public String getNewValue() {
        return this.NewValue;
    }

    /**
     * Set 替换值，Jsonpath表达式或字符串
     * @param NewValue 替换值，Jsonpath表达式或字符串
     */
    public void setNewValue(String NewValue) {
        this.NewValue = NewValue;
    }

    public JsonPathReplaceParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JsonPathReplaceParam(JsonPathReplaceParam source) {
        if (source.OldValue != null) {
            this.OldValue = new String(source.OldValue);
        }
        if (source.NewValue != null) {
            this.NewValue = new String(source.NewValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OldValue", this.OldValue);
        this.setParamSimple(map, prefix + "NewValue", this.NewValue);

    }
}

