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

public class BudgetAssociation extends AbstractModel {

    /**
    * <p>Budget ID。</p>
    */
    @SerializedName("BudgetId")
    @Expose
    private String BudgetId;

    /**
    * <p>关联创建时间。</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>Key ID。仅当Type为Key时返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * <p>模型路由实例ID。</p><p>当Type为ModelRouter时表示关联资源本身；当Type为Key时表示Key所属实例。</p>
    */
    @SerializedName("ModelRouterId")
    @Expose
    private String ModelRouterId;

    /**
    * <p>关联资源类型。</p><p>枚举值：</p><ul><li>ModelRouter：模型路由实例</li><li>Key：模型路由Key</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>关联关系的状态</p><p>枚举值：</p><ul><li>Active： 已生效</li><li>Configuring： 配置中</li><li>ConfigureFailed： 配置失败</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get <p>Budget ID。</p> 
     * @return BudgetId <p>Budget ID。</p>
     */
    public String getBudgetId() {
        return this.BudgetId;
    }

    /**
     * Set <p>Budget ID。</p>
     * @param BudgetId <p>Budget ID。</p>
     */
    public void setBudgetId(String BudgetId) {
        this.BudgetId = BudgetId;
    }

    /**
     * Get <p>关联创建时间。</p> 
     * @return CreatedTime <p>关联创建时间。</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>关联创建时间。</p>
     * @param CreatedTime <p>关联创建时间。</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>Key ID。仅当Type为Key时返回。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyId <p>Key ID。仅当Type为Key时返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set <p>Key ID。仅当Type为Key时返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyId <p>Key ID。仅当Type为Key时返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get <p>模型路由实例ID。</p><p>当Type为ModelRouter时表示关联资源本身；当Type为Key时表示Key所属实例。</p> 
     * @return ModelRouterId <p>模型路由实例ID。</p><p>当Type为ModelRouter时表示关联资源本身；当Type为Key时表示Key所属实例。</p>
     */
    public String getModelRouterId() {
        return this.ModelRouterId;
    }

    /**
     * Set <p>模型路由实例ID。</p><p>当Type为ModelRouter时表示关联资源本身；当Type为Key时表示Key所属实例。</p>
     * @param ModelRouterId <p>模型路由实例ID。</p><p>当Type为ModelRouter时表示关联资源本身；当Type为Key时表示Key所属实例。</p>
     */
    public void setModelRouterId(String ModelRouterId) {
        this.ModelRouterId = ModelRouterId;
    }

    /**
     * Get <p>关联资源类型。</p><p>枚举值：</p><ul><li>ModelRouter：模型路由实例</li><li>Key：模型路由Key</li></ul> 
     * @return Type <p>关联资源类型。</p><p>枚举值：</p><ul><li>ModelRouter：模型路由实例</li><li>Key：模型路由Key</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>关联资源类型。</p><p>枚举值：</p><ul><li>ModelRouter：模型路由实例</li><li>Key：模型路由Key</li></ul>
     * @param Type <p>关联资源类型。</p><p>枚举值：</p><ul><li>ModelRouter：模型路由实例</li><li>Key：模型路由Key</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>关联关系的状态</p><p>枚举值：</p><ul><li>Active： 已生效</li><li>Configuring： 配置中</li><li>ConfigureFailed： 配置失败</li></ul> 
     * @return Status <p>关联关系的状态</p><p>枚举值：</p><ul><li>Active： 已生效</li><li>Configuring： 配置中</li><li>ConfigureFailed： 配置失败</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>关联关系的状态</p><p>枚举值：</p><ul><li>Active： 已生效</li><li>Configuring： 配置中</li><li>ConfigureFailed： 配置失败</li></ul>
     * @param Status <p>关联关系的状态</p><p>枚举值：</p><ul><li>Active： 已生效</li><li>Configuring： 配置中</li><li>ConfigureFailed： 配置失败</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public BudgetAssociation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BudgetAssociation(BudgetAssociation source) {
        if (source.BudgetId != null) {
            this.BudgetId = new String(source.BudgetId);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.ModelRouterId != null) {
            this.ModelRouterId = new String(source.ModelRouterId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BudgetId", this.BudgetId);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "ModelRouterId", this.ModelRouterId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

