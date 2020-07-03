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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTablesRequest extends AbstractModel{

    /**
    * 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 数据库的名称。
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * 记录偏移量，默认值为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 单次请求返回的数量，默认值为20，最大值为2000。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 匹配数据库表名的正则表达式，规则同 MySQL 官网
    */
    @SerializedName("TableRegexp")
    @Expose
    private String TableRegexp;

    /**
     * Get 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。 
     * @return InstanceId 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     * @param InstanceId 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 数据库的名称。 
     * @return Database 数据库的名称。
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set 数据库的名称。
     * @param Database 数据库的名称。
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get 记录偏移量，默认值为0。 
     * @return Offset 记录偏移量，默认值为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 记录偏移量，默认值为0。
     * @param Offset 记录偏移量，默认值为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 单次请求返回的数量，默认值为20，最大值为2000。 
     * @return Limit 单次请求返回的数量，默认值为20，最大值为2000。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单次请求返回的数量，默认值为20，最大值为2000。
     * @param Limit 单次请求返回的数量，默认值为20，最大值为2000。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 匹配数据库表名的正则表达式，规则同 MySQL 官网 
     * @return TableRegexp 匹配数据库表名的正则表达式，规则同 MySQL 官网
     */
    public String getTableRegexp() {
        return this.TableRegexp;
    }

    /**
     * Set 匹配数据库表名的正则表达式，规则同 MySQL 官网
     * @param TableRegexp 匹配数据库表名的正则表达式，规则同 MySQL 官网
     */
    public void setTableRegexp(String TableRegexp) {
        this.TableRegexp = TableRegexp;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "TableRegexp", this.TableRegexp);

    }
}

