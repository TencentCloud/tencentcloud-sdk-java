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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainAreaConfig extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 地区列表，其中元素可为mainland/overseas
    */
    @SerializedName("Area")
    @Expose
    private String [] Area;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 地区列表，其中元素可为mainland/overseas 
     * @return Area 地区列表，其中元素可为mainland/overseas
     */
    public String [] getArea() {
        return this.Area;
    }

    /**
     * Set 地区列表，其中元素可为mainland/overseas
     * @param Area 地区列表，其中元素可为mainland/overseas
     */
    public void setArea(String [] Area) {
        this.Area = Area;
    }

    public DomainAreaConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainAreaConfig(DomainAreaConfig source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Area != null) {
            this.Area = new String[source.Area.length];
            for (int i = 0; i < source.Area.length; i++) {
                this.Area[i] = new String(source.Area[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArraySimple(map, prefix + "Area.", this.Area);

    }
}

