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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBaseOverviewResponse extends AbstractModel{

    /**
    * 模块数量，单位：个
    */
    @SerializedName("ModuleNum")
    @Expose
    private Long ModuleNum;

    /**
    * 节点数量，单位：个
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * cpu核数，单位：个
    */
    @SerializedName("VcpuNum")
    @Expose
    private Long VcpuNum;

    /**
    * 内存大小，单位：G
    */
    @SerializedName("MemoryNum")
    @Expose
    private Long MemoryNum;

    /**
    * 硬盘大小，单位：G
    */
    @SerializedName("StorageNum")
    @Expose
    private Long StorageNum;

    /**
    * 昨日网络峰值,单位：M
    */
    @SerializedName("NetworkNum")
    @Expose
    private Long NetworkNum;

    /**
    * 实例数量，单位：台
    */
    @SerializedName("InstanceNum")
    @Expose
    private Long InstanceNum;

    /**
    * 运行中数量，单位：台
    */
    @SerializedName("RunningNum")
    @Expose
    private Long RunningNum;

    /**
    * 安全隔离数量，单位：台
    */
    @SerializedName("IsolationNum")
    @Expose
    private Long IsolationNum;

    /**
    * 过期实例数量，单位：台
    */
    @SerializedName("ExpiredNum")
    @Expose
    private Long ExpiredNum;

    /**
    * 即将过期实例数量，单位：台
    */
    @SerializedName("WillExpireNum")
    @Expose
    private Long WillExpireNum;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 模块数量，单位：个 
     * @return ModuleNum 模块数量，单位：个
     */
    public Long getModuleNum() {
        return this.ModuleNum;
    }

    /**
     * Set 模块数量，单位：个
     * @param ModuleNum 模块数量，单位：个
     */
    public void setModuleNum(Long ModuleNum) {
        this.ModuleNum = ModuleNum;
    }

    /**
     * Get 节点数量，单位：个 
     * @return NodeNum 节点数量，单位：个
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set 节点数量，单位：个
     * @param NodeNum 节点数量，单位：个
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get cpu核数，单位：个 
     * @return VcpuNum cpu核数，单位：个
     */
    public Long getVcpuNum() {
        return this.VcpuNum;
    }

    /**
     * Set cpu核数，单位：个
     * @param VcpuNum cpu核数，单位：个
     */
    public void setVcpuNum(Long VcpuNum) {
        this.VcpuNum = VcpuNum;
    }

    /**
     * Get 内存大小，单位：G 
     * @return MemoryNum 内存大小，单位：G
     */
    public Long getMemoryNum() {
        return this.MemoryNum;
    }

    /**
     * Set 内存大小，单位：G
     * @param MemoryNum 内存大小，单位：G
     */
    public void setMemoryNum(Long MemoryNum) {
        this.MemoryNum = MemoryNum;
    }

    /**
     * Get 硬盘大小，单位：G 
     * @return StorageNum 硬盘大小，单位：G
     */
    public Long getStorageNum() {
        return this.StorageNum;
    }

    /**
     * Set 硬盘大小，单位：G
     * @param StorageNum 硬盘大小，单位：G
     */
    public void setStorageNum(Long StorageNum) {
        this.StorageNum = StorageNum;
    }

    /**
     * Get 昨日网络峰值,单位：M 
     * @return NetworkNum 昨日网络峰值,单位：M
     */
    public Long getNetworkNum() {
        return this.NetworkNum;
    }

    /**
     * Set 昨日网络峰值,单位：M
     * @param NetworkNum 昨日网络峰值,单位：M
     */
    public void setNetworkNum(Long NetworkNum) {
        this.NetworkNum = NetworkNum;
    }

    /**
     * Get 实例数量，单位：台 
     * @return InstanceNum 实例数量，单位：台
     */
    public Long getInstanceNum() {
        return this.InstanceNum;
    }

    /**
     * Set 实例数量，单位：台
     * @param InstanceNum 实例数量，单位：台
     */
    public void setInstanceNum(Long InstanceNum) {
        this.InstanceNum = InstanceNum;
    }

    /**
     * Get 运行中数量，单位：台 
     * @return RunningNum 运行中数量，单位：台
     */
    public Long getRunningNum() {
        return this.RunningNum;
    }

    /**
     * Set 运行中数量，单位：台
     * @param RunningNum 运行中数量，单位：台
     */
    public void setRunningNum(Long RunningNum) {
        this.RunningNum = RunningNum;
    }

    /**
     * Get 安全隔离数量，单位：台 
     * @return IsolationNum 安全隔离数量，单位：台
     */
    public Long getIsolationNum() {
        return this.IsolationNum;
    }

    /**
     * Set 安全隔离数量，单位：台
     * @param IsolationNum 安全隔离数量，单位：台
     */
    public void setIsolationNum(Long IsolationNum) {
        this.IsolationNum = IsolationNum;
    }

    /**
     * Get 过期实例数量，单位：台 
     * @return ExpiredNum 过期实例数量，单位：台
     */
    public Long getExpiredNum() {
        return this.ExpiredNum;
    }

    /**
     * Set 过期实例数量，单位：台
     * @param ExpiredNum 过期实例数量，单位：台
     */
    public void setExpiredNum(Long ExpiredNum) {
        this.ExpiredNum = ExpiredNum;
    }

    /**
     * Get 即将过期实例数量，单位：台 
     * @return WillExpireNum 即将过期实例数量，单位：台
     */
    public Long getWillExpireNum() {
        return this.WillExpireNum;
    }

    /**
     * Set 即将过期实例数量，单位：台
     * @param WillExpireNum 即将过期实例数量，单位：台
     */
    public void setWillExpireNum(Long WillExpireNum) {
        this.WillExpireNum = WillExpireNum;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModuleNum", this.ModuleNum);
        this.setParamSimple(map, prefix + "NodeNum", this.NodeNum);
        this.setParamSimple(map, prefix + "VcpuNum", this.VcpuNum);
        this.setParamSimple(map, prefix + "MemoryNum", this.MemoryNum);
        this.setParamSimple(map, prefix + "StorageNum", this.StorageNum);
        this.setParamSimple(map, prefix + "NetworkNum", this.NetworkNum);
        this.setParamSimple(map, prefix + "InstanceNum", this.InstanceNum);
        this.setParamSimple(map, prefix + "RunningNum", this.RunningNum);
        this.setParamSimple(map, prefix + "IsolationNum", this.IsolationNum);
        this.setParamSimple(map, prefix + "ExpiredNum", this.ExpiredNum);
        this.setParamSimple(map, prefix + "WillExpireNum", this.WillExpireNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

