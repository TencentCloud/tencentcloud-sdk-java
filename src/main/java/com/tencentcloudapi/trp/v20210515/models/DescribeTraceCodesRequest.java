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

public class DescribeTraceCodesRequest extends AbstractModel{

    /**
    * 搜索关键字 码标识，或者批次ID
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 条数
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 页码
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 批次ID，弃用
    */
    @SerializedName("BatchId")
    @Expose
    private String BatchId;

    /**
    * 企业ID
    */
    @SerializedName("CorpId")
    @Expose
    private Long CorpId;

    /**
     * Get 搜索关键字 码标识，或者批次ID 
     * @return Keyword 搜索关键字 码标识，或者批次ID
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 搜索关键字 码标识，或者批次ID
     * @param Keyword 搜索关键字 码标识，或者批次ID
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 条数 
     * @return PageNumber 条数
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 条数
     * @param PageNumber 条数
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 页码 
     * @return PageSize 页码
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 页码
     * @param PageSize 页码
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 批次ID，弃用 
     * @return BatchId 批次ID，弃用
     */
    public String getBatchId() {
        return this.BatchId;
    }

    /**
     * Set 批次ID，弃用
     * @param BatchId 批次ID，弃用
     */
    public void setBatchId(String BatchId) {
        this.BatchId = BatchId;
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

    public DescribeTraceCodesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTraceCodesRequest(DescribeTraceCodesRequest source) {
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.BatchId != null) {
            this.BatchId = new String(source.BatchId);
        }
        if (source.CorpId != null) {
            this.CorpId = new Long(source.CorpId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "BatchId", this.BatchId);
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);

    }
}

