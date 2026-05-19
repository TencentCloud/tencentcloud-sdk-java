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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDatabaseObjectsRequest extends AbstractModel {

    /**
    * <p>实例 ID，形如：tdsql3-42f40429.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>数据库名称，通过 DescribeDatabases 接口获取。</p>
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * <p>分页索引</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>每页数量</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>数据表名称匹配表达式</p>
    */
    @SerializedName("TableRegexp")
    @Expose
    private String TableRegexp;

    /**
     * Get <p>实例 ID，形如：tdsql3-42f40429.</p> 
     * @return InstanceId <p>实例 ID，形如：tdsql3-42f40429.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID，形如：tdsql3-42f40429.</p>
     * @param InstanceId <p>实例 ID，形如：tdsql3-42f40429.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>数据库名称，通过 DescribeDatabases 接口获取。</p> 
     * @return DbName <p>数据库名称，通过 DescribeDatabases 接口获取。</p>
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set <p>数据库名称，通过 DescribeDatabases 接口获取。</p>
     * @param DbName <p>数据库名称，通过 DescribeDatabases 接口获取。</p>
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get <p>分页索引</p> 
     * @return Offset <p>分页索引</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页索引</p>
     * @param Offset <p>分页索引</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>每页数量</p> 
     * @return Limit <p>每页数量</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页数量</p>
     * @param Limit <p>每页数量</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>数据表名称匹配表达式</p> 
     * @return TableRegexp <p>数据表名称匹配表达式</p>
     */
    public String getTableRegexp() {
        return this.TableRegexp;
    }

    /**
     * Set <p>数据表名称匹配表达式</p>
     * @param TableRegexp <p>数据表名称匹配表达式</p>
     */
    public void setTableRegexp(String TableRegexp) {
        this.TableRegexp = TableRegexp;
    }

    public DescribeDatabaseObjectsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDatabaseObjectsRequest(DescribeDatabaseObjectsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.TableRegexp != null) {
            this.TableRegexp = new String(source.TableRegexp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "TableRegexp", this.TableRegexp);

    }
}

