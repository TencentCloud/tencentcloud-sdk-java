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

public class CreateNetAttackWhiteListRequest extends AbstractModel {

    /**
    * 是否全部主机； 0否，1是。
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * 来源IP 单IP:1.1.1.1  IP范围:1.1.1.1-1.1.2.1  IP范围：1.1.1.0/24 
    */
    @SerializedName("SrcIp")
    @Expose
    private String [] SrcIp;

    /**
    * quuid 列表
    */
    @SerializedName("QuuidList")
    @Expose
    private String [] QuuidList;

    /**
    * 事件id
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * 是否加白所有符合该规则的告警 ，1:处理,0:不处理
    */
    @SerializedName("DealOldEvents")
    @Expose
    private Long DealOldEvents;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 是否全部主机； 0否，1是。 
     * @return Scope 是否全部主机； 0否，1是。
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set 是否全部主机； 0否，1是。
     * @param Scope 是否全部主机； 0否，1是。
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get 来源IP 单IP:1.1.1.1  IP范围:1.1.1.1-1.1.2.1  IP范围：1.1.1.0/24  
     * @return SrcIp 来源IP 单IP:1.1.1.1  IP范围:1.1.1.1-1.1.2.1  IP范围：1.1.1.0/24 
     */
    public String [] getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set 来源IP 单IP:1.1.1.1  IP范围:1.1.1.1-1.1.2.1  IP范围：1.1.1.0/24 
     * @param SrcIp 来源IP 单IP:1.1.1.1  IP范围:1.1.1.1-1.1.2.1  IP范围：1.1.1.0/24 
     */
    public void setSrcIp(String [] SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get quuid 列表 
     * @return QuuidList quuid 列表
     */
    public String [] getQuuidList() {
        return this.QuuidList;
    }

    /**
     * Set quuid 列表
     * @param QuuidList quuid 列表
     */
    public void setQuuidList(String [] QuuidList) {
        this.QuuidList = QuuidList;
    }

    /**
     * Get 事件id 
     * @return EventId 事件id
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set 事件id
     * @param EventId 事件id
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get 是否加白所有符合该规则的告警 ，1:处理,0:不处理 
     * @return DealOldEvents 是否加白所有符合该规则的告警 ，1:处理,0:不处理
     */
    public Long getDealOldEvents() {
        return this.DealOldEvents;
    }

    /**
     * Set 是否加白所有符合该规则的告警 ，1:处理,0:不处理
     * @param DealOldEvents 是否加白所有符合该规则的告警 ，1:处理,0:不处理
     */
    public void setDealOldEvents(Long DealOldEvents) {
        this.DealOldEvents = DealOldEvents;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateNetAttackWhiteListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateNetAttackWhiteListRequest(CreateNetAttackWhiteListRequest source) {
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.SrcIp != null) {
            this.SrcIp = new String[source.SrcIp.length];
            for (int i = 0; i < source.SrcIp.length; i++) {
                this.SrcIp[i] = new String(source.SrcIp[i]);
            }
        }
        if (source.QuuidList != null) {
            this.QuuidList = new String[source.QuuidList.length];
            for (int i = 0; i < source.QuuidList.length; i++) {
                this.QuuidList[i] = new String(source.QuuidList[i]);
            }
        }
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
        if (source.DealOldEvents != null) {
            this.DealOldEvents = new Long(source.DealOldEvents);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamArraySimple(map, prefix + "SrcIp.", this.SrcIp);
        this.setParamArraySimple(map, prefix + "QuuidList.", this.QuuidList);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "DealOldEvents", this.DealOldEvents);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

