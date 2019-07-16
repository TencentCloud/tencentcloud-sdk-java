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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetFlagRequest  extends AbstractModel{

    /**
    * 设置用户的uin
    */
    @SerializedName("OpUin")
    @Expose
    private Long OpUin;

    /**
    * 登录设置
    */
    @SerializedName("LoginFlag")
    @Expose
    private LoginActionFlag LoginFlag;

    /**
    * 敏感操作设置
    */
    @SerializedName("ActionFlag")
    @Expose
    private LoginActionFlag ActionFlag;

    /**
    * 异地登录设置
    */
    @SerializedName("OffsiteFlag")
    @Expose
    private OffsiteFlag OffsiteFlag;

    /**
    * 是否需要充值mfa
    */
    @SerializedName("NeedResetMfa")
    @Expose
    private Long NeedResetMfa;

    /**
     * 获取设置用户的uin
     * @return OpUin 设置用户的uin
     */
    public Long getOpUin() {
        return this.OpUin;
    }

    /**
     * 设置设置用户的uin
     * @param OpUin 设置用户的uin
     */
    public void setOpUin(Long OpUin) {
        this.OpUin = OpUin;
    }

    /**
     * 获取登录设置
     * @return LoginFlag 登录设置
     */
    public LoginActionFlag getLoginFlag() {
        return this.LoginFlag;
    }

    /**
     * 设置登录设置
     * @param LoginFlag 登录设置
     */
    public void setLoginFlag(LoginActionFlag LoginFlag) {
        this.LoginFlag = LoginFlag;
    }

    /**
     * 获取敏感操作设置
     * @return ActionFlag 敏感操作设置
     */
    public LoginActionFlag getActionFlag() {
        return this.ActionFlag;
    }

    /**
     * 设置敏感操作设置
     * @param ActionFlag 敏感操作设置
     */
    public void setActionFlag(LoginActionFlag ActionFlag) {
        this.ActionFlag = ActionFlag;
    }

    /**
     * 获取异地登录设置
     * @return OffsiteFlag 异地登录设置
     */
    public OffsiteFlag getOffsiteFlag() {
        return this.OffsiteFlag;
    }

    /**
     * 设置异地登录设置
     * @param OffsiteFlag 异地登录设置
     */
    public void setOffsiteFlag(OffsiteFlag OffsiteFlag) {
        this.OffsiteFlag = OffsiteFlag;
    }

    /**
     * 获取是否需要充值mfa
     * @return NeedResetMfa 是否需要充值mfa
     */
    public Long getNeedResetMfa() {
        return this.NeedResetMfa;
    }

    /**
     * 设置是否需要充值mfa
     * @param NeedResetMfa 是否需要充值mfa
     */
    public void setNeedResetMfa(Long NeedResetMfa) {
        this.NeedResetMfa = NeedResetMfa;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OpUin", this.OpUin);
        this.setParamObj(map, prefix + "LoginFlag.", this.LoginFlag);
        this.setParamObj(map, prefix + "ActionFlag.", this.ActionFlag);
        this.setParamObj(map, prefix + "OffsiteFlag.", this.OffsiteFlag);
        this.setParamSimple(map, prefix + "NeedResetMfa", this.NeedResetMfa);

    }
}

