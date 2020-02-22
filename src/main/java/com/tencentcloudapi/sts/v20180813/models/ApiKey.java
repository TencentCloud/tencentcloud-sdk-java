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
package com.tencentcloudapi.sts.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApiKey extends AbstractModel{

    /**
    * 密钥ID
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * 创建时间(时间戳)
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 状态(2:有效, 3:禁用, 4:已删除)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 密钥ID 
     * @return SecretId 密钥ID
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Set 密钥ID
     * @param SecretId 密钥ID
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * Get 创建时间(时间戳) 
     * @return CreateTime 创建时间(时间戳)
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间(时间戳)
     * @param CreateTime 创建时间(时间戳)
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 状态(2:有效, 3:禁用, 4:已删除) 
     * @return Status 状态(2:有效, 3:禁用, 4:已删除)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态(2:有效, 3:禁用, 4:已删除)
     * @param Status 状态(2:有效, 3:禁用, 4:已删除)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretId", this.SecretId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

