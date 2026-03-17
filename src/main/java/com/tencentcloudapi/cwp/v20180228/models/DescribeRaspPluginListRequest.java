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

public class DescribeRaspPluginListRequest extends AbstractModel {

    /**
    * 资产类型
- CWP 主机安全资产
- TCSS_HOST 容器主机节点
- TCSS_EKS 容器超级节点
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * 机器唯一ID
    */
    @SerializedName("QUUID")
    @Expose
    private String QUUID;

    /**
    * 过滤参数
PluginStatus 插件状态  (Injecting 注入中,Injected 注入成功,Timeout 插件超时,Exited 插件退出, Failed 注入失败)
PID  进程PID
MainClass 进程主类名 
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * 偏移量默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 限制条数,默认10
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 资产类型
- CWP 主机安全资产
- TCSS_HOST 容器主机节点
- TCSS_EKS 容器超级节点 
     * @return AssetType 资产类型
- CWP 主机安全资产
- TCSS_HOST 容器主机节点
- TCSS_EKS 容器超级节点
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set 资产类型
- CWP 主机安全资产
- TCSS_HOST 容器主机节点
- TCSS_EKS 容器超级节点
     * @param AssetType 资产类型
- CWP 主机安全资产
- TCSS_HOST 容器主机节点
- TCSS_EKS 容器超级节点
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get 机器唯一ID 
     * @return QUUID 机器唯一ID
     */
    public String getQUUID() {
        return this.QUUID;
    }

    /**
     * Set 机器唯一ID
     * @param QUUID 机器唯一ID
     */
    public void setQUUID(String QUUID) {
        this.QUUID = QUUID;
    }

    /**
     * Get 过滤参数
PluginStatus 插件状态  (Injecting 注入中,Injected 注入成功,Timeout 插件超时,Exited 插件退出, Failed 注入失败)
PID  进程PID
MainClass 进程主类名  
     * @return Filters 过滤参数
PluginStatus 插件状态  (Injecting 注入中,Injected 注入成功,Timeout 插件超时,Exited 插件退出, Failed 注入失败)
PID  进程PID
MainClass 进程主类名 
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤参数
PluginStatus 插件状态  (Injecting 注入中,Injected 注入成功,Timeout 插件超时,Exited 插件退出, Failed 注入失败)
PID  进程PID
MainClass 进程主类名 
     * @param Filters 过滤参数
PluginStatus 插件状态  (Injecting 注入中,Injected 注入成功,Timeout 插件超时,Exited 插件退出, Failed 注入失败)
PID  进程PID
MainClass 进程主类名 
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 偏移量默认0 
     * @return Offset 偏移量默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量默认0
     * @param Offset 偏移量默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 限制条数,默认10 
     * @return Limit 限制条数,默认10
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制条数,默认10
     * @param Limit 限制条数,默认10
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeRaspPluginListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRaspPluginListRequest(DescribeRaspPluginListRequest source) {
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.QUUID != null) {
            this.QUUID = new String(source.QUUID);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "QUUID", this.QUUID);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

