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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiagnoseJobResult extends AbstractModel {

    /**
    * 诊断项名
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * 诊断项状态：-2失败，-1待重试，0运行中，1成功
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 诊断项得分
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * 诊断摘要
    */
    @SerializedName("Summary")
    @Expose
    private String Summary;

    /**
    * 诊断建议
    */
    @SerializedName("Advise")
    @Expose
    private String Advise;

    /**
    * 诊断详情
    */
    @SerializedName("Detail")
    @Expose
    private String Detail;

    /**
    * 诊断指标详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetricDetails")
    @Expose
    private MetricDetail [] MetricDetails;

    /**
    * 诊断日志详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogDetails")
    @Expose
    private LogDetail [] LogDetails;

    /**
    * 诊断配置详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SettingDetails")
    @Expose
    private SettingDetail [] SettingDetails;

    /**
     * Get 诊断项名 
     * @return JobName 诊断项名
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set 诊断项名
     * @param JobName 诊断项名
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get 诊断项状态：-2失败，-1待重试，0运行中，1成功 
     * @return Status 诊断项状态：-2失败，-1待重试，0运行中，1成功
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 诊断项状态：-2失败，-1待重试，0运行中，1成功
     * @param Status 诊断项状态：-2失败，-1待重试，0运行中，1成功
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 诊断项得分 
     * @return Score 诊断项得分
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 诊断项得分
     * @param Score 诊断项得分
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get 诊断摘要 
     * @return Summary 诊断摘要
     */
    public String getSummary() {
        return this.Summary;
    }

    /**
     * Set 诊断摘要
     * @param Summary 诊断摘要
     */
    public void setSummary(String Summary) {
        this.Summary = Summary;
    }

    /**
     * Get 诊断建议 
     * @return Advise 诊断建议
     */
    public String getAdvise() {
        return this.Advise;
    }

    /**
     * Set 诊断建议
     * @param Advise 诊断建议
     */
    public void setAdvise(String Advise) {
        this.Advise = Advise;
    }

    /**
     * Get 诊断详情 
     * @return Detail 诊断详情
     */
    public String getDetail() {
        return this.Detail;
    }

    /**
     * Set 诊断详情
     * @param Detail 诊断详情
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    /**
     * Get 诊断指标详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetricDetails 诊断指标详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MetricDetail [] getMetricDetails() {
        return this.MetricDetails;
    }

    /**
     * Set 诊断指标详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetricDetails 诊断指标详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetricDetails(MetricDetail [] MetricDetails) {
        this.MetricDetails = MetricDetails;
    }

    /**
     * Get 诊断日志详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogDetails 诊断日志详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LogDetail [] getLogDetails() {
        return this.LogDetails;
    }

    /**
     * Set 诊断日志详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogDetails 诊断日志详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogDetails(LogDetail [] LogDetails) {
        this.LogDetails = LogDetails;
    }

    /**
     * Get 诊断配置详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SettingDetails 诊断配置详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SettingDetail [] getSettingDetails() {
        return this.SettingDetails;
    }

    /**
     * Set 诊断配置详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param SettingDetails 诊断配置详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSettingDetails(SettingDetail [] SettingDetails) {
        this.SettingDetails = SettingDetails;
    }

    public DiagnoseJobResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiagnoseJobResult(DiagnoseJobResult source) {
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.Summary != null) {
            this.Summary = new String(source.Summary);
        }
        if (source.Advise != null) {
            this.Advise = new String(source.Advise);
        }
        if (source.Detail != null) {
            this.Detail = new String(source.Detail);
        }
        if (source.MetricDetails != null) {
            this.MetricDetails = new MetricDetail[source.MetricDetails.length];
            for (int i = 0; i < source.MetricDetails.length; i++) {
                this.MetricDetails[i] = new MetricDetail(source.MetricDetails[i]);
            }
        }
        if (source.LogDetails != null) {
            this.LogDetails = new LogDetail[source.LogDetails.length];
            for (int i = 0; i < source.LogDetails.length; i++) {
                this.LogDetails[i] = new LogDetail(source.LogDetails[i]);
            }
        }
        if (source.SettingDetails != null) {
            this.SettingDetails = new SettingDetail[source.SettingDetails.length];
            for (int i = 0; i < source.SettingDetails.length; i++) {
                this.SettingDetails[i] = new SettingDetail(source.SettingDetails[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "Summary", this.Summary);
        this.setParamSimple(map, prefix + "Advise", this.Advise);
        this.setParamSimple(map, prefix + "Detail", this.Detail);
        this.setParamArrayObj(map, prefix + "MetricDetails.", this.MetricDetails);
        this.setParamArrayObj(map, prefix + "LogDetails.", this.LogDetails);
        this.setParamArrayObj(map, prefix + "SettingDetails.", this.SettingDetails);

    }
}

