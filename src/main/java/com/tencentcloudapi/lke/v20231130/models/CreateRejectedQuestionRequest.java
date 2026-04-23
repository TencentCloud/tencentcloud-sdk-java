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
    * <p>应用ID, 获取方式参看如何获取<a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">BotBizId</a></p>
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * <p>拒答问题</p>
    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
    * <p>拒答问题来源， 1- 来源于不满意回复;  2 - 来源于手动添加</p>
    */
    @SerializedName("BusinessSource")
    @Expose
    private Long BusinessSource;

    /**
    * <p>拒答问题来源的数据源唯一id</p>
    */
    @SerializedName("BusinessId")
    @Expose
    private String BusinessId;

    /**
    * <p>拒答生效域: 1-不生效；2-仅开发域生效；3-仅发布域生效；4-开发域和发布域均生效 默认值：2。</p>
    */
    @SerializedName("EnableScope")
    @Expose
    private Long EnableScope;

    /**
     * Get <p>应用ID, 获取方式参看如何获取<a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">BotBizId</a></p> 
     * @return BotBizId <p>应用ID, 获取方式参看如何获取<a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">BotBizId</a></p>
     */
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set <p>应用ID, 获取方式参看如何获取<a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">BotBizId</a></p>
     * @param BotBizId <p>应用ID, 获取方式参看如何获取<a href="https://cloud.tencent.com/document/product/1759/109469#4eecb8c1-6ce4-45f5-8fa2-b269449d8efa">BotBizId</a></p>
     */
    public void setBotBizId(String BotBizId) {
        this.BotBizId = BotBizId;
    }

    /**
     * Get <p>拒答问题</p> 
     * @return Question <p>拒答问题</p>
     */
    public String getQuestion() {
        return this.Question;
    }

    /**
     * Set <p>拒答问题</p>
     * @param Question <p>拒答问题</p>
     */
    public void setQuestion(String Question) {
        this.Question = Question;
    }

    /**
     * Get <p>拒答问题来源， 1- 来源于不满意回复;  2 - 来源于手动添加</p> 
     * @return BusinessSource <p>拒答问题来源， 1- 来源于不满意回复;  2 - 来源于手动添加</p>
     */
    public Long getBusinessSource() {
        return this.BusinessSource;
    }

    /**
     * Set <p>拒答问题来源， 1- 来源于不满意回复;  2 - 来源于手动添加</p>
     * @param BusinessSource <p>拒答问题来源， 1- 来源于不满意回复;  2 - 来源于手动添加</p>
     */
    public void setBusinessSource(Long BusinessSource) {
        this.BusinessSource = BusinessSource;
    }

    /**
     * Get <p>拒答问题来源的数据源唯一id</p> 
     * @return BusinessId <p>拒答问题来源的数据源唯一id</p>
     */
    public String getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set <p>拒答问题来源的数据源唯一id</p>
     * @param BusinessId <p>拒答问题来源的数据源唯一id</p>
     */
    public void setBusinessId(String BusinessId) {
        this.BusinessId = BusinessId;
    }

    /**
     * Get <p>拒答生效域: 1-不生效；2-仅开发域生效；3-仅发布域生效；4-开发域和发布域均生效 默认值：2。</p> 
     * @return EnableScope <p>拒答生效域: 1-不生效；2-仅开发域生效；3-仅发布域生效；4-开发域和发布域均生效 默认值：2。</p>
     */
    public Long getEnableScope() {
        return this.EnableScope;
    }

    /**
     * Set <p>拒答生效域: 1-不生效；2-仅开发域生效；3-仅发布域生效；4-开发域和发布域均生效 默认值：2。</p>
     * @param EnableScope <p>拒答生效域: 1-不生效；2-仅开发域生效；3-仅发布域生效；4-开发域和发布域均生效 默认值：2。</p>
     */
    public void setEnableScope(Long EnableScope) {
        this.EnableScope = EnableScope;
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
        if (source.EnableScope != null) {
            this.EnableScope = new Long(source.EnableScope);
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
        this.setParamSimple(map, prefix + "EnableScope", this.EnableScope);

    }
}

