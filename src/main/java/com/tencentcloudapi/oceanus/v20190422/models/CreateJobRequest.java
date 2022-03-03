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

public class CreateJobRequest extends AbstractModel{

    /**
    * 作业名称，允许输入长度小于等于50个字符的中文、英文、数字、-（横线）、_（下划线）、.（点），且符号必须半角字符。注意作业名不能和现有作业同名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 作业的类型，1 表示 SQL 作业，2 表示 JAR 作业
    */
    @SerializedName("JobType")
    @Expose
    private Long JobType;

    /**
    * 集群的类型，1 表示共享集群，2 表示独享集群
    */
    @SerializedName("ClusterType")
    @Expose
    private Long ClusterType;

    /**
    * 当 ClusterType=2 时，必选，用来指定该作业提交的独享集群 ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 设置每 CU 的内存规格，单位为 GB，支持 2、4、8、16（需申请开通白名单后使用）。默认为 4，即 1 CU 对应 4 GB 的运行内存
    */
    @SerializedName("CuMem")
    @Expose
    private Long CuMem;

    /**
    * 作业的备注信息，可以随意设置
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 作业名所属文件夹ID，根目录为"root"
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * 作业运行的Flink版本
    */
    @SerializedName("FlinkVersion")
    @Expose
    private String FlinkVersion;

    /**
    * 工作空间 SerialId
    */
    @SerializedName("WorkSpaceId")
    @Expose
    private String WorkSpaceId;

    /**
     * Get 作业名称，允许输入长度小于等于50个字符的中文、英文、数字、-（横线）、_（下划线）、.（点），且符号必须半角字符。注意作业名不能和现有作业同名 
     * @return Name 作业名称，允许输入长度小于等于50个字符的中文、英文、数字、-（横线）、_（下划线）、.（点），且符号必须半角字符。注意作业名不能和现有作业同名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 作业名称，允许输入长度小于等于50个字符的中文、英文、数字、-（横线）、_（下划线）、.（点），且符号必须半角字符。注意作业名不能和现有作业同名
     * @param Name 作业名称，允许输入长度小于等于50个字符的中文、英文、数字、-（横线）、_（下划线）、.（点），且符号必须半角字符。注意作业名不能和现有作业同名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 作业的类型，1 表示 SQL 作业，2 表示 JAR 作业 
     * @return JobType 作业的类型，1 表示 SQL 作业，2 表示 JAR 作业
     */
    public Long getJobType() {
        return this.JobType;
    }

    /**
     * Set 作业的类型，1 表示 SQL 作业，2 表示 JAR 作业
     * @param JobType 作业的类型，1 表示 SQL 作业，2 表示 JAR 作业
     */
    public void setJobType(Long JobType) {
        this.JobType = JobType;
    }

    /**
     * Get 集群的类型，1 表示共享集群，2 表示独享集群 
     * @return ClusterType 集群的类型，1 表示共享集群，2 表示独享集群
     */
    public Long getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 集群的类型，1 表示共享集群，2 表示独享集群
     * @param ClusterType 集群的类型，1 表示共享集群，2 表示独享集群
     */
    public void setClusterType(Long ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get 当 ClusterType=2 时，必选，用来指定该作业提交的独享集群 ID 
     * @return ClusterId 当 ClusterType=2 时，必选，用来指定该作业提交的独享集群 ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 当 ClusterType=2 时，必选，用来指定该作业提交的独享集群 ID
     * @param ClusterId 当 ClusterType=2 时，必选，用来指定该作业提交的独享集群 ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 设置每 CU 的内存规格，单位为 GB，支持 2、4、8、16（需申请开通白名单后使用）。默认为 4，即 1 CU 对应 4 GB 的运行内存 
     * @return CuMem 设置每 CU 的内存规格，单位为 GB，支持 2、4、8、16（需申请开通白名单后使用）。默认为 4，即 1 CU 对应 4 GB 的运行内存
     */
    public Long getCuMem() {
        return this.CuMem;
    }

    /**
     * Set 设置每 CU 的内存规格，单位为 GB，支持 2、4、8、16（需申请开通白名单后使用）。默认为 4，即 1 CU 对应 4 GB 的运行内存
     * @param CuMem 设置每 CU 的内存规格，单位为 GB，支持 2、4、8、16（需申请开通白名单后使用）。默认为 4，即 1 CU 对应 4 GB 的运行内存
     */
    public void setCuMem(Long CuMem) {
        this.CuMem = CuMem;
    }

    /**
     * Get 作业的备注信息，可以随意设置 
     * @return Remark 作业的备注信息，可以随意设置
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 作业的备注信息，可以随意设置
     * @param Remark 作业的备注信息，可以随意设置
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 作业名所属文件夹ID，根目录为"root" 
     * @return FolderId 作业名所属文件夹ID，根目录为"root"
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set 作业名所属文件夹ID，根目录为"root"
     * @param FolderId 作业名所属文件夹ID，根目录为"root"
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get 作业运行的Flink版本 
     * @return FlinkVersion 作业运行的Flink版本
     */
    public String getFlinkVersion() {
        return this.FlinkVersion;
    }

    /**
     * Set 作业运行的Flink版本
     * @param FlinkVersion 作业运行的Flink版本
     */
    public void setFlinkVersion(String FlinkVersion) {
        this.FlinkVersion = FlinkVersion;
    }

    /**
     * Get 工作空间 SerialId 
     * @return WorkSpaceId 工作空间 SerialId
     */
    public String getWorkSpaceId() {
        return this.WorkSpaceId;
    }

    /**
     * Set 工作空间 SerialId
     * @param WorkSpaceId 工作空间 SerialId
     */
    public void setWorkSpaceId(String WorkSpaceId) {
        this.WorkSpaceId = WorkSpaceId;
    }

    public CreateJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateJobRequest(CreateJobRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.JobType != null) {
            this.JobType = new Long(source.JobType);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new Long(source.ClusterType);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.CuMem != null) {
            this.CuMem = new Long(source.CuMem);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.FlinkVersion != null) {
            this.FlinkVersion = new String(source.FlinkVersion);
        }
        if (source.WorkSpaceId != null) {
            this.WorkSpaceId = new String(source.WorkSpaceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "CuMem", this.CuMem);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "FlinkVersion", this.FlinkVersion);
        this.setParamSimple(map, prefix + "WorkSpaceId", this.WorkSpaceId);

    }
}

