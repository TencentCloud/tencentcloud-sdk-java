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

public class DescribeDspmIdentifyDistributionStatisticsRequest extends AbstractModel {

    /**
    * <p>统计类型</p><p>枚举值：</p><ul><li>FieldTop5Asset： 识别字段Top5</li><li>FieldCategoryDistribution： 识别字段分类分布</li><li>FieldLevelDistribution： 识别字段级别分布</li><li>AssetDistribution： 识别资产分布</li></ul>
    */
    @SerializedName("StatType")
    @Expose
    private String StatType;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>资产类型</p><p>枚举值：</p><ul><li>cdb： 云数据库MySQL</li><li>mariadb： 云数据库MariaDB</li></ul>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * <p>识别模板id</p>
    */
    @SerializedName("ComplianceId")
    @Expose
    private Long ComplianceId;

    /**
     * Get <p>统计类型</p><p>枚举值：</p><ul><li>FieldTop5Asset： 识别字段Top5</li><li>FieldCategoryDistribution： 识别字段分类分布</li><li>FieldLevelDistribution： 识别字段级别分布</li><li>AssetDistribution： 识别资产分布</li></ul> 
     * @return StatType <p>统计类型</p><p>枚举值：</p><ul><li>FieldTop5Asset： 识别字段Top5</li><li>FieldCategoryDistribution： 识别字段分类分布</li><li>FieldLevelDistribution： 识别字段级别分布</li><li>AssetDistribution： 识别资产分布</li></ul>
     */
    public String getStatType() {
        return this.StatType;
    }

    /**
     * Set <p>统计类型</p><p>枚举值：</p><ul><li>FieldTop5Asset： 识别字段Top5</li><li>FieldCategoryDistribution： 识别字段分类分布</li><li>FieldLevelDistribution： 识别字段级别分布</li><li>AssetDistribution： 识别资产分布</li></ul>
     * @param StatType <p>统计类型</p><p>枚举值：</p><ul><li>FieldTop5Asset： 识别字段Top5</li><li>FieldCategoryDistribution： 识别字段分类分布</li><li>FieldLevelDistribution： 识别字段级别分布</li><li>AssetDistribution： 识别资产分布</li></ul>
     */
    public void setStatType(String StatType) {
        this.StatType = StatType;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>资产类型</p><p>枚举值：</p><ul><li>cdb： 云数据库MySQL</li><li>mariadb： 云数据库MariaDB</li></ul> 
     * @return AssetType <p>资产类型</p><p>枚举值：</p><ul><li>cdb： 云数据库MySQL</li><li>mariadb： 云数据库MariaDB</li></ul>
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set <p>资产类型</p><p>枚举值：</p><ul><li>cdb： 云数据库MySQL</li><li>mariadb： 云数据库MariaDB</li></ul>
     * @param AssetType <p>资产类型</p><p>枚举值：</p><ul><li>cdb： 云数据库MySQL</li><li>mariadb： 云数据库MariaDB</li></ul>
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get <p>识别模板id</p> 
     * @return ComplianceId <p>识别模板id</p>
     */
    public Long getComplianceId() {
        return this.ComplianceId;
    }

    /**
     * Set <p>识别模板id</p>
     * @param ComplianceId <p>识别模板id</p>
     */
    public void setComplianceId(Long ComplianceId) {
        this.ComplianceId = ComplianceId;
    }

    public DescribeDspmIdentifyDistributionStatisticsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDspmIdentifyDistributionStatisticsRequest(DescribeDspmIdentifyDistributionStatisticsRequest source) {
        if (source.StatType != null) {
            this.StatType = new String(source.StatType);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.ComplianceId != null) {
            this.ComplianceId = new Long(source.ComplianceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StatType", this.StatType);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "ComplianceId", this.ComplianceId);

    }
}

