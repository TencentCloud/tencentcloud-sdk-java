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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomLineInfo extends AbstractModel {

    /**
    * 域名ID
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
    * 自定义线路名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 自定义线路IP段
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 已使用IP段个数
    */
    @SerializedName("UseCount")
    @Expose
    private Long UseCount;

    /**
    * 允许使用IP段最大个数
    */
    @SerializedName("MaxCount")
    @Expose
    private Long MaxCount;

    /**
     * Get 域名ID 
     * @return DomainId 域名ID
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 域名ID
     * @param DomainId 域名ID
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get 自定义线路名称 
     * @return Name 自定义线路名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 自定义线路名称
     * @param Name 自定义线路名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 自定义线路IP段 
     * @return Area 自定义线路IP段
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 自定义线路IP段
     * @param Area 自定义线路IP段
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 已使用IP段个数 
     * @return UseCount 已使用IP段个数
     */
    public Long getUseCount() {
        return this.UseCount;
    }

    /**
     * Set 已使用IP段个数
     * @param UseCount 已使用IP段个数
     */
    public void setUseCount(Long UseCount) {
        this.UseCount = UseCount;
    }

    /**
     * Get 允许使用IP段最大个数 
     * @return MaxCount 允许使用IP段最大个数
     */
    public Long getMaxCount() {
        return this.MaxCount;
    }

    /**
     * Set 允许使用IP段最大个数
     * @param MaxCount 允许使用IP段最大个数
     */
    public void setMaxCount(Long MaxCount) {
        this.MaxCount = MaxCount;
    }

    public CustomLineInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomLineInfo(CustomLineInfo source) {
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.UseCount != null) {
            this.UseCount = new Long(source.UseCount);
        }
        if (source.MaxCount != null) {
            this.MaxCount = new Long(source.MaxCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "UseCount", this.UseCount);
        this.setParamSimple(map, prefix + "MaxCount", this.MaxCount);

    }
}

