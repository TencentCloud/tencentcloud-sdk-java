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

public class RiskCenterStatusKey extends AbstractModel {

    /**
    * 风险ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 公网IP/域名
    */
    @SerializedName("PublicIPDomain")
    @Expose
    private String PublicIPDomain;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * APP ID
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
     * Get 风险ID 
     * @return Id 风险ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 风险ID
     * @param Id 风险ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 公网IP/域名 
     * @return PublicIPDomain 公网IP/域名
     */
    public String getPublicIPDomain() {
        return this.PublicIPDomain;
    }

    /**
     * Set 公网IP/域名
     * @param PublicIPDomain 公网IP/域名
     */
    public void setPublicIPDomain(String PublicIPDomain) {
        this.PublicIPDomain = PublicIPDomain;
    }

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get APP ID 
     * @return AppId APP ID
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set APP ID
     * @param AppId APP ID
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    public RiskCenterStatusKey() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskCenterStatusKey(RiskCenterStatusKey source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.PublicIPDomain != null) {
            this.PublicIPDomain = new String(source.PublicIPDomain);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "PublicIPDomain", this.PublicIPDomain);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);

    }
}

