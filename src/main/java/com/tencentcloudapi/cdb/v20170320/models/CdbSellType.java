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

public class CdbSellType extends AbstractModel {

    /**
    * <p>售卖实例名称。<br>Z3：是高可用类型，对应规格中的 DeviceType，包含 UNIVERSAL，EXCLUSIVE。<br>CVM：是基础版类型，对应规格中的 DeviceType 是 BASIC（已下线）。<br>TKE：是基础版v2类型，对应规格中的 DeviceType 是 BASIC_V2。<br>CLOUD_NATIVE_CLUSTER：表示云盘版标准型。<br>CLOUD_NATIVE_CLUSTER_EXCLUSIVE：表示云盘版加强型。<br>CLOUD_NATIVE_CLUSTER_ULTRA：表示云盘版旗舰型。<br>CLOUD_NATIVE_SINGLE_NODE：表示云盘版单节点<br>ECONOMICAL：表示经济型。</p>
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * <p>引擎版本号</p>
    */
    @SerializedName("EngineVersion")
    @Expose
    private String [] EngineVersion;

    /**
    * <p>售卖规格Id</p>
    */
    @SerializedName("ConfigIds")
    @Expose
    private Long [] ConfigIds;

    /**
     * Get <p>售卖实例名称。<br>Z3：是高可用类型，对应规格中的 DeviceType，包含 UNIVERSAL，EXCLUSIVE。<br>CVM：是基础版类型，对应规格中的 DeviceType 是 BASIC（已下线）。<br>TKE：是基础版v2类型，对应规格中的 DeviceType 是 BASIC_V2。<br>CLOUD_NATIVE_CLUSTER：表示云盘版标准型。<br>CLOUD_NATIVE_CLUSTER_EXCLUSIVE：表示云盘版加强型。<br>CLOUD_NATIVE_CLUSTER_ULTRA：表示云盘版旗舰型。<br>CLOUD_NATIVE_SINGLE_NODE：表示云盘版单节点<br>ECONOMICAL：表示经济型。</p> 
     * @return TypeName <p>售卖实例名称。<br>Z3：是高可用类型，对应规格中的 DeviceType，包含 UNIVERSAL，EXCLUSIVE。<br>CVM：是基础版类型，对应规格中的 DeviceType 是 BASIC（已下线）。<br>TKE：是基础版v2类型，对应规格中的 DeviceType 是 BASIC_V2。<br>CLOUD_NATIVE_CLUSTER：表示云盘版标准型。<br>CLOUD_NATIVE_CLUSTER_EXCLUSIVE：表示云盘版加强型。<br>CLOUD_NATIVE_CLUSTER_ULTRA：表示云盘版旗舰型。<br>CLOUD_NATIVE_SINGLE_NODE：表示云盘版单节点<br>ECONOMICAL：表示经济型。</p>
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set <p>售卖实例名称。<br>Z3：是高可用类型，对应规格中的 DeviceType，包含 UNIVERSAL，EXCLUSIVE。<br>CVM：是基础版类型，对应规格中的 DeviceType 是 BASIC（已下线）。<br>TKE：是基础版v2类型，对应规格中的 DeviceType 是 BASIC_V2。<br>CLOUD_NATIVE_CLUSTER：表示云盘版标准型。<br>CLOUD_NATIVE_CLUSTER_EXCLUSIVE：表示云盘版加强型。<br>CLOUD_NATIVE_CLUSTER_ULTRA：表示云盘版旗舰型。<br>CLOUD_NATIVE_SINGLE_NODE：表示云盘版单节点<br>ECONOMICAL：表示经济型。</p>
     * @param TypeName <p>售卖实例名称。<br>Z3：是高可用类型，对应规格中的 DeviceType，包含 UNIVERSAL，EXCLUSIVE。<br>CVM：是基础版类型，对应规格中的 DeviceType 是 BASIC（已下线）。<br>TKE：是基础版v2类型，对应规格中的 DeviceType 是 BASIC_V2。<br>CLOUD_NATIVE_CLUSTER：表示云盘版标准型。<br>CLOUD_NATIVE_CLUSTER_EXCLUSIVE：表示云盘版加强型。<br>CLOUD_NATIVE_CLUSTER_ULTRA：表示云盘版旗舰型。<br>CLOUD_NATIVE_SINGLE_NODE：表示云盘版单节点<br>ECONOMICAL：表示经济型。</p>
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
    }

    /**
     * Get <p>引擎版本号</p> 
     * @return EngineVersion <p>引擎版本号</p>
     */
    public String [] getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set <p>引擎版本号</p>
     * @param EngineVersion <p>引擎版本号</p>
     */
    public void setEngineVersion(String [] EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get <p>售卖规格Id</p> 
     * @return ConfigIds <p>售卖规格Id</p>
     */
    public Long [] getConfigIds() {
        return this.ConfigIds;
    }

    /**
     * Set <p>售卖规格Id</p>
     * @param ConfigIds <p>售卖规格Id</p>
     */
    public void setConfigIds(Long [] ConfigIds) {
        this.ConfigIds = ConfigIds;
    }

    public CdbSellType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CdbSellType(CdbSellType source) {
        if (source.TypeName != null) {
            this.TypeName = new String(source.TypeName);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new String[source.EngineVersion.length];
            for (int i = 0; i < source.EngineVersion.length; i++) {
                this.EngineVersion[i] = new String(source.EngineVersion[i]);
            }
        }
        if (source.ConfigIds != null) {
            this.ConfigIds = new Long[source.ConfigIds.length];
            for (int i = 0; i < source.ConfigIds.length; i++) {
                this.ConfigIds[i] = new Long(source.ConfigIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamArraySimple(map, prefix + "EngineVersion.", this.EngineVersion);
        this.setParamArraySimple(map, prefix + "ConfigIds.", this.ConfigIds);

    }
}

