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

public class Maternity extends AbstractModel{

    /**
    * 描述部分
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Desc")
    @Expose
    private MaternityDesc Desc;

    /**
    * 结论部分
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Summary")
    @Expose
    private MaternitySummary Summary;

    /**
    * 报告原文
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcrText")
    @Expose
    private String OcrText;

    /**
     * Get 描述部分
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Desc 描述部分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MaternityDesc getDesc() {
        return this.Desc;
    }

    /**
     * Set 描述部分
注意：此字段可能返回 null，表示取不到有效值。
     * @param Desc 描述部分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDesc(MaternityDesc Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 结论部分
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Summary 结论部分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MaternitySummary getSummary() {
        return this.Summary;
    }

    /**
     * Set 结论部分
注意：此字段可能返回 null，表示取不到有效值。
     * @param Summary 结论部分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSummary(MaternitySummary Summary) {
        this.Summary = Summary;
    }

    /**
     * Get 报告原文
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcrText 报告原文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOcrText() {
        return this.OcrText;
    }

    /**
     * Set 报告原文
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrText 报告原文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrText(String OcrText) {
        this.OcrText = OcrText;
    }

    public Maternity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Maternity(Maternity source) {
        if (source.Desc != null) {
            this.Desc = new MaternityDesc(source.Desc);
        }
        if (source.Summary != null) {
            this.Summary = new MaternitySummary(source.Summary);
        }
        if (source.OcrText != null) {
            this.OcrText = new String(source.OcrText);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Desc.", this.Desc);
        this.setParamObj(map, prefix + "Summary.", this.Summary);
        this.setParamSimple(map, prefix + "OcrText", this.OcrText);

    }
}

