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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VpngwCcnRoutes extends AbstractModel {

    /**
    * 路由信息ID。
    */
    @SerializedName("RouteId")
    @Expose
    private String RouteId;

    /**
    * 路由信息是否启用。
ENABLE：启用该路由
DISABLE：不启用该路由
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 路由CIDR。
    */
    @SerializedName("DestinationCidrBlock")
    @Expose
    private String DestinationCidrBlock;

    /**
     * Get 路由信息ID。 
     * @return RouteId 路由信息ID。
     */
    public String getRouteId() {
        return this.RouteId;
    }

    /**
     * Set 路由信息ID。
     * @param RouteId 路由信息ID。
     */
    public void setRouteId(String RouteId) {
        this.RouteId = RouteId;
    }

    /**
     * Get 路由信息是否启用。
ENABLE：启用该路由
DISABLE：不启用该路由 
     * @return Status 路由信息是否启用。
ENABLE：启用该路由
DISABLE：不启用该路由
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 路由信息是否启用。
ENABLE：启用该路由
DISABLE：不启用该路由
     * @param Status 路由信息是否启用。
ENABLE：启用该路由
DISABLE：不启用该路由
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 路由CIDR。 
     * @return DestinationCidrBlock 路由CIDR。
     */
    public String getDestinationCidrBlock() {
        return this.DestinationCidrBlock;
    }

    /**
     * Set 路由CIDR。
     * @param DestinationCidrBlock 路由CIDR。
     */
    public void setDestinationCidrBlock(String DestinationCidrBlock) {
        this.DestinationCidrBlock = DestinationCidrBlock;
    }

    public VpngwCcnRoutes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VpngwCcnRoutes(VpngwCcnRoutes source) {
        if (source.RouteId != null) {
            this.RouteId = new String(source.RouteId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.DestinationCidrBlock != null) {
            this.DestinationCidrBlock = new String(source.DestinationCidrBlock);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RouteId", this.RouteId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DestinationCidrBlock", this.DestinationCidrBlock);

    }
}

