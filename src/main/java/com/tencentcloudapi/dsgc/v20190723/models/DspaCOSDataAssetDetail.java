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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspaCOSDataAssetDetail extends AbstractModel{

    /**
    * 对象桶
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * 对象名称
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 出现次数
    */
    @SerializedName("SensitiveDataCount")
    @Expose
    private Long SensitiveDataCount;

    /**
    * 敏感数据分类
    */
    @SerializedName("CategoryName")
    @Expose
    private String CategoryName;

    /**
    * 敏感等级
    */
    @SerializedName("LevelRiskName")
    @Expose
    private String LevelRiskName;

    /**
    * KMS加密
    */
    @SerializedName("KMSEncrypted")
    @Expose
    private Boolean KMSEncrypted;

    /**
    * 文件类型
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 文件大小
    */
    @SerializedName("FileSize")
    @Expose
    private String FileSize;

    /**
    * 敏感数据分级分数
    */
    @SerializedName("LevelRiskScore")
    @Expose
    private Long LevelRiskScore;

    /**
    * 数据源ID
    */
    @SerializedName("DataSourceId")
    @Expose
    private String DataSourceId;

    /**
    * 规则id
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 资源所在地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * 分类ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CategoryId")
    @Expose
    private Long CategoryId;

    /**
    * 分级ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LevelId")
    @Expose
    private Long LevelId;

    /**
    * 文件扫描结果ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileResultId")
    @Expose
    private Long FileResultId;

    /**
    * 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataSourceName")
    @Expose
    private String DataSourceName;

    /**
    * 分类路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CategoryFullPath")
    @Expose
    private String CategoryFullPath;

    /**
     * Get 对象桶 
     * @return BucketName 对象桶
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set 对象桶
     * @param BucketName 对象桶
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get 对象名称 
     * @return FileName 对象名称
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 对象名称
     * @param FileName 对象名称
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 规则名称 
     * @return RuleName 规则名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称
     * @param RuleName 规则名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 出现次数 
     * @return SensitiveDataCount 出现次数
     */
    public Long getSensitiveDataCount() {
        return this.SensitiveDataCount;
    }

    /**
     * Set 出现次数
     * @param SensitiveDataCount 出现次数
     */
    public void setSensitiveDataCount(Long SensitiveDataCount) {
        this.SensitiveDataCount = SensitiveDataCount;
    }

    /**
     * Get 敏感数据分类 
     * @return CategoryName 敏感数据分类
     */
    public String getCategoryName() {
        return this.CategoryName;
    }

    /**
     * Set 敏感数据分类
     * @param CategoryName 敏感数据分类
     */
    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    /**
     * Get 敏感等级 
     * @return LevelRiskName 敏感等级
     */
    public String getLevelRiskName() {
        return this.LevelRiskName;
    }

    /**
     * Set 敏感等级
     * @param LevelRiskName 敏感等级
     */
    public void setLevelRiskName(String LevelRiskName) {
        this.LevelRiskName = LevelRiskName;
    }

    /**
     * Get KMS加密 
     * @return KMSEncrypted KMS加密
     */
    public Boolean getKMSEncrypted() {
        return this.KMSEncrypted;
    }

    /**
     * Set KMS加密
     * @param KMSEncrypted KMS加密
     */
    public void setKMSEncrypted(Boolean KMSEncrypted) {
        this.KMSEncrypted = KMSEncrypted;
    }

    /**
     * Get 文件类型 
     * @return FileType 文件类型
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 文件类型
     * @param FileType 文件类型
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 文件大小 
     * @return FileSize 文件大小
     */
    public String getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 文件大小
     * @param FileSize 文件大小
     */
    public void setFileSize(String FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get 敏感数据分级分数 
     * @return LevelRiskScore 敏感数据分级分数
     */
    public Long getLevelRiskScore() {
        return this.LevelRiskScore;
    }

    /**
     * Set 敏感数据分级分数
     * @param LevelRiskScore 敏感数据分级分数
     */
    public void setLevelRiskScore(Long LevelRiskScore) {
        this.LevelRiskScore = LevelRiskScore;
    }

    /**
     * Get 数据源ID 
     * @return DataSourceId 数据源ID
     */
    public String getDataSourceId() {
        return this.DataSourceId;
    }

    /**
     * Set 数据源ID
     * @param DataSourceId 数据源ID
     */
    public void setDataSourceId(String DataSourceId) {
        this.DataSourceId = DataSourceId;
    }

    /**
     * Get 规则id 
     * @return RuleId 规则id
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则id
     * @param RuleId 规则id
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 资源所在地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceRegion 资源所在地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set 资源所在地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceRegion 资源所在地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get 分类ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CategoryId 分类ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set 分类ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param CategoryId 分类ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCategoryId(Long CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get 分级ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LevelId 分级ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLevelId() {
        return this.LevelId;
    }

    /**
     * Set 分级ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param LevelId 分级ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevelId(Long LevelId) {
        this.LevelId = LevelId;
    }

    /**
     * Get 文件扫描结果ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileResultId 文件扫描结果ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFileResultId() {
        return this.FileResultId;
    }

    /**
     * Set 文件扫描结果ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileResultId 文件扫描结果ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileResultId(Long FileResultId) {
        this.FileResultId = FileResultId;
    }

    /**
     * Get 数据源名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataSourceName 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataSourceName() {
        return this.DataSourceName;
    }

    /**
     * Set 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataSourceName 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataSourceName(String DataSourceName) {
        this.DataSourceName = DataSourceName;
    }

    /**
     * Get 分类路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CategoryFullPath 分类路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCategoryFullPath() {
        return this.CategoryFullPath;
    }

    /**
     * Set 分类路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param CategoryFullPath 分类路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCategoryFullPath(String CategoryFullPath) {
        this.CategoryFullPath = CategoryFullPath;
    }

    public DspaCOSDataAssetDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspaCOSDataAssetDetail(DspaCOSDataAssetDetail source) {
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.SensitiveDataCount != null) {
            this.SensitiveDataCount = new Long(source.SensitiveDataCount);
        }
        if (source.CategoryName != null) {
            this.CategoryName = new String(source.CategoryName);
        }
        if (source.LevelRiskName != null) {
            this.LevelRiskName = new String(source.LevelRiskName);
        }
        if (source.KMSEncrypted != null) {
            this.KMSEncrypted = new Boolean(source.KMSEncrypted);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.FileSize != null) {
            this.FileSize = new String(source.FileSize);
        }
        if (source.LevelRiskScore != null) {
            this.LevelRiskScore = new Long(source.LevelRiskScore);
        }
        if (source.DataSourceId != null) {
            this.DataSourceId = new String(source.DataSourceId);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
        if (source.CategoryId != null) {
            this.CategoryId = new Long(source.CategoryId);
        }
        if (source.LevelId != null) {
            this.LevelId = new Long(source.LevelId);
        }
        if (source.FileResultId != null) {
            this.FileResultId = new Long(source.FileResultId);
        }
        if (source.DataSourceName != null) {
            this.DataSourceName = new String(source.DataSourceName);
        }
        if (source.CategoryFullPath != null) {
            this.CategoryFullPath = new String(source.CategoryFullPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "SensitiveDataCount", this.SensitiveDataCount);
        this.setParamSimple(map, prefix + "CategoryName", this.CategoryName);
        this.setParamSimple(map, prefix + "LevelRiskName", this.LevelRiskName);
        this.setParamSimple(map, prefix + "KMSEncrypted", this.KMSEncrypted);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "LevelRiskScore", this.LevelRiskScore);
        this.setParamSimple(map, prefix + "DataSourceId", this.DataSourceId);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "LevelId", this.LevelId);
        this.setParamSimple(map, prefix + "FileResultId", this.FileResultId);
        this.setParamSimple(map, prefix + "DataSourceName", this.DataSourceName);
        this.setParamSimple(map, prefix + "CategoryFullPath", this.CategoryFullPath);

    }
}

