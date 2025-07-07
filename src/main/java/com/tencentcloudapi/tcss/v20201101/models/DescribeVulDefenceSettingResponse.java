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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulDefenceSettingResponse extends AbstractModel {

    /**
    * 是否开启:0: 关闭 1:开启
    */
    @SerializedName("IsEnabled")
    @Expose
    private Long IsEnabled;

    /**
    * 漏洞防御主机范围: 0:自选主机节点，1:全部
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * 漏洞防御主机数量
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

    /**
    * 开启漏洞防御异常主机数量
    */
    @SerializedName("ExceptionHostCount")
    @Expose
    private Long ExceptionHostCount;

    /**
    * 自选漏洞防御主机
    */
    @SerializedName("HostIDs")
    @Expose
    private String [] HostIDs;

    /**
    * 开通容器安全的主机总数
    */
    @SerializedName("HostTotalCount")
    @Expose
    private Long HostTotalCount;

    /**
    * 支持防御的漏洞数
    */
    @SerializedName("SupportDefenseVulCount")
    @Expose
    private Long SupportDefenseVulCount;

    /**
    * 普通节点个数
    */
    @SerializedName("HostNodeCount")
    @Expose
    private Long HostNodeCount;

    /**
    * 超级节点范围
    */
    @SerializedName("SuperScope")
    @Expose
    private Long SuperScope;

    /**
    * 超级节点个数
    */
    @SerializedName("SuperNodeCount")
    @Expose
    private Long SuperNodeCount;

    /**
    * 超级节点Id列表
    */
    @SerializedName("SuperNodeIds")
    @Expose
    private String [] SuperNodeIds;

    /**
    * 开通容器安全的超级结点总数
    */
    @SerializedName("NodeTotalCount")
    @Expose
    private Long NodeTotalCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 是否开启:0: 关闭 1:开启 
     * @return IsEnabled 是否开启:0: 关闭 1:开启
     */
    public Long getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set 是否开启:0: 关闭 1:开启
     * @param IsEnabled 是否开启:0: 关闭 1:开启
     */
    public void setIsEnabled(Long IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    /**
     * Get 漏洞防御主机范围: 0:自选主机节点，1:全部 
     * @return Scope 漏洞防御主机范围: 0:自选主机节点，1:全部
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set 漏洞防御主机范围: 0:自选主机节点，1:全部
     * @param Scope 漏洞防御主机范围: 0:自选主机节点，1:全部
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get 漏洞防御主机数量 
     * @return HostCount 漏洞防御主机数量
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set 漏洞防御主机数量
     * @param HostCount 漏洞防御主机数量
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
    }

    /**
     * Get 开启漏洞防御异常主机数量 
     * @return ExceptionHostCount 开启漏洞防御异常主机数量
     */
    public Long getExceptionHostCount() {
        return this.ExceptionHostCount;
    }

    /**
     * Set 开启漏洞防御异常主机数量
     * @param ExceptionHostCount 开启漏洞防御异常主机数量
     */
    public void setExceptionHostCount(Long ExceptionHostCount) {
        this.ExceptionHostCount = ExceptionHostCount;
    }

    /**
     * Get 自选漏洞防御主机 
     * @return HostIDs 自选漏洞防御主机
     */
    public String [] getHostIDs() {
        return this.HostIDs;
    }

    /**
     * Set 自选漏洞防御主机
     * @param HostIDs 自选漏洞防御主机
     */
    public void setHostIDs(String [] HostIDs) {
        this.HostIDs = HostIDs;
    }

    /**
     * Get 开通容器安全的主机总数 
     * @return HostTotalCount 开通容器安全的主机总数
     */
    public Long getHostTotalCount() {
        return this.HostTotalCount;
    }

    /**
     * Set 开通容器安全的主机总数
     * @param HostTotalCount 开通容器安全的主机总数
     */
    public void setHostTotalCount(Long HostTotalCount) {
        this.HostTotalCount = HostTotalCount;
    }

    /**
     * Get 支持防御的漏洞数 
     * @return SupportDefenseVulCount 支持防御的漏洞数
     */
    public Long getSupportDefenseVulCount() {
        return this.SupportDefenseVulCount;
    }

    /**
     * Set 支持防御的漏洞数
     * @param SupportDefenseVulCount 支持防御的漏洞数
     */
    public void setSupportDefenseVulCount(Long SupportDefenseVulCount) {
        this.SupportDefenseVulCount = SupportDefenseVulCount;
    }

    /**
     * Get 普通节点个数 
     * @return HostNodeCount 普通节点个数
     */
    public Long getHostNodeCount() {
        return this.HostNodeCount;
    }

    /**
     * Set 普通节点个数
     * @param HostNodeCount 普通节点个数
     */
    public void setHostNodeCount(Long HostNodeCount) {
        this.HostNodeCount = HostNodeCount;
    }

    /**
     * Get 超级节点范围 
     * @return SuperScope 超级节点范围
     */
    public Long getSuperScope() {
        return this.SuperScope;
    }

    /**
     * Set 超级节点范围
     * @param SuperScope 超级节点范围
     */
    public void setSuperScope(Long SuperScope) {
        this.SuperScope = SuperScope;
    }

    /**
     * Get 超级节点个数 
     * @return SuperNodeCount 超级节点个数
     */
    public Long getSuperNodeCount() {
        return this.SuperNodeCount;
    }

    /**
     * Set 超级节点个数
     * @param SuperNodeCount 超级节点个数
     */
    public void setSuperNodeCount(Long SuperNodeCount) {
        this.SuperNodeCount = SuperNodeCount;
    }

    /**
     * Get 超级节点Id列表 
     * @return SuperNodeIds 超级节点Id列表
     */
    public String [] getSuperNodeIds() {
        return this.SuperNodeIds;
    }

    /**
     * Set 超级节点Id列表
     * @param SuperNodeIds 超级节点Id列表
     */
    public void setSuperNodeIds(String [] SuperNodeIds) {
        this.SuperNodeIds = SuperNodeIds;
    }

    /**
     * Get 开通容器安全的超级结点总数 
     * @return NodeTotalCount 开通容器安全的超级结点总数
     */
    public Long getNodeTotalCount() {
        return this.NodeTotalCount;
    }

    /**
     * Set 开通容器安全的超级结点总数
     * @param NodeTotalCount 开通容器安全的超级结点总数
     */
    public void setNodeTotalCount(Long NodeTotalCount) {
        this.NodeTotalCount = NodeTotalCount;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeVulDefenceSettingResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulDefenceSettingResponse(DescribeVulDefenceSettingResponse source) {
        if (source.IsEnabled != null) {
            this.IsEnabled = new Long(source.IsEnabled);
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.HostCount != null) {
            this.HostCount = new Long(source.HostCount);
        }
        if (source.ExceptionHostCount != null) {
            this.ExceptionHostCount = new Long(source.ExceptionHostCount);
        }
        if (source.HostIDs != null) {
            this.HostIDs = new String[source.HostIDs.length];
            for (int i = 0; i < source.HostIDs.length; i++) {
                this.HostIDs[i] = new String(source.HostIDs[i]);
            }
        }
        if (source.HostTotalCount != null) {
            this.HostTotalCount = new Long(source.HostTotalCount);
        }
        if (source.SupportDefenseVulCount != null) {
            this.SupportDefenseVulCount = new Long(source.SupportDefenseVulCount);
        }
        if (source.HostNodeCount != null) {
            this.HostNodeCount = new Long(source.HostNodeCount);
        }
        if (source.SuperScope != null) {
            this.SuperScope = new Long(source.SuperScope);
        }
        if (source.SuperNodeCount != null) {
            this.SuperNodeCount = new Long(source.SuperNodeCount);
        }
        if (source.SuperNodeIds != null) {
            this.SuperNodeIds = new String[source.SuperNodeIds.length];
            for (int i = 0; i < source.SuperNodeIds.length; i++) {
                this.SuperNodeIds[i] = new String(source.SuperNodeIds[i]);
            }
        }
        if (source.NodeTotalCount != null) {
            this.NodeTotalCount = new Long(source.NodeTotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsEnabled", this.IsEnabled);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "HostCount", this.HostCount);
        this.setParamSimple(map, prefix + "ExceptionHostCount", this.ExceptionHostCount);
        this.setParamArraySimple(map, prefix + "HostIDs.", this.HostIDs);
        this.setParamSimple(map, prefix + "HostTotalCount", this.HostTotalCount);
        this.setParamSimple(map, prefix + "SupportDefenseVulCount", this.SupportDefenseVulCount);
        this.setParamSimple(map, prefix + "HostNodeCount", this.HostNodeCount);
        this.setParamSimple(map, prefix + "SuperScope", this.SuperScope);
        this.setParamSimple(map, prefix + "SuperNodeCount", this.SuperNodeCount);
        this.setParamArraySimple(map, prefix + "SuperNodeIds.", this.SuperNodeIds);
        this.setParamSimple(map, prefix + "NodeTotalCount", this.NodeTotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

