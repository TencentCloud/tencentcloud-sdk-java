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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ESDataAssetDetail extends AbstractModel {

    /**
    * id
    */
    @SerializedName("FieldResultId")
    @Expose
    private Long FieldResultId;

    /**
    * 数据源id
    */
    @SerializedName("DataSourceId")
    @Expose
    private String DataSourceId;

    /**
    * 数据源名称
    */
    @SerializedName("DataSourceName")
    @Expose
    private String DataSourceName;

    /**
    * 类型
    */
    @SerializedName("DataSourceType")
    @Expose
    private String DataSourceType;

    /**
    * 地域信息
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * 索引名称
    */
    @SerializedName("IndexName")
    @Expose
    private String IndexName;

    /**
    * 字段名称
    */
    @SerializedName("FieldName")
    @Expose
    private String FieldName;

    /**
    * 分类id
    */
    @SerializedName("CategoryId")
    @Expose
    private Long CategoryId;

    /**
    * 分类名称
    */
    @SerializedName("CategoryName")
    @Expose
    private String CategoryName;

    /**
    * 分类路径数组
    */
    @SerializedName("CategoryArr")
    @Expose
    private String [] CategoryArr;

    /**
    * 等级id
    */
    @SerializedName("LevelId")
    @Expose
    private Long LevelId;

    /**
    * 分级名称
    */
    @SerializedName("LevelRiskName")
    @Expose
    private String LevelRiskName;

    /**
    * 分级分数
    */
    @SerializedName("LevelRiskScore")
    @Expose
    private Long LevelRiskScore;

    /**
    * 可信分
    */
    @SerializedName("TrustedScore")
    @Expose
    private Float TrustedScore;

    /**
    * 规则id
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 0系统识别，1人工打标
    */
    @SerializedName("IdentifyType")
    @Expose
    private Long IdentifyType;

    /**
    * 0未核查，1已核查
    */
    @SerializedName("CheckStatus")
    @Expose
    private Long CheckStatus;

    /**
     * Get id 
     * @return FieldResultId id
     */
    public Long getFieldResultId() {
        return this.FieldResultId;
    }

    /**
     * Set id
     * @param FieldResultId id
     */
    public void setFieldResultId(Long FieldResultId) {
        this.FieldResultId = FieldResultId;
    }

    /**
     * Get 数据源id 
     * @return DataSourceId 数据源id
     */
    public String getDataSourceId() {
        return this.DataSourceId;
    }

    /**
     * Set 数据源id
     * @param DataSourceId 数据源id
     */
    public void setDataSourceId(String DataSourceId) {
        this.DataSourceId = DataSourceId;
    }

    /**
     * Get 数据源名称 
     * @return DataSourceName 数据源名称
     */
    public String getDataSourceName() {
        return this.DataSourceName;
    }

    /**
     * Set 数据源名称
     * @param DataSourceName 数据源名称
     */
    public void setDataSourceName(String DataSourceName) {
        this.DataSourceName = DataSourceName;
    }

    /**
     * Get 类型 
     * @return DataSourceType 类型
     */
    public String getDataSourceType() {
        return this.DataSourceType;
    }

    /**
     * Set 类型
     * @param DataSourceType 类型
     */
    public void setDataSourceType(String DataSourceType) {
        this.DataSourceType = DataSourceType;
    }

    /**
     * Get 地域信息 
     * @return ResourceRegion 地域信息
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set 地域信息
     * @param ResourceRegion 地域信息
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get 索引名称 
     * @return IndexName 索引名称
     */
    public String getIndexName() {
        return this.IndexName;
    }

    /**
     * Set 索引名称
     * @param IndexName 索引名称
     */
    public void setIndexName(String IndexName) {
        this.IndexName = IndexName;
    }

    /**
     * Get 字段名称 
     * @return FieldName 字段名称
     */
    public String getFieldName() {
        return this.FieldName;
    }

    /**
     * Set 字段名称
     * @param FieldName 字段名称
     */
    public void setFieldName(String FieldName) {
        this.FieldName = FieldName;
    }

    /**
     * Get 分类id 
     * @return CategoryId 分类id
     */
    public Long getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set 分类id
     * @param CategoryId 分类id
     */
    public void setCategoryId(Long CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get 分类名称 
     * @return CategoryName 分类名称
     */
    public String getCategoryName() {
        return this.CategoryName;
    }

    /**
     * Set 分类名称
     * @param CategoryName 分类名称
     */
    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    /**
     * Get 分类路径数组 
     * @return CategoryArr 分类路径数组
     */
    public String [] getCategoryArr() {
        return this.CategoryArr;
    }

    /**
     * Set 分类路径数组
     * @param CategoryArr 分类路径数组
     */
    public void setCategoryArr(String [] CategoryArr) {
        this.CategoryArr = CategoryArr;
    }

    /**
     * Get 等级id 
     * @return LevelId 等级id
     */
    public Long getLevelId() {
        return this.LevelId;
    }

    /**
     * Set 等级id
     * @param LevelId 等级id
     */
    public void setLevelId(Long LevelId) {
        this.LevelId = LevelId;
    }

    /**
     * Get 分级名称 
     * @return LevelRiskName 分级名称
     */
    public String getLevelRiskName() {
        return this.LevelRiskName;
    }

    /**
     * Set 分级名称
     * @param LevelRiskName 分级名称
     */
    public void setLevelRiskName(String LevelRiskName) {
        this.LevelRiskName = LevelRiskName;
    }

    /**
     * Get 分级分数 
     * @return LevelRiskScore 分级分数
     */
    public Long getLevelRiskScore() {
        return this.LevelRiskScore;
    }

    /**
     * Set 分级分数
     * @param LevelRiskScore 分级分数
     */
    public void setLevelRiskScore(Long LevelRiskScore) {
        this.LevelRiskScore = LevelRiskScore;
    }

    /**
     * Get 可信分 
     * @return TrustedScore 可信分
     */
    public Float getTrustedScore() {
        return this.TrustedScore;
    }

    /**
     * Set 可信分
     * @param TrustedScore 可信分
     */
    public void setTrustedScore(Float TrustedScore) {
        this.TrustedScore = TrustedScore;
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
     * Get 0系统识别，1人工打标 
     * @return IdentifyType 0系统识别，1人工打标
     */
    public Long getIdentifyType() {
        return this.IdentifyType;
    }

    /**
     * Set 0系统识别，1人工打标
     * @param IdentifyType 0系统识别，1人工打标
     */
    public void setIdentifyType(Long IdentifyType) {
        this.IdentifyType = IdentifyType;
    }

    /**
     * Get 0未核查，1已核查 
     * @return CheckStatus 0未核查，1已核查
     */
    public Long getCheckStatus() {
        return this.CheckStatus;
    }

    /**
     * Set 0未核查，1已核查
     * @param CheckStatus 0未核查，1已核查
     */
    public void setCheckStatus(Long CheckStatus) {
        this.CheckStatus = CheckStatus;
    }

    public ESDataAssetDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ESDataAssetDetail(ESDataAssetDetail source) {
        if (source.FieldResultId != null) {
            this.FieldResultId = new Long(source.FieldResultId);
        }
        if (source.DataSourceId != null) {
            this.DataSourceId = new String(source.DataSourceId);
        }
        if (source.DataSourceName != null) {
            this.DataSourceName = new String(source.DataSourceName);
        }
        if (source.DataSourceType != null) {
            this.DataSourceType = new String(source.DataSourceType);
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
        if (source.IndexName != null) {
            this.IndexName = new String(source.IndexName);
        }
        if (source.FieldName != null) {
            this.FieldName = new String(source.FieldName);
        }
        if (source.CategoryId != null) {
            this.CategoryId = new Long(source.CategoryId);
        }
        if (source.CategoryName != null) {
            this.CategoryName = new String(source.CategoryName);
        }
        if (source.CategoryArr != null) {
            this.CategoryArr = new String[source.CategoryArr.length];
            for (int i = 0; i < source.CategoryArr.length; i++) {
                this.CategoryArr[i] = new String(source.CategoryArr[i]);
            }
        }
        if (source.LevelId != null) {
            this.LevelId = new Long(source.LevelId);
        }
        if (source.LevelRiskName != null) {
            this.LevelRiskName = new String(source.LevelRiskName);
        }
        if (source.LevelRiskScore != null) {
            this.LevelRiskScore = new Long(source.LevelRiskScore);
        }
        if (source.TrustedScore != null) {
            this.TrustedScore = new Float(source.TrustedScore);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.IdentifyType != null) {
            this.IdentifyType = new Long(source.IdentifyType);
        }
        if (source.CheckStatus != null) {
            this.CheckStatus = new Long(source.CheckStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FieldResultId", this.FieldResultId);
        this.setParamSimple(map, prefix + "DataSourceId", this.DataSourceId);
        this.setParamSimple(map, prefix + "DataSourceName", this.DataSourceName);
        this.setParamSimple(map, prefix + "DataSourceType", this.DataSourceType);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "IndexName", this.IndexName);
        this.setParamSimple(map, prefix + "FieldName", this.FieldName);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "CategoryName", this.CategoryName);
        this.setParamArraySimple(map, prefix + "CategoryArr.", this.CategoryArr);
        this.setParamSimple(map, prefix + "LevelId", this.LevelId);
        this.setParamSimple(map, prefix + "LevelRiskName", this.LevelRiskName);
        this.setParamSimple(map, prefix + "LevelRiskScore", this.LevelRiskScore);
        this.setParamSimple(map, prefix + "TrustedScore", this.TrustedScore);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "IdentifyType", this.IdentifyType);
        this.setParamSimple(map, prefix + "CheckStatus", this.CheckStatus);

    }
}

