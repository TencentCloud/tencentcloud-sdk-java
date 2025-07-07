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

public class UpdateXMagicRequest extends AbstractModel {

    /**
    * 要修改的XMagic Id
    */
    @SerializedName("XMagicId")
    @Expose
    private Long XMagicId;

    /**
    * 资源id
    */
    @SerializedName("XMagicResourceId")
    @Expose
    private String XMagicResourceId;

    /**
    * 营业执照地址
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
     * Get 要修改的XMagic Id 
     * @return XMagicId 要修改的XMagic Id
     */
    public Long getXMagicId() {
        return this.XMagicId;
    }

    /**
     * Set 要修改的XMagic Id
     * @param XMagicId 要修改的XMagic Id
     */
    public void setXMagicId(Long XMagicId) {
        this.XMagicId = XMagicId;
    }

    /**
     * Get 资源id 
     * @return XMagicResourceId 资源id
     */
    public String getXMagicResourceId() {
        return this.XMagicResourceId;
    }

    /**
     * Set 资源id
     * @param XMagicResourceId 资源id
     */
    public void setXMagicResourceId(String XMagicResourceId) {
        this.XMagicResourceId = XMagicResourceId;
    }

    /**
     * Get 营业执照地址 
     * @return CompanyPermit 营业执照地址
     */
    public String getCompanyPermit() {
        return this.CompanyPermit;
    }

    /**
     * Set 营业执照地址
     * @param CompanyPermit 营业执照地址
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

    public UpdateXMagicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateXMagicRequest(UpdateXMagicRequest source) {
        if (source.XMagicId != null) {
            this.XMagicId = new Long(source.XMagicId);
        }
        if (source.XMagicResourceId != null) {
            this.XMagicResourceId = new String(source.XMagicResourceId);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "XMagicId", this.XMagicId);
        this.setParamSimple(map, prefix + "XMagicResourceId", this.XMagicResourceId);
        this.setParamSimple(map, prefix + "CompanyPermit", this.CompanyPermit);
        this.setParamSimple(map, prefix + "CompanyType", this.CompanyType);
        this.setParamSimple(map, prefix + "CompanyName", this.CompanyName);

    }
}

