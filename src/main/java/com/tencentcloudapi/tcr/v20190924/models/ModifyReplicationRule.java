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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyReplicationRule extends AbstractModel {

    /**
    * <p>目标命名空间</p>
    */
    @SerializedName("DestNamespace")
    @Expose
    private String DestNamespace;

    /**
    * <p>是否覆盖</p>
    */
    @SerializedName("Override")
    @Expose
    private Boolean Override;

    /**
    * <p>是否同步删除事件</p>
    */
    @SerializedName("Deletion")
    @Expose
    private Boolean Deletion;

    /**
    * <p>过滤同步条件</p>
    */
    @SerializedName("Filters")
    @Expose
    private ReplicationFilter [] Filters;

    /**
    * <p>是否开启规则</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
     * Get <p>目标命名空间</p> 
     * @return DestNamespace <p>目标命名空间</p>
     */
    public String getDestNamespace() {
        return this.DestNamespace;
    }

    /**
     * Set <p>目标命名空间</p>
     * @param DestNamespace <p>目标命名空间</p>
     */
    public void setDestNamespace(String DestNamespace) {
        this.DestNamespace = DestNamespace;
    }

    /**
     * Get <p>是否覆盖</p> 
     * @return Override <p>是否覆盖</p>
     */
    public Boolean getOverride() {
        return this.Override;
    }

    /**
     * Set <p>是否覆盖</p>
     * @param Override <p>是否覆盖</p>
     */
    public void setOverride(Boolean Override) {
        this.Override = Override;
    }

    /**
     * Get <p>是否同步删除事件</p> 
     * @return Deletion <p>是否同步删除事件</p>
     */
    public Boolean getDeletion() {
        return this.Deletion;
    }

    /**
     * Set <p>是否同步删除事件</p>
     * @param Deletion <p>是否同步删除事件</p>
     */
    public void setDeletion(Boolean Deletion) {
        this.Deletion = Deletion;
    }

    /**
     * Get <p>过滤同步条件</p> 
     * @return Filters <p>过滤同步条件</p>
     */
    public ReplicationFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤同步条件</p>
     * @param Filters <p>过滤同步条件</p>
     */
    public void setFilters(ReplicationFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>是否开启规则</p> 
     * @return Enabled <p>是否开启规则</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>是否开启规则</p>
     * @param Enabled <p>是否开启规则</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    public ModifyReplicationRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyReplicationRule(ModifyReplicationRule source) {
        if (source.DestNamespace != null) {
            this.DestNamespace = new String(source.DestNamespace);
        }
        if (source.Override != null) {
            this.Override = new Boolean(source.Override);
        }
        if (source.Deletion != null) {
            this.Deletion = new Boolean(source.Deletion);
        }
        if (source.Filters != null) {
            this.Filters = new ReplicationFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new ReplicationFilter(source.Filters[i]);
            }
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DestNamespace", this.DestNamespace);
        this.setParamSimple(map, prefix + "Override", this.Override);
        this.setParamSimple(map, prefix + "Deletion", this.Deletion);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

