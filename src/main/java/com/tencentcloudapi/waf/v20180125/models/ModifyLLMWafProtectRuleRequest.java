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

public class ModifyLLMWafProtectRuleRequest extends AbstractModel {

    /**
    * <p>服务ID</p>
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * <p>要修改的规则id列表</p>
    */
    @SerializedName("RuleIds")
    @Expose
    private String [] RuleIds;

    /**
    * <p>规则动作</p>
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
    * <p>开关</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>实例id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>检测方向：1是入向，2是出向，3是入向和出向都检测</p>
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
     * Get <p>服务ID</p> 
     * @return ServiceId <p>服务ID</p>
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set <p>服务ID</p>
     * @param ServiceId <p>服务ID</p>
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get <p>要修改的规则id列表</p> 
     * @return RuleIds <p>要修改的规则id列表</p>
     */
    public String [] getRuleIds() {
        return this.RuleIds;
    }

    /**
     * Set <p>要修改的规则id列表</p>
     * @param RuleIds <p>要修改的规则id列表</p>
     */
    public void setRuleIds(String [] RuleIds) {
        this.RuleIds = RuleIds;
    }

    /**
     * Get <p>规则动作</p> 
     * @return RuleAction <p>规则动作</p>
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set <p>规则动作</p>
     * @param RuleAction <p>规则动作</p>
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    /**
     * Get <p>开关</p> 
     * @return Status <p>开关</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>开关</p>
     * @param Status <p>开关</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>实例id</p> 
     * @return InstanceId <p>实例id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例id</p>
     * @param InstanceId <p>实例id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>检测方向：1是入向，2是出向，3是入向和出向都检测</p> 
     * @return Direction <p>检测方向：1是入向，2是出向，3是入向和出向都检测</p>
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set <p>检测方向：1是入向，2是出向，3是入向和出向都检测</p>
     * @param Direction <p>检测方向：1是入向，2是出向，3是入向和出向都检测</p>
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    public ModifyLLMWafProtectRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLLMWafProtectRuleRequest(ModifyLLMWafProtectRuleRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.RuleIds != null) {
            this.RuleIds = new String[source.RuleIds.length];
            for (int i = 0; i < source.RuleIds.length; i++) {
                this.RuleIds[i] = new String(source.RuleIds[i]);
            }
        }
        if (source.RuleAction != null) {
            this.RuleAction = new String(source.RuleAction);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamArraySimple(map, prefix + "RuleIds.", this.RuleIds);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Direction", this.Direction);

    }
}

