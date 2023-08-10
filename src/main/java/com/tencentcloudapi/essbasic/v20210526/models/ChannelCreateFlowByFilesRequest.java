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

public class ChannelCreateFlowByFilesRequest extends AbstractModel{

    /**
    * 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 均必填。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 签署流程名称，长度不超过200个字符
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * 签署流程的描述，长度不超过1000个字符
    */
    @SerializedName("FlowDescription")
    @Expose
    private String FlowDescription;

    /**
    * 签署流程签约方列表，最多不超过50个参与方
    */
    @SerializedName("FlowApprovers")
    @Expose
    private FlowApproverInfo [] FlowApprovers;

    /**
    * 签署文件资源Id列表，目前仅支持单个文件
    */
    @SerializedName("FileIds")
    @Expose
    private String [] FileIds;

    /**
    * 签署文件中的发起方的填写控件，需要在发起的时候进行填充
    */
    @SerializedName("Components")
    @Expose
    private Component [] Components;

    /**
    * 签署流程的签署截止时间。
值为unix时间戳,精确到秒,不传默认为当前时间一年后
不能早于当前时间
    */
    @SerializedName("Deadline")
    @Expose
    private Long Deadline;

    /**
    * 签署流程回调地址，长度不超过255个字符
如果不传递回调地址， 则默认是配置应用号时候使用的回调地址
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 合同签署顺序类型
true - 无序签,
false - 顺序签，
默认为false，即有序签署。
有序签署时以传入FlowApprovers数组的顺序作为签署顺序
    */
    @SerializedName("Unordered")
    @Expose
    private Boolean Unordered;

    /**
    * 签署流程的类型，长度不超过255个字符
    */
    @SerializedName("FlowType")
    @Expose
    private String FlowType;

    /**
    * 合同显示的页卡模板，说明：只支持{合同名称}, {发起方企业}, {发起方姓名}, {签署方N企业}, {签署方N姓名}，且N不能超过签署人的数量，N从1开始
    */
    @SerializedName("CustomShowMap")
    @Expose
    private String CustomShowMap;

    /**
    * 业务信息，最大长度1000个字符。
    */
    @SerializedName("CustomerData")
    @Expose
    private String CustomerData;

    /**
    * 发起方企业的签署人进行签署操作是否需要企业内部审批。 若设置为true,审核结果需通过接口 ChannelCreateFlowSignReview 通知电子签，审核通过后，发起方企业签署人方可进行签署操作，否则会阻塞其签署操作。  注：企业可以通过此功能与企业内部的审批流程进行关联，支持手动、静默签署合同。
    */
    @SerializedName("NeedSignReview")
    @Expose
    private Boolean NeedSignReview;

    /**
    * 签署人校验方式
VerifyCheck: 人脸识别（默认）
MobileCheck：手机号验证
参数说明：可选人脸识别或手机号验证两种方式，若选择后者，未实名个人签署方在签署合同时，无需经过实名认证和意愿确认两次人脸识别，该能力仅适用于个人签署方。
    */
    @SerializedName("ApproverVerifyType")
    @Expose
    private String ApproverVerifyType;

    /**
    * 标识是否允许发起后添加控件。
0为不允许
1为允许。
如果为1，创建的时候不能有签署控件，只能创建后添加。注意发起后添加控件功能不支持添加骑缝章和签批控件
    */
    @SerializedName("SignBeanTag")
    @Expose
    private Long SignBeanTag;

    /**
    * 被抄送人信息列表
    */
    @SerializedName("CcInfos")
    @Expose
    private CcInfo [] CcInfos;

    /**
    * 给关注人发送短信通知的类型，
0-合同发起时通知 
1-签署完成后通知
    */
    @SerializedName("CcNotifyType")
    @Expose
    private Long CcNotifyType;

    /**
    * 个人自动签场景。发起自动签署时，需设置对应自动签署场景，目前仅支持场景：处方单-E_PRESCRIPTION_AUTO_SIGN
    */
    @SerializedName("AutoSignScene")
    @Expose
    private String AutoSignScene;

    /**
    * 操作者的信息，不用传
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
     * Get 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 均必填。 
     * @return Agent 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 均必填。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 均必填。
     * @param Agent 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 均必填。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 签署流程名称，长度不超过200个字符 
     * @return FlowName 签署流程名称，长度不超过200个字符
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set 签署流程名称，长度不超过200个字符
     * @param FlowName 签署流程名称，长度不超过200个字符
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    /**
     * Get 签署流程的描述，长度不超过1000个字符 
     * @return FlowDescription 签署流程的描述，长度不超过1000个字符
     */
    public String getFlowDescription() {
        return this.FlowDescription;
    }

    /**
     * Set 签署流程的描述，长度不超过1000个字符
     * @param FlowDescription 签署流程的描述，长度不超过1000个字符
     */
    public void setFlowDescription(String FlowDescription) {
        this.FlowDescription = FlowDescription;
    }

    /**
     * Get 签署流程签约方列表，最多不超过50个参与方 
     * @return FlowApprovers 签署流程签约方列表，最多不超过50个参与方
     */
    public FlowApproverInfo [] getFlowApprovers() {
        return this.FlowApprovers;
    }

    /**
     * Set 签署流程签约方列表，最多不超过50个参与方
     * @param FlowApprovers 签署流程签约方列表，最多不超过50个参与方
     */
    public void setFlowApprovers(FlowApproverInfo [] FlowApprovers) {
        this.FlowApprovers = FlowApprovers;
    }

    /**
     * Get 签署文件资源Id列表，目前仅支持单个文件 
     * @return FileIds 签署文件资源Id列表，目前仅支持单个文件
     */
    public String [] getFileIds() {
        return this.FileIds;
    }

    /**
     * Set 签署文件资源Id列表，目前仅支持单个文件
     * @param FileIds 签署文件资源Id列表，目前仅支持单个文件
     */
    public void setFileIds(String [] FileIds) {
        this.FileIds = FileIds;
    }

    /**
     * Get 签署文件中的发起方的填写控件，需要在发起的时候进行填充 
     * @return Components 签署文件中的发起方的填写控件，需要在发起的时候进行填充
     */
    public Component [] getComponents() {
        return this.Components;
    }

    /**
     * Set 签署文件中的发起方的填写控件，需要在发起的时候进行填充
     * @param Components 签署文件中的发起方的填写控件，需要在发起的时候进行填充
     */
    public void setComponents(Component [] Components) {
        this.Components = Components;
    }

    /**
     * Get 签署流程的签署截止时间。
值为unix时间戳,精确到秒,不传默认为当前时间一年后
不能早于当前时间 
     * @return Deadline 签署流程的签署截止时间。
值为unix时间戳,精确到秒,不传默认为当前时间一年后
不能早于当前时间
     */
    public Long getDeadline() {
        return this.Deadline;
    }

    /**
     * Set 签署流程的签署截止时间。
值为unix时间戳,精确到秒,不传默认为当前时间一年后
不能早于当前时间
     * @param Deadline 签署流程的签署截止时间。
值为unix时间戳,精确到秒,不传默认为当前时间一年后
不能早于当前时间
     */
    public void setDeadline(Long Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get 签署流程回调地址，长度不超过255个字符
如果不传递回调地址， 则默认是配置应用号时候使用的回调地址 
     * @return CallbackUrl 签署流程回调地址，长度不超过255个字符
如果不传递回调地址， 则默认是配置应用号时候使用的回调地址
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 签署流程回调地址，长度不超过255个字符
如果不传递回调地址， 则默认是配置应用号时候使用的回调地址
     * @param CallbackUrl 签署流程回调地址，长度不超过255个字符
如果不传递回调地址， 则默认是配置应用号时候使用的回调地址
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get 合同签署顺序类型
true - 无序签,
false - 顺序签，
默认为false，即有序签署。
有序签署时以传入FlowApprovers数组的顺序作为签署顺序 
     * @return Unordered 合同签署顺序类型
true - 无序签,
false - 顺序签，
默认为false，即有序签署。
有序签署时以传入FlowApprovers数组的顺序作为签署顺序
     */
    public Boolean getUnordered() {
        return this.Unordered;
    }

    /**
     * Set 合同签署顺序类型
true - 无序签,
false - 顺序签，
默认为false，即有序签署。
有序签署时以传入FlowApprovers数组的顺序作为签署顺序
     * @param Unordered 合同签署顺序类型
true - 无序签,
false - 顺序签，
默认为false，即有序签署。
有序签署时以传入FlowApprovers数组的顺序作为签署顺序
     */
    public void setUnordered(Boolean Unordered) {
        this.Unordered = Unordered;
    }

    /**
     * Get 签署流程的类型，长度不超过255个字符 
     * @return FlowType 签署流程的类型，长度不超过255个字符
     */
    public String getFlowType() {
        return this.FlowType;
    }

    /**
     * Set 签署流程的类型，长度不超过255个字符
     * @param FlowType 签署流程的类型，长度不超过255个字符
     */
    public void setFlowType(String FlowType) {
        this.FlowType = FlowType;
    }

    /**
     * Get 合同显示的页卡模板，说明：只支持{合同名称}, {发起方企业}, {发起方姓名}, {签署方N企业}, {签署方N姓名}，且N不能超过签署人的数量，N从1开始 
     * @return CustomShowMap 合同显示的页卡模板，说明：只支持{合同名称}, {发起方企业}, {发起方姓名}, {签署方N企业}, {签署方N姓名}，且N不能超过签署人的数量，N从1开始
     */
    public String getCustomShowMap() {
        return this.CustomShowMap;
    }

    /**
     * Set 合同显示的页卡模板，说明：只支持{合同名称}, {发起方企业}, {发起方姓名}, {签署方N企业}, {签署方N姓名}，且N不能超过签署人的数量，N从1开始
     * @param CustomShowMap 合同显示的页卡模板，说明：只支持{合同名称}, {发起方企业}, {发起方姓名}, {签署方N企业}, {签署方N姓名}，且N不能超过签署人的数量，N从1开始
     */
    public void setCustomShowMap(String CustomShowMap) {
        this.CustomShowMap = CustomShowMap;
    }

    /**
     * Get 业务信息，最大长度1000个字符。 
     * @return CustomerData 业务信息，最大长度1000个字符。
     */
    public String getCustomerData() {
        return this.CustomerData;
    }

    /**
     * Set 业务信息，最大长度1000个字符。
     * @param CustomerData 业务信息，最大长度1000个字符。
     */
    public void setCustomerData(String CustomerData) {
        this.CustomerData = CustomerData;
    }

    /**
     * Get 发起方企业的签署人进行签署操作是否需要企业内部审批。 若设置为true,审核结果需通过接口 ChannelCreateFlowSignReview 通知电子签，审核通过后，发起方企业签署人方可进行签署操作，否则会阻塞其签署操作。  注：企业可以通过此功能与企业内部的审批流程进行关联，支持手动、静默签署合同。 
     * @return NeedSignReview 发起方企业的签署人进行签署操作是否需要企业内部审批。 若设置为true,审核结果需通过接口 ChannelCreateFlowSignReview 通知电子签，审核通过后，发起方企业签署人方可进行签署操作，否则会阻塞其签署操作。  注：企业可以通过此功能与企业内部的审批流程进行关联，支持手动、静默签署合同。
     */
    public Boolean getNeedSignReview() {
        return this.NeedSignReview;
    }

    /**
     * Set 发起方企业的签署人进行签署操作是否需要企业内部审批。 若设置为true,审核结果需通过接口 ChannelCreateFlowSignReview 通知电子签，审核通过后，发起方企业签署人方可进行签署操作，否则会阻塞其签署操作。  注：企业可以通过此功能与企业内部的审批流程进行关联，支持手动、静默签署合同。
     * @param NeedSignReview 发起方企业的签署人进行签署操作是否需要企业内部审批。 若设置为true,审核结果需通过接口 ChannelCreateFlowSignReview 通知电子签，审核通过后，发起方企业签署人方可进行签署操作，否则会阻塞其签署操作。  注：企业可以通过此功能与企业内部的审批流程进行关联，支持手动、静默签署合同。
     */
    public void setNeedSignReview(Boolean NeedSignReview) {
        this.NeedSignReview = NeedSignReview;
    }

    /**
     * Get 签署人校验方式
VerifyCheck: 人脸识别（默认）
MobileCheck：手机号验证
参数说明：可选人脸识别或手机号验证两种方式，若选择后者，未实名个人签署方在签署合同时，无需经过实名认证和意愿确认两次人脸识别，该能力仅适用于个人签署方。 
     * @return ApproverVerifyType 签署人校验方式
VerifyCheck: 人脸识别（默认）
MobileCheck：手机号验证
参数说明：可选人脸识别或手机号验证两种方式，若选择后者，未实名个人签署方在签署合同时，无需经过实名认证和意愿确认两次人脸识别，该能力仅适用于个人签署方。
     */
    public String getApproverVerifyType() {
        return this.ApproverVerifyType;
    }

    /**
     * Set 签署人校验方式
VerifyCheck: 人脸识别（默认）
MobileCheck：手机号验证
参数说明：可选人脸识别或手机号验证两种方式，若选择后者，未实名个人签署方在签署合同时，无需经过实名认证和意愿确认两次人脸识别，该能力仅适用于个人签署方。
     * @param ApproverVerifyType 签署人校验方式
VerifyCheck: 人脸识别（默认）
MobileCheck：手机号验证
参数说明：可选人脸识别或手机号验证两种方式，若选择后者，未实名个人签署方在签署合同时，无需经过实名认证和意愿确认两次人脸识别，该能力仅适用于个人签署方。
     */
    public void setApproverVerifyType(String ApproverVerifyType) {
        this.ApproverVerifyType = ApproverVerifyType;
    }

    /**
     * Get 标识是否允许发起后添加控件。
0为不允许
1为允许。
如果为1，创建的时候不能有签署控件，只能创建后添加。注意发起后添加控件功能不支持添加骑缝章和签批控件 
     * @return SignBeanTag 标识是否允许发起后添加控件。
0为不允许
1为允许。
如果为1，创建的时候不能有签署控件，只能创建后添加。注意发起后添加控件功能不支持添加骑缝章和签批控件
     */
    public Long getSignBeanTag() {
        return this.SignBeanTag;
    }

    /**
     * Set 标识是否允许发起后添加控件。
0为不允许
1为允许。
如果为1，创建的时候不能有签署控件，只能创建后添加。注意发起后添加控件功能不支持添加骑缝章和签批控件
     * @param SignBeanTag 标识是否允许发起后添加控件。
0为不允许
1为允许。
如果为1，创建的时候不能有签署控件，只能创建后添加。注意发起后添加控件功能不支持添加骑缝章和签批控件
     */
    public void setSignBeanTag(Long SignBeanTag) {
        this.SignBeanTag = SignBeanTag;
    }

    /**
     * Get 被抄送人信息列表 
     * @return CcInfos 被抄送人信息列表
     */
    public CcInfo [] getCcInfos() {
        return this.CcInfos;
    }

    /**
     * Set 被抄送人信息列表
     * @param CcInfos 被抄送人信息列表
     */
    public void setCcInfos(CcInfo [] CcInfos) {
        this.CcInfos = CcInfos;
    }

    /**
     * Get 给关注人发送短信通知的类型，
0-合同发起时通知 
1-签署完成后通知 
     * @return CcNotifyType 给关注人发送短信通知的类型，
0-合同发起时通知 
1-签署完成后通知
     */
    public Long getCcNotifyType() {
        return this.CcNotifyType;
    }

    /**
     * Set 给关注人发送短信通知的类型，
0-合同发起时通知 
1-签署完成后通知
     * @param CcNotifyType 给关注人发送短信通知的类型，
0-合同发起时通知 
1-签署完成后通知
     */
    public void setCcNotifyType(Long CcNotifyType) {
        this.CcNotifyType = CcNotifyType;
    }

    /**
     * Get 个人自动签场景。发起自动签署时，需设置对应自动签署场景，目前仅支持场景：处方单-E_PRESCRIPTION_AUTO_SIGN 
     * @return AutoSignScene 个人自动签场景。发起自动签署时，需设置对应自动签署场景，目前仅支持场景：处方单-E_PRESCRIPTION_AUTO_SIGN
     */
    public String getAutoSignScene() {
        return this.AutoSignScene;
    }

    /**
     * Set 个人自动签场景。发起自动签署时，需设置对应自动签署场景，目前仅支持场景：处方单-E_PRESCRIPTION_AUTO_SIGN
     * @param AutoSignScene 个人自动签场景。发起自动签署时，需设置对应自动签署场景，目前仅支持场景：处方单-E_PRESCRIPTION_AUTO_SIGN
     */
    public void setAutoSignScene(String AutoSignScene) {
        this.AutoSignScene = AutoSignScene;
    }

    /**
     * Get 操作者的信息，不用传 
     * @return Operator 操作者的信息，不用传
     * @deprecated
     */
    @Deprecated
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者的信息，不用传
     * @param Operator 操作者的信息，不用传
     * @deprecated
     */
    @Deprecated
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    public ChannelCreateFlowByFilesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelCreateFlowByFilesRequest(ChannelCreateFlowByFilesRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.FlowName != null) {
            this.FlowName = new String(source.FlowName);
        }
        if (source.FlowDescription != null) {
            this.FlowDescription = new String(source.FlowDescription);
        }
        if (source.FlowApprovers != null) {
            this.FlowApprovers = new FlowApproverInfo[source.FlowApprovers.length];
            for (int i = 0; i < source.FlowApprovers.length; i++) {
                this.FlowApprovers[i] = new FlowApproverInfo(source.FlowApprovers[i]);
            }
        }
        if (source.FileIds != null) {
            this.FileIds = new String[source.FileIds.length];
            for (int i = 0; i < source.FileIds.length; i++) {
                this.FileIds[i] = new String(source.FileIds[i]);
            }
        }
        if (source.Components != null) {
            this.Components = new Component[source.Components.length];
            for (int i = 0; i < source.Components.length; i++) {
                this.Components[i] = new Component(source.Components[i]);
            }
        }
        if (source.Deadline != null) {
            this.Deadline = new Long(source.Deadline);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.Unordered != null) {
            this.Unordered = new Boolean(source.Unordered);
        }
        if (source.FlowType != null) {
            this.FlowType = new String(source.FlowType);
        }
        if (source.CustomShowMap != null) {
            this.CustomShowMap = new String(source.CustomShowMap);
        }
        if (source.CustomerData != null) {
            this.CustomerData = new String(source.CustomerData);
        }
        if (source.NeedSignReview != null) {
            this.NeedSignReview = new Boolean(source.NeedSignReview);
        }
        if (source.ApproverVerifyType != null) {
            this.ApproverVerifyType = new String(source.ApproverVerifyType);
        }
        if (source.SignBeanTag != null) {
            this.SignBeanTag = new Long(source.SignBeanTag);
        }
        if (source.CcInfos != null) {
            this.CcInfos = new CcInfo[source.CcInfos.length];
            for (int i = 0; i < source.CcInfos.length; i++) {
                this.CcInfos[i] = new CcInfo(source.CcInfos[i]);
            }
        }
        if (source.CcNotifyType != null) {
            this.CcNotifyType = new Long(source.CcNotifyType);
        }
        if (source.AutoSignScene != null) {
            this.AutoSignScene = new String(source.AutoSignScene);
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);
        this.setParamSimple(map, prefix + "FlowDescription", this.FlowDescription);
        this.setParamArrayObj(map, prefix + "FlowApprovers.", this.FlowApprovers);
        this.setParamArraySimple(map, prefix + "FileIds.", this.FileIds);
        this.setParamArrayObj(map, prefix + "Components.", this.Components);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "Unordered", this.Unordered);
        this.setParamSimple(map, prefix + "FlowType", this.FlowType);
        this.setParamSimple(map, prefix + "CustomShowMap", this.CustomShowMap);
        this.setParamSimple(map, prefix + "CustomerData", this.CustomerData);
        this.setParamSimple(map, prefix + "NeedSignReview", this.NeedSignReview);
        this.setParamSimple(map, prefix + "ApproverVerifyType", this.ApproverVerifyType);
        this.setParamSimple(map, prefix + "SignBeanTag", this.SignBeanTag);
        this.setParamArrayObj(map, prefix + "CcInfos.", this.CcInfos);
        this.setParamSimple(map, prefix + "CcNotifyType", this.CcNotifyType);
        this.setParamSimple(map, prefix + "AutoSignScene", this.AutoSignScene);
        this.setParamObj(map, prefix + "Operator.", this.Operator);

    }
}

