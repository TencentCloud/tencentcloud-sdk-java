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

public class FilterLabelInfo extends AbstractModel{

    /**
    * 数据集id
    */
    @SerializedName("DatasetId")
    @Expose
    private String DatasetId;

    /**
    * 文件ID
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 文件路径
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 分类标签结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClassificationLabels")
    @Expose
    private String [] ClassificationLabels;

    /**
    * 检测标签结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DetectionLabels")
    @Expose
    private DetectionLabelInfo [] DetectionLabels;

    /**
    * 分割标签结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SegmentationLabels")
    @Expose
    private SegmentationInfo [] SegmentationLabels;

    /**
    * RGB 图片路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RGBPath")
    @Expose
    private String RGBPath;

    /**
    * 标签模板类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LabelTemplateType")
    @Expose
    private String LabelTemplateType;

    /**
    * 下载url链接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DownloadUrl")
    @Expose
    private String DownloadUrl;

    /**
    * 缩略图下载链接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DownloadThumbnailUrl")
    @Expose
    private String DownloadThumbnailUrl;

    /**
    * 分割结果图片下载链接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DownloadRGBUrl")
    @Expose
    private String DownloadRGBUrl;

    /**
    * OCR场景
IDENTITY：识别
STRUCTURE：智能结构化
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcrScene")
    @Expose
    private String OcrScene;

    /**
    * OCR场景标签列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcrLabels")
    @Expose
    private OcrLabelInfo [] OcrLabels;

    /**
     * Get 数据集id 
     * @return DatasetId 数据集id
     */
    public String getDatasetId() {
        return this.DatasetId;
    }

    /**
     * Set 数据集id
     * @param DatasetId 数据集id
     */
    public void setDatasetId(String DatasetId) {
        this.DatasetId = DatasetId;
    }

    /**
     * Get 文件ID 
     * @return FileId 文件ID
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 文件ID
     * @param FileId 文件ID
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get 文件路径 
     * @return FileName 文件路径
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件路径
     * @param FileName 文件路径
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 分类标签结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClassificationLabels 分类标签结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getClassificationLabels() {
        return this.ClassificationLabels;
    }

    /**
     * Set 分类标签结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClassificationLabels 分类标签结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClassificationLabels(String [] ClassificationLabels) {
        this.ClassificationLabels = ClassificationLabels;
    }

    /**
     * Get 检测标签结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DetectionLabels 检测标签结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DetectionLabelInfo [] getDetectionLabels() {
        return this.DetectionLabels;
    }

    /**
     * Set 检测标签结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param DetectionLabels 检测标签结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetectionLabels(DetectionLabelInfo [] DetectionLabels) {
        this.DetectionLabels = DetectionLabels;
    }

    /**
     * Get 分割标签结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SegmentationLabels 分割标签结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SegmentationInfo [] getSegmentationLabels() {
        return this.SegmentationLabels;
    }

    /**
     * Set 分割标签结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param SegmentationLabels 分割标签结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSegmentationLabels(SegmentationInfo [] SegmentationLabels) {
        this.SegmentationLabels = SegmentationLabels;
    }

    /**
     * Get RGB 图片路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RGBPath RGB 图片路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRGBPath() {
        return this.RGBPath;
    }

    /**
     * Set RGB 图片路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param RGBPath RGB 图片路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRGBPath(String RGBPath) {
        this.RGBPath = RGBPath;
    }

    /**
     * Get 标签模板类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LabelTemplateType 标签模板类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabelTemplateType() {
        return this.LabelTemplateType;
    }

    /**
     * Set 标签模板类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param LabelTemplateType 标签模板类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabelTemplateType(String LabelTemplateType) {
        this.LabelTemplateType = LabelTemplateType;
    }

    /**
     * Get 下载url链接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DownloadUrl 下载url链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDownloadUrl() {
        return this.DownloadUrl;
    }

    /**
     * Set 下载url链接
注意：此字段可能返回 null，表示取不到有效值。
     * @param DownloadUrl 下载url链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDownloadUrl(String DownloadUrl) {
        this.DownloadUrl = DownloadUrl;
    }

    /**
     * Get 缩略图下载链接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DownloadThumbnailUrl 缩略图下载链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDownloadThumbnailUrl() {
        return this.DownloadThumbnailUrl;
    }

    /**
     * Set 缩略图下载链接
注意：此字段可能返回 null，表示取不到有效值。
     * @param DownloadThumbnailUrl 缩略图下载链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDownloadThumbnailUrl(String DownloadThumbnailUrl) {
        this.DownloadThumbnailUrl = DownloadThumbnailUrl;
    }

    /**
     * Get 分割结果图片下载链接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DownloadRGBUrl 分割结果图片下载链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDownloadRGBUrl() {
        return this.DownloadRGBUrl;
    }

    /**
     * Set 分割结果图片下载链接
注意：此字段可能返回 null，表示取不到有效值。
     * @param DownloadRGBUrl 分割结果图片下载链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDownloadRGBUrl(String DownloadRGBUrl) {
        this.DownloadRGBUrl = DownloadRGBUrl;
    }

    /**
     * Get OCR场景
IDENTITY：识别
STRUCTURE：智能结构化
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcrScene OCR场景
IDENTITY：识别
STRUCTURE：智能结构化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOcrScene() {
        return this.OcrScene;
    }

    /**
     * Set OCR场景
IDENTITY：识别
STRUCTURE：智能结构化
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrScene OCR场景
IDENTITY：识别
STRUCTURE：智能结构化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrScene(String OcrScene) {
        this.OcrScene = OcrScene;
    }

    /**
     * Get OCR场景标签列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcrLabels OCR场景标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OcrLabelInfo [] getOcrLabels() {
        return this.OcrLabels;
    }

    /**
     * Set OCR场景标签列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrLabels OCR场景标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrLabels(OcrLabelInfo [] OcrLabels) {
        this.OcrLabels = OcrLabels;
    }

    public FilterLabelInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FilterLabelInfo(FilterLabelInfo source) {
        if (source.DatasetId != null) {
            this.DatasetId = new String(source.DatasetId);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.ClassificationLabels != null) {
            this.ClassificationLabels = new String[source.ClassificationLabels.length];
            for (int i = 0; i < source.ClassificationLabels.length; i++) {
                this.ClassificationLabels[i] = new String(source.ClassificationLabels[i]);
            }
        }
        if (source.DetectionLabels != null) {
            this.DetectionLabels = new DetectionLabelInfo[source.DetectionLabels.length];
            for (int i = 0; i < source.DetectionLabels.length; i++) {
                this.DetectionLabels[i] = new DetectionLabelInfo(source.DetectionLabels[i]);
            }
        }
        if (source.SegmentationLabels != null) {
            this.SegmentationLabels = new SegmentationInfo[source.SegmentationLabels.length];
            for (int i = 0; i < source.SegmentationLabels.length; i++) {
                this.SegmentationLabels[i] = new SegmentationInfo(source.SegmentationLabels[i]);
            }
        }
        if (source.RGBPath != null) {
            this.RGBPath = new String(source.RGBPath);
        }
        if (source.LabelTemplateType != null) {
            this.LabelTemplateType = new String(source.LabelTemplateType);
        }
        if (source.DownloadUrl != null) {
            this.DownloadUrl = new String(source.DownloadUrl);
        }
        if (source.DownloadThumbnailUrl != null) {
            this.DownloadThumbnailUrl = new String(source.DownloadThumbnailUrl);
        }
        if (source.DownloadRGBUrl != null) {
            this.DownloadRGBUrl = new String(source.DownloadRGBUrl);
        }
        if (source.OcrScene != null) {
            this.OcrScene = new String(source.OcrScene);
        }
        if (source.OcrLabels != null) {
            this.OcrLabels = new OcrLabelInfo[source.OcrLabels.length];
            for (int i = 0; i < source.OcrLabels.length; i++) {
                this.OcrLabels[i] = new OcrLabelInfo(source.OcrLabels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatasetId", this.DatasetId);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamArraySimple(map, prefix + "ClassificationLabels.", this.ClassificationLabels);
        this.setParamArrayObj(map, prefix + "DetectionLabels.", this.DetectionLabels);
        this.setParamArrayObj(map, prefix + "SegmentationLabels.", this.SegmentationLabels);
        this.setParamSimple(map, prefix + "RGBPath", this.RGBPath);
        this.setParamSimple(map, prefix + "LabelTemplateType", this.LabelTemplateType);
        this.setParamSimple(map, prefix + "DownloadUrl", this.DownloadUrl);
        this.setParamSimple(map, prefix + "DownloadThumbnailUrl", this.DownloadThumbnailUrl);
        this.setParamSimple(map, prefix + "DownloadRGBUrl", this.DownloadRGBUrl);
        this.setParamSimple(map, prefix + "OcrScene", this.OcrScene);
        this.setParamArrayObj(map, prefix + "OcrLabels.", this.OcrLabels);

    }
}

