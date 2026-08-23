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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommandSandboxFileRuleBase extends AbstractModel {

    /**
    * <p>规则名称</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>规则资产范围类型</p><p>枚举值：</p><ul><li>HOST： 主机</li><li>CONTAINER： 容器</li></ul>
    */
    @SerializedName("BelongAssetType")
    @Expose
    private String BelongAssetType;

    /**
    * <p>规则生效范围</p>
    */
    @SerializedName("EffectScope")
    @Expose
    private TrafficSandboxEffectScope EffectScope;

    /**
    * <p>规则行为类型</p><p>枚举值：</p><ul><li>RO： 只读</li><li>RW： 可读写</li></ul>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * <p>白名单路径</p>
    */
    @SerializedName("PathWhitelist")
    @Expose
    private String [] PathWhitelist;

    /**
    * <p>规则状态</p><p>枚举值：</p><ul><li>ON ： 启用</li><li>OFF ： 禁用</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get <p>规则名称</p> 
     * @return RuleName <p>规则名称</p>
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>规则名称</p>
     * @param RuleName <p>规则名称</p>
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>规则资产范围类型</p><p>枚举值：</p><ul><li>HOST： 主机</li><li>CONTAINER： 容器</li></ul> 
     * @return BelongAssetType <p>规则资产范围类型</p><p>枚举值：</p><ul><li>HOST： 主机</li><li>CONTAINER： 容器</li></ul>
     */
    public String getBelongAssetType() {
        return this.BelongAssetType;
    }

    /**
     * Set <p>规则资产范围类型</p><p>枚举值：</p><ul><li>HOST： 主机</li><li>CONTAINER： 容器</li></ul>
     * @param BelongAssetType <p>规则资产范围类型</p><p>枚举值：</p><ul><li>HOST： 主机</li><li>CONTAINER： 容器</li></ul>
     */
    public void setBelongAssetType(String BelongAssetType) {
        this.BelongAssetType = BelongAssetType;
    }

    /**
     * Get <p>规则生效范围</p> 
     * @return EffectScope <p>规则生效范围</p>
     */
    public TrafficSandboxEffectScope getEffectScope() {
        return this.EffectScope;
    }

    /**
     * Set <p>规则生效范围</p>
     * @param EffectScope <p>规则生效范围</p>
     */
    public void setEffectScope(TrafficSandboxEffectScope EffectScope) {
        this.EffectScope = EffectScope;
    }

    /**
     * Get <p>规则行为类型</p><p>枚举值：</p><ul><li>RO： 只读</li><li>RW： 可读写</li></ul> 
     * @return Action <p>规则行为类型</p><p>枚举值：</p><ul><li>RO： 只读</li><li>RW： 可读写</li></ul>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set <p>规则行为类型</p><p>枚举值：</p><ul><li>RO： 只读</li><li>RW： 可读写</li></ul>
     * @param Action <p>规则行为类型</p><p>枚举值：</p><ul><li>RO： 只读</li><li>RW： 可读写</li></ul>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get <p>白名单路径</p> 
     * @return PathWhitelist <p>白名单路径</p>
     */
    public String [] getPathWhitelist() {
        return this.PathWhitelist;
    }

    /**
     * Set <p>白名单路径</p>
     * @param PathWhitelist <p>白名单路径</p>
     */
    public void setPathWhitelist(String [] PathWhitelist) {
        this.PathWhitelist = PathWhitelist;
    }

    /**
     * Get <p>规则状态</p><p>枚举值：</p><ul><li>ON ： 启用</li><li>OFF ： 禁用</li></ul> 
     * @return Status <p>规则状态</p><p>枚举值：</p><ul><li>ON ： 启用</li><li>OFF ： 禁用</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>规则状态</p><p>枚举值：</p><ul><li>ON ： 启用</li><li>OFF ： 禁用</li></ul>
     * @param Status <p>规则状态</p><p>枚举值：</p><ul><li>ON ： 启用</li><li>OFF ： 禁用</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public CommandSandboxFileRuleBase() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommandSandboxFileRuleBase(CommandSandboxFileRuleBase source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.BelongAssetType != null) {
            this.BelongAssetType = new String(source.BelongAssetType);
        }
        if (source.EffectScope != null) {
            this.EffectScope = new TrafficSandboxEffectScope(source.EffectScope);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.PathWhitelist != null) {
            this.PathWhitelist = new String[source.PathWhitelist.length];
            for (int i = 0; i < source.PathWhitelist.length; i++) {
                this.PathWhitelist[i] = new String(source.PathWhitelist[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "BelongAssetType", this.BelongAssetType);
        this.setParamObj(map, prefix + "EffectScope.", this.EffectScope);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamArraySimple(map, prefix + "PathWhitelist.", this.PathWhitelist);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

