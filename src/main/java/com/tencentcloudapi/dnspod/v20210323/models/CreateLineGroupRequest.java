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

public class CreateLineGroupRequest extends AbstractModel {

    /**
    * 自定义线路分组的名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 自定义线路分组包含的线路列表，包含多个线路时用英文逗号分隔。例如，铁通,奇虎
    */
    @SerializedName("Lines")
    @Expose
    private String Lines;

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 域名ID，如果传了DomainId，系统将会忽略Domain参数，优先使用DomainId
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
     * Get 自定义线路分组的名称。 
     * @return Name 自定义线路分组的名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 自定义线路分组的名称。
     * @param Name 自定义线路分组的名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 自定义线路分组包含的线路列表，包含多个线路时用英文逗号分隔。例如，铁通,奇虎 
     * @return Lines 自定义线路分组包含的线路列表，包含多个线路时用英文逗号分隔。例如，铁通,奇虎
     */
    public String getLines() {
        return this.Lines;
    }

    /**
     * Set 自定义线路分组包含的线路列表，包含多个线路时用英文逗号分隔。例如，铁通,奇虎
     * @param Lines 自定义线路分组包含的线路列表，包含多个线路时用英文逗号分隔。例如，铁通,奇虎
     */
    public void setLines(String Lines) {
        this.Lines = Lines;
    }

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

    public CreateLineGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLineGroupRequest(CreateLineGroupRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Lines != null) {
            this.Lines = new String(source.Lines);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Lines", this.Lines);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);

    }
}

