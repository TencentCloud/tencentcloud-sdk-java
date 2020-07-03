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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CatLog extends AbstractModel{

    /**
    * 拨测时间点
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 拨测类型
    */
    @SerializedName("CatTypeName")
    @Expose
    private String CatTypeName;

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 拨测点所在城市
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 拨测点所在运营商
    */
    @SerializedName("Isp")
    @Expose
    private String Isp;

    /**
    * 被拨测Server的IP
    */
    @SerializedName("ServerIp")
    @Expose
    private String ServerIp;

    /**
    * 被拨测Server的域名
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 执行耗时，单位毫秒
    */
    @SerializedName("TotalTime")
    @Expose
    private Long TotalTime;

    /**
    * 成功失败(1 失败，0 成功）
    */
    @SerializedName("ResultType")
    @Expose
    private Long ResultType;

    /**
    * 失败错误码
    */
    @SerializedName("ResultCode")
    @Expose
    private Long ResultCode;

    /**
    * 请求包大小
    */
    @SerializedName("ReqPkgSize")
    @Expose
    private Long ReqPkgSize;

    /**
    * 回应包大小
    */
    @SerializedName("RspPkgSize")
    @Expose
    private Long RspPkgSize;

    /**
    * 拨测请求
    */
    @SerializedName("ReqMsg")
    @Expose
    private String ReqMsg;

    /**
    * 拨测回应
    */
    @SerializedName("RespMsg")
    @Expose
    private String RespMsg;

    /**
    * 客户端IP
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * 拨测点所在城市名称
    */
    @SerializedName("CityName")
    @Expose
    private String CityName;

    /**
    * 拨测点所在运营商名称
    */
    @SerializedName("IspName")
    @Expose
    private String IspName;

    /**
    * 解析耗时，单位毫秒
    */
    @SerializedName("ParseTime")
    @Expose
    private Long ParseTime;

    /**
    * 连接耗时，单位毫秒
    */
    @SerializedName("ConnectTime")
    @Expose
    private Long ConnectTime;

    /**
    * 数据发送耗时，单位毫秒
    */
    @SerializedName("SendTime")
    @Expose
    private Long SendTime;

    /**
    * 等待耗时，单位毫秒
    */
    @SerializedName("WaitTime")
    @Expose
    private Long WaitTime;

    /**
    * 接收耗时，单位毫秒
    */
    @SerializedName("ReceiveTime")
    @Expose
    private Long ReceiveTime;

    /**
     * Get 拨测时间点 
     * @return Time 拨测时间点
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 拨测时间点
     * @param Time 拨测时间点
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 拨测类型 
     * @return CatTypeName 拨测类型
     */
    public String getCatTypeName() {
        return this.CatTypeName;
    }

    /**
     * Set 拨测类型
     * @param CatTypeName 拨测类型
     */
    public void setCatTypeName(String CatTypeName) {
        this.CatTypeName = CatTypeName;
    }

    /**
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 拨测点所在城市 
     * @return City 拨测点所在城市
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set 拨测点所在城市
     * @param City 拨测点所在城市
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get 拨测点所在运营商 
     * @return Isp 拨测点所在运营商
     */
    public String getIsp() {
        return this.Isp;
    }

    /**
     * Set 拨测点所在运营商
     * @param Isp 拨测点所在运营商
     */
    public void setIsp(String Isp) {
        this.Isp = Isp;
    }

    /**
     * Get 被拨测Server的IP 
     * @return ServerIp 被拨测Server的IP
     */
    public String getServerIp() {
        return this.ServerIp;
    }

    /**
     * Set 被拨测Server的IP
     * @param ServerIp 被拨测Server的IP
     */
    public void setServerIp(String ServerIp) {
        this.ServerIp = ServerIp;
    }

    /**
     * Get 被拨测Server的域名 
     * @return DomainName 被拨测Server的域名
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 被拨测Server的域名
     * @param DomainName 被拨测Server的域名
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get 执行耗时，单位毫秒 
     * @return TotalTime 执行耗时，单位毫秒
     */
    public Long getTotalTime() {
        return this.TotalTime;
    }

    /**
     * Set 执行耗时，单位毫秒
     * @param TotalTime 执行耗时，单位毫秒
     */
    public void setTotalTime(Long TotalTime) {
        this.TotalTime = TotalTime;
    }

    /**
     * Get 成功失败(1 失败，0 成功） 
     * @return ResultType 成功失败(1 失败，0 成功）
     */
    public Long getResultType() {
        return this.ResultType;
    }

    /**
     * Set 成功失败(1 失败，0 成功）
     * @param ResultType 成功失败(1 失败，0 成功）
     */
    public void setResultType(Long ResultType) {
        this.ResultType = ResultType;
    }

    /**
     * Get 失败错误码 
     * @return ResultCode 失败错误码
     */
    public Long getResultCode() {
        return this.ResultCode;
    }

    /**
     * Set 失败错误码
     * @param ResultCode 失败错误码
     */
    public void setResultCode(Long ResultCode) {
        this.ResultCode = ResultCode;
    }

    /**
     * Get 请求包大小 
     * @return ReqPkgSize 请求包大小
     */
    public Long getReqPkgSize() {
        return this.ReqPkgSize;
    }

    /**
     * Set 请求包大小
     * @param ReqPkgSize 请求包大小
     */
    public void setReqPkgSize(Long ReqPkgSize) {
        this.ReqPkgSize = ReqPkgSize;
    }

    /**
     * Get 回应包大小 
     * @return RspPkgSize 回应包大小
     */
    public Long getRspPkgSize() {
        return this.RspPkgSize;
    }

    /**
     * Set 回应包大小
     * @param RspPkgSize 回应包大小
     */
    public void setRspPkgSize(Long RspPkgSize) {
        this.RspPkgSize = RspPkgSize;
    }

    /**
     * Get 拨测请求 
     * @return ReqMsg 拨测请求
     */
    public String getReqMsg() {
        return this.ReqMsg;
    }

    /**
     * Set 拨测请求
     * @param ReqMsg 拨测请求
     */
    public void setReqMsg(String ReqMsg) {
        this.ReqMsg = ReqMsg;
    }

    /**
     * Get 拨测回应 
     * @return RespMsg 拨测回应
     */
    public String getRespMsg() {
        return this.RespMsg;
    }

    /**
     * Set 拨测回应
     * @param RespMsg 拨测回应
     */
    public void setRespMsg(String RespMsg) {
        this.RespMsg = RespMsg;
    }

    /**
     * Get 客户端IP 
     * @return ClientIp 客户端IP
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set 客户端IP
     * @param ClientIp 客户端IP
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    /**
     * Get 拨测点所在城市名称 
     * @return CityName 拨测点所在城市名称
     */
    public String getCityName() {
        return this.CityName;
    }

    /**
     * Set 拨测点所在城市名称
     * @param CityName 拨测点所在城市名称
     */
    public void setCityName(String CityName) {
        this.CityName = CityName;
    }

    /**
     * Get 拨测点所在运营商名称 
     * @return IspName 拨测点所在运营商名称
     */
    public String getIspName() {
        return this.IspName;
    }

    /**
     * Set 拨测点所在运营商名称
     * @param IspName 拨测点所在运营商名称
     */
    public void setIspName(String IspName) {
        this.IspName = IspName;
    }

    /**
     * Get 解析耗时，单位毫秒 
     * @return ParseTime 解析耗时，单位毫秒
     */
    public Long getParseTime() {
        return this.ParseTime;
    }

    /**
     * Set 解析耗时，单位毫秒
     * @param ParseTime 解析耗时，单位毫秒
     */
    public void setParseTime(Long ParseTime) {
        this.ParseTime = ParseTime;
    }

    /**
     * Get 连接耗时，单位毫秒 
     * @return ConnectTime 连接耗时，单位毫秒
     */
    public Long getConnectTime() {
        return this.ConnectTime;
    }

    /**
     * Set 连接耗时，单位毫秒
     * @param ConnectTime 连接耗时，单位毫秒
     */
    public void setConnectTime(Long ConnectTime) {
        this.ConnectTime = ConnectTime;
    }

    /**
     * Get 数据发送耗时，单位毫秒 
     * @return SendTime 数据发送耗时，单位毫秒
     */
    public Long getSendTime() {
        return this.SendTime;
    }

    /**
     * Set 数据发送耗时，单位毫秒
     * @param SendTime 数据发送耗时，单位毫秒
     */
    public void setSendTime(Long SendTime) {
        this.SendTime = SendTime;
    }

    /**
     * Get 等待耗时，单位毫秒 
     * @return WaitTime 等待耗时，单位毫秒
     */
    public Long getWaitTime() {
        return this.WaitTime;
    }

    /**
     * Set 等待耗时，单位毫秒
     * @param WaitTime 等待耗时，单位毫秒
     */
    public void setWaitTime(Long WaitTime) {
        this.WaitTime = WaitTime;
    }

    /**
     * Get 接收耗时，单位毫秒 
     * @return ReceiveTime 接收耗时，单位毫秒
     */
    public Long getReceiveTime() {
        return this.ReceiveTime;
    }

    /**
     * Set 接收耗时，单位毫秒
     * @param ReceiveTime 接收耗时，单位毫秒
     */
    public void setReceiveTime(Long ReceiveTime) {
        this.ReceiveTime = ReceiveTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "CatTypeName", this.CatTypeName);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "Isp", this.Isp);
        this.setParamSimple(map, prefix + "ServerIp", this.ServerIp);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "TotalTime", this.TotalTime);
        this.setParamSimple(map, prefix + "ResultType", this.ResultType);
        this.setParamSimple(map, prefix + "ResultCode", this.ResultCode);
        this.setParamSimple(map, prefix + "ReqPkgSize", this.ReqPkgSize);
        this.setParamSimple(map, prefix + "RspPkgSize", this.RspPkgSize);
        this.setParamSimple(map, prefix + "ReqMsg", this.ReqMsg);
        this.setParamSimple(map, prefix + "RespMsg", this.RespMsg);
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "CityName", this.CityName);
        this.setParamSimple(map, prefix + "IspName", this.IspName);
        this.setParamSimple(map, prefix + "ParseTime", this.ParseTime);
        this.setParamSimple(map, prefix + "ConnectTime", this.ConnectTime);
        this.setParamSimple(map, prefix + "SendTime", this.SendTime);
        this.setParamSimple(map, prefix + "WaitTime", this.WaitTime);
        this.setParamSimple(map, prefix + "ReceiveTime", this.ReceiveTime);

    }
}

