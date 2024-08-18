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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTableListRequest extends AbstractModel {

    /**
    * 资源ID，建表所用的TCHouse-D资源ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 需要获取表列表的库
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * 使用该用户进行操作，该用户需要有对应的权限。如果该TCHouse-D集群使用CAM用户注册内核账户，则不需要填写
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 用户对应的密码。如果该TCHouse-D集群使用CAM用户注册内核账户，则不需要填写
    */
    @SerializedName("PassWord")
    @Expose
    private String PassWord;

    /**
    * 查询库所在的数据源，不填则默认为内部数据源（internal）。
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
     * Get 资源ID，建表所用的TCHouse-D资源ID。 
     * @return InstanceId 资源ID，建表所用的TCHouse-D资源ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 资源ID，建表所用的TCHouse-D资源ID。
     * @param InstanceId 资源ID，建表所用的TCHouse-D资源ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 需要获取表列表的库 
     * @return DbName 需要获取表列表的库
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set 需要获取表列表的库
     * @param DbName 需要获取表列表的库
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get 使用该用户进行操作，该用户需要有对应的权限。如果该TCHouse-D集群使用CAM用户注册内核账户，则不需要填写 
     * @return UserName 使用该用户进行操作，该用户需要有对应的权限。如果该TCHouse-D集群使用CAM用户注册内核账户，则不需要填写
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 使用该用户进行操作，该用户需要有对应的权限。如果该TCHouse-D集群使用CAM用户注册内核账户，则不需要填写
     * @param UserName 使用该用户进行操作，该用户需要有对应的权限。如果该TCHouse-D集群使用CAM用户注册内核账户，则不需要填写
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 用户对应的密码。如果该TCHouse-D集群使用CAM用户注册内核账户，则不需要填写 
     * @return PassWord 用户对应的密码。如果该TCHouse-D集群使用CAM用户注册内核账户，则不需要填写
     */
    public String getPassWord() {
        return this.PassWord;
    }

    /**
     * Set 用户对应的密码。如果该TCHouse-D集群使用CAM用户注册内核账户，则不需要填写
     * @param PassWord 用户对应的密码。如果该TCHouse-D集群使用CAM用户注册内核账户，则不需要填写
     */
    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

    /**
     * Get 查询库所在的数据源，不填则默认为内部数据源（internal）。 
     * @return CatalogName 查询库所在的数据源，不填则默认为内部数据源（internal）。
     */
    public String getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set 查询库所在的数据源，不填则默认为内部数据源（internal）。
     * @param CatalogName 查询库所在的数据源，不填则默认为内部数据源（internal）。
     */
    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }

    public DescribeTableListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTableListRequest(DescribeTableListRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.PassWord != null) {
            this.PassWord = new String(source.PassWord);
        }
        if (source.CatalogName != null) {
            this.CatalogName = new String(source.CatalogName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "PassWord", this.PassWord);
        this.setParamSimple(map, prefix + "CatalogName", this.CatalogName);

    }
}

