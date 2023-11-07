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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FillApproverInfo extends AbstractModel {

    /**
    * 签署方经办人在模板中配置的参与方ID，与控件绑定，是控件的归属方，ID为32位字符串。
模板发起合同时，该参数为必填项。
文件发起合同是，该参数无需传值。
如果开发者后序用合同模板发起合同，建议保存此值，在用合同模板发起合同中需此值绑定对应的签署经办人 。
    */
    @SerializedName("RecipientId")
    @Expose
    private String RecipientId;

    /**
    * 签署人来源
WEWORKAPP: 企业微信
<br/>仅【企微或签】时指定WEWORKAPP
    */
    @SerializedName("ApproverSource")
    @Expose
    private String ApproverSource;

    /**
    * 企业微信UserId
<br/>当ApproverSource为WEWORKAPP的企微或签场景下，必须指企业自有应用获取企业微信的UserId
    */
    @SerializedName("CustomUserId")
    @Expose
    private String CustomUserId;

    /**
    * 补充企业签署人员工姓名
    */
    @SerializedName("ApproverName")
    @Expose
    private String ApproverName;

    /**
    * 补充企业签署人员工手机号
    */
    @SerializedName("ApproverMobile")
    @Expose
    private String ApproverMobile;

    /**
    * 补充企业动态签署人时，需要指定对应企业名称
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
     * Get 签署方经办人在模板中配置的参与方ID，与控件绑定，是控件的归属方，ID为32位字符串。
模板发起合同时，该参数为必填项。
文件发起合同是，该参数无需传值。
如果开发者后序用合同模板发起合同，建议保存此值，在用合同模板发起合同中需此值绑定对应的签署经办人 。 
     * @return RecipientId 签署方经办人在模板中配置的参与方ID，与控件绑定，是控件的归属方，ID为32位字符串。
模板发起合同时，该参数为必填项。
文件发起合同是，该参数无需传值。
如果开发者后序用合同模板发起合同，建议保存此值，在用合同模板发起合同中需此值绑定对应的签署经办人 。
     */
    public String getRecipientId() {
        return this.RecipientId;
    }

    /**
     * Set 签署方经办人在模板中配置的参与方ID，与控件绑定，是控件的归属方，ID为32位字符串。
模板发起合同时，该参数为必填项。
文件发起合同是，该参数无需传值。
如果开发者后序用合同模板发起合同，建议保存此值，在用合同模板发起合同中需此值绑定对应的签署经办人 。
     * @param RecipientId 签署方经办人在模板中配置的参与方ID，与控件绑定，是控件的归属方，ID为32位字符串。
模板发起合同时，该参数为必填项。
文件发起合同是，该参数无需传值。
如果开发者后序用合同模板发起合同，建议保存此值，在用合同模板发起合同中需此值绑定对应的签署经办人 。
     */
    public void setRecipientId(String RecipientId) {
        this.RecipientId = RecipientId;
    }

    /**
     * Get 签署人来源
WEWORKAPP: 企业微信
<br/>仅【企微或签】时指定WEWORKAPP 
     * @return ApproverSource 签署人来源
WEWORKAPP: 企业微信
<br/>仅【企微或签】时指定WEWORKAPP
     */
    public String getApproverSource() {
        return this.ApproverSource;
    }

    /**
     * Set 签署人来源
WEWORKAPP: 企业微信
<br/>仅【企微或签】时指定WEWORKAPP
     * @param ApproverSource 签署人来源
WEWORKAPP: 企业微信
<br/>仅【企微或签】时指定WEWORKAPP
     */
    public void setApproverSource(String ApproverSource) {
        this.ApproverSource = ApproverSource;
    }

    /**
     * Get 企业微信UserId
<br/>当ApproverSource为WEWORKAPP的企微或签场景下，必须指企业自有应用获取企业微信的UserId 
     * @return CustomUserId 企业微信UserId
<br/>当ApproverSource为WEWORKAPP的企微或签场景下，必须指企业自有应用获取企业微信的UserId
     */
    public String getCustomUserId() {
        return this.CustomUserId;
    }

    /**
     * Set 企业微信UserId
<br/>当ApproverSource为WEWORKAPP的企微或签场景下，必须指企业自有应用获取企业微信的UserId
     * @param CustomUserId 企业微信UserId
<br/>当ApproverSource为WEWORKAPP的企微或签场景下，必须指企业自有应用获取企业微信的UserId
     */
    public void setCustomUserId(String CustomUserId) {
        this.CustomUserId = CustomUserId;
    }

    /**
     * Get 补充企业签署人员工姓名 
     * @return ApproverName 补充企业签署人员工姓名
     */
    public String getApproverName() {
        return this.ApproverName;
    }

    /**
     * Set 补充企业签署人员工姓名
     * @param ApproverName 补充企业签署人员工姓名
     */
    public void setApproverName(String ApproverName) {
        this.ApproverName = ApproverName;
    }

    /**
     * Get 补充企业签署人员工手机号 
     * @return ApproverMobile 补充企业签署人员工手机号
     */
    public String getApproverMobile() {
        return this.ApproverMobile;
    }

    /**
     * Set 补充企业签署人员工手机号
     * @param ApproverMobile 补充企业签署人员工手机号
     */
    public void setApproverMobile(String ApproverMobile) {
        this.ApproverMobile = ApproverMobile;
    }

    /**
     * Get 补充企业动态签署人时，需要指定对应企业名称 
     * @return OrganizationName 补充企业动态签署人时，需要指定对应企业名称
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set 补充企业动态签署人时，需要指定对应企业名称
     * @param OrganizationName 补充企业动态签署人时，需要指定对应企业名称
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    public FillApproverInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FillApproverInfo(FillApproverInfo source) {
        if (source.RecipientId != null) {
            this.RecipientId = new String(source.RecipientId);
        }
        if (source.ApproverSource != null) {
            this.ApproverSource = new String(source.ApproverSource);
        }
        if (source.CustomUserId != null) {
            this.CustomUserId = new String(source.CustomUserId);
        }
        if (source.ApproverName != null) {
            this.ApproverName = new String(source.ApproverName);
        }
        if (source.ApproverMobile != null) {
            this.ApproverMobile = new String(source.ApproverMobile);
        }
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecipientId", this.RecipientId);
        this.setParamSimple(map, prefix + "ApproverSource", this.ApproverSource);
        this.setParamSimple(map, prefix + "CustomUserId", this.CustomUserId);
        this.setParamSimple(map, prefix + "ApproverName", this.ApproverName);
        this.setParamSimple(map, prefix + "ApproverMobile", this.ApproverMobile);
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);

    }
}

