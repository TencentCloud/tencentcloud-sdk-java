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

public class Monitor extends AbstractModel{

    /**
    * 监控任务ID。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

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
    private Long MonitorStatus;

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
    private Long Crontab;

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
    private Long RateLimit;

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
    private Long ScanStatus;

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
    * 云用户appid。
    */
    @SerializedName("Appid")
    @Expose
    private Long Appid;

    /**
    * 扫描状态：0-待检测；1-检测完成
    */
    @SerializedName("ContentScanStatus")
    @Expose
    private Long ContentScanStatus;

    /**
     * Get 监控任务ID。 
     * @return Id 监控任务ID。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 监控任务ID。
     * @param Id 监控任务ID。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 监控名称。 
     * @return Name 监控名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 监控名称。
     * @param Name 监控名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 监测状态：1-监测中；2-暂停监测。 
     * @return MonitorStatus 监测状态：1-监测中；2-暂停监测。
     */
    public Long getMonitorStatus() {
        return this.MonitorStatus;
    }

    /**
     * Set 监测状态：1-监测中；2-暂停监测。
     * @param MonitorStatus 监测状态：1-监测中；2-暂停监测。
     */
    public void setMonitorStatus(Long MonitorStatus) {
        this.MonitorStatus = MonitorStatus;
    }

    /**
     * Get 监测模式，normal-正常扫描；deep-深度扫描。 
     * @return ScannerType 监测模式，normal-正常扫描；deep-深度扫描。
     */
    public String getScannerType() {
        return this.ScannerType;
    }

    /**
     * Set 监测模式，normal-正常扫描；deep-深度扫描。
     * @param ScannerType 监测模式，normal-正常扫描；deep-深度扫描。
     */
    public void setScannerType(String ScannerType) {
        this.ScannerType = ScannerType;
    }

    /**
     * Get 扫描周期，单位小时，每X小时执行一次。 
     * @return Crontab 扫描周期，单位小时，每X小时执行一次。
     */
    public Long getCrontab() {
        return this.Crontab;
    }

    /**
     * Set 扫描周期，单位小时，每X小时执行一次。
     * @param Crontab 扫描周期，单位小时，每X小时执行一次。
     */
    public void setCrontab(Long Crontab) {
        this.Crontab = Crontab;
    }

    /**
     * Get 指定扫描类型，3位数每位依次表示：扫描Web漏洞、扫描系统漏洞、扫描系统端口。 
     * @return IncludedVulsTypes 指定扫描类型，3位数每位依次表示：扫描Web漏洞、扫描系统漏洞、扫描系统端口。
     */
    public String getIncludedVulsTypes() {
        return this.IncludedVulsTypes;
    }

    /**
     * Set 指定扫描类型，3位数每位依次表示：扫描Web漏洞、扫描系统漏洞、扫描系统端口。
     * @param IncludedVulsTypes 指定扫描类型，3位数每位依次表示：扫描Web漏洞、扫描系统漏洞、扫描系统端口。
     */
    public void setIncludedVulsTypes(String IncludedVulsTypes) {
        this.IncludedVulsTypes = IncludedVulsTypes;
    }

    /**
     * Get 速率限制，每秒发送X个HTTP请求。 
     * @return RateLimit 速率限制，每秒发送X个HTTP请求。
     */
    public Long getRateLimit() {
        return this.RateLimit;
    }

    /**
     * Set 速率限制，每秒发送X个HTTP请求。
     * @param RateLimit 速率限制，每秒发送X个HTTP请求。
     */
    public void setRateLimit(Long RateLimit) {
        this.RateLimit = RateLimit;
    }

    /**
     * Get 首次扫描开始时间。 
     * @return FirstScanStartTime 首次扫描开始时间。
     */
    public String getFirstScanStartTime() {
        return this.FirstScanStartTime;
    }

    /**
     * Set 首次扫描开始时间。
     * @param FirstScanStartTime 首次扫描开始时间。
     */
    public void setFirstScanStartTime(String FirstScanStartTime) {
        this.FirstScanStartTime = FirstScanStartTime;
    }

    /**
     * Get 扫描状态：0-待扫描（无任何扫描结果）；1-扫描中（正在进行扫描）；2-已扫描（有扫描结果且不正在扫描）；3-扫描完成待同步结果。 
     * @return ScanStatus 扫描状态：0-待扫描（无任何扫描结果）；1-扫描中（正在进行扫描）；2-已扫描（有扫描结果且不正在扫描）；3-扫描完成待同步结果。
     */
    public Long getScanStatus() {
        return this.ScanStatus;
    }

    /**
     * Set 扫描状态：0-待扫描（无任何扫描结果）；1-扫描中（正在进行扫描）；2-已扫描（有扫描结果且不正在扫描）；3-扫描完成待同步结果。
     * @param ScanStatus 扫描状态：0-待扫描（无任何扫描结果）；1-扫描中（正在进行扫描）；2-已扫描（有扫描结果且不正在扫描）；3-扫描完成待同步结果。
     */
    public void setScanStatus(Long ScanStatus) {
        this.ScanStatus = ScanStatus;
    }

    /**
     * Get 上一次扫描完成时间。 
     * @return LastScanFinishTime 上一次扫描完成时间。
     */
    public String getLastScanFinishTime() {
        return this.LastScanFinishTime;
    }

    /**
     * Set 上一次扫描完成时间。
     * @param LastScanFinishTime 上一次扫描完成时间。
     */
    public void setLastScanFinishTime(String LastScanFinishTime) {
        this.LastScanFinishTime = LastScanFinishTime;
    }

    /**
     * Get 当前扫描开始时间，如扫描完成则为上一次扫描的开始时间。 
     * @return CurrentScanStartTime 当前扫描开始时间，如扫描完成则为上一次扫描的开始时间。
     */
    public String getCurrentScanStartTime() {
        return this.CurrentScanStartTime;
    }

    /**
     * Set 当前扫描开始时间，如扫描完成则为上一次扫描的开始时间。
     * @param CurrentScanStartTime 当前扫描开始时间，如扫描完成则为上一次扫描的开始时间。
     */
    public void setCurrentScanStartTime(String CurrentScanStartTime) {
        this.CurrentScanStartTime = CurrentScanStartTime;
    }

    /**
     * Get CreatedAt。 
     * @return CreatedAt CreatedAt。
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set CreatedAt。
     * @param CreatedAt CreatedAt。
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get UpdatedAt。 
     * @return UpdatedAt UpdatedAt。
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set UpdatedAt。
     * @param UpdatedAt UpdatedAt。
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get 云用户appid。 
     * @return Appid 云用户appid。
     */
    public Long getAppid() {
        return this.Appid;
    }

    /**
     * Set 云用户appid。
     * @param Appid 云用户appid。
     */
    public void setAppid(Long Appid) {
        this.Appid = Appid;
    }

    /**
     * Get 扫描状态：0-待检测；1-检测完成 
     * @return ContentScanStatus 扫描状态：0-待检测；1-检测完成
     */
    public Long getContentScanStatus() {
        return this.ContentScanStatus;
    }

    /**
     * Set 扫描状态：0-待检测；1-检测完成
     * @param ContentScanStatus 扫描状态：0-待检测；1-检测完成
     */
    public void setContentScanStatus(Long ContentScanStatus) {
        this.ContentScanStatus = ContentScanStatus;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
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
        this.setParamSimple(map, prefix + "Appid", this.Appid);
        this.setParamSimple(map, prefix + "ContentScanStatus", this.ContentScanStatus);

    }
}

