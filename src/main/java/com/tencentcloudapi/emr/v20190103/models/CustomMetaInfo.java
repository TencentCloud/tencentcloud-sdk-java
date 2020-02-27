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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomMetaInfo extends AbstractModel{

    /**
    * 自定义MetaDB的JDBC连接，请以 jdbc:mysql:// 开头
    */
    @SerializedName("MetaDataJdbcUrl")
    @Expose
    private String MetaDataJdbcUrl;

    /**
    * 自定义MetaDB用户名
    */
    @SerializedName("MetaDataUser")
    @Expose
    private String MetaDataUser;

    /**
    * 自定义MetaDB密码
    */
    @SerializedName("MetaDataPass")
    @Expose
    private String MetaDataPass;

    /**
     * Get 自定义MetaDB的JDBC连接，请以 jdbc:mysql:// 开头 
     * @return MetaDataJdbcUrl 自定义MetaDB的JDBC连接，请以 jdbc:mysql:// 开头
     */
    public String getMetaDataJdbcUrl() {
        return this.MetaDataJdbcUrl;
    }

    /**
     * Set 自定义MetaDB的JDBC连接，请以 jdbc:mysql:// 开头
     * @param MetaDataJdbcUrl 自定义MetaDB的JDBC连接，请以 jdbc:mysql:// 开头
     */
    public void setMetaDataJdbcUrl(String MetaDataJdbcUrl) {
        this.MetaDataJdbcUrl = MetaDataJdbcUrl;
    }

    /**
     * Get 自定义MetaDB用户名 
     * @return MetaDataUser 自定义MetaDB用户名
     */
    public String getMetaDataUser() {
        return this.MetaDataUser;
    }

    /**
     * Set 自定义MetaDB用户名
     * @param MetaDataUser 自定义MetaDB用户名
     */
    public void setMetaDataUser(String MetaDataUser) {
        this.MetaDataUser = MetaDataUser;
    }

    /**
     * Get 自定义MetaDB密码 
     * @return MetaDataPass 自定义MetaDB密码
     */
    public String getMetaDataPass() {
        return this.MetaDataPass;
    }

    /**
     * Set 自定义MetaDB密码
     * @param MetaDataPass 自定义MetaDB密码
     */
    public void setMetaDataPass(String MetaDataPass) {
        this.MetaDataPass = MetaDataPass;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetaDataJdbcUrl", this.MetaDataJdbcUrl);
        this.setParamSimple(map, prefix + "MetaDataUser", this.MetaDataUser);
        this.setParamSimple(map, prefix + "MetaDataPass", this.MetaDataPass);

    }
}

