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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUrlViolationsRequest extends AbstractModel{

    /**
    * 分页查询偏移量，默认为 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页查询限制数目，默认为 100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 指定的域名查询
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
     * Get 分页查询偏移量，默认为 0 
     * @return Offset 分页查询偏移量，默认为 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页查询偏移量，默认为 0
     * @param Offset 分页查询偏移量，默认为 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页查询限制数目，默认为 100 
     * @return Limit 分页查询限制数目，默认为 100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页查询限制数目，默认为 100
     * @param Limit 分页查询限制数目，默认为 100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 指定的域名查询 
     * @return Domains 指定的域名查询
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 指定的域名查询
     * @param Domains 指定的域名查询
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    public DescribeUrlViolationsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUrlViolationsRequest(DescribeUrlViolationsRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);

    }
}

