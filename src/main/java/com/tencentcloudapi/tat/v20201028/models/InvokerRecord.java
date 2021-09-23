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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InvokerRecord extends AbstractModel{

    /**
    * 执行器ID。
    */
    @SerializedName("InvokerId")
    @Expose
    private String InvokerId;

    /**
    * 执行时间。
    */
    @SerializedName("InvokeTime")
    @Expose
    private String InvokeTime;

    /**
    * 执行原因。
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 命令执行ID。
    */
    @SerializedName("InvocationId")
    @Expose
    private String InvocationId;

    /**
    * 触发结果。
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
     * Get 执行器ID。 
     * @return InvokerId 执行器ID。
     */
    public String getInvokerId() {
        return this.InvokerId;
    }

    /**
     * Set 执行器ID。
     * @param InvokerId 执行器ID。
     */
    public void setInvokerId(String InvokerId) {
        this.InvokerId = InvokerId;
    }

    /**
     * Get 执行时间。 
     * @return InvokeTime 执行时间。
     */
    public String getInvokeTime() {
        return this.InvokeTime;
    }

    /**
     * Set 执行时间。
     * @param InvokeTime 执行时间。
     */
    public void setInvokeTime(String InvokeTime) {
        this.InvokeTime = InvokeTime;
    }

    /**
     * Get 执行原因。 
     * @return Reason 执行原因。
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 执行原因。
     * @param Reason 执行原因。
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 命令执行ID。 
     * @return InvocationId 命令执行ID。
     */
    public String getInvocationId() {
        return this.InvocationId;
    }

    /**
     * Set 命令执行ID。
     * @param InvocationId 命令执行ID。
     */
    public void setInvocationId(String InvocationId) {
        this.InvocationId = InvocationId;
    }

    /**
     * Get 触发结果。 
     * @return Result 触发结果。
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 触发结果。
     * @param Result 触发结果。
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    public InvokerRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InvokerRecord(InvokerRecord source) {
        if (source.InvokerId != null) {
            this.InvokerId = new String(source.InvokerId);
        }
        if (source.InvokeTime != null) {
            this.InvokeTime = new String(source.InvokeTime);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.InvocationId != null) {
            this.InvocationId = new String(source.InvocationId);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InvokerId", this.InvokerId);
        this.setParamSimple(map, prefix + "InvokeTime", this.InvokeTime);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "InvocationId", this.InvocationId);
        this.setParamSimple(map, prefix + "Result", this.Result);

    }
}

