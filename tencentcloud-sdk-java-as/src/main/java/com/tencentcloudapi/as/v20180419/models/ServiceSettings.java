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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceSettings extends AbstractModel{

    /**
    * 开启监控不健康替换服务。若开启则对于云监控标记为不健康的实例，弹性伸缩服务会进行替换。若不指定该参数，则默认为 False。
    */
    @SerializedName("ReplaceMonitorUnhealthy")
    @Expose
    private Boolean ReplaceMonitorUnhealthy;

    /**
    * 取值范围： 
CLASSIC_SCALING：经典方式，使用创建、销毁实例来实现扩缩容； 
WAKE_UP_STOPPED_SCALING：扩容优先开机。扩容时优先对已关机的实例执行开机操作，若开机后实例数仍低于期望实例数，则创建实例，缩容仍采用销毁实例的方式。用户可以使用StopAutoScalingInstances接口来关闭伸缩组内的实例。监控告警触发的扩容仍将创建实例
默认取值：CLASSIC_SCALING
    */
    @SerializedName("ScalingMode")
    @Expose
    private String ScalingMode;

    /**
     * Get 开启监控不健康替换服务。若开启则对于云监控标记为不健康的实例，弹性伸缩服务会进行替换。若不指定该参数，则默认为 False。 
     * @return ReplaceMonitorUnhealthy 开启监控不健康替换服务。若开启则对于云监控标记为不健康的实例，弹性伸缩服务会进行替换。若不指定该参数，则默认为 False。
     */
    public Boolean getReplaceMonitorUnhealthy() {
        return this.ReplaceMonitorUnhealthy;
    }

    /**
     * Set 开启监控不健康替换服务。若开启则对于云监控标记为不健康的实例，弹性伸缩服务会进行替换。若不指定该参数，则默认为 False。
     * @param ReplaceMonitorUnhealthy 开启监控不健康替换服务。若开启则对于云监控标记为不健康的实例，弹性伸缩服务会进行替换。若不指定该参数，则默认为 False。
     */
    public void setReplaceMonitorUnhealthy(Boolean ReplaceMonitorUnhealthy) {
        this.ReplaceMonitorUnhealthy = ReplaceMonitorUnhealthy;
    }

    /**
     * Get 取值范围： 
CLASSIC_SCALING：经典方式，使用创建、销毁实例来实现扩缩容； 
WAKE_UP_STOPPED_SCALING：扩容优先开机。扩容时优先对已关机的实例执行开机操作，若开机后实例数仍低于期望实例数，则创建实例，缩容仍采用销毁实例的方式。用户可以使用StopAutoScalingInstances接口来关闭伸缩组内的实例。监控告警触发的扩容仍将创建实例
默认取值：CLASSIC_SCALING 
     * @return ScalingMode 取值范围： 
CLASSIC_SCALING：经典方式，使用创建、销毁实例来实现扩缩容； 
WAKE_UP_STOPPED_SCALING：扩容优先开机。扩容时优先对已关机的实例执行开机操作，若开机后实例数仍低于期望实例数，则创建实例，缩容仍采用销毁实例的方式。用户可以使用StopAutoScalingInstances接口来关闭伸缩组内的实例。监控告警触发的扩容仍将创建实例
默认取值：CLASSIC_SCALING
     */
    public String getScalingMode() {
        return this.ScalingMode;
    }

    /**
     * Set 取值范围： 
CLASSIC_SCALING：经典方式，使用创建、销毁实例来实现扩缩容； 
WAKE_UP_STOPPED_SCALING：扩容优先开机。扩容时优先对已关机的实例执行开机操作，若开机后实例数仍低于期望实例数，则创建实例，缩容仍采用销毁实例的方式。用户可以使用StopAutoScalingInstances接口来关闭伸缩组内的实例。监控告警触发的扩容仍将创建实例
默认取值：CLASSIC_SCALING
     * @param ScalingMode 取值范围： 
CLASSIC_SCALING：经典方式，使用创建、销毁实例来实现扩缩容； 
WAKE_UP_STOPPED_SCALING：扩容优先开机。扩容时优先对已关机的实例执行开机操作，若开机后实例数仍低于期望实例数，则创建实例，缩容仍采用销毁实例的方式。用户可以使用StopAutoScalingInstances接口来关闭伸缩组内的实例。监控告警触发的扩容仍将创建实例
默认取值：CLASSIC_SCALING
     */
    public void setScalingMode(String ScalingMode) {
        this.ScalingMode = ScalingMode;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReplaceMonitorUnhealthy", this.ReplaceMonitorUnhealthy);
        this.setParamSimple(map, prefix + "ScalingMode", this.ScalingMode);

    }
}

