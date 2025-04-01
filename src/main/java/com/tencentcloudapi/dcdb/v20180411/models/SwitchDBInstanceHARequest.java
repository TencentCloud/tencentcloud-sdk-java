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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SwitchDBInstanceHARequest extends AbstractModel {

    /**
    * 实例Id，形如 tdsql-ow728lmc。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 指定可用区标识符，具体含义由zoneMode参数决定。 

- 当zoneMode为target时表示目标可用区 

- 当zoneMode为avoid时表示需避开的故障可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 指定分片实例id进行切换
    */
    @SerializedName("ShardInstanceIds")
    @Expose
    private String [] ShardInstanceIds;

    /**
    * 可用区模式选择器，定义zone参数的语义类型。  - 默认值：target  - 可选值：target, avoid
    */
    @SerializedName("ZoneMode")
    @Expose
    private String ZoneMode;

    /**
     * Get 实例Id，形如 tdsql-ow728lmc。 
     * @return InstanceId 实例Id，形如 tdsql-ow728lmc。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id，形如 tdsql-ow728lmc。
     * @param InstanceId 实例Id，形如 tdsql-ow728lmc。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 指定可用区标识符，具体含义由zoneMode参数决定。 

- 当zoneMode为target时表示目标可用区 

- 当zoneMode为avoid时表示需避开的故障可用区 
     * @return Zone 指定可用区标识符，具体含义由zoneMode参数决定。 

- 当zoneMode为target时表示目标可用区 

- 当zoneMode为avoid时表示需避开的故障可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 指定可用区标识符，具体含义由zoneMode参数决定。 

- 当zoneMode为target时表示目标可用区 

- 当zoneMode为avoid时表示需避开的故障可用区
     * @param Zone 指定可用区标识符，具体含义由zoneMode参数决定。 

- 当zoneMode为target时表示目标可用区 

- 当zoneMode为avoid时表示需避开的故障可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 指定分片实例id进行切换 
     * @return ShardInstanceIds 指定分片实例id进行切换
     */
    public String [] getShardInstanceIds() {
        return this.ShardInstanceIds;
    }

    /**
     * Set 指定分片实例id进行切换
     * @param ShardInstanceIds 指定分片实例id进行切换
     */
    public void setShardInstanceIds(String [] ShardInstanceIds) {
        this.ShardInstanceIds = ShardInstanceIds;
    }

    /**
     * Get 可用区模式选择器，定义zone参数的语义类型。  - 默认值：target  - 可选值：target, avoid 
     * @return ZoneMode 可用区模式选择器，定义zone参数的语义类型。  - 默认值：target  - 可选值：target, avoid
     */
    public String getZoneMode() {
        return this.ZoneMode;
    }

    /**
     * Set 可用区模式选择器，定义zone参数的语义类型。  - 默认值：target  - 可选值：target, avoid
     * @param ZoneMode 可用区模式选择器，定义zone参数的语义类型。  - 默认值：target  - 可选值：target, avoid
     */
    public void setZoneMode(String ZoneMode) {
        this.ZoneMode = ZoneMode;
    }

    public SwitchDBInstanceHARequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SwitchDBInstanceHARequest(SwitchDBInstanceHARequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ShardInstanceIds != null) {
            this.ShardInstanceIds = new String[source.ShardInstanceIds.length];
            for (int i = 0; i < source.ShardInstanceIds.length; i++) {
                this.ShardInstanceIds[i] = new String(source.ShardInstanceIds[i]);
            }
        }
        if (source.ZoneMode != null) {
            this.ZoneMode = new String(source.ZoneMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArraySimple(map, prefix + "ShardInstanceIds.", this.ShardInstanceIds);
        this.setParamSimple(map, prefix + "ZoneMode", this.ZoneMode);

    }
}

