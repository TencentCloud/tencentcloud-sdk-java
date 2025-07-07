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

public class BaselineItemDetect extends AbstractModel {

    /**
    * 项Id
    */
    @SerializedName("ItemId")
    @Expose
    private Long ItemId;

    /**
    * 项名称
    */
    @SerializedName("ItemName")
    @Expose
    private String ItemName;

    /**
    * 项描述
    */
    @SerializedName("ItemDesc")
    @Expose
    private String ItemDesc;

    /**
    * 修复方法
    */
    @SerializedName("FixMethod")
    @Expose
    private String FixMethod;

    /**
    * 所属规则
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 0:未通过 1:忽略 3:通过 5:检测中
    */
    @SerializedName("DetectStatus")
    @Expose
    private Long DetectStatus;

    /**
    * 风险等级
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 影响服务器数
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

    /**
    * 首次检测时间
    */
    @SerializedName("FirstTime")
    @Expose
    private String FirstTime;

    /**
    * 最后检测时间
    */
    @SerializedName("LastTime")
    @Expose
    private String LastTime;

    /**
    * 检测结果,Json字符串
    */
    @SerializedName("DetectResult")
    @Expose
    private String DetectResult;

    /**
    * 所属规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 通过的服务器数
    */
    @SerializedName("PassedHostCount")
    @Expose
    private Long PassedHostCount;

    /**
    * 未通过的服务器数
    */
    @SerializedName("NotPassedHostCount")
    @Expose
    private Long NotPassedHostCount;

    /**
     * Get 项Id 
     * @return ItemId 项Id
     */
    public Long getItemId() {
        return this.ItemId;
    }

    /**
     * Set 项Id
     * @param ItemId 项Id
     */
    public void setItemId(Long ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * Get 项名称 
     * @return ItemName 项名称
     */
    public String getItemName() {
        return this.ItemName;
    }

    /**
     * Set 项名称
     * @param ItemName 项名称
     */
    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    /**
     * Get 项描述 
     * @return ItemDesc 项描述
     */
    public String getItemDesc() {
        return this.ItemDesc;
    }

    /**
     * Set 项描述
     * @param ItemDesc 项描述
     */
    public void setItemDesc(String ItemDesc) {
        this.ItemDesc = ItemDesc;
    }

    /**
     * Get 修复方法 
     * @return FixMethod 修复方法
     */
    public String getFixMethod() {
        return this.FixMethod;
    }

    /**
     * Set 修复方法
     * @param FixMethod 修复方法
     */
    public void setFixMethod(String FixMethod) {
        this.FixMethod = FixMethod;
    }

    /**
     * Get 所属规则 
     * @return RuleName 所属规则
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 所属规则
     * @param RuleName 所属规则
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 0:未通过 1:忽略 3:通过 5:检测中 
     * @return DetectStatus 0:未通过 1:忽略 3:通过 5:检测中
     */
    public Long getDetectStatus() {
        return this.DetectStatus;
    }

    /**
     * Set 0:未通过 1:忽略 3:通过 5:检测中
     * @param DetectStatus 0:未通过 1:忽略 3:通过 5:检测中
     */
    public void setDetectStatus(Long DetectStatus) {
        this.DetectStatus = DetectStatus;
    }

    /**
     * Get 风险等级 
     * @return Level 风险等级
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 风险等级
     * @param Level 风险等级
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 影响服务器数 
     * @return HostCount 影响服务器数
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set 影响服务器数
     * @param HostCount 影响服务器数
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
    }

    /**
     * Get 首次检测时间 
     * @return FirstTime 首次检测时间
     */
    public String getFirstTime() {
        return this.FirstTime;
    }

    /**
     * Set 首次检测时间
     * @param FirstTime 首次检测时间
     */
    public void setFirstTime(String FirstTime) {
        this.FirstTime = FirstTime;
    }

    /**
     * Get 最后检测时间 
     * @return LastTime 最后检测时间
     */
    public String getLastTime() {
        return this.LastTime;
    }

    /**
     * Set 最后检测时间
     * @param LastTime 最后检测时间
     */
    public void setLastTime(String LastTime) {
        this.LastTime = LastTime;
    }

    /**
     * Get 检测结果,Json字符串 
     * @return DetectResult 检测结果,Json字符串
     */
    public String getDetectResult() {
        return this.DetectResult;
    }

    /**
     * Set 检测结果,Json字符串
     * @param DetectResult 检测结果,Json字符串
     */
    public void setDetectResult(String DetectResult) {
        this.DetectResult = DetectResult;
    }

    /**
     * Get 所属规则ID 
     * @return RuleId 所属规则ID
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 所属规则ID
     * @param RuleId 所属规则ID
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 通过的服务器数 
     * @return PassedHostCount 通过的服务器数
     */
    public Long getPassedHostCount() {
        return this.PassedHostCount;
    }

    /**
     * Set 通过的服务器数
     * @param PassedHostCount 通过的服务器数
     */
    public void setPassedHostCount(Long PassedHostCount) {
        this.PassedHostCount = PassedHostCount;
    }

    /**
     * Get 未通过的服务器数 
     * @return NotPassedHostCount 未通过的服务器数
     */
    public Long getNotPassedHostCount() {
        return this.NotPassedHostCount;
    }

    /**
     * Set 未通过的服务器数
     * @param NotPassedHostCount 未通过的服务器数
     */
    public void setNotPassedHostCount(Long NotPassedHostCount) {
        this.NotPassedHostCount = NotPassedHostCount;
    }

    public BaselineItemDetect() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineItemDetect(BaselineItemDetect source) {
        if (source.ItemId != null) {
            this.ItemId = new Long(source.ItemId);
        }
        if (source.ItemName != null) {
            this.ItemName = new String(source.ItemName);
        }
        if (source.ItemDesc != null) {
            this.ItemDesc = new String(source.ItemDesc);
        }
        if (source.FixMethod != null) {
            this.FixMethod = new String(source.FixMethod);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.DetectStatus != null) {
            this.DetectStatus = new Long(source.DetectStatus);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.HostCount != null) {
            this.HostCount = new Long(source.HostCount);
        }
        if (source.FirstTime != null) {
            this.FirstTime = new String(source.FirstTime);
        }
        if (source.LastTime != null) {
            this.LastTime = new String(source.LastTime);
        }
        if (source.DetectResult != null) {
            this.DetectResult = new String(source.DetectResult);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.PassedHostCount != null) {
            this.PassedHostCount = new Long(source.PassedHostCount);
        }
        if (source.NotPassedHostCount != null) {
            this.NotPassedHostCount = new Long(source.NotPassedHostCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemId", this.ItemId);
        this.setParamSimple(map, prefix + "ItemName", this.ItemName);
        this.setParamSimple(map, prefix + "ItemDesc", this.ItemDesc);
        this.setParamSimple(map, prefix + "FixMethod", this.FixMethod);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "DetectStatus", this.DetectStatus);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "HostCount", this.HostCount);
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "LastTime", this.LastTime);
        this.setParamSimple(map, prefix + "DetectResult", this.DetectResult);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "PassedHostCount", this.PassedHostCount);
        this.setParamSimple(map, prefix + "NotPassedHostCount", this.NotPassedHostCount);

    }
}

