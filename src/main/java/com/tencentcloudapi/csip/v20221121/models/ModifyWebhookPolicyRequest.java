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

public class ModifyWebhookPolicyRequest extends AbstractModel {

    /**
    * <p>策略名称<br>入参限制：长度 1-20 个字符，租户内唯一</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>启用状态<br>枚举值：<br>ON：启用<br>OFF：禁用</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>通知项列表<br>入参限制：至少 1 项，Module/SubModule 必须为 DescribeWebhookNotifyItemTree 返回的合法组合</p>
    */
    @SerializedName("NotifyItems")
    @Expose
    private WebhookNotifyItem [] NotifyItems;

    /**
    * <p>通知资产范围</p>
    */
    @SerializedName("AssetScope")
    @Expose
    private WebhookAssetScope AssetScope;

    /**
    * <p>接收格式<br>枚举值：<br>TEXT：文本格式<br>JSON：JSON 格式</p>
    */
    @SerializedName("ReceiveFormat")
    @Expose
    private String ReceiveFormat;

    /**
    * <p>接收机器人 ID 列表<br>入参限制：至少 1 个，最多 50 个</p>
    */
    @SerializedName("ReceiverIDList")
    @Expose
    private Long [] ReceiverIDList;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>策略 ID。大于 0 表示修改；等于 0 或不传表示新增<br>默认值：0</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>推送语言<br>枚举值：<br>zh：中文<br>en：英文<br>默认值：国内站默认 zh，国际站默认 en</p>
    */
    @SerializedName("MsgLanguage")
    @Expose
    private String MsgLanguage;

    /**
    * <p>自定义透传字段列表<br>入参限制：EnableCustomFields=true 时必填，最多 20 个</p>
    */
    @SerializedName("CustomFields")
    @Expose
    private WebhookCustomField [] CustomFields;

    /**
     * Get <p>策略名称<br>入参限制：长度 1-20 个字符，租户内唯一</p> 
     * @return Name <p>策略名称<br>入参限制：长度 1-20 个字符，租户内唯一</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>策略名称<br>入参限制：长度 1-20 个字符，租户内唯一</p>
     * @param Name <p>策略名称<br>入参限制：长度 1-20 个字符，租户内唯一</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>启用状态<br>枚举值：<br>ON：启用<br>OFF：禁用</p> 
     * @return Status <p>启用状态<br>枚举值：<br>ON：启用<br>OFF：禁用</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>启用状态<br>枚举值：<br>ON：启用<br>OFF：禁用</p>
     * @param Status <p>启用状态<br>枚举值：<br>ON：启用<br>OFF：禁用</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>通知项列表<br>入参限制：至少 1 项，Module/SubModule 必须为 DescribeWebhookNotifyItemTree 返回的合法组合</p> 
     * @return NotifyItems <p>通知项列表<br>入参限制：至少 1 项，Module/SubModule 必须为 DescribeWebhookNotifyItemTree 返回的合法组合</p>
     */
    public WebhookNotifyItem [] getNotifyItems() {
        return this.NotifyItems;
    }

    /**
     * Set <p>通知项列表<br>入参限制：至少 1 项，Module/SubModule 必须为 DescribeWebhookNotifyItemTree 返回的合法组合</p>
     * @param NotifyItems <p>通知项列表<br>入参限制：至少 1 项，Module/SubModule 必须为 DescribeWebhookNotifyItemTree 返回的合法组合</p>
     */
    public void setNotifyItems(WebhookNotifyItem [] NotifyItems) {
        this.NotifyItems = NotifyItems;
    }

    /**
     * Get <p>通知资产范围</p> 
     * @return AssetScope <p>通知资产范围</p>
     */
    public WebhookAssetScope getAssetScope() {
        return this.AssetScope;
    }

    /**
     * Set <p>通知资产范围</p>
     * @param AssetScope <p>通知资产范围</p>
     */
    public void setAssetScope(WebhookAssetScope AssetScope) {
        this.AssetScope = AssetScope;
    }

    /**
     * Get <p>接收格式<br>枚举值：<br>TEXT：文本格式<br>JSON：JSON 格式</p> 
     * @return ReceiveFormat <p>接收格式<br>枚举值：<br>TEXT：文本格式<br>JSON：JSON 格式</p>
     */
    public String getReceiveFormat() {
        return this.ReceiveFormat;
    }

    /**
     * Set <p>接收格式<br>枚举值：<br>TEXT：文本格式<br>JSON：JSON 格式</p>
     * @param ReceiveFormat <p>接收格式<br>枚举值：<br>TEXT：文本格式<br>JSON：JSON 格式</p>
     */
    public void setReceiveFormat(String ReceiveFormat) {
        this.ReceiveFormat = ReceiveFormat;
    }

    /**
     * Get <p>接收机器人 ID 列表<br>入参限制：至少 1 个，最多 50 个</p> 
     * @return ReceiverIDList <p>接收机器人 ID 列表<br>入参限制：至少 1 个，最多 50 个</p>
     */
    public Long [] getReceiverIDList() {
        return this.ReceiverIDList;
    }

    /**
     * Set <p>接收机器人 ID 列表<br>入参限制：至少 1 个，最多 50 个</p>
     * @param ReceiverIDList <p>接收机器人 ID 列表<br>入参限制：至少 1 个，最多 50 个</p>
     */
    public void setReceiverIDList(Long [] ReceiverIDList) {
        this.ReceiverIDList = ReceiverIDList;
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
     * Get <p>策略 ID。大于 0 表示修改；等于 0 或不传表示新增<br>默认值：0</p> 
     * @return ID <p>策略 ID。大于 0 表示修改；等于 0 或不传表示新增<br>默认值：0</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>策略 ID。大于 0 表示修改；等于 0 或不传表示新增<br>默认值：0</p>
     * @param ID <p>策略 ID。大于 0 表示修改；等于 0 或不传表示新增<br>默认值：0</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>推送语言<br>枚举值：<br>zh：中文<br>en：英文<br>默认值：国内站默认 zh，国际站默认 en</p> 
     * @return MsgLanguage <p>推送语言<br>枚举值：<br>zh：中文<br>en：英文<br>默认值：国内站默认 zh，国际站默认 en</p>
     */
    public String getMsgLanguage() {
        return this.MsgLanguage;
    }

    /**
     * Set <p>推送语言<br>枚举值：<br>zh：中文<br>en：英文<br>默认值：国内站默认 zh，国际站默认 en</p>
     * @param MsgLanguage <p>推送语言<br>枚举值：<br>zh：中文<br>en：英文<br>默认值：国内站默认 zh，国际站默认 en</p>
     */
    public void setMsgLanguage(String MsgLanguage) {
        this.MsgLanguage = MsgLanguage;
    }

    /**
     * Get <p>自定义透传字段列表<br>入参限制：EnableCustomFields=true 时必填，最多 20 个</p> 
     * @return CustomFields <p>自定义透传字段列表<br>入参限制：EnableCustomFields=true 时必填，最多 20 个</p>
     */
    public WebhookCustomField [] getCustomFields() {
        return this.CustomFields;
    }

    /**
     * Set <p>自定义透传字段列表<br>入参限制：EnableCustomFields=true 时必填，最多 20 个</p>
     * @param CustomFields <p>自定义透传字段列表<br>入参限制：EnableCustomFields=true 时必填，最多 20 个</p>
     */
    public void setCustomFields(WebhookCustomField [] CustomFields) {
        this.CustomFields = CustomFields;
    }

    public ModifyWebhookPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyWebhookPolicyRequest(ModifyWebhookPolicyRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.NotifyItems != null) {
            this.NotifyItems = new WebhookNotifyItem[source.NotifyItems.length];
            for (int i = 0; i < source.NotifyItems.length; i++) {
                this.NotifyItems[i] = new WebhookNotifyItem(source.NotifyItems[i]);
            }
        }
        if (source.AssetScope != null) {
            this.AssetScope = new WebhookAssetScope(source.AssetScope);
        }
        if (source.ReceiveFormat != null) {
            this.ReceiveFormat = new String(source.ReceiveFormat);
        }
        if (source.ReceiverIDList != null) {
            this.ReceiverIDList = new Long[source.ReceiverIDList.length];
            for (int i = 0; i < source.ReceiverIDList.length; i++) {
                this.ReceiverIDList[i] = new Long(source.ReceiverIDList[i]);
            }
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.MsgLanguage != null) {
            this.MsgLanguage = new String(source.MsgLanguage);
        }
        if (source.CustomFields != null) {
            this.CustomFields = new WebhookCustomField[source.CustomFields.length];
            for (int i = 0; i < source.CustomFields.length; i++) {
                this.CustomFields[i] = new WebhookCustomField(source.CustomFields[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "NotifyItems.", this.NotifyItems);
        this.setParamObj(map, prefix + "AssetScope.", this.AssetScope);
        this.setParamSimple(map, prefix + "ReceiveFormat", this.ReceiveFormat);
        this.setParamArraySimple(map, prefix + "ReceiverIDList.", this.ReceiverIDList);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "MsgLanguage", this.MsgLanguage);
        this.setParamArrayObj(map, prefix + "CustomFields.", this.CustomFields);

    }
}

