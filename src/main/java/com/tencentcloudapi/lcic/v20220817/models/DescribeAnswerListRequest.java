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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAnswerListRequest extends AbstractModel{

    /**
    * 问题ID
    */
    @SerializedName("QuestionId")
    @Expose
    private String QuestionId;

    /**
    * 1
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 问题ID 
     * @return QuestionId 问题ID
     */
    public String getQuestionId() {
        return this.QuestionId;
    }

    /**
     * Set 问题ID
     * @param QuestionId 问题ID
     */
    public void setQuestionId(String QuestionId) {
        this.QuestionId = QuestionId;
    }

    /**
     * Get 1 
     * @return Page 1
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 1
     * @param Page 1
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 100 
     * @return Limit 100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 100
     * @param Limit 100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeAnswerListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAnswerListRequest(DescribeAnswerListRequest source) {
        if (source.QuestionId != null) {
            this.QuestionId = new String(source.QuestionId);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QuestionId", this.QuestionId);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

