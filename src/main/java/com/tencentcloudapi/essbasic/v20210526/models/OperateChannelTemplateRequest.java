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

public class OperateChannelTemplateRequest extends AbstractModel {

    /**
    * <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识: Agent.AppId</li></ul>
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * <p>操作类型，可取值如下:</p><ul><li>SELECT:  查询</li><li>DELETE:  删除</li><li>UPDATE: 更新</li><li> DELETETEMPLATE: 删除指定的模板</li></ul>
    */
    @SerializedName("OperateType")
    @Expose
    private String OperateType;

    /**
    * <p>合同模板ID，为32位字符串。<br>注: <code>此处为第三方应用平台模板库模板ID，非子客模板ID</code></p>
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * <p>第三方平台子客企业的唯一标识，支持批量(用,分割)<br>一次批量操作最多支持100个第三方平台子客</p>
    */
    @SerializedName("ProxyOrganizationOpenIds")
    @Expose
    private String ProxyOrganizationOpenIds;

    /**
    * <p>模板可见范围, 可以设置的值如下:</p><p><strong>all</strong>: 所有本第三方应用合作企业可见<br><strong>part</strong>: 指定的本第三方应用合作企业</p><p>对应控制台的位置<br><img src="https://qcloudimg.tencent-cloud.cn/raw/68b97812c68d6af77a5991e3bff5c790.png" alt="image"></p>
    */
    @SerializedName("AuthTag")
    @Expose
    private String AuthTag;

    /**
    * <p>当OperateType=UPDATE时，可以通过设置此字段对模板启停用状态进行操作。</p><ul><li>0: 不修改模板可用状态</li><li>1:  启用模板</li><li>2: 停用模板</li></ul>启用后模板可以正常领取。<p>停用后，推送方式为【自动推送】的模板则无法被子客使用，推送方式为【手动领取】的模板则无法出现被模板库被子客领用。<br>如果Available更新失败，会直接返回错误。</p>
    */
    @SerializedName("Available")
    @Expose
    private Long Available;

    /**
    * <p>暂未开放</p>
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * <p>指定分页每页返回的数据条数，单页最大支持 100。<br>不传默认值为 20</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页查询偏移量，默认为0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识: Agent.AppId</li></ul> 
     * @return Agent <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识: Agent.AppId</li></ul>
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识: Agent.AppId</li></ul>
     * @param Agent <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识: Agent.AppId</li></ul>
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get <p>操作类型，可取值如下:</p><ul><li>SELECT:  查询</li><li>DELETE:  删除</li><li>UPDATE: 更新</li><li> DELETETEMPLATE: 删除指定的模板</li></ul> 
     * @return OperateType <p>操作类型，可取值如下:</p><ul><li>SELECT:  查询</li><li>DELETE:  删除</li><li>UPDATE: 更新</li><li> DELETETEMPLATE: 删除指定的模板</li></ul>
     */
    public String getOperateType() {
        return this.OperateType;
    }

    /**
     * Set <p>操作类型，可取值如下:</p><ul><li>SELECT:  查询</li><li>DELETE:  删除</li><li>UPDATE: 更新</li><li> DELETETEMPLATE: 删除指定的模板</li></ul>
     * @param OperateType <p>操作类型，可取值如下:</p><ul><li>SELECT:  查询</li><li>DELETE:  删除</li><li>UPDATE: 更新</li><li> DELETETEMPLATE: 删除指定的模板</li></ul>
     */
    public void setOperateType(String OperateType) {
        this.OperateType = OperateType;
    }

    /**
     * Get <p>合同模板ID，为32位字符串。<br>注: <code>此处为第三方应用平台模板库模板ID，非子客模板ID</code></p> 
     * @return TemplateId <p>合同模板ID，为32位字符串。<br>注: <code>此处为第三方应用平台模板库模板ID，非子客模板ID</code></p>
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>合同模板ID，为32位字符串。<br>注: <code>此处为第三方应用平台模板库模板ID，非子客模板ID</code></p>
     * @param TemplateId <p>合同模板ID，为32位字符串。<br>注: <code>此处为第三方应用平台模板库模板ID，非子客模板ID</code></p>
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>第三方平台子客企业的唯一标识，支持批量(用,分割)<br>一次批量操作最多支持100个第三方平台子客</p> 
     * @return ProxyOrganizationOpenIds <p>第三方平台子客企业的唯一标识，支持批量(用,分割)<br>一次批量操作最多支持100个第三方平台子客</p>
     */
    public String getProxyOrganizationOpenIds() {
        return this.ProxyOrganizationOpenIds;
    }

    /**
     * Set <p>第三方平台子客企业的唯一标识，支持批量(用,分割)<br>一次批量操作最多支持100个第三方平台子客</p>
     * @param ProxyOrganizationOpenIds <p>第三方平台子客企业的唯一标识，支持批量(用,分割)<br>一次批量操作最多支持100个第三方平台子客</p>
     */
    public void setProxyOrganizationOpenIds(String ProxyOrganizationOpenIds) {
        this.ProxyOrganizationOpenIds = ProxyOrganizationOpenIds;
    }

    /**
     * Get <p>模板可见范围, 可以设置的值如下:</p><p><strong>all</strong>: 所有本第三方应用合作企业可见<br><strong>part</strong>: 指定的本第三方应用合作企业</p><p>对应控制台的位置<br><img src="https://qcloudimg.tencent-cloud.cn/raw/68b97812c68d6af77a5991e3bff5c790.png" alt="image"></p> 
     * @return AuthTag <p>模板可见范围, 可以设置的值如下:</p><p><strong>all</strong>: 所有本第三方应用合作企业可见<br><strong>part</strong>: 指定的本第三方应用合作企业</p><p>对应控制台的位置<br><img src="https://qcloudimg.tencent-cloud.cn/raw/68b97812c68d6af77a5991e3bff5c790.png" alt="image"></p>
     */
    public String getAuthTag() {
        return this.AuthTag;
    }

    /**
     * Set <p>模板可见范围, 可以设置的值如下:</p><p><strong>all</strong>: 所有本第三方应用合作企业可见<br><strong>part</strong>: 指定的本第三方应用合作企业</p><p>对应控制台的位置<br><img src="https://qcloudimg.tencent-cloud.cn/raw/68b97812c68d6af77a5991e3bff5c790.png" alt="image"></p>
     * @param AuthTag <p>模板可见范围, 可以设置的值如下:</p><p><strong>all</strong>: 所有本第三方应用合作企业可见<br><strong>part</strong>: 指定的本第三方应用合作企业</p><p>对应控制台的位置<br><img src="https://qcloudimg.tencent-cloud.cn/raw/68b97812c68d6af77a5991e3bff5c790.png" alt="image"></p>
     */
    public void setAuthTag(String AuthTag) {
        this.AuthTag = AuthTag;
    }

    /**
     * Get <p>当OperateType=UPDATE时，可以通过设置此字段对模板启停用状态进行操作。</p><ul><li>0: 不修改模板可用状态</li><li>1:  启用模板</li><li>2: 停用模板</li></ul>启用后模板可以正常领取。<p>停用后，推送方式为【自动推送】的模板则无法被子客使用，推送方式为【手动领取】的模板则无法出现被模板库被子客领用。<br>如果Available更新失败，会直接返回错误。</p> 
     * @return Available <p>当OperateType=UPDATE时，可以通过设置此字段对模板启停用状态进行操作。</p><ul><li>0: 不修改模板可用状态</li><li>1:  启用模板</li><li>2: 停用模板</li></ul>启用后模板可以正常领取。<p>停用后，推送方式为【自动推送】的模板则无法被子客使用，推送方式为【手动领取】的模板则无法出现被模板库被子客领用。<br>如果Available更新失败，会直接返回错误。</p>
     */
    public Long getAvailable() {
        return this.Available;
    }

    /**
     * Set <p>当OperateType=UPDATE时，可以通过设置此字段对模板启停用状态进行操作。</p><ul><li>0: 不修改模板可用状态</li><li>1:  启用模板</li><li>2: 停用模板</li></ul>启用后模板可以正常领取。<p>停用后，推送方式为【自动推送】的模板则无法被子客使用，推送方式为【手动领取】的模板则无法出现被模板库被子客领用。<br>如果Available更新失败，会直接返回错误。</p>
     * @param Available <p>当OperateType=UPDATE时，可以通过设置此字段对模板启停用状态进行操作。</p><ul><li>0: 不修改模板可用状态</li><li>1:  启用模板</li><li>2: 停用模板</li></ul>启用后模板可以正常领取。<p>停用后，推送方式为【自动推送】的模板则无法被子客使用，推送方式为【手动领取】的模板则无法出现被模板库被子客领用。<br>如果Available更新失败，会直接返回错误。</p>
     */
    public void setAvailable(Long Available) {
        this.Available = Available;
    }

    /**
     * Get <p>暂未开放</p> 
     * @return Operator <p>暂未开放</p>
     * @deprecated
     */
    @Deprecated
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>暂未开放</p>
     * @param Operator <p>暂未开放</p>
     * @deprecated
     */
    @Deprecated
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>指定分页每页返回的数据条数，单页最大支持 100。<br>不传默认值为 20</p> 
     * @return Limit <p>指定分页每页返回的数据条数，单页最大支持 100。<br>不传默认值为 20</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>指定分页每页返回的数据条数，单页最大支持 100。<br>不传默认值为 20</p>
     * @param Limit <p>指定分页每页返回的数据条数，单页最大支持 100。<br>不传默认值为 20</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页查询偏移量，默认为0</p> 
     * @return Offset <p>分页查询偏移量，默认为0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页查询偏移量，默认为0</p>
     * @param Offset <p>分页查询偏移量，默认为0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public OperateChannelTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OperateChannelTemplateRequest(OperateChannelTemplateRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.OperateType != null) {
            this.OperateType = new String(source.OperateType);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.ProxyOrganizationOpenIds != null) {
            this.ProxyOrganizationOpenIds = new String(source.ProxyOrganizationOpenIds);
        }
        if (source.AuthTag != null) {
            this.AuthTag = new String(source.AuthTag);
        }
        if (source.Available != null) {
            this.Available = new Long(source.Available);
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "OperateType", this.OperateType);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "ProxyOrganizationOpenIds", this.ProxyOrganizationOpenIds);
        this.setParamSimple(map, prefix + "AuthTag", this.AuthTag);
        this.setParamSimple(map, prefix + "Available", this.Available);
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

