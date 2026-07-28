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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyGroupInfo extends AbstractModel {

    /**
    * <p>Proxy 实例 ID，格式形如：proxygroup-xxxxxxxx</p>
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * <p>Proxy 状态：running/isolated/offline 等</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Proxy 任务状态，无任务时为空</p>
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * <p>Proxy 描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Proxy 内核版本号</p>
    */
    @SerializedName("ProxyVersion")
    @Expose
    private String ProxyVersion;

    /**
    * <p>连接池阈值（连接数）</p>
    */
    @SerializedName("ConnectionPoolLimit")
    @Expose
    private Long ConnectionPoolLimit;

    /**
    * <p>Proxy 节点列表</p>
    */
    @SerializedName("ProxyNodeSet")
    @Expose
    private ProxyNode [] ProxyNodeSet;

    /**
    * <p>Proxy 接入地址列表</p>
    */
    @SerializedName("ProxyAddressSet")
    @Expose
    private ProxyAddress [] ProxyAddressSet;

    /**
    * <p>创建时间，格式：YYYY-MM-DD HH:MM:SS</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get <p>Proxy 实例 ID，格式形如：proxygroup-xxxxxxxx</p> 
     * @return ProxyGroupId <p>Proxy 实例 ID，格式形如：proxygroup-xxxxxxxx</p>
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set <p>Proxy 实例 ID，格式形如：proxygroup-xxxxxxxx</p>
     * @param ProxyGroupId <p>Proxy 实例 ID，格式形如：proxygroup-xxxxxxxx</p>
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get <p>Proxy 状态：running/isolated/offline 等</p> 
     * @return Status <p>Proxy 状态：running/isolated/offline 等</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Proxy 状态：running/isolated/offline 等</p>
     * @param Status <p>Proxy 状态：running/isolated/offline 等</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Proxy 任务状态，无任务时为空</p> 
     * @return TaskStatus <p>Proxy 任务状态，无任务时为空</p>
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set <p>Proxy 任务状态，无任务时为空</p>
     * @param TaskStatus <p>Proxy 任务状态，无任务时为空</p>
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get <p>Proxy 描述</p> 
     * @return Description <p>Proxy 描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Proxy 描述</p>
     * @param Description <p>Proxy 描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Proxy 内核版本号</p> 
     * @return ProxyVersion <p>Proxy 内核版本号</p>
     */
    public String getProxyVersion() {
        return this.ProxyVersion;
    }

    /**
     * Set <p>Proxy 内核版本号</p>
     * @param ProxyVersion <p>Proxy 内核版本号</p>
     */
    public void setProxyVersion(String ProxyVersion) {
        this.ProxyVersion = ProxyVersion;
    }

    /**
     * Get <p>连接池阈值（连接数）</p> 
     * @return ConnectionPoolLimit <p>连接池阈值（连接数）</p>
     */
    public Long getConnectionPoolLimit() {
        return this.ConnectionPoolLimit;
    }

    /**
     * Set <p>连接池阈值（连接数）</p>
     * @param ConnectionPoolLimit <p>连接池阈值（连接数）</p>
     */
    public void setConnectionPoolLimit(Long ConnectionPoolLimit) {
        this.ConnectionPoolLimit = ConnectionPoolLimit;
    }

    /**
     * Get <p>Proxy 节点列表</p> 
     * @return ProxyNodeSet <p>Proxy 节点列表</p>
     */
    public ProxyNode [] getProxyNodeSet() {
        return this.ProxyNodeSet;
    }

    /**
     * Set <p>Proxy 节点列表</p>
     * @param ProxyNodeSet <p>Proxy 节点列表</p>
     */
    public void setProxyNodeSet(ProxyNode [] ProxyNodeSet) {
        this.ProxyNodeSet = ProxyNodeSet;
    }

    /**
     * Get <p>Proxy 接入地址列表</p> 
     * @return ProxyAddressSet <p>Proxy 接入地址列表</p>
     */
    public ProxyAddress [] getProxyAddressSet() {
        return this.ProxyAddressSet;
    }

    /**
     * Set <p>Proxy 接入地址列表</p>
     * @param ProxyAddressSet <p>Proxy 接入地址列表</p>
     */
    public void setProxyAddressSet(ProxyAddress [] ProxyAddressSet) {
        this.ProxyAddressSet = ProxyAddressSet;
    }

    /**
     * Get <p>创建时间，格式：YYYY-MM-DD HH:MM:SS</p> 
     * @return CreateTime <p>创建时间，格式：YYYY-MM-DD HH:MM:SS</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间，格式：YYYY-MM-DD HH:MM:SS</p>
     * @param CreateTime <p>创建时间，格式：YYYY-MM-DD HH:MM:SS</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public ProxyGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyGroupInfo(ProxyGroupInfo source) {
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ProxyVersion != null) {
            this.ProxyVersion = new String(source.ProxyVersion);
        }
        if (source.ConnectionPoolLimit != null) {
            this.ConnectionPoolLimit = new Long(source.ConnectionPoolLimit);
        }
        if (source.ProxyNodeSet != null) {
            this.ProxyNodeSet = new ProxyNode[source.ProxyNodeSet.length];
            for (int i = 0; i < source.ProxyNodeSet.length; i++) {
                this.ProxyNodeSet[i] = new ProxyNode(source.ProxyNodeSet[i]);
            }
        }
        if (source.ProxyAddressSet != null) {
            this.ProxyAddressSet = new ProxyAddress[source.ProxyAddressSet.length];
            for (int i = 0; i < source.ProxyAddressSet.length; i++) {
                this.ProxyAddressSet[i] = new ProxyAddress(source.ProxyAddressSet[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ProxyVersion", this.ProxyVersion);
        this.setParamSimple(map, prefix + "ConnectionPoolLimit", this.ConnectionPoolLimit);
        this.setParamArrayObj(map, prefix + "ProxyNodeSet.", this.ProxyNodeSet);
        this.setParamArrayObj(map, prefix + "ProxyAddressSet.", this.ProxyAddressSet);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

