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

public class GetUpgradeInstanceProgressResponse extends AbstractModel{

    /**
    * 升级节点总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 已升级节点总数
    */
    @SerializedName("Done")
    @Expose
    private Long Done;

    /**
    * 升级任务生命周期
process 运行中
paused 已停止
pauing 正在停止
done  已完成
timeout 已超时
aborted 已取消
    */
    @SerializedName("LifeState")
    @Expose
    private String LifeState;

    /**
    * 各节点升级进度详情
    */
    @SerializedName("Instances")
    @Expose
    private InstanceUpgradeProgressItem [] Instances;

    /**
    * 集群当前状态
    */
    @SerializedName("ClusterStatus")
    @Expose
    private InstanceUpgradeClusterStatus ClusterStatus;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 升级节点总数 
     * @return Total 升级节点总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 升级节点总数
     * @param Total 升级节点总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 已升级节点总数 
     * @return Done 已升级节点总数
     */
    public Long getDone() {
        return this.Done;
    }

    /**
     * Set 已升级节点总数
     * @param Done 已升级节点总数
     */
    public void setDone(Long Done) {
        this.Done = Done;
    }

    /**
     * Get 升级任务生命周期
process 运行中
paused 已停止
pauing 正在停止
done  已完成
timeout 已超时
aborted 已取消 
     * @return LifeState 升级任务生命周期
process 运行中
paused 已停止
pauing 正在停止
done  已完成
timeout 已超时
aborted 已取消
     */
    public String getLifeState() {
        return this.LifeState;
    }

    /**
     * Set 升级任务生命周期
process 运行中
paused 已停止
pauing 正在停止
done  已完成
timeout 已超时
aborted 已取消
     * @param LifeState 升级任务生命周期
process 运行中
paused 已停止
pauing 正在停止
done  已完成
timeout 已超时
aborted 已取消
     */
    public void setLifeState(String LifeState) {
        this.LifeState = LifeState;
    }

    /**
     * Get 各节点升级进度详情 
     * @return Instances 各节点升级进度详情
     */
    public InstanceUpgradeProgressItem [] getInstances() {
        return this.Instances;
    }

    /**
     * Set 各节点升级进度详情
     * @param Instances 各节点升级进度详情
     */
    public void setInstances(InstanceUpgradeProgressItem [] Instances) {
        this.Instances = Instances;
    }

    /**
     * Get 集群当前状态 
     * @return ClusterStatus 集群当前状态
     */
    public InstanceUpgradeClusterStatus getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * Set 集群当前状态
     * @param ClusterStatus 集群当前状态
     */
    public void setClusterStatus(InstanceUpgradeClusterStatus ClusterStatus) {
        this.ClusterStatus = ClusterStatus;
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

    public GetUpgradeInstanceProgressResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetUpgradeInstanceProgressResponse(GetUpgradeInstanceProgressResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Done != null) {
            this.Done = new Long(source.Done);
        }
        if (source.LifeState != null) {
            this.LifeState = new String(source.LifeState);
        }
        if (source.Instances != null) {
            this.Instances = new InstanceUpgradeProgressItem[source.Instances.length];
            for (int i = 0; i < source.Instances.length; i++) {
                this.Instances[i] = new InstanceUpgradeProgressItem(source.Instances[i]);
            }
        }
        if (source.ClusterStatus != null) {
            this.ClusterStatus = new InstanceUpgradeClusterStatus(source.ClusterStatus);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Done", this.Done);
        this.setParamSimple(map, prefix + "LifeState", this.LifeState);
        this.setParamArrayObj(map, prefix + "Instances.", this.Instances);
        this.setParamObj(map, prefix + "ClusterStatus.", this.ClusterStatus);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

