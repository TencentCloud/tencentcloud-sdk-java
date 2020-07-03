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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ErrLogDetail extends AbstractModel{

    /**
    * 用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 数据库名字
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * 错误发生时间
    */
    @SerializedName("ErrTime")
    @Expose
    private String ErrTime;

    /**
    * 错误消息
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
     * Get 用户名 
     * @return UserName 用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名
     * @param UserName 用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 数据库名字 
     * @return Database 数据库名字
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set 数据库名字
     * @param Database 数据库名字
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get 错误发生时间 
     * @return ErrTime 错误发生时间
     */
    public String getErrTime() {
        return this.ErrTime;
    }

    /**
     * Set 错误发生时间
     * @param ErrTime 错误发生时间
     */
    public void setErrTime(String ErrTime) {
        this.ErrTime = ErrTime;
    }

    /**
     * Get 错误消息 
     * @return ErrMsg 错误消息
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set 错误消息
     * @param ErrMsg 错误消息
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "ErrTime", this.ErrTime);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);

    }
}

