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

public class DspaDiscoveryCOSTaskResultDetail extends AbstractModel{

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 扫描File结果详情ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileResultId")
    @Expose
    private Long FileResultId;

    /**
    * 所属桶名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * 所属文件名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 敏感数据分类ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CategoryId")
    @Expose
    private Long CategoryId;

    /**
    * 敏感数据分类名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CategoryName")
    @Expose
    private String CategoryName;

    /**
    * 敏感数据分级ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LevelId")
    @Expose
    private Long LevelId;

    /**
    * 敏感数据分级名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LevelName")
    @Expose
    private String LevelName;

    /**
    * KMS加密，true or false
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KMSEncrypted")
    @Expose
    private Boolean KMSEncrypted;

    /**
    * 规则名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 规则ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 敏感数据分级分数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LevelRiskScore")
    @Expose
    private Long LevelRiskScore;

    /**
    * 文件大小，单位为KB
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * 文件类型，如csv，txt
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 敏感数据出现次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SensitiveDataCount")
    @Expose
    private Long SensitiveDataCount;

    /**
    * 分类树路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CategoryFullPath")
    @Expose
    private String [] CategoryFullPath;

    /**
    * 合规组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComplianceId")
    @Expose
    private Long ComplianceId;

    /**
    * 结果id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultId")
    @Expose
    private Long ResultId;

    /**
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 扫描File结果详情ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileResultId 扫描File结果详情ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFileResultId() {
        return this.FileResultId;
    }

    /**
     * Set 扫描File结果详情ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileResultId 扫描File结果详情ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileResultId(Long FileResultId) {
        this.FileResultId = FileResultId;
    }

    /**
     * Get 所属桶名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BucketName 所属桶名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set 所属桶名
注意：此字段可能返回 null，表示取不到有效值。
     * @param BucketName 所属桶名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get 所属文件名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileName 所属文件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 所属文件名
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileName 所属文件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 敏感数据分类ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CategoryId 敏感数据分类ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set 敏感数据分类ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param CategoryId 敏感数据分类ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCategoryId(Long CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get 敏感数据分类名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CategoryName 敏感数据分类名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCategoryName() {
        return this.CategoryName;
    }

    /**
     * Set 敏感数据分类名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param CategoryName 敏感数据分类名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    /**
     * Get 敏感数据分级ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LevelId 敏感数据分级ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLevelId() {
        return this.LevelId;
    }

    /**
     * Set 敏感数据分级ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param LevelId 敏感数据分级ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevelId(Long LevelId) {
        this.LevelId = LevelId;
    }

    /**
     * Get 敏感数据分级名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LevelName 敏感数据分级名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLevelName() {
        return this.LevelName;
    }

    /**
     * Set 敏感数据分级名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param LevelName 敏感数据分级名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevelName(String LevelName) {
        this.LevelName = LevelName;
    }

    /**
     * Get KMS加密，true or false
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KMSEncrypted KMS加密，true or false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getKMSEncrypted() {
        return this.KMSEncrypted;
    }

    /**
     * Set KMS加密，true or false
注意：此字段可能返回 null，表示取不到有效值。
     * @param KMSEncrypted KMS加密，true or false
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKMSEncrypted(Boolean KMSEncrypted) {
        this.KMSEncrypted = KMSEncrypted;
    }

    /**
     * Get 规则名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleName 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleName 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 规则ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleId 规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleId 规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 敏感数据分级分数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LevelRiskScore 敏感数据分级分数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLevelRiskScore() {
        return this.LevelRiskScore;
    }

    /**
     * Set 敏感数据分级分数
注意：此字段可能返回 null，表示取不到有效值。
     * @param LevelRiskScore 敏感数据分级分数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevelRiskScore(Long LevelRiskScore) {
        this.LevelRiskScore = LevelRiskScore;
    }

    /**
     * Get 文件大小，单位为KB
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileSize 文件大小，单位为KB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 文件大小，单位为KB
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileSize 文件大小，单位为KB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get 文件类型，如csv，txt
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileType 文件类型，如csv，txt
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 文件类型，如csv，txt
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileType 文件类型，如csv，txt
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 敏感数据出现次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SensitiveDataCount 敏感数据出现次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSensitiveDataCount() {
        return this.SensitiveDataCount;
    }

    /**
     * Set 敏感数据出现次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param SensitiveDataCount 敏感数据出现次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSensitiveDataCount(Long SensitiveDataCount) {
        this.SensitiveDataCount = SensitiveDataCount;
    }

    /**
     * Get 分类树路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CategoryFullPath 分类树路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCategoryFullPath() {
        return this.CategoryFullPath;
    }

    /**
     * Set 分类树路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param CategoryFullPath 分类树路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCategoryFullPath(String [] CategoryFullPath) {
        this.CategoryFullPath = CategoryFullPath;
    }

    /**
     * Get 合规组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComplianceId 合规组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getComplianceId() {
        return this.ComplianceId;
    }

    /**
     * Set 合规组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComplianceId 合规组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComplianceId(Long ComplianceId) {
        this.ComplianceId = ComplianceId;
    }

    /**
     * Get 结果id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultId 结果id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResultId() {
        return this.ResultId;
    }

    /**
     * Set 结果id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultId 结果id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultId(Long ResultId) {
        this.ResultId = ResultId;
    }

    public DspaDiscoveryCOSTaskResultDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspaDiscoveryCOSTaskResultDetail(DspaDiscoveryCOSTaskResultDetail source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.FileResultId != null) {
            this.FileResultId = new Long(source.FileResultId);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.CategoryId != null) {
            this.CategoryId = new Long(source.CategoryId);
        }
        if (source.CategoryName != null) {
            this.CategoryName = new String(source.CategoryName);
        }
        if (source.LevelId != null) {
            this.LevelId = new Long(source.LevelId);
        }
        if (source.LevelName != null) {
            this.LevelName = new String(source.LevelName);
        }
        if (source.KMSEncrypted != null) {
            this.KMSEncrypted = new Boolean(source.KMSEncrypted);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.LevelRiskScore != null) {
            this.LevelRiskScore = new Long(source.LevelRiskScore);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.SensitiveDataCount != null) {
            this.SensitiveDataCount = new Long(source.SensitiveDataCount);
        }
        if (source.CategoryFullPath != null) {
            this.CategoryFullPath = new String[source.CategoryFullPath.length];
            for (int i = 0; i < source.CategoryFullPath.length; i++) {
                this.CategoryFullPath[i] = new String(source.CategoryFullPath[i]);
            }
        }
        if (source.ComplianceId != null) {
            this.ComplianceId = new Long(source.ComplianceId);
        }
        if (source.ResultId != null) {
            this.ResultId = new Long(source.ResultId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "FileResultId", this.FileResultId);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "CategoryName", this.CategoryName);
        this.setParamSimple(map, prefix + "LevelId", this.LevelId);
        this.setParamSimple(map, prefix + "LevelName", this.LevelName);
        this.setParamSimple(map, prefix + "KMSEncrypted", this.KMSEncrypted);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "LevelRiskScore", this.LevelRiskScore);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "SensitiveDataCount", this.SensitiveDataCount);
        this.setParamArraySimple(map, prefix + "CategoryFullPath.", this.CategoryFullPath);
        this.setParamSimple(map, prefix + "ComplianceId", this.ComplianceId);
        this.setParamSimple(map, prefix + "ResultId", this.ResultId);

    }
}

