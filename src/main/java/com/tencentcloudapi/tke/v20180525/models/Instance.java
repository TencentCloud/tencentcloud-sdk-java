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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Instance  extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 节点角色, MASTER, WORKER, ETCD, MASTER_ETCD,ALL, 默认为WORKER
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
    * 实例异常(或者处于初始化中)的原因
    */
    @SerializedName("FailedReason")
    @Expose
    private String FailedReason;

    /**
    * 实例的状态（running 运行中，initializing 初始化中，failed 异常）
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
     * 获取实例ID
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取节点角色, MASTER, WORKER, ETCD, MASTER_ETCD,ALL, 默认为WORKER
     * @return InstanceRole 节点角色, MASTER, WORKER, ETCD, MASTER_ETCD,ALL, 默认为WORKER
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * 设置节点角色, MASTER, WORKER, ETCD, MASTER_ETCD,ALL, 默认为WORKER
     * @param InstanceRole 节点角色, MASTER, WORKER, ETCD, MASTER_ETCD,ALL, 默认为WORKER
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
    }

    /**
     * 获取实例异常(或者处于初始化中)的原因
     * @return FailedReason 实例异常(或者处于初始化中)的原因
     */
    public String getFailedReason() {
        return this.FailedReason;
    }

    /**
     * 设置实例异常(或者处于初始化中)的原因
     * @param FailedReason 实例异常(或者处于初始化中)的原因
     */
    public void setFailedReason(String FailedReason) {
        this.FailedReason = FailedReason;
    }

    /**
     * 获取实例的状态（running 运行中，initializing 初始化中，failed 异常）
     * @return InstanceState 实例的状态（running 运行中，initializing 初始化中，failed 异常）
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * 设置实例的状态（running 运行中，initializing 初始化中，failed 异常）
     * @param InstanceState 实例的状态（running 运行中，initializing 初始化中，failed 异常）
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceRole", this.InstanceRole);
        this.setParamSimple(map, prefix + "FailedReason", this.FailedReason);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);

    }
}

