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
package com.tencentcloudapi.mmps.v20200710.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlySecMiniAppReportData extends AbstractModel{

    /**
    * 任务id
    */
    @SerializedName("TaskID")
    @Expose
    private String TaskID;

    /**
    * 小程序appid
    */
    @SerializedName("MiniAppID")
    @Expose
    private String MiniAppID;

    /**
    * 小程序名称
    */
    @SerializedName("MiniAppName")
    @Expose
    private String MiniAppName;

    /**
    * 小程序版本
    */
    @SerializedName("MiniAppVersion")
    @Expose
    private String MiniAppVersion;

    /**
    * 诊断模式 1:基础诊断，2:深度诊断
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * 诊断状态, 0:排队中, 1:成功, 2:失败, 3:进行中
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 诊断时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 诊断得分
    */
    @SerializedName("RiskScore")
    @Expose
    private String RiskScore;

    /**
    * 诊断风险等级 1:高风险 2:中风险 3:低风险
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * 诊断8大维度得分情况(每项总分100分)
    */
    @SerializedName("RiskItems")
    @Expose
    private FlySecMiniAppRiskItems RiskItems;

    /**
     * Get 任务id 
     * @return TaskID 任务id
     */
    public String getTaskID() {
        return this.TaskID;
    }

    /**
     * Set 任务id
     * @param TaskID 任务id
     */
    public void setTaskID(String TaskID) {
        this.TaskID = TaskID;
    }

    /**
     * Get 小程序appid 
     * @return MiniAppID 小程序appid
     */
    public String getMiniAppID() {
        return this.MiniAppID;
    }

    /**
     * Set 小程序appid
     * @param MiniAppID 小程序appid
     */
    public void setMiniAppID(String MiniAppID) {
        this.MiniAppID = MiniAppID;
    }

    /**
     * Get 小程序名称 
     * @return MiniAppName 小程序名称
     */
    public String getMiniAppName() {
        return this.MiniAppName;
    }

    /**
     * Set 小程序名称
     * @param MiniAppName 小程序名称
     */
    public void setMiniAppName(String MiniAppName) {
        this.MiniAppName = MiniAppName;
    }

    /**
     * Get 小程序版本 
     * @return MiniAppVersion 小程序版本
     */
    public String getMiniAppVersion() {
        return this.MiniAppVersion;
    }

    /**
     * Set 小程序版本
     * @param MiniAppVersion 小程序版本
     */
    public void setMiniAppVersion(String MiniAppVersion) {
        this.MiniAppVersion = MiniAppVersion;
    }

    /**
     * Get 诊断模式 1:基础诊断，2:深度诊断 
     * @return Mode 诊断模式 1:基础诊断，2:深度诊断
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set 诊断模式 1:基础诊断，2:深度诊断
     * @param Mode 诊断模式 1:基础诊断，2:深度诊断
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 诊断状态, 0:排队中, 1:成功, 2:失败, 3:进行中 
     * @return Status 诊断状态, 0:排队中, 1:成功, 2:失败, 3:进行中
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 诊断状态, 0:排队中, 1:成功, 2:失败, 3:进行中
     * @param Status 诊断状态, 0:排队中, 1:成功, 2:失败, 3:进行中
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 诊断时间 
     * @return CreateTime 诊断时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 诊断时间
     * @param CreateTime 诊断时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 诊断得分 
     * @return RiskScore 诊断得分
     */
    public String getRiskScore() {
        return this.RiskScore;
    }

    /**
     * Set 诊断得分
     * @param RiskScore 诊断得分
     */
    public void setRiskScore(String RiskScore) {
        this.RiskScore = RiskScore;
    }

    /**
     * Get 诊断风险等级 1:高风险 2:中风险 3:低风险 
     * @return RiskLevel 诊断风险等级 1:高风险 2:中风险 3:低风险
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 诊断风险等级 1:高风险 2:中风险 3:低风险
     * @param RiskLevel 诊断风险等级 1:高风险 2:中风险 3:低风险
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 诊断8大维度得分情况(每项总分100分) 
     * @return RiskItems 诊断8大维度得分情况(每项总分100分)
     */
    public FlySecMiniAppRiskItems getRiskItems() {
        return this.RiskItems;
    }

    /**
     * Set 诊断8大维度得分情况(每项总分100分)
     * @param RiskItems 诊断8大维度得分情况(每项总分100分)
     */
    public void setRiskItems(FlySecMiniAppRiskItems RiskItems) {
        this.RiskItems = RiskItems;
    }

    public FlySecMiniAppReportData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlySecMiniAppReportData(FlySecMiniAppReportData source) {
        if (source.TaskID != null) {
            this.TaskID = new String(source.TaskID);
        }
        if (source.MiniAppID != null) {
            this.MiniAppID = new String(source.MiniAppID);
        }
        if (source.MiniAppName != null) {
            this.MiniAppName = new String(source.MiniAppName);
        }
        if (source.MiniAppVersion != null) {
            this.MiniAppVersion = new String(source.MiniAppVersion);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.RiskScore != null) {
            this.RiskScore = new String(source.RiskScore);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long(source.RiskLevel);
        }
        if (source.RiskItems != null) {
            this.RiskItems = new FlySecMiniAppRiskItems(source.RiskItems);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskID", this.TaskID);
        this.setParamSimple(map, prefix + "MiniAppID", this.MiniAppID);
        this.setParamSimple(map, prefix + "MiniAppName", this.MiniAppName);
        this.setParamSimple(map, prefix + "MiniAppVersion", this.MiniAppVersion);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RiskScore", this.RiskScore);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamObj(map, prefix + "RiskItems.", this.RiskItems);

    }
}

