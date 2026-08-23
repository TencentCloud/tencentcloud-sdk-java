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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TcrRegistry extends AbstractModel {

    /**
    * <p>仓库实例id</p>
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * <p>仓库名</p>
    */
    @SerializedName("RegistryName")
    @Expose
    private String RegistryName;

    /**
    * <p>仓库域名</p>
    */
    @SerializedName("PublicDomain")
    @Expose
    private String PublicDomain;

    /**
    * <p>仓库所在region</p>
    */
    @SerializedName("RegistryRegion")
    @Expose
    private String RegistryRegion;

    /**
    * <p>仓库id</p>
    */
    @SerializedName("RegistryRegionId")
    @Expose
    private Long RegistryRegionId;

    /**
     * Get <p>仓库实例id</p> 
     * @return RegistryId <p>仓库实例id</p>
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set <p>仓库实例id</p>
     * @param RegistryId <p>仓库实例id</p>
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get <p>仓库名</p> 
     * @return RegistryName <p>仓库名</p>
     */
    public String getRegistryName() {
        return this.RegistryName;
    }

    /**
     * Set <p>仓库名</p>
     * @param RegistryName <p>仓库名</p>
     */
    public void setRegistryName(String RegistryName) {
        this.RegistryName = RegistryName;
    }

    /**
     * Get <p>仓库域名</p> 
     * @return PublicDomain <p>仓库域名</p>
     */
    public String getPublicDomain() {
        return this.PublicDomain;
    }

    /**
     * Set <p>仓库域名</p>
     * @param PublicDomain <p>仓库域名</p>
     */
    public void setPublicDomain(String PublicDomain) {
        this.PublicDomain = PublicDomain;
    }

    /**
     * Get <p>仓库所在region</p> 
     * @return RegistryRegion <p>仓库所在region</p>
     */
    public String getRegistryRegion() {
        return this.RegistryRegion;
    }

    /**
     * Set <p>仓库所在region</p>
     * @param RegistryRegion <p>仓库所在region</p>
     */
    public void setRegistryRegion(String RegistryRegion) {
        this.RegistryRegion = RegistryRegion;
    }

    /**
     * Get <p>仓库id</p> 
     * @return RegistryRegionId <p>仓库id</p>
     */
    public Long getRegistryRegionId() {
        return this.RegistryRegionId;
    }

    /**
     * Set <p>仓库id</p>
     * @param RegistryRegionId <p>仓库id</p>
     */
    public void setRegistryRegionId(Long RegistryRegionId) {
        this.RegistryRegionId = RegistryRegionId;
    }

    public TcrRegistry() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TcrRegistry(TcrRegistry source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.RegistryName != null) {
            this.RegistryName = new String(source.RegistryName);
        }
        if (source.PublicDomain != null) {
            this.PublicDomain = new String(source.PublicDomain);
        }
        if (source.RegistryRegion != null) {
            this.RegistryRegion = new String(source.RegistryRegion);
        }
        if (source.RegistryRegionId != null) {
            this.RegistryRegionId = new Long(source.RegistryRegionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "RegistryName", this.RegistryName);
        this.setParamSimple(map, prefix + "PublicDomain", this.PublicDomain);
        this.setParamSimple(map, prefix + "RegistryRegion", this.RegistryRegion);
        this.setParamSimple(map, prefix + "RegistryRegionId", this.RegistryRegionId);

    }
}

