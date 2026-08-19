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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyMachinesLoginTypeRequest extends AbstractModel {

    /**
    * <p>登录方式：0-原始方式，1-扫码免密登录</p>
    */
    @SerializedName("LoginType")
    @Expose
    private Long LoginType;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>instance_id列表(instance_ids和quuids至少要填一个)</p>
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * <p>主机quuid列表(instance_ids和quuids至少要填一个)</p>
    */
    @SerializedName("Quuids")
    @Expose
    private String [] Quuids;

    /**
    * <p>排除的quuid集合</p>
    */
    @SerializedName("ExcludeQuuid")
    @Expose
    private String [] ExcludeQuuid;

    /**
    * <p>开启范围 0 自选主机 1 全部主机</p>
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * <p>操作来源 :<br>0   主机页面<br>1   客户端设置页面<br>2   安全中心页面<br>3   LightHouse购买页<br>4   LightHouse控制台</p>
    */
    @SerializedName("From")
    @Expose
    private Long From;

    /**
    * <p>请求版本 0   原始版本 1   策略式请求</p>
    */
    @SerializedName("RequestVersion")
    @Expose
    private Long RequestVersion;

    /**
     * Get <p>登录方式：0-原始方式，1-扫码免密登录</p> 
     * @return LoginType <p>登录方式：0-原始方式，1-扫码免密登录</p>
     */
    public Long getLoginType() {
        return this.LoginType;
    }

    /**
     * Set <p>登录方式：0-原始方式，1-扫码免密登录</p>
     * @param LoginType <p>登录方式：0-原始方式，1-扫码免密登录</p>
     */
    public void setLoginType(Long LoginType) {
        this.LoginType = LoginType;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>instance_id列表(instance_ids和quuids至少要填一个)</p> 
     * @return InstanceIds <p>instance_id列表(instance_ids和quuids至少要填一个)</p>
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set <p>instance_id列表(instance_ids和quuids至少要填一个)</p>
     * @param InstanceIds <p>instance_id列表(instance_ids和quuids至少要填一个)</p>
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get <p>主机quuid列表(instance_ids和quuids至少要填一个)</p> 
     * @return Quuids <p>主机quuid列表(instance_ids和quuids至少要填一个)</p>
     */
    public String [] getQuuids() {
        return this.Quuids;
    }

    /**
     * Set <p>主机quuid列表(instance_ids和quuids至少要填一个)</p>
     * @param Quuids <p>主机quuid列表(instance_ids和quuids至少要填一个)</p>
     */
    public void setQuuids(String [] Quuids) {
        this.Quuids = Quuids;
    }

    /**
     * Get <p>排除的quuid集合</p> 
     * @return ExcludeQuuid <p>排除的quuid集合</p>
     */
    public String [] getExcludeQuuid() {
        return this.ExcludeQuuid;
    }

    /**
     * Set <p>排除的quuid集合</p>
     * @param ExcludeQuuid <p>排除的quuid集合</p>
     */
    public void setExcludeQuuid(String [] ExcludeQuuid) {
        this.ExcludeQuuid = ExcludeQuuid;
    }

    /**
     * Get <p>开启范围 0 自选主机 1 全部主机</p> 
     * @return Scope <p>开启范围 0 自选主机 1 全部主机</p>
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set <p>开启范围 0 自选主机 1 全部主机</p>
     * @param Scope <p>开启范围 0 自选主机 1 全部主机</p>
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <p>操作来源 :<br>0   主机页面<br>1   客户端设置页面<br>2   安全中心页面<br>3   LightHouse购买页<br>4   LightHouse控制台</p> 
     * @return From <p>操作来源 :<br>0   主机页面<br>1   客户端设置页面<br>2   安全中心页面<br>3   LightHouse购买页<br>4   LightHouse控制台</p>
     */
    public Long getFrom() {
        return this.From;
    }

    /**
     * Set <p>操作来源 :<br>0   主机页面<br>1   客户端设置页面<br>2   安全中心页面<br>3   LightHouse购买页<br>4   LightHouse控制台</p>
     * @param From <p>操作来源 :<br>0   主机页面<br>1   客户端设置页面<br>2   安全中心页面<br>3   LightHouse购买页<br>4   LightHouse控制台</p>
     */
    public void setFrom(Long From) {
        this.From = From;
    }

    /**
     * Get <p>请求版本 0   原始版本 1   策略式请求</p> 
     * @return RequestVersion <p>请求版本 0   原始版本 1   策略式请求</p>
     */
    public Long getRequestVersion() {
        return this.RequestVersion;
    }

    /**
     * Set <p>请求版本 0   原始版本 1   策略式请求</p>
     * @param RequestVersion <p>请求版本 0   原始版本 1   策略式请求</p>
     */
    public void setRequestVersion(Long RequestVersion) {
        this.RequestVersion = RequestVersion;
    }

    public ModifyMachinesLoginTypeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMachinesLoginTypeRequest(ModifyMachinesLoginTypeRequest source) {
        if (source.LoginType != null) {
            this.LoginType = new Long(source.LoginType);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.Quuids != null) {
            this.Quuids = new String[source.Quuids.length];
            for (int i = 0; i < source.Quuids.length; i++) {
                this.Quuids[i] = new String(source.Quuids[i]);
            }
        }
        if (source.ExcludeQuuid != null) {
            this.ExcludeQuuid = new String[source.ExcludeQuuid.length];
            for (int i = 0; i < source.ExcludeQuuid.length; i++) {
                this.ExcludeQuuid[i] = new String(source.ExcludeQuuid[i]);
            }
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.From != null) {
            this.From = new Long(source.From);
        }
        if (source.RequestVersion != null) {
            this.RequestVersion = new Long(source.RequestVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoginType", this.LoginType);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArraySimple(map, prefix + "Quuids.", this.Quuids);
        this.setParamArraySimple(map, prefix + "ExcludeQuuid.", this.ExcludeQuuid);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "RequestVersion", this.RequestVersion);

    }
}

