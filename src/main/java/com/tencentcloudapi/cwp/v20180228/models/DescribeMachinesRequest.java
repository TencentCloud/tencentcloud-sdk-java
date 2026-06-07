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

public class DescribeMachinesRequest extends AbstractModel {

    /**
    * <p>机器所属专区类型<br>CVM 云服务器<br>BM 黑石<br>ECM 边缘计算<br>LH 轻量应用服务器<br>Other 混合云专区</p>
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * <p>机器所属地域。如：ap-guangzhou，ap-shanghai，非腾讯云主机使用：ap-others</p>
    */
    @SerializedName("MachineRegion")
    @Expose
    private String MachineRegion;

    /**
    * <p>返回数量，默认为10，最大值为100。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>偏移量，默认为0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>过滤条件。</p><li>Ips - String - 是否必填：否 - 通过ip查询 </li><li>Names - String - 是否必填：否 - 通过实例名查询 </li><li>InstanceIds - String - 是否必填：否 - 通过实例id查询 </li><li>Version - String  是否必填：否 - 当前防护版本（ PRO_VERSION：专业版 | BASIC_VERSION：基础版 | Flagship : 旗舰版 | ProtectedMachines: 专业版+旗舰版）</li><li>Risk - String 是否必填: 否 - 风险主机( yes ) </li><li>Os -String 是否必填: 否 - 操作系统( DescribeMachineOsList 接口 值 )每个过滤条件只支持一个值，暂不支持多个值“或”关系查询</li><li>Quuid - String - 是否必填: 否 - 云服务器uuid  最大100条.</li><li>AddedOnTheFifteen- String 是否必填: 否 - 是否只查询15天内新增的主机( 1：是) </li><li> TagId- String 是否必填: 否 - 查询指定标签关联的主机列表 </li><li> AgentStatus- String 是否必填: 否 - ALL 全部; ONLINE 防护中; OFFLINE 已离线;UNINSTALLED 未安装</li><li> MachineStatus- String 是否必填: 否 - ALL 全部; RUNNING 运行中; STOPPED 已关机; EXPIRED 待回收</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>机器所属业务ID列表</p>
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
    * <p>机器对应的APPID</p>
    */
    @SerializedName("MachineAppId")
    @Expose
    private Long MachineAppId;

    /**
     * Get <p>机器所属专区类型<br>CVM 云服务器<br>BM 黑石<br>ECM 边缘计算<br>LH 轻量应用服务器<br>Other 混合云专区</p> 
     * @return MachineType <p>机器所属专区类型<br>CVM 云服务器<br>BM 黑石<br>ECM 边缘计算<br>LH 轻量应用服务器<br>Other 混合云专区</p>
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set <p>机器所属专区类型<br>CVM 云服务器<br>BM 黑石<br>ECM 边缘计算<br>LH 轻量应用服务器<br>Other 混合云专区</p>
     * @param MachineType <p>机器所属专区类型<br>CVM 云服务器<br>BM 黑石<br>ECM 边缘计算<br>LH 轻量应用服务器<br>Other 混合云专区</p>
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get <p>机器所属地域。如：ap-guangzhou，ap-shanghai，非腾讯云主机使用：ap-others</p> 
     * @return MachineRegion <p>机器所属地域。如：ap-guangzhou，ap-shanghai，非腾讯云主机使用：ap-others</p>
     */
    public String getMachineRegion() {
        return this.MachineRegion;
    }

    /**
     * Set <p>机器所属地域。如：ap-guangzhou，ap-shanghai，非腾讯云主机使用：ap-others</p>
     * @param MachineRegion <p>机器所属地域。如：ap-guangzhou，ap-shanghai，非腾讯云主机使用：ap-others</p>
     */
    public void setMachineRegion(String MachineRegion) {
        this.MachineRegion = MachineRegion;
    }

    /**
     * Get <p>返回数量，默认为10，最大值为100。</p> 
     * @return Limit <p>返回数量，默认为10，最大值为100。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量，默认为10，最大值为100。</p>
     * @param Limit <p>返回数量，默认为10，最大值为100。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>偏移量，默认为0。</p> 
     * @return Offset <p>偏移量，默认为0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认为0。</p>
     * @param Offset <p>偏移量，默认为0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>过滤条件。</p><li>Ips - String - 是否必填：否 - 通过ip查询 </li><li>Names - String - 是否必填：否 - 通过实例名查询 </li><li>InstanceIds - String - 是否必填：否 - 通过实例id查询 </li><li>Version - String  是否必填：否 - 当前防护版本（ PRO_VERSION：专业版 | BASIC_VERSION：基础版 | Flagship : 旗舰版 | ProtectedMachines: 专业版+旗舰版）</li><li>Risk - String 是否必填: 否 - 风险主机( yes ) </li><li>Os -String 是否必填: 否 - 操作系统( DescribeMachineOsList 接口 值 )每个过滤条件只支持一个值，暂不支持多个值“或”关系查询</li><li>Quuid - String - 是否必填: 否 - 云服务器uuid  最大100条.</li><li>AddedOnTheFifteen- String 是否必填: 否 - 是否只查询15天内新增的主机( 1：是) </li><li> TagId- String 是否必填: 否 - 查询指定标签关联的主机列表 </li><li> AgentStatus- String 是否必填: 否 - ALL 全部; ONLINE 防护中; OFFLINE 已离线;UNINSTALLED 未安装</li><li> MachineStatus- String 是否必填: 否 - ALL 全部; RUNNING 运行中; STOPPED 已关机; EXPIRED 待回收</li> 
     * @return Filters <p>过滤条件。</p><li>Ips - String - 是否必填：否 - 通过ip查询 </li><li>Names - String - 是否必填：否 - 通过实例名查询 </li><li>InstanceIds - String - 是否必填：否 - 通过实例id查询 </li><li>Version - String  是否必填：否 - 当前防护版本（ PRO_VERSION：专业版 | BASIC_VERSION：基础版 | Flagship : 旗舰版 | ProtectedMachines: 专业版+旗舰版）</li><li>Risk - String 是否必填: 否 - 风险主机( yes ) </li><li>Os -String 是否必填: 否 - 操作系统( DescribeMachineOsList 接口 值 )每个过滤条件只支持一个值，暂不支持多个值“或”关系查询</li><li>Quuid - String - 是否必填: 否 - 云服务器uuid  最大100条.</li><li>AddedOnTheFifteen- String 是否必填: 否 - 是否只查询15天内新增的主机( 1：是) </li><li> TagId- String 是否必填: 否 - 查询指定标签关联的主机列表 </li><li> AgentStatus- String 是否必填: 否 - ALL 全部; ONLINE 防护中; OFFLINE 已离线;UNINSTALLED 未安装</li><li> MachineStatus- String 是否必填: 否 - ALL 全部; RUNNING 运行中; STOPPED 已关机; EXPIRED 待回收</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件。</p><li>Ips - String - 是否必填：否 - 通过ip查询 </li><li>Names - String - 是否必填：否 - 通过实例名查询 </li><li>InstanceIds - String - 是否必填：否 - 通过实例id查询 </li><li>Version - String  是否必填：否 - 当前防护版本（ PRO_VERSION：专业版 | BASIC_VERSION：基础版 | Flagship : 旗舰版 | ProtectedMachines: 专业版+旗舰版）</li><li>Risk - String 是否必填: 否 - 风险主机( yes ) </li><li>Os -String 是否必填: 否 - 操作系统( DescribeMachineOsList 接口 值 )每个过滤条件只支持一个值，暂不支持多个值“或”关系查询</li><li>Quuid - String - 是否必填: 否 - 云服务器uuid  最大100条.</li><li>AddedOnTheFifteen- String 是否必填: 否 - 是否只查询15天内新增的主机( 1：是) </li><li> TagId- String 是否必填: 否 - 查询指定标签关联的主机列表 </li><li> AgentStatus- String 是否必填: 否 - ALL 全部; ONLINE 防护中; OFFLINE 已离线;UNINSTALLED 未安装</li><li> MachineStatus- String 是否必填: 否 - ALL 全部; RUNNING 运行中; STOPPED 已关机; EXPIRED 待回收</li>
     * @param Filters <p>过滤条件。</p><li>Ips - String - 是否必填：否 - 通过ip查询 </li><li>Names - String - 是否必填：否 - 通过实例名查询 </li><li>InstanceIds - String - 是否必填：否 - 通过实例id查询 </li><li>Version - String  是否必填：否 - 当前防护版本（ PRO_VERSION：专业版 | BASIC_VERSION：基础版 | Flagship : 旗舰版 | ProtectedMachines: 专业版+旗舰版）</li><li>Risk - String 是否必填: 否 - 风险主机( yes ) </li><li>Os -String 是否必填: 否 - 操作系统( DescribeMachineOsList 接口 值 )每个过滤条件只支持一个值，暂不支持多个值“或”关系查询</li><li>Quuid - String - 是否必填: 否 - 云服务器uuid  最大100条.</li><li>AddedOnTheFifteen- String 是否必填: 否 - 是否只查询15天内新增的主机( 1：是) </li><li> TagId- String 是否必填: 否 - 查询指定标签关联的主机列表 </li><li> AgentStatus- String 是否必填: 否 - ALL 全部; ONLINE 防护中; OFFLINE 已离线;UNINSTALLED 未安装</li><li> MachineStatus- String 是否必填: 否 - ALL 全部; RUNNING 运行中; STOPPED 已关机; EXPIRED 待回收</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>机器所属业务ID列表</p> 
     * @return ProjectIds <p>机器所属业务ID列表</p>
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set <p>机器所属业务ID列表</p>
     * @param ProjectIds <p>机器所属业务ID列表</p>
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get <p>机器对应的APPID</p> 
     * @return MachineAppId <p>机器对应的APPID</p>
     */
    public Long getMachineAppId() {
        return this.MachineAppId;
    }

    /**
     * Set <p>机器对应的APPID</p>
     * @param MachineAppId <p>机器对应的APPID</p>
     */
    public void setMachineAppId(Long MachineAppId) {
        this.MachineAppId = MachineAppId;
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
        if (source.MachineAppId != null) {
            this.MachineAppId = new Long(source.MachineAppId);
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
        this.setParamSimple(map, prefix + "MachineAppId", this.MachineAppId);

    }
}

