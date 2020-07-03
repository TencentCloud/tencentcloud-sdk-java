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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TcrInstanceToken extends AbstractModel{

    /**
    * 令牌ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 令牌描述
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 令牌所属实例ID
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * 令牌启用状态
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 令牌创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 令牌过期时间戳
    */
    @SerializedName("ExpiredAt")
    @Expose
    private Long ExpiredAt;

    /**
     * Get 令牌ID 
     * @return Id 令牌ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 令牌ID
     * @param Id 令牌ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 令牌描述 
     * @return Desc 令牌描述
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 令牌描述
     * @param Desc 令牌描述
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 令牌所属实例ID 
     * @return RegistryId 令牌所属实例ID
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set 令牌所属实例ID
     * @param RegistryId 令牌所属实例ID
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get 令牌启用状态 
     * @return Enabled 令牌启用状态
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 令牌启用状态
     * @param Enabled 令牌启用状态
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 令牌创建时间 
     * @return CreatedAt 令牌创建时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 令牌创建时间
     * @param CreatedAt 令牌创建时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 令牌过期时间戳 
     * @return ExpiredAt 令牌过期时间戳
     */
    public Long getExpiredAt() {
        return this.ExpiredAt;
    }

    /**
     * Set 令牌过期时间戳
     * @param ExpiredAt 令牌过期时间戳
     */
    public void setExpiredAt(Long ExpiredAt) {
        this.ExpiredAt = ExpiredAt;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "ExpiredAt", this.ExpiredAt);

    }
}

