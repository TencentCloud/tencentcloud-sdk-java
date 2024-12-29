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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReplicationRule extends AbstractModel {

    /**
    * 同步规则名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 目标命名空间
    */
    @SerializedName("DestNamespace")
    @Expose
    private String DestNamespace;

    /**
    * 是否覆盖
    */
    @SerializedName("Override")
    @Expose
    private Boolean Override;

    /**
    * 同步过滤条件
    */
    @SerializedName("Filters")
    @Expose
    private ReplicationFilter [] Filters;

    /**
    * 是否同步删除事件
    */
    @SerializedName("Deletion")
    @Expose
    private Boolean Deletion;

    /**
     * Get 同步规则名称 
     * @return Name 同步规则名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 同步规则名称
     * @param Name 同步规则名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 目标命名空间 
     * @return DestNamespace 目标命名空间
     */
    public String getDestNamespace() {
        return this.DestNamespace;
    }

    /**
     * Set 目标命名空间
     * @param DestNamespace 目标命名空间
     */
    public void setDestNamespace(String DestNamespace) {
        this.DestNamespace = DestNamespace;
    }

    /**
     * Get 是否覆盖 
     * @return Override 是否覆盖
     */
    public Boolean getOverride() {
        return this.Override;
    }

    /**
     * Set 是否覆盖
     * @param Override 是否覆盖
     */
    public void setOverride(Boolean Override) {
        this.Override = Override;
    }

    /**
     * Get 同步过滤条件 
     * @return Filters 同步过滤条件
     */
    public ReplicationFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 同步过滤条件
     * @param Filters 同步过滤条件
     */
    public void setFilters(ReplicationFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 是否同步删除事件 
     * @return Deletion 是否同步删除事件
     */
    public Boolean getDeletion() {
        return this.Deletion;
    }

    /**
     * Set 是否同步删除事件
     * @param Deletion 是否同步删除事件
     */
    public void setDeletion(Boolean Deletion) {
        this.Deletion = Deletion;
    }

    public ReplicationRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReplicationRule(ReplicationRule source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DestNamespace != null) {
            this.DestNamespace = new String(source.DestNamespace);
        }
        if (source.Override != null) {
            this.Override = new Boolean(source.Override);
        }
        if (source.Filters != null) {
            this.Filters = new ReplicationFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new ReplicationFilter(source.Filters[i]);
            }
        }
        if (source.Deletion != null) {
            this.Deletion = new Boolean(source.Deletion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DestNamespace", this.DestNamespace);
        this.setParamSimple(map, prefix + "Override", this.Override);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Deletion", this.Deletion);

    }
}

