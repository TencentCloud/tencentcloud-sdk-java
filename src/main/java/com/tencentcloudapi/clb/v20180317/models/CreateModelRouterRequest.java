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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateModelRouterRequest extends AbstractModel {

    /**
    * <p>模型路由类型</p><p>枚举值：</p><ul><li>Shared： 共享型</li><li>Enterprise： 企业级</li></ul>
    */
    @SerializedName("ModelRouterType")
    @Expose
    private String ModelRouterType;

    /**
    * <p>关联的积分预算ID</p>
    */
    @SerializedName("BudgetId")
    @Expose
    private String BudgetId;

    /**
    * <p>证书ID</p><p>入参限制：当Schema为HTTPS时，该参数必传</p>
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * <p>集群信息</p>
    */
    @SerializedName("ClusterInfo")
    @Expose
    private ClusterInfo ClusterInfo;

    /**
    * <p>模型路由实例名称</p><p>默认值：-</p>
    */
    @SerializedName("ModelRouterName")
    @Expose
    private String ModelRouterName;

    /**
    * <p>网络类型</p><p>枚举值：</p><ul><li>Internet： 公网</li><li>Intranet： 内网</li></ul>
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * <p>模型路由的监听端口</p><p>取值范围：[1, 65535]</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>限速配置</p>
    */
    @SerializedName("RateLimitConfig")
    @Expose
    private RateLimitConfigForModelRouter RateLimitConfig;

    /**
    * <p>路由配置</p>
    */
    @SerializedName("RouterSetting")
    @Expose
    private RouterSettingWithoutFallBack RouterSetting;

    /**
    * <p>模型路由实例的网络协议</p><p>枚举值：</p><ul><li>HTTP： HTTP协议</li><li>HTTPS： HTTPS协议</li></ul>
    */
    @SerializedName("Schema")
    @Expose
    private String Schema;

    /**
    * <p>模型路由实例所属子网的ID</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * <p>模型路由实例所属VPC的ID</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
     * Get <p>模型路由类型</p><p>枚举值：</p><ul><li>Shared： 共享型</li><li>Enterprise： 企业级</li></ul> 
     * @return ModelRouterType <p>模型路由类型</p><p>枚举值：</p><ul><li>Shared： 共享型</li><li>Enterprise： 企业级</li></ul>
     */
    public String getModelRouterType() {
        return this.ModelRouterType;
    }

    /**
     * Set <p>模型路由类型</p><p>枚举值：</p><ul><li>Shared： 共享型</li><li>Enterprise： 企业级</li></ul>
     * @param ModelRouterType <p>模型路由类型</p><p>枚举值：</p><ul><li>Shared： 共享型</li><li>Enterprise： 企业级</li></ul>
     */
    public void setModelRouterType(String ModelRouterType) {
        this.ModelRouterType = ModelRouterType;
    }

    /**
     * Get <p>关联的积分预算ID</p> 
     * @return BudgetId <p>关联的积分预算ID</p>
     */
    public String getBudgetId() {
        return this.BudgetId;
    }

    /**
     * Set <p>关联的积分预算ID</p>
     * @param BudgetId <p>关联的积分预算ID</p>
     */
    public void setBudgetId(String BudgetId) {
        this.BudgetId = BudgetId;
    }

    /**
     * Get <p>证书ID</p><p>入参限制：当Schema为HTTPS时，该参数必传</p> 
     * @return CertId <p>证书ID</p><p>入参限制：当Schema为HTTPS时，该参数必传</p>
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set <p>证书ID</p><p>入参限制：当Schema为HTTPS时，该参数必传</p>
     * @param CertId <p>证书ID</p><p>入参限制：当Schema为HTTPS时，该参数必传</p>
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get <p>集群信息</p> 
     * @return ClusterInfo <p>集群信息</p>
     */
    public ClusterInfo getClusterInfo() {
        return this.ClusterInfo;
    }

    /**
     * Set <p>集群信息</p>
     * @param ClusterInfo <p>集群信息</p>
     */
    public void setClusterInfo(ClusterInfo ClusterInfo) {
        this.ClusterInfo = ClusterInfo;
    }

    /**
     * Get <p>模型路由实例名称</p><p>默认值：-</p> 
     * @return ModelRouterName <p>模型路由实例名称</p><p>默认值：-</p>
     */
    public String getModelRouterName() {
        return this.ModelRouterName;
    }

    /**
     * Set <p>模型路由实例名称</p><p>默认值：-</p>
     * @param ModelRouterName <p>模型路由实例名称</p><p>默认值：-</p>
     */
    public void setModelRouterName(String ModelRouterName) {
        this.ModelRouterName = ModelRouterName;
    }

    /**
     * Get <p>网络类型</p><p>枚举值：</p><ul><li>Internet： 公网</li><li>Intranet： 内网</li></ul> 
     * @return NetworkType <p>网络类型</p><p>枚举值：</p><ul><li>Internet： 公网</li><li>Intranet： 内网</li></ul>
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set <p>网络类型</p><p>枚举值：</p><ul><li>Internet： 公网</li><li>Intranet： 内网</li></ul>
     * @param NetworkType <p>网络类型</p><p>枚举值：</p><ul><li>Internet： 公网</li><li>Intranet： 内网</li></ul>
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get <p>模型路由的监听端口</p><p>取值范围：[1, 65535]</p> 
     * @return Port <p>模型路由的监听端口</p><p>取值范围：[1, 65535]</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>模型路由的监听端口</p><p>取值范围：[1, 65535]</p>
     * @param Port <p>模型路由的监听端口</p><p>取值范围：[1, 65535]</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>限速配置</p> 
     * @return RateLimitConfig <p>限速配置</p>
     */
    public RateLimitConfigForModelRouter getRateLimitConfig() {
        return this.RateLimitConfig;
    }

    /**
     * Set <p>限速配置</p>
     * @param RateLimitConfig <p>限速配置</p>
     */
    public void setRateLimitConfig(RateLimitConfigForModelRouter RateLimitConfig) {
        this.RateLimitConfig = RateLimitConfig;
    }

    /**
     * Get <p>路由配置</p> 
     * @return RouterSetting <p>路由配置</p>
     */
    public RouterSettingWithoutFallBack getRouterSetting() {
        return this.RouterSetting;
    }

    /**
     * Set <p>路由配置</p>
     * @param RouterSetting <p>路由配置</p>
     */
    public void setRouterSetting(RouterSettingWithoutFallBack RouterSetting) {
        this.RouterSetting = RouterSetting;
    }

    /**
     * Get <p>模型路由实例的网络协议</p><p>枚举值：</p><ul><li>HTTP： HTTP协议</li><li>HTTPS： HTTPS协议</li></ul> 
     * @return Schema <p>模型路由实例的网络协议</p><p>枚举值：</p><ul><li>HTTP： HTTP协议</li><li>HTTPS： HTTPS协议</li></ul>
     */
    public String getSchema() {
        return this.Schema;
    }

    /**
     * Set <p>模型路由实例的网络协议</p><p>枚举值：</p><ul><li>HTTP： HTTP协议</li><li>HTTPS： HTTPS协议</li></ul>
     * @param Schema <p>模型路由实例的网络协议</p><p>枚举值：</p><ul><li>HTTP： HTTP协议</li><li>HTTPS： HTTPS协议</li></ul>
     */
    public void setSchema(String Schema) {
        this.Schema = Schema;
    }

    /**
     * Get <p>模型路由实例所属子网的ID</p> 
     * @return SubnetId <p>模型路由实例所属子网的ID</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>模型路由实例所属子网的ID</p>
     * @param SubnetId <p>模型路由实例所属子网的ID</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>标签</p> 
     * @return Tags <p>标签</p>
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签</p>
     * @param Tags <p>标签</p>
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>模型路由实例所属VPC的ID</p> 
     * @return VpcId <p>模型路由实例所属VPC的ID</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>模型路由实例所属VPC的ID</p>
     * @param VpcId <p>模型路由实例所属VPC的ID</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    public CreateModelRouterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateModelRouterRequest(CreateModelRouterRequest source) {
        if (source.ModelRouterType != null) {
            this.ModelRouterType = new String(source.ModelRouterType);
        }
        if (source.BudgetId != null) {
            this.BudgetId = new String(source.BudgetId);
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.ClusterInfo != null) {
            this.ClusterInfo = new ClusterInfo(source.ClusterInfo);
        }
        if (source.ModelRouterName != null) {
            this.ModelRouterName = new String(source.ModelRouterName);
        }
        if (source.NetworkType != null) {
            this.NetworkType = new String(source.NetworkType);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.RateLimitConfig != null) {
            this.RateLimitConfig = new RateLimitConfigForModelRouter(source.RateLimitConfig);
        }
        if (source.RouterSetting != null) {
            this.RouterSetting = new RouterSettingWithoutFallBack(source.RouterSetting);
        }
        if (source.Schema != null) {
            this.Schema = new String(source.Schema);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelRouterType", this.ModelRouterType);
        this.setParamSimple(map, prefix + "BudgetId", this.BudgetId);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamObj(map, prefix + "ClusterInfo.", this.ClusterInfo);
        this.setParamSimple(map, prefix + "ModelRouterName", this.ModelRouterName);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamObj(map, prefix + "RateLimitConfig.", this.RateLimitConfig);
        this.setParamObj(map, prefix + "RouterSetting.", this.RouterSetting);
        this.setParamSimple(map, prefix + "Schema", this.Schema);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);

    }
}

