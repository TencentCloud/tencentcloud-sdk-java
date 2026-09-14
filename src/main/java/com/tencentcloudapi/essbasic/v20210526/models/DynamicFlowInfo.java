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

public class DynamicFlowInfo extends AbstractModel {

    /**
    * <p>合同流程ID，为32位字符串。 </p><ul><li>FlowId 在通过<a href="https://qian.tencent.com/developers/partnerApis/startFlows/ChannelCreateFlowByFiles">ChannelCreateFlowByFiles</a> 发起，可以在返回参数FlowId中获取。</li><li>建议开发者妥善保存此流程ID，以便于顺利进行后续操作。 </li><li>可登录腾讯电子签控制台，在 &quot;合同&quot;-&gt;&quot;合同中心&quot; 中查看某个合同的FlowId(在页面中展示为合同ID)。</li></ul>
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * <p>合同流程的参与方列表, 最多可支持50个参与方，可在列表中指定企业B端签署方和个人C端签署方的联系和认证方式等信息，不同类型的签署方传参方式可以参考文档 <a href="https://qian.tencent.com/developers/partner/flow_approver">签署方入参指引</a>。 如果合同流程是有序签署，Approvers列表中参与人的顺序就是默认的签署顺序, 请确保列表中参与人的顺序符合实际签署顺序。</p>
    */
    @SerializedName("FlowApprovers")
    @Expose
    private FlowApproverInfo [] FlowApprovers;

    /**
    * <p>个人“授权签”名的使用场景包括以下, 个人“授权签”(即ApproverType设置成个人“授权签”时)业务此值必传： <ul><li> <strong>E_PRESCRIPTION_AUTO_SIGN</strong>：电子处方单（医疗“授权签”） </li><li> <strong>OTHER</strong> : 通用场景</li></ul> 注: <code>个人“授权签”名场景是白名单功能，使用前请与对接的客户经理联系沟通。</code></p>
    */
    @SerializedName("AutoSignScene")
    @Expose
    private String AutoSignScene;

    /**
    * <p>签署人校验方式 VerifyCheck: 人脸识别（默认） MobileCheck：手机号验证，用户手机号和参与方手机号（ApproverMobile）相同即可查看合同内容（当手写签名方式为OCR_ESIGN时，该校验方式无效，因为这种签名方式依赖实名认证） 参数说明：可选人脸识别或手机号验证两种方式，若选择后者，未实名个人签署方在签署合同时，无需经过实名认证和意愿确认两次人脸识别，该能力仅适用于个人签署方。</p>
    */
    @SerializedName("ApproverVerifyType")
    @Expose
    private String ApproverVerifyType;

    /**
     * Get <p>合同流程ID，为32位字符串。 </p><ul><li>FlowId 在通过<a href="https://qian.tencent.com/developers/partnerApis/startFlows/ChannelCreateFlowByFiles">ChannelCreateFlowByFiles</a> 发起，可以在返回参数FlowId中获取。</li><li>建议开发者妥善保存此流程ID，以便于顺利进行后续操作。 </li><li>可登录腾讯电子签控制台，在 &quot;合同&quot;-&gt;&quot;合同中心&quot; 中查看某个合同的FlowId(在页面中展示为合同ID)。</li></ul> 
     * @return FlowId <p>合同流程ID，为32位字符串。 </p><ul><li>FlowId 在通过<a href="https://qian.tencent.com/developers/partnerApis/startFlows/ChannelCreateFlowByFiles">ChannelCreateFlowByFiles</a> 发起，可以在返回参数FlowId中获取。</li><li>建议开发者妥善保存此流程ID，以便于顺利进行后续操作。 </li><li>可登录腾讯电子签控制台，在 &quot;合同&quot;-&gt;&quot;合同中心&quot; 中查看某个合同的FlowId(在页面中展示为合同ID)。</li></ul>
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set <p>合同流程ID，为32位字符串。 </p><ul><li>FlowId 在通过<a href="https://qian.tencent.com/developers/partnerApis/startFlows/ChannelCreateFlowByFiles">ChannelCreateFlowByFiles</a> 发起，可以在返回参数FlowId中获取。</li><li>建议开发者妥善保存此流程ID，以便于顺利进行后续操作。 </li><li>可登录腾讯电子签控制台，在 &quot;合同&quot;-&gt;&quot;合同中心&quot; 中查看某个合同的FlowId(在页面中展示为合同ID)。</li></ul>
     * @param FlowId <p>合同流程ID，为32位字符串。 </p><ul><li>FlowId 在通过<a href="https://qian.tencent.com/developers/partnerApis/startFlows/ChannelCreateFlowByFiles">ChannelCreateFlowByFiles</a> 发起，可以在返回参数FlowId中获取。</li><li>建议开发者妥善保存此流程ID，以便于顺利进行后续操作。 </li><li>可登录腾讯电子签控制台，在 &quot;合同&quot;-&gt;&quot;合同中心&quot; 中查看某个合同的FlowId(在页面中展示为合同ID)。</li></ul>
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get <p>合同流程的参与方列表, 最多可支持50个参与方，可在列表中指定企业B端签署方和个人C端签署方的联系和认证方式等信息，不同类型的签署方传参方式可以参考文档 <a href="https://qian.tencent.com/developers/partner/flow_approver">签署方入参指引</a>。 如果合同流程是有序签署，Approvers列表中参与人的顺序就是默认的签署顺序, 请确保列表中参与人的顺序符合实际签署顺序。</p> 
     * @return FlowApprovers <p>合同流程的参与方列表, 最多可支持50个参与方，可在列表中指定企业B端签署方和个人C端签署方的联系和认证方式等信息，不同类型的签署方传参方式可以参考文档 <a href="https://qian.tencent.com/developers/partner/flow_approver">签署方入参指引</a>。 如果合同流程是有序签署，Approvers列表中参与人的顺序就是默认的签署顺序, 请确保列表中参与人的顺序符合实际签署顺序。</p>
     */
    public FlowApproverInfo [] getFlowApprovers() {
        return this.FlowApprovers;
    }

    /**
     * Set <p>合同流程的参与方列表, 最多可支持50个参与方，可在列表中指定企业B端签署方和个人C端签署方的联系和认证方式等信息，不同类型的签署方传参方式可以参考文档 <a href="https://qian.tencent.com/developers/partner/flow_approver">签署方入参指引</a>。 如果合同流程是有序签署，Approvers列表中参与人的顺序就是默认的签署顺序, 请确保列表中参与人的顺序符合实际签署顺序。</p>
     * @param FlowApprovers <p>合同流程的参与方列表, 最多可支持50个参与方，可在列表中指定企业B端签署方和个人C端签署方的联系和认证方式等信息，不同类型的签署方传参方式可以参考文档 <a href="https://qian.tencent.com/developers/partner/flow_approver">签署方入参指引</a>。 如果合同流程是有序签署，Approvers列表中参与人的顺序就是默认的签署顺序, 请确保列表中参与人的顺序符合实际签署顺序。</p>
     */
    public void setFlowApprovers(FlowApproverInfo [] FlowApprovers) {
        this.FlowApprovers = FlowApprovers;
    }

    /**
     * Get <p>个人“授权签”名的使用场景包括以下, 个人“授权签”(即ApproverType设置成个人“授权签”时)业务此值必传： <ul><li> <strong>E_PRESCRIPTION_AUTO_SIGN</strong>：电子处方单（医疗“授权签”） </li><li> <strong>OTHER</strong> : 通用场景</li></ul> 注: <code>个人“授权签”名场景是白名单功能，使用前请与对接的客户经理联系沟通。</code></p> 
     * @return AutoSignScene <p>个人“授权签”名的使用场景包括以下, 个人“授权签”(即ApproverType设置成个人“授权签”时)业务此值必传： <ul><li> <strong>E_PRESCRIPTION_AUTO_SIGN</strong>：电子处方单（医疗“授权签”） </li><li> <strong>OTHER</strong> : 通用场景</li></ul> 注: <code>个人“授权签”名场景是白名单功能，使用前请与对接的客户经理联系沟通。</code></p>
     */
    public String getAutoSignScene() {
        return this.AutoSignScene;
    }

    /**
     * Set <p>个人“授权签”名的使用场景包括以下, 个人“授权签”(即ApproverType设置成个人“授权签”时)业务此值必传： <ul><li> <strong>E_PRESCRIPTION_AUTO_SIGN</strong>：电子处方单（医疗“授权签”） </li><li> <strong>OTHER</strong> : 通用场景</li></ul> 注: <code>个人“授权签”名场景是白名单功能，使用前请与对接的客户经理联系沟通。</code></p>
     * @param AutoSignScene <p>个人“授权签”名的使用场景包括以下, 个人“授权签”(即ApproverType设置成个人“授权签”时)业务此值必传： <ul><li> <strong>E_PRESCRIPTION_AUTO_SIGN</strong>：电子处方单（医疗“授权签”） </li><li> <strong>OTHER</strong> : 通用场景</li></ul> 注: <code>个人“授权签”名场景是白名单功能，使用前请与对接的客户经理联系沟通。</code></p>
     */
    public void setAutoSignScene(String AutoSignScene) {
        this.AutoSignScene = AutoSignScene;
    }

    /**
     * Get <p>签署人校验方式 VerifyCheck: 人脸识别（默认） MobileCheck：手机号验证，用户手机号和参与方手机号（ApproverMobile）相同即可查看合同内容（当手写签名方式为OCR_ESIGN时，该校验方式无效，因为这种签名方式依赖实名认证） 参数说明：可选人脸识别或手机号验证两种方式，若选择后者，未实名个人签署方在签署合同时，无需经过实名认证和意愿确认两次人脸识别，该能力仅适用于个人签署方。</p> 
     * @return ApproverVerifyType <p>签署人校验方式 VerifyCheck: 人脸识别（默认） MobileCheck：手机号验证，用户手机号和参与方手机号（ApproverMobile）相同即可查看合同内容（当手写签名方式为OCR_ESIGN时，该校验方式无效，因为这种签名方式依赖实名认证） 参数说明：可选人脸识别或手机号验证两种方式，若选择后者，未实名个人签署方在签署合同时，无需经过实名认证和意愿确认两次人脸识别，该能力仅适用于个人签署方。</p>
     */
    public String getApproverVerifyType() {
        return this.ApproverVerifyType;
    }

    /**
     * Set <p>签署人校验方式 VerifyCheck: 人脸识别（默认） MobileCheck：手机号验证，用户手机号和参与方手机号（ApproverMobile）相同即可查看合同内容（当手写签名方式为OCR_ESIGN时，该校验方式无效，因为这种签名方式依赖实名认证） 参数说明：可选人脸识别或手机号验证两种方式，若选择后者，未实名个人签署方在签署合同时，无需经过实名认证和意愿确认两次人脸识别，该能力仅适用于个人签署方。</p>
     * @param ApproverVerifyType <p>签署人校验方式 VerifyCheck: 人脸识别（默认） MobileCheck：手机号验证，用户手机号和参与方手机号（ApproverMobile）相同即可查看合同内容（当手写签名方式为OCR_ESIGN时，该校验方式无效，因为这种签名方式依赖实名认证） 参数说明：可选人脸识别或手机号验证两种方式，若选择后者，未实名个人签署方在签署合同时，无需经过实名认证和意愿确认两次人脸识别，该能力仅适用于个人签署方。</p>
     */
    public void setApproverVerifyType(String ApproverVerifyType) {
        this.ApproverVerifyType = ApproverVerifyType;
    }

    public DynamicFlowInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DynamicFlowInfo(DynamicFlowInfo source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.FlowApprovers != null) {
            this.FlowApprovers = new FlowApproverInfo[source.FlowApprovers.length];
            for (int i = 0; i < source.FlowApprovers.length; i++) {
                this.FlowApprovers[i] = new FlowApproverInfo(source.FlowApprovers[i]);
            }
        }
        if (source.AutoSignScene != null) {
            this.AutoSignScene = new String(source.AutoSignScene);
        }
        if (source.ApproverVerifyType != null) {
            this.ApproverVerifyType = new String(source.ApproverVerifyType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamArrayObj(map, prefix + "FlowApprovers.", this.FlowApprovers);
        this.setParamSimple(map, prefix + "AutoSignScene", this.AutoSignScene);
        this.setParamSimple(map, prefix + "ApproverVerifyType", this.ApproverVerifyType);

    }
}

