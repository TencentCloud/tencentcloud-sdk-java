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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceInfo extends AbstractModel {

    /**
    * 归属类型
    */
    @SerializedName("AttributionType")
    @Expose
    private String AttributionType;

    /**
    * 资源类型
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 引擎名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 如资源类型为spark-sql 取值为Name, 如为spark-batch 取值为session app_name
    */
    @SerializedName("Instance")
    @Expose
    private String Instance;

    /**
    * 亲和性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Favor")
    @Expose
    private FavorInfo [] Favor;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 标准引擎资源组信息
    */
    @SerializedName("ResourceGroupName")
    @Expose
    private String ResourceGroupName;

    /**
    * 资源配置信息
    */
    @SerializedName("ResourceConf")
    @Expose
    private ResourceConf ResourceConf;

    /**
     * Get 归属类型 
     * @return AttributionType 归属类型
     */
    public String getAttributionType() {
        return this.AttributionType;
    }

    /**
     * Set 归属类型
     * @param AttributionType 归属类型
     */
    public void setAttributionType(String AttributionType) {
        this.AttributionType = AttributionType;
    }

    /**
     * Get 资源类型 
     * @return ResourceType 资源类型
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型
     * @param ResourceType 资源类型
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 引擎名称 
     * @return Name 引擎名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 引擎名称
     * @param Name 引擎名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 如资源类型为spark-sql 取值为Name, 如为spark-batch 取值为session app_name 
     * @return Instance 如资源类型为spark-sql 取值为Name, 如为spark-batch 取值为session app_name
     */
    public String getInstance() {
        return this.Instance;
    }

    /**
     * Set 如资源类型为spark-sql 取值为Name, 如为spark-batch 取值为session app_name
     * @param Instance 如资源类型为spark-sql 取值为Name, 如为spark-batch 取值为session app_name
     */
    public void setInstance(String Instance) {
        this.Instance = Instance;
    }

    /**
     * Get 亲和性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Favor 亲和性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FavorInfo [] getFavor() {
        return this.Favor;
    }

    /**
     * Set 亲和性
注意：此字段可能返回 null，表示取不到有效值。
     * @param Favor 亲和性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFavor(FavorInfo [] Favor) {
        this.Favor = Favor;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 标准引擎资源组信息 
     * @return ResourceGroupName 标准引擎资源组信息
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * Set 标准引擎资源组信息
     * @param ResourceGroupName 标准引擎资源组信息
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
    }

    /**
     * Get 资源配置信息 
     * @return ResourceConf 资源配置信息
     */
    public ResourceConf getResourceConf() {
        return this.ResourceConf;
    }

    /**
     * Set 资源配置信息
     * @param ResourceConf 资源配置信息
     */
    public void setResourceConf(ResourceConf ResourceConf) {
        this.ResourceConf = ResourceConf;
    }

    public ResourceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceInfo(ResourceInfo source) {
        if (source.AttributionType != null) {
            this.AttributionType = new String(source.AttributionType);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Instance != null) {
            this.Instance = new String(source.Instance);
        }
        if (source.Favor != null) {
            this.Favor = new FavorInfo[source.Favor.length];
            for (int i = 0; i < source.Favor.length; i++) {
                this.Favor[i] = new FavorInfo(source.Favor[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ResourceGroupName != null) {
            this.ResourceGroupName = new String(source.ResourceGroupName);
        }
        if (source.ResourceConf != null) {
            this.ResourceConf = new ResourceConf(source.ResourceConf);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AttributionType", this.AttributionType);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Instance", this.Instance);
        this.setParamArrayObj(map, prefix + "Favor.", this.Favor);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ResourceGroupName", this.ResourceGroupName);
        this.setParamObj(map, prefix + "ResourceConf.", this.ResourceConf);

    }
}

