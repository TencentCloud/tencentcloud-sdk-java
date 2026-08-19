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
    * <p>是否开启上下文改写</p>
    */
    @SerializedName("EnableContextRewrite")
    @Expose
    private Boolean EnableContextRewrite;

    /**
    * <p>是否开启图文检索</p>
    */
    @SerializedName("EnableImageTextRetrieval")
    @Expose
    private Boolean EnableImageTextRetrieval;

    /**
    * <p>回复灵活度</p>
    */
    @SerializedName("ReplyFlexibility")
    @Expose
    private Long ReplyFlexibility;

    /**
    * <p>对话端自定义配置(所有模式共用,允许对话中动态修改配置)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DialogCustomConfig")
    @Expose
    private DialogCustomConfig DialogCustomConfig;

    /**
    * <p>意图达成优先级</p>
    */
    @SerializedName("IntentAchievement")
    @Expose
    private IntentAchievementInfo [] IntentAchievement;

    /**
     * Get <p>是否开启上下文改写</p> 
     * @return EnableContextRewrite <p>是否开启上下文改写</p>
     */
    public Boolean getEnableContextRewrite() {
        return this.EnableContextRewrite;
    }

    /**
     * Set <p>是否开启上下文改写</p>
     * @param EnableContextRewrite <p>是否开启上下文改写</p>
     */
    public void setEnableContextRewrite(Boolean EnableContextRewrite) {
        this.EnableContextRewrite = EnableContextRewrite;
    }

    /**
     * Get <p>是否开启图文检索</p> 
     * @return EnableImageTextRetrieval <p>是否开启图文检索</p>
     */
    public Boolean getEnableImageTextRetrieval() {
        return this.EnableImageTextRetrieval;
    }

    /**
     * Set <p>是否开启图文检索</p>
     * @param EnableImageTextRetrieval <p>是否开启图文检索</p>
     */
    public void setEnableImageTextRetrieval(Boolean EnableImageTextRetrieval) {
        this.EnableImageTextRetrieval = EnableImageTextRetrieval;
    }

    /**
     * Get <p>回复灵活度</p> 
     * @return ReplyFlexibility <p>回复灵活度</p>
     */
    public Long getReplyFlexibility() {
        return this.ReplyFlexibility;
    }

    /**
     * Set <p>回复灵活度</p>
     * @param ReplyFlexibility <p>回复灵活度</p>
     */
    public void setReplyFlexibility(Long ReplyFlexibility) {
        this.ReplyFlexibility = ReplyFlexibility;
    }

    /**
     * Get <p>对话端自定义配置(所有模式共用,允许对话中动态修改配置)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DialogCustomConfig <p>对话端自定义配置(所有模式共用,允许对话中动态修改配置)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DialogCustomConfig getDialogCustomConfig() {
        return this.DialogCustomConfig;
    }

    /**
     * Set <p>对话端自定义配置(所有模式共用,允许对话中动态修改配置)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DialogCustomConfig <p>对话端自定义配置(所有模式共用,允许对话中动态修改配置)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDialogCustomConfig(DialogCustomConfig DialogCustomConfig) {
        this.DialogCustomConfig = DialogCustomConfig;
    }

    /**
     * Get <p>意图达成优先级</p> 
     * @return IntentAchievement <p>意图达成优先级</p>
     */
    public IntentAchievementInfo [] getIntentAchievement() {
        return this.IntentAchievement;
    }

    /**
     * Set <p>意图达成优先级</p>
     * @param IntentAchievement <p>意图达成优先级</p>
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
        if (source.DialogCustomConfig != null) {
            this.DialogCustomConfig = new DialogCustomConfig(source.DialogCustomConfig);
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
        this.setParamObj(map, prefix + "DialogCustomConfig.", this.DialogCustomConfig);
        this.setParamArrayObj(map, prefix + "IntentAchievement.", this.IntentAchievement);

    }
}

