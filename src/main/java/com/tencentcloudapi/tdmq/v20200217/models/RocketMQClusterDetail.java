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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RocketMQClusterDetail extends AbstractModel{

    /**
    * 集群基本信息
    */
    @SerializedName("Info")
    @Expose
    private RocketMQClusterInfo Info;

    /**
    * 集群配置信息
    */
    @SerializedName("Config")
    @Expose
    private RocketMQClusterConfig Config;

    /**
    * 集群状态，0:创建中，1:正常，2:销毁中，3:已删除，4: 隔离中，5:创建失败，6: 删除失败
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 集群基本信息 
     * @return Info 集群基本信息
     */
    public RocketMQClusterInfo getInfo() {
        return this.Info;
    }

    /**
     * Set 集群基本信息
     * @param Info 集群基本信息
     */
    public void setInfo(RocketMQClusterInfo Info) {
        this.Info = Info;
    }

    /**
     * Get 集群配置信息 
     * @return Config 集群配置信息
     */
    public RocketMQClusterConfig getConfig() {
        return this.Config;
    }

    /**
     * Set 集群配置信息
     * @param Config 集群配置信息
     */
    public void setConfig(RocketMQClusterConfig Config) {
        this.Config = Config;
    }

    /**
     * Get 集群状态，0:创建中，1:正常，2:销毁中，3:已删除，4: 隔离中，5:创建失败，6: 删除失败
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 集群状态，0:创建中，1:正常，2:销毁中，3:已删除，4: 隔离中，5:创建失败，6: 删除失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 集群状态，0:创建中，1:正常，2:销毁中，3:已删除，4: 隔离中，5:创建失败，6: 删除失败
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 集群状态，0:创建中，1:正常，2:销毁中，3:已删除，4: 隔离中，5:创建失败，6: 删除失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public RocketMQClusterDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RocketMQClusterDetail(RocketMQClusterDetail source) {
        if (source.Info != null) {
            this.Info = new RocketMQClusterInfo(source.Info);
        }
        if (source.Config != null) {
            this.Config = new RocketMQClusterConfig(source.Config);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Info.", this.Info);
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

