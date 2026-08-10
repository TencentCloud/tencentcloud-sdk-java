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

public class VulFixTaskItem extends AbstractModel {

    /**
    * 修复任务主键ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 任务ID，用于交互的hash标识
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 任务JobId，对应后台任务系统的任务ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 修复的漏洞ID列表
    */
    @SerializedName("VulIds")
    @Expose
    private Long [] VulIds;

    /**
    * 修复的KB补丁ID列表
    */
    @SerializedName("KBIds")
    @Expose
    private Long [] KBIds;

    /**
    * 修复资产总数
    */
    @SerializedName("AssetCount")
    @Expose
    private Long AssetCount;

    /**
    * 修复成功的主机数
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * 修复失败的主机数
    */
    @SerializedName("FailCount")
    @Expose
    private Long FailCount;

    /**
    * 修复进度百分比
取值范围：[0, 100]
补充说明：计算方式为(SuccessCount+FailCount)/AssetCount×100
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 修复任务用户数
    */
    @SerializedName("TargetAppIdsCount")
    @Expose
    private Long TargetAppIdsCount;

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
    * 最大修复时间
单位：秒
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

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
    * 记录创建时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 修复的漏洞名称列表，便于列表页直接展示
    */
    @SerializedName("VulNames")
    @Expose
    private String [] VulNames;

    /**
    * 漏洞类型列表
枚举值：
LINUX：Linux软件漏洞
WINDOWS：Windows系统补丁漏洞
WEB_CMS：Web-CMS漏洞
APPLICATION：应用漏洞
EMERGENCY：应急漏洞
    */
    @SerializedName("VulCategory")
    @Expose
    private String [] VulCategory;

    /**
    * 创建者AppId
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

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
     * Get 任务ID，用于交互的hash标识 
     * @return TaskId 任务ID，用于交互的hash标识
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID，用于交互的hash标识
     * @param TaskId 任务ID，用于交互的hash标识
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务JobId，对应后台任务系统的任务ID 
     * @return JobId 任务JobId，对应后台任务系统的任务ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 任务JobId，对应后台任务系统的任务ID
     * @param JobId 任务JobId，对应后台任务系统的任务ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 修复的漏洞ID列表 
     * @return VulIds 修复的漏洞ID列表
     */
    public Long [] getVulIds() {
        return this.VulIds;
    }

    /**
     * Set 修复的漏洞ID列表
     * @param VulIds 修复的漏洞ID列表
     */
    public void setVulIds(Long [] VulIds) {
        this.VulIds = VulIds;
    }

    /**
     * Get 修复的KB补丁ID列表 
     * @return KBIds 修复的KB补丁ID列表
     */
    public Long [] getKBIds() {
        return this.KBIds;
    }

    /**
     * Set 修复的KB补丁ID列表
     * @param KBIds 修复的KB补丁ID列表
     */
    public void setKBIds(Long [] KBIds) {
        this.KBIds = KBIds;
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
     * Get 修复成功的主机数 
     * @return SuccessCount 修复成功的主机数
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set 修复成功的主机数
     * @param SuccessCount 修复成功的主机数
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get 修复失败的主机数 
     * @return FailCount 修复失败的主机数
     */
    public Long getFailCount() {
        return this.FailCount;
    }

    /**
     * Set 修复失败的主机数
     * @param FailCount 修复失败的主机数
     */
    public void setFailCount(Long FailCount) {
        this.FailCount = FailCount;
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
     * Get 修复任务用户数 
     * @return TargetAppIdsCount 修复任务用户数
     */
    public Long getTargetAppIdsCount() {
        return this.TargetAppIdsCount;
    }

    /**
     * Set 修复任务用户数
     * @param TargetAppIdsCount 修复任务用户数
     */
    public void setTargetAppIdsCount(Long TargetAppIdsCount) {
        this.TargetAppIdsCount = TargetAppIdsCount;
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
     * Get 最大修复时间
单位：秒 
     * @return Timeout 最大修复时间
单位：秒
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 最大修复时间
单位：秒
     * @param Timeout 最大修复时间
单位：秒
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
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
     * Get 记录创建时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式） 
     * @return CreateTime 记录创建时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 记录创建时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     * @param CreateTime 记录创建时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修复的漏洞名称列表，便于列表页直接展示 
     * @return VulNames 修复的漏洞名称列表，便于列表页直接展示
     */
    public String [] getVulNames() {
        return this.VulNames;
    }

    /**
     * Set 修复的漏洞名称列表，便于列表页直接展示
     * @param VulNames 修复的漏洞名称列表，便于列表页直接展示
     */
    public void setVulNames(String [] VulNames) {
        this.VulNames = VulNames;
    }

    /**
     * Get 漏洞类型列表
枚举值：
LINUX：Linux软件漏洞
WINDOWS：Windows系统补丁漏洞
WEB_CMS：Web-CMS漏洞
APPLICATION：应用漏洞
EMERGENCY：应急漏洞 
     * @return VulCategory 漏洞类型列表
枚举值：
LINUX：Linux软件漏洞
WINDOWS：Windows系统补丁漏洞
WEB_CMS：Web-CMS漏洞
APPLICATION：应用漏洞
EMERGENCY：应急漏洞
     */
    public String [] getVulCategory() {
        return this.VulCategory;
    }

    /**
     * Set 漏洞类型列表
枚举值：
LINUX：Linux软件漏洞
WINDOWS：Windows系统补丁漏洞
WEB_CMS：Web-CMS漏洞
APPLICATION：应用漏洞
EMERGENCY：应急漏洞
     * @param VulCategory 漏洞类型列表
枚举值：
LINUX：Linux软件漏洞
WINDOWS：Windows系统补丁漏洞
WEB_CMS：Web-CMS漏洞
APPLICATION：应用漏洞
EMERGENCY：应急漏洞
     */
    public void setVulCategory(String [] VulCategory) {
        this.VulCategory = VulCategory;
    }

    /**
     * Get 创建者AppId 
     * @return AppId 创建者AppId
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 创建者AppId
     * @param AppId 创建者AppId
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    public VulFixTaskItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulFixTaskItem(VulFixTaskItem source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.VulIds != null) {
            this.VulIds = new Long[source.VulIds.length];
            for (int i = 0; i < source.VulIds.length; i++) {
                this.VulIds[i] = new Long(source.VulIds[i]);
            }
        }
        if (source.KBIds != null) {
            this.KBIds = new Long[source.KBIds.length];
            for (int i = 0; i < source.KBIds.length; i++) {
                this.KBIds[i] = new Long(source.KBIds[i]);
            }
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
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.TargetAppIdsCount != null) {
            this.TargetAppIdsCount = new Long(source.TargetAppIdsCount);
        }
        if (source.FixStatus != null) {
            this.FixStatus = new Long(source.FixStatus);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.VulNames != null) {
            this.VulNames = new String[source.VulNames.length];
            for (int i = 0; i < source.VulNames.length; i++) {
                this.VulNames[i] = new String(source.VulNames[i]);
            }
        }
        if (source.VulCategory != null) {
            this.VulCategory = new String[source.VulCategory.length];
            for (int i = 0; i < source.VulCategory.length; i++) {
                this.VulCategory[i] = new String(source.VulCategory[i]);
            }
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamArraySimple(map, prefix + "VulIds.", this.VulIds);
        this.setParamArraySimple(map, prefix + "KBIds.", this.KBIds);
        this.setParamSimple(map, prefix + "AssetCount", this.AssetCount);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "FailCount", this.FailCount);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "TargetAppIdsCount", this.TargetAppIdsCount);
        this.setParamSimple(map, prefix + "FixStatus", this.FixStatus);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArraySimple(map, prefix + "VulNames.", this.VulNames);
        this.setParamArraySimple(map, prefix + "VulCategory.", this.VulCategory);
        this.setParamSimple(map, prefix + "AppId", this.AppId);

    }
}

