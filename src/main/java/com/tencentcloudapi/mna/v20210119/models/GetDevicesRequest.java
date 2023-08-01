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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetDevicesRequest extends AbstractModel{

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
    * 搜索设备的关键字（ID或者设备名），为空时匹配所有设备
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * DeviceType
不传：返回所有设备；
1:自有设备；
2:三方设备
    */
    @SerializedName("DeviceType")
    @Expose
    private Long DeviceType;

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
     * Get 搜索设备的关键字（ID或者设备名），为空时匹配所有设备 
     * @return Keyword 搜索设备的关键字（ID或者设备名），为空时匹配所有设备
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 搜索设备的关键字（ID或者设备名），为空时匹配所有设备
     * @param Keyword 搜索设备的关键字（ID或者设备名），为空时匹配所有设备
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get DeviceType
不传：返回所有设备；
1:自有设备；
2:三方设备 
     * @return DeviceType DeviceType
不传：返回所有设备；
1:自有设备；
2:三方设备
     */
    public Long getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set DeviceType
不传：返回所有设备；
1:自有设备；
2:三方设备
     * @param DeviceType DeviceType
不传：返回所有设备；
1:自有设备；
2:三方设备
     */
    public void setDeviceType(Long DeviceType) {
        this.DeviceType = DeviceType;
    }

    public GetDevicesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetDevicesRequest(GetDevicesRequest source) {
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new Long(source.DeviceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);

    }
}

