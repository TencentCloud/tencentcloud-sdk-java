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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDevicePositionListRequest extends AbstractModel{

    /**
    * 产品标识列表
    */
    @SerializedName("ProductIdList")
    @Expose
    private String [] ProductIdList;

    /**
    * 坐标类型
    */
    @SerializedName("CoordinateType")
    @Expose
    private Long CoordinateType;

    /**
    * 分页偏移
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页的大小
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 产品标识列表 
     * @return ProductIdList 产品标识列表
     */
    public String [] getProductIdList() {
        return this.ProductIdList;
    }

    /**
     * Set 产品标识列表
     * @param ProductIdList 产品标识列表
     */
    public void setProductIdList(String [] ProductIdList) {
        this.ProductIdList = ProductIdList;
    }

    /**
     * Get 坐标类型 
     * @return CoordinateType 坐标类型
     */
    public Long getCoordinateType() {
        return this.CoordinateType;
    }

    /**
     * Set 坐标类型
     * @param CoordinateType 坐标类型
     */
    public void setCoordinateType(Long CoordinateType) {
        this.CoordinateType = CoordinateType;
    }

    /**
     * Get 分页偏移 
     * @return Offset 分页偏移
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移
     * @param Offset 分页偏移
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页的大小 
     * @return Limit 分页的大小
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页的大小
     * @param Limit 分页的大小
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeDevicePositionListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDevicePositionListRequest(DescribeDevicePositionListRequest source) {
        if (source.ProductIdList != null) {
            this.ProductIdList = new String[source.ProductIdList.length];
            for (int i = 0; i < source.ProductIdList.length; i++) {
                this.ProductIdList[i] = new String(source.ProductIdList[i]);
            }
        }
        if (source.CoordinateType != null) {
            this.CoordinateType = new Long(source.CoordinateType);
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
        this.setParamArraySimple(map, prefix + "ProductIdList.", this.ProductIdList);
        this.setParamSimple(map, prefix + "CoordinateType", this.CoordinateType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

