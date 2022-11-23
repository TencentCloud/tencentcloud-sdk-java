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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRecordGroupListRequest extends AbstractModel{

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
    * 分页开始位置
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页每页数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。 
     * @return DomainId 域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。
     * @param DomainId 域名 ID 。参数 DomainId 优先级比参数 Domain 高，如果传递参数 DomainId 将忽略参数 Domain 。
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get 分页开始位置 
     * @return Offset 分页开始位置
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页开始位置
     * @param Offset 分页开始位置
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页每页数 
     * @return Limit 分页每页数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页每页数
     * @param Limit 分页每页数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeRecordGroupListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRecordGroupListRequest(DescribeRecordGroupListRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
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
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

