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

public class ModifyNFSScanConfRequest extends AbstractModel {

    /**
    * <p>是否开启NFS扫描 0 否 1 是 9未设置,和0一样是未开启</p>
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * <p>开启范围 0 自选主机 1 全部主机</p>
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>记录ID，新增时为0</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>正选quuid配置列表</p>
    */
    @SerializedName("IncludeQuuid")
    @Expose
    private String [] IncludeQuuid;

    /**
    * <p>反选quuid配置列表</p>
    */
    @SerializedName("ExcludeQuuid")
    @Expose
    private String [] ExcludeQuuid;

    /**
     * Get <p>是否开启NFS扫描 0 否 1 是 9未设置,和0一样是未开启</p> 
     * @return Enable <p>是否开启NFS扫描 0 否 1 是 9未设置,和0一样是未开启</p>
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>是否开启NFS扫描 0 否 1 是 9未设置,和0一样是未开启</p>
     * @param Enable <p>是否开启NFS扫描 0 否 1 是 9未设置,和0一样是未开启</p>
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
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
     * Get <p>记录ID，新增时为0</p> 
     * @return Id <p>记录ID，新增时为0</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>记录ID，新增时为0</p>
     * @param Id <p>记录ID，新增时为0</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>正选quuid配置列表</p> 
     * @return IncludeQuuid <p>正选quuid配置列表</p>
     */
    public String [] getIncludeQuuid() {
        return this.IncludeQuuid;
    }

    /**
     * Set <p>正选quuid配置列表</p>
     * @param IncludeQuuid <p>正选quuid配置列表</p>
     */
    public void setIncludeQuuid(String [] IncludeQuuid) {
        this.IncludeQuuid = IncludeQuuid;
    }

    /**
     * Get <p>反选quuid配置列表</p> 
     * @return ExcludeQuuid <p>反选quuid配置列表</p>
     */
    public String [] getExcludeQuuid() {
        return this.ExcludeQuuid;
    }

    /**
     * Set <p>反选quuid配置列表</p>
     * @param ExcludeQuuid <p>反选quuid配置列表</p>
     */
    public void setExcludeQuuid(String [] ExcludeQuuid) {
        this.ExcludeQuuid = ExcludeQuuid;
    }

    public ModifyNFSScanConfRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNFSScanConfRequest(ModifyNFSScanConfRequest source) {
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.IncludeQuuid != null) {
            this.IncludeQuuid = new String[source.IncludeQuuid.length];
            for (int i = 0; i < source.IncludeQuuid.length; i++) {
                this.IncludeQuuid[i] = new String(source.IncludeQuuid[i]);
            }
        }
        if (source.ExcludeQuuid != null) {
            this.ExcludeQuuid = new String[source.ExcludeQuuid.length];
            for (int i = 0; i < source.ExcludeQuuid.length; i++) {
                this.ExcludeQuuid[i] = new String(source.ExcludeQuuid[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArraySimple(map, prefix + "IncludeQuuid.", this.IncludeQuuid);
        this.setParamArraySimple(map, prefix + "ExcludeQuuid.", this.ExcludeQuuid);

    }
}

