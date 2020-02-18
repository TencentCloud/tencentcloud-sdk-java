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

public class BackupConfig extends AbstractModel{

    /**
    * 第二个从库复制方式，可能的返回值：async-异步，semisync-半同步
    */
    @SerializedName("ReplicationMode")
    @Expose
    private String ReplicationMode;

    /**
    * 第二个从库可用区的正式名称，如ap-shanghai-1
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 第二个从库内网IP地址
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 第二个从库访问端口
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
     * Get 第二个从库复制方式，可能的返回值：async-异步，semisync-半同步 
     * @return ReplicationMode 第二个从库复制方式，可能的返回值：async-异步，semisync-半同步
     */
    public String getReplicationMode() {
        return this.ReplicationMode;
    }

    /**
     * Set 第二个从库复制方式，可能的返回值：async-异步，semisync-半同步
     * @param ReplicationMode 第二个从库复制方式，可能的返回值：async-异步，semisync-半同步
     */
    public void setReplicationMode(String ReplicationMode) {
        this.ReplicationMode = ReplicationMode;
    }

    /**
     * Get 第二个从库可用区的正式名称，如ap-shanghai-1 
     * @return Zone 第二个从库可用区的正式名称，如ap-shanghai-1
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 第二个从库可用区的正式名称，如ap-shanghai-1
     * @param Zone 第二个从库可用区的正式名称，如ap-shanghai-1
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 第二个从库内网IP地址 
     * @return Vip 第二个从库内网IP地址
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 第二个从库内网IP地址
     * @param Vip 第二个从库内网IP地址
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 第二个从库访问端口 
     * @return Vport 第二个从库访问端口
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set 第二个从库访问端口
     * @param Vport 第二个从库访问端口
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReplicationMode", this.ReplicationMode);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);

    }
}

