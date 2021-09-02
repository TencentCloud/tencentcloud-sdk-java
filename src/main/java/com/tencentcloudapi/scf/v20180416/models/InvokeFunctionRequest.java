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

public class InvokeFunctionRequest extends AbstractModel{

    /**
    * 函数名称
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * 触发函数的版本号或别名，默认值为$DEFAULT
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
    * 运行函数时的参数，以json格式传入，最大支持的参数长度是 6MB。该字段信息对应函数 [event 入参](https://cloud.tencent.com/document/product/583/9210#.E5.87.BD.E6.95.B0.E5.85.A5.E5.8F.82.3Ca-id.3D.22input.22.3E.3C.2Fa.3E)。
    */
    @SerializedName("Event")
    @Expose
    private String Event;

    /**
    * 返回值会包含4KB的日志，可选值为None和Tail，默认值为None。当该值为Tail时，返回参数中的Log字段会包含对应的函数执行日志
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * 命名空间，不填默认为 default
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
     * Get 触发函数的版本号或别名，默认值为$DEFAULT 
     * @return Qualifier 触发函数的版本号或别名，默认值为$DEFAULT
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set 触发函数的版本号或别名，默认值为$DEFAULT
     * @param Qualifier 触发函数的版本号或别名，默认值为$DEFAULT
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    /**
     * Get 运行函数时的参数，以json格式传入，最大支持的参数长度是 6MB。该字段信息对应函数 [event 入参](https://cloud.tencent.com/document/product/583/9210#.E5.87.BD.E6.95.B0.E5.85.A5.E5.8F.82.3Ca-id.3D.22input.22.3E.3C.2Fa.3E)。 
     * @return Event 运行函数时的参数，以json格式传入，最大支持的参数长度是 6MB。该字段信息对应函数 [event 入参](https://cloud.tencent.com/document/product/583/9210#.E5.87.BD.E6.95.B0.E5.85.A5.E5.8F.82.3Ca-id.3D.22input.22.3E.3C.2Fa.3E)。
     */
    public String getEvent() {
        return this.Event;
    }

    /**
     * Set 运行函数时的参数，以json格式传入，最大支持的参数长度是 6MB。该字段信息对应函数 [event 入参](https://cloud.tencent.com/document/product/583/9210#.E5.87.BD.E6.95.B0.E5.85.A5.E5.8F.82.3Ca-id.3D.22input.22.3E.3C.2Fa.3E)。
     * @param Event 运行函数时的参数，以json格式传入，最大支持的参数长度是 6MB。该字段信息对应函数 [event 入参](https://cloud.tencent.com/document/product/583/9210#.E5.87.BD.E6.95.B0.E5.85.A5.E5.8F.82.3Ca-id.3D.22input.22.3E.3C.2Fa.3E)。
     */
    public void setEvent(String Event) {
        this.Event = Event;
    }

    /**
     * Get 返回值会包含4KB的日志，可选值为None和Tail，默认值为None。当该值为Tail时，返回参数中的Log字段会包含对应的函数执行日志 
     * @return LogType 返回值会包含4KB的日志，可选值为None和Tail，默认值为None。当该值为Tail时，返回参数中的Log字段会包含对应的函数执行日志
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set 返回值会包含4KB的日志，可选值为None和Tail，默认值为None。当该值为Tail时，返回参数中的Log字段会包含对应的函数执行日志
     * @param LogType 返回值会包含4KB的日志，可选值为None和Tail，默认值为None。当该值为Tail时，返回参数中的Log字段会包含对应的函数执行日志
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get 命名空间，不填默认为 default 
     * @return Namespace 命名空间，不填默认为 default
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间，不填默认为 default
     * @param Namespace 命名空间，不填默认为 default
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

    public InvokeFunctionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InvokeFunctionRequest(InvokeFunctionRequest source) {
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.Qualifier != null) {
            this.Qualifier = new String(source.Qualifier);
        }
        if (source.Event != null) {
            this.Event = new String(source.Event);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.RoutingKey != null) {
            this.RoutingKey = new String(source.RoutingKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);
        this.setParamSimple(map, prefix + "Event", this.Event);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "RoutingKey", this.RoutingKey);

    }
}

