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
package com.tencentcloudapi.tchd.v20230306.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEventStatisticsRequest extends AbstractModel {

    /**
    * 1. 查询非区域性产品事件时，地域ID指定为：non-regional
2. 其他地域ID取值请参考：https://cloud.tencent.com/document/api/213/15692
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * 1. 不指定产品列表时将查询所有产品。
2. 产品ID示例：cvm、lb、cdb、cdn、crs
    */
    @SerializedName("ProductIds")
    @Expose
    private String [] ProductIds;

    /**
     * Get 1. 查询非区域性产品事件时，地域ID指定为：non-regional
2. 其他地域ID取值请参考：https://cloud.tencent.com/document/api/213/15692 
     * @return RegionId 1. 查询非区域性产品事件时，地域ID指定为：non-regional
2. 其他地域ID取值请参考：https://cloud.tencent.com/document/api/213/15692
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 1. 查询非区域性产品事件时，地域ID指定为：non-regional
2. 其他地域ID取值请参考：https://cloud.tencent.com/document/api/213/15692
     * @param RegionId 1. 查询非区域性产品事件时，地域ID指定为：non-regional
2. 其他地域ID取值请参考：https://cloud.tencent.com/document/api/213/15692
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 1. 不指定产品列表时将查询所有产品。
2. 产品ID示例：cvm、lb、cdb、cdn、crs 
     * @return ProductIds 1. 不指定产品列表时将查询所有产品。
2. 产品ID示例：cvm、lb、cdb、cdn、crs
     */
    public String [] getProductIds() {
        return this.ProductIds;
    }

    /**
     * Set 1. 不指定产品列表时将查询所有产品。
2. 产品ID示例：cvm、lb、cdb、cdn、crs
     * @param ProductIds 1. 不指定产品列表时将查询所有产品。
2. 产品ID示例：cvm、lb、cdb、cdn、crs
     */
    public void setProductIds(String [] ProductIds) {
        this.ProductIds = ProductIds;
    }

    public DescribeEventStatisticsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEventStatisticsRequest(DescribeEventStatisticsRequest source) {
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.ProductIds != null) {
            this.ProductIds = new String[source.ProductIds.length];
            for (int i = 0; i < source.ProductIds.length; i++) {
                this.ProductIds[i] = new String(source.ProductIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamArraySimple(map, prefix + "ProductIds.", this.ProductIds);

    }
}

