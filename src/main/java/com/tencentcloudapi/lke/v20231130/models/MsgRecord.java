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

public class MsgRecord extends AbstractModel {

    /**
    * 内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 当前记录所对应的 Session ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 记录ID
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * 关联记录ID
    */
    @SerializedName("RelatedRecordId")
    @Expose
    private String RelatedRecordId;

    /**
    * 是否来自自己
    */
    @SerializedName("IsFromSelf")
    @Expose
    private Boolean IsFromSelf;

    /**
    * 发送者名称
    */
    @SerializedName("FromName")
    @Expose
    private String FromName;

    /**
    * 发送者头像
    */
    @SerializedName("FromAvatar")
    @Expose
    private String FromAvatar;

    /**
    * 时间戳
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * 是否已读
    */
    @SerializedName("HasRead")
    @Expose
    private Boolean HasRead;

    /**
    * 评价
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * 是否评分
    */
    @SerializedName("CanRating")
    @Expose
    private Boolean CanRating;

    /**
    * 是否展示反馈按钮
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CanFeedback")
    @Expose
    private Boolean CanFeedback;

    /**
    * 记录类型
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 引用来源
    */
    @SerializedName("References")
    @Expose
    private MsgRecordReference [] References;

    /**
    * 评价原因
    */
    @SerializedName("Reasons")
    @Expose
    private String [] Reasons;

    /**
    * 是否大模型
    */
    @SerializedName("IsLlmGenerated")
    @Expose
    private Boolean IsLlmGenerated;

    /**
    * 图片链接，可公有读
    */
    @SerializedName("ImageUrls")
    @Expose
    private String [] ImageUrls;

    /**
    * 当次 token 统计信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TokenStat")
    @Expose
    private TokenStat TokenStat;

    /**
    * 回复方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReplyMethod")
    @Expose
    private Long ReplyMethod;

    /**
    * 选项卡, 用于多轮对话
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OptionCards")
    @Expose
    private String [] OptionCards;

    /**
    * 任务信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskFlow")
    @Expose
    private TaskFlowInfo TaskFlow;

    /**
     * Get 内容 
     * @return Content 内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 内容
     * @param Content 内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 当前记录所对应的 Session ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionId 当前记录所对应的 Session ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 当前记录所对应的 Session ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionId 当前记录所对应的 Session ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get 记录ID 
     * @return RecordId 记录ID
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set 记录ID
     * @param RecordId 记录ID
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get 关联记录ID 
     * @return RelatedRecordId 关联记录ID
     */
    public String getRelatedRecordId() {
        return this.RelatedRecordId;
    }

    /**
     * Set 关联记录ID
     * @param RelatedRecordId 关联记录ID
     */
    public void setRelatedRecordId(String RelatedRecordId) {
        this.RelatedRecordId = RelatedRecordId;
    }

    /**
     * Get 是否来自自己 
     * @return IsFromSelf 是否来自自己
     */
    public Boolean getIsFromSelf() {
        return this.IsFromSelf;
    }

    /**
     * Set 是否来自自己
     * @param IsFromSelf 是否来自自己
     */
    public void setIsFromSelf(Boolean IsFromSelf) {
        this.IsFromSelf = IsFromSelf;
    }

    /**
     * Get 发送者名称 
     * @return FromName 发送者名称
     */
    public String getFromName() {
        return this.FromName;
    }

    /**
     * Set 发送者名称
     * @param FromName 发送者名称
     */
    public void setFromName(String FromName) {
        this.FromName = FromName;
    }

    /**
     * Get 发送者头像 
     * @return FromAvatar 发送者头像
     */
    public String getFromAvatar() {
        return this.FromAvatar;
    }

    /**
     * Set 发送者头像
     * @param FromAvatar 发送者头像
     */
    public void setFromAvatar(String FromAvatar) {
        this.FromAvatar = FromAvatar;
    }

    /**
     * Get 时间戳 
     * @return Timestamp 时间戳
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 时间戳
     * @param Timestamp 时间戳
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 是否已读 
     * @return HasRead 是否已读
     */
    public Boolean getHasRead() {
        return this.HasRead;
    }

    /**
     * Set 是否已读
     * @param HasRead 是否已读
     */
    public void setHasRead(Boolean HasRead) {
        this.HasRead = HasRead;
    }

    /**
     * Get 评价 
     * @return Score 评价
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 评价
     * @param Score 评价
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get 是否评分 
     * @return CanRating 是否评分
     */
    public Boolean getCanRating() {
        return this.CanRating;
    }

    /**
     * Set 是否评分
     * @param CanRating 是否评分
     */
    public void setCanRating(Boolean CanRating) {
        this.CanRating = CanRating;
    }

    /**
     * Get 是否展示反馈按钮
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CanFeedback 是否展示反馈按钮
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getCanFeedback() {
        return this.CanFeedback;
    }

    /**
     * Set 是否展示反馈按钮
注意：此字段可能返回 null，表示取不到有效值。
     * @param CanFeedback 是否展示反馈按钮
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCanFeedback(Boolean CanFeedback) {
        this.CanFeedback = CanFeedback;
    }

    /**
     * Get 记录类型 
     * @return Type 记录类型
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 记录类型
     * @param Type 记录类型
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 引用来源 
     * @return References 引用来源
     */
    public MsgRecordReference [] getReferences() {
        return this.References;
    }

    /**
     * Set 引用来源
     * @param References 引用来源
     */
    public void setReferences(MsgRecordReference [] References) {
        this.References = References;
    }

    /**
     * Get 评价原因 
     * @return Reasons 评价原因
     */
    public String [] getReasons() {
        return this.Reasons;
    }

    /**
     * Set 评价原因
     * @param Reasons 评价原因
     */
    public void setReasons(String [] Reasons) {
        this.Reasons = Reasons;
    }

    /**
     * Get 是否大模型 
     * @return IsLlmGenerated 是否大模型
     */
    public Boolean getIsLlmGenerated() {
        return this.IsLlmGenerated;
    }

    /**
     * Set 是否大模型
     * @param IsLlmGenerated 是否大模型
     */
    public void setIsLlmGenerated(Boolean IsLlmGenerated) {
        this.IsLlmGenerated = IsLlmGenerated;
    }

    /**
     * Get 图片链接，可公有读 
     * @return ImageUrls 图片链接，可公有读
     */
    public String [] getImageUrls() {
        return this.ImageUrls;
    }

    /**
     * Set 图片链接，可公有读
     * @param ImageUrls 图片链接，可公有读
     */
    public void setImageUrls(String [] ImageUrls) {
        this.ImageUrls = ImageUrls;
    }

    /**
     * Get 当次 token 统计信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TokenStat 当次 token 统计信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TokenStat getTokenStat() {
        return this.TokenStat;
    }

    /**
     * Set 当次 token 统计信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TokenStat 当次 token 统计信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTokenStat(TokenStat TokenStat) {
        this.TokenStat = TokenStat;
    }

    /**
     * Get 回复方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReplyMethod 回复方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReplyMethod() {
        return this.ReplyMethod;
    }

    /**
     * Set 回复方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReplyMethod 回复方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplyMethod(Long ReplyMethod) {
        this.ReplyMethod = ReplyMethod;
    }

    /**
     * Get 选项卡, 用于多轮对话
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OptionCards 选项卡, 用于多轮对话
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getOptionCards() {
        return this.OptionCards;
    }

    /**
     * Set 选项卡, 用于多轮对话
注意：此字段可能返回 null，表示取不到有效值。
     * @param OptionCards 选项卡, 用于多轮对话
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOptionCards(String [] OptionCards) {
        this.OptionCards = OptionCards;
    }

    /**
     * Get 任务信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskFlow 任务信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskFlowInfo getTaskFlow() {
        return this.TaskFlow;
    }

    /**
     * Set 任务信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskFlow 任务信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskFlow(TaskFlowInfo TaskFlow) {
        this.TaskFlow = TaskFlow;
    }

    public MsgRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MsgRecord(MsgRecord source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.RelatedRecordId != null) {
            this.RelatedRecordId = new String(source.RelatedRecordId);
        }
        if (source.IsFromSelf != null) {
            this.IsFromSelf = new Boolean(source.IsFromSelf);
        }
        if (source.FromName != null) {
            this.FromName = new String(source.FromName);
        }
        if (source.FromAvatar != null) {
            this.FromAvatar = new String(source.FromAvatar);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
        if (source.HasRead != null) {
            this.HasRead = new Boolean(source.HasRead);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.CanRating != null) {
            this.CanRating = new Boolean(source.CanRating);
        }
        if (source.CanFeedback != null) {
            this.CanFeedback = new Boolean(source.CanFeedback);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.References != null) {
            this.References = new MsgRecordReference[source.References.length];
            for (int i = 0; i < source.References.length; i++) {
                this.References[i] = new MsgRecordReference(source.References[i]);
            }
        }
        if (source.Reasons != null) {
            this.Reasons = new String[source.Reasons.length];
            for (int i = 0; i < source.Reasons.length; i++) {
                this.Reasons[i] = new String(source.Reasons[i]);
            }
        }
        if (source.IsLlmGenerated != null) {
            this.IsLlmGenerated = new Boolean(source.IsLlmGenerated);
        }
        if (source.ImageUrls != null) {
            this.ImageUrls = new String[source.ImageUrls.length];
            for (int i = 0; i < source.ImageUrls.length; i++) {
                this.ImageUrls[i] = new String(source.ImageUrls[i]);
            }
        }
        if (source.TokenStat != null) {
            this.TokenStat = new TokenStat(source.TokenStat);
        }
        if (source.ReplyMethod != null) {
            this.ReplyMethod = new Long(source.ReplyMethod);
        }
        if (source.OptionCards != null) {
            this.OptionCards = new String[source.OptionCards.length];
            for (int i = 0; i < source.OptionCards.length; i++) {
                this.OptionCards[i] = new String(source.OptionCards[i]);
            }
        }
        if (source.TaskFlow != null) {
            this.TaskFlow = new TaskFlowInfo(source.TaskFlow);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "RelatedRecordId", this.RelatedRecordId);
        this.setParamSimple(map, prefix + "IsFromSelf", this.IsFromSelf);
        this.setParamSimple(map, prefix + "FromName", this.FromName);
        this.setParamSimple(map, prefix + "FromAvatar", this.FromAvatar);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "HasRead", this.HasRead);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "CanRating", this.CanRating);
        this.setParamSimple(map, prefix + "CanFeedback", this.CanFeedback);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "References.", this.References);
        this.setParamArraySimple(map, prefix + "Reasons.", this.Reasons);
        this.setParamSimple(map, prefix + "IsLlmGenerated", this.IsLlmGenerated);
        this.setParamArraySimple(map, prefix + "ImageUrls.", this.ImageUrls);
        this.setParamObj(map, prefix + "TokenStat.", this.TokenStat);
        this.setParamSimple(map, prefix + "ReplyMethod", this.ReplyMethod);
        this.setParamArraySimple(map, prefix + "OptionCards.", this.OptionCards);
        this.setParamObj(map, prefix + "TaskFlow.", this.TaskFlow);

    }
}

