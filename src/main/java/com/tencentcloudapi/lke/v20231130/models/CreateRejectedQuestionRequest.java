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

public class CreateRejectedQuestionRequest extends AbstractModel {

    /**
    * 应用ID, 获取方式参看如何获取[BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa)
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * 拒答问题


    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
    * 拒答问题来源， 1- 来源于不满意回复;  2 - 来源于手动添加
    */
    @SerializedName("BusinessSource")
    @Expose
    private Long BusinessSource;

    /**
    * 拒答问题来源的数据源唯一id


    */
    @SerializedName("BusinessId")
    @Expose
    private String BusinessId;

    /**
     * Get 应用ID, 获取方式参看如何获取[BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa) 
     * @return BotBizId 应用ID, 获取方式参看如何获取[BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa)
     */
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set 应用ID, 获取方式参看如何获取[BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa)
     * @param BotBizId 应用ID, 获取方式参看如何获取[BotBizId](https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa)
     */
    public void setBotBizId(String BotBizId) {
        this.BotBizId = BotBizId;
    }

    /**
     * Get 拒答问题

 
     * @return Question 拒答问题


     */
    public String getQuestion() {
        return this.Question;
    }

    /**
     * Set 拒答问题


     * @param Question 拒答问题


     */
    public void setQuestion(String Question) {
        this.Question = Question;
    }

    /**
     * Get 拒答问题来源， 1- 来源于不满意回复;  2 - 来源于手动添加 
     * @return BusinessSource 拒答问题来源， 1- 来源于不满意回复;  2 - 来源于手动添加
     */
    public Long getBusinessSource() {
        return this.BusinessSource;
    }

    /**
     * Set 拒答问题来源， 1- 来源于不满意回复;  2 - 来源于手动添加
     * @param BusinessSource 拒答问题来源， 1- 来源于不满意回复;  2 - 来源于手动添加
     */
    public void setBusinessSource(Long BusinessSource) {
        this.BusinessSource = BusinessSource;
    }

    /**
     * Get 拒答问题来源的数据源唯一id

 
     * @return BusinessId 拒答问题来源的数据源唯一id


     */
    public String getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set 拒答问题来源的数据源唯一id


     * @param BusinessId 拒答问题来源的数据源唯一id


     */
    public void setBusinessId(String BusinessId) {
        this.BusinessId = BusinessId;
    }

    public CreateRejectedQuestionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRejectedQuestionRequest(CreateRejectedQuestionRequest source) {
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.BusinessSource != null) {
            this.BusinessSource = new Long(source.BusinessSource);
        }
        if (source.BusinessId != null) {
            this.BusinessId = new String(source.BusinessId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamSimple(map, prefix + "BusinessSource", this.BusinessSource);
        this.setParamSimple(map, prefix + "BusinessId", this.BusinessId);

    }
}

