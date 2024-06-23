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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRejectedQuestionRequest extends AbstractModel {

    /**
    * 应用ID
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
    * 拒答问题来源的数据源唯一id



    */
    @SerializedName("RejectedBizId")
    @Expose
    private String RejectedBizId;

    /**
     * Get 应用ID 
     * @return BotBizId 应用ID
     */
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set 应用ID
     * @param BotBizId 应用ID
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
     * Get 拒答问题来源的数据源唯一id


 
     * @return RejectedBizId 拒答问题来源的数据源唯一id



     */
    public String getRejectedBizId() {
        return this.RejectedBizId;
    }

    /**
     * Set 拒答问题来源的数据源唯一id



     * @param RejectedBizId 拒答问题来源的数据源唯一id



     */
    public void setRejectedBizId(String RejectedBizId) {
        this.RejectedBizId = RejectedBizId;
    }

    public ModifyRejectedQuestionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRejectedQuestionRequest(ModifyRejectedQuestionRequest source) {
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.RejectedBizId != null) {
            this.RejectedBizId = new String(source.RejectedBizId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamSimple(map, prefix + "RejectedBizId", this.RejectedBizId);

    }
}

