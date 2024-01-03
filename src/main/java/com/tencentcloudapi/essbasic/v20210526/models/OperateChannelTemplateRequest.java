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

public class OperateChannelTemplateRequest extends AbstractModel {

    /**
    * 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识: Agent.AppId</li>
</ul>
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 操作类型，可取值如下:
<ul>
<li>SELECT:  查询</li>
<li>DELETE:  删除</li>
<li>UPDATE: 更新</li>
</ul>
    */
    @SerializedName("OperateType")
    @Expose
    private String OperateType;

    /**
    * 合同模板ID，为32位字符串。
注: ` 此处为第三方应用平台模板库模板ID，非子客模板ID`
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 第三方平台子客企业的唯一标识，支持批量(用,分割)，
    */
    @SerializedName("ProxyOrganizationOpenIds")
    @Expose
    private String ProxyOrganizationOpenIds;

    /**
    * 模板可见范围, 可以设置的值如下:

**all**: 所有本第三方应用合作企业可见
**part**: 指定的本第三方应用合作企业

对应控制台的位置
![image](https://qcloudimg.tencent-cloud.cn/raw/68b97812c68d6af77a5991e3bff5c790.png)

    */
    @SerializedName("AuthTag")
    @Expose
    private String AuthTag;

    /**
    * 当OperateType=UPDATE时，可以通过设置此字段对模板启停用状态进行操作。
<ul>
<li>0: 不修改模板可用状态</li>
<li>1:  启用模板</li>
<li>2: 停用模板</li>
</ul>
启用后模板可以正常领取。

停用后，推送方式为【自动推送】的模板则无法被子客使用，推送方式为【手动领取】的模板则无法出现被模板库被子客领用。
如果Available更新失败，会直接返回错误。
    */
    @SerializedName("Available")
    @Expose
    private Long Available;

    /**
    * 暂未开放
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
     * Get 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识: Agent.AppId</li>
</ul> 
     * @return Agent 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识: Agent.AppId</li>
</ul>
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识: Agent.AppId</li>
</ul>
     * @param Agent 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识: Agent.AppId</li>
</ul>
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 操作类型，可取值如下:
<ul>
<li>SELECT:  查询</li>
<li>DELETE:  删除</li>
<li>UPDATE: 更新</li>
</ul> 
     * @return OperateType 操作类型，可取值如下:
<ul>
<li>SELECT:  查询</li>
<li>DELETE:  删除</li>
<li>UPDATE: 更新</li>
</ul>
     */
    public String getOperateType() {
        return this.OperateType;
    }

    /**
     * Set 操作类型，可取值如下:
<ul>
<li>SELECT:  查询</li>
<li>DELETE:  删除</li>
<li>UPDATE: 更新</li>
</ul>
     * @param OperateType 操作类型，可取值如下:
<ul>
<li>SELECT:  查询</li>
<li>DELETE:  删除</li>
<li>UPDATE: 更新</li>
</ul>
     */
    public void setOperateType(String OperateType) {
        this.OperateType = OperateType;
    }

    /**
     * Get 合同模板ID，为32位字符串。
注: ` 此处为第三方应用平台模板库模板ID，非子客模板ID` 
     * @return TemplateId 合同模板ID，为32位字符串。
注: ` 此处为第三方应用平台模板库模板ID，非子客模板ID`
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 合同模板ID，为32位字符串。
注: ` 此处为第三方应用平台模板库模板ID，非子客模板ID`
     * @param TemplateId 合同模板ID，为32位字符串。
注: ` 此处为第三方应用平台模板库模板ID，非子客模板ID`
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 第三方平台子客企业的唯一标识，支持批量(用,分割)， 
     * @return ProxyOrganizationOpenIds 第三方平台子客企业的唯一标识，支持批量(用,分割)，
     */
    public String getProxyOrganizationOpenIds() {
        return this.ProxyOrganizationOpenIds;
    }

    /**
     * Set 第三方平台子客企业的唯一标识，支持批量(用,分割)，
     * @param ProxyOrganizationOpenIds 第三方平台子客企业的唯一标识，支持批量(用,分割)，
     */
    public void setProxyOrganizationOpenIds(String ProxyOrganizationOpenIds) {
        this.ProxyOrganizationOpenIds = ProxyOrganizationOpenIds;
    }

    /**
     * Get 模板可见范围, 可以设置的值如下:

**all**: 所有本第三方应用合作企业可见
**part**: 指定的本第三方应用合作企业

对应控制台的位置
![image](https://qcloudimg.tencent-cloud.cn/raw/68b97812c68d6af77a5991e3bff5c790.png)
 
     * @return AuthTag 模板可见范围, 可以设置的值如下:

**all**: 所有本第三方应用合作企业可见
**part**: 指定的本第三方应用合作企业

对应控制台的位置
![image](https://qcloudimg.tencent-cloud.cn/raw/68b97812c68d6af77a5991e3bff5c790.png)

     */
    public String getAuthTag() {
        return this.AuthTag;
    }

    /**
     * Set 模板可见范围, 可以设置的值如下:

**all**: 所有本第三方应用合作企业可见
**part**: 指定的本第三方应用合作企业

对应控制台的位置
![image](https://qcloudimg.tencent-cloud.cn/raw/68b97812c68d6af77a5991e3bff5c790.png)

     * @param AuthTag 模板可见范围, 可以设置的值如下:

**all**: 所有本第三方应用合作企业可见
**part**: 指定的本第三方应用合作企业

对应控制台的位置
![image](https://qcloudimg.tencent-cloud.cn/raw/68b97812c68d6af77a5991e3bff5c790.png)

     */
    public void setAuthTag(String AuthTag) {
        this.AuthTag = AuthTag;
    }

    /**
     * Get 当OperateType=UPDATE时，可以通过设置此字段对模板启停用状态进行操作。
<ul>
<li>0: 不修改模板可用状态</li>
<li>1:  启用模板</li>
<li>2: 停用模板</li>
</ul>
启用后模板可以正常领取。

停用后，推送方式为【自动推送】的模板则无法被子客使用，推送方式为【手动领取】的模板则无法出现被模板库被子客领用。
如果Available更新失败，会直接返回错误。 
     * @return Available 当OperateType=UPDATE时，可以通过设置此字段对模板启停用状态进行操作。
<ul>
<li>0: 不修改模板可用状态</li>
<li>1:  启用模板</li>
<li>2: 停用模板</li>
</ul>
启用后模板可以正常领取。

停用后，推送方式为【自动推送】的模板则无法被子客使用，推送方式为【手动领取】的模板则无法出现被模板库被子客领用。
如果Available更新失败，会直接返回错误。
     */
    public Long getAvailable() {
        return this.Available;
    }

    /**
     * Set 当OperateType=UPDATE时，可以通过设置此字段对模板启停用状态进行操作。
<ul>
<li>0: 不修改模板可用状态</li>
<li>1:  启用模板</li>
<li>2: 停用模板</li>
</ul>
启用后模板可以正常领取。

停用后，推送方式为【自动推送】的模板则无法被子客使用，推送方式为【手动领取】的模板则无法出现被模板库被子客领用。
如果Available更新失败，会直接返回错误。
     * @param Available 当OperateType=UPDATE时，可以通过设置此字段对模板启停用状态进行操作。
<ul>
<li>0: 不修改模板可用状态</li>
<li>1:  启用模板</li>
<li>2: 停用模板</li>
</ul>
启用后模板可以正常领取。

停用后，推送方式为【自动推送】的模板则无法被子客使用，推送方式为【手动领取】的模板则无法出现被模板库被子客领用。
如果Available更新失败，会直接返回错误。
     */
    public void setAvailable(Long Available) {
        this.Available = Available;
    }

    /**
     * Get 暂未开放 
     * @return Operator 暂未开放
     * @deprecated
     */
    @Deprecated
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 暂未开放
     * @param Operator 暂未开放
     * @deprecated
     */
    @Deprecated
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
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

    }
}

