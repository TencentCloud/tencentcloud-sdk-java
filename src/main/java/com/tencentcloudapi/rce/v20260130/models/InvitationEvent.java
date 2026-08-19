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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InvitationEvent extends AbstractModel {

    /**
    * <p>受邀请人ID</p>
    */
    @SerializedName("InviteeUserId")
    @Expose
    private String InviteeUserId;

    /**
    * <p>营销活动ID</p>
    */
    @SerializedName("PromotionId")
    @Expose
    private String PromotionId;

    /**
    * <p>营销活动名称</p>
    */
    @SerializedName("PromotionName")
    @Expose
    private String PromotionName;

    /**
    * <p>营销活动描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>受邀请人电话号码</p><p>参数格式：符合E.164标准的带“+”、地区编码和号码的格式</p>
    */
    @SerializedName("InviteePhone")
    @Expose
    private String InviteePhone;

    /**
    * <p>邀请码</p>
    */
    @SerializedName("InvitationCode")
    @Expose
    private String InvitationCode;

    /**
    * <p>邀请链接</p>
    */
    @SerializedName("InvitationUrl")
    @Expose
    private String InvitationUrl;

    /**
    * <p>邀请渠道，如微信、抖音、小红书等</p>
    */
    @SerializedName("InvitationChannel")
    @Expose
    private String InvitationChannel;

    /**
    * <p>与RCE约定的定制化信息，为K:V 格式的对象数组，示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p>
    */
    @SerializedName("Cust")
    @Expose
    private Cust [] Cust;

    /**
     * Get <p>受邀请人ID</p> 
     * @return InviteeUserId <p>受邀请人ID</p>
     */
    public String getInviteeUserId() {
        return this.InviteeUserId;
    }

    /**
     * Set <p>受邀请人ID</p>
     * @param InviteeUserId <p>受邀请人ID</p>
     */
    public void setInviteeUserId(String InviteeUserId) {
        this.InviteeUserId = InviteeUserId;
    }

    /**
     * Get <p>营销活动ID</p> 
     * @return PromotionId <p>营销活动ID</p>
     */
    public String getPromotionId() {
        return this.PromotionId;
    }

    /**
     * Set <p>营销活动ID</p>
     * @param PromotionId <p>营销活动ID</p>
     */
    public void setPromotionId(String PromotionId) {
        this.PromotionId = PromotionId;
    }

    /**
     * Get <p>营销活动名称</p> 
     * @return PromotionName <p>营销活动名称</p>
     */
    public String getPromotionName() {
        return this.PromotionName;
    }

    /**
     * Set <p>营销活动名称</p>
     * @param PromotionName <p>营销活动名称</p>
     */
    public void setPromotionName(String PromotionName) {
        this.PromotionName = PromotionName;
    }

    /**
     * Get <p>营销活动描述</p> 
     * @return Description <p>营销活动描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>营销活动描述</p>
     * @param Description <p>营销活动描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>受邀请人电话号码</p><p>参数格式：符合E.164标准的带“+”、地区编码和号码的格式</p> 
     * @return InviteePhone <p>受邀请人电话号码</p><p>参数格式：符合E.164标准的带“+”、地区编码和号码的格式</p>
     */
    public String getInviteePhone() {
        return this.InviteePhone;
    }

    /**
     * Set <p>受邀请人电话号码</p><p>参数格式：符合E.164标准的带“+”、地区编码和号码的格式</p>
     * @param InviteePhone <p>受邀请人电话号码</p><p>参数格式：符合E.164标准的带“+”、地区编码和号码的格式</p>
     */
    public void setInviteePhone(String InviteePhone) {
        this.InviteePhone = InviteePhone;
    }

    /**
     * Get <p>邀请码</p> 
     * @return InvitationCode <p>邀请码</p>
     */
    public String getInvitationCode() {
        return this.InvitationCode;
    }

    /**
     * Set <p>邀请码</p>
     * @param InvitationCode <p>邀请码</p>
     */
    public void setInvitationCode(String InvitationCode) {
        this.InvitationCode = InvitationCode;
    }

    /**
     * Get <p>邀请链接</p> 
     * @return InvitationUrl <p>邀请链接</p>
     */
    public String getInvitationUrl() {
        return this.InvitationUrl;
    }

    /**
     * Set <p>邀请链接</p>
     * @param InvitationUrl <p>邀请链接</p>
     */
    public void setInvitationUrl(String InvitationUrl) {
        this.InvitationUrl = InvitationUrl;
    }

    /**
     * Get <p>邀请渠道，如微信、抖音、小红书等</p> 
     * @return InvitationChannel <p>邀请渠道，如微信、抖音、小红书等</p>
     */
    public String getInvitationChannel() {
        return this.InvitationChannel;
    }

    /**
     * Set <p>邀请渠道，如微信、抖音、小红书等</p>
     * @param InvitationChannel <p>邀请渠道，如微信、抖音、小红书等</p>
     */
    public void setInvitationChannel(String InvitationChannel) {
        this.InvitationChannel = InvitationChannel;
    }

    /**
     * Get <p>与RCE约定的定制化信息，为K:V 格式的对象数组，示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p> 
     * @return Cust <p>与RCE约定的定制化信息，为K:V 格式的对象数组，示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p>
     */
    public Cust [] getCust() {
        return this.Cust;
    }

    /**
     * Set <p>与RCE约定的定制化信息，为K:V 格式的对象数组，示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p>
     * @param Cust <p>与RCE约定的定制化信息，为K:V 格式的对象数组，示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p>
     */
    public void setCust(Cust [] Cust) {
        this.Cust = Cust;
    }

    public InvitationEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InvitationEvent(InvitationEvent source) {
        if (source.InviteeUserId != null) {
            this.InviteeUserId = new String(source.InviteeUserId);
        }
        if (source.PromotionId != null) {
            this.PromotionId = new String(source.PromotionId);
        }
        if (source.PromotionName != null) {
            this.PromotionName = new String(source.PromotionName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.InviteePhone != null) {
            this.InviteePhone = new String(source.InviteePhone);
        }
        if (source.InvitationCode != null) {
            this.InvitationCode = new String(source.InvitationCode);
        }
        if (source.InvitationUrl != null) {
            this.InvitationUrl = new String(source.InvitationUrl);
        }
        if (source.InvitationChannel != null) {
            this.InvitationChannel = new String(source.InvitationChannel);
        }
        if (source.Cust != null) {
            this.Cust = new Cust[source.Cust.length];
            for (int i = 0; i < source.Cust.length; i++) {
                this.Cust[i] = new Cust(source.Cust[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InviteeUserId", this.InviteeUserId);
        this.setParamSimple(map, prefix + "PromotionId", this.PromotionId);
        this.setParamSimple(map, prefix + "PromotionName", this.PromotionName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "InviteePhone", this.InviteePhone);
        this.setParamSimple(map, prefix + "InvitationCode", this.InvitationCode);
        this.setParamSimple(map, prefix + "InvitationUrl", this.InvitationUrl);
        this.setParamSimple(map, prefix + "InvitationChannel", this.InvitationChannel);
        this.setParamArrayObj(map, prefix + "Cust.", this.Cust);

    }
}

