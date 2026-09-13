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
    * <p>签署人姓名，最大长度50个字。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>签署人手机号。</p>
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * <p>要更换的原合同参与人RecipientId编号。(可通过接口<a href="https://qian.tencent.com/developers/companyApis/queryFlows/DescribeFlowInfo/">DescribeFlowInfo</a>查询签署人的RecipientId编号)<br></p>
    */
    @SerializedName("RelievedApproverReceiptId")
    @Expose
    private String RelievedApproverReceiptId;

    /**
    * <p>指定签署人类型，目前仅支持<ul><li> <strong>ORGANIZATION</strong>：企业（默认值）</li><li> <strong>ENTERPRISESERVER</strong>：企业“授权签”</li></ul></p>
    */
    @SerializedName("ApproverType")
    @Expose
    private String ApproverType;

    /**
    * <p>签署控件类型，支持自定义企业签署方的签署控件类型</p><ul><li> **SIGN_SEAL**：默认为印章控件类型（默认值）</li><li> **SIGN_SIGNATURE**：手写签名控件类型</li></ul>
    */
    @SerializedName("ApproverSignComponentType")
    @Expose
    private String ApproverSignComponentType;

    /**
    * <p>参与方在合同中的角色是按照创建合同的时候来排序的，解除协议默认会将第一个参与人叫<code>甲方</code>,第二个叫<code>乙方</code>,  第三个叫<code>丙方</code>，以此类推。</p><p>如果需改动此参与人的角色名字，可用此字段指定，由汉字,英文字符,数字组成，最大20个字。</p><p><img src="https://qcloudimg.tencent-cloud.cn/raw/973a820ab66d1ce57082c160c2b2d44a.png" alt="image"></p>
    */
    @SerializedName("ApproverSignRole")
    @Expose
    private String ApproverSignRole;

    /**
    * <p>印章Id，签署控件类型为印章时，用于指定本企业签署方在解除协议中使用那个印章进行签署</p>
    */
    @SerializedName("ApproverSignSealId")
    @Expose
    private String ApproverSignSealId;

    /**
    * <p>要更换的原合同参与人RecipientId编号。(可通过接口<a href="https://qian.tencent.com/developers/companyApis/queryFlows/DescribeFlowInfo/">DescribeFlowInfo</a>查询签署人的RecipientId编号)<br></p>
    */
    @SerializedName("RelievedApproverRecipientId")
    @Expose
    private String RelievedApproverRecipientId;

    /**
     * Get <p>签署人姓名，最大长度50个字。</p> 
     * @return Name <p>签署人姓名，最大长度50个字。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>签署人姓名，最大长度50个字。</p>
     * @param Name <p>签署人姓名，最大长度50个字。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>签署人手机号。</p> 
     * @return Mobile <p>签署人手机号。</p>
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set <p>签署人手机号。</p>
     * @param Mobile <p>签署人手机号。</p>
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get <p>要更换的原合同参与人RecipientId编号。(可通过接口<a href="https://qian.tencent.com/developers/companyApis/queryFlows/DescribeFlowInfo/">DescribeFlowInfo</a>查询签署人的RecipientId编号)<br></p> 
     * @return RelievedApproverReceiptId <p>要更换的原合同参与人RecipientId编号。(可通过接口<a href="https://qian.tencent.com/developers/companyApis/queryFlows/DescribeFlowInfo/">DescribeFlowInfo</a>查询签署人的RecipientId编号)<br></p>
     * @deprecated
     */
    @Deprecated
    public String getRelievedApproverReceiptId() {
        return this.RelievedApproverReceiptId;
    }

    /**
     * Set <p>要更换的原合同参与人RecipientId编号。(可通过接口<a href="https://qian.tencent.com/developers/companyApis/queryFlows/DescribeFlowInfo/">DescribeFlowInfo</a>查询签署人的RecipientId编号)<br></p>
     * @param RelievedApproverReceiptId <p>要更换的原合同参与人RecipientId编号。(可通过接口<a href="https://qian.tencent.com/developers/companyApis/queryFlows/DescribeFlowInfo/">DescribeFlowInfo</a>查询签署人的RecipientId编号)<br></p>
     * @deprecated
     */
    @Deprecated
    public void setRelievedApproverReceiptId(String RelievedApproverReceiptId) {
        this.RelievedApproverReceiptId = RelievedApproverReceiptId;
    }

    /**
     * Get <p>指定签署人类型，目前仅支持<ul><li> <strong>ORGANIZATION</strong>：企业（默认值）</li><li> <strong>ENTERPRISESERVER</strong>：企业“授权签”</li></ul></p> 
     * @return ApproverType <p>指定签署人类型，目前仅支持<ul><li> <strong>ORGANIZATION</strong>：企业（默认值）</li><li> <strong>ENTERPRISESERVER</strong>：企业“授权签”</li></ul></p>
     */
    public String getApproverType() {
        return this.ApproverType;
    }

    /**
     * Set <p>指定签署人类型，目前仅支持<ul><li> <strong>ORGANIZATION</strong>：企业（默认值）</li><li> <strong>ENTERPRISESERVER</strong>：企业“授权签”</li></ul></p>
     * @param ApproverType <p>指定签署人类型，目前仅支持<ul><li> <strong>ORGANIZATION</strong>：企业（默认值）</li><li> <strong>ENTERPRISESERVER</strong>：企业“授权签”</li></ul></p>
     */
    public void setApproverType(String ApproverType) {
        this.ApproverType = ApproverType;
    }

    /**
     * Get <p>签署控件类型，支持自定义企业签署方的签署控件类型</p><ul><li> **SIGN_SEAL**：默认为印章控件类型（默认值）</li><li> **SIGN_SIGNATURE**：手写签名控件类型</li></ul> 
     * @return ApproverSignComponentType <p>签署控件类型，支持自定义企业签署方的签署控件类型</p><ul><li> **SIGN_SEAL**：默认为印章控件类型（默认值）</li><li> **SIGN_SIGNATURE**：手写签名控件类型</li></ul>
     */
    public String getApproverSignComponentType() {
        return this.ApproverSignComponentType;
    }

    /**
     * Set <p>签署控件类型，支持自定义企业签署方的签署控件类型</p><ul><li> **SIGN_SEAL**：默认为印章控件类型（默认值）</li><li> **SIGN_SIGNATURE**：手写签名控件类型</li></ul>
     * @param ApproverSignComponentType <p>签署控件类型，支持自定义企业签署方的签署控件类型</p><ul><li> **SIGN_SEAL**：默认为印章控件类型（默认值）</li><li> **SIGN_SIGNATURE**：手写签名控件类型</li></ul>
     */
    public void setApproverSignComponentType(String ApproverSignComponentType) {
        this.ApproverSignComponentType = ApproverSignComponentType;
    }

    /**
     * Get <p>参与方在合同中的角色是按照创建合同的时候来排序的，解除协议默认会将第一个参与人叫<code>甲方</code>,第二个叫<code>乙方</code>,  第三个叫<code>丙方</code>，以此类推。</p><p>如果需改动此参与人的角色名字，可用此字段指定，由汉字,英文字符,数字组成，最大20个字。</p><p><img src="https://qcloudimg.tencent-cloud.cn/raw/973a820ab66d1ce57082c160c2b2d44a.png" alt="image"></p> 
     * @return ApproverSignRole <p>参与方在合同中的角色是按照创建合同的时候来排序的，解除协议默认会将第一个参与人叫<code>甲方</code>,第二个叫<code>乙方</code>,  第三个叫<code>丙方</code>，以此类推。</p><p>如果需改动此参与人的角色名字，可用此字段指定，由汉字,英文字符,数字组成，最大20个字。</p><p><img src="https://qcloudimg.tencent-cloud.cn/raw/973a820ab66d1ce57082c160c2b2d44a.png" alt="image"></p>
     */
    public String getApproverSignRole() {
        return this.ApproverSignRole;
    }

    /**
     * Set <p>参与方在合同中的角色是按照创建合同的时候来排序的，解除协议默认会将第一个参与人叫<code>甲方</code>,第二个叫<code>乙方</code>,  第三个叫<code>丙方</code>，以此类推。</p><p>如果需改动此参与人的角色名字，可用此字段指定，由汉字,英文字符,数字组成，最大20个字。</p><p><img src="https://qcloudimg.tencent-cloud.cn/raw/973a820ab66d1ce57082c160c2b2d44a.png" alt="image"></p>
     * @param ApproverSignRole <p>参与方在合同中的角色是按照创建合同的时候来排序的，解除协议默认会将第一个参与人叫<code>甲方</code>,第二个叫<code>乙方</code>,  第三个叫<code>丙方</code>，以此类推。</p><p>如果需改动此参与人的角色名字，可用此字段指定，由汉字,英文字符,数字组成，最大20个字。</p><p><img src="https://qcloudimg.tencent-cloud.cn/raw/973a820ab66d1ce57082c160c2b2d44a.png" alt="image"></p>
     */
    public void setApproverSignRole(String ApproverSignRole) {
        this.ApproverSignRole = ApproverSignRole;
    }

    /**
     * Get <p>印章Id，签署控件类型为印章时，用于指定本企业签署方在解除协议中使用那个印章进行签署</p> 
     * @return ApproverSignSealId <p>印章Id，签署控件类型为印章时，用于指定本企业签署方在解除协议中使用那个印章进行签署</p>
     */
    public String getApproverSignSealId() {
        return this.ApproverSignSealId;
    }

    /**
     * Set <p>印章Id，签署控件类型为印章时，用于指定本企业签署方在解除协议中使用那个印章进行签署</p>
     * @param ApproverSignSealId <p>印章Id，签署控件类型为印章时，用于指定本企业签署方在解除协议中使用那个印章进行签署</p>
     */
    public void setApproverSignSealId(String ApproverSignSealId) {
        this.ApproverSignSealId = ApproverSignSealId;
    }

    /**
     * Get <p>要更换的原合同参与人RecipientId编号。(可通过接口<a href="https://qian.tencent.com/developers/companyApis/queryFlows/DescribeFlowInfo/">DescribeFlowInfo</a>查询签署人的RecipientId编号)<br></p> 
     * @return RelievedApproverRecipientId <p>要更换的原合同参与人RecipientId编号。(可通过接口<a href="https://qian.tencent.com/developers/companyApis/queryFlows/DescribeFlowInfo/">DescribeFlowInfo</a>查询签署人的RecipientId编号)<br></p>
     */
    public String getRelievedApproverRecipientId() {
        return this.RelievedApproverRecipientId;
    }

    /**
     * Set <p>要更换的原合同参与人RecipientId编号。(可通过接口<a href="https://qian.tencent.com/developers/companyApis/queryFlows/DescribeFlowInfo/">DescribeFlowInfo</a>查询签署人的RecipientId编号)<br></p>
     * @param RelievedApproverRecipientId <p>要更换的原合同参与人RecipientId编号。(可通过接口<a href="https://qian.tencent.com/developers/companyApis/queryFlows/DescribeFlowInfo/">DescribeFlowInfo</a>查询签署人的RecipientId编号)<br></p>
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

