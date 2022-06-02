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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Recipient extends AbstractModel{

    /**
    * 签署参与者ID
    */
    @SerializedName("RecipientId")
    @Expose
    private String RecipientId;

    /**
    * 参与者类型（ENTERPRISE/INDIVIDUAL）
    */
    @SerializedName("RecipientType")
    @Expose
    private String RecipientType;

    /**
    * 描述信息
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 角色名称
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * 是否需要验证，默认为false
    */
    @SerializedName("RequireValidation")
    @Expose
    private Boolean RequireValidation;

    /**
    * 是否需要签署，默认为true
    */
    @SerializedName("RequireSign")
    @Expose
    private Boolean RequireSign;

    /**
    * 添加序列
    */
    @SerializedName("RoutingOrder")
    @Expose
    private Long RoutingOrder;

    /**
    * 是否需要发送，默认为true
    */
    @SerializedName("RequireDelivery")
    @Expose
    private Boolean RequireDelivery;

    /**
    * 邮箱地址
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 电话号码
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 关联的用户ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 发送方式（EMAIL/MOBILE）
    */
    @SerializedName("DeliveryMethod")
    @Expose
    private String DeliveryMethod;

    /**
    * 附属信息
    */
    @SerializedName("RecipientExtra")
    @Expose
    private String RecipientExtra;

    /**
     * Get 签署参与者ID 
     * @return RecipientId 签署参与者ID
     */
    public String getRecipientId() {
        return this.RecipientId;
    }

    /**
     * Set 签署参与者ID
     * @param RecipientId 签署参与者ID
     */
    public void setRecipientId(String RecipientId) {
        this.RecipientId = RecipientId;
    }

    /**
     * Get 参与者类型（ENTERPRISE/INDIVIDUAL） 
     * @return RecipientType 参与者类型（ENTERPRISE/INDIVIDUAL）
     */
    public String getRecipientType() {
        return this.RecipientType;
    }

    /**
     * Set 参与者类型（ENTERPRISE/INDIVIDUAL）
     * @param RecipientType 参与者类型（ENTERPRISE/INDIVIDUAL）
     */
    public void setRecipientType(String RecipientType) {
        this.RecipientType = RecipientType;
    }

    /**
     * Get 描述信息 
     * @return Description 描述信息
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述信息
     * @param Description 描述信息
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 角色名称 
     * @return RoleName 角色名称
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set 角色名称
     * @param RoleName 角色名称
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get 是否需要验证，默认为false 
     * @return RequireValidation 是否需要验证，默认为false
     */
    public Boolean getRequireValidation() {
        return this.RequireValidation;
    }

    /**
     * Set 是否需要验证，默认为false
     * @param RequireValidation 是否需要验证，默认为false
     */
    public void setRequireValidation(Boolean RequireValidation) {
        this.RequireValidation = RequireValidation;
    }

    /**
     * Get 是否需要签署，默认为true 
     * @return RequireSign 是否需要签署，默认为true
     */
    public Boolean getRequireSign() {
        return this.RequireSign;
    }

    /**
     * Set 是否需要签署，默认为true
     * @param RequireSign 是否需要签署，默认为true
     */
    public void setRequireSign(Boolean RequireSign) {
        this.RequireSign = RequireSign;
    }

    /**
     * Get 添加序列 
     * @return RoutingOrder 添加序列
     */
    public Long getRoutingOrder() {
        return this.RoutingOrder;
    }

    /**
     * Set 添加序列
     * @param RoutingOrder 添加序列
     */
    public void setRoutingOrder(Long RoutingOrder) {
        this.RoutingOrder = RoutingOrder;
    }

    /**
     * Get 是否需要发送，默认为true 
     * @return RequireDelivery 是否需要发送，默认为true
     */
    public Boolean getRequireDelivery() {
        return this.RequireDelivery;
    }

    /**
     * Set 是否需要发送，默认为true
     * @param RequireDelivery 是否需要发送，默认为true
     */
    public void setRequireDelivery(Boolean RequireDelivery) {
        this.RequireDelivery = RequireDelivery;
    }

    /**
     * Get 邮箱地址 
     * @return Email 邮箱地址
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 邮箱地址
     * @param Email 邮箱地址
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 电话号码 
     * @return Mobile 电话号码
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 电话号码
     * @param Mobile 电话号码
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 关联的用户ID 
     * @return UserId 关联的用户ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 关联的用户ID
     * @param UserId 关联的用户ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 发送方式（EMAIL/MOBILE） 
     * @return DeliveryMethod 发送方式（EMAIL/MOBILE）
     */
    public String getDeliveryMethod() {
        return this.DeliveryMethod;
    }

    /**
     * Set 发送方式（EMAIL/MOBILE）
     * @param DeliveryMethod 发送方式（EMAIL/MOBILE）
     */
    public void setDeliveryMethod(String DeliveryMethod) {
        this.DeliveryMethod = DeliveryMethod;
    }

    /**
     * Get 附属信息 
     * @return RecipientExtra 附属信息
     */
    public String getRecipientExtra() {
        return this.RecipientExtra;
    }

    /**
     * Set 附属信息
     * @param RecipientExtra 附属信息
     */
    public void setRecipientExtra(String RecipientExtra) {
        this.RecipientExtra = RecipientExtra;
    }

    public Recipient() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Recipient(Recipient source) {
        if (source.RecipientId != null) {
            this.RecipientId = new String(source.RecipientId);
        }
        if (source.RecipientType != null) {
            this.RecipientType = new String(source.RecipientType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.RequireValidation != null) {
            this.RequireValidation = new Boolean(source.RequireValidation);
        }
        if (source.RequireSign != null) {
            this.RequireSign = new Boolean(source.RequireSign);
        }
        if (source.RoutingOrder != null) {
            this.RoutingOrder = new Long(source.RoutingOrder);
        }
        if (source.RequireDelivery != null) {
            this.RequireDelivery = new Boolean(source.RequireDelivery);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.DeliveryMethod != null) {
            this.DeliveryMethod = new String(source.DeliveryMethod);
        }
        if (source.RecipientExtra != null) {
            this.RecipientExtra = new String(source.RecipientExtra);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecipientId", this.RecipientId);
        this.setParamSimple(map, prefix + "RecipientType", this.RecipientType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "RequireValidation", this.RequireValidation);
        this.setParamSimple(map, prefix + "RequireSign", this.RequireSign);
        this.setParamSimple(map, prefix + "RoutingOrder", this.RoutingOrder);
        this.setParamSimple(map, prefix + "RequireDelivery", this.RequireDelivery);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "DeliveryMethod", this.DeliveryMethod);
        this.setParamSimple(map, prefix + "RecipientExtra", this.RecipientExtra);

    }
}

