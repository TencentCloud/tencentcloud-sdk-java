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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccountsRequest extends AbstractModel {

    /**
    * 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 手机号码。指定手机号获取账号信息，目前仅支持国内手机号，且号码不加地区码 `+86` 等。
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 分页返回的起始偏移量，默认值：0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页返回的记录条数，默认值：10，最大值：20。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。 
     * @return Platform 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
     * @param Platform 平台 Id，指定访问的平台。关于平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 手机号码。指定手机号获取账号信息，目前仅支持国内手机号，且号码不加地区码 `+86` 等。 
     * @return Phone 手机号码。指定手机号获取账号信息，目前仅支持国内手机号，且号码不加地区码 `+86` 等。
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 手机号码。指定手机号获取账号信息，目前仅支持国内手机号，且号码不加地区码 `+86` 等。
     * @param Phone 手机号码。指定手机号获取账号信息，目前仅支持国内手机号，且号码不加地区码 `+86` 等。
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 分页返回的起始偏移量，默认值：0。 
     * @return Offset 分页返回的起始偏移量，默认值：0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页返回的起始偏移量，默认值：0。
     * @param Offset 分页返回的起始偏移量，默认值：0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页返回的记录条数，默认值：10，最大值：20。 
     * @return Limit 分页返回的记录条数，默认值：10，最大值：20。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页返回的记录条数，默认值：10，最大值：20。
     * @param Limit 分页返回的记录条数，默认值：10，最大值：20。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeAccountsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccountsRequest(DescribeAccountsRequest source) {
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

