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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NOSQLInstance extends AbstractModel{

    /**
    * 数据源id
    */
    @SerializedName("DataSourceId")
    @Expose
    private String DataSourceId;

    /**
    * cdb, dcdb, mariadb, postgres, cynosdbpg, cynosdbmysql, cos, mysql_like_proto, postgre_like_proto,mongodb
    */
    @SerializedName("DataSourceType")
    @Expose
    private String DataSourceType;

    /**
    * 资源所在地域
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * 根据实例创建的敏感数据识别扫描任务Id
    */
    @SerializedName("DiscoveryTaskId")
    @Expose
    private Long DiscoveryTaskId;

    /**
    * 敏感数据识别任务实例id
    */
    @SerializedName("DiscoveryTaskInstanceID")
    @Expose
    private Long DiscoveryTaskInstanceID;

    /**
     * Get 数据源id 
     * @return DataSourceId 数据源id
     */
    public String getDataSourceId() {
        return this.DataSourceId;
    }

    /**
     * Set 数据源id
     * @param DataSourceId 数据源id
     */
    public void setDataSourceId(String DataSourceId) {
        this.DataSourceId = DataSourceId;
    }

    /**
     * Get cdb, dcdb, mariadb, postgres, cynosdbpg, cynosdbmysql, cos, mysql_like_proto, postgre_like_proto,mongodb 
     * @return DataSourceType cdb, dcdb, mariadb, postgres, cynosdbpg, cynosdbmysql, cos, mysql_like_proto, postgre_like_proto,mongodb
     */
    public String getDataSourceType() {
        return this.DataSourceType;
    }

    /**
     * Set cdb, dcdb, mariadb, postgres, cynosdbpg, cynosdbmysql, cos, mysql_like_proto, postgre_like_proto,mongodb
     * @param DataSourceType cdb, dcdb, mariadb, postgres, cynosdbpg, cynosdbmysql, cos, mysql_like_proto, postgre_like_proto,mongodb
     */
    public void setDataSourceType(String DataSourceType) {
        this.DataSourceType = DataSourceType;
    }

    /**
     * Get 资源所在地域 
     * @return ResourceRegion 资源所在地域
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set 资源所在地域
     * @param ResourceRegion 资源所在地域
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get 根据实例创建的敏感数据识别扫描任务Id 
     * @return DiscoveryTaskId 根据实例创建的敏感数据识别扫描任务Id
     */
    public Long getDiscoveryTaskId() {
        return this.DiscoveryTaskId;
    }

    /**
     * Set 根据实例创建的敏感数据识别扫描任务Id
     * @param DiscoveryTaskId 根据实例创建的敏感数据识别扫描任务Id
     */
    public void setDiscoveryTaskId(Long DiscoveryTaskId) {
        this.DiscoveryTaskId = DiscoveryTaskId;
    }

    /**
     * Get 敏感数据识别任务实例id 
     * @return DiscoveryTaskInstanceID 敏感数据识别任务实例id
     */
    public Long getDiscoveryTaskInstanceID() {
        return this.DiscoveryTaskInstanceID;
    }

    /**
     * Set 敏感数据识别任务实例id
     * @param DiscoveryTaskInstanceID 敏感数据识别任务实例id
     */
    public void setDiscoveryTaskInstanceID(Long DiscoveryTaskInstanceID) {
        this.DiscoveryTaskInstanceID = DiscoveryTaskInstanceID;
    }

    public NOSQLInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NOSQLInstance(NOSQLInstance source) {
        if (source.DataSourceId != null) {
            this.DataSourceId = new String(source.DataSourceId);
        }
        if (source.DataSourceType != null) {
            this.DataSourceType = new String(source.DataSourceType);
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
        if (source.DiscoveryTaskId != null) {
            this.DiscoveryTaskId = new Long(source.DiscoveryTaskId);
        }
        if (source.DiscoveryTaskInstanceID != null) {
            this.DiscoveryTaskInstanceID = new Long(source.DiscoveryTaskInstanceID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataSourceId", this.DataSourceId);
        this.setParamSimple(map, prefix + "DataSourceType", this.DataSourceType);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "DiscoveryTaskId", this.DiscoveryTaskId);
        this.setParamSimple(map, prefix + "DiscoveryTaskInstanceID", this.DiscoveryTaskInstanceID);

    }
}

