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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomFieldInfo extends AbstractModel {

    /**
    * 字段id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 字段key
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 字段名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 字段值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Val")
    @Expose
    private String Val;

    /**
     * Get 字段id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 字段id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 字段id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 字段id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 字段key
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Key 字段key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 字段key
注意：此字段可能返回 null，表示取不到有效值。
     * @param Key 字段key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 字段名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 字段名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 字段名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 字段名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 字段值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Val 字段值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVal() {
        return this.Val;
    }

    /**
     * Set 字段值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Val 字段值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVal(String Val) {
        this.Val = Val;
    }

    public CustomFieldInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomFieldInfo(CustomFieldInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Val != null) {
            this.Val = new String(source.Val);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Val", this.Val);

    }
}

