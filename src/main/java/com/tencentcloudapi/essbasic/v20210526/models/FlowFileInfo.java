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

public class FlowFileInfo extends AbstractModel{

    /**
    * 签署文件资源Id列表，目前仅支持单个文件
    */
    @SerializedName("FileIds")
    @Expose
    private String [] FileIds;

    /**
    * 签署流程名称，长度不超过200个字符
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * 签署流程签约方列表，最多不超过5个参与方
    */
    @SerializedName("FlowApprovers")
    @Expose
    private FlowApproverInfo [] FlowApprovers;

    /**
    * 签署流程截止时间，十位数时间戳，最大值为33162419560，即3020年
    */
    @SerializedName("Deadline")
    @Expose
    private Long Deadline;

    /**
    * 签署流程的描述，长度不超过1000个字符
    */
    @SerializedName("FlowDescription")
    @Expose
    private String FlowDescription;

    /**
    * 签署流程的类型，长度不超过255个字符
    */
    @SerializedName("FlowType")
    @Expose
    private String FlowType;

    /**
    * 签署流程回调地址，长度不超过255个字符
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 第三方应用的业务信息，最大长度1000个字符。发起自动签署时，需设置对应自动签署场景，目前仅支持场景：处方单-E_PRESCRIPTION_AUTO_SIGN
    */
    @SerializedName("CustomerData")
    @Expose
    private String CustomerData;

    /**
    * 合同签署顺序类型(无序签,顺序签)，默认为false，即有序签署
    */
    @SerializedName("Unordered")
    @Expose
    private Boolean Unordered;

    /**
    * 签署文件中的发起方的填写控件，需要在发起的时候进行填充
    */
    @SerializedName("Components")
    @Expose
    private Component [] Components;

    /**
    * 合同显示的页卡模板，说明：只支持{合同名称}, {发起方企业}, {发起方姓名}, {签署方N企业}, {签署方N姓名}，且N不能超过签署人的数量，N从1开始
    */
    @SerializedName("CustomShowMap")
    @Expose
    private String CustomShowMap;

    /**
    * 本企业(发起方企业)是否需要签署审批
    */
    @SerializedName("NeedSignReview")
    @Expose
    private Boolean NeedSignReview;

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
     * Get 签署流程签约方列表，最多不超过5个参与方 
     * @return FlowApprovers 签署流程签约方列表，最多不超过5个参与方
     */
    public FlowApproverInfo [] getFlowApprovers() {
        return this.FlowApprovers;
    }

    /**
     * Set 签署流程签约方列表，最多不超过5个参与方
     * @param FlowApprovers 签署流程签约方列表，最多不超过5个参与方
     */
    public void setFlowApprovers(FlowApproverInfo [] FlowApprovers) {
        this.FlowApprovers = FlowApprovers;
    }

    /**
     * Get 签署流程截止时间，十位数时间戳，最大值为33162419560，即3020年 
     * @return Deadline 签署流程截止时间，十位数时间戳，最大值为33162419560，即3020年
     */
    public Long getDeadline() {
        return this.Deadline;
    }

    /**
     * Set 签署流程截止时间，十位数时间戳，最大值为33162419560，即3020年
     * @param Deadline 签署流程截止时间，十位数时间戳，最大值为33162419560，即3020年
     */
    public void setDeadline(Long Deadline) {
        this.Deadline = Deadline;
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
     * Get 签署流程回调地址，长度不超过255个字符 
     * @return CallbackUrl 签署流程回调地址，长度不超过255个字符
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 签署流程回调地址，长度不超过255个字符
     * @param CallbackUrl 签署流程回调地址，长度不超过255个字符
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get 第三方应用的业务信息，最大长度1000个字符。发起自动签署时，需设置对应自动签署场景，目前仅支持场景：处方单-E_PRESCRIPTION_AUTO_SIGN 
     * @return CustomerData 第三方应用的业务信息，最大长度1000个字符。发起自动签署时，需设置对应自动签署场景，目前仅支持场景：处方单-E_PRESCRIPTION_AUTO_SIGN
     */
    public String getCustomerData() {
        return this.CustomerData;
    }

    /**
     * Set 第三方应用的业务信息，最大长度1000个字符。发起自动签署时，需设置对应自动签署场景，目前仅支持场景：处方单-E_PRESCRIPTION_AUTO_SIGN
     * @param CustomerData 第三方应用的业务信息，最大长度1000个字符。发起自动签署时，需设置对应自动签署场景，目前仅支持场景：处方单-E_PRESCRIPTION_AUTO_SIGN
     */
    public void setCustomerData(String CustomerData) {
        this.CustomerData = CustomerData;
    }

    /**
     * Get 合同签署顺序类型(无序签,顺序签)，默认为false，即有序签署 
     * @return Unordered 合同签署顺序类型(无序签,顺序签)，默认为false，即有序签署
     */
    public Boolean getUnordered() {
        return this.Unordered;
    }

    /**
     * Set 合同签署顺序类型(无序签,顺序签)，默认为false，即有序签署
     * @param Unordered 合同签署顺序类型(无序签,顺序签)，默认为false，即有序签署
     */
    public void setUnordered(Boolean Unordered) {
        this.Unordered = Unordered;
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
     * Get 本企业(发起方企业)是否需要签署审批 
     * @return NeedSignReview 本企业(发起方企业)是否需要签署审批
     */
    public Boolean getNeedSignReview() {
        return this.NeedSignReview;
    }

    /**
     * Set 本企业(发起方企业)是否需要签署审批
     * @param NeedSignReview 本企业(发起方企业)是否需要签署审批
     */
    public void setNeedSignReview(Boolean NeedSignReview) {
        this.NeedSignReview = NeedSignReview;
    }

    public FlowFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowFileInfo(FlowFileInfo source) {
        if (source.FileIds != null) {
            this.FileIds = new String[source.FileIds.length];
            for (int i = 0; i < source.FileIds.length; i++) {
                this.FileIds[i] = new String(source.FileIds[i]);
            }
        }
        if (source.FlowName != null) {
            this.FlowName = new String(source.FlowName);
        }
        if (source.FlowApprovers != null) {
            this.FlowApprovers = new FlowApproverInfo[source.FlowApprovers.length];
            for (int i = 0; i < source.FlowApprovers.length; i++) {
                this.FlowApprovers[i] = new FlowApproverInfo(source.FlowApprovers[i]);
            }
        }
        if (source.Deadline != null) {
            this.Deadline = new Long(source.Deadline);
        }
        if (source.FlowDescription != null) {
            this.FlowDescription = new String(source.FlowDescription);
        }
        if (source.FlowType != null) {
            this.FlowType = new String(source.FlowType);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.CustomerData != null) {
            this.CustomerData = new String(source.CustomerData);
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
        if (source.CustomShowMap != null) {
            this.CustomShowMap = new String(source.CustomShowMap);
        }
        if (source.NeedSignReview != null) {
            this.NeedSignReview = new Boolean(source.NeedSignReview);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "FileIds.", this.FileIds);
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);
        this.setParamArrayObj(map, prefix + "FlowApprovers.", this.FlowApprovers);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamSimple(map, prefix + "FlowDescription", this.FlowDescription);
        this.setParamSimple(map, prefix + "FlowType", this.FlowType);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "CustomerData", this.CustomerData);
        this.setParamSimple(map, prefix + "Unordered", this.Unordered);
        this.setParamArrayObj(map, prefix + "Components.", this.Components);
        this.setParamSimple(map, prefix + "CustomShowMap", this.CustomShowMap);
        this.setParamSimple(map, prefix + "NeedSignReview", this.NeedSignReview);

    }
}

