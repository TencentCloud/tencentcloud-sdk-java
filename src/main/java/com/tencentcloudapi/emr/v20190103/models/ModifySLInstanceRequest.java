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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySLInstanceRequest extends AbstractModel {

    /**
    * <p>实例唯一标识符（字符串表示）。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>需要变更的区域名称。</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>该区域变配后的目标节点数量，所有区域节点总数应大于等于3，小于等于50。</p>
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * <p>唯一随机标识，时效性为5分钟，需要调用者指定 防止客户端重复创建资源，例如 a9a90aa6-<strong><strong>-</strong></strong>-****-fae360632808</p>
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * <p>存储空间大小，需要是100的倍数，且不允许比当前存储空间小（只允许扩容）</p><p>单位：GB</p>
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
     * Get <p>实例唯一标识符（字符串表示）。</p> 
     * @return InstanceId <p>实例唯一标识符（字符串表示）。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例唯一标识符（字符串表示）。</p>
     * @param InstanceId <p>实例唯一标识符（字符串表示）。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>需要变更的区域名称。</p> 
     * @return Zone <p>需要变更的区域名称。</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>需要变更的区域名称。</p>
     * @param Zone <p>需要变更的区域名称。</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>该区域变配后的目标节点数量，所有区域节点总数应大于等于3，小于等于50。</p> 
     * @return NodeNum <p>该区域变配后的目标节点数量，所有区域节点总数应大于等于3，小于等于50。</p>
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set <p>该区域变配后的目标节点数量，所有区域节点总数应大于等于3，小于等于50。</p>
     * @param NodeNum <p>该区域变配后的目标节点数量，所有区域节点总数应大于等于3，小于等于50。</p>
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get <p>唯一随机标识，时效性为5分钟，需要调用者指定 防止客户端重复创建资源，例如 a9a90aa6-<strong><strong>-</strong></strong>-****-fae360632808</p> 
     * @return ClientToken <p>唯一随机标识，时效性为5分钟，需要调用者指定 防止客户端重复创建资源，例如 a9a90aa6-<strong><strong>-</strong></strong>-****-fae360632808</p>
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set <p>唯一随机标识，时效性为5分钟，需要调用者指定 防止客户端重复创建资源，例如 a9a90aa6-<strong><strong>-</strong></strong>-****-fae360632808</p>
     * @param ClientToken <p>唯一随机标识，时效性为5分钟，需要调用者指定 防止客户端重复创建资源，例如 a9a90aa6-<strong><strong>-</strong></strong>-****-fae360632808</p>
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get <p>存储空间大小，需要是100的倍数，且不允许比当前存储空间小（只允许扩容）</p><p>单位：GB</p> 
     * @return DiskSize <p>存储空间大小，需要是100的倍数，且不允许比当前存储空间小（只允许扩容）</p><p>单位：GB</p>
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>存储空间大小，需要是100的倍数，且不允许比当前存储空间小（只允许扩容）</p><p>单位：GB</p>
     * @param DiskSize <p>存储空间大小，需要是100的倍数，且不允许比当前存储空间小（只允许扩容）</p><p>单位：GB</p>
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    public ModifySLInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySLInstanceRequest(ModifySLInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.NodeNum != null) {
            this.NodeNum = new Long(source.NodeNum);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "NodeNum", this.NodeNum);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);

    }
}

