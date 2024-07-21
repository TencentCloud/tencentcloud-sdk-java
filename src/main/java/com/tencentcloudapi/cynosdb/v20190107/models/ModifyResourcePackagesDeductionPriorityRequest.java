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

public class ModifyResourcePackagesDeductionPriorityRequest extends AbstractModel {

    /**
    * 需要修改优先级的资源包类型，CCU：计算资源包，DISK：存储资源包
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * 修改后的抵扣优先级对于哪个cynos资源生效
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 资源包抵扣优先级
    */
    @SerializedName("DeductionPriorities")
    @Expose
    private PackagePriority [] DeductionPriorities;

    /**
     * Get 需要修改优先级的资源包类型，CCU：计算资源包，DISK：存储资源包 
     * @return PackageType 需要修改优先级的资源包类型，CCU：计算资源包，DISK：存储资源包
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set 需要修改优先级的资源包类型，CCU：计算资源包，DISK：存储资源包
     * @param PackageType 需要修改优先级的资源包类型，CCU：计算资源包，DISK：存储资源包
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get 修改后的抵扣优先级对于哪个cynos资源生效 
     * @return ClusterId 修改后的抵扣优先级对于哪个cynos资源生效
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 修改后的抵扣优先级对于哪个cynos资源生效
     * @param ClusterId 修改后的抵扣优先级对于哪个cynos资源生效
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 资源包抵扣优先级 
     * @return DeductionPriorities 资源包抵扣优先级
     */
    public PackagePriority [] getDeductionPriorities() {
        return this.DeductionPriorities;
    }

    /**
     * Set 资源包抵扣优先级
     * @param DeductionPriorities 资源包抵扣优先级
     */
    public void setDeductionPriorities(PackagePriority [] DeductionPriorities) {
        this.DeductionPriorities = DeductionPriorities;
    }

    public ModifyResourcePackagesDeductionPriorityRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyResourcePackagesDeductionPriorityRequest(ModifyResourcePackagesDeductionPriorityRequest source) {
        if (source.PackageType != null) {
            this.PackageType = new String(source.PackageType);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.DeductionPriorities != null) {
            this.DeductionPriorities = new PackagePriority[source.DeductionPriorities.length];
            for (int i = 0; i < source.DeductionPriorities.length; i++) {
                this.DeductionPriorities[i] = new PackagePriority(source.DeductionPriorities[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "DeductionPriorities.", this.DeductionPriorities);

    }
}

