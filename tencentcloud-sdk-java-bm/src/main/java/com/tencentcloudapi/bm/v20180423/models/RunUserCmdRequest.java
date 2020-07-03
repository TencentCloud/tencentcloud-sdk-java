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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunUserCmdRequest extends AbstractModel{

    /**
    * 自定义脚本ID
    */
    @SerializedName("CmdId")
    @Expose
    private String CmdId;

    /**
    * 执行脚本机器的用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 执行脚本机器的用户名的密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 执行脚本的服务器实例
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 执行脚本的参数，必须经过base64编码
    */
    @SerializedName("CmdParam")
    @Expose
    private String CmdParam;

    /**
     * Get 自定义脚本ID 
     * @return CmdId 自定义脚本ID
     */
    public String getCmdId() {
        return this.CmdId;
    }

    /**
     * Set 自定义脚本ID
     * @param CmdId 自定义脚本ID
     */
    public void setCmdId(String CmdId) {
        this.CmdId = CmdId;
    }

    /**
     * Get 执行脚本机器的用户名 
     * @return UserName 执行脚本机器的用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 执行脚本机器的用户名
     * @param UserName 执行脚本机器的用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 执行脚本机器的用户名的密码 
     * @return Password 执行脚本机器的用户名的密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 执行脚本机器的用户名的密码
     * @param Password 执行脚本机器的用户名的密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 执行脚本的服务器实例 
     * @return InstanceIds 执行脚本的服务器实例
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 执行脚本的服务器实例
     * @param InstanceIds 执行脚本的服务器实例
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 执行脚本的参数，必须经过base64编码 
     * @return CmdParam 执行脚本的参数，必须经过base64编码
     */
    public String getCmdParam() {
        return this.CmdParam;
    }

    /**
     * Set 执行脚本的参数，必须经过base64编码
     * @param CmdParam 执行脚本的参数，必须经过base64编码
     */
    public void setCmdParam(String CmdParam) {
        this.CmdParam = CmdParam;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CmdId", this.CmdId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "CmdParam", this.CmdParam);

    }
}

