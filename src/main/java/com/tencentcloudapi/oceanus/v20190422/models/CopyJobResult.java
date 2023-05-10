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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CopyJobResult extends AbstractModel{

    /**
    * 原作业id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 原作业名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * 新作业名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetJobName")
    @Expose
    private String TargetJobName;

    /**
    * 新作业id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetJobId")
    @Expose
    private String TargetJobId;

    /**
    * 失败时候的信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 0 成功  -1 失败
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Result")
    @Expose
    private Long Result;

    /**
    * 目标集群名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 目标集群id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 作业类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobType")
    @Expose
    private Long JobType;

    /**
     * Get 原作业id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobId 原作业id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 原作业id
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobId 原作业id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 原作业名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobName 原作业名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set 原作业名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobName 原作业名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get 新作业名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetJobName 新作业名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetJobName() {
        return this.TargetJobName;
    }

    /**
     * Set 新作业名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetJobName 新作业名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetJobName(String TargetJobName) {
        this.TargetJobName = TargetJobName;
    }

    /**
     * Get 新作业id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetJobId 新作业id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetJobId() {
        return this.TargetJobId;
    }

    /**
     * Set 新作业id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetJobId 新作业id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetJobId(String TargetJobId) {
        this.TargetJobId = TargetJobId;
    }

    /**
     * Get 失败时候的信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message 失败时候的信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 失败时候的信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 失败时候的信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 0 成功  -1 失败
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Result 0 成功  -1 失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResult() {
        return this.Result;
    }

    /**
     * Set 0 成功  -1 失败
注意：此字段可能返回 null，表示取不到有效值。
     * @param Result 0 成功  -1 失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResult(Long Result) {
        this.Result = Result;
    }

    /**
     * Get 目标集群名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterName 目标集群名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 目标集群名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterName 目标集群名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 目标集群id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId 目标集群id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 目标集群id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId 目标集群id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
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

    public CopyJobResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CopyJobResult(CopyJobResult source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.TargetJobName != null) {
            this.TargetJobName = new String(source.TargetJobName);
        }
        if (source.TargetJobId != null) {
            this.TargetJobId = new String(source.TargetJobId);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Result != null) {
            this.Result = new Long(source.Result);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.JobType != null) {
            this.JobType = new Long(source.JobType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "TargetJobName", this.TargetJobName);
        this.setParamSimple(map, prefix + "TargetJobId", this.TargetJobId);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "JobType", this.JobType);

    }
}

