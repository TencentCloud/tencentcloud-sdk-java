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

public class FlowGroupOptions extends AbstractModel{

    /**
    * 签署人校验方式,支持以下类型
<ul><li>VerifyCheck : 人脸识别 (默认值)</li>
<li>MobileCheck : 手机号验证</li></ul>
参数说明：此参数仅在合同组文件发起有效，可选人脸识别或手机号验证两种方式，若选择后者，未实名个人签署方在签署合同时，无需经过实名认证和意愿确认两次人脸识别，该能力仅适用于个人签署方。
    */
    @SerializedName("ApproverVerifyType")
    @Expose
    private String ApproverVerifyType;

    /**
    * 发起合同（流程）组本方企业经办人通知方式
签署通知类型，支持以下类型
<ul><li>sms : 短信 (默认值)</li><li>none : 不通知</li></ul>
    */
    @SerializedName("SelfOrganizationApproverNotifyType")
    @Expose
    private String SelfOrganizationApproverNotifyType;

    /**
    * 发起合同（流程）组他方经办人通知方式
签署通知类型，支持以下类型
<ul><li>sms : 短信 (默认值)</li><li>none : 不通知</li></ul>
    */
    @SerializedName("OtherApproverNotifyType")
    @Expose
    private String OtherApproverNotifyType;

    /**
     * Get 签署人校验方式,支持以下类型
<ul><li>VerifyCheck : 人脸识别 (默认值)</li>
<li>MobileCheck : 手机号验证</li></ul>
参数说明：此参数仅在合同组文件发起有效，可选人脸识别或手机号验证两种方式，若选择后者，未实名个人签署方在签署合同时，无需经过实名认证和意愿确认两次人脸识别，该能力仅适用于个人签署方。 
     * @return ApproverVerifyType 签署人校验方式,支持以下类型
<ul><li>VerifyCheck : 人脸识别 (默认值)</li>
<li>MobileCheck : 手机号验证</li></ul>
参数说明：此参数仅在合同组文件发起有效，可选人脸识别或手机号验证两种方式，若选择后者，未实名个人签署方在签署合同时，无需经过实名认证和意愿确认两次人脸识别，该能力仅适用于个人签署方。
     */
    public String getApproverVerifyType() {
        return this.ApproverVerifyType;
    }

    /**
     * Set 签署人校验方式,支持以下类型
<ul><li>VerifyCheck : 人脸识别 (默认值)</li>
<li>MobileCheck : 手机号验证</li></ul>
参数说明：此参数仅在合同组文件发起有效，可选人脸识别或手机号验证两种方式，若选择后者，未实名个人签署方在签署合同时，无需经过实名认证和意愿确认两次人脸识别，该能力仅适用于个人签署方。
     * @param ApproverVerifyType 签署人校验方式,支持以下类型
<ul><li>VerifyCheck : 人脸识别 (默认值)</li>
<li>MobileCheck : 手机号验证</li></ul>
参数说明：此参数仅在合同组文件发起有效，可选人脸识别或手机号验证两种方式，若选择后者，未实名个人签署方在签署合同时，无需经过实名认证和意愿确认两次人脸识别，该能力仅适用于个人签署方。
     */
    public void setApproverVerifyType(String ApproverVerifyType) {
        this.ApproverVerifyType = ApproverVerifyType;
    }

    /**
     * Get 发起合同（流程）组本方企业经办人通知方式
签署通知类型，支持以下类型
<ul><li>sms : 短信 (默认值)</li><li>none : 不通知</li></ul> 
     * @return SelfOrganizationApproverNotifyType 发起合同（流程）组本方企业经办人通知方式
签署通知类型，支持以下类型
<ul><li>sms : 短信 (默认值)</li><li>none : 不通知</li></ul>
     */
    public String getSelfOrganizationApproverNotifyType() {
        return this.SelfOrganizationApproverNotifyType;
    }

    /**
     * Set 发起合同（流程）组本方企业经办人通知方式
签署通知类型，支持以下类型
<ul><li>sms : 短信 (默认值)</li><li>none : 不通知</li></ul>
     * @param SelfOrganizationApproverNotifyType 发起合同（流程）组本方企业经办人通知方式
签署通知类型，支持以下类型
<ul><li>sms : 短信 (默认值)</li><li>none : 不通知</li></ul>
     */
    public void setSelfOrganizationApproverNotifyType(String SelfOrganizationApproverNotifyType) {
        this.SelfOrganizationApproverNotifyType = SelfOrganizationApproverNotifyType;
    }

    /**
     * Get 发起合同（流程）组他方经办人通知方式
签署通知类型，支持以下类型
<ul><li>sms : 短信 (默认值)</li><li>none : 不通知</li></ul> 
     * @return OtherApproverNotifyType 发起合同（流程）组他方经办人通知方式
签署通知类型，支持以下类型
<ul><li>sms : 短信 (默认值)</li><li>none : 不通知</li></ul>
     */
    public String getOtherApproverNotifyType() {
        return this.OtherApproverNotifyType;
    }

    /**
     * Set 发起合同（流程）组他方经办人通知方式
签署通知类型，支持以下类型
<ul><li>sms : 短信 (默认值)</li><li>none : 不通知</li></ul>
     * @param OtherApproverNotifyType 发起合同（流程）组他方经办人通知方式
签署通知类型，支持以下类型
<ul><li>sms : 短信 (默认值)</li><li>none : 不通知</li></ul>
     */
    public void setOtherApproverNotifyType(String OtherApproverNotifyType) {
        this.OtherApproverNotifyType = OtherApproverNotifyType;
    }

    public FlowGroupOptions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowGroupOptions(FlowGroupOptions source) {
        if (source.ApproverVerifyType != null) {
            this.ApproverVerifyType = new String(source.ApproverVerifyType);
        }
        if (source.SelfOrganizationApproverNotifyType != null) {
            this.SelfOrganizationApproverNotifyType = new String(source.SelfOrganizationApproverNotifyType);
        }
        if (source.OtherApproverNotifyType != null) {
            this.OtherApproverNotifyType = new String(source.OtherApproverNotifyType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApproverVerifyType", this.ApproverVerifyType);
        this.setParamSimple(map, prefix + "SelfOrganizationApproverNotifyType", this.SelfOrganizationApproverNotifyType);
        this.setParamSimple(map, prefix + "OtherApproverNotifyType", this.OtherApproverNotifyType);

    }
}

