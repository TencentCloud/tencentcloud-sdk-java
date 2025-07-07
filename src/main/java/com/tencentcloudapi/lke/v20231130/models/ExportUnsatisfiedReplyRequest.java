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

public class ExportUnsatisfiedReplyRequest extends AbstractModel {

    /**
    * 应用ID
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * 勾选导出ID列表
    */
    @SerializedName("ReplyBizIds")
    @Expose
    private String [] ReplyBizIds;

    /**
    * 登录用户主账号(集成商模式必填)
    */
    @SerializedName("LoginUin")
    @Expose
    private String LoginUin;

    /**
    * 登录用户子账号(集成商模式必填)
    */
    @SerializedName("LoginSubAccountUin")
    @Expose
    private String LoginSubAccountUin;

    /**
    * 检索过滤器
    */
    @SerializedName("Filters")
    @Expose
    private Filters Filters;

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
     * Get 勾选导出ID列表 
     * @return ReplyBizIds 勾选导出ID列表
     */
    public String [] getReplyBizIds() {
        return this.ReplyBizIds;
    }

    /**
     * Set 勾选导出ID列表
     * @param ReplyBizIds 勾选导出ID列表
     */
    public void setReplyBizIds(String [] ReplyBizIds) {
        this.ReplyBizIds = ReplyBizIds;
    }

    /**
     * Get 登录用户主账号(集成商模式必填) 
     * @return LoginUin 登录用户主账号(集成商模式必填)
     */
    public String getLoginUin() {
        return this.LoginUin;
    }

    /**
     * Set 登录用户主账号(集成商模式必填)
     * @param LoginUin 登录用户主账号(集成商模式必填)
     */
    public void setLoginUin(String LoginUin) {
        this.LoginUin = LoginUin;
    }

    /**
     * Get 登录用户子账号(集成商模式必填) 
     * @return LoginSubAccountUin 登录用户子账号(集成商模式必填)
     */
    public String getLoginSubAccountUin() {
        return this.LoginSubAccountUin;
    }

    /**
     * Set 登录用户子账号(集成商模式必填)
     * @param LoginSubAccountUin 登录用户子账号(集成商模式必填)
     */
    public void setLoginSubAccountUin(String LoginSubAccountUin) {
        this.LoginSubAccountUin = LoginSubAccountUin;
    }

    /**
     * Get 检索过滤器 
     * @return Filters 检索过滤器
     */
    public Filters getFilters() {
        return this.Filters;
    }

    /**
     * Set 检索过滤器
     * @param Filters 检索过滤器
     */
    public void setFilters(Filters Filters) {
        this.Filters = Filters;
    }

    public ExportUnsatisfiedReplyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportUnsatisfiedReplyRequest(ExportUnsatisfiedReplyRequest source) {
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.ReplyBizIds != null) {
            this.ReplyBizIds = new String[source.ReplyBizIds.length];
            for (int i = 0; i < source.ReplyBizIds.length; i++) {
                this.ReplyBizIds[i] = new String(source.ReplyBizIds[i]);
            }
        }
        if (source.LoginUin != null) {
            this.LoginUin = new String(source.LoginUin);
        }
        if (source.LoginSubAccountUin != null) {
            this.LoginSubAccountUin = new String(source.LoginSubAccountUin);
        }
        if (source.Filters != null) {
            this.Filters = new Filters(source.Filters);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamArraySimple(map, prefix + "ReplyBizIds.", this.ReplyBizIds);
        this.setParamSimple(map, prefix + "LoginUin", this.LoginUin);
        this.setParamSimple(map, prefix + "LoginSubAccountUin", this.LoginSubAccountUin);
        this.setParamObj(map, prefix + "Filters.", this.Filters);

    }
}

