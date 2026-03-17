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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ShellPolicyList extends AbstractModel {

    /**
    * 策略ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * 策略名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 0 系统策略, 1 用户自定义策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyType")
    @Expose
    private Long PolicyType;

    /**
    * 策略描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyDesc")
    @Expose
    private String PolicyDesc;

    /**
    * 策略动作[0:告警,1:放行,2:拦截+告警]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyAction")
    @Expose
    private Long PolicyAction;

    /**
    * 0 开启, 1关闭
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsEnabled")
    @Expose
    private Long IsEnabled;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 主机范围:[0: 一组quuid 1: 所有专业版 2: 旗舰版 3: 所有主机]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostScope")
    @Expose
    private Long HostScope;

    /**
     * Get 策略ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolicyId 策略ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 策略ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicyId 策略ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 策略名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolicyName 策略名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 策略名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicyName 策略名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get 0 系统策略, 1 用户自定义策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolicyType 0 系统策略, 1 用户自定义策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set 0 系统策略, 1 用户自定义策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicyType 0 系统策略, 1 用户自定义策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicyType(Long PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get 策略描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolicyDesc 策略描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPolicyDesc() {
        return this.PolicyDesc;
    }

    /**
     * Set 策略描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicyDesc 策略描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicyDesc(String PolicyDesc) {
        this.PolicyDesc = PolicyDesc;
    }

    /**
     * Get 策略动作[0:告警,1:放行,2:拦截+告警]
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolicyAction 策略动作[0:告警,1:放行,2:拦截+告警]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPolicyAction() {
        return this.PolicyAction;
    }

    /**
     * Set 策略动作[0:告警,1:放行,2:拦截+告警]
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicyAction 策略动作[0:告警,1:放行,2:拦截+告警]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicyAction(Long PolicyAction) {
        this.PolicyAction = PolicyAction;
    }

    /**
     * Get 0 开启, 1关闭
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsEnabled 0 开启, 1关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set 0 开启, 1关闭
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsEnabled 0 开启, 1关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsEnabled(Long IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 主机范围:[0: 一组quuid 1: 所有专业版 2: 旗舰版 3: 所有主机]
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostScope 主机范围:[0: 一组quuid 1: 所有专业版 2: 旗舰版 3: 所有主机]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHostScope() {
        return this.HostScope;
    }

    /**
     * Set 主机范围:[0: 一组quuid 1: 所有专业版 2: 旗舰版 3: 所有主机]
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostScope 主机范围:[0: 一组quuid 1: 所有专业版 2: 旗舰版 3: 所有主机]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostScope(Long HostScope) {
        this.HostScope = HostScope;
    }

    public ShellPolicyList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ShellPolicyList(ShellPolicyList source) {
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.PolicyType != null) {
            this.PolicyType = new Long(source.PolicyType);
        }
        if (source.PolicyDesc != null) {
            this.PolicyDesc = new String(source.PolicyDesc);
        }
        if (source.PolicyAction != null) {
            this.PolicyAction = new Long(source.PolicyAction);
        }
        if (source.IsEnabled != null) {
            this.IsEnabled = new Long(source.IsEnabled);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.HostScope != null) {
            this.HostScope = new Long(source.HostScope);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "PolicyDesc", this.PolicyDesc);
        this.setParamSimple(map, prefix + "PolicyAction", this.PolicyAction);
        this.setParamSimple(map, prefix + "IsEnabled", this.IsEnabled);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "HostScope", this.HostScope);

    }
}

