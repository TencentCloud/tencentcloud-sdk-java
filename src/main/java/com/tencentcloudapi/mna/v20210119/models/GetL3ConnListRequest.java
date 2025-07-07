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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetL3ConnListRequest extends AbstractModel {

    /**
    * 每页显示记录数，PageSize、PageNumber值均为-1 时，按照1页无限制条数匹配所有设备
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 当前查看页码，PageSize、PageNumber值均为-1 时，按照1页无限制条数匹配所有设备
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 搜索分组的DeviceId，为空时匹配所有分组
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
     * Get 每页显示记录数，PageSize、PageNumber值均为-1 时，按照1页无限制条数匹配所有设备 
     * @return PageSize 每页显示记录数，PageSize、PageNumber值均为-1 时，按照1页无限制条数匹配所有设备
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页显示记录数，PageSize、PageNumber值均为-1 时，按照1页无限制条数匹配所有设备
     * @param PageSize 每页显示记录数，PageSize、PageNumber值均为-1 时，按照1页无限制条数匹配所有设备
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 当前查看页码，PageSize、PageNumber值均为-1 时，按照1页无限制条数匹配所有设备 
     * @return PageNumber 当前查看页码，PageSize、PageNumber值均为-1 时，按照1页无限制条数匹配所有设备
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 当前查看页码，PageSize、PageNumber值均为-1 时，按照1页无限制条数匹配所有设备
     * @param PageNumber 当前查看页码，PageSize、PageNumber值均为-1 时，按照1页无限制条数匹配所有设备
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 搜索分组的DeviceId，为空时匹配所有分组 
     * @return DeviceId 搜索分组的DeviceId，为空时匹配所有分组
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 搜索分组的DeviceId，为空时匹配所有分组
     * @param DeviceId 搜索分组的DeviceId，为空时匹配所有分组
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    public GetL3ConnListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetL3ConnListRequest(GetL3ConnListRequest source) {
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);

    }
}

