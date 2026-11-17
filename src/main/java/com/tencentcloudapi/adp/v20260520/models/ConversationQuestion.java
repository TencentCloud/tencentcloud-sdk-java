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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConversationQuestion extends AbstractModel {

    /**
    * <p>问题序号</p>
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
    * <p>问题内容</p>
    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
    * <p>是否必答</p>
    */
    @SerializedName("Required")
    @Expose
    private Boolean Required;

    /**
    * <p>问题类型 枚举值: 0-QUESTION_TYPE_UNSPECIFIED(未指定), 1-QUESTION_TYPE_SINGLE(单选), 2-QUESTION_TYPE_MULTIPLE(多选)</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>选项列表</p>
    */
    @SerializedName("OptionList")
    @Expose
    private ConversationQuestionOption [] OptionList;

    /**
    * <p>选项列表</p>
    */
    @SerializedName("Options")
    @Expose
    private ConversationQuestionOption [] Options;

    /**
     * Get <p>问题序号</p> 
     * @return Index <p>问题序号</p>
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set <p>问题序号</p>
     * @param Index <p>问题序号</p>
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    /**
     * Get <p>问题内容</p> 
     * @return Question <p>问题内容</p>
     */
    public String getQuestion() {
        return this.Question;
    }

    /**
     * Set <p>问题内容</p>
     * @param Question <p>问题内容</p>
     */
    public void setQuestion(String Question) {
        this.Question = Question;
    }

    /**
     * Get <p>是否必答</p> 
     * @return Required <p>是否必答</p>
     */
    public Boolean getRequired() {
        return this.Required;
    }

    /**
     * Set <p>是否必答</p>
     * @param Required <p>是否必答</p>
     */
    public void setRequired(Boolean Required) {
        this.Required = Required;
    }

    /**
     * Get <p>问题类型 枚举值: 0-QUESTION_TYPE_UNSPECIFIED(未指定), 1-QUESTION_TYPE_SINGLE(单选), 2-QUESTION_TYPE_MULTIPLE(多选)</p> 
     * @return Type <p>问题类型 枚举值: 0-QUESTION_TYPE_UNSPECIFIED(未指定), 1-QUESTION_TYPE_SINGLE(单选), 2-QUESTION_TYPE_MULTIPLE(多选)</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>问题类型 枚举值: 0-QUESTION_TYPE_UNSPECIFIED(未指定), 1-QUESTION_TYPE_SINGLE(单选), 2-QUESTION_TYPE_MULTIPLE(多选)</p>
     * @param Type <p>问题类型 枚举值: 0-QUESTION_TYPE_UNSPECIFIED(未指定), 1-QUESTION_TYPE_SINGLE(单选), 2-QUESTION_TYPE_MULTIPLE(多选)</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>选项列表</p> 
     * @return OptionList <p>选项列表</p>
     */
    public ConversationQuestionOption [] getOptionList() {
        return this.OptionList;
    }

    /**
     * Set <p>选项列表</p>
     * @param OptionList <p>选项列表</p>
     */
    public void setOptionList(ConversationQuestionOption [] OptionList) {
        this.OptionList = OptionList;
    }

    /**
     * Get <p>选项列表</p> 
     * @return Options <p>选项列表</p>
     */
    public ConversationQuestionOption [] getOptions() {
        return this.Options;
    }

    /**
     * Set <p>选项列表</p>
     * @param Options <p>选项列表</p>
     */
    public void setOptions(ConversationQuestionOption [] Options) {
        this.Options = Options;
    }

    public ConversationQuestion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConversationQuestion(ConversationQuestion source) {
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.Required != null) {
            this.Required = new Boolean(source.Required);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.OptionList != null) {
            this.OptionList = new ConversationQuestionOption[source.OptionList.length];
            for (int i = 0; i < source.OptionList.length; i++) {
                this.OptionList[i] = new ConversationQuestionOption(source.OptionList[i]);
            }
        }
        if (source.Options != null) {
            this.Options = new ConversationQuestionOption[source.Options.length];
            for (int i = 0; i < source.Options.length; i++) {
                this.Options[i] = new ConversationQuestionOption(source.Options[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamSimple(map, prefix + "Required", this.Required);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "OptionList.", this.OptionList);
        this.setParamArrayObj(map, prefix + "Options.", this.Options);

    }
}

