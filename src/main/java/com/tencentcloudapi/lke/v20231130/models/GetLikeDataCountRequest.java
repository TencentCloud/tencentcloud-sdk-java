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

public class GetLikeDataCountRequest extends AbstractModel {

    /**
    * 开始日期
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束日期
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 应用id
    */
    @SerializedName("AppBizId")
    @Expose
    private String [] AppBizId;

    /**
    * 消息来源(1、分享用户端  2、对话API)
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

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
     * Get 开始日期 
     * @return StartTime 开始日期
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始日期
     * @param StartTime 开始日期
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束日期 
     * @return EndTime 结束日期
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束日期
     * @param EndTime 结束日期
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 应用id 
     * @return AppBizId 应用id
     */
    public String [] getAppBizId() {
        return this.AppBizId;
    }

    /**
     * Set 应用id
     * @param AppBizId 应用id
     */
    public void setAppBizId(String [] AppBizId) {
        this.AppBizId = AppBizId;
    }

    /**
     * Get 消息来源(1、分享用户端  2、对话API) 
     * @return Type 消息来源(1、分享用户端  2、对话API)
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 消息来源(1、分享用户端  2、对话API)
     * @param Type 消息来源(1、分享用户端  2、对话API)
     */
    public void setType(Long Type) {
        this.Type = Type;
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

    public GetLikeDataCountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetLikeDataCountRequest(GetLikeDataCountRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.AppBizId != null) {
            this.AppBizId = new String[source.AppBizId.length];
            for (int i = 0; i < source.AppBizId.length; i++) {
                this.AppBizId[i] = new String(source.AppBizId[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.LoginUin != null) {
            this.LoginUin = new String(source.LoginUin);
        }
        if (source.LoginSubAccountUin != null) {
            this.LoginSubAccountUin = new String(source.LoginSubAccountUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "AppBizId.", this.AppBizId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "LoginUin", this.LoginUin);
        this.setParamSimple(map, prefix + "LoginSubAccountUin", this.LoginSubAccountUin);

    }
}

