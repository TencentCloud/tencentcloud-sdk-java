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

public class Desc extends AbstractModel{

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 器官
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Organ")
    @Expose
    private Organ [] Organ;

    /**
    * 结节
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tuber")
    @Expose
    private TuberInfo [] Tuber;

    /**
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Text 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Text 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 器官
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Organ 器官
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Organ [] getOrgan() {
        return this.Organ;
    }

    /**
     * Set 器官
注意：此字段可能返回 null，表示取不到有效值。
     * @param Organ 器官
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrgan(Organ [] Organ) {
        this.Organ = Organ;
    }

    /**
     * Get 结节
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tuber 结节
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TuberInfo [] getTuber() {
        return this.Tuber;
    }

    /**
     * Set 结节
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tuber 结节
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTuber(TuberInfo [] Tuber) {
        this.Tuber = Tuber;
    }

    public Desc() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Desc(Desc source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Organ != null) {
            this.Organ = new Organ[source.Organ.length];
            for (int i = 0; i < source.Organ.length; i++) {
                this.Organ[i] = new Organ(source.Organ[i]);
            }
        }
        if (source.Tuber != null) {
            this.Tuber = new TuberInfo[source.Tuber.length];
            for (int i = 0; i < source.Tuber.length; i++) {
                this.Tuber[i] = new TuberInfo(source.Tuber[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamArrayObj(map, prefix + "Organ.", this.Organ);
        this.setParamArrayObj(map, prefix + "Tuber.", this.Tuber);

    }
}

