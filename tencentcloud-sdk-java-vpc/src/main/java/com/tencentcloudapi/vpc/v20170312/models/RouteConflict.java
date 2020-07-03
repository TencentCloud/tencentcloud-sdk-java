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

public class RouteConflict extends AbstractModel{

    /**
    * 路由表实例ID，例如：rtb-azd4dt1c。
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
    * 要检查的与之冲突的目的端
    */
    @SerializedName("DestinationCidrBlock")
    @Expose
    private String DestinationCidrBlock;

    /**
    * 冲突的路由策略列表
    */
    @SerializedName("ConflictSet")
    @Expose
    private Route [] ConflictSet;

    /**
     * Get 路由表实例ID，例如：rtb-azd4dt1c。 
     * @return RouteTableId 路由表实例ID，例如：rtb-azd4dt1c。
     */
    public String getRouteTableId() {
        return this.RouteTableId;
    }

    /**
     * Set 路由表实例ID，例如：rtb-azd4dt1c。
     * @param RouteTableId 路由表实例ID，例如：rtb-azd4dt1c。
     */
    public void setRouteTableId(String RouteTableId) {
        this.RouteTableId = RouteTableId;
    }

    /**
     * Get 要检查的与之冲突的目的端 
     * @return DestinationCidrBlock 要检查的与之冲突的目的端
     */
    public String getDestinationCidrBlock() {
        return this.DestinationCidrBlock;
    }

    /**
     * Set 要检查的与之冲突的目的端
     * @param DestinationCidrBlock 要检查的与之冲突的目的端
     */
    public void setDestinationCidrBlock(String DestinationCidrBlock) {
        this.DestinationCidrBlock = DestinationCidrBlock;
    }

    /**
     * Get 冲突的路由策略列表 
     * @return ConflictSet 冲突的路由策略列表
     */
    public Route [] getConflictSet() {
        return this.ConflictSet;
    }

    /**
     * Set 冲突的路由策略列表
     * @param ConflictSet 冲突的路由策略列表
     */
    public void setConflictSet(Route [] ConflictSet) {
        this.ConflictSet = ConflictSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);
        this.setParamSimple(map, prefix + "DestinationCidrBlock", this.DestinationCidrBlock);
        this.setParamArrayObj(map, prefix + "ConflictSet.", this.ConflictSet);

    }
}

