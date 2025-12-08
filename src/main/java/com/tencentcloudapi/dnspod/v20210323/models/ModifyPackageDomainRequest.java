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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyPackageDomainRequest extends AbstractModel {

    /**
    * 操作类型：change: 套餐换域名；unbind: 解绑套餐域名；bind: 套餐绑定域名。
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 域名ID。Operation为change时必传，代表更换前的域名。
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
    * 域名ID。Operation为change或bind时必传，代表更换后或要绑定的域名。
    */
    @SerializedName("NewDomainId")
    @Expose
    private Long NewDomainId;

    /**
    * 套餐资源ID。Operation为bind或unbind时必传，代表将要操作的套餐资源。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
     * Get 操作类型：change: 套餐换域名；unbind: 解绑套餐域名；bind: 套餐绑定域名。 
     * @return Operation 操作类型：change: 套餐换域名；unbind: 解绑套餐域名；bind: 套餐绑定域名。
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作类型：change: 套餐换域名；unbind: 解绑套餐域名；bind: 套餐绑定域名。
     * @param Operation 操作类型：change: 套餐换域名；unbind: 解绑套餐域名；bind: 套餐绑定域名。
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 域名ID。Operation为change时必传，代表更换前的域名。 
     * @return DomainId 域名ID。Operation为change时必传，代表更换前的域名。
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 域名ID。Operation为change时必传，代表更换前的域名。
     * @param DomainId 域名ID。Operation为change时必传，代表更换前的域名。
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get 域名ID。Operation为change或bind时必传，代表更换后或要绑定的域名。 
     * @return NewDomainId 域名ID。Operation为change或bind时必传，代表更换后或要绑定的域名。
     */
    public Long getNewDomainId() {
        return this.NewDomainId;
    }

    /**
     * Set 域名ID。Operation为change或bind时必传，代表更换后或要绑定的域名。
     * @param NewDomainId 域名ID。Operation为change或bind时必传，代表更换后或要绑定的域名。
     */
    public void setNewDomainId(Long NewDomainId) {
        this.NewDomainId = NewDomainId;
    }

    /**
     * Get 套餐资源ID。Operation为bind或unbind时必传，代表将要操作的套餐资源。 
     * @return ResourceId 套餐资源ID。Operation为bind或unbind时必传，代表将要操作的套餐资源。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 套餐资源ID。Operation为bind或unbind时必传，代表将要操作的套餐资源。
     * @param ResourceId 套餐资源ID。Operation为bind或unbind时必传，代表将要操作的套餐资源。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    public ModifyPackageDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPackageDomainRequest(ModifyPackageDomainRequest source) {
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
        }
        if (source.NewDomainId != null) {
            this.NewDomainId = new Long(source.NewDomainId);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "NewDomainId", this.NewDomainId);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

