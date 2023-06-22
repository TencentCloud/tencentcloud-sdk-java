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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StrategyConfig extends AbstractModel{

    /**
    * 0:关闭滚动重启
1:开启滚动启动
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RollingRestartSwitch")
    @Expose
    private Long RollingRestartSwitch;

    /**
    * 滚动重启每批次的重启数量，最大重启台数为 99999 台
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BatchSize")
    @Expose
    private Long BatchSize;

    /**
    * 滚动重启每批停止等待时间 ,最大间隔为 5 分钟 单位是秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeWait")
    @Expose
    private Long TimeWait;

    /**
    * 操作失败处理策略，0:失败阻塞, 1:失败自动跳过
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DealOnFail")
    @Expose
    private Long DealOnFail;

    /**
     * Get 0:关闭滚动重启
1:开启滚动启动
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RollingRestartSwitch 0:关闭滚动重启
1:开启滚动启动
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRollingRestartSwitch() {
        return this.RollingRestartSwitch;
    }

    /**
     * Set 0:关闭滚动重启
1:开启滚动启动
注意：此字段可能返回 null，表示取不到有效值。
     * @param RollingRestartSwitch 0:关闭滚动重启
1:开启滚动启动
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRollingRestartSwitch(Long RollingRestartSwitch) {
        this.RollingRestartSwitch = RollingRestartSwitch;
    }

    /**
     * Get 滚动重启每批次的重启数量，最大重启台数为 99999 台
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BatchSize 滚动重启每批次的重启数量，最大重启台数为 99999 台
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBatchSize() {
        return this.BatchSize;
    }

    /**
     * Set 滚动重启每批次的重启数量，最大重启台数为 99999 台
注意：此字段可能返回 null，表示取不到有效值。
     * @param BatchSize 滚动重启每批次的重启数量，最大重启台数为 99999 台
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBatchSize(Long BatchSize) {
        this.BatchSize = BatchSize;
    }

    /**
     * Get 滚动重启每批停止等待时间 ,最大间隔为 5 分钟 单位是秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeWait 滚动重启每批停止等待时间 ,最大间隔为 5 分钟 单位是秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimeWait() {
        return this.TimeWait;
    }

    /**
     * Set 滚动重启每批停止等待时间 ,最大间隔为 5 分钟 单位是秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeWait 滚动重启每批停止等待时间 ,最大间隔为 5 分钟 单位是秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeWait(Long TimeWait) {
        this.TimeWait = TimeWait;
    }

    /**
     * Get 操作失败处理策略，0:失败阻塞, 1:失败自动跳过
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DealOnFail 操作失败处理策略，0:失败阻塞, 1:失败自动跳过
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDealOnFail() {
        return this.DealOnFail;
    }

    /**
     * Set 操作失败处理策略，0:失败阻塞, 1:失败自动跳过
注意：此字段可能返回 null，表示取不到有效值。
     * @param DealOnFail 操作失败处理策略，0:失败阻塞, 1:失败自动跳过
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDealOnFail(Long DealOnFail) {
        this.DealOnFail = DealOnFail;
    }

    public StrategyConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StrategyConfig(StrategyConfig source) {
        if (source.RollingRestartSwitch != null) {
            this.RollingRestartSwitch = new Long(source.RollingRestartSwitch);
        }
        if (source.BatchSize != null) {
            this.BatchSize = new Long(source.BatchSize);
        }
        if (source.TimeWait != null) {
            this.TimeWait = new Long(source.TimeWait);
        }
        if (source.DealOnFail != null) {
            this.DealOnFail = new Long(source.DealOnFail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RollingRestartSwitch", this.RollingRestartSwitch);
        this.setParamSimple(map, prefix + "BatchSize", this.BatchSize);
        this.setParamSimple(map, prefix + "TimeWait", this.TimeWait);
        this.setParamSimple(map, prefix + "DealOnFail", this.DealOnFail);

    }
}

