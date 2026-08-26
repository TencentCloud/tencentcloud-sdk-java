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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceInstance extends AbstractModel {

    /**
    * <p>实例 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>服务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
    * <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>是否就绪</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsReady")
    @Expose
    private Boolean IsReady;

    /**
     * Get <p>实例 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id <p>实例 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>实例 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id <p>实例 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>服务名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Service <p>服务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getService() {
        return this.Service;
    }

    /**
     * Set <p>服务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Service <p>服务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setService(String Service) {
        this.Service = Service;
    }

    /**
     * Get <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>是否就绪</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsReady <p>是否就绪</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsReady() {
        return this.IsReady;
    }

    /**
     * Set <p>是否就绪</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsReady <p>是否就绪</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsReady(Boolean IsReady) {
        this.IsReady = IsReady;
    }

    public ResourceInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceInstance(ResourceInstance source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Service != null) {
            this.Service = new String(source.Service);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.IsReady != null) {
            this.IsReady = new Boolean(source.IsReady);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Service", this.Service);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "IsReady", this.IsReady);

    }
}

