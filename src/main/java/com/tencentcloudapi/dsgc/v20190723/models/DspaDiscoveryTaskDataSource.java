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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspaDiscoveryTaskDataSource extends AbstractModel {

    /**
    * 数据源ID
    */
    @SerializedName("DataSourceId")
    @Expose
    private String DataSourceId;

    /**
    * 用于传入的数据源的条件，可以选择多个数据库，数据库之间通过逗号分隔，如果为空，默认是全部数据库
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * 代理地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyAddress")
    @Expose
    private String [] ProxyAddress;

    /**
    * 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataSourceName")
    @Expose
    private String DataSourceName;

    /**
    * 资源所在地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataSourceType")
    @Expose
    private String DataSourceType;

    /**
     * Get 数据源ID 
     * @return DataSourceId 数据源ID
     */
    public String getDataSourceId() {
        return this.DataSourceId;
    }

    /**
     * Set 数据源ID
     * @param DataSourceId 数据源ID
     */
    public void setDataSourceId(String DataSourceId) {
        this.DataSourceId = DataSourceId;
    }

    /**
     * Get 用于传入的数据源的条件，可以选择多个数据库，数据库之间通过逗号分隔，如果为空，默认是全部数据库 
     * @return Condition 用于传入的数据源的条件，可以选择多个数据库，数据库之间通过逗号分隔，如果为空，默认是全部数据库
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set 用于传入的数据源的条件，可以选择多个数据库，数据库之间通过逗号分隔，如果为空，默认是全部数据库
     * @param Condition 用于传入的数据源的条件，可以选择多个数据库，数据库之间通过逗号分隔，如果为空，默认是全部数据库
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get 代理地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyAddress 代理地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getProxyAddress() {
        return this.ProxyAddress;
    }

    /**
     * Set 代理地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyAddress 代理地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyAddress(String [] ProxyAddress) {
        this.ProxyAddress = ProxyAddress;
    }

    /**
     * Get 数据源名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataSourceName 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataSourceName() {
        return this.DataSourceName;
    }

    /**
     * Set 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataSourceName 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataSourceName(String DataSourceName) {
        this.DataSourceName = DataSourceName;
    }

    /**
     * Get 资源所在地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceRegion 资源所在地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set 资源所在地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceRegion 资源所在地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get 数据源类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataSourceType 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataSourceType() {
        return this.DataSourceType;
    }

    /**
     * Set 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataSourceType 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataSourceType(String DataSourceType) {
        this.DataSourceType = DataSourceType;
    }

    public DspaDiscoveryTaskDataSource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspaDiscoveryTaskDataSource(DspaDiscoveryTaskDataSource source) {
        if (source.DataSourceId != null) {
            this.DataSourceId = new String(source.DataSourceId);
        }
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.ProxyAddress != null) {
            this.ProxyAddress = new String[source.ProxyAddress.length];
            for (int i = 0; i < source.ProxyAddress.length; i++) {
                this.ProxyAddress[i] = new String(source.ProxyAddress[i]);
            }
        }
        if (source.DataSourceName != null) {
            this.DataSourceName = new String(source.DataSourceName);
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
        if (source.DataSourceType != null) {
            this.DataSourceType = new String(source.DataSourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataSourceId", this.DataSourceId);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamArraySimple(map, prefix + "ProxyAddress.", this.ProxyAddress);
        this.setParamSimple(map, prefix + "DataSourceName", this.DataSourceName);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "DataSourceType", this.DataSourceType);

    }
}

