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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTrialReportResponse extends AbstractModel {

    /**
    * <p>是否展示</p>
    */
    @SerializedName("IsShow")
    @Expose
    private Boolean IsShow;

    /**
    * <p>新增机器数</p>
    */
    @SerializedName("AddMachineCnt")
    @Expose
    private Long AddMachineCnt;

    /**
    * <p>基线风险数(检测项)</p>
    */
    @SerializedName("BaselineRiskCnt")
    @Expose
    private Long BaselineRiskCnt;

    /**
    * <p>漏洞数</p>
    */
    @SerializedName("VulCnt")
    @Expose
    private Long VulCnt;

    /**
    * <p>木马告警成功数</p>
    */
    @SerializedName("MalwareAlarmCnt")
    @Expose
    private Long MalwareAlarmCnt;

    /**
    * <p>爆破告警成功数</p>
    */
    @SerializedName("BruteAlarmCnt")
    @Expose
    private Long BruteAlarmCnt;

    /**
    * <p>自动隔离木马数(成功)</p>
    */
    @SerializedName("AutoIsolateMalwareCnt")
    @Expose
    private Long AutoIsolateMalwareCnt;

    /**
    * <p>自动阻断数(成功)</p>
    */
    @SerializedName("AutoBlockBruteCnt")
    @Expose
    private Long AutoBlockBruteCnt;

    /**
    * <p>自动防御漏洞数(成功)</p>
    */
    @SerializedName("AutoDefenceCnt")
    @Expose
    private Long AutoDefenceCnt;

    /**
    * <p>漏洞自动修复数</p>
    */
    @SerializedName("AutoVulFixCnt")
    @Expose
    private Long AutoVulFixCnt;

    /**
    * <p>java内存码告警数</p>
    */
    @SerializedName("JavaShellCnt")
    @Expose
    private Long JavaShellCnt;

    /**
    * <p>核心文件监控告警数</p>
    */
    @SerializedName("FileTamperCnt")
    @Expose
    private Long FileTamperCnt;

    /**
    * <p>事件调查数</p>
    */
    @SerializedName("EventCnt")
    @Expose
    private Long EventCnt;

    /**
    * <p>恶意请求事件数</p>
    */
    @SerializedName("DnsCnt")
    @Expose
    private Long DnsCnt;

    /**
    * <p>高危命令事件数</p>
    */
    @SerializedName("BashCnt")
    @Expose
    private Long BashCnt;

    /**
    * <p>云服务器厂商类型</p>
    */
    @SerializedName("CloudFrom")
    @Expose
    private CloudFromCnt [] CloudFrom;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>是否展示</p> 
     * @return IsShow <p>是否展示</p>
     */
    public Boolean getIsShow() {
        return this.IsShow;
    }

    /**
     * Set <p>是否展示</p>
     * @param IsShow <p>是否展示</p>
     */
    public void setIsShow(Boolean IsShow) {
        this.IsShow = IsShow;
    }

    /**
     * Get <p>新增机器数</p> 
     * @return AddMachineCnt <p>新增机器数</p>
     */
    public Long getAddMachineCnt() {
        return this.AddMachineCnt;
    }

    /**
     * Set <p>新增机器数</p>
     * @param AddMachineCnt <p>新增机器数</p>
     */
    public void setAddMachineCnt(Long AddMachineCnt) {
        this.AddMachineCnt = AddMachineCnt;
    }

    /**
     * Get <p>基线风险数(检测项)</p> 
     * @return BaselineRiskCnt <p>基线风险数(检测项)</p>
     */
    public Long getBaselineRiskCnt() {
        return this.BaselineRiskCnt;
    }

    /**
     * Set <p>基线风险数(检测项)</p>
     * @param BaselineRiskCnt <p>基线风险数(检测项)</p>
     */
    public void setBaselineRiskCnt(Long BaselineRiskCnt) {
        this.BaselineRiskCnt = BaselineRiskCnt;
    }

    /**
     * Get <p>漏洞数</p> 
     * @return VulCnt <p>漏洞数</p>
     */
    public Long getVulCnt() {
        return this.VulCnt;
    }

    /**
     * Set <p>漏洞数</p>
     * @param VulCnt <p>漏洞数</p>
     */
    public void setVulCnt(Long VulCnt) {
        this.VulCnt = VulCnt;
    }

    /**
     * Get <p>木马告警成功数</p> 
     * @return MalwareAlarmCnt <p>木马告警成功数</p>
     */
    public Long getMalwareAlarmCnt() {
        return this.MalwareAlarmCnt;
    }

    /**
     * Set <p>木马告警成功数</p>
     * @param MalwareAlarmCnt <p>木马告警成功数</p>
     */
    public void setMalwareAlarmCnt(Long MalwareAlarmCnt) {
        this.MalwareAlarmCnt = MalwareAlarmCnt;
    }

    /**
     * Get <p>爆破告警成功数</p> 
     * @return BruteAlarmCnt <p>爆破告警成功数</p>
     */
    public Long getBruteAlarmCnt() {
        return this.BruteAlarmCnt;
    }

    /**
     * Set <p>爆破告警成功数</p>
     * @param BruteAlarmCnt <p>爆破告警成功数</p>
     */
    public void setBruteAlarmCnt(Long BruteAlarmCnt) {
        this.BruteAlarmCnt = BruteAlarmCnt;
    }

    /**
     * Get <p>自动隔离木马数(成功)</p> 
     * @return AutoIsolateMalwareCnt <p>自动隔离木马数(成功)</p>
     */
    public Long getAutoIsolateMalwareCnt() {
        return this.AutoIsolateMalwareCnt;
    }

    /**
     * Set <p>自动隔离木马数(成功)</p>
     * @param AutoIsolateMalwareCnt <p>自动隔离木马数(成功)</p>
     */
    public void setAutoIsolateMalwareCnt(Long AutoIsolateMalwareCnt) {
        this.AutoIsolateMalwareCnt = AutoIsolateMalwareCnt;
    }

    /**
     * Get <p>自动阻断数(成功)</p> 
     * @return AutoBlockBruteCnt <p>自动阻断数(成功)</p>
     */
    public Long getAutoBlockBruteCnt() {
        return this.AutoBlockBruteCnt;
    }

    /**
     * Set <p>自动阻断数(成功)</p>
     * @param AutoBlockBruteCnt <p>自动阻断数(成功)</p>
     */
    public void setAutoBlockBruteCnt(Long AutoBlockBruteCnt) {
        this.AutoBlockBruteCnt = AutoBlockBruteCnt;
    }

    /**
     * Get <p>自动防御漏洞数(成功)</p> 
     * @return AutoDefenceCnt <p>自动防御漏洞数(成功)</p>
     */
    public Long getAutoDefenceCnt() {
        return this.AutoDefenceCnt;
    }

    /**
     * Set <p>自动防御漏洞数(成功)</p>
     * @param AutoDefenceCnt <p>自动防御漏洞数(成功)</p>
     */
    public void setAutoDefenceCnt(Long AutoDefenceCnt) {
        this.AutoDefenceCnt = AutoDefenceCnt;
    }

    /**
     * Get <p>漏洞自动修复数</p> 
     * @return AutoVulFixCnt <p>漏洞自动修复数</p>
     */
    public Long getAutoVulFixCnt() {
        return this.AutoVulFixCnt;
    }

    /**
     * Set <p>漏洞自动修复数</p>
     * @param AutoVulFixCnt <p>漏洞自动修复数</p>
     */
    public void setAutoVulFixCnt(Long AutoVulFixCnt) {
        this.AutoVulFixCnt = AutoVulFixCnt;
    }

    /**
     * Get <p>java内存码告警数</p> 
     * @return JavaShellCnt <p>java内存码告警数</p>
     */
    public Long getJavaShellCnt() {
        return this.JavaShellCnt;
    }

    /**
     * Set <p>java内存码告警数</p>
     * @param JavaShellCnt <p>java内存码告警数</p>
     */
    public void setJavaShellCnt(Long JavaShellCnt) {
        this.JavaShellCnt = JavaShellCnt;
    }

    /**
     * Get <p>核心文件监控告警数</p> 
     * @return FileTamperCnt <p>核心文件监控告警数</p>
     */
    public Long getFileTamperCnt() {
        return this.FileTamperCnt;
    }

    /**
     * Set <p>核心文件监控告警数</p>
     * @param FileTamperCnt <p>核心文件监控告警数</p>
     */
    public void setFileTamperCnt(Long FileTamperCnt) {
        this.FileTamperCnt = FileTamperCnt;
    }

    /**
     * Get <p>事件调查数</p> 
     * @return EventCnt <p>事件调查数</p>
     */
    public Long getEventCnt() {
        return this.EventCnt;
    }

    /**
     * Set <p>事件调查数</p>
     * @param EventCnt <p>事件调查数</p>
     */
    public void setEventCnt(Long EventCnt) {
        this.EventCnt = EventCnt;
    }

    /**
     * Get <p>恶意请求事件数</p> 
     * @return DnsCnt <p>恶意请求事件数</p>
     */
    public Long getDnsCnt() {
        return this.DnsCnt;
    }

    /**
     * Set <p>恶意请求事件数</p>
     * @param DnsCnt <p>恶意请求事件数</p>
     */
    public void setDnsCnt(Long DnsCnt) {
        this.DnsCnt = DnsCnt;
    }

    /**
     * Get <p>高危命令事件数</p> 
     * @return BashCnt <p>高危命令事件数</p>
     */
    public Long getBashCnt() {
        return this.BashCnt;
    }

    /**
     * Set <p>高危命令事件数</p>
     * @param BashCnt <p>高危命令事件数</p>
     */
    public void setBashCnt(Long BashCnt) {
        this.BashCnt = BashCnt;
    }

    /**
     * Get <p>云服务器厂商类型</p> 
     * @return CloudFrom <p>云服务器厂商类型</p>
     */
    public CloudFromCnt [] getCloudFrom() {
        return this.CloudFrom;
    }

    /**
     * Set <p>云服务器厂商类型</p>
     * @param CloudFrom <p>云服务器厂商类型</p>
     */
    public void setCloudFrom(CloudFromCnt [] CloudFrom) {
        this.CloudFrom = CloudFrom;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeTrialReportResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTrialReportResponse(DescribeTrialReportResponse source) {
        if (source.IsShow != null) {
            this.IsShow = new Boolean(source.IsShow);
        }
        if (source.AddMachineCnt != null) {
            this.AddMachineCnt = new Long(source.AddMachineCnt);
        }
        if (source.BaselineRiskCnt != null) {
            this.BaselineRiskCnt = new Long(source.BaselineRiskCnt);
        }
        if (source.VulCnt != null) {
            this.VulCnt = new Long(source.VulCnt);
        }
        if (source.MalwareAlarmCnt != null) {
            this.MalwareAlarmCnt = new Long(source.MalwareAlarmCnt);
        }
        if (source.BruteAlarmCnt != null) {
            this.BruteAlarmCnt = new Long(source.BruteAlarmCnt);
        }
        if (source.AutoIsolateMalwareCnt != null) {
            this.AutoIsolateMalwareCnt = new Long(source.AutoIsolateMalwareCnt);
        }
        if (source.AutoBlockBruteCnt != null) {
            this.AutoBlockBruteCnt = new Long(source.AutoBlockBruteCnt);
        }
        if (source.AutoDefenceCnt != null) {
            this.AutoDefenceCnt = new Long(source.AutoDefenceCnt);
        }
        if (source.AutoVulFixCnt != null) {
            this.AutoVulFixCnt = new Long(source.AutoVulFixCnt);
        }
        if (source.JavaShellCnt != null) {
            this.JavaShellCnt = new Long(source.JavaShellCnt);
        }
        if (source.FileTamperCnt != null) {
            this.FileTamperCnt = new Long(source.FileTamperCnt);
        }
        if (source.EventCnt != null) {
            this.EventCnt = new Long(source.EventCnt);
        }
        if (source.DnsCnt != null) {
            this.DnsCnt = new Long(source.DnsCnt);
        }
        if (source.BashCnt != null) {
            this.BashCnt = new Long(source.BashCnt);
        }
        if (source.CloudFrom != null) {
            this.CloudFrom = new CloudFromCnt[source.CloudFrom.length];
            for (int i = 0; i < source.CloudFrom.length; i++) {
                this.CloudFrom[i] = new CloudFromCnt(source.CloudFrom[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsShow", this.IsShow);
        this.setParamSimple(map, prefix + "AddMachineCnt", this.AddMachineCnt);
        this.setParamSimple(map, prefix + "BaselineRiskCnt", this.BaselineRiskCnt);
        this.setParamSimple(map, prefix + "VulCnt", this.VulCnt);
        this.setParamSimple(map, prefix + "MalwareAlarmCnt", this.MalwareAlarmCnt);
        this.setParamSimple(map, prefix + "BruteAlarmCnt", this.BruteAlarmCnt);
        this.setParamSimple(map, prefix + "AutoIsolateMalwareCnt", this.AutoIsolateMalwareCnt);
        this.setParamSimple(map, prefix + "AutoBlockBruteCnt", this.AutoBlockBruteCnt);
        this.setParamSimple(map, prefix + "AutoDefenceCnt", this.AutoDefenceCnt);
        this.setParamSimple(map, prefix + "AutoVulFixCnt", this.AutoVulFixCnt);
        this.setParamSimple(map, prefix + "JavaShellCnt", this.JavaShellCnt);
        this.setParamSimple(map, prefix + "FileTamperCnt", this.FileTamperCnt);
        this.setParamSimple(map, prefix + "EventCnt", this.EventCnt);
        this.setParamSimple(map, prefix + "DnsCnt", this.DnsCnt);
        this.setParamSimple(map, prefix + "BashCnt", this.BashCnt);
        this.setParamArrayObj(map, prefix + "CloudFrom.", this.CloudFrom);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

