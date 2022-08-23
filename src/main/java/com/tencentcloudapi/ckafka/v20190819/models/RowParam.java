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

public class RowParam extends AbstractModel{

    /**
    * 行内容，KEY_VALUE，VALUE
    */
    @SerializedName("RowContent")
    @Expose
    private String RowContent;

    /**
    * key和value间的分隔符
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyValueDelimiter")
    @Expose
    private String KeyValueDelimiter;

    /**
    * 元素建的分隔符
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EntryDelimiter")
    @Expose
    private String EntryDelimiter;

    /**
     * Get 行内容，KEY_VALUE，VALUE 
     * @return RowContent 行内容，KEY_VALUE，VALUE
     */
    public String getRowContent() {
        return this.RowContent;
    }

    /**
     * Set 行内容，KEY_VALUE，VALUE
     * @param RowContent 行内容，KEY_VALUE，VALUE
     */
    public void setRowContent(String RowContent) {
        this.RowContent = RowContent;
    }

    /**
     * Get key和value间的分隔符
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyValueDelimiter key和value间的分隔符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKeyValueDelimiter() {
        return this.KeyValueDelimiter;
    }

    /**
     * Set key和value间的分隔符
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyValueDelimiter key和value间的分隔符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyValueDelimiter(String KeyValueDelimiter) {
        this.KeyValueDelimiter = KeyValueDelimiter;
    }

    /**
     * Get 元素建的分隔符
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EntryDelimiter 元素建的分隔符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEntryDelimiter() {
        return this.EntryDelimiter;
    }

    /**
     * Set 元素建的分隔符
注意：此字段可能返回 null，表示取不到有效值。
     * @param EntryDelimiter 元素建的分隔符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEntryDelimiter(String EntryDelimiter) {
        this.EntryDelimiter = EntryDelimiter;
    }

    public RowParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RowParam(RowParam source) {
        if (source.RowContent != null) {
            this.RowContent = new String(source.RowContent);
        }
        if (source.KeyValueDelimiter != null) {
            this.KeyValueDelimiter = new String(source.KeyValueDelimiter);
        }
        if (source.EntryDelimiter != null) {
            this.EntryDelimiter = new String(source.EntryDelimiter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RowContent", this.RowContent);
        this.setParamSimple(map, prefix + "KeyValueDelimiter", this.KeyValueDelimiter);
        this.setParamSimple(map, prefix + "EntryDelimiter", this.EntryDelimiter);

    }
}

