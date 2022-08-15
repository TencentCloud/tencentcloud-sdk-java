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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApplicationProxyRequest extends AbstractModel{

    /**
    * 站点ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 分页查询偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页查询限制数目，默认为10，最大可设置为1000。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 代理ID。
当ProxyId为空时，表示查询站点下所有应用代理的列表。
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
     * Get 站点ID。 
     * @return ZoneId 站点ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点ID。
     * @param ZoneId 站点ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 分页查询偏移量，默认为0。 
     * @return Offset 分页查询偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页查询偏移量，默认为0。
     * @param Offset 分页查询偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页查询限制数目，默认为10，最大可设置为1000。 
     * @return Limit 分页查询限制数目，默认为10，最大可设置为1000。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页查询限制数目，默认为10，最大可设置为1000。
     * @param Limit 分页查询限制数目，默认为10，最大可设置为1000。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 代理ID。
当ProxyId为空时，表示查询站点下所有应用代理的列表。 
     * @return ProxyId 代理ID。
当ProxyId为空时，表示查询站点下所有应用代理的列表。
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set 代理ID。
当ProxyId为空时，表示查询站点下所有应用代理的列表。
     * @param ProxyId 代理ID。
当ProxyId为空时，表示查询站点下所有应用代理的列表。
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    public DescribeApplicationProxyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApplicationProxyRequest(DescribeApplicationProxyRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);

    }
}

