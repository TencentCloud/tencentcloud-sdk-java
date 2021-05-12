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
package com.tencentcloudapi.nlp.v20190408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClassificationResult extends AbstractModel{

    /**
    * 一级分类名称
    */
    @SerializedName("FirstClassName")
    @Expose
    private String FirstClassName;

    /**
    * 二级分类名称
    */
    @SerializedName("SecondClassName")
    @Expose
    private String SecondClassName;

    /**
    * 一级分类概率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirstClassProbability")
    @Expose
    private Float FirstClassProbability;

    /**
    * 二级分类概率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecondClassProbability")
    @Expose
    private Float SecondClassProbability;

    /**
    * 三级分类名称，仅有当新闻领域五分类可能出现，详情见文本分类文档
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ThirdClassName")
    @Expose
    private String ThirdClassName;

    /**
    * 三级分类概率，仅有当新闻领域五分类可能出现，详情见文本分类文档
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ThirdClassProbability")
    @Expose
    private Float ThirdClassProbability;

    /**
    * 四级分类名称，仅有当新闻领域五分类可能出现，详情见文本分类文档
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FourthClassName")
    @Expose
    private String FourthClassName;

    /**
    * 四级分类概率，仅有当新闻领域五分类可能出现，详情见文本分类文档
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FourthClassProbability")
    @Expose
    private Float FourthClassProbability;

    /**
    * 五级分类名称，仅有当新闻领域五分类可能出现，详情见文本分类文档
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FifthClassName")
    @Expose
    private String FifthClassName;

    /**
    * 五级分类概率，仅有当新闻领域五分类可能出现，详情见文本分类文档
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FifthClassProbability")
    @Expose
    private Float FifthClassProbability;

    /**
     * Get 一级分类名称 
     * @return FirstClassName 一级分类名称
     */
    public String getFirstClassName() {
        return this.FirstClassName;
    }

    /**
     * Set 一级分类名称
     * @param FirstClassName 一级分类名称
     */
    public void setFirstClassName(String FirstClassName) {
        this.FirstClassName = FirstClassName;
    }

    /**
     * Get 二级分类名称 
     * @return SecondClassName 二级分类名称
     */
    public String getSecondClassName() {
        return this.SecondClassName;
    }

    /**
     * Set 二级分类名称
     * @param SecondClassName 二级分类名称
     */
    public void setSecondClassName(String SecondClassName) {
        this.SecondClassName = SecondClassName;
    }

    /**
     * Get 一级分类概率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirstClassProbability 一级分类概率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getFirstClassProbability() {
        return this.FirstClassProbability;
    }

    /**
     * Set 一级分类概率
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirstClassProbability 一级分类概率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirstClassProbability(Float FirstClassProbability) {
        this.FirstClassProbability = FirstClassProbability;
    }

    /**
     * Get 二级分类概率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecondClassProbability 二级分类概率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getSecondClassProbability() {
        return this.SecondClassProbability;
    }

    /**
     * Set 二级分类概率
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecondClassProbability 二级分类概率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecondClassProbability(Float SecondClassProbability) {
        this.SecondClassProbability = SecondClassProbability;
    }

    /**
     * Get 三级分类名称，仅有当新闻领域五分类可能出现，详情见文本分类文档
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ThirdClassName 三级分类名称，仅有当新闻领域五分类可能出现，详情见文本分类文档
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getThirdClassName() {
        return this.ThirdClassName;
    }

    /**
     * Set 三级分类名称，仅有当新闻领域五分类可能出现，详情见文本分类文档
注意：此字段可能返回 null，表示取不到有效值。
     * @param ThirdClassName 三级分类名称，仅有当新闻领域五分类可能出现，详情见文本分类文档
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setThirdClassName(String ThirdClassName) {
        this.ThirdClassName = ThirdClassName;
    }

    /**
     * Get 三级分类概率，仅有当新闻领域五分类可能出现，详情见文本分类文档
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ThirdClassProbability 三级分类概率，仅有当新闻领域五分类可能出现，详情见文本分类文档
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getThirdClassProbability() {
        return this.ThirdClassProbability;
    }

    /**
     * Set 三级分类概率，仅有当新闻领域五分类可能出现，详情见文本分类文档
注意：此字段可能返回 null，表示取不到有效值。
     * @param ThirdClassProbability 三级分类概率，仅有当新闻领域五分类可能出现，详情见文本分类文档
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setThirdClassProbability(Float ThirdClassProbability) {
        this.ThirdClassProbability = ThirdClassProbability;
    }

    /**
     * Get 四级分类名称，仅有当新闻领域五分类可能出现，详情见文本分类文档
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FourthClassName 四级分类名称，仅有当新闻领域五分类可能出现，详情见文本分类文档
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFourthClassName() {
        return this.FourthClassName;
    }

    /**
     * Set 四级分类名称，仅有当新闻领域五分类可能出现，详情见文本分类文档
注意：此字段可能返回 null，表示取不到有效值。
     * @param FourthClassName 四级分类名称，仅有当新闻领域五分类可能出现，详情见文本分类文档
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFourthClassName(String FourthClassName) {
        this.FourthClassName = FourthClassName;
    }

    /**
     * Get 四级分类概率，仅有当新闻领域五分类可能出现，详情见文本分类文档
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FourthClassProbability 四级分类概率，仅有当新闻领域五分类可能出现，详情见文本分类文档
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getFourthClassProbability() {
        return this.FourthClassProbability;
    }

    /**
     * Set 四级分类概率，仅有当新闻领域五分类可能出现，详情见文本分类文档
注意：此字段可能返回 null，表示取不到有效值。
     * @param FourthClassProbability 四级分类概率，仅有当新闻领域五分类可能出现，详情见文本分类文档
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFourthClassProbability(Float FourthClassProbability) {
        this.FourthClassProbability = FourthClassProbability;
    }

    /**
     * Get 五级分类名称，仅有当新闻领域五分类可能出现，详情见文本分类文档
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FifthClassName 五级分类名称，仅有当新闻领域五分类可能出现，详情见文本分类文档
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFifthClassName() {
        return this.FifthClassName;
    }

    /**
     * Set 五级分类名称，仅有当新闻领域五分类可能出现，详情见文本分类文档
注意：此字段可能返回 null，表示取不到有效值。
     * @param FifthClassName 五级分类名称，仅有当新闻领域五分类可能出现，详情见文本分类文档
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFifthClassName(String FifthClassName) {
        this.FifthClassName = FifthClassName;
    }

    /**
     * Get 五级分类概率，仅有当新闻领域五分类可能出现，详情见文本分类文档
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FifthClassProbability 五级分类概率，仅有当新闻领域五分类可能出现，详情见文本分类文档
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getFifthClassProbability() {
        return this.FifthClassProbability;
    }

    /**
     * Set 五级分类概率，仅有当新闻领域五分类可能出现，详情见文本分类文档
注意：此字段可能返回 null，表示取不到有效值。
     * @param FifthClassProbability 五级分类概率，仅有当新闻领域五分类可能出现，详情见文本分类文档
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFifthClassProbability(Float FifthClassProbability) {
        this.FifthClassProbability = FifthClassProbability;
    }

    public ClassificationResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClassificationResult(ClassificationResult source) {
        if (source.FirstClassName != null) {
            this.FirstClassName = new String(source.FirstClassName);
        }
        if (source.SecondClassName != null) {
            this.SecondClassName = new String(source.SecondClassName);
        }
        if (source.FirstClassProbability != null) {
            this.FirstClassProbability = new Float(source.FirstClassProbability);
        }
        if (source.SecondClassProbability != null) {
            this.SecondClassProbability = new Float(source.SecondClassProbability);
        }
        if (source.ThirdClassName != null) {
            this.ThirdClassName = new String(source.ThirdClassName);
        }
        if (source.ThirdClassProbability != null) {
            this.ThirdClassProbability = new Float(source.ThirdClassProbability);
        }
        if (source.FourthClassName != null) {
            this.FourthClassName = new String(source.FourthClassName);
        }
        if (source.FourthClassProbability != null) {
            this.FourthClassProbability = new Float(source.FourthClassProbability);
        }
        if (source.FifthClassName != null) {
            this.FifthClassName = new String(source.FifthClassName);
        }
        if (source.FifthClassProbability != null) {
            this.FifthClassProbability = new Float(source.FifthClassProbability);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FirstClassName", this.FirstClassName);
        this.setParamSimple(map, prefix + "SecondClassName", this.SecondClassName);
        this.setParamSimple(map, prefix + "FirstClassProbability", this.FirstClassProbability);
        this.setParamSimple(map, prefix + "SecondClassProbability", this.SecondClassProbability);
        this.setParamSimple(map, prefix + "ThirdClassName", this.ThirdClassName);
        this.setParamSimple(map, prefix + "ThirdClassProbability", this.ThirdClassProbability);
        this.setParamSimple(map, prefix + "FourthClassName", this.FourthClassName);
        this.setParamSimple(map, prefix + "FourthClassProbability", this.FourthClassProbability);
        this.setParamSimple(map, prefix + "FifthClassName", this.FifthClassName);
        this.setParamSimple(map, prefix + "FifthClassProbability", this.FifthClassProbability);

    }
}

