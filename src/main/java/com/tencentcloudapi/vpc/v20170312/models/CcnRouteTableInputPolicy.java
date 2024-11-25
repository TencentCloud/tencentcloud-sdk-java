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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CcnRouteTableInputPolicy extends AbstractModel {

    /**
    * 路由条件。
    */
    @SerializedName("RouteConditions")
    @Expose
    private CcnRouteBroadcastPolicyRouteCondition [] RouteConditions;

    /**
    * 路由行为，`accept` 允许，`drop` 拒绝。
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 策略描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * as-path操作
    */
    @SerializedName("OperateAsPath")
    @Expose
    private String OperateAsPath;

    /**
    * as-path操作模式
    */
    @SerializedName("AsPathOperateMode")
    @Expose
    private String AsPathOperateMode;

    /**
     * Get 路由条件。 
     * @return RouteConditions 路由条件。
     */
    public CcnRouteBroadcastPolicyRouteCondition [] getRouteConditions() {
        return this.RouteConditions;
    }

    /**
     * Set 路由条件。
     * @param RouteConditions 路由条件。
     */
    public void setRouteConditions(CcnRouteBroadcastPolicyRouteCondition [] RouteConditions) {
        this.RouteConditions = RouteConditions;
    }

    /**
     * Get 路由行为，`accept` 允许，`drop` 拒绝。 
     * @return Action 路由行为，`accept` 允许，`drop` 拒绝。
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 路由行为，`accept` 允许，`drop` 拒绝。
     * @param Action 路由行为，`accept` 允许，`drop` 拒绝。
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 策略描述。 
     * @return Description 策略描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 策略描述。
     * @param Description 策略描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get as-path操作 
     * @return OperateAsPath as-path操作
     */
    public String getOperateAsPath() {
        return this.OperateAsPath;
    }

    /**
     * Set as-path操作
     * @param OperateAsPath as-path操作
     */
    public void setOperateAsPath(String OperateAsPath) {
        this.OperateAsPath = OperateAsPath;
    }

    /**
     * Get as-path操作模式 
     * @return AsPathOperateMode as-path操作模式
     */
    public String getAsPathOperateMode() {
        return this.AsPathOperateMode;
    }

    /**
     * Set as-path操作模式
     * @param AsPathOperateMode as-path操作模式
     */
    public void setAsPathOperateMode(String AsPathOperateMode) {
        this.AsPathOperateMode = AsPathOperateMode;
    }

    public CcnRouteTableInputPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CcnRouteTableInputPolicy(CcnRouteTableInputPolicy source) {
        if (source.RouteConditions != null) {
            this.RouteConditions = new CcnRouteBroadcastPolicyRouteCondition[source.RouteConditions.length];
            for (int i = 0; i < source.RouteConditions.length; i++) {
                this.RouteConditions[i] = new CcnRouteBroadcastPolicyRouteCondition(source.RouteConditions[i]);
            }
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.OperateAsPath != null) {
            this.OperateAsPath = new String(source.OperateAsPath);
        }
        if (source.AsPathOperateMode != null) {
            this.AsPathOperateMode = new String(source.AsPathOperateMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RouteConditions.", this.RouteConditions);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "OperateAsPath", this.OperateAsPath);
        this.setParamSimple(map, prefix + "AsPathOperateMode", this.AsPathOperateMode);

    }
}

