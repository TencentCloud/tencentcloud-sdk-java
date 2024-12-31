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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SparkQuery extends AbstractModel {

    /**
    * 执行语句
    */
    @SerializedName("Statement")
    @Expose
    private String Statement;

    /**
    * 执行时长（单位毫秒）
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 执行状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 查询ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 扫描分区数
    */
    @SerializedName("ScanPartitionNum")
    @Expose
    private Long ScanPartitionNum;

    /**
    * 扫描总行数
    */
    @SerializedName("ScanRowNum")
    @Expose
    private Long ScanRowNum;

    /**
    * 扫描总文件数
    */
    @SerializedName("ScanFileNum")
    @Expose
    private Long ScanFileNum;

    /**
    * 查询扫描总数据量(单位B)
    */
    @SerializedName("ScanTotalData")
    @Expose
    private Long ScanTotalData;

    /**
    * 应用ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationId")
    @Expose
    private String [] ApplicationId;

    /**
    * 输出总行数
    */
    @SerializedName("OutputRowNum")
    @Expose
    private Long OutputRowNum;

    /**
    * 输出总文件数
    */
    @SerializedName("OutputFileNum")
    @Expose
    private Long OutputFileNum;

    /**
    * 输出分区数
    */
    @SerializedName("OutputPartitionNum")
    @Expose
    private Long OutputPartitionNum;

    /**
    * 输出总数据量（单位B）
    */
    @SerializedName("OutputTotalData")
    @Expose
    private Long OutputTotalData;

    /**
    * 开始时间
    */
    @SerializedName("BeginTime")
    @Expose
    private Long BeginTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get 执行语句 
     * @return Statement 执行语句
     */
    public String getStatement() {
        return this.Statement;
    }

    /**
     * Set 执行语句
     * @param Statement 执行语句
     */
    public void setStatement(String Statement) {
        this.Statement = Statement;
    }

    /**
     * Get 执行时长（单位毫秒） 
     * @return Duration 执行时长（单位毫秒）
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 执行时长（单位毫秒）
     * @param Duration 执行时长（单位毫秒）
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 执行状态 
     * @return Status 执行状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 执行状态
     * @param Status 执行状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 查询ID 
     * @return Id 查询ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 查询ID
     * @param Id 查询ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 扫描分区数 
     * @return ScanPartitionNum 扫描分区数
     */
    public Long getScanPartitionNum() {
        return this.ScanPartitionNum;
    }

    /**
     * Set 扫描分区数
     * @param ScanPartitionNum 扫描分区数
     */
    public void setScanPartitionNum(Long ScanPartitionNum) {
        this.ScanPartitionNum = ScanPartitionNum;
    }

    /**
     * Get 扫描总行数 
     * @return ScanRowNum 扫描总行数
     */
    public Long getScanRowNum() {
        return this.ScanRowNum;
    }

    /**
     * Set 扫描总行数
     * @param ScanRowNum 扫描总行数
     */
    public void setScanRowNum(Long ScanRowNum) {
        this.ScanRowNum = ScanRowNum;
    }

    /**
     * Get 扫描总文件数 
     * @return ScanFileNum 扫描总文件数
     */
    public Long getScanFileNum() {
        return this.ScanFileNum;
    }

    /**
     * Set 扫描总文件数
     * @param ScanFileNum 扫描总文件数
     */
    public void setScanFileNum(Long ScanFileNum) {
        this.ScanFileNum = ScanFileNum;
    }

    /**
     * Get 查询扫描总数据量(单位B) 
     * @return ScanTotalData 查询扫描总数据量(单位B)
     */
    public Long getScanTotalData() {
        return this.ScanTotalData;
    }

    /**
     * Set 查询扫描总数据量(单位B)
     * @param ScanTotalData 查询扫描总数据量(单位B)
     */
    public void setScanTotalData(Long ScanTotalData) {
        this.ScanTotalData = ScanTotalData;
    }

    /**
     * Get 应用ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationId 应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationId 应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationId(String [] ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 输出总行数 
     * @return OutputRowNum 输出总行数
     */
    public Long getOutputRowNum() {
        return this.OutputRowNum;
    }

    /**
     * Set 输出总行数
     * @param OutputRowNum 输出总行数
     */
    public void setOutputRowNum(Long OutputRowNum) {
        this.OutputRowNum = OutputRowNum;
    }

    /**
     * Get 输出总文件数 
     * @return OutputFileNum 输出总文件数
     */
    public Long getOutputFileNum() {
        return this.OutputFileNum;
    }

    /**
     * Set 输出总文件数
     * @param OutputFileNum 输出总文件数
     */
    public void setOutputFileNum(Long OutputFileNum) {
        this.OutputFileNum = OutputFileNum;
    }

    /**
     * Get 输出分区数 
     * @return OutputPartitionNum 输出分区数
     */
    public Long getOutputPartitionNum() {
        return this.OutputPartitionNum;
    }

    /**
     * Set 输出分区数
     * @param OutputPartitionNum 输出分区数
     */
    public void setOutputPartitionNum(Long OutputPartitionNum) {
        this.OutputPartitionNum = OutputPartitionNum;
    }

    /**
     * Get 输出总数据量（单位B） 
     * @return OutputTotalData 输出总数据量（单位B）
     */
    public Long getOutputTotalData() {
        return this.OutputTotalData;
    }

    /**
     * Set 输出总数据量（单位B）
     * @param OutputTotalData 输出总数据量（单位B）
     */
    public void setOutputTotalData(Long OutputTotalData) {
        this.OutputTotalData = OutputTotalData;
    }

    /**
     * Get 开始时间 
     * @return BeginTime 开始时间
     */
    public Long getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 开始时间
     * @param BeginTime 开始时间
     */
    public void setBeginTime(Long BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    public SparkQuery() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SparkQuery(SparkQuery source) {
        if (source.Statement != null) {
            this.Statement = new String(source.Statement);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.ScanPartitionNum != null) {
            this.ScanPartitionNum = new Long(source.ScanPartitionNum);
        }
        if (source.ScanRowNum != null) {
            this.ScanRowNum = new Long(source.ScanRowNum);
        }
        if (source.ScanFileNum != null) {
            this.ScanFileNum = new Long(source.ScanFileNum);
        }
        if (source.ScanTotalData != null) {
            this.ScanTotalData = new Long(source.ScanTotalData);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String[source.ApplicationId.length];
            for (int i = 0; i < source.ApplicationId.length; i++) {
                this.ApplicationId[i] = new String(source.ApplicationId[i]);
            }
        }
        if (source.OutputRowNum != null) {
            this.OutputRowNum = new Long(source.OutputRowNum);
        }
        if (source.OutputFileNum != null) {
            this.OutputFileNum = new Long(source.OutputFileNum);
        }
        if (source.OutputPartitionNum != null) {
            this.OutputPartitionNum = new Long(source.OutputPartitionNum);
        }
        if (source.OutputTotalData != null) {
            this.OutputTotalData = new Long(source.OutputTotalData);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new Long(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Statement", this.Statement);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ScanPartitionNum", this.ScanPartitionNum);
        this.setParamSimple(map, prefix + "ScanRowNum", this.ScanRowNum);
        this.setParamSimple(map, prefix + "ScanFileNum", this.ScanFileNum);
        this.setParamSimple(map, prefix + "ScanTotalData", this.ScanTotalData);
        this.setParamArraySimple(map, prefix + "ApplicationId.", this.ApplicationId);
        this.setParamSimple(map, prefix + "OutputRowNum", this.OutputRowNum);
        this.setParamSimple(map, prefix + "OutputFileNum", this.OutputFileNum);
        this.setParamSimple(map, prefix + "OutputPartitionNum", this.OutputPartitionNum);
        this.setParamSimple(map, prefix + "OutputTotalData", this.OutputTotalData);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

