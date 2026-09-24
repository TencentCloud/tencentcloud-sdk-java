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

public class ConnectionConfig extends AbstractModel {

    /**
    * <p>mysql数据源连接信息</p>
    */
    @SerializedName("MysqlConnection")
    @Expose
    private MysqlConnection MysqlConnection;

    /**
    * <p>hive数据源连接信息</p>
    */
    @SerializedName("EmrHiveConnection")
    @Expose
    private HiveConnection EmrHiveConnection;

    /**
    * <p>doris数据源连接信息</p>
    */
    @SerializedName("TCHouseDConnection")
    @Expose
    private DorisConnection TCHouseDConnection;

    /**
    * <p>数据卷连接信息</p>
    */
    @SerializedName("VolumeConnection")
    @Expose
    private VolumeConnection VolumeConnection;

    /**
    * <p>lakehouse连接信息</p>
    */
    @SerializedName("LakeHouseConnection")
    @Expose
    private LakeHouseConnection LakeHouseConnection;

    /**
    * <p>PostgreSQL数据源连接信息</p>
    */
    @SerializedName("PostgreSQLConnection")
    @Expose
    private PostgreSQLConnection PostgreSQLConnection;

    /**
    * <p>dlc数据源连接信息</p>
    */
    @SerializedName("DlcConnection")
    @Expose
    private DlcConnection DlcConnection;

    /**
     * Get <p>mysql数据源连接信息</p> 
     * @return MysqlConnection <p>mysql数据源连接信息</p>
     */
    public MysqlConnection getMysqlConnection() {
        return this.MysqlConnection;
    }

    /**
     * Set <p>mysql数据源连接信息</p>
     * @param MysqlConnection <p>mysql数据源连接信息</p>
     */
    public void setMysqlConnection(MysqlConnection MysqlConnection) {
        this.MysqlConnection = MysqlConnection;
    }

    /**
     * Get <p>hive数据源连接信息</p> 
     * @return EmrHiveConnection <p>hive数据源连接信息</p>
     */
    public HiveConnection getEmrHiveConnection() {
        return this.EmrHiveConnection;
    }

    /**
     * Set <p>hive数据源连接信息</p>
     * @param EmrHiveConnection <p>hive数据源连接信息</p>
     */
    public void setEmrHiveConnection(HiveConnection EmrHiveConnection) {
        this.EmrHiveConnection = EmrHiveConnection;
    }

    /**
     * Get <p>doris数据源连接信息</p> 
     * @return TCHouseDConnection <p>doris数据源连接信息</p>
     */
    public DorisConnection getTCHouseDConnection() {
        return this.TCHouseDConnection;
    }

    /**
     * Set <p>doris数据源连接信息</p>
     * @param TCHouseDConnection <p>doris数据源连接信息</p>
     */
    public void setTCHouseDConnection(DorisConnection TCHouseDConnection) {
        this.TCHouseDConnection = TCHouseDConnection;
    }

    /**
     * Get <p>数据卷连接信息</p> 
     * @return VolumeConnection <p>数据卷连接信息</p>
     */
    public VolumeConnection getVolumeConnection() {
        return this.VolumeConnection;
    }

    /**
     * Set <p>数据卷连接信息</p>
     * @param VolumeConnection <p>数据卷连接信息</p>
     */
    public void setVolumeConnection(VolumeConnection VolumeConnection) {
        this.VolumeConnection = VolumeConnection;
    }

    /**
     * Get <p>lakehouse连接信息</p> 
     * @return LakeHouseConnection <p>lakehouse连接信息</p>
     */
    public LakeHouseConnection getLakeHouseConnection() {
        return this.LakeHouseConnection;
    }

    /**
     * Set <p>lakehouse连接信息</p>
     * @param LakeHouseConnection <p>lakehouse连接信息</p>
     */
    public void setLakeHouseConnection(LakeHouseConnection LakeHouseConnection) {
        this.LakeHouseConnection = LakeHouseConnection;
    }

    /**
     * Get <p>PostgreSQL数据源连接信息</p> 
     * @return PostgreSQLConnection <p>PostgreSQL数据源连接信息</p>
     */
    public PostgreSQLConnection getPostgreSQLConnection() {
        return this.PostgreSQLConnection;
    }

    /**
     * Set <p>PostgreSQL数据源连接信息</p>
     * @param PostgreSQLConnection <p>PostgreSQL数据源连接信息</p>
     */
    public void setPostgreSQLConnection(PostgreSQLConnection PostgreSQLConnection) {
        this.PostgreSQLConnection = PostgreSQLConnection;
    }

    /**
     * Get <p>dlc数据源连接信息</p> 
     * @return DlcConnection <p>dlc数据源连接信息</p>
     */
    public DlcConnection getDlcConnection() {
        return this.DlcConnection;
    }

    /**
     * Set <p>dlc数据源连接信息</p>
     * @param DlcConnection <p>dlc数据源连接信息</p>
     */
    public void setDlcConnection(DlcConnection DlcConnection) {
        this.DlcConnection = DlcConnection;
    }

    public ConnectionConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConnectionConfig(ConnectionConfig source) {
        if (source.MysqlConnection != null) {
            this.MysqlConnection = new MysqlConnection(source.MysqlConnection);
        }
        if (source.EmrHiveConnection != null) {
            this.EmrHiveConnection = new HiveConnection(source.EmrHiveConnection);
        }
        if (source.TCHouseDConnection != null) {
            this.TCHouseDConnection = new DorisConnection(source.TCHouseDConnection);
        }
        if (source.VolumeConnection != null) {
            this.VolumeConnection = new VolumeConnection(source.VolumeConnection);
        }
        if (source.LakeHouseConnection != null) {
            this.LakeHouseConnection = new LakeHouseConnection(source.LakeHouseConnection);
        }
        if (source.PostgreSQLConnection != null) {
            this.PostgreSQLConnection = new PostgreSQLConnection(source.PostgreSQLConnection);
        }
        if (source.DlcConnection != null) {
            this.DlcConnection = new DlcConnection(source.DlcConnection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "MysqlConnection.", this.MysqlConnection);
        this.setParamObj(map, prefix + "EmrHiveConnection.", this.EmrHiveConnection);
        this.setParamObj(map, prefix + "TCHouseDConnection.", this.TCHouseDConnection);
        this.setParamObj(map, prefix + "VolumeConnection.", this.VolumeConnection);
        this.setParamObj(map, prefix + "LakeHouseConnection.", this.LakeHouseConnection);
        this.setParamObj(map, prefix + "PostgreSQLConnection.", this.PostgreSQLConnection);
        this.setParamObj(map, prefix + "DlcConnection.", this.DlcConnection);

    }
}

