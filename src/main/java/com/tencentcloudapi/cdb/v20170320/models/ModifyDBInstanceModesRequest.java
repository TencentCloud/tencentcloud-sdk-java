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

public class ModifyDBInstanceModesRequest extends AbstractModel {

    /**
    * 实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 云数据库的模式，目前仅支持传入 "protectMode" 表示修改主从同步方式。
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 数据同步方式，可选值：0-异步复制，1-半同步复制，2-强同步复制。
    */
    @SerializedName("ProtectMode")
    @Expose
    private Long ProtectMode;

    /**
     * Get 实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同。 
     * @return InstanceId 实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同。
     * @param InstanceId 实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 云数据库的模式，目前仅支持传入 "protectMode" 表示修改主从同步方式。 
     * @return Mode 云数据库的模式，目前仅支持传入 "protectMode" 表示修改主从同步方式。
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 云数据库的模式，目前仅支持传入 "protectMode" 表示修改主从同步方式。
     * @param Mode 云数据库的模式，目前仅支持传入 "protectMode" 表示修改主从同步方式。
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 数据同步方式，可选值：0-异步复制，1-半同步复制，2-强同步复制。 
     * @return ProtectMode 数据同步方式，可选值：0-异步复制，1-半同步复制，2-强同步复制。
     */
    public Long getProtectMode() {
        return this.ProtectMode;
    }

    /**
     * Set 数据同步方式，可选值：0-异步复制，1-半同步复制，2-强同步复制。
     * @param ProtectMode 数据同步方式，可选值：0-异步复制，1-半同步复制，2-强同步复制。
     */
    public void setProtectMode(Long ProtectMode) {
        this.ProtectMode = ProtectMode;
    }

    public ModifyDBInstanceModesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBInstanceModesRequest(ModifyDBInstanceModesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.ProtectMode != null) {
            this.ProtectMode = new Long(source.ProtectMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "ProtectMode", this.ProtectMode);

    }
}

