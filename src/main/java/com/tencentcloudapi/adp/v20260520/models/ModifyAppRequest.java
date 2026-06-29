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

public class ModifyAppRequest extends AbstractModel {

    /**
    * 应用ID
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 应用模式。枚举值: 1:标准模式, 2:Agent模式, 3:单工作流模式, 4:ClawAgent模式
    */
    @SerializedName("AppMode")
    @Expose
    private Long AppMode;

    /**
    * 应用头像
    */
    @SerializedName("Avatar")
    @Expose
    private String Avatar;

    /**
    * 应用配置
    */
    @SerializedName("Config")
    @Expose
    private AppConfig Config;

    /**
    * 应用描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 应用名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 分享配置
    */
    @SerializedName("ShareConfig")
    @Expose
    private AppShareAccessControl ShareConfig;

    /**
    * 引用的共享知识库ID列表(全量覆盖)
    */
    @SerializedName("SharedKbIdList")
    @Expose
    private String [] SharedKbIdList;

    /**
    * 字段掩码，指定需要更新的字段(Paths为空则不更新任何字段)。Paths枚举值：
【顶层】Name, Avatar, Description, AppMode, ShareConfig, SharedKbIdList
【Greeting】Config.Greeting, Config.Greeting.Greeting, Config.Greeting.OpeningQuestionList
【Model】Config.Model, Config.Model.ThinkModel, Config.Model.GenerateModel, Config.Model.AiOptimizeModel, Config.Model.FileParseModel, Config.Model.PromptRewriteModel, Config.Model.MultiModalQaModel, Config.Model.MultiModalUnderstandingModel
【WebSearch】Config.WebSearch
【Memory】Config.Memory, Config.Memory.Enabled, Config.Memory.LongMemoryDay, Config.Memory.Model, Config.Memory.PromptMode, Config.Memory.PromptContent
【Mode】Config.Mode, Config.Mode.MultiAgentConfig, Config.Mode.SingleWorkflowConfig
【Experience】Config.Experience, Config.Experience.Conversation, Config.Experience.Role, Config.Experience.Advanced
【Experience.Conversation】Config.Experience.Conversation.AiCall, Config.Experience.Conversation.BackgroundImage, Config.Experience.Conversation.Method, Config.Experience.Conversation.FallbackReply, Config.Experience.Conversation.Recommended, Config.Experience.Conversation.InputBoxConfig, Config.Experience.Conversation.WebSearch
【Experience.Conversation.AiCall】Config.Experience.Conversation.AiCall.VoiceInteract, Config.Experience.Conversation.AiCall.VoiceCall, Config.Experience.Conversation.AiCall.DigitalHuman
【Experience.Advanced】Config.Experience.Advanced.ContextRewrite, Config.Experience.Advanced.ImageTextRetrieval, Config.Experience.Advanced.IntentAchievement, Config.Experience.Advanced.ReplyFlexibility
    */
    @SerializedName("UpdateMask")
    @Expose
    private FieldMask UpdateMask;

    /**
     * Get 应用ID 
     * @return AppId 应用ID
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 应用ID
     * @param AppId 应用ID
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 应用模式。枚举值: 1:标准模式, 2:Agent模式, 3:单工作流模式, 4:ClawAgent模式 
     * @return AppMode 应用模式。枚举值: 1:标准模式, 2:Agent模式, 3:单工作流模式, 4:ClawAgent模式
     */
    public Long getAppMode() {
        return this.AppMode;
    }

    /**
     * Set 应用模式。枚举值: 1:标准模式, 2:Agent模式, 3:单工作流模式, 4:ClawAgent模式
     * @param AppMode 应用模式。枚举值: 1:标准模式, 2:Agent模式, 3:单工作流模式, 4:ClawAgent模式
     */
    public void setAppMode(Long AppMode) {
        this.AppMode = AppMode;
    }

    /**
     * Get 应用头像 
     * @return Avatar 应用头像
     */
    public String getAvatar() {
        return this.Avatar;
    }

    /**
     * Set 应用头像
     * @param Avatar 应用头像
     */
    public void setAvatar(String Avatar) {
        this.Avatar = Avatar;
    }

    /**
     * Get 应用配置 
     * @return Config 应用配置
     */
    public AppConfig getConfig() {
        return this.Config;
    }

    /**
     * Set 应用配置
     * @param Config 应用配置
     */
    public void setConfig(AppConfig Config) {
        this.Config = Config;
    }

    /**
     * Get 应用描述 
     * @return Description 应用描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 应用描述
     * @param Description 应用描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 应用名称 
     * @return Name 应用名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 应用名称
     * @param Name 应用名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 分享配置 
     * @return ShareConfig 分享配置
     */
    public AppShareAccessControl getShareConfig() {
        return this.ShareConfig;
    }

    /**
     * Set 分享配置
     * @param ShareConfig 分享配置
     */
    public void setShareConfig(AppShareAccessControl ShareConfig) {
        this.ShareConfig = ShareConfig;
    }

    /**
     * Get 引用的共享知识库ID列表(全量覆盖) 
     * @return SharedKbIdList 引用的共享知识库ID列表(全量覆盖)
     */
    public String [] getSharedKbIdList() {
        return this.SharedKbIdList;
    }

    /**
     * Set 引用的共享知识库ID列表(全量覆盖)
     * @param SharedKbIdList 引用的共享知识库ID列表(全量覆盖)
     */
    public void setSharedKbIdList(String [] SharedKbIdList) {
        this.SharedKbIdList = SharedKbIdList;
    }

    /**
     * Get 字段掩码，指定需要更新的字段(Paths为空则不更新任何字段)。Paths枚举值：
【顶层】Name, Avatar, Description, AppMode, ShareConfig, SharedKbIdList
【Greeting】Config.Greeting, Config.Greeting.Greeting, Config.Greeting.OpeningQuestionList
【Model】Config.Model, Config.Model.ThinkModel, Config.Model.GenerateModel, Config.Model.AiOptimizeModel, Config.Model.FileParseModel, Config.Model.PromptRewriteModel, Config.Model.MultiModalQaModel, Config.Model.MultiModalUnderstandingModel
【WebSearch】Config.WebSearch
【Memory】Config.Memory, Config.Memory.Enabled, Config.Memory.LongMemoryDay, Config.Memory.Model, Config.Memory.PromptMode, Config.Memory.PromptContent
【Mode】Config.Mode, Config.Mode.MultiAgentConfig, Config.Mode.SingleWorkflowConfig
【Experience】Config.Experience, Config.Experience.Conversation, Config.Experience.Role, Config.Experience.Advanced
【Experience.Conversation】Config.Experience.Conversation.AiCall, Config.Experience.Conversation.BackgroundImage, Config.Experience.Conversation.Method, Config.Experience.Conversation.FallbackReply, Config.Experience.Conversation.Recommended, Config.Experience.Conversation.InputBoxConfig, Config.Experience.Conversation.WebSearch
【Experience.Conversation.AiCall】Config.Experience.Conversation.AiCall.VoiceInteract, Config.Experience.Conversation.AiCall.VoiceCall, Config.Experience.Conversation.AiCall.DigitalHuman
【Experience.Advanced】Config.Experience.Advanced.ContextRewrite, Config.Experience.Advanced.ImageTextRetrieval, Config.Experience.Advanced.IntentAchievement, Config.Experience.Advanced.ReplyFlexibility 
     * @return UpdateMask 字段掩码，指定需要更新的字段(Paths为空则不更新任何字段)。Paths枚举值：
【顶层】Name, Avatar, Description, AppMode, ShareConfig, SharedKbIdList
【Greeting】Config.Greeting, Config.Greeting.Greeting, Config.Greeting.OpeningQuestionList
【Model】Config.Model, Config.Model.ThinkModel, Config.Model.GenerateModel, Config.Model.AiOptimizeModel, Config.Model.FileParseModel, Config.Model.PromptRewriteModel, Config.Model.MultiModalQaModel, Config.Model.MultiModalUnderstandingModel
【WebSearch】Config.WebSearch
【Memory】Config.Memory, Config.Memory.Enabled, Config.Memory.LongMemoryDay, Config.Memory.Model, Config.Memory.PromptMode, Config.Memory.PromptContent
【Mode】Config.Mode, Config.Mode.MultiAgentConfig, Config.Mode.SingleWorkflowConfig
【Experience】Config.Experience, Config.Experience.Conversation, Config.Experience.Role, Config.Experience.Advanced
【Experience.Conversation】Config.Experience.Conversation.AiCall, Config.Experience.Conversation.BackgroundImage, Config.Experience.Conversation.Method, Config.Experience.Conversation.FallbackReply, Config.Experience.Conversation.Recommended, Config.Experience.Conversation.InputBoxConfig, Config.Experience.Conversation.WebSearch
【Experience.Conversation.AiCall】Config.Experience.Conversation.AiCall.VoiceInteract, Config.Experience.Conversation.AiCall.VoiceCall, Config.Experience.Conversation.AiCall.DigitalHuman
【Experience.Advanced】Config.Experience.Advanced.ContextRewrite, Config.Experience.Advanced.ImageTextRetrieval, Config.Experience.Advanced.IntentAchievement, Config.Experience.Advanced.ReplyFlexibility
     */
    public FieldMask getUpdateMask() {
        return this.UpdateMask;
    }

    /**
     * Set 字段掩码，指定需要更新的字段(Paths为空则不更新任何字段)。Paths枚举值：
【顶层】Name, Avatar, Description, AppMode, ShareConfig, SharedKbIdList
【Greeting】Config.Greeting, Config.Greeting.Greeting, Config.Greeting.OpeningQuestionList
【Model】Config.Model, Config.Model.ThinkModel, Config.Model.GenerateModel, Config.Model.AiOptimizeModel, Config.Model.FileParseModel, Config.Model.PromptRewriteModel, Config.Model.MultiModalQaModel, Config.Model.MultiModalUnderstandingModel
【WebSearch】Config.WebSearch
【Memory】Config.Memory, Config.Memory.Enabled, Config.Memory.LongMemoryDay, Config.Memory.Model, Config.Memory.PromptMode, Config.Memory.PromptContent
【Mode】Config.Mode, Config.Mode.MultiAgentConfig, Config.Mode.SingleWorkflowConfig
【Experience】Config.Experience, Config.Experience.Conversation, Config.Experience.Role, Config.Experience.Advanced
【Experience.Conversation】Config.Experience.Conversation.AiCall, Config.Experience.Conversation.BackgroundImage, Config.Experience.Conversation.Method, Config.Experience.Conversation.FallbackReply, Config.Experience.Conversation.Recommended, Config.Experience.Conversation.InputBoxConfig, Config.Experience.Conversation.WebSearch
【Experience.Conversation.AiCall】Config.Experience.Conversation.AiCall.VoiceInteract, Config.Experience.Conversation.AiCall.VoiceCall, Config.Experience.Conversation.AiCall.DigitalHuman
【Experience.Advanced】Config.Experience.Advanced.ContextRewrite, Config.Experience.Advanced.ImageTextRetrieval, Config.Experience.Advanced.IntentAchievement, Config.Experience.Advanced.ReplyFlexibility
     * @param UpdateMask 字段掩码，指定需要更新的字段(Paths为空则不更新任何字段)。Paths枚举值：
【顶层】Name, Avatar, Description, AppMode, ShareConfig, SharedKbIdList
【Greeting】Config.Greeting, Config.Greeting.Greeting, Config.Greeting.OpeningQuestionList
【Model】Config.Model, Config.Model.ThinkModel, Config.Model.GenerateModel, Config.Model.AiOptimizeModel, Config.Model.FileParseModel, Config.Model.PromptRewriteModel, Config.Model.MultiModalQaModel, Config.Model.MultiModalUnderstandingModel
【WebSearch】Config.WebSearch
【Memory】Config.Memory, Config.Memory.Enabled, Config.Memory.LongMemoryDay, Config.Memory.Model, Config.Memory.PromptMode, Config.Memory.PromptContent
【Mode】Config.Mode, Config.Mode.MultiAgentConfig, Config.Mode.SingleWorkflowConfig
【Experience】Config.Experience, Config.Experience.Conversation, Config.Experience.Role, Config.Experience.Advanced
【Experience.Conversation】Config.Experience.Conversation.AiCall, Config.Experience.Conversation.BackgroundImage, Config.Experience.Conversation.Method, Config.Experience.Conversation.FallbackReply, Config.Experience.Conversation.Recommended, Config.Experience.Conversation.InputBoxConfig, Config.Experience.Conversation.WebSearch
【Experience.Conversation.AiCall】Config.Experience.Conversation.AiCall.VoiceInteract, Config.Experience.Conversation.AiCall.VoiceCall, Config.Experience.Conversation.AiCall.DigitalHuman
【Experience.Advanced】Config.Experience.Advanced.ContextRewrite, Config.Experience.Advanced.ImageTextRetrieval, Config.Experience.Advanced.IntentAchievement, Config.Experience.Advanced.ReplyFlexibility
     */
    public void setUpdateMask(FieldMask UpdateMask) {
        this.UpdateMask = UpdateMask;
    }

    public ModifyAppRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAppRequest(ModifyAppRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.AppMode != null) {
            this.AppMode = new Long(source.AppMode);
        }
        if (source.Avatar != null) {
            this.Avatar = new String(source.Avatar);
        }
        if (source.Config != null) {
            this.Config = new AppConfig(source.Config);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ShareConfig != null) {
            this.ShareConfig = new AppShareAccessControl(source.ShareConfig);
        }
        if (source.SharedKbIdList != null) {
            this.SharedKbIdList = new String[source.SharedKbIdList.length];
            for (int i = 0; i < source.SharedKbIdList.length; i++) {
                this.SharedKbIdList[i] = new String(source.SharedKbIdList[i]);
            }
        }
        if (source.UpdateMask != null) {
            this.UpdateMask = new FieldMask(source.UpdateMask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AppMode", this.AppMode);
        this.setParamSimple(map, prefix + "Avatar", this.Avatar);
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "ShareConfig.", this.ShareConfig);
        this.setParamArraySimple(map, prefix + "SharedKbIdList.", this.SharedKbIdList);
        this.setParamObj(map, prefix + "UpdateMask.", this.UpdateMask);

    }
}

