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

public class ReleasedApprover extends AbstractModel {

    /**
    * 签署人姓名，最大长度50个字。

    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 签署人手机号。
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 要更换的原合同参与人RecipientId编号。(可通过接口<a href="https://qian.tencent.com/developers/companyApis/queryFlows/DescribeFlowInfo/">DescribeFlowInfo</a>查询签署人的RecipientId编号)<br/>
    */
    @SerializedName("RelievedApproverReceiptId")
    @Expose
    private String RelievedApproverReceiptId;

    /**
    * 指定签署人类型，目前仅支持
<ul><li> **ORGANIZATION**：企业（默认值）</li>
<li> **ENTERPRISESERVER**：企业静默签</li></ul>
    */
    @SerializedName("ApproverType")
    @Expose
    private String ApproverType;

    /**
    * 签署控件类型，支持自定义企业签署方的签署控件类型
<ul><li> **SIGN_SEAL**：默认为印章控件类型（默认值）</li>
<li> **SIGN_SIGNATURE**：手写签名控件类型</li></ul>
    */
    @SerializedName("ApproverSignComponentType")
    @Expose
    private String ApproverSignComponentType;

    /**
    * 参与方在合同中的角色是按照创建合同的时候来排序的，解除协议默认会将第一个参与人叫`甲方`,第二个叫`乙方`,  第三个叫`丙方`，以此类推。

如果需改动此参与人的角色名字，可用此字段指定，由汉字,英文字符,数字组成，最大20个字。

![image](https://qcloudimg.tencent-cloud.cn/raw/973a820ab66d1ce57082c160c2b2d44a.png)

    */
    @SerializedName("ApproverSignRole")
    @Expose
    private String ApproverSignRole;

    /**
    * 印章Id，签署控件类型为印章时，用于指定本企业签署方在解除协议中使用那个印章进行签署
    */
    @SerializedName("ApproverSignSealId")
    @Expose
    private String ApproverSignSealId;

    /**
    * 要更换的原合同参与人RecipientId编号。(可通过接口<a href="https://qian.tencent.com/developers/companyApis/queryFlows/DescribeFlowInfo/">DescribeFlowInfo</a>查询签署人的RecipientId编号)<br/>
    */
    @SerializedName("RelievedApproverRecipientId")
    @Expose
    private String RelievedApproverRecipientId;

    /**
     * Get 签署人姓名，最大长度50个字。
 
     * @return Name 签署人姓名，最大长度50个字。

     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 签署人姓名，最大长度50个字。

     * @param Name 签署人姓名，最大长度50个字。

     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 签署人手机号。 
     * @return Mobile 签署人手机号。
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 签署人手机号。
     * @param Mobile 签署人手机号。
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 要更换的原合同参与人RecipientId编号。(可通过接口<a href="https://qian.tencent.com/developers/companyApis/queryFlows/DescribeFlowInfo/">DescribeFlowInfo</a>查询签署人的RecipientId编号)<br/> 
     * @return RelievedApproverReceiptId 要更换的原合同参与人RecipientId编号。(可通过接口<a href="https://qian.tencent.com/developers/companyApis/queryFlows/DescribeFlowInfo/">DescribeFlowInfo</a>查询签署人的RecipientId编号)<br/>
     * @deprecated
     */
    @Deprecated
    public String getRelievedApproverReceiptId() {
        return this.RelievedApproverReceiptId;
    }

    /**
     * Set 要更换的原合同参与人RecipientId编号。(可通过接口<a href="https://qian.tencent.com/developers/companyApis/queryFlows/DescribeFlowInfo/">DescribeFlowInfo</a>查询签署人的RecipientId编号)<br/>
     * @param RelievedApproverReceiptId 要更换的原合同参与人RecipientId编号。(可通过接口<a href="https://qian.tencent.com/developers/companyApis/queryFlows/DescribeFlowInfo/">DescribeFlowInfo</a>查询签署人的RecipientId编号)<br/>
     * @deprecated
     */
    @Deprecated
    public void setRelievedApproverReceiptId(String RelievedApproverReceiptId) {
        this.RelievedApproverReceiptId = RelievedApproverReceiptId;
    }

    /**
     * Get 指定签署人类型，目前仅支持
<ul><li> **ORGANIZATION**：企业（默认值）</li>
<li> **ENTERPRISESERVER**：企业静默签</li></ul> 
     * @return ApproverType 指定签署人类型，目前仅支持
<ul><li> **ORGANIZATION**：企业（默认值）</li>
<li> **ENTERPRISESERVER**：企业静默签</li></ul>
     */
    public String getApproverType() {
        return this.ApproverType;
    }

    /**
     * Set 指定签署人类型，目前仅支持
<ul><li> **ORGANIZATION**：企业（默认值）</li>
<li> **ENTERPRISESERVER**：企业静默签</li></ul>
     * @param ApproverType 指定签署人类型，目前仅支持
<ul><li> **ORGANIZATION**：企业（默认值）</li>
<li> **ENTERPRISESERVER**：企业静默签</li></ul>
     */
    public void setApproverType(String ApproverType) {
        this.ApproverType = ApproverType;
    }

    /**
     * Get 签署控件类型，支持自定义企业签署方的签署控件类型
<ul><li> **SIGN_SEAL**：默认为印章控件类型（默认值）</li>
<li> **SIGN_SIGNATURE**：手写签名控件类型</li></ul> 
     * @return ApproverSignComponentType 签署控件类型，支持自定义企业签署方的签署控件类型
<ul><li> **SIGN_SEAL**：默认为印章控件类型（默认值）</li>
<li> **SIGN_SIGNATURE**：手写签名控件类型</li></ul>
     */
    public String getApproverSignComponentType() {
        return this.ApproverSignComponentType;
    }

    /**
     * Set 签署控件类型，支持自定义企业签署方的签署控件类型
<ul><li> **SIGN_SEAL**：默认为印章控件类型（默认值）</li>
<li> **SIGN_SIGNATURE**：手写签名控件类型</li></ul>
     * @param ApproverSignComponentType 签署控件类型，支持自定义企业签署方的签署控件类型
<ul><li> **SIGN_SEAL**：默认为印章控件类型（默认值）</li>
<li> **SIGN_SIGNATURE**：手写签名控件类型</li></ul>
     */
    public void setApproverSignComponentType(String ApproverSignComponentType) {
        this.ApproverSignComponentType = ApproverSignComponentType;
    }

    /**
     * Get 参与方在合同中的角色是按照创建合同的时候来排序的，解除协议默认会将第一个参与人叫`甲方`,第二个叫`乙方`,  第三个叫`丙方`，以此类推。

如果需改动此参与人的角色名字，可用此字段指定，由汉字,英文字符,数字组成，最大20个字。

![image](https://qcloudimg.tencent-cloud.cn/raw/973a820ab66d1ce57082c160c2b2d44a.png)
 
     * @return ApproverSignRole 参与方在合同中的角色是按照创建合同的时候来排序的，解除协议默认会将第一个参与人叫`甲方`,第二个叫`乙方`,  第三个叫`丙方`，以此类推。

如果需改动此参与人的角色名字，可用此字段指定，由汉字,英文字符,数字组成，最大20个字。

![image](https://qcloudimg.tencent-cloud.cn/raw/973a820ab66d1ce57082c160c2b2d44a.png)

     */
    public String getApproverSignRole() {
        return this.ApproverSignRole;
    }

    /**
     * Set 参与方在合同中的角色是按照创建合同的时候来排序的，解除协议默认会将第一个参与人叫`甲方`,第二个叫`乙方`,  第三个叫`丙方`，以此类推。

如果需改动此参与人的角色名字，可用此字段指定，由汉字,英文字符,数字组成，最大20个字。

![image](https://qcloudimg.tencent-cloud.cn/raw/973a820ab66d1ce57082c160c2b2d44a.png)

     * @param ApproverSignRole 参与方在合同中的角色是按照创建合同的时候来排序的，解除协议默认会将第一个参与人叫`甲方`,第二个叫`乙方`,  第三个叫`丙方`，以此类推。

如果需改动此参与人的角色名字，可用此字段指定，由汉字,英文字符,数字组成，最大20个字。

![image](https://qcloudimg.tencent-cloud.cn/raw/973a820ab66d1ce57082c160c2b2d44a.png)

     */
    public void setApproverSignRole(String ApproverSignRole) {
        this.ApproverSignRole = ApproverSignRole;
    }

    /**
     * Get 印章Id，签署控件类型为印章时，用于指定本企业签署方在解除协议中使用那个印章进行签署 
     * @return ApproverSignSealId 印章Id，签署控件类型为印章时，用于指定本企业签署方在解除协议中使用那个印章进行签署
     */
    public String getApproverSignSealId() {
        return this.ApproverSignSealId;
    }

    /**
     * Set 印章Id，签署控件类型为印章时，用于指定本企业签署方在解除协议中使用那个印章进行签署
     * @param ApproverSignSealId 印章Id，签署控件类型为印章时，用于指定本企业签署方在解除协议中使用那个印章进行签署
     */
    public void setApproverSignSealId(String ApproverSignSealId) {
        this.ApproverSignSealId = ApproverSignSealId;
    }

    /**
     * Get 要更换的原合同参与人RecipientId编号。(可通过接口<a href="https://qian.tencent.com/developers/companyApis/queryFlows/DescribeFlowInfo/">DescribeFlowInfo</a>查询签署人的RecipientId编号)<br/> 
     * @return RelievedApproverRecipientId 要更换的原合同参与人RecipientId编号。(可通过接口<a href="https://qian.tencent.com/developers/companyApis/queryFlows/DescribeFlowInfo/">DescribeFlowInfo</a>查询签署人的RecipientId编号)<br/>
     */
    public String getRelievedApproverRecipientId() {
        return this.RelievedApproverRecipientId;
    }

    /**
     * Set 要更换的原合同参与人RecipientId编号。(可通过接口<a href="https://qian.tencent.com/developers/companyApis/queryFlows/DescribeFlowInfo/">DescribeFlowInfo</a>查询签署人的RecipientId编号)<br/>
     * @param RelievedApproverRecipientId 要更换的原合同参与人RecipientId编号。(可通过接口<a href="https://qian.tencent.com/developers/companyApis/queryFlows/DescribeFlowInfo/">DescribeFlowInfo</a>查询签署人的RecipientId编号)<br/>
     */
    public void setRelievedApproverRecipientId(String RelievedApproverRecipientId) {
        this.RelievedApproverRecipientId = RelievedApproverRecipientId;
    }

    public ReleasedApprover() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReleasedApprover(ReleasedApprover source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.RelievedApproverReceiptId != null) {
            this.RelievedApproverReceiptId = new String(source.RelievedApproverReceiptId);
        }
        if (source.ApproverType != null) {
            this.ApproverType = new String(source.ApproverType);
        }
        if (source.ApproverSignComponentType != null) {
            this.ApproverSignComponentType = new String(source.ApproverSignComponentType);
        }
        if (source.ApproverSignRole != null) {
            this.ApproverSignRole = new String(source.ApproverSignRole);
        }
        if (source.ApproverSignSealId != null) {
            this.ApproverSignSealId = new String(source.ApproverSignSealId);
        }
        if (source.RelievedApproverRecipientId != null) {
            this.RelievedApproverRecipientId = new String(source.RelievedApproverRecipientId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "RelievedApproverReceiptId", this.RelievedApproverReceiptId);
        this.setParamSimple(map, prefix + "ApproverType", this.ApproverType);
        this.setParamSimple(map, prefix + "ApproverSignComponentType", this.ApproverSignComponentType);
        this.setParamSimple(map, prefix + "ApproverSignRole", this.ApproverSignRole);
        this.setParamSimple(map, prefix + "ApproverSignSealId", this.ApproverSignSealId);
        this.setParamSimple(map, prefix + "RelievedApproverRecipientId", this.RelievedApproverRecipientId);

    }
}

