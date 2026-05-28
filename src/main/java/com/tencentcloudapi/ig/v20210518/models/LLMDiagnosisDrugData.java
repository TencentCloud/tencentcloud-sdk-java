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
package com.tencentcloudapi.ig.v20210518.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LLMDiagnosisDrugData extends AbstractModel {

    /**
    * <p>大模型返回问答内容</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>大模型返回思考内容</p>
    */
    @SerializedName("Think")
    @Expose
    private String Think;

    /**
    * <p>序号，无业务含义，标识流式结果的序号</p>
    */
    @SerializedName("Sort")
    @Expose
    private Long Sort;

    /**
    * <p>流式输出结束标识，false:未结束，true:结束</p>
    */
    @SerializedName("IsFinish")
    @Expose
    private Boolean IsFinish;

    /**
    * <p>是否命中敏感词，false:否，true:是；</p>
    */
    @SerializedName("IsSensitive")
    @Expose
    private Boolean IsSensitive;

    /**
    * <p>引用资料列表，流式输出方式，只在流式输出第一次返回；</p>
    */
    @SerializedName("ReferResourceItems")
    @Expose
    private ReferResourceInfo [] ReferResourceItems;

    /**
    * <p>猜你想问列表，流式输出方式，只在流式结束输出结果；</p>
    */
    @SerializedName("GuessQuestions")
    @Expose
    private GuessQuestion [] GuessQuestions;

    /**
    * <p>高亮词列表，流式输出方式在流式过程中输出结果。</p>
    */
    @SerializedName("HighlightWords")
    @Expose
    private HighlightWordInfo [] HighlightWords;

    /**
    * <p>药品列表，流式输出方式，只在流式结束输出结果。</p>
    */
    @SerializedName("DrugList")
    @Expose
    private StandardDrugCardInfo [] DrugList;

    /**
     * Get <p>大模型返回问答内容</p> 
     * @return Content <p>大模型返回问答内容</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>大模型返回问答内容</p>
     * @param Content <p>大模型返回问答内容</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>大模型返回思考内容</p> 
     * @return Think <p>大模型返回思考内容</p>
     */
    public String getThink() {
        return this.Think;
    }

    /**
     * Set <p>大模型返回思考内容</p>
     * @param Think <p>大模型返回思考内容</p>
     */
    public void setThink(String Think) {
        this.Think = Think;
    }

    /**
     * Get <p>序号，无业务含义，标识流式结果的序号</p> 
     * @return Sort <p>序号，无业务含义，标识流式结果的序号</p>
     */
    public Long getSort() {
        return this.Sort;
    }

    /**
     * Set <p>序号，无业务含义，标识流式结果的序号</p>
     * @param Sort <p>序号，无业务含义，标识流式结果的序号</p>
     */
    public void setSort(Long Sort) {
        this.Sort = Sort;
    }

    /**
     * Get <p>流式输出结束标识，false:未结束，true:结束</p> 
     * @return IsFinish <p>流式输出结束标识，false:未结束，true:结束</p>
     */
    public Boolean getIsFinish() {
        return this.IsFinish;
    }

    /**
     * Set <p>流式输出结束标识，false:未结束，true:结束</p>
     * @param IsFinish <p>流式输出结束标识，false:未结束，true:结束</p>
     */
    public void setIsFinish(Boolean IsFinish) {
        this.IsFinish = IsFinish;
    }

    /**
     * Get <p>是否命中敏感词，false:否，true:是；</p> 
     * @return IsSensitive <p>是否命中敏感词，false:否，true:是；</p>
     */
    public Boolean getIsSensitive() {
        return this.IsSensitive;
    }

    /**
     * Set <p>是否命中敏感词，false:否，true:是；</p>
     * @param IsSensitive <p>是否命中敏感词，false:否，true:是；</p>
     */
    public void setIsSensitive(Boolean IsSensitive) {
        this.IsSensitive = IsSensitive;
    }

    /**
     * Get <p>引用资料列表，流式输出方式，只在流式输出第一次返回；</p> 
     * @return ReferResourceItems <p>引用资料列表，流式输出方式，只在流式输出第一次返回；</p>
     */
    public ReferResourceInfo [] getReferResourceItems() {
        return this.ReferResourceItems;
    }

    /**
     * Set <p>引用资料列表，流式输出方式，只在流式输出第一次返回；</p>
     * @param ReferResourceItems <p>引用资料列表，流式输出方式，只在流式输出第一次返回；</p>
     */
    public void setReferResourceItems(ReferResourceInfo [] ReferResourceItems) {
        this.ReferResourceItems = ReferResourceItems;
    }

    /**
     * Get <p>猜你想问列表，流式输出方式，只在流式结束输出结果；</p> 
     * @return GuessQuestions <p>猜你想问列表，流式输出方式，只在流式结束输出结果；</p>
     */
    public GuessQuestion [] getGuessQuestions() {
        return this.GuessQuestions;
    }

    /**
     * Set <p>猜你想问列表，流式输出方式，只在流式结束输出结果；</p>
     * @param GuessQuestions <p>猜你想问列表，流式输出方式，只在流式结束输出结果；</p>
     */
    public void setGuessQuestions(GuessQuestion [] GuessQuestions) {
        this.GuessQuestions = GuessQuestions;
    }

    /**
     * Get <p>高亮词列表，流式输出方式在流式过程中输出结果。</p> 
     * @return HighlightWords <p>高亮词列表，流式输出方式在流式过程中输出结果。</p>
     */
    public HighlightWordInfo [] getHighlightWords() {
        return this.HighlightWords;
    }

    /**
     * Set <p>高亮词列表，流式输出方式在流式过程中输出结果。</p>
     * @param HighlightWords <p>高亮词列表，流式输出方式在流式过程中输出结果。</p>
     */
    public void setHighlightWords(HighlightWordInfo [] HighlightWords) {
        this.HighlightWords = HighlightWords;
    }

    /**
     * Get <p>药品列表，流式输出方式，只在流式结束输出结果。</p> 
     * @return DrugList <p>药品列表，流式输出方式，只在流式结束输出结果。</p>
     */
    public StandardDrugCardInfo [] getDrugList() {
        return this.DrugList;
    }

    /**
     * Set <p>药品列表，流式输出方式，只在流式结束输出结果。</p>
     * @param DrugList <p>药品列表，流式输出方式，只在流式结束输出结果。</p>
     */
    public void setDrugList(StandardDrugCardInfo [] DrugList) {
        this.DrugList = DrugList;
    }

    public LLMDiagnosisDrugData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LLMDiagnosisDrugData(LLMDiagnosisDrugData source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Think != null) {
            this.Think = new String(source.Think);
        }
        if (source.Sort != null) {
            this.Sort = new Long(source.Sort);
        }
        if (source.IsFinish != null) {
            this.IsFinish = new Boolean(source.IsFinish);
        }
        if (source.IsSensitive != null) {
            this.IsSensitive = new Boolean(source.IsSensitive);
        }
        if (source.ReferResourceItems != null) {
            this.ReferResourceItems = new ReferResourceInfo[source.ReferResourceItems.length];
            for (int i = 0; i < source.ReferResourceItems.length; i++) {
                this.ReferResourceItems[i] = new ReferResourceInfo(source.ReferResourceItems[i]);
            }
        }
        if (source.GuessQuestions != null) {
            this.GuessQuestions = new GuessQuestion[source.GuessQuestions.length];
            for (int i = 0; i < source.GuessQuestions.length; i++) {
                this.GuessQuestions[i] = new GuessQuestion(source.GuessQuestions[i]);
            }
        }
        if (source.HighlightWords != null) {
            this.HighlightWords = new HighlightWordInfo[source.HighlightWords.length];
            for (int i = 0; i < source.HighlightWords.length; i++) {
                this.HighlightWords[i] = new HighlightWordInfo(source.HighlightWords[i]);
            }
        }
        if (source.DrugList != null) {
            this.DrugList = new StandardDrugCardInfo[source.DrugList.length];
            for (int i = 0; i < source.DrugList.length; i++) {
                this.DrugList[i] = new StandardDrugCardInfo(source.DrugList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Think", this.Think);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "IsFinish", this.IsFinish);
        this.setParamSimple(map, prefix + "IsSensitive", this.IsSensitive);
        this.setParamArrayObj(map, prefix + "ReferResourceItems.", this.ReferResourceItems);
        this.setParamArrayObj(map, prefix + "GuessQuestions.", this.GuessQuestions);
        this.setParamArrayObj(map, prefix + "HighlightWords.", this.HighlightWords);
        this.setParamArrayObj(map, prefix + "DrugList.", this.DrugList);

    }
}

