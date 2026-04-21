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
    * <p>实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>云数据库的模式，目前仅支持传入 &quot;protectMode&quot; 表示修改主从同步方式。</p>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>数据同步方式，可选值：0-异步复制，1-半同步复制，2-强同步复制。</p>
    */
    @SerializedName("ProtectMode")
    @Expose
    private Long ProtectMode;

    /**
     * Get <p>实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同。</p> 
     * @return InstanceId <p>实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同。</p>
     * @param InstanceId <p>实例ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例ID相同。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>云数据库的模式，目前仅支持传入 &quot;protectMode&quot; 表示修改主从同步方式。</p> 
     * @return Mode <p>云数据库的模式，目前仅支持传入 &quot;protectMode&quot; 表示修改主从同步方式。</p>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>云数据库的模式，目前仅支持传入 &quot;protectMode&quot; 表示修改主从同步方式。</p>
     * @param Mode <p>云数据库的模式，目前仅支持传入 &quot;protectMode&quot; 表示修改主从同步方式。</p>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>数据同步方式，可选值：0-异步复制，1-半同步复制，2-强同步复制。</p> 
     * @return ProtectMode <p>数据同步方式，可选值：0-异步复制，1-半同步复制，2-强同步复制。</p>
     */
    public Long getProtectMode() {
        return this.ProtectMode;
    }

    /**
     * Set <p>数据同步方式，可选值：0-异步复制，1-半同步复制，2-强同步复制。</p>
     * @param ProtectMode <p>数据同步方式，可选值：0-异步复制，1-半同步复制，2-强同步复制。</p>
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

