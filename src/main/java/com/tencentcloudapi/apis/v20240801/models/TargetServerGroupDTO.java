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
package com.tencentcloudapi.apis.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetServerGroupDTO extends AbstractModel {

    /**
    * <p>后端服务组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * <p>名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>目标服务器列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetHosts")
    @Expose
    private TargetHostDTO [] TargetHosts;

    /**
    * <p>目标Host类型 0 默认 1 vpc</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetHostType")
    @Expose
    private Long TargetHostType;

    /**
    * <p>关联的服务数量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceCount")
    @Expose
    private Long ServiceCount;

    /**
    * <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get <p>后端服务组ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ID <p>后端服务组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set <p>后端服务组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ID <p>后端服务组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get <p>名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>目标服务器列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetHosts <p>目标服务器列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TargetHostDTO [] getTargetHosts() {
        return this.TargetHosts;
    }

    /**
     * Set <p>目标服务器列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetHosts <p>目标服务器列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetHosts(TargetHostDTO [] TargetHosts) {
        this.TargetHosts = TargetHosts;
    }

    /**
     * Get <p>目标Host类型 0 默认 1 vpc</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetHostType <p>目标Host类型 0 默认 1 vpc</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTargetHostType() {
        return this.TargetHostType;
    }

    /**
     * Set <p>目标Host类型 0 默认 1 vpc</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetHostType <p>目标Host类型 0 默认 1 vpc</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetHostType(Long TargetHostType) {
        this.TargetHostType = TargetHostType;
    }

    /**
     * Get <p>关联的服务数量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceCount <p>关联的服务数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getServiceCount() {
        return this.ServiceCount;
    }

    /**
     * Set <p>关联的服务数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceCount <p>关联的服务数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceCount(Long ServiceCount) {
        this.ServiceCount = ServiceCount;
    }

    /**
     * Get <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public TargetServerGroupDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetServerGroupDTO(TargetServerGroupDTO source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TargetHosts != null) {
            this.TargetHosts = new TargetHostDTO[source.TargetHosts.length];
            for (int i = 0; i < source.TargetHosts.length; i++) {
                this.TargetHosts[i] = new TargetHostDTO(source.TargetHosts[i]);
            }
        }
        if (source.TargetHostType != null) {
            this.TargetHostType = new Long(source.TargetHostType);
        }
        if (source.ServiceCount != null) {
            this.ServiceCount = new Long(source.ServiceCount);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "TargetHosts.", this.TargetHosts);
        this.setParamSimple(map, prefix + "TargetHostType", this.TargetHostType);
        this.setParamSimple(map, prefix + "ServiceCount", this.ServiceCount);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

