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
    * 客户端认证规则的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li> <b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li> <b>删除</b>已有规则：BotManagement 参数中，ClientAttestationRule 列表中未包含的已有规则将被删除。</li>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 客户端认证规则的名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 规则是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li>
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * 规则的优先级，数值越小越优先执行，范围是 0 ~ 100，默认为 0。
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 规则的具体内容，需符合表达式语法，详细规范参见产品文档。
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * 客户端认证选项 ID。
    */
    @SerializedName("AttesterId")
    @Expose
    private String AttesterId;

    /**
    * 客户端设备配置。若 ClientAttestationRules 参数中，未指定 DeviceProfiles 参数值：保持已有客户端设备配置，不做修改。
    */
    @SerializedName("DeviceProfiles")
    @Expose
    private DeviceProfile [] DeviceProfiles;

    /**
    * 客户端认证未通过的处置方式。SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Redirect：重定向；</li><li>Challenge：挑战。</li>默认值为 Monitor。
    */
    @SerializedName("InvalidAttestationAction")
    @Expose
    private SecurityAction InvalidAttestationAction;

    /**
     * Get 客户端认证规则的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li> <b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li> <b>删除</b>已有规则：BotManagement 参数中，ClientAttestationRule 列表中未包含的已有规则将被删除。</li> 
     * @return Id 客户端认证规则的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li> <b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li> <b>删除</b>已有规则：BotManagement 参数中，ClientAttestationRule 列表中未包含的已有规则将被删除。</li>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 客户端认证规则的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li> <b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li> <b>删除</b>已有规则：BotManagement 参数中，ClientAttestationRule 列表中未包含的已有规则将被删除。</li>
     * @param Id 客户端认证规则的 ID。<br>通过规则 ID 可支持不同的规则配置操作：<br> <li> <b>增加</b>新规则：ID 为空或不指定 ID 参数；</li><li> <b>修改</b>已有规则：指定需要更新/修改的规则 ID；</li><li> <b>删除</b>已有规则：BotManagement 参数中，ClientAttestationRule 列表中未包含的已有规则将被删除。</li>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 客户端认证规则的名称。 
     * @return Name 客户端认证规则的名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 客户端认证规则的名称。
     * @param Name 客户端认证规则的名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 规则是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li> 
     * @return Enabled 规则是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li>
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 规则是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li>
     * @param Enabled 规则是否开启。取值有：<li>on：开启；</li><li>off：关闭。</li>
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 规则的优先级，数值越小越优先执行，范围是 0 ~ 100，默认为 0。 
     * @return Priority 规则的优先级，数值越小越优先执行，范围是 0 ~ 100，默认为 0。
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 规则的优先级，数值越小越优先执行，范围是 0 ~ 100，默认为 0。
     * @param Priority 规则的优先级，数值越小越优先执行，范围是 0 ~ 100，默认为 0。
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 规则的具体内容，需符合表达式语法，详细规范参见产品文档。 
     * @return Condition 规则的具体内容，需符合表达式语法，详细规范参见产品文档。
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set 规则的具体内容，需符合表达式语法，详细规范参见产品文档。
     * @param Condition 规则的具体内容，需符合表达式语法，详细规范参见产品文档。
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get 客户端认证选项 ID。 
     * @return AttesterId 客户端认证选项 ID。
     */
    public String getAttesterId() {
        return this.AttesterId;
    }

    /**
     * Set 客户端认证选项 ID。
     * @param AttesterId 客户端认证选项 ID。
     */
    public void setAttesterId(String AttesterId) {
        this.AttesterId = AttesterId;
    }

    /**
     * Get 客户端设备配置。若 ClientAttestationRules 参数中，未指定 DeviceProfiles 参数值：保持已有客户端设备配置，不做修改。 
     * @return DeviceProfiles 客户端设备配置。若 ClientAttestationRules 参数中，未指定 DeviceProfiles 参数值：保持已有客户端设备配置，不做修改。
     */
    public DeviceProfile [] getDeviceProfiles() {
        return this.DeviceProfiles;
    }

    /**
     * Set 客户端设备配置。若 ClientAttestationRules 参数中，未指定 DeviceProfiles 参数值：保持已有客户端设备配置，不做修改。
     * @param DeviceProfiles 客户端设备配置。若 ClientAttestationRules 参数中，未指定 DeviceProfiles 参数值：保持已有客户端设备配置，不做修改。
     */
    public void setDeviceProfiles(DeviceProfile [] DeviceProfiles) {
        this.DeviceProfiles = DeviceProfiles;
    }

    /**
     * Get 客户端认证未通过的处置方式。SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Redirect：重定向；</li><li>Challenge：挑战。</li>默认值为 Monitor。 
     * @return InvalidAttestationAction 客户端认证未通过的处置方式。SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Redirect：重定向；</li><li>Challenge：挑战。</li>默认值为 Monitor。
     */
    public SecurityAction getInvalidAttestationAction() {
        return this.InvalidAttestationAction;
    }

    /**
     * Set 客户端认证未通过的处置方式。SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Redirect：重定向；</li><li>Challenge：挑战。</li>默认值为 Monitor。
     * @param InvalidAttestationAction 客户端认证未通过的处置方式。SecurityAction 的 Name 取值支持：<li>Deny：拦截；</li><li>Monitor：观察；</li><li>Redirect：重定向；</li><li>Challenge：挑战。</li>默认值为 Monitor。
     */
    public void setInvalidAttestationAction(SecurityAction InvalidAttestationAction) {
        this.InvalidAttestationAction = InvalidAttestationAction;
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
        if (source.DeviceProfiles != null) {
            this.DeviceProfiles = new DeviceProfile[source.DeviceProfiles.length];
            for (int i = 0; i < source.DeviceProfiles.length; i++) {
                this.DeviceProfiles[i] = new DeviceProfile(source.DeviceProfiles[i]);
            }
        }
        if (source.InvalidAttestationAction != null) {
            this.InvalidAttestationAction = new SecurityAction(source.InvalidAttestationAction);
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
        this.setParamArrayObj(map, prefix + "DeviceProfiles.", this.DeviceProfiles);
        this.setParamObj(map, prefix + "InvalidAttestationAction.", this.InvalidAttestationAction);

    }
}

