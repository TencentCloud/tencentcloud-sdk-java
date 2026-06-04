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

public class ModifyConversationRequest extends AbstractModel {

    /**
    * <p>会话类型 枚举值: 0-CONVERSATION_TYPE_UNSPECIFIED(未指定；列表查询时表示全部), 1-CONVERSATION_TYPE_VISITOR(访客端体验), 2-CONVERSATION_TYPE_EVALUATION(评测), 5-CONVERSATION_TYPE_API(API 接入), 10-CONVERSATION_TYPE_WORKFLOW(工作流调试), 20-CONVERSATION_TYPE_SHARE(分享链接)</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>应用 ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>Type=CONVERSATION_TYPE_API 时必填，应用密钥</p>
    */
    @SerializedName("AppKey")
    @Expose
    private String AppKey;

    /**
    * <p>登录用户子账号(集成商模式必填)</p>
    */
    @SerializedName("LoginSubAccountUin")
    @Expose
    private String LoginSubAccountUin;

    /**
    * <p>登录用户主账号(集成商模式必填)</p>
    */
    @SerializedName("LoginUin")
    @Expose
    private String LoginUin;

    /**
    * <p>Type=CONVERSATION_TYPE_SHARE 时必填，分享码</p>
    */
    @SerializedName("ShareCode")
    @Expose
    private String ShareCode;

    /**
    * <p>Type=CONVERSATION_TYPE_API 时必填，访客ID</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 会话ID
    */
    @SerializedName("ConversationId")
    @Expose
    private String ConversationId;

    /**
    * 会话标题
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
     * Get <p>会话类型 枚举值: 0-CONVERSATION_TYPE_UNSPECIFIED(未指定；列表查询时表示全部), 1-CONVERSATION_TYPE_VISITOR(访客端体验), 2-CONVERSATION_TYPE_EVALUATION(评测), 5-CONVERSATION_TYPE_API(API 接入), 10-CONVERSATION_TYPE_WORKFLOW(工作流调试), 20-CONVERSATION_TYPE_SHARE(分享链接)</p> 
     * @return Type <p>会话类型 枚举值: 0-CONVERSATION_TYPE_UNSPECIFIED(未指定；列表查询时表示全部), 1-CONVERSATION_TYPE_VISITOR(访客端体验), 2-CONVERSATION_TYPE_EVALUATION(评测), 5-CONVERSATION_TYPE_API(API 接入), 10-CONVERSATION_TYPE_WORKFLOW(工作流调试), 20-CONVERSATION_TYPE_SHARE(分享链接)</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>会话类型 枚举值: 0-CONVERSATION_TYPE_UNSPECIFIED(未指定；列表查询时表示全部), 1-CONVERSATION_TYPE_VISITOR(访客端体验), 2-CONVERSATION_TYPE_EVALUATION(评测), 5-CONVERSATION_TYPE_API(API 接入), 10-CONVERSATION_TYPE_WORKFLOW(工作流调试), 20-CONVERSATION_TYPE_SHARE(分享链接)</p>
     * @param Type <p>会话类型 枚举值: 0-CONVERSATION_TYPE_UNSPECIFIED(未指定；列表查询时表示全部), 1-CONVERSATION_TYPE_VISITOR(访客端体验), 2-CONVERSATION_TYPE_EVALUATION(评测), 5-CONVERSATION_TYPE_API(API 接入), 10-CONVERSATION_TYPE_WORKFLOW(工作流调试), 20-CONVERSATION_TYPE_SHARE(分享链接)</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>应用 ID</p> 
     * @return AppId <p>应用 ID</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用 ID</p>
     * @param AppId <p>应用 ID</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Type=CONVERSATION_TYPE_API 时必填，应用密钥</p> 
     * @return AppKey <p>Type=CONVERSATION_TYPE_API 时必填，应用密钥</p>
     */
    public String getAppKey() {
        return this.AppKey;
    }

    /**
     * Set <p>Type=CONVERSATION_TYPE_API 时必填，应用密钥</p>
     * @param AppKey <p>Type=CONVERSATION_TYPE_API 时必填，应用密钥</p>
     */
    public void setAppKey(String AppKey) {
        this.AppKey = AppKey;
    }

    /**
     * Get <p>登录用户子账号(集成商模式必填)</p> 
     * @return LoginSubAccountUin <p>登录用户子账号(集成商模式必填)</p>
     */
    public String getLoginSubAccountUin() {
        return this.LoginSubAccountUin;
    }

    /**
     * Set <p>登录用户子账号(集成商模式必填)</p>
     * @param LoginSubAccountUin <p>登录用户子账号(集成商模式必填)</p>
     */
    public void setLoginSubAccountUin(String LoginSubAccountUin) {
        this.LoginSubAccountUin = LoginSubAccountUin;
    }

    /**
     * Get <p>登录用户主账号(集成商模式必填)</p> 
     * @return LoginUin <p>登录用户主账号(集成商模式必填)</p>
     */
    public String getLoginUin() {
        return this.LoginUin;
    }

    /**
     * Set <p>登录用户主账号(集成商模式必填)</p>
     * @param LoginUin <p>登录用户主账号(集成商模式必填)</p>
     */
    public void setLoginUin(String LoginUin) {
        this.LoginUin = LoginUin;
    }

    /**
     * Get <p>Type=CONVERSATION_TYPE_SHARE 时必填，分享码</p> 
     * @return ShareCode <p>Type=CONVERSATION_TYPE_SHARE 时必填，分享码</p>
     */
    public String getShareCode() {
        return this.ShareCode;
    }

    /**
     * Set <p>Type=CONVERSATION_TYPE_SHARE 时必填，分享码</p>
     * @param ShareCode <p>Type=CONVERSATION_TYPE_SHARE 时必填，分享码</p>
     */
    public void setShareCode(String ShareCode) {
        this.ShareCode = ShareCode;
    }

    /**
     * Get <p>Type=CONVERSATION_TYPE_API 时必填，访客ID</p> 
     * @return UserId <p>Type=CONVERSATION_TYPE_API 时必填，访客ID</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>Type=CONVERSATION_TYPE_API 时必填，访客ID</p>
     * @param UserId <p>Type=CONVERSATION_TYPE_API 时必填，访客ID</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 会话ID 
     * @return ConversationId 会话ID
     */
    public String getConversationId() {
        return this.ConversationId;
    }

    /**
     * Set 会话ID
     * @param ConversationId 会话ID
     */
    public void setConversationId(String ConversationId) {
        this.ConversationId = ConversationId;
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

    public ModifyConversationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyConversationRequest(ModifyConversationRequest source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.AppKey != null) {
            this.AppKey = new String(source.AppKey);
        }
        if (source.LoginSubAccountUin != null) {
            this.LoginSubAccountUin = new String(source.LoginSubAccountUin);
        }
        if (source.LoginUin != null) {
            this.LoginUin = new String(source.LoginUin);
        }
        if (source.ShareCode != null) {
            this.ShareCode = new String(source.ShareCode);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.ConversationId != null) {
            this.ConversationId = new String(source.ConversationId);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AppKey", this.AppKey);
        this.setParamSimple(map, prefix + "LoginSubAccountUin", this.LoginSubAccountUin);
        this.setParamSimple(map, prefix + "LoginUin", this.LoginUin);
        this.setParamSimple(map, prefix + "ShareCode", this.ShareCode);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "ConversationId", this.ConversationId);
        this.setParamSimple(map, prefix + "Title", this.Title);

    }
}

