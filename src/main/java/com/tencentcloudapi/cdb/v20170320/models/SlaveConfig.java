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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlaveConfig extends AbstractModel{

    /**
    * 从库复制方式，可能的返回值：aysnc-异步，semisync-半同步
    */
    @SerializedName("ReplicationMode")
    @Expose
    private String ReplicationMode;

    /**
    * 从库可用区的正式名称，如ap-shanghai-1
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
     * Get 从库复制方式，可能的返回值：aysnc-异步，semisync-半同步 
     * @return ReplicationMode 从库复制方式，可能的返回值：aysnc-异步，semisync-半同步
     */
    public String getReplicationMode() {
        return this.ReplicationMode;
    }

    /**
     * Set 从库复制方式，可能的返回值：aysnc-异步，semisync-半同步
     * @param ReplicationMode 从库复制方式，可能的返回值：aysnc-异步，semisync-半同步
     */
    public void setReplicationMode(String ReplicationMode) {
        this.ReplicationMode = ReplicationMode;
    }

    /**
     * Get 从库可用区的正式名称，如ap-shanghai-1 
     * @return Zone 从库可用区的正式名称，如ap-shanghai-1
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 从库可用区的正式名称，如ap-shanghai-1
     * @param Zone 从库可用区的正式名称，如ap-shanghai-1
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReplicationMode", this.ReplicationMode);
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}

