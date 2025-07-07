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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NativeGatewayServiceSourceItem extends AbstractModel {

    /**
    * 网关实例ID
    */
    @SerializedName("GatewayID")
    @Expose
    private String GatewayID;

    /**
    * 服务来源ID
    */
    @SerializedName("SourceID")
    @Expose
    private String SourceID;

    /**
    * 服务来源名称
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * 服务来源类型
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 服务来源额外信息
    */
    @SerializedName("SourceInfo")
    @Expose
    private SourceInfo SourceInfo;

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
     * Get 网关实例ID 
     * @return GatewayID 网关实例ID
     */
    public String getGatewayID() {
        return this.GatewayID;
    }

    /**
     * Set 网关实例ID
     * @param GatewayID 网关实例ID
     */
    public void setGatewayID(String GatewayID) {
        this.GatewayID = GatewayID;
    }

    /**
     * Get 服务来源ID 
     * @return SourceID 服务来源ID
     */
    public String getSourceID() {
        return this.SourceID;
    }

    /**
     * Set 服务来源ID
     * @param SourceID 服务来源ID
     */
    public void setSourceID(String SourceID) {
        this.SourceID = SourceID;
    }

    /**
     * Get 服务来源名称 
     * @return SourceName 服务来源名称
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set 服务来源名称
     * @param SourceName 服务来源名称
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    /**
     * Get 服务来源类型 
     * @return SourceType 服务来源类型
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 服务来源类型
     * @param SourceType 服务来源类型
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 服务来源额外信息 
     * @return SourceInfo 服务来源额外信息
     */
    public SourceInfo getSourceInfo() {
        return this.SourceInfo;
    }

    /**
     * Set 服务来源额外信息
     * @param SourceInfo 服务来源额外信息
     */
    public void setSourceInfo(SourceInfo SourceInfo) {
        this.SourceInfo = SourceInfo;
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

    public NativeGatewayServiceSourceItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NativeGatewayServiceSourceItem(NativeGatewayServiceSourceItem source) {
        if (source.GatewayID != null) {
            this.GatewayID = new String(source.GatewayID);
        }
        if (source.SourceID != null) {
            this.SourceID = new String(source.SourceID);
        }
        if (source.SourceName != null) {
            this.SourceName = new String(source.SourceName);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.SourceInfo != null) {
            this.SourceInfo = new SourceInfo(source.SourceInfo);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayID", this.GatewayID);
        this.setParamSimple(map, prefix + "SourceID", this.SourceID);
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamObj(map, prefix + "SourceInfo.", this.SourceInfo);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

