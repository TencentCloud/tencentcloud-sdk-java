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
package com.tencentcloudapi.cws.v20180312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Monitor  extends AbstractModel{

    /**
    * 云用户appid。
    */
    @SerializedName("Appid")
    @Expose
    private Integer Appid;

    /**
    * 监控任务ID。
    */
    @SerializedName("Id")
    @Expose
    private Integer Id;

    /**
    * 监控名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 监测状态：1-监测中；2-暂停监测。
    */
    @SerializedName("MonitorStatus")
    @Expose
    private Integer MonitorStatus;

    /**
    * 监测模式，normal-正常扫描；deep-深度扫描。
    */
    @SerializedName("ScannerType")
    @Expose
    private String ScannerType;

    /**
    * 扫描周期，单位小时，每X小时执行一次。
    */
    @SerializedName("Crontab")
    @Expose
    private Integer Crontab;

    /**
    * 指定扫描类型，3位数每位依次表示：扫描Web漏洞、扫描系统漏洞、扫描系统端口。
    */
    @SerializedName("IncludedVulsTypes")
    @Expose
    private String IncludedVulsTypes;

    /**
    * 速率限制，每秒发送X个HTTP请求。
    */
    @SerializedName("RateLimit")
    @Expose
    private Integer RateLimit;

    /**
    * 首次扫描开始时间。
    */
    @SerializedName("FirstScanStartTime")
    @Expose
    private String FirstScanStartTime;

    /**
    * 扫描状态：0-待扫描（无任何扫描结果）；1-扫描中（正在进行扫描）；2-已扫描（有扫描结果且不正在扫描）；3-扫描完成待同步结果。
    */
    @SerializedName("ScanStatus")
    @Expose
    private Integer ScanStatus;

    /**
    * 上一次扫描完成时间。
    */
    @SerializedName("LastScanFinishTime")
    @Expose
    private String LastScanFinishTime;

    /**
    * 当前扫描开始时间，如扫描完成则为上一次扫描的开始时间。
    */
    @SerializedName("CurrentScanStartTime")
    @Expose
    private String CurrentScanStartTime;

    /**
    * CreatedAt。
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * UpdatedAt。
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
     * 获取云用户appid。
     * @return Appid 云用户appid。
     */
    public Integer getAppid() {
        return this.Appid;
    }

    /**
     * 设置云用户appid。
     * @param Appid 云用户appid。
     */
    public void setAppid(Integer Appid) {
        this.Appid = Appid;
    }

    /**
     * 获取监控任务ID。
     * @return Id 监控任务ID。
     */
    public Integer getId() {
        return this.Id;
    }

    /**
     * 设置监控任务ID。
     * @param Id 监控任务ID。
     */
    public void setId(Integer Id) {
        this.Id = Id;
    }

    /**
     * 获取监控名称。
     * @return Name 监控名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置监控名称。
     * @param Name 监控名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取监测状态：1-监测中；2-暂停监测。
     * @return MonitorStatus 监测状态：1-监测中；2-暂停监测。
     */
    public Integer getMonitorStatus() {
        return this.MonitorStatus;
    }

    /**
     * 设置监测状态：1-监测中；2-暂停监测。
     * @param MonitorStatus 监测状态：1-监测中；2-暂停监测。
     */
    public void setMonitorStatus(Integer MonitorStatus) {
        this.MonitorStatus = MonitorStatus;
    }

    /**
     * 获取监测模式，normal-正常扫描；deep-深度扫描。
     * @return ScannerType 监测模式，normal-正常扫描；deep-深度扫描。
     */
    public String getScannerType() {
        return this.ScannerType;
    }

    /**
     * 设置监测模式，normal-正常扫描；deep-深度扫描。
     * @param ScannerType 监测模式，normal-正常扫描；deep-深度扫描。
     */
    public void setScannerType(String ScannerType) {
        this.ScannerType = ScannerType;
    }

    /**
     * 获取扫描周期，单位小时，每X小时执行一次。
     * @return Crontab 扫描周期，单位小时，每X小时执行一次。
     */
    public Integer getCrontab() {
        return this.Crontab;
    }

    /**
     * 设置扫描周期，单位小时，每X小时执行一次。
     * @param Crontab 扫描周期，单位小时，每X小时执行一次。
     */
    public void setCrontab(Integer Crontab) {
        this.Crontab = Crontab;
    }

    /**
     * 获取指定扫描类型，3位数每位依次表示：扫描Web漏洞、扫描系统漏洞、扫描系统端口。
     * @return IncludedVulsTypes 指定扫描类型，3位数每位依次表示：扫描Web漏洞、扫描系统漏洞、扫描系统端口。
     */
    public String getIncludedVulsTypes() {
        return this.IncludedVulsTypes;
    }

    /**
     * 设置指定扫描类型，3位数每位依次表示：扫描Web漏洞、扫描系统漏洞、扫描系统端口。
     * @param IncludedVulsTypes 指定扫描类型，3位数每位依次表示：扫描Web漏洞、扫描系统漏洞、扫描系统端口。
     */
    public void setIncludedVulsTypes(String IncludedVulsTypes) {
        this.IncludedVulsTypes = IncludedVulsTypes;
    }

    /**
     * 获取速率限制，每秒发送X个HTTP请求。
     * @return RateLimit 速率限制，每秒发送X个HTTP请求。
     */
    public Integer getRateLimit() {
        return this.RateLimit;
    }

    /**
     * 设置速率限制，每秒发送X个HTTP请求。
     * @param RateLimit 速率限制，每秒发送X个HTTP请求。
     */
    public void setRateLimit(Integer RateLimit) {
        this.RateLimit = RateLimit;
    }

    /**
     * 获取首次扫描开始时间。
     * @return FirstScanStartTime 首次扫描开始时间。
     */
    public String getFirstScanStartTime() {
        return this.FirstScanStartTime;
    }

    /**
     * 设置首次扫描开始时间。
     * @param FirstScanStartTime 首次扫描开始时间。
     */
    public void setFirstScanStartTime(String FirstScanStartTime) {
        this.FirstScanStartTime = FirstScanStartTime;
    }

    /**
     * 获取扫描状态：0-待扫描（无任何扫描结果）；1-扫描中（正在进行扫描）；2-已扫描（有扫描结果且不正在扫描）；3-扫描完成待同步结果。
     * @return ScanStatus 扫描状态：0-待扫描（无任何扫描结果）；1-扫描中（正在进行扫描）；2-已扫描（有扫描结果且不正在扫描）；3-扫描完成待同步结果。
     */
    public Integer getScanStatus() {
        return this.ScanStatus;
    }

    /**
     * 设置扫描状态：0-待扫描（无任何扫描结果）；1-扫描中（正在进行扫描）；2-已扫描（有扫描结果且不正在扫描）；3-扫描完成待同步结果。
     * @param ScanStatus 扫描状态：0-待扫描（无任何扫描结果）；1-扫描中（正在进行扫描）；2-已扫描（有扫描结果且不正在扫描）；3-扫描完成待同步结果。
     */
    public void setScanStatus(Integer ScanStatus) {
        this.ScanStatus = ScanStatus;
    }

    /**
     * 获取上一次扫描完成时间。
     * @return LastScanFinishTime 上一次扫描完成时间。
     */
    public String getLastScanFinishTime() {
        return this.LastScanFinishTime;
    }

    /**
     * 设置上一次扫描完成时间。
     * @param LastScanFinishTime 上一次扫描完成时间。
     */
    public void setLastScanFinishTime(String LastScanFinishTime) {
        this.LastScanFinishTime = LastScanFinishTime;
    }

    /**
     * 获取当前扫描开始时间，如扫描完成则为上一次扫描的开始时间。
     * @return CurrentScanStartTime 当前扫描开始时间，如扫描完成则为上一次扫描的开始时间。
     */
    public String getCurrentScanStartTime() {
        return this.CurrentScanStartTime;
    }

    /**
     * 设置当前扫描开始时间，如扫描完成则为上一次扫描的开始时间。
     * @param CurrentScanStartTime 当前扫描开始时间，如扫描完成则为上一次扫描的开始时间。
     */
    public void setCurrentScanStartTime(String CurrentScanStartTime) {
        this.CurrentScanStartTime = CurrentScanStartTime;
    }

    /**
     * 获取CreatedAt。
     * @return CreatedAt CreatedAt。
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * 设置CreatedAt。
     * @param CreatedAt CreatedAt。
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * 获取UpdatedAt。
     * @return UpdatedAt UpdatedAt。
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * 设置UpdatedAt。
     * @param UpdatedAt UpdatedAt。
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Appid", this.Appid);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "MonitorStatus", this.MonitorStatus);
        this.setParamSimple(map, prefix + "ScannerType", this.ScannerType);
        this.setParamSimple(map, prefix + "Crontab", this.Crontab);
        this.setParamSimple(map, prefix + "IncludedVulsTypes", this.IncludedVulsTypes);
        this.setParamSimple(map, prefix + "RateLimit", this.RateLimit);
        this.setParamSimple(map, prefix + "FirstScanStartTime", this.FirstScanStartTime);
        this.setParamSimple(map, prefix + "ScanStatus", this.ScanStatus);
        this.setParamSimple(map, prefix + "LastScanFinishTime", this.LastScanFinishTime);
        this.setParamSimple(map, prefix + "CurrentScanStartTime", this.CurrentScanStartTime);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);

    }
}

