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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceSettings extends AbstractModel {

    /**
    * <p>开启监控不健康替换服务。若开启则对于云监控标记为不健康的实例，弹性伸缩服务会进行替换。若不指定该参数，则默认为 False。</p>
    */
    @SerializedName("ReplaceMonitorUnhealthy")
    @Expose
    private Boolean ReplaceMonitorUnhealthy;

    /**
    * <p>取值范围：<br>CLASSIC_SCALING：经典方式，使用创建、销毁实例来实现扩缩容；<br>WAKE_UP_STOPPED_SCALING：扩容优先开机。扩容时优先对已关机的实例执行开机操作，若开机后实例数仍低于期望实例数，则创建实例，缩容仍采用销毁实例的方式。用户可以使用StopAutoScalingInstances接口来关闭伸缩组内的实例。监控告警触发的扩容仍将创建实例<br>默认取值：CLASSIC_SCALING</p>
    */
    @SerializedName("ScalingMode")
    @Expose
    private String ScalingMode;

    /**
    * <p>开启负载均衡不健康替换服务。若开启则对于负载均衡健康检查判断不健康的实例，弹性伸缩服务会进行替换。若不指定该参数，则默认为 False。</p>
    */
    @SerializedName("ReplaceLoadBalancerUnhealthy")
    @Expose
    private Boolean ReplaceLoadBalancerUnhealthy;

    /**
    * <p>不健康替换服务的替换模式。取值范围：<br>RECREATE：重建实例替代原有不健康实例；<br>RESET：对原有不健康实例进行重装系统操作，可保持数据盘、内网IP、实例id等信息不发生变化，实例登录设置、主机名、增强服务和 UserData 与当前启动配置保持一致。<br>默认取值：RECREATE</p>
    */
    @SerializedName("ReplaceMode")
    @Expose
    private String ReplaceMode;

    /**
    * <p>自动更新实例标签。默认取值为 False，配置后如伸缩组标签发生更新，会同步更新（同步更新仅支持新增、修改标签，暂不支持删除标签）伸缩组内运行中状态实例的标签，同步更新非立即生效，存在一定延迟。</p>
    */
    @SerializedName("AutoUpdateInstanceTags")
    @Expose
    private Boolean AutoUpdateInstanceTags;

    /**
    * <p>期望实例数同步最大最小值。默认值为 False。该参数仅对修改伸缩组接口未传入期望数的场景生效。</p><li>True: 修改最大值或最小值时，如与当前期望数存在冲突，则同步调整期望数。例如修改时传入最小值 2，当前期望数为 1，则同步调整期望数为 2。</li><li>False: 修改最大值或最小值时，如与当前期望数存在冲突，报错提示不允许修改。</li>
    */
    @SerializedName("DesiredCapacitySyncWithMaxMinSize")
    @Expose
    private Boolean DesiredCapacitySyncWithMaxMinSize;

    /**
    * <p>优先缩容不健康实例。若开启，缩容时会优先选择不健康实例。默认值为 False。</p>
    */
    @SerializedName("PriorityScaleInUnhealthy")
    @Expose
    private Boolean PriorityScaleInUnhealthy;

    /**
     * Get <p>开启监控不健康替换服务。若开启则对于云监控标记为不健康的实例，弹性伸缩服务会进行替换。若不指定该参数，则默认为 False。</p> 
     * @return ReplaceMonitorUnhealthy <p>开启监控不健康替换服务。若开启则对于云监控标记为不健康的实例，弹性伸缩服务会进行替换。若不指定该参数，则默认为 False。</p>
     */
    public Boolean getReplaceMonitorUnhealthy() {
        return this.ReplaceMonitorUnhealthy;
    }

    /**
     * Set <p>开启监控不健康替换服务。若开启则对于云监控标记为不健康的实例，弹性伸缩服务会进行替换。若不指定该参数，则默认为 False。</p>
     * @param ReplaceMonitorUnhealthy <p>开启监控不健康替换服务。若开启则对于云监控标记为不健康的实例，弹性伸缩服务会进行替换。若不指定该参数，则默认为 False。</p>
     */
    public void setReplaceMonitorUnhealthy(Boolean ReplaceMonitorUnhealthy) {
        this.ReplaceMonitorUnhealthy = ReplaceMonitorUnhealthy;
    }

    /**
     * Get <p>取值范围：<br>CLASSIC_SCALING：经典方式，使用创建、销毁实例来实现扩缩容；<br>WAKE_UP_STOPPED_SCALING：扩容优先开机。扩容时优先对已关机的实例执行开机操作，若开机后实例数仍低于期望实例数，则创建实例，缩容仍采用销毁实例的方式。用户可以使用StopAutoScalingInstances接口来关闭伸缩组内的实例。监控告警触发的扩容仍将创建实例<br>默认取值：CLASSIC_SCALING</p> 
     * @return ScalingMode <p>取值范围：<br>CLASSIC_SCALING：经典方式，使用创建、销毁实例来实现扩缩容；<br>WAKE_UP_STOPPED_SCALING：扩容优先开机。扩容时优先对已关机的实例执行开机操作，若开机后实例数仍低于期望实例数，则创建实例，缩容仍采用销毁实例的方式。用户可以使用StopAutoScalingInstances接口来关闭伸缩组内的实例。监控告警触发的扩容仍将创建实例<br>默认取值：CLASSIC_SCALING</p>
     */
    public String getScalingMode() {
        return this.ScalingMode;
    }

    /**
     * Set <p>取值范围：<br>CLASSIC_SCALING：经典方式，使用创建、销毁实例来实现扩缩容；<br>WAKE_UP_STOPPED_SCALING：扩容优先开机。扩容时优先对已关机的实例执行开机操作，若开机后实例数仍低于期望实例数，则创建实例，缩容仍采用销毁实例的方式。用户可以使用StopAutoScalingInstances接口来关闭伸缩组内的实例。监控告警触发的扩容仍将创建实例<br>默认取值：CLASSIC_SCALING</p>
     * @param ScalingMode <p>取值范围：<br>CLASSIC_SCALING：经典方式，使用创建、销毁实例来实现扩缩容；<br>WAKE_UP_STOPPED_SCALING：扩容优先开机。扩容时优先对已关机的实例执行开机操作，若开机后实例数仍低于期望实例数，则创建实例，缩容仍采用销毁实例的方式。用户可以使用StopAutoScalingInstances接口来关闭伸缩组内的实例。监控告警触发的扩容仍将创建实例<br>默认取值：CLASSIC_SCALING</p>
     */
    public void setScalingMode(String ScalingMode) {
        this.ScalingMode = ScalingMode;
    }

    /**
     * Get <p>开启负载均衡不健康替换服务。若开启则对于负载均衡健康检查判断不健康的实例，弹性伸缩服务会进行替换。若不指定该参数，则默认为 False。</p> 
     * @return ReplaceLoadBalancerUnhealthy <p>开启负载均衡不健康替换服务。若开启则对于负载均衡健康检查判断不健康的实例，弹性伸缩服务会进行替换。若不指定该参数，则默认为 False。</p>
     */
    public Boolean getReplaceLoadBalancerUnhealthy() {
        return this.ReplaceLoadBalancerUnhealthy;
    }

    /**
     * Set <p>开启负载均衡不健康替换服务。若开启则对于负载均衡健康检查判断不健康的实例，弹性伸缩服务会进行替换。若不指定该参数，则默认为 False。</p>
     * @param ReplaceLoadBalancerUnhealthy <p>开启负载均衡不健康替换服务。若开启则对于负载均衡健康检查判断不健康的实例，弹性伸缩服务会进行替换。若不指定该参数，则默认为 False。</p>
     */
    public void setReplaceLoadBalancerUnhealthy(Boolean ReplaceLoadBalancerUnhealthy) {
        this.ReplaceLoadBalancerUnhealthy = ReplaceLoadBalancerUnhealthy;
    }

    /**
     * Get <p>不健康替换服务的替换模式。取值范围：<br>RECREATE：重建实例替代原有不健康实例；<br>RESET：对原有不健康实例进行重装系统操作，可保持数据盘、内网IP、实例id等信息不发生变化，实例登录设置、主机名、增强服务和 UserData 与当前启动配置保持一致。<br>默认取值：RECREATE</p> 
     * @return ReplaceMode <p>不健康替换服务的替换模式。取值范围：<br>RECREATE：重建实例替代原有不健康实例；<br>RESET：对原有不健康实例进行重装系统操作，可保持数据盘、内网IP、实例id等信息不发生变化，实例登录设置、主机名、增强服务和 UserData 与当前启动配置保持一致。<br>默认取值：RECREATE</p>
     */
    public String getReplaceMode() {
        return this.ReplaceMode;
    }

    /**
     * Set <p>不健康替换服务的替换模式。取值范围：<br>RECREATE：重建实例替代原有不健康实例；<br>RESET：对原有不健康实例进行重装系统操作，可保持数据盘、内网IP、实例id等信息不发生变化，实例登录设置、主机名、增强服务和 UserData 与当前启动配置保持一致。<br>默认取值：RECREATE</p>
     * @param ReplaceMode <p>不健康替换服务的替换模式。取值范围：<br>RECREATE：重建实例替代原有不健康实例；<br>RESET：对原有不健康实例进行重装系统操作，可保持数据盘、内网IP、实例id等信息不发生变化，实例登录设置、主机名、增强服务和 UserData 与当前启动配置保持一致。<br>默认取值：RECREATE</p>
     */
    public void setReplaceMode(String ReplaceMode) {
        this.ReplaceMode = ReplaceMode;
    }

    /**
     * Get <p>自动更新实例标签。默认取值为 False，配置后如伸缩组标签发生更新，会同步更新（同步更新仅支持新增、修改标签，暂不支持删除标签）伸缩组内运行中状态实例的标签，同步更新非立即生效，存在一定延迟。</p> 
     * @return AutoUpdateInstanceTags <p>自动更新实例标签。默认取值为 False，配置后如伸缩组标签发生更新，会同步更新（同步更新仅支持新增、修改标签，暂不支持删除标签）伸缩组内运行中状态实例的标签，同步更新非立即生效，存在一定延迟。</p>
     */
    public Boolean getAutoUpdateInstanceTags() {
        return this.AutoUpdateInstanceTags;
    }

    /**
     * Set <p>自动更新实例标签。默认取值为 False，配置后如伸缩组标签发生更新，会同步更新（同步更新仅支持新增、修改标签，暂不支持删除标签）伸缩组内运行中状态实例的标签，同步更新非立即生效，存在一定延迟。</p>
     * @param AutoUpdateInstanceTags <p>自动更新实例标签。默认取值为 False，配置后如伸缩组标签发生更新，会同步更新（同步更新仅支持新增、修改标签，暂不支持删除标签）伸缩组内运行中状态实例的标签，同步更新非立即生效，存在一定延迟。</p>
     */
    public void setAutoUpdateInstanceTags(Boolean AutoUpdateInstanceTags) {
        this.AutoUpdateInstanceTags = AutoUpdateInstanceTags;
    }

    /**
     * Get <p>期望实例数同步最大最小值。默认值为 False。该参数仅对修改伸缩组接口未传入期望数的场景生效。</p><li>True: 修改最大值或最小值时，如与当前期望数存在冲突，则同步调整期望数。例如修改时传入最小值 2，当前期望数为 1，则同步调整期望数为 2。</li><li>False: 修改最大值或最小值时，如与当前期望数存在冲突，报错提示不允许修改。</li> 
     * @return DesiredCapacitySyncWithMaxMinSize <p>期望实例数同步最大最小值。默认值为 False。该参数仅对修改伸缩组接口未传入期望数的场景生效。</p><li>True: 修改最大值或最小值时，如与当前期望数存在冲突，则同步调整期望数。例如修改时传入最小值 2，当前期望数为 1，则同步调整期望数为 2。</li><li>False: 修改最大值或最小值时，如与当前期望数存在冲突，报错提示不允许修改。</li>
     */
    public Boolean getDesiredCapacitySyncWithMaxMinSize() {
        return this.DesiredCapacitySyncWithMaxMinSize;
    }

    /**
     * Set <p>期望实例数同步最大最小值。默认值为 False。该参数仅对修改伸缩组接口未传入期望数的场景生效。</p><li>True: 修改最大值或最小值时，如与当前期望数存在冲突，则同步调整期望数。例如修改时传入最小值 2，当前期望数为 1，则同步调整期望数为 2。</li><li>False: 修改最大值或最小值时，如与当前期望数存在冲突，报错提示不允许修改。</li>
     * @param DesiredCapacitySyncWithMaxMinSize <p>期望实例数同步最大最小值。默认值为 False。该参数仅对修改伸缩组接口未传入期望数的场景生效。</p><li>True: 修改最大值或最小值时，如与当前期望数存在冲突，则同步调整期望数。例如修改时传入最小值 2，当前期望数为 1，则同步调整期望数为 2。</li><li>False: 修改最大值或最小值时，如与当前期望数存在冲突，报错提示不允许修改。</li>
     */
    public void setDesiredCapacitySyncWithMaxMinSize(Boolean DesiredCapacitySyncWithMaxMinSize) {
        this.DesiredCapacitySyncWithMaxMinSize = DesiredCapacitySyncWithMaxMinSize;
    }

    /**
     * Get <p>优先缩容不健康实例。若开启，缩容时会优先选择不健康实例。默认值为 False。</p> 
     * @return PriorityScaleInUnhealthy <p>优先缩容不健康实例。若开启，缩容时会优先选择不健康实例。默认值为 False。</p>
     */
    public Boolean getPriorityScaleInUnhealthy() {
        return this.PriorityScaleInUnhealthy;
    }

    /**
     * Set <p>优先缩容不健康实例。若开启，缩容时会优先选择不健康实例。默认值为 False。</p>
     * @param PriorityScaleInUnhealthy <p>优先缩容不健康实例。若开启，缩容时会优先选择不健康实例。默认值为 False。</p>
     */
    public void setPriorityScaleInUnhealthy(Boolean PriorityScaleInUnhealthy) {
        this.PriorityScaleInUnhealthy = PriorityScaleInUnhealthy;
    }

    public ServiceSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceSettings(ServiceSettings source) {
        if (source.ReplaceMonitorUnhealthy != null) {
            this.ReplaceMonitorUnhealthy = new Boolean(source.ReplaceMonitorUnhealthy);
        }
        if (source.ScalingMode != null) {
            this.ScalingMode = new String(source.ScalingMode);
        }
        if (source.ReplaceLoadBalancerUnhealthy != null) {
            this.ReplaceLoadBalancerUnhealthy = new Boolean(source.ReplaceLoadBalancerUnhealthy);
        }
        if (source.ReplaceMode != null) {
            this.ReplaceMode = new String(source.ReplaceMode);
        }
        if (source.AutoUpdateInstanceTags != null) {
            this.AutoUpdateInstanceTags = new Boolean(source.AutoUpdateInstanceTags);
        }
        if (source.DesiredCapacitySyncWithMaxMinSize != null) {
            this.DesiredCapacitySyncWithMaxMinSize = new Boolean(source.DesiredCapacitySyncWithMaxMinSize);
        }
        if (source.PriorityScaleInUnhealthy != null) {
            this.PriorityScaleInUnhealthy = new Boolean(source.PriorityScaleInUnhealthy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReplaceMonitorUnhealthy", this.ReplaceMonitorUnhealthy);
        this.setParamSimple(map, prefix + "ScalingMode", this.ScalingMode);
        this.setParamSimple(map, prefix + "ReplaceLoadBalancerUnhealthy", this.ReplaceLoadBalancerUnhealthy);
        this.setParamSimple(map, prefix + "ReplaceMode", this.ReplaceMode);
        this.setParamSimple(map, prefix + "AutoUpdateInstanceTags", this.AutoUpdateInstanceTags);
        this.setParamSimple(map, prefix + "DesiredCapacitySyncWithMaxMinSize", this.DesiredCapacitySyncWithMaxMinSize);
        this.setParamSimple(map, prefix + "PriorityScaleInUnhealthy", this.PriorityScaleInUnhealthy);

    }
}

