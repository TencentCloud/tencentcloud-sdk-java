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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClientAttestationRule extends AbstractModel {

    /**
    * <p>客户端认证规则的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li> <b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li> <b>删除</b>已有规则：BotManagement 参数中，ClientAttestationRule 列表中未包含的已有规则将被删除。</li></p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>客户端认证规则的名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>规则是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li></p>
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * <p>规则的优先级，数值越小越优先执行，范围是 0 ~ 100，默认为 0。</p>
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * <p>规则的具体内容，需符合表达式语法，详细规范参见产品文档。</p>
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * <p>客户端认证选项 ID。</p>
    */
    @SerializedName("AttesterId")
    @Expose
    private String AttesterId;

    /**
    * <p>客户端认证未通过的处置方式。SecurityAction.Name 取值范围如下：</p><ul><li>Allow：放行，其中 AllowActionParameters 支持 MinDelayTime 和 MaxDelayTime 配置；</li><li>Deny：拦截，其中 DenyActionParameters 中支持 BlockIp、ReturnCustomPage 和 Stall 配置；</li><li>Monitor：观察；</li><li>Challenge：挑战，其中 ChallengeActionParameters.ChallengeOption 支持 JSChallenge、ManagedChallenge、InterstitialChallenge 和 InlineChallenge；</li><li>Redirect：重定向至URL。</li></ul>
    */
    @SerializedName("InvalidAttestationAction")
    @Expose
    private SecurityAction InvalidAttestationAction;

    /**
    * <p>客户端设备配置。若 ClientAttestationRules 参数中，未指定 DeviceProfiles 参数值：保持已有客户端设备配置，不做修改。</p>
    */
    @SerializedName("DeviceProfiles")
    @Expose
    private DeviceProfile [] DeviceProfiles;

    /**
    * <p>账号保护配置。</p>
    */
    @SerializedName("AccountProtectionSettings")
    @Expose
    private AccountProtectionSettings AccountProtectionSettings;

    /**
     * Get <p>客户端认证规则的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li> <b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li> <b>删除</b>已有规则：BotManagement 参数中，ClientAttestationRule 列表中未包含的已有规则将被删除。</li></p> 
     * @return Id <p>客户端认证规则的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li> <b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li> <b>删除</b>已有规则：BotManagement 参数中，ClientAttestationRule 列表中未包含的已有规则将被删除。</li></p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>客户端认证规则的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li> <b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li> <b>删除</b>已有规则：BotManagement 参数中，ClientAttestationRule 列表中未包含的已有规则将被删除。</li></p>
     * @param Id <p>客户端认证规则的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li> <b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li> <b>删除</b>已有规则：BotManagement 参数中，ClientAttestationRule 列表中未包含的已有规则将被删除。</li></p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>客户端认证规则的名称。</p> 
     * @return Name <p>客户端认证规则的名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>客户端认证规则的名称。</p>
     * @param Name <p>客户端认证规则的名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>规则是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li></p> 
     * @return Enabled <p>规则是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li></p>
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>规则是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li></p>
     * @param Enabled <p>规则是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li></p>
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>规则的优先级，数值越小越优先执行，范围是 0 ~ 100，默认为 0。</p> 
     * @return Priority <p>规则的优先级，数值越小越优先执行，范围是 0 ~ 100，默认为 0。</p>
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set <p>规则的优先级，数值越小越优先执行，范围是 0 ~ 100，默认为 0。</p>
     * @param Priority <p>规则的优先级，数值越小越优先执行，范围是 0 ~ 100，默认为 0。</p>
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get <p>规则的具体内容，需符合表达式语法，详细规范参见产品文档。</p> 
     * @return Condition <p>规则的具体内容，需符合表达式语法，详细规范参见产品文档。</p>
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set <p>规则的具体内容，需符合表达式语法，详细规范参见产品文档。</p>
     * @param Condition <p>规则的具体内容，需符合表达式语法，详细规范参见产品文档。</p>
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get <p>客户端认证选项 ID。</p> 
     * @return AttesterId <p>客户端认证选项 ID。</p>
     */
    public String getAttesterId() {
        return this.AttesterId;
    }

    /**
     * Set <p>客户端认证选项 ID。</p>
     * @param AttesterId <p>客户端认证选项 ID。</p>
     */
    public void setAttesterId(String AttesterId) {
        this.AttesterId = AttesterId;
    }

    /**
     * Get <p>客户端认证未通过的处置方式。SecurityAction.Name 取值范围如下：</p><ul><li>Allow：放行，其中 AllowActionParameters 支持 MinDelayTime 和 MaxDelayTime 配置；</li><li>Deny：拦截，其中 DenyActionParameters 中支持 BlockIp、ReturnCustomPage 和 Stall 配置；</li><li>Monitor：观察；</li><li>Challenge：挑战，其中 ChallengeActionParameters.ChallengeOption 支持 JSChallenge、ManagedChallenge、InterstitialChallenge 和 InlineChallenge；</li><li>Redirect：重定向至URL。</li></ul> 
     * @return InvalidAttestationAction <p>客户端认证未通过的处置方式。SecurityAction.Name 取值范围如下：</p><ul><li>Allow：放行，其中 AllowActionParameters 支持 MinDelayTime 和 MaxDelayTime 配置；</li><li>Deny：拦截，其中 DenyActionParameters 中支持 BlockIp、ReturnCustomPage 和 Stall 配置；</li><li>Monitor：观察；</li><li>Challenge：挑战，其中 ChallengeActionParameters.ChallengeOption 支持 JSChallenge、ManagedChallenge、InterstitialChallenge 和 InlineChallenge；</li><li>Redirect：重定向至URL。</li></ul>
     */
    public SecurityAction getInvalidAttestationAction() {
        return this.InvalidAttestationAction;
    }

    /**
     * Set <p>客户端认证未通过的处置方式。SecurityAction.Name 取值范围如下：</p><ul><li>Allow：放行，其中 AllowActionParameters 支持 MinDelayTime 和 MaxDelayTime 配置；</li><li>Deny：拦截，其中 DenyActionParameters 中支持 BlockIp、ReturnCustomPage 和 Stall 配置；</li><li>Monitor：观察；</li><li>Challenge：挑战，其中 ChallengeActionParameters.ChallengeOption 支持 JSChallenge、ManagedChallenge、InterstitialChallenge 和 InlineChallenge；</li><li>Redirect：重定向至URL。</li></ul>
     * @param InvalidAttestationAction <p>客户端认证未通过的处置方式。SecurityAction.Name 取值范围如下：</p><ul><li>Allow：放行，其中 AllowActionParameters 支持 MinDelayTime 和 MaxDelayTime 配置；</li><li>Deny：拦截，其中 DenyActionParameters 中支持 BlockIp、ReturnCustomPage 和 Stall 配置；</li><li>Monitor：观察；</li><li>Challenge：挑战，其中 ChallengeActionParameters.ChallengeOption 支持 JSChallenge、ManagedChallenge、InterstitialChallenge 和 InlineChallenge；</li><li>Redirect：重定向至URL。</li></ul>
     */
    public void setInvalidAttestationAction(SecurityAction InvalidAttestationAction) {
        this.InvalidAttestationAction = InvalidAttestationAction;
    }

    /**
     * Get <p>客户端设备配置。若 ClientAttestationRules 参数中，未指定 DeviceProfiles 参数值：保持已有客户端设备配置，不做修改。</p> 
     * @return DeviceProfiles <p>客户端设备配置。若 ClientAttestationRules 参数中，未指定 DeviceProfiles 参数值：保持已有客户端设备配置，不做修改。</p>
     */
    public DeviceProfile [] getDeviceProfiles() {
        return this.DeviceProfiles;
    }

    /**
     * Set <p>客户端设备配置。若 ClientAttestationRules 参数中，未指定 DeviceProfiles 参数值：保持已有客户端设备配置，不做修改。</p>
     * @param DeviceProfiles <p>客户端设备配置。若 ClientAttestationRules 参数中，未指定 DeviceProfiles 参数值：保持已有客户端设备配置，不做修改。</p>
     */
    public void setDeviceProfiles(DeviceProfile [] DeviceProfiles) {
        this.DeviceProfiles = DeviceProfiles;
    }

    /**
     * Get <p>账号保护配置。</p> 
     * @return AccountProtectionSettings <p>账号保护配置。</p>
     */
    public AccountProtectionSettings getAccountProtectionSettings() {
        return this.AccountProtectionSettings;
    }

    /**
     * Set <p>账号保护配置。</p>
     * @param AccountProtectionSettings <p>账号保护配置。</p>
     */
    public void setAccountProtectionSettings(AccountProtectionSettings AccountProtectionSettings) {
        this.AccountProtectionSettings = AccountProtectionSettings;
    }

    public ClientAttestationRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClientAttestationRule(ClientAttestationRule source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Enabled != null) {
            this.Enabled = new String(source.Enabled);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.AttesterId != null) {
            this.AttesterId = new String(source.AttesterId);
        }
        if (source.InvalidAttestationAction != null) {
            this.InvalidAttestationAction = new SecurityAction(source.InvalidAttestationAction);
        }
        if (source.DeviceProfiles != null) {
            this.DeviceProfiles = new DeviceProfile[source.DeviceProfiles.length];
            for (int i = 0; i < source.DeviceProfiles.length; i++) {
                this.DeviceProfiles[i] = new DeviceProfile(source.DeviceProfiles[i]);
            }
        }
        if (source.AccountProtectionSettings != null) {
            this.AccountProtectionSettings = new AccountProtectionSettings(source.AccountProtectionSettings);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamSimple(map, prefix + "AttesterId", this.AttesterId);
        this.setParamObj(map, prefix + "InvalidAttestationAction.", this.InvalidAttestationAction);
        this.setParamArrayObj(map, prefix + "DeviceProfiles.", this.DeviceProfiles);
        this.setParamObj(map, prefix + "AccountProtectionSettings.", this.AccountProtectionSettings);

    }
}

