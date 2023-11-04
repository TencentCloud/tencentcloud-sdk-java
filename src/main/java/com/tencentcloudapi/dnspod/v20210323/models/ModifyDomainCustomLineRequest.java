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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDomainCustomLineRequest extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 修改后的自定义线路名称，如果不修改名称，需要和PreName保持一致
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 自定义线路IP段，用-分割
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 修改前的自定义线路名称
    */
    @SerializedName("PreName")
    @Expose
    private String PreName;

    /**
    * 域名ID，如果传了DomainId，系统将会忽略Domain参数，优先使用DomainId
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 修改后的自定义线路名称，如果不修改名称，需要和PreName保持一致 
     * @return Name 修改后的自定义线路名称，如果不修改名称，需要和PreName保持一致
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 修改后的自定义线路名称，如果不修改名称，需要和PreName保持一致
     * @param Name 修改后的自定义线路名称，如果不修改名称，需要和PreName保持一致
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 自定义线路IP段，用-分割 
     * @return Area 自定义线路IP段，用-分割
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 自定义线路IP段，用-分割
     * @param Area 自定义线路IP段，用-分割
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 修改前的自定义线路名称 
     * @return PreName 修改前的自定义线路名称
     */
    public String getPreName() {
        return this.PreName;
    }

    /**
     * Set 修改前的自定义线路名称
     * @param PreName 修改前的自定义线路名称
     */
    public void setPreName(String PreName) {
        this.PreName = PreName;
    }

    /**
     * Get 域名ID，如果传了DomainId，系统将会忽略Domain参数，优先使用DomainId 
     * @return DomainId 域名ID，如果传了DomainId，系统将会忽略Domain参数，优先使用DomainId
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 域名ID，如果传了DomainId，系统将会忽略Domain参数，优先使用DomainId
     * @param DomainId 域名ID，如果传了DomainId，系统将会忽略Domain参数，优先使用DomainId
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    public ModifyDomainCustomLineRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDomainCustomLineRequest(ModifyDomainCustomLineRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.PreName != null) {
            this.PreName = new String(source.PreName);
        }
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "PreName", this.PreName);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);

    }
}

