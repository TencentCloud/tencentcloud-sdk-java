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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TemDeployApplicationDetailInfo extends AbstractModel{

    /**
    * 分批发布策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeployStrategyConf")
    @Expose
    private DeployStrategyConf DeployStrategyConf;

    /**
    * 开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 当前状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * beta分批详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BetaBatchDetail")
    @Expose
    private DeployServiceBatchDetail BetaBatchDetail;

    /**
    * 其他分批详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OtherBatchDetail")
    @Expose
    private DeployServiceBatchDetail [] OtherBatchDetail;

    /**
    * 老版本pod列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OldVersionPodList")
    @Expose
    private DescribeRunPodPage OldVersionPodList;

    /**
    * 当前批次id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurrentBatchIndex")
    @Expose
    private Long CurrentBatchIndex;

    /**
    * 错误原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * 当前批次状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurrentBatchStatus")
    @Expose
    private String CurrentBatchStatus;

    /**
    * 新版本version
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NewDeployVersion")
    @Expose
    private String NewDeployVersion;

    /**
    * 旧版本version
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OldDeployVersion")
    @Expose
    private String OldDeployVersion;

    /**
    * 包名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NewVersionPackageInfo")
    @Expose
    private String NewVersionPackageInfo;

    /**
    * 下一批次开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NextBatchStartTime")
    @Expose
    private Long NextBatchStartTime;

    /**
     * Get 分批发布策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeployStrategyConf 分批发布策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DeployStrategyConf getDeployStrategyConf() {
        return this.DeployStrategyConf;
    }

    /**
     * Set 分批发布策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeployStrategyConf 分批发布策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeployStrategyConf(DeployStrategyConf DeployStrategyConf) {
        this.DeployStrategyConf = DeployStrategyConf;
    }

    /**
     * Get 开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 当前状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 当前状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 当前状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 当前状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get beta分批详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BetaBatchDetail beta分批详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DeployServiceBatchDetail getBetaBatchDetail() {
        return this.BetaBatchDetail;
    }

    /**
     * Set beta分批详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param BetaBatchDetail beta分批详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBetaBatchDetail(DeployServiceBatchDetail BetaBatchDetail) {
        this.BetaBatchDetail = BetaBatchDetail;
    }

    /**
     * Get 其他分批详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OtherBatchDetail 其他分批详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DeployServiceBatchDetail [] getOtherBatchDetail() {
        return this.OtherBatchDetail;
    }

    /**
     * Set 其他分批详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param OtherBatchDetail 其他分批详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOtherBatchDetail(DeployServiceBatchDetail [] OtherBatchDetail) {
        this.OtherBatchDetail = OtherBatchDetail;
    }

    /**
     * Get 老版本pod列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OldVersionPodList 老版本pod列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeRunPodPage getOldVersionPodList() {
        return this.OldVersionPodList;
    }

    /**
     * Set 老版本pod列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param OldVersionPodList 老版本pod列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOldVersionPodList(DescribeRunPodPage OldVersionPodList) {
        this.OldVersionPodList = OldVersionPodList;
    }

    /**
     * Get 当前批次id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurrentBatchIndex 当前批次id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCurrentBatchIndex() {
        return this.CurrentBatchIndex;
    }

    /**
     * Set 当前批次id
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurrentBatchIndex 当前批次id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrentBatchIndex(Long CurrentBatchIndex) {
        this.CurrentBatchIndex = CurrentBatchIndex;
    }

    /**
     * Get 错误原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorMessage 错误原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set 错误原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorMessage 错误原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get 当前批次状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurrentBatchStatus 当前批次状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCurrentBatchStatus() {
        return this.CurrentBatchStatus;
    }

    /**
     * Set 当前批次状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurrentBatchStatus 当前批次状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrentBatchStatus(String CurrentBatchStatus) {
        this.CurrentBatchStatus = CurrentBatchStatus;
    }

    /**
     * Get 新版本version
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NewDeployVersion 新版本version
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNewDeployVersion() {
        return this.NewDeployVersion;
    }

    /**
     * Set 新版本version
注意：此字段可能返回 null，表示取不到有效值。
     * @param NewDeployVersion 新版本version
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNewDeployVersion(String NewDeployVersion) {
        this.NewDeployVersion = NewDeployVersion;
    }

    /**
     * Get 旧版本version
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OldDeployVersion 旧版本version
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOldDeployVersion() {
        return this.OldDeployVersion;
    }

    /**
     * Set 旧版本version
注意：此字段可能返回 null，表示取不到有效值。
     * @param OldDeployVersion 旧版本version
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOldDeployVersion(String OldDeployVersion) {
        this.OldDeployVersion = OldDeployVersion;
    }

    /**
     * Get 包名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NewVersionPackageInfo 包名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNewVersionPackageInfo() {
        return this.NewVersionPackageInfo;
    }

    /**
     * Set 包名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param NewVersionPackageInfo 包名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNewVersionPackageInfo(String NewVersionPackageInfo) {
        this.NewVersionPackageInfo = NewVersionPackageInfo;
    }

    /**
     * Get 下一批次开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NextBatchStartTime 下一批次开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNextBatchStartTime() {
        return this.NextBatchStartTime;
    }

    /**
     * Set 下一批次开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param NextBatchStartTime 下一批次开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNextBatchStartTime(Long NextBatchStartTime) {
        this.NextBatchStartTime = NextBatchStartTime;
    }

    public TemDeployApplicationDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TemDeployApplicationDetailInfo(TemDeployApplicationDetailInfo source) {
        if (source.DeployStrategyConf != null) {
            this.DeployStrategyConf = new DeployStrategyConf(source.DeployStrategyConf);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.BetaBatchDetail != null) {
            this.BetaBatchDetail = new DeployServiceBatchDetail(source.BetaBatchDetail);
        }
        if (source.OtherBatchDetail != null) {
            this.OtherBatchDetail = new DeployServiceBatchDetail[source.OtherBatchDetail.length];
            for (int i = 0; i < source.OtherBatchDetail.length; i++) {
                this.OtherBatchDetail[i] = new DeployServiceBatchDetail(source.OtherBatchDetail[i]);
            }
        }
        if (source.OldVersionPodList != null) {
            this.OldVersionPodList = new DescribeRunPodPage(source.OldVersionPodList);
        }
        if (source.CurrentBatchIndex != null) {
            this.CurrentBatchIndex = new Long(source.CurrentBatchIndex);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.CurrentBatchStatus != null) {
            this.CurrentBatchStatus = new String(source.CurrentBatchStatus);
        }
        if (source.NewDeployVersion != null) {
            this.NewDeployVersion = new String(source.NewDeployVersion);
        }
        if (source.OldDeployVersion != null) {
            this.OldDeployVersion = new String(source.OldDeployVersion);
        }
        if (source.NewVersionPackageInfo != null) {
            this.NewVersionPackageInfo = new String(source.NewVersionPackageInfo);
        }
        if (source.NextBatchStartTime != null) {
            this.NextBatchStartTime = new Long(source.NextBatchStartTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DeployStrategyConf.", this.DeployStrategyConf);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "BetaBatchDetail.", this.BetaBatchDetail);
        this.setParamArrayObj(map, prefix + "OtherBatchDetail.", this.OtherBatchDetail);
        this.setParamObj(map, prefix + "OldVersionPodList.", this.OldVersionPodList);
        this.setParamSimple(map, prefix + "CurrentBatchIndex", this.CurrentBatchIndex);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "CurrentBatchStatus", this.CurrentBatchStatus);
        this.setParamSimple(map, prefix + "NewDeployVersion", this.NewDeployVersion);
        this.setParamSimple(map, prefix + "OldDeployVersion", this.OldDeployVersion);
        this.setParamSimple(map, prefix + "NewVersionPackageInfo", this.NewVersionPackageInfo);
        this.setParamSimple(map, prefix + "NextBatchStartTime", this.NextBatchStartTime);

    }
}

