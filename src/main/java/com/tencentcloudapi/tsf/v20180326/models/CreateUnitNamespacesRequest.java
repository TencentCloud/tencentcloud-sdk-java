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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateUnitNamespacesRequest extends AbstractModel {

    /**
    * 网关实体ID
    */
    @SerializedName("GatewayInstanceId")
    @Expose
    private String GatewayInstanceId;

    /**
    * 单元化命名空间对象列表
    */
    @SerializedName("UnitNamespaceList")
    @Expose
    private UnitNamespace [] UnitNamespaceList;

    /**
     * Get 网关实体ID 
     * @return GatewayInstanceId 网关实体ID
     */
    public String getGatewayInstanceId() {
        return this.GatewayInstanceId;
    }

    /**
     * Set 网关实体ID
     * @param GatewayInstanceId 网关实体ID
     */
    public void setGatewayInstanceId(String GatewayInstanceId) {
        this.GatewayInstanceId = GatewayInstanceId;
    }

    /**
     * Get 单元化命名空间对象列表 
     * @return UnitNamespaceList 单元化命名空间对象列表
     */
    public UnitNamespace [] getUnitNamespaceList() {
        return this.UnitNamespaceList;
    }

    /**
     * Set 单元化命名空间对象列表
     * @param UnitNamespaceList 单元化命名空间对象列表
     */
    public void setUnitNamespaceList(UnitNamespace [] UnitNamespaceList) {
        this.UnitNamespaceList = UnitNamespaceList;
    }

    public CreateUnitNamespacesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUnitNamespacesRequest(CreateUnitNamespacesRequest source) {
        if (source.GatewayInstanceId != null) {
            this.GatewayInstanceId = new String(source.GatewayInstanceId);
        }
        if (source.UnitNamespaceList != null) {
            this.UnitNamespaceList = new UnitNamespace[source.UnitNamespaceList.length];
            for (int i = 0; i < source.UnitNamespaceList.length; i++) {
                this.UnitNamespaceList[i] = new UnitNamespace(source.UnitNamespaceList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayInstanceId", this.GatewayInstanceId);
        this.setParamArrayObj(map, prefix + "UnitNamespaceList.", this.UnitNamespaceList);

    }
}

