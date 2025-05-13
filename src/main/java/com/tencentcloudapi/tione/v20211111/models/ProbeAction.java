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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProbeAction extends AbstractModel {

    /**
    * http get 行为
    */
    @SerializedName("HTTPGet")
    @Expose
    private HTTPGetAction HTTPGet;

    /**
    * 执行命令检查 行为
    */
    @SerializedName("Exec")
    @Expose
    private ExecAction Exec;

    /**
    * tcp socket 检查行为
    */
    @SerializedName("TCPSocket")
    @Expose
    private TCPSocketAction TCPSocket;

    /**
    * 探针类型，默认 HTTPGet，可选值：HTTPGet、Exec、TCPSocket
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
     * Get http get 行为 
     * @return HTTPGet http get 行为
     */
    public HTTPGetAction getHTTPGet() {
        return this.HTTPGet;
    }

    /**
     * Set http get 行为
     * @param HTTPGet http get 行为
     */
    public void setHTTPGet(HTTPGetAction HTTPGet) {
        this.HTTPGet = HTTPGet;
    }

    /**
     * Get 执行命令检查 行为 
     * @return Exec 执行命令检查 行为
     */
    public ExecAction getExec() {
        return this.Exec;
    }

    /**
     * Set 执行命令检查 行为
     * @param Exec 执行命令检查 行为
     */
    public void setExec(ExecAction Exec) {
        this.Exec = Exec;
    }

    /**
     * Get tcp socket 检查行为 
     * @return TCPSocket tcp socket 检查行为
     */
    public TCPSocketAction getTCPSocket() {
        return this.TCPSocket;
    }

    /**
     * Set tcp socket 检查行为
     * @param TCPSocket tcp socket 检查行为
     */
    public void setTCPSocket(TCPSocketAction TCPSocket) {
        this.TCPSocket = TCPSocket;
    }

    /**
     * Get 探针类型，默认 HTTPGet，可选值：HTTPGet、Exec、TCPSocket 
     * @return ActionType 探针类型，默认 HTTPGet，可选值：HTTPGet、Exec、TCPSocket
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set 探针类型，默认 HTTPGet，可选值：HTTPGet、Exec、TCPSocket
     * @param ActionType 探针类型，默认 HTTPGet，可选值：HTTPGet、Exec、TCPSocket
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    public ProbeAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProbeAction(ProbeAction source) {
        if (source.HTTPGet != null) {
            this.HTTPGet = new HTTPGetAction(source.HTTPGet);
        }
        if (source.Exec != null) {
            this.Exec = new ExecAction(source.Exec);
        }
        if (source.TCPSocket != null) {
            this.TCPSocket = new TCPSocketAction(source.TCPSocket);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "HTTPGet.", this.HTTPGet);
        this.setParamObj(map, prefix + "Exec.", this.Exec);
        this.setParamObj(map, prefix + "TCPSocket.", this.TCPSocket);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);

    }
}

