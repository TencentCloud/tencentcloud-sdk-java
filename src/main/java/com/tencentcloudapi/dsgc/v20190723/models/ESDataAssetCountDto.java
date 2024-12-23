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

public class ESDataAssetCountDto extends AbstractModel {

    /**
    * es
    */
    @SerializedName("DataAssetType")
    @Expose
    private Long DataAssetType;

    /**
    * 敏感索引个数
    */
    @SerializedName("SensitiveIndexCnt")
    @Expose
    private Long SensitiveIndexCnt;

    /**
    * 总的索引个数
    */
    @SerializedName("TotalIndexCnt")
    @Expose
    private Long TotalIndexCnt;

    /**
    * 敏感字段个数
    */
    @SerializedName("SensitiveFieldCnt")
    @Expose
    private Long SensitiveFieldCnt;

    /**
    * 总的字段个数
    */
    @SerializedName("TotalFieldCnt")
    @Expose
    private Long TotalFieldCnt;

    /**
    * 敏感分类的个数
    */
    @SerializedName("SensitiveCategoryCnt")
    @Expose
    private Long SensitiveCategoryCnt;

    /**
    * 敏感分级的分布
    */
    @SerializedName("SensitiveLevel")
    @Expose
    private SensitiveLevel [] SensitiveLevel;

    /**
    * 敏感分类的分布
    */
    @SerializedName("CategoryDistributed")
    @Expose
    private DspaDataCategoryDistributed [] CategoryDistributed;

    /**
     * Get es 
     * @return DataAssetType es
     */
    public Long getDataAssetType() {
        return this.DataAssetType;
    }

    /**
     * Set es
     * @param DataAssetType es
     */
    public void setDataAssetType(Long DataAssetType) {
        this.DataAssetType = DataAssetType;
    }

    /**
     * Get 敏感索引个数 
     * @return SensitiveIndexCnt 敏感索引个数
     */
    public Long getSensitiveIndexCnt() {
        return this.SensitiveIndexCnt;
    }

    /**
     * Set 敏感索引个数
     * @param SensitiveIndexCnt 敏感索引个数
     */
    public void setSensitiveIndexCnt(Long SensitiveIndexCnt) {
        this.SensitiveIndexCnt = SensitiveIndexCnt;
    }

    /**
     * Get 总的索引个数 
     * @return TotalIndexCnt 总的索引个数
     */
    public Long getTotalIndexCnt() {
        return this.TotalIndexCnt;
    }

    /**
     * Set 总的索引个数
     * @param TotalIndexCnt 总的索引个数
     */
    public void setTotalIndexCnt(Long TotalIndexCnt) {
        this.TotalIndexCnt = TotalIndexCnt;
    }

    /**
     * Get 敏感字段个数 
     * @return SensitiveFieldCnt 敏感字段个数
     */
    public Long getSensitiveFieldCnt() {
        return this.SensitiveFieldCnt;
    }

    /**
     * Set 敏感字段个数
     * @param SensitiveFieldCnt 敏感字段个数
     */
    public void setSensitiveFieldCnt(Long SensitiveFieldCnt) {
        this.SensitiveFieldCnt = SensitiveFieldCnt;
    }

    /**
     * Get 总的字段个数 
     * @return TotalFieldCnt 总的字段个数
     */
    public Long getTotalFieldCnt() {
        return this.TotalFieldCnt;
    }

    /**
     * Set 总的字段个数
     * @param TotalFieldCnt 总的字段个数
     */
    public void setTotalFieldCnt(Long TotalFieldCnt) {
        this.TotalFieldCnt = TotalFieldCnt;
    }

    /**
     * Get 敏感分类的个数 
     * @return SensitiveCategoryCnt 敏感分类的个数
     */
    public Long getSensitiveCategoryCnt() {
        return this.SensitiveCategoryCnt;
    }

    /**
     * Set 敏感分类的个数
     * @param SensitiveCategoryCnt 敏感分类的个数
     */
    public void setSensitiveCategoryCnt(Long SensitiveCategoryCnt) {
        this.SensitiveCategoryCnt = SensitiveCategoryCnt;
    }

    /**
     * Get 敏感分级的分布 
     * @return SensitiveLevel 敏感分级的分布
     */
    public SensitiveLevel [] getSensitiveLevel() {
        return this.SensitiveLevel;
    }

    /**
     * Set 敏感分级的分布
     * @param SensitiveLevel 敏感分级的分布
     */
    public void setSensitiveLevel(SensitiveLevel [] SensitiveLevel) {
        this.SensitiveLevel = SensitiveLevel;
    }

    /**
     * Get 敏感分类的分布 
     * @return CategoryDistributed 敏感分类的分布
     */
    public DspaDataCategoryDistributed [] getCategoryDistributed() {
        return this.CategoryDistributed;
    }

    /**
     * Set 敏感分类的分布
     * @param CategoryDistributed 敏感分类的分布
     */
    public void setCategoryDistributed(DspaDataCategoryDistributed [] CategoryDistributed) {
        this.CategoryDistributed = CategoryDistributed;
    }

    public ESDataAssetCountDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ESDataAssetCountDto(ESDataAssetCountDto source) {
        if (source.DataAssetType != null) {
            this.DataAssetType = new Long(source.DataAssetType);
        }
        if (source.SensitiveIndexCnt != null) {
            this.SensitiveIndexCnt = new Long(source.SensitiveIndexCnt);
        }
        if (source.TotalIndexCnt != null) {
            this.TotalIndexCnt = new Long(source.TotalIndexCnt);
        }
        if (source.SensitiveFieldCnt != null) {
            this.SensitiveFieldCnt = new Long(source.SensitiveFieldCnt);
        }
        if (source.TotalFieldCnt != null) {
            this.TotalFieldCnt = new Long(source.TotalFieldCnt);
        }
        if (source.SensitiveCategoryCnt != null) {
            this.SensitiveCategoryCnt = new Long(source.SensitiveCategoryCnt);
        }
        if (source.SensitiveLevel != null) {
            this.SensitiveLevel = new SensitiveLevel[source.SensitiveLevel.length];
            for (int i = 0; i < source.SensitiveLevel.length; i++) {
                this.SensitiveLevel[i] = new SensitiveLevel(source.SensitiveLevel[i]);
            }
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
        this.setParamSimple(map, prefix + "SensitiveIndexCnt", this.SensitiveIndexCnt);
        this.setParamSimple(map, prefix + "TotalIndexCnt", this.TotalIndexCnt);
        this.setParamSimple(map, prefix + "SensitiveFieldCnt", this.SensitiveFieldCnt);
        this.setParamSimple(map, prefix + "TotalFieldCnt", this.TotalFieldCnt);
        this.setParamSimple(map, prefix + "SensitiveCategoryCnt", this.SensitiveCategoryCnt);
        this.setParamArrayObj(map, prefix + "SensitiveLevel.", this.SensitiveLevel);
        this.setParamArrayObj(map, prefix + "CategoryDistributed.", this.CategoryDistributed);

    }
}

