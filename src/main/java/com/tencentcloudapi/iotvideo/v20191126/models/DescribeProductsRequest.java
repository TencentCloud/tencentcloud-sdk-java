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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProductsRequest extends AbstractModel{

    /**
    * 分页大小，当前页面中显示的最大数量，值范围 1-100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页偏移，Offset从0开始
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 产器型号(APP产品,为APP包名)
    */
    @SerializedName("ProductModel")
    @Expose
    private String ProductModel;

    /**
    * 开始时间 ，UNIX 时间戳，单位秒
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间 ，UNIX 时间戳，单位秒
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get 分页大小，当前页面中显示的最大数量，值范围 1-100 
     * @return Limit 分页大小，当前页面中显示的最大数量，值范围 1-100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页大小，当前页面中显示的最大数量，值范围 1-100
     * @param Limit 分页大小，当前页面中显示的最大数量，值范围 1-100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页偏移，Offset从0开始 
     * @return Offset 分页偏移，Offset从0开始
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移，Offset从0开始
     * @param Offset 分页偏移，Offset从0开始
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 产器型号(APP产品,为APP包名) 
     * @return ProductModel 产器型号(APP产品,为APP包名)
     */
    public String getProductModel() {
        return this.ProductModel;
    }

    /**
     * Set 产器型号(APP产品,为APP包名)
     * @param ProductModel 产器型号(APP产品,为APP包名)
     */
    public void setProductModel(String ProductModel) {
        this.ProductModel = ProductModel;
    }

    /**
     * Get 开始时间 ，UNIX 时间戳，单位秒 
     * @return StartTime 开始时间 ，UNIX 时间戳，单位秒
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间 ，UNIX 时间戳，单位秒
     * @param StartTime 开始时间 ，UNIX 时间戳，单位秒
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 ，UNIX 时间戳，单位秒 
     * @return EndTime 结束时间 ，UNIX 时间戳，单位秒
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间 ，UNIX 时间戳，单位秒
     * @param EndTime 结束时间 ，UNIX 时间戳，单位秒
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "ProductModel", this.ProductModel);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

