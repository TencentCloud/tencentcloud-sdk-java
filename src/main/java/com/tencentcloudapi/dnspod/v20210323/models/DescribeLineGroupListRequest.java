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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLineGroupListRequest extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 偏移量，默认值为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 限制数量，传0或不传会返回所有。
    */
    @SerializedName("Length")
    @Expose
    private Long Length;

    /**
    * 按自定义线路分组名称排序的方向。升序传asc，降序传desc。
    */
    @SerializedName("SortType")
    @Expose
    private String SortType;

    /**
    * 域名ID，如果传了DomainId，系统将会忽略Domain参数，优先使用DomainId
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

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
     * Get 偏移量，默认值为0。 
     * @return Offset 偏移量，默认值为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认值为0。
     * @param Offset 偏移量，默认值为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 限制数量，传0或不传会返回所有。 
     * @return Length 限制数量，传0或不传会返回所有。
     */
    public Long getLength() {
        return this.Length;
    }

    /**
     * Set 限制数量，传0或不传会返回所有。
     * @param Length 限制数量，传0或不传会返回所有。
     */
    public void setLength(Long Length) {
        this.Length = Length;
    }

    /**
     * Get 按自定义线路分组名称排序的方向。升序传asc，降序传desc。 
     * @return SortType 按自定义线路分组名称排序的方向。升序传asc，降序传desc。
     */
    public String getSortType() {
        return this.SortType;
    }

    /**
     * Set 按自定义线路分组名称排序的方向。升序传asc，降序传desc。
     * @param SortType 按自定义线路分组名称排序的方向。升序传asc，降序传desc。
     */
    public void setSortType(String SortType) {
        this.SortType = SortType;
    }

    /**
     * Get 域名ID，如果传了DomainId，系统将会忽略Domain参数，优先使用DomainId 
     * @return DomainId 域名ID，如果传了DomainId，系统将会忽略Domain参数，优先使用DomainId
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 域名ID，如果传了DomainId，系统将会忽略Domain参数，优先使用DomainId
     * @param DomainId 域名ID，如果传了DomainId，系统将会忽略Domain参数，优先使用DomainId
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    public DescribeLineGroupListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLineGroupListRequest(DescribeLineGroupListRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Length != null) {
            this.Length = new Long(source.Length);
        }
        if (source.SortType != null) {
            this.SortType = new String(source.SortType);
        }
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Length", this.Length);
        this.setParamSimple(map, prefix + "SortType", this.SortType);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);

    }
}

