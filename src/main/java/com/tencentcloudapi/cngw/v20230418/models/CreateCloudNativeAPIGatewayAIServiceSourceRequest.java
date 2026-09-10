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

public class CreateCloudNativeAPIGatewayAIServiceSourceRequest extends AbstractModel {

    /**
    * <p>实例 ID</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>来源类型:</p><ul><li>MCPRegistry:  mcp 注册中心</li></ul>
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * <p>服务来源名字</p>
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * <p>来源产品：- TSFNacos：TSF Nacos</p>
    */
    @SerializedName("SourceProduct")
    @Expose
    private String SourceProduct;

    /**
    * <p>来源详情</p>
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
     * Get <p>实例 ID</p> 
     * @return GatewayId <p>实例 ID</p>
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set <p>实例 ID</p>
     * @param GatewayId <p>实例 ID</p>
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get <p>来源类型:</p><ul><li>MCPRegistry:  mcp 注册中心</li></ul> 
     * @return SourceType <p>来源类型:</p><ul><li>MCPRegistry:  mcp 注册中心</li></ul>
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set <p>来源类型:</p><ul><li>MCPRegistry:  mcp 注册中心</li></ul>
     * @param SourceType <p>来源类型:</p><ul><li>MCPRegistry:  mcp 注册中心</li></ul>
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get <p>服务来源名字</p> 
     * @return SourceName <p>服务来源名字</p>
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set <p>服务来源名字</p>
     * @param SourceName <p>服务来源名字</p>
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    /**
     * Get <p>来源产品：- TSFNacos：TSF Nacos</p> 
     * @return SourceProduct <p>来源产品：- TSFNacos：TSF Nacos</p>
     */
    public String getSourceProduct() {
        return this.SourceProduct;
    }

    /**
     * Set <p>来源产品：- TSFNacos：TSF Nacos</p>
     * @param SourceProduct <p>来源产品：- TSFNacos：TSF Nacos</p>
     */
    public void setSourceProduct(String SourceProduct) {
        this.SourceProduct = SourceProduct;
    }

    /**
     * Get <p>来源详情</p> 
     * @return SourceInfo <p>来源详情</p>
     */
    public CNAPIGwAIServiceSourceInfo getSourceInfo() {
        return this.SourceInfo;
    }

    /**
     * Set <p>来源详情</p>
     * @param SourceInfo <p>来源详情</p>
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

    public CreateCloudNativeAPIGatewayAIServiceSourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCloudNativeAPIGatewayAIServiceSourceRequest(CreateCloudNativeAPIGatewayAIServiceSourceRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.SourceName != null) {
            this.SourceName = new String(source.SourceName);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamSimple(map, prefix + "SourceProduct", this.SourceProduct);
        this.setParamObj(map, prefix + "SourceInfo.", this.SourceInfo);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

