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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScanVulSettingRequest extends AbstractModel{

    /**
    * 定期检测间隔时间（天）
    */
    @SerializedName("TimerInterval")
    @Expose
    private Long TimerInterval;

    /**
    * 漏洞类型：1: web-cms漏洞 2:应用漏洞  4: Linux软件漏洞 5: Windows系统漏洞, 以数组方式传参[1,2]
    */
    @SerializedName("VulCategories")
    @Expose
    private Long [] VulCategories;

    /**
    * 危害等级：1-低危；2-中危；3-高危；4-严重,以数组方式传参[1,2,3]
    */
    @SerializedName("VulLevels")
    @Expose
    private Long [] VulLevels;

    /**
    * 定期检测时间，如：02:10:50
    */
    @SerializedName("TimerTime")
    @Expose
    private String TimerTime;

    /**
    * 是否是应急漏洞 0 否 1 是
    */
    @SerializedName("VulEmergency")
    @Expose
    private Long VulEmergency;

    /**
    * 扫描开始时间，如：00:00
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 扫描结束时间，如：08:00
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 是否开启扫描 1开启 0不开启
    */
    @SerializedName("EnableScan")
    @Expose
    private Long EnableScan;

    /**
     * Get 定期检测间隔时间（天） 
     * @return TimerInterval 定期检测间隔时间（天）
     */
    public Long getTimerInterval() {
        return this.TimerInterval;
    }

    /**
     * Set 定期检测间隔时间（天）
     * @param TimerInterval 定期检测间隔时间（天）
     */
    public void setTimerInterval(Long TimerInterval) {
        this.TimerInterval = TimerInterval;
    }

    /**
     * Get 漏洞类型：1: web-cms漏洞 2:应用漏洞  4: Linux软件漏洞 5: Windows系统漏洞, 以数组方式传参[1,2] 
     * @return VulCategories 漏洞类型：1: web-cms漏洞 2:应用漏洞  4: Linux软件漏洞 5: Windows系统漏洞, 以数组方式传参[1,2]
     */
    public Long [] getVulCategories() {
        return this.VulCategories;
    }

    /**
     * Set 漏洞类型：1: web-cms漏洞 2:应用漏洞  4: Linux软件漏洞 5: Windows系统漏洞, 以数组方式传参[1,2]
     * @param VulCategories 漏洞类型：1: web-cms漏洞 2:应用漏洞  4: Linux软件漏洞 5: Windows系统漏洞, 以数组方式传参[1,2]
     */
    public void setVulCategories(Long [] VulCategories) {
        this.VulCategories = VulCategories;
    }

    /**
     * Get 危害等级：1-低危；2-中危；3-高危；4-严重,以数组方式传参[1,2,3] 
     * @return VulLevels 危害等级：1-低危；2-中危；3-高危；4-严重,以数组方式传参[1,2,3]
     */
    public Long [] getVulLevels() {
        return this.VulLevels;
    }

    /**
     * Set 危害等级：1-低危；2-中危；3-高危；4-严重,以数组方式传参[1,2,3]
     * @param VulLevels 危害等级：1-低危；2-中危；3-高危；4-严重,以数组方式传参[1,2,3]
     */
    public void setVulLevels(Long [] VulLevels) {
        this.VulLevels = VulLevels;
    }

    /**
     * Get 定期检测时间，如：02:10:50 
     * @return TimerTime 定期检测时间，如：02:10:50
     */
    public String getTimerTime() {
        return this.TimerTime;
    }

    /**
     * Set 定期检测时间，如：02:10:50
     * @param TimerTime 定期检测时间，如：02:10:50
     */
    public void setTimerTime(String TimerTime) {
        this.TimerTime = TimerTime;
    }

    /**
     * Get 是否是应急漏洞 0 否 1 是 
     * @return VulEmergency 是否是应急漏洞 0 否 1 是
     */
    public Long getVulEmergency() {
        return this.VulEmergency;
    }

    /**
     * Set 是否是应急漏洞 0 否 1 是
     * @param VulEmergency 是否是应急漏洞 0 否 1 是
     */
    public void setVulEmergency(Long VulEmergency) {
        this.VulEmergency = VulEmergency;
    }

    /**
     * Get 扫描开始时间，如：00:00 
     * @return StartTime 扫描开始时间，如：00:00
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 扫描开始时间，如：00:00
     * @param StartTime 扫描开始时间，如：00:00
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 扫描结束时间，如：08:00 
     * @return EndTime 扫描结束时间，如：08:00
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 扫描结束时间，如：08:00
     * @param EndTime 扫描结束时间，如：08:00
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 是否开启扫描 1开启 0不开启 
     * @return EnableScan 是否开启扫描 1开启 0不开启
     */
    public Long getEnableScan() {
        return this.EnableScan;
    }

    /**
     * Set 是否开启扫描 1开启 0不开启
     * @param EnableScan 是否开启扫描 1开启 0不开启
     */
    public void setEnableScan(Long EnableScan) {
        this.EnableScan = EnableScan;
    }

    public ScanVulSettingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanVulSettingRequest(ScanVulSettingRequest source) {
        if (source.TimerInterval != null) {
            this.TimerInterval = new Long(source.TimerInterval);
        }
        if (source.VulCategories != null) {
            this.VulCategories = new Long[source.VulCategories.length];
            for (int i = 0; i < source.VulCategories.length; i++) {
                this.VulCategories[i] = new Long(source.VulCategories[i]);
            }
        }
        if (source.VulLevels != null) {
            this.VulLevels = new Long[source.VulLevels.length];
            for (int i = 0; i < source.VulLevels.length; i++) {
                this.VulLevels[i] = new Long(source.VulLevels[i]);
            }
        }
        if (source.TimerTime != null) {
            this.TimerTime = new String(source.TimerTime);
        }
        if (source.VulEmergency != null) {
            this.VulEmergency = new Long(source.VulEmergency);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.EnableScan != null) {
            this.EnableScan = new Long(source.EnableScan);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimerInterval", this.TimerInterval);
        this.setParamArraySimple(map, prefix + "VulCategories.", this.VulCategories);
        this.setParamArraySimple(map, prefix + "VulLevels.", this.VulLevels);
        this.setParamSimple(map, prefix + "TimerTime", this.TimerTime);
        this.setParamSimple(map, prefix + "VulEmergency", this.VulEmergency);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "EnableScan", this.EnableScan);

    }
}

