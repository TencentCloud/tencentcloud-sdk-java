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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetAttackWhiteRule extends AbstractModel {

    /**
    * 规则id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 规则描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 0: 一组quuid 1: 所有主机
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * 是否处理之前的事件 0: 不处理 1:处理
    */
    @SerializedName("DealOldEvents")
    @Expose
    private Long DealOldEvents;

    /**
    * 主机quuid 多个用;隔开
    */
    @SerializedName("Quuids")
    @Expose
    private String Quuids;

    /**
    * 来源IP 单IP:1.1.1.1  IP范围:1.1.1.1-1.1.2.1  IP范围：1.1.1.0/24 多个用;隔开
    */
    @SerializedName("SrcIP")
    @Expose
    private String SrcIP;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get 规则id 
     * @return Id 规则id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 规则id
     * @param Id 规则id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 规则描述 
     * @return Description 规则描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 规则描述
     * @param Description 规则描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 0: 一组quuid 1: 所有主机 
     * @return Scope 0: 一组quuid 1: 所有主机
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set 0: 一组quuid 1: 所有主机
     * @param Scope 0: 一组quuid 1: 所有主机
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get 是否处理之前的事件 0: 不处理 1:处理 
     * @return DealOldEvents 是否处理之前的事件 0: 不处理 1:处理
     */
    public Long getDealOldEvents() {
        return this.DealOldEvents;
    }

    /**
     * Set 是否处理之前的事件 0: 不处理 1:处理
     * @param DealOldEvents 是否处理之前的事件 0: 不处理 1:处理
     */
    public void setDealOldEvents(Long DealOldEvents) {
        this.DealOldEvents = DealOldEvents;
    }

    /**
     * Get 主机quuid 多个用;隔开 
     * @return Quuids 主机quuid 多个用;隔开
     */
    public String getQuuids() {
        return this.Quuids;
    }

    /**
     * Set 主机quuid 多个用;隔开
     * @param Quuids 主机quuid 多个用;隔开
     */
    public void setQuuids(String Quuids) {
        this.Quuids = Quuids;
    }

    /**
     * Get 来源IP 单IP:1.1.1.1  IP范围:1.1.1.1-1.1.2.1  IP范围：1.1.1.0/24 多个用;隔开 
     * @return SrcIP 来源IP 单IP:1.1.1.1  IP范围:1.1.1.1-1.1.2.1  IP范围：1.1.1.0/24 多个用;隔开
     */
    public String getSrcIP() {
        return this.SrcIP;
    }

    /**
     * Set 来源IP 单IP:1.1.1.1  IP范围:1.1.1.1-1.1.2.1  IP范围：1.1.1.0/24 多个用;隔开
     * @param SrcIP 来源IP 单IP:1.1.1.1  IP范围:1.1.1.1-1.1.2.1  IP范围：1.1.1.0/24 多个用;隔开
     */
    public void setSrcIP(String SrcIP) {
        this.SrcIP = SrcIP;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间 
     * @return ModifyTime 修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
     * @param ModifyTime 修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public NetAttackWhiteRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetAttackWhiteRule(NetAttackWhiteRule source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.DealOldEvents != null) {
            this.DealOldEvents = new Long(source.DealOldEvents);
        }
        if (source.Quuids != null) {
            this.Quuids = new String(source.Quuids);
        }
        if (source.SrcIP != null) {
            this.SrcIP = new String(source.SrcIP);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "DealOldEvents", this.DealOldEvents);
        this.setParamSimple(map, prefix + "Quuids", this.Quuids);
        this.setParamSimple(map, prefix + "SrcIP", this.SrcIP);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

