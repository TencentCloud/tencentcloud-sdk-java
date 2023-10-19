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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspaCOSDiscoveryTaskResult extends AbstractModel {

    /**
    * 扫描bucket结果ID
    */
    @SerializedName("BucketResultId")
    @Expose
    private Long BucketResultId;

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 扫描任务最新一次扫描结果ID
    */
    @SerializedName("ResultId")
    @Expose
    private Long ResultId;

    /**
    * 数据源ID
    */
    @SerializedName("DataSourceId")
    @Expose
    private String DataSourceId;

    /**
    * 桶名称
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * 总文件数
    */
    @SerializedName("TotalFiles")
    @Expose
    private Long TotalFiles;

    /**
    * 被识别出的敏感数据数
    */
    @SerializedName("SensitiveDataNums")
    @Expose
    private Long SensitiveDataNums;

    /**
    * Bucket扫描的结束时间，格式如：2006-01-02 15:04:05
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataSourceName")
    @Expose
    private String DataSourceName;

    /**
    * Bucket扫描状态，0待扫描 1扫描中 2扫描终止 3扫描成功 4扫描失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Bucket扫描结果错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorInfo")
    @Expose
    private String ErrorInfo;

    /**
    * 资源所在地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * 是否超额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OverSize")
    @Expose
    private String OverSize;

    /**
     * Get 扫描bucket结果ID 
     * @return BucketResultId 扫描bucket结果ID
     */
    public Long getBucketResultId() {
        return this.BucketResultId;
    }

    /**
     * Set 扫描bucket结果ID
     * @param BucketResultId 扫描bucket结果ID
     */
    public void setBucketResultId(Long BucketResultId) {
        this.BucketResultId = BucketResultId;
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
     * Get 任务名称 
     * @return TaskName 任务名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
     * @param TaskName 任务名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 扫描任务最新一次扫描结果ID 
     * @return ResultId 扫描任务最新一次扫描结果ID
     */
    public Long getResultId() {
        return this.ResultId;
    }

    /**
     * Set 扫描任务最新一次扫描结果ID
     * @param ResultId 扫描任务最新一次扫描结果ID
     */
    public void setResultId(Long ResultId) {
        this.ResultId = ResultId;
    }

    /**
     * Get 数据源ID 
     * @return DataSourceId 数据源ID
     */
    public String getDataSourceId() {
        return this.DataSourceId;
    }

    /**
     * Set 数据源ID
     * @param DataSourceId 数据源ID
     */
    public void setDataSourceId(String DataSourceId) {
        this.DataSourceId = DataSourceId;
    }

    /**
     * Get 桶名称 
     * @return BucketName 桶名称
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set 桶名称
     * @param BucketName 桶名称
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get 总文件数 
     * @return TotalFiles 总文件数
     */
    public Long getTotalFiles() {
        return this.TotalFiles;
    }

    /**
     * Set 总文件数
     * @param TotalFiles 总文件数
     */
    public void setTotalFiles(Long TotalFiles) {
        this.TotalFiles = TotalFiles;
    }

    /**
     * Get 被识别出的敏感数据数 
     * @return SensitiveDataNums 被识别出的敏感数据数
     */
    public Long getSensitiveDataNums() {
        return this.SensitiveDataNums;
    }

    /**
     * Set 被识别出的敏感数据数
     * @param SensitiveDataNums 被识别出的敏感数据数
     */
    public void setSensitiveDataNums(Long SensitiveDataNums) {
        this.SensitiveDataNums = SensitiveDataNums;
    }

    /**
     * Get Bucket扫描的结束时间，格式如：2006-01-02 15:04:05 
     * @return EndTime Bucket扫描的结束时间，格式如：2006-01-02 15:04:05
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Bucket扫描的结束时间，格式如：2006-01-02 15:04:05
     * @param EndTime Bucket扫描的结束时间，格式如：2006-01-02 15:04:05
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 数据源名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataSourceName 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataSourceName() {
        return this.DataSourceName;
    }

    /**
     * Set 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataSourceName 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataSourceName(String DataSourceName) {
        this.DataSourceName = DataSourceName;
    }

    /**
     * Get Bucket扫描状态，0待扫描 1扫描中 2扫描终止 3扫描成功 4扫描失败 
     * @return Status Bucket扫描状态，0待扫描 1扫描中 2扫描终止 3扫描成功 4扫描失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Bucket扫描状态，0待扫描 1扫描中 2扫描终止 3扫描成功 4扫描失败
     * @param Status Bucket扫描状态，0待扫描 1扫描中 2扫描终止 3扫描成功 4扫描失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Bucket扫描结果错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorInfo Bucket扫描结果错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorInfo() {
        return this.ErrorInfo;
    }

    /**
     * Set Bucket扫描结果错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorInfo Bucket扫描结果错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorInfo(String ErrorInfo) {
        this.ErrorInfo = ErrorInfo;
    }

    /**
     * Get 资源所在地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceRegion 资源所在地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set 资源所在地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceRegion 资源所在地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get 是否超额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OverSize 是否超额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOverSize() {
        return this.OverSize;
    }

    /**
     * Set 是否超额
注意：此字段可能返回 null，表示取不到有效值。
     * @param OverSize 是否超额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOverSize(String OverSize) {
        this.OverSize = OverSize;
    }

    public DspaCOSDiscoveryTaskResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspaCOSDiscoveryTaskResult(DspaCOSDiscoveryTaskResult source) {
        if (source.BucketResultId != null) {
            this.BucketResultId = new Long(source.BucketResultId);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.ResultId != null) {
            this.ResultId = new Long(source.ResultId);
        }
        if (source.DataSourceId != null) {
            this.DataSourceId = new String(source.DataSourceId);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.TotalFiles != null) {
            this.TotalFiles = new Long(source.TotalFiles);
        }
        if (source.SensitiveDataNums != null) {
            this.SensitiveDataNums = new Long(source.SensitiveDataNums);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.DataSourceName != null) {
            this.DataSourceName = new String(source.DataSourceName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ErrorInfo != null) {
            this.ErrorInfo = new String(source.ErrorInfo);
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
        if (source.OverSize != null) {
            this.OverSize = new String(source.OverSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BucketResultId", this.BucketResultId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "ResultId", this.ResultId);
        this.setParamSimple(map, prefix + "DataSourceId", this.DataSourceId);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "TotalFiles", this.TotalFiles);
        this.setParamSimple(map, prefix + "SensitiveDataNums", this.SensitiveDataNums);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "DataSourceName", this.DataSourceName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrorInfo", this.ErrorInfo);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "OverSize", this.OverSize);

    }
}

