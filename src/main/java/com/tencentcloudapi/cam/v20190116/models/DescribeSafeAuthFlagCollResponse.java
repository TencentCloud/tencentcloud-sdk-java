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

public class DescribeSafeAuthFlagCollResponse extends AbstractModel{

    /**
    * 登录保护设置
    */
    @SerializedName("LoginFlag")
    @Expose
    private LoginActionFlag LoginFlag;

    /**
    * 敏感操作保护设置
    */
    @SerializedName("ActionFlag")
    @Expose
    private LoginActionFlag ActionFlag;

    /**
    * 异地登录保护设置
    */
    @SerializedName("OffsiteFlag")
    @Expose
    private OffsiteFlag OffsiteFlag;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 登录保护设置 
     * @return LoginFlag 登录保护设置
     */
    public LoginActionFlag getLoginFlag() {
        return this.LoginFlag;
    }

    /**
     * Set 登录保护设置
     * @param LoginFlag 登录保护设置
     */
    public void setLoginFlag(LoginActionFlag LoginFlag) {
        this.LoginFlag = LoginFlag;
    }

    /**
     * Get 敏感操作保护设置 
     * @return ActionFlag 敏感操作保护设置
     */
    public LoginActionFlag getActionFlag() {
        return this.ActionFlag;
    }

    /**
     * Set 敏感操作保护设置
     * @param ActionFlag 敏感操作保护设置
     */
    public void setActionFlag(LoginActionFlag ActionFlag) {
        this.ActionFlag = ActionFlag;
    }

    /**
     * Get 异地登录保护设置 
     * @return OffsiteFlag 异地登录保护设置
     */
    public OffsiteFlag getOffsiteFlag() {
        return this.OffsiteFlag;
    }

    /**
     * Set 异地登录保护设置
     * @param OffsiteFlag 异地登录保护设置
     */
    public void setOffsiteFlag(OffsiteFlag OffsiteFlag) {
        this.OffsiteFlag = OffsiteFlag;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeSafeAuthFlagCollResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSafeAuthFlagCollResponse(DescribeSafeAuthFlagCollResponse source) {
        if (source.LoginFlag != null) {
            this.LoginFlag = new LoginActionFlag(source.LoginFlag);
        }
        if (source.ActionFlag != null) {
            this.ActionFlag = new LoginActionFlag(source.ActionFlag);
        }
        if (source.OffsiteFlag != null) {
            this.OffsiteFlag = new OffsiteFlag(source.OffsiteFlag);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "LoginFlag.", this.LoginFlag);
        this.setParamObj(map, prefix + "ActionFlag.", this.ActionFlag);
        this.setParamObj(map, prefix + "OffsiteFlag.", this.OffsiteFlag);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

