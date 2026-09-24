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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecentLoginItem extends AbstractModel {

    /**
    * <p>登录时间</p><p>参数格式：YYYY-MM-DD HH:MM:SS</p>
    */
    @SerializedName("LoginTime")
    @Expose
    private String LoginTime;

    /**
    * <p>登录方式</p><p>枚举值：</p><ul><li>0： 无效用户</li><li>1： 密码错误</li><li>2： 密码登录</li><li>3： 密钥登录</li><li>4： PAM 认证失败（sshd）</li><li>5： PAM 认证失败（tty）</li><li>6： 键盘交互登录</li><li>7： 键盘交互认证失败</li><li>8： PAM 认证失败</li></ul>
    */
    @SerializedName("LoginType")
    @Expose
    private Long LoginType;

    /**
    * <p>登录方式描述</p>
    */
    @SerializedName("LoginTypeDesc")
    @Expose
    private String LoginTypeDesc;

    /**
     * Get <p>登录时间</p><p>参数格式：YYYY-MM-DD HH:MM:SS</p> 
     * @return LoginTime <p>登录时间</p><p>参数格式：YYYY-MM-DD HH:MM:SS</p>
     */
    public String getLoginTime() {
        return this.LoginTime;
    }

    /**
     * Set <p>登录时间</p><p>参数格式：YYYY-MM-DD HH:MM:SS</p>
     * @param LoginTime <p>登录时间</p><p>参数格式：YYYY-MM-DD HH:MM:SS</p>
     */
    public void setLoginTime(String LoginTime) {
        this.LoginTime = LoginTime;
    }

    /**
     * Get <p>登录方式</p><p>枚举值：</p><ul><li>0： 无效用户</li><li>1： 密码错误</li><li>2： 密码登录</li><li>3： 密钥登录</li><li>4： PAM 认证失败（sshd）</li><li>5： PAM 认证失败（tty）</li><li>6： 键盘交互登录</li><li>7： 键盘交互认证失败</li><li>8： PAM 认证失败</li></ul> 
     * @return LoginType <p>登录方式</p><p>枚举值：</p><ul><li>0： 无效用户</li><li>1： 密码错误</li><li>2： 密码登录</li><li>3： 密钥登录</li><li>4： PAM 认证失败（sshd）</li><li>5： PAM 认证失败（tty）</li><li>6： 键盘交互登录</li><li>7： 键盘交互认证失败</li><li>8： PAM 认证失败</li></ul>
     */
    public Long getLoginType() {
        return this.LoginType;
    }

    /**
     * Set <p>登录方式</p><p>枚举值：</p><ul><li>0： 无效用户</li><li>1： 密码错误</li><li>2： 密码登录</li><li>3： 密钥登录</li><li>4： PAM 认证失败（sshd）</li><li>5： PAM 认证失败（tty）</li><li>6： 键盘交互登录</li><li>7： 键盘交互认证失败</li><li>8： PAM 认证失败</li></ul>
     * @param LoginType <p>登录方式</p><p>枚举值：</p><ul><li>0： 无效用户</li><li>1： 密码错误</li><li>2： 密码登录</li><li>3： 密钥登录</li><li>4： PAM 认证失败（sshd）</li><li>5： PAM 认证失败（tty）</li><li>6： 键盘交互登录</li><li>7： 键盘交互认证失败</li><li>8： PAM 认证失败</li></ul>
     */
    public void setLoginType(Long LoginType) {
        this.LoginType = LoginType;
    }

    /**
     * Get <p>登录方式描述</p> 
     * @return LoginTypeDesc <p>登录方式描述</p>
     */
    public String getLoginTypeDesc() {
        return this.LoginTypeDesc;
    }

    /**
     * Set <p>登录方式描述</p>
     * @param LoginTypeDesc <p>登录方式描述</p>
     */
    public void setLoginTypeDesc(String LoginTypeDesc) {
        this.LoginTypeDesc = LoginTypeDesc;
    }

    public RecentLoginItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecentLoginItem(RecentLoginItem source) {
        if (source.LoginTime != null) {
            this.LoginTime = new String(source.LoginTime);
        }
        if (source.LoginType != null) {
            this.LoginType = new Long(source.LoginType);
        }
        if (source.LoginTypeDesc != null) {
            this.LoginTypeDesc = new String(source.LoginTypeDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoginTime", this.LoginTime);
        this.setParamSimple(map, prefix + "LoginType", this.LoginType);
        this.setParamSimple(map, prefix + "LoginTypeDesc", this.LoginTypeDesc);

    }
}

