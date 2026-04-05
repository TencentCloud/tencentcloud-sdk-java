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
package com.tencentcloudapi.ga2.v20250115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AcceleratorRegionSet extends AbstractModel {

    /**
    * <p>地域中文名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>是否可用；0：不可用，1:可用。</p>
    */
    @SerializedName("IsAvailable")
    @Expose
    private Long IsAvailable;

    /**
    * <p>地域信息。</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>地区名称。</p>
    */
    @SerializedName("AreaName")
    @Expose
    private String AreaName;

    /**
    * <p>是否中国地域。</p>
    */
    @SerializedName("IsChinaMainland")
    @Expose
    private Long IsChinaMainland;

    /**
    * <p>支持IspType类型。</p>
    */
    @SerializedName("SupportIspType")
    @Expose
    private String [] SupportIspType;

    /**
    * <p>是否腾讯地域。</p>
    */
    @SerializedName("IsTencentRegion")
    @Expose
    private Long IsTencentRegion;

    /**
     * Get <p>地域中文名称。</p> 
     * @return Name <p>地域中文名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>地域中文名称。</p>
     * @param Name <p>地域中文名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>是否可用；0：不可用，1:可用。</p> 
     * @return IsAvailable <p>是否可用；0：不可用，1:可用。</p>
     */
    public Long getIsAvailable() {
        return this.IsAvailable;
    }

    /**
     * Set <p>是否可用；0：不可用，1:可用。</p>
     * @param IsAvailable <p>是否可用；0：不可用，1:可用。</p>
     */
    public void setIsAvailable(Long IsAvailable) {
        this.IsAvailable = IsAvailable;
    }

    /**
     * Get <p>地域信息。</p> 
     * @return Region <p>地域信息。</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域信息。</p>
     * @param Region <p>地域信息。</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>地区名称。</p> 
     * @return AreaName <p>地区名称。</p>
     */
    public String getAreaName() {
        return this.AreaName;
    }

    /**
     * Set <p>地区名称。</p>
     * @param AreaName <p>地区名称。</p>
     */
    public void setAreaName(String AreaName) {
        this.AreaName = AreaName;
    }

    /**
     * Get <p>是否中国地域。</p> 
     * @return IsChinaMainland <p>是否中国地域。</p>
     */
    public Long getIsChinaMainland() {
        return this.IsChinaMainland;
    }

    /**
     * Set <p>是否中国地域。</p>
     * @param IsChinaMainland <p>是否中国地域。</p>
     */
    public void setIsChinaMainland(Long IsChinaMainland) {
        this.IsChinaMainland = IsChinaMainland;
    }

    /**
     * Get <p>支持IspType类型。</p> 
     * @return SupportIspType <p>支持IspType类型。</p>
     */
    public String [] getSupportIspType() {
        return this.SupportIspType;
    }

    /**
     * Set <p>支持IspType类型。</p>
     * @param SupportIspType <p>支持IspType类型。</p>
     */
    public void setSupportIspType(String [] SupportIspType) {
        this.SupportIspType = SupportIspType;
    }

    /**
     * Get <p>是否腾讯地域。</p> 
     * @return IsTencentRegion <p>是否腾讯地域。</p>
     */
    public Long getIsTencentRegion() {
        return this.IsTencentRegion;
    }

    /**
     * Set <p>是否腾讯地域。</p>
     * @param IsTencentRegion <p>是否腾讯地域。</p>
     */
    public void setIsTencentRegion(Long IsTencentRegion) {
        this.IsTencentRegion = IsTencentRegion;
    }

    public AcceleratorRegionSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AcceleratorRegionSet(AcceleratorRegionSet source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IsAvailable != null) {
            this.IsAvailable = new Long(source.IsAvailable);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.AreaName != null) {
            this.AreaName = new String(source.AreaName);
        }
        if (source.IsChinaMainland != null) {
            this.IsChinaMainland = new Long(source.IsChinaMainland);
        }
        if (source.SupportIspType != null) {
            this.SupportIspType = new String[source.SupportIspType.length];
            for (int i = 0; i < source.SupportIspType.length; i++) {
                this.SupportIspType[i] = new String(source.SupportIspType[i]);
            }
        }
        if (source.IsTencentRegion != null) {
            this.IsTencentRegion = new Long(source.IsTencentRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IsAvailable", this.IsAvailable);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "AreaName", this.AreaName);
        this.setParamSimple(map, prefix + "IsChinaMainland", this.IsChinaMainland);
        this.setParamArraySimple(map, prefix + "SupportIspType.", this.SupportIspType);
        this.setParamSimple(map, prefix + "IsTencentRegion", this.IsTencentRegion);

    }
}

