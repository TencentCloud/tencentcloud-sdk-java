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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SwitchDBInstanceHARequest extends AbstractModel{

    /**
    * 实例Id，形如 tdsql-ow728lmc。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 切换的目标区域，会自动选择该可用区中延迟最低的节点。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

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
     * Get 切换的目标区域，会自动选择该可用区中延迟最低的节点。 
     * @return Zone 切换的目标区域，会自动选择该可用区中延迟最低的节点。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 切换的目标区域，会自动选择该可用区中延迟最低的节点。
     * @param Zone 切换的目标区域，会自动选择该可用区中延迟最低的节点。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}

