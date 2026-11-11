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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetBaselineRisk extends AbstractModel {

    /**
    * <p>风险记录唯一标识。</p>
    */
    @SerializedName("RiskID")
    @Expose
    private String RiskID;

    /**
    * <p>检测项详细信息。</p>
    */
    @SerializedName("Item")
    @Expose
    private BaselineItem Item;

    /**
    * <p>最近一次检测时间（ISO 8601 格式）。</p>
    */
    @SerializedName("LatestCheckTime")
    @Expose
    private String LatestCheckTime;

    /**
    * <p>检测结果状态。取值：</p><ul><li>NOT_PASS：未通过</li><li>PASS：通过</li><li>CHECKING：检测中</li></ul><p></p>
    */
    @SerializedName("ResultStatus")
    @Expose
    private String ResultStatus;

    /**
    * <p>所属基线策略简要信息。</p>
    */
    @SerializedName("PolicyInfo")
    @Expose
    private BaselinePolicyBrief PolicyInfo;

    /**
     * Get <p>风险记录唯一标识。</p> 
     * @return RiskID <p>风险记录唯一标识。</p>
     */
    public String getRiskID() {
        return this.RiskID;
    }

    /**
     * Set <p>风险记录唯一标识。</p>
     * @param RiskID <p>风险记录唯一标识。</p>
     */
    public void setRiskID(String RiskID) {
        this.RiskID = RiskID;
    }

    /**
     * Get <p>检测项详细信息。</p> 
     * @return Item <p>检测项详细信息。</p>
     */
    public BaselineItem getItem() {
        return this.Item;
    }

    /**
     * Set <p>检测项详细信息。</p>
     * @param Item <p>检测项详细信息。</p>
     */
    public void setItem(BaselineItem Item) {
        this.Item = Item;
    }

    /**
     * Get <p>最近一次检测时间（ISO 8601 格式）。</p> 
     * @return LatestCheckTime <p>最近一次检测时间（ISO 8601 格式）。</p>
     */
    public String getLatestCheckTime() {
        return this.LatestCheckTime;
    }

    /**
     * Set <p>最近一次检测时间（ISO 8601 格式）。</p>
     * @param LatestCheckTime <p>最近一次检测时间（ISO 8601 格式）。</p>
     */
    public void setLatestCheckTime(String LatestCheckTime) {
        this.LatestCheckTime = LatestCheckTime;
    }

    /**
     * Get <p>检测结果状态。取值：</p><ul><li>NOT_PASS：未通过</li><li>PASS：通过</li><li>CHECKING：检测中</li></ul><p></p> 
     * @return ResultStatus <p>检测结果状态。取值：</p><ul><li>NOT_PASS：未通过</li><li>PASS：通过</li><li>CHECKING：检测中</li></ul><p></p>
     */
    public String getResultStatus() {
        return this.ResultStatus;
    }

    /**
     * Set <p>检测结果状态。取值：</p><ul><li>NOT_PASS：未通过</li><li>PASS：通过</li><li>CHECKING：检测中</li></ul><p></p>
     * @param ResultStatus <p>检测结果状态。取值：</p><ul><li>NOT_PASS：未通过</li><li>PASS：通过</li><li>CHECKING：检测中</li></ul><p></p>
     */
    public void setResultStatus(String ResultStatus) {
        this.ResultStatus = ResultStatus;
    }

    /**
     * Get <p>所属基线策略简要信息。</p> 
     * @return PolicyInfo <p>所属基线策略简要信息。</p>
     */
    public BaselinePolicyBrief getPolicyInfo() {
        return this.PolicyInfo;
    }

    /**
     * Set <p>所属基线策略简要信息。</p>
     * @param PolicyInfo <p>所属基线策略简要信息。</p>
     */
    public void setPolicyInfo(BaselinePolicyBrief PolicyInfo) {
        this.PolicyInfo = PolicyInfo;
    }

    public AssetBaselineRisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetBaselineRisk(AssetBaselineRisk source) {
        if (source.RiskID != null) {
            this.RiskID = new String(source.RiskID);
        }
        if (source.Item != null) {
            this.Item = new BaselineItem(source.Item);
        }
        if (source.LatestCheckTime != null) {
            this.LatestCheckTime = new String(source.LatestCheckTime);
        }
        if (source.ResultStatus != null) {
            this.ResultStatus = new String(source.ResultStatus);
        }
        if (source.PolicyInfo != null) {
            this.PolicyInfo = new BaselinePolicyBrief(source.PolicyInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RiskID", this.RiskID);
        this.setParamObj(map, prefix + "Item.", this.Item);
        this.setParamSimple(map, prefix + "LatestCheckTime", this.LatestCheckTime);
        this.setParamSimple(map, prefix + "ResultStatus", this.ResultStatus);
        this.setParamObj(map, prefix + "PolicyInfo.", this.PolicyInfo);

    }
}

