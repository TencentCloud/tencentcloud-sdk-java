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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SqlGatewayItem extends AbstractModel {

    /**
    * 唯一标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SerialId")
    @Expose
    private String SerialId;

    /**
    * Flink内核版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlinkVersion")
    @Expose
    private String FlinkVersion;

    /**
    * 状态，1.停止 2. 开启中 3. 开启 4. 开启失败 5. 停止中
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 创建人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatorUin")
    @Expose
    private String CreatorUin;

    /**
    * 引用资源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceRefs")
    @Expose
    private GatewayRefItem [] ResourceRefs;

    /**
    * Cu规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CuSpec")
    @Expose
    private Float CuSpec;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 配置参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Properties")
    @Expose
    private Property [] Properties;

    /**
     * Get 唯一标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SerialId 唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSerialId() {
        return this.SerialId;
    }

    /**
     * Set 唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param SerialId 唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSerialId(String SerialId) {
        this.SerialId = SerialId;
    }

    /**
     * Get Flink内核版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlinkVersion Flink内核版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlinkVersion() {
        return this.FlinkVersion;
    }

    /**
     * Set Flink内核版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlinkVersion Flink内核版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlinkVersion(String FlinkVersion) {
        this.FlinkVersion = FlinkVersion;
    }

    /**
     * Get 状态，1.停止 2. 开启中 3. 开启 4. 开启失败 5. 停止中
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态，1.停止 2. 开启中 3. 开启 4. 开启失败 5. 停止中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态，1.停止 2. 开启中 3. 开启 4. 开启失败 5. 停止中
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态，1.停止 2. 开启中 3. 开启 4. 开启失败 5. 停止中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 创建人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatorUin 创建人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set 创建人
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatorUin 创建人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatorUin(String CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get 引用资源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceRefs 引用资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GatewayRefItem [] getResourceRefs() {
        return this.ResourceRefs;
    }

    /**
     * Set 引用资源
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceRefs 引用资源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceRefs(GatewayRefItem [] ResourceRefs) {
        this.ResourceRefs = ResourceRefs;
    }

    /**
     * Get Cu规格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CuSpec Cu规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getCuSpec() {
        return this.CuSpec;
    }

    /**
     * Set Cu规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param CuSpec Cu规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCuSpec(Float CuSpec) {
        this.CuSpec = CuSpec;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 配置参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Properties 配置参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Property [] getProperties() {
        return this.Properties;
    }

    /**
     * Set 配置参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Properties 配置参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProperties(Property [] Properties) {
        this.Properties = Properties;
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

    }
}

