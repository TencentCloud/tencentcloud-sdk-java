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

public class SetMfaFlagRequest extends AbstractModel{

    /**
    * 设置用户的uin
    */
    @SerializedName("OpUin")
    @Expose
    private Long OpUin;

    /**
    * 登录保护设置
    */
    @SerializedName("LoginFlag")
    @Expose
    private LoginActionMfaFlag LoginFlag;

    /**
    * 操作保护设置
    */
    @SerializedName("ActionFlag")
    @Expose
    private LoginActionMfaFlag ActionFlag;

    /**
     * Get 设置用户的uin 
     * @return OpUin 设置用户的uin
     */
    public Long getOpUin() {
        return this.OpUin;
    }

    /**
     * Set 设置用户的uin
     * @param OpUin 设置用户的uin
     */
    public void setOpUin(Long OpUin) {
        this.OpUin = OpUin;
    }

    /**
     * Get 登录保护设置 
     * @return LoginFlag 登录保护设置
     */
    public LoginActionMfaFlag getLoginFlag() {
        return this.LoginFlag;
    }

    /**
     * Set 登录保护设置
     * @param LoginFlag 登录保护设置
     */
    public void setLoginFlag(LoginActionMfaFlag LoginFlag) {
        this.LoginFlag = LoginFlag;
    }

    /**
     * Get 操作保护设置 
     * @return ActionFlag 操作保护设置
     */
    public LoginActionMfaFlag getActionFlag() {
        return this.ActionFlag;
    }

    /**
     * Set 操作保护设置
     * @param ActionFlag 操作保护设置
     */
    public void setActionFlag(LoginActionMfaFlag ActionFlag) {
        this.ActionFlag = ActionFlag;
    }

    public SetMfaFlagRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetMfaFlagRequest(SetMfaFlagRequest source) {
        if (source.OpUin != null) {
            this.OpUin = new Long(source.OpUin);
        }
        if (source.LoginFlag != null) {
            this.LoginFlag = new LoginActionMfaFlag(source.LoginFlag);
        }
        if (source.ActionFlag != null) {
            this.ActionFlag = new LoginActionMfaFlag(source.ActionFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OpUin", this.OpUin);
        this.setParamObj(map, prefix + "LoginFlag.", this.LoginFlag);
        this.setParamObj(map, prefix + "ActionFlag.", this.ActionFlag);

    }
}

