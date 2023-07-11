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
package com.tencentcloudapi.tchd.v20230306.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEventsRequest extends AbstractModel{

    /**
    * 事件的发生日期
    */
    @SerializedName("EventDate")
    @Expose
    private String EventDate;

    /**
    * 1. 不指定产品列表时将查询所有产品。
2. 产品ID示例：cvm、lb、cdb、cdn、crs
    */
    @SerializedName("ProductIds")
    @Expose
    private String [] ProductIds;

    /**
    * 1. 不指定地域列表时将查询所有地域。
2. 查询非区域性产品事件时，地域ID指定为：non-regional
3. 其他地域ID取值请参考：https://cloud.tencent.com/document/api/213/15692
    */
    @SerializedName("RegionIds")
    @Expose
    private String [] RegionIds;

    /**
     * Get 事件的发生日期 
     * @return EventDate 事件的发生日期
     */
    public String getEventDate() {
        return this.EventDate;
    }

    /**
     * Set 事件的发生日期
     * @param EventDate 事件的发生日期
     */
    public void setEventDate(String EventDate) {
        this.EventDate = EventDate;
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

    /**
     * Get 1. 不指定地域列表时将查询所有地域。
2. 查询非区域性产品事件时，地域ID指定为：non-regional
3. 其他地域ID取值请参考：https://cloud.tencent.com/document/api/213/15692 
     * @return RegionIds 1. 不指定地域列表时将查询所有地域。
2. 查询非区域性产品事件时，地域ID指定为：non-regional
3. 其他地域ID取值请参考：https://cloud.tencent.com/document/api/213/15692
     */
    public String [] getRegionIds() {
        return this.RegionIds;
    }

    /**
     * Set 1. 不指定地域列表时将查询所有地域。
2. 查询非区域性产品事件时，地域ID指定为：non-regional
3. 其他地域ID取值请参考：https://cloud.tencent.com/document/api/213/15692
     * @param RegionIds 1. 不指定地域列表时将查询所有地域。
2. 查询非区域性产品事件时，地域ID指定为：non-regional
3. 其他地域ID取值请参考：https://cloud.tencent.com/document/api/213/15692
     */
    public void setRegionIds(String [] RegionIds) {
        this.RegionIds = RegionIds;
    }

    public DescribeEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEventsRequest(DescribeEventsRequest source) {
        if (source.EventDate != null) {
            this.EventDate = new String(source.EventDate);
        }
        if (source.ProductIds != null) {
            this.ProductIds = new String[source.ProductIds.length];
            for (int i = 0; i < source.ProductIds.length; i++) {
                this.ProductIds[i] = new String(source.ProductIds[i]);
            }
        }
        if (source.RegionIds != null) {
            this.RegionIds = new String[source.RegionIds.length];
            for (int i = 0; i < source.RegionIds.length; i++) {
                this.RegionIds[i] = new String(source.RegionIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventDate", this.EventDate);
        this.setParamArraySimple(map, prefix + "ProductIds.", this.ProductIds);
        this.setParamArraySimple(map, prefix + "RegionIds.", this.RegionIds);

    }
}

