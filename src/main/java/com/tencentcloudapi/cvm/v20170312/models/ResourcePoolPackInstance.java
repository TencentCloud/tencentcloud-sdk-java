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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourcePoolPackInstance extends AbstractModel {

    /**
    * 实例资源池ID。形如：rpp-fb7bzcyt。
    */
    @SerializedName("DedicatedResourcePackId")
    @Expose
    private String DedicatedResourcePackId;

    /**
    * 实例资源池内的实例ID列表。形如：["ins-5u8lxsum"]。
    */
    @SerializedName("InstanceIdSet")
    @Expose
    private String [] InstanceIdSet;

    /**
    * 实例族。形如：SA9。
    */
    @SerializedName("InstanceFamily")
    @Expose
    private String InstanceFamily;

    /**
    * 实例规格。形如：SA9.96XLARGE1152。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 可用区。形如：ap-guangzhou-6。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
     * Get 实例资源池ID。形如：rpp-fb7bzcyt。 
     * @return DedicatedResourcePackId 实例资源池ID。形如：rpp-fb7bzcyt。
     */
    public String getDedicatedResourcePackId() {
        return this.DedicatedResourcePackId;
    }

    /**
     * Set 实例资源池ID。形如：rpp-fb7bzcyt。
     * @param DedicatedResourcePackId 实例资源池ID。形如：rpp-fb7bzcyt。
     */
    public void setDedicatedResourcePackId(String DedicatedResourcePackId) {
        this.DedicatedResourcePackId = DedicatedResourcePackId;
    }

    /**
     * Get 实例资源池内的实例ID列表。形如：["ins-5u8lxsum"]。 
     * @return InstanceIdSet 实例资源池内的实例ID列表。形如：["ins-5u8lxsum"]。
     */
    public String [] getInstanceIdSet() {
        return this.InstanceIdSet;
    }

    /**
     * Set 实例资源池内的实例ID列表。形如：["ins-5u8lxsum"]。
     * @param InstanceIdSet 实例资源池内的实例ID列表。形如：["ins-5u8lxsum"]。
     */
    public void setInstanceIdSet(String [] InstanceIdSet) {
        this.InstanceIdSet = InstanceIdSet;
    }

    /**
     * Get 实例族。形如：SA9。 
     * @return InstanceFamily 实例族。形如：SA9。
     */
    public String getInstanceFamily() {
        return this.InstanceFamily;
    }

    /**
     * Set 实例族。形如：SA9。
     * @param InstanceFamily 实例族。形如：SA9。
     */
    public void setInstanceFamily(String InstanceFamily) {
        this.InstanceFamily = InstanceFamily;
    }

    /**
     * Get 实例规格。形如：SA9.96XLARGE1152。 
     * @return InstanceType 实例规格。形如：SA9.96XLARGE1152。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例规格。形如：SA9.96XLARGE1152。
     * @param InstanceType 实例规格。形如：SA9.96XLARGE1152。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 可用区。形如：ap-guangzhou-6。 
     * @return Zone 可用区。形如：ap-guangzhou-6。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区。形如：ap-guangzhou-6。
     * @param Zone 可用区。形如：ap-guangzhou-6。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    public ResourcePoolPackInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourcePoolPackInstance(ResourcePoolPackInstance source) {
        if (source.DedicatedResourcePackId != null) {
            this.DedicatedResourcePackId = new String(source.DedicatedResourcePackId);
        }
        if (source.InstanceIdSet != null) {
            this.InstanceIdSet = new String[source.InstanceIdSet.length];
            for (int i = 0; i < source.InstanceIdSet.length; i++) {
                this.InstanceIdSet[i] = new String(source.InstanceIdSet[i]);
            }
        }
        if (source.InstanceFamily != null) {
            this.InstanceFamily = new String(source.InstanceFamily);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DedicatedResourcePackId", this.DedicatedResourcePackId);
        this.setParamArraySimple(map, prefix + "InstanceIdSet.", this.InstanceIdSet);
        this.setParamSimple(map, prefix + "InstanceFamily", this.InstanceFamily);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}

