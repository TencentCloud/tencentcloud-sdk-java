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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVirusSummaryResponse extends AbstractModel{

    /**
    * 最近的一次扫描任务id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 木马影响容器个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskContainerCnt")
    @Expose
    private Long RiskContainerCnt;

    /**
    * 待处理风险个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskCnt")
    @Expose
    private Long RiskCnt;

    /**
    * 病毒库更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VirusDataBaseModifyTime")
    @Expose
    private String VirusDataBaseModifyTime;

    /**
    * 木马影响容器个数较昨日增长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskContainerIncrease")
    @Expose
    private Long RiskContainerIncrease;

    /**
    * 待处理风险个数较昨日增长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskIncrease")
    @Expose
    private Long RiskIncrease;

    /**
    * 隔离事件个数较昨日新增
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsolateIncrease")
    @Expose
    private Long IsolateIncrease;

    /**
    * 隔离事件总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsolateCnt")
    @Expose
    private Long IsolateCnt;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 最近的一次扫描任务id 
     * @return TaskId 最近的一次扫描任务id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 最近的一次扫描任务id
     * @param TaskId 最近的一次扫描任务id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 木马影响容器个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskContainerCnt 木马影响容器个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRiskContainerCnt() {
        return this.RiskContainerCnt;
    }

    /**
     * Set 木马影响容器个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskContainerCnt 木马影响容器个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskContainerCnt(Long RiskContainerCnt) {
        this.RiskContainerCnt = RiskContainerCnt;
    }

    /**
     * Get 待处理风险个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskCnt 待处理风险个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRiskCnt() {
        return this.RiskCnt;
    }

    /**
     * Set 待处理风险个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskCnt 待处理风险个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskCnt(Long RiskCnt) {
        this.RiskCnt = RiskCnt;
    }

    /**
     * Get 病毒库更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VirusDataBaseModifyTime 病毒库更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVirusDataBaseModifyTime() {
        return this.VirusDataBaseModifyTime;
    }

    /**
     * Set 病毒库更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param VirusDataBaseModifyTime 病毒库更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVirusDataBaseModifyTime(String VirusDataBaseModifyTime) {
        this.VirusDataBaseModifyTime = VirusDataBaseModifyTime;
    }

    /**
     * Get 木马影响容器个数较昨日增长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskContainerIncrease 木马影响容器个数较昨日增长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRiskContainerIncrease() {
        return this.RiskContainerIncrease;
    }

    /**
     * Set 木马影响容器个数较昨日增长
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskContainerIncrease 木马影响容器个数较昨日增长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskContainerIncrease(Long RiskContainerIncrease) {
        this.RiskContainerIncrease = RiskContainerIncrease;
    }

    /**
     * Get 待处理风险个数较昨日增长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskIncrease 待处理风险个数较昨日增长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRiskIncrease() {
        return this.RiskIncrease;
    }

    /**
     * Set 待处理风险个数较昨日增长
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskIncrease 待处理风险个数较昨日增长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskIncrease(Long RiskIncrease) {
        this.RiskIncrease = RiskIncrease;
    }

    /**
     * Get 隔离事件个数较昨日新增
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsolateIncrease 隔离事件个数较昨日新增
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsolateIncrease() {
        return this.IsolateIncrease;
    }

    /**
     * Set 隔离事件个数较昨日新增
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsolateIncrease 隔离事件个数较昨日新增
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsolateIncrease(Long IsolateIncrease) {
        this.IsolateIncrease = IsolateIncrease;
    }

    /**
     * Get 隔离事件总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsolateCnt 隔离事件总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsolateCnt() {
        return this.IsolateCnt;
    }

    /**
     * Set 隔离事件总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsolateCnt 隔离事件总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsolateCnt(Long IsolateCnt) {
        this.IsolateCnt = IsolateCnt;
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

    public DescribeVirusSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVirusSummaryResponse(DescribeVirusSummaryResponse source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.RiskContainerCnt != null) {
            this.RiskContainerCnt = new Long(source.RiskContainerCnt);
        }
        if (source.RiskCnt != null) {
            this.RiskCnt = new Long(source.RiskCnt);
        }
        if (source.VirusDataBaseModifyTime != null) {
            this.VirusDataBaseModifyTime = new String(source.VirusDataBaseModifyTime);
        }
        if (source.RiskContainerIncrease != null) {
            this.RiskContainerIncrease = new Long(source.RiskContainerIncrease);
        }
        if (source.RiskIncrease != null) {
            this.RiskIncrease = new Long(source.RiskIncrease);
        }
        if (source.IsolateIncrease != null) {
            this.IsolateIncrease = new Long(source.IsolateIncrease);
        }
        if (source.IsolateCnt != null) {
            this.IsolateCnt = new Long(source.IsolateCnt);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "RiskContainerCnt", this.RiskContainerCnt);
        this.setParamSimple(map, prefix + "RiskCnt", this.RiskCnt);
        this.setParamSimple(map, prefix + "VirusDataBaseModifyTime", this.VirusDataBaseModifyTime);
        this.setParamSimple(map, prefix + "RiskContainerIncrease", this.RiskContainerIncrease);
        this.setParamSimple(map, prefix + "RiskIncrease", this.RiskIncrease);
        this.setParamSimple(map, prefix + "IsolateIncrease", this.IsolateIncrease);
        this.setParamSimple(map, prefix + "IsolateCnt", this.IsolateCnt);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

