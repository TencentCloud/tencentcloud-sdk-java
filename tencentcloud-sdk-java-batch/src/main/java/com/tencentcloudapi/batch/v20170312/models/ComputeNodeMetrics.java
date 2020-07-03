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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComputeNodeMetrics extends AbstractModel{

    /**
    * 已经完成提交的计算节点数量
    */
    @SerializedName("SubmittedCount")
    @Expose
    private Long SubmittedCount;

    /**
    * 创建中的计算节点数量
    */
    @SerializedName("CreatingCount")
    @Expose
    private Long CreatingCount;

    /**
    * 创建失败的计算节点数量
    */
    @SerializedName("CreationFailedCount")
    @Expose
    private Long CreationFailedCount;

    /**
    * 完成创建的计算节点数量
    */
    @SerializedName("CreatedCount")
    @Expose
    private Long CreatedCount;

    /**
    * 运行中的计算节点数量
    */
    @SerializedName("RunningCount")
    @Expose
    private Long RunningCount;

    /**
    * 销毁中的计算节点数量
    */
    @SerializedName("DeletingCount")
    @Expose
    private Long DeletingCount;

    /**
    * 异常的计算节点数量
    */
    @SerializedName("AbnormalCount")
    @Expose
    private Long AbnormalCount;

    /**
     * Get 已经完成提交的计算节点数量 
     * @return SubmittedCount 已经完成提交的计算节点数量
     */
    public Long getSubmittedCount() {
        return this.SubmittedCount;
    }

    /**
     * Set 已经完成提交的计算节点数量
     * @param SubmittedCount 已经完成提交的计算节点数量
     */
    public void setSubmittedCount(Long SubmittedCount) {
        this.SubmittedCount = SubmittedCount;
    }

    /**
     * Get 创建中的计算节点数量 
     * @return CreatingCount 创建中的计算节点数量
     */
    public Long getCreatingCount() {
        return this.CreatingCount;
    }

    /**
     * Set 创建中的计算节点数量
     * @param CreatingCount 创建中的计算节点数量
     */
    public void setCreatingCount(Long CreatingCount) {
        this.CreatingCount = CreatingCount;
    }

    /**
     * Get 创建失败的计算节点数量 
     * @return CreationFailedCount 创建失败的计算节点数量
     */
    public Long getCreationFailedCount() {
        return this.CreationFailedCount;
    }

    /**
     * Set 创建失败的计算节点数量
     * @param CreationFailedCount 创建失败的计算节点数量
     */
    public void setCreationFailedCount(Long CreationFailedCount) {
        this.CreationFailedCount = CreationFailedCount;
    }

    /**
     * Get 完成创建的计算节点数量 
     * @return CreatedCount 完成创建的计算节点数量
     */
    public Long getCreatedCount() {
        return this.CreatedCount;
    }

    /**
     * Set 完成创建的计算节点数量
     * @param CreatedCount 完成创建的计算节点数量
     */
    public void setCreatedCount(Long CreatedCount) {
        this.CreatedCount = CreatedCount;
    }

    /**
     * Get 运行中的计算节点数量 
     * @return RunningCount 运行中的计算节点数量
     */
    public Long getRunningCount() {
        return this.RunningCount;
    }

    /**
     * Set 运行中的计算节点数量
     * @param RunningCount 运行中的计算节点数量
     */
    public void setRunningCount(Long RunningCount) {
        this.RunningCount = RunningCount;
    }

    /**
     * Get 销毁中的计算节点数量 
     * @return DeletingCount 销毁中的计算节点数量
     */
    public Long getDeletingCount() {
        return this.DeletingCount;
    }

    /**
     * Set 销毁中的计算节点数量
     * @param DeletingCount 销毁中的计算节点数量
     */
    public void setDeletingCount(Long DeletingCount) {
        this.DeletingCount = DeletingCount;
    }

    /**
     * Get 异常的计算节点数量 
     * @return AbnormalCount 异常的计算节点数量
     */
    public Long getAbnormalCount() {
        return this.AbnormalCount;
    }

    /**
     * Set 异常的计算节点数量
     * @param AbnormalCount 异常的计算节点数量
     */
    public void setAbnormalCount(Long AbnormalCount) {
        this.AbnormalCount = AbnormalCount;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubmittedCount", this.SubmittedCount);
        this.setParamSimple(map, prefix + "CreatingCount", this.CreatingCount);
        this.setParamSimple(map, prefix + "CreationFailedCount", this.CreationFailedCount);
        this.setParamSimple(map, prefix + "CreatedCount", this.CreatedCount);
        this.setParamSimple(map, prefix + "RunningCount", this.RunningCount);
        this.setParamSimple(map, prefix + "DeletingCount", this.DeletingCount);
        this.setParamSimple(map, prefix + "AbnormalCount", this.AbnormalCount);

    }
}

