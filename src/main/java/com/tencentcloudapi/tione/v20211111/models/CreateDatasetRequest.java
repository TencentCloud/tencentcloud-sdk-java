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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDatasetRequest extends AbstractModel {

    /**
    * 数据集名称，不超过60个字符，仅支持中英文、数字、下划线"_"、短横"-"，只能以中英文、数字开头
    */
    @SerializedName("DatasetName")
    @Expose
    private String DatasetName;

    /**
    * 数据集类型:
TYPE_DATASET_TEXT，文本
TYPE_DATASET_IMAGE，图片
TYPE_DATASET_TABLE，表格
TYPE_DATASET_OTHER，其他
    */
    @SerializedName("DatasetType")
    @Expose
    private String DatasetType;

    /**
    * 数据源cos路径
    */
    @SerializedName("StorageDataPath")
    @Expose
    private CosPathInfo StorageDataPath;

    /**
    * 数据集标签cos存储路径
    */
    @SerializedName("StorageLabelPath")
    @Expose
    private CosPathInfo StorageLabelPath;

    /**
    * 数据集标签
    */
    @SerializedName("DatasetTags")
    @Expose
    private Tag [] DatasetTags;

    /**
    * 数据集标注状态:
STATUS_NON_ANNOTATED，未标注
STATUS_ANNOTATED，已标注
    */
    @SerializedName("AnnotationStatus")
    @Expose
    private String AnnotationStatus;

    /**
    * 标注类型:
ANNOTATION_TYPE_CLASSIFICATION，图片分类
ANNOTATION_TYPE_DETECTION，目标检测
ANNOTATION_TYPE_SEGMENTATION，图片分割
ANNOTATION_TYPE_TRACKING，目标跟踪
ANNOTATION_TYPE_OCR，OCR
ANNOTATION_TYPE_TEXT_CLASSIFICATION，文本分类
    */
    @SerializedName("AnnotationType")
    @Expose
    private String AnnotationType;

    /**
    * 标注格式:
ANNOTATION_FORMAT_TI，TI平台格式
ANNOTATION_FORMAT_PASCAL，Pascal Voc
ANNOTATION_FORMAT_COCO，COCO
ANNOTATION_FORMAT_FILE，文件目录结构
ANNOTATION_FORMAT_TEXT_TI，文本类型TI平台格式
ANNOTATION_FORMAT_TXT，文本类型TXT格式
ANNOTATION_FORMAT_CSV，文本类型CSV格式
ANNOTATION_FORMAT_JSON，文本类型JSON格式
    */
    @SerializedName("AnnotationFormat")
    @Expose
    private String AnnotationFormat;

    /**
    * 表头信息
    */
    @SerializedName("SchemaInfos")
    @Expose
    private SchemaInfo [] SchemaInfos;

    /**
    * 数据是否存在表头
    */
    @SerializedName("IsSchemaExisted")
    @Expose
    private Boolean IsSchemaExisted;

    /**
    * 导入文件粒度
TYPE_TEXT_LINE，按行
TYPE_TEXT_FILE，按文件
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
    * 数据集建模一级类别。LLM,CV,STRUCTURE,OTHER
    */
    @SerializedName("DatasetScene")
    @Expose
    private String DatasetScene;

    /**
    * 数据集标签。
    */
    @SerializedName("SceneTags")
    @Expose
    private String [] SceneTags;

    /**
    * 数据集CFS配置。仅支持LLM场景
    */
    @SerializedName("CFSConfig")
    @Expose
    private CFSConfig CFSConfig;

    /**
     * Get 数据集名称，不超过60个字符，仅支持中英文、数字、下划线"_"、短横"-"，只能以中英文、数字开头 
     * @return DatasetName 数据集名称，不超过60个字符，仅支持中英文、数字、下划线"_"、短横"-"，只能以中英文、数字开头
     */
    public String getDatasetName() {
        return this.DatasetName;
    }

    /**
     * Set 数据集名称，不超过60个字符，仅支持中英文、数字、下划线"_"、短横"-"，只能以中英文、数字开头
     * @param DatasetName 数据集名称，不超过60个字符，仅支持中英文、数字、下划线"_"、短横"-"，只能以中英文、数字开头
     */
    public void setDatasetName(String DatasetName) {
        this.DatasetName = DatasetName;
    }

    /**
     * Get 数据集类型:
TYPE_DATASET_TEXT，文本
TYPE_DATASET_IMAGE，图片
TYPE_DATASET_TABLE，表格
TYPE_DATASET_OTHER，其他 
     * @return DatasetType 数据集类型:
TYPE_DATASET_TEXT，文本
TYPE_DATASET_IMAGE，图片
TYPE_DATASET_TABLE，表格
TYPE_DATASET_OTHER，其他
     */
    public String getDatasetType() {
        return this.DatasetType;
    }

    /**
     * Set 数据集类型:
TYPE_DATASET_TEXT，文本
TYPE_DATASET_IMAGE，图片
TYPE_DATASET_TABLE，表格
TYPE_DATASET_OTHER，其他
     * @param DatasetType 数据集类型:
TYPE_DATASET_TEXT，文本
TYPE_DATASET_IMAGE，图片
TYPE_DATASET_TABLE，表格
TYPE_DATASET_OTHER，其他
     */
    public void setDatasetType(String DatasetType) {
        this.DatasetType = DatasetType;
    }

    /**
     * Get 数据源cos路径 
     * @return StorageDataPath 数据源cos路径
     */
    public CosPathInfo getStorageDataPath() {
        return this.StorageDataPath;
    }

    /**
     * Set 数据源cos路径
     * @param StorageDataPath 数据源cos路径
     */
    public void setStorageDataPath(CosPathInfo StorageDataPath) {
        this.StorageDataPath = StorageDataPath;
    }

    /**
     * Get 数据集标签cos存储路径 
     * @return StorageLabelPath 数据集标签cos存储路径
     */
    public CosPathInfo getStorageLabelPath() {
        return this.StorageLabelPath;
    }

    /**
     * Set 数据集标签cos存储路径
     * @param StorageLabelPath 数据集标签cos存储路径
     */
    public void setStorageLabelPath(CosPathInfo StorageLabelPath) {
        this.StorageLabelPath = StorageLabelPath;
    }

    /**
     * Get 数据集标签 
     * @return DatasetTags 数据集标签
     */
    public Tag [] getDatasetTags() {
        return this.DatasetTags;
    }

    /**
     * Set 数据集标签
     * @param DatasetTags 数据集标签
     */
    public void setDatasetTags(Tag [] DatasetTags) {
        this.DatasetTags = DatasetTags;
    }

    /**
     * Get 数据集标注状态:
STATUS_NON_ANNOTATED，未标注
STATUS_ANNOTATED，已标注 
     * @return AnnotationStatus 数据集标注状态:
STATUS_NON_ANNOTATED，未标注
STATUS_ANNOTATED，已标注
     */
    public String getAnnotationStatus() {
        return this.AnnotationStatus;
    }

    /**
     * Set 数据集标注状态:
STATUS_NON_ANNOTATED，未标注
STATUS_ANNOTATED，已标注
     * @param AnnotationStatus 数据集标注状态:
STATUS_NON_ANNOTATED，未标注
STATUS_ANNOTATED，已标注
     */
    public void setAnnotationStatus(String AnnotationStatus) {
        this.AnnotationStatus = AnnotationStatus;
    }

    /**
     * Get 标注类型:
ANNOTATION_TYPE_CLASSIFICATION，图片分类
ANNOTATION_TYPE_DETECTION，目标检测
ANNOTATION_TYPE_SEGMENTATION，图片分割
ANNOTATION_TYPE_TRACKING，目标跟踪
ANNOTATION_TYPE_OCR，OCR
ANNOTATION_TYPE_TEXT_CLASSIFICATION，文本分类 
     * @return AnnotationType 标注类型:
ANNOTATION_TYPE_CLASSIFICATION，图片分类
ANNOTATION_TYPE_DETECTION，目标检测
ANNOTATION_TYPE_SEGMENTATION，图片分割
ANNOTATION_TYPE_TRACKING，目标跟踪
ANNOTATION_TYPE_OCR，OCR
ANNOTATION_TYPE_TEXT_CLASSIFICATION，文本分类
     */
    public String getAnnotationType() {
        return this.AnnotationType;
    }

    /**
     * Set 标注类型:
ANNOTATION_TYPE_CLASSIFICATION，图片分类
ANNOTATION_TYPE_DETECTION，目标检测
ANNOTATION_TYPE_SEGMENTATION，图片分割
ANNOTATION_TYPE_TRACKING，目标跟踪
ANNOTATION_TYPE_OCR，OCR
ANNOTATION_TYPE_TEXT_CLASSIFICATION，文本分类
     * @param AnnotationType 标注类型:
ANNOTATION_TYPE_CLASSIFICATION，图片分类
ANNOTATION_TYPE_DETECTION，目标检测
ANNOTATION_TYPE_SEGMENTATION，图片分割
ANNOTATION_TYPE_TRACKING，目标跟踪
ANNOTATION_TYPE_OCR，OCR
ANNOTATION_TYPE_TEXT_CLASSIFICATION，文本分类
     */
    public void setAnnotationType(String AnnotationType) {
        this.AnnotationType = AnnotationType;
    }

    /**
     * Get 标注格式:
ANNOTATION_FORMAT_TI，TI平台格式
ANNOTATION_FORMAT_PASCAL，Pascal Voc
ANNOTATION_FORMAT_COCO，COCO
ANNOTATION_FORMAT_FILE，文件目录结构
ANNOTATION_FORMAT_TEXT_TI，文本类型TI平台格式
ANNOTATION_FORMAT_TXT，文本类型TXT格式
ANNOTATION_FORMAT_CSV，文本类型CSV格式
ANNOTATION_FORMAT_JSON，文本类型JSON格式 
     * @return AnnotationFormat 标注格式:
ANNOTATION_FORMAT_TI，TI平台格式
ANNOTATION_FORMAT_PASCAL，Pascal Voc
ANNOTATION_FORMAT_COCO，COCO
ANNOTATION_FORMAT_FILE，文件目录结构
ANNOTATION_FORMAT_TEXT_TI，文本类型TI平台格式
ANNOTATION_FORMAT_TXT，文本类型TXT格式
ANNOTATION_FORMAT_CSV，文本类型CSV格式
ANNOTATION_FORMAT_JSON，文本类型JSON格式
     */
    public String getAnnotationFormat() {
        return this.AnnotationFormat;
    }

    /**
     * Set 标注格式:
ANNOTATION_FORMAT_TI，TI平台格式
ANNOTATION_FORMAT_PASCAL，Pascal Voc
ANNOTATION_FORMAT_COCO，COCO
ANNOTATION_FORMAT_FILE，文件目录结构
ANNOTATION_FORMAT_TEXT_TI，文本类型TI平台格式
ANNOTATION_FORMAT_TXT，文本类型TXT格式
ANNOTATION_FORMAT_CSV，文本类型CSV格式
ANNOTATION_FORMAT_JSON，文本类型JSON格式
     * @param AnnotationFormat 标注格式:
ANNOTATION_FORMAT_TI，TI平台格式
ANNOTATION_FORMAT_PASCAL，Pascal Voc
ANNOTATION_FORMAT_COCO，COCO
ANNOTATION_FORMAT_FILE，文件目录结构
ANNOTATION_FORMAT_TEXT_TI，文本类型TI平台格式
ANNOTATION_FORMAT_TXT，文本类型TXT格式
ANNOTATION_FORMAT_CSV，文本类型CSV格式
ANNOTATION_FORMAT_JSON，文本类型JSON格式
     */
    public void setAnnotationFormat(String AnnotationFormat) {
        this.AnnotationFormat = AnnotationFormat;
    }

    /**
     * Get 表头信息 
     * @return SchemaInfos 表头信息
     */
    public SchemaInfo [] getSchemaInfos() {
        return this.SchemaInfos;
    }

    /**
     * Set 表头信息
     * @param SchemaInfos 表头信息
     */
    public void setSchemaInfos(SchemaInfo [] SchemaInfos) {
        this.SchemaInfos = SchemaInfos;
    }

    /**
     * Get 数据是否存在表头 
     * @return IsSchemaExisted 数据是否存在表头
     */
    public Boolean getIsSchemaExisted() {
        return this.IsSchemaExisted;
    }

    /**
     * Set 数据是否存在表头
     * @param IsSchemaExisted 数据是否存在表头
     */
    public void setIsSchemaExisted(Boolean IsSchemaExisted) {
        this.IsSchemaExisted = IsSchemaExisted;
    }

    /**
     * Get 导入文件粒度
TYPE_TEXT_LINE，按行
TYPE_TEXT_FILE，按文件 
     * @return ContentType 导入文件粒度
TYPE_TEXT_LINE，按行
TYPE_TEXT_FILE，按文件
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set 导入文件粒度
TYPE_TEXT_LINE，按行
TYPE_TEXT_FILE，按文件
     * @param ContentType 导入文件粒度
TYPE_TEXT_LINE，按行
TYPE_TEXT_FILE，按文件
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get 数据集建模一级类别。LLM,CV,STRUCTURE,OTHER 
     * @return DatasetScene 数据集建模一级类别。LLM,CV,STRUCTURE,OTHER
     */
    public String getDatasetScene() {
        return this.DatasetScene;
    }

    /**
     * Set 数据集建模一级类别。LLM,CV,STRUCTURE,OTHER
     * @param DatasetScene 数据集建模一级类别。LLM,CV,STRUCTURE,OTHER
     */
    public void setDatasetScene(String DatasetScene) {
        this.DatasetScene = DatasetScene;
    }

    /**
     * Get 数据集标签。 
     * @return SceneTags 数据集标签。
     */
    public String [] getSceneTags() {
        return this.SceneTags;
    }

    /**
     * Set 数据集标签。
     * @param SceneTags 数据集标签。
     */
    public void setSceneTags(String [] SceneTags) {
        this.SceneTags = SceneTags;
    }

    /**
     * Get 数据集CFS配置。仅支持LLM场景 
     * @return CFSConfig 数据集CFS配置。仅支持LLM场景
     */
    public CFSConfig getCFSConfig() {
        return this.CFSConfig;
    }

    /**
     * Set 数据集CFS配置。仅支持LLM场景
     * @param CFSConfig 数据集CFS配置。仅支持LLM场景
     */
    public void setCFSConfig(CFSConfig CFSConfig) {
        this.CFSConfig = CFSConfig;
    }

    public CreateDatasetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDatasetRequest(CreateDatasetRequest source) {
        if (source.DatasetName != null) {
            this.DatasetName = new String(source.DatasetName);
        }
        if (source.DatasetType != null) {
            this.DatasetType = new String(source.DatasetType);
        }
        if (source.StorageDataPath != null) {
            this.StorageDataPath = new CosPathInfo(source.StorageDataPath);
        }
        if (source.StorageLabelPath != null) {
            this.StorageLabelPath = new CosPathInfo(source.StorageLabelPath);
        }
        if (source.DatasetTags != null) {
            this.DatasetTags = new Tag[source.DatasetTags.length];
            for (int i = 0; i < source.DatasetTags.length; i++) {
                this.DatasetTags[i] = new Tag(source.DatasetTags[i]);
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
        if (source.SchemaInfos != null) {
            this.SchemaInfos = new SchemaInfo[source.SchemaInfos.length];
            for (int i = 0; i < source.SchemaInfos.length; i++) {
                this.SchemaInfos[i] = new SchemaInfo(source.SchemaInfos[i]);
            }
        }
        if (source.IsSchemaExisted != null) {
            this.IsSchemaExisted = new Boolean(source.IsSchemaExisted);
        }
        if (source.ContentType != null) {
            this.ContentType = new String(source.ContentType);
        }
        if (source.DatasetScene != null) {
            this.DatasetScene = new String(source.DatasetScene);
        }
        if (source.SceneTags != null) {
            this.SceneTags = new String[source.SceneTags.length];
            for (int i = 0; i < source.SceneTags.length; i++) {
                this.SceneTags[i] = new String(source.SceneTags[i]);
            }
        }
        if (source.CFSConfig != null) {
            this.CFSConfig = new CFSConfig(source.CFSConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatasetName", this.DatasetName);
        this.setParamSimple(map, prefix + "DatasetType", this.DatasetType);
        this.setParamObj(map, prefix + "StorageDataPath.", this.StorageDataPath);
        this.setParamObj(map, prefix + "StorageLabelPath.", this.StorageLabelPath);
        this.setParamArrayObj(map, prefix + "DatasetTags.", this.DatasetTags);
        this.setParamSimple(map, prefix + "AnnotationStatus", this.AnnotationStatus);
        this.setParamSimple(map, prefix + "AnnotationType", this.AnnotationType);
        this.setParamSimple(map, prefix + "AnnotationFormat", this.AnnotationFormat);
        this.setParamArrayObj(map, prefix + "SchemaInfos.", this.SchemaInfos);
        this.setParamSimple(map, prefix + "IsSchemaExisted", this.IsSchemaExisted);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamSimple(map, prefix + "DatasetScene", this.DatasetScene);
        this.setParamArraySimple(map, prefix + "SceneTags.", this.SceneTags);
        this.setParamObj(map, prefix + "CFSConfig.", this.CFSConfig);

    }
}

