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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleInfo extends AbstractModel {

    /**
    * 全文索引的相关配置
    */
    @SerializedName("FullText")
    @Expose
    private FullTextInfo FullText;

    /**
    * 键值索引的相关配置
    */
    @SerializedName("KeyValue")
    @Expose
    private KeyValueInfo KeyValue;

    /**
    * 元字段索引配置
    */
    @SerializedName("Tag")
    @Expose
    private KeyValueInfo Tag;

    /**
     * Get 全文索引的相关配置 
     * @return FullText 全文索引的相关配置
     */
    public FullTextInfo getFullText() {
        return this.FullText;
    }

    /**
     * Set 全文索引的相关配置
     * @param FullText 全文索引的相关配置
     */
    public void setFullText(FullTextInfo FullText) {
        this.FullText = FullText;
    }

    /**
     * Get 键值索引的相关配置 
     * @return KeyValue 键值索引的相关配置
     */
    public KeyValueInfo getKeyValue() {
        return this.KeyValue;
    }

    /**
     * Set 键值索引的相关配置
     * @param KeyValue 键值索引的相关配置
     */
    public void setKeyValue(KeyValueInfo KeyValue) {
        this.KeyValue = KeyValue;
    }

    /**
     * Get 元字段索引配置 
     * @return Tag 元字段索引配置
     */
    public KeyValueInfo getTag() {
        return this.Tag;
    }

    /**
     * Set 元字段索引配置
     * @param Tag 元字段索引配置
     */
    public void setTag(KeyValueInfo Tag) {
        this.Tag = Tag;
    }

    public RuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleInfo(RuleInfo source) {
        if (source.FullText != null) {
            this.FullText = new FullTextInfo(source.FullText);
        }
        if (source.KeyValue != null) {
            this.KeyValue = new KeyValueInfo(source.KeyValue);
        }
        if (source.Tag != null) {
            this.Tag = new KeyValueInfo(source.Tag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "FullText.", this.FullText);
        this.setParamObj(map, prefix + "KeyValue.", this.KeyValue);
        this.setParamObj(map, prefix + "Tag.", this.Tag);

    }
}

