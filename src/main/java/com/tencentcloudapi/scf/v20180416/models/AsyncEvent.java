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

public class AsyncEvent extends AbstractModel{

    /**
    * 调用请求id
    */
    @SerializedName("InvokeRequestId")
    @Expose
    private String InvokeRequestId;

    /**
    * 调用类型
    */
    @SerializedName("InvokeType")
    @Expose
    private String InvokeType;

    /**
    * 函数版本
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
    * 事件状态，RUNNING 表示运行中, FINISHED 表示调用成功, ABORTED 表示调用终止, FAILED 表示调用失败
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 调用开始时间，格式: "%Y-%m-%d %H:%M:%S.%f"
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 调用结束时间，格式: "%Y-%m-%d %H:%M:%S.%f"
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 调用请求id 
     * @return InvokeRequestId 调用请求id
     */
    public String getInvokeRequestId() {
        return this.InvokeRequestId;
    }

    /**
     * Set 调用请求id
     * @param InvokeRequestId 调用请求id
     */
    public void setInvokeRequestId(String InvokeRequestId) {
        this.InvokeRequestId = InvokeRequestId;
    }

    /**
     * Get 调用类型 
     * @return InvokeType 调用类型
     */
    public String getInvokeType() {
        return this.InvokeType;
    }

    /**
     * Set 调用类型
     * @param InvokeType 调用类型
     */
    public void setInvokeType(String InvokeType) {
        this.InvokeType = InvokeType;
    }

    /**
     * Get 函数版本 
     * @return Qualifier 函数版本
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set 函数版本
     * @param Qualifier 函数版本
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    /**
     * Get 事件状态，RUNNING 表示运行中, FINISHED 表示调用成功, ABORTED 表示调用终止, FAILED 表示调用失败 
     * @return Status 事件状态，RUNNING 表示运行中, FINISHED 表示调用成功, ABORTED 表示调用终止, FAILED 表示调用失败
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 事件状态，RUNNING 表示运行中, FINISHED 表示调用成功, ABORTED 表示调用终止, FAILED 表示调用失败
     * @param Status 事件状态，RUNNING 表示运行中, FINISHED 表示调用成功, ABORTED 表示调用终止, FAILED 表示调用失败
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 调用开始时间，格式: "%Y-%m-%d %H:%M:%S.%f" 
     * @return StartTime 调用开始时间，格式: "%Y-%m-%d %H:%M:%S.%f"
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 调用开始时间，格式: "%Y-%m-%d %H:%M:%S.%f"
     * @param StartTime 调用开始时间，格式: "%Y-%m-%d %H:%M:%S.%f"
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 调用结束时间，格式: "%Y-%m-%d %H:%M:%S.%f" 
     * @return EndTime 调用结束时间，格式: "%Y-%m-%d %H:%M:%S.%f"
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 调用结束时间，格式: "%Y-%m-%d %H:%M:%S.%f"
     * @param EndTime 调用结束时间，格式: "%Y-%m-%d %H:%M:%S.%f"
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public AsyncEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AsyncEvent(AsyncEvent source) {
        if (source.InvokeRequestId != null) {
            this.InvokeRequestId = new String(source.InvokeRequestId);
        }
        if (source.InvokeType != null) {
            this.InvokeType = new String(source.InvokeType);
        }
        if (source.Qualifier != null) {
            this.Qualifier = new String(source.Qualifier);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InvokeRequestId", this.InvokeRequestId);
        this.setParamSimple(map, prefix + "InvokeType", this.InvokeType);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

