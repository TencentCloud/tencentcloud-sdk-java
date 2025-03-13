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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourcePackage extends AbstractModel {

    /**
    * 资源包的唯一ID
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * 资源包类型：CCU：计算资源包
DISK：存储资源包
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * 当前资源包绑定在当前实例下的抵扣优先级
    */
    @SerializedName("DeductionPriority")
    @Expose
    private Long DeductionPriority;

    /**
     * Get 资源包的唯一ID 
     * @return PackageId 资源包的唯一ID
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * Set 资源包的唯一ID
     * @param PackageId 资源包的唯一ID
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get 资源包类型：CCU：计算资源包
DISK：存储资源包 
     * @return PackageType 资源包类型：CCU：计算资源包
DISK：存储资源包
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set 资源包类型：CCU：计算资源包
DISK：存储资源包
     * @param PackageType 资源包类型：CCU：计算资源包
DISK：存储资源包
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get 当前资源包绑定在当前实例下的抵扣优先级 
     * @return DeductionPriority 当前资源包绑定在当前实例下的抵扣优先级
     */
    public Long getDeductionPriority() {
        return this.DeductionPriority;
    }

    /**
     * Set 当前资源包绑定在当前实例下的抵扣优先级
     * @param DeductionPriority 当前资源包绑定在当前实例下的抵扣优先级
     */
    public void setDeductionPriority(Long DeductionPriority) {
        this.DeductionPriority = DeductionPriority;
    }

    public ResourcePackage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourcePackage(ResourcePackage source) {
        if (source.PackageId != null) {
            this.PackageId = new String(source.PackageId);
        }
        if (source.PackageType != null) {
            this.PackageType = new String(source.PackageType);
        }
        if (source.DeductionPriority != null) {
            this.DeductionPriority = new Long(source.DeductionPriority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "DeductionPriority", this.DeductionPriority);

    }
}

