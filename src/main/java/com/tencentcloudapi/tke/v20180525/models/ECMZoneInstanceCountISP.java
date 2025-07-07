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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ECMZoneInstanceCountISP extends AbstractModel {

    /**
    * 创建实例的可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 在当前可用区欲创建的实例数目
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * 运营商
    */
    @SerializedName("ISP")
    @Expose
    private String ISP;

    /**
     * Get 创建实例的可用区 
     * @return Zone 创建实例的可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 创建实例的可用区
     * @param Zone 创建实例的可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 在当前可用区欲创建的实例数目 
     * @return InstanceCount 在当前可用区欲创建的实例数目
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set 在当前可用区欲创建的实例数目
     * @param InstanceCount 在当前可用区欲创建的实例数目
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get 运营商 
     * @return ISP 运营商
     */
    public String getISP() {
        return this.ISP;
    }

    /**
     * Set 运营商
     * @param ISP 运营商
     */
    public void setISP(String ISP) {
        this.ISP = ISP;
    }

    public ECMZoneInstanceCountISP() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ECMZoneInstanceCountISP(ECMZoneInstanceCountISP source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.ISP != null) {
            this.ISP = new String(source.ISP);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "ISP", this.ISP);

    }
}

