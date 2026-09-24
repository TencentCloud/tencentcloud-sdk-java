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

public class LakeHouseConnection extends AbstractModel {

    /**
    * <p>元数据服务id</p>
    */
    @SerializedName("MetastoreEndpointServiceId")
    @Expose
    private String MetastoreEndpointServiceId;

    /**
    * <p>endpoint服务id</p>
    */
    @SerializedName("EndpointServiceId")
    @Expose
    private String EndpointServiceId;

    /**
    * <p>元数据url</p>
    */
    @SerializedName("MetaStoreUrl")
    @Expose
    private String MetaStoreUrl;

    /**
    * <p>ranger信息</p>
    */
    @SerializedName("RangerConnection")
    @Expose
    private RangerConnection RangerConnection;

    /**
    * <p>hive版本</p>
    */
    @SerializedName("HiveVersion")
    @Expose
    private String HiveVersion;

    /**
    * <p>存储位置</p>
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * <p>网络信息</p>
    */
    @SerializedName("NetWork")
    @Expose
    private NetWork NetWork;

    /**
     * Get <p>元数据服务id</p> 
     * @return MetastoreEndpointServiceId <p>元数据服务id</p>
     */
    public String getMetastoreEndpointServiceId() {
        return this.MetastoreEndpointServiceId;
    }

    /**
     * Set <p>元数据服务id</p>
     * @param MetastoreEndpointServiceId <p>元数据服务id</p>
     */
    public void setMetastoreEndpointServiceId(String MetastoreEndpointServiceId) {
        this.MetastoreEndpointServiceId = MetastoreEndpointServiceId;
    }

    /**
     * Get <p>endpoint服务id</p> 
     * @return EndpointServiceId <p>endpoint服务id</p>
     */
    public String getEndpointServiceId() {
        return this.EndpointServiceId;
    }

    /**
     * Set <p>endpoint服务id</p>
     * @param EndpointServiceId <p>endpoint服务id</p>
     */
    public void setEndpointServiceId(String EndpointServiceId) {
        this.EndpointServiceId = EndpointServiceId;
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
     * Get <p>ranger信息</p> 
     * @return RangerConnection <p>ranger信息</p>
     */
    public RangerConnection getRangerConnection() {
        return this.RangerConnection;
    }

    /**
     * Set <p>ranger信息</p>
     * @param RangerConnection <p>ranger信息</p>
     */
    public void setRangerConnection(RangerConnection RangerConnection) {
        this.RangerConnection = RangerConnection;
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

    /**
     * Get <p>存储位置</p> 
     * @return Location <p>存储位置</p>
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set <p>存储位置</p>
     * @param Location <p>存储位置</p>
     */
    public void setLocation(String Location) {
        this.Location = Location;
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

    public LakeHouseConnection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LakeHouseConnection(LakeHouseConnection source) {
        if (source.MetastoreEndpointServiceId != null) {
            this.MetastoreEndpointServiceId = new String(source.MetastoreEndpointServiceId);
        }
        if (source.EndpointServiceId != null) {
            this.EndpointServiceId = new String(source.EndpointServiceId);
        }
        if (source.MetaStoreUrl != null) {
            this.MetaStoreUrl = new String(source.MetaStoreUrl);
        }
        if (source.RangerConnection != null) {
            this.RangerConnection = new RangerConnection(source.RangerConnection);
        }
        if (source.HiveVersion != null) {
            this.HiveVersion = new String(source.HiveVersion);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.NetWork != null) {
            this.NetWork = new NetWork(source.NetWork);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetastoreEndpointServiceId", this.MetastoreEndpointServiceId);
        this.setParamSimple(map, prefix + "EndpointServiceId", this.EndpointServiceId);
        this.setParamSimple(map, prefix + "MetaStoreUrl", this.MetaStoreUrl);
        this.setParamObj(map, prefix + "RangerConnection.", this.RangerConnection);
        this.setParamSimple(map, prefix + "HiveVersion", this.HiveVersion);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamObj(map, prefix + "NetWork.", this.NetWork);

    }
}

