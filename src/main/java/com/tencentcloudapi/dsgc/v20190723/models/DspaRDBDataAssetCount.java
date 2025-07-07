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

public class DspaRDBDataAssetCount extends AbstractModel {

    /**
    * 数组资产类型，0代表关系型数据库资产，1代表对象存储COS资产
    */
    @SerializedName("DataAssetType")
    @Expose
    private Long DataAssetType;

    /**
    * 已扫描的数据库的个数
    */
    @SerializedName("TotalDbCnt")
    @Expose
    private Long TotalDbCnt;

    /**
    * 数据库表的个数
    */
    @SerializedName("TotalTableCnt")
    @Expose
    private Long TotalTableCnt;

    /**
    * 敏感数据类型个数
    */
    @SerializedName("SensitiveCategoryCnt")
    @Expose
    private Long SensitiveCategoryCnt;

    /**
    * 敏感字段的个数
    */
    @SerializedName("SensitiveFieldCnt")
    @Expose
    private Long SensitiveFieldCnt;

    /**
    * 敏感等级分布
    */
    @SerializedName("SensitiveLevel")
    @Expose
    private SensitiveLevel [] SensitiveLevel;

    /**
    * 敏感数据库的个数
    */
    @SerializedName("SensitiveDbCnt")
    @Expose
    private Long SensitiveDbCnt;

    /**
    * 敏感数据库表的个数
    */
    @SerializedName("SensitiveTableCnt")
    @Expose
    private Long SensitiveTableCnt;

    /**
    * 扫描字段的个数
    */
    @SerializedName("TotalFieldCnt")
    @Expose
    private Long TotalFieldCnt;

    /**
    * 数据分类分布
    */
    @SerializedName("CategoryDistributed")
    @Expose
    private DspaDataCategoryDistributed [] CategoryDistributed;

    /**
     * Get 数组资产类型，0代表关系型数据库资产，1代表对象存储COS资产 
     * @return DataAssetType 数组资产类型，0代表关系型数据库资产，1代表对象存储COS资产
     */
    public Long getDataAssetType() {
        return this.DataAssetType;
    }

    /**
     * Set 数组资产类型，0代表关系型数据库资产，1代表对象存储COS资产
     * @param DataAssetType 数组资产类型，0代表关系型数据库资产，1代表对象存储COS资产
     */
    public void setDataAssetType(Long DataAssetType) {
        this.DataAssetType = DataAssetType;
    }

    /**
     * Get 已扫描的数据库的个数 
     * @return TotalDbCnt 已扫描的数据库的个数
     */
    public Long getTotalDbCnt() {
        return this.TotalDbCnt;
    }

    /**
     * Set 已扫描的数据库的个数
     * @param TotalDbCnt 已扫描的数据库的个数
     */
    public void setTotalDbCnt(Long TotalDbCnt) {
        this.TotalDbCnt = TotalDbCnt;
    }

    /**
     * Get 数据库表的个数 
     * @return TotalTableCnt 数据库表的个数
     */
    public Long getTotalTableCnt() {
        return this.TotalTableCnt;
    }

    /**
     * Set 数据库表的个数
     * @param TotalTableCnt 数据库表的个数
     */
    public void setTotalTableCnt(Long TotalTableCnt) {
        this.TotalTableCnt = TotalTableCnt;
    }

    /**
     * Get 敏感数据类型个数 
     * @return SensitiveCategoryCnt 敏感数据类型个数
     */
    public Long getSensitiveCategoryCnt() {
        return this.SensitiveCategoryCnt;
    }

    /**
     * Set 敏感数据类型个数
     * @param SensitiveCategoryCnt 敏感数据类型个数
     */
    public void setSensitiveCategoryCnt(Long SensitiveCategoryCnt) {
        this.SensitiveCategoryCnt = SensitiveCategoryCnt;
    }

    /**
     * Get 敏感字段的个数 
     * @return SensitiveFieldCnt 敏感字段的个数
     */
    public Long getSensitiveFieldCnt() {
        return this.SensitiveFieldCnt;
    }

    /**
     * Set 敏感字段的个数
     * @param SensitiveFieldCnt 敏感字段的个数
     */
    public void setSensitiveFieldCnt(Long SensitiveFieldCnt) {
        this.SensitiveFieldCnt = SensitiveFieldCnt;
    }

    /**
     * Get 敏感等级分布 
     * @return SensitiveLevel 敏感等级分布
     */
    public SensitiveLevel [] getSensitiveLevel() {
        return this.SensitiveLevel;
    }

    /**
     * Set 敏感等级分布
     * @param SensitiveLevel 敏感等级分布
     */
    public void setSensitiveLevel(SensitiveLevel [] SensitiveLevel) {
        this.SensitiveLevel = SensitiveLevel;
    }

    /**
     * Get 敏感数据库的个数 
     * @return SensitiveDbCnt 敏感数据库的个数
     */
    public Long getSensitiveDbCnt() {
        return this.SensitiveDbCnt;
    }

    /**
     * Set 敏感数据库的个数
     * @param SensitiveDbCnt 敏感数据库的个数
     */
    public void setSensitiveDbCnt(Long SensitiveDbCnt) {
        this.SensitiveDbCnt = SensitiveDbCnt;
    }

    /**
     * Get 敏感数据库表的个数 
     * @return SensitiveTableCnt 敏感数据库表的个数
     */
    public Long getSensitiveTableCnt() {
        return this.SensitiveTableCnt;
    }

    /**
     * Set 敏感数据库表的个数
     * @param SensitiveTableCnt 敏感数据库表的个数
     */
    public void setSensitiveTableCnt(Long SensitiveTableCnt) {
        this.SensitiveTableCnt = SensitiveTableCnt;
    }

    /**
     * Get 扫描字段的个数 
     * @return TotalFieldCnt 扫描字段的个数
     */
    public Long getTotalFieldCnt() {
        return this.TotalFieldCnt;
    }

    /**
     * Set 扫描字段的个数
     * @param TotalFieldCnt 扫描字段的个数
     */
    public void setTotalFieldCnt(Long TotalFieldCnt) {
        this.TotalFieldCnt = TotalFieldCnt;
    }

    /**
     * Get 数据分类分布 
     * @return CategoryDistributed 数据分类分布
     */
    public DspaDataCategoryDistributed [] getCategoryDistributed() {
        return this.CategoryDistributed;
    }

    /**
     * Set 数据分类分布
     * @param CategoryDistributed 数据分类分布
     */
    public void setCategoryDistributed(DspaDataCategoryDistributed [] CategoryDistributed) {
        this.CategoryDistributed = CategoryDistributed;
    }

    public DspaRDBDataAssetCount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspaRDBDataAssetCount(DspaRDBDataAssetCount source) {
        if (source.DataAssetType != null) {
            this.DataAssetType = new Long(source.DataAssetType);
        }
        if (source.TotalDbCnt != null) {
            this.TotalDbCnt = new Long(source.TotalDbCnt);
        }
        if (source.TotalTableCnt != null) {
            this.TotalTableCnt = new Long(source.TotalTableCnt);
        }
        if (source.SensitiveCategoryCnt != null) {
            this.SensitiveCategoryCnt = new Long(source.SensitiveCategoryCnt);
        }
        if (source.SensitiveFieldCnt != null) {
            this.SensitiveFieldCnt = new Long(source.SensitiveFieldCnt);
        }
        if (source.SensitiveLevel != null) {
            this.SensitiveLevel = new SensitiveLevel[source.SensitiveLevel.length];
            for (int i = 0; i < source.SensitiveLevel.length; i++) {
                this.SensitiveLevel[i] = new SensitiveLevel(source.SensitiveLevel[i]);
            }
        }
        if (source.SensitiveDbCnt != null) {
            this.SensitiveDbCnt = new Long(source.SensitiveDbCnt);
        }
        if (source.SensitiveTableCnt != null) {
            this.SensitiveTableCnt = new Long(source.SensitiveTableCnt);
        }
        if (source.TotalFieldCnt != null) {
            this.TotalFieldCnt = new Long(source.TotalFieldCnt);
        }
        if (source.CategoryDistributed != null) {
            this.CategoryDistributed = new DspaDataCategoryDistributed[source.CategoryDistributed.length];
            for (int i = 0; i < source.CategoryDistributed.length; i++) {
                this.CategoryDistributed[i] = new DspaDataCategoryDistributed(source.CategoryDistributed[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataAssetType", this.DataAssetType);
        this.setParamSimple(map, prefix + "TotalDbCnt", this.TotalDbCnt);
        this.setParamSimple(map, prefix + "TotalTableCnt", this.TotalTableCnt);
        this.setParamSimple(map, prefix + "SensitiveCategoryCnt", this.SensitiveCategoryCnt);
        this.setParamSimple(map, prefix + "SensitiveFieldCnt", this.SensitiveFieldCnt);
        this.setParamArrayObj(map, prefix + "SensitiveLevel.", this.SensitiveLevel);
        this.setParamSimple(map, prefix + "SensitiveDbCnt", this.SensitiveDbCnt);
        this.setParamSimple(map, prefix + "SensitiveTableCnt", this.SensitiveTableCnt);
        this.setParamSimple(map, prefix + "TotalFieldCnt", this.TotalFieldCnt);
        this.setParamArrayObj(map, prefix + "CategoryDistributed.", this.CategoryDistributed);

    }
}

