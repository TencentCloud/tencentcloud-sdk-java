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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LicenseOrder extends AbstractModel{

    /**
    * 授权ID
    */
    @SerializedName("LicenseId")
    @Expose
    private Long LicenseId;

    /**
    * 授权类型
    */
    @SerializedName("LicenseType")
    @Expose
    private Long LicenseType;

    /**
    * 授权订单资源状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 订单类型
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * 资源ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
     * Get 授权ID 
     * @return LicenseId 授权ID
     */
    public Long getLicenseId() {
        return this.LicenseId;
    }

    /**
     * Set 授权ID
     * @param LicenseId 授权ID
     */
    public void setLicenseId(Long LicenseId) {
        this.LicenseId = LicenseId;
    }

    /**
     * Get 授权类型 
     * @return LicenseType 授权类型
     */
    public Long getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set 授权类型
     * @param LicenseType 授权类型
     */
    public void setLicenseType(Long LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get 授权订单资源状态 
     * @return Status 授权订单资源状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 授权订单资源状态
     * @param Status 授权订单资源状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 订单类型 
     * @return SourceType 订单类型
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 订单类型
     * @param SourceType 订单类型
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 资源ID 
     * @return ResourceId 资源ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID
     * @param ResourceId 资源ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    public LicenseOrder() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LicenseOrder(LicenseOrder source) {
        if (source.LicenseId != null) {
            this.LicenseId = new Long(source.LicenseId);
        }
        if (source.LicenseType != null) {
            this.LicenseType = new Long(source.LicenseType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LicenseId", this.LicenseId);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

