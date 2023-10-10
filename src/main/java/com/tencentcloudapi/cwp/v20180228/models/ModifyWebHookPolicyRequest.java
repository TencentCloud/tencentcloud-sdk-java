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

public class ModifyWebHookPolicyRequest extends AbstractModel{

    /**
    * id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 策略名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 事件类型
    */
    @SerializedName("Events")
    @Expose
    private WebHookEventKv [] Events;

    /**
    * 主机范围
    */
    @SerializedName("HostLabels")
    @Expose
    private WebHookHostLabel [] HostLabels;

    /**
    * 接收人
    */
    @SerializedName("Receivers")
    @Expose
    private WebHookReceiver [] Receivers;

    /**
    * 格式 0text 1json
    */
    @SerializedName("Format")
    @Expose
    private Long Format;

    /**
    * 自定义透传字段
    */
    @SerializedName("CustomFields")
    @Expose
    private WebHookCustomField [] CustomFields;

    /**
    * 是否启用[1:禁用|0:启用]
    */
    @SerializedName("IsDisabled")
    @Expose
    private Long IsDisabled;

    /**
    * 主机列表
    */
    @SerializedName("Quuids")
    @Expose
    private String [] Quuids;

    /**
     * Get id 
     * @return Id id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set id
     * @param Id id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 策略名称 
     * @return Name 策略名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 策略名称
     * @param Name 策略名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 事件类型 
     * @return Events 事件类型
     */
    public WebHookEventKv [] getEvents() {
        return this.Events;
    }

    /**
     * Set 事件类型
     * @param Events 事件类型
     */
    public void setEvents(WebHookEventKv [] Events) {
        this.Events = Events;
    }

    /**
     * Get 主机范围 
     * @return HostLabels 主机范围
     */
    public WebHookHostLabel [] getHostLabels() {
        return this.HostLabels;
    }

    /**
     * Set 主机范围
     * @param HostLabels 主机范围
     */
    public void setHostLabels(WebHookHostLabel [] HostLabels) {
        this.HostLabels = HostLabels;
    }

    /**
     * Get 接收人 
     * @return Receivers 接收人
     */
    public WebHookReceiver [] getReceivers() {
        return this.Receivers;
    }

    /**
     * Set 接收人
     * @param Receivers 接收人
     */
    public void setReceivers(WebHookReceiver [] Receivers) {
        this.Receivers = Receivers;
    }

    /**
     * Get 格式 0text 1json 
     * @return Format 格式 0text 1json
     */
    public Long getFormat() {
        return this.Format;
    }

    /**
     * Set 格式 0text 1json
     * @param Format 格式 0text 1json
     */
    public void setFormat(Long Format) {
        this.Format = Format;
    }

    /**
     * Get 自定义透传字段 
     * @return CustomFields 自定义透传字段
     */
    public WebHookCustomField [] getCustomFields() {
        return this.CustomFields;
    }

    /**
     * Set 自定义透传字段
     * @param CustomFields 自定义透传字段
     */
    public void setCustomFields(WebHookCustomField [] CustomFields) {
        this.CustomFields = CustomFields;
    }

    /**
     * Get 是否启用[1:禁用|0:启用] 
     * @return IsDisabled 是否启用[1:禁用|0:启用]
     */
    public Long getIsDisabled() {
        return this.IsDisabled;
    }

    /**
     * Set 是否启用[1:禁用|0:启用]
     * @param IsDisabled 是否启用[1:禁用|0:启用]
     */
    public void setIsDisabled(Long IsDisabled) {
        this.IsDisabled = IsDisabled;
    }

    /**
     * Get 主机列表 
     * @return Quuids 主机列表
     */
    public String [] getQuuids() {
        return this.Quuids;
    }

    /**
     * Set 主机列表
     * @param Quuids 主机列表
     */
    public void setQuuids(String [] Quuids) {
        this.Quuids = Quuids;
    }

    public ModifyWebHookPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyWebHookPolicyRequest(ModifyWebHookPolicyRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Events != null) {
            this.Events = new WebHookEventKv[source.Events.length];
            for (int i = 0; i < source.Events.length; i++) {
                this.Events[i] = new WebHookEventKv(source.Events[i]);
            }
        }
        if (source.HostLabels != null) {
            this.HostLabels = new WebHookHostLabel[source.HostLabels.length];
            for (int i = 0; i < source.HostLabels.length; i++) {
                this.HostLabels[i] = new WebHookHostLabel(source.HostLabels[i]);
            }
        }
        if (source.Receivers != null) {
            this.Receivers = new WebHookReceiver[source.Receivers.length];
            for (int i = 0; i < source.Receivers.length; i++) {
                this.Receivers[i] = new WebHookReceiver(source.Receivers[i]);
            }
        }
        if (source.Format != null) {
            this.Format = new Long(source.Format);
        }
        if (source.CustomFields != null) {
            this.CustomFields = new WebHookCustomField[source.CustomFields.length];
            for (int i = 0; i < source.CustomFields.length; i++) {
                this.CustomFields[i] = new WebHookCustomField(source.CustomFields[i]);
            }
        }
        if (source.IsDisabled != null) {
            this.IsDisabled = new Long(source.IsDisabled);
        }
        if (source.Quuids != null) {
            this.Quuids = new String[source.Quuids.length];
            for (int i = 0; i < source.Quuids.length; i++) {
                this.Quuids[i] = new String(source.Quuids[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Events.", this.Events);
        this.setParamArrayObj(map, prefix + "HostLabels.", this.HostLabels);
        this.setParamArrayObj(map, prefix + "Receivers.", this.Receivers);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamArrayObj(map, prefix + "CustomFields.", this.CustomFields);
        this.setParamSimple(map, prefix + "IsDisabled", this.IsDisabled);
        this.setParamArraySimple(map, prefix + "Quuids.", this.Quuids);

    }
}

