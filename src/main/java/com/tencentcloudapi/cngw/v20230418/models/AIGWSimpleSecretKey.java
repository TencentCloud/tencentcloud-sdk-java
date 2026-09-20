/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWSimpleSecretKey extends AbstractModel {

    /**
    * <p>密钥ID</p>
    */
    @SerializedName("SecretKeyId")
    @Expose
    private String SecretKeyId;

    /**
    * <p>密钥名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>启用状态</p><p>枚举值：</p><ul><li>Enable： 启动</li><li>Disable： 禁用</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>密钥类型</p><p>枚举值：</p><ul><li>ApiKey： ApiKey类型</li></ul>
    */
    @SerializedName("SecretType")
    @Expose
    private String SecretType;

    /**
    * <p>创建时间</p><p>参数格式：2026-09-03 14:11:05</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get <p>密钥ID</p> 
     * @return SecretKeyId <p>密钥ID</p>
     */
    public String getSecretKeyId() {
        return this.SecretKeyId;
    }

    /**
     * Set <p>密钥ID</p>
     * @param SecretKeyId <p>密钥ID</p>
     */
    public void setSecretKeyId(String SecretKeyId) {
        this.SecretKeyId = SecretKeyId;
    }

    /**
     * Get <p>密钥名称</p> 
     * @return Name <p>密钥名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>密钥名称</p>
     * @param Name <p>密钥名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>启用状态</p><p>枚举值：</p><ul><li>Enable： 启动</li><li>Disable： 禁用</li></ul> 
     * @return Status <p>启用状态</p><p>枚举值：</p><ul><li>Enable： 启动</li><li>Disable： 禁用</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>启用状态</p><p>枚举值：</p><ul><li>Enable： 启动</li><li>Disable： 禁用</li></ul>
     * @param Status <p>启用状态</p><p>枚举值：</p><ul><li>Enable： 启动</li><li>Disable： 禁用</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>密钥类型</p><p>枚举值：</p><ul><li>ApiKey： ApiKey类型</li></ul> 
     * @return SecretType <p>密钥类型</p><p>枚举值：</p><ul><li>ApiKey： ApiKey类型</li></ul>
     */
    public String getSecretType() {
        return this.SecretType;
    }

    /**
     * Set <p>密钥类型</p><p>枚举值：</p><ul><li>ApiKey： ApiKey类型</li></ul>
     * @param SecretType <p>密钥类型</p><p>枚举值：</p><ul><li>ApiKey： ApiKey类型</li></ul>
     */
    public void setSecretType(String SecretType) {
        this.SecretType = SecretType;
    }

    /**
     * Get <p>创建时间</p><p>参数格式：2026-09-03 14:11:05</p> 
     * @return CreateTime <p>创建时间</p><p>参数格式：2026-09-03 14:11:05</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p><p>参数格式：2026-09-03 14:11:05</p>
     * @param CreateTime <p>创建时间</p><p>参数格式：2026-09-03 14:11:05</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public AIGWSimpleSecretKey() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWSimpleSecretKey(AIGWSimpleSecretKey source) {
        if (source.SecretKeyId != null) {
            this.SecretKeyId = new String(source.SecretKeyId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SecretType != null) {
            this.SecretType = new String(source.SecretType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretKeyId", this.SecretKeyId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SecretType", this.SecretType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

