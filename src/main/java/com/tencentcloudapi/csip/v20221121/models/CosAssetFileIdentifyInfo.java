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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosAssetFileIdentifyInfo extends AbstractModel {

    /**
    * <p>文件名称</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>文件路径</p>
    */
    @SerializedName("DirName")
    @Expose
    private String DirName;

    /**
    * <p>分类数据项详情</p>
    */
    @SerializedName("CategoryDetails")
    @Expose
    private CosIdentifyCategoryDetail [] CategoryDetails;

    /**
    * <p>存储桶信息</p>
    */
    @SerializedName("BucketInfo")
    @Expose
    private CosBucketInfo BucketInfo;

    /**
    * <p>最后一次扫描时间</p>
    */
    @SerializedName("LastScanTime")
    @Expose
    private Long LastScanTime;

    /**
    * <p>处置状态</p>
    */
    @SerializedName("HandleStatus")
    @Expose
    private Long HandleStatus;

    /**
    * <p>结果唯一标识</p>
    */
    @SerializedName("ResultId")
    @Expose
    private String ResultId;

    /**
    * <p>规则详情</p>
    */
    @SerializedName("RuleDetails")
    @Expose
    private CosIdentifyRuleDetail [] RuleDetails;

    /**
    * <p>级别详情</p>
    */
    @SerializedName("LevelDetails")
    @Expose
    private CosIdentifyLevelDetail [] LevelDetails;

    /**
    * <p>模板ID</p>
    */
    @SerializedName("ComplianceId")
    @Expose
    private Long ComplianceId;

    /**
     * Get <p>文件名称</p> 
     * @return FileName <p>文件名称</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>文件名称</p>
     * @param FileName <p>文件名称</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>文件路径</p> 
     * @return DirName <p>文件路径</p>
     */
    public String getDirName() {
        return this.DirName;
    }

    /**
     * Set <p>文件路径</p>
     * @param DirName <p>文件路径</p>
     */
    public void setDirName(String DirName) {
        this.DirName = DirName;
    }

    /**
     * Get <p>分类数据项详情</p> 
     * @return CategoryDetails <p>分类数据项详情</p>
     */
    public CosIdentifyCategoryDetail [] getCategoryDetails() {
        return this.CategoryDetails;
    }

    /**
     * Set <p>分类数据项详情</p>
     * @param CategoryDetails <p>分类数据项详情</p>
     */
    public void setCategoryDetails(CosIdentifyCategoryDetail [] CategoryDetails) {
        this.CategoryDetails = CategoryDetails;
    }

    /**
     * Get <p>存储桶信息</p> 
     * @return BucketInfo <p>存储桶信息</p>
     */
    public CosBucketInfo getBucketInfo() {
        return this.BucketInfo;
    }

    /**
     * Set <p>存储桶信息</p>
     * @param BucketInfo <p>存储桶信息</p>
     */
    public void setBucketInfo(CosBucketInfo BucketInfo) {
        this.BucketInfo = BucketInfo;
    }

    /**
     * Get <p>最后一次扫描时间</p> 
     * @return LastScanTime <p>最后一次扫描时间</p>
     */
    public Long getLastScanTime() {
        return this.LastScanTime;
    }

    /**
     * Set <p>最后一次扫描时间</p>
     * @param LastScanTime <p>最后一次扫描时间</p>
     */
    public void setLastScanTime(Long LastScanTime) {
        this.LastScanTime = LastScanTime;
    }

    /**
     * Get <p>处置状态</p> 
     * @return HandleStatus <p>处置状态</p>
     */
    public Long getHandleStatus() {
        return this.HandleStatus;
    }

    /**
     * Set <p>处置状态</p>
     * @param HandleStatus <p>处置状态</p>
     */
    public void setHandleStatus(Long HandleStatus) {
        this.HandleStatus = HandleStatus;
    }

    /**
     * Get <p>结果唯一标识</p> 
     * @return ResultId <p>结果唯一标识</p>
     */
    public String getResultId() {
        return this.ResultId;
    }

    /**
     * Set <p>结果唯一标识</p>
     * @param ResultId <p>结果唯一标识</p>
     */
    public void setResultId(String ResultId) {
        this.ResultId = ResultId;
    }

    /**
     * Get <p>规则详情</p> 
     * @return RuleDetails <p>规则详情</p>
     */
    public CosIdentifyRuleDetail [] getRuleDetails() {
        return this.RuleDetails;
    }

    /**
     * Set <p>规则详情</p>
     * @param RuleDetails <p>规则详情</p>
     */
    public void setRuleDetails(CosIdentifyRuleDetail [] RuleDetails) {
        this.RuleDetails = RuleDetails;
    }

    /**
     * Get <p>级别详情</p> 
     * @return LevelDetails <p>级别详情</p>
     */
    public CosIdentifyLevelDetail [] getLevelDetails() {
        return this.LevelDetails;
    }

    /**
     * Set <p>级别详情</p>
     * @param LevelDetails <p>级别详情</p>
     */
    public void setLevelDetails(CosIdentifyLevelDetail [] LevelDetails) {
        this.LevelDetails = LevelDetails;
    }

    /**
     * Get <p>模板ID</p> 
     * @return ComplianceId <p>模板ID</p>
     */
    public Long getComplianceId() {
        return this.ComplianceId;
    }

    /**
     * Set <p>模板ID</p>
     * @param ComplianceId <p>模板ID</p>
     */
    public void setComplianceId(Long ComplianceId) {
        this.ComplianceId = ComplianceId;
    }

    public CosAssetFileIdentifyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosAssetFileIdentifyInfo(CosAssetFileIdentifyInfo source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.DirName != null) {
            this.DirName = new String(source.DirName);
        }
        if (source.CategoryDetails != null) {
            this.CategoryDetails = new CosIdentifyCategoryDetail[source.CategoryDetails.length];
            for (int i = 0; i < source.CategoryDetails.length; i++) {
                this.CategoryDetails[i] = new CosIdentifyCategoryDetail(source.CategoryDetails[i]);
            }
        }
        if (source.BucketInfo != null) {
            this.BucketInfo = new CosBucketInfo(source.BucketInfo);
        }
        if (source.LastScanTime != null) {
            this.LastScanTime = new Long(source.LastScanTime);
        }
        if (source.HandleStatus != null) {
            this.HandleStatus = new Long(source.HandleStatus);
        }
        if (source.ResultId != null) {
            this.ResultId = new String(source.ResultId);
        }
        if (source.RuleDetails != null) {
            this.RuleDetails = new CosIdentifyRuleDetail[source.RuleDetails.length];
            for (int i = 0; i < source.RuleDetails.length; i++) {
                this.RuleDetails[i] = new CosIdentifyRuleDetail(source.RuleDetails[i]);
            }
        }
        if (source.LevelDetails != null) {
            this.LevelDetails = new CosIdentifyLevelDetail[source.LevelDetails.length];
            for (int i = 0; i < source.LevelDetails.length; i++) {
                this.LevelDetails[i] = new CosIdentifyLevelDetail(source.LevelDetails[i]);
            }
        }
        if (source.ComplianceId != null) {
            this.ComplianceId = new Long(source.ComplianceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "DirName", this.DirName);
        this.setParamArrayObj(map, prefix + "CategoryDetails.", this.CategoryDetails);
        this.setParamObj(map, prefix + "BucketInfo.", this.BucketInfo);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);
        this.setParamSimple(map, prefix + "HandleStatus", this.HandleStatus);
        this.setParamSimple(map, prefix + "ResultId", this.ResultId);
        this.setParamArrayObj(map, prefix + "RuleDetails.", this.RuleDetails);
        this.setParamArrayObj(map, prefix + "LevelDetails.", this.LevelDetails);
        this.setParamSimple(map, prefix + "ComplianceId", this.ComplianceId);

    }
}

