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

public class DspmAssetDataScanDetail extends AbstractModel {

    /**
    * <p>识别任务状态 0:未识别 1:识别中 2:识别终止 3:识别成功 4:识别失败</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>识别任务状态 0:未识别 1:识别中 2:识别终止 3:识别成功 4:识别失败</p>
    */
    @SerializedName("StatusInfo")
    @Expose
    private String StatusInfo;

    /**
    * <p>识别进度</p>
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
    * <p>最近扫描时间</p>
    */
    @SerializedName("LatestScanTime")
    @Expose
    private String LatestScanTime;

    /**
    * <p>识别失败信息</p>
    */
    @SerializedName("ErrorInfo")
    @Expose
    private String ErrorInfo;

    /**
    * <p>数据库数量</p>
    */
    @SerializedName("DbCount")
    @Expose
    private Long DbCount;

    /**
    * <p>分类id集合</p>
    */
    @SerializedName("CategoryIds")
    @Expose
    private Long [] CategoryIds;

    /**
    * <p>分类名称集合</p>
    */
    @SerializedName("CategoryNames")
    @Expose
    private String [] CategoryNames;

    /**
    * <p>扫描任务配置</p>
    */
    @SerializedName("TaskConfig")
    @Expose
    private DspmSensitiveScanTaskConfig TaskConfig;

    /**
    * <p>识别结果分类详情</p>
    */
    @SerializedName("CategoryDetails")
    @Expose
    private DspmIdentifyCategoryDetail [] CategoryDetails;

    /**
    * <p>任务ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
     * Get <p>识别任务状态 0:未识别 1:识别中 2:识别终止 3:识别成功 4:识别失败</p> 
     * @return Status <p>识别任务状态 0:未识别 1:识别中 2:识别终止 3:识别成功 4:识别失败</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>识别任务状态 0:未识别 1:识别中 2:识别终止 3:识别成功 4:识别失败</p>
     * @param Status <p>识别任务状态 0:未识别 1:识别中 2:识别终止 3:识别成功 4:识别失败</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>识别任务状态 0:未识别 1:识别中 2:识别终止 3:识别成功 4:识别失败</p> 
     * @return StatusInfo <p>识别任务状态 0:未识别 1:识别中 2:识别终止 3:识别成功 4:识别失败</p>
     */
    public String getStatusInfo() {
        return this.StatusInfo;
    }

    /**
     * Set <p>识别任务状态 0:未识别 1:识别中 2:识别终止 3:识别成功 4:识别失败</p>
     * @param StatusInfo <p>识别任务状态 0:未识别 1:识别中 2:识别终止 3:识别成功 4:识别失败</p>
     */
    public void setStatusInfo(String StatusInfo) {
        this.StatusInfo = StatusInfo;
    }

    /**
     * Get <p>识别进度</p> 
     * @return Progress <p>识别进度</p>
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set <p>识别进度</p>
     * @param Progress <p>识别进度</p>
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    /**
     * Get <p>最近扫描时间</p> 
     * @return LatestScanTime <p>最近扫描时间</p>
     */
    public String getLatestScanTime() {
        return this.LatestScanTime;
    }

    /**
     * Set <p>最近扫描时间</p>
     * @param LatestScanTime <p>最近扫描时间</p>
     */
    public void setLatestScanTime(String LatestScanTime) {
        this.LatestScanTime = LatestScanTime;
    }

    /**
     * Get <p>识别失败信息</p> 
     * @return ErrorInfo <p>识别失败信息</p>
     */
    public String getErrorInfo() {
        return this.ErrorInfo;
    }

    /**
     * Set <p>识别失败信息</p>
     * @param ErrorInfo <p>识别失败信息</p>
     */
    public void setErrorInfo(String ErrorInfo) {
        this.ErrorInfo = ErrorInfo;
    }

    /**
     * Get <p>数据库数量</p> 
     * @return DbCount <p>数据库数量</p>
     */
    public Long getDbCount() {
        return this.DbCount;
    }

    /**
     * Set <p>数据库数量</p>
     * @param DbCount <p>数据库数量</p>
     */
    public void setDbCount(Long DbCount) {
        this.DbCount = DbCount;
    }

    /**
     * Get <p>分类id集合</p> 
     * @return CategoryIds <p>分类id集合</p>
     */
    public Long [] getCategoryIds() {
        return this.CategoryIds;
    }

    /**
     * Set <p>分类id集合</p>
     * @param CategoryIds <p>分类id集合</p>
     */
    public void setCategoryIds(Long [] CategoryIds) {
        this.CategoryIds = CategoryIds;
    }

    /**
     * Get <p>分类名称集合</p> 
     * @return CategoryNames <p>分类名称集合</p>
     */
    public String [] getCategoryNames() {
        return this.CategoryNames;
    }

    /**
     * Set <p>分类名称集合</p>
     * @param CategoryNames <p>分类名称集合</p>
     */
    public void setCategoryNames(String [] CategoryNames) {
        this.CategoryNames = CategoryNames;
    }

    /**
     * Get <p>扫描任务配置</p> 
     * @return TaskConfig <p>扫描任务配置</p>
     */
    public DspmSensitiveScanTaskConfig getTaskConfig() {
        return this.TaskConfig;
    }

    /**
     * Set <p>扫描任务配置</p>
     * @param TaskConfig <p>扫描任务配置</p>
     */
    public void setTaskConfig(DspmSensitiveScanTaskConfig TaskConfig) {
        this.TaskConfig = TaskConfig;
    }

    /**
     * Get <p>识别结果分类详情</p> 
     * @return CategoryDetails <p>识别结果分类详情</p>
     */
    public DspmIdentifyCategoryDetail [] getCategoryDetails() {
        return this.CategoryDetails;
    }

    /**
     * Set <p>识别结果分类详情</p>
     * @param CategoryDetails <p>识别结果分类详情</p>
     */
    public void setCategoryDetails(DspmIdentifyCategoryDetail [] CategoryDetails) {
        this.CategoryDetails = CategoryDetails;
    }

    /**
     * Get <p>任务ID</p> 
     * @return TaskId <p>任务ID</p>
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务ID</p>
     * @param TaskId <p>任务ID</p>
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    public DspmAssetDataScanDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmAssetDataScanDetail(DspmAssetDataScanDetail source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusInfo != null) {
            this.StatusInfo = new String(source.StatusInfo);
        }
        if (source.Progress != null) {
            this.Progress = new Float(source.Progress);
        }
        if (source.LatestScanTime != null) {
            this.LatestScanTime = new String(source.LatestScanTime);
        }
        if (source.ErrorInfo != null) {
            this.ErrorInfo = new String(source.ErrorInfo);
        }
        if (source.DbCount != null) {
            this.DbCount = new Long(source.DbCount);
        }
        if (source.CategoryIds != null) {
            this.CategoryIds = new Long[source.CategoryIds.length];
            for (int i = 0; i < source.CategoryIds.length; i++) {
                this.CategoryIds[i] = new Long(source.CategoryIds[i]);
            }
        }
        if (source.CategoryNames != null) {
            this.CategoryNames = new String[source.CategoryNames.length];
            for (int i = 0; i < source.CategoryNames.length; i++) {
                this.CategoryNames[i] = new String(source.CategoryNames[i]);
            }
        }
        if (source.TaskConfig != null) {
            this.TaskConfig = new DspmSensitiveScanTaskConfig(source.TaskConfig);
        }
        if (source.CategoryDetails != null) {
            this.CategoryDetails = new DspmIdentifyCategoryDetail[source.CategoryDetails.length];
            for (int i = 0; i < source.CategoryDetails.length; i++) {
                this.CategoryDetails[i] = new DspmIdentifyCategoryDetail(source.CategoryDetails[i]);
            }
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusInfo", this.StatusInfo);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "LatestScanTime", this.LatestScanTime);
        this.setParamSimple(map, prefix + "ErrorInfo", this.ErrorInfo);
        this.setParamSimple(map, prefix + "DbCount", this.DbCount);
        this.setParamArraySimple(map, prefix + "CategoryIds.", this.CategoryIds);
        this.setParamArraySimple(map, prefix + "CategoryNames.", this.CategoryNames);
        this.setParamObj(map, prefix + "TaskConfig.", this.TaskConfig);
        this.setParamArrayObj(map, prefix + "CategoryDetails.", this.CategoryDetails);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);

    }
}

