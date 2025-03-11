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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TreeJobSets extends AbstractModel {

    /**
    * 作业Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 作业名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 作业类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobType")
    @Expose
    private Long JobType;

    /**
    * 作业占用资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunningCu")
    @Expose
    private Float RunningCu;

    /**
    * 作业状态 启动或者停止或者暂停
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 0:代表没开启调优任务，1:开启智能调优，2:代表定时调优

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScalingType")
    @Expose
    private Long ScalingType;

    /**
    * RunningCpu
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunningCpu")
    @Expose
    private Float RunningCpu;

    /**
    * RunningMem
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunningMem")
    @Expose
    private Float RunningMem;

    /**
    * sql
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DecodeSqlCode")
    @Expose
    private String DecodeSqlCode;

    /**
     * Get 作业Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobId 作业Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 作业Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobId 作业Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 作业名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 作业名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 作业名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 作业名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 作业类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobType 作业类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getJobType() {
        return this.JobType;
    }

    /**
     * Set 作业类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobType 作业类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobType(Long JobType) {
        this.JobType = JobType;
    }

    /**
     * Get 作业占用资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunningCu 作业占用资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getRunningCu() {
        return this.RunningCu;
    }

    /**
     * Set 作业占用资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunningCu 作业占用资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunningCu(Float RunningCu) {
        this.RunningCu = RunningCu;
    }

    /**
     * Get 作业状态 启动或者停止或者暂停
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 作业状态 启动或者停止或者暂停
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 作业状态 启动或者停止或者暂停
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 作业状态 启动或者停止或者暂停
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 0:代表没开启调优任务，1:开启智能调优，2:代表定时调优

注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScalingType 0:代表没开启调优任务，1:开启智能调优，2:代表定时调优

注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScalingType() {
        return this.ScalingType;
    }

    /**
     * Set 0:代表没开启调优任务，1:开启智能调优，2:代表定时调优

注意：此字段可能返回 null，表示取不到有效值。
     * @param ScalingType 0:代表没开启调优任务，1:开启智能调优，2:代表定时调优

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScalingType(Long ScalingType) {
        this.ScalingType = ScalingType;
    }

    /**
     * Get RunningCpu
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunningCpu RunningCpu
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getRunningCpu() {
        return this.RunningCpu;
    }

    /**
     * Set RunningCpu
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunningCpu RunningCpu
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunningCpu(Float RunningCpu) {
        this.RunningCpu = RunningCpu;
    }

    /**
     * Get RunningMem
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunningMem RunningMem
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getRunningMem() {
        return this.RunningMem;
    }

    /**
     * Set RunningMem
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunningMem RunningMem
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunningMem(Float RunningMem) {
        this.RunningMem = RunningMem;
    }

    /**
     * Get sql
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DecodeSqlCode sql
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDecodeSqlCode() {
        return this.DecodeSqlCode;
    }

    /**
     * Set sql
注意：此字段可能返回 null，表示取不到有效值。
     * @param DecodeSqlCode sql
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDecodeSqlCode(String DecodeSqlCode) {
        this.DecodeSqlCode = DecodeSqlCode;
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

    }
}

