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

public class InstanceBind extends AbstractModel {

    /**
    * <p>云联网ID。</p>
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * <p>实例类型：VPC，DIRECTCONNECT，BMVPC，EDGE，EDGE_TUNNEL，EDGE_VPNGW，VPNGW。</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>实例ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例绑定路由表的时间。</p>
    */
    @SerializedName("InstanceBindTime")
    @Expose
    private String InstanceBindTime;

    /**
    * <p>路由表ID。</p>
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
    * <p>实例名称。</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>实例所在地域。</p>
    */
    @SerializedName("InstanceRegion")
    @Expose
    private String InstanceRegion;

    /**
    * <p>实例所属的账户uin。</p>
    */
    @SerializedName("InstanceUin")
    @Expose
    private String InstanceUin;

    /**
    * <p>关联实例状态：</p><li><code>PENDING</code>：申请中</li><li><code>ACTIVE</code>：已连接</li><li><code>EXPIRED</code>：已过期</li><li><code>REJECTED</code>：已拒绝</li><li><code>DELETED</code>：已删除</li><li><code>FAILED</code>：失败的（2小时后将异步强制解关联）</li><li><code>ATTACHING</code>：关联中</li><li><code>DETACHING</code>：解关联中</li><li><code>DETACHFAILED</code>：解关联失败（2小时后将异步强制解关联）</li>
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * <p>别名类型</p>
    */
    @SerializedName("AliasType")
    @Expose
    private String AliasType;

    /**
    * <p>别名实例ID</p>
    */
    @SerializedName("AliasInstanceId")
    @Expose
    private String AliasInstanceId;

    /**
     * Get <p>云联网ID。</p> 
     * @return CcnId <p>云联网ID。</p>
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set <p>云联网ID。</p>
     * @param CcnId <p>云联网ID。</p>
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get <p>实例类型：VPC，DIRECTCONNECT，BMVPC，EDGE，EDGE_TUNNEL，EDGE_VPNGW，VPNGW。</p> 
     * @return InstanceType <p>实例类型：VPC，DIRECTCONNECT，BMVPC，EDGE，EDGE_TUNNEL，EDGE_VPNGW，VPNGW。</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>实例类型：VPC，DIRECTCONNECT，BMVPC，EDGE，EDGE_TUNNEL，EDGE_VPNGW，VPNGW。</p>
     * @param InstanceType <p>实例类型：VPC，DIRECTCONNECT，BMVPC，EDGE，EDGE_TUNNEL，EDGE_VPNGW，VPNGW。</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>实例ID。</p> 
     * @return InstanceId <p>实例ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID。</p>
     * @param InstanceId <p>实例ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例绑定路由表的时间。</p> 
     * @return InstanceBindTime <p>实例绑定路由表的时间。</p>
     */
    public String getInstanceBindTime() {
        return this.InstanceBindTime;
    }

    /**
     * Set <p>实例绑定路由表的时间。</p>
     * @param InstanceBindTime <p>实例绑定路由表的时间。</p>
     */
    public void setInstanceBindTime(String InstanceBindTime) {
        this.InstanceBindTime = InstanceBindTime;
    }

    /**
     * Get <p>路由表ID。</p> 
     * @return RouteTableId <p>路由表ID。</p>
     */
    public String getRouteTableId() {
        return this.RouteTableId;
    }

    /**
     * Set <p>路由表ID。</p>
     * @param RouteTableId <p>路由表ID。</p>
     */
    public void setRouteTableId(String RouteTableId) {
        this.RouteTableId = RouteTableId;
    }

    /**
     * Get <p>实例名称。</p> 
     * @return InstanceName <p>实例名称。</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称。</p>
     * @param InstanceName <p>实例名称。</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>实例所在地域。</p> 
     * @return InstanceRegion <p>实例所在地域。</p>
     */
    public String getInstanceRegion() {
        return this.InstanceRegion;
    }

    /**
     * Set <p>实例所在地域。</p>
     * @param InstanceRegion <p>实例所在地域。</p>
     */
    public void setInstanceRegion(String InstanceRegion) {
        this.InstanceRegion = InstanceRegion;
    }

    /**
     * Get <p>实例所属的账户uin。</p> 
     * @return InstanceUin <p>实例所属的账户uin。</p>
     */
    public String getInstanceUin() {
        return this.InstanceUin;
    }

    /**
     * Set <p>实例所属的账户uin。</p>
     * @param InstanceUin <p>实例所属的账户uin。</p>
     */
    public void setInstanceUin(String InstanceUin) {
        this.InstanceUin = InstanceUin;
    }

    /**
     * Get <p>关联实例状态：</p><li><code>PENDING</code>：申请中</li><li><code>ACTIVE</code>：已连接</li><li><code>EXPIRED</code>：已过期</li><li><code>REJECTED</code>：已拒绝</li><li><code>DELETED</code>：已删除</li><li><code>FAILED</code>：失败的（2小时后将异步强制解关联）</li><li><code>ATTACHING</code>：关联中</li><li><code>DETACHING</code>：解关联中</li><li><code>DETACHFAILED</code>：解关联失败（2小时后将异步强制解关联）</li> 
     * @return State <p>关联实例状态：</p><li><code>PENDING</code>：申请中</li><li><code>ACTIVE</code>：已连接</li><li><code>EXPIRED</code>：已过期</li><li><code>REJECTED</code>：已拒绝</li><li><code>DELETED</code>：已删除</li><li><code>FAILED</code>：失败的（2小时后将异步强制解关联）</li><li><code>ATTACHING</code>：关联中</li><li><code>DETACHING</code>：解关联中</li><li><code>DETACHFAILED</code>：解关联失败（2小时后将异步强制解关联）</li>
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set <p>关联实例状态：</p><li><code>PENDING</code>：申请中</li><li><code>ACTIVE</code>：已连接</li><li><code>EXPIRED</code>：已过期</li><li><code>REJECTED</code>：已拒绝</li><li><code>DELETED</code>：已删除</li><li><code>FAILED</code>：失败的（2小时后将异步强制解关联）</li><li><code>ATTACHING</code>：关联中</li><li><code>DETACHING</code>：解关联中</li><li><code>DETACHFAILED</code>：解关联失败（2小时后将异步强制解关联）</li>
     * @param State <p>关联实例状态：</p><li><code>PENDING</code>：申请中</li><li><code>ACTIVE</code>：已连接</li><li><code>EXPIRED</code>：已过期</li><li><code>REJECTED</code>：已拒绝</li><li><code>DELETED</code>：已删除</li><li><code>FAILED</code>：失败的（2小时后将异步强制解关联）</li><li><code>ATTACHING</code>：关联中</li><li><code>DETACHING</code>：解关联中</li><li><code>DETACHFAILED</code>：解关联失败（2小时后将异步强制解关联）</li>
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get <p>别名类型</p> 
     * @return AliasType <p>别名类型</p>
     */
    public String getAliasType() {
        return this.AliasType;
    }

    /**
     * Set <p>别名类型</p>
     * @param AliasType <p>别名类型</p>
     */
    public void setAliasType(String AliasType) {
        this.AliasType = AliasType;
    }

    /**
     * Get <p>别名实例ID</p> 
     * @return AliasInstanceId <p>别名实例ID</p>
     */
    public String getAliasInstanceId() {
        return this.AliasInstanceId;
    }

    /**
     * Set <p>别名实例ID</p>
     * @param AliasInstanceId <p>别名实例ID</p>
     */
    public void setAliasInstanceId(String AliasInstanceId) {
        this.AliasInstanceId = AliasInstanceId;
    }

    public InstanceBind() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceBind(InstanceBind source) {
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceBindTime != null) {
            this.InstanceBindTime = new String(source.InstanceBindTime);
        }
        if (source.RouteTableId != null) {
            this.RouteTableId = new String(source.RouteTableId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceRegion != null) {
            this.InstanceRegion = new String(source.InstanceRegion);
        }
        if (source.InstanceUin != null) {
            this.InstanceUin = new String(source.InstanceUin);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.AliasType != null) {
            this.AliasType = new String(source.AliasType);
        }
        if (source.AliasInstanceId != null) {
            this.AliasInstanceId = new String(source.AliasInstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceBindTime", this.InstanceBindTime);
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceRegion", this.InstanceRegion);
        this.setParamSimple(map, prefix + "InstanceUin", this.InstanceUin);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "AliasType", this.AliasType);
        this.setParamSimple(map, prefix + "AliasInstanceId", this.AliasInstanceId);

    }
}

