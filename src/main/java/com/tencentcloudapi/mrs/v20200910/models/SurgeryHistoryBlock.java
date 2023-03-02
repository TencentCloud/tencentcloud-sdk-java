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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SurgeryHistoryBlock extends AbstractModel{

    /**
    * 名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 原文
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Src")
    @Expose
    private String Src;

    /**
    * 值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 手术列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Surgerylist")
    @Expose
    private SurgeryListBlock [] Surgerylist;

    /**
     * Get 名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 原文
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Src 原文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSrc() {
        return this.Src;
    }

    /**
     * Set 原文
注意：此字段可能返回 null，表示取不到有效值。
     * @param Src 原文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSrc(String Src) {
        this.Src = Src;
    }

    /**
     * Get 值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 手术列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Surgerylist 手术列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SurgeryListBlock [] getSurgerylist() {
        return this.Surgerylist;
    }

    /**
     * Set 手术列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Surgerylist 手术列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSurgerylist(SurgeryListBlock [] Surgerylist) {
        this.Surgerylist = Surgerylist;
    }

    public SurgeryHistoryBlock() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SurgeryHistoryBlock(SurgeryHistoryBlock source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Src != null) {
            this.Src = new String(source.Src);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Surgerylist != null) {
            this.Surgerylist = new SurgeryListBlock[source.Surgerylist.length];
            for (int i = 0; i < source.Surgerylist.length; i++) {
                this.Surgerylist[i] = new SurgeryListBlock(source.Surgerylist[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Src", this.Src);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamArrayObj(map, prefix + "Surgerylist.", this.Surgerylist);

    }
}

