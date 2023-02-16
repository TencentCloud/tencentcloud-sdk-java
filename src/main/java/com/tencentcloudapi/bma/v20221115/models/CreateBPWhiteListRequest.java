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
package com.tencentcloudapi.bma.v20221115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBPWhiteListRequest extends AbstractModel{

    /**
    * 企业Id
    */
    @SerializedName("CompanyId")
    @Expose
    private Long CompanyId;

    /**
    * 白名单类型：0-网站 1-应用 2-公众号 3-小程
    */
    @SerializedName("WhiteListType")
    @Expose
    private Long WhiteListType;

    /**
    * 白名单名称
    */
    @SerializedName("WhiteLists")
    @Expose
    private String [] WhiteLists;

    /**
     * Get 企业Id 
     * @return CompanyId 企业Id
     */
    public Long getCompanyId() {
        return this.CompanyId;
    }

    /**
     * Set 企业Id
     * @param CompanyId 企业Id
     */
    public void setCompanyId(Long CompanyId) {
        this.CompanyId = CompanyId;
    }

    /**
     * Get 白名单类型：0-网站 1-应用 2-公众号 3-小程 
     * @return WhiteListType 白名单类型：0-网站 1-应用 2-公众号 3-小程
     */
    public Long getWhiteListType() {
        return this.WhiteListType;
    }

    /**
     * Set 白名单类型：0-网站 1-应用 2-公众号 3-小程
     * @param WhiteListType 白名单类型：0-网站 1-应用 2-公众号 3-小程
     */
    public void setWhiteListType(Long WhiteListType) {
        this.WhiteListType = WhiteListType;
    }

    /**
     * Get 白名单名称 
     * @return WhiteLists 白名单名称
     */
    public String [] getWhiteLists() {
        return this.WhiteLists;
    }

    /**
     * Set 白名单名称
     * @param WhiteLists 白名单名称
     */
    public void setWhiteLists(String [] WhiteLists) {
        this.WhiteLists = WhiteLists;
    }

    public CreateBPWhiteListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBPWhiteListRequest(CreateBPWhiteListRequest source) {
        if (source.CompanyId != null) {
            this.CompanyId = new Long(source.CompanyId);
        }
        if (source.WhiteListType != null) {
            this.WhiteListType = new Long(source.WhiteListType);
        }
        if (source.WhiteLists != null) {
            this.WhiteLists = new String[source.WhiteLists.length];
            for (int i = 0; i < source.WhiteLists.length; i++) {
                this.WhiteLists[i] = new String(source.WhiteLists[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompanyId", this.CompanyId);
        this.setParamSimple(map, prefix + "WhiteListType", this.WhiteListType);
        this.setParamArraySimple(map, prefix + "WhiteLists.", this.WhiteLists);

    }
}

