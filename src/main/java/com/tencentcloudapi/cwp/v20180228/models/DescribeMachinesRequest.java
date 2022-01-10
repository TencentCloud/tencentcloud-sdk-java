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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMachinesRequest extends AbstractModel{

    /**
    * 机器所属专区类型 
CVM 云服务器
BM 黑石
ECM 边缘计算
LH 轻量应用服务器
Other 混合云专区
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * 机器所属地域。如：ap-guangzhou，ap-shanghai
    */
    @SerializedName("MachineRegion")
    @Expose
    private String MachineRegion;

    /**
    * 返回数量，默认为10，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 过滤条件。
<li>Keywords - String - 是否必填：否 - 查询关键字 </li>
<li>Status - String - 是否必填：否 - 客户端在线状态（OFFLINE: 离线/关机 | ONLINE: 在线 | UNINSTALLED：未安装 | AGENT_OFFLINE 离线| AGENT_SHUTDOWN 已关机）</li>
<li>Version - String  是否必填：否 - 当前防护版本（ PRO_VERSION：专业版 | BASIC_VERSION：基础版 | Flagship : 旗舰版 | ProtectedMachines: 专业版+旗舰版）</li>
<li>Risk - String 是否必填: 否 - 风险主机( yes ) </li>
<li>Os -String 是否必填: 否 - 操作系统( DescribeMachineOsList 接口 值 )
每个过滤条件只支持一个值，暂不支持多个值“或”关系查询
<li>Quuid - String - 是否必填: 否 - 云服务器uuid  最大100条.</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 机器所属业务ID列表
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
     * Get 机器所属专区类型 
CVM 云服务器
BM 黑石
ECM 边缘计算
LH 轻量应用服务器
Other 混合云专区 
     * @return MachineType 机器所属专区类型 
CVM 云服务器
BM 黑石
ECM 边缘计算
LH 轻量应用服务器
Other 混合云专区
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set 机器所属专区类型 
CVM 云服务器
BM 黑石
ECM 边缘计算
LH 轻量应用服务器
Other 混合云专区
     * @param MachineType 机器所属专区类型 
CVM 云服务器
BM 黑石
ECM 边缘计算
LH 轻量应用服务器
Other 混合云专区
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get 机器所属地域。如：ap-guangzhou，ap-shanghai 
     * @return MachineRegion 机器所属地域。如：ap-guangzhou，ap-shanghai
     */
    public String getMachineRegion() {
        return this.MachineRegion;
    }

    /**
     * Set 机器所属地域。如：ap-guangzhou，ap-shanghai
     * @param MachineRegion 机器所属地域。如：ap-guangzhou，ap-shanghai
     */
    public void setMachineRegion(String MachineRegion) {
        this.MachineRegion = MachineRegion;
    }

    /**
     * Get 返回数量，默认为10，最大值为100。 
     * @return Limit 返回数量，默认为10，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为10，最大值为100。
     * @param Limit 返回数量，默认为10，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 过滤条件。
<li>Keywords - String - 是否必填：否 - 查询关键字 </li>
<li>Status - String - 是否必填：否 - 客户端在线状态（OFFLINE: 离线/关机 | ONLINE: 在线 | UNINSTALLED：未安装 | AGENT_OFFLINE 离线| AGENT_SHUTDOWN 已关机）</li>
<li>Version - String  是否必填：否 - 当前防护版本（ PRO_VERSION：专业版 | BASIC_VERSION：基础版 | Flagship : 旗舰版 | ProtectedMachines: 专业版+旗舰版）</li>
<li>Risk - String 是否必填: 否 - 风险主机( yes ) </li>
<li>Os -String 是否必填: 否 - 操作系统( DescribeMachineOsList 接口 值 )
每个过滤条件只支持一个值，暂不支持多个值“或”关系查询
<li>Quuid - String - 是否必填: 否 - 云服务器uuid  最大100条.</li> 
     * @return Filters 过滤条件。
<li>Keywords - String - 是否必填：否 - 查询关键字 </li>
<li>Status - String - 是否必填：否 - 客户端在线状态（OFFLINE: 离线/关机 | ONLINE: 在线 | UNINSTALLED：未安装 | AGENT_OFFLINE 离线| AGENT_SHUTDOWN 已关机）</li>
<li>Version - String  是否必填：否 - 当前防护版本（ PRO_VERSION：专业版 | BASIC_VERSION：基础版 | Flagship : 旗舰版 | ProtectedMachines: 专业版+旗舰版）</li>
<li>Risk - String 是否必填: 否 - 风险主机( yes ) </li>
<li>Os -String 是否必填: 否 - 操作系统( DescribeMachineOsList 接口 值 )
每个过滤条件只支持一个值，暂不支持多个值“或”关系查询
<li>Quuid - String - 是否必填: 否 - 云服务器uuid  最大100条.</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
<li>Keywords - String - 是否必填：否 - 查询关键字 </li>
<li>Status - String - 是否必填：否 - 客户端在线状态（OFFLINE: 离线/关机 | ONLINE: 在线 | UNINSTALLED：未安装 | AGENT_OFFLINE 离线| AGENT_SHUTDOWN 已关机）</li>
<li>Version - String  是否必填：否 - 当前防护版本（ PRO_VERSION：专业版 | BASIC_VERSION：基础版 | Flagship : 旗舰版 | ProtectedMachines: 专业版+旗舰版）</li>
<li>Risk - String 是否必填: 否 - 风险主机( yes ) </li>
<li>Os -String 是否必填: 否 - 操作系统( DescribeMachineOsList 接口 值 )
每个过滤条件只支持一个值，暂不支持多个值“或”关系查询
<li>Quuid - String - 是否必填: 否 - 云服务器uuid  最大100条.</li>
     * @param Filters 过滤条件。
<li>Keywords - String - 是否必填：否 - 查询关键字 </li>
<li>Status - String - 是否必填：否 - 客户端在线状态（OFFLINE: 离线/关机 | ONLINE: 在线 | UNINSTALLED：未安装 | AGENT_OFFLINE 离线| AGENT_SHUTDOWN 已关机）</li>
<li>Version - String  是否必填：否 - 当前防护版本（ PRO_VERSION：专业版 | BASIC_VERSION：基础版 | Flagship : 旗舰版 | ProtectedMachines: 专业版+旗舰版）</li>
<li>Risk - String 是否必填: 否 - 风险主机( yes ) </li>
<li>Os -String 是否必填: 否 - 操作系统( DescribeMachineOsList 接口 值 )
每个过滤条件只支持一个值，暂不支持多个值“或”关系查询
<li>Quuid - String - 是否必填: 否 - 云服务器uuid  最大100条.</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 机器所属业务ID列表 
     * @return ProjectIds 机器所属业务ID列表
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set 机器所属业务ID列表
     * @param ProjectIds 机器所属业务ID列表
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    public DescribeMachinesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMachinesRequest(DescribeMachinesRequest source) {
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.MachineRegion != null) {
            this.MachineRegion = new String(source.MachineRegion);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new Long[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new Long(source.ProjectIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "MachineRegion", this.MachineRegion);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);

    }
}

