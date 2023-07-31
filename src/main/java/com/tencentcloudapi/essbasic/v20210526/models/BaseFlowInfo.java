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

public class BaseFlowInfo extends AbstractModel{

    /**
    * 合同流程名称
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * 合同流程类型
<br/>客户自定义，用于合同分类展示
    */
    @SerializedName("FlowType")
    @Expose
    private String FlowType;

    /**
    * 合同流程描述信息
    */
    @SerializedName("FlowDescription")
    @Expose
    private String FlowDescription;

    /**
    * 合同流程截止时间，unix时间戳，单位秒
    */
    @SerializedName("Deadline")
    @Expose
    private Long Deadline;

    /**
    * 是否顺序签署(true:无序签,false:顺序签)
<br/>默认false，有序签署合同
    */
    @SerializedName("Unordered")
    @Expose
    private Boolean Unordered;

    /**
    * 是否打开智能添加填写区(默认开启，打开:"OPEN" 关闭："CLOSE")
    */
    @SerializedName("IntelligentStatus")
    @Expose
    private String IntelligentStatus;

    /**
    * 填写控件内容
    */
    @SerializedName("FormFields")
    @Expose
    private FormField [] FormFields;

    /**
    * 本企业(发起方企业)是否需要签署审批
<br/>true：开启发起方签署审批
<br/>false：不开启发起方签署审批
<br/>开启后，使用ChannelCreateFlowSignReview接口提交审批结果，才能继续完成签署
    */
    @SerializedName("NeedSignReview")
    @Expose
    private Boolean NeedSignReview;

    /**
    * 用户流程自定义数据参数
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
    * 抄送人信息
    */
    @SerializedName("CcInfos")
    @Expose
    private CcInfo [] CcInfos;

    /**
    * 是否需要开启发起方发起前审核
<br/>true：开启发起方发起前审核
<br/>false：不开启发起方发起前审核
<br/>当指定NeedCreateReview=true，则提交审核后，需要使用接口：ChannelCreateFlowSignReview，来完成发起前审核，审核通过后，可以继续查看，签署合同
    */
    @SerializedName("NeedCreateReview")
    @Expose
    private Boolean NeedCreateReview;

    /**
     * Get 合同流程名称 
     * @return FlowName 合同流程名称
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set 合同流程名称
     * @param FlowName 合同流程名称
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    /**
     * Get 合同流程类型
<br/>客户自定义，用于合同分类展示 
     * @return FlowType 合同流程类型
<br/>客户自定义，用于合同分类展示
     */
    public String getFlowType() {
        return this.FlowType;
    }

    /**
     * Set 合同流程类型
<br/>客户自定义，用于合同分类展示
     * @param FlowType 合同流程类型
<br/>客户自定义，用于合同分类展示
     */
    public void setFlowType(String FlowType) {
        this.FlowType = FlowType;
    }

    /**
     * Get 合同流程描述信息 
     * @return FlowDescription 合同流程描述信息
     */
    public String getFlowDescription() {
        return this.FlowDescription;
    }

    /**
     * Set 合同流程描述信息
     * @param FlowDescription 合同流程描述信息
     */
    public void setFlowDescription(String FlowDescription) {
        this.FlowDescription = FlowDescription;
    }

    /**
     * Get 合同流程截止时间，unix时间戳，单位秒 
     * @return Deadline 合同流程截止时间，unix时间戳，单位秒
     */
    public Long getDeadline() {
        return this.Deadline;
    }

    /**
     * Set 合同流程截止时间，unix时间戳，单位秒
     * @param Deadline 合同流程截止时间，unix时间戳，单位秒
     */
    public void setDeadline(Long Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get 是否顺序签署(true:无序签,false:顺序签)
<br/>默认false，有序签署合同 
     * @return Unordered 是否顺序签署(true:无序签,false:顺序签)
<br/>默认false，有序签署合同
     */
    public Boolean getUnordered() {
        return this.Unordered;
    }

    /**
     * Set 是否顺序签署(true:无序签,false:顺序签)
<br/>默认false，有序签署合同
     * @param Unordered 是否顺序签署(true:无序签,false:顺序签)
<br/>默认false，有序签署合同
     */
    public void setUnordered(Boolean Unordered) {
        this.Unordered = Unordered;
    }

    /**
     * Get 是否打开智能添加填写区(默认开启，打开:"OPEN" 关闭："CLOSE") 
     * @return IntelligentStatus 是否打开智能添加填写区(默认开启，打开:"OPEN" 关闭："CLOSE")
     */
    public String getIntelligentStatus() {
        return this.IntelligentStatus;
    }

    /**
     * Set 是否打开智能添加填写区(默认开启，打开:"OPEN" 关闭："CLOSE")
     * @param IntelligentStatus 是否打开智能添加填写区(默认开启，打开:"OPEN" 关闭："CLOSE")
     */
    public void setIntelligentStatus(String IntelligentStatus) {
        this.IntelligentStatus = IntelligentStatus;
    }

    /**
     * Get 填写控件内容 
     * @return FormFields 填写控件内容
     */
    public FormField [] getFormFields() {
        return this.FormFields;
    }

    /**
     * Set 填写控件内容
     * @param FormFields 填写控件内容
     */
    public void setFormFields(FormField [] FormFields) {
        this.FormFields = FormFields;
    }

    /**
     * Get 本企业(发起方企业)是否需要签署审批
<br/>true：开启发起方签署审批
<br/>false：不开启发起方签署审批
<br/>开启后，使用ChannelCreateFlowSignReview接口提交审批结果，才能继续完成签署 
     * @return NeedSignReview 本企业(发起方企业)是否需要签署审批
<br/>true：开启发起方签署审批
<br/>false：不开启发起方签署审批
<br/>开启后，使用ChannelCreateFlowSignReview接口提交审批结果，才能继续完成签署
     */
    public Boolean getNeedSignReview() {
        return this.NeedSignReview;
    }

    /**
     * Set 本企业(发起方企业)是否需要签署审批
<br/>true：开启发起方签署审批
<br/>false：不开启发起方签署审批
<br/>开启后，使用ChannelCreateFlowSignReview接口提交审批结果，才能继续完成签署
     * @param NeedSignReview 本企业(发起方企业)是否需要签署审批
<br/>true：开启发起方签署审批
<br/>false：不开启发起方签署审批
<br/>开启后，使用ChannelCreateFlowSignReview接口提交审批结果，才能继续完成签署
     */
    public void setNeedSignReview(Boolean NeedSignReview) {
        this.NeedSignReview = NeedSignReview;
    }

    /**
     * Get 用户流程自定义数据参数 
     * @return UserData 用户流程自定义数据参数
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Set 用户流程自定义数据参数
     * @param UserData 用户流程自定义数据参数
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    /**
     * Get 抄送人信息 
     * @return CcInfos 抄送人信息
     */
    public CcInfo [] getCcInfos() {
        return this.CcInfos;
    }

    /**
     * Set 抄送人信息
     * @param CcInfos 抄送人信息
     */
    public void setCcInfos(CcInfo [] CcInfos) {
        this.CcInfos = CcInfos;
    }

    /**
     * Get 是否需要开启发起方发起前审核
<br/>true：开启发起方发起前审核
<br/>false：不开启发起方发起前审核
<br/>当指定NeedCreateReview=true，则提交审核后，需要使用接口：ChannelCreateFlowSignReview，来完成发起前审核，审核通过后，可以继续查看，签署合同 
     * @return NeedCreateReview 是否需要开启发起方发起前审核
<br/>true：开启发起方发起前审核
<br/>false：不开启发起方发起前审核
<br/>当指定NeedCreateReview=true，则提交审核后，需要使用接口：ChannelCreateFlowSignReview，来完成发起前审核，审核通过后，可以继续查看，签署合同
     */
    public Boolean getNeedCreateReview() {
        return this.NeedCreateReview;
    }

    /**
     * Set 是否需要开启发起方发起前审核
<br/>true：开启发起方发起前审核
<br/>false：不开启发起方发起前审核
<br/>当指定NeedCreateReview=true，则提交审核后，需要使用接口：ChannelCreateFlowSignReview，来完成发起前审核，审核通过后，可以继续查看，签署合同
     * @param NeedCreateReview 是否需要开启发起方发起前审核
<br/>true：开启发起方发起前审核
<br/>false：不开启发起方发起前审核
<br/>当指定NeedCreateReview=true，则提交审核后，需要使用接口：ChannelCreateFlowSignReview，来完成发起前审核，审核通过后，可以继续查看，签署合同
     */
    public void setNeedCreateReview(Boolean NeedCreateReview) {
        this.NeedCreateReview = NeedCreateReview;
    }

    public BaseFlowInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaseFlowInfo(BaseFlowInfo source) {
        if (source.FlowName != null) {
            this.FlowName = new String(source.FlowName);
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
        if (source.Unordered != null) {
            this.Unordered = new Boolean(source.Unordered);
        }
        if (source.IntelligentStatus != null) {
            this.IntelligentStatus = new String(source.IntelligentStatus);
        }
        if (source.FormFields != null) {
            this.FormFields = new FormField[source.FormFields.length];
            for (int i = 0; i < source.FormFields.length; i++) {
                this.FormFields[i] = new FormField(source.FormFields[i]);
            }
        }
        if (source.NeedSignReview != null) {
            this.NeedSignReview = new Boolean(source.NeedSignReview);
        }
        if (source.UserData != null) {
            this.UserData = new String(source.UserData);
        }
        if (source.CcInfos != null) {
            this.CcInfos = new CcInfo[source.CcInfos.length];
            for (int i = 0; i < source.CcInfos.length; i++) {
                this.CcInfos[i] = new CcInfo(source.CcInfos[i]);
            }
        }
        if (source.NeedCreateReview != null) {
            this.NeedCreateReview = new Boolean(source.NeedCreateReview);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);
        this.setParamSimple(map, prefix + "FlowType", this.FlowType);
        this.setParamSimple(map, prefix + "FlowDescription", this.FlowDescription);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamSimple(map, prefix + "Unordered", this.Unordered);
        this.setParamSimple(map, prefix + "IntelligentStatus", this.IntelligentStatus);
        this.setParamArrayObj(map, prefix + "FormFields.", this.FormFields);
        this.setParamSimple(map, prefix + "NeedSignReview", this.NeedSignReview);
        this.setParamSimple(map, prefix + "UserData", this.UserData);
        this.setParamArrayObj(map, prefix + "CcInfos.", this.CcInfos);
        this.setParamSimple(map, prefix + "NeedCreateReview", this.NeedCreateReview);

    }
}

