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

public class FunctionLog  extends AbstractModel{

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
    private Integer RetCode;

    /**
    * 函数调用是否结束，如果是 1 表示执行结束，其他值表示调用异常
    */
    @SerializedName("InvokeFinished")
    @Expose
    private Integer InvokeFinished;

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
    private Integer BillDuration;

    /**
    * 函数执行时消耗实际内存大小，单位为 Byte
    */
    @SerializedName("MemUsage")
    @Expose
    private Integer MemUsage;

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
     * 获取函数的名称
     * @return FunctionName 函数的名称
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * 设置函数的名称
     * @param FunctionName 函数的名称
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * 获取函数执行完成后的返回值
     * @return RetMsg 函数执行完成后的返回值
     */
    public String getRetMsg() {
        return this.RetMsg;
    }

    /**
     * 设置函数执行完成后的返回值
     * @param RetMsg 函数执行完成后的返回值
     */
    public void setRetMsg(String RetMsg) {
        this.RetMsg = RetMsg;
    }

    /**
     * 获取执行该函数对应的requestId
     * @return RequestId 执行该函数对应的requestId
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置执行该函数对应的requestId
     * @param RequestId 执行该函数对应的requestId
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 获取函数开始执行时的时间点
     * @return StartTime 函数开始执行时的时间点
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置函数开始执行时的时间点
     * @param StartTime 函数开始执行时的时间点
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取函数执行结果，如果是 0 表示执行成功，其他值表示失败
     * @return RetCode 函数执行结果，如果是 0 表示执行成功，其他值表示失败
     */
    public Integer getRetCode() {
        return this.RetCode;
    }

    /**
     * 设置函数执行结果，如果是 0 表示执行成功，其他值表示失败
     * @param RetCode 函数执行结果，如果是 0 表示执行成功，其他值表示失败
     */
    public void setRetCode(Integer RetCode) {
        this.RetCode = RetCode;
    }

    /**
     * 获取函数调用是否结束，如果是 1 表示执行结束，其他值表示调用异常
     * @return InvokeFinished 函数调用是否结束，如果是 1 表示执行结束，其他值表示调用异常
     */
    public Integer getInvokeFinished() {
        return this.InvokeFinished;
    }

    /**
     * 设置函数调用是否结束，如果是 1 表示执行结束，其他值表示调用异常
     * @param InvokeFinished 函数调用是否结束，如果是 1 表示执行结束，其他值表示调用异常
     */
    public void setInvokeFinished(Integer InvokeFinished) {
        this.InvokeFinished = InvokeFinished;
    }

    /**
     * 获取函数执行耗时，单位为 ms
     * @return Duration 函数执行耗时，单位为 ms
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * 设置函数执行耗时，单位为 ms
     * @param Duration 函数执行耗时，单位为 ms
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * 获取函数计费时间，根据 duration 向上取最近的 100ms，单位为ms
     * @return BillDuration 函数计费时间，根据 duration 向上取最近的 100ms，单位为ms
     */
    public Integer getBillDuration() {
        return this.BillDuration;
    }

    /**
     * 设置函数计费时间，根据 duration 向上取最近的 100ms，单位为ms
     * @param BillDuration 函数计费时间，根据 duration 向上取最近的 100ms，单位为ms
     */
    public void setBillDuration(Integer BillDuration) {
        this.BillDuration = BillDuration;
    }

    /**
     * 获取函数执行时消耗实际内存大小，单位为 Byte
     * @return MemUsage 函数执行时消耗实际内存大小，单位为 Byte
     */
    public Integer getMemUsage() {
        return this.MemUsage;
    }

    /**
     * 设置函数执行时消耗实际内存大小，单位为 Byte
     * @param MemUsage 函数执行时消耗实际内存大小，单位为 Byte
     */
    public void setMemUsage(Integer MemUsage) {
        this.MemUsage = MemUsage;
    }

    /**
     * 获取函数执行过程中的日志输出
     * @return Log 函数执行过程中的日志输出
     */
    public String getLog() {
        return this.Log;
    }

    /**
     * 设置函数执行过程中的日志输出
     * @param Log 函数执行过程中的日志输出
     */
    public void setLog(String Log) {
        this.Log = Log;
    }

    /**
     * 获取日志等级
     * @return Level 日志等级
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * 设置日志等级
     * @param Level 日志等级
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * 获取日志来源
     * @return Source 日志来源
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * 设置日志来源
     * @param Source 日志来源
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * 内部实现，用户禁止调用
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

    }
}

