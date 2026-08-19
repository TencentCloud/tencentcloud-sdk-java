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

public class BaselineAggregatedItem extends AbstractModel {

    /**
    * <p>检测项基础信息（含 ID、名称、风险等级、分类等）。</p>
    */
    @SerializedName("Item")
    @Expose
    private BaselineItem Item;

    /**
    * <p>该检测项最近一次扫描中结果为 PASS 的资产数量。</p>
    */
    @SerializedName("PassAssetCount")
    @Expose
    private Long PassAssetCount;

    /**
    * <p>该检测项最近一次扫描中结果为 NOT_PASS 的资产数量。</p>
    */
    @SerializedName("NotPassAssetCount")
    @Expose
    private Long NotPassAssetCount;

    /**
    * <p>该检测项最近一次扫描中结果为 PASS NOT_PASS 以及 CHECKING 的资产数量。</p>
    */
    @SerializedName("TotalAssetCount")
    @Expose
    private Long TotalAssetCount;

    /**
    * <p>该检测项最近一次扫描的资产通过率，单位为百分比（0~100）。</p>
    */
    @SerializedName("PassRate")
    @Expose
    private Float PassRate;

    /**
    * <p>该检测项最近一次完成扫描的时间。</p>
    */
    @SerializedName("LatestCheckTime")
    @Expose
    private String LatestCheckTime;

    /**
    * <p>上次扫描结果状态。取值：</p><ul><li>CHECKING：检测中</li><li>PASS：通过</li><li>NOT_PASS：未通过</li><li>CHECK_FAILED：检测失败</li><li>NOT_INVOLVED：不涉及</li></ul>
    */
    @SerializedName("ResultStatus")
    @Expose
    private String ResultStatus;

    /**
    * <p>该聚合结果涉及的租户 Appid 列表。</p>
    */
    @SerializedName("Appid")
    @Expose
    private Long [] Appid;

    /**
    * <p>该聚合结果涉及的扫描 JobID 列表。</p>
    */
    @SerializedName("JobID")
    @Expose
    private String [] JobID;

    /**
     * Get <p>检测项基础信息（含 ID、名称、风险等级、分类等）。</p> 
     * @return Item <p>检测项基础信息（含 ID、名称、风险等级、分类等）。</p>
     */
    public BaselineItem getItem() {
        return this.Item;
    }

    /**
     * Set <p>检测项基础信息（含 ID、名称、风险等级、分类等）。</p>
     * @param Item <p>检测项基础信息（含 ID、名称、风险等级、分类等）。</p>
     */
    public void setItem(BaselineItem Item) {
        this.Item = Item;
    }

    /**
     * Get <p>该检测项最近一次扫描中结果为 PASS 的资产数量。</p> 
     * @return PassAssetCount <p>该检测项最近一次扫描中结果为 PASS 的资产数量。</p>
     */
    public Long getPassAssetCount() {
        return this.PassAssetCount;
    }

    /**
     * Set <p>该检测项最近一次扫描中结果为 PASS 的资产数量。</p>
     * @param PassAssetCount <p>该检测项最近一次扫描中结果为 PASS 的资产数量。</p>
     */
    public void setPassAssetCount(Long PassAssetCount) {
        this.PassAssetCount = PassAssetCount;
    }

    /**
     * Get <p>该检测项最近一次扫描中结果为 NOT_PASS 的资产数量。</p> 
     * @return NotPassAssetCount <p>该检测项最近一次扫描中结果为 NOT_PASS 的资产数量。</p>
     */
    public Long getNotPassAssetCount() {
        return this.NotPassAssetCount;
    }

    /**
     * Set <p>该检测项最近一次扫描中结果为 NOT_PASS 的资产数量。</p>
     * @param NotPassAssetCount <p>该检测项最近一次扫描中结果为 NOT_PASS 的资产数量。</p>
     */
    public void setNotPassAssetCount(Long NotPassAssetCount) {
        this.NotPassAssetCount = NotPassAssetCount;
    }

    /**
     * Get <p>该检测项最近一次扫描中结果为 PASS NOT_PASS 以及 CHECKING 的资产数量。</p> 
     * @return TotalAssetCount <p>该检测项最近一次扫描中结果为 PASS NOT_PASS 以及 CHECKING 的资产数量。</p>
     */
    public Long getTotalAssetCount() {
        return this.TotalAssetCount;
    }

    /**
     * Set <p>该检测项最近一次扫描中结果为 PASS NOT_PASS 以及 CHECKING 的资产数量。</p>
     * @param TotalAssetCount <p>该检测项最近一次扫描中结果为 PASS NOT_PASS 以及 CHECKING 的资产数量。</p>
     */
    public void setTotalAssetCount(Long TotalAssetCount) {
        this.TotalAssetCount = TotalAssetCount;
    }

    /**
     * Get <p>该检测项最近一次扫描的资产通过率，单位为百分比（0~100）。</p> 
     * @return PassRate <p>该检测项最近一次扫描的资产通过率，单位为百分比（0~100）。</p>
     */
    public Float getPassRate() {
        return this.PassRate;
    }

    /**
     * Set <p>该检测项最近一次扫描的资产通过率，单位为百分比（0~100）。</p>
     * @param PassRate <p>该检测项最近一次扫描的资产通过率，单位为百分比（0~100）。</p>
     */
    public void setPassRate(Float PassRate) {
        this.PassRate = PassRate;
    }

    /**
     * Get <p>该检测项最近一次完成扫描的时间。</p> 
     * @return LatestCheckTime <p>该检测项最近一次完成扫描的时间。</p>
     */
    public String getLatestCheckTime() {
        return this.LatestCheckTime;
    }

    /**
     * Set <p>该检测项最近一次完成扫描的时间。</p>
     * @param LatestCheckTime <p>该检测项最近一次完成扫描的时间。</p>
     */
    public void setLatestCheckTime(String LatestCheckTime) {
        this.LatestCheckTime = LatestCheckTime;
    }

    /**
     * Get <p>上次扫描结果状态。取值：</p><ul><li>CHECKING：检测中</li><li>PASS：通过</li><li>NOT_PASS：未通过</li><li>CHECK_FAILED：检测失败</li><li>NOT_INVOLVED：不涉及</li></ul> 
     * @return ResultStatus <p>上次扫描结果状态。取值：</p><ul><li>CHECKING：检测中</li><li>PASS：通过</li><li>NOT_PASS：未通过</li><li>CHECK_FAILED：检测失败</li><li>NOT_INVOLVED：不涉及</li></ul>
     */
    public String getResultStatus() {
        return this.ResultStatus;
    }

    /**
     * Set <p>上次扫描结果状态。取值：</p><ul><li>CHECKING：检测中</li><li>PASS：通过</li><li>NOT_PASS：未通过</li><li>CHECK_FAILED：检测失败</li><li>NOT_INVOLVED：不涉及</li></ul>
     * @param ResultStatus <p>上次扫描结果状态。取值：</p><ul><li>CHECKING：检测中</li><li>PASS：通过</li><li>NOT_PASS：未通过</li><li>CHECK_FAILED：检测失败</li><li>NOT_INVOLVED：不涉及</li></ul>
     */
    public void setResultStatus(String ResultStatus) {
        this.ResultStatus = ResultStatus;
    }

    /**
     * Get <p>该聚合结果涉及的租户 Appid 列表。</p> 
     * @return Appid <p>该聚合结果涉及的租户 Appid 列表。</p>
     */
    public Long [] getAppid() {
        return this.Appid;
    }

    /**
     * Set <p>该聚合结果涉及的租户 Appid 列表。</p>
     * @param Appid <p>该聚合结果涉及的租户 Appid 列表。</p>
     */
    public void setAppid(Long [] Appid) {
        this.Appid = Appid;
    }

    /**
     * Get <p>该聚合结果涉及的扫描 JobID 列表。</p> 
     * @return JobID <p>该聚合结果涉及的扫描 JobID 列表。</p>
     */
    public String [] getJobID() {
        return this.JobID;
    }

    /**
     * Set <p>该聚合结果涉及的扫描 JobID 列表。</p>
     * @param JobID <p>该聚合结果涉及的扫描 JobID 列表。</p>
     */
    public void setJobID(String [] JobID) {
        this.JobID = JobID;
    }

    public BaselineAggregatedItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineAggregatedItem(BaselineAggregatedItem source) {
        if (source.Item != null) {
            this.Item = new BaselineItem(source.Item);
        }
        if (source.PassAssetCount != null) {
            this.PassAssetCount = new Long(source.PassAssetCount);
        }
        if (source.NotPassAssetCount != null) {
            this.NotPassAssetCount = new Long(source.NotPassAssetCount);
        }
        if (source.TotalAssetCount != null) {
            this.TotalAssetCount = new Long(source.TotalAssetCount);
        }
        if (source.PassRate != null) {
            this.PassRate = new Float(source.PassRate);
        }
        if (source.LatestCheckTime != null) {
            this.LatestCheckTime = new String(source.LatestCheckTime);
        }
        if (source.ResultStatus != null) {
            this.ResultStatus = new String(source.ResultStatus);
        }
        if (source.Appid != null) {
            this.Appid = new Long[source.Appid.length];
            for (int i = 0; i < source.Appid.length; i++) {
                this.Appid[i] = new Long(source.Appid[i]);
            }
        }
        if (source.JobID != null) {
            this.JobID = new String[source.JobID.length];
            for (int i = 0; i < source.JobID.length; i++) {
                this.JobID[i] = new String(source.JobID[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Item.", this.Item);
        this.setParamSimple(map, prefix + "PassAssetCount", this.PassAssetCount);
        this.setParamSimple(map, prefix + "NotPassAssetCount", this.NotPassAssetCount);
        this.setParamSimple(map, prefix + "TotalAssetCount", this.TotalAssetCount);
        this.setParamSimple(map, prefix + "PassRate", this.PassRate);
        this.setParamSimple(map, prefix + "LatestCheckTime", this.LatestCheckTime);
        this.setParamSimple(map, prefix + "ResultStatus", this.ResultStatus);
        this.setParamArraySimple(map, prefix + "Appid.", this.Appid);
        this.setParamArraySimple(map, prefix + "JobID.", this.JobID);

    }
}

