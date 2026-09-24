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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HiveConnection extends AbstractModel {

    /**
    * <p>实例id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>元数据url</p>
    */
    @SerializedName("MetaStoreUrl")
    @Expose
    private String MetaStoreUrl;

    /**
    * <p>网络信息</p>
    */
    @SerializedName("NetWork")
    @Expose
    private NetWork NetWork;

    /**
    * <p>hive版本</p>
    */
    @SerializedName("HiveVersion")
    @Expose
    private String HiveVersion;

    /**
     * Get <p>实例id</p> 
     * @return InstanceId <p>实例id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例id</p>
     * @param InstanceId <p>实例id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例名称</p> 
     * @return InstanceName <p>实例名称</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称</p>
     * @param InstanceName <p>实例名称</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>元数据url</p> 
     * @return MetaStoreUrl <p>元数据url</p>
     */
    public String getMetaStoreUrl() {
        return this.MetaStoreUrl;
    }

    /**
     * Set <p>元数据url</p>
     * @param MetaStoreUrl <p>元数据url</p>
     */
    public void setMetaStoreUrl(String MetaStoreUrl) {
        this.MetaStoreUrl = MetaStoreUrl;
    }

    /**
     * Get <p>网络信息</p> 
     * @return NetWork <p>网络信息</p>
     */
    public NetWork getNetWork() {
        return this.NetWork;
    }

    /**
     * Set <p>网络信息</p>
     * @param NetWork <p>网络信息</p>
     */
    public void setNetWork(NetWork NetWork) {
        this.NetWork = NetWork;
    }

    /**
     * Get <p>hive版本</p> 
     * @return HiveVersion <p>hive版本</p>
     */
    public String getHiveVersion() {
        return this.HiveVersion;
    }

    /**
     * Set <p>hive版本</p>
     * @param HiveVersion <p>hive版本</p>
     */
    public void setHiveVersion(String HiveVersion) {
        this.HiveVersion = HiveVersion;
    }

    public HiveConnection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HiveConnection(HiveConnection source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.MetaStoreUrl != null) {
            this.MetaStoreUrl = new String(source.MetaStoreUrl);
        }
        if (source.NetWork != null) {
            this.NetWork = new NetWork(source.NetWork);
        }
        if (source.HiveVersion != null) {
            this.HiveVersion = new String(source.HiveVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "MetaStoreUrl", this.MetaStoreUrl);
        this.setParamObj(map, prefix + "NetWork.", this.NetWork);
        this.setParamSimple(map, prefix + "HiveVersion", this.HiveVersion);

    }
}

