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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CcInfo extends AbstractModel {

    /**
    * <p>被抄送方手机号码， 支持中国大陆手机号11位数字(无需加+86前缀或其他字符)。<br>请确认手机号所有方为此业务通知方。</p>
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * <p>被抄送方姓名。<br>抄送方的姓名将用于身份认证，请确保填写的姓名为抄送方的真实姓名，而非昵称等代名。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>被抄送方类型, 可设置以下类型:</p><ul><li> **0** :个人抄送方</li><li> **1** :企业员工抄送方</li></ul>
    */
    @SerializedName("CcType")
    @Expose
    private Long CcType;

    /**
    * <p>被抄送方权限, 可设置如下权限:</p><ul><li> **0** :可查看合同内容</li><li> **1** :可查看合同内容也可下载原文</li></ul>
    */
    @SerializedName("CcPermission")
    @Expose
    private Long CcPermission;

    /**
    * <p>通知签署方经办人的方式,  有以下途径:</p><ul><li> **sms** :  (默认)短信</li><li> **none** : 不通知</li></ul>
    */
    @SerializedName("NotifyType")
    @Expose
    private String NotifyType;

    /**
    * <p>被抄送方企业名称。<br>请确认该名称与企业营业执照中注册的名称一致。<br>如果名称中包含英文括号()，请使用中文括号（）代替。</p><p>注意:<br><font color="red">此为白名单功能，需要联系客户经理，开通白名单后才能使用。</font><br>使用文档 <a href="https://qian.tencent.com/developers/company/enterprise_inbox">签署方/抄送方仅指定企业名称发起合同</a></p>
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
     * Get <p>被抄送方手机号码， 支持中国大陆手机号11位数字(无需加+86前缀或其他字符)。<br>请确认手机号所有方为此业务通知方。</p> 
     * @return Mobile <p>被抄送方手机号码， 支持中国大陆手机号11位数字(无需加+86前缀或其他字符)。<br>请确认手机号所有方为此业务通知方。</p>
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set <p>被抄送方手机号码， 支持中国大陆手机号11位数字(无需加+86前缀或其他字符)。<br>请确认手机号所有方为此业务通知方。</p>
     * @param Mobile <p>被抄送方手机号码， 支持中国大陆手机号11位数字(无需加+86前缀或其他字符)。<br>请确认手机号所有方为此业务通知方。</p>
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get <p>被抄送方姓名。<br>抄送方的姓名将用于身份认证，请确保填写的姓名为抄送方的真实姓名，而非昵称等代名。</p> 
     * @return Name <p>被抄送方姓名。<br>抄送方的姓名将用于身份认证，请确保填写的姓名为抄送方的真实姓名，而非昵称等代名。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>被抄送方姓名。<br>抄送方的姓名将用于身份认证，请确保填写的姓名为抄送方的真实姓名，而非昵称等代名。</p>
     * @param Name <p>被抄送方姓名。<br>抄送方的姓名将用于身份认证，请确保填写的姓名为抄送方的真实姓名，而非昵称等代名。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>被抄送方类型, 可设置以下类型:</p><ul><li> **0** :个人抄送方</li><li> **1** :企业员工抄送方</li></ul> 
     * @return CcType <p>被抄送方类型, 可设置以下类型:</p><ul><li> **0** :个人抄送方</li><li> **1** :企业员工抄送方</li></ul>
     */
    public Long getCcType() {
        return this.CcType;
    }

    /**
     * Set <p>被抄送方类型, 可设置以下类型:</p><ul><li> **0** :个人抄送方</li><li> **1** :企业员工抄送方</li></ul>
     * @param CcType <p>被抄送方类型, 可设置以下类型:</p><ul><li> **0** :个人抄送方</li><li> **1** :企业员工抄送方</li></ul>
     */
    public void setCcType(Long CcType) {
        this.CcType = CcType;
    }

    /**
     * Get <p>被抄送方权限, 可设置如下权限:</p><ul><li> **0** :可查看合同内容</li><li> **1** :可查看合同内容也可下载原文</li></ul> 
     * @return CcPermission <p>被抄送方权限, 可设置如下权限:</p><ul><li> **0** :可查看合同内容</li><li> **1** :可查看合同内容也可下载原文</li></ul>
     */
    public Long getCcPermission() {
        return this.CcPermission;
    }

    /**
     * Set <p>被抄送方权限, 可设置如下权限:</p><ul><li> **0** :可查看合同内容</li><li> **1** :可查看合同内容也可下载原文</li></ul>
     * @param CcPermission <p>被抄送方权限, 可设置如下权限:</p><ul><li> **0** :可查看合同内容</li><li> **1** :可查看合同内容也可下载原文</li></ul>
     */
    public void setCcPermission(Long CcPermission) {
        this.CcPermission = CcPermission;
    }

    /**
     * Get <p>通知签署方经办人的方式,  有以下途径:</p><ul><li> **sms** :  (默认)短信</li><li> **none** : 不通知</li></ul> 
     * @return NotifyType <p>通知签署方经办人的方式,  有以下途径:</p><ul><li> **sms** :  (默认)短信</li><li> **none** : 不通知</li></ul>
     */
    public String getNotifyType() {
        return this.NotifyType;
    }

    /**
     * Set <p>通知签署方经办人的方式,  有以下途径:</p><ul><li> **sms** :  (默认)短信</li><li> **none** : 不通知</li></ul>
     * @param NotifyType <p>通知签署方经办人的方式,  有以下途径:</p><ul><li> **sms** :  (默认)短信</li><li> **none** : 不通知</li></ul>
     */
    public void setNotifyType(String NotifyType) {
        this.NotifyType = NotifyType;
    }

    /**
     * Get <p>被抄送方企业名称。<br>请确认该名称与企业营业执照中注册的名称一致。<br>如果名称中包含英文括号()，请使用中文括号（）代替。</p><p>注意:<br><font color="red">此为白名单功能，需要联系客户经理，开通白名单后才能使用。</font><br>使用文档 <a href="https://qian.tencent.com/developers/company/enterprise_inbox">签署方/抄送方仅指定企业名称发起合同</a></p> 
     * @return OrganizationName <p>被抄送方企业名称。<br>请确认该名称与企业营业执照中注册的名称一致。<br>如果名称中包含英文括号()，请使用中文括号（）代替。</p><p>注意:<br><font color="red">此为白名单功能，需要联系客户经理，开通白名单后才能使用。</font><br>使用文档 <a href="https://qian.tencent.com/developers/company/enterprise_inbox">签署方/抄送方仅指定企业名称发起合同</a></p>
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set <p>被抄送方企业名称。<br>请确认该名称与企业营业执照中注册的名称一致。<br>如果名称中包含英文括号()，请使用中文括号（）代替。</p><p>注意:<br><font color="red">此为白名单功能，需要联系客户经理，开通白名单后才能使用。</font><br>使用文档 <a href="https://qian.tencent.com/developers/company/enterprise_inbox">签署方/抄送方仅指定企业名称发起合同</a></p>
     * @param OrganizationName <p>被抄送方企业名称。<br>请确认该名称与企业营业执照中注册的名称一致。<br>如果名称中包含英文括号()，请使用中文括号（）代替。</p><p>注意:<br><font color="red">此为白名单功能，需要联系客户经理，开通白名单后才能使用。</font><br>使用文档 <a href="https://qian.tencent.com/developers/company/enterprise_inbox">签署方/抄送方仅指定企业名称发起合同</a></p>
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
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
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
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
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);

    }
}

