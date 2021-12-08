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

public class AsyncEventStatus extends AbstractModel{

    /**
    * 异步事件状态，RUNNING 表示运行中, FINISHED 表示调用成功, ABORTED 表示调用终止, FAILED 表示调用失败。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 请求状态码
    */
    @SerializedName("StatusCode")
    @Expose
    private Long StatusCode;

    /**
    * 异步执行请求 Id
    */
    @SerializedName("InvokeRequestId")
    @Expose
    private String InvokeRequestId;

    /**
     * Get 异步事件状态，RUNNING 表示运行中, FINISHED 表示调用成功, ABORTED 表示调用终止, FAILED 表示调用失败。 
     * @return Status 异步事件状态，RUNNING 表示运行中, FINISHED 表示调用成功, ABORTED 表示调用终止, FAILED 表示调用失败。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 异步事件状态，RUNNING 表示运行中, FINISHED 表示调用成功, ABORTED 表示调用终止, FAILED 表示调用失败。
     * @param Status 异步事件状态，RUNNING 表示运行中, FINISHED 表示调用成功, ABORTED 表示调用终止, FAILED 表示调用失败。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 请求状态码 
     * @return StatusCode 请求状态码
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set 请求状态码
     * @param StatusCode 请求状态码
     */
    public void setStatusCode(Long StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get 异步执行请求 Id 
     * @return InvokeRequestId 异步执行请求 Id
     */
    public String getInvokeRequestId() {
        return this.InvokeRequestId;
    }

    /**
     * Set 异步执行请求 Id
     * @param InvokeRequestId 异步执行请求 Id
     */
    public void setInvokeRequestId(String InvokeRequestId) {
        this.InvokeRequestId = InvokeRequestId;
    }

    public AsyncEventStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AsyncEventStatus(AsyncEventStatus source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StatusCode != null) {
            this.StatusCode = new Long(source.StatusCode);
        }
        if (source.InvokeRequestId != null) {
            this.InvokeRequestId = new String(source.InvokeRequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "InvokeRequestId", this.InvokeRequestId);

    }
}

