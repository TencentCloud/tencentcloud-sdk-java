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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesRequest extends AbstractModel{

    /**
    * 实例ID列表(为空时，
表示获取账号下所有实例)
    */
    @SerializedName("Registryids")
    @Expose
    private String [] Registryids;

    /**
    * 偏移量,默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 最大输出条数，默认20，最大为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤条件
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 获取所有地域的实例，默认为False
    */
    @SerializedName("AllRegion")
    @Expose
    private Boolean AllRegion;

    /**
     * Get 实例ID列表(为空时，
表示获取账号下所有实例) 
     * @return Registryids 实例ID列表(为空时，
表示获取账号下所有实例)
     */
    public String [] getRegistryids() {
        return this.Registryids;
    }

    /**
     * Set 实例ID列表(为空时，
表示获取账号下所有实例)
     * @param Registryids 实例ID列表(为空时，
表示获取账号下所有实例)
     */
    public void setRegistryids(String [] Registryids) {
        this.Registryids = Registryids;
    }

    /**
     * Get 偏移量,默认0 
     * @return Offset 偏移量,默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量,默认0
     * @param Offset 偏移量,默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 最大输出条数，默认20，最大为100 
     * @return Limit 最大输出条数，默认20，最大为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 最大输出条数，默认20，最大为100
     * @param Limit 最大输出条数，默认20，最大为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤条件 
     * @return Filters 过滤条件
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件
     * @param Filters 过滤条件
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 获取所有地域的实例，默认为False 
     * @return AllRegion 获取所有地域的实例，默认为False
     */
    public Boolean getAllRegion() {
        return this.AllRegion;
    }

    /**
     * Set 获取所有地域的实例，默认为False
     * @param AllRegion 获取所有地域的实例，默认为False
     */
    public void setAllRegion(Boolean AllRegion) {
        this.AllRegion = AllRegion;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Registryids.", this.Registryids);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "AllRegion", this.AllRegion);

    }
}

