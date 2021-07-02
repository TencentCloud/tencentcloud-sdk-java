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

public class Symptom extends AbstractModel{

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Desc")
    @Expose
    private Attribute Desc;

    /**
    * 部位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Part")
    @Expose
    private Attribute Part;

    /**
    * 等级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Grade")
    @Expose
    private Attribute Grade;

    /**
    * 性质
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttrList")
    @Expose
    private Attribute [] AttrList;

    /**
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Desc 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Attribute getDesc() {
        return this.Desc;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Desc 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDesc(Attribute Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 部位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Part 部位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Attribute getPart() {
        return this.Part;
    }

    /**
     * Set 部位
注意：此字段可能返回 null，表示取不到有效值。
     * @param Part 部位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPart(Attribute Part) {
        this.Part = Part;
    }

    /**
     * Get 等级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Grade 等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Attribute getGrade() {
        return this.Grade;
    }

    /**
     * Set 等级
注意：此字段可能返回 null，表示取不到有效值。
     * @param Grade 等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGrade(Attribute Grade) {
        this.Grade = Grade;
    }

    /**
     * Get 性质
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttrList 性质
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Attribute [] getAttrList() {
        return this.AttrList;
    }

    /**
     * Set 性质
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttrList 性质
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttrList(Attribute [] AttrList) {
        this.AttrList = AttrList;
    }

    public Symptom() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Symptom(Symptom source) {
        if (source.Desc != null) {
            this.Desc = new Attribute(source.Desc);
        }
        if (source.Part != null) {
            this.Part = new Attribute(source.Part);
        }
        if (source.Grade != null) {
            this.Grade = new Attribute(source.Grade);
        }
        if (source.AttrList != null) {
            this.AttrList = new Attribute[source.AttrList.length];
            for (int i = 0; i < source.AttrList.length; i++) {
                this.AttrList[i] = new Attribute(source.AttrList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Desc.", this.Desc);
        this.setParamObj(map, prefix + "Part.", this.Part);
        this.setParamObj(map, prefix + "Grade.", this.Grade);
        this.setParamArrayObj(map, prefix + "AttrList.", this.AttrList);

    }
}

