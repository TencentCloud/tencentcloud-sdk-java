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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PackingQuotaGroup extends AbstractModel{

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 可用区id
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * ISP id
    */
    @SerializedName("ISPId")
    @Expose
    private String ISPId;

    /**
    * 一组相互关联的装箱配额
    */
    @SerializedName("PackingQuotaInfos")
    @Expose
    private PackingQuotaInfo [] PackingQuotaInfos;

    /**
     * Get 可用区 
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 可用区id 
     * @return ZoneId 可用区id
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 可用区id
     * @param ZoneId 可用区id
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get ISP id 
     * @return ISPId ISP id
     */
    public String getISPId() {
        return this.ISPId;
    }

    /**
     * Set ISP id
     * @param ISPId ISP id
     */
    public void setISPId(String ISPId) {
        this.ISPId = ISPId;
    }

    /**
     * Get 一组相互关联的装箱配额 
     * @return PackingQuotaInfos 一组相互关联的装箱配额
     */
    public PackingQuotaInfo [] getPackingQuotaInfos() {
        return this.PackingQuotaInfos;
    }

    /**
     * Set 一组相互关联的装箱配额
     * @param PackingQuotaInfos 一组相互关联的装箱配额
     */
    public void setPackingQuotaInfos(PackingQuotaInfo [] PackingQuotaInfos) {
        this.PackingQuotaInfos = PackingQuotaInfos;
    }

    public PackingQuotaGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PackingQuotaGroup(PackingQuotaGroup source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.ISPId != null) {
            this.ISPId = new String(source.ISPId);
        }
        if (source.PackingQuotaInfos != null) {
            this.PackingQuotaInfos = new PackingQuotaInfo[source.PackingQuotaInfos.length];
            for (int i = 0; i < source.PackingQuotaInfos.length; i++) {
                this.PackingQuotaInfos[i] = new PackingQuotaInfo(source.PackingQuotaInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ISPId", this.ISPId);
        this.setParamArrayObj(map, prefix + "PackingQuotaInfos.", this.PackingQuotaInfos);

    }
}

