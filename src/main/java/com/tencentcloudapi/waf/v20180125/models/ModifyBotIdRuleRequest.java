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

public class ModifyBotIdRuleRequest extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 场景ID
    */
    @SerializedName("SceneId")
    @Expose
    private String SceneId;

    /**
    * 配置信息，支持批量
    */
    @SerializedName("Data")
    @Expose
    private BotIdConfig [] Data;

    /**
    * 0-全局设置不生效 1-全局开关配置字段生效 2-全局动作配置字段生效 3-全局开关和动作字段都生效 4-只修改全局重定向路径 5-只修改全局防护等级
    */
    @SerializedName("GlobalSwitch")
    @Expose
    private Long GlobalSwitch;

    /**
    * 全局开关
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * 全局动作
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
    * 全局重定向路径
    */
    @SerializedName("GlobalRedirect")
    @Expose
    private String GlobalRedirect;

    /**
    * 防护等级：normal-正常；strict-严格
    */
    @SerializedName("ProtectLevel")
    @Expose
    private String ProtectLevel;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 场景ID 
     * @return SceneId 场景ID
     */
    public String getSceneId() {
        return this.SceneId;
    }

    /**
     * Set 场景ID
     * @param SceneId 场景ID
     */
    public void setSceneId(String SceneId) {
        this.SceneId = SceneId;
    }

    /**
     * Get 配置信息，支持批量 
     * @return Data 配置信息，支持批量
     */
    public BotIdConfig [] getData() {
        return this.Data;
    }

    /**
     * Set 配置信息，支持批量
     * @param Data 配置信息，支持批量
     */
    public void setData(BotIdConfig [] Data) {
        this.Data = Data;
    }

    /**
     * Get 0-全局设置不生效 1-全局开关配置字段生效 2-全局动作配置字段生效 3-全局开关和动作字段都生效 4-只修改全局重定向路径 5-只修改全局防护等级 
     * @return GlobalSwitch 0-全局设置不生效 1-全局开关配置字段生效 2-全局动作配置字段生效 3-全局开关和动作字段都生效 4-只修改全局重定向路径 5-只修改全局防护等级
     */
    public Long getGlobalSwitch() {
        return this.GlobalSwitch;
    }

    /**
     * Set 0-全局设置不生效 1-全局开关配置字段生效 2-全局动作配置字段生效 3-全局开关和动作字段都生效 4-只修改全局重定向路径 5-只修改全局防护等级
     * @param GlobalSwitch 0-全局设置不生效 1-全局开关配置字段生效 2-全局动作配置字段生效 3-全局开关和动作字段都生效 4-只修改全局重定向路径 5-只修改全局防护等级
     */
    public void setGlobalSwitch(Long GlobalSwitch) {
        this.GlobalSwitch = GlobalSwitch;
    }

    /**
     * Get 全局开关 
     * @return Status 全局开关
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set 全局开关
     * @param Status 全局开关
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get 全局动作 
     * @return RuleAction 全局动作
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set 全局动作
     * @param RuleAction 全局动作
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    /**
     * Get 全局重定向路径 
     * @return GlobalRedirect 全局重定向路径
     */
    public String getGlobalRedirect() {
        return this.GlobalRedirect;
    }

    /**
     * Set 全局重定向路径
     * @param GlobalRedirect 全局重定向路径
     */
    public void setGlobalRedirect(String GlobalRedirect) {
        this.GlobalRedirect = GlobalRedirect;
    }

    /**
     * Get 防护等级：normal-正常；strict-严格 
     * @return ProtectLevel 防护等级：normal-正常；strict-严格
     */
    public String getProtectLevel() {
        return this.ProtectLevel;
    }

    /**
     * Set 防护等级：normal-正常；strict-严格
     * @param ProtectLevel 防护等级：normal-正常；strict-严格
     */
    public void setProtectLevel(String ProtectLevel) {
        this.ProtectLevel = ProtectLevel;
    }

    public ModifyBotIdRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBotIdRuleRequest(ModifyBotIdRuleRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.SceneId != null) {
            this.SceneId = new String(source.SceneId);
        }
        if (source.Data != null) {
            this.Data = new BotIdConfig[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new BotIdConfig(source.Data[i]);
            }
        }
        if (source.GlobalSwitch != null) {
            this.GlobalSwitch = new Long(source.GlobalSwitch);
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.RuleAction != null) {
            this.RuleAction = new String(source.RuleAction);
        }
        if (source.GlobalRedirect != null) {
            this.GlobalRedirect = new String(source.GlobalRedirect);
        }
        if (source.ProtectLevel != null) {
            this.ProtectLevel = new String(source.ProtectLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "SceneId", this.SceneId);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "GlobalSwitch", this.GlobalSwitch);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);
        this.setParamSimple(map, prefix + "GlobalRedirect", this.GlobalRedirect);
        this.setParamSimple(map, prefix + "ProtectLevel", this.ProtectLevel);

    }
}

