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

public class TerminateAsyncEventRequest extends AbstractModel{

    /**
    * 函数名称
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * 终止的调用请求id
    */
    @SerializedName("InvokeRequestId")
    @Expose
    private String InvokeRequestId;

    /**
    * 命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * true，向指定请求[发送 SIGTERM 终止信号](https://cloud.tencent.com/document/product/583/63969#.E5.8F.91.E9.80.81.E7.BB.88.E6.AD.A2.E4.BF.A1.E5.8F.B7]， ，默认值为 false。
    */
    @SerializedName("GraceShutdown")
    @Expose
    private Boolean GraceShutdown;

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
     * Get 终止的调用请求id 
     * @return InvokeRequestId 终止的调用请求id
     */
    public String getInvokeRequestId() {
        return this.InvokeRequestId;
    }

    /**
     * Set 终止的调用请求id
     * @param InvokeRequestId 终止的调用请求id
     */
    public void setInvokeRequestId(String InvokeRequestId) {
        this.InvokeRequestId = InvokeRequestId;
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
     * Get true，向指定请求[发送 SIGTERM 终止信号](https://cloud.tencent.com/document/product/583/63969#.E5.8F.91.E9.80.81.E7.BB.88.E6.AD.A2.E4.BF.A1.E5.8F.B7]， ，默认值为 false。 
     * @return GraceShutdown true，向指定请求[发送 SIGTERM 终止信号](https://cloud.tencent.com/document/product/583/63969#.E5.8F.91.E9.80.81.E7.BB.88.E6.AD.A2.E4.BF.A1.E5.8F.B7]， ，默认值为 false。
     */
    public Boolean getGraceShutdown() {
        return this.GraceShutdown;
    }

    /**
     * Set true，向指定请求[发送 SIGTERM 终止信号](https://cloud.tencent.com/document/product/583/63969#.E5.8F.91.E9.80.81.E7.BB.88.E6.AD.A2.E4.BF.A1.E5.8F.B7]， ，默认值为 false。
     * @param GraceShutdown true，向指定请求[发送 SIGTERM 终止信号](https://cloud.tencent.com/document/product/583/63969#.E5.8F.91.E9.80.81.E7.BB.88.E6.AD.A2.E4.BF.A1.E5.8F.B7]， ，默认值为 false。
     */
    public void setGraceShutdown(Boolean GraceShutdown) {
        this.GraceShutdown = GraceShutdown;
    }

    public TerminateAsyncEventRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TerminateAsyncEventRequest(TerminateAsyncEventRequest source) {
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.InvokeRequestId != null) {
            this.InvokeRequestId = new String(source.InvokeRequestId);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.GraceShutdown != null) {
            this.GraceShutdown = new Boolean(source.GraceShutdown);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "InvokeRequestId", this.InvokeRequestId);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "GraceShutdown", this.GraceShutdown);

    }
}

