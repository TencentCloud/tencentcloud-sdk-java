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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InferenceTCRRepositoryConfig extends AbstractModel {

    /**
    * <p>TCR 服务类型。取值有：<li>Personal：个人版；</li><li>Enterprise：企业版。</li></p>
    */
    @SerializedName("TCRType")
    @Expose
    private String TCRType;

    /**
    * <p>镜像地址。</p>
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * <p>镜像仓库实例 ID。当 TCRType = Enterprise 时必填。</p>
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * <p>地域名称。</p>
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
     * Get <p>TCR 服务类型。取值有：<li>Personal：个人版；</li><li>Enterprise：企业版。</li></p> 
     * @return TCRType <p>TCR 服务类型。取值有：<li>Personal：个人版；</li><li>Enterprise：企业版。</li></p>
     */
    public String getTCRType() {
        return this.TCRType;
    }

    /**
     * Set <p>TCR 服务类型。取值有：<li>Personal：个人版；</li><li>Enterprise：企业版。</li></p>
     * @param TCRType <p>TCR 服务类型。取值有：<li>Personal：个人版；</li><li>Enterprise：企业版。</li></p>
     */
    public void setTCRType(String TCRType) {
        this.TCRType = TCRType;
    }

    /**
     * Get <p>镜像地址。</p> 
     * @return Image <p>镜像地址。</p>
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set <p>镜像地址。</p>
     * @param Image <p>镜像地址。</p>
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get <p>镜像仓库实例 ID。当 TCRType = Enterprise 时必填。</p> 
     * @return RegistryId <p>镜像仓库实例 ID。当 TCRType = Enterprise 时必填。</p>
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set <p>镜像仓库实例 ID。当 TCRType = Enterprise 时必填。</p>
     * @param RegistryId <p>镜像仓库实例 ID。当 TCRType = Enterprise 时必填。</p>
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get <p>地域名称。</p> 
     * @return RegionName <p>地域名称。</p>
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set <p>地域名称。</p>
     * @param RegionName <p>地域名称。</p>
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    public InferenceTCRRepositoryConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferenceTCRRepositoryConfig(InferenceTCRRepositoryConfig source) {
        if (source.TCRType != null) {
            this.TCRType = new String(source.TCRType);
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TCRType", this.TCRType);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);

    }
}

