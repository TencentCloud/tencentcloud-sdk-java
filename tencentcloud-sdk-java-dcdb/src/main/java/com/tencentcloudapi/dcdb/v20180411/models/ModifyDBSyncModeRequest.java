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

public class ModifyDBSyncModeRequest extends AbstractModel{

    /**
    * 待修改同步模式的实例ID。形如：dcdbt-ow728lmc。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 同步模式：0 异步，1 强同步， 2 强同步可退化
    */
    @SerializedName("SyncMode")
    @Expose
    private Long SyncMode;

    /**
     * Get 待修改同步模式的实例ID。形如：dcdbt-ow728lmc。 
     * @return InstanceId 待修改同步模式的实例ID。形如：dcdbt-ow728lmc。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 待修改同步模式的实例ID。形如：dcdbt-ow728lmc。
     * @param InstanceId 待修改同步模式的实例ID。形如：dcdbt-ow728lmc。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 同步模式：0 异步，1 强同步， 2 强同步可退化 
     * @return SyncMode 同步模式：0 异步，1 强同步， 2 强同步可退化
     */
    public Long getSyncMode() {
        return this.SyncMode;
    }

    /**
     * Set 同步模式：0 异步，1 强同步， 2 强同步可退化
     * @param SyncMode 同步模式：0 异步，1 强同步， 2 强同步可退化
     */
    public void setSyncMode(Long SyncMode) {
        this.SyncMode = SyncMode;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SyncMode", this.SyncMode);

    }
}

