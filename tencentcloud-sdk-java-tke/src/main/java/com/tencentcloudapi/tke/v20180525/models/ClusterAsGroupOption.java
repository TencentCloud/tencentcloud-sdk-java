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

public class ClusterAsGroupOption extends AbstractModel{

    /**
    * 是否开启缩容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsScaleDownEnabled")
    @Expose
    private Boolean IsScaleDownEnabled;

    /**
    * 多伸缩组情况下扩容选择算法(random 随机选择，most-pods 最多类型的Pod least-waste 最少的资源浪费，默认为random)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Expander")
    @Expose
    private String Expander;

    /**
    * 最大并发缩容数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxEmptyBulkDelete")
    @Expose
    private Long MaxEmptyBulkDelete;

    /**
    * 集群扩容后多少分钟开始判断缩容（默认为10分钟）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScaleDownDelay")
    @Expose
    private Long ScaleDownDelay;

    /**
    * 节点连续空闲多少分钟后被缩容（默认为 10分钟）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScaleDownUnneededTime")
    @Expose
    private Long ScaleDownUnneededTime;

    /**
    * 节点资源使用量低于多少(百分比)时认为空闲(默认: 50(百分比))
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScaleDownUtilizationThreshold")
    @Expose
    private Long ScaleDownUtilizationThreshold;

    /**
    * 含有本地存储Pod的节点是否不缩容(默认： FALSE)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SkipNodesWithLocalStorage")
    @Expose
    private Boolean SkipNodesWithLocalStorage;

    /**
    * 含有kube-system namespace下非DaemonSet管理的Pod的节点是否不缩容 (默认： FALSE)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SkipNodesWithSystemPods")
    @Expose
    private Boolean SkipNodesWithSystemPods;

    /**
    * 计算资源使用量时是否默认忽略DaemonSet的实例(默认值: False，不忽略)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IgnoreDaemonSetsUtilization")
    @Expose
    private Boolean IgnoreDaemonSetsUtilization;

    /**
    * CA做健康性判断的个数，默认3，即超过OkTotalUnreadyCount个数后，CA会进行健康性判断。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OkTotalUnreadyCount")
    @Expose
    private Long OkTotalUnreadyCount;

    /**
    * 未就绪节点的最大百分比，此后CA会停止操作
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxTotalUnreadyPercentage")
    @Expose
    private Long MaxTotalUnreadyPercentage;

    /**
    * 表示未准备就绪的节点在有资格进行缩减之前应该停留多长时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScaleDownUnreadyTime")
    @Expose
    private Long ScaleDownUnreadyTime;

    /**
    * CA删除未在Kubernetes中注册的节点之前等待的时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnregisteredNodeRemovalTime")
    @Expose
    private Long UnregisteredNodeRemovalTime;

    /**
     * Get 是否开启缩容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsScaleDownEnabled 是否开启缩容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsScaleDownEnabled() {
        return this.IsScaleDownEnabled;
    }

    /**
     * Set 是否开启缩容
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsScaleDownEnabled 是否开启缩容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsScaleDownEnabled(Boolean IsScaleDownEnabled) {
        this.IsScaleDownEnabled = IsScaleDownEnabled;
    }

    /**
     * Get 多伸缩组情况下扩容选择算法(random 随机选择，most-pods 最多类型的Pod least-waste 最少的资源浪费，默认为random)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Expander 多伸缩组情况下扩容选择算法(random 随机选择，most-pods 最多类型的Pod least-waste 最少的资源浪费，默认为random)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpander() {
        return this.Expander;
    }

    /**
     * Set 多伸缩组情况下扩容选择算法(random 随机选择，most-pods 最多类型的Pod least-waste 最少的资源浪费，默认为random)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Expander 多伸缩组情况下扩容选择算法(random 随机选择，most-pods 最多类型的Pod least-waste 最少的资源浪费，默认为random)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpander(String Expander) {
        this.Expander = Expander;
    }

    /**
     * Get 最大并发缩容数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxEmptyBulkDelete 最大并发缩容数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxEmptyBulkDelete() {
        return this.MaxEmptyBulkDelete;
    }

    /**
     * Set 最大并发缩容数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxEmptyBulkDelete 最大并发缩容数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxEmptyBulkDelete(Long MaxEmptyBulkDelete) {
        this.MaxEmptyBulkDelete = MaxEmptyBulkDelete;
    }

    /**
     * Get 集群扩容后多少分钟开始判断缩容（默认为10分钟）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScaleDownDelay 集群扩容后多少分钟开始判断缩容（默认为10分钟）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScaleDownDelay() {
        return this.ScaleDownDelay;
    }

    /**
     * Set 集群扩容后多少分钟开始判断缩容（默认为10分钟）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScaleDownDelay 集群扩容后多少分钟开始判断缩容（默认为10分钟）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScaleDownDelay(Long ScaleDownDelay) {
        this.ScaleDownDelay = ScaleDownDelay;
    }

    /**
     * Get 节点连续空闲多少分钟后被缩容（默认为 10分钟）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScaleDownUnneededTime 节点连续空闲多少分钟后被缩容（默认为 10分钟）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScaleDownUnneededTime() {
        return this.ScaleDownUnneededTime;
    }

    /**
     * Set 节点连续空闲多少分钟后被缩容（默认为 10分钟）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScaleDownUnneededTime 节点连续空闲多少分钟后被缩容（默认为 10分钟）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScaleDownUnneededTime(Long ScaleDownUnneededTime) {
        this.ScaleDownUnneededTime = ScaleDownUnneededTime;
    }

    /**
     * Get 节点资源使用量低于多少(百分比)时认为空闲(默认: 50(百分比))
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScaleDownUtilizationThreshold 节点资源使用量低于多少(百分比)时认为空闲(默认: 50(百分比))
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScaleDownUtilizationThreshold() {
        return this.ScaleDownUtilizationThreshold;
    }

    /**
     * Set 节点资源使用量低于多少(百分比)时认为空闲(默认: 50(百分比))
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScaleDownUtilizationThreshold 节点资源使用量低于多少(百分比)时认为空闲(默认: 50(百分比))
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScaleDownUtilizationThreshold(Long ScaleDownUtilizationThreshold) {
        this.ScaleDownUtilizationThreshold = ScaleDownUtilizationThreshold;
    }

    /**
     * Get 含有本地存储Pod的节点是否不缩容(默认： FALSE)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SkipNodesWithLocalStorage 含有本地存储Pod的节点是否不缩容(默认： FALSE)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSkipNodesWithLocalStorage() {
        return this.SkipNodesWithLocalStorage;
    }

    /**
     * Set 含有本地存储Pod的节点是否不缩容(默认： FALSE)
注意：此字段可能返回 null，表示取不到有效值。
     * @param SkipNodesWithLocalStorage 含有本地存储Pod的节点是否不缩容(默认： FALSE)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSkipNodesWithLocalStorage(Boolean SkipNodesWithLocalStorage) {
        this.SkipNodesWithLocalStorage = SkipNodesWithLocalStorage;
    }

    /**
     * Get 含有kube-system namespace下非DaemonSet管理的Pod的节点是否不缩容 (默认： FALSE)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SkipNodesWithSystemPods 含有kube-system namespace下非DaemonSet管理的Pod的节点是否不缩容 (默认： FALSE)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSkipNodesWithSystemPods() {
        return this.SkipNodesWithSystemPods;
    }

    /**
     * Set 含有kube-system namespace下非DaemonSet管理的Pod的节点是否不缩容 (默认： FALSE)
注意：此字段可能返回 null，表示取不到有效值。
     * @param SkipNodesWithSystemPods 含有kube-system namespace下非DaemonSet管理的Pod的节点是否不缩容 (默认： FALSE)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSkipNodesWithSystemPods(Boolean SkipNodesWithSystemPods) {
        this.SkipNodesWithSystemPods = SkipNodesWithSystemPods;
    }

    /**
     * Get 计算资源使用量时是否默认忽略DaemonSet的实例(默认值: False，不忽略)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IgnoreDaemonSetsUtilization 计算资源使用量时是否默认忽略DaemonSet的实例(默认值: False，不忽略)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIgnoreDaemonSetsUtilization() {
        return this.IgnoreDaemonSetsUtilization;
    }

    /**
     * Set 计算资源使用量时是否默认忽略DaemonSet的实例(默认值: False，不忽略)
注意：此字段可能返回 null，表示取不到有效值。
     * @param IgnoreDaemonSetsUtilization 计算资源使用量时是否默认忽略DaemonSet的实例(默认值: False，不忽略)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIgnoreDaemonSetsUtilization(Boolean IgnoreDaemonSetsUtilization) {
        this.IgnoreDaemonSetsUtilization = IgnoreDaemonSetsUtilization;
    }

    /**
     * Get CA做健康性判断的个数，默认3，即超过OkTotalUnreadyCount个数后，CA会进行健康性判断。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OkTotalUnreadyCount CA做健康性判断的个数，默认3，即超过OkTotalUnreadyCount个数后，CA会进行健康性判断。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOkTotalUnreadyCount() {
        return this.OkTotalUnreadyCount;
    }

    /**
     * Set CA做健康性判断的个数，默认3，即超过OkTotalUnreadyCount个数后，CA会进行健康性判断。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OkTotalUnreadyCount CA做健康性判断的个数，默认3，即超过OkTotalUnreadyCount个数后，CA会进行健康性判断。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOkTotalUnreadyCount(Long OkTotalUnreadyCount) {
        this.OkTotalUnreadyCount = OkTotalUnreadyCount;
    }

    /**
     * Get 未就绪节点的最大百分比，此后CA会停止操作
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxTotalUnreadyPercentage 未就绪节点的最大百分比，此后CA会停止操作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxTotalUnreadyPercentage() {
        return this.MaxTotalUnreadyPercentage;
    }

    /**
     * Set 未就绪节点的最大百分比，此后CA会停止操作
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxTotalUnreadyPercentage 未就绪节点的最大百分比，此后CA会停止操作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxTotalUnreadyPercentage(Long MaxTotalUnreadyPercentage) {
        this.MaxTotalUnreadyPercentage = MaxTotalUnreadyPercentage;
    }

    /**
     * Get 表示未准备就绪的节点在有资格进行缩减之前应该停留多长时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScaleDownUnreadyTime 表示未准备就绪的节点在有资格进行缩减之前应该停留多长时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScaleDownUnreadyTime() {
        return this.ScaleDownUnreadyTime;
    }

    /**
     * Set 表示未准备就绪的节点在有资格进行缩减之前应该停留多长时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScaleDownUnreadyTime 表示未准备就绪的节点在有资格进行缩减之前应该停留多长时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScaleDownUnreadyTime(Long ScaleDownUnreadyTime) {
        this.ScaleDownUnreadyTime = ScaleDownUnreadyTime;
    }

    /**
     * Get CA删除未在Kubernetes中注册的节点之前等待的时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnregisteredNodeRemovalTime CA删除未在Kubernetes中注册的节点之前等待的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUnregisteredNodeRemovalTime() {
        return this.UnregisteredNodeRemovalTime;
    }

    /**
     * Set CA删除未在Kubernetes中注册的节点之前等待的时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnregisteredNodeRemovalTime CA删除未在Kubernetes中注册的节点之前等待的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnregisteredNodeRemovalTime(Long UnregisteredNodeRemovalTime) {
        this.UnregisteredNodeRemovalTime = UnregisteredNodeRemovalTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsScaleDownEnabled", this.IsScaleDownEnabled);
        this.setParamSimple(map, prefix + "Expander", this.Expander);
        this.setParamSimple(map, prefix + "MaxEmptyBulkDelete", this.MaxEmptyBulkDelete);
        this.setParamSimple(map, prefix + "ScaleDownDelay", this.ScaleDownDelay);
        this.setParamSimple(map, prefix + "ScaleDownUnneededTime", this.ScaleDownUnneededTime);
        this.setParamSimple(map, prefix + "ScaleDownUtilizationThreshold", this.ScaleDownUtilizationThreshold);
        this.setParamSimple(map, prefix + "SkipNodesWithLocalStorage", this.SkipNodesWithLocalStorage);
        this.setParamSimple(map, prefix + "SkipNodesWithSystemPods", this.SkipNodesWithSystemPods);
        this.setParamSimple(map, prefix + "IgnoreDaemonSetsUtilization", this.IgnoreDaemonSetsUtilization);
        this.setParamSimple(map, prefix + "OkTotalUnreadyCount", this.OkTotalUnreadyCount);
        this.setParamSimple(map, prefix + "MaxTotalUnreadyPercentage", this.MaxTotalUnreadyPercentage);
        this.setParamSimple(map, prefix + "ScaleDownUnreadyTime", this.ScaleDownUnreadyTime);
        this.setParamSimple(map, prefix + "UnregisteredNodeRemovalTime", this.UnregisteredNodeRemovalTime);

    }
}

