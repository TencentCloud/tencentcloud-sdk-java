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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLLMStatusRequest extends AbstractModel {

    /**
    * <p>开关状态。true：开启，false：关闭。</p>
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * <p>需要操作的域名或者serviceid</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>开关类型，用于指定要操作的防护模块开关。取值如下：<br>1：防护总开关，控制大模型防护功能的全局开启/关闭。<br>2：算力消耗防护规则开关，控制算力消耗限制功能的开启/关闭。<br>3：自定义防护规则开关，控制内容安全自定义规则功能的开启/关闭。<br>4：ToolCall 防护开关，控制工具调用安全检测功能的开启/关闭。<br>5：提示词攻击防护开关，控制提示词注入/越狱攻击检测功能的开启/关闭。<br>6：内容合规检测开关，控制输入输出内容合规检测功能的开启/关闭。<br>7：敏感数据检测开关，控制敏感信息泄露检测（DLP）功能的开启/关闭。<br>8：Skill 安全检测开关，控制 Skill/Plugin 调用安全检测功能的开启/关闭。<br>9：意图行为检测开关，控制用户意图识别与行为检测功能的开启/关闭。<br>10：恶意URL检测开关，控制响应中恶意链接检测功能的开启/关闭。</p>
    */
    @SerializedName("SwitchType")
    @Expose
    private Long SwitchType;

    /**
    * <p>WAF 实例 ID，表示当前操作所属的 WAF 实例。可通过 DescribeInstances 接口获取。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get <p>开关状态。true：开启，false：关闭。</p> 
     * @return Status <p>开关状态。true：开启，false：关闭。</p>
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set <p>开关状态。true：开启，false：关闭。</p>
     * @param Status <p>开关状态。true：开启，false：关闭。</p>
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get <p>需要操作的域名或者serviceid</p> 
     * @return Domain <p>需要操作的域名或者serviceid</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>需要操作的域名或者serviceid</p>
     * @param Domain <p>需要操作的域名或者serviceid</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>开关类型，用于指定要操作的防护模块开关。取值如下：<br>1：防护总开关，控制大模型防护功能的全局开启/关闭。<br>2：算力消耗防护规则开关，控制算力消耗限制功能的开启/关闭。<br>3：自定义防护规则开关，控制内容安全自定义规则功能的开启/关闭。<br>4：ToolCall 防护开关，控制工具调用安全检测功能的开启/关闭。<br>5：提示词攻击防护开关，控制提示词注入/越狱攻击检测功能的开启/关闭。<br>6：内容合规检测开关，控制输入输出内容合规检测功能的开启/关闭。<br>7：敏感数据检测开关，控制敏感信息泄露检测（DLP）功能的开启/关闭。<br>8：Skill 安全检测开关，控制 Skill/Plugin 调用安全检测功能的开启/关闭。<br>9：意图行为检测开关，控制用户意图识别与行为检测功能的开启/关闭。<br>10：恶意URL检测开关，控制响应中恶意链接检测功能的开启/关闭。</p> 
     * @return SwitchType <p>开关类型，用于指定要操作的防护模块开关。取值如下：<br>1：防护总开关，控制大模型防护功能的全局开启/关闭。<br>2：算力消耗防护规则开关，控制算力消耗限制功能的开启/关闭。<br>3：自定义防护规则开关，控制内容安全自定义规则功能的开启/关闭。<br>4：ToolCall 防护开关，控制工具调用安全检测功能的开启/关闭。<br>5：提示词攻击防护开关，控制提示词注入/越狱攻击检测功能的开启/关闭。<br>6：内容合规检测开关，控制输入输出内容合规检测功能的开启/关闭。<br>7：敏感数据检测开关，控制敏感信息泄露检测（DLP）功能的开启/关闭。<br>8：Skill 安全检测开关，控制 Skill/Plugin 调用安全检测功能的开启/关闭。<br>9：意图行为检测开关，控制用户意图识别与行为检测功能的开启/关闭。<br>10：恶意URL检测开关，控制响应中恶意链接检测功能的开启/关闭。</p>
     */
    public Long getSwitchType() {
        return this.SwitchType;
    }

    /**
     * Set <p>开关类型，用于指定要操作的防护模块开关。取值如下：<br>1：防护总开关，控制大模型防护功能的全局开启/关闭。<br>2：算力消耗防护规则开关，控制算力消耗限制功能的开启/关闭。<br>3：自定义防护规则开关，控制内容安全自定义规则功能的开启/关闭。<br>4：ToolCall 防护开关，控制工具调用安全检测功能的开启/关闭。<br>5：提示词攻击防护开关，控制提示词注入/越狱攻击检测功能的开启/关闭。<br>6：内容合规检测开关，控制输入输出内容合规检测功能的开启/关闭。<br>7：敏感数据检测开关，控制敏感信息泄露检测（DLP）功能的开启/关闭。<br>8：Skill 安全检测开关，控制 Skill/Plugin 调用安全检测功能的开启/关闭。<br>9：意图行为检测开关，控制用户意图识别与行为检测功能的开启/关闭。<br>10：恶意URL检测开关，控制响应中恶意链接检测功能的开启/关闭。</p>
     * @param SwitchType <p>开关类型，用于指定要操作的防护模块开关。取值如下：<br>1：防护总开关，控制大模型防护功能的全局开启/关闭。<br>2：算力消耗防护规则开关，控制算力消耗限制功能的开启/关闭。<br>3：自定义防护规则开关，控制内容安全自定义规则功能的开启/关闭。<br>4：ToolCall 防护开关，控制工具调用安全检测功能的开启/关闭。<br>5：提示词攻击防护开关，控制提示词注入/越狱攻击检测功能的开启/关闭。<br>6：内容合规检测开关，控制输入输出内容合规检测功能的开启/关闭。<br>7：敏感数据检测开关，控制敏感信息泄露检测（DLP）功能的开启/关闭。<br>8：Skill 安全检测开关，控制 Skill/Plugin 调用安全检测功能的开启/关闭。<br>9：意图行为检测开关，控制用户意图识别与行为检测功能的开启/关闭。<br>10：恶意URL检测开关，控制响应中恶意链接检测功能的开启/关闭。</p>
     */
    public void setSwitchType(Long SwitchType) {
        this.SwitchType = SwitchType;
    }

    /**
     * Get <p>WAF 实例 ID，表示当前操作所属的 WAF 实例。可通过 DescribeInstances 接口获取。</p> 
     * @return InstanceId <p>WAF 实例 ID，表示当前操作所属的 WAF 实例。可通过 DescribeInstances 接口获取。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>WAF 实例 ID，表示当前操作所属的 WAF 实例。可通过 DescribeInstances 接口获取。</p>
     * @param InstanceId <p>WAF 实例 ID，表示当前操作所属的 WAF 实例。可通过 DescribeInstances 接口获取。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public ModifyLLMStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLLMStatusRequest(ModifyLLMStatusRequest source) {
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.SwitchType != null) {
            this.SwitchType = new Long(source.SwitchType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "SwitchType", this.SwitchType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

