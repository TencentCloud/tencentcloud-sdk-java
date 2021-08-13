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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNatFwSwitchRequest extends AbstractModel{

    /**
    * 开关，0：关闭，1：开启
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 防火墙实例id列表，其中CfwInsIdList，SubnetIdList和RouteTableIdList只能传递一种。
    */
    @SerializedName("CfwInsIdList")
    @Expose
    private String [] CfwInsIdList;

    /**
    * 子网id列表，其中CfwInsIdList，SubnetIdList和RouteTableIdList只能传递一种。
    */
    @SerializedName("SubnetIdList")
    @Expose
    private String [] SubnetIdList;

    /**
    * 路由表id列表，其中CfwInsIdList，SubnetIdList和RouteTableIdList只能传递一种。
    */
    @SerializedName("RouteTableIdList")
    @Expose
    private String [] RouteTableIdList;

    /**
     * Get 开关，0：关闭，1：开启 
     * @return Enable 开关，0：关闭，1：开启
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 开关，0：关闭，1：开启
     * @param Enable 开关，0：关闭，1：开启
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 防火墙实例id列表，其中CfwInsIdList，SubnetIdList和RouteTableIdList只能传递一种。 
     * @return CfwInsIdList 防火墙实例id列表，其中CfwInsIdList，SubnetIdList和RouteTableIdList只能传递一种。
     */
    public String [] getCfwInsIdList() {
        return this.CfwInsIdList;
    }

    /**
     * Set 防火墙实例id列表，其中CfwInsIdList，SubnetIdList和RouteTableIdList只能传递一种。
     * @param CfwInsIdList 防火墙实例id列表，其中CfwInsIdList，SubnetIdList和RouteTableIdList只能传递一种。
     */
    public void setCfwInsIdList(String [] CfwInsIdList) {
        this.CfwInsIdList = CfwInsIdList;
    }

    /**
     * Get 子网id列表，其中CfwInsIdList，SubnetIdList和RouteTableIdList只能传递一种。 
     * @return SubnetIdList 子网id列表，其中CfwInsIdList，SubnetIdList和RouteTableIdList只能传递一种。
     */
    public String [] getSubnetIdList() {
        return this.SubnetIdList;
    }

    /**
     * Set 子网id列表，其中CfwInsIdList，SubnetIdList和RouteTableIdList只能传递一种。
     * @param SubnetIdList 子网id列表，其中CfwInsIdList，SubnetIdList和RouteTableIdList只能传递一种。
     */
    public void setSubnetIdList(String [] SubnetIdList) {
        this.SubnetIdList = SubnetIdList;
    }

    /**
     * Get 路由表id列表，其中CfwInsIdList，SubnetIdList和RouteTableIdList只能传递一种。 
     * @return RouteTableIdList 路由表id列表，其中CfwInsIdList，SubnetIdList和RouteTableIdList只能传递一种。
     */
    public String [] getRouteTableIdList() {
        return this.RouteTableIdList;
    }

    /**
     * Set 路由表id列表，其中CfwInsIdList，SubnetIdList和RouteTableIdList只能传递一种。
     * @param RouteTableIdList 路由表id列表，其中CfwInsIdList，SubnetIdList和RouteTableIdList只能传递一种。
     */
    public void setRouteTableIdList(String [] RouteTableIdList) {
        this.RouteTableIdList = RouteTableIdList;
    }

    public ModifyNatFwSwitchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNatFwSwitchRequest(ModifyNatFwSwitchRequest source) {
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.CfwInsIdList != null) {
            this.CfwInsIdList = new String[source.CfwInsIdList.length];
            for (int i = 0; i < source.CfwInsIdList.length; i++) {
                this.CfwInsIdList[i] = new String(source.CfwInsIdList[i]);
            }
        }
        if (source.SubnetIdList != null) {
            this.SubnetIdList = new String[source.SubnetIdList.length];
            for (int i = 0; i < source.SubnetIdList.length; i++) {
                this.SubnetIdList[i] = new String(source.SubnetIdList[i]);
            }
        }
        if (source.RouteTableIdList != null) {
            this.RouteTableIdList = new String[source.RouteTableIdList.length];
            for (int i = 0; i < source.RouteTableIdList.length; i++) {
                this.RouteTableIdList[i] = new String(source.RouteTableIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamArraySimple(map, prefix + "CfwInsIdList.", this.CfwInsIdList);
        this.setParamArraySimple(map, prefix + "SubnetIdList.", this.SubnetIdList);
        this.setParamArraySimple(map, prefix + "RouteTableIdList.", this.RouteTableIdList);

    }
}

