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
package com.tencentcloudapi.tdai.v20250717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChatBrief extends AbstractModel {

    /**
    * 主账号Id
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 主账号uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 子账号uin
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 智能体实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 会话ID
    */
    @SerializedName("ChatId")
    @Expose
    private String ChatId;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 会话标题
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 会话状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 最后一条流式ID
    */
    @SerializedName("LastStreamingId")
    @Expose
    private String LastStreamingId;

    /**
    * 最后一条流式TokenID
    */
    @SerializedName("LastStreamingTokenId")
    @Expose
    private Long LastStreamingTokenId;

    /**
     * Get 主账号Id 
     * @return AppId 主账号Id
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 主账号Id
     * @param AppId 主账号Id
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 主账号uin 
     * @return Uin 主账号uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 主账号uin
     * @param Uin 主账号uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 子账号uin 
     * @return OwnerUin 子账号uin
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 子账号uin
     * @param OwnerUin 子账号uin
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 智能体实例ID 
     * @return InstanceId 智能体实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 智能体实例ID
     * @param InstanceId 智能体实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 会话ID 
     * @return ChatId 会话ID
     */
    public String getChatId() {
        return this.ChatId;
    }

    /**
     * Set 会话ID
     * @param ChatId 会话ID
     */
    public void setChatId(String ChatId) {
        this.ChatId = ChatId;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 会话标题 
     * @return Title 会话标题
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 会话标题
     * @param Title 会话标题
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 会话状态 
     * @return Status 会话状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 会话状态
     * @param Status 会话状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 最后一条流式ID 
     * @return LastStreamingId 最后一条流式ID
     */
    public String getLastStreamingId() {
        return this.LastStreamingId;
    }

    /**
     * Set 最后一条流式ID
     * @param LastStreamingId 最后一条流式ID
     */
    public void setLastStreamingId(String LastStreamingId) {
        this.LastStreamingId = LastStreamingId;
    }

    /**
     * Get 最后一条流式TokenID 
     * @return LastStreamingTokenId 最后一条流式TokenID
     */
    public Long getLastStreamingTokenId() {
        return this.LastStreamingTokenId;
    }

    /**
     * Set 最后一条流式TokenID
     * @param LastStreamingTokenId 最后一条流式TokenID
     */
    public void setLastStreamingTokenId(Long LastStreamingTokenId) {
        this.LastStreamingTokenId = LastStreamingTokenId;
    }

    public ChatBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChatBrief(ChatBrief source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ChatId != null) {
            this.ChatId = new String(source.ChatId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.LastStreamingId != null) {
            this.LastStreamingId = new String(source.LastStreamingId);
        }
        if (source.LastStreamingTokenId != null) {
            this.LastStreamingTokenId = new Long(source.LastStreamingTokenId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ChatId", this.ChatId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "LastStreamingId", this.LastStreamingId);
        this.setParamSimple(map, prefix + "LastStreamingTokenId", this.LastStreamingTokenId);

    }
}

