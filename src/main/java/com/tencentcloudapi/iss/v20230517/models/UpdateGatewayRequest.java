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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateGatewayRequest extends AbstractModel{

    /**
    * 网关索引ID（从获取网关列表ListGateways接口中获取）	
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 仅支持中文、英文、数网关名称，字、_、-，长度不超过32个字符
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 网关描述，仅支持中文、英文、数字、_、-，长度不超过128个字符
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 网关索引ID（从获取网关列表ListGateways接口中获取）	 
     * @return GatewayId 网关索引ID（从获取网关列表ListGateways接口中获取）	
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 网关索引ID（从获取网关列表ListGateways接口中获取）	
     * @param GatewayId 网关索引ID（从获取网关列表ListGateways接口中获取）	
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 仅支持中文、英文、数网关名称，字、_、-，长度不超过32个字符 
     * @return Name 仅支持中文、英文、数网关名称，字、_、-，长度不超过32个字符
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 仅支持中文、英文、数网关名称，字、_、-，长度不超过32个字符
     * @param Name 仅支持中文、英文、数网关名称，字、_、-，长度不超过32个字符
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 网关描述，仅支持中文、英文、数字、_、-，长度不超过128个字符 
     * @return Description 网关描述，仅支持中文、英文、数字、_、-，长度不超过128个字符
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 网关描述，仅支持中文、英文、数字、_、-，长度不超过128个字符
     * @param Description 网关描述，仅支持中文、英文、数字、_、-，长度不超过128个字符
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public UpdateGatewayRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateGatewayRequest(UpdateGatewayRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

