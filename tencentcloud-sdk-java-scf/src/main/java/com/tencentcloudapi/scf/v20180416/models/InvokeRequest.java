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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InvokeRequest extends AbstractModel{

    /**
    * 函数名称
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * RequestResponse(同步) 和 Event(异步)，默认为同步
    */
    @SerializedName("InvocationType")
    @Expose
    private String InvocationType;

    /**
    * 触发函数的版本号
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
    * 运行函数时的参数，以json格式传入，最大支持的参数长度是 1M
    */
    @SerializedName("ClientContext")
    @Expose
    private String ClientContext;

    /**
    * 同步调用时指定该字段，返回值会包含4K的日志，可选值为None和Tail，默认值为None。当该值为Tail时，返回参数中的logMsg字段会包含对应的函数执行日志
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * 命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 函数灰度流量控制调用，以json格式传入，例如{"k":"v"}，注意kv都需要是字符串类型，最大支持的参数长度是1024字节
    */
    @SerializedName("RoutingKey")
    @Expose
    private String RoutingKey;

    /**
     * Get 函数名称 
     * @return FunctionName 函数名称
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set 函数名称
     * @param FunctionName 函数名称
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get RequestResponse(同步) 和 Event(异步)，默认为同步 
     * @return InvocationType RequestResponse(同步) 和 Event(异步)，默认为同步
     */
    public String getInvocationType() {
        return this.InvocationType;
    }

    /**
     * Set RequestResponse(同步) 和 Event(异步)，默认为同步
     * @param InvocationType RequestResponse(同步) 和 Event(异步)，默认为同步
     */
    public void setInvocationType(String InvocationType) {
        this.InvocationType = InvocationType;
    }

    /**
     * Get 触发函数的版本号 
     * @return Qualifier 触发函数的版本号
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set 触发函数的版本号
     * @param Qualifier 触发函数的版本号
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    /**
     * Get 运行函数时的参数，以json格式传入，最大支持的参数长度是 1M 
     * @return ClientContext 运行函数时的参数，以json格式传入，最大支持的参数长度是 1M
     */
    public String getClientContext() {
        return this.ClientContext;
    }

    /**
     * Set 运行函数时的参数，以json格式传入，最大支持的参数长度是 1M
     * @param ClientContext 运行函数时的参数，以json格式传入，最大支持的参数长度是 1M
     */
    public void setClientContext(String ClientContext) {
        this.ClientContext = ClientContext;
    }

    /**
     * Get 同步调用时指定该字段，返回值会包含4K的日志，可选值为None和Tail，默认值为None。当该值为Tail时，返回参数中的logMsg字段会包含对应的函数执行日志 
     * @return LogType 同步调用时指定该字段，返回值会包含4K的日志，可选值为None和Tail，默认值为None。当该值为Tail时，返回参数中的logMsg字段会包含对应的函数执行日志
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set 同步调用时指定该字段，返回值会包含4K的日志，可选值为None和Tail，默认值为None。当该值为Tail时，返回参数中的logMsg字段会包含对应的函数执行日志
     * @param LogType 同步调用时指定该字段，返回值会包含4K的日志，可选值为None和Tail，默认值为None。当该值为Tail时，返回参数中的logMsg字段会包含对应的函数执行日志
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get 命名空间 
     * @return Namespace 命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间
     * @param Namespace 命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 函数灰度流量控制调用，以json格式传入，例如{"k":"v"}，注意kv都需要是字符串类型，最大支持的参数长度是1024字节 
     * @return RoutingKey 函数灰度流量控制调用，以json格式传入，例如{"k":"v"}，注意kv都需要是字符串类型，最大支持的参数长度是1024字节
     */
    public String getRoutingKey() {
        return this.RoutingKey;
    }

    /**
     * Set 函数灰度流量控制调用，以json格式传入，例如{"k":"v"}，注意kv都需要是字符串类型，最大支持的参数长度是1024字节
     * @param RoutingKey 函数灰度流量控制调用，以json格式传入，例如{"k":"v"}，注意kv都需要是字符串类型，最大支持的参数长度是1024字节
     */
    public void setRoutingKey(String RoutingKey) {
        this.RoutingKey = RoutingKey;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "InvocationType", this.InvocationType);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);
        this.setParamSimple(map, prefix + "ClientContext", this.ClientContext);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "RoutingKey", this.RoutingKey);

    }
}

