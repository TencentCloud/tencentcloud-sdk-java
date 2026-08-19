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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessPointInfo extends AbstractModel {

    /**
    * <p>接入点运营商。</p>
    */
    @SerializedName("Vendor")
    @Expose
    private String Vendor;

    /**
    * <p>接入点地址。</p>
    */
    @SerializedName("PublicAddr")
    @Expose
    private String PublicAddr;

    /**
    * <p>接入点地域。</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>接入点大区。</p>
    */
    @SerializedName("BigArea")
    @Expose
    private String BigArea;

    /**
    * <p>接入点是否可用。</p><p>枚举值：</p><ul><li>true： 接入点可用</li><li>false： 接入点不可用</li></ul>
    */
    @SerializedName("Available")
    @Expose
    private Boolean Available;

    /**
    * <p>集群ID</p>
    */
    @SerializedName("GwGroupId")
    @Expose
    private String GwGroupId;

    /**
     * Get <p>接入点运营商。</p> 
     * @return Vendor <p>接入点运营商。</p>
     */
    public String getVendor() {
        return this.Vendor;
    }

    /**
     * Set <p>接入点运营商。</p>
     * @param Vendor <p>接入点运营商。</p>
     */
    public void setVendor(String Vendor) {
        this.Vendor = Vendor;
    }

    /**
     * Get <p>接入点地址。</p> 
     * @return PublicAddr <p>接入点地址。</p>
     */
    public String getPublicAddr() {
        return this.PublicAddr;
    }

    /**
     * Set <p>接入点地址。</p>
     * @param PublicAddr <p>接入点地址。</p>
     */
    public void setPublicAddr(String PublicAddr) {
        this.PublicAddr = PublicAddr;
    }

    /**
     * Get <p>接入点地域。</p> 
     * @return Region <p>接入点地域。</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>接入点地域。</p>
     * @param Region <p>接入点地域。</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>接入点大区。</p> 
     * @return BigArea <p>接入点大区。</p>
     */
    public String getBigArea() {
        return this.BigArea;
    }

    /**
     * Set <p>接入点大区。</p>
     * @param BigArea <p>接入点大区。</p>
     */
    public void setBigArea(String BigArea) {
        this.BigArea = BigArea;
    }

    /**
     * Get <p>接入点是否可用。</p><p>枚举值：</p><ul><li>true： 接入点可用</li><li>false： 接入点不可用</li></ul> 
     * @return Available <p>接入点是否可用。</p><p>枚举值：</p><ul><li>true： 接入点可用</li><li>false： 接入点不可用</li></ul>
     */
    public Boolean getAvailable() {
        return this.Available;
    }

    /**
     * Set <p>接入点是否可用。</p><p>枚举值：</p><ul><li>true： 接入点可用</li><li>false： 接入点不可用</li></ul>
     * @param Available <p>接入点是否可用。</p><p>枚举值：</p><ul><li>true： 接入点可用</li><li>false： 接入点不可用</li></ul>
     */
    public void setAvailable(Boolean Available) {
        this.Available = Available;
    }

    /**
     * Get <p>集群ID</p> 
     * @return GwGroupId <p>集群ID</p>
     */
    public String getGwGroupId() {
        return this.GwGroupId;
    }

    /**
     * Set <p>集群ID</p>
     * @param GwGroupId <p>集群ID</p>
     */
    public void setGwGroupId(String GwGroupId) {
        this.GwGroupId = GwGroupId;
    }

    public AccessPointInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessPointInfo(AccessPointInfo source) {
        if (source.Vendor != null) {
            this.Vendor = new String(source.Vendor);
        }
        if (source.PublicAddr != null) {
            this.PublicAddr = new String(source.PublicAddr);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.BigArea != null) {
            this.BigArea = new String(source.BigArea);
        }
        if (source.Available != null) {
            this.Available = new Boolean(source.Available);
        }
        if (source.GwGroupId != null) {
            this.GwGroupId = new String(source.GwGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Vendor", this.Vendor);
        this.setParamSimple(map, prefix + "PublicAddr", this.PublicAddr);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "BigArea", this.BigArea);
        this.setParamSimple(map, prefix + "Available", this.Available);
        this.setParamSimple(map, prefix + "GwGroupId", this.GwGroupId);

    }
}

