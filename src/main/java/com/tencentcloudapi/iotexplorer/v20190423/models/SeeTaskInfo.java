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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SeeTaskInfo extends AbstractModel {

    /**
    * 任务 ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务状态。可能取值：

- `1`：失败
- `2`：空结果
- `3`：有效结果
- `4`：处理中
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 任务元数据
    */
    @SerializedName("Metadata")
    @Expose
    private SeeTaskMetadata Metadata;

    /**
    * 算法类目。可能取值：

- `COMPREHENSION`：视觉理解
    */
    @SerializedName("ServiceCategory")
    @Expose
    private String ServiceCategory;

    /**
    * 算法类型。可能取值：

- `VID_COMP`：视频理解
- `IMG_COMP`：图片理解
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 套餐规格。可能取值：

- `POSTPAID`：后付费（适用于视频理解、图片理解）
- `BASIC`：包年包月基础版（适用于视频理解）
    */
    @SerializedName("ServiceTier")
    @Expose
    private String ServiceTier;

    /**
    * 视觉理解结果（适用于视频理解、图片理解）
    */
    @SerializedName("ComprehensionResult")
    @Expose
    private SeeComprehensionResult ComprehensionResult;

    /**
    * 视频语义浓缩结果（适用于视频语义浓缩）
    */
    @SerializedName("CompHighlightResult")
    @Expose
    private SeeCompHighlightResult CompHighlightResult;

    /**
    * 完成该任务所消耗的基础能力额度
    */
    @SerializedName("CostBasic")
    @Expose
    private Long CostBasic;

    /**
    * 完成该任务所消耗的高级能力额度
    */
    @SerializedName("CostAdvanced")
    @Expose
    private Long CostAdvanced;

    /**
    * 输出文件名列表
    */
    @SerializedName("Files")
    @Expose
    private String [] Files;

    /**
    * 输出文件详情列表
    */
    @SerializedName("FilesInfo")
    @Expose
    private CloudStorageAIServiceTaskFileInfo [] FilesInfo;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 最后更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get 任务 ID 
     * @return TaskId 任务 ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务 ID
     * @param TaskId 任务 ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务状态。可能取值：

- `1`：失败
- `2`：空结果
- `3`：有效结果
- `4`：处理中 
     * @return Status 任务状态。可能取值：

- `1`：失败
- `2`：空结果
- `3`：有效结果
- `4`：处理中
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态。可能取值：

- `1`：失败
- `2`：空结果
- `3`：有效结果
- `4`：处理中
     * @param Status 任务状态。可能取值：

- `1`：失败
- `2`：空结果
- `3`：有效结果
- `4`：处理中
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 任务元数据 
     * @return Metadata 任务元数据
     */
    public SeeTaskMetadata getMetadata() {
        return this.Metadata;
    }

    /**
     * Set 任务元数据
     * @param Metadata 任务元数据
     */
    public void setMetadata(SeeTaskMetadata Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get 算法类目。可能取值：

- `COMPREHENSION`：视觉理解 
     * @return ServiceCategory 算法类目。可能取值：

- `COMPREHENSION`：视觉理解
     */
    public String getServiceCategory() {
        return this.ServiceCategory;
    }

    /**
     * Set 算法类目。可能取值：

- `COMPREHENSION`：视觉理解
     * @param ServiceCategory 算法类目。可能取值：

- `COMPREHENSION`：视觉理解
     */
    public void setServiceCategory(String ServiceCategory) {
        this.ServiceCategory = ServiceCategory;
    }

    /**
     * Get 算法类型。可能取值：

- `VID_COMP`：视频理解
- `IMG_COMP`：图片理解 
     * @return ServiceType 算法类型。可能取值：

- `VID_COMP`：视频理解
- `IMG_COMP`：图片理解
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 算法类型。可能取值：

- `VID_COMP`：视频理解
- `IMG_COMP`：图片理解
     * @param ServiceType 算法类型。可能取值：

- `VID_COMP`：视频理解
- `IMG_COMP`：图片理解
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 套餐规格。可能取值：

- `POSTPAID`：后付费（适用于视频理解、图片理解）
- `BASIC`：包年包月基础版（适用于视频理解） 
     * @return ServiceTier 套餐规格。可能取值：

- `POSTPAID`：后付费（适用于视频理解、图片理解）
- `BASIC`：包年包月基础版（适用于视频理解）
     */
    public String getServiceTier() {
        return this.ServiceTier;
    }

    /**
     * Set 套餐规格。可能取值：

- `POSTPAID`：后付费（适用于视频理解、图片理解）
- `BASIC`：包年包月基础版（适用于视频理解）
     * @param ServiceTier 套餐规格。可能取值：

- `POSTPAID`：后付费（适用于视频理解、图片理解）
- `BASIC`：包年包月基础版（适用于视频理解）
     */
    public void setServiceTier(String ServiceTier) {
        this.ServiceTier = ServiceTier;
    }

    /**
     * Get 视觉理解结果（适用于视频理解、图片理解） 
     * @return ComprehensionResult 视觉理解结果（适用于视频理解、图片理解）
     */
    public SeeComprehensionResult getComprehensionResult() {
        return this.ComprehensionResult;
    }

    /**
     * Set 视觉理解结果（适用于视频理解、图片理解）
     * @param ComprehensionResult 视觉理解结果（适用于视频理解、图片理解）
     */
    public void setComprehensionResult(SeeComprehensionResult ComprehensionResult) {
        this.ComprehensionResult = ComprehensionResult;
    }

    /**
     * Get 视频语义浓缩结果（适用于视频语义浓缩） 
     * @return CompHighlightResult 视频语义浓缩结果（适用于视频语义浓缩）
     */
    public SeeCompHighlightResult getCompHighlightResult() {
        return this.CompHighlightResult;
    }

    /**
     * Set 视频语义浓缩结果（适用于视频语义浓缩）
     * @param CompHighlightResult 视频语义浓缩结果（适用于视频语义浓缩）
     */
    public void setCompHighlightResult(SeeCompHighlightResult CompHighlightResult) {
        this.CompHighlightResult = CompHighlightResult;
    }

    /**
     * Get 完成该任务所消耗的基础能力额度 
     * @return CostBasic 完成该任务所消耗的基础能力额度
     */
    public Long getCostBasic() {
        return this.CostBasic;
    }

    /**
     * Set 完成该任务所消耗的基础能力额度
     * @param CostBasic 完成该任务所消耗的基础能力额度
     */
    public void setCostBasic(Long CostBasic) {
        this.CostBasic = CostBasic;
    }

    /**
     * Get 完成该任务所消耗的高级能力额度 
     * @return CostAdvanced 完成该任务所消耗的高级能力额度
     */
    public Long getCostAdvanced() {
        return this.CostAdvanced;
    }

    /**
     * Set 完成该任务所消耗的高级能力额度
     * @param CostAdvanced 完成该任务所消耗的高级能力额度
     */
    public void setCostAdvanced(Long CostAdvanced) {
        this.CostAdvanced = CostAdvanced;
    }

    /**
     * Get 输出文件名列表 
     * @return Files 输出文件名列表
     */
    public String [] getFiles() {
        return this.Files;
    }

    /**
     * Set 输出文件名列表
     * @param Files 输出文件名列表
     */
    public void setFiles(String [] Files) {
        this.Files = Files;
    }

    /**
     * Get 输出文件详情列表 
     * @return FilesInfo 输出文件详情列表
     */
    public CloudStorageAIServiceTaskFileInfo [] getFilesInfo() {
        return this.FilesInfo;
    }

    /**
     * Set 输出文件详情列表
     * @param FilesInfo 输出文件详情列表
     */
    public void setFilesInfo(CloudStorageAIServiceTaskFileInfo [] FilesInfo) {
        this.FilesInfo = FilesInfo;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最后更新时间 
     * @return UpdateTime 最后更新时间
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 最后更新时间
     * @param UpdateTime 最后更新时间
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public SeeTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SeeTaskInfo(SeeTaskInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Metadata != null) {
            this.Metadata = new SeeTaskMetadata(source.Metadata);
        }
        if (source.ServiceCategory != null) {
            this.ServiceCategory = new String(source.ServiceCategory);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.ServiceTier != null) {
            this.ServiceTier = new String(source.ServiceTier);
        }
        if (source.ComprehensionResult != null) {
            this.ComprehensionResult = new SeeComprehensionResult(source.ComprehensionResult);
        }
        if (source.CompHighlightResult != null) {
            this.CompHighlightResult = new SeeCompHighlightResult(source.CompHighlightResult);
        }
        if (source.CostBasic != null) {
            this.CostBasic = new Long(source.CostBasic);
        }
        if (source.CostAdvanced != null) {
            this.CostAdvanced = new Long(source.CostAdvanced);
        }
        if (source.Files != null) {
            this.Files = new String[source.Files.length];
            for (int i = 0; i < source.Files.length; i++) {
                this.Files[i] = new String(source.Files[i]);
            }
        }
        if (source.FilesInfo != null) {
            this.FilesInfo = new CloudStorageAIServiceTaskFileInfo[source.FilesInfo.length];
            for (int i = 0; i < source.FilesInfo.length; i++) {
                this.FilesInfo[i] = new CloudStorageAIServiceTaskFileInfo(source.FilesInfo[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "Metadata.", this.Metadata);
        this.setParamSimple(map, prefix + "ServiceCategory", this.ServiceCategory);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "ServiceTier", this.ServiceTier);
        this.setParamObj(map, prefix + "ComprehensionResult.", this.ComprehensionResult);
        this.setParamObj(map, prefix + "CompHighlightResult.", this.CompHighlightResult);
        this.setParamSimple(map, prefix + "CostBasic", this.CostBasic);
        this.setParamSimple(map, prefix + "CostAdvanced", this.CostAdvanced);
        this.setParamArraySimple(map, prefix + "Files.", this.Files);
        this.setParamArrayObj(map, prefix + "FilesInfo.", this.FilesInfo);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

