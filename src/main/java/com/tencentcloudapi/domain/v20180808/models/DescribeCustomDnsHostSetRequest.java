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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCustomDnsHostSetRequest extends AbstractModel {

    /**
    * 域名实例ID
可通过[DescribeDomainNameList](https://cloud.tencent.com/document/api/242/48941)接口获取
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * 返回数量，默认为20，取值范围[1,100]
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 域名实例ID
可通过[DescribeDomainNameList](https://cloud.tencent.com/document/api/242/48941)接口获取 
     * @return DomainId 域名实例ID
可通过[DescribeDomainNameList](https://cloud.tencent.com/document/api/242/48941)接口获取
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 域名实例ID
可通过[DescribeDomainNameList](https://cloud.tencent.com/document/api/242/48941)接口获取
     * @param DomainId 域名实例ID
可通过[DescribeDomainNameList](https://cloud.tencent.com/document/api/242/48941)接口获取
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get 返回数量，默认为20，取值范围[1,100] 
     * @return Limit 返回数量，默认为20，取值范围[1,100]
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，取值范围[1,100]
     * @param Limit 返回数量，默认为20，取值范围[1,100]
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认为0 
     * @return Offset 偏移量，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0
     * @param Offset 偏移量，默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeCustomDnsHostSetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCustomDnsHostSetRequest(DescribeCustomDnsHostSetRequest source) {
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

