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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLicenseBindListRequest extends AbstractModel{

    /**
    * 授权ID
    */
    @SerializedName("LicenseId")
    @Expose
    private Long LicenseId;

    /**
    * 授权类型
    */
    @SerializedName("LicenseType")
    @Expose
    private Long LicenseType;

    /**
    * 资源ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <li>InstanceID、IP、

MachineName 模糊查询</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * 限制条数,默认10.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量,默认0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 授权ID 
     * @return LicenseId 授权ID
     */
    public Long getLicenseId() {
        return this.LicenseId;
    }

    /**
     * Set 授权ID
     * @param LicenseId 授权ID
     */
    public void setLicenseId(Long LicenseId) {
        this.LicenseId = LicenseId;
    }

    /**
     * Get 授权类型 
     * @return LicenseType 授权类型
     */
    public Long getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set 授权类型
     * @param LicenseType 授权类型
     */
    public void setLicenseType(Long LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get 资源ID 
     * @return ResourceId 资源ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID
     * @param ResourceId 资源ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <li>InstanceID、IP、

MachineName 模糊查询</li> 
     * @return Filters <li>InstanceID、IP、

MachineName 模糊查询</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <li>InstanceID、IP、

MachineName 模糊查询</li>
     * @param Filters <li>InstanceID、IP、

MachineName 模糊查询</li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 限制条数,默认10. 
     * @return Limit 限制条数,默认10.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制条数,默认10.
     * @param Limit 限制条数,默认10.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量,默认0. 
     * @return Offset 偏移量,默认0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量,默认0.
     * @param Offset 偏移量,默认0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeLicenseBindListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLicenseBindListRequest(DescribeLicenseBindListRequest source) {
        if (source.LicenseId != null) {
            this.LicenseId = new Long(source.LicenseId);
        }
        if (source.LicenseType != null) {
            this.LicenseType = new Long(source.LicenseType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
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
        this.setParamSimple(map, prefix + "LicenseId", this.LicenseId);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

