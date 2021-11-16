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

public class Endoscopy extends AbstractModel{

    /**
    * 活检部位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BiopsyPart")
    @Expose
    private BiopsyPart BiopsyPart;

    /**
    * 可见描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Desc")
    @Expose
    private EndoscopyDesc Desc;

    /**
    * 结论
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Summary")
    @Expose
    private Summary Summary;

    /**
     * Get 活检部位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BiopsyPart 活检部位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BiopsyPart getBiopsyPart() {
        return this.BiopsyPart;
    }

    /**
     * Set 活检部位
注意：此字段可能返回 null，表示取不到有效值。
     * @param BiopsyPart 活检部位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBiopsyPart(BiopsyPart BiopsyPart) {
        this.BiopsyPart = BiopsyPart;
    }

    /**
     * Get 可见描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Desc 可见描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EndoscopyDesc getDesc() {
        return this.Desc;
    }

    /**
     * Set 可见描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Desc 可见描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDesc(EndoscopyDesc Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 结论
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Summary 结论
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Summary getSummary() {
        return this.Summary;
    }

    /**
     * Set 结论
注意：此字段可能返回 null，表示取不到有效值。
     * @param Summary 结论
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSummary(Summary Summary) {
        this.Summary = Summary;
    }

    public Endoscopy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Endoscopy(Endoscopy source) {
        if (source.BiopsyPart != null) {
            this.BiopsyPart = new BiopsyPart(source.BiopsyPart);
        }
        if (source.Desc != null) {
            this.Desc = new EndoscopyDesc(source.Desc);
        }
        if (source.Summary != null) {
            this.Summary = new Summary(source.Summary);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BiopsyPart.", this.BiopsyPart);
        this.setParamObj(map, prefix + "Desc.", this.Desc);
        this.setParamObj(map, prefix + "Summary.", this.Summary);

    }
}

