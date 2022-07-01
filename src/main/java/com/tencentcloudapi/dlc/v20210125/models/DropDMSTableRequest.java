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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DropDMSTableRequest extends AbstractModel{

    /**
    * 数据库名称
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * 表名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 是否删除数据
    */
    @SerializedName("DeleteData")
    @Expose
    private Boolean DeleteData;

    /**
    * 环境属性
    */
    @SerializedName("EnvProps")
    @Expose
    private KVPair EnvProps;

    /**
     * Get 数据库名称 
     * @return DbName 数据库名称
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set 数据库名称
     * @param DbName 数据库名称
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get 表名称 
     * @return Name 表名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 表名称
     * @param Name 表名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 是否删除数据 
     * @return DeleteData 是否删除数据
     */
    public Boolean getDeleteData() {
        return this.DeleteData;
    }

    /**
     * Set 是否删除数据
     * @param DeleteData 是否删除数据
     */
    public void setDeleteData(Boolean DeleteData) {
        this.DeleteData = DeleteData;
    }

    /**
     * Get 环境属性 
     * @return EnvProps 环境属性
     */
    public KVPair getEnvProps() {
        return this.EnvProps;
    }

    /**
     * Set 环境属性
     * @param EnvProps 环境属性
     */
    public void setEnvProps(KVPair EnvProps) {
        this.EnvProps = EnvProps;
    }

    public DropDMSTableRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DropDMSTableRequest(DropDMSTableRequest source) {
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DeleteData != null) {
            this.DeleteData = new Boolean(source.DeleteData);
        }
        if (source.EnvProps != null) {
            this.EnvProps = new KVPair(source.EnvProps);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DeleteData", this.DeleteData);
        this.setParamObj(map, prefix + "EnvProps.", this.EnvProps);

    }
}

