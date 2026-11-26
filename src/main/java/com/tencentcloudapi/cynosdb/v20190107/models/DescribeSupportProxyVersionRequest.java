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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSupportProxyVersionRequest extends AbstractModel {

    /**
    * <p>集群ID。与Zone/DbVersion/CynosVersion二选一：查询存量集群支持的代理版本时必填；不传时表示创建集群前查询场景，需同时传入Zone、DbVersion、CynosVersion</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>数据库代理组ID。仅在传入ClusterId时有效，传入时返回当前代理版本号</p>
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * <p>可用区，如ap-guangzhou-3。创建集群前查询场景（不传ClusterId时）必填</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>数据库引擎版本，如5.7、8.0。创建集群前查询场景（不传ClusterId时）必填</p>
    */
    @SerializedName("DbVersion")
    @Expose
    private String DbVersion;

    /**
    * <p>目标内核版本，如3.1.20.001。创建集群前查询场景（不传ClusterId时）必填</p>
    */
    @SerializedName("CynosVersion")
    @Expose
    private String CynosVersion;

    /**
    * <p>存储版本，枚举值：1.0、2.0。可选，仅创建集群前查询场景有效</p>
    */
    @SerializedName("StorageVersion")
    @Expose
    private String StorageVersion;

    /**
     * Get <p>集群ID。与Zone/DbVersion/CynosVersion二选一：查询存量集群支持的代理版本时必填；不传时表示创建集群前查询场景，需同时传入Zone、DbVersion、CynosVersion</p> 
     * @return ClusterId <p>集群ID。与Zone/DbVersion/CynosVersion二选一：查询存量集群支持的代理版本时必填；不传时表示创建集群前查询场景，需同时传入Zone、DbVersion、CynosVersion</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID。与Zone/DbVersion/CynosVersion二选一：查询存量集群支持的代理版本时必填；不传时表示创建集群前查询场景，需同时传入Zone、DbVersion、CynosVersion</p>
     * @param ClusterId <p>集群ID。与Zone/DbVersion/CynosVersion二选一：查询存量集群支持的代理版本时必填；不传时表示创建集群前查询场景，需同时传入Zone、DbVersion、CynosVersion</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>数据库代理组ID。仅在传入ClusterId时有效，传入时返回当前代理版本号</p> 
     * @return ProxyGroupId <p>数据库代理组ID。仅在传入ClusterId时有效，传入时返回当前代理版本号</p>
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set <p>数据库代理组ID。仅在传入ClusterId时有效，传入时返回当前代理版本号</p>
     * @param ProxyGroupId <p>数据库代理组ID。仅在传入ClusterId时有效，传入时返回当前代理版本号</p>
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get <p>可用区，如ap-guangzhou-3。创建集群前查询场景（不传ClusterId时）必填</p> 
     * @return Zone <p>可用区，如ap-guangzhou-3。创建集群前查询场景（不传ClusterId时）必填</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区，如ap-guangzhou-3。创建集群前查询场景（不传ClusterId时）必填</p>
     * @param Zone <p>可用区，如ap-guangzhou-3。创建集群前查询场景（不传ClusterId时）必填</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>数据库引擎版本，如5.7、8.0。创建集群前查询场景（不传ClusterId时）必填</p> 
     * @return DbVersion <p>数据库引擎版本，如5.7、8.0。创建集群前查询场景（不传ClusterId时）必填</p>
     */
    public String getDbVersion() {
        return this.DbVersion;
    }

    /**
     * Set <p>数据库引擎版本，如5.7、8.0。创建集群前查询场景（不传ClusterId时）必填</p>
     * @param DbVersion <p>数据库引擎版本，如5.7、8.0。创建集群前查询场景（不传ClusterId时）必填</p>
     */
    public void setDbVersion(String DbVersion) {
        this.DbVersion = DbVersion;
    }

    /**
     * Get <p>目标内核版本，如3.1.20.001。创建集群前查询场景（不传ClusterId时）必填</p> 
     * @return CynosVersion <p>目标内核版本，如3.1.20.001。创建集群前查询场景（不传ClusterId时）必填</p>
     */
    public String getCynosVersion() {
        return this.CynosVersion;
    }

    /**
     * Set <p>目标内核版本，如3.1.20.001。创建集群前查询场景（不传ClusterId时）必填</p>
     * @param CynosVersion <p>目标内核版本，如3.1.20.001。创建集群前查询场景（不传ClusterId时）必填</p>
     */
    public void setCynosVersion(String CynosVersion) {
        this.CynosVersion = CynosVersion;
    }

    /**
     * Get <p>存储版本，枚举值：1.0、2.0。可选，仅创建集群前查询场景有效</p> 
     * @return StorageVersion <p>存储版本，枚举值：1.0、2.0。可选，仅创建集群前查询场景有效</p>
     */
    public String getStorageVersion() {
        return this.StorageVersion;
    }

    /**
     * Set <p>存储版本，枚举值：1.0、2.0。可选，仅创建集群前查询场景有效</p>
     * @param StorageVersion <p>存储版本，枚举值：1.0、2.0。可选，仅创建集群前查询场景有效</p>
     */
    public void setStorageVersion(String StorageVersion) {
        this.StorageVersion = StorageVersion;
    }

    public DescribeSupportProxyVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSupportProxyVersionRequest(DescribeSupportProxyVersionRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.DbVersion != null) {
            this.DbVersion = new String(source.DbVersion);
        }
        if (source.CynosVersion != null) {
            this.CynosVersion = new String(source.CynosVersion);
        }
        if (source.StorageVersion != null) {
            this.StorageVersion = new String(source.StorageVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "DbVersion", this.DbVersion);
        this.setParamSimple(map, prefix + "CynosVersion", this.CynosVersion);
        this.setParamSimple(map, prefix + "StorageVersion", this.StorageVersion);

    }
}

