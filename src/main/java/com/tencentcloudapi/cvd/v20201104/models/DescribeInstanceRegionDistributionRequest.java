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
package com.tencentcloudapi.cvd.v20201104.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceRegionDistributionRequest extends AbstractModel {

    /**
    * <p>查询区域列表</p>
    */
    @SerializedName("Regions")
    @Expose
    private String [] Regions;

    /**
    * <p>查询实例类型列表</p>
    */
    @SerializedName("Types")
    @Expose
    private String [] Types;

    /**
    * <p>查询用户拥有的云桌面地域分布信息</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
     * Get <p>查询区域列表</p> 
     * @return Regions <p>查询区域列表</p>
     */
    public String [] getRegions() {
        return this.Regions;
    }

    /**
     * Set <p>查询区域列表</p>
     * @param Regions <p>查询区域列表</p>
     */
    public void setRegions(String [] Regions) {
        this.Regions = Regions;
    }

    /**
     * Get <p>查询实例类型列表</p> 
     * @return Types <p>查询实例类型列表</p>
     */
    public String [] getTypes() {
        return this.Types;
    }

    /**
     * Set <p>查询实例类型列表</p>
     * @param Types <p>查询实例类型列表</p>
     */
    public void setTypes(String [] Types) {
        this.Types = Types;
    }

    /**
     * Get <p>查询用户拥有的云桌面地域分布信息</p> 
     * @return UserId <p>查询用户拥有的云桌面地域分布信息</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>查询用户拥有的云桌面地域分布信息</p>
     * @param UserId <p>查询用户拥有的云桌面地域分布信息</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public DescribeInstanceRegionDistributionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceRegionDistributionRequest(DescribeInstanceRegionDistributionRequest source) {
        if (source.Regions != null) {
            this.Regions = new String[source.Regions.length];
            for (int i = 0; i < source.Regions.length; i++) {
                this.Regions[i] = new String(source.Regions[i]);
            }
        }
        if (source.Types != null) {
            this.Types = new String[source.Types.length];
            for (int i = 0; i < source.Types.length; i++) {
                this.Types[i] = new String(source.Types[i]);
            }
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Regions.", this.Regions);
        this.setParamArraySimple(map, prefix + "Types.", this.Types);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

