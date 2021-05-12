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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVodDomainsRequest extends AbstractModel{

    /**
    * 域名列表。当该字段不填时，则默认列出所有域名信息。本字段字段限制如下：
<li>域名个数度最大为 20。</li>
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * 分页拉取的最大返回结果数。默认值：20。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页拉取的起始偏移量。默认值：0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get 域名列表。当该字段不填时，则默认列出所有域名信息。本字段字段限制如下：
<li>域名个数度最大为 20。</li> 
     * @return Domains 域名列表。当该字段不填时，则默认列出所有域名信息。本字段字段限制如下：
<li>域名个数度最大为 20。</li>
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 域名列表。当该字段不填时，则默认列出所有域名信息。本字段字段限制如下：
<li>域名个数度最大为 20。</li>
     * @param Domains 域名列表。当该字段不填时，则默认列出所有域名信息。本字段字段限制如下：
<li>域名个数度最大为 20。</li>
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get 分页拉取的最大返回结果数。默认值：20。 
     * @return Limit 分页拉取的最大返回结果数。默认值：20。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页拉取的最大返回结果数。默认值：20。
     * @param Limit 分页拉取的最大返回结果数。默认值：20。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页拉取的起始偏移量。默认值：0。 
     * @return Offset 分页拉取的起始偏移量。默认值：0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页拉取的起始偏移量。默认值：0。
     * @param Offset 分页拉取的起始偏移量。默认值：0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。 
     * @return SubAppId 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     * @param SubAppId 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    public DescribeVodDomainsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVodDomainsRequest(DescribeVodDomainsRequest source) {
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

