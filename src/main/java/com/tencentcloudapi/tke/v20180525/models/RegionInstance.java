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

public class RegionInstance extends AbstractModel {

    /**
    * 地域名称
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 地域ID
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 地域状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 地域特性开关(按照JSON的形式返回所有属性)
    */
    @SerializedName("FeatureGates")
    @Expose
    private String FeatureGates;

    /**
    * 地域简称
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 地域白名单
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 地域名称 
     * @return RegionName 地域名称
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 地域名称
     * @param RegionName 地域名称
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get 地域ID 
     * @return RegionId 地域ID
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域ID
     * @param RegionId 地域ID
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 地域状态 
     * @return Status 地域状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 地域状态
     * @param Status 地域状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 地域特性开关(按照JSON的形式返回所有属性) 
     * @return FeatureGates 地域特性开关(按照JSON的形式返回所有属性)
     */
    public String getFeatureGates() {
        return this.FeatureGates;
    }

    /**
     * Set 地域特性开关(按照JSON的形式返回所有属性)
     * @param FeatureGates 地域特性开关(按照JSON的形式返回所有属性)
     */
    public void setFeatureGates(String FeatureGates) {
        this.FeatureGates = FeatureGates;
    }

    /**
     * Get 地域简称 
     * @return Alias 地域简称
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 地域简称
     * @param Alias 地域简称
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 地域白名单 
     * @return Remark 地域白名单
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 地域白名单
     * @param Remark 地域白名单
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public RegionInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegionInstance(RegionInstance source) {
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.FeatureGates != null) {
            this.FeatureGates = new String(source.FeatureGates);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FeatureGates", this.FeatureGates);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

