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

public class CreateMonitorsRequest  extends AbstractModel{

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
    private Integer Crontab;

    /**
    * 扫描速率限制，每秒发送X个HTTP请求
    */
    @SerializedName("RateLimit")
    @Expose
    private Integer RateLimit;

    /**
    * 首次扫描开始时间
    */
    @SerializedName("FirstScanStartTime")
    @Expose
    private String FirstScanStartTime;

    /**
     * 获取站点的url列表
     * @return Urls 站点的url列表
     */
    public String [] getUrls() {
        return this.Urls;
    }

    /**
     * 设置站点的url列表
     * @param Urls 站点的url列表
     */
    public void setUrls(String [] Urls) {
        this.Urls = Urls;
    }

    /**
     * 获取任务名称
     * @return Name 任务名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置任务名称
     * @param Name 任务名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取扫描模式，normal-正常扫描；deep-深度扫描
     * @return ScannerType 扫描模式，normal-正常扫描；deep-深度扫描
     */
    public String getScannerType() {
        return this.ScannerType;
    }

    /**
     * 设置扫描模式，normal-正常扫描；deep-深度扫描
     * @param ScannerType 扫描模式，normal-正常扫描；deep-深度扫描
     */
    public void setScannerType(String ScannerType) {
        this.ScannerType = ScannerType;
    }

    /**
     * 获取扫描周期，单位小时，每X小时执行一次
     * @return Crontab 扫描周期，单位小时，每X小时执行一次
     */
    public Integer getCrontab() {
        return this.Crontab;
    }

    /**
     * 设置扫描周期，单位小时，每X小时执行一次
     * @param Crontab 扫描周期，单位小时，每X小时执行一次
     */
    public void setCrontab(Integer Crontab) {
        this.Crontab = Crontab;
    }

    /**
     * 获取扫描速率限制，每秒发送X个HTTP请求
     * @return RateLimit 扫描速率限制，每秒发送X个HTTP请求
     */
    public Integer getRateLimit() {
        return this.RateLimit;
    }

    /**
     * 设置扫描速率限制，每秒发送X个HTTP请求
     * @param RateLimit 扫描速率限制，每秒发送X个HTTP请求
     */
    public void setRateLimit(Integer RateLimit) {
        this.RateLimit = RateLimit;
    }

    /**
     * 获取首次扫描开始时间
     * @return FirstScanStartTime 首次扫描开始时间
     */
    public String getFirstScanStartTime() {
        return this.FirstScanStartTime;
    }

    /**
     * 设置首次扫描开始时间
     * @param FirstScanStartTime 首次扫描开始时间
     */
    public void setFirstScanStartTime(String FirstScanStartTime) {
        this.FirstScanStartTime = FirstScanStartTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Urls.", this.Urls);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ScannerType", this.ScannerType);
        this.setParamSimple(map, prefix + "Crontab", this.Crontab);
        this.setParamSimple(map, prefix + "RateLimit", this.RateLimit);
        this.setParamSimple(map, prefix + "FirstScanStartTime", this.FirstScanStartTime);

    }
}

