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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PlanInfo extends AbstractModel {

    /**
    * <p>套餐标识</p>
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * <p>套餐中文名称</p>
    */
    @SerializedName("PackageTitle")
    @Expose
    private String PackageTitle;

    /**
    * <p>套餐描述</p>
    */
    @SerializedName("PackageDescription")
    @Expose
    private String PackageDescription;

    /**
    * <p>单位原价</p>
    */
    @SerializedName("UnitPrice")
    @Expose
    private String UnitPrice;

    /**
    * <p>套餐类型</p>
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * <p>json格式化用户资源限制</p>
    */
    @SerializedName("ResourceLimit")
    @Expose
    private String ResourceLimit;

    /**
     * Get <p>套餐标识</p> 
     * @return PackageId <p>套餐标识</p>
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * Set <p>套餐标识</p>
     * @param PackageId <p>套餐标识</p>
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get <p>套餐中文名称</p> 
     * @return PackageTitle <p>套餐中文名称</p>
     */
    public String getPackageTitle() {
        return this.PackageTitle;
    }

    /**
     * Set <p>套餐中文名称</p>
     * @param PackageTitle <p>套餐中文名称</p>
     */
    public void setPackageTitle(String PackageTitle) {
        this.PackageTitle = PackageTitle;
    }

    /**
     * Get <p>套餐描述</p> 
     * @return PackageDescription <p>套餐描述</p>
     */
    public String getPackageDescription() {
        return this.PackageDescription;
    }

    /**
     * Set <p>套餐描述</p>
     * @param PackageDescription <p>套餐描述</p>
     */
    public void setPackageDescription(String PackageDescription) {
        this.PackageDescription = PackageDescription;
    }

    /**
     * Get <p>单位原价</p> 
     * @return UnitPrice <p>单位原价</p>
     */
    public String getUnitPrice() {
        return this.UnitPrice;
    }

    /**
     * Set <p>单位原价</p>
     * @param UnitPrice <p>单位原价</p>
     */
    public void setUnitPrice(String UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * Get <p>套餐类型</p> 
     * @return PackageType <p>套餐类型</p>
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set <p>套餐类型</p>
     * @param PackageType <p>套餐类型</p>
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get <p>json格式化用户资源限制</p> 
     * @return ResourceLimit <p>json格式化用户资源限制</p>
     */
    public String getResourceLimit() {
        return this.ResourceLimit;
    }

    /**
     * Set <p>json格式化用户资源限制</p>
     * @param ResourceLimit <p>json格式化用户资源限制</p>
     */
    public void setResourceLimit(String ResourceLimit) {
        this.ResourceLimit = ResourceLimit;
    }

    public PlanInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PlanInfo(PlanInfo source) {
        if (source.PackageId != null) {
            this.PackageId = new String(source.PackageId);
        }
        if (source.PackageTitle != null) {
            this.PackageTitle = new String(source.PackageTitle);
        }
        if (source.PackageDescription != null) {
            this.PackageDescription = new String(source.PackageDescription);
        }
        if (source.UnitPrice != null) {
            this.UnitPrice = new String(source.UnitPrice);
        }
        if (source.PackageType != null) {
            this.PackageType = new String(source.PackageType);
        }
        if (source.ResourceLimit != null) {
            this.ResourceLimit = new String(source.ResourceLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamSimple(map, prefix + "PackageTitle", this.PackageTitle);
        this.setParamSimple(map, prefix + "PackageDescription", this.PackageDescription);
        this.setParamSimple(map, prefix + "UnitPrice", this.UnitPrice);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "ResourceLimit", this.ResourceLimit);

    }
}

