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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyServerlessStrategyRequest extends AbstractModel {

    /**
    * <p>serverless集群id</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>集群是否自动暂停，可选范围</p><li>yes</li><li>no</li>
    */
    @SerializedName("AutoPause")
    @Expose
    private String AutoPause;

    /**
    * <p>集群自动暂停的延迟，单位秒，可选范围[600,691200]，默认600</p>
    */
    @SerializedName("AutoPauseDelay")
    @Expose
    private Long AutoPauseDelay;

    /**
    * <p>该参数暂时无效</p>
    */
    @SerializedName("AutoScaleUpDelay")
    @Expose
    private Long AutoScaleUpDelay;

    /**
    * <p>该参数暂时无效</p>
    */
    @SerializedName("AutoScaleDownDelay")
    @Expose
    private Long AutoScaleDownDelay;

    /**
    * <p>cpu最小值，可选范围参考DescribeServerlessInstanceSpecs接口返回</p>
    */
    @SerializedName("MinCpu")
    @Expose
    private Float MinCpu;

    /**
    * <p>cpu最大值，可选范围参考DescribeServerlessInstanceSpecs接口返回</p>
    */
    @SerializedName("MaxCpu")
    @Expose
    private Float MaxCpu;

    /**
    * <p>只读实例cpu最小值，可选范围参考DescribeServerlessInstanceSpecs接口返回</p>
    */
    @SerializedName("MinRoCpu")
    @Expose
    private Float MinRoCpu;

    /**
    * <p>只读cpu最大值，可选范围参考DescribeServerlessInstanceSpecs接口返回</p>
    */
    @SerializedName("MaxRoCpu")
    @Expose
    private Float MaxRoCpu;

    /**
    * <p>只读节点最小个数</p>
    */
    @SerializedName("MinRoCount")
    @Expose
    private Long MinRoCount;

    /**
    * <p>只读节点最大个数</p>
    */
    @SerializedName("MaxRoCount")
    @Expose
    private Long MaxRoCount;

    /**
    * <p>是否开启归档，可选范围<li>yes</li><li>no</li>默认值:yes</p>
    */
    @SerializedName("AutoArchive")
    @Expose
    private String AutoArchive;

    /**
    * <p>升级类型。 默认值：upgradeImmediate。 可选值： upgradeImmediate：立即完成修改 upgradeInMaintain：在维护时间窗口内完成修改</p>
    */
    @SerializedName("UpgradeType")
    @Expose
    private String UpgradeType;

    /**
    * <p>新增的只读实例需要绑定的安全组列表。仅仅针对于在这次调整策略过程中新产生的只读实例绑定安全组，存量的实例不绑定。</p>
    */
    @SerializedName("SecurityGroupIdsForNewRo")
    @Expose
    private String [] SecurityGroupIdsForNewRo;

    /**
     * Get <p>serverless集群id</p> 
     * @return ClusterId <p>serverless集群id</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>serverless集群id</p>
     * @param ClusterId <p>serverless集群id</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>集群是否自动暂停，可选范围</p><li>yes</li><li>no</li> 
     * @return AutoPause <p>集群是否自动暂停，可选范围</p><li>yes</li><li>no</li>
     */
    public String getAutoPause() {
        return this.AutoPause;
    }

    /**
     * Set <p>集群是否自动暂停，可选范围</p><li>yes</li><li>no</li>
     * @param AutoPause <p>集群是否自动暂停，可选范围</p><li>yes</li><li>no</li>
     */
    public void setAutoPause(String AutoPause) {
        this.AutoPause = AutoPause;
    }

    /**
     * Get <p>集群自动暂停的延迟，单位秒，可选范围[600,691200]，默认600</p> 
     * @return AutoPauseDelay <p>集群自动暂停的延迟，单位秒，可选范围[600,691200]，默认600</p>
     */
    public Long getAutoPauseDelay() {
        return this.AutoPauseDelay;
    }

    /**
     * Set <p>集群自动暂停的延迟，单位秒，可选范围[600,691200]，默认600</p>
     * @param AutoPauseDelay <p>集群自动暂停的延迟，单位秒，可选范围[600,691200]，默认600</p>
     */
    public void setAutoPauseDelay(Long AutoPauseDelay) {
        this.AutoPauseDelay = AutoPauseDelay;
    }

    /**
     * Get <p>该参数暂时无效</p> 
     * @return AutoScaleUpDelay <p>该参数暂时无效</p>
     */
    public Long getAutoScaleUpDelay() {
        return this.AutoScaleUpDelay;
    }

    /**
     * Set <p>该参数暂时无效</p>
     * @param AutoScaleUpDelay <p>该参数暂时无效</p>
     */
    public void setAutoScaleUpDelay(Long AutoScaleUpDelay) {
        this.AutoScaleUpDelay = AutoScaleUpDelay;
    }

    /**
     * Get <p>该参数暂时无效</p> 
     * @return AutoScaleDownDelay <p>该参数暂时无效</p>
     */
    public Long getAutoScaleDownDelay() {
        return this.AutoScaleDownDelay;
    }

    /**
     * Set <p>该参数暂时无效</p>
     * @param AutoScaleDownDelay <p>该参数暂时无效</p>
     */
    public void setAutoScaleDownDelay(Long AutoScaleDownDelay) {
        this.AutoScaleDownDelay = AutoScaleDownDelay;
    }

    /**
     * Get <p>cpu最小值，可选范围参考DescribeServerlessInstanceSpecs接口返回</p> 
     * @return MinCpu <p>cpu最小值，可选范围参考DescribeServerlessInstanceSpecs接口返回</p>
     */
    public Float getMinCpu() {
        return this.MinCpu;
    }

    /**
     * Set <p>cpu最小值，可选范围参考DescribeServerlessInstanceSpecs接口返回</p>
     * @param MinCpu <p>cpu最小值，可选范围参考DescribeServerlessInstanceSpecs接口返回</p>
     */
    public void setMinCpu(Float MinCpu) {
        this.MinCpu = MinCpu;
    }

    /**
     * Get <p>cpu最大值，可选范围参考DescribeServerlessInstanceSpecs接口返回</p> 
     * @return MaxCpu <p>cpu最大值，可选范围参考DescribeServerlessInstanceSpecs接口返回</p>
     */
    public Float getMaxCpu() {
        return this.MaxCpu;
    }

    /**
     * Set <p>cpu最大值，可选范围参考DescribeServerlessInstanceSpecs接口返回</p>
     * @param MaxCpu <p>cpu最大值，可选范围参考DescribeServerlessInstanceSpecs接口返回</p>
     */
    public void setMaxCpu(Float MaxCpu) {
        this.MaxCpu = MaxCpu;
    }

    /**
     * Get <p>只读实例cpu最小值，可选范围参考DescribeServerlessInstanceSpecs接口返回</p> 
     * @return MinRoCpu <p>只读实例cpu最小值，可选范围参考DescribeServerlessInstanceSpecs接口返回</p>
     */
    public Float getMinRoCpu() {
        return this.MinRoCpu;
    }

    /**
     * Set <p>只读实例cpu最小值，可选范围参考DescribeServerlessInstanceSpecs接口返回</p>
     * @param MinRoCpu <p>只读实例cpu最小值，可选范围参考DescribeServerlessInstanceSpecs接口返回</p>
     */
    public void setMinRoCpu(Float MinRoCpu) {
        this.MinRoCpu = MinRoCpu;
    }

    /**
     * Get <p>只读cpu最大值，可选范围参考DescribeServerlessInstanceSpecs接口返回</p> 
     * @return MaxRoCpu <p>只读cpu最大值，可选范围参考DescribeServerlessInstanceSpecs接口返回</p>
     */
    public Float getMaxRoCpu() {
        return this.MaxRoCpu;
    }

    /**
     * Set <p>只读cpu最大值，可选范围参考DescribeServerlessInstanceSpecs接口返回</p>
     * @param MaxRoCpu <p>只读cpu最大值，可选范围参考DescribeServerlessInstanceSpecs接口返回</p>
     */
    public void setMaxRoCpu(Float MaxRoCpu) {
        this.MaxRoCpu = MaxRoCpu;
    }

    /**
     * Get <p>只读节点最小个数</p> 
     * @return MinRoCount <p>只读节点最小个数</p>
     */
    public Long getMinRoCount() {
        return this.MinRoCount;
    }

    /**
     * Set <p>只读节点最小个数</p>
     * @param MinRoCount <p>只读节点最小个数</p>
     */
    public void setMinRoCount(Long MinRoCount) {
        this.MinRoCount = MinRoCount;
    }

    /**
     * Get <p>只读节点最大个数</p> 
     * @return MaxRoCount <p>只读节点最大个数</p>
     */
    public Long getMaxRoCount() {
        return this.MaxRoCount;
    }

    /**
     * Set <p>只读节点最大个数</p>
     * @param MaxRoCount <p>只读节点最大个数</p>
     */
    public void setMaxRoCount(Long MaxRoCount) {
        this.MaxRoCount = MaxRoCount;
    }

    /**
     * Get <p>是否开启归档，可选范围<li>yes</li><li>no</li>默认值:yes</p> 
     * @return AutoArchive <p>是否开启归档，可选范围<li>yes</li><li>no</li>默认值:yes</p>
     */
    public String getAutoArchive() {
        return this.AutoArchive;
    }

    /**
     * Set <p>是否开启归档，可选范围<li>yes</li><li>no</li>默认值:yes</p>
     * @param AutoArchive <p>是否开启归档，可选范围<li>yes</li><li>no</li>默认值:yes</p>
     */
    public void setAutoArchive(String AutoArchive) {
        this.AutoArchive = AutoArchive;
    }

    /**
     * Get <p>升级类型。 默认值：upgradeImmediate。 可选值： upgradeImmediate：立即完成修改 upgradeInMaintain：在维护时间窗口内完成修改</p> 
     * @return UpgradeType <p>升级类型。 默认值：upgradeImmediate。 可选值： upgradeImmediate：立即完成修改 upgradeInMaintain：在维护时间窗口内完成修改</p>
     */
    public String getUpgradeType() {
        return this.UpgradeType;
    }

    /**
     * Set <p>升级类型。 默认值：upgradeImmediate。 可选值： upgradeImmediate：立即完成修改 upgradeInMaintain：在维护时间窗口内完成修改</p>
     * @param UpgradeType <p>升级类型。 默认值：upgradeImmediate。 可选值： upgradeImmediate：立即完成修改 upgradeInMaintain：在维护时间窗口内完成修改</p>
     */
    public void setUpgradeType(String UpgradeType) {
        this.UpgradeType = UpgradeType;
    }

    /**
     * Get <p>新增的只读实例需要绑定的安全组列表。仅仅针对于在这次调整策略过程中新产生的只读实例绑定安全组，存量的实例不绑定。</p> 
     * @return SecurityGroupIdsForNewRo <p>新增的只读实例需要绑定的安全组列表。仅仅针对于在这次调整策略过程中新产生的只读实例绑定安全组，存量的实例不绑定。</p>
     */
    public String [] getSecurityGroupIdsForNewRo() {
        return this.SecurityGroupIdsForNewRo;
    }

    /**
     * Set <p>新增的只读实例需要绑定的安全组列表。仅仅针对于在这次调整策略过程中新产生的只读实例绑定安全组，存量的实例不绑定。</p>
     * @param SecurityGroupIdsForNewRo <p>新增的只读实例需要绑定的安全组列表。仅仅针对于在这次调整策略过程中新产生的只读实例绑定安全组，存量的实例不绑定。</p>
     */
    public void setSecurityGroupIdsForNewRo(String [] SecurityGroupIdsForNewRo) {
        this.SecurityGroupIdsForNewRo = SecurityGroupIdsForNewRo;
    }

    public ModifyServerlessStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyServerlessStrategyRequest(ModifyServerlessStrategyRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.AutoPause != null) {
            this.AutoPause = new String(source.AutoPause);
        }
        if (source.AutoPauseDelay != null) {
            this.AutoPauseDelay = new Long(source.AutoPauseDelay);
        }
        if (source.AutoScaleUpDelay != null) {
            this.AutoScaleUpDelay = new Long(source.AutoScaleUpDelay);
        }
        if (source.AutoScaleDownDelay != null) {
            this.AutoScaleDownDelay = new Long(source.AutoScaleDownDelay);
        }
        if (source.MinCpu != null) {
            this.MinCpu = new Float(source.MinCpu);
        }
        if (source.MaxCpu != null) {
            this.MaxCpu = new Float(source.MaxCpu);
        }
        if (source.MinRoCpu != null) {
            this.MinRoCpu = new Float(source.MinRoCpu);
        }
        if (source.MaxRoCpu != null) {
            this.MaxRoCpu = new Float(source.MaxRoCpu);
        }
        if (source.MinRoCount != null) {
            this.MinRoCount = new Long(source.MinRoCount);
        }
        if (source.MaxRoCount != null) {
            this.MaxRoCount = new Long(source.MaxRoCount);
        }
        if (source.AutoArchive != null) {
            this.AutoArchive = new String(source.AutoArchive);
        }
        if (source.UpgradeType != null) {
            this.UpgradeType = new String(source.UpgradeType);
        }
        if (source.SecurityGroupIdsForNewRo != null) {
            this.SecurityGroupIdsForNewRo = new String[source.SecurityGroupIdsForNewRo.length];
            for (int i = 0; i < source.SecurityGroupIdsForNewRo.length; i++) {
                this.SecurityGroupIdsForNewRo[i] = new String(source.SecurityGroupIdsForNewRo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "AutoPause", this.AutoPause);
        this.setParamSimple(map, prefix + "AutoPauseDelay", this.AutoPauseDelay);
        this.setParamSimple(map, prefix + "AutoScaleUpDelay", this.AutoScaleUpDelay);
        this.setParamSimple(map, prefix + "AutoScaleDownDelay", this.AutoScaleDownDelay);
        this.setParamSimple(map, prefix + "MinCpu", this.MinCpu);
        this.setParamSimple(map, prefix + "MaxCpu", this.MaxCpu);
        this.setParamSimple(map, prefix + "MinRoCpu", this.MinRoCpu);
        this.setParamSimple(map, prefix + "MaxRoCpu", this.MaxRoCpu);
        this.setParamSimple(map, prefix + "MinRoCount", this.MinRoCount);
        this.setParamSimple(map, prefix + "MaxRoCount", this.MaxRoCount);
        this.setParamSimple(map, prefix + "AutoArchive", this.AutoArchive);
        this.setParamSimple(map, prefix + "UpgradeType", this.UpgradeType);
        this.setParamArraySimple(map, prefix + "SecurityGroupIdsForNewRo.", this.SecurityGroupIdsForNewRo);

    }
}

