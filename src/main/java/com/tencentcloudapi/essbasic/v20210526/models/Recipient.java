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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Recipient extends AbstractModel{

    /**
    * 签署人唯一标识
    */
    @SerializedName("RecipientId")
    @Expose
    private String RecipientId;

    /**
    * 签署方类型：ENTERPRISE-企业INDIVIDUAL-自然人
    */
    @SerializedName("RecipientType")
    @Expose
    private String RecipientType;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 签署方备注信息
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * 是否需要校验
    */
    @SerializedName("RequireValidation")
    @Expose
    private Boolean RequireValidation;

    /**
    * 是否必须填写
    */
    @SerializedName("RequireSign")
    @Expose
    private Boolean RequireSign;

    /**
    * 签署类型
    */
    @SerializedName("SignType")
    @Expose
    private Long SignType;

    /**
    * 签署顺序：数字越小优先级越高
    */
    @SerializedName("RoutingOrder")
    @Expose
    private Long RoutingOrder;

    /**
    * 是否是发起方
    */
    @SerializedName("IsPromoter")
    @Expose
    private Boolean IsPromoter;

    /**
     * Get 签署人唯一标识 
     * @return RecipientId 签署人唯一标识
     */
    public String getRecipientId() {
        return this.RecipientId;
    }

    /**
     * Set 签署人唯一标识
     * @param RecipientId 签署人唯一标识
     */
    public void setRecipientId(String RecipientId) {
        this.RecipientId = RecipientId;
    }

    /**
     * Get 签署方类型：ENTERPRISE-企业INDIVIDUAL-自然人 
     * @return RecipientType 签署方类型：ENTERPRISE-企业INDIVIDUAL-自然人
     */
    public String getRecipientType() {
        return this.RecipientType;
    }

    /**
     * Set 签署方类型：ENTERPRISE-企业INDIVIDUAL-自然人
     * @param RecipientType 签署方类型：ENTERPRISE-企业INDIVIDUAL-自然人
     */
    public void setRecipientType(String RecipientType) {
        this.RecipientType = RecipientType;
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

    /**
     * Get 签署方备注信息 
     * @return RoleName 签署方备注信息
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set 签署方备注信息
     * @param RoleName 签署方备注信息
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get 是否需要校验 
     * @return RequireValidation 是否需要校验
     */
    public Boolean getRequireValidation() {
        return this.RequireValidation;
    }

    /**
     * Set 是否需要校验
     * @param RequireValidation 是否需要校验
     */
    public void setRequireValidation(Boolean RequireValidation) {
        this.RequireValidation = RequireValidation;
    }

    /**
     * Get 是否必须填写 
     * @return RequireSign 是否必须填写
     */
    public Boolean getRequireSign() {
        return this.RequireSign;
    }

    /**
     * Set 是否必须填写
     * @param RequireSign 是否必须填写
     */
    public void setRequireSign(Boolean RequireSign) {
        this.RequireSign = RequireSign;
    }

    /**
     * Get 签署类型 
     * @return SignType 签署类型
     */
    public Long getSignType() {
        return this.SignType;
    }

    /**
     * Set 签署类型
     * @param SignType 签署类型
     */
    public void setSignType(Long SignType) {
        this.SignType = SignType;
    }

    /**
     * Get 签署顺序：数字越小优先级越高 
     * @return RoutingOrder 签署顺序：数字越小优先级越高
     */
    public Long getRoutingOrder() {
        return this.RoutingOrder;
    }

    /**
     * Set 签署顺序：数字越小优先级越高
     * @param RoutingOrder 签署顺序：数字越小优先级越高
     */
    public void setRoutingOrder(Long RoutingOrder) {
        this.RoutingOrder = RoutingOrder;
    }

    /**
     * Get 是否是发起方 
     * @return IsPromoter 是否是发起方
     */
    public Boolean getIsPromoter() {
        return this.IsPromoter;
    }

    /**
     * Set 是否是发起方
     * @param IsPromoter 是否是发起方
     */
    public void setIsPromoter(Boolean IsPromoter) {
        this.IsPromoter = IsPromoter;
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
        if (source.SignType != null) {
            this.SignType = new Long(source.SignType);
        }
        if (source.RoutingOrder != null) {
            this.RoutingOrder = new Long(source.RoutingOrder);
        }
        if (source.IsPromoter != null) {
            this.IsPromoter = new Boolean(source.IsPromoter);
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
        this.setParamSimple(map, prefix + "SignType", this.SignType);
        this.setParamSimple(map, prefix + "RoutingOrder", this.RoutingOrder);
        this.setParamSimple(map, prefix + "IsPromoter", this.IsPromoter);

    }
}

