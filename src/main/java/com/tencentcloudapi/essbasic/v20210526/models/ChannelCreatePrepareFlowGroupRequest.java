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

public class ChannelCreatePrepareFlowGroupRequest extends AbstractModel {

    /**
    * <p>合同组中每个合同签署流程的信息，合同组中最少包含2个合同，不能超过50个合同。</p>
    */
    @SerializedName("BaseFlowInfos")
    @Expose
    private BaseFlowInfo [] BaseFlowInfos;

    /**
    * <p>合同组的名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。</p>
    */
    @SerializedName("FlowGroupName")
    @Expose
    private String FlowGroupName;

    /**
    * <p>资源类型，取值有： <ul><li> <strong>1</strong>：模板</li> <li> <strong>2</strong>：文件</li></ul></p>
    */
    @SerializedName("ResourceType")
    @Expose
    private Long ResourceType;

    /**
    * <p>合同的发起企业和发起人信息，<a href="https://qcloudimg.tencent-cloud.cn/raw/b69f8aad306c40b7b78d096e39b2edbb.png" target="_blank">点击查看合同发起企业和人展示的位置</a></p><p>此接口下面信息必填。</p><ul><li>渠道应用标识: <a href="https://qcloudimg.tencent-cloud.cn/raw/a71872de3d540d55451e3e73a2ad1a6e.png" target="_blank">Agent.AppId</a></li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId（合同的发起企业）</li><li>第三方平台子客企业中的员工标识: Agent.ProxyOperator.OpenId （合同的发起人）</li></ul><p>合同的发起企业和发起人必需已经完成实名，并加入企业</p>
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * <p>合同组发起参数控制，包括对合同组名称、过期时间、发起后签署以及查看等操作</p>
    */
    @SerializedName("FlowGroupOptions")
    @Expose
    private FlowGroupOptions FlowGroupOptions;

    /**
    * <p>合同组类型，会应用到所有子合同</p>
    */
    @SerializedName("FlowGroupType")
    @Expose
    private String FlowGroupType;

    /**
    * <p>合同组过期时间，会应用到所有子合同</p>
    */
    @SerializedName("FlowGroupDeadline")
    @Expose
    private Long FlowGroupDeadline;

    /**
     * Get <p>合同组中每个合同签署流程的信息，合同组中最少包含2个合同，不能超过50个合同。</p> 
     * @return BaseFlowInfos <p>合同组中每个合同签署流程的信息，合同组中最少包含2个合同，不能超过50个合同。</p>
     */
    public BaseFlowInfo [] getBaseFlowInfos() {
        return this.BaseFlowInfos;
    }

    /**
     * Set <p>合同组中每个合同签署流程的信息，合同组中最少包含2个合同，不能超过50个合同。</p>
     * @param BaseFlowInfos <p>合同组中每个合同签署流程的信息，合同组中最少包含2个合同，不能超过50个合同。</p>
     */
    public void setBaseFlowInfos(BaseFlowInfo [] BaseFlowInfos) {
        this.BaseFlowInfos = BaseFlowInfos;
    }

    /**
     * Get <p>合同组的名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。</p> 
     * @return FlowGroupName <p>合同组的名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。</p>
     */
    public String getFlowGroupName() {
        return this.FlowGroupName;
    }

    /**
     * Set <p>合同组的名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。</p>
     * @param FlowGroupName <p>合同组的名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。</p>
     */
    public void setFlowGroupName(String FlowGroupName) {
        this.FlowGroupName = FlowGroupName;
    }

    /**
     * Get <p>资源类型，取值有： <ul><li> <strong>1</strong>：模板</li> <li> <strong>2</strong>：文件</li></ul></p> 
     * @return ResourceType <p>资源类型，取值有： <ul><li> <strong>1</strong>：模板</li> <li> <strong>2</strong>：文件</li></ul></p>
     */
    public Long getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>资源类型，取值有： <ul><li> <strong>1</strong>：模板</li> <li> <strong>2</strong>：文件</li></ul></p>
     * @param ResourceType <p>资源类型，取值有： <ul><li> <strong>1</strong>：模板</li> <li> <strong>2</strong>：文件</li></ul></p>
     */
    public void setResourceType(Long ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get <p>合同的发起企业和发起人信息，<a href="https://qcloudimg.tencent-cloud.cn/raw/b69f8aad306c40b7b78d096e39b2edbb.png" target="_blank">点击查看合同发起企业和人展示的位置</a></p><p>此接口下面信息必填。</p><ul><li>渠道应用标识: <a href="https://qcloudimg.tencent-cloud.cn/raw/a71872de3d540d55451e3e73a2ad1a6e.png" target="_blank">Agent.AppId</a></li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId（合同的发起企业）</li><li>第三方平台子客企业中的员工标识: Agent.ProxyOperator.OpenId （合同的发起人）</li></ul><p>合同的发起企业和发起人必需已经完成实名，并加入企业</p> 
     * @return Agent <p>合同的发起企业和发起人信息，<a href="https://qcloudimg.tencent-cloud.cn/raw/b69f8aad306c40b7b78d096e39b2edbb.png" target="_blank">点击查看合同发起企业和人展示的位置</a></p><p>此接口下面信息必填。</p><ul><li>渠道应用标识: <a href="https://qcloudimg.tencent-cloud.cn/raw/a71872de3d540d55451e3e73a2ad1a6e.png" target="_blank">Agent.AppId</a></li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId（合同的发起企业）</li><li>第三方平台子客企业中的员工标识: Agent.ProxyOperator.OpenId （合同的发起人）</li></ul><p>合同的发起企业和发起人必需已经完成实名，并加入企业</p>
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set <p>合同的发起企业和发起人信息，<a href="https://qcloudimg.tencent-cloud.cn/raw/b69f8aad306c40b7b78d096e39b2edbb.png" target="_blank">点击查看合同发起企业和人展示的位置</a></p><p>此接口下面信息必填。</p><ul><li>渠道应用标识: <a href="https://qcloudimg.tencent-cloud.cn/raw/a71872de3d540d55451e3e73a2ad1a6e.png" target="_blank">Agent.AppId</a></li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId（合同的发起企业）</li><li>第三方平台子客企业中的员工标识: Agent.ProxyOperator.OpenId （合同的发起人）</li></ul><p>合同的发起企业和发起人必需已经完成实名，并加入企业</p>
     * @param Agent <p>合同的发起企业和发起人信息，<a href="https://qcloudimg.tencent-cloud.cn/raw/b69f8aad306c40b7b78d096e39b2edbb.png" target="_blank">点击查看合同发起企业和人展示的位置</a></p><p>此接口下面信息必填。</p><ul><li>渠道应用标识: <a href="https://qcloudimg.tencent-cloud.cn/raw/a71872de3d540d55451e3e73a2ad1a6e.png" target="_blank">Agent.AppId</a></li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId（合同的发起企业）</li><li>第三方平台子客企业中的员工标识: Agent.ProxyOperator.OpenId （合同的发起人）</li></ul><p>合同的发起企业和发起人必需已经完成实名，并加入企业</p>
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get <p>合同组发起参数控制，包括对合同组名称、过期时间、发起后签署以及查看等操作</p> 
     * @return FlowGroupOptions <p>合同组发起参数控制，包括对合同组名称、过期时间、发起后签署以及查看等操作</p>
     */
    public FlowGroupOptions getFlowGroupOptions() {
        return this.FlowGroupOptions;
    }

    /**
     * Set <p>合同组发起参数控制，包括对合同组名称、过期时间、发起后签署以及查看等操作</p>
     * @param FlowGroupOptions <p>合同组发起参数控制，包括对合同组名称、过期时间、发起后签署以及查看等操作</p>
     */
    public void setFlowGroupOptions(FlowGroupOptions FlowGroupOptions) {
        this.FlowGroupOptions = FlowGroupOptions;
    }

    /**
     * Get <p>合同组类型，会应用到所有子合同</p> 
     * @return FlowGroupType <p>合同组类型，会应用到所有子合同</p>
     */
    public String getFlowGroupType() {
        return this.FlowGroupType;
    }

    /**
     * Set <p>合同组类型，会应用到所有子合同</p>
     * @param FlowGroupType <p>合同组类型，会应用到所有子合同</p>
     */
    public void setFlowGroupType(String FlowGroupType) {
        this.FlowGroupType = FlowGroupType;
    }

    /**
     * Get <p>合同组过期时间，会应用到所有子合同</p> 
     * @return FlowGroupDeadline <p>合同组过期时间，会应用到所有子合同</p>
     */
    public Long getFlowGroupDeadline() {
        return this.FlowGroupDeadline;
    }

    /**
     * Set <p>合同组过期时间，会应用到所有子合同</p>
     * @param FlowGroupDeadline <p>合同组过期时间，会应用到所有子合同</p>
     */
    public void setFlowGroupDeadline(Long FlowGroupDeadline) {
        this.FlowGroupDeadline = FlowGroupDeadline;
    }

    public ChannelCreatePrepareFlowGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelCreatePrepareFlowGroupRequest(ChannelCreatePrepareFlowGroupRequest source) {
        if (source.BaseFlowInfos != null) {
            this.BaseFlowInfos = new BaseFlowInfo[source.BaseFlowInfos.length];
            for (int i = 0; i < source.BaseFlowInfos.length; i++) {
                this.BaseFlowInfos[i] = new BaseFlowInfo(source.BaseFlowInfos[i]);
            }
        }
        if (source.FlowGroupName != null) {
            this.FlowGroupName = new String(source.FlowGroupName);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new Long(source.ResourceType);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.FlowGroupOptions != null) {
            this.FlowGroupOptions = new FlowGroupOptions(source.FlowGroupOptions);
        }
        if (source.FlowGroupType != null) {
            this.FlowGroupType = new String(source.FlowGroupType);
        }
        if (source.FlowGroupDeadline != null) {
            this.FlowGroupDeadline = new Long(source.FlowGroupDeadline);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "BaseFlowInfos.", this.BaseFlowInfos);
        this.setParamSimple(map, prefix + "FlowGroupName", this.FlowGroupName);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamObj(map, prefix + "FlowGroupOptions.", this.FlowGroupOptions);
        this.setParamSimple(map, prefix + "FlowGroupType", this.FlowGroupType);
        this.setParamSimple(map, prefix + "FlowGroupDeadline", this.FlowGroupDeadline);

    }
}

