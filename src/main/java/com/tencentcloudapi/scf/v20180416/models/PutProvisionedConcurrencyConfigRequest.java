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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PutProvisionedConcurrencyConfigRequest extends AbstractModel{

    /**
    * 需要设置预置并发的函数的名称
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * 函数的版本号，注：$LATEST版本不支持预置并发
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
    * 预置并发数量，注：所有版本的预置并发数总和存在上限限制，当前的上限是：函数最大并发配额 - 100
    */
    @SerializedName("VersionProvisionedConcurrencyNum")
    @Expose
    private Long VersionProvisionedConcurrencyNum;

    /**
    * 函数所属命名空间，默认为default
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 定时预置任务
    */
    @SerializedName("TriggerActions")
    @Expose
    private TriggerAction [] TriggerActions;

    /**
    * 预置类型，
静态预置：Default
动态追踪并发利用率指标预置：ConcurrencyUtilizationTracking
预置类型二选一，设置静态预置时可以设置VersionProvisionedConcurrencyNum。

动态利用率预置可以设置TrackingTarget，MinCapacity，MaxCapacity，保持向后兼容性此时VersionProvisionedConcurrencyNum设置为0.
    */
    @SerializedName("ProvisionedType")
    @Expose
    private String ProvisionedType;

    /**
    * 指标追踪的并发利用率。设置范围(0,1)
    */
    @SerializedName("TrackingTarget")
    @Expose
    private Float TrackingTarget;

    /**
    * 缩容时的最小值, 最小值为1
    */
    @SerializedName("MinCapacity")
    @Expose
    private Long MinCapacity;

    /**
    * 扩容时的最大值
    */
    @SerializedName("MaxCapacity")
    @Expose
    private Long MaxCapacity;

    /**
     * Get 需要设置预置并发的函数的名称 
     * @return FunctionName 需要设置预置并发的函数的名称
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set 需要设置预置并发的函数的名称
     * @param FunctionName 需要设置预置并发的函数的名称
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get 函数的版本号，注：$LATEST版本不支持预置并发 
     * @return Qualifier 函数的版本号，注：$LATEST版本不支持预置并发
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set 函数的版本号，注：$LATEST版本不支持预置并发
     * @param Qualifier 函数的版本号，注：$LATEST版本不支持预置并发
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    /**
     * Get 预置并发数量，注：所有版本的预置并发数总和存在上限限制，当前的上限是：函数最大并发配额 - 100 
     * @return VersionProvisionedConcurrencyNum 预置并发数量，注：所有版本的预置并发数总和存在上限限制，当前的上限是：函数最大并发配额 - 100
     */
    public Long getVersionProvisionedConcurrencyNum() {
        return this.VersionProvisionedConcurrencyNum;
    }

    /**
     * Set 预置并发数量，注：所有版本的预置并发数总和存在上限限制，当前的上限是：函数最大并发配额 - 100
     * @param VersionProvisionedConcurrencyNum 预置并发数量，注：所有版本的预置并发数总和存在上限限制，当前的上限是：函数最大并发配额 - 100
     */
    public void setVersionProvisionedConcurrencyNum(Long VersionProvisionedConcurrencyNum) {
        this.VersionProvisionedConcurrencyNum = VersionProvisionedConcurrencyNum;
    }

    /**
     * Get 函数所属命名空间，默认为default 
     * @return Namespace 函数所属命名空间，默认为default
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 函数所属命名空间，默认为default
     * @param Namespace 函数所属命名空间，默认为default
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 定时预置任务 
     * @return TriggerActions 定时预置任务
     */
    public TriggerAction [] getTriggerActions() {
        return this.TriggerActions;
    }

    /**
     * Set 定时预置任务
     * @param TriggerActions 定时预置任务
     */
    public void setTriggerActions(TriggerAction [] TriggerActions) {
        this.TriggerActions = TriggerActions;
    }

    /**
     * Get 预置类型，
静态预置：Default
动态追踪并发利用率指标预置：ConcurrencyUtilizationTracking
预置类型二选一，设置静态预置时可以设置VersionProvisionedConcurrencyNum。

动态利用率预置可以设置TrackingTarget，MinCapacity，MaxCapacity，保持向后兼容性此时VersionProvisionedConcurrencyNum设置为0. 
     * @return ProvisionedType 预置类型，
静态预置：Default
动态追踪并发利用率指标预置：ConcurrencyUtilizationTracking
预置类型二选一，设置静态预置时可以设置VersionProvisionedConcurrencyNum。

动态利用率预置可以设置TrackingTarget，MinCapacity，MaxCapacity，保持向后兼容性此时VersionProvisionedConcurrencyNum设置为0.
     */
    public String getProvisionedType() {
        return this.ProvisionedType;
    }

    /**
     * Set 预置类型，
静态预置：Default
动态追踪并发利用率指标预置：ConcurrencyUtilizationTracking
预置类型二选一，设置静态预置时可以设置VersionProvisionedConcurrencyNum。

动态利用率预置可以设置TrackingTarget，MinCapacity，MaxCapacity，保持向后兼容性此时VersionProvisionedConcurrencyNum设置为0.
     * @param ProvisionedType 预置类型，
静态预置：Default
动态追踪并发利用率指标预置：ConcurrencyUtilizationTracking
预置类型二选一，设置静态预置时可以设置VersionProvisionedConcurrencyNum。

动态利用率预置可以设置TrackingTarget，MinCapacity，MaxCapacity，保持向后兼容性此时VersionProvisionedConcurrencyNum设置为0.
     */
    public void setProvisionedType(String ProvisionedType) {
        this.ProvisionedType = ProvisionedType;
    }

    /**
     * Get 指标追踪的并发利用率。设置范围(0,1) 
     * @return TrackingTarget 指标追踪的并发利用率。设置范围(0,1)
     */
    public Float getTrackingTarget() {
        return this.TrackingTarget;
    }

    /**
     * Set 指标追踪的并发利用率。设置范围(0,1)
     * @param TrackingTarget 指标追踪的并发利用率。设置范围(0,1)
     */
    public void setTrackingTarget(Float TrackingTarget) {
        this.TrackingTarget = TrackingTarget;
    }

    /**
     * Get 缩容时的最小值, 最小值为1 
     * @return MinCapacity 缩容时的最小值, 最小值为1
     */
    public Long getMinCapacity() {
        return this.MinCapacity;
    }

    /**
     * Set 缩容时的最小值, 最小值为1
     * @param MinCapacity 缩容时的最小值, 最小值为1
     */
    public void setMinCapacity(Long MinCapacity) {
        this.MinCapacity = MinCapacity;
    }

    /**
     * Get 扩容时的最大值 
     * @return MaxCapacity 扩容时的最大值
     */
    public Long getMaxCapacity() {
        return this.MaxCapacity;
    }

    /**
     * Set 扩容时的最大值
     * @param MaxCapacity 扩容时的最大值
     */
    public void setMaxCapacity(Long MaxCapacity) {
        this.MaxCapacity = MaxCapacity;
    }

    public PutProvisionedConcurrencyConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PutProvisionedConcurrencyConfigRequest(PutProvisionedConcurrencyConfigRequest source) {
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.Qualifier != null) {
            this.Qualifier = new String(source.Qualifier);
        }
        if (source.VersionProvisionedConcurrencyNum != null) {
            this.VersionProvisionedConcurrencyNum = new Long(source.VersionProvisionedConcurrencyNum);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.TriggerActions != null) {
            this.TriggerActions = new TriggerAction[source.TriggerActions.length];
            for (int i = 0; i < source.TriggerActions.length; i++) {
                this.TriggerActions[i] = new TriggerAction(source.TriggerActions[i]);
            }
        }
        if (source.ProvisionedType != null) {
            this.ProvisionedType = new String(source.ProvisionedType);
        }
        if (source.TrackingTarget != null) {
            this.TrackingTarget = new Float(source.TrackingTarget);
        }
        if (source.MinCapacity != null) {
            this.MinCapacity = new Long(source.MinCapacity);
        }
        if (source.MaxCapacity != null) {
            this.MaxCapacity = new Long(source.MaxCapacity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);
        this.setParamSimple(map, prefix + "VersionProvisionedConcurrencyNum", this.VersionProvisionedConcurrencyNum);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamArrayObj(map, prefix + "TriggerActions.", this.TriggerActions);
        this.setParamSimple(map, prefix + "ProvisionedType", this.ProvisionedType);
        this.setParamSimple(map, prefix + "TrackingTarget", this.TrackingTarget);
        this.setParamSimple(map, prefix + "MinCapacity", this.MinCapacity);
        this.setParamSimple(map, prefix + "MaxCapacity", this.MaxCapacity);

    }
}

