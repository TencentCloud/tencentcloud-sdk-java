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

public class DescribeScanLogsRequest extends AbstractModel{

    /**
    * 企业ID
    */
    @SerializedName("CorpId")
    @Expose
    private Long CorpId;

    /**
    * 分页数量
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 当前分页
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 安心码
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 小程序用户ID
    */
    @SerializedName("Openid")
    @Expose
    private String Openid;

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
     * Get 分页数量 
     * @return PageSize 分页数量
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页数量
     * @param PageSize 分页数量
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 当前分页 
     * @return PageNumber 当前分页
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 当前分页
     * @param PageNumber 当前分页
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 安心码 
     * @return Code 安心码
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 安心码
     * @param Code 安心码
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 小程序用户ID 
     * @return Openid 小程序用户ID
     */
    public String getOpenid() {
        return this.Openid;
    }

    /**
     * Set 小程序用户ID
     * @param Openid 小程序用户ID
     */
    public void setOpenid(String Openid) {
        this.Openid = Openid;
    }

    public DescribeScanLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScanLogsRequest(DescribeScanLogsRequest source) {
        if (source.CorpId != null) {
            this.CorpId = new Long(source.CorpId);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Openid != null) {
            this.Openid = new String(source.Openid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Openid", this.Openid);

    }
}

