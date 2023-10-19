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

public class RDBInstance extends AbstractModel {

    /**
    * 数据源Id
    */
    @SerializedName("DataSourceId")
    @Expose
    private String DataSourceId;

    /**
    * cdb, dcdb, mariadb, postgres, cynosdbpg, cynosdbmysql, cos, mysql_like_proto, postgre_like_proto
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
    * 若未来扩展到DBName粒度，可采用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DBs")
    @Expose
    private DBStatements [] DBs;

    /**
     * Get 数据源Id 
     * @return DataSourceId 数据源Id
     */
    public String getDataSourceId() {
        return this.DataSourceId;
    }

    /**
     * Set 数据源Id
     * @param DataSourceId 数据源Id
     */
    public void setDataSourceId(String DataSourceId) {
        this.DataSourceId = DataSourceId;
    }

    /**
     * Get cdb, dcdb, mariadb, postgres, cynosdbpg, cynosdbmysql, cos, mysql_like_proto, postgre_like_proto 
     * @return DataSourceType cdb, dcdb, mariadb, postgres, cynosdbpg, cynosdbmysql, cos, mysql_like_proto, postgre_like_proto
     */
    public String getDataSourceType() {
        return this.DataSourceType;
    }

    /**
     * Set cdb, dcdb, mariadb, postgres, cynosdbpg, cynosdbmysql, cos, mysql_like_proto, postgre_like_proto
     * @param DataSourceType cdb, dcdb, mariadb, postgres, cynosdbpg, cynosdbmysql, cos, mysql_like_proto, postgre_like_proto
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
     * Get 若未来扩展到DBName粒度，可采用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DBs 若未来扩展到DBName粒度，可采用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DBStatements [] getDBs() {
        return this.DBs;
    }

    /**
     * Set 若未来扩展到DBName粒度，可采用
注意：此字段可能返回 null，表示取不到有效值。
     * @param DBs 若未来扩展到DBName粒度，可采用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDBs(DBStatements [] DBs) {
        this.DBs = DBs;
    }

    public RDBInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RDBInstance(RDBInstance source) {
        if (source.DataSourceId != null) {
            this.DataSourceId = new String(source.DataSourceId);
        }
        if (source.DataSourceType != null) {
            this.DataSourceType = new String(source.DataSourceType);
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
        if (source.DBs != null) {
            this.DBs = new DBStatements[source.DBs.length];
            for (int i = 0; i < source.DBs.length; i++) {
                this.DBs[i] = new DBStatements(source.DBs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataSourceId", this.DataSourceId);
        this.setParamSimple(map, prefix + "DataSourceType", this.DataSourceType);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamArrayObj(map, prefix + "DBs.", this.DBs);

    }
}

