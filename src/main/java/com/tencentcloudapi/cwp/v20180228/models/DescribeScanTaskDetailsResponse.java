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

public class DescribeScanTaskDetailsResponse extends AbstractModel{

    /**
    * 扫描任务信息列表
    */
    @SerializedName("ScanTaskDetailList")
    @Expose
    private ScanTaskDetails [] ScanTaskDetailList;

    /**
    * 总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 扫描机器总数
    */
    @SerializedName("ScanMachineCount")
    @Expose
    private Long ScanMachineCount;

    /**
    * 发现风险机器数
    */
    @SerializedName("RiskMachineCount")
    @Expose
    private Long RiskMachineCount;

    /**
    * 扫描开始时间
    */
    @SerializedName("ScanBeginTime")
    @Expose
    private String ScanBeginTime;

    /**
    * 扫描结束时间
    */
    @SerializedName("ScanEndTime")
    @Expose
    private String ScanEndTime;

    /**
    * 检测时间
    */
    @SerializedName("ScanTime")
    @Expose
    private Long ScanTime;

    /**
    * 扫描进度
    */
    @SerializedName("ScanProgress")
    @Expose
    private Long ScanProgress;

    /**
    * 扫描剩余时间
    */
    @SerializedName("ScanLeftTime")
    @Expose
    private Long ScanLeftTime;

    /**
    * 扫描内容
    */
    @SerializedName("ScanContent")
    @Expose
    private String [] ScanContent;

    /**
    * 漏洞信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VulInfo")
    @Expose
    private VulDetailInfo [] VulInfo;

    /**
    * 风险事件个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskEventCount")
    @Expose
    private Long RiskEventCount;

    /**
    * 0一键检测 1定时检测
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 任务是否全部正在被停止 ture是
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StoppingAll")
    @Expose
    private Boolean StoppingAll;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 扫描任务信息列表 
     * @return ScanTaskDetailList 扫描任务信息列表
     */
    public ScanTaskDetails [] getScanTaskDetailList() {
        return this.ScanTaskDetailList;
    }

    /**
     * Set 扫描任务信息列表
     * @param ScanTaskDetailList 扫描任务信息列表
     */
    public void setScanTaskDetailList(ScanTaskDetails [] ScanTaskDetailList) {
        this.ScanTaskDetailList = ScanTaskDetailList;
    }

    /**
     * Get 总数 
     * @return TotalCount 总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数
     * @param TotalCount 总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 扫描机器总数 
     * @return ScanMachineCount 扫描机器总数
     */
    public Long getScanMachineCount() {
        return this.ScanMachineCount;
    }

    /**
     * Set 扫描机器总数
     * @param ScanMachineCount 扫描机器总数
     */
    public void setScanMachineCount(Long ScanMachineCount) {
        this.ScanMachineCount = ScanMachineCount;
    }

    /**
     * Get 发现风险机器数 
     * @return RiskMachineCount 发现风险机器数
     */
    public Long getRiskMachineCount() {
        return this.RiskMachineCount;
    }

    /**
     * Set 发现风险机器数
     * @param RiskMachineCount 发现风险机器数
     */
    public void setRiskMachineCount(Long RiskMachineCount) {
        this.RiskMachineCount = RiskMachineCount;
    }

    /**
     * Get 扫描开始时间 
     * @return ScanBeginTime 扫描开始时间
     */
    public String getScanBeginTime() {
        return this.ScanBeginTime;
    }

    /**
     * Set 扫描开始时间
     * @param ScanBeginTime 扫描开始时间
     */
    public void setScanBeginTime(String ScanBeginTime) {
        this.ScanBeginTime = ScanBeginTime;
    }

    /**
     * Get 扫描结束时间 
     * @return ScanEndTime 扫描结束时间
     */
    public String getScanEndTime() {
        return this.ScanEndTime;
    }

    /**
     * Set 扫描结束时间
     * @param ScanEndTime 扫描结束时间
     */
    public void setScanEndTime(String ScanEndTime) {
        this.ScanEndTime = ScanEndTime;
    }

    /**
     * Get 检测时间 
     * @return ScanTime 检测时间
     */
    public Long getScanTime() {
        return this.ScanTime;
    }

    /**
     * Set 检测时间
     * @param ScanTime 检测时间
     */
    public void setScanTime(Long ScanTime) {
        this.ScanTime = ScanTime;
    }

    /**
     * Get 扫描进度 
     * @return ScanProgress 扫描进度
     */
    public Long getScanProgress() {
        return this.ScanProgress;
    }

    /**
     * Set 扫描进度
     * @param ScanProgress 扫描进度
     */
    public void setScanProgress(Long ScanProgress) {
        this.ScanProgress = ScanProgress;
    }

    /**
     * Get 扫描剩余时间 
     * @return ScanLeftTime 扫描剩余时间
     */
    public Long getScanLeftTime() {
        return this.ScanLeftTime;
    }

    /**
     * Set 扫描剩余时间
     * @param ScanLeftTime 扫描剩余时间
     */
    public void setScanLeftTime(Long ScanLeftTime) {
        this.ScanLeftTime = ScanLeftTime;
    }

    /**
     * Get 扫描内容 
     * @return ScanContent 扫描内容
     */
    public String [] getScanContent() {
        return this.ScanContent;
    }

    /**
     * Set 扫描内容
     * @param ScanContent 扫描内容
     */
    public void setScanContent(String [] ScanContent) {
        this.ScanContent = ScanContent;
    }

    /**
     * Get 漏洞信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VulInfo 漏洞信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VulDetailInfo [] getVulInfo() {
        return this.VulInfo;
    }

    /**
     * Set 漏洞信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param VulInfo 漏洞信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVulInfo(VulDetailInfo [] VulInfo) {
        this.VulInfo = VulInfo;
    }

    /**
     * Get 风险事件个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskEventCount 风险事件个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRiskEventCount() {
        return this.RiskEventCount;
    }

    /**
     * Set 风险事件个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskEventCount 风险事件个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskEventCount(Long RiskEventCount) {
        this.RiskEventCount = RiskEventCount;
    }

    /**
     * Get 0一键检测 1定时检测
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 0一键检测 1定时检测
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 0一键检测 1定时检测
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 0一键检测 1定时检测
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 任务是否全部正在被停止 ture是
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StoppingAll 任务是否全部正在被停止 ture是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getStoppingAll() {
        return this.StoppingAll;
    }

    /**
     * Set 任务是否全部正在被停止 ture是
注意：此字段可能返回 null，表示取不到有效值。
     * @param StoppingAll 任务是否全部正在被停止 ture是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStoppingAll(Boolean StoppingAll) {
        this.StoppingAll = StoppingAll;
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

    public DescribeScanTaskDetailsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScanTaskDetailsResponse(DescribeScanTaskDetailsResponse source) {
        if (source.ScanTaskDetailList != null) {
            this.ScanTaskDetailList = new ScanTaskDetails[source.ScanTaskDetailList.length];
            for (int i = 0; i < source.ScanTaskDetailList.length; i++) {
                this.ScanTaskDetailList[i] = new ScanTaskDetails(source.ScanTaskDetailList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ScanMachineCount != null) {
            this.ScanMachineCount = new Long(source.ScanMachineCount);
        }
        if (source.RiskMachineCount != null) {
            this.RiskMachineCount = new Long(source.RiskMachineCount);
        }
        if (source.ScanBeginTime != null) {
            this.ScanBeginTime = new String(source.ScanBeginTime);
        }
        if (source.ScanEndTime != null) {
            this.ScanEndTime = new String(source.ScanEndTime);
        }
        if (source.ScanTime != null) {
            this.ScanTime = new Long(source.ScanTime);
        }
        if (source.ScanProgress != null) {
            this.ScanProgress = new Long(source.ScanProgress);
        }
        if (source.ScanLeftTime != null) {
            this.ScanLeftTime = new Long(source.ScanLeftTime);
        }
        if (source.ScanContent != null) {
            this.ScanContent = new String[source.ScanContent.length];
            for (int i = 0; i < source.ScanContent.length; i++) {
                this.ScanContent[i] = new String(source.ScanContent[i]);
            }
        }
        if (source.VulInfo != null) {
            this.VulInfo = new VulDetailInfo[source.VulInfo.length];
            for (int i = 0; i < source.VulInfo.length; i++) {
                this.VulInfo[i] = new VulDetailInfo(source.VulInfo[i]);
            }
        }
        if (source.RiskEventCount != null) {
            this.RiskEventCount = new Long(source.RiskEventCount);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.StoppingAll != null) {
            this.StoppingAll = new Boolean(source.StoppingAll);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ScanTaskDetailList.", this.ScanTaskDetailList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "ScanMachineCount", this.ScanMachineCount);
        this.setParamSimple(map, prefix + "RiskMachineCount", this.RiskMachineCount);
        this.setParamSimple(map, prefix + "ScanBeginTime", this.ScanBeginTime);
        this.setParamSimple(map, prefix + "ScanEndTime", this.ScanEndTime);
        this.setParamSimple(map, prefix + "ScanTime", this.ScanTime);
        this.setParamSimple(map, prefix + "ScanProgress", this.ScanProgress);
        this.setParamSimple(map, prefix + "ScanLeftTime", this.ScanLeftTime);
        this.setParamArraySimple(map, prefix + "ScanContent.", this.ScanContent);
        this.setParamArrayObj(map, prefix + "VulInfo.", this.VulInfo);
        this.setParamSimple(map, prefix + "RiskEventCount", this.RiskEventCount);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "StoppingAll", this.StoppingAll);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

