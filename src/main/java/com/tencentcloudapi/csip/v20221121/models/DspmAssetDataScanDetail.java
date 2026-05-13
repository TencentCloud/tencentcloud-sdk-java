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
    * 识别任务状态 0:未识别 1:识别中 2:识别终止 3:识别成功 4:识别失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 识别任务状态 0:未识别 1:识别中 2:识别终止 3:识别成功 4:识别失败
    */
    @SerializedName("StatusInfo")
    @Expose
    private String StatusInfo;

    /**
    * 识别进度
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
    * 最近扫描时间
    */
    @SerializedName("LatestScanTime")
    @Expose
    private String LatestScanTime;

    /**
    * 识别失败信息
    */
    @SerializedName("ErrorInfo")
    @Expose
    private String ErrorInfo;

    /**
    * 数据库数量
    */
    @SerializedName("DbCount")
    @Expose
    private Long DbCount;

    /**
    * 分类id集合
    */
    @SerializedName("CategoryIds")
    @Expose
    private Long [] CategoryIds;

    /**
    * 分类名称集合
    */
    @SerializedName("CategoryNames")
    @Expose
    private String [] CategoryNames;

    /**
    * 扫描任务配置
    */
    @SerializedName("TaskConfig")
    @Expose
    private DspmSensitiveScanTaskConfig TaskConfig;

    /**
    * 识别结果分类详情
    */
    @SerializedName("CategoryDetails")
    @Expose
    private DspmIdentifyCategoryDetail [] CategoryDetails;

    /**
     * Get 识别任务状态 0:未识别 1:识别中 2:识别终止 3:识别成功 4:识别失败 
     * @return Status 识别任务状态 0:未识别 1:识别中 2:识别终止 3:识别成功 4:识别失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 识别任务状态 0:未识别 1:识别中 2:识别终止 3:识别成功 4:识别失败
     * @param Status 识别任务状态 0:未识别 1:识别中 2:识别终止 3:识别成功 4:识别失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 识别任务状态 0:未识别 1:识别中 2:识别终止 3:识别成功 4:识别失败 
     * @return StatusInfo 识别任务状态 0:未识别 1:识别中 2:识别终止 3:识别成功 4:识别失败
     */
    public String getStatusInfo() {
        return this.StatusInfo;
    }

    /**
     * Set 识别任务状态 0:未识别 1:识别中 2:识别终止 3:识别成功 4:识别失败
     * @param StatusInfo 识别任务状态 0:未识别 1:识别中 2:识别终止 3:识别成功 4:识别失败
     */
    public void setStatusInfo(String StatusInfo) {
        this.StatusInfo = StatusInfo;
    }

    /**
     * Get 识别进度 
     * @return Progress 识别进度
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set 识别进度
     * @param Progress 识别进度
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 最近扫描时间 
     * @return LatestScanTime 最近扫描时间
     */
    public String getLatestScanTime() {
        return this.LatestScanTime;
    }

    /**
     * Set 最近扫描时间
     * @param LatestScanTime 最近扫描时间
     */
    public void setLatestScanTime(String LatestScanTime) {
        this.LatestScanTime = LatestScanTime;
    }

    /**
     * Get 识别失败信息 
     * @return ErrorInfo 识别失败信息
     */
    public String getErrorInfo() {
        return this.ErrorInfo;
    }

    /**
     * Set 识别失败信息
     * @param ErrorInfo 识别失败信息
     */
    public void setErrorInfo(String ErrorInfo) {
        this.ErrorInfo = ErrorInfo;
    }

    /**
     * Get 数据库数量 
     * @return DbCount 数据库数量
     */
    public Long getDbCount() {
        return this.DbCount;
    }

    /**
     * Set 数据库数量
     * @param DbCount 数据库数量
     */
    public void setDbCount(Long DbCount) {
        this.DbCount = DbCount;
    }

    /**
     * Get 分类id集合 
     * @return CategoryIds 分类id集合
     */
    public Long [] getCategoryIds() {
        return this.CategoryIds;
    }

    /**
     * Set 分类id集合
     * @param CategoryIds 分类id集合
     */
    public void setCategoryIds(Long [] CategoryIds) {
        this.CategoryIds = CategoryIds;
    }

    /**
     * Get 分类名称集合 
     * @return CategoryNames 分类名称集合
     */
    public String [] getCategoryNames() {
        return this.CategoryNames;
    }

    /**
     * Set 分类名称集合
     * @param CategoryNames 分类名称集合
     */
    public void setCategoryNames(String [] CategoryNames) {
        this.CategoryNames = CategoryNames;
    }

    /**
     * Get 扫描任务配置 
     * @return TaskConfig 扫描任务配置
     */
    public DspmSensitiveScanTaskConfig getTaskConfig() {
        return this.TaskConfig;
    }

    /**
     * Set 扫描任务配置
     * @param TaskConfig 扫描任务配置
     */
    public void setTaskConfig(DspmSensitiveScanTaskConfig TaskConfig) {
        this.TaskConfig = TaskConfig;
    }

    /**
     * Get 识别结果分类详情 
     * @return CategoryDetails 识别结果分类详情
     */
    public DspmIdentifyCategoryDetail [] getCategoryDetails() {
        return this.CategoryDetails;
    }

    /**
     * Set 识别结果分类详情
     * @param CategoryDetails 识别结果分类详情
     */
    public void setCategoryDetails(DspmIdentifyCategoryDetail [] CategoryDetails) {
        this.CategoryDetails = CategoryDetails;
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

    }
}

