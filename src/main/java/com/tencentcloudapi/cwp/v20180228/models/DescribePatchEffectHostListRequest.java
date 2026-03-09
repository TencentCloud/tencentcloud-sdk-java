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

public class DescribePatchEffectHostListRequest extends AbstractModel {

    /**
    * 补丁id
    */
    @SerializedName("KbId")
    @Expose
    private Long KbId;

    /**
    * 分页limit 最大100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 过滤条件：  
<li>HostVersion : uint64类型 非必填 版本信息 : 0-基础版 1-专业版 2-旗舰版 3-轻量版 </li>
<li>InstanceState : string类型 非必填 主机状态 : "PENDING"-创建中 "LAUNCH_FAILED"-创建失败 "RUNNING"-运行中 "STOPPED"-关机 "STARTING"-开机中 "STOPPING"-关机中 "REBOOTING"-重启中 "SHUTDOWN"-待销毁 "TERMINATING"-销毁中 "UNKNOWN"-未知（针对非腾讯云机器，且客户端离线的场景）</li>
<li>Status : uint64类型 非必填 处理状态 0表示待处理，1表示忽略，3表示已修复</li>
<li>HostName : string类型 非必填 主机名称</li>
<li>InstanceID : string类型 非必填 主机id</li>
<li>IpAddress : string类型 非必填 主机的ip地址</li>
<li>Uuid : string类型 非必填 主机uuid</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 补丁id 
     * @return KbId 补丁id
     */
    public Long getKbId() {
        return this.KbId;
    }

    /**
     * Set 补丁id
     * @param KbId 补丁id
     */
    public void setKbId(Long KbId) {
        this.KbId = KbId;
    }

    /**
     * Get 分页limit 最大100 
     * @return Limit 分页limit 最大100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页limit 最大100
     * @param Limit 分页limit 最大100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页偏移量 
     * @return Offset 分页偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量
     * @param Offset 分页偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 过滤条件：  
<li>HostVersion : uint64类型 非必填 版本信息 : 0-基础版 1-专业版 2-旗舰版 3-轻量版 </li>
<li>InstanceState : string类型 非必填 主机状态 : "PENDING"-创建中 "LAUNCH_FAILED"-创建失败 "RUNNING"-运行中 "STOPPED"-关机 "STARTING"-开机中 "STOPPING"-关机中 "REBOOTING"-重启中 "SHUTDOWN"-待销毁 "TERMINATING"-销毁中 "UNKNOWN"-未知（针对非腾讯云机器，且客户端离线的场景）</li>
<li>Status : uint64类型 非必填 处理状态 0表示待处理，1表示忽略，3表示已修复</li>
<li>HostName : string类型 非必填 主机名称</li>
<li>InstanceID : string类型 非必填 主机id</li>
<li>IpAddress : string类型 非必填 主机的ip地址</li>
<li>Uuid : string类型 非必填 主机uuid</li> 
     * @return Filters 过滤条件：  
<li>HostVersion : uint64类型 非必填 版本信息 : 0-基础版 1-专业版 2-旗舰版 3-轻量版 </li>
<li>InstanceState : string类型 非必填 主机状态 : "PENDING"-创建中 "LAUNCH_FAILED"-创建失败 "RUNNING"-运行中 "STOPPED"-关机 "STARTING"-开机中 "STOPPING"-关机中 "REBOOTING"-重启中 "SHUTDOWN"-待销毁 "TERMINATING"-销毁中 "UNKNOWN"-未知（针对非腾讯云机器，且客户端离线的场景）</li>
<li>Status : uint64类型 非必填 处理状态 0表示待处理，1表示忽略，3表示已修复</li>
<li>HostName : string类型 非必填 主机名称</li>
<li>InstanceID : string类型 非必填 主机id</li>
<li>IpAddress : string类型 非必填 主机的ip地址</li>
<li>Uuid : string类型 非必填 主机uuid</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件：  
<li>HostVersion : uint64类型 非必填 版本信息 : 0-基础版 1-专业版 2-旗舰版 3-轻量版 </li>
<li>InstanceState : string类型 非必填 主机状态 : "PENDING"-创建中 "LAUNCH_FAILED"-创建失败 "RUNNING"-运行中 "STOPPED"-关机 "STARTING"-开机中 "STOPPING"-关机中 "REBOOTING"-重启中 "SHUTDOWN"-待销毁 "TERMINATING"-销毁中 "UNKNOWN"-未知（针对非腾讯云机器，且客户端离线的场景）</li>
<li>Status : uint64类型 非必填 处理状态 0表示待处理，1表示忽略，3表示已修复</li>
<li>HostName : string类型 非必填 主机名称</li>
<li>InstanceID : string类型 非必填 主机id</li>
<li>IpAddress : string类型 非必填 主机的ip地址</li>
<li>Uuid : string类型 非必填 主机uuid</li>
     * @param Filters 过滤条件：  
<li>HostVersion : uint64类型 非必填 版本信息 : 0-基础版 1-专业版 2-旗舰版 3-轻量版 </li>
<li>InstanceState : string类型 非必填 主机状态 : "PENDING"-创建中 "LAUNCH_FAILED"-创建失败 "RUNNING"-运行中 "STOPPED"-关机 "STARTING"-开机中 "STOPPING"-关机中 "REBOOTING"-重启中 "SHUTDOWN"-待销毁 "TERMINATING"-销毁中 "UNKNOWN"-未知（针对非腾讯云机器，且客户端离线的场景）</li>
<li>Status : uint64类型 非必填 处理状态 0表示待处理，1表示忽略，3表示已修复</li>
<li>HostName : string类型 非必填 主机名称</li>
<li>InstanceID : string类型 非必填 主机id</li>
<li>IpAddress : string类型 非必填 主机的ip地址</li>
<li>Uuid : string类型 非必填 主机uuid</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribePatchEffectHostListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePatchEffectHostListRequest(DescribePatchEffectHostListRequest source) {
        if (source.KbId != null) {
            this.KbId = new Long(source.KbId);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

