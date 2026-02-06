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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MarkInfo extends AbstractModel {

    /**
    * 题目的题干信息 


    */
    @SerializedName("MarkItemTitle")
    @Expose
    private String MarkItemTitle;

    /**
    * 批改答案列表（每个小题存在多个答案，比如多个填空区域答案，循序按照从左到右，从上到下排列）
    */
    @SerializedName("AnswerInfos")
    @Expose
    private AnswerInfo [] AnswerInfos;

    /**
    * 嵌套题目结构（如果有多层嵌套则会返回子题信息，如果没有嵌套题目则返回空）
    */
    @SerializedName("MarkInfos")
    @Expose
    private MarkInfo [] MarkInfos;

    /**
     * Get 题目的题干信息 

 
     * @return MarkItemTitle 题目的题干信息 


     */
    public String getMarkItemTitle() {
        return this.MarkItemTitle;
    }

    /**
     * Set 题目的题干信息 


     * @param MarkItemTitle 题目的题干信息 


     */
    public void setMarkItemTitle(String MarkItemTitle) {
        this.MarkItemTitle = MarkItemTitle;
    }

    /**
     * Get 批改答案列表（每个小题存在多个答案，比如多个填空区域答案，循序按照从左到右，从上到下排列） 
     * @return AnswerInfos 批改答案列表（每个小题存在多个答案，比如多个填空区域答案，循序按照从左到右，从上到下排列）
     */
    public AnswerInfo [] getAnswerInfos() {
        return this.AnswerInfos;
    }

    /**
     * Set 批改答案列表（每个小题存在多个答案，比如多个填空区域答案，循序按照从左到右，从上到下排列）
     * @param AnswerInfos 批改答案列表（每个小题存在多个答案，比如多个填空区域答案，循序按照从左到右，从上到下排列）
     */
    public void setAnswerInfos(AnswerInfo [] AnswerInfos) {
        this.AnswerInfos = AnswerInfos;
    }

    /**
     * Get 嵌套题目结构（如果有多层嵌套则会返回子题信息，如果没有嵌套题目则返回空） 
     * @return MarkInfos 嵌套题目结构（如果有多层嵌套则会返回子题信息，如果没有嵌套题目则返回空）
     */
    public MarkInfo [] getMarkInfos() {
        return this.MarkInfos;
    }

    /**
     * Set 嵌套题目结构（如果有多层嵌套则会返回子题信息，如果没有嵌套题目则返回空）
     * @param MarkInfos 嵌套题目结构（如果有多层嵌套则会返回子题信息，如果没有嵌套题目则返回空）
     */
    public void setMarkInfos(MarkInfo [] MarkInfos) {
        this.MarkInfos = MarkInfos;
    }

    public MarkInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MarkInfo(MarkInfo source) {
        if (source.MarkItemTitle != null) {
            this.MarkItemTitle = new String(source.MarkItemTitle);
        }
        if (source.AnswerInfos != null) {
            this.AnswerInfos = new AnswerInfo[source.AnswerInfos.length];
            for (int i = 0; i < source.AnswerInfos.length; i++) {
                this.AnswerInfos[i] = new AnswerInfo(source.AnswerInfos[i]);
            }
        }
        if (source.MarkInfos != null) {
            this.MarkInfos = new MarkInfo[source.MarkInfos.length];
            for (int i = 0; i < source.MarkInfos.length; i++) {
                this.MarkInfos[i] = new MarkInfo(source.MarkInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MarkItemTitle", this.MarkItemTitle);
        this.setParamArrayObj(map, prefix + "AnswerInfos.", this.AnswerInfos);
        this.setParamArrayObj(map, prefix + "MarkInfos.", this.MarkInfos);

    }
}

