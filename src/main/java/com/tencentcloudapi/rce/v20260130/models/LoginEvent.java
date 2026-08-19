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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoginEvent extends AbstractModel {

    /**
    * <p>用户基础信息</p>
    */
    @SerializedName("UserInfo")
    @Expose
    private User UserInfo;

    /**
    * <p>用户登录时输入的用户名</p>
    */
    @SerializedName("UserLoginName")
    @Expose
    private String UserLoginName;

    /**
    * <p>登录结果</p>
    */
    @SerializedName("LoginResult")
    @Expose
    private Result LoginResult;

    /**
    * <p>与RCE约定的定制化信息，为K:V 格式的对象数组，示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p>
    */
    @SerializedName("Cust")
    @Expose
    private Cust [] Cust;

    /**
     * Get <p>用户基础信息</p> 
     * @return UserInfo <p>用户基础信息</p>
     */
    public User getUserInfo() {
        return this.UserInfo;
    }

    /**
     * Set <p>用户基础信息</p>
     * @param UserInfo <p>用户基础信息</p>
     */
    public void setUserInfo(User UserInfo) {
        this.UserInfo = UserInfo;
    }

    /**
     * Get <p>用户登录时输入的用户名</p> 
     * @return UserLoginName <p>用户登录时输入的用户名</p>
     */
    public String getUserLoginName() {
        return this.UserLoginName;
    }

    /**
     * Set <p>用户登录时输入的用户名</p>
     * @param UserLoginName <p>用户登录时输入的用户名</p>
     */
    public void setUserLoginName(String UserLoginName) {
        this.UserLoginName = UserLoginName;
    }

    /**
     * Get <p>登录结果</p> 
     * @return LoginResult <p>登录结果</p>
     */
    public Result getLoginResult() {
        return this.LoginResult;
    }

    /**
     * Set <p>登录结果</p>
     * @param LoginResult <p>登录结果</p>
     */
    public void setLoginResult(Result LoginResult) {
        this.LoginResult = LoginResult;
    }

    /**
     * Get <p>与RCE约定的定制化信息，为K:V 格式的对象数组，示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p> 
     * @return Cust <p>与RCE约定的定制化信息，为K:V 格式的对象数组，示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p>
     */
    public Cust [] getCust() {
        return this.Cust;
    }

    /**
     * Set <p>与RCE约定的定制化信息，为K:V 格式的对象数组，示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p>
     * @param Cust <p>与RCE约定的定制化信息，为K:V 格式的对象数组，示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p>
     */
    public void setCust(Cust [] Cust) {
        this.Cust = Cust;
    }

    public LoginEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoginEvent(LoginEvent source) {
        if (source.UserInfo != null) {
            this.UserInfo = new User(source.UserInfo);
        }
        if (source.UserLoginName != null) {
            this.UserLoginName = new String(source.UserLoginName);
        }
        if (source.LoginResult != null) {
            this.LoginResult = new Result(source.LoginResult);
        }
        if (source.Cust != null) {
            this.Cust = new Cust[source.Cust.length];
            for (int i = 0; i < source.Cust.length; i++) {
                this.Cust[i] = new Cust(source.Cust[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "UserInfo.", this.UserInfo);
        this.setParamSimple(map, prefix + "UserLoginName", this.UserLoginName);
        this.setParamObj(map, prefix + "LoginResult.", this.LoginResult);
        this.setParamArrayObj(map, prefix + "Cust.", this.Cust);

    }
}

