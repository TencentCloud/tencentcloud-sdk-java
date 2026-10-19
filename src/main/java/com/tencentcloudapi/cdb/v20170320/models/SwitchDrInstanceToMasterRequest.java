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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SwitchDrInstanceToMasterRequest extends AbstractModel {

    /**
    * <p>灾备实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>忽略同步延迟的阈值，不填默认为0表示完全等待追平</p><p>取值范围：[0, 104857600]</p><p>默认值：0</p>
    */
    @SerializedName("IgnoreSyncDelay")
    @Expose
    private Long IgnoreSyncDelay;

    /**
     * Get <p>灾备实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。</p> 
     * @return InstanceId <p>灾备实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>灾备实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。</p>
     * @param InstanceId <p>灾备实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>忽略同步延迟的阈值，不填默认为0表示完全等待追平</p><p>取值范围：[0, 104857600]</p><p>默认值：0</p> 
     * @return IgnoreSyncDelay <p>忽略同步延迟的阈值，不填默认为0表示完全等待追平</p><p>取值范围：[0, 104857600]</p><p>默认值：0</p>
     */
    public Long getIgnoreSyncDelay() {
        return this.IgnoreSyncDelay;
    }

    /**
     * Set <p>忽略同步延迟的阈值，不填默认为0表示完全等待追平</p><p>取值范围：[0, 104857600]</p><p>默认值：0</p>
     * @param IgnoreSyncDelay <p>忽略同步延迟的阈值，不填默认为0表示完全等待追平</p><p>取值范围：[0, 104857600]</p><p>默认值：0</p>
     */
    public void setIgnoreSyncDelay(Long IgnoreSyncDelay) {
        this.IgnoreSyncDelay = IgnoreSyncDelay;
    }

    public SwitchDrInstanceToMasterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SwitchDrInstanceToMasterRequest(SwitchDrInstanceToMasterRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.IgnoreSyncDelay != null) {
            this.IgnoreSyncDelay = new Long(source.IgnoreSyncDelay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "IgnoreSyncDelay", this.IgnoreSyncDelay);

    }
}

