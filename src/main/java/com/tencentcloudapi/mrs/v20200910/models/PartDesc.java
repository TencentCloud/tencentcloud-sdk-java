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

public class PartDesc extends AbstractModel{

    /**
    * 主要部位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MainDir")
    @Expose
    private String MainDir;

    /**
    * 部位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Part")
    @Expose
    private String Part;

    /**
    * 次要部位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecondaryDir")
    @Expose
    private String SecondaryDir;

    /**
    * 类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 主要部位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MainDir 主要部位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMainDir() {
        return this.MainDir;
    }

    /**
     * Set 主要部位
注意：此字段可能返回 null，表示取不到有效值。
     * @param MainDir 主要部位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMainDir(String MainDir) {
        this.MainDir = MainDir;
    }

    /**
     * Get 部位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Part 部位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPart() {
        return this.Part;
    }

    /**
     * Set 部位
注意：此字段可能返回 null，表示取不到有效值。
     * @param Part 部位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPart(String Part) {
        this.Part = Part;
    }

    /**
     * Get 次要部位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecondaryDir 次要部位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSecondaryDir() {
        return this.SecondaryDir;
    }

    /**
     * Set 次要部位
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecondaryDir 次要部位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecondaryDir(String SecondaryDir) {
        this.SecondaryDir = SecondaryDir;
    }

    /**
     * Get 类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public PartDesc() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PartDesc(PartDesc source) {
        if (source.MainDir != null) {
            this.MainDir = new String(source.MainDir);
        }
        if (source.Part != null) {
            this.Part = new String(source.Part);
        }
        if (source.SecondaryDir != null) {
            this.SecondaryDir = new String(source.SecondaryDir);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MainDir", this.MainDir);
        this.setParamSimple(map, prefix + "Part", this.Part);
        this.setParamSimple(map, prefix + "SecondaryDir", this.SecondaryDir);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

