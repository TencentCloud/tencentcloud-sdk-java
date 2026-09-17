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
package com.tencentcloudapi.edgezone.v20260401.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceTypesRequest extends AbstractModel {

    /**
    * 可用区代码，如 ap-guangzhou-1；不传则返回账号下所有可用区的机型。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 分页偏移量,默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页大小，默认20，最大100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 可用区代码，如 ap-guangzhou-1；不传则返回账号下所有可用区的机型。 
     * @return Zone 可用区代码，如 ap-guangzhou-1；不传则返回账号下所有可用区的机型。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区代码，如 ap-guangzhou-1；不传则返回账号下所有可用区的机型。
     * @param Zone 可用区代码，如 ap-guangzhou-1；不传则返回账号下所有可用区的机型。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 分页偏移量,默认0 
     * @return Offset 分页偏移量,默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量,默认0
     * @param Offset 分页偏移量,默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页大小，默认20，最大100 
     * @return Limit 分页大小，默认20，最大100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页大小，默认20，最大100
     * @param Limit 分页大小，默认20，最大100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeInstanceTypesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceTypesRequest(DescribeInstanceTypesRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
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
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

