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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogIndexRuleInfo extends AbstractModel {

    /**
    * <p>全文索引</p>
    */
    @SerializedName("FullText")
    @Expose
    private LogFullTextInfo FullText;

    /**
    * <p>键值索引</p>
    */
    @SerializedName("KeyValue")
    @Expose
    private LogRuleKeyValueInfo KeyValue;

    /**
    * <p>标签</p>
    */
    @SerializedName("Tag")
    @Expose
    private LogRuleKeyValueInfo Tag;

    /**
    * <p>动态索引</p>
    */
    @SerializedName("DynamicIndex")
    @Expose
    private LogDynamicIndex DynamicIndex;

    /**
     * Get <p>全文索引</p> 
     * @return FullText <p>全文索引</p>
     */
    public LogFullTextInfo getFullText() {
        return this.FullText;
    }

    /**
     * Set <p>全文索引</p>
     * @param FullText <p>全文索引</p>
     */
    public void setFullText(LogFullTextInfo FullText) {
        this.FullText = FullText;
    }

    /**
     * Get <p>键值索引</p> 
     * @return KeyValue <p>键值索引</p>
     */
    public LogRuleKeyValueInfo getKeyValue() {
        return this.KeyValue;
    }

    /**
     * Set <p>键值索引</p>
     * @param KeyValue <p>键值索引</p>
     */
    public void setKeyValue(LogRuleKeyValueInfo KeyValue) {
        this.KeyValue = KeyValue;
    }

    /**
     * Get <p>标签</p> 
     * @return Tag <p>标签</p>
     */
    public LogRuleKeyValueInfo getTag() {
        return this.Tag;
    }

    /**
     * Set <p>标签</p>
     * @param Tag <p>标签</p>
     */
    public void setTag(LogRuleKeyValueInfo Tag) {
        this.Tag = Tag;
    }

    /**
     * Get <p>动态索引</p> 
     * @return DynamicIndex <p>动态索引</p>
     */
    public LogDynamicIndex getDynamicIndex() {
        return this.DynamicIndex;
    }

    /**
     * Set <p>动态索引</p>
     * @param DynamicIndex <p>动态索引</p>
     */
    public void setDynamicIndex(LogDynamicIndex DynamicIndex) {
        this.DynamicIndex = DynamicIndex;
    }

    public LogIndexRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogIndexRuleInfo(LogIndexRuleInfo source) {
        if (source.FullText != null) {
            this.FullText = new LogFullTextInfo(source.FullText);
        }
        if (source.KeyValue != null) {
            this.KeyValue = new LogRuleKeyValueInfo(source.KeyValue);
        }
        if (source.Tag != null) {
            this.Tag = new LogRuleKeyValueInfo(source.Tag);
        }
        if (source.DynamicIndex != null) {
            this.DynamicIndex = new LogDynamicIndex(source.DynamicIndex);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "FullText.", this.FullText);
        this.setParamObj(map, prefix + "KeyValue.", this.KeyValue);
        this.setParamObj(map, prefix + "Tag.", this.Tag);
        this.setParamObj(map, prefix + "DynamicIndex.", this.DynamicIndex);

    }
}

