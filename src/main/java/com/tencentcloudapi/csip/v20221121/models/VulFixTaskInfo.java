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

public class VulFixTaskInfo extends AbstractModel {

    /**
    * 修复任务主键ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 修复状态
枚举值：
0：初始化
1：修复中
2：修复成功
3：部分修复失败
4：全部修复失败
5：停止修复
    */
    @SerializedName("FixStatus")
    @Expose
    private Long FixStatus;

    /**
    * 修复资产总数
    */
    @SerializedName("AssetCount")
    @Expose
    private Long AssetCount;

    /**
    * 修复成功数
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * 修复失败数
    */
    @SerializedName("FailCount")
    @Expose
    private Long FailCount;

    /**
    * 修复中数量
    */
    @SerializedName("FixingCount")
    @Expose
    private Long FixingCount;

    /**
    * 排队中数量（等待下发或等待快照创建）
    */
    @SerializedName("QueueCount")
    @Expose
    private Long QueueCount;

    /**
    * 修复进度百分比
取值范围：[0, 100]
补充说明：计算方式为(SuccessCount+FailCount)/AssetCount×100
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 修复成功的漏洞数
    */
    @SerializedName("SuccessVulCount")
    @Expose
    private Long SuccessVulCount;

    /**
    * 修复失败的漏洞数
    */
    @SerializedName("FailVulCount")
    @Expose
    private Long FailVulCount;

    /**
    * 修复的漏洞名称列表
    */
    @SerializedName("VulNames")
    @Expose
    private String [] VulNames;

    /**
    * 修复启动时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 修复结束时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 漏洞维度修复状态列表，每个漏洞的修复状态详情
    */
    @SerializedName("VulFixStatusList")
    @Expose
    private VulFixStatusItem [] VulFixStatusList;

    /**
     * Get 修复任务主键ID 
     * @return Id 修复任务主键ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 修复任务主键ID
     * @param Id 修复任务主键ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 修复状态
枚举值：
0：初始化
1：修复中
2：修复成功
3：部分修复失败
4：全部修复失败
5：停止修复 
     * @return FixStatus 修复状态
枚举值：
0：初始化
1：修复中
2：修复成功
3：部分修复失败
4：全部修复失败
5：停止修复
     */
    public Long getFixStatus() {
        return this.FixStatus;
    }

    /**
     * Set 修复状态
枚举值：
0：初始化
1：修复中
2：修复成功
3：部分修复失败
4：全部修复失败
5：停止修复
     * @param FixStatus 修复状态
枚举值：
0：初始化
1：修复中
2：修复成功
3：部分修复失败
4：全部修复失败
5：停止修复
     */
    public void setFixStatus(Long FixStatus) {
        this.FixStatus = FixStatus;
    }

    /**
     * Get 修复资产总数 
     * @return AssetCount 修复资产总数
     */
    public Long getAssetCount() {
        return this.AssetCount;
    }

    /**
     * Set 修复资产总数
     * @param AssetCount 修复资产总数
     */
    public void setAssetCount(Long AssetCount) {
        this.AssetCount = AssetCount;
    }

    /**
     * Get 修复成功数 
     * @return SuccessCount 修复成功数
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set 修复成功数
     * @param SuccessCount 修复成功数
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get 修复失败数 
     * @return FailCount 修复失败数
     */
    public Long getFailCount() {
        return this.FailCount;
    }

    /**
     * Set 修复失败数
     * @param FailCount 修复失败数
     */
    public void setFailCount(Long FailCount) {
        this.FailCount = FailCount;
    }

    /**
     * Get 修复中数量 
     * @return FixingCount 修复中数量
     */
    public Long getFixingCount() {
        return this.FixingCount;
    }

    /**
     * Set 修复中数量
     * @param FixingCount 修复中数量
     */
    public void setFixingCount(Long FixingCount) {
        this.FixingCount = FixingCount;
    }

    /**
     * Get 排队中数量（等待下发或等待快照创建） 
     * @return QueueCount 排队中数量（等待下发或等待快照创建）
     */
    public Long getQueueCount() {
        return this.QueueCount;
    }

    /**
     * Set 排队中数量（等待下发或等待快照创建）
     * @param QueueCount 排队中数量（等待下发或等待快照创建）
     */
    public void setQueueCount(Long QueueCount) {
        this.QueueCount = QueueCount;
    }

    /**
     * Get 修复进度百分比
取值范围：[0, 100]
补充说明：计算方式为(SuccessCount+FailCount)/AssetCount×100 
     * @return Progress 修复进度百分比
取值范围：[0, 100]
补充说明：计算方式为(SuccessCount+FailCount)/AssetCount×100
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 修复进度百分比
取值范围：[0, 100]
补充说明：计算方式为(SuccessCount+FailCount)/AssetCount×100
     * @param Progress 修复进度百分比
取值范围：[0, 100]
补充说明：计算方式为(SuccessCount+FailCount)/AssetCount×100
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 修复成功的漏洞数 
     * @return SuccessVulCount 修复成功的漏洞数
     */
    public Long getSuccessVulCount() {
        return this.SuccessVulCount;
    }

    /**
     * Set 修复成功的漏洞数
     * @param SuccessVulCount 修复成功的漏洞数
     */
    public void setSuccessVulCount(Long SuccessVulCount) {
        this.SuccessVulCount = SuccessVulCount;
    }

    /**
     * Get 修复失败的漏洞数 
     * @return FailVulCount 修复失败的漏洞数
     */
    public Long getFailVulCount() {
        return this.FailVulCount;
    }

    /**
     * Set 修复失败的漏洞数
     * @param FailVulCount 修复失败的漏洞数
     */
    public void setFailVulCount(Long FailVulCount) {
        this.FailVulCount = FailVulCount;
    }

    /**
     * Get 修复的漏洞名称列表 
     * @return VulNames 修复的漏洞名称列表
     */
    public String [] getVulNames() {
        return this.VulNames;
    }

    /**
     * Set 修复的漏洞名称列表
     * @param VulNames 修复的漏洞名称列表
     */
    public void setVulNames(String [] VulNames) {
        this.VulNames = VulNames;
    }

    /**
     * Get 修复启动时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式） 
     * @return StartTime 修复启动时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 修复启动时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     * @param StartTime 修复启动时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 修复结束时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式） 
     * @return EndTime 修复结束时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 修复结束时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     * @param EndTime 修复结束时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 漏洞维度修复状态列表，每个漏洞的修复状态详情 
     * @return VulFixStatusList 漏洞维度修复状态列表，每个漏洞的修复状态详情
     */
    public VulFixStatusItem [] getVulFixStatusList() {
        return this.VulFixStatusList;
    }

    /**
     * Set 漏洞维度修复状态列表，每个漏洞的修复状态详情
     * @param VulFixStatusList 漏洞维度修复状态列表，每个漏洞的修复状态详情
     */
    public void setVulFixStatusList(VulFixStatusItem [] VulFixStatusList) {
        this.VulFixStatusList = VulFixStatusList;
    }

    public VulFixTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulFixTaskInfo(VulFixTaskInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.FixStatus != null) {
            this.FixStatus = new Long(source.FixStatus);
        }
        if (source.AssetCount != null) {
            this.AssetCount = new Long(source.AssetCount);
        }
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.FailCount != null) {
            this.FailCount = new Long(source.FailCount);
        }
        if (source.FixingCount != null) {
            this.FixingCount = new Long(source.FixingCount);
        }
        if (source.QueueCount != null) {
            this.QueueCount = new Long(source.QueueCount);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.SuccessVulCount != null) {
            this.SuccessVulCount = new Long(source.SuccessVulCount);
        }
        if (source.FailVulCount != null) {
            this.FailVulCount = new Long(source.FailVulCount);
        }
        if (source.VulNames != null) {
            this.VulNames = new String[source.VulNames.length];
            for (int i = 0; i < source.VulNames.length; i++) {
                this.VulNames[i] = new String(source.VulNames[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.VulFixStatusList != null) {
            this.VulFixStatusList = new VulFixStatusItem[source.VulFixStatusList.length];
            for (int i = 0; i < source.VulFixStatusList.length; i++) {
                this.VulFixStatusList[i] = new VulFixStatusItem(source.VulFixStatusList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "FixStatus", this.FixStatus);
        this.setParamSimple(map, prefix + "AssetCount", this.AssetCount);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "FailCount", this.FailCount);
        this.setParamSimple(map, prefix + "FixingCount", this.FixingCount);
        this.setParamSimple(map, prefix + "QueueCount", this.QueueCount);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "SuccessVulCount", this.SuccessVulCount);
        this.setParamSimple(map, prefix + "FailVulCount", this.FailVulCount);
        this.setParamArraySimple(map, prefix + "VulNames.", this.VulNames);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "VulFixStatusList.", this.VulFixStatusList);

    }
}

