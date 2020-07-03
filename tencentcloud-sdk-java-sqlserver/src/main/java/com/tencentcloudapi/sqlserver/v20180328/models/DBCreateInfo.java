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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DBCreateInfo extends AbstractModel{

    /**
    * 数据库名
    */
    @SerializedName("DBName")
    @Expose
    private String DBName;

    /**
    * 字符集。可选值包括：Chinese_PRC_CI_AS, Chinese_PRC_CS_AS, Chinese_PRC_BIN, Chinese_Taiwan_Stroke_CI_AS, SQL_Latin1_General_CP1_CI_AS, SQL_Latin1_General_CP1_CS_AS。不填默认为Chinese_PRC_CI_AS
    */
    @SerializedName("Charset")
    @Expose
    private String Charset;

    /**
    * 数据库账号权限信息
    */
    @SerializedName("Accounts")
    @Expose
    private AccountPrivilege [] Accounts;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 数据库名 
     * @return DBName 数据库名
     */
    public String getDBName() {
        return this.DBName;
    }

    /**
     * Set 数据库名
     * @param DBName 数据库名
     */
    public void setDBName(String DBName) {
        this.DBName = DBName;
    }

    /**
     * Get 字符集。可选值包括：Chinese_PRC_CI_AS, Chinese_PRC_CS_AS, Chinese_PRC_BIN, Chinese_Taiwan_Stroke_CI_AS, SQL_Latin1_General_CP1_CI_AS, SQL_Latin1_General_CP1_CS_AS。不填默认为Chinese_PRC_CI_AS 
     * @return Charset 字符集。可选值包括：Chinese_PRC_CI_AS, Chinese_PRC_CS_AS, Chinese_PRC_BIN, Chinese_Taiwan_Stroke_CI_AS, SQL_Latin1_General_CP1_CI_AS, SQL_Latin1_General_CP1_CS_AS。不填默认为Chinese_PRC_CI_AS
     */
    public String getCharset() {
        return this.Charset;
    }

    /**
     * Set 字符集。可选值包括：Chinese_PRC_CI_AS, Chinese_PRC_CS_AS, Chinese_PRC_BIN, Chinese_Taiwan_Stroke_CI_AS, SQL_Latin1_General_CP1_CI_AS, SQL_Latin1_General_CP1_CS_AS。不填默认为Chinese_PRC_CI_AS
     * @param Charset 字符集。可选值包括：Chinese_PRC_CI_AS, Chinese_PRC_CS_AS, Chinese_PRC_BIN, Chinese_Taiwan_Stroke_CI_AS, SQL_Latin1_General_CP1_CI_AS, SQL_Latin1_General_CP1_CS_AS。不填默认为Chinese_PRC_CI_AS
     */
    public void setCharset(String Charset) {
        this.Charset = Charset;
    }

    /**
     * Get 数据库账号权限信息 
     * @return Accounts 数据库账号权限信息
     */
    public AccountPrivilege [] getAccounts() {
        return this.Accounts;
    }

    /**
     * Set 数据库账号权限信息
     * @param Accounts 数据库账号权限信息
     */
    public void setAccounts(AccountPrivilege [] Accounts) {
        this.Accounts = Accounts;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBName", this.DBName);
        this.setParamSimple(map, prefix + "Charset", this.Charset);
        this.setParamArrayObj(map, prefix + "Accounts.", this.Accounts);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

