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

public class DspaCOSDataAssetCount extends AbstractModel{

    /**
    * 数组资产类型，0代表关系型数据库资产，1代表对象存储COS资产
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataAssetType")
    @Expose
    private Long DataAssetType;

    /**
    * 已扫描的存储桶的个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalBucketCnt")
    @Expose
    private Long TotalBucketCnt;

    /**
    * 对象总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalObjectCnt")
    @Expose
    private Long TotalObjectCnt;

    /**
    * 敏感数据类型个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SensitiveCategoryCnt")
    @Expose
    private Long SensitiveCategoryCnt;

    /**
    * 敏感数据条数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SensitiveDataCnt")
    @Expose
    private Long SensitiveDataCnt;

    /**
    * 敏感等级分布
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SensitiveLevel")
    @Expose
    private SensitiveLevel [] SensitiveLevel;

    /**
    * 敏感存储桶个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SensitiveBucketCnt")
    @Expose
    private Long SensitiveBucketCnt;

    /**
    * 敏感对象个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SensitiveObjectCnt")
    @Expose
    private Long SensitiveObjectCnt;

    /**
    * 数据分类分布
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CategoryDistributed")
    @Expose
    private DspaDataCategoryDistributed [] CategoryDistributed;

    /**
     * Get 数组资产类型，0代表关系型数据库资产，1代表对象存储COS资产
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataAssetType 数组资产类型，0代表关系型数据库资产，1代表对象存储COS资产
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDataAssetType() {
        return this.DataAssetType;
    }

    /**
     * Set 数组资产类型，0代表关系型数据库资产，1代表对象存储COS资产
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataAssetType 数组资产类型，0代表关系型数据库资产，1代表对象存储COS资产
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataAssetType(Long DataAssetType) {
        this.DataAssetType = DataAssetType;
    }

    /**
     * Get 已扫描的存储桶的个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalBucketCnt 已扫描的存储桶的个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalBucketCnt() {
        return this.TotalBucketCnt;
    }

    /**
     * Set 已扫描的存储桶的个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalBucketCnt 已扫描的存储桶的个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalBucketCnt(Long TotalBucketCnt) {
        this.TotalBucketCnt = TotalBucketCnt;
    }

    /**
     * Get 对象总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalObjectCnt 对象总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalObjectCnt() {
        return this.TotalObjectCnt;
    }

    /**
     * Set 对象总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalObjectCnt 对象总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalObjectCnt(Long TotalObjectCnt) {
        this.TotalObjectCnt = TotalObjectCnt;
    }

    /**
     * Get 敏感数据类型个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SensitiveCategoryCnt 敏感数据类型个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSensitiveCategoryCnt() {
        return this.SensitiveCategoryCnt;
    }

    /**
     * Set 敏感数据类型个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param SensitiveCategoryCnt 敏感数据类型个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSensitiveCategoryCnt(Long SensitiveCategoryCnt) {
        this.SensitiveCategoryCnt = SensitiveCategoryCnt;
    }

    /**
     * Get 敏感数据条数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SensitiveDataCnt 敏感数据条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSensitiveDataCnt() {
        return this.SensitiveDataCnt;
    }

    /**
     * Set 敏感数据条数
注意：此字段可能返回 null，表示取不到有效值。
     * @param SensitiveDataCnt 敏感数据条数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSensitiveDataCnt(Long SensitiveDataCnt) {
        this.SensitiveDataCnt = SensitiveDataCnt;
    }

    /**
     * Get 敏感等级分布
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SensitiveLevel 敏感等级分布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SensitiveLevel [] getSensitiveLevel() {
        return this.SensitiveLevel;
    }

    /**
     * Set 敏感等级分布
注意：此字段可能返回 null，表示取不到有效值。
     * @param SensitiveLevel 敏感等级分布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSensitiveLevel(SensitiveLevel [] SensitiveLevel) {
        this.SensitiveLevel = SensitiveLevel;
    }

    /**
     * Get 敏感存储桶个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SensitiveBucketCnt 敏感存储桶个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSensitiveBucketCnt() {
        return this.SensitiveBucketCnt;
    }

    /**
     * Set 敏感存储桶个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param SensitiveBucketCnt 敏感存储桶个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSensitiveBucketCnt(Long SensitiveBucketCnt) {
        this.SensitiveBucketCnt = SensitiveBucketCnt;
    }

    /**
     * Get 敏感对象个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SensitiveObjectCnt 敏感对象个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSensitiveObjectCnt() {
        return this.SensitiveObjectCnt;
    }

    /**
     * Set 敏感对象个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param SensitiveObjectCnt 敏感对象个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSensitiveObjectCnt(Long SensitiveObjectCnt) {
        this.SensitiveObjectCnt = SensitiveObjectCnt;
    }

    /**
     * Get 数据分类分布
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CategoryDistributed 数据分类分布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DspaDataCategoryDistributed [] getCategoryDistributed() {
        return this.CategoryDistributed;
    }

    /**
     * Set 数据分类分布
注意：此字段可能返回 null，表示取不到有效值。
     * @param CategoryDistributed 数据分类分布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCategoryDistributed(DspaDataCategoryDistributed [] CategoryDistributed) {
        this.CategoryDistributed = CategoryDistributed;
    }

    public DspaCOSDataAssetCount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspaCOSDataAssetCount(DspaCOSDataAssetCount source) {
        if (source.DataAssetType != null) {
            this.DataAssetType = new Long(source.DataAssetType);
        }
        if (source.TotalBucketCnt != null) {
            this.TotalBucketCnt = new Long(source.TotalBucketCnt);
        }
        if (source.TotalObjectCnt != null) {
            this.TotalObjectCnt = new Long(source.TotalObjectCnt);
        }
        if (source.SensitiveCategoryCnt != null) {
            this.SensitiveCategoryCnt = new Long(source.SensitiveCategoryCnt);
        }
        if (source.SensitiveDataCnt != null) {
            this.SensitiveDataCnt = new Long(source.SensitiveDataCnt);
        }
        if (source.SensitiveLevel != null) {
            this.SensitiveLevel = new SensitiveLevel[source.SensitiveLevel.length];
            for (int i = 0; i < source.SensitiveLevel.length; i++) {
                this.SensitiveLevel[i] = new SensitiveLevel(source.SensitiveLevel[i]);
            }
        }
        if (source.SensitiveBucketCnt != null) {
            this.SensitiveBucketCnt = new Long(source.SensitiveBucketCnt);
        }
        if (source.SensitiveObjectCnt != null) {
            this.SensitiveObjectCnt = new Long(source.SensitiveObjectCnt);
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
        this.setParamSimple(map, prefix + "TotalBucketCnt", this.TotalBucketCnt);
        this.setParamSimple(map, prefix + "TotalObjectCnt", this.TotalObjectCnt);
        this.setParamSimple(map, prefix + "SensitiveCategoryCnt", this.SensitiveCategoryCnt);
        this.setParamSimple(map, prefix + "SensitiveDataCnt", this.SensitiveDataCnt);
        this.setParamArrayObj(map, prefix + "SensitiveLevel.", this.SensitiveLevel);
        this.setParamSimple(map, prefix + "SensitiveBucketCnt", this.SensitiveBucketCnt);
        this.setParamSimple(map, prefix + "SensitiveObjectCnt", this.SensitiveObjectCnt);
        this.setParamArrayObj(map, prefix + "CategoryDistributed.", this.CategoryDistributed);

    }
}

