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

public class CcnAttachedInstance extends AbstractModel {

    /**
    * <p>云联网实例ID。</p>
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * <p>关联实例类型：</p><li><code>VPC</code>：私有网络</li><li><code>DIRECTCONNECT</code>：专线网关</li><li><code>BMVPC</code>：黑石私有网络</li>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>关联实例ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>关联实例名称。</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>关联实例所属大区，例如：ap-guangzhou。</p>
    */
    @SerializedName("InstanceRegion")
    @Expose
    private String InstanceRegion;

    /**
    * <p>关联实例所属UIN（根账号）。</p>
    */
    @SerializedName("InstanceUin")
    @Expose
    private String InstanceUin;

    /**
    * <p>关联实例CIDR。</p>
    */
    @SerializedName("CidrBlock")
    @Expose
    private String [] CidrBlock;

    /**
    * <p>关联实例状态：</p><li><code>PENDING</code>：申请中</li><li><code>ACTIVE</code>：已连接</li><li><code>EXPIRED</code>：已过期</li><li><code>REJECTED</code>：已拒绝</li><li><code>DELETED</code>：已删除</li><li><code>FAILED</code>：失败的（2小时后将异步强制解关联）</li><li><code>ATTACHING</code>：关联中</li><li><code>DETACHING</code>：解关联中</li><li><code>DETACHFAILED</code>：解关联失败（2小时后将异步强制解关联）</li>
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * <p>关联时间。</p>
    */
    @SerializedName("AttachedTime")
    @Expose
    private String AttachedTime;

    /**
    * <p>云联网所属UIN（根账号）。</p>
    */
    @SerializedName("CcnUin")
    @Expose
    private String CcnUin;

    /**
    * <p>关联实例所属的大地域，如: CHINA_MAINLAND</p>
    */
    @SerializedName("InstanceArea")
    @Expose
    private String InstanceArea;

    /**
    * <p>备注</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>路由表ID</p>
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
    * <p>路由表名称</p>
    */
    @SerializedName("RouteTableName")
    @Expose
    private String RouteTableName;

    /**
    * <p>别名类型</p>
    */
    @SerializedName("AliasType")
    @Expose
    private String AliasType;

    /**
    * <p>别名ID</p>
    */
    @SerializedName("AliasInstanceId")
    @Expose
    private String AliasInstanceId;

    /**
     * Get <p>云联网实例ID。</p> 
     * @return CcnId <p>云联网实例ID。</p>
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set <p>云联网实例ID。</p>
     * @param CcnId <p>云联网实例ID。</p>
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get <p>关联实例类型：</p><li><code>VPC</code>：私有网络</li><li><code>DIRECTCONNECT</code>：专线网关</li><li><code>BMVPC</code>：黑石私有网络</li> 
     * @return InstanceType <p>关联实例类型：</p><li><code>VPC</code>：私有网络</li><li><code>DIRECTCONNECT</code>：专线网关</li><li><code>BMVPC</code>：黑石私有网络</li>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>关联实例类型：</p><li><code>VPC</code>：私有网络</li><li><code>DIRECTCONNECT</code>：专线网关</li><li><code>BMVPC</code>：黑石私有网络</li>
     * @param InstanceType <p>关联实例类型：</p><li><code>VPC</code>：私有网络</li><li><code>DIRECTCONNECT</code>：专线网关</li><li><code>BMVPC</code>：黑石私有网络</li>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>关联实例ID。</p> 
     * @return InstanceId <p>关联实例ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>关联实例ID。</p>
     * @param InstanceId <p>关联实例ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>关联实例名称。</p> 
     * @return InstanceName <p>关联实例名称。</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>关联实例名称。</p>
     * @param InstanceName <p>关联实例名称。</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>关联实例所属大区，例如：ap-guangzhou。</p> 
     * @return InstanceRegion <p>关联实例所属大区，例如：ap-guangzhou。</p>
     */
    public String getInstanceRegion() {
        return this.InstanceRegion;
    }

    /**
     * Set <p>关联实例所属大区，例如：ap-guangzhou。</p>
     * @param InstanceRegion <p>关联实例所属大区，例如：ap-guangzhou。</p>
     */
    public void setInstanceRegion(String InstanceRegion) {
        this.InstanceRegion = InstanceRegion;
    }

    /**
     * Get <p>关联实例所属UIN（根账号）。</p> 
     * @return InstanceUin <p>关联实例所属UIN（根账号）。</p>
     */
    public String getInstanceUin() {
        return this.InstanceUin;
    }

    /**
     * Set <p>关联实例所属UIN（根账号）。</p>
     * @param InstanceUin <p>关联实例所属UIN（根账号）。</p>
     */
    public void setInstanceUin(String InstanceUin) {
        this.InstanceUin = InstanceUin;
    }

    /**
     * Get <p>关联实例CIDR。</p> 
     * @return CidrBlock <p>关联实例CIDR。</p>
     */
    public String [] getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set <p>关联实例CIDR。</p>
     * @param CidrBlock <p>关联实例CIDR。</p>
     */
    public void setCidrBlock(String [] CidrBlock) {
        this.CidrBlock = CidrBlock;
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
     * Get <p>关联时间。</p> 
     * @return AttachedTime <p>关联时间。</p>
     */
    public String getAttachedTime() {
        return this.AttachedTime;
    }

    /**
     * Set <p>关联时间。</p>
     * @param AttachedTime <p>关联时间。</p>
     */
    public void setAttachedTime(String AttachedTime) {
        this.AttachedTime = AttachedTime;
    }

    /**
     * Get <p>云联网所属UIN（根账号）。</p> 
     * @return CcnUin <p>云联网所属UIN（根账号）。</p>
     */
    public String getCcnUin() {
        return this.CcnUin;
    }

    /**
     * Set <p>云联网所属UIN（根账号）。</p>
     * @param CcnUin <p>云联网所属UIN（根账号）。</p>
     */
    public void setCcnUin(String CcnUin) {
        this.CcnUin = CcnUin;
    }

    /**
     * Get <p>关联实例所属的大地域，如: CHINA_MAINLAND</p> 
     * @return InstanceArea <p>关联实例所属的大地域，如: CHINA_MAINLAND</p>
     */
    public String getInstanceArea() {
        return this.InstanceArea;
    }

    /**
     * Set <p>关联实例所属的大地域，如: CHINA_MAINLAND</p>
     * @param InstanceArea <p>关联实例所属的大地域，如: CHINA_MAINLAND</p>
     */
    public void setInstanceArea(String InstanceArea) {
        this.InstanceArea = InstanceArea;
    }

    /**
     * Get <p>备注</p> 
     * @return Description <p>备注</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>备注</p>
     * @param Description <p>备注</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>路由表ID</p> 
     * @return RouteTableId <p>路由表ID</p>
     */
    public String getRouteTableId() {
        return this.RouteTableId;
    }

    /**
     * Set <p>路由表ID</p>
     * @param RouteTableId <p>路由表ID</p>
     */
    public void setRouteTableId(String RouteTableId) {
        this.RouteTableId = RouteTableId;
    }

    /**
     * Get <p>路由表名称</p> 
     * @return RouteTableName <p>路由表名称</p>
     */
    public String getRouteTableName() {
        return this.RouteTableName;
    }

    /**
     * Set <p>路由表名称</p>
     * @param RouteTableName <p>路由表名称</p>
     */
    public void setRouteTableName(String RouteTableName) {
        this.RouteTableName = RouteTableName;
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
     * Get <p>别名ID</p> 
     * @return AliasInstanceId <p>别名ID</p>
     */
    public String getAliasInstanceId() {
        return this.AliasInstanceId;
    }

    /**
     * Set <p>别名ID</p>
     * @param AliasInstanceId <p>别名ID</p>
     */
    public void setAliasInstanceId(String AliasInstanceId) {
        this.AliasInstanceId = AliasInstanceId;
    }

    public CcnAttachedInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CcnAttachedInstance(CcnAttachedInstance source) {
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
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
        if (source.CidrBlock != null) {
            this.CidrBlock = new String[source.CidrBlock.length];
            for (int i = 0; i < source.CidrBlock.length; i++) {
                this.CidrBlock[i] = new String(source.CidrBlock[i]);
            }
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.AttachedTime != null) {
            this.AttachedTime = new String(source.AttachedTime);
        }
        if (source.CcnUin != null) {
            this.CcnUin = new String(source.CcnUin);
        }
        if (source.InstanceArea != null) {
            this.InstanceArea = new String(source.InstanceArea);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RouteTableId != null) {
            this.RouteTableId = new String(source.RouteTableId);
        }
        if (source.RouteTableName != null) {
            this.RouteTableName = new String(source.RouteTableName);
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
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceRegion", this.InstanceRegion);
        this.setParamSimple(map, prefix + "InstanceUin", this.InstanceUin);
        this.setParamArraySimple(map, prefix + "CidrBlock.", this.CidrBlock);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "AttachedTime", this.AttachedTime);
        this.setParamSimple(map, prefix + "CcnUin", this.CcnUin);
        this.setParamSimple(map, prefix + "InstanceArea", this.InstanceArea);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);
        this.setParamSimple(map, prefix + "RouteTableName", this.RouteTableName);
        this.setParamSimple(map, prefix + "AliasType", this.AliasType);
        this.setParamSimple(map, prefix + "AliasInstanceId", this.AliasInstanceId);

    }
}

