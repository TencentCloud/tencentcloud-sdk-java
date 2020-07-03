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

public class ModifyAccountRemarkRequest extends AbstractModel{

    /**
    * 实例ID，形如postgres-4wdeb0zv
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 实例用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 用户UserName对应的新备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 实例ID，形如postgres-4wdeb0zv 
     * @return DBInstanceId 实例ID，形如postgres-4wdeb0zv
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set 实例ID，形如postgres-4wdeb0zv
     * @param DBInstanceId 实例ID，形如postgres-4wdeb0zv
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get 实例用户名 
     * @return UserName 实例用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 实例用户名
     * @param UserName 实例用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 用户UserName对应的新备注 
     * @return Remark 用户UserName对应的新备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 用户UserName对应的新备注
     * @param Remark 用户UserName对应的新备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

