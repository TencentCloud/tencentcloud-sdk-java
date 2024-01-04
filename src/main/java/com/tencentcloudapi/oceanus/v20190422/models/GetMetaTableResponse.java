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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetMetaTableResponse extends AbstractModel {

    /**
    * 元数据表唯一标识
    */
    @SerializedName("SerialId")
    @Expose
    private String SerialId;

    /**
    * 目录名
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * 库名
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * 表名
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * 建表语句,使用 Base64 编码。
例如
Q1JFQVRFIFRBQkxFIGRhdGFnZW5fc291cmNlX3RhYmxlICggCiAgICBpZCBJTlQsIAogICAgbmFtZSBTVFJJTkcgCikgV0lUSCAoCidjb25uZWN0b3InPSdkYXRhZ2VuJywKJ3Jvd3MtcGVyLXNlY29uZCcgPSAnMScKKTs=
    */
    @SerializedName("DDL")
    @Expose
    private String DDL;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 元数据表唯一标识 
     * @return SerialId 元数据表唯一标识
     */
    public String getSerialId() {
        return this.SerialId;
    }

    /**
     * Set 元数据表唯一标识
     * @param SerialId 元数据表唯一标识
     */
    public void setSerialId(String SerialId) {
        this.SerialId = SerialId;
    }

    /**
     * Get 目录名 
     * @return Catalog 目录名
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set 目录名
     * @param Catalog 目录名
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    /**
     * Get 库名 
     * @return Database 库名
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set 库名
     * @param Database 库名
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get 表名 
     * @return Table 表名
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * Set 表名
     * @param Table 表名
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * Get 建表语句,使用 Base64 编码。
例如
Q1JFQVRFIFRBQkxFIGRhdGFnZW5fc291cmNlX3RhYmxlICggCiAgICBpZCBJTlQsIAogICAgbmFtZSBTVFJJTkcgCikgV0lUSCAoCidjb25uZWN0b3InPSdkYXRhZ2VuJywKJ3Jvd3MtcGVyLXNlY29uZCcgPSAnMScKKTs= 
     * @return DDL 建表语句,使用 Base64 编码。
例如
Q1JFQVRFIFRBQkxFIGRhdGFnZW5fc291cmNlX3RhYmxlICggCiAgICBpZCBJTlQsIAogICAgbmFtZSBTVFJJTkcgCikgV0lUSCAoCidjb25uZWN0b3InPSdkYXRhZ2VuJywKJ3Jvd3MtcGVyLXNlY29uZCcgPSAnMScKKTs=
     */
    public String getDDL() {
        return this.DDL;
    }

    /**
     * Set 建表语句,使用 Base64 编码。
例如
Q1JFQVRFIFRBQkxFIGRhdGFnZW5fc291cmNlX3RhYmxlICggCiAgICBpZCBJTlQsIAogICAgbmFtZSBTVFJJTkcgCikgV0lUSCAoCidjb25uZWN0b3InPSdkYXRhZ2VuJywKJ3Jvd3MtcGVyLXNlY29uZCcgPSAnMScKKTs=
     * @param DDL 建表语句,使用 Base64 编码。
例如
Q1JFQVRFIFRBQkxFIGRhdGFnZW5fc291cmNlX3RhYmxlICggCiAgICBpZCBJTlQsIAogICAgbmFtZSBTVFJJTkcgCikgV0lUSCAoCidjb25uZWN0b3InPSdkYXRhZ2VuJywKJ3Jvd3MtcGVyLXNlY29uZCcgPSAnMScKKTs=
     */
    public void setDDL(String DDL) {
        this.DDL = DDL;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetMetaTableResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetMetaTableResponse(GetMetaTableResponse source) {
        if (source.SerialId != null) {
            this.SerialId = new String(source.SerialId);
        }
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.Table != null) {
            this.Table = new String(source.Table);
        }
        if (source.DDL != null) {
            this.DDL = new String(source.DDL);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SerialId", this.SerialId);
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamSimple(map, prefix + "DDL", this.DDL);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

