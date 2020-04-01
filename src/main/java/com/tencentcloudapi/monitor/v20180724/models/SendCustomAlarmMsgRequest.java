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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendCustomAlarmMsgRequest extends AbstractModel{

    /**
    * 接口模块名，当前取值monitor
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 消息策略ID，在云监控自定义消息页面配置
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * 用户想要发送的自定义消息内容
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
     * Get 接口模块名，当前取值monitor 
     * @return Module 接口模块名，当前取值monitor
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 接口模块名，当前取值monitor
     * @param Module 接口模块名，当前取值monitor
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 消息策略ID，在云监控自定义消息页面配置 
     * @return PolicyId 消息策略ID，在云监控自定义消息页面配置
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 消息策略ID，在云监控自定义消息页面配置
     * @param PolicyId 消息策略ID，在云监控自定义消息页面配置
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 用户想要发送的自定义消息内容 
     * @return Msg 用户想要发送的自定义消息内容
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set 用户想要发送的自定义消息内容
     * @param Msg 用户想要发送的自定义消息内容
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "Msg", this.Msg);

    }
}

