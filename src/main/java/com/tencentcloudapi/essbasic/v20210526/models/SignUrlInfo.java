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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SignUrlInfo extends AbstractModel {

    /**
    * 签署链接，过期时间为90天

注：<font color="red">生成的链路后面不能再增加参数</font>（会出现覆盖链接中已有参数导致错误）
    */
    @SerializedName("SignUrl")
    @Expose
    private String SignUrl;

    /**
    * 合同过期时间戳，单位秒
    */
    @SerializedName("Deadline")
    @Expose
    private Long Deadline;

    /**
    * 当流程为顺序签署此参数有效时，数字越小优先级越高，暂不支持并行签署 可选
    */
    @SerializedName("SignOrder")
    @Expose
    private Long SignOrder;

    /**
    * 签署人编号
    */
    @SerializedName("SignId")
    @Expose
    private String SignId;

    /**
    * 自定义用户编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomUserId")
    @Expose
    private String CustomUserId;

    /**
    * 用户姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 用户手机号码
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 签署参与者机构名字
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * 参与者类型, 类型如下:
**ORGANIZATION**:企业经办人
**PERSON**: 自然人
    */
    @SerializedName("ApproverType")
    @Expose
    private String ApproverType;

    /**
    * 经办人身份证号
    */
    @SerializedName("IdCardNumber")
    @Expose
    private String IdCardNumber;

    /**
    * 签署链接对应流程Id
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 企业经办人 用户在渠道的编号
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 合同组签署链接对应的合同组id
    */
    @SerializedName("FlowGroupId")
    @Expose
    private String FlowGroupId;

    /**
    * 二维码，在生成动态签署人跳转封面页链接时返回
    */
    @SerializedName("SignQrcodeUrl")
    @Expose
    private String SignQrcodeUrl;

    /**
     * Get 签署链接，过期时间为90天

注：<font color="red">生成的链路后面不能再增加参数</font>（会出现覆盖链接中已有参数导致错误） 
     * @return SignUrl 签署链接，过期时间为90天

注：<font color="red">生成的链路后面不能再增加参数</font>（会出现覆盖链接中已有参数导致错误）
     */
    public String getSignUrl() {
        return this.SignUrl;
    }

    /**
     * Set 签署链接，过期时间为90天

注：<font color="red">生成的链路后面不能再增加参数</font>（会出现覆盖链接中已有参数导致错误）
     * @param SignUrl 签署链接，过期时间为90天

注：<font color="red">生成的链路后面不能再增加参数</font>（会出现覆盖链接中已有参数导致错误）
     */
    public void setSignUrl(String SignUrl) {
        this.SignUrl = SignUrl;
    }

    /**
     * Get 合同过期时间戳，单位秒 
     * @return Deadline 合同过期时间戳，单位秒
     */
    public Long getDeadline() {
        return this.Deadline;
    }

    /**
     * Set 合同过期时间戳，单位秒
     * @param Deadline 合同过期时间戳，单位秒
     */
    public void setDeadline(Long Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get 当流程为顺序签署此参数有效时，数字越小优先级越高，暂不支持并行签署 可选 
     * @return SignOrder 当流程为顺序签署此参数有效时，数字越小优先级越高，暂不支持并行签署 可选
     */
    public Long getSignOrder() {
        return this.SignOrder;
    }

    /**
     * Set 当流程为顺序签署此参数有效时，数字越小优先级越高，暂不支持并行签署 可选
     * @param SignOrder 当流程为顺序签署此参数有效时，数字越小优先级越高，暂不支持并行签署 可选
     */
    public void setSignOrder(Long SignOrder) {
        this.SignOrder = SignOrder;
    }

    /**
     * Get 签署人编号 
     * @return SignId 签署人编号
     */
    public String getSignId() {
        return this.SignId;
    }

    /**
     * Set 签署人编号
     * @param SignId 签署人编号
     */
    public void setSignId(String SignId) {
        this.SignId = SignId;
    }

    /**
     * Get 自定义用户编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomUserId 自定义用户编号
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getCustomUserId() {
        return this.CustomUserId;
    }

    /**
     * Set 自定义用户编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomUserId 自定义用户编号
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setCustomUserId(String CustomUserId) {
        this.CustomUserId = CustomUserId;
    }

    /**
     * Get 用户姓名 
     * @return Name 用户姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 用户姓名
     * @param Name 用户姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 用户手机号码 
     * @return Mobile 用户手机号码
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 用户手机号码
     * @param Mobile 用户手机号码
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 签署参与者机构名字 
     * @return OrganizationName 签署参与者机构名字
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set 签署参与者机构名字
     * @param OrganizationName 签署参与者机构名字
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get 参与者类型, 类型如下:
**ORGANIZATION**:企业经办人
**PERSON**: 自然人 
     * @return ApproverType 参与者类型, 类型如下:
**ORGANIZATION**:企业经办人
**PERSON**: 自然人
     */
    public String getApproverType() {
        return this.ApproverType;
    }

    /**
     * Set 参与者类型, 类型如下:
**ORGANIZATION**:企业经办人
**PERSON**: 自然人
     * @param ApproverType 参与者类型, 类型如下:
**ORGANIZATION**:企业经办人
**PERSON**: 自然人
     */
    public void setApproverType(String ApproverType) {
        this.ApproverType = ApproverType;
    }

    /**
     * Get 经办人身份证号 
     * @return IdCardNumber 经办人身份证号
     */
    public String getIdCardNumber() {
        return this.IdCardNumber;
    }

    /**
     * Set 经办人身份证号
     * @param IdCardNumber 经办人身份证号
     */
    public void setIdCardNumber(String IdCardNumber) {
        this.IdCardNumber = IdCardNumber;
    }

    /**
     * Get 签署链接对应流程Id 
     * @return FlowId 签署链接对应流程Id
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 签署链接对应流程Id
     * @param FlowId 签署链接对应流程Id
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 企业经办人 用户在渠道的编号 
     * @return OpenId 企业经办人 用户在渠道的编号
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 企业经办人 用户在渠道的编号
     * @param OpenId 企业经办人 用户在渠道的编号
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 合同组签署链接对应的合同组id 
     * @return FlowGroupId 合同组签署链接对应的合同组id
     */
    public String getFlowGroupId() {
        return this.FlowGroupId;
    }

    /**
     * Set 合同组签署链接对应的合同组id
     * @param FlowGroupId 合同组签署链接对应的合同组id
     */
    public void setFlowGroupId(String FlowGroupId) {
        this.FlowGroupId = FlowGroupId;
    }

    /**
     * Get 二维码，在生成动态签署人跳转封面页链接时返回 
     * @return SignQrcodeUrl 二维码，在生成动态签署人跳转封面页链接时返回
     */
    public String getSignQrcodeUrl() {
        return this.SignQrcodeUrl;
    }

    /**
     * Set 二维码，在生成动态签署人跳转封面页链接时返回
     * @param SignQrcodeUrl 二维码，在生成动态签署人跳转封面页链接时返回
     */
    public void setSignQrcodeUrl(String SignQrcodeUrl) {
        this.SignQrcodeUrl = SignQrcodeUrl;
    }

    public SignUrlInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SignUrlInfo(SignUrlInfo source) {
        if (source.SignUrl != null) {
            this.SignUrl = new String(source.SignUrl);
        }
        if (source.Deadline != null) {
            this.Deadline = new Long(source.Deadline);
        }
        if (source.SignOrder != null) {
            this.SignOrder = new Long(source.SignOrder);
        }
        if (source.SignId != null) {
            this.SignId = new String(source.SignId);
        }
        if (source.CustomUserId != null) {
            this.CustomUserId = new String(source.CustomUserId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
        }
        if (source.ApproverType != null) {
            this.ApproverType = new String(source.ApproverType);
        }
        if (source.IdCardNumber != null) {
            this.IdCardNumber = new String(source.IdCardNumber);
        }
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.FlowGroupId != null) {
            this.FlowGroupId = new String(source.FlowGroupId);
        }
        if (source.SignQrcodeUrl != null) {
            this.SignQrcodeUrl = new String(source.SignQrcodeUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SignUrl", this.SignUrl);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamSimple(map, prefix + "SignOrder", this.SignOrder);
        this.setParamSimple(map, prefix + "SignId", this.SignId);
        this.setParamSimple(map, prefix + "CustomUserId", this.CustomUserId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);
        this.setParamSimple(map, prefix + "ApproverType", this.ApproverType);
        this.setParamSimple(map, prefix + "IdCardNumber", this.IdCardNumber);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "FlowGroupId", this.FlowGroupId);
        this.setParamSimple(map, prefix + "SignQrcodeUrl", this.SignQrcodeUrl);

    }
}

