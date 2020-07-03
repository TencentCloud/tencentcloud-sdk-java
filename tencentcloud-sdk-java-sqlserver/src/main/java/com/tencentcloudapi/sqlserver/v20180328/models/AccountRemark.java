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

public class AccountRemark extends AbstractModel{

    /**
    * 账户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 对应账户新的备注信息
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 账户名 
     * @return UserName 账户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 账户名
     * @param UserName 账户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 对应账户新的备注信息 
     * @return Remark 对应账户新的备注信息
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 对应账户新的备注信息
     * @param Remark 对应账户新的备注信息
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

