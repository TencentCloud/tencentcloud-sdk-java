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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspaDiscoveryCOSTaskResultDetail extends AbstractModel {

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 扫描File结果详情ID
    */
    @SerializedName("FileResultId")
    @Expose
    private Long FileResultId;

    /**
    * 所属桶名
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * 所属文件名
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 敏感数据分类ID
    */
    @SerializedName("CategoryId")
    @Expose
    private Long CategoryId;

    /**
    * 敏感数据分类名称
    */
    @SerializedName("CategoryName")
    @Expose
    private String CategoryName;

    /**
    * 敏感数据分级ID
    */
    @SerializedName("LevelId")
    @Expose
    private Long LevelId;

    /**
    * 敏感数据分级名称
    */
    @SerializedName("LevelName")
    @Expose
    private String LevelName;

    /**
    * KMS加密，true or false
    */
    @SerializedName("KMSEncrypted")
    @Expose
    private Boolean KMSEncrypted;

    /**
    * 规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 敏感数据分级分数
    */
    @SerializedName("LevelRiskScore")
    @Expose
    private Long LevelRiskScore;

    /**
    * 文件大小，单位为KB
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * 文件类型，如csv，txt
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 敏感数据出现次数
    */
    @SerializedName("SensitiveDataCount")
    @Expose
    private Long SensitiveDataCount;

    /**
    * 分类树路径
    */
    @SerializedName("CategoryFullPath")
    @Expose
    private String [] CategoryFullPath;

    /**
    * 分类树路径
    */
    @SerializedName("CategoryArr")
    @Expose
    private String [] CategoryArr;

    /**
    * 合规组ID
    */
    @SerializedName("ComplianceId")
    @Expose
    private Long ComplianceId;

    /**
    * 结果id
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
     * @return FileResultId 扫描File结果详情ID
     */
    public Long getFileResultId() {
        return this.FileResultId;
    }

    /**
     * Set 扫描File结果详情ID
     * @param FileResultId 扫描File结果详情ID
     */
    public void setFileResultId(Long FileResultId) {
        this.FileResultId = FileResultId;
    }

    /**
     * Get 所属桶名 
     * @return BucketName 所属桶名
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set 所属桶名
     * @param BucketName 所属桶名
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get 所属文件名 
     * @return FileName 所属文件名
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 所属文件名
     * @param FileName 所属文件名
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 敏感数据分类ID 
     * @return CategoryId 敏感数据分类ID
     */
    public Long getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set 敏感数据分类ID
     * @param CategoryId 敏感数据分类ID
     */
    public void setCategoryId(Long CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get 敏感数据分类名称 
     * @return CategoryName 敏感数据分类名称
     */
    public String getCategoryName() {
        return this.CategoryName;
    }

    /**
     * Set 敏感数据分类名称
     * @param CategoryName 敏感数据分类名称
     */
    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    /**
     * Get 敏感数据分级ID 
     * @return LevelId 敏感数据分级ID
     */
    public Long getLevelId() {
        return this.LevelId;
    }

    /**
     * Set 敏感数据分级ID
     * @param LevelId 敏感数据分级ID
     */
    public void setLevelId(Long LevelId) {
        this.LevelId = LevelId;
    }

    /**
     * Get 敏感数据分级名称 
     * @return LevelName 敏感数据分级名称
     */
    public String getLevelName() {
        return this.LevelName;
    }

    /**
     * Set 敏感数据分级名称
     * @param LevelName 敏感数据分级名称
     */
    public void setLevelName(String LevelName) {
        this.LevelName = LevelName;
    }

    /**
     * Get KMS加密，true or false 
     * @return KMSEncrypted KMS加密，true or false
     */
    public Boolean getKMSEncrypted() {
        return this.KMSEncrypted;
    }

    /**
     * Set KMS加密，true or false
     * @param KMSEncrypted KMS加密，true or false
     */
    public void setKMSEncrypted(Boolean KMSEncrypted) {
        this.KMSEncrypted = KMSEncrypted;
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
     * Get 规则ID 
     * @return RuleId 规则ID
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID
     * @param RuleId 规则ID
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
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
     * Get 文件大小，单位为KB 
     * @return FileSize 文件大小，单位为KB
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 文件大小，单位为KB
     * @param FileSize 文件大小，单位为KB
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get 文件类型，如csv，txt 
     * @return FileType 文件类型，如csv，txt
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 文件类型，如csv，txt
     * @param FileType 文件类型，如csv，txt
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 敏感数据出现次数 
     * @return SensitiveDataCount 敏感数据出现次数
     */
    public Long getSensitiveDataCount() {
        return this.SensitiveDataCount;
    }

    /**
     * Set 敏感数据出现次数
     * @param SensitiveDataCount 敏感数据出现次数
     */
    public void setSensitiveDataCount(Long SensitiveDataCount) {
        this.SensitiveDataCount = SensitiveDataCount;
    }

    /**
     * Get 分类树路径 
     * @return CategoryFullPath 分类树路径
     */
    public String [] getCategoryFullPath() {
        return this.CategoryFullPath;
    }

    /**
     * Set 分类树路径
     * @param CategoryFullPath 分类树路径
     */
    public void setCategoryFullPath(String [] CategoryFullPath) {
        this.CategoryFullPath = CategoryFullPath;
    }

    /**
     * Get 分类树路径 
     * @return CategoryArr 分类树路径
     */
    public String [] getCategoryArr() {
        return this.CategoryArr;
    }

    /**
     * Set 分类树路径
     * @param CategoryArr 分类树路径
     */
    public void setCategoryArr(String [] CategoryArr) {
        this.CategoryArr = CategoryArr;
    }

    /**
     * Get 合规组ID 
     * @return ComplianceId 合规组ID
     */
    public Long getComplianceId() {
        return this.ComplianceId;
    }

    /**
     * Set 合规组ID
     * @param ComplianceId 合规组ID
     */
    public void setComplianceId(Long ComplianceId) {
        this.ComplianceId = ComplianceId;
    }

    /**
     * Get 结果id 
     * @return ResultId 结果id
     */
    public Long getResultId() {
        return this.ResultId;
    }

    /**
     * Set 结果id
     * @param ResultId 结果id
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
        if (source.CategoryArr != null) {
            this.CategoryArr = new String[source.CategoryArr.length];
            for (int i = 0; i < source.CategoryArr.length; i++) {
                this.CategoryArr[i] = new String(source.CategoryArr[i]);
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
        this.setParamArraySimple(map, prefix + "CategoryArr.", this.CategoryArr);
        this.setParamSimple(map, prefix + "ComplianceId", this.ComplianceId);
        this.setParamSimple(map, prefix + "ResultId", this.ResultId);

    }
}

