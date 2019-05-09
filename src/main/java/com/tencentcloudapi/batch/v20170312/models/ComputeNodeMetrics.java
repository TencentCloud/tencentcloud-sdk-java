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

public class ComputeNodeMetrics  extends AbstractModel{

    /**
    * 已经完成提交的计算节点数量
    */
    @SerializedName("SubmittedCount")
    @Expose
    private Integer SubmittedCount;

    /**
    * 创建中的计算节点数量
    */
    @SerializedName("CreatingCount")
    @Expose
    private Integer CreatingCount;

    /**
    * 创建失败的计算节点数量
    */
    @SerializedName("CreationFailedCount")
    @Expose
    private Integer CreationFailedCount;

    /**
    * 完成创建的计算节点数量
    */
    @SerializedName("CreatedCount")
    @Expose
    private Integer CreatedCount;

    /**
    * 运行中的计算节点数量
    */
    @SerializedName("RunningCount")
    @Expose
    private Integer RunningCount;

    /**
    * 销毁中的计算节点数量
    */
    @SerializedName("DeletingCount")
    @Expose
    private Integer DeletingCount;

    /**
    * 异常的计算节点数量
    */
    @SerializedName("AbnormalCount")
    @Expose
    private Integer AbnormalCount;

    /**
     * 获取已经完成提交的计算节点数量
     * @return SubmittedCount 已经完成提交的计算节点数量
     */
    public Integer getSubmittedCount() {
        return this.SubmittedCount;
    }

    /**
     * 设置已经完成提交的计算节点数量
     * @param SubmittedCount 已经完成提交的计算节点数量
     */
    public void setSubmittedCount(Integer SubmittedCount) {
        this.SubmittedCount = SubmittedCount;
    }

    /**
     * 获取创建中的计算节点数量
     * @return CreatingCount 创建中的计算节点数量
     */
    public Integer getCreatingCount() {
        return this.CreatingCount;
    }

    /**
     * 设置创建中的计算节点数量
     * @param CreatingCount 创建中的计算节点数量
     */
    public void setCreatingCount(Integer CreatingCount) {
        this.CreatingCount = CreatingCount;
    }

    /**
     * 获取创建失败的计算节点数量
     * @return CreationFailedCount 创建失败的计算节点数量
     */
    public Integer getCreationFailedCount() {
        return this.CreationFailedCount;
    }

    /**
     * 设置创建失败的计算节点数量
     * @param CreationFailedCount 创建失败的计算节点数量
     */
    public void setCreationFailedCount(Integer CreationFailedCount) {
        this.CreationFailedCount = CreationFailedCount;
    }

    /**
     * 获取完成创建的计算节点数量
     * @return CreatedCount 完成创建的计算节点数量
     */
    public Integer getCreatedCount() {
        return this.CreatedCount;
    }

    /**
     * 设置完成创建的计算节点数量
     * @param CreatedCount 完成创建的计算节点数量
     */
    public void setCreatedCount(Integer CreatedCount) {
        this.CreatedCount = CreatedCount;
    }

    /**
     * 获取运行中的计算节点数量
     * @return RunningCount 运行中的计算节点数量
     */
    public Integer getRunningCount() {
        return this.RunningCount;
    }

    /**
     * 设置运行中的计算节点数量
     * @param RunningCount 运行中的计算节点数量
     */
    public void setRunningCount(Integer RunningCount) {
        this.RunningCount = RunningCount;
    }

    /**
     * 获取销毁中的计算节点数量
     * @return DeletingCount 销毁中的计算节点数量
     */
    public Integer getDeletingCount() {
        return this.DeletingCount;
    }

    /**
     * 设置销毁中的计算节点数量
     * @param DeletingCount 销毁中的计算节点数量
     */
    public void setDeletingCount(Integer DeletingCount) {
        this.DeletingCount = DeletingCount;
    }

    /**
     * 获取异常的计算节点数量
     * @return AbnormalCount 异常的计算节点数量
     */
    public Integer getAbnormalCount() {
        return this.AbnormalCount;
    }

    /**
     * 设置异常的计算节点数量
     * @param AbnormalCount 异常的计算节点数量
     */
    public void setAbnormalCount(Integer AbnormalCount) {
        this.AbnormalCount = AbnormalCount;
    }

    /**
     * 内部实现，用户禁止调用
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

