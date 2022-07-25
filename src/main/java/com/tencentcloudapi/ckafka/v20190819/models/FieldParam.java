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

public class FieldParam extends AbstractModel{

    /**
    * 解析
    */
    @SerializedName("Analyse")
    @Expose
    private AnalyseParam Analyse;

    /**
    * 二次解析
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecondaryAnalyse")
    @Expose
    private SecondaryAnalyseParam SecondaryAnalyse;

    /**
    * 数据处理
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SMT")
    @Expose
    private SMTParam [] SMT;

    /**
    * 测试结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 解析结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AnalyseResult")
    @Expose
    private SMTParam [] AnalyseResult;

    /**
    * 二次解析结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecondaryAnalyseResult")
    @Expose
    private SMTParam [] SecondaryAnalyseResult;

    /**
    * JSON格式解析结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AnalyseJsonResult")
    @Expose
    private String AnalyseJsonResult;

    /**
    * JSON格式二次解析结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecondaryAnalyseJsonResult")
    @Expose
    private String SecondaryAnalyseJsonResult;

    /**
     * Get 解析 
     * @return Analyse 解析
     */
    public AnalyseParam getAnalyse() {
        return this.Analyse;
    }

    /**
     * Set 解析
     * @param Analyse 解析
     */
    public void setAnalyse(AnalyseParam Analyse) {
        this.Analyse = Analyse;
    }

    /**
     * Get 二次解析
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecondaryAnalyse 二次解析
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SecondaryAnalyseParam getSecondaryAnalyse() {
        return this.SecondaryAnalyse;
    }

    /**
     * Set 二次解析
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecondaryAnalyse 二次解析
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecondaryAnalyse(SecondaryAnalyseParam SecondaryAnalyse) {
        this.SecondaryAnalyse = SecondaryAnalyse;
    }

    /**
     * Get 数据处理
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SMT 数据处理
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SMTParam [] getSMT() {
        return this.SMT;
    }

    /**
     * Set 数据处理
注意：此字段可能返回 null，表示取不到有效值。
     * @param SMT 数据处理
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSMT(SMTParam [] SMT) {
        this.SMT = SMT;
    }

    /**
     * Get 测试结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Result 测试结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 测试结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param Result 测试结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 解析结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AnalyseResult 解析结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SMTParam [] getAnalyseResult() {
        return this.AnalyseResult;
    }

    /**
     * Set 解析结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param AnalyseResult 解析结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnalyseResult(SMTParam [] AnalyseResult) {
        this.AnalyseResult = AnalyseResult;
    }

    /**
     * Get 二次解析结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecondaryAnalyseResult 二次解析结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SMTParam [] getSecondaryAnalyseResult() {
        return this.SecondaryAnalyseResult;
    }

    /**
     * Set 二次解析结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecondaryAnalyseResult 二次解析结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecondaryAnalyseResult(SMTParam [] SecondaryAnalyseResult) {
        this.SecondaryAnalyseResult = SecondaryAnalyseResult;
    }

    /**
     * Get JSON格式解析结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AnalyseJsonResult JSON格式解析结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAnalyseJsonResult() {
        return this.AnalyseJsonResult;
    }

    /**
     * Set JSON格式解析结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param AnalyseJsonResult JSON格式解析结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnalyseJsonResult(String AnalyseJsonResult) {
        this.AnalyseJsonResult = AnalyseJsonResult;
    }

    /**
     * Get JSON格式二次解析结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecondaryAnalyseJsonResult JSON格式二次解析结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSecondaryAnalyseJsonResult() {
        return this.SecondaryAnalyseJsonResult;
    }

    /**
     * Set JSON格式二次解析结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecondaryAnalyseJsonResult JSON格式二次解析结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecondaryAnalyseJsonResult(String SecondaryAnalyseJsonResult) {
        this.SecondaryAnalyseJsonResult = SecondaryAnalyseJsonResult;
    }

    public FieldParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FieldParam(FieldParam source) {
        if (source.Analyse != null) {
            this.Analyse = new AnalyseParam(source.Analyse);
        }
        if (source.SecondaryAnalyse != null) {
            this.SecondaryAnalyse = new SecondaryAnalyseParam(source.SecondaryAnalyse);
        }
        if (source.SMT != null) {
            this.SMT = new SMTParam[source.SMT.length];
            for (int i = 0; i < source.SMT.length; i++) {
                this.SMT[i] = new SMTParam(source.SMT[i]);
            }
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.AnalyseResult != null) {
            this.AnalyseResult = new SMTParam[source.AnalyseResult.length];
            for (int i = 0; i < source.AnalyseResult.length; i++) {
                this.AnalyseResult[i] = new SMTParam(source.AnalyseResult[i]);
            }
        }
        if (source.SecondaryAnalyseResult != null) {
            this.SecondaryAnalyseResult = new SMTParam[source.SecondaryAnalyseResult.length];
            for (int i = 0; i < source.SecondaryAnalyseResult.length; i++) {
                this.SecondaryAnalyseResult[i] = new SMTParam(source.SecondaryAnalyseResult[i]);
            }
        }
        if (source.AnalyseJsonResult != null) {
            this.AnalyseJsonResult = new String(source.AnalyseJsonResult);
        }
        if (source.SecondaryAnalyseJsonResult != null) {
            this.SecondaryAnalyseJsonResult = new String(source.SecondaryAnalyseJsonResult);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Analyse.", this.Analyse);
        this.setParamObj(map, prefix + "SecondaryAnalyse.", this.SecondaryAnalyse);
        this.setParamArrayObj(map, prefix + "SMT.", this.SMT);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamArrayObj(map, prefix + "AnalyseResult.", this.AnalyseResult);
        this.setParamArrayObj(map, prefix + "SecondaryAnalyseResult.", this.SecondaryAnalyseResult);
        this.setParamSimple(map, prefix + "AnalyseJsonResult", this.AnalyseJsonResult);
        this.setParamSimple(map, prefix + "SecondaryAnalyseJsonResult", this.SecondaryAnalyseJsonResult);

    }
}

