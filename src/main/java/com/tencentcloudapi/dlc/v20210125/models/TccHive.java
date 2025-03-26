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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TccHive extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 终端节点服务ID
    */
    @SerializedName("EndpointServiceId")
    @Expose
    private String EndpointServiceId;

    /**
    * thrift连接地址
    */
    @SerializedName("MetaStoreUrl")
    @Expose
    private String MetaStoreUrl;

    /**
    * hive版本
    */
    @SerializedName("HiveVersion")
    @Expose
    private String HiveVersion;

    /**
    * 网络信息
    */
    @SerializedName("TccConnection")
    @Expose
    private NetWork TccConnection;

    /**
    * Hms终端节点服务ID
    */
    @SerializedName("HmsEndpointServiceId")
    @Expose
    private String HmsEndpointServiceId;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 终端节点服务ID 
     * @return EndpointServiceId 终端节点服务ID
     */
    public String getEndpointServiceId() {
        return this.EndpointServiceId;
    }

    /**
     * Set 终端节点服务ID
     * @param EndpointServiceId 终端节点服务ID
     */
    public void setEndpointServiceId(String EndpointServiceId) {
        this.EndpointServiceId = EndpointServiceId;
    }

    /**
     * Get thrift连接地址 
     * @return MetaStoreUrl thrift连接地址
     */
    public String getMetaStoreUrl() {
        return this.MetaStoreUrl;
    }

    /**
     * Set thrift连接地址
     * @param MetaStoreUrl thrift连接地址
     */
    public void setMetaStoreUrl(String MetaStoreUrl) {
        this.MetaStoreUrl = MetaStoreUrl;
    }

    /**
     * Get hive版本 
     * @return HiveVersion hive版本
     */
    public String getHiveVersion() {
        return this.HiveVersion;
    }

    /**
     * Set hive版本
     * @param HiveVersion hive版本
     */
    public void setHiveVersion(String HiveVersion) {
        this.HiveVersion = HiveVersion;
    }

    /**
     * Get 网络信息 
     * @return TccConnection 网络信息
     */
    public NetWork getTccConnection() {
        return this.TccConnection;
    }

    /**
     * Set 网络信息
     * @param TccConnection 网络信息
     */
    public void setTccConnection(NetWork TccConnection) {
        this.TccConnection = TccConnection;
    }

    /**
     * Get Hms终端节点服务ID 
     * @return HmsEndpointServiceId Hms终端节点服务ID
     */
    public String getHmsEndpointServiceId() {
        return this.HmsEndpointServiceId;
    }

    /**
     * Set Hms终端节点服务ID
     * @param HmsEndpointServiceId Hms终端节点服务ID
     */
    public void setHmsEndpointServiceId(String HmsEndpointServiceId) {
        this.HmsEndpointServiceId = HmsEndpointServiceId;
    }

    public TccHive() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TccHive(TccHive source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.EndpointServiceId != null) {
            this.EndpointServiceId = new String(source.EndpointServiceId);
        }
        if (source.MetaStoreUrl != null) {
            this.MetaStoreUrl = new String(source.MetaStoreUrl);
        }
        if (source.HiveVersion != null) {
            this.HiveVersion = new String(source.HiveVersion);
        }
        if (source.TccConnection != null) {
            this.TccConnection = new NetWork(source.TccConnection);
        }
        if (source.HmsEndpointServiceId != null) {
            this.HmsEndpointServiceId = new String(source.HmsEndpointServiceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "EndpointServiceId", this.EndpointServiceId);
        this.setParamSimple(map, prefix + "MetaStoreUrl", this.MetaStoreUrl);
        this.setParamSimple(map, prefix + "HiveVersion", this.HiveVersion);
        this.setParamObj(map, prefix + "TccConnection.", this.TccConnection);
        this.setParamSimple(map, prefix + "HmsEndpointServiceId", this.HmsEndpointServiceId);

    }
}

