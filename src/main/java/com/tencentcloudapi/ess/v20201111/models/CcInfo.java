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

public class CcInfo extends AbstractModel{

    /**
    * 被抄送方手机号码， 支持国内手机号11位数字(无需加+86前缀或其他字符)。
请确认手机号所有方为此业务通知方。
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 被抄送方姓名。
抄送方的姓名将用于身份认证，请确保填写的姓名为抄送方的真实姓名，而非昵称等代名。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 被抄送方类型, 可设置以下类型:
<ul><li> **0** :个人抄送方</li>
<li> **1** :企业员工抄送方</li></ul>
    */
    @SerializedName("CcType")
    @Expose
    private Long CcType;

    /**
    * 被抄送方权限, 可设置如下权限:
<ul><li> **0** :可查看合同内容</li>
<li> **1** :可查看合同内容也可下载原文</li></ul>
    */
    @SerializedName("CcPermission")
    @Expose
    private Long CcPermission;

    /**
    * 通知签署方经办人的方式,  有以下途径:
<ul><li> **sms** :  (默认)短信</li>
<li> **none** : 不通知</li></ul>
    */
    @SerializedName("NotifyType")
    @Expose
    private String NotifyType;

    /**
     * Get 被抄送方手机号码， 支持国内手机号11位数字(无需加+86前缀或其他字符)。
请确认手机号所有方为此业务通知方。 
     * @return Mobile 被抄送方手机号码， 支持国内手机号11位数字(无需加+86前缀或其他字符)。
请确认手机号所有方为此业务通知方。
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 被抄送方手机号码， 支持国内手机号11位数字(无需加+86前缀或其他字符)。
请确认手机号所有方为此业务通知方。
     * @param Mobile 被抄送方手机号码， 支持国内手机号11位数字(无需加+86前缀或其他字符)。
请确认手机号所有方为此业务通知方。
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 被抄送方姓名。
抄送方的姓名将用于身份认证，请确保填写的姓名为抄送方的真实姓名，而非昵称等代名。 
     * @return Name 被抄送方姓名。
抄送方的姓名将用于身份认证，请确保填写的姓名为抄送方的真实姓名，而非昵称等代名。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 被抄送方姓名。
抄送方的姓名将用于身份认证，请确保填写的姓名为抄送方的真实姓名，而非昵称等代名。
     * @param Name 被抄送方姓名。
抄送方的姓名将用于身份认证，请确保填写的姓名为抄送方的真实姓名，而非昵称等代名。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 被抄送方类型, 可设置以下类型:
<ul><li> **0** :个人抄送方</li>
<li> **1** :企业员工抄送方</li></ul> 
     * @return CcType 被抄送方类型, 可设置以下类型:
<ul><li> **0** :个人抄送方</li>
<li> **1** :企业员工抄送方</li></ul>
     */
    public Long getCcType() {
        return this.CcType;
    }

    /**
     * Set 被抄送方类型, 可设置以下类型:
<ul><li> **0** :个人抄送方</li>
<li> **1** :企业员工抄送方</li></ul>
     * @param CcType 被抄送方类型, 可设置以下类型:
<ul><li> **0** :个人抄送方</li>
<li> **1** :企业员工抄送方</li></ul>
     */
    public void setCcType(Long CcType) {
        this.CcType = CcType;
    }

    /**
     * Get 被抄送方权限, 可设置如下权限:
<ul><li> **0** :可查看合同内容</li>
<li> **1** :可查看合同内容也可下载原文</li></ul> 
     * @return CcPermission 被抄送方权限, 可设置如下权限:
<ul><li> **0** :可查看合同内容</li>
<li> **1** :可查看合同内容也可下载原文</li></ul>
     */
    public Long getCcPermission() {
        return this.CcPermission;
    }

    /**
     * Set 被抄送方权限, 可设置如下权限:
<ul><li> **0** :可查看合同内容</li>
<li> **1** :可查看合同内容也可下载原文</li></ul>
     * @param CcPermission 被抄送方权限, 可设置如下权限:
<ul><li> **0** :可查看合同内容</li>
<li> **1** :可查看合同内容也可下载原文</li></ul>
     */
    public void setCcPermission(Long CcPermission) {
        this.CcPermission = CcPermission;
    }

    /**
     * Get 通知签署方经办人的方式,  有以下途径:
<ul><li> **sms** :  (默认)短信</li>
<li> **none** : 不通知</li></ul> 
     * @return NotifyType 通知签署方经办人的方式,  有以下途径:
<ul><li> **sms** :  (默认)短信</li>
<li> **none** : 不通知</li></ul>
     */
    public String getNotifyType() {
        return this.NotifyType;
    }

    /**
     * Set 通知签署方经办人的方式,  有以下途径:
<ul><li> **sms** :  (默认)短信</li>
<li> **none** : 不通知</li></ul>
     * @param NotifyType 通知签署方经办人的方式,  有以下途径:
<ul><li> **sms** :  (默认)短信</li>
<li> **none** : 不通知</li></ul>
     */
    public void setNotifyType(String NotifyType) {
        this.NotifyType = NotifyType;
    }

    public CcInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CcInfo(CcInfo source) {
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CcType != null) {
            this.CcType = new Long(source.CcType);
        }
        if (source.CcPermission != null) {
            this.CcPermission = new Long(source.CcPermission);
        }
        if (source.NotifyType != null) {
            this.NotifyType = new String(source.NotifyType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CcType", this.CcType);
        this.setParamSimple(map, prefix + "CcPermission", this.CcPermission);
        this.setParamSimple(map, prefix + "NotifyType", this.NotifyType);

    }
}

