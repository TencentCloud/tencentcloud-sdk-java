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

public class DescribeScanVulSettingResponse extends AbstractModel{

    /**
    * 漏洞类型：1: web-cms漏洞 2:应用漏洞  4: Linux软件漏洞 5: Windows系统漏洞
    */
    @SerializedName("VulCategories")
    @Expose
    private String VulCategories;

    /**
    * 危害等级：1-低危；2-中危；3-高危；4-严重 (多选英文逗号分隔)
    */
    @SerializedName("VulLevels")
    @Expose
    private String VulLevels;

    /**
    * 定期检测间隔时间（天）
    */
    @SerializedName("TimerInterval")
    @Expose
    private Long TimerInterval;

    /**
    * 定期检测时间，如：00:00
    */
    @SerializedName("TimerTime")
    @Expose
    private String TimerTime;

    /**
    * 是否紧急漏洞：0-否 1-是
    */
    @SerializedName("VulEmergency")
    @Expose
    private Long VulEmergency;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 是否开启
    */
    @SerializedName("EnableScan")
    @Expose
    private Long EnableScan;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 一键扫描超时时长，如：1800秒（s）
    */
    @SerializedName("ClickTimeout")
    @Expose
    private Long ClickTimeout;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 漏洞类型：1: web-cms漏洞 2:应用漏洞  4: Linux软件漏洞 5: Windows系统漏洞 
     * @return VulCategories 漏洞类型：1: web-cms漏洞 2:应用漏洞  4: Linux软件漏洞 5: Windows系统漏洞
     */
    public String getVulCategories() {
        return this.VulCategories;
    }

    /**
     * Set 漏洞类型：1: web-cms漏洞 2:应用漏洞  4: Linux软件漏洞 5: Windows系统漏洞
     * @param VulCategories 漏洞类型：1: web-cms漏洞 2:应用漏洞  4: Linux软件漏洞 5: Windows系统漏洞
     */
    public void setVulCategories(String VulCategories) {
        this.VulCategories = VulCategories;
    }

    /**
     * Get 危害等级：1-低危；2-中危；3-高危；4-严重 (多选英文逗号分隔) 
     * @return VulLevels 危害等级：1-低危；2-中危；3-高危；4-严重 (多选英文逗号分隔)
     */
    public String getVulLevels() {
        return this.VulLevels;
    }

    /**
     * Set 危害等级：1-低危；2-中危；3-高危；4-严重 (多选英文逗号分隔)
     * @param VulLevels 危害等级：1-低危；2-中危；3-高危；4-严重 (多选英文逗号分隔)
     */
    public void setVulLevels(String VulLevels) {
        this.VulLevels = VulLevels;
    }

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
     * Get 定期检测时间，如：00:00 
     * @return TimerTime 定期检测时间，如：00:00
     */
    public String getTimerTime() {
        return this.TimerTime;
    }

    /**
     * Set 定期检测时间，如：00:00
     * @param TimerTime 定期检测时间，如：00:00
     */
    public void setTimerTime(String TimerTime) {
        this.TimerTime = TimerTime;
    }

    /**
     * Get 是否紧急漏洞：0-否 1-是 
     * @return VulEmergency 是否紧急漏洞：0-否 1-是
     */
    public Long getVulEmergency() {
        return this.VulEmergency;
    }

    /**
     * Set 是否紧急漏洞：0-否 1-是
     * @param VulEmergency 是否紧急漏洞：0-否 1-是
     */
    public void setVulEmergency(Long VulEmergency) {
        this.VulEmergency = VulEmergency;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 是否开启 
     * @return EnableScan 是否开启
     */
    public Long getEnableScan() {
        return this.EnableScan;
    }

    /**
     * Set 是否开启
     * @param EnableScan 是否开启
     */
    public void setEnableScan(Long EnableScan) {
        this.EnableScan = EnableScan;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 一键扫描超时时长，如：1800秒（s） 
     * @return ClickTimeout 一键扫描超时时长，如：1800秒（s）
     */
    public Long getClickTimeout() {
        return this.ClickTimeout;
    }

    /**
     * Set 一键扫描超时时长，如：1800秒（s）
     * @param ClickTimeout 一键扫描超时时长，如：1800秒（s）
     */
    public void setClickTimeout(Long ClickTimeout) {
        this.ClickTimeout = ClickTimeout;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeScanVulSettingResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScanVulSettingResponse(DescribeScanVulSettingResponse source) {
        if (source.VulCategories != null) {
            this.VulCategories = new String(source.VulCategories);
        }
        if (source.VulLevels != null) {
            this.VulLevels = new String(source.VulLevels);
        }
        if (source.TimerInterval != null) {
            this.TimerInterval = new Long(source.TimerInterval);
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
        if (source.EnableScan != null) {
            this.EnableScan = new Long(source.EnableScan);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ClickTimeout != null) {
            this.ClickTimeout = new Long(source.ClickTimeout);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulCategories", this.VulCategories);
        this.setParamSimple(map, prefix + "VulLevels", this.VulLevels);
        this.setParamSimple(map, prefix + "TimerInterval", this.TimerInterval);
        this.setParamSimple(map, prefix + "TimerTime", this.TimerTime);
        this.setParamSimple(map, prefix + "VulEmergency", this.VulEmergency);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EnableScan", this.EnableScan);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ClickTimeout", this.ClickTimeout);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

