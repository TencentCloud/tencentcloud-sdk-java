/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyMonitorAttributeRequest extends AbstractModel {

    /**
    * 监测任务ID
    */
    @SerializedName("MonitorId")
    @Expose
    private Long MonitorId;

    /**
    * 站点的url列表
    */
    @SerializedName("Urls")
    @Expose
    private String [] Urls;

    /**
    * 任务名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 扫描模式，normal-正常扫描；deep-深度扫描
    */
    @SerializedName("ScannerType")
    @Expose
    private String ScannerType;

    /**
    * 扫描周期，单位小时，每X小时执行一次
    */
    @SerializedName("Crontab")
    @Expose
    private Long Crontab;

    /**
    * 扫描速率限制，每秒发送X个HTTP请求
    */
    @SerializedName("RateLimit")
    @Expose
    private Long RateLimit;

    /**
    * 首次扫描开始时间
    */
    @SerializedName("FirstScanStartTime")
    @Expose
    private String FirstScanStartTime;

    /**
    * 监测状态：1-监测中；2-暂停监测
    */
    @SerializedName("MonitorStatus")
    @Expose
    private Long MonitorStatus;

    /**
     * Get 监测任务ID 
     * @return MonitorId 监测任务ID
     */
    public Long getMonitorId() {
        return this.MonitorId;
    }

    /**
     * Set 监测任务ID
     * @param MonitorId 监测任务ID
     */
    public void setMonitorId(Long MonitorId) {
        this.MonitorId = MonitorId;
    }

    /**
     * Get 站点的url列表 
     * @return Urls 站点的url列表
     */
    public String [] getUrls() {
        return this.Urls;
    }

    /**
     * Set 站点的url列表
     * @param Urls 站点的url列表
     */
    public void setUrls(String [] Urls) {
        this.Urls = Urls;
    }

    /**
     * Get 任务名称 
     * @return Name 任务名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 任务名称
     * @param Name 任务名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 扫描模式，normal-正常扫描；deep-深度扫描 
     * @return ScannerType 扫描模式，normal-正常扫描；deep-深度扫描
     */
    public String getScannerType() {
        return this.ScannerType;
    }

    /**
     * Set 扫描模式，normal-正常扫描；deep-深度扫描
     * @param ScannerType 扫描模式，normal-正常扫描；deep-深度扫描
     */
    public void setScannerType(String ScannerType) {
        this.ScannerType = ScannerType;
    }

    /**
     * Get 扫描周期，单位小时，每X小时执行一次 
     * @return Crontab 扫描周期，单位小时，每X小时执行一次
     */
    public Long getCrontab() {
        return this.Crontab;
    }

    /**
     * Set 扫描周期，单位小时，每X小时执行一次
     * @param Crontab 扫描周期，单位小时，每X小时执行一次
     */
    public void setCrontab(Long Crontab) {
        this.Crontab = Crontab;
    }

    /**
     * Get 扫描速率限制，每秒发送X个HTTP请求 
     * @return RateLimit 扫描速率限制，每秒发送X个HTTP请求
     */
    public Long getRateLimit() {
        return this.RateLimit;
    }

    /**
     * Set 扫描速率限制，每秒发送X个HTTP请求
     * @param RateLimit 扫描速率限制，每秒发送X个HTTP请求
     */
    public void setRateLimit(Long RateLimit) {
        this.RateLimit = RateLimit;
    }

    /**
     * Get 首次扫描开始时间 
     * @return FirstScanStartTime 首次扫描开始时间
     */
    public String getFirstScanStartTime() {
        return this.FirstScanStartTime;
    }

    /**
     * Set 首次扫描开始时间
     * @param FirstScanStartTime 首次扫描开始时间
     */
    public void setFirstScanStartTime(String FirstScanStartTime) {
        this.FirstScanStartTime = FirstScanStartTime;
    }

    /**
     * Get 监测状态：1-监测中；2-暂停监测 
     * @return MonitorStatus 监测状态：1-监测中；2-暂停监测
     */
    public Long getMonitorStatus() {
        return this.MonitorStatus;
    }

    /**
     * Set 监测状态：1-监测中；2-暂停监测
     * @param MonitorStatus 监测状态：1-监测中；2-暂停监测
     */
    public void setMonitorStatus(Long MonitorStatus) {
        this.MonitorStatus = MonitorStatus;
    }

    public ModifyMonitorAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMonitorAttributeRequest(ModifyMonitorAttributeRequest source) {
        if (source.MonitorId != null) {
            this.MonitorId = new Long(source.MonitorId);
        }
        if (source.Urls != null) {
            this.Urls = new String[source.Urls.length];
            for (int i = 0; i < source.Urls.length; i++) {
                this.Urls[i] = new String(source.Urls[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ScannerType != null) {
            this.ScannerType = new String(source.ScannerType);
        }
        if (source.Crontab != null) {
            this.Crontab = new Long(source.Crontab);
        }
        if (source.RateLimit != null) {
            this.RateLimit = new Long(source.RateLimit);
        }
        if (source.FirstScanStartTime != null) {
            this.FirstScanStartTime = new String(source.FirstScanStartTime);
        }
        if (source.MonitorStatus != null) {
            this.MonitorStatus = new Long(source.MonitorStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MonitorId", this.MonitorId);
        this.setParamArraySimple(map, prefix + "Urls.", this.Urls);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ScannerType", this.ScannerType);
        this.setParamSimple(map, prefix + "Crontab", this.Crontab);
        this.setParamSimple(map, prefix + "RateLimit", this.RateLimit);
        this.setParamSimple(map, prefix + "FirstScanStartTime", this.FirstScanStartTime);
        this.setParamSimple(map, prefix + "MonitorStatus", this.MonitorStatus);

    }
}

