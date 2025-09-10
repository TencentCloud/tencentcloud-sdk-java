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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ItemNames extends AbstractModel {

    /**
    * 自定义抽取功能需返回的字段名称。
    */
    @SerializedName("KeyName")
    @Expose
    private String KeyName;

    /**
    * 默认 0；0表示kv对  1表示 表格字段。

    */
    @SerializedName("KeyType")
    @Expose
    private Long KeyType;

    /**
    * 抽取字段的描述内容。

    */
    @SerializedName("KeyPrompt")
    @Expose
    private String KeyPrompt;

    /**
     * Get 自定义抽取功能需返回的字段名称。 
     * @return KeyName 自定义抽取功能需返回的字段名称。
     */
    public String getKeyName() {
        return this.KeyName;
    }

    /**
     * Set 自定义抽取功能需返回的字段名称。
     * @param KeyName 自定义抽取功能需返回的字段名称。
     */
    public void setKeyName(String KeyName) {
        this.KeyName = KeyName;
    }

    /**
     * Get 默认 0；0表示kv对  1表示 表格字段。
 
     * @return KeyType 默认 0；0表示kv对  1表示 表格字段。

     */
    public Long getKeyType() {
        return this.KeyType;
    }

    /**
     * Set 默认 0；0表示kv对  1表示 表格字段。

     * @param KeyType 默认 0；0表示kv对  1表示 表格字段。

     */
    public void setKeyType(Long KeyType) {
        this.KeyType = KeyType;
    }

    /**
     * Get 抽取字段的描述内容。
 
     * @return KeyPrompt 抽取字段的描述内容。

     */
    public String getKeyPrompt() {
        return this.KeyPrompt;
    }

    /**
     * Set 抽取字段的描述内容。

     * @param KeyPrompt 抽取字段的描述内容。

     */
    public void setKeyPrompt(String KeyPrompt) {
        this.KeyPrompt = KeyPrompt;
    }

    public ItemNames() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ItemNames(ItemNames source) {
        if (source.KeyName != null) {
            this.KeyName = new String(source.KeyName);
        }
        if (source.KeyType != null) {
            this.KeyType = new Long(source.KeyType);
        }
        if (source.KeyPrompt != null) {
            this.KeyPrompt = new String(source.KeyPrompt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyName", this.KeyName);
        this.setParamSimple(map, prefix + "KeyType", this.KeyType);
        this.setParamSimple(map, prefix + "KeyPrompt", this.KeyPrompt);

    }
}

