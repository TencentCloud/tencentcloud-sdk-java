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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveDomainCertBindingsRequest extends AbstractModel{

    /**
    * 要搜索的域名字符串。
    */
    @SerializedName("DomainSearch")
    @Expose
    private String DomainSearch;

    /**
    * 记录行的位置，从0开始。默认0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 记录行的最大数目。默认50。
若不传，则最多返回50条数据。
    */
    @SerializedName("Length")
    @Expose
    private Long Length;

    /**
    * 要查询的单个域名。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 可取值：
ExpireTimeAsc：证书过期时间升序。
ExpireTimeDesc：证书过期时间降序。
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
     * Get 要搜索的域名字符串。 
     * @return DomainSearch 要搜索的域名字符串。
     */
    public String getDomainSearch() {
        return this.DomainSearch;
    }

    /**
     * Set 要搜索的域名字符串。
     * @param DomainSearch 要搜索的域名字符串。
     */
    public void setDomainSearch(String DomainSearch) {
        this.DomainSearch = DomainSearch;
    }

    /**
     * Get 记录行的位置，从0开始。默认0。 
     * @return Offset 记录行的位置，从0开始。默认0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 记录行的位置，从0开始。默认0。
     * @param Offset 记录行的位置，从0开始。默认0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 记录行的最大数目。默认50。
若不传，则最多返回50条数据。 
     * @return Length 记录行的最大数目。默认50。
若不传，则最多返回50条数据。
     */
    public Long getLength() {
        return this.Length;
    }

    /**
     * Set 记录行的最大数目。默认50。
若不传，则最多返回50条数据。
     * @param Length 记录行的最大数目。默认50。
若不传，则最多返回50条数据。
     */
    public void setLength(Long Length) {
        this.Length = Length;
    }

    /**
     * Get 要查询的单个域名。 
     * @return DomainName 要查询的单个域名。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 要查询的单个域名。
     * @param DomainName 要查询的单个域名。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get 可取值：
ExpireTimeAsc：证书过期时间升序。
ExpireTimeDesc：证书过期时间降序。 
     * @return OrderBy 可取值：
ExpireTimeAsc：证书过期时间升序。
ExpireTimeDesc：证书过期时间降序。
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 可取值：
ExpireTimeAsc：证书过期时间升序。
ExpireTimeDesc：证书过期时间降序。
     * @param OrderBy 可取值：
ExpireTimeAsc：证书过期时间升序。
ExpireTimeDesc：证书过期时间降序。
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    public DescribeLiveDomainCertBindingsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLiveDomainCertBindingsRequest(DescribeLiveDomainCertBindingsRequest source) {
        if (source.DomainSearch != null) {
            this.DomainSearch = new String(source.DomainSearch);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Length != null) {
            this.Length = new Long(source.Length);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainSearch", this.DomainSearch);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Length", this.Length);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);

    }
}

