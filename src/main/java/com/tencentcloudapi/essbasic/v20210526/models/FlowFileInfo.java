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

public class FlowFileInfo extends AbstractModel {

    /**
    * <p>签署文件资源Id列表，目前仅支持单个文件</p>
    */
    @SerializedName("FileIds")
    @Expose
    private String [] FileIds;

    /**
    * <p>签署流程名称，长度不超过200个字符</p>
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * <p>签署流程签约方列表，最多不超过5个参与方</p>
    */
    @SerializedName("FlowApprovers")
    @Expose
    private FlowApproverInfo [] FlowApprovers;

    /**
    * <p>签署流程截止时间，十位数时间戳，最大值为33162419560，即3020年</p>
    */
    @SerializedName("Deadline")
    @Expose
    private Long Deadline;

    /**
    * <p>签署流程的描述，长度不超过1000个字符</p>
    */
    @SerializedName("FlowDescription")
    @Expose
    private String FlowDescription;

    /**
    * <p>签署流程的类型，长度不超过255个字符</p><p>枚举值：</p><ul><li>入职合同： 入职合同</li><li>劳动合同： 劳动合同</li></ul>
    */
    @SerializedName("FlowType")
    @Expose
    private String FlowType;

    /**
    * <p>已废弃，请使用【应用号配置】中的回调地址统一接收消息</p>
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * <p>第三方应用的业务信息，最大长度1000个字符。</p>
    */
    @SerializedName("CustomerData")
    @Expose
    private String CustomerData;

    /**
    * <p>合同签署顺序类型(无序签,顺序签)，默认为false，即有序签署</p>
    */
    @SerializedName("Unordered")
    @Expose
    private Boolean Unordered;

    /**
    * <p>签署文件中的发起方的填写控件，需要在发起的时候进行填充</p>
    */
    @SerializedName("Components")
    @Expose
    private Component [] Components;

    /**
    * <p>合同显示的页卡模板，说明：只支持{合同名称}, {发起方企业}, {发起方姓名}, {签署方N企业}, {签署方N姓名}，且N不能超过签署人的数量，N从1开始</p>
    */
    @SerializedName("CustomShowMap")
    @Expose
    private String CustomShowMap;

    /**
    * <p>本企业(发起方企业)是否需要签署审批</p>
    */
    @SerializedName("NeedSignReview")
    @Expose
    private Boolean NeedSignReview;

    /**
    * <p>在短信通知、填写、签署流程中，若标题、按钮、合同详情等地方存在“合同”字样时，可根据此配置指定文案，可选文案如下：  <ul><li> <b>0</b> :合同（默认值）</li> <li> <b>1</b> :文件</li> <li> <b>2</b> :协议</li><li> <b>3</b> :文书</li></ul>效果如下:<img src="https://qcloudimg.tencent-cloud.cn/raw/e4a2c4d638717cc901d3dbd5137c9bbc.png" alt="FlowDisplayType"></p>
    */
    @SerializedName("FlowDisplayType")
    @Expose
    private Long FlowDisplayType;

    /**
     * Get <p>签署文件资源Id列表，目前仅支持单个文件</p> 
     * @return FileIds <p>签署文件资源Id列表，目前仅支持单个文件</p>
     */
    public String [] getFileIds() {
        return this.FileIds;
    }

    /**
     * Set <p>签署文件资源Id列表，目前仅支持单个文件</p>
     * @param FileIds <p>签署文件资源Id列表，目前仅支持单个文件</p>
     */
    public void setFileIds(String [] FileIds) {
        this.FileIds = FileIds;
    }

    /**
     * Get <p>签署流程名称，长度不超过200个字符</p> 
     * @return FlowName <p>签署流程名称，长度不超过200个字符</p>
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set <p>签署流程名称，长度不超过200个字符</p>
     * @param FlowName <p>签署流程名称，长度不超过200个字符</p>
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    /**
     * Get <p>签署流程签约方列表，最多不超过5个参与方</p> 
     * @return FlowApprovers <p>签署流程签约方列表，最多不超过5个参与方</p>
     */
    public FlowApproverInfo [] getFlowApprovers() {
        return this.FlowApprovers;
    }

    /**
     * Set <p>签署流程签约方列表，最多不超过5个参与方</p>
     * @param FlowApprovers <p>签署流程签约方列表，最多不超过5个参与方</p>
     */
    public void setFlowApprovers(FlowApproverInfo [] FlowApprovers) {
        this.FlowApprovers = FlowApprovers;
    }

    /**
     * Get <p>签署流程截止时间，十位数时间戳，最大值为33162419560，即3020年</p> 
     * @return Deadline <p>签署流程截止时间，十位数时间戳，最大值为33162419560，即3020年</p>
     */
    public Long getDeadline() {
        return this.Deadline;
    }

    /**
     * Set <p>签署流程截止时间，十位数时间戳，最大值为33162419560，即3020年</p>
     * @param Deadline <p>签署流程截止时间，十位数时间戳，最大值为33162419560，即3020年</p>
     */
    public void setDeadline(Long Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get <p>签署流程的描述，长度不超过1000个字符</p> 
     * @return FlowDescription <p>签署流程的描述，长度不超过1000个字符</p>
     */
    public String getFlowDescription() {
        return this.FlowDescription;
    }

    /**
     * Set <p>签署流程的描述，长度不超过1000个字符</p>
     * @param FlowDescription <p>签署流程的描述，长度不超过1000个字符</p>
     */
    public void setFlowDescription(String FlowDescription) {
        this.FlowDescription = FlowDescription;
    }

    /**
     * Get <p>签署流程的类型，长度不超过255个字符</p><p>枚举值：</p><ul><li>入职合同： 入职合同</li><li>劳动合同： 劳动合同</li></ul> 
     * @return FlowType <p>签署流程的类型，长度不超过255个字符</p><p>枚举值：</p><ul><li>入职合同： 入职合同</li><li>劳动合同： 劳动合同</li></ul>
     */
    public String getFlowType() {
        return this.FlowType;
    }

    /**
     * Set <p>签署流程的类型，长度不超过255个字符</p><p>枚举值：</p><ul><li>入职合同： 入职合同</li><li>劳动合同： 劳动合同</li></ul>
     * @param FlowType <p>签署流程的类型，长度不超过255个字符</p><p>枚举值：</p><ul><li>入职合同： 入职合同</li><li>劳动合同： 劳动合同</li></ul>
     */
    public void setFlowType(String FlowType) {
        this.FlowType = FlowType;
    }

    /**
     * Get <p>已废弃，请使用【应用号配置】中的回调地址统一接收消息</p> 
     * @return CallbackUrl <p>已废弃，请使用【应用号配置】中的回调地址统一接收消息</p>
     * @deprecated
     */
    @Deprecated
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set <p>已废弃，请使用【应用号配置】中的回调地址统一接收消息</p>
     * @param CallbackUrl <p>已废弃，请使用【应用号配置】中的回调地址统一接收消息</p>
     * @deprecated
     */
    @Deprecated
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get <p>第三方应用的业务信息，最大长度1000个字符。</p> 
     * @return CustomerData <p>第三方应用的业务信息，最大长度1000个字符。</p>
     */
    public String getCustomerData() {
        return this.CustomerData;
    }

    /**
     * Set <p>第三方应用的业务信息，最大长度1000个字符。</p>
     * @param CustomerData <p>第三方应用的业务信息，最大长度1000个字符。</p>
     */
    public void setCustomerData(String CustomerData) {
        this.CustomerData = CustomerData;
    }

    /**
     * Get <p>合同签署顺序类型(无序签,顺序签)，默认为false，即有序签署</p> 
     * @return Unordered <p>合同签署顺序类型(无序签,顺序签)，默认为false，即有序签署</p>
     */
    public Boolean getUnordered() {
        return this.Unordered;
    }

    /**
     * Set <p>合同签署顺序类型(无序签,顺序签)，默认为false，即有序签署</p>
     * @param Unordered <p>合同签署顺序类型(无序签,顺序签)，默认为false，即有序签署</p>
     */
    public void setUnordered(Boolean Unordered) {
        this.Unordered = Unordered;
    }

    /**
     * Get <p>签署文件中的发起方的填写控件，需要在发起的时候进行填充</p> 
     * @return Components <p>签署文件中的发起方的填写控件，需要在发起的时候进行填充</p>
     */
    public Component [] getComponents() {
        return this.Components;
    }

    /**
     * Set <p>签署文件中的发起方的填写控件，需要在发起的时候进行填充</p>
     * @param Components <p>签署文件中的发起方的填写控件，需要在发起的时候进行填充</p>
     */
    public void setComponents(Component [] Components) {
        this.Components = Components;
    }

    /**
     * Get <p>合同显示的页卡模板，说明：只支持{合同名称}, {发起方企业}, {发起方姓名}, {签署方N企业}, {签署方N姓名}，且N不能超过签署人的数量，N从1开始</p> 
     * @return CustomShowMap <p>合同显示的页卡模板，说明：只支持{合同名称}, {发起方企业}, {发起方姓名}, {签署方N企业}, {签署方N姓名}，且N不能超过签署人的数量，N从1开始</p>
     */
    public String getCustomShowMap() {
        return this.CustomShowMap;
    }

    /**
     * Set <p>合同显示的页卡模板，说明：只支持{合同名称}, {发起方企业}, {发起方姓名}, {签署方N企业}, {签署方N姓名}，且N不能超过签署人的数量，N从1开始</p>
     * @param CustomShowMap <p>合同显示的页卡模板，说明：只支持{合同名称}, {发起方企业}, {发起方姓名}, {签署方N企业}, {签署方N姓名}，且N不能超过签署人的数量，N从1开始</p>
     */
    public void setCustomShowMap(String CustomShowMap) {
        this.CustomShowMap = CustomShowMap;
    }

    /**
     * Get <p>本企业(发起方企业)是否需要签署审批</p> 
     * @return NeedSignReview <p>本企业(发起方企业)是否需要签署审批</p>
     */
    public Boolean getNeedSignReview() {
        return this.NeedSignReview;
    }

    /**
     * Set <p>本企业(发起方企业)是否需要签署审批</p>
     * @param NeedSignReview <p>本企业(发起方企业)是否需要签署审批</p>
     */
    public void setNeedSignReview(Boolean NeedSignReview) {
        this.NeedSignReview = NeedSignReview;
    }

    /**
     * Get <p>在短信通知、填写、签署流程中，若标题、按钮、合同详情等地方存在“合同”字样时，可根据此配置指定文案，可选文案如下：  <ul><li> <b>0</b> :合同（默认值）</li> <li> <b>1</b> :文件</li> <li> <b>2</b> :协议</li><li> <b>3</b> :文书</li></ul>效果如下:<img src="https://qcloudimg.tencent-cloud.cn/raw/e4a2c4d638717cc901d3dbd5137c9bbc.png" alt="FlowDisplayType"></p> 
     * @return FlowDisplayType <p>在短信通知、填写、签署流程中，若标题、按钮、合同详情等地方存在“合同”字样时，可根据此配置指定文案，可选文案如下：  <ul><li> <b>0</b> :合同（默认值）</li> <li> <b>1</b> :文件</li> <li> <b>2</b> :协议</li><li> <b>3</b> :文书</li></ul>效果如下:<img src="https://qcloudimg.tencent-cloud.cn/raw/e4a2c4d638717cc901d3dbd5137c9bbc.png" alt="FlowDisplayType"></p>
     */
    public Long getFlowDisplayType() {
        return this.FlowDisplayType;
    }

    /**
     * Set <p>在短信通知、填写、签署流程中，若标题、按钮、合同详情等地方存在“合同”字样时，可根据此配置指定文案，可选文案如下：  <ul><li> <b>0</b> :合同（默认值）</li> <li> <b>1</b> :文件</li> <li> <b>2</b> :协议</li><li> <b>3</b> :文书</li></ul>效果如下:<img src="https://qcloudimg.tencent-cloud.cn/raw/e4a2c4d638717cc901d3dbd5137c9bbc.png" alt="FlowDisplayType"></p>
     * @param FlowDisplayType <p>在短信通知、填写、签署流程中，若标题、按钮、合同详情等地方存在“合同”字样时，可根据此配置指定文案，可选文案如下：  <ul><li> <b>0</b> :合同（默认值）</li> <li> <b>1</b> :文件</li> <li> <b>2</b> :协议</li><li> <b>3</b> :文书</li></ul>效果如下:<img src="https://qcloudimg.tencent-cloud.cn/raw/e4a2c4d638717cc901d3dbd5137c9bbc.png" alt="FlowDisplayType"></p>
     */
    public void setFlowDisplayType(Long FlowDisplayType) {
        this.FlowDisplayType = FlowDisplayType;
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
        if (source.FlowDisplayType != null) {
            this.FlowDisplayType = new Long(source.FlowDisplayType);
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
        this.setParamSimple(map, prefix + "FlowDisplayType", this.FlowDisplayType);

    }
}

