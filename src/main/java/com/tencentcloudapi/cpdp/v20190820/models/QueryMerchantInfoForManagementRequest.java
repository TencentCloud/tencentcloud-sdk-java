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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryMerchantInfoForManagementRequest extends AbstractModel{

    /**
    * 开票平台ID
    */
    @SerializedName("InvoicePlatformId")
    @Expose
    private Long InvoicePlatformId;

    /**
    * 页码
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 页大小
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 接入环境。沙箱环境填sandbox。
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
     * Get 开票平台ID 
     * @return InvoicePlatformId 开票平台ID
     */
    public Long getInvoicePlatformId() {
        return this.InvoicePlatformId;
    }

    /**
     * Set 开票平台ID
     * @param InvoicePlatformId 开票平台ID
     */
    public void setInvoicePlatformId(Long InvoicePlatformId) {
        this.InvoicePlatformId = InvoicePlatformId;
    }

    /**
     * Get 页码 
     * @return Offset 页码
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 页码
     * @param Offset 页码
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 页大小 
     * @return Limit 页大小
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 页大小
     * @param Limit 页大小
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 接入环境。沙箱环境填sandbox。 
     * @return Profile 接入环境。沙箱环境填sandbox。
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set 接入环境。沙箱环境填sandbox。
     * @param Profile 接入环境。沙箱环境填sandbox。
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    public QueryMerchantInfoForManagementRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryMerchantInfoForManagementRequest(QueryMerchantInfoForManagementRequest source) {
        if (source.InvoicePlatformId != null) {
            this.InvoicePlatformId = new Long(source.InvoicePlatformId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Profile != null) {
            this.Profile = new String(source.Profile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InvoicePlatformId", this.InvoicePlatformId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Profile", this.Profile);

    }
}

