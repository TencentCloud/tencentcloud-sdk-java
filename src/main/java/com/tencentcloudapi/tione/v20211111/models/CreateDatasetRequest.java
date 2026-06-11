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

public class CreateDatasetRequest extends AbstractModel {

    /**
    * <p>数据集名称，不超过60个字符，仅支持中英文、数字、下划线&quot;_&quot;、短横&quot;-&quot;，只能以中英文、数字开头</p>
    */
    @SerializedName("DatasetName")
    @Expose
    private String DatasetName;

    /**
    * <p>TI工作空间ID</p><p>仅用于“工作空间”白名单功能。如需使用，请联系TI管理员开通白名单。</p>
    */
    @SerializedName("TiProjectId")
    @Expose
    private String TiProjectId;

    /**
    * <p>数据集类型</p><p>枚举值：</p><ul><li>TYPE_DATASET_IMAGE： 图片</li><li>TYPE_DATASET_LLM： 大模型</li><li>TYPE_DATASET_TABLE： 表格</li><li>TYPE_DATASET_OTHER： 其他</li></ul>
    */
    @SerializedName("DatasetType")
    @Expose
    private String DatasetType;

    /**
    * <p>数据源cos路径</p>
    */
    @SerializedName("StorageDataPath")
    @Expose
    private CosPathInfo StorageDataPath;

    /**
    * <p>数据集标签cos存储路径</p>
    */
    @SerializedName("StorageLabelPath")
    @Expose
    private CosPathInfo StorageLabelPath;

    /**
    * <p>数据集标签</p>
    */
    @SerializedName("DatasetTags")
    @Expose
    private Tag [] DatasetTags;

    /**
    * <p>数据集标注状态</p><p>枚举值：</p><ul><li>STATUS_NON_ANNOTATED： 未标注</li><li>STATUS_ANNOTATED： 已标注</li></ul>
    */
    @SerializedName("AnnotationStatus")
    @Expose
    private String AnnotationStatus;

    /**
    * <p>标注类型</p><p>枚举值：</p><ul><li>ANNOTATION_TYPE_CLASSIFICATION： 图片分类</li><li>ANNOTATION_TYPE_DETECTION： 目标检测</li><li>ANNOTATION_TYPE_SEGMENTATION： 图片分割</li><li>ANNOTATION_TYPE_TRACKING： 目标跟踪</li><li>ANNOTATION_TYPE_OCR： OCR</li></ul>
    */
    @SerializedName("AnnotationType")
    @Expose
    private String AnnotationType;

    /**
    * <p>标注格式</p><p>枚举值：</p><ul><li>ANNOTATION_FORMAT_TI： TI-ONE平台格式</li><li>ANNOTATION_FORMAT_PASCAL： Pascal Voc格式</li><li>ANNOTATION_FORMAT_COCO： COCO格式</li><li>ANNOTATION_FORMAT_FILE： 文件目录结构</li></ul>
    */
    @SerializedName("AnnotationFormat")
    @Expose
    private String AnnotationFormat;

    /**
    * <p>表头信息</p>
    */
    @SerializedName("SchemaInfos")
    @Expose
    private SchemaInfo [] SchemaInfos;

    /**
    * <p>数据是否存在表头</p>
    */
    @SerializedName("IsSchemaExisted")
    @Expose
    private Boolean IsSchemaExisted;

    /**
    * <p>导入文件粒度</p><p>枚举值：</p><ul><li>TYPE_TEXT_LINE： 按行</li><li>TYPE_TEXT_FILE： 按文件</li></ul>
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
    * <p>数据集建模一级类别</p><p>枚举值：</p><ul><li>LLM： 大模型建模</li><li>CV： 传统CV建模</li><li>STRUCTURE： 大数据建模</li><li>OTHER： 其它</li></ul>
    */
    @SerializedName("DatasetScene")
    @Expose
    private String DatasetScene;

    /**
    * <p>数据集标签。</p>
    */
    @SerializedName("SceneTags")
    @Expose
    private String [] SceneTags;

    /**
    * <p>数据集CFS配置。仅支持LLM场景</p>
    */
    @SerializedName("CFSConfig")
    @Expose
    private CFSConfig CFSConfig;

    /**
     * Get <p>数据集名称，不超过60个字符，仅支持中英文、数字、下划线&quot;_&quot;、短横&quot;-&quot;，只能以中英文、数字开头</p> 
     * @return DatasetName <p>数据集名称，不超过60个字符，仅支持中英文、数字、下划线&quot;_&quot;、短横&quot;-&quot;，只能以中英文、数字开头</p>
     */
    public String getDatasetName() {
        return this.DatasetName;
    }

    /**
     * Set <p>数据集名称，不超过60个字符，仅支持中英文、数字、下划线&quot;_&quot;、短横&quot;-&quot;，只能以中英文、数字开头</p>
     * @param DatasetName <p>数据集名称，不超过60个字符，仅支持中英文、数字、下划线&quot;_&quot;、短横&quot;-&quot;，只能以中英文、数字开头</p>
     */
    public void setDatasetName(String DatasetName) {
        this.DatasetName = DatasetName;
    }

    /**
     * Get <p>TI工作空间ID</p><p>仅用于“工作空间”白名单功能。如需使用，请联系TI管理员开通白名单。</p> 
     * @return TiProjectId <p>TI工作空间ID</p><p>仅用于“工作空间”白名单功能。如需使用，请联系TI管理员开通白名单。</p>
     */
    public String getTiProjectId() {
        return this.TiProjectId;
    }

    /**
     * Set <p>TI工作空间ID</p><p>仅用于“工作空间”白名单功能。如需使用，请联系TI管理员开通白名单。</p>
     * @param TiProjectId <p>TI工作空间ID</p><p>仅用于“工作空间”白名单功能。如需使用，请联系TI管理员开通白名单。</p>
     */
    public void setTiProjectId(String TiProjectId) {
        this.TiProjectId = TiProjectId;
    }

    /**
     * Get <p>数据集类型</p><p>枚举值：</p><ul><li>TYPE_DATASET_IMAGE： 图片</li><li>TYPE_DATASET_LLM： 大模型</li><li>TYPE_DATASET_TABLE： 表格</li><li>TYPE_DATASET_OTHER： 其他</li></ul> 
     * @return DatasetType <p>数据集类型</p><p>枚举值：</p><ul><li>TYPE_DATASET_IMAGE： 图片</li><li>TYPE_DATASET_LLM： 大模型</li><li>TYPE_DATASET_TABLE： 表格</li><li>TYPE_DATASET_OTHER： 其他</li></ul>
     */
    public String getDatasetType() {
        return this.DatasetType;
    }

    /**
     * Set <p>数据集类型</p><p>枚举值：</p><ul><li>TYPE_DATASET_IMAGE： 图片</li><li>TYPE_DATASET_LLM： 大模型</li><li>TYPE_DATASET_TABLE： 表格</li><li>TYPE_DATASET_OTHER： 其他</li></ul>
     * @param DatasetType <p>数据集类型</p><p>枚举值：</p><ul><li>TYPE_DATASET_IMAGE： 图片</li><li>TYPE_DATASET_LLM： 大模型</li><li>TYPE_DATASET_TABLE： 表格</li><li>TYPE_DATASET_OTHER： 其他</li></ul>
     */
    public void setDatasetType(String DatasetType) {
        this.DatasetType = DatasetType;
    }

    /**
     * Get <p>数据源cos路径</p> 
     * @return StorageDataPath <p>数据源cos路径</p>
     */
    public CosPathInfo getStorageDataPath() {
        return this.StorageDataPath;
    }

    /**
     * Set <p>数据源cos路径</p>
     * @param StorageDataPath <p>数据源cos路径</p>
     */
    public void setStorageDataPath(CosPathInfo StorageDataPath) {
        this.StorageDataPath = StorageDataPath;
    }

    /**
     * Get <p>数据集标签cos存储路径</p> 
     * @return StorageLabelPath <p>数据集标签cos存储路径</p>
     */
    public CosPathInfo getStorageLabelPath() {
        return this.StorageLabelPath;
    }

    /**
     * Set <p>数据集标签cos存储路径</p>
     * @param StorageLabelPath <p>数据集标签cos存储路径</p>
     */
    public void setStorageLabelPath(CosPathInfo StorageLabelPath) {
        this.StorageLabelPath = StorageLabelPath;
    }

    /**
     * Get <p>数据集标签</p> 
     * @return DatasetTags <p>数据集标签</p>
     */
    public Tag [] getDatasetTags() {
        return this.DatasetTags;
    }

    /**
     * Set <p>数据集标签</p>
     * @param DatasetTags <p>数据集标签</p>
     */
    public void setDatasetTags(Tag [] DatasetTags) {
        this.DatasetTags = DatasetTags;
    }

    /**
     * Get <p>数据集标注状态</p><p>枚举值：</p><ul><li>STATUS_NON_ANNOTATED： 未标注</li><li>STATUS_ANNOTATED： 已标注</li></ul> 
     * @return AnnotationStatus <p>数据集标注状态</p><p>枚举值：</p><ul><li>STATUS_NON_ANNOTATED： 未标注</li><li>STATUS_ANNOTATED： 已标注</li></ul>
     */
    public String getAnnotationStatus() {
        return this.AnnotationStatus;
    }

    /**
     * Set <p>数据集标注状态</p><p>枚举值：</p><ul><li>STATUS_NON_ANNOTATED： 未标注</li><li>STATUS_ANNOTATED： 已标注</li></ul>
     * @param AnnotationStatus <p>数据集标注状态</p><p>枚举值：</p><ul><li>STATUS_NON_ANNOTATED： 未标注</li><li>STATUS_ANNOTATED： 已标注</li></ul>
     */
    public void setAnnotationStatus(String AnnotationStatus) {
        this.AnnotationStatus = AnnotationStatus;
    }

    /**
     * Get <p>标注类型</p><p>枚举值：</p><ul><li>ANNOTATION_TYPE_CLASSIFICATION： 图片分类</li><li>ANNOTATION_TYPE_DETECTION： 目标检测</li><li>ANNOTATION_TYPE_SEGMENTATION： 图片分割</li><li>ANNOTATION_TYPE_TRACKING： 目标跟踪</li><li>ANNOTATION_TYPE_OCR： OCR</li></ul> 
     * @return AnnotationType <p>标注类型</p><p>枚举值：</p><ul><li>ANNOTATION_TYPE_CLASSIFICATION： 图片分类</li><li>ANNOTATION_TYPE_DETECTION： 目标检测</li><li>ANNOTATION_TYPE_SEGMENTATION： 图片分割</li><li>ANNOTATION_TYPE_TRACKING： 目标跟踪</li><li>ANNOTATION_TYPE_OCR： OCR</li></ul>
     */
    public String getAnnotationType() {
        return this.AnnotationType;
    }

    /**
     * Set <p>标注类型</p><p>枚举值：</p><ul><li>ANNOTATION_TYPE_CLASSIFICATION： 图片分类</li><li>ANNOTATION_TYPE_DETECTION： 目标检测</li><li>ANNOTATION_TYPE_SEGMENTATION： 图片分割</li><li>ANNOTATION_TYPE_TRACKING： 目标跟踪</li><li>ANNOTATION_TYPE_OCR： OCR</li></ul>
     * @param AnnotationType <p>标注类型</p><p>枚举值：</p><ul><li>ANNOTATION_TYPE_CLASSIFICATION： 图片分类</li><li>ANNOTATION_TYPE_DETECTION： 目标检测</li><li>ANNOTATION_TYPE_SEGMENTATION： 图片分割</li><li>ANNOTATION_TYPE_TRACKING： 目标跟踪</li><li>ANNOTATION_TYPE_OCR： OCR</li></ul>
     */
    public void setAnnotationType(String AnnotationType) {
        this.AnnotationType = AnnotationType;
    }

    /**
     * Get <p>标注格式</p><p>枚举值：</p><ul><li>ANNOTATION_FORMAT_TI： TI-ONE平台格式</li><li>ANNOTATION_FORMAT_PASCAL： Pascal Voc格式</li><li>ANNOTATION_FORMAT_COCO： COCO格式</li><li>ANNOTATION_FORMAT_FILE： 文件目录结构</li></ul> 
     * @return AnnotationFormat <p>标注格式</p><p>枚举值：</p><ul><li>ANNOTATION_FORMAT_TI： TI-ONE平台格式</li><li>ANNOTATION_FORMAT_PASCAL： Pascal Voc格式</li><li>ANNOTATION_FORMAT_COCO： COCO格式</li><li>ANNOTATION_FORMAT_FILE： 文件目录结构</li></ul>
     */
    public String getAnnotationFormat() {
        return this.AnnotationFormat;
    }

    /**
     * Set <p>标注格式</p><p>枚举值：</p><ul><li>ANNOTATION_FORMAT_TI： TI-ONE平台格式</li><li>ANNOTATION_FORMAT_PASCAL： Pascal Voc格式</li><li>ANNOTATION_FORMAT_COCO： COCO格式</li><li>ANNOTATION_FORMAT_FILE： 文件目录结构</li></ul>
     * @param AnnotationFormat <p>标注格式</p><p>枚举值：</p><ul><li>ANNOTATION_FORMAT_TI： TI-ONE平台格式</li><li>ANNOTATION_FORMAT_PASCAL： Pascal Voc格式</li><li>ANNOTATION_FORMAT_COCO： COCO格式</li><li>ANNOTATION_FORMAT_FILE： 文件目录结构</li></ul>
     */
    public void setAnnotationFormat(String AnnotationFormat) {
        this.AnnotationFormat = AnnotationFormat;
    }

    /**
     * Get <p>表头信息</p> 
     * @return SchemaInfos <p>表头信息</p>
     */
    public SchemaInfo [] getSchemaInfos() {
        return this.SchemaInfos;
    }

    /**
     * Set <p>表头信息</p>
     * @param SchemaInfos <p>表头信息</p>
     */
    public void setSchemaInfos(SchemaInfo [] SchemaInfos) {
        this.SchemaInfos = SchemaInfos;
    }

    /**
     * Get <p>数据是否存在表头</p> 
     * @return IsSchemaExisted <p>数据是否存在表头</p>
     */
    public Boolean getIsSchemaExisted() {
        return this.IsSchemaExisted;
    }

    /**
     * Set <p>数据是否存在表头</p>
     * @param IsSchemaExisted <p>数据是否存在表头</p>
     */
    public void setIsSchemaExisted(Boolean IsSchemaExisted) {
        this.IsSchemaExisted = IsSchemaExisted;
    }

    /**
     * Get <p>导入文件粒度</p><p>枚举值：</p><ul><li>TYPE_TEXT_LINE： 按行</li><li>TYPE_TEXT_FILE： 按文件</li></ul> 
     * @return ContentType <p>导入文件粒度</p><p>枚举值：</p><ul><li>TYPE_TEXT_LINE： 按行</li><li>TYPE_TEXT_FILE： 按文件</li></ul>
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set <p>导入文件粒度</p><p>枚举值：</p><ul><li>TYPE_TEXT_LINE： 按行</li><li>TYPE_TEXT_FILE： 按文件</li></ul>
     * @param ContentType <p>导入文件粒度</p><p>枚举值：</p><ul><li>TYPE_TEXT_LINE： 按行</li><li>TYPE_TEXT_FILE： 按文件</li></ul>
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get <p>数据集建模一级类别</p><p>枚举值：</p><ul><li>LLM： 大模型建模</li><li>CV： 传统CV建模</li><li>STRUCTURE： 大数据建模</li><li>OTHER： 其它</li></ul> 
     * @return DatasetScene <p>数据集建模一级类别</p><p>枚举值：</p><ul><li>LLM： 大模型建模</li><li>CV： 传统CV建模</li><li>STRUCTURE： 大数据建模</li><li>OTHER： 其它</li></ul>
     */
    public String getDatasetScene() {
        return this.DatasetScene;
    }

    /**
     * Set <p>数据集建模一级类别</p><p>枚举值：</p><ul><li>LLM： 大模型建模</li><li>CV： 传统CV建模</li><li>STRUCTURE： 大数据建模</li><li>OTHER： 其它</li></ul>
     * @param DatasetScene <p>数据集建模一级类别</p><p>枚举值：</p><ul><li>LLM： 大模型建模</li><li>CV： 传统CV建模</li><li>STRUCTURE： 大数据建模</li><li>OTHER： 其它</li></ul>
     */
    public void setDatasetScene(String DatasetScene) {
        this.DatasetScene = DatasetScene;
    }

    /**
     * Get <p>数据集标签。</p> 
     * @return SceneTags <p>数据集标签。</p>
     */
    public String [] getSceneTags() {
        return this.SceneTags;
    }

    /**
     * Set <p>数据集标签。</p>
     * @param SceneTags <p>数据集标签。</p>
     */
    public void setSceneTags(String [] SceneTags) {
        this.SceneTags = SceneTags;
    }

    /**
     * Get <p>数据集CFS配置。仅支持LLM场景</p> 
     * @return CFSConfig <p>数据集CFS配置。仅支持LLM场景</p>
     */
    public CFSConfig getCFSConfig() {
        return this.CFSConfig;
    }

    /**
     * Set <p>数据集CFS配置。仅支持LLM场景</p>
     * @param CFSConfig <p>数据集CFS配置。仅支持LLM场景</p>
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
        if (source.TiProjectId != null) {
            this.TiProjectId = new String(source.TiProjectId);
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
        this.setParamSimple(map, prefix + "TiProjectId", this.TiProjectId);
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

