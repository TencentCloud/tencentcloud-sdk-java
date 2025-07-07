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

public class BaselineInfo extends AbstractModel {

    /**
    * 基线名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 危害等级：1-低危；2-中危；3-高危；4-严重
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 检测项数量
    */
    @SerializedName("RuleCount")
    @Expose
    private Long RuleCount;

    /**
    * 影响服务器数量
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

    /**
    * 通过状态:0:未通过,1:已通过
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 基线id
    */
    @SerializedName("CategoryId")
    @Expose
    private Long CategoryId;

    /**
    * 最后检测时间
    */
    @SerializedName("LastScanTime")
    @Expose
    private String LastScanTime;

    /**
    * 检测中状态: 5
    */
    @SerializedName("MaxStatus")
    @Expose
    private Long MaxStatus;

    /**
    * 基线风险项
    */
    @SerializedName("BaselineFailCount")
    @Expose
    private Long BaselineFailCount;

    /**
     * Get 基线名 
     * @return Name 基线名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 基线名
     * @param Name 基线名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 危害等级：1-低危；2-中危；3-高危；4-严重 
     * @return Level 危害等级：1-低危；2-中危；3-高危；4-严重
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 危害等级：1-低危；2-中危；3-高危；4-严重
     * @param Level 危害等级：1-低危；2-中危；3-高危；4-严重
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 检测项数量 
     * @return RuleCount 检测项数量
     */
    public Long getRuleCount() {
        return this.RuleCount;
    }

    /**
     * Set 检测项数量
     * @param RuleCount 检测项数量
     */
    public void setRuleCount(Long RuleCount) {
        this.RuleCount = RuleCount;
    }

    /**
     * Get 影响服务器数量 
     * @return HostCount 影响服务器数量
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set 影响服务器数量
     * @param HostCount 影响服务器数量
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
    }

    /**
     * Get 通过状态:0:未通过,1:已通过 
     * @return Status 通过状态:0:未通过,1:已通过
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 通过状态:0:未通过,1:已通过
     * @param Status 通过状态:0:未通过,1:已通过
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 基线id 
     * @return CategoryId 基线id
     */
    public Long getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set 基线id
     * @param CategoryId 基线id
     */
    public void setCategoryId(Long CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get 最后检测时间 
     * @return LastScanTime 最后检测时间
     */
    public String getLastScanTime() {
        return this.LastScanTime;
    }

    /**
     * Set 最后检测时间
     * @param LastScanTime 最后检测时间
     */
    public void setLastScanTime(String LastScanTime) {
        this.LastScanTime = LastScanTime;
    }

    /**
     * Get 检测中状态: 5 
     * @return MaxStatus 检测中状态: 5
     */
    public Long getMaxStatus() {
        return this.MaxStatus;
    }

    /**
     * Set 检测中状态: 5
     * @param MaxStatus 检测中状态: 5
     */
    public void setMaxStatus(Long MaxStatus) {
        this.MaxStatus = MaxStatus;
    }

    /**
     * Get 基线风险项 
     * @return BaselineFailCount 基线风险项
     */
    public Long getBaselineFailCount() {
        return this.BaselineFailCount;
    }

    /**
     * Set 基线风险项
     * @param BaselineFailCount 基线风险项
     */
    public void setBaselineFailCount(Long BaselineFailCount) {
        this.BaselineFailCount = BaselineFailCount;
    }

    public BaselineInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineInfo(BaselineInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.RuleCount != null) {
            this.RuleCount = new Long(source.RuleCount);
        }
        if (source.HostCount != null) {
            this.HostCount = new Long(source.HostCount);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CategoryId != null) {
            this.CategoryId = new Long(source.CategoryId);
        }
        if (source.LastScanTime != null) {
            this.LastScanTime = new String(source.LastScanTime);
        }
        if (source.MaxStatus != null) {
            this.MaxStatus = new Long(source.MaxStatus);
        }
        if (source.BaselineFailCount != null) {
            this.BaselineFailCount = new Long(source.BaselineFailCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "RuleCount", this.RuleCount);
        this.setParamSimple(map, prefix + "HostCount", this.HostCount);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);
        this.setParamSimple(map, prefix + "MaxStatus", this.MaxStatus);
        this.setParamSimple(map, prefix + "BaselineFailCount", this.BaselineFailCount);

    }
}

