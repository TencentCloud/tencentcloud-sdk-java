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
    * <p>任务 ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>任务状态。可能取值：</p><ul><li><code>1</code>：失败</li><li><code>2</code>：空结果</li><li><code>3</code>：有效结果</li><li><code>4</code>：处理中</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>任务元数据</p>
    */
    @SerializedName("Metadata")
    @Expose
    private SeeTaskMetadata Metadata;

    /**
    * <p>算法类目。可能取值：</p><ul><li><code>COMPREHENSION</code>：视觉理解</li><li><code>HIGHLIGHT</code>：视频浓缩</li></ul>
    */
    @SerializedName("ServiceCategory")
    @Expose
    private String ServiceCategory;

    /**
    * <p>算法类型。可能取值：</p><ul><li><code>VID_COMP</code>：视频理解</li><li><code>IMG_COMP</code>：图片理解</li><li><code>COMP_HIGHLIGHT</code>：视频浓缩</li></ul>
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * <p>套餐规格。可能取值：</p><ul><li><code>POSTPAID</code>：后付费（适用于视频理解、图片理解）</li><li><code>BASIC</code>：包年包月基础版（适用于视频理解）</li></ul>
    */
    @SerializedName("ServiceTier")
    @Expose
    private String ServiceTier;

    /**
    * <p>视觉理解结果（适用于视频理解、图片理解）</p>
    */
    @SerializedName("ComprehensionResult")
    @Expose
    private SeeComprehensionResult ComprehensionResult;

    /**
    * <p>视频语义浓缩结果（适用于视频语义浓缩）</p>
    */
    @SerializedName("CompHighlightResult")
    @Expose
    private SeeCompHighlightResult CompHighlightResult;

    /**
    * <p>标签持续检测结果</p>
    */
    @SerializedName("DetectContinuousResult")
    @Expose
    private SeeDetectContinuousResult DetectContinuousResult;

    /**
    * <p>完成该任务所消耗的基础能力额度</p>
    */
    @SerializedName("CostBasic")
    @Expose
    private Long CostBasic;

    /**
    * <p>完成该任务所消耗的高级能力额度</p>
    */
    @SerializedName("CostAdvanced")
    @Expose
    private Long CostAdvanced;

    /**
    * <p>输出文件名列表</p>
    */
    @SerializedName("Files")
    @Expose
    private String [] Files;

    /**
    * <p>输出文件详情列表</p>
    */
    @SerializedName("FilesInfo")
    @Expose
    private CloudStorageAIServiceTaskFileInfo [] FilesInfo;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>最后更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * <p>直传 COS 的对象 URI</p>
    */
    @SerializedName("COSURI")
    @Expose
    private String COSURI;

    /**
     * Get <p>任务 ID</p> 
     * @return TaskId <p>任务 ID</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务 ID</p>
     * @param TaskId <p>任务 ID</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>任务状态。可能取值：</p><ul><li><code>1</code>：失败</li><li><code>2</code>：空结果</li><li><code>3</code>：有效结果</li><li><code>4</code>：处理中</li></ul> 
     * @return Status <p>任务状态。可能取值：</p><ul><li><code>1</code>：失败</li><li><code>2</code>：空结果</li><li><code>3</code>：有效结果</li><li><code>4</code>：处理中</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态。可能取值：</p><ul><li><code>1</code>：失败</li><li><code>2</code>：空结果</li><li><code>3</code>：有效结果</li><li><code>4</code>：处理中</li></ul>
     * @param Status <p>任务状态。可能取值：</p><ul><li><code>1</code>：失败</li><li><code>2</code>：空结果</li><li><code>3</code>：有效结果</li><li><code>4</code>：处理中</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>任务元数据</p> 
     * @return Metadata <p>任务元数据</p>
     */
    public SeeTaskMetadata getMetadata() {
        return this.Metadata;
    }

    /**
     * Set <p>任务元数据</p>
     * @param Metadata <p>任务元数据</p>
     */
    public void setMetadata(SeeTaskMetadata Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get <p>算法类目。可能取值：</p><ul><li><code>COMPREHENSION</code>：视觉理解</li><li><code>HIGHLIGHT</code>：视频浓缩</li></ul> 
     * @return ServiceCategory <p>算法类目。可能取值：</p><ul><li><code>COMPREHENSION</code>：视觉理解</li><li><code>HIGHLIGHT</code>：视频浓缩</li></ul>
     */
    public String getServiceCategory() {
        return this.ServiceCategory;
    }

    /**
     * Set <p>算法类目。可能取值：</p><ul><li><code>COMPREHENSION</code>：视觉理解</li><li><code>HIGHLIGHT</code>：视频浓缩</li></ul>
     * @param ServiceCategory <p>算法类目。可能取值：</p><ul><li><code>COMPREHENSION</code>：视觉理解</li><li><code>HIGHLIGHT</code>：视频浓缩</li></ul>
     */
    public void setServiceCategory(String ServiceCategory) {
        this.ServiceCategory = ServiceCategory;
    }

    /**
     * Get <p>算法类型。可能取值：</p><ul><li><code>VID_COMP</code>：视频理解</li><li><code>IMG_COMP</code>：图片理解</li><li><code>COMP_HIGHLIGHT</code>：视频浓缩</li></ul> 
     * @return ServiceType <p>算法类型。可能取值：</p><ul><li><code>VID_COMP</code>：视频理解</li><li><code>IMG_COMP</code>：图片理解</li><li><code>COMP_HIGHLIGHT</code>：视频浓缩</li></ul>
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set <p>算法类型。可能取值：</p><ul><li><code>VID_COMP</code>：视频理解</li><li><code>IMG_COMP</code>：图片理解</li><li><code>COMP_HIGHLIGHT</code>：视频浓缩</li></ul>
     * @param ServiceType <p>算法类型。可能取值：</p><ul><li><code>VID_COMP</code>：视频理解</li><li><code>IMG_COMP</code>：图片理解</li><li><code>COMP_HIGHLIGHT</code>：视频浓缩</li></ul>
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get <p>套餐规格。可能取值：</p><ul><li><code>POSTPAID</code>：后付费（适用于视频理解、图片理解）</li><li><code>BASIC</code>：包年包月基础版（适用于视频理解）</li></ul> 
     * @return ServiceTier <p>套餐规格。可能取值：</p><ul><li><code>POSTPAID</code>：后付费（适用于视频理解、图片理解）</li><li><code>BASIC</code>：包年包月基础版（适用于视频理解）</li></ul>
     */
    public String getServiceTier() {
        return this.ServiceTier;
    }

    /**
     * Set <p>套餐规格。可能取值：</p><ul><li><code>POSTPAID</code>：后付费（适用于视频理解、图片理解）</li><li><code>BASIC</code>：包年包月基础版（适用于视频理解）</li></ul>
     * @param ServiceTier <p>套餐规格。可能取值：</p><ul><li><code>POSTPAID</code>：后付费（适用于视频理解、图片理解）</li><li><code>BASIC</code>：包年包月基础版（适用于视频理解）</li></ul>
     */
    public void setServiceTier(String ServiceTier) {
        this.ServiceTier = ServiceTier;
    }

    /**
     * Get <p>视觉理解结果（适用于视频理解、图片理解）</p> 
     * @return ComprehensionResult <p>视觉理解结果（适用于视频理解、图片理解）</p>
     */
    public SeeComprehensionResult getComprehensionResult() {
        return this.ComprehensionResult;
    }

    /**
     * Set <p>视觉理解结果（适用于视频理解、图片理解）</p>
     * @param ComprehensionResult <p>视觉理解结果（适用于视频理解、图片理解）</p>
     */
    public void setComprehensionResult(SeeComprehensionResult ComprehensionResult) {
        this.ComprehensionResult = ComprehensionResult;
    }

    /**
     * Get <p>视频语义浓缩结果（适用于视频语义浓缩）</p> 
     * @return CompHighlightResult <p>视频语义浓缩结果（适用于视频语义浓缩）</p>
     */
    public SeeCompHighlightResult getCompHighlightResult() {
        return this.CompHighlightResult;
    }

    /**
     * Set <p>视频语义浓缩结果（适用于视频语义浓缩）</p>
     * @param CompHighlightResult <p>视频语义浓缩结果（适用于视频语义浓缩）</p>
     */
    public void setCompHighlightResult(SeeCompHighlightResult CompHighlightResult) {
        this.CompHighlightResult = CompHighlightResult;
    }

    /**
     * Get <p>标签持续检测结果</p> 
     * @return DetectContinuousResult <p>标签持续检测结果</p>
     */
    public SeeDetectContinuousResult getDetectContinuousResult() {
        return this.DetectContinuousResult;
    }

    /**
     * Set <p>标签持续检测结果</p>
     * @param DetectContinuousResult <p>标签持续检测结果</p>
     */
    public void setDetectContinuousResult(SeeDetectContinuousResult DetectContinuousResult) {
        this.DetectContinuousResult = DetectContinuousResult;
    }

    /**
     * Get <p>完成该任务所消耗的基础能力额度</p> 
     * @return CostBasic <p>完成该任务所消耗的基础能力额度</p>
     */
    public Long getCostBasic() {
        return this.CostBasic;
    }

    /**
     * Set <p>完成该任务所消耗的基础能力额度</p>
     * @param CostBasic <p>完成该任务所消耗的基础能力额度</p>
     */
    public void setCostBasic(Long CostBasic) {
        this.CostBasic = CostBasic;
    }

    /**
     * Get <p>完成该任务所消耗的高级能力额度</p> 
     * @return CostAdvanced <p>完成该任务所消耗的高级能力额度</p>
     */
    public Long getCostAdvanced() {
        return this.CostAdvanced;
    }

    /**
     * Set <p>完成该任务所消耗的高级能力额度</p>
     * @param CostAdvanced <p>完成该任务所消耗的高级能力额度</p>
     */
    public void setCostAdvanced(Long CostAdvanced) {
        this.CostAdvanced = CostAdvanced;
    }

    /**
     * Get <p>输出文件名列表</p> 
     * @return Files <p>输出文件名列表</p>
     */
    public String [] getFiles() {
        return this.Files;
    }

    /**
     * Set <p>输出文件名列表</p>
     * @param Files <p>输出文件名列表</p>
     */
    public void setFiles(String [] Files) {
        this.Files = Files;
    }

    /**
     * Get <p>输出文件详情列表</p> 
     * @return FilesInfo <p>输出文件详情列表</p>
     */
    public CloudStorageAIServiceTaskFileInfo [] getFilesInfo() {
        return this.FilesInfo;
    }

    /**
     * Set <p>输出文件详情列表</p>
     * @param FilesInfo <p>输出文件详情列表</p>
     */
    public void setFilesInfo(CloudStorageAIServiceTaskFileInfo [] FilesInfo) {
        this.FilesInfo = FilesInfo;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>最后更新时间</p> 
     * @return UpdateTime <p>最后更新时间</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>最后更新时间</p>
     * @param UpdateTime <p>最后更新时间</p>
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>直传 COS 的对象 URI</p> 
     * @return COSURI <p>直传 COS 的对象 URI</p>
     */
    public String getCOSURI() {
        return this.COSURI;
    }

    /**
     * Set <p>直传 COS 的对象 URI</p>
     * @param COSURI <p>直传 COS 的对象 URI</p>
     */
    public void setCOSURI(String COSURI) {
        this.COSURI = COSURI;
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
        if (source.DetectContinuousResult != null) {
            this.DetectContinuousResult = new SeeDetectContinuousResult(source.DetectContinuousResult);
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
        if (source.COSURI != null) {
            this.COSURI = new String(source.COSURI);
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
        this.setParamObj(map, prefix + "DetectContinuousResult.", this.DetectContinuousResult);
        this.setParamSimple(map, prefix + "CostBasic", this.CostBasic);
        this.setParamSimple(map, prefix + "CostAdvanced", this.CostAdvanced);
        this.setParamArraySimple(map, prefix + "Files.", this.Files);
        this.setParamArrayObj(map, prefix + "FilesInfo.", this.FilesInfo);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "COSURI", this.COSURI);

    }
}

