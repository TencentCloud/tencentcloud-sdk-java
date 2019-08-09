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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecurityPolicyDetailResponse  extends AbstractModel{

    /**
    * 通道ID
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * 安全策略状态：
BOUND，已开启安全策略
UNBIND，已关闭安全策略
BINDING，安全策略开启中
UNBINDING，安全策略关闭中。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 默认策略：ACCEPT或DROP。
    */
    @SerializedName("DefaultAction")
    @Expose
    private String DefaultAction;

    /**
    * 策略ID
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * 规则列表
    */
    @SerializedName("RuleList")
    @Expose
    private SecurityPolicyRuleOut [] RuleList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取通道ID
     * @return ProxyId 通道ID
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * 设置通道ID
     * @param ProxyId 通道ID
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * 获取安全策略状态：
BOUND，已开启安全策略
UNBIND，已关闭安全策略
BINDING，安全策略开启中
UNBINDING，安全策略关闭中。
     * @return Status 安全策略状态：
BOUND，已开启安全策略
UNBIND，已关闭安全策略
BINDING，安全策略开启中
UNBINDING，安全策略关闭中。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * 设置安全策略状态：
BOUND，已开启安全策略
UNBIND，已关闭安全策略
BINDING，安全策略开启中
UNBINDING，安全策略关闭中。
     * @param Status 安全策略状态：
BOUND，已开启安全策略
UNBIND，已关闭安全策略
BINDING，安全策略开启中
UNBINDING，安全策略关闭中。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * 获取默认策略：ACCEPT或DROP。
     * @return DefaultAction 默认策略：ACCEPT或DROP。
     */
    public String getDefaultAction() {
        return this.DefaultAction;
    }

    /**
     * 设置默认策略：ACCEPT或DROP。
     * @param DefaultAction 默认策略：ACCEPT或DROP。
     */
    public void setDefaultAction(String DefaultAction) {
        this.DefaultAction = DefaultAction;
    }

    /**
     * 获取策略ID
     * @return PolicyId 策略ID
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * 设置策略ID
     * @param PolicyId 策略ID
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * 获取规则列表
     * @return RuleList 规则列表
     */
    public SecurityPolicyRuleOut [] getRuleList() {
        return this.RuleList;
    }

    /**
     * 设置规则列表
     * @param RuleList 规则列表
     */
    public void setRuleList(SecurityPolicyRuleOut [] RuleList) {
        this.RuleList = RuleList;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DefaultAction", this.DefaultAction);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamArrayObj(map, prefix + "RuleList.", this.RuleList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

