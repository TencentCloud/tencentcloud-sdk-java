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

public class AccountPrivilege extends AbstractModel{

    /**
    * 数据库用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 数据库权限。ReadWrite表示可读写，ReadOnly表示只读
    */
    @SerializedName("Privilege")
    @Expose
    private String Privilege;

    /**
     * Get 数据库用户名 
     * @return UserName 数据库用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 数据库用户名
     * @param UserName 数据库用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 数据库权限。ReadWrite表示可读写，ReadOnly表示只读 
     * @return Privilege 数据库权限。ReadWrite表示可读写，ReadOnly表示只读
     */
    public String getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set 数据库权限。ReadWrite表示可读写，ReadOnly表示只读
     * @param Privilege 数据库权限。ReadWrite表示可读写，ReadOnly表示只读
     */
    public void setPrivilege(String Privilege) {
        this.Privilege = Privilege;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Privilege", this.Privilege);

    }
}

