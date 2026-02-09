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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MySQLClusterDetail extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("DbClusterId")
    @Expose
    private String DbClusterId;

    /**
    * 网络详情
    */
    @SerializedName("NetInfo")
    @Expose
    private MySQLNetDetail NetInfo;

    /**
    * 数据库详情
    */
    @SerializedName("DbInfo")
    @Expose
    private ClusterDetail DbInfo;

    /**
     * Get 集群ID 
     * @return DbClusterId 集群ID
     */
    public String getDbClusterId() {
        return this.DbClusterId;
    }

    /**
     * Set 集群ID
     * @param DbClusterId 集群ID
     */
    public void setDbClusterId(String DbClusterId) {
        this.DbClusterId = DbClusterId;
    }

    /**
     * Get 网络详情 
     * @return NetInfo 网络详情
     */
    public MySQLNetDetail getNetInfo() {
        return this.NetInfo;
    }

    /**
     * Set 网络详情
     * @param NetInfo 网络详情
     */
    public void setNetInfo(MySQLNetDetail NetInfo) {
        this.NetInfo = NetInfo;
    }

    /**
     * Get 数据库详情 
     * @return DbInfo 数据库详情
     */
    public ClusterDetail getDbInfo() {
        return this.DbInfo;
    }

    /**
     * Set 数据库详情
     * @param DbInfo 数据库详情
     */
    public void setDbInfo(ClusterDetail DbInfo) {
        this.DbInfo = DbInfo;
    }

    public MySQLClusterDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MySQLClusterDetail(MySQLClusterDetail source) {
        if (source.DbClusterId != null) {
            this.DbClusterId = new String(source.DbClusterId);
        }
        if (source.NetInfo != null) {
            this.NetInfo = new MySQLNetDetail(source.NetInfo);
        }
        if (source.DbInfo != null) {
            this.DbInfo = new ClusterDetail(source.DbInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DbClusterId", this.DbClusterId);
        this.setParamObj(map, prefix + "NetInfo.", this.NetInfo);
        this.setParamObj(map, prefix + "DbInfo.", this.DbInfo);

    }
}

