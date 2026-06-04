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

public class AppAdvancedConf extends AbstractModel {

    /**
    * 是否开启上下文改写
    */
    @SerializedName("EnableContextRewrite")
    @Expose
    private Boolean EnableContextRewrite;

    /**
    * 是否开启图文检索
    */
    @SerializedName("EnableImageTextRetrieval")
    @Expose
    private Boolean EnableImageTextRetrieval;

    /**
    * 回复灵活度
    */
    @SerializedName("ReplyFlexibility")
    @Expose
    private Long ReplyFlexibility;

    /**
    * 意图达成优先级
    */
    @SerializedName("IntentAchievement")
    @Expose
    private IntentAchievementInfo [] IntentAchievement;

    /**
     * Get 是否开启上下文改写 
     * @return EnableContextRewrite 是否开启上下文改写
     */
    public Boolean getEnableContextRewrite() {
        return this.EnableContextRewrite;
    }

    /**
     * Set 是否开启上下文改写
     * @param EnableContextRewrite 是否开启上下文改写
     */
    public void setEnableContextRewrite(Boolean EnableContextRewrite) {
        this.EnableContextRewrite = EnableContextRewrite;
    }

    /**
     * Get 是否开启图文检索 
     * @return EnableImageTextRetrieval 是否开启图文检索
     */
    public Boolean getEnableImageTextRetrieval() {
        return this.EnableImageTextRetrieval;
    }

    /**
     * Set 是否开启图文检索
     * @param EnableImageTextRetrieval 是否开启图文检索
     */
    public void setEnableImageTextRetrieval(Boolean EnableImageTextRetrieval) {
        this.EnableImageTextRetrieval = EnableImageTextRetrieval;
    }

    /**
     * Get 回复灵活度 
     * @return ReplyFlexibility 回复灵活度
     */
    public Long getReplyFlexibility() {
        return this.ReplyFlexibility;
    }

    /**
     * Set 回复灵活度
     * @param ReplyFlexibility 回复灵活度
     */
    public void setReplyFlexibility(Long ReplyFlexibility) {
        this.ReplyFlexibility = ReplyFlexibility;
    }

    /**
     * Get 意图达成优先级 
     * @return IntentAchievement 意图达成优先级
     */
    public IntentAchievementInfo [] getIntentAchievement() {
        return this.IntentAchievement;
    }

    /**
     * Set 意图达成优先级
     * @param IntentAchievement 意图达成优先级
     */
    public void setIntentAchievement(IntentAchievementInfo [] IntentAchievement) {
        this.IntentAchievement = IntentAchievement;
    }

    public AppAdvancedConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppAdvancedConf(AppAdvancedConf source) {
        if (source.EnableContextRewrite != null) {
            this.EnableContextRewrite = new Boolean(source.EnableContextRewrite);
        }
        if (source.EnableImageTextRetrieval != null) {
            this.EnableImageTextRetrieval = new Boolean(source.EnableImageTextRetrieval);
        }
        if (source.ReplyFlexibility != null) {
            this.ReplyFlexibility = new Long(source.ReplyFlexibility);
        }
        if (source.IntentAchievement != null) {
            this.IntentAchievement = new IntentAchievementInfo[source.IntentAchievement.length];
            for (int i = 0; i < source.IntentAchievement.length; i++) {
                this.IntentAchievement[i] = new IntentAchievementInfo(source.IntentAchievement[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableContextRewrite", this.EnableContextRewrite);
        this.setParamSimple(map, prefix + "EnableImageTextRetrieval", this.EnableImageTextRetrieval);
        this.setParamSimple(map, prefix + "ReplyFlexibility", this.ReplyFlexibility);
        this.setParamArrayObj(map, prefix + "IntentAchievement.", this.IntentAchievement);

    }
}

