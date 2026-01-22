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
package com.tencentcloudapi.thpc.v20230321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueueConfig extends AbstractModel {

    /**
    * <p>队列名称。</p>
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * <p>队列中弹性节点数量最小值。默认值：0。取值范围：0～200。</p>
    */
    @SerializedName("MinSize")
    @Expose
    private Long MinSize;

    /**
    * <p>队列中弹性节点数量最大值。默认值：10。取值范围：0～200。</p>
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
    * <p>是否开启自动扩容。</p>
    */
    @SerializedName("EnableAutoExpansion")
    @Expose
    private Boolean EnableAutoExpansion;

    /**
    * <p>是否开启自动缩容。</p>
    */
    @SerializedName("EnableAutoShrink")
    @Expose
    private Boolean EnableAutoShrink;

    /**
    * <p>指定有效的<a href="https://cloud.tencent.com/document/product/213/4940">镜像</a>ID，格式形如<code>img-xxx</code>。目前仅支持公有镜和特定自定义镜像。</p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>节点系统盘配置信息。若不指定该参数，则按照系统默认值进行分配。</p>
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk SystemDisk;

    /**
    * <p>节点数据盘配置信息。若不指定该参数，则默认不购买数据盘。支持购买的时候指定21块数据盘，其中最多包含1块LOCAL_BASIC数据盘或者LOCAL_SSD数据盘，最多包含20块CLOUD_BASIC数据盘、CLOUD_PREMIUM数据盘或者CLOUD_SSD数据盘。</p>
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

    /**
    * <p>公网带宽相关信息设置。若不指定该参数，则默认公网带宽为0Mbps。</p>
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * <p>扩容节点配置信息。</p>
    */
    @SerializedName("ExpansionNodeConfigs")
    @Expose
    private ExpansionNodeConfig [] ExpansionNodeConfigs;

    /**
    * <p>队列中期望的空闲节点数量（包含弹性节点和静态节点）。默认值：0。队列中，处于空闲状态的节点小于此值，集群会扩容弹性节点；处于空闲状态的节点大于此值，集群会缩容弹性节点。</p>
    */
    @SerializedName("DesiredIdleNodeCapacity")
    @Expose
    private Long DesiredIdleNodeCapacity;

    /**
    * <p>队列中期望的总节点数。</p>
    */
    @SerializedName("DesiredNodeCount")
    @Expose
    private Long DesiredNodeCount;

    /**
    * <p>扩容比例。默认值：100。取值范围：1～100。<br>如果扩容比例为50，那么每轮只会扩容当前作业负载所需的50%数量的节点。</p>
    */
    @SerializedName("ScaleOutRatio")
    @Expose
    private Long ScaleOutRatio;

    /**
    * <p>比例扩容阈值。默认值：0。取值范围：0～200。<br>当作业负载需要扩容节点数量大于此值，当前扩容轮次按照ScaleOutRatio配置的比例进行扩容。当作业负载需要扩容节点数量小于此值，当前扩容轮次扩容当前作业负载所需数量的节点。<br>此参数配合ScaleOutRatio参数进行使用，用于比例扩容场景下，在作业负载所需节点数量较小时，加快收敛速度。</p>
    */
    @SerializedName("ScaleOutNodeThreshold")
    @Expose
    private Long ScaleOutNodeThreshold;

    /**
    * <p>每轮扩容最大节点个数。默认值：100。取值范围：1～100。</p>
    */
    @SerializedName("MaxNodesPerCycle")
    @Expose
    private Long MaxNodesPerCycle;

    /**
    * <p>扩容过程中，作业的内存在匹配实例机型时增大比例（不会影响作业提交的内存大小，只影响匹配计算过程）。<br><br>针对场景：由于实例机型的总内存会大于实例内部的可用内存，16GB内存规格的实例，实例操作系统内的可用内存只有约14.9GB内存。假设此时提交一个需要15GB内存的作业，</p><ul><li>当ScaleUpMemRatio=0时，会匹配到16GB内存规格的实例,但是由于操作系统内的可用内存为14.9GB小于作业所需的15GB，扩容出来的实例作业无法运行起来。</li><li>当ScaleUpMemRatio=10时，匹配实例规格会按照15*(1+10%)=16.5GB来进行实例规格匹配，则不会匹配到16GB的实例，而是更大内存规格的实例来保证作业能够被运行起来。</li></ul>
    */
    @SerializedName("ScaleUpMemRatio")
    @Expose
    private Long ScaleUpMemRatio;

    /**
    * <p>增强服务。通过该参数可以指定是否开启云安全、腾讯云可观测平台等服务。若不指定该参数，则默认开启腾讯云可观测平台、云安全服务、自动化助手服务。</p>
    */
    @SerializedName("EnhancedService")
    @Expose
    private EnhancedService EnhancedService;

    /**
    * <p>扩容实例模板，可以在cvm侧进行设置</p>
    */
    @SerializedName("LaunchTemplateIds")
    @Expose
    private String [] LaunchTemplateIds;

    /**
     * Get <p>队列名称。</p> 
     * @return QueueName <p>队列名称。</p>
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set <p>队列名称。</p>
     * @param QueueName <p>队列名称。</p>
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get <p>队列中弹性节点数量最小值。默认值：0。取值范围：0～200。</p> 
     * @return MinSize <p>队列中弹性节点数量最小值。默认值：0。取值范围：0～200。</p>
     */
    public Long getMinSize() {
        return this.MinSize;
    }

    /**
     * Set <p>队列中弹性节点数量最小值。默认值：0。取值范围：0～200。</p>
     * @param MinSize <p>队列中弹性节点数量最小值。默认值：0。取值范围：0～200。</p>
     */
    public void setMinSize(Long MinSize) {
        this.MinSize = MinSize;
    }

    /**
     * Get <p>队列中弹性节点数量最大值。默认值：10。取值范围：0～200。</p> 
     * @return MaxSize <p>队列中弹性节点数量最大值。默认值：10。取值范围：0～200。</p>
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set <p>队列中弹性节点数量最大值。默认值：10。取值范围：0～200。</p>
     * @param MaxSize <p>队列中弹性节点数量最大值。默认值：10。取值范围：0～200。</p>
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Get <p>是否开启自动扩容。</p> 
     * @return EnableAutoExpansion <p>是否开启自动扩容。</p>
     */
    public Boolean getEnableAutoExpansion() {
        return this.EnableAutoExpansion;
    }

    /**
     * Set <p>是否开启自动扩容。</p>
     * @param EnableAutoExpansion <p>是否开启自动扩容。</p>
     */
    public void setEnableAutoExpansion(Boolean EnableAutoExpansion) {
        this.EnableAutoExpansion = EnableAutoExpansion;
    }

    /**
     * Get <p>是否开启自动缩容。</p> 
     * @return EnableAutoShrink <p>是否开启自动缩容。</p>
     */
    public Boolean getEnableAutoShrink() {
        return this.EnableAutoShrink;
    }

    /**
     * Set <p>是否开启自动缩容。</p>
     * @param EnableAutoShrink <p>是否开启自动缩容。</p>
     */
    public void setEnableAutoShrink(Boolean EnableAutoShrink) {
        this.EnableAutoShrink = EnableAutoShrink;
    }

    /**
     * Get <p>指定有效的<a href="https://cloud.tencent.com/document/product/213/4940">镜像</a>ID，格式形如<code>img-xxx</code>。目前仅支持公有镜和特定自定义镜像。</p> 
     * @return ImageId <p>指定有效的<a href="https://cloud.tencent.com/document/product/213/4940">镜像</a>ID，格式形如<code>img-xxx</code>。目前仅支持公有镜和特定自定义镜像。</p>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>指定有效的<a href="https://cloud.tencent.com/document/product/213/4940">镜像</a>ID，格式形如<code>img-xxx</code>。目前仅支持公有镜和特定自定义镜像。</p>
     * @param ImageId <p>指定有效的<a href="https://cloud.tencent.com/document/product/213/4940">镜像</a>ID，格式形如<code>img-xxx</code>。目前仅支持公有镜和特定自定义镜像。</p>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>节点系统盘配置信息。若不指定该参数，则按照系统默认值进行分配。</p> 
     * @return SystemDisk <p>节点系统盘配置信息。若不指定该参数，则按照系统默认值进行分配。</p>
     */
    public SystemDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set <p>节点系统盘配置信息。若不指定该参数，则按照系统默认值进行分配。</p>
     * @param SystemDisk <p>节点系统盘配置信息。若不指定该参数，则按照系统默认值进行分配。</p>
     */
    public void setSystemDisk(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get <p>节点数据盘配置信息。若不指定该参数，则默认不购买数据盘。支持购买的时候指定21块数据盘，其中最多包含1块LOCAL_BASIC数据盘或者LOCAL_SSD数据盘，最多包含20块CLOUD_BASIC数据盘、CLOUD_PREMIUM数据盘或者CLOUD_SSD数据盘。</p> 
     * @return DataDisks <p>节点数据盘配置信息。若不指定该参数，则默认不购买数据盘。支持购买的时候指定21块数据盘，其中最多包含1块LOCAL_BASIC数据盘或者LOCAL_SSD数据盘，最多包含20块CLOUD_BASIC数据盘、CLOUD_PREMIUM数据盘或者CLOUD_SSD数据盘。</p>
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set <p>节点数据盘配置信息。若不指定该参数，则默认不购买数据盘。支持购买的时候指定21块数据盘，其中最多包含1块LOCAL_BASIC数据盘或者LOCAL_SSD数据盘，最多包含20块CLOUD_BASIC数据盘、CLOUD_PREMIUM数据盘或者CLOUD_SSD数据盘。</p>
     * @param DataDisks <p>节点数据盘配置信息。若不指定该参数，则默认不购买数据盘。支持购买的时候指定21块数据盘，其中最多包含1块LOCAL_BASIC数据盘或者LOCAL_SSD数据盘，最多包含20块CLOUD_BASIC数据盘、CLOUD_PREMIUM数据盘或者CLOUD_SSD数据盘。</p>
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * Get <p>公网带宽相关信息设置。若不指定该参数，则默认公网带宽为0Mbps。</p> 
     * @return InternetAccessible <p>公网带宽相关信息设置。若不指定该参数，则默认公网带宽为0Mbps。</p>
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set <p>公网带宽相关信息设置。若不指定该参数，则默认公网带宽为0Mbps。</p>
     * @param InternetAccessible <p>公网带宽相关信息设置。若不指定该参数，则默认公网带宽为0Mbps。</p>
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Get <p>扩容节点配置信息。</p> 
     * @return ExpansionNodeConfigs <p>扩容节点配置信息。</p>
     */
    public ExpansionNodeConfig [] getExpansionNodeConfigs() {
        return this.ExpansionNodeConfigs;
    }

    /**
     * Set <p>扩容节点配置信息。</p>
     * @param ExpansionNodeConfigs <p>扩容节点配置信息。</p>
     */
    public void setExpansionNodeConfigs(ExpansionNodeConfig [] ExpansionNodeConfigs) {
        this.ExpansionNodeConfigs = ExpansionNodeConfigs;
    }

    /**
     * Get <p>队列中期望的空闲节点数量（包含弹性节点和静态节点）。默认值：0。队列中，处于空闲状态的节点小于此值，集群会扩容弹性节点；处于空闲状态的节点大于此值，集群会缩容弹性节点。</p> 
     * @return DesiredIdleNodeCapacity <p>队列中期望的空闲节点数量（包含弹性节点和静态节点）。默认值：0。队列中，处于空闲状态的节点小于此值，集群会扩容弹性节点；处于空闲状态的节点大于此值，集群会缩容弹性节点。</p>
     */
    public Long getDesiredIdleNodeCapacity() {
        return this.DesiredIdleNodeCapacity;
    }

    /**
     * Set <p>队列中期望的空闲节点数量（包含弹性节点和静态节点）。默认值：0。队列中，处于空闲状态的节点小于此值，集群会扩容弹性节点；处于空闲状态的节点大于此值，集群会缩容弹性节点。</p>
     * @param DesiredIdleNodeCapacity <p>队列中期望的空闲节点数量（包含弹性节点和静态节点）。默认值：0。队列中，处于空闲状态的节点小于此值，集群会扩容弹性节点；处于空闲状态的节点大于此值，集群会缩容弹性节点。</p>
     */
    public void setDesiredIdleNodeCapacity(Long DesiredIdleNodeCapacity) {
        this.DesiredIdleNodeCapacity = DesiredIdleNodeCapacity;
    }

    /**
     * Get <p>队列中期望的总节点数。</p> 
     * @return DesiredNodeCount <p>队列中期望的总节点数。</p>
     */
    public Long getDesiredNodeCount() {
        return this.DesiredNodeCount;
    }

    /**
     * Set <p>队列中期望的总节点数。</p>
     * @param DesiredNodeCount <p>队列中期望的总节点数。</p>
     */
    public void setDesiredNodeCount(Long DesiredNodeCount) {
        this.DesiredNodeCount = DesiredNodeCount;
    }

    /**
     * Get <p>扩容比例。默认值：100。取值范围：1～100。<br>如果扩容比例为50，那么每轮只会扩容当前作业负载所需的50%数量的节点。</p> 
     * @return ScaleOutRatio <p>扩容比例。默认值：100。取值范围：1～100。<br>如果扩容比例为50，那么每轮只会扩容当前作业负载所需的50%数量的节点。</p>
     */
    public Long getScaleOutRatio() {
        return this.ScaleOutRatio;
    }

    /**
     * Set <p>扩容比例。默认值：100。取值范围：1～100。<br>如果扩容比例为50，那么每轮只会扩容当前作业负载所需的50%数量的节点。</p>
     * @param ScaleOutRatio <p>扩容比例。默认值：100。取值范围：1～100。<br>如果扩容比例为50，那么每轮只会扩容当前作业负载所需的50%数量的节点。</p>
     */
    public void setScaleOutRatio(Long ScaleOutRatio) {
        this.ScaleOutRatio = ScaleOutRatio;
    }

    /**
     * Get <p>比例扩容阈值。默认值：0。取值范围：0～200。<br>当作业负载需要扩容节点数量大于此值，当前扩容轮次按照ScaleOutRatio配置的比例进行扩容。当作业负载需要扩容节点数量小于此值，当前扩容轮次扩容当前作业负载所需数量的节点。<br>此参数配合ScaleOutRatio参数进行使用，用于比例扩容场景下，在作业负载所需节点数量较小时，加快收敛速度。</p> 
     * @return ScaleOutNodeThreshold <p>比例扩容阈值。默认值：0。取值范围：0～200。<br>当作业负载需要扩容节点数量大于此值，当前扩容轮次按照ScaleOutRatio配置的比例进行扩容。当作业负载需要扩容节点数量小于此值，当前扩容轮次扩容当前作业负载所需数量的节点。<br>此参数配合ScaleOutRatio参数进行使用，用于比例扩容场景下，在作业负载所需节点数量较小时，加快收敛速度。</p>
     */
    public Long getScaleOutNodeThreshold() {
        return this.ScaleOutNodeThreshold;
    }

    /**
     * Set <p>比例扩容阈值。默认值：0。取值范围：0～200。<br>当作业负载需要扩容节点数量大于此值，当前扩容轮次按照ScaleOutRatio配置的比例进行扩容。当作业负载需要扩容节点数量小于此值，当前扩容轮次扩容当前作业负载所需数量的节点。<br>此参数配合ScaleOutRatio参数进行使用，用于比例扩容场景下，在作业负载所需节点数量较小时，加快收敛速度。</p>
     * @param ScaleOutNodeThreshold <p>比例扩容阈值。默认值：0。取值范围：0～200。<br>当作业负载需要扩容节点数量大于此值，当前扩容轮次按照ScaleOutRatio配置的比例进行扩容。当作业负载需要扩容节点数量小于此值，当前扩容轮次扩容当前作业负载所需数量的节点。<br>此参数配合ScaleOutRatio参数进行使用，用于比例扩容场景下，在作业负载所需节点数量较小时，加快收敛速度。</p>
     */
    public void setScaleOutNodeThreshold(Long ScaleOutNodeThreshold) {
        this.ScaleOutNodeThreshold = ScaleOutNodeThreshold;
    }

    /**
     * Get <p>每轮扩容最大节点个数。默认值：100。取值范围：1～100。</p> 
     * @return MaxNodesPerCycle <p>每轮扩容最大节点个数。默认值：100。取值范围：1～100。</p>
     */
    public Long getMaxNodesPerCycle() {
        return this.MaxNodesPerCycle;
    }

    /**
     * Set <p>每轮扩容最大节点个数。默认值：100。取值范围：1～100。</p>
     * @param MaxNodesPerCycle <p>每轮扩容最大节点个数。默认值：100。取值范围：1～100。</p>
     */
    public void setMaxNodesPerCycle(Long MaxNodesPerCycle) {
        this.MaxNodesPerCycle = MaxNodesPerCycle;
    }

    /**
     * Get <p>扩容过程中，作业的内存在匹配实例机型时增大比例（不会影响作业提交的内存大小，只影响匹配计算过程）。<br><br>针对场景：由于实例机型的总内存会大于实例内部的可用内存，16GB内存规格的实例，实例操作系统内的可用内存只有约14.9GB内存。假设此时提交一个需要15GB内存的作业，</p><ul><li>当ScaleUpMemRatio=0时，会匹配到16GB内存规格的实例,但是由于操作系统内的可用内存为14.9GB小于作业所需的15GB，扩容出来的实例作业无法运行起来。</li><li>当ScaleUpMemRatio=10时，匹配实例规格会按照15*(1+10%)=16.5GB来进行实例规格匹配，则不会匹配到16GB的实例，而是更大内存规格的实例来保证作业能够被运行起来。</li></ul> 
     * @return ScaleUpMemRatio <p>扩容过程中，作业的内存在匹配实例机型时增大比例（不会影响作业提交的内存大小，只影响匹配计算过程）。<br><br>针对场景：由于实例机型的总内存会大于实例内部的可用内存，16GB内存规格的实例，实例操作系统内的可用内存只有约14.9GB内存。假设此时提交一个需要15GB内存的作业，</p><ul><li>当ScaleUpMemRatio=0时，会匹配到16GB内存规格的实例,但是由于操作系统内的可用内存为14.9GB小于作业所需的15GB，扩容出来的实例作业无法运行起来。</li><li>当ScaleUpMemRatio=10时，匹配实例规格会按照15*(1+10%)=16.5GB来进行实例规格匹配，则不会匹配到16GB的实例，而是更大内存规格的实例来保证作业能够被运行起来。</li></ul>
     */
    public Long getScaleUpMemRatio() {
        return this.ScaleUpMemRatio;
    }

    /**
     * Set <p>扩容过程中，作业的内存在匹配实例机型时增大比例（不会影响作业提交的内存大小，只影响匹配计算过程）。<br><br>针对场景：由于实例机型的总内存会大于实例内部的可用内存，16GB内存规格的实例，实例操作系统内的可用内存只有约14.9GB内存。假设此时提交一个需要15GB内存的作业，</p><ul><li>当ScaleUpMemRatio=0时，会匹配到16GB内存规格的实例,但是由于操作系统内的可用内存为14.9GB小于作业所需的15GB，扩容出来的实例作业无法运行起来。</li><li>当ScaleUpMemRatio=10时，匹配实例规格会按照15*(1+10%)=16.5GB来进行实例规格匹配，则不会匹配到16GB的实例，而是更大内存规格的实例来保证作业能够被运行起来。</li></ul>
     * @param ScaleUpMemRatio <p>扩容过程中，作业的内存在匹配实例机型时增大比例（不会影响作业提交的内存大小，只影响匹配计算过程）。<br><br>针对场景：由于实例机型的总内存会大于实例内部的可用内存，16GB内存规格的实例，实例操作系统内的可用内存只有约14.9GB内存。假设此时提交一个需要15GB内存的作业，</p><ul><li>当ScaleUpMemRatio=0时，会匹配到16GB内存规格的实例,但是由于操作系统内的可用内存为14.9GB小于作业所需的15GB，扩容出来的实例作业无法运行起来。</li><li>当ScaleUpMemRatio=10时，匹配实例规格会按照15*(1+10%)=16.5GB来进行实例规格匹配，则不会匹配到16GB的实例，而是更大内存规格的实例来保证作业能够被运行起来。</li></ul>
     */
    public void setScaleUpMemRatio(Long ScaleUpMemRatio) {
        this.ScaleUpMemRatio = ScaleUpMemRatio;
    }

    /**
     * Get <p>增强服务。通过该参数可以指定是否开启云安全、腾讯云可观测平台等服务。若不指定该参数，则默认开启腾讯云可观测平台、云安全服务、自动化助手服务。</p> 
     * @return EnhancedService <p>增强服务。通过该参数可以指定是否开启云安全、腾讯云可观测平台等服务。若不指定该参数，则默认开启腾讯云可观测平台、云安全服务、自动化助手服务。</p>
     */
    public EnhancedService getEnhancedService() {
        return this.EnhancedService;
    }

    /**
     * Set <p>增强服务。通过该参数可以指定是否开启云安全、腾讯云可观测平台等服务。若不指定该参数，则默认开启腾讯云可观测平台、云安全服务、自动化助手服务。</p>
     * @param EnhancedService <p>增强服务。通过该参数可以指定是否开启云安全、腾讯云可观测平台等服务。若不指定该参数，则默认开启腾讯云可观测平台、云安全服务、自动化助手服务。</p>
     */
    public void setEnhancedService(EnhancedService EnhancedService) {
        this.EnhancedService = EnhancedService;
    }

    /**
     * Get <p>扩容实例模板，可以在cvm侧进行设置</p> 
     * @return LaunchTemplateIds <p>扩容实例模板，可以在cvm侧进行设置</p>
     */
    public String [] getLaunchTemplateIds() {
        return this.LaunchTemplateIds;
    }

    /**
     * Set <p>扩容实例模板，可以在cvm侧进行设置</p>
     * @param LaunchTemplateIds <p>扩容实例模板，可以在cvm侧进行设置</p>
     */
    public void setLaunchTemplateIds(String [] LaunchTemplateIds) {
        this.LaunchTemplateIds = LaunchTemplateIds;
    }

    public QueueConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueueConfig(QueueConfig source) {
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.MinSize != null) {
            this.MinSize = new Long(source.MinSize);
        }
        if (source.MaxSize != null) {
            this.MaxSize = new Long(source.MaxSize);
        }
        if (source.EnableAutoExpansion != null) {
            this.EnableAutoExpansion = new Boolean(source.EnableAutoExpansion);
        }
        if (source.EnableAutoShrink != null) {
            this.EnableAutoShrink = new Boolean(source.EnableAutoShrink);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.SystemDisk != null) {
            this.SystemDisk = new SystemDisk(source.SystemDisk);
        }
        if (source.DataDisks != null) {
            this.DataDisks = new DataDisk[source.DataDisks.length];
            for (int i = 0; i < source.DataDisks.length; i++) {
                this.DataDisks[i] = new DataDisk(source.DataDisks[i]);
            }
        }
        if (source.InternetAccessible != null) {
            this.InternetAccessible = new InternetAccessible(source.InternetAccessible);
        }
        if (source.ExpansionNodeConfigs != null) {
            this.ExpansionNodeConfigs = new ExpansionNodeConfig[source.ExpansionNodeConfigs.length];
            for (int i = 0; i < source.ExpansionNodeConfigs.length; i++) {
                this.ExpansionNodeConfigs[i] = new ExpansionNodeConfig(source.ExpansionNodeConfigs[i]);
            }
        }
        if (source.DesiredIdleNodeCapacity != null) {
            this.DesiredIdleNodeCapacity = new Long(source.DesiredIdleNodeCapacity);
        }
        if (source.DesiredNodeCount != null) {
            this.DesiredNodeCount = new Long(source.DesiredNodeCount);
        }
        if (source.ScaleOutRatio != null) {
            this.ScaleOutRatio = new Long(source.ScaleOutRatio);
        }
        if (source.ScaleOutNodeThreshold != null) {
            this.ScaleOutNodeThreshold = new Long(source.ScaleOutNodeThreshold);
        }
        if (source.MaxNodesPerCycle != null) {
            this.MaxNodesPerCycle = new Long(source.MaxNodesPerCycle);
        }
        if (source.ScaleUpMemRatio != null) {
            this.ScaleUpMemRatio = new Long(source.ScaleUpMemRatio);
        }
        if (source.EnhancedService != null) {
            this.EnhancedService = new EnhancedService(source.EnhancedService);
        }
        if (source.LaunchTemplateIds != null) {
            this.LaunchTemplateIds = new String[source.LaunchTemplateIds.length];
            for (int i = 0; i < source.LaunchTemplateIds.length; i++) {
                this.LaunchTemplateIds[i] = new String(source.LaunchTemplateIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "MinSize", this.MinSize);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);
        this.setParamSimple(map, prefix + "EnableAutoExpansion", this.EnableAutoExpansion);
        this.setParamSimple(map, prefix + "EnableAutoShrink", this.EnableAutoShrink);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamArrayObj(map, prefix + "ExpansionNodeConfigs.", this.ExpansionNodeConfigs);
        this.setParamSimple(map, prefix + "DesiredIdleNodeCapacity", this.DesiredIdleNodeCapacity);
        this.setParamSimple(map, prefix + "DesiredNodeCount", this.DesiredNodeCount);
        this.setParamSimple(map, prefix + "ScaleOutRatio", this.ScaleOutRatio);
        this.setParamSimple(map, prefix + "ScaleOutNodeThreshold", this.ScaleOutNodeThreshold);
        this.setParamSimple(map, prefix + "MaxNodesPerCycle", this.MaxNodesPerCycle);
        this.setParamSimple(map, prefix + "ScaleUpMemRatio", this.ScaleUpMemRatio);
        this.setParamObj(map, prefix + "EnhancedService.", this.EnhancedService);
        this.setParamArraySimple(map, prefix + "LaunchTemplateIds.", this.LaunchTemplateIds);

    }
}

