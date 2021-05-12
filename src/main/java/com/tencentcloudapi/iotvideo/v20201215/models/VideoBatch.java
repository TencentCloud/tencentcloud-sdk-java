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
package com.tencentcloudapi.iotvideo.v20201215.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoBatch extends AbstractModel{

    /**
    * 批次ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 用户ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 状态：1：待创建设备 2：创建中 3：已完成
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 设备前缀
    */
    @SerializedName("DevPre")
    @Expose
    private String DevPre;

    /**
    * 设备数量
    */
    @SerializedName("DevNum")
    @Expose
    private Long DevNum;

    /**
    * 已创建设备数量
    */
    @SerializedName("DevNumCreated")
    @Expose
    private Long DevNumCreated;

    /**
    * 批次下载地址
    */
    @SerializedName("BatchURL")
    @Expose
    private String BatchURL;

    /**
    * 创建时间。unix时间戳
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 修改时间。unix时间戳
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get 批次ID 
     * @return Id 批次ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 批次ID
     * @param Id 批次ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 用户ID 
     * @return UserId 用户ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户ID
     * @param UserId 用户ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 状态：1：待创建设备 2：创建中 3：已完成 
     * @return Status 状态：1：待创建设备 2：创建中 3：已完成
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态：1：待创建设备 2：创建中 3：已完成
     * @param Status 状态：1：待创建设备 2：创建中 3：已完成
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 设备前缀 
     * @return DevPre 设备前缀
     */
    public String getDevPre() {
        return this.DevPre;
    }

    /**
     * Set 设备前缀
     * @param DevPre 设备前缀
     */
    public void setDevPre(String DevPre) {
        this.DevPre = DevPre;
    }

    /**
     * Get 设备数量 
     * @return DevNum 设备数量
     */
    public Long getDevNum() {
        return this.DevNum;
    }

    /**
     * Set 设备数量
     * @param DevNum 设备数量
     */
    public void setDevNum(Long DevNum) {
        this.DevNum = DevNum;
    }

    /**
     * Get 已创建设备数量 
     * @return DevNumCreated 已创建设备数量
     */
    public Long getDevNumCreated() {
        return this.DevNumCreated;
    }

    /**
     * Set 已创建设备数量
     * @param DevNumCreated 已创建设备数量
     */
    public void setDevNumCreated(Long DevNumCreated) {
        this.DevNumCreated = DevNumCreated;
    }

    /**
     * Get 批次下载地址 
     * @return BatchURL 批次下载地址
     */
    public String getBatchURL() {
        return this.BatchURL;
    }

    /**
     * Set 批次下载地址
     * @param BatchURL 批次下载地址
     */
    public void setBatchURL(String BatchURL) {
        this.BatchURL = BatchURL;
    }

    /**
     * Get 创建时间。unix时间戳 
     * @return CreateTime 创建时间。unix时间戳
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。unix时间戳
     * @param CreateTime 创建时间。unix时间戳
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间。unix时间戳 
     * @return UpdateTime 修改时间。unix时间戳
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 修改时间。unix时间戳
     * @param UpdateTime 修改时间。unix时间戳
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public VideoBatch() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoBatch(VideoBatch source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.DevPre != null) {
            this.DevPre = new String(source.DevPre);
        }
        if (source.DevNum != null) {
            this.DevNum = new Long(source.DevNum);
        }
        if (source.DevNumCreated != null) {
            this.DevNumCreated = new Long(source.DevNumCreated);
        }
        if (source.BatchURL != null) {
            this.BatchURL = new String(source.BatchURL);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DevPre", this.DevPre);
        this.setParamSimple(map, prefix + "DevNum", this.DevNum);
        this.setParamSimple(map, prefix + "DevNumCreated", this.DevNumCreated);
        this.setParamSimple(map, prefix + "BatchURL", this.BatchURL);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

