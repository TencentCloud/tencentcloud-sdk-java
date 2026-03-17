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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteDBRequest extends AbstractModel {

    /**
    * <p>实例ID，形如mssql-rljoi3bf</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>数据库名数组</p>
    */
    @SerializedName("Names")
    @Expose
    private String [] Names;

    /**
    * <p>删除数据库前是否创建备份。</p><p>取值范围：[0, 1]</p><p>默认值：0</p>
    */
    @SerializedName("NoDoBackup")
    @Expose
    private Long NoDoBackup;

    /**
     * Get <p>实例ID，形如mssql-rljoi3bf</p> 
     * @return InstanceId <p>实例ID，形如mssql-rljoi3bf</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID，形如mssql-rljoi3bf</p>
     * @param InstanceId <p>实例ID，形如mssql-rljoi3bf</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>数据库名数组</p> 
     * @return Names <p>数据库名数组</p>
     */
    public String [] getNames() {
        return this.Names;
    }

    /**
     * Set <p>数据库名数组</p>
     * @param Names <p>数据库名数组</p>
     */
    public void setNames(String [] Names) {
        this.Names = Names;
    }

    /**
     * Get <p>删除数据库前是否创建备份。</p><p>取值范围：[0, 1]</p><p>默认值：0</p> 
     * @return NoDoBackup <p>删除数据库前是否创建备份。</p><p>取值范围：[0, 1]</p><p>默认值：0</p>
     */
    public Long getNoDoBackup() {
        return this.NoDoBackup;
    }

    /**
     * Set <p>删除数据库前是否创建备份。</p><p>取值范围：[0, 1]</p><p>默认值：0</p>
     * @param NoDoBackup <p>删除数据库前是否创建备份。</p><p>取值范围：[0, 1]</p><p>默认值：0</p>
     */
    public void setNoDoBackup(Long NoDoBackup) {
        this.NoDoBackup = NoDoBackup;
    }

    public DeleteDBRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteDBRequest(DeleteDBRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Names != null) {
            this.Names = new String[source.Names.length];
            for (int i = 0; i < source.Names.length; i++) {
                this.Names[i] = new String(source.Names[i]);
            }
        }
        if (source.NoDoBackup != null) {
            this.NoDoBackup = new Long(source.NoDoBackup);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "Names.", this.Names);
        this.setParamSimple(map, prefix + "NoDoBackup", this.NoDoBackup);

    }
}

