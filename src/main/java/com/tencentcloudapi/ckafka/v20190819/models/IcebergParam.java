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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IcebergParam extends AbstractModel {

    /**
    * <p>Iceberg 连接资源 (EMR 实例)</p>
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * <p>目标数据库名（Hive catalog 下的 namespace），必填</p>
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * <p>目标表名</p>
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * <p>消息解析格式，当前仅支持 JSON</p><p>枚举值：</p><ul><li>JSON： JSON解析格式</li></ul>
    */
    @SerializedName("SchemeType")
    @Expose
    private String SchemeType;

    /**
    * <p>表字段扩展开关</p><p>枚举值：</p><ul><li>true： 开</li><li>false： 关</li></ul>
    */
    @SerializedName("EnableFieldExtension")
    @Expose
    private Boolean EnableFieldExtension;

    /**
    * <p>Upset/CDC 模式，默认off</p><p>枚举值：</p><ul><li>Off： Off</li><li>UPSERT： UPSERT</li><li>CDC： CDC</li></ul>
    */
    @SerializedName("UpsertMode")
    @Expose
    private String UpsertMode;

    /**
    * <p>主键字段：UPSERT / CDC 模式必填（多个字段以英文逗号分隔）</p>
    */
    @SerializedName("PrimaryKeys")
    @Expose
    private String PrimaryKeys;

    /**
     * Get <p>Iceberg 连接资源 (EMR 实例)</p> 
     * @return Resource <p>Iceberg 连接资源 (EMR 实例)</p>
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set <p>Iceberg 连接资源 (EMR 实例)</p>
     * @param Resource <p>Iceberg 连接资源 (EMR 实例)</p>
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get <p>目标数据库名（Hive catalog 下的 namespace），必填</p> 
     * @return Database <p>目标数据库名（Hive catalog 下的 namespace），必填</p>
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set <p>目标数据库名（Hive catalog 下的 namespace），必填</p>
     * @param Database <p>目标数据库名（Hive catalog 下的 namespace），必填</p>
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get <p>目标表名</p> 
     * @return TableName <p>目标表名</p>
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set <p>目标表名</p>
     * @param TableName <p>目标表名</p>
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get <p>消息解析格式，当前仅支持 JSON</p><p>枚举值：</p><ul><li>JSON： JSON解析格式</li></ul> 
     * @return SchemeType <p>消息解析格式，当前仅支持 JSON</p><p>枚举值：</p><ul><li>JSON： JSON解析格式</li></ul>
     */
    public String getSchemeType() {
        return this.SchemeType;
    }

    /**
     * Set <p>消息解析格式，当前仅支持 JSON</p><p>枚举值：</p><ul><li>JSON： JSON解析格式</li></ul>
     * @param SchemeType <p>消息解析格式，当前仅支持 JSON</p><p>枚举值：</p><ul><li>JSON： JSON解析格式</li></ul>
     */
    public void setSchemeType(String SchemeType) {
        this.SchemeType = SchemeType;
    }

    /**
     * Get <p>表字段扩展开关</p><p>枚举值：</p><ul><li>true： 开</li><li>false： 关</li></ul> 
     * @return EnableFieldExtension <p>表字段扩展开关</p><p>枚举值：</p><ul><li>true： 开</li><li>false： 关</li></ul>
     */
    public Boolean getEnableFieldExtension() {
        return this.EnableFieldExtension;
    }

    /**
     * Set <p>表字段扩展开关</p><p>枚举值：</p><ul><li>true： 开</li><li>false： 关</li></ul>
     * @param EnableFieldExtension <p>表字段扩展开关</p><p>枚举值：</p><ul><li>true： 开</li><li>false： 关</li></ul>
     */
    public void setEnableFieldExtension(Boolean EnableFieldExtension) {
        this.EnableFieldExtension = EnableFieldExtension;
    }

    /**
     * Get <p>Upset/CDC 模式，默认off</p><p>枚举值：</p><ul><li>Off： Off</li><li>UPSERT： UPSERT</li><li>CDC： CDC</li></ul> 
     * @return UpsertMode <p>Upset/CDC 模式，默认off</p><p>枚举值：</p><ul><li>Off： Off</li><li>UPSERT： UPSERT</li><li>CDC： CDC</li></ul>
     */
    public String getUpsertMode() {
        return this.UpsertMode;
    }

    /**
     * Set <p>Upset/CDC 模式，默认off</p><p>枚举值：</p><ul><li>Off： Off</li><li>UPSERT： UPSERT</li><li>CDC： CDC</li></ul>
     * @param UpsertMode <p>Upset/CDC 模式，默认off</p><p>枚举值：</p><ul><li>Off： Off</li><li>UPSERT： UPSERT</li><li>CDC： CDC</li></ul>
     */
    public void setUpsertMode(String UpsertMode) {
        this.UpsertMode = UpsertMode;
    }

    /**
     * Get <p>主键字段：UPSERT / CDC 模式必填（多个字段以英文逗号分隔）</p> 
     * @return PrimaryKeys <p>主键字段：UPSERT / CDC 模式必填（多个字段以英文逗号分隔）</p>
     */
    public String getPrimaryKeys() {
        return this.PrimaryKeys;
    }

    /**
     * Set <p>主键字段：UPSERT / CDC 模式必填（多个字段以英文逗号分隔）</p>
     * @param PrimaryKeys <p>主键字段：UPSERT / CDC 模式必填（多个字段以英文逗号分隔）</p>
     */
    public void setPrimaryKeys(String PrimaryKeys) {
        this.PrimaryKeys = PrimaryKeys;
    }

    public IcebergParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IcebergParam(IcebergParam source) {
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.SchemeType != null) {
            this.SchemeType = new String(source.SchemeType);
        }
        if (source.EnableFieldExtension != null) {
            this.EnableFieldExtension = new Boolean(source.EnableFieldExtension);
        }
        if (source.UpsertMode != null) {
            this.UpsertMode = new String(source.UpsertMode);
        }
        if (source.PrimaryKeys != null) {
            this.PrimaryKeys = new String(source.PrimaryKeys);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "SchemeType", this.SchemeType);
        this.setParamSimple(map, prefix + "EnableFieldExtension", this.EnableFieldExtension);
        this.setParamSimple(map, prefix + "UpsertMode", this.UpsertMode);
        this.setParamSimple(map, prefix + "PrimaryKeys", this.PrimaryKeys);

    }
}

