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

public class ModifyEventAttackStatusRequest extends AbstractModel {

    /**
    * 需要修改的事件id 数组，支持批量
    */
    @SerializedName("Ids")
    @Expose
    private Long [] Ids;

    /**
    * 是否更新全部，即是否对所有的事件进行操作，当ids 不为空时，此参数无效
    */
    @SerializedName("All")
    @Expose
    private Boolean All;

    /**
    * 0：待处理 1：已处理 3： 已忽略 4：已删除 
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 过滤条件。
<li>Type - String 攻击状态 0: 尝试攻击 1: 攻击成功 - 是否必填: 否</li>
<li>Status - String 事件处理状态 0：待处理 1：已处理 2： 已加白 3： 已忽略 4：已删除  - 是否必填: 否</li>
<li>SrcIP - String 来源IP - 是否必填: 否</li>
<li>DstPort - String 攻击目标端口 - 是否必填: 否</li>
<li>MachineName - String 主机名称 - 是否必填: 否</li>
<li>InstanceID - String 主机实例ID - 是否必填: 否</li>
<li>Quuids - String 主机cvm uuid - 是否必填: 否</li>

    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * 排除的id
    */
    @SerializedName("ExcludeId")
    @Expose
    private Long [] ExcludeId;

    /**
     * Get 需要修改的事件id 数组，支持批量 
     * @return Ids 需要修改的事件id 数组，支持批量
     */
    public Long [] getIds() {
        return this.Ids;
    }

    /**
     * Set 需要修改的事件id 数组，支持批量
     * @param Ids 需要修改的事件id 数组，支持批量
     */
    public void setIds(Long [] Ids) {
        this.Ids = Ids;
    }

    /**
     * Get 是否更新全部，即是否对所有的事件进行操作，当ids 不为空时，此参数无效 
     * @return All 是否更新全部，即是否对所有的事件进行操作，当ids 不为空时，此参数无效
     */
    public Boolean getAll() {
        return this.All;
    }

    /**
     * Set 是否更新全部，即是否对所有的事件进行操作，当ids 不为空时，此参数无效
     * @param All 是否更新全部，即是否对所有的事件进行操作，当ids 不为空时，此参数无效
     */
    public void setAll(Boolean All) {
        this.All = All;
    }

    /**
     * Get 0：待处理 1：已处理 3： 已忽略 4：已删除  
     * @return Status 0：待处理 1：已处理 3： 已忽略 4：已删除 
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0：待处理 1：已处理 3： 已忽略 4：已删除 
     * @param Status 0：待处理 1：已处理 3： 已忽略 4：已删除 
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 过滤条件。
<li>Type - String 攻击状态 0: 尝试攻击 1: 攻击成功 - 是否必填: 否</li>
<li>Status - String 事件处理状态 0：待处理 1：已处理 2： 已加白 3： 已忽略 4：已删除  - 是否必填: 否</li>
<li>SrcIP - String 来源IP - 是否必填: 否</li>
<li>DstPort - String 攻击目标端口 - 是否必填: 否</li>
<li>MachineName - String 主机名称 - 是否必填: 否</li>
<li>InstanceID - String 主机实例ID - 是否必填: 否</li>
<li>Quuids - String 主机cvm uuid - 是否必填: 否</li>
 
     * @return Filters 过滤条件。
<li>Type - String 攻击状态 0: 尝试攻击 1: 攻击成功 - 是否必填: 否</li>
<li>Status - String 事件处理状态 0：待处理 1：已处理 2： 已加白 3： 已忽略 4：已删除  - 是否必填: 否</li>
<li>SrcIP - String 来源IP - 是否必填: 否</li>
<li>DstPort - String 攻击目标端口 - 是否必填: 否</li>
<li>MachineName - String 主机名称 - 是否必填: 否</li>
<li>InstanceID - String 主机实例ID - 是否必填: 否</li>
<li>Quuids - String 主机cvm uuid - 是否必填: 否</li>

     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
<li>Type - String 攻击状态 0: 尝试攻击 1: 攻击成功 - 是否必填: 否</li>
<li>Status - String 事件处理状态 0：待处理 1：已处理 2： 已加白 3： 已忽略 4：已删除  - 是否必填: 否</li>
<li>SrcIP - String 来源IP - 是否必填: 否</li>
<li>DstPort - String 攻击目标端口 - 是否必填: 否</li>
<li>MachineName - String 主机名称 - 是否必填: 否</li>
<li>InstanceID - String 主机实例ID - 是否必填: 否</li>
<li>Quuids - String 主机cvm uuid - 是否必填: 否</li>

     * @param Filters 过滤条件。
<li>Type - String 攻击状态 0: 尝试攻击 1: 攻击成功 - 是否必填: 否</li>
<li>Status - String 事件处理状态 0：待处理 1：已处理 2： 已加白 3： 已忽略 4：已删除  - 是否必填: 否</li>
<li>SrcIP - String 来源IP - 是否必填: 否</li>
<li>DstPort - String 攻击目标端口 - 是否必填: 否</li>
<li>MachineName - String 主机名称 - 是否必填: 否</li>
<li>InstanceID - String 主机实例ID - 是否必填: 否</li>
<li>Quuids - String 主机cvm uuid - 是否必填: 否</li>

     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排除的id 
     * @return ExcludeId 排除的id
     */
    public Long [] getExcludeId() {
        return this.ExcludeId;
    }

    /**
     * Set 排除的id
     * @param ExcludeId 排除的id
     */
    public void setExcludeId(Long [] ExcludeId) {
        this.ExcludeId = ExcludeId;
    }

    public ModifyEventAttackStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyEventAttackStatusRequest(ModifyEventAttackStatusRequest source) {
        if (source.Ids != null) {
            this.Ids = new Long[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new Long(source.Ids[i]);
            }
        }
        if (source.All != null) {
            this.All = new Boolean(source.All);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.ExcludeId != null) {
            this.ExcludeId = new Long[source.ExcludeId.length];
            for (int i = 0; i < source.ExcludeId.length; i++) {
                this.ExcludeId[i] = new Long(source.ExcludeId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);
        this.setParamSimple(map, prefix + "All", this.All);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "ExcludeId.", this.ExcludeId);

    }
}

