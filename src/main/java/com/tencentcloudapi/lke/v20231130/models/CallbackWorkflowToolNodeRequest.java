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

public class CallbackWorkflowToolNodeRequest extends AbstractModel {

    /**
    * ADP调用外部API时,通过HTTP Header(X-ADP-Callback-Token)传递回调CallbackToken
    */
    @SerializedName("CallbackToken")
    @Expose
    private String CallbackToken;

    /**
    * 回调结果,可选,为JSON字符串
    */
    @SerializedName("Result")
    @Expose
    private String Result;

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
    * 应用ID
    */
    @SerializedName("AppBizId")
    @Expose
    private String AppBizId;

    /**
     * Get ADP调用外部API时,通过HTTP Header(X-ADP-Callback-Token)传递回调CallbackToken 
     * @return CallbackToken ADP调用外部API时,通过HTTP Header(X-ADP-Callback-Token)传递回调CallbackToken
     */
    public String getCallbackToken() {
        return this.CallbackToken;
    }

    /**
     * Set ADP调用外部API时,通过HTTP Header(X-ADP-Callback-Token)传递回调CallbackToken
     * @param CallbackToken ADP调用外部API时,通过HTTP Header(X-ADP-Callback-Token)传递回调CallbackToken
     */
    public void setCallbackToken(String CallbackToken) {
        this.CallbackToken = CallbackToken;
    }

    /**
     * Get 回调结果,可选,为JSON字符串 
     * @return Result 回调结果,可选,为JSON字符串
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 回调结果,可选,为JSON字符串
     * @param Result 回调结果,可选,为JSON字符串
     */
    public void setResult(String Result) {
        this.Result = Result;
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
     * Get 应用ID 
     * @return AppBizId 应用ID
     */
    public String getAppBizId() {
        return this.AppBizId;
    }

    /**
     * Set 应用ID
     * @param AppBizId 应用ID
     */
    public void setAppBizId(String AppBizId) {
        this.AppBizId = AppBizId;
    }

    public CallbackWorkflowToolNodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CallbackWorkflowToolNodeRequest(CallbackWorkflowToolNodeRequest source) {
        if (source.CallbackToken != null) {
            this.CallbackToken = new String(source.CallbackToken);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.LoginUin != null) {
            this.LoginUin = new String(source.LoginUin);
        }
        if (source.LoginSubAccountUin != null) {
            this.LoginSubAccountUin = new String(source.LoginSubAccountUin);
        }
        if (source.AppBizId != null) {
            this.AppBizId = new String(source.AppBizId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CallbackToken", this.CallbackToken);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "LoginUin", this.LoginUin);
        this.setParamSimple(map, prefix + "LoginSubAccountUin", this.LoginSubAccountUin);
        this.setParamSimple(map, prefix + "AppBizId", this.AppBizId);

    }
}

