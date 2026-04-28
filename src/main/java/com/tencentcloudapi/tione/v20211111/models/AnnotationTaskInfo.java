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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AnnotationTaskInfo extends AbstractModel {

    /**
    * <p>标注任务id</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>标注任务名称</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>数据集id</p>
    */
    @SerializedName("DatasetId")
    @Expose
    private String DatasetId;

    /**
    * <p>数据集名称</p>
    */
    @SerializedName("DatasetName")
    @Expose
    private String DatasetName;

    /**
    * <p>标注场景名称</p>
    */
    @SerializedName("SceneName")
    @Expose
    private String SceneName;

    /**
    * <p>标注任务的label信息数组</p>
    */
    @SerializedName("LabelValueList")
    @Expose
    private LabelValue [] LabelValueList;

    /**
    * <p>tag详情数组</p>
    */
    @SerializedName("CamTagList")
    @Expose
    private CamTag [] CamTagList;

    /**
    * <p>任务状态</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>创建任务失败原因说明</p>
    */
    @SerializedName("AbnormalMsg")
    @Expose
    private String AbnormalMsg;

    /**
    * <p>标注任务是否正在提交</p>
    */
    @SerializedName("IsSubmitting")
    @Expose
    private Boolean IsSubmitting;

    /**
    * <p>任务详情描述</p>
    */
    @SerializedName("TaskNote")
    @Expose
    private String TaskNote;

    /**
    * <p>数据集版本</p>
    */
    @SerializedName("DataSetVersion")
    @Expose
    private String DataSetVersion;

    /**
    * <p>已经标注的图片数量</p>
    */
    @SerializedName("NumAnnotated")
    @Expose
    private Long NumAnnotated;

    /**
    * <p>标注的总图片数量</p>
    */
    @SerializedName("NumTotal")
    @Expose
    private Long NumTotal;

    /**
    * <p>创建任务的时间戳</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>Ocr Tool Type</p>
    */
    @SerializedName("OcrToolType")
    @Expose
    private Long OcrToolType;

    /**
    * <p>Ocr Text Attribute Annotate Enable</p>
    */
    @SerializedName("OcrTextAttributeAnnotateEnable")
    @Expose
    private Boolean OcrTextAttributeAnnotateEnable;

    /**
    * <p>导出格式</p>
    */
    @SerializedName("ExportFormat")
    @Expose
    private String ExportFormat;

    /**
    * <p>提交错误说明</p>
    */
    @SerializedName("SubmittingErrorMsg")
    @Expose
    private String SubmittingErrorMsg;

    /**
    * <p>ocr任务类型：1-识别。2-智能结构化</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcrAnnotationContentType")
    @Expose
    private Long OcrAnnotationContentType;

    /**
    * <p>OCR任务：是否启用辅助标注</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableAuxiliaryAnnotation")
    @Expose
    private Boolean EnableAuxiliaryAnnotation;

    /**
    * <p>数据集创建者UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasetCreator")
    @Expose
    private String DatasetCreator;

    /**
    * <p>任务创建者UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * <p>数据集创建者名称</p>
    */
    @SerializedName("DatasetCreatorName")
    @Expose
    private String DatasetCreatorName;

    /**
    * <p>任务创建者名称</p>
    */
    @SerializedName("CreatorName")
    @Expose
    private String CreatorName;

    /**
    * <p>标注任务状态枚举</p><p>枚举值：</p><ul><li>CREATING： 创建中</li><li>CREATE_SUCCESS： 创建成功，可标注</li><li>CREATE_FAILED： 创建失败</li><li>SUBMITTING： 提交中</li><li>SUBMIT_SUCCESS： 提交成功，需重启才可标注</li><li>SUBMIT_FAILED： 提交失败</li><li>ABNORMAL： 数据版本异常，需删除重建（大模型场景）</li></ul>
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
     * Get <p>标注任务id</p> 
     * @return TaskId <p>标注任务id</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>标注任务id</p>
     * @param TaskId <p>标注任务id</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>标注任务名称</p> 
     * @return TaskName <p>标注任务名称</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>标注任务名称</p>
     * @param TaskName <p>标注任务名称</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>数据集id</p> 
     * @return DatasetId <p>数据集id</p>
     */
    public String getDatasetId() {
        return this.DatasetId;
    }

    /**
     * Set <p>数据集id</p>
     * @param DatasetId <p>数据集id</p>
     */
    public void setDatasetId(String DatasetId) {
        this.DatasetId = DatasetId;
    }

    /**
     * Get <p>数据集名称</p> 
     * @return DatasetName <p>数据集名称</p>
     */
    public String getDatasetName() {
        return this.DatasetName;
    }

    /**
     * Set <p>数据集名称</p>
     * @param DatasetName <p>数据集名称</p>
     */
    public void setDatasetName(String DatasetName) {
        this.DatasetName = DatasetName;
    }

    /**
     * Get <p>标注场景名称</p> 
     * @return SceneName <p>标注场景名称</p>
     */
    public String getSceneName() {
        return this.SceneName;
    }

    /**
     * Set <p>标注场景名称</p>
     * @param SceneName <p>标注场景名称</p>
     */
    public void setSceneName(String SceneName) {
        this.SceneName = SceneName;
    }

    /**
     * Get <p>标注任务的label信息数组</p> 
     * @return LabelValueList <p>标注任务的label信息数组</p>
     */
    public LabelValue [] getLabelValueList() {
        return this.LabelValueList;
    }

    /**
     * Set <p>标注任务的label信息数组</p>
     * @param LabelValueList <p>标注任务的label信息数组</p>
     */
    public void setLabelValueList(LabelValue [] LabelValueList) {
        this.LabelValueList = LabelValueList;
    }

    /**
     * Get <p>tag详情数组</p> 
     * @return CamTagList <p>tag详情数组</p>
     */
    public CamTag [] getCamTagList() {
        return this.CamTagList;
    }

    /**
     * Set <p>tag详情数组</p>
     * @param CamTagList <p>tag详情数组</p>
     */
    public void setCamTagList(CamTag [] CamTagList) {
        this.CamTagList = CamTagList;
    }

    /**
     * Get <p>任务状态</p> 
     * @return Status <p>任务状态</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态</p>
     * @param Status <p>任务状态</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>创建任务失败原因说明</p> 
     * @return AbnormalMsg <p>创建任务失败原因说明</p>
     */
    public String getAbnormalMsg() {
        return this.AbnormalMsg;
    }

    /**
     * Set <p>创建任务失败原因说明</p>
     * @param AbnormalMsg <p>创建任务失败原因说明</p>
     */
    public void setAbnormalMsg(String AbnormalMsg) {
        this.AbnormalMsg = AbnormalMsg;
    }

    /**
     * Get <p>标注任务是否正在提交</p> 
     * @return IsSubmitting <p>标注任务是否正在提交</p>
     */
    public Boolean getIsSubmitting() {
        return this.IsSubmitting;
    }

    /**
     * Set <p>标注任务是否正在提交</p>
     * @param IsSubmitting <p>标注任务是否正在提交</p>
     */
    public void setIsSubmitting(Boolean IsSubmitting) {
        this.IsSubmitting = IsSubmitting;
    }

    /**
     * Get <p>任务详情描述</p> 
     * @return TaskNote <p>任务详情描述</p>
     */
    public String getTaskNote() {
        return this.TaskNote;
    }

    /**
     * Set <p>任务详情描述</p>
     * @param TaskNote <p>任务详情描述</p>
     */
    public void setTaskNote(String TaskNote) {
        this.TaskNote = TaskNote;
    }

    /**
     * Get <p>数据集版本</p> 
     * @return DataSetVersion <p>数据集版本</p>
     */
    public String getDataSetVersion() {
        return this.DataSetVersion;
    }

    /**
     * Set <p>数据集版本</p>
     * @param DataSetVersion <p>数据集版本</p>
     */
    public void setDataSetVersion(String DataSetVersion) {
        this.DataSetVersion = DataSetVersion;
    }

    /**
     * Get <p>已经标注的图片数量</p> 
     * @return NumAnnotated <p>已经标注的图片数量</p>
     */
    public Long getNumAnnotated() {
        return this.NumAnnotated;
    }

    /**
     * Set <p>已经标注的图片数量</p>
     * @param NumAnnotated <p>已经标注的图片数量</p>
     */
    public void setNumAnnotated(Long NumAnnotated) {
        this.NumAnnotated = NumAnnotated;
    }

    /**
     * Get <p>标注的总图片数量</p> 
     * @return NumTotal <p>标注的总图片数量</p>
     */
    public Long getNumTotal() {
        return this.NumTotal;
    }

    /**
     * Set <p>标注的总图片数量</p>
     * @param NumTotal <p>标注的总图片数量</p>
     */
    public void setNumTotal(Long NumTotal) {
        this.NumTotal = NumTotal;
    }

    /**
     * Get <p>创建任务的时间戳</p> 
     * @return CreateTime <p>创建任务的时间戳</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建任务的时间戳</p>
     * @param CreateTime <p>创建任务的时间戳</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Ocr Tool Type</p> 
     * @return OcrToolType <p>Ocr Tool Type</p>
     */
    public Long getOcrToolType() {
        return this.OcrToolType;
    }

    /**
     * Set <p>Ocr Tool Type</p>
     * @param OcrToolType <p>Ocr Tool Type</p>
     */
    public void setOcrToolType(Long OcrToolType) {
        this.OcrToolType = OcrToolType;
    }

    /**
     * Get <p>Ocr Text Attribute Annotate Enable</p> 
     * @return OcrTextAttributeAnnotateEnable <p>Ocr Text Attribute Annotate Enable</p>
     */
    public Boolean getOcrTextAttributeAnnotateEnable() {
        return this.OcrTextAttributeAnnotateEnable;
    }

    /**
     * Set <p>Ocr Text Attribute Annotate Enable</p>
     * @param OcrTextAttributeAnnotateEnable <p>Ocr Text Attribute Annotate Enable</p>
     */
    public void setOcrTextAttributeAnnotateEnable(Boolean OcrTextAttributeAnnotateEnable) {
        this.OcrTextAttributeAnnotateEnable = OcrTextAttributeAnnotateEnable;
    }

    /**
     * Get <p>导出格式</p> 
     * @return ExportFormat <p>导出格式</p>
     */
    public String getExportFormat() {
        return this.ExportFormat;
    }

    /**
     * Set <p>导出格式</p>
     * @param ExportFormat <p>导出格式</p>
     */
    public void setExportFormat(String ExportFormat) {
        this.ExportFormat = ExportFormat;
    }

    /**
     * Get <p>提交错误说明</p> 
     * @return SubmittingErrorMsg <p>提交错误说明</p>
     */
    public String getSubmittingErrorMsg() {
        return this.SubmittingErrorMsg;
    }

    /**
     * Set <p>提交错误说明</p>
     * @param SubmittingErrorMsg <p>提交错误说明</p>
     */
    public void setSubmittingErrorMsg(String SubmittingErrorMsg) {
        this.SubmittingErrorMsg = SubmittingErrorMsg;
    }

    /**
     * Get <p>ocr任务类型：1-识别。2-智能结构化</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcrAnnotationContentType <p>ocr任务类型：1-识别。2-智能结构化</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOcrAnnotationContentType() {
        return this.OcrAnnotationContentType;
    }

    /**
     * Set <p>ocr任务类型：1-识别。2-智能结构化</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrAnnotationContentType <p>ocr任务类型：1-识别。2-智能结构化</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrAnnotationContentType(Long OcrAnnotationContentType) {
        this.OcrAnnotationContentType = OcrAnnotationContentType;
    }

    /**
     * Get <p>OCR任务：是否启用辅助标注</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableAuxiliaryAnnotation <p>OCR任务：是否启用辅助标注</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableAuxiliaryAnnotation() {
        return this.EnableAuxiliaryAnnotation;
    }

    /**
     * Set <p>OCR任务：是否启用辅助标注</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableAuxiliaryAnnotation <p>OCR任务：是否启用辅助标注</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableAuxiliaryAnnotation(Boolean EnableAuxiliaryAnnotation) {
        this.EnableAuxiliaryAnnotation = EnableAuxiliaryAnnotation;
    }

    /**
     * Get <p>数据集创建者UIN</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasetCreator <p>数据集创建者UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasetCreator() {
        return this.DatasetCreator;
    }

    /**
     * Set <p>数据集创建者UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasetCreator <p>数据集创建者UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasetCreator(String DatasetCreator) {
        this.DatasetCreator = DatasetCreator;
    }

    /**
     * Get <p>任务创建者UIN</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Creator <p>任务创建者UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set <p>任务创建者UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Creator <p>任务创建者UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get <p>数据集创建者名称</p> 
     * @return DatasetCreatorName <p>数据集创建者名称</p>
     */
    public String getDatasetCreatorName() {
        return this.DatasetCreatorName;
    }

    /**
     * Set <p>数据集创建者名称</p>
     * @param DatasetCreatorName <p>数据集创建者名称</p>
     */
    public void setDatasetCreatorName(String DatasetCreatorName) {
        this.DatasetCreatorName = DatasetCreatorName;
    }

    /**
     * Get <p>任务创建者名称</p> 
     * @return CreatorName <p>任务创建者名称</p>
     */
    public String getCreatorName() {
        return this.CreatorName;
    }

    /**
     * Set <p>任务创建者名称</p>
     * @param CreatorName <p>任务创建者名称</p>
     */
    public void setCreatorName(String CreatorName) {
        this.CreatorName = CreatorName;
    }

    /**
     * Get <p>标注任务状态枚举</p><p>枚举值：</p><ul><li>CREATING： 创建中</li><li>CREATE_SUCCESS： 创建成功，可标注</li><li>CREATE_FAILED： 创建失败</li><li>SUBMITTING： 提交中</li><li>SUBMIT_SUCCESS： 提交成功，需重启才可标注</li><li>SUBMIT_FAILED： 提交失败</li><li>ABNORMAL： 数据版本异常，需删除重建（大模型场景）</li></ul> 
     * @return TaskStatus <p>标注任务状态枚举</p><p>枚举值：</p><ul><li>CREATING： 创建中</li><li>CREATE_SUCCESS： 创建成功，可标注</li><li>CREATE_FAILED： 创建失败</li><li>SUBMITTING： 提交中</li><li>SUBMIT_SUCCESS： 提交成功，需重启才可标注</li><li>SUBMIT_FAILED： 提交失败</li><li>ABNORMAL： 数据版本异常，需删除重建（大模型场景）</li></ul>
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set <p>标注任务状态枚举</p><p>枚举值：</p><ul><li>CREATING： 创建中</li><li>CREATE_SUCCESS： 创建成功，可标注</li><li>CREATE_FAILED： 创建失败</li><li>SUBMITTING： 提交中</li><li>SUBMIT_SUCCESS： 提交成功，需重启才可标注</li><li>SUBMIT_FAILED： 提交失败</li><li>ABNORMAL： 数据版本异常，需删除重建（大模型场景）</li></ul>
     * @param TaskStatus <p>标注任务状态枚举</p><p>枚举值：</p><ul><li>CREATING： 创建中</li><li>CREATE_SUCCESS： 创建成功，可标注</li><li>CREATE_FAILED： 创建失败</li><li>SUBMITTING： 提交中</li><li>SUBMIT_SUCCESS： 提交成功，需重启才可标注</li><li>SUBMIT_FAILED： 提交失败</li><li>ABNORMAL： 数据版本异常，需删除重建（大模型场景）</li></ul>
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    public AnnotationTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnnotationTaskInfo(AnnotationTaskInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.DatasetId != null) {
            this.DatasetId = new String(source.DatasetId);
        }
        if (source.DatasetName != null) {
            this.DatasetName = new String(source.DatasetName);
        }
        if (source.SceneName != null) {
            this.SceneName = new String(source.SceneName);
        }
        if (source.LabelValueList != null) {
            this.LabelValueList = new LabelValue[source.LabelValueList.length];
            for (int i = 0; i < source.LabelValueList.length; i++) {
                this.LabelValueList[i] = new LabelValue(source.LabelValueList[i]);
            }
        }
        if (source.CamTagList != null) {
            this.CamTagList = new CamTag[source.CamTagList.length];
            for (int i = 0; i < source.CamTagList.length; i++) {
                this.CamTagList[i] = new CamTag(source.CamTagList[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.AbnormalMsg != null) {
            this.AbnormalMsg = new String(source.AbnormalMsg);
        }
        if (source.IsSubmitting != null) {
            this.IsSubmitting = new Boolean(source.IsSubmitting);
        }
        if (source.TaskNote != null) {
            this.TaskNote = new String(source.TaskNote);
        }
        if (source.DataSetVersion != null) {
            this.DataSetVersion = new String(source.DataSetVersion);
        }
        if (source.NumAnnotated != null) {
            this.NumAnnotated = new Long(source.NumAnnotated);
        }
        if (source.NumTotal != null) {
            this.NumTotal = new Long(source.NumTotal);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.OcrToolType != null) {
            this.OcrToolType = new Long(source.OcrToolType);
        }
        if (source.OcrTextAttributeAnnotateEnable != null) {
            this.OcrTextAttributeAnnotateEnable = new Boolean(source.OcrTextAttributeAnnotateEnable);
        }
        if (source.ExportFormat != null) {
            this.ExportFormat = new String(source.ExportFormat);
        }
        if (source.SubmittingErrorMsg != null) {
            this.SubmittingErrorMsg = new String(source.SubmittingErrorMsg);
        }
        if (source.OcrAnnotationContentType != null) {
            this.OcrAnnotationContentType = new Long(source.OcrAnnotationContentType);
        }
        if (source.EnableAuxiliaryAnnotation != null) {
            this.EnableAuxiliaryAnnotation = new Boolean(source.EnableAuxiliaryAnnotation);
        }
        if (source.DatasetCreator != null) {
            this.DatasetCreator = new String(source.DatasetCreator);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.DatasetCreatorName != null) {
            this.DatasetCreatorName = new String(source.DatasetCreatorName);
        }
        if (source.CreatorName != null) {
            this.CreatorName = new String(source.CreatorName);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "DatasetId", this.DatasetId);
        this.setParamSimple(map, prefix + "DatasetName", this.DatasetName);
        this.setParamSimple(map, prefix + "SceneName", this.SceneName);
        this.setParamArrayObj(map, prefix + "LabelValueList.", this.LabelValueList);
        this.setParamArrayObj(map, prefix + "CamTagList.", this.CamTagList);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AbnormalMsg", this.AbnormalMsg);
        this.setParamSimple(map, prefix + "IsSubmitting", this.IsSubmitting);
        this.setParamSimple(map, prefix + "TaskNote", this.TaskNote);
        this.setParamSimple(map, prefix + "DataSetVersion", this.DataSetVersion);
        this.setParamSimple(map, prefix + "NumAnnotated", this.NumAnnotated);
        this.setParamSimple(map, prefix + "NumTotal", this.NumTotal);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "OcrToolType", this.OcrToolType);
        this.setParamSimple(map, prefix + "OcrTextAttributeAnnotateEnable", this.OcrTextAttributeAnnotateEnable);
        this.setParamSimple(map, prefix + "ExportFormat", this.ExportFormat);
        this.setParamSimple(map, prefix + "SubmittingErrorMsg", this.SubmittingErrorMsg);
        this.setParamSimple(map, prefix + "OcrAnnotationContentType", this.OcrAnnotationContentType);
        this.setParamSimple(map, prefix + "EnableAuxiliaryAnnotation", this.EnableAuxiliaryAnnotation);
        this.setParamSimple(map, prefix + "DatasetCreator", this.DatasetCreator);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "DatasetCreatorName", this.DatasetCreatorName);
        this.setParamSimple(map, prefix + "CreatorName", this.CreatorName);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);

    }
}

