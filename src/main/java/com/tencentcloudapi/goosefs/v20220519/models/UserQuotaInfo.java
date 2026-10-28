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
package com.tencentcloudapi.goosefs.v20220519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserQuotaInfo extends AbstractModel {

    /**
    * 配额id
    */
    @SerializedName("QuotaId")
    @Expose
    private String QuotaId;

    /**
    * 配额类型
    */
    @SerializedName("QuotaType")
    @Expose
    private String QuotaType;

    /**
    * 配额对象名称，对应UID/GID的值
    */
    @SerializedName("QuotaObjectName")
    @Expose
    private String QuotaObjectName;

    /**
    * 容量配额限定值
    */
    @SerializedName("QuotaSizeLimit")
    @Expose
    private String QuotaSizeLimit;

    /**
    * 已使用容量配额
    */
    @SerializedName("QuotaSizeUsed")
    @Expose
    private String QuotaSizeUsed;

    /**
    * 容量配额使用占比
    */
    @SerializedName("QuotaSizeUsedPercent")
    @Expose
    private String QuotaSizeUsedPercent;

    /**
    * 文件数配额限定值
    */
    @SerializedName("QuotaFilesLimit")
    @Expose
    private String QuotaFilesLimit;

    /**
    * 已使用文件数配额
    */
    @SerializedName("QuotaFilesUsed")
    @Expose
    private String QuotaFilesUsed;

    /**
    * 文件数配额使用占比
    */
    @SerializedName("QuotaFilesUsedPercent")
    @Expose
    private String QuotaFilesUsedPercent;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 配额状态：creating 配置中 active 已生效 modify 修改中
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 配额id 
     * @return QuotaId 配额id
     */
    public String getQuotaId() {
        return this.QuotaId;
    }

    /**
     * Set 配额id
     * @param QuotaId 配额id
     */
    public void setQuotaId(String QuotaId) {
        this.QuotaId = QuotaId;
    }

    /**
     * Get 配额类型 
     * @return QuotaType 配额类型
     */
    public String getQuotaType() {
        return this.QuotaType;
    }

    /**
     * Set 配额类型
     * @param QuotaType 配额类型
     */
    public void setQuotaType(String QuotaType) {
        this.QuotaType = QuotaType;
    }

    /**
     * Get 配额对象名称，对应UID/GID的值 
     * @return QuotaObjectName 配额对象名称，对应UID/GID的值
     */
    public String getQuotaObjectName() {
        return this.QuotaObjectName;
    }

    /**
     * Set 配额对象名称，对应UID/GID的值
     * @param QuotaObjectName 配额对象名称，对应UID/GID的值
     */
    public void setQuotaObjectName(String QuotaObjectName) {
        this.QuotaObjectName = QuotaObjectName;
    }

    /**
     * Get 容量配额限定值 
     * @return QuotaSizeLimit 容量配额限定值
     */
    public String getQuotaSizeLimit() {
        return this.QuotaSizeLimit;
    }

    /**
     * Set 容量配额限定值
     * @param QuotaSizeLimit 容量配额限定值
     */
    public void setQuotaSizeLimit(String QuotaSizeLimit) {
        this.QuotaSizeLimit = QuotaSizeLimit;
    }

    /**
     * Get 已使用容量配额 
     * @return QuotaSizeUsed 已使用容量配额
     */
    public String getQuotaSizeUsed() {
        return this.QuotaSizeUsed;
    }

    /**
     * Set 已使用容量配额
     * @param QuotaSizeUsed 已使用容量配额
     */
    public void setQuotaSizeUsed(String QuotaSizeUsed) {
        this.QuotaSizeUsed = QuotaSizeUsed;
    }

    /**
     * Get 容量配额使用占比 
     * @return QuotaSizeUsedPercent 容量配额使用占比
     */
    public String getQuotaSizeUsedPercent() {
        return this.QuotaSizeUsedPercent;
    }

    /**
     * Set 容量配额使用占比
     * @param QuotaSizeUsedPercent 容量配额使用占比
     */
    public void setQuotaSizeUsedPercent(String QuotaSizeUsedPercent) {
        this.QuotaSizeUsedPercent = QuotaSizeUsedPercent;
    }

    /**
     * Get 文件数配额限定值 
     * @return QuotaFilesLimit 文件数配额限定值
     */
    public String getQuotaFilesLimit() {
        return this.QuotaFilesLimit;
    }

    /**
     * Set 文件数配额限定值
     * @param QuotaFilesLimit 文件数配额限定值
     */
    public void setQuotaFilesLimit(String QuotaFilesLimit) {
        this.QuotaFilesLimit = QuotaFilesLimit;
    }

    /**
     * Get 已使用文件数配额 
     * @return QuotaFilesUsed 已使用文件数配额
     */
    public String getQuotaFilesUsed() {
        return this.QuotaFilesUsed;
    }

    /**
     * Set 已使用文件数配额
     * @param QuotaFilesUsed 已使用文件数配额
     */
    public void setQuotaFilesUsed(String QuotaFilesUsed) {
        this.QuotaFilesUsed = QuotaFilesUsed;
    }

    /**
     * Get 文件数配额使用占比 
     * @return QuotaFilesUsedPercent 文件数配额使用占比
     */
    public String getQuotaFilesUsedPercent() {
        return this.QuotaFilesUsedPercent;
    }

    /**
     * Set 文件数配额使用占比
     * @param QuotaFilesUsedPercent 文件数配额使用占比
     */
    public void setQuotaFilesUsedPercent(String QuotaFilesUsedPercent) {
        this.QuotaFilesUsedPercent = QuotaFilesUsedPercent;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间 
     * @return ModifyTime 修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
     * @param ModifyTime 修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 配额状态：creating 配置中 active 已生效 modify 修改中 
     * @return Status 配额状态：creating 配置中 active 已生效 modify 修改中
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 配额状态：creating 配置中 active 已生效 modify 修改中
     * @param Status 配额状态：creating 配置中 active 已生效 modify 修改中
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public UserQuotaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserQuotaInfo(UserQuotaInfo source) {
        if (source.QuotaId != null) {
            this.QuotaId = new String(source.QuotaId);
        }
        if (source.QuotaType != null) {
            this.QuotaType = new String(source.QuotaType);
        }
        if (source.QuotaObjectName != null) {
            this.QuotaObjectName = new String(source.QuotaObjectName);
        }
        if (source.QuotaSizeLimit != null) {
            this.QuotaSizeLimit = new String(source.QuotaSizeLimit);
        }
        if (source.QuotaSizeUsed != null) {
            this.QuotaSizeUsed = new String(source.QuotaSizeUsed);
        }
        if (source.QuotaSizeUsedPercent != null) {
            this.QuotaSizeUsedPercent = new String(source.QuotaSizeUsedPercent);
        }
        if (source.QuotaFilesLimit != null) {
            this.QuotaFilesLimit = new String(source.QuotaFilesLimit);
        }
        if (source.QuotaFilesUsed != null) {
            this.QuotaFilesUsed = new String(source.QuotaFilesUsed);
        }
        if (source.QuotaFilesUsedPercent != null) {
            this.QuotaFilesUsedPercent = new String(source.QuotaFilesUsedPercent);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QuotaId", this.QuotaId);
        this.setParamSimple(map, prefix + "QuotaType", this.QuotaType);
        this.setParamSimple(map, prefix + "QuotaObjectName", this.QuotaObjectName);
        this.setParamSimple(map, prefix + "QuotaSizeLimit", this.QuotaSizeLimit);
        this.setParamSimple(map, prefix + "QuotaSizeUsed", this.QuotaSizeUsed);
        this.setParamSimple(map, prefix + "QuotaSizeUsedPercent", this.QuotaSizeUsedPercent);
        this.setParamSimple(map, prefix + "QuotaFilesLimit", this.QuotaFilesLimit);
        this.setParamSimple(map, prefix + "QuotaFilesUsed", this.QuotaFilesUsed);
        this.setParamSimple(map, prefix + "QuotaFilesUsedPercent", this.QuotaFilesUsedPercent);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

