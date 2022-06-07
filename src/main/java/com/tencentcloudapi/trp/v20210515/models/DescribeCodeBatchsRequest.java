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
package com.tencentcloudapi.trp.v20210515.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCodeBatchsRequest extends AbstractModel{

    /**
    * 查询商户ID
    */
    @SerializedName("MerchantId")
    @Expose
    private String MerchantId;

    /**
    * 查询商品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 查询关键字
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 条数
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 页数
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 批次类型 0:溯源 1:营销
    */
    @SerializedName("BatchType")
    @Expose
    private String BatchType;

    /**
    * 企业ID
    */
    @SerializedName("CorpId")
    @Expose
    private Long CorpId;

    /**
     * Get 查询商户ID 
     * @return MerchantId 查询商户ID
     */
    public String getMerchantId() {
        return this.MerchantId;
    }

    /**
     * Set 查询商户ID
     * @param MerchantId 查询商户ID
     */
    public void setMerchantId(String MerchantId) {
        this.MerchantId = MerchantId;
    }

    /**
     * Get 查询商品ID 
     * @return ProductId 查询商品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 查询商品ID
     * @param ProductId 查询商品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 查询关键字 
     * @return Keyword 查询关键字
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 查询关键字
     * @param Keyword 查询关键字
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 条数 
     * @return PageSize 条数
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 条数
     * @param PageSize 条数
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 页数 
     * @return PageNumber 页数
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页数
     * @param PageNumber 页数
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 批次类型 0:溯源 1:营销 
     * @return BatchType 批次类型 0:溯源 1:营销
     */
    public String getBatchType() {
        return this.BatchType;
    }

    /**
     * Set 批次类型 0:溯源 1:营销
     * @param BatchType 批次类型 0:溯源 1:营销
     */
    public void setBatchType(String BatchType) {
        this.BatchType = BatchType;
    }

    /**
     * Get 企业ID 
     * @return CorpId 企业ID
     */
    public Long getCorpId() {
        return this.CorpId;
    }

    /**
     * Set 企业ID
     * @param CorpId 企业ID
     */
    public void setCorpId(Long CorpId) {
        this.CorpId = CorpId;
    }

    public DescribeCodeBatchsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCodeBatchsRequest(DescribeCodeBatchsRequest source) {
        if (source.MerchantId != null) {
            this.MerchantId = new String(source.MerchantId);
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.BatchType != null) {
            this.BatchType = new String(source.BatchType);
        }
        if (source.CorpId != null) {
            this.CorpId = new Long(source.CorpId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MerchantId", this.MerchantId);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "BatchType", this.BatchType);
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);

    }
}

