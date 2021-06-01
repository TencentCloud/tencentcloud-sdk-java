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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleInfo extends AbstractModel{

    /**
    * 全文索引配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FullText")
    @Expose
    private FullTextInfo FullText;

    /**
    * 键值索引配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyValue")
    @Expose
    private RuleKeyValueInfo KeyValue;

    /**
    * 元字段索引配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tag")
    @Expose
    private RuleTagInfo Tag;

    /**
     * Get 全文索引配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FullText 全文索引配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FullTextInfo getFullText() {
        return this.FullText;
    }

    /**
     * Set 全文索引配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param FullText 全文索引配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFullText(FullTextInfo FullText) {
        this.FullText = FullText;
    }

    /**
     * Get 键值索引配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyValue 键值索引配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RuleKeyValueInfo getKeyValue() {
        return this.KeyValue;
    }

    /**
     * Set 键值索引配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyValue 键值索引配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyValue(RuleKeyValueInfo KeyValue) {
        this.KeyValue = KeyValue;
    }

    /**
     * Get 元字段索引配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tag 元字段索引配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RuleTagInfo getTag() {
        return this.Tag;
    }

    /**
     * Set 元字段索引配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tag 元字段索引配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTag(RuleTagInfo Tag) {
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
            this.KeyValue = new RuleKeyValueInfo(source.KeyValue);
        }
        if (source.Tag != null) {
            this.Tag = new RuleTagInfo(source.Tag);
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

