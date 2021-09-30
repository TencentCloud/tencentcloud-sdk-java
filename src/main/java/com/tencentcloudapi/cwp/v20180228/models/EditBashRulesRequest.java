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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EditBashRulesRequest extends AbstractModel{

    /**
    * 规则ID（新增时不填）
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 客户端ID数组
    */
    @SerializedName("Uuids")
    @Expose
    private String [] Uuids;

    /**
    * 主机IP
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * 规则名称，编辑时不可修改规则名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 危险等级(0:无，1: 高危 2:中危 3: 低危)
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 正则表达式 ，编辑时不可修改正则表达式，需要对内容QueryEscape后再base64
    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

    /**
    * 是否全局规则(默认否)：1-全局，0-非全局
    */
    @SerializedName("IsGlobal")
    @Expose
    private Long IsGlobal;

    /**
    * 0=黑名单， 1=白名单
    */
    @SerializedName("White")
    @Expose
    private Long White;

    /**
    * 事件列表点击“加入白名单”时,需要传EventId 事件的id
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * 是否处理旧事件为白名单 0=不处理 1=处理
    */
    @SerializedName("DealOldEvents")
    @Expose
    private Long DealOldEvents;

    /**
     * Get 规则ID（新增时不填） 
     * @return Id 规则ID（新增时不填）
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 规则ID（新增时不填）
     * @param Id 规则ID（新增时不填）
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 客户端ID数组 
     * @return Uuids 客户端ID数组
     */
    public String [] getUuids() {
        return this.Uuids;
    }

    /**
     * Set 客户端ID数组
     * @param Uuids 客户端ID数组
     */
    public void setUuids(String [] Uuids) {
        this.Uuids = Uuids;
    }

    /**
     * Get 主机IP 
     * @return HostIp 主机IP
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set 主机IP
     * @param HostIp 主机IP
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get 规则名称，编辑时不可修改规则名称 
     * @return Name 规则名称，编辑时不可修改规则名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 规则名称，编辑时不可修改规则名称
     * @param Name 规则名称，编辑时不可修改规则名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 危险等级(0:无，1: 高危 2:中危 3: 低危) 
     * @return Level 危险等级(0:无，1: 高危 2:中危 3: 低危)
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 危险等级(0:无，1: 高危 2:中危 3: 低危)
     * @param Level 危险等级(0:无，1: 高危 2:中危 3: 低危)
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 正则表达式 ，编辑时不可修改正则表达式，需要对内容QueryEscape后再base64 
     * @return Rule 正则表达式 ，编辑时不可修改正则表达式，需要对内容QueryEscape后再base64
     */
    public String getRule() {
        return this.Rule;
    }

    /**
     * Set 正则表达式 ，编辑时不可修改正则表达式，需要对内容QueryEscape后再base64
     * @param Rule 正则表达式 ，编辑时不可修改正则表达式，需要对内容QueryEscape后再base64
     */
    public void setRule(String Rule) {
        this.Rule = Rule;
    }

    /**
     * Get 是否全局规则(默认否)：1-全局，0-非全局 
     * @return IsGlobal 是否全局规则(默认否)：1-全局，0-非全局
     */
    public Long getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set 是否全局规则(默认否)：1-全局，0-非全局
     * @param IsGlobal 是否全局规则(默认否)：1-全局，0-非全局
     */
    public void setIsGlobal(Long IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get 0=黑名单， 1=白名单 
     * @return White 0=黑名单， 1=白名单
     */
    public Long getWhite() {
        return this.White;
    }

    /**
     * Set 0=黑名单， 1=白名单
     * @param White 0=黑名单， 1=白名单
     */
    public void setWhite(Long White) {
        this.White = White;
    }

    /**
     * Get 事件列表点击“加入白名单”时,需要传EventId 事件的id 
     * @return EventId 事件列表点击“加入白名单”时,需要传EventId 事件的id
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set 事件列表点击“加入白名单”时,需要传EventId 事件的id
     * @param EventId 事件列表点击“加入白名单”时,需要传EventId 事件的id
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get 是否处理旧事件为白名单 0=不处理 1=处理 
     * @return DealOldEvents 是否处理旧事件为白名单 0=不处理 1=处理
     */
    public Long getDealOldEvents() {
        return this.DealOldEvents;
    }

    /**
     * Set 是否处理旧事件为白名单 0=不处理 1=处理
     * @param DealOldEvents 是否处理旧事件为白名单 0=不处理 1=处理
     */
    public void setDealOldEvents(Long DealOldEvents) {
        this.DealOldEvents = DealOldEvents;
    }

    public EditBashRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EditBashRulesRequest(EditBashRulesRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uuids != null) {
            this.Uuids = new String[source.Uuids.length];
            for (int i = 0; i < source.Uuids.length; i++) {
                this.Uuids[i] = new String(source.Uuids[i]);
            }
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Rule != null) {
            this.Rule = new String(source.Rule);
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Long(source.IsGlobal);
        }
        if (source.White != null) {
            this.White = new Long(source.White);
        }
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
        if (source.DealOldEvents != null) {
            this.DealOldEvents = new Long(source.DealOldEvents);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArraySimple(map, prefix + "Uuids.", this.Uuids);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Rule", this.Rule);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamSimple(map, prefix + "White", this.White);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "DealOldEvents", this.DealOldEvents);

    }
}

