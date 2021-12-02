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

public class RequestStatus extends AbstractModel{

    /**
    * 函数的名称
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * 函数执行完成后的返回值
    */
    @SerializedName("RetMsg")
    @Expose
    private String RetMsg;

    /**
    * 查询的请求 id
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
    * 请求开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 请求执行结果， 0 表示执行成功，1表示运行中，-1 表示执行异常。
    */
    @SerializedName("RetCode")
    @Expose
    private Long RetCode;

    /**
    * 请求运行耗时，单位：ms
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * 请求消耗内存，单位为 MB
    */
    @SerializedName("MemUsage")
    @Expose
    private Float MemUsage;

    /**
    * 重试次数
    */
    @SerializedName("RetryNum")
    @Expose
    private Long RetryNum;

    /**
     * Get 函数的名称 
     * @return FunctionName 函数的名称
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set 函数的名称
     * @param FunctionName 函数的名称
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get 函数执行完成后的返回值 
     * @return RetMsg 函数执行完成后的返回值
     */
    public String getRetMsg() {
        return this.RetMsg;
    }

    /**
     * Set 函数执行完成后的返回值
     * @param RetMsg 函数执行完成后的返回值
     */
    public void setRetMsg(String RetMsg) {
        this.RetMsg = RetMsg;
    }

    /**
     * Get 查询的请求 id 
     * @return RequestId 查询的请求 id
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 查询的请求 id
     * @param RequestId 查询的请求 id
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Get 请求开始时间 
     * @return StartTime 请求开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 请求开始时间
     * @param StartTime 请求开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 请求执行结果， 0 表示执行成功，1表示运行中，-1 表示执行异常。 
     * @return RetCode 请求执行结果， 0 表示执行成功，1表示运行中，-1 表示执行异常。
     */
    public Long getRetCode() {
        return this.RetCode;
    }

    /**
     * Set 请求执行结果， 0 表示执行成功，1表示运行中，-1 表示执行异常。
     * @param RetCode 请求执行结果， 0 表示执行成功，1表示运行中，-1 表示执行异常。
     */
    public void setRetCode(Long RetCode) {
        this.RetCode = RetCode;
    }

    /**
     * Get 请求运行耗时，单位：ms 
     * @return Duration 请求运行耗时，单位：ms
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set 请求运行耗时，单位：ms
     * @param Duration 请求运行耗时，单位：ms
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 请求消耗内存，单位为 MB 
     * @return MemUsage 请求消耗内存，单位为 MB
     */
    public Float getMemUsage() {
        return this.MemUsage;
    }

    /**
     * Set 请求消耗内存，单位为 MB
     * @param MemUsage 请求消耗内存，单位为 MB
     */
    public void setMemUsage(Float MemUsage) {
        this.MemUsage = MemUsage;
    }

    /**
     * Get 重试次数 
     * @return RetryNum 重试次数
     */
    public Long getRetryNum() {
        return this.RetryNum;
    }

    /**
     * Set 重试次数
     * @param RetryNum 重试次数
     */
    public void setRetryNum(Long RetryNum) {
        this.RetryNum = RetryNum;
    }

    public RequestStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RequestStatus(RequestStatus source) {
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.RetMsg != null) {
            this.RetMsg = new String(source.RetMsg);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.RetCode != null) {
            this.RetCode = new Long(source.RetCode);
        }
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
        if (source.MemUsage != null) {
            this.MemUsage = new Float(source.MemUsage);
        }
        if (source.RetryNum != null) {
            this.RetryNum = new Long(source.RetryNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "RetMsg", this.RetMsg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "RetCode", this.RetCode);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "MemUsage", this.MemUsage);
        this.setParamSimple(map, prefix + "RetryNum", this.RetryNum);

    }
}

