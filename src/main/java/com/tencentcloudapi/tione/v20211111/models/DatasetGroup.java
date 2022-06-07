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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DatasetGroup extends AbstractModel{

    /**
    * 数据集ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasetId")
    @Expose
    private String DatasetId;

    /**
    * 数据集名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasetName")
    @Expose
    private String DatasetName;

    /**
    * 创建者
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * 数据集版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasetVersion")
    @Expose
    private String DatasetVersion;

    /**
    * 数据集类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasetType")
    @Expose
    private String DatasetType;

    /**
    * 数据集标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasetTags")
    @Expose
    private Tag [] DatasetTags;

    /**
    * 数据集标注任务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasetAnnotationTaskName")
    @Expose
    private String DatasetAnnotationTaskName;

    /**
    * 数据集标注任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasetAnnotationTaskId")
    @Expose
    private String DatasetAnnotationTaskId;

    /**
    * 处理进度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Process")
    @Expose
    private Long Process;

    /**
    * 数据集状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasetStatus")
    @Expose
    private String DatasetStatus;

    /**
    * 错误详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 外部关联TASKType
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExternalTaskType")
    @Expose
    private String ExternalTaskType;

    /**
    * 数据集大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasetSize")
    @Expose
    private String DatasetSize;

    /**
    * 数据集数据量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileNum")
    @Expose
    private Long FileNum;

    /**
    * 数据集源COS路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageDataPath")
    @Expose
    private CosPathInfo StorageDataPath;

    /**
    * 数据集标签存储路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageLabelPath")
    @Expose
    private CosPathInfo StorageLabelPath;

    /**
    * 数据集版本聚合详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasetVersions")
    @Expose
    private DatasetInfo [] DatasetVersions;

    /**
    * 数据集标注状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AnnotationStatus")
    @Expose
    private String AnnotationStatus;

    /**
    * 数据集类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AnnotationType")
    @Expose
    private String AnnotationType;

    /**
    * 数据集标注格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AnnotationFormat")
    @Expose
    private String AnnotationFormat;

    /**
    * 数据集范围
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasetScope")
    @Expose
    private String DatasetScope;

    /**
     * Get 数据集ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasetId 数据集ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasetId() {
        return this.DatasetId;
    }

    /**
     * Set 数据集ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasetId 数据集ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasetId(String DatasetId) {
        this.DatasetId = DatasetId;
    }

    /**
     * Get 数据集名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasetName 数据集名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasetName() {
        return this.DatasetName;
    }

    /**
     * Set 数据集名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasetName 数据集名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasetName(String DatasetName) {
        this.DatasetName = DatasetName;
    }

    /**
     * Get 创建者
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Creator 创建者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 创建者
注意：此字段可能返回 null，表示取不到有效值。
     * @param Creator 创建者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get 数据集版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasetVersion 数据集版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasetVersion() {
        return this.DatasetVersion;
    }

    /**
     * Set 数据集版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasetVersion 数据集版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasetVersion(String DatasetVersion) {
        this.DatasetVersion = DatasetVersion;
    }

    /**
     * Get 数据集类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasetType 数据集类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasetType() {
        return this.DatasetType;
    }

    /**
     * Set 数据集类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasetType 数据集类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasetType(String DatasetType) {
        this.DatasetType = DatasetType;
    }

    /**
     * Get 数据集标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasetTags 数据集标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getDatasetTags() {
        return this.DatasetTags;
    }

    /**
     * Set 数据集标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasetTags 数据集标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasetTags(Tag [] DatasetTags) {
        this.DatasetTags = DatasetTags;
    }

    /**
     * Get 数据集标注任务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasetAnnotationTaskName 数据集标注任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasetAnnotationTaskName() {
        return this.DatasetAnnotationTaskName;
    }

    /**
     * Set 数据集标注任务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasetAnnotationTaskName 数据集标注任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasetAnnotationTaskName(String DatasetAnnotationTaskName) {
        this.DatasetAnnotationTaskName = DatasetAnnotationTaskName;
    }

    /**
     * Get 数据集标注任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasetAnnotationTaskId 数据集标注任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasetAnnotationTaskId() {
        return this.DatasetAnnotationTaskId;
    }

    /**
     * Set 数据集标注任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasetAnnotationTaskId 数据集标注任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasetAnnotationTaskId(String DatasetAnnotationTaskId) {
        this.DatasetAnnotationTaskId = DatasetAnnotationTaskId;
    }

    /**
     * Get 处理进度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Process 处理进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProcess() {
        return this.Process;
    }

    /**
     * Set 处理进度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Process 处理进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcess(Long Process) {
        this.Process = Process;
    }

    /**
     * Get 数据集状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasetStatus 数据集状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasetStatus() {
        return this.DatasetStatus;
    }

    /**
     * Set 数据集状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasetStatus 数据集状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasetStatus(String DatasetStatus) {
        this.DatasetStatus = DatasetStatus;
    }

    /**
     * Get 错误详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorMsg 错误详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set 错误详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorMsg 错误详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 外部关联TASKType
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExternalTaskType 外部关联TASKType
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExternalTaskType() {
        return this.ExternalTaskType;
    }

    /**
     * Set 外部关联TASKType
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExternalTaskType 外部关联TASKType
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternalTaskType(String ExternalTaskType) {
        this.ExternalTaskType = ExternalTaskType;
    }

    /**
     * Get 数据集大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasetSize 数据集大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasetSize() {
        return this.DatasetSize;
    }

    /**
     * Set 数据集大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasetSize 数据集大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasetSize(String DatasetSize) {
        this.DatasetSize = DatasetSize;
    }

    /**
     * Get 数据集数据量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileNum 数据集数据量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFileNum() {
        return this.FileNum;
    }

    /**
     * Set 数据集数据量
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileNum 数据集数据量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileNum(Long FileNum) {
        this.FileNum = FileNum;
    }

    /**
     * Get 数据集源COS路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageDataPath 数据集源COS路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CosPathInfo getStorageDataPath() {
        return this.StorageDataPath;
    }

    /**
     * Set 数据集源COS路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageDataPath 数据集源COS路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageDataPath(CosPathInfo StorageDataPath) {
        this.StorageDataPath = StorageDataPath;
    }

    /**
     * Get 数据集标签存储路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageLabelPath 数据集标签存储路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CosPathInfo getStorageLabelPath() {
        return this.StorageLabelPath;
    }

    /**
     * Set 数据集标签存储路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageLabelPath 数据集标签存储路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageLabelPath(CosPathInfo StorageLabelPath) {
        this.StorageLabelPath = StorageLabelPath;
    }

    /**
     * Get 数据集版本聚合详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasetVersions 数据集版本聚合详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DatasetInfo [] getDatasetVersions() {
        return this.DatasetVersions;
    }

    /**
     * Set 数据集版本聚合详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasetVersions 数据集版本聚合详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasetVersions(DatasetInfo [] DatasetVersions) {
        this.DatasetVersions = DatasetVersions;
    }

    /**
     * Get 数据集标注状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AnnotationStatus 数据集标注状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAnnotationStatus() {
        return this.AnnotationStatus;
    }

    /**
     * Set 数据集标注状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param AnnotationStatus 数据集标注状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnnotationStatus(String AnnotationStatus) {
        this.AnnotationStatus = AnnotationStatus;
    }

    /**
     * Get 数据集类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AnnotationType 数据集类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAnnotationType() {
        return this.AnnotationType;
    }

    /**
     * Set 数据集类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param AnnotationType 数据集类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnnotationType(String AnnotationType) {
        this.AnnotationType = AnnotationType;
    }

    /**
     * Get 数据集标注格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AnnotationFormat 数据集标注格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAnnotationFormat() {
        return this.AnnotationFormat;
    }

    /**
     * Set 数据集标注格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param AnnotationFormat 数据集标注格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnnotationFormat(String AnnotationFormat) {
        this.AnnotationFormat = AnnotationFormat;
    }

    /**
     * Get 数据集范围
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasetScope 数据集范围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasetScope() {
        return this.DatasetScope;
    }

    /**
     * Set 数据集范围
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasetScope 数据集范围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasetScope(String DatasetScope) {
        this.DatasetScope = DatasetScope;
    }

    public DatasetGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DatasetGroup(DatasetGroup source) {
        if (source.DatasetId != null) {
            this.DatasetId = new String(source.DatasetId);
        }
        if (source.DatasetName != null) {
            this.DatasetName = new String(source.DatasetName);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.DatasetVersion != null) {
            this.DatasetVersion = new String(source.DatasetVersion);
        }
        if (source.DatasetType != null) {
            this.DatasetType = new String(source.DatasetType);
        }
        if (source.DatasetTags != null) {
            this.DatasetTags = new Tag[source.DatasetTags.length];
            for (int i = 0; i < source.DatasetTags.length; i++) {
                this.DatasetTags[i] = new Tag(source.DatasetTags[i]);
            }
        }
        if (source.DatasetAnnotationTaskName != null) {
            this.DatasetAnnotationTaskName = new String(source.DatasetAnnotationTaskName);
        }
        if (source.DatasetAnnotationTaskId != null) {
            this.DatasetAnnotationTaskId = new String(source.DatasetAnnotationTaskId);
        }
        if (source.Process != null) {
            this.Process = new Long(source.Process);
        }
        if (source.DatasetStatus != null) {
            this.DatasetStatus = new String(source.DatasetStatus);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ExternalTaskType != null) {
            this.ExternalTaskType = new String(source.ExternalTaskType);
        }
        if (source.DatasetSize != null) {
            this.DatasetSize = new String(source.DatasetSize);
        }
        if (source.FileNum != null) {
            this.FileNum = new Long(source.FileNum);
        }
        if (source.StorageDataPath != null) {
            this.StorageDataPath = new CosPathInfo(source.StorageDataPath);
        }
        if (source.StorageLabelPath != null) {
            this.StorageLabelPath = new CosPathInfo(source.StorageLabelPath);
        }
        if (source.DatasetVersions != null) {
            this.DatasetVersions = new DatasetInfo[source.DatasetVersions.length];
            for (int i = 0; i < source.DatasetVersions.length; i++) {
                this.DatasetVersions[i] = new DatasetInfo(source.DatasetVersions[i]);
            }
        }
        if (source.AnnotationStatus != null) {
            this.AnnotationStatus = new String(source.AnnotationStatus);
        }
        if (source.AnnotationType != null) {
            this.AnnotationType = new String(source.AnnotationType);
        }
        if (source.AnnotationFormat != null) {
            this.AnnotationFormat = new String(source.AnnotationFormat);
        }
        if (source.DatasetScope != null) {
            this.DatasetScope = new String(source.DatasetScope);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatasetId", this.DatasetId);
        this.setParamSimple(map, prefix + "DatasetName", this.DatasetName);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "DatasetVersion", this.DatasetVersion);
        this.setParamSimple(map, prefix + "DatasetType", this.DatasetType);
        this.setParamArrayObj(map, prefix + "DatasetTags.", this.DatasetTags);
        this.setParamSimple(map, prefix + "DatasetAnnotationTaskName", this.DatasetAnnotationTaskName);
        this.setParamSimple(map, prefix + "DatasetAnnotationTaskId", this.DatasetAnnotationTaskId);
        this.setParamSimple(map, prefix + "Process", this.Process);
        this.setParamSimple(map, prefix + "DatasetStatus", this.DatasetStatus);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ExternalTaskType", this.ExternalTaskType);
        this.setParamSimple(map, prefix + "DatasetSize", this.DatasetSize);
        this.setParamSimple(map, prefix + "FileNum", this.FileNum);
        this.setParamObj(map, prefix + "StorageDataPath.", this.StorageDataPath);
        this.setParamObj(map, prefix + "StorageLabelPath.", this.StorageLabelPath);
        this.setParamArrayObj(map, prefix + "DatasetVersions.", this.DatasetVersions);
        this.setParamSimple(map, prefix + "AnnotationStatus", this.AnnotationStatus);
        this.setParamSimple(map, prefix + "AnnotationType", this.AnnotationType);
        this.setParamSimple(map, prefix + "AnnotationFormat", this.AnnotationFormat);
        this.setParamSimple(map, prefix + "DatasetScope", this.DatasetScope);

    }
}

