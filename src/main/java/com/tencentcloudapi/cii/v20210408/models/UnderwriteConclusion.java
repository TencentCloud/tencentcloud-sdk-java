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

public class UnderwriteConclusion extends AbstractModel{

    /**
    * 类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 结论
    */
    @SerializedName("Conclusion")
    @Expose
    private String Conclusion;

    /**
    * 解释
    */
    @SerializedName("Explanation")
    @Expose
    private String Explanation;

    /**
     * Get 类型 
     * @return Type 类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型
     * @param Type 类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 结论 
     * @return Conclusion 结论
     */
    public String getConclusion() {
        return this.Conclusion;
    }

    /**
     * Set 结论
     * @param Conclusion 结论
     */
    public void setConclusion(String Conclusion) {
        this.Conclusion = Conclusion;
    }

    /**
     * Get 解释 
     * @return Explanation 解释
     */
    public String getExplanation() {
        return this.Explanation;
    }

    /**
     * Set 解释
     * @param Explanation 解释
     */
    public void setExplanation(String Explanation) {
        this.Explanation = Explanation;
    }

    public UnderwriteConclusion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnderwriteConclusion(UnderwriteConclusion source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Conclusion != null) {
            this.Conclusion = new String(source.Conclusion);
        }
        if (source.Explanation != null) {
            this.Explanation = new String(source.Explanation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Conclusion", this.Conclusion);
        this.setParamSimple(map, prefix + "Explanation", this.Explanation);

    }
}

