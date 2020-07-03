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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccessRegionsByDestRegionRequest extends AbstractModel{

    /**
    * 源站区域：接口DescribeDestRegions返回DestRegionSet中的RegionId字段值
    */
    @SerializedName("DestRegion")
    @Expose
    private String DestRegion;

    /**
     * Get 源站区域：接口DescribeDestRegions返回DestRegionSet中的RegionId字段值 
     * @return DestRegion 源站区域：接口DescribeDestRegions返回DestRegionSet中的RegionId字段值
     */
    public String getDestRegion() {
        return this.DestRegion;
    }

    /**
     * Set 源站区域：接口DescribeDestRegions返回DestRegionSet中的RegionId字段值
     * @param DestRegion 源站区域：接口DescribeDestRegions返回DestRegionSet中的RegionId字段值
     */
    public void setDestRegion(String DestRegion) {
        this.DestRegion = DestRegion;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DestRegion", this.DestRegion);

    }
}

