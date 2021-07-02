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

public class Inspection extends AbstractModel{

    /**
    * 检查所见
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Finding")
    @Expose
    private Finding Finding;

    /**
    * 检查结论
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Conclusion")
    @Expose
    private Conclusion Conclusion;

    /**
     * Get 检查所见
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Finding 检查所见
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Finding getFinding() {
        return this.Finding;
    }

    /**
     * Set 检查所见
注意：此字段可能返回 null，表示取不到有效值。
     * @param Finding 检查所见
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFinding(Finding Finding) {
        this.Finding = Finding;
    }

    /**
     * Get 检查结论
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Conclusion 检查结论
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Conclusion getConclusion() {
        return this.Conclusion;
    }

    /**
     * Set 检查结论
注意：此字段可能返回 null，表示取不到有效值。
     * @param Conclusion 检查结论
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConclusion(Conclusion Conclusion) {
        this.Conclusion = Conclusion;
    }

    public Inspection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Inspection(Inspection source) {
        if (source.Finding != null) {
            this.Finding = new Finding(source.Finding);
        }
        if (source.Conclusion != null) {
            this.Conclusion = new Conclusion(source.Conclusion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Finding.", this.Finding);
        this.setParamObj(map, prefix + "Conclusion.", this.Conclusion);

    }
}

