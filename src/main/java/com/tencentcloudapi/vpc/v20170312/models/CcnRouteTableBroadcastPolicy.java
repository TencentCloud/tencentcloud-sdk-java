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

public class CcnRouteTableBroadcastPolicy extends AbstractModel {

    /**
    * <p>路由条件</p>
    */
    @SerializedName("RouteConditions")
    @Expose
    private CcnRouteBroadcastPolicyRouteCondition [] RouteConditions;

    /**
    * <p>传播条件</p>
    */
    @SerializedName("BroadcastConditions")
    @Expose
    private CcnRouteBroadcastPolicyRouteCondition [] BroadcastConditions;

    /**
    * <p>路由行为，<code>accept</code> 允许，<code>drop</code> 拒绝</p>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * <p>策略描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>as-path操作</p>
    */
    @SerializedName("OperateAsPath")
    @Expose
    private String OperateAsPath;

    /**
    * <p>as-path操作模式</p>
    */
    @SerializedName("AsPathOperateMode")
    @Expose
    private String AsPathOperateMode;

    /**
    * <p>community操作</p>
    */
    @SerializedName("OperateCommunitySet")
    @Expose
    private String [] OperateCommunitySet;

    /**
    * <p>community操作模式</p>
    */
    @SerializedName("CommunityOperateMode")
    @Expose
    private String CommunityOperateMode;

    /**
     * Get <p>路由条件</p> 
     * @return RouteConditions <p>路由条件</p>
     */
    public CcnRouteBroadcastPolicyRouteCondition [] getRouteConditions() {
        return this.RouteConditions;
    }

    /**
     * Set <p>路由条件</p>
     * @param RouteConditions <p>路由条件</p>
     */
    public void setRouteConditions(CcnRouteBroadcastPolicyRouteCondition [] RouteConditions) {
        this.RouteConditions = RouteConditions;
    }

    /**
     * Get <p>传播条件</p> 
     * @return BroadcastConditions <p>传播条件</p>
     */
    public CcnRouteBroadcastPolicyRouteCondition [] getBroadcastConditions() {
        return this.BroadcastConditions;
    }

    /**
     * Set <p>传播条件</p>
     * @param BroadcastConditions <p>传播条件</p>
     */
    public void setBroadcastConditions(CcnRouteBroadcastPolicyRouteCondition [] BroadcastConditions) {
        this.BroadcastConditions = BroadcastConditions;
    }

    /**
     * Get <p>路由行为，<code>accept</code> 允许，<code>drop</code> 拒绝</p> 
     * @return Action <p>路由行为，<code>accept</code> 允许，<code>drop</code> 拒绝</p>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set <p>路由行为，<code>accept</code> 允许，<code>drop</code> 拒绝</p>
     * @param Action <p>路由行为，<code>accept</code> 允许，<code>drop</code> 拒绝</p>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get <p>策略描述</p> 
     * @return Description <p>策略描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>策略描述</p>
     * @param Description <p>策略描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>as-path操作</p> 
     * @return OperateAsPath <p>as-path操作</p>
     */
    public String getOperateAsPath() {
        return this.OperateAsPath;
    }

    /**
     * Set <p>as-path操作</p>
     * @param OperateAsPath <p>as-path操作</p>
     */
    public void setOperateAsPath(String OperateAsPath) {
        this.OperateAsPath = OperateAsPath;
    }

    /**
     * Get <p>as-path操作模式</p> 
     * @return AsPathOperateMode <p>as-path操作模式</p>
     */
    public String getAsPathOperateMode() {
        return this.AsPathOperateMode;
    }

    /**
     * Set <p>as-path操作模式</p>
     * @param AsPathOperateMode <p>as-path操作模式</p>
     */
    public void setAsPathOperateMode(String AsPathOperateMode) {
        this.AsPathOperateMode = AsPathOperateMode;
    }

    /**
     * Get <p>community操作</p> 
     * @return OperateCommunitySet <p>community操作</p>
     */
    public String [] getOperateCommunitySet() {
        return this.OperateCommunitySet;
    }

    /**
     * Set <p>community操作</p>
     * @param OperateCommunitySet <p>community操作</p>
     */
    public void setOperateCommunitySet(String [] OperateCommunitySet) {
        this.OperateCommunitySet = OperateCommunitySet;
    }

    /**
     * Get <p>community操作模式</p> 
     * @return CommunityOperateMode <p>community操作模式</p>
     */
    public String getCommunityOperateMode() {
        return this.CommunityOperateMode;
    }

    /**
     * Set <p>community操作模式</p>
     * @param CommunityOperateMode <p>community操作模式</p>
     */
    public void setCommunityOperateMode(String CommunityOperateMode) {
        this.CommunityOperateMode = CommunityOperateMode;
    }

    public CcnRouteTableBroadcastPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CcnRouteTableBroadcastPolicy(CcnRouteTableBroadcastPolicy source) {
        if (source.RouteConditions != null) {
            this.RouteConditions = new CcnRouteBroadcastPolicyRouteCondition[source.RouteConditions.length];
            for (int i = 0; i < source.RouteConditions.length; i++) {
                this.RouteConditions[i] = new CcnRouteBroadcastPolicyRouteCondition(source.RouteConditions[i]);
            }
        }
        if (source.BroadcastConditions != null) {
            this.BroadcastConditions = new CcnRouteBroadcastPolicyRouteCondition[source.BroadcastConditions.length];
            for (int i = 0; i < source.BroadcastConditions.length; i++) {
                this.BroadcastConditions[i] = new CcnRouteBroadcastPolicyRouteCondition(source.BroadcastConditions[i]);
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
        if (source.OperateCommunitySet != null) {
            this.OperateCommunitySet = new String[source.OperateCommunitySet.length];
            for (int i = 0; i < source.OperateCommunitySet.length; i++) {
                this.OperateCommunitySet[i] = new String(source.OperateCommunitySet[i]);
            }
        }
        if (source.CommunityOperateMode != null) {
            this.CommunityOperateMode = new String(source.CommunityOperateMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RouteConditions.", this.RouteConditions);
        this.setParamArrayObj(map, prefix + "BroadcastConditions.", this.BroadcastConditions);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "OperateAsPath", this.OperateAsPath);
        this.setParamSimple(map, prefix + "AsPathOperateMode", this.AsPathOperateMode);
        this.setParamArraySimple(map, prefix + "OperateCommunitySet.", this.OperateCommunitySet);
        this.setParamSimple(map, prefix + "CommunityOperateMode", this.CommunityOperateMode);

    }
}

