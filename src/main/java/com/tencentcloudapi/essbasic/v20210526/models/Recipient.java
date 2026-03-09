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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Recipient extends AbstractModel {

    /**
    * <p>合同参与方的角色ID</p>
    */
    @SerializedName("RecipientId")
    @Expose
    private String RecipientId;

    /**
    * <p>参与者类型, 可以选择的类型如下:</p><ul><li> **ENTERPRISE** :此角色为企业参与方</li><li> **INDIVIDUAL** :此角色为个人参与方</li><li> **PROMOTER** :此角色是发起方</li></ul>
    */
    @SerializedName("RecipientType")
    @Expose
    private String RecipientType;

    /**
    * <p>合同参与方的角色描述，长度不能超过100，只能由中文、字母、数字和下划线组成。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>合同参与方的角色名字，长度不能超过20，只能由中文、字母、数字和下划线组成。</p>
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * <p>是否需要校验，<br>true-是，<br>false-否</p>
    */
    @SerializedName("RequireValidation")
    @Expose
    private Boolean RequireValidation;

    /**
    * <p>是否必须填写，<br>true-是，<br>false-否</p>
    */
    @SerializedName("RequireSign")
    @Expose
    private Boolean RequireSign;

    /**
    * <p>内部字段，签署类型</p><p>枚举值：</p><ul><li>0： 人脸</li></ul>
    */
    @SerializedName("SignType")
    @Expose
    private Long SignType;

    /**
    * <p>签署顺序：数字越小优先级越高</p>
    */
    @SerializedName("RoutingOrder")
    @Expose
    private Long RoutingOrder;

    /**
    * <p>是否是发起方，<br>true-是<br>false-否</p>
    */
    @SerializedName("IsPromoter")
    @Expose
    private Boolean IsPromoter;

    /**
    * <p>签署人查看合同校验方式, 支持的类型如下:</p><ul><li> 1 :实名认证查看</li><li> 2 :手机号校验查看</li></ul>
    */
    @SerializedName("ApproverVerifyTypes")
    @Expose
    private Long [] ApproverVerifyTypes;

    /**
    * <p>签署人进行合同签署时的认证方式，支持的类型如下:</p><ul><li> 1 :人脸认证</li><li> 2 :签署密码</li><li> 3 :运营商三要素认证</li><li> 4 :UKey认证</li><li> 5 :设备指纹识别</li><li> 6 :设备面容识别</li></ul>
    */
    @SerializedName("ApproverSignTypes")
    @Expose
    private Long [] ApproverSignTypes;

    /**
    * <p>签署方是否可以转他人处理</p><ul><li> **false** : ( 默认)可以转他人处理</li><li> **true** :不可以转他人处理</li></ul>
    */
    @SerializedName("NoTransfer")
    @Expose
    private Boolean NoTransfer;

    /**
     * Get <p>合同参与方的角色ID</p> 
     * @return RecipientId <p>合同参与方的角色ID</p>
     */
    public String getRecipientId() {
        return this.RecipientId;
    }

    /**
     * Set <p>合同参与方的角色ID</p>
     * @param RecipientId <p>合同参与方的角色ID</p>
     */
    public void setRecipientId(String RecipientId) {
        this.RecipientId = RecipientId;
    }

    /**
     * Get <p>参与者类型, 可以选择的类型如下:</p><ul><li> **ENTERPRISE** :此角色为企业参与方</li><li> **INDIVIDUAL** :此角色为个人参与方</li><li> **PROMOTER** :此角色是发起方</li></ul> 
     * @return RecipientType <p>参与者类型, 可以选择的类型如下:</p><ul><li> **ENTERPRISE** :此角色为企业参与方</li><li> **INDIVIDUAL** :此角色为个人参与方</li><li> **PROMOTER** :此角色是发起方</li></ul>
     */
    public String getRecipientType() {
        return this.RecipientType;
    }

    /**
     * Set <p>参与者类型, 可以选择的类型如下:</p><ul><li> **ENTERPRISE** :此角色为企业参与方</li><li> **INDIVIDUAL** :此角色为个人参与方</li><li> **PROMOTER** :此角色是发起方</li></ul>
     * @param RecipientType <p>参与者类型, 可以选择的类型如下:</p><ul><li> **ENTERPRISE** :此角色为企业参与方</li><li> **INDIVIDUAL** :此角色为个人参与方</li><li> **PROMOTER** :此角色是发起方</li></ul>
     */
    public void setRecipientType(String RecipientType) {
        this.RecipientType = RecipientType;
    }

    /**
     * Get <p>合同参与方的角色描述，长度不能超过100，只能由中文、字母、数字和下划线组成。</p> 
     * @return Description <p>合同参与方的角色描述，长度不能超过100，只能由中文、字母、数字和下划线组成。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>合同参与方的角色描述，长度不能超过100，只能由中文、字母、数字和下划线组成。</p>
     * @param Description <p>合同参与方的角色描述，长度不能超过100，只能由中文、字母、数字和下划线组成。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>合同参与方的角色名字，长度不能超过20，只能由中文、字母、数字和下划线组成。</p> 
     * @return RoleName <p>合同参与方的角色名字，长度不能超过20，只能由中文、字母、数字和下划线组成。</p>
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set <p>合同参与方的角色名字，长度不能超过20，只能由中文、字母、数字和下划线组成。</p>
     * @param RoleName <p>合同参与方的角色名字，长度不能超过20，只能由中文、字母、数字和下划线组成。</p>
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get <p>是否需要校验，<br>true-是，<br>false-否</p> 
     * @return RequireValidation <p>是否需要校验，<br>true-是，<br>false-否</p>
     */
    public Boolean getRequireValidation() {
        return this.RequireValidation;
    }

    /**
     * Set <p>是否需要校验，<br>true-是，<br>false-否</p>
     * @param RequireValidation <p>是否需要校验，<br>true-是，<br>false-否</p>
     */
    public void setRequireValidation(Boolean RequireValidation) {
        this.RequireValidation = RequireValidation;
    }

    /**
     * Get <p>是否必须填写，<br>true-是，<br>false-否</p> 
     * @return RequireSign <p>是否必须填写，<br>true-是，<br>false-否</p>
     */
    public Boolean getRequireSign() {
        return this.RequireSign;
    }

    /**
     * Set <p>是否必须填写，<br>true-是，<br>false-否</p>
     * @param RequireSign <p>是否必须填写，<br>true-是，<br>false-否</p>
     */
    public void setRequireSign(Boolean RequireSign) {
        this.RequireSign = RequireSign;
    }

    /**
     * Get <p>内部字段，签署类型</p><p>枚举值：</p><ul><li>0： 人脸</li></ul> 
     * @return SignType <p>内部字段，签署类型</p><p>枚举值：</p><ul><li>0： 人脸</li></ul>
     */
    public Long getSignType() {
        return this.SignType;
    }

    /**
     * Set <p>内部字段，签署类型</p><p>枚举值：</p><ul><li>0： 人脸</li></ul>
     * @param SignType <p>内部字段，签署类型</p><p>枚举值：</p><ul><li>0： 人脸</li></ul>
     */
    public void setSignType(Long SignType) {
        this.SignType = SignType;
    }

    /**
     * Get <p>签署顺序：数字越小优先级越高</p> 
     * @return RoutingOrder <p>签署顺序：数字越小优先级越高</p>
     */
    public Long getRoutingOrder() {
        return this.RoutingOrder;
    }

    /**
     * Set <p>签署顺序：数字越小优先级越高</p>
     * @param RoutingOrder <p>签署顺序：数字越小优先级越高</p>
     */
    public void setRoutingOrder(Long RoutingOrder) {
        this.RoutingOrder = RoutingOrder;
    }

    /**
     * Get <p>是否是发起方，<br>true-是<br>false-否</p> 
     * @return IsPromoter <p>是否是发起方，<br>true-是<br>false-否</p>
     */
    public Boolean getIsPromoter() {
        return this.IsPromoter;
    }

    /**
     * Set <p>是否是发起方，<br>true-是<br>false-否</p>
     * @param IsPromoter <p>是否是发起方，<br>true-是<br>false-否</p>
     */
    public void setIsPromoter(Boolean IsPromoter) {
        this.IsPromoter = IsPromoter;
    }

    /**
     * Get <p>签署人查看合同校验方式, 支持的类型如下:</p><ul><li> 1 :实名认证查看</li><li> 2 :手机号校验查看</li></ul> 
     * @return ApproverVerifyTypes <p>签署人查看合同校验方式, 支持的类型如下:</p><ul><li> 1 :实名认证查看</li><li> 2 :手机号校验查看</li></ul>
     */
    public Long [] getApproverVerifyTypes() {
        return this.ApproverVerifyTypes;
    }

    /**
     * Set <p>签署人查看合同校验方式, 支持的类型如下:</p><ul><li> 1 :实名认证查看</li><li> 2 :手机号校验查看</li></ul>
     * @param ApproverVerifyTypes <p>签署人查看合同校验方式, 支持的类型如下:</p><ul><li> 1 :实名认证查看</li><li> 2 :手机号校验查看</li></ul>
     */
    public void setApproverVerifyTypes(Long [] ApproverVerifyTypes) {
        this.ApproverVerifyTypes = ApproverVerifyTypes;
    }

    /**
     * Get <p>签署人进行合同签署时的认证方式，支持的类型如下:</p><ul><li> 1 :人脸认证</li><li> 2 :签署密码</li><li> 3 :运营商三要素认证</li><li> 4 :UKey认证</li><li> 5 :设备指纹识别</li><li> 6 :设备面容识别</li></ul> 
     * @return ApproverSignTypes <p>签署人进行合同签署时的认证方式，支持的类型如下:</p><ul><li> 1 :人脸认证</li><li> 2 :签署密码</li><li> 3 :运营商三要素认证</li><li> 4 :UKey认证</li><li> 5 :设备指纹识别</li><li> 6 :设备面容识别</li></ul>
     */
    public Long [] getApproverSignTypes() {
        return this.ApproverSignTypes;
    }

    /**
     * Set <p>签署人进行合同签署时的认证方式，支持的类型如下:</p><ul><li> 1 :人脸认证</li><li> 2 :签署密码</li><li> 3 :运营商三要素认证</li><li> 4 :UKey认证</li><li> 5 :设备指纹识别</li><li> 6 :设备面容识别</li></ul>
     * @param ApproverSignTypes <p>签署人进行合同签署时的认证方式，支持的类型如下:</p><ul><li> 1 :人脸认证</li><li> 2 :签署密码</li><li> 3 :运营商三要素认证</li><li> 4 :UKey认证</li><li> 5 :设备指纹识别</li><li> 6 :设备面容识别</li></ul>
     */
    public void setApproverSignTypes(Long [] ApproverSignTypes) {
        this.ApproverSignTypes = ApproverSignTypes;
    }

    /**
     * Get <p>签署方是否可以转他人处理</p><ul><li> **false** : ( 默认)可以转他人处理</li><li> **true** :不可以转他人处理</li></ul> 
     * @return NoTransfer <p>签署方是否可以转他人处理</p><ul><li> **false** : ( 默认)可以转他人处理</li><li> **true** :不可以转他人处理</li></ul>
     */
    public Boolean getNoTransfer() {
        return this.NoTransfer;
    }

    /**
     * Set <p>签署方是否可以转他人处理</p><ul><li> **false** : ( 默认)可以转他人处理</li><li> **true** :不可以转他人处理</li></ul>
     * @param NoTransfer <p>签署方是否可以转他人处理</p><ul><li> **false** : ( 默认)可以转他人处理</li><li> **true** :不可以转他人处理</li></ul>
     */
    public void setNoTransfer(Boolean NoTransfer) {
        this.NoTransfer = NoTransfer;
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
        if (source.ApproverVerifyTypes != null) {
            this.ApproverVerifyTypes = new Long[source.ApproverVerifyTypes.length];
            for (int i = 0; i < source.ApproverVerifyTypes.length; i++) {
                this.ApproverVerifyTypes[i] = new Long(source.ApproverVerifyTypes[i]);
            }
        }
        if (source.ApproverSignTypes != null) {
            this.ApproverSignTypes = new Long[source.ApproverSignTypes.length];
            for (int i = 0; i < source.ApproverSignTypes.length; i++) {
                this.ApproverSignTypes[i] = new Long(source.ApproverSignTypes[i]);
            }
        }
        if (source.NoTransfer != null) {
            this.NoTransfer = new Boolean(source.NoTransfer);
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
        this.setParamArraySimple(map, prefix + "ApproverVerifyTypes.", this.ApproverVerifyTypes);
        this.setParamArraySimple(map, prefix + "ApproverSignTypes.", this.ApproverSignTypes);
        this.setParamSimple(map, prefix + "NoTransfer", this.NoTransfer);

    }
}

