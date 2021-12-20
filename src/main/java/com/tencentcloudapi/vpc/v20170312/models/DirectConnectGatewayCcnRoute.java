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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DirectConnectGatewayCcnRoute extends AbstractModel{

    /**
    * 路由ID。
    */
    @SerializedName("RouteId")
    @Expose
    private String RouteId;

    /**
    * IDC网段。
    */
    @SerializedName("DestinationCidrBlock")
    @Expose
    private String DestinationCidrBlock;

    /**
    * `BGP`的`AS-Path`属性。
    */
    @SerializedName("ASPath")
    @Expose
    private String [] ASPath;

    /**
    * 备注
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 最后更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 路由ID。 
     * @return RouteId 路由ID。
     */
    public String getRouteId() {
        return this.RouteId;
    }

    /**
     * Set 路由ID。
     * @param RouteId 路由ID。
     */
    public void setRouteId(String RouteId) {
        this.RouteId = RouteId;
    }

    /**
     * Get IDC网段。 
     * @return DestinationCidrBlock IDC网段。
     */
    public String getDestinationCidrBlock() {
        return this.DestinationCidrBlock;
    }

    /**
     * Set IDC网段。
     * @param DestinationCidrBlock IDC网段。
     */
    public void setDestinationCidrBlock(String DestinationCidrBlock) {
        this.DestinationCidrBlock = DestinationCidrBlock;
    }

    /**
     * Get `BGP`的`AS-Path`属性。 
     * @return ASPath `BGP`的`AS-Path`属性。
     */
    public String [] getASPath() {
        return this.ASPath;
    }

    /**
     * Set `BGP`的`AS-Path`属性。
     * @param ASPath `BGP`的`AS-Path`属性。
     */
    public void setASPath(String [] ASPath) {
        this.ASPath = ASPath;
    }

    /**
     * Get 备注 
     * @return Description 备注
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 备注
     * @param Description 备注
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 最后更新时间 
     * @return UpdateTime 最后更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 最后更新时间
     * @param UpdateTime 最后更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public DirectConnectGatewayCcnRoute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DirectConnectGatewayCcnRoute(DirectConnectGatewayCcnRoute source) {
        if (source.RouteId != null) {
            this.RouteId = new String(source.RouteId);
        }
        if (source.DestinationCidrBlock != null) {
            this.DestinationCidrBlock = new String(source.DestinationCidrBlock);
        }
        if (source.ASPath != null) {
            this.ASPath = new String[source.ASPath.length];
            for (int i = 0; i < source.ASPath.length; i++) {
                this.ASPath[i] = new String(source.ASPath[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RouteId", this.RouteId);
        this.setParamSimple(map, prefix + "DestinationCidrBlock", this.DestinationCidrBlock);
        this.setParamArraySimple(map, prefix + "ASPath.", this.ASPath);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

