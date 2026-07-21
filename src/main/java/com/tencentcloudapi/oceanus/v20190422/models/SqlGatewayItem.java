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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SqlGatewayItem extends AbstractModel {

    /**
    * <p>唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SerialId")
    @Expose
    private String SerialId;

    /**
    * <p>Flink内核版本</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlinkVersion")
    @Expose
    private String FlinkVersion;

    /**
    * <p>状态，1.停止 2. 开启中 3. 开启 4. 开启失败 5. 停止中</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatorUin")
    @Expose
    private String CreatorUin;

    /**
    * <p>引用资源</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceRefs")
    @Expose
    private GatewayRefItem [] ResourceRefs;

    /**
    * <p>Cu规格</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CuSpec")
    @Expose
    private Float CuSpec;

    /**
    * <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>配置参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Properties")
    @Expose
    private Property [] Properties;

    /**
    * <p>Cpu</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Float Cpu;

    /**
    * <p>Mem</p>
    */
    @SerializedName("Mem")
    @Expose
    private Float Mem;

    /**
    * <p>jdk版本</p>
    */
    @SerializedName("JdkVersion")
    @Expose
    private String JdkVersion;

    /**
    * <p>session id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionClusterId")
    @Expose
    private String SessionClusterId;

    /**
    * <p>pg用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PgUser")
    @Expose
    private String PgUser;

    /**
    * <p>协议</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Endpoints")
    @Expose
    private SqlGatewayEndpoint [] Endpoints;

    /**
     * Get <p>唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SerialId <p>唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSerialId() {
        return this.SerialId;
    }

    /**
     * Set <p>唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SerialId <p>唯一标识</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSerialId(String SerialId) {
        this.SerialId = SerialId;
    }

    /**
     * Get <p>Flink内核版本</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlinkVersion <p>Flink内核版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlinkVersion() {
        return this.FlinkVersion;
    }

    /**
     * Set <p>Flink内核版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlinkVersion <p>Flink内核版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlinkVersion(String FlinkVersion) {
        this.FlinkVersion = FlinkVersion;
    }

    /**
     * Get <p>状态，1.停止 2. 开启中 3. 开启 4. 开启失败 5. 停止中</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>状态，1.停止 2. 开启中 3. 开启 4. 开启失败 5. 停止中</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态，1.停止 2. 开启中 3. 开启 4. 开启失败 5. 停止中</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>状态，1.停止 2. 开启中 3. 开启 4. 开启失败 5. 停止中</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatorUin <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatorUin <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatorUin(String CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get <p>引用资源</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceRefs <p>引用资源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GatewayRefItem [] getResourceRefs() {
        return this.ResourceRefs;
    }

    /**
     * Set <p>引用资源</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceRefs <p>引用资源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceRefs(GatewayRefItem [] ResourceRefs) {
        this.ResourceRefs = ResourceRefs;
    }

    /**
     * Get <p>Cu规格</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CuSpec <p>Cu规格</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getCuSpec() {
        return this.CuSpec;
    }

    /**
     * Set <p>Cu规格</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CuSpec <p>Cu规格</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCuSpec(Float CuSpec) {
        this.CuSpec = CuSpec;
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

    /**
     * Get <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>配置参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Properties <p>配置参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Property [] getProperties() {
        return this.Properties;
    }

    /**
     * Set <p>配置参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Properties <p>配置参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProperties(Property [] Properties) {
        this.Properties = Properties;
    }

    /**
     * Get <p>Cpu</p> 
     * @return Cpu <p>Cpu</p>
     */
    public Float getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>Cpu</p>
     * @param Cpu <p>Cpu</p>
     */
    public void setCpu(Float Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>Mem</p> 
     * @return Mem <p>Mem</p>
     */
    public Float getMem() {
        return this.Mem;
    }

    /**
     * Set <p>Mem</p>
     * @param Mem <p>Mem</p>
     */
    public void setMem(Float Mem) {
        this.Mem = Mem;
    }

    /**
     * Get <p>jdk版本</p> 
     * @return JdkVersion <p>jdk版本</p>
     */
    public String getJdkVersion() {
        return this.JdkVersion;
    }

    /**
     * Set <p>jdk版本</p>
     * @param JdkVersion <p>jdk版本</p>
     */
    public void setJdkVersion(String JdkVersion) {
        this.JdkVersion = JdkVersion;
    }

    /**
     * Get <p>session id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionClusterId <p>session id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSessionClusterId() {
        return this.SessionClusterId;
    }

    /**
     * Set <p>session id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionClusterId <p>session id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionClusterId(String SessionClusterId) {
        this.SessionClusterId = SessionClusterId;
    }

    /**
     * Get <p>pg用户名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PgUser <p>pg用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPgUser() {
        return this.PgUser;
    }

    /**
     * Set <p>pg用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PgUser <p>pg用户名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPgUser(String PgUser) {
        this.PgUser = PgUser;
    }

    /**
     * Get <p>协议</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Endpoints <p>协议</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SqlGatewayEndpoint [] getEndpoints() {
        return this.Endpoints;
    }

    /**
     * Set <p>协议</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Endpoints <p>协议</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndpoints(SqlGatewayEndpoint [] Endpoints) {
        this.Endpoints = Endpoints;
    }

    public SqlGatewayItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SqlGatewayItem(SqlGatewayItem source) {
        if (source.SerialId != null) {
            this.SerialId = new String(source.SerialId);
        }
        if (source.FlinkVersion != null) {
            this.FlinkVersion = new String(source.FlinkVersion);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreatorUin != null) {
            this.CreatorUin = new String(source.CreatorUin);
        }
        if (source.ResourceRefs != null) {
            this.ResourceRefs = new GatewayRefItem[source.ResourceRefs.length];
            for (int i = 0; i < source.ResourceRefs.length; i++) {
                this.ResourceRefs[i] = new GatewayRefItem(source.ResourceRefs[i]);
            }
        }
        if (source.CuSpec != null) {
            this.CuSpec = new Float(source.CuSpec);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Properties != null) {
            this.Properties = new Property[source.Properties.length];
            for (int i = 0; i < source.Properties.length; i++) {
                this.Properties[i] = new Property(source.Properties[i]);
            }
        }
        if (source.Cpu != null) {
            this.Cpu = new Float(source.Cpu);
        }
        if (source.Mem != null) {
            this.Mem = new Float(source.Mem);
        }
        if (source.JdkVersion != null) {
            this.JdkVersion = new String(source.JdkVersion);
        }
        if (source.SessionClusterId != null) {
            this.SessionClusterId = new String(source.SessionClusterId);
        }
        if (source.PgUser != null) {
            this.PgUser = new String(source.PgUser);
        }
        if (source.Endpoints != null) {
            this.Endpoints = new SqlGatewayEndpoint[source.Endpoints.length];
            for (int i = 0; i < source.Endpoints.length; i++) {
                this.Endpoints[i] = new SqlGatewayEndpoint(source.Endpoints[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SerialId", this.SerialId);
        this.setParamSimple(map, prefix + "FlinkVersion", this.FlinkVersion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreatorUin", this.CreatorUin);
        this.setParamArrayObj(map, prefix + "ResourceRefs.", this.ResourceRefs);
        this.setParamSimple(map, prefix + "CuSpec", this.CuSpec);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "JdkVersion", this.JdkVersion);
        this.setParamSimple(map, prefix + "SessionClusterId", this.SessionClusterId);
        this.setParamSimple(map, prefix + "PgUser", this.PgUser);
        this.setParamArrayObj(map, prefix + "Endpoints.", this.Endpoints);

    }
}

