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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFirmwareTasksRequest extends AbstractModel {

    /**
    * 产品ID
    */
    @SerializedName("ProductID")
    @Expose
    private String ProductID;

    /**
    * 固件版本号
    */
    @SerializedName("FirmwareVersion")
    @Expose
    private String FirmwareVersion;

    /**
    * 查询偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回查询结果条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 搜索过滤条件
    */
    @SerializedName("Filters")
    @Expose
    private SearchKeyword [] Filters;

    /**
    * 固件类型
    */
    @SerializedName("FwType")
    @Expose
    private String FwType;

    /**
     * Get 产品ID 
     * @return ProductID 产品ID
     */
    public String getProductID() {
        return this.ProductID;
    }

    /**
     * Set 产品ID
     * @param ProductID 产品ID
     */
    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    /**
     * Get 固件版本号 
     * @return FirmwareVersion 固件版本号
     */
    public String getFirmwareVersion() {
        return this.FirmwareVersion;
    }

    /**
     * Set 固件版本号
     * @param FirmwareVersion 固件版本号
     */
    public void setFirmwareVersion(String FirmwareVersion) {
        this.FirmwareVersion = FirmwareVersion;
    }

    /**
     * Get 查询偏移量 
     * @return Offset 查询偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询偏移量
     * @param Offset 查询偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回查询结果条数 
     * @return Limit 返回查询结果条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回查询结果条数
     * @param Limit 返回查询结果条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 搜索过滤条件 
     * @return Filters 搜索过滤条件
     */
    public SearchKeyword [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 搜索过滤条件
     * @param Filters 搜索过滤条件
     */
    public void setFilters(SearchKeyword [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 固件类型 
     * @return FwType 固件类型
     */
    public String getFwType() {
        return this.FwType;
    }

    /**
     * Set 固件类型
     * @param FwType 固件类型
     */
    public void setFwType(String FwType) {
        this.FwType = FwType;
    }

    public DescribeFirmwareTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFirmwareTasksRequest(DescribeFirmwareTasksRequest source) {
        if (source.ProductID != null) {
            this.ProductID = new String(source.ProductID);
        }
        if (source.FirmwareVersion != null) {
            this.FirmwareVersion = new String(source.FirmwareVersion);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new SearchKeyword[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new SearchKeyword(source.Filters[i]);
            }
        }
        if (source.FwType != null) {
            this.FwType = new String(source.FwType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductID", this.ProductID);
        this.setParamSimple(map, prefix + "FirmwareVersion", this.FirmwareVersion);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "FwType", this.FwType);

    }
}

