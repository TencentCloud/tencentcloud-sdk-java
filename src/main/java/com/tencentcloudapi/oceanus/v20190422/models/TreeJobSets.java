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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TreeJobSets extends AbstractModel {

    /**
    * <p>作业Id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * <p>作业名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>作业类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobType")
    @Expose
    private Long JobType;

    /**
    * <p>作业占用资源</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunningCu")
    @Expose
    private Float RunningCu;

    /**
    * <p>作业状态 启动或者停止或者暂停</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>0:代表没开启调优任务，1:开启智能调优，2:代表定时调优</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScalingType")
    @Expose
    private Long ScalingType;

    /**
    * <p>RunningCpu</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunningCpu")
    @Expose
    private Float RunningCpu;

    /**
    * <p>RunningMem</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunningMem")
    @Expose
    private Float RunningMem;

    /**
    * <p>sql</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DecodeSqlCode")
    @Expose
    private String DecodeSqlCode;

    /**
    * <p>发布版本配置id</p>
    */
    @SerializedName("PublishedJobConfigId")
    @Expose
    private Long PublishedJobConfigId;

    /**
    * <p>完整的文件夹路径，仅在平铺模式下返回</p>
    */
    @SerializedName("FolderPath")
    @Expose
    private String FolderPath;

    /**
     * Get <p>作业Id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobId <p>作业Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set <p>作业Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobId <p>作业Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get <p>作业名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>作业名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>作业名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>作业名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>作业类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobType <p>作业类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getJobType() {
        return this.JobType;
    }

    /**
     * Set <p>作业类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobType <p>作业类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobType(Long JobType) {
        this.JobType = JobType;
    }

    /**
     * Get <p>作业占用资源</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunningCu <p>作业占用资源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getRunningCu() {
        return this.RunningCu;
    }

    /**
     * Set <p>作业占用资源</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunningCu <p>作业占用资源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunningCu(Float RunningCu) {
        this.RunningCu = RunningCu;
    }

    /**
     * Get <p>作业状态 启动或者停止或者暂停</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>作业状态 启动或者停止或者暂停</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>作业状态 启动或者停止或者暂停</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>作业状态 启动或者停止或者暂停</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>0:代表没开启调优任务，1:开启智能调优，2:代表定时调优</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScalingType <p>0:代表没开启调优任务，1:开启智能调优，2:代表定时调优</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScalingType() {
        return this.ScalingType;
    }

    /**
     * Set <p>0:代表没开启调优任务，1:开启智能调优，2:代表定时调优</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScalingType <p>0:代表没开启调优任务，1:开启智能调优，2:代表定时调优</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScalingType(Long ScalingType) {
        this.ScalingType = ScalingType;
    }

    /**
     * Get <p>RunningCpu</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunningCpu <p>RunningCpu</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getRunningCpu() {
        return this.RunningCpu;
    }

    /**
     * Set <p>RunningCpu</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunningCpu <p>RunningCpu</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunningCpu(Float RunningCpu) {
        this.RunningCpu = RunningCpu;
    }

    /**
     * Get <p>RunningMem</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunningMem <p>RunningMem</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getRunningMem() {
        return this.RunningMem;
    }

    /**
     * Set <p>RunningMem</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunningMem <p>RunningMem</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunningMem(Float RunningMem) {
        this.RunningMem = RunningMem;
    }

    /**
     * Get <p>sql</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DecodeSqlCode <p>sql</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDecodeSqlCode() {
        return this.DecodeSqlCode;
    }

    /**
     * Set <p>sql</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DecodeSqlCode <p>sql</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDecodeSqlCode(String DecodeSqlCode) {
        this.DecodeSqlCode = DecodeSqlCode;
    }

    /**
     * Get <p>发布版本配置id</p> 
     * @return PublishedJobConfigId <p>发布版本配置id</p>
     */
    public Long getPublishedJobConfigId() {
        return this.PublishedJobConfigId;
    }

    /**
     * Set <p>发布版本配置id</p>
     * @param PublishedJobConfigId <p>发布版本配置id</p>
     */
    public void setPublishedJobConfigId(Long PublishedJobConfigId) {
        this.PublishedJobConfigId = PublishedJobConfigId;
    }

    /**
     * Get <p>完整的文件夹路径，仅在平铺模式下返回</p> 
     * @return FolderPath <p>完整的文件夹路径，仅在平铺模式下返回</p>
     */
    public String getFolderPath() {
        return this.FolderPath;
    }

    /**
     * Set <p>完整的文件夹路径，仅在平铺模式下返回</p>
     * @param FolderPath <p>完整的文件夹路径，仅在平铺模式下返回</p>
     */
    public void setFolderPath(String FolderPath) {
        this.FolderPath = FolderPath;
    }

    public TreeJobSets() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TreeJobSets(TreeJobSets source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.JobType != null) {
            this.JobType = new Long(source.JobType);
        }
        if (source.RunningCu != null) {
            this.RunningCu = new Float(source.RunningCu);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ScalingType != null) {
            this.ScalingType = new Long(source.ScalingType);
        }
        if (source.RunningCpu != null) {
            this.RunningCpu = new Float(source.RunningCpu);
        }
        if (source.RunningMem != null) {
            this.RunningMem = new Float(source.RunningMem);
        }
        if (source.DecodeSqlCode != null) {
            this.DecodeSqlCode = new String(source.DecodeSqlCode);
        }
        if (source.PublishedJobConfigId != null) {
            this.PublishedJobConfigId = new Long(source.PublishedJobConfigId);
        }
        if (source.FolderPath != null) {
            this.FolderPath = new String(source.FolderPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamSimple(map, prefix + "RunningCu", this.RunningCu);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ScalingType", this.ScalingType);
        this.setParamSimple(map, prefix + "RunningCpu", this.RunningCpu);
        this.setParamSimple(map, prefix + "RunningMem", this.RunningMem);
        this.setParamSimple(map, prefix + "DecodeSqlCode", this.DecodeSqlCode);
        this.setParamSimple(map, prefix + "PublishedJobConfigId", this.PublishedJobConfigId);
        this.setParamSimple(map, prefix + "FolderPath", this.FolderPath);

    }
}

