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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneResource extends AbstractModel {

    /**
    * 主可用区，如"ap-guangzhou-1"。
    */
    @SerializedName("MasterZone")
    @Expose
    private String MasterZone;

    /**
    * 资源列表。
    */
    @SerializedName("ResourceSet")
    @Expose
    private Resource [] ResourceSet;

    /**
    * 备可用区，如"ap-guangzhou-2"，单可用区时，备可用区为null。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SlaveZone")
    @Expose
    private String SlaveZone;

    /**
    * IP版本，如IPv4，IPv6，IPv6_Nat。
    */
    @SerializedName("IPVersion")
    @Expose
    private String IPVersion;

    /**
    * 可用区所属地域，如：ap-guangzhou
    */
    @SerializedName("ZoneRegion")
    @Expose
    private String ZoneRegion;

    /**
    * 可用区是否是LocalZone可用区，如：false
    */
    @SerializedName("LocalZone")
    @Expose
    private Boolean LocalZone;

    /**
    * 可用区资源的类型，SHARED表示共享资源，EXCLUSIVE表示独占资源。
    */
    @SerializedName("ZoneResourceType")
    @Expose
    private String ZoneResourceType;

    /**
    * 可用区是否是EdgeZone可用区，如：false
    */
    @SerializedName("EdgeZone")
    @Expose
    private Boolean EdgeZone;

    /**
    * 网络出口
    */
    @SerializedName("Egress")
    @Expose
    private String Egress;

    /**
     * Get 主可用区，如"ap-guangzhou-1"。 
     * @return MasterZone 主可用区，如"ap-guangzhou-1"。
     */
    public String getMasterZone() {
        return this.MasterZone;
    }

    /**
     * Set 主可用区，如"ap-guangzhou-1"。
     * @param MasterZone 主可用区，如"ap-guangzhou-1"。
     */
    public void setMasterZone(String MasterZone) {
        this.MasterZone = MasterZone;
    }

    /**
     * Get 资源列表。 
     * @return ResourceSet 资源列表。
     */
    public Resource [] getResourceSet() {
        return this.ResourceSet;
    }

    /**
     * Set 资源列表。
     * @param ResourceSet 资源列表。
     */
    public void setResourceSet(Resource [] ResourceSet) {
        this.ResourceSet = ResourceSet;
    }

    /**
     * Get 备可用区，如"ap-guangzhou-2"，单可用区时，备可用区为null。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SlaveZone 备可用区，如"ap-guangzhou-2"，单可用区时，备可用区为null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSlaveZone() {
        return this.SlaveZone;
    }

    /**
     * Set 备可用区，如"ap-guangzhou-2"，单可用区时，备可用区为null。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SlaveZone 备可用区，如"ap-guangzhou-2"，单可用区时，备可用区为null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSlaveZone(String SlaveZone) {
        this.SlaveZone = SlaveZone;
    }

    /**
     * Get IP版本，如IPv4，IPv6，IPv6_Nat。 
     * @return IPVersion IP版本，如IPv4，IPv6，IPv6_Nat。
     */
    public String getIPVersion() {
        return this.IPVersion;
    }

    /**
     * Set IP版本，如IPv4，IPv6，IPv6_Nat。
     * @param IPVersion IP版本，如IPv4，IPv6，IPv6_Nat。
     */
    public void setIPVersion(String IPVersion) {
        this.IPVersion = IPVersion;
    }

    /**
     * Get 可用区所属地域，如：ap-guangzhou 
     * @return ZoneRegion 可用区所属地域，如：ap-guangzhou
     */
    public String getZoneRegion() {
        return this.ZoneRegion;
    }

    /**
     * Set 可用区所属地域，如：ap-guangzhou
     * @param ZoneRegion 可用区所属地域，如：ap-guangzhou
     */
    public void setZoneRegion(String ZoneRegion) {
        this.ZoneRegion = ZoneRegion;
    }

    /**
     * Get 可用区是否是LocalZone可用区，如：false 
     * @return LocalZone 可用区是否是LocalZone可用区，如：false
     */
    public Boolean getLocalZone() {
        return this.LocalZone;
    }

    /**
     * Set 可用区是否是LocalZone可用区，如：false
     * @param LocalZone 可用区是否是LocalZone可用区，如：false
     */
    public void setLocalZone(Boolean LocalZone) {
        this.LocalZone = LocalZone;
    }

    /**
     * Get 可用区资源的类型，SHARED表示共享资源，EXCLUSIVE表示独占资源。 
     * @return ZoneResourceType 可用区资源的类型，SHARED表示共享资源，EXCLUSIVE表示独占资源。
     */
    public String getZoneResourceType() {
        return this.ZoneResourceType;
    }

    /**
     * Set 可用区资源的类型，SHARED表示共享资源，EXCLUSIVE表示独占资源。
     * @param ZoneResourceType 可用区资源的类型，SHARED表示共享资源，EXCLUSIVE表示独占资源。
     */
    public void setZoneResourceType(String ZoneResourceType) {
        this.ZoneResourceType = ZoneResourceType;
    }

    /**
     * Get 可用区是否是EdgeZone可用区，如：false 
     * @return EdgeZone 可用区是否是EdgeZone可用区，如：false
     */
    public Boolean getEdgeZone() {
        return this.EdgeZone;
    }

    /**
     * Set 可用区是否是EdgeZone可用区，如：false
     * @param EdgeZone 可用区是否是EdgeZone可用区，如：false
     */
    public void setEdgeZone(Boolean EdgeZone) {
        this.EdgeZone = EdgeZone;
    }

    /**
     * Get 网络出口 
     * @return Egress 网络出口
     */
    public String getEgress() {
        return this.Egress;
    }

    /**
     * Set 网络出口
     * @param Egress 网络出口
     */
    public void setEgress(String Egress) {
        this.Egress = Egress;
    }

    public ZoneResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneResource(ZoneResource source) {
        if (source.MasterZone != null) {
            this.MasterZone = new String(source.MasterZone);
        }
        if (source.ResourceSet != null) {
            this.ResourceSet = new Resource[source.ResourceSet.length];
            for (int i = 0; i < source.ResourceSet.length; i++) {
                this.ResourceSet[i] = new Resource(source.ResourceSet[i]);
            }
        }
        if (source.SlaveZone != null) {
            this.SlaveZone = new String(source.SlaveZone);
        }
        if (source.IPVersion != null) {
            this.IPVersion = new String(source.IPVersion);
        }
        if (source.ZoneRegion != null) {
            this.ZoneRegion = new String(source.ZoneRegion);
        }
        if (source.LocalZone != null) {
            this.LocalZone = new Boolean(source.LocalZone);
        }
        if (source.ZoneResourceType != null) {
            this.ZoneResourceType = new String(source.ZoneResourceType);
        }
        if (source.EdgeZone != null) {
            this.EdgeZone = new Boolean(source.EdgeZone);
        }
        if (source.Egress != null) {
            this.Egress = new String(source.Egress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MasterZone", this.MasterZone);
        this.setParamArrayObj(map, prefix + "ResourceSet.", this.ResourceSet);
        this.setParamSimple(map, prefix + "SlaveZone", this.SlaveZone);
        this.setParamSimple(map, prefix + "IPVersion", this.IPVersion);
        this.setParamSimple(map, prefix + "ZoneRegion", this.ZoneRegion);
        this.setParamSimple(map, prefix + "LocalZone", this.LocalZone);
        this.setParamSimple(map, prefix + "ZoneResourceType", this.ZoneResourceType);
        this.setParamSimple(map, prefix + "EdgeZone", this.EdgeZone);
        this.setParamSimple(map, prefix + "Egress", this.Egress);

    }
}

