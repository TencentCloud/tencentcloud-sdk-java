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

public class DescribeMerchantsRequest extends AbstractModel{

    /**
    * 搜索商户名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

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
    * 企业ID
    */
    @SerializedName("CorpId")
    @Expose
    private Long CorpId;

    /**
    * 码来源类型 0:自建, 1:第三方
    */
    @SerializedName("CodeType")
    @Expose
    private Long CodeType;

    /**
     * Get 搜索商户名称 
     * @return Name 搜索商户名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 搜索商户名称
     * @param Name 搜索商户名称
     */
    public void setName(String Name) {
        this.Name = Name;
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

    /**
     * Get 码来源类型 0:自建, 1:第三方 
     * @return CodeType 码来源类型 0:自建, 1:第三方
     */
    public Long getCodeType() {
        return this.CodeType;
    }

    /**
     * Set 码来源类型 0:自建, 1:第三方
     * @param CodeType 码来源类型 0:自建, 1:第三方
     */
    public void setCodeType(Long CodeType) {
        this.CodeType = CodeType;
    }

    public DescribeMerchantsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMerchantsRequest(DescribeMerchantsRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.CorpId != null) {
            this.CorpId = new Long(source.CorpId);
        }
        if (source.CodeType != null) {
            this.CodeType = new Long(source.CodeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);
        this.setParamSimple(map, prefix + "CodeType", this.CodeType);

    }
}

