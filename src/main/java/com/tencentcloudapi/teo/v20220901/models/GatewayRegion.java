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

public class GatewayRegion extends AbstractModel {

    /**
    * 地域 ID 。
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * 中文地域名称。
    */
    @SerializedName("CNName")
    @Expose
    private String CNName;

    /**
    * 英文地域名称。
    */
    @SerializedName("ENName")
    @Expose
    private String ENName;

    /**
     * Get 地域 ID 。 
     * @return RegionId 地域 ID 。
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域 ID 。
     * @param RegionId 地域 ID 。
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 中文地域名称。 
     * @return CNName 中文地域名称。
     */
    public String getCNName() {
        return this.CNName;
    }

    /**
     * Set 中文地域名称。
     * @param CNName 中文地域名称。
     */
    public void setCNName(String CNName) {
        this.CNName = CNName;
    }

    /**
     * Get 英文地域名称。 
     * @return ENName 英文地域名称。
     */
    public String getENName() {
        return this.ENName;
    }

    /**
     * Set 英文地域名称。
     * @param ENName 英文地域名称。
     */
    public void setENName(String ENName) {
        this.ENName = ENName;
    }

    public GatewayRegion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GatewayRegion(GatewayRegion source) {
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.CNName != null) {
            this.CNName = new String(source.CNName);
        }
        if (source.ENName != null) {
            this.ENName = new String(source.ENName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "CNName", this.CNName);
        this.setParamSimple(map, prefix + "ENName", this.ENName);

    }
}

