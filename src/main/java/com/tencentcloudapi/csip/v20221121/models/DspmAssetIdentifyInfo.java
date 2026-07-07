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

public class DspmAssetIdentifyInfo extends AbstractModel {

    /**
    * <p>资产实例id</p>
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * <p>资产名称</p>
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * <p>资产类型</p><p>枚举值：</p><ul><li>cdb： MySQL</li><li>mariadb： MariaDB</li><li>mongodb： MongoDB</li></ul>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * <p>已检出数据库数量</p>
    */
    @SerializedName("DetectedDbCount")
    @Expose
    private Long DetectedDbCount;

    /**
    * <p>已检出表数量</p>
    */
    @SerializedName("DetectedTableCount")
    @Expose
    private Long DetectedTableCount;

    /**
    * <p>数据项id集合</p>
    */
    @SerializedName("RuleIds")
    @Expose
    private Long [] RuleIds;

    /**
    * <p>数据项名称集合</p>
    */
    @SerializedName("RuleNames")
    @Expose
    private String [] RuleNames;

    /**
    * <p>分类id集合</p>
    */
    @SerializedName("CategoryIds")
    @Expose
    private Long [] CategoryIds;

    /**
    * <p>分类名称集合</p>
    */
    @SerializedName("CategoryNames")
    @Expose
    private String [] CategoryNames;

    /**
    * <p>最高级别ID</p>
    */
    @SerializedName("LevelId")
    @Expose
    private Long LevelId;

    /**
    * <p>最高级别名称</p>
    */
    @SerializedName("LevelName")
    @Expose
    private String LevelName;

    /**
    * <p>级别敏感程度</p>
    */
    @SerializedName("LevelScore")
    @Expose
    private Long LevelScore;

    /**
    * <p>检出时间</p>
    */
    @SerializedName("DetectedTime")
    @Expose
    private String DetectedTime;

    /**
    * <p>分类详情</p>
    */
    @SerializedName("CategoryDetails")
    @Expose
    private DspmIdentifyCategoryDetail [] CategoryDetails;

    /**
    * <p>APPID</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>账号名称</p>
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * <p>账号ID</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
     * Get <p>资产实例id</p> 
     * @return AssetId <p>资产实例id</p>
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set <p>资产实例id</p>
     * @param AssetId <p>资产实例id</p>
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get <p>资产名称</p> 
     * @return AssetName <p>资产名称</p>
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set <p>资产名称</p>
     * @param AssetName <p>资产名称</p>
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get <p>资产类型</p><p>枚举值：</p><ul><li>cdb： MySQL</li><li>mariadb： MariaDB</li><li>mongodb： MongoDB</li></ul> 
     * @return AssetType <p>资产类型</p><p>枚举值：</p><ul><li>cdb： MySQL</li><li>mariadb： MariaDB</li><li>mongodb： MongoDB</li></ul>
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set <p>资产类型</p><p>枚举值：</p><ul><li>cdb： MySQL</li><li>mariadb： MariaDB</li><li>mongodb： MongoDB</li></ul>
     * @param AssetType <p>资产类型</p><p>枚举值：</p><ul><li>cdb： MySQL</li><li>mariadb： MariaDB</li><li>mongodb： MongoDB</li></ul>
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get <p>已检出数据库数量</p> 
     * @return DetectedDbCount <p>已检出数据库数量</p>
     */
    public Long getDetectedDbCount() {
        return this.DetectedDbCount;
    }

    /**
     * Set <p>已检出数据库数量</p>
     * @param DetectedDbCount <p>已检出数据库数量</p>
     */
    public void setDetectedDbCount(Long DetectedDbCount) {
        this.DetectedDbCount = DetectedDbCount;
    }

    /**
     * Get <p>已检出表数量</p> 
     * @return DetectedTableCount <p>已检出表数量</p>
     */
    public Long getDetectedTableCount() {
        return this.DetectedTableCount;
    }

    /**
     * Set <p>已检出表数量</p>
     * @param DetectedTableCount <p>已检出表数量</p>
     */
    public void setDetectedTableCount(Long DetectedTableCount) {
        this.DetectedTableCount = DetectedTableCount;
    }

    /**
     * Get <p>数据项id集合</p> 
     * @return RuleIds <p>数据项id集合</p>
     */
    public Long [] getRuleIds() {
        return this.RuleIds;
    }

    /**
     * Set <p>数据项id集合</p>
     * @param RuleIds <p>数据项id集合</p>
     */
    public void setRuleIds(Long [] RuleIds) {
        this.RuleIds = RuleIds;
    }

    /**
     * Get <p>数据项名称集合</p> 
     * @return RuleNames <p>数据项名称集合</p>
     */
    public String [] getRuleNames() {
        return this.RuleNames;
    }

    /**
     * Set <p>数据项名称集合</p>
     * @param RuleNames <p>数据项名称集合</p>
     */
    public void setRuleNames(String [] RuleNames) {
        this.RuleNames = RuleNames;
    }

    /**
     * Get <p>分类id集合</p> 
     * @return CategoryIds <p>分类id集合</p>
     */
    public Long [] getCategoryIds() {
        return this.CategoryIds;
    }

    /**
     * Set <p>分类id集合</p>
     * @param CategoryIds <p>分类id集合</p>
     */
    public void setCategoryIds(Long [] CategoryIds) {
        this.CategoryIds = CategoryIds;
    }

    /**
     * Get <p>分类名称集合</p> 
     * @return CategoryNames <p>分类名称集合</p>
     */
    public String [] getCategoryNames() {
        return this.CategoryNames;
    }

    /**
     * Set <p>分类名称集合</p>
     * @param CategoryNames <p>分类名称集合</p>
     */
    public void setCategoryNames(String [] CategoryNames) {
        this.CategoryNames = CategoryNames;
    }

    /**
     * Get <p>最高级别ID</p> 
     * @return LevelId <p>最高级别ID</p>
     */
    public Long getLevelId() {
        return this.LevelId;
    }

    /**
     * Set <p>最高级别ID</p>
     * @param LevelId <p>最高级别ID</p>
     */
    public void setLevelId(Long LevelId) {
        this.LevelId = LevelId;
    }

    /**
     * Get <p>最高级别名称</p> 
     * @return LevelName <p>最高级别名称</p>
     */
    public String getLevelName() {
        return this.LevelName;
    }

    /**
     * Set <p>最高级别名称</p>
     * @param LevelName <p>最高级别名称</p>
     */
    public void setLevelName(String LevelName) {
        this.LevelName = LevelName;
    }

    /**
     * Get <p>级别敏感程度</p> 
     * @return LevelScore <p>级别敏感程度</p>
     */
    public Long getLevelScore() {
        return this.LevelScore;
    }

    /**
     * Set <p>级别敏感程度</p>
     * @param LevelScore <p>级别敏感程度</p>
     */
    public void setLevelScore(Long LevelScore) {
        this.LevelScore = LevelScore;
    }

    /**
     * Get <p>检出时间</p> 
     * @return DetectedTime <p>检出时间</p>
     */
    public String getDetectedTime() {
        return this.DetectedTime;
    }

    /**
     * Set <p>检出时间</p>
     * @param DetectedTime <p>检出时间</p>
     */
    public void setDetectedTime(String DetectedTime) {
        this.DetectedTime = DetectedTime;
    }

    /**
     * Get <p>分类详情</p> 
     * @return CategoryDetails <p>分类详情</p>
     */
    public DspmIdentifyCategoryDetail [] getCategoryDetails() {
        return this.CategoryDetails;
    }

    /**
     * Set <p>分类详情</p>
     * @param CategoryDetails <p>分类详情</p>
     */
    public void setCategoryDetails(DspmIdentifyCategoryDetail [] CategoryDetails) {
        this.CategoryDetails = CategoryDetails;
    }

    /**
     * Get <p>APPID</p> 
     * @return AppId <p>APPID</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>APPID</p>
     * @param AppId <p>APPID</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>账号名称</p> 
     * @return NickName <p>账号名称</p>
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set <p>账号名称</p>
     * @param NickName <p>账号名称</p>
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get <p>账号ID</p> 
     * @return Uin <p>账号ID</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>账号ID</p>
     * @param Uin <p>账号ID</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    public DspmAssetIdentifyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmAssetIdentifyInfo(DspmAssetIdentifyInfo source) {
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.DetectedDbCount != null) {
            this.DetectedDbCount = new Long(source.DetectedDbCount);
        }
        if (source.DetectedTableCount != null) {
            this.DetectedTableCount = new Long(source.DetectedTableCount);
        }
        if (source.RuleIds != null) {
            this.RuleIds = new Long[source.RuleIds.length];
            for (int i = 0; i < source.RuleIds.length; i++) {
                this.RuleIds[i] = new Long(source.RuleIds[i]);
            }
        }
        if (source.RuleNames != null) {
            this.RuleNames = new String[source.RuleNames.length];
            for (int i = 0; i < source.RuleNames.length; i++) {
                this.RuleNames[i] = new String(source.RuleNames[i]);
            }
        }
        if (source.CategoryIds != null) {
            this.CategoryIds = new Long[source.CategoryIds.length];
            for (int i = 0; i < source.CategoryIds.length; i++) {
                this.CategoryIds[i] = new Long(source.CategoryIds[i]);
            }
        }
        if (source.CategoryNames != null) {
            this.CategoryNames = new String[source.CategoryNames.length];
            for (int i = 0; i < source.CategoryNames.length; i++) {
                this.CategoryNames[i] = new String(source.CategoryNames[i]);
            }
        }
        if (source.LevelId != null) {
            this.LevelId = new Long(source.LevelId);
        }
        if (source.LevelName != null) {
            this.LevelName = new String(source.LevelName);
        }
        if (source.LevelScore != null) {
            this.LevelScore = new Long(source.LevelScore);
        }
        if (source.DetectedTime != null) {
            this.DetectedTime = new String(source.DetectedTime);
        }
        if (source.CategoryDetails != null) {
            this.CategoryDetails = new DspmIdentifyCategoryDetail[source.CategoryDetails.length];
            for (int i = 0; i < source.CategoryDetails.length; i++) {
                this.CategoryDetails[i] = new DspmIdentifyCategoryDetail(source.CategoryDetails[i]);
            }
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "DetectedDbCount", this.DetectedDbCount);
        this.setParamSimple(map, prefix + "DetectedTableCount", this.DetectedTableCount);
        this.setParamArraySimple(map, prefix + "RuleIds.", this.RuleIds);
        this.setParamArraySimple(map, prefix + "RuleNames.", this.RuleNames);
        this.setParamArraySimple(map, prefix + "CategoryIds.", this.CategoryIds);
        this.setParamArraySimple(map, prefix + "CategoryNames.", this.CategoryNames);
        this.setParamSimple(map, prefix + "LevelId", this.LevelId);
        this.setParamSimple(map, prefix + "LevelName", this.LevelName);
        this.setParamSimple(map, prefix + "LevelScore", this.LevelScore);
        this.setParamSimple(map, prefix + "DetectedTime", this.DetectedTime);
        this.setParamArrayObj(map, prefix + "CategoryDetails.", this.CategoryDetails);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "Uin", this.Uin);

    }
}

