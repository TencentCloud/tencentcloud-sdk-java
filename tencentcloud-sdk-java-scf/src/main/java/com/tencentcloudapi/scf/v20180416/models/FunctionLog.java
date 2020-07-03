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

public class FunctionLog extends AbstractModel{

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
    * 执行该函数对应的requestId
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
    * 函数开始执行时的时间点
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 函数执行结果，如果是 0 表示执行成功，其他值表示失败
    */
    @SerializedName("RetCode")
    @Expose
    private Long RetCode;

    /**
    * 函数调用是否结束，如果是 1 表示执行结束，其他值表示调用异常
    */
    @SerializedName("InvokeFinished")
    @Expose
    private Long InvokeFinished;

    /**
    * 函数执行耗时，单位为 ms
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * 函数计费时间，根据 duration 向上取最近的 100ms，单位为ms
    */
    @SerializedName("BillDuration")
    @Expose
    private Long BillDuration;

    /**
    * 函数执行时消耗实际内存大小，单位为 Byte
    */
    @SerializedName("MemUsage")
    @Expose
    private Long MemUsage;

    /**
    * 函数执行过程中的日志输出
    */
    @SerializedName("Log")
    @Expose
    private String Log;

    /**
    * 日志等级
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 日志来源
    */
    @SerializedName("Source")
    @Expose
    private String Source;

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
     * Get 执行该函数对应的requestId 
     * @return RequestId 执行该函数对应的requestId
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 执行该函数对应的requestId
     * @param RequestId 执行该函数对应的requestId
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Get 函数开始执行时的时间点 
     * @return StartTime 函数开始执行时的时间点
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 函数开始执行时的时间点
     * @param StartTime 函数开始执行时的时间点
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 函数执行结果，如果是 0 表示执行成功，其他值表示失败 
     * @return RetCode 函数执行结果，如果是 0 表示执行成功，其他值表示失败
     */
    public Long getRetCode() {
        return this.RetCode;
    }

    /**
     * Set 函数执行结果，如果是 0 表示执行成功，其他值表示失败
     * @param RetCode 函数执行结果，如果是 0 表示执行成功，其他值表示失败
     */
    public void setRetCode(Long RetCode) {
        this.RetCode = RetCode;
    }

    /**
     * Get 函数调用是否结束，如果是 1 表示执行结束，其他值表示调用异常 
     * @return InvokeFinished 函数调用是否结束，如果是 1 表示执行结束，其他值表示调用异常
     */
    public Long getInvokeFinished() {
        return this.InvokeFinished;
    }

    /**
     * Set 函数调用是否结束，如果是 1 表示执行结束，其他值表示调用异常
     * @param InvokeFinished 函数调用是否结束，如果是 1 表示执行结束，其他值表示调用异常
     */
    public void setInvokeFinished(Long InvokeFinished) {
        this.InvokeFinished = InvokeFinished;
    }

    /**
     * Get 函数执行耗时，单位为 ms 
     * @return Duration 函数执行耗时，单位为 ms
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set 函数执行耗时，单位为 ms
     * @param Duration 函数执行耗时，单位为 ms
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 函数计费时间，根据 duration 向上取最近的 100ms，单位为ms 
     * @return BillDuration 函数计费时间，根据 duration 向上取最近的 100ms，单位为ms
     */
    public Long getBillDuration() {
        return this.BillDuration;
    }

    /**
     * Set 函数计费时间，根据 duration 向上取最近的 100ms，单位为ms
     * @param BillDuration 函数计费时间，根据 duration 向上取最近的 100ms，单位为ms
     */
    public void setBillDuration(Long BillDuration) {
        this.BillDuration = BillDuration;
    }

    /**
     * Get 函数执行时消耗实际内存大小，单位为 Byte 
     * @return MemUsage 函数执行时消耗实际内存大小，单位为 Byte
     */
    public Long getMemUsage() {
        return this.MemUsage;
    }

    /**
     * Set 函数执行时消耗实际内存大小，单位为 Byte
     * @param MemUsage 函数执行时消耗实际内存大小，单位为 Byte
     */
    public void setMemUsage(Long MemUsage) {
        this.MemUsage = MemUsage;
    }

    /**
     * Get 函数执行过程中的日志输出 
     * @return Log 函数执行过程中的日志输出
     */
    public String getLog() {
        return this.Log;
    }

    /**
     * Set 函数执行过程中的日志输出
     * @param Log 函数执行过程中的日志输出
     */
    public void setLog(String Log) {
        this.Log = Log;
    }

    /**
     * Get 日志等级 
     * @return Level 日志等级
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 日志等级
     * @param Level 日志等级
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 日志来源 
     * @return Source 日志来源
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 日志来源
     * @param Source 日志来源
     */
    public void setSource(String Source) {
        this.Source = Source;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "RetMsg", this.RetMsg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "RetCode", this.RetCode);
        this.setParamSimple(map, prefix + "InvokeFinished", this.InvokeFinished);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "BillDuration", this.BillDuration);
        this.setParamSimple(map, prefix + "MemUsage", this.MemUsage);
        this.setParamSimple(map, prefix + "Log", this.Log);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "RetryNum", this.RetryNum);

    }
}

