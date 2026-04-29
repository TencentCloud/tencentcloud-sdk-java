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

public class SchemaList extends AbstractModel {

    /**
    * <p>自定义需提取的字段名称。注：若需提取多个字段，可定义多个KeyName。</p>
    */
    @SerializedName("KeyName")
    @Expose
    private String KeyName;

    /**
    * <p>字段类型。</p><p>枚举值：</p><ul><li>0： 表示KeyName为简单字段（如姓名、性别等）。</li><li>1： 表示KeyName为数组对象（如工作经历、教育经历列表）。</li></ul>
    */
    @SerializedName("KeyType")
    @Expose
    private Long KeyType;

    /**
    * <p>补充提取字段的描述。</p>
    */
    @SerializedName("KeyPrompt")
    @Expose
    private String KeyPrompt;

    /**
    * <p>嵌套SchemaList结构，最多支持嵌套三层。注：仅当KeyType=1时生效。</p>
    */
    @SerializedName("SubItems")
    @Expose
    private SchemaList [] SubItems;

    /**
     * Get <p>自定义需提取的字段名称。注：若需提取多个字段，可定义多个KeyName。</p> 
     * @return KeyName <p>自定义需提取的字段名称。注：若需提取多个字段，可定义多个KeyName。</p>
     */
    public String getKeyName() {
        return this.KeyName;
    }

    /**
     * Set <p>自定义需提取的字段名称。注：若需提取多个字段，可定义多个KeyName。</p>
     * @param KeyName <p>自定义需提取的字段名称。注：若需提取多个字段，可定义多个KeyName。</p>
     */
    public void setKeyName(String KeyName) {
        this.KeyName = KeyName;
    }

    /**
     * Get <p>字段类型。</p><p>枚举值：</p><ul><li>0： 表示KeyName为简单字段（如姓名、性别等）。</li><li>1： 表示KeyName为数组对象（如工作经历、教育经历列表）。</li></ul> 
     * @return KeyType <p>字段类型。</p><p>枚举值：</p><ul><li>0： 表示KeyName为简单字段（如姓名、性别等）。</li><li>1： 表示KeyName为数组对象（如工作经历、教育经历列表）。</li></ul>
     */
    public Long getKeyType() {
        return this.KeyType;
    }

    /**
     * Set <p>字段类型。</p><p>枚举值：</p><ul><li>0： 表示KeyName为简单字段（如姓名、性别等）。</li><li>1： 表示KeyName为数组对象（如工作经历、教育经历列表）。</li></ul>
     * @param KeyType <p>字段类型。</p><p>枚举值：</p><ul><li>0： 表示KeyName为简单字段（如姓名、性别等）。</li><li>1： 表示KeyName为数组对象（如工作经历、教育经历列表）。</li></ul>
     */
    public void setKeyType(Long KeyType) {
        this.KeyType = KeyType;
    }

    /**
     * Get <p>补充提取字段的描述。</p> 
     * @return KeyPrompt <p>补充提取字段的描述。</p>
     */
    public String getKeyPrompt() {
        return this.KeyPrompt;
    }

    /**
     * Set <p>补充提取字段的描述。</p>
     * @param KeyPrompt <p>补充提取字段的描述。</p>
     */
    public void setKeyPrompt(String KeyPrompt) {
        this.KeyPrompt = KeyPrompt;
    }

    /**
     * Get <p>嵌套SchemaList结构，最多支持嵌套三层。注：仅当KeyType=1时生效。</p> 
     * @return SubItems <p>嵌套SchemaList结构，最多支持嵌套三层。注：仅当KeyType=1时生效。</p>
     */
    public SchemaList [] getSubItems() {
        return this.SubItems;
    }

    /**
     * Set <p>嵌套SchemaList结构，最多支持嵌套三层。注：仅当KeyType=1时生效。</p>
     * @param SubItems <p>嵌套SchemaList结构，最多支持嵌套三层。注：仅当KeyType=1时生效。</p>
     */
    public void setSubItems(SchemaList [] SubItems) {
        this.SubItems = SubItems;
    }

    public SchemaList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SchemaList(SchemaList source) {
        if (source.KeyName != null) {
            this.KeyName = new String(source.KeyName);
        }
        if (source.KeyType != null) {
            this.KeyType = new Long(source.KeyType);
        }
        if (source.KeyPrompt != null) {
            this.KeyPrompt = new String(source.KeyPrompt);
        }
        if (source.SubItems != null) {
            this.SubItems = new SchemaList[source.SubItems.length];
            for (int i = 0; i < source.SubItems.length; i++) {
                this.SubItems[i] = new SchemaList(source.SubItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyName", this.KeyName);
        this.setParamSimple(map, prefix + "KeyType", this.KeyType);
        this.setParamSimple(map, prefix + "KeyPrompt", this.KeyPrompt);
        this.setParamArrayObj(map, prefix + "SubItems.", this.SubItems);

    }
}

