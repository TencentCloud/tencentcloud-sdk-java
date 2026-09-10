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

public class CNAPIGwAIServiceSource extends AbstractModel {

    /**
    * <p>服务来源</p>
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * <p>服务ID</p>
    */
    @SerializedName("SourceId")
    @Expose
    private String SourceId;

    /**
    * <p>来源类型</p>
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * <p>来源产品</p>
    */
    @SerializedName("SourceProduct")
    @Expose
    private String SourceProduct;

    /**
    * <p>来源配置信息</p>
    */
    @SerializedName("SourceInfo")
    @Expose
    private CNAPIGwAIServiceSourceInfo SourceInfo;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>服务来源</p> 
     * @return SourceName <p>服务来源</p>
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set <p>服务来源</p>
     * @param SourceName <p>服务来源</p>
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    /**
     * Get <p>服务ID</p> 
     * @return SourceId <p>服务ID</p>
     */
    public String getSourceId() {
        return this.SourceId;
    }

    /**
     * Set <p>服务ID</p>
     * @param SourceId <p>服务ID</p>
     */
    public void setSourceId(String SourceId) {
        this.SourceId = SourceId;
    }

    /**
     * Get <p>来源类型</p> 
     * @return SourceType <p>来源类型</p>
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set <p>来源类型</p>
     * @param SourceType <p>来源类型</p>
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get <p>来源产品</p> 
     * @return SourceProduct <p>来源产品</p>
     */
    public String getSourceProduct() {
        return this.SourceProduct;
    }

    /**
     * Set <p>来源产品</p>
     * @param SourceProduct <p>来源产品</p>
     */
    public void setSourceProduct(String SourceProduct) {
        this.SourceProduct = SourceProduct;
    }

    /**
     * Get <p>来源配置信息</p> 
     * @return SourceInfo <p>来源配置信息</p>
     */
    public CNAPIGwAIServiceSourceInfo getSourceInfo() {
        return this.SourceInfo;
    }

    /**
     * Set <p>来源配置信息</p>
     * @param SourceInfo <p>来源配置信息</p>
     */
    public void setSourceInfo(CNAPIGwAIServiceSourceInfo SourceInfo) {
        this.SourceInfo = SourceInfo;
    }

    /**
     * Get <p>描述</p> 
     * @return Description <p>描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
     * @param Description <p>描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public CNAPIGwAIServiceSource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CNAPIGwAIServiceSource(CNAPIGwAIServiceSource source) {
        if (source.SourceName != null) {
            this.SourceName = new String(source.SourceName);
        }
        if (source.SourceId != null) {
            this.SourceId = new String(source.SourceId);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.SourceProduct != null) {
            this.SourceProduct = new String(source.SourceProduct);
        }
        if (source.SourceInfo != null) {
            this.SourceInfo = new CNAPIGwAIServiceSourceInfo(source.SourceInfo);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamSimple(map, prefix + "SourceId", this.SourceId);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "SourceProduct", this.SourceProduct);
        this.setParamObj(map, prefix + "SourceInfo.", this.SourceInfo);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

