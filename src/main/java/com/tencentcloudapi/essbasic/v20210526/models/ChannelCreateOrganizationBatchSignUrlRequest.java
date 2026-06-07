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

public class ChannelCreateOrganizationBatchSignUrlRequest extends AbstractModel {

    /**
    * <p>关于渠道应用的相关信息，包括子客企业及应用编、号等详细内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p>
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * <p>请指定需执行批量签署的流程ID，数量范围为1-100。 您可登录腾讯电子签控制台，浏览 &quot;合同&quot;-&gt;&quot;合同中心&quot; 以查阅某一合同的FlowId（在页面中显示为合同ID）。 用户将利用链接对这些合同实施批量操作。</p>
    */
    @SerializedName("FlowIds")
    @Expose
    private String [] FlowIds;

    /**
    * <p>第三方应用平台的用户openid。 您可登录腾讯电子签控制台，在 &quot;更多能力&quot;-&gt;&quot;组织管理&quot; 中查阅某位员工的OpenId。 OpenId必须是传入合同（FlowId）中的签署人。</p><ul><li>1. 若OpenId为空，Name和Mobile 必须提供。</li><li>2. 若OpenId 与 Name，Mobile均存在，将优先采用OpenId对应的员工。    </li></ul>
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * <p>签署方经办人的姓名。<br>经办人的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。</p><p>注：<code>请确保和合同中填入的一致</code></p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>员工手机号，必须与姓名一起使用。 如果OpenId为空，则此字段不能为空。同时，姓名和手机号码必须与传入合同（FlowId）中的签署人信息一致。</p>
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * <p>合同组Id，传入此参数则可以不传FlowIds</p>
    */
    @SerializedName("FlowGroupId")
    @Expose
    private String FlowGroupId;

    /**
    * <p>是否允许此链接中签署方批量拒签。 <ul><li>false (默认): 不允许批量拒签</li> <li>true : 允许批量拒签。</li></ul></p>
    */
    @SerializedName("CanBatchReject")
    @Expose
    private Boolean CanBatchReject;

    /**
    * <p>动态签署方领取链接配置。</p>
    */
    @SerializedName("DynamicSignOption")
    @Expose
    private DynamicSignOption DynamicSignOption;

    /**
    * <p>为签署方经办人在签署合同中的参与方ID，必须与参数FlowIds数组一一对应。 注：生成动态签署方领取时此参数必传。</p>
    */
    @SerializedName("RecipientIds")
    @Expose
    private String [] RecipientIds;

    /**
     * Get <p>关于渠道应用的相关信息，包括子客企业及应用编、号等详细内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p> 
     * @return Agent <p>关于渠道应用的相关信息，包括子客企业及应用编、号等详细内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p>
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set <p>关于渠道应用的相关信息，包括子客企业及应用编、号等详细内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p>
     * @param Agent <p>关于渠道应用的相关信息，包括子客企业及应用编、号等详细内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p>
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get <p>请指定需执行批量签署的流程ID，数量范围为1-100。 您可登录腾讯电子签控制台，浏览 &quot;合同&quot;-&gt;&quot;合同中心&quot; 以查阅某一合同的FlowId（在页面中显示为合同ID）。 用户将利用链接对这些合同实施批量操作。</p> 
     * @return FlowIds <p>请指定需执行批量签署的流程ID，数量范围为1-100。 您可登录腾讯电子签控制台，浏览 &quot;合同&quot;-&gt;&quot;合同中心&quot; 以查阅某一合同的FlowId（在页面中显示为合同ID）。 用户将利用链接对这些合同实施批量操作。</p>
     */
    public String [] getFlowIds() {
        return this.FlowIds;
    }

    /**
     * Set <p>请指定需执行批量签署的流程ID，数量范围为1-100。 您可登录腾讯电子签控制台，浏览 &quot;合同&quot;-&gt;&quot;合同中心&quot; 以查阅某一合同的FlowId（在页面中显示为合同ID）。 用户将利用链接对这些合同实施批量操作。</p>
     * @param FlowIds <p>请指定需执行批量签署的流程ID，数量范围为1-100。 您可登录腾讯电子签控制台，浏览 &quot;合同&quot;-&gt;&quot;合同中心&quot; 以查阅某一合同的FlowId（在页面中显示为合同ID）。 用户将利用链接对这些合同实施批量操作。</p>
     */
    public void setFlowIds(String [] FlowIds) {
        this.FlowIds = FlowIds;
    }

    /**
     * Get <p>第三方应用平台的用户openid。 您可登录腾讯电子签控制台，在 &quot;更多能力&quot;-&gt;&quot;组织管理&quot; 中查阅某位员工的OpenId。 OpenId必须是传入合同（FlowId）中的签署人。</p><ul><li>1. 若OpenId为空，Name和Mobile 必须提供。</li><li>2. 若OpenId 与 Name，Mobile均存在，将优先采用OpenId对应的员工。    </li></ul> 
     * @return OpenId <p>第三方应用平台的用户openid。 您可登录腾讯电子签控制台，在 &quot;更多能力&quot;-&gt;&quot;组织管理&quot; 中查阅某位员工的OpenId。 OpenId必须是传入合同（FlowId）中的签署人。</p><ul><li>1. 若OpenId为空，Name和Mobile 必须提供。</li><li>2. 若OpenId 与 Name，Mobile均存在，将优先采用OpenId对应的员工。    </li></ul>
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set <p>第三方应用平台的用户openid。 您可登录腾讯电子签控制台，在 &quot;更多能力&quot;-&gt;&quot;组织管理&quot; 中查阅某位员工的OpenId。 OpenId必须是传入合同（FlowId）中的签署人。</p><ul><li>1. 若OpenId为空，Name和Mobile 必须提供。</li><li>2. 若OpenId 与 Name，Mobile均存在，将优先采用OpenId对应的员工。    </li></ul>
     * @param OpenId <p>第三方应用平台的用户openid。 您可登录腾讯电子签控制台，在 &quot;更多能力&quot;-&gt;&quot;组织管理&quot; 中查阅某位员工的OpenId。 OpenId必须是传入合同（FlowId）中的签署人。</p><ul><li>1. 若OpenId为空，Name和Mobile 必须提供。</li><li>2. 若OpenId 与 Name，Mobile均存在，将优先采用OpenId对应的员工。    </li></ul>
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get <p>签署方经办人的姓名。<br>经办人的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。</p><p>注：<code>请确保和合同中填入的一致</code></p> 
     * @return Name <p>签署方经办人的姓名。<br>经办人的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。</p><p>注：<code>请确保和合同中填入的一致</code></p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>签署方经办人的姓名。<br>经办人的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。</p><p>注：<code>请确保和合同中填入的一致</code></p>
     * @param Name <p>签署方经办人的姓名。<br>经办人的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。</p><p>注：<code>请确保和合同中填入的一致</code></p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>员工手机号，必须与姓名一起使用。 如果OpenId为空，则此字段不能为空。同时，姓名和手机号码必须与传入合同（FlowId）中的签署人信息一致。</p> 
     * @return Mobile <p>员工手机号，必须与姓名一起使用。 如果OpenId为空，则此字段不能为空。同时，姓名和手机号码必须与传入合同（FlowId）中的签署人信息一致。</p>
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set <p>员工手机号，必须与姓名一起使用。 如果OpenId为空，则此字段不能为空。同时，姓名和手机号码必须与传入合同（FlowId）中的签署人信息一致。</p>
     * @param Mobile <p>员工手机号，必须与姓名一起使用。 如果OpenId为空，则此字段不能为空。同时，姓名和手机号码必须与传入合同（FlowId）中的签署人信息一致。</p>
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get <p>合同组Id，传入此参数则可以不传FlowIds</p> 
     * @return FlowGroupId <p>合同组Id，传入此参数则可以不传FlowIds</p>
     */
    public String getFlowGroupId() {
        return this.FlowGroupId;
    }

    /**
     * Set <p>合同组Id，传入此参数则可以不传FlowIds</p>
     * @param FlowGroupId <p>合同组Id，传入此参数则可以不传FlowIds</p>
     */
    public void setFlowGroupId(String FlowGroupId) {
        this.FlowGroupId = FlowGroupId;
    }

    /**
     * Get <p>是否允许此链接中签署方批量拒签。 <ul><li>false (默认): 不允许批量拒签</li> <li>true : 允许批量拒签。</li></ul></p> 
     * @return CanBatchReject <p>是否允许此链接中签署方批量拒签。 <ul><li>false (默认): 不允许批量拒签</li> <li>true : 允许批量拒签。</li></ul></p>
     */
    public Boolean getCanBatchReject() {
        return this.CanBatchReject;
    }

    /**
     * Set <p>是否允许此链接中签署方批量拒签。 <ul><li>false (默认): 不允许批量拒签</li> <li>true : 允许批量拒签。</li></ul></p>
     * @param CanBatchReject <p>是否允许此链接中签署方批量拒签。 <ul><li>false (默认): 不允许批量拒签</li> <li>true : 允许批量拒签。</li></ul></p>
     */
    public void setCanBatchReject(Boolean CanBatchReject) {
        this.CanBatchReject = CanBatchReject;
    }

    /**
     * Get <p>动态签署方领取链接配置。</p> 
     * @return DynamicSignOption <p>动态签署方领取链接配置。</p>
     */
    public DynamicSignOption getDynamicSignOption() {
        return this.DynamicSignOption;
    }

    /**
     * Set <p>动态签署方领取链接配置。</p>
     * @param DynamicSignOption <p>动态签署方领取链接配置。</p>
     */
    public void setDynamicSignOption(DynamicSignOption DynamicSignOption) {
        this.DynamicSignOption = DynamicSignOption;
    }

    /**
     * Get <p>为签署方经办人在签署合同中的参与方ID，必须与参数FlowIds数组一一对应。 注：生成动态签署方领取时此参数必传。</p> 
     * @return RecipientIds <p>为签署方经办人在签署合同中的参与方ID，必须与参数FlowIds数组一一对应。 注：生成动态签署方领取时此参数必传。</p>
     */
    public String [] getRecipientIds() {
        return this.RecipientIds;
    }

    /**
     * Set <p>为签署方经办人在签署合同中的参与方ID，必须与参数FlowIds数组一一对应。 注：生成动态签署方领取时此参数必传。</p>
     * @param RecipientIds <p>为签署方经办人在签署合同中的参与方ID，必须与参数FlowIds数组一一对应。 注：生成动态签署方领取时此参数必传。</p>
     */
    public void setRecipientIds(String [] RecipientIds) {
        this.RecipientIds = RecipientIds;
    }

    public ChannelCreateOrganizationBatchSignUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelCreateOrganizationBatchSignUrlRequest(ChannelCreateOrganizationBatchSignUrlRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.FlowIds != null) {
            this.FlowIds = new String[source.FlowIds.length];
            for (int i = 0; i < source.FlowIds.length; i++) {
                this.FlowIds[i] = new String(source.FlowIds[i]);
            }
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.FlowGroupId != null) {
            this.FlowGroupId = new String(source.FlowGroupId);
        }
        if (source.CanBatchReject != null) {
            this.CanBatchReject = new Boolean(source.CanBatchReject);
        }
        if (source.DynamicSignOption != null) {
            this.DynamicSignOption = new DynamicSignOption(source.DynamicSignOption);
        }
        if (source.RecipientIds != null) {
            this.RecipientIds = new String[source.RecipientIds.length];
            for (int i = 0; i < source.RecipientIds.length; i++) {
                this.RecipientIds[i] = new String(source.RecipientIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamArraySimple(map, prefix + "FlowIds.", this.FlowIds);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "FlowGroupId", this.FlowGroupId);
        this.setParamSimple(map, prefix + "CanBatchReject", this.CanBatchReject);
        this.setParamObj(map, prefix + "DynamicSignOption.", this.DynamicSignOption);
        this.setParamArraySimple(map, prefix + "RecipientIds.", this.RecipientIds);

    }
}

