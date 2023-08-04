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

public class FlowGroupInfo extends AbstractModel{

    /**
    * 合同（流程）的名称
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * 合同（流程）的签署方信息
    */
    @SerializedName("Approvers")
    @Expose
    private ApproverInfo [] Approvers;

    /**
    * 发起合同（流程）的资源Id,此资源必须是PDF文件,来自UploadFiles,使用文件发起合同(流程)组时必传
    */
    @SerializedName("FileIds")
    @Expose
    private String [] FileIds;

    /**
    * 发起合同（流程）的模板Id,用模板发起合同（流程）组时必填
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 合同（流程）的类型
    */
    @SerializedName("FlowType")
    @Expose
    private String FlowType;

    /**
    * 合同（流程）的描述
    */
    @SerializedName("FlowDescription")
    @Expose
    private String FlowDescription;

    /**
    * 合同（流程）的截止时间戳，单位秒。默认是一年
    */
    @SerializedName("Deadline")
    @Expose
    private Long Deadline;

    /**
    * 合同（流程）的回调地址
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 第三方平台传递过来的信息, 限制1024字符 格式必须是base64的
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
    * 合同（流程）的签署是否是无序签, true - 无序。 false - 有序, 默认 
    */
    @SerializedName("Unordered")
    @Expose
    private Boolean Unordered;

    /**
    * 合同（流程）发起方的填写控件, 由发起方进行在发起时进行填充
    */
    @SerializedName("Components")
    @Expose
    private Component [] Components;

    /**
    * 本企业（发起方）是否需要签署审批，若需要审批则只允许查看不允许签署，需要您调用接口CreateFlowSignReview提交审批结果。
    */
    @SerializedName("NeedSignReview")
    @Expose
    private Boolean NeedSignReview;

    /**
    * 本企业（发起方）自动签署，需要您在发起合同时给印章控件指定自动签的印章。
    */
    @SerializedName("AutoSignScene")
    @Expose
    private String AutoSignScene;

    /**
     * Get 合同（流程）的名称 
     * @return FlowName 合同（流程）的名称
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set 合同（流程）的名称
     * @param FlowName 合同（流程）的名称
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    /**
     * Get 合同（流程）的签署方信息 
     * @return Approvers 合同（流程）的签署方信息
     */
    public ApproverInfo [] getApprovers() {
        return this.Approvers;
    }

    /**
     * Set 合同（流程）的签署方信息
     * @param Approvers 合同（流程）的签署方信息
     */
    public void setApprovers(ApproverInfo [] Approvers) {
        this.Approvers = Approvers;
    }

    /**
     * Get 发起合同（流程）的资源Id,此资源必须是PDF文件,来自UploadFiles,使用文件发起合同(流程)组时必传 
     * @return FileIds 发起合同（流程）的资源Id,此资源必须是PDF文件,来自UploadFiles,使用文件发起合同(流程)组时必传
     */
    public String [] getFileIds() {
        return this.FileIds;
    }

    /**
     * Set 发起合同（流程）的资源Id,此资源必须是PDF文件,来自UploadFiles,使用文件发起合同(流程)组时必传
     * @param FileIds 发起合同（流程）的资源Id,此资源必须是PDF文件,来自UploadFiles,使用文件发起合同(流程)组时必传
     */
    public void setFileIds(String [] FileIds) {
        this.FileIds = FileIds;
    }

    /**
     * Get 发起合同（流程）的模板Id,用模板发起合同（流程）组时必填 
     * @return TemplateId 发起合同（流程）的模板Id,用模板发起合同（流程）组时必填
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 发起合同（流程）的模板Id,用模板发起合同（流程）组时必填
     * @param TemplateId 发起合同（流程）的模板Id,用模板发起合同（流程）组时必填
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 合同（流程）的类型 
     * @return FlowType 合同（流程）的类型
     */
    public String getFlowType() {
        return this.FlowType;
    }

    /**
     * Set 合同（流程）的类型
     * @param FlowType 合同（流程）的类型
     */
    public void setFlowType(String FlowType) {
        this.FlowType = FlowType;
    }

    /**
     * Get 合同（流程）的描述 
     * @return FlowDescription 合同（流程）的描述
     */
    public String getFlowDescription() {
        return this.FlowDescription;
    }

    /**
     * Set 合同（流程）的描述
     * @param FlowDescription 合同（流程）的描述
     */
    public void setFlowDescription(String FlowDescription) {
        this.FlowDescription = FlowDescription;
    }

    /**
     * Get 合同（流程）的截止时间戳，单位秒。默认是一年 
     * @return Deadline 合同（流程）的截止时间戳，单位秒。默认是一年
     */
    public Long getDeadline() {
        return this.Deadline;
    }

    /**
     * Set 合同（流程）的截止时间戳，单位秒。默认是一年
     * @param Deadline 合同（流程）的截止时间戳，单位秒。默认是一年
     */
    public void setDeadline(Long Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get 合同（流程）的回调地址 
     * @return CallbackUrl 合同（流程）的回调地址
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 合同（流程）的回调地址
     * @param CallbackUrl 合同（流程）的回调地址
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get 第三方平台传递过来的信息, 限制1024字符 格式必须是base64的 
     * @return UserData 第三方平台传递过来的信息, 限制1024字符 格式必须是base64的
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Set 第三方平台传递过来的信息, 限制1024字符 格式必须是base64的
     * @param UserData 第三方平台传递过来的信息, 限制1024字符 格式必须是base64的
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    /**
     * Get 合同（流程）的签署是否是无序签, true - 无序。 false - 有序, 默认  
     * @return Unordered 合同（流程）的签署是否是无序签, true - 无序。 false - 有序, 默认 
     */
    public Boolean getUnordered() {
        return this.Unordered;
    }

    /**
     * Set 合同（流程）的签署是否是无序签, true - 无序。 false - 有序, 默认 
     * @param Unordered 合同（流程）的签署是否是无序签, true - 无序。 false - 有序, 默认 
     */
    public void setUnordered(Boolean Unordered) {
        this.Unordered = Unordered;
    }

    /**
     * Get 合同（流程）发起方的填写控件, 由发起方进行在发起时进行填充 
     * @return Components 合同（流程）发起方的填写控件, 由发起方进行在发起时进行填充
     */
    public Component [] getComponents() {
        return this.Components;
    }

    /**
     * Set 合同（流程）发起方的填写控件, 由发起方进行在发起时进行填充
     * @param Components 合同（流程）发起方的填写控件, 由发起方进行在发起时进行填充
     */
    public void setComponents(Component [] Components) {
        this.Components = Components;
    }

    /**
     * Get 本企业（发起方）是否需要签署审批，若需要审批则只允许查看不允许签署，需要您调用接口CreateFlowSignReview提交审批结果。 
     * @return NeedSignReview 本企业（发起方）是否需要签署审批，若需要审批则只允许查看不允许签署，需要您调用接口CreateFlowSignReview提交审批结果。
     */
    public Boolean getNeedSignReview() {
        return this.NeedSignReview;
    }

    /**
     * Set 本企业（发起方）是否需要签署审批，若需要审批则只允许查看不允许签署，需要您调用接口CreateFlowSignReview提交审批结果。
     * @param NeedSignReview 本企业（发起方）是否需要签署审批，若需要审批则只允许查看不允许签署，需要您调用接口CreateFlowSignReview提交审批结果。
     */
    public void setNeedSignReview(Boolean NeedSignReview) {
        this.NeedSignReview = NeedSignReview;
    }

    /**
     * Get 本企业（发起方）自动签署，需要您在发起合同时给印章控件指定自动签的印章。 
     * @return AutoSignScene 本企业（发起方）自动签署，需要您在发起合同时给印章控件指定自动签的印章。
     */
    public String getAutoSignScene() {
        return this.AutoSignScene;
    }

    /**
     * Set 本企业（发起方）自动签署，需要您在发起合同时给印章控件指定自动签的印章。
     * @param AutoSignScene 本企业（发起方）自动签署，需要您在发起合同时给印章控件指定自动签的印章。
     */
    public void setAutoSignScene(String AutoSignScene) {
        this.AutoSignScene = AutoSignScene;
    }

    public FlowGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowGroupInfo(FlowGroupInfo source) {
        if (source.FlowName != null) {
            this.FlowName = new String(source.FlowName);
        }
        if (source.Approvers != null) {
            this.Approvers = new ApproverInfo[source.Approvers.length];
            for (int i = 0; i < source.Approvers.length; i++) {
                this.Approvers[i] = new ApproverInfo(source.Approvers[i]);
            }
        }
        if (source.FileIds != null) {
            this.FileIds = new String[source.FileIds.length];
            for (int i = 0; i < source.FileIds.length; i++) {
                this.FileIds[i] = new String(source.FileIds[i]);
            }
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.FlowType != null) {
            this.FlowType = new String(source.FlowType);
        }
        if (source.FlowDescription != null) {
            this.FlowDescription = new String(source.FlowDescription);
        }
        if (source.Deadline != null) {
            this.Deadline = new Long(source.Deadline);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.UserData != null) {
            this.UserData = new String(source.UserData);
        }
        if (source.Unordered != null) {
            this.Unordered = new Boolean(source.Unordered);
        }
        if (source.Components != null) {
            this.Components = new Component[source.Components.length];
            for (int i = 0; i < source.Components.length; i++) {
                this.Components[i] = new Component(source.Components[i]);
            }
        }
        if (source.NeedSignReview != null) {
            this.NeedSignReview = new Boolean(source.NeedSignReview);
        }
        if (source.AutoSignScene != null) {
            this.AutoSignScene = new String(source.AutoSignScene);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);
        this.setParamArrayObj(map, prefix + "Approvers.", this.Approvers);
        this.setParamArraySimple(map, prefix + "FileIds.", this.FileIds);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "FlowType", this.FlowType);
        this.setParamSimple(map, prefix + "FlowDescription", this.FlowDescription);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "UserData", this.UserData);
        this.setParamSimple(map, prefix + "Unordered", this.Unordered);
        this.setParamArrayObj(map, prefix + "Components.", this.Components);
        this.setParamSimple(map, prefix + "NeedSignReview", this.NeedSignReview);
        this.setParamSimple(map, prefix + "AutoSignScene", this.AutoSignScene);

    }
}

