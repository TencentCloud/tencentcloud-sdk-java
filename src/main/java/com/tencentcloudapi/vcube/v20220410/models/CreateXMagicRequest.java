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
package com.tencentcloudapi.vcube.v20220410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateXMagicRequest extends AbstractModel {

    /**
    * 应用ApplicationId
    */
    @SerializedName("ApplicationId")
    @Expose
    private Long ApplicationId;

    /**
    * 营业执照
    */
    @SerializedName("CompanyPermit")
    @Expose
    private String CompanyPermit;

    /**
    * 公司类型
    */
    @SerializedName("CompanyType")
    @Expose
    private String CompanyType;

    /**
    * 公司名称
    */
    @SerializedName("CompanyName")
    @Expose
    private String CompanyName;

    /**
    * 优图资源id列表
    */
    @SerializedName("XMagicResourceIds")
    @Expose
    private String [] XMagicResourceIds;

    /**
     * Get 应用ApplicationId 
     * @return ApplicationId 应用ApplicationId
     */
    public Long getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用ApplicationId
     * @param ApplicationId 应用ApplicationId
     */
    public void setApplicationId(Long ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 营业执照 
     * @return CompanyPermit 营业执照
     */
    public String getCompanyPermit() {
        return this.CompanyPermit;
    }

    /**
     * Set 营业执照
     * @param CompanyPermit 营业执照
     */
    public void setCompanyPermit(String CompanyPermit) {
        this.CompanyPermit = CompanyPermit;
    }

    /**
     * Get 公司类型 
     * @return CompanyType 公司类型
     */
    public String getCompanyType() {
        return this.CompanyType;
    }

    /**
     * Set 公司类型
     * @param CompanyType 公司类型
     */
    public void setCompanyType(String CompanyType) {
        this.CompanyType = CompanyType;
    }

    /**
     * Get 公司名称 
     * @return CompanyName 公司名称
     */
    public String getCompanyName() {
        return this.CompanyName;
    }

    /**
     * Set 公司名称
     * @param CompanyName 公司名称
     */
    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    /**
     * Get 优图资源id列表 
     * @return XMagicResourceIds 优图资源id列表
     */
    public String [] getXMagicResourceIds() {
        return this.XMagicResourceIds;
    }

    /**
     * Set 优图资源id列表
     * @param XMagicResourceIds 优图资源id列表
     */
    public void setXMagicResourceIds(String [] XMagicResourceIds) {
        this.XMagicResourceIds = XMagicResourceIds;
    }

    public CreateXMagicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateXMagicRequest(CreateXMagicRequest source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new Long(source.ApplicationId);
        }
        if (source.CompanyPermit != null) {
            this.CompanyPermit = new String(source.CompanyPermit);
        }
        if (source.CompanyType != null) {
            this.CompanyType = new String(source.CompanyType);
        }
        if (source.CompanyName != null) {
            this.CompanyName = new String(source.CompanyName);
        }
        if (source.XMagicResourceIds != null) {
            this.XMagicResourceIds = new String[source.XMagicResourceIds.length];
            for (int i = 0; i < source.XMagicResourceIds.length; i++) {
                this.XMagicResourceIds[i] = new String(source.XMagicResourceIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "CompanyPermit", this.CompanyPermit);
        this.setParamSimple(map, prefix + "CompanyType", this.CompanyType);
        this.setParamSimple(map, prefix + "CompanyName", this.CompanyName);
        this.setParamArraySimple(map, prefix + "XMagicResourceIds.", this.XMagicResourceIds);

    }
}

