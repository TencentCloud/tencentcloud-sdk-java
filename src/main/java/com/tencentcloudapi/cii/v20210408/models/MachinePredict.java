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
package com.tencentcloudapi.cii.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MachinePredict extends AbstractModel{

    /**
    * 核保引擎名称
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 核保结论：加费、承保、拒保、延期、除外、加费+除外
    */
    @SerializedName("Conclusion")
    @Expose
    private String Conclusion;

    /**
    * AI决策树解释
    */
    @SerializedName("Explanation")
    @Expose
    private UnderwriteItem [] Explanation;

    /**
    * 疾病指标
    */
    @SerializedName("Disease")
    @Expose
    private UnderwriteItem [] Disease;

    /**
    * 检查异常
    */
    @SerializedName("Laboratory")
    @Expose
    private UnderwriteItem [] Laboratory;

    /**
     * Get 核保引擎名称 
     * @return Title 核保引擎名称
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 核保引擎名称
     * @param Title 核保引擎名称
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 核保结论：加费、承保、拒保、延期、除外、加费+除外 
     * @return Conclusion 核保结论：加费、承保、拒保、延期、除外、加费+除外
     */
    public String getConclusion() {
        return this.Conclusion;
    }

    /**
     * Set 核保结论：加费、承保、拒保、延期、除外、加费+除外
     * @param Conclusion 核保结论：加费、承保、拒保、延期、除外、加费+除外
     */
    public void setConclusion(String Conclusion) {
        this.Conclusion = Conclusion;
    }

    /**
     * Get AI决策树解释 
     * @return Explanation AI决策树解释
     */
    public UnderwriteItem [] getExplanation() {
        return this.Explanation;
    }

    /**
     * Set AI决策树解释
     * @param Explanation AI决策树解释
     */
    public void setExplanation(UnderwriteItem [] Explanation) {
        this.Explanation = Explanation;
    }

    /**
     * Get 疾病指标 
     * @return Disease 疾病指标
     */
    public UnderwriteItem [] getDisease() {
        return this.Disease;
    }

    /**
     * Set 疾病指标
     * @param Disease 疾病指标
     */
    public void setDisease(UnderwriteItem [] Disease) {
        this.Disease = Disease;
    }

    /**
     * Get 检查异常 
     * @return Laboratory 检查异常
     */
    public UnderwriteItem [] getLaboratory() {
        return this.Laboratory;
    }

    /**
     * Set 检查异常
     * @param Laboratory 检查异常
     */
    public void setLaboratory(UnderwriteItem [] Laboratory) {
        this.Laboratory = Laboratory;
    }

    public MachinePredict() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MachinePredict(MachinePredict source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Conclusion != null) {
            this.Conclusion = new String(source.Conclusion);
        }
        if (source.Explanation != null) {
            this.Explanation = new UnderwriteItem[source.Explanation.length];
            for (int i = 0; i < source.Explanation.length; i++) {
                this.Explanation[i] = new UnderwriteItem(source.Explanation[i]);
            }
        }
        if (source.Disease != null) {
            this.Disease = new UnderwriteItem[source.Disease.length];
            for (int i = 0; i < source.Disease.length; i++) {
                this.Disease[i] = new UnderwriteItem(source.Disease[i]);
            }
        }
        if (source.Laboratory != null) {
            this.Laboratory = new UnderwriteItem[source.Laboratory.length];
            for (int i = 0; i < source.Laboratory.length; i++) {
                this.Laboratory[i] = new UnderwriteItem(source.Laboratory[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Conclusion", this.Conclusion);
        this.setParamArrayObj(map, prefix + "Explanation.", this.Explanation);
        this.setParamArrayObj(map, prefix + "Disease.", this.Disease);
        this.setParamArrayObj(map, prefix + "Laboratory.", this.Laboratory);

    }
}

