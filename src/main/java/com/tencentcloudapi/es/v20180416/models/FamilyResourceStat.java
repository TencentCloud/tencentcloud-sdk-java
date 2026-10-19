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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FamilyResourceStat extends AbstractModel {

    /**
    * <p>机型族，如 &quot;SA5&quot;</p>
    */
    @SerializedName("InsFamily")
    @Expose
    private String InsFamily;

    /**
    * <p>CVM资源是否有货</p>
    */
    @SerializedName("CvmAvailable")
    @Expose
    private Boolean CvmAvailable;

    /**
    * <p>系统盘资源是否有货</p>
    */
    @SerializedName("SysDiskAvailable")
    @Expose
    private Boolean SysDiskAvailable;

    /**
    * <p>该盘型数据盘资源是否有货</p>
    */
    @SerializedName("DiskAvailable")
    @Expose
    private Boolean DiskAvailable;

    /**
    * <p>三类资源是否全部有货(可直接购买)</p>
    */
    @SerializedName("Purchasable")
    @Expose
    private Boolean Purchasable;

    /**
    * <p>缺少的资源，取值 CVM/SYSDISK/DISK；为空表示不缺</p>
    */
    @SerializedName("MissingResources")
    @Expose
    private String [] MissingResources;

    /**
     * Get <p>机型族，如 &quot;SA5&quot;</p> 
     * @return InsFamily <p>机型族，如 &quot;SA5&quot;</p>
     */
    public String getInsFamily() {
        return this.InsFamily;
    }

    /**
     * Set <p>机型族，如 &quot;SA5&quot;</p>
     * @param InsFamily <p>机型族，如 &quot;SA5&quot;</p>
     */
    public void setInsFamily(String InsFamily) {
        this.InsFamily = InsFamily;
    }

    /**
     * Get <p>CVM资源是否有货</p> 
     * @return CvmAvailable <p>CVM资源是否有货</p>
     */
    public Boolean getCvmAvailable() {
        return this.CvmAvailable;
    }

    /**
     * Set <p>CVM资源是否有货</p>
     * @param CvmAvailable <p>CVM资源是否有货</p>
     */
    public void setCvmAvailable(Boolean CvmAvailable) {
        this.CvmAvailable = CvmAvailable;
    }

    /**
     * Get <p>系统盘资源是否有货</p> 
     * @return SysDiskAvailable <p>系统盘资源是否有货</p>
     */
    public Boolean getSysDiskAvailable() {
        return this.SysDiskAvailable;
    }

    /**
     * Set <p>系统盘资源是否有货</p>
     * @param SysDiskAvailable <p>系统盘资源是否有货</p>
     */
    public void setSysDiskAvailable(Boolean SysDiskAvailable) {
        this.SysDiskAvailable = SysDiskAvailable;
    }

    /**
     * Get <p>该盘型数据盘资源是否有货</p> 
     * @return DiskAvailable <p>该盘型数据盘资源是否有货</p>
     */
    public Boolean getDiskAvailable() {
        return this.DiskAvailable;
    }

    /**
     * Set <p>该盘型数据盘资源是否有货</p>
     * @param DiskAvailable <p>该盘型数据盘资源是否有货</p>
     */
    public void setDiskAvailable(Boolean DiskAvailable) {
        this.DiskAvailable = DiskAvailable;
    }

    /**
     * Get <p>三类资源是否全部有货(可直接购买)</p> 
     * @return Purchasable <p>三类资源是否全部有货(可直接购买)</p>
     */
    public Boolean getPurchasable() {
        return this.Purchasable;
    }

    /**
     * Set <p>三类资源是否全部有货(可直接购买)</p>
     * @param Purchasable <p>三类资源是否全部有货(可直接购买)</p>
     */
    public void setPurchasable(Boolean Purchasable) {
        this.Purchasable = Purchasable;
    }

    /**
     * Get <p>缺少的资源，取值 CVM/SYSDISK/DISK；为空表示不缺</p> 
     * @return MissingResources <p>缺少的资源，取值 CVM/SYSDISK/DISK；为空表示不缺</p>
     */
    public String [] getMissingResources() {
        return this.MissingResources;
    }

    /**
     * Set <p>缺少的资源，取值 CVM/SYSDISK/DISK；为空表示不缺</p>
     * @param MissingResources <p>缺少的资源，取值 CVM/SYSDISK/DISK；为空表示不缺</p>
     */
    public void setMissingResources(String [] MissingResources) {
        this.MissingResources = MissingResources;
    }

    public FamilyResourceStat() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FamilyResourceStat(FamilyResourceStat source) {
        if (source.InsFamily != null) {
            this.InsFamily = new String(source.InsFamily);
        }
        if (source.CvmAvailable != null) {
            this.CvmAvailable = new Boolean(source.CvmAvailable);
        }
        if (source.SysDiskAvailable != null) {
            this.SysDiskAvailable = new Boolean(source.SysDiskAvailable);
        }
        if (source.DiskAvailable != null) {
            this.DiskAvailable = new Boolean(source.DiskAvailable);
        }
        if (source.Purchasable != null) {
            this.Purchasable = new Boolean(source.Purchasable);
        }
        if (source.MissingResources != null) {
            this.MissingResources = new String[source.MissingResources.length];
            for (int i = 0; i < source.MissingResources.length; i++) {
                this.MissingResources[i] = new String(source.MissingResources[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InsFamily", this.InsFamily);
        this.setParamSimple(map, prefix + "CvmAvailable", this.CvmAvailable);
        this.setParamSimple(map, prefix + "SysDiskAvailable", this.SysDiskAvailable);
        this.setParamSimple(map, prefix + "DiskAvailable", this.DiskAvailable);
        this.setParamSimple(map, prefix + "Purchasable", this.Purchasable);
        this.setParamArraySimple(map, prefix + "MissingResources.", this.MissingResources);

    }
}

