/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QuestionnaireQuestion extends AbstractModel {

    /**
    * <p>问题的序号</p>
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
    * <p>问题的内容</p>
    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
    * <p>问题类型</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>是否必选</p>
    */
    @SerializedName("Required")
    @Expose
    private Boolean Required;

    /**
    * <p>问题的选项</p>
    */
    @SerializedName("Options")
    @Expose
    private QuestionOption [] Options;

    /**
     * Get <p>问题的序号</p> 
     * @return Index <p>问题的序号</p>
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set <p>问题的序号</p>
     * @param Index <p>问题的序号</p>
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    /**
     * Get <p>问题的内容</p> 
     * @return Question <p>问题的内容</p>
     */
    public String getQuestion() {
        return this.Question;
    }

    /**
     * Set <p>问题的内容</p>
     * @param Question <p>问题的内容</p>
     */
    public void setQuestion(String Question) {
        this.Question = Question;
    }

    /**
     * Get <p>问题类型</p> 
     * @return Type <p>问题类型</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>问题类型</p>
     * @param Type <p>问题类型</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>是否必选</p> 
     * @return Required <p>是否必选</p>
     */
    public Boolean getRequired() {
        return this.Required;
    }

    /**
     * Set <p>是否必选</p>
     * @param Required <p>是否必选</p>
     */
    public void setRequired(Boolean Required) {
        this.Required = Required;
    }

    /**
     * Get <p>问题的选项</p> 
     * @return Options <p>问题的选项</p>
     */
    public QuestionOption [] getOptions() {
        return this.Options;
    }

    /**
     * Set <p>问题的选项</p>
     * @param Options <p>问题的选项</p>
     */
    public void setOptions(QuestionOption [] Options) {
        this.Options = Options;
    }

    public QuestionnaireQuestion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QuestionnaireQuestion(QuestionnaireQuestion source) {
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Required != null) {
            this.Required = new Boolean(source.Required);
        }
        if (source.Options != null) {
            this.Options = new QuestionOption[source.Options.length];
            for (int i = 0; i < source.Options.length; i++) {
                this.Options[i] = new QuestionOption(source.Options[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Required", this.Required);
        this.setParamArrayObj(map, prefix + "Options.", this.Options);

    }
}

