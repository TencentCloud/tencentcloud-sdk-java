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
package com.tencentcloudapi.dbdc.v20201029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBCustomNodeAttributesRequest extends AbstractModel {

    /**
    * <p>节点ID</p><p>参数格式：dbcn-hq98qjym</p>
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * <p>主机 HostName</p><p>入参限制：参数设置规则参见：<a href="https://cloud.tencent.com/document/api/1322/132929">创建 DB Custom 节点接口</a>的 HostName 参数说明。</p><p>注意：节点在没有加入到集群之前才支持修改主机 HostName。</p>
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * <p>节点名称</p><p>入参限制：参数设置规则参见：<a href="https://cloud.tencent.com/document/api/1322/132929">创建 DB Custom 节点接口</a>的 NodeName 参数说明。</p>
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * <p>修改实例 HostName 是否自动重启实例，不传默认自动重启。</p><p>枚举值：</p><ul><li>true： 修改主机 HostName，并自动重启主机</li><li>false： 修改主机 HostName，不自动重启主机，需要手动重启使新主机 HostName 生效</li></ul><p>默认值：true</p>
    */
    @SerializedName("AutoReboot")
    @Expose
    private Boolean AutoReboot;

    /**
     * Get <p>节点ID</p><p>参数格式：dbcn-hq98qjym</p> 
     * @return NodeId <p>节点ID</p><p>参数格式：dbcn-hq98qjym</p>
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set <p>节点ID</p><p>参数格式：dbcn-hq98qjym</p>
     * @param NodeId <p>节点ID</p><p>参数格式：dbcn-hq98qjym</p>
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get <p>主机 HostName</p><p>入参限制：参数设置规则参见：<a href="https://cloud.tencent.com/document/api/1322/132929">创建 DB Custom 节点接口</a>的 HostName 参数说明。</p><p>注意：节点在没有加入到集群之前才支持修改主机 HostName。</p> 
     * @return HostName <p>主机 HostName</p><p>入参限制：参数设置规则参见：<a href="https://cloud.tencent.com/document/api/1322/132929">创建 DB Custom 节点接口</a>的 HostName 参数说明。</p><p>注意：节点在没有加入到集群之前才支持修改主机 HostName。</p>
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set <p>主机 HostName</p><p>入参限制：参数设置规则参见：<a href="https://cloud.tencent.com/document/api/1322/132929">创建 DB Custom 节点接口</a>的 HostName 参数说明。</p><p>注意：节点在没有加入到集群之前才支持修改主机 HostName。</p>
     * @param HostName <p>主机 HostName</p><p>入参限制：参数设置规则参见：<a href="https://cloud.tencent.com/document/api/1322/132929">创建 DB Custom 节点接口</a>的 HostName 参数说明。</p><p>注意：节点在没有加入到集群之前才支持修改主机 HostName。</p>
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get <p>节点名称</p><p>入参限制：参数设置规则参见：<a href="https://cloud.tencent.com/document/api/1322/132929">创建 DB Custom 节点接口</a>的 NodeName 参数说明。</p> 
     * @return NodeName <p>节点名称</p><p>入参限制：参数设置规则参见：<a href="https://cloud.tencent.com/document/api/1322/132929">创建 DB Custom 节点接口</a>的 NodeName 参数说明。</p>
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set <p>节点名称</p><p>入参限制：参数设置规则参见：<a href="https://cloud.tencent.com/document/api/1322/132929">创建 DB Custom 节点接口</a>的 NodeName 参数说明。</p>
     * @param NodeName <p>节点名称</p><p>入参限制：参数设置规则参见：<a href="https://cloud.tencent.com/document/api/1322/132929">创建 DB Custom 节点接口</a>的 NodeName 参数说明。</p>
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get <p>修改实例 HostName 是否自动重启实例，不传默认自动重启。</p><p>枚举值：</p><ul><li>true： 修改主机 HostName，并自动重启主机</li><li>false： 修改主机 HostName，不自动重启主机，需要手动重启使新主机 HostName 生效</li></ul><p>默认值：true</p> 
     * @return AutoReboot <p>修改实例 HostName 是否自动重启实例，不传默认自动重启。</p><p>枚举值：</p><ul><li>true： 修改主机 HostName，并自动重启主机</li><li>false： 修改主机 HostName，不自动重启主机，需要手动重启使新主机 HostName 生效</li></ul><p>默认值：true</p>
     */
    public Boolean getAutoReboot() {
        return this.AutoReboot;
    }

    /**
     * Set <p>修改实例 HostName 是否自动重启实例，不传默认自动重启。</p><p>枚举值：</p><ul><li>true： 修改主机 HostName，并自动重启主机</li><li>false： 修改主机 HostName，不自动重启主机，需要手动重启使新主机 HostName 生效</li></ul><p>默认值：true</p>
     * @param AutoReboot <p>修改实例 HostName 是否自动重启实例，不传默认自动重启。</p><p>枚举值：</p><ul><li>true： 修改主机 HostName，并自动重启主机</li><li>false： 修改主机 HostName，不自动重启主机，需要手动重启使新主机 HostName 生效</li></ul><p>默认值：true</p>
     */
    public void setAutoReboot(Boolean AutoReboot) {
        this.AutoReboot = AutoReboot;
    }

    public ModifyDBCustomNodeAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBCustomNodeAttributesRequest(ModifyDBCustomNodeAttributesRequest source) {
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.AutoReboot != null) {
            this.AutoReboot = new Boolean(source.AutoReboot);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "AutoReboot", this.AutoReboot);

    }
}

