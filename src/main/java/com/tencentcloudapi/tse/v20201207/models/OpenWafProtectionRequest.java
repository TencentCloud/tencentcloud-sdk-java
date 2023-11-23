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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpenWafProtectionRequest extends AbstractModel {

    /**
    * 网关ID
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    *  防护资源的类型。
- Global  实例
- Service  服务
- Route  路由
- Object  对象（接口暂不支持）
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 当资源类型 Type 是 Service 或 Route 的时候，传入的服务或路由的列表
    */
    @SerializedName("List")
    @Expose
    private String [] List;

    /**
     * Get 网关ID 
     * @return GatewayId 网关ID
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 网关ID
     * @param GatewayId 网关ID
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get  防护资源的类型。
- Global  实例
- Service  服务
- Route  路由
- Object  对象（接口暂不支持） 
     * @return Type  防护资源的类型。
- Global  实例
- Service  服务
- Route  路由
- Object  对象（接口暂不支持）
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set  防护资源的类型。
- Global  实例
- Service  服务
- Route  路由
- Object  对象（接口暂不支持）
     * @param Type  防护资源的类型。
- Global  实例
- Service  服务
- Route  路由
- Object  对象（接口暂不支持）
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 当资源类型 Type 是 Service 或 Route 的时候，传入的服务或路由的列表 
     * @return List 当资源类型 Type 是 Service 或 Route 的时候，传入的服务或路由的列表
     */
    public String [] getList() {
        return this.List;
    }

    /**
     * Set 当资源类型 Type 是 Service 或 Route 的时候，传入的服务或路由的列表
     * @param List 当资源类型 Type 是 Service 或 Route 的时候，传入的服务或路由的列表
     */
    public void setList(String [] List) {
        this.List = List;
    }

    public OpenWafProtectionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenWafProtectionRequest(OpenWafProtectionRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.List != null) {
            this.List = new String[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new String(source.List[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "List.", this.List);

    }
}

