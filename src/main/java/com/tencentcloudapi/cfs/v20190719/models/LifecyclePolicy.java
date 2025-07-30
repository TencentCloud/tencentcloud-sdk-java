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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LifecyclePolicy extends AbstractModel {

    /**
    * 生命周期管理策略创建的时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 生命周期管理策略ID
    */
    @SerializedName("LifecyclePolicyID")
    @Expose
    private String LifecyclePolicyID;

    /**
    * 生命周期管理策略名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LifecyclePolicyName")
    @Expose
    private String LifecyclePolicyName;

    /**
    * 生命周期管理策略关联的管理规则列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LifecycleRules")
    @Expose
    private LifecycleRule [] LifecycleRules;

    /**
    * 生命周期管理策略关联目录的绝对路径列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Paths")
    @Expose
    private PathInfo [] Paths;

    /**
     * Get 生命周期管理策略创建的时间 
     * @return CreateTime 生命周期管理策略创建的时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 生命周期管理策略创建的时间
     * @param CreateTime 生命周期管理策略创建的时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 生命周期管理策略ID 
     * @return LifecyclePolicyID 生命周期管理策略ID
     */
    public String getLifecyclePolicyID() {
        return this.LifecyclePolicyID;
    }

    /**
     * Set 生命周期管理策略ID
     * @param LifecyclePolicyID 生命周期管理策略ID
     */
    public void setLifecyclePolicyID(String LifecyclePolicyID) {
        this.LifecyclePolicyID = LifecyclePolicyID;
    }

    /**
     * Get 生命周期管理策略名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LifecyclePolicyName 生命周期管理策略名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLifecyclePolicyName() {
        return this.LifecyclePolicyName;
    }

    /**
     * Set 生命周期管理策略名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param LifecyclePolicyName 生命周期管理策略名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLifecyclePolicyName(String LifecyclePolicyName) {
        this.LifecyclePolicyName = LifecyclePolicyName;
    }

    /**
     * Get 生命周期管理策略关联的管理规则列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LifecycleRules 生命周期管理策略关联的管理规则列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LifecycleRule [] getLifecycleRules() {
        return this.LifecycleRules;
    }

    /**
     * Set 生命周期管理策略关联的管理规则列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param LifecycleRules 生命周期管理策略关联的管理规则列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLifecycleRules(LifecycleRule [] LifecycleRules) {
        this.LifecycleRules = LifecycleRules;
    }

    /**
     * Get 生命周期管理策略关联目录的绝对路径列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Paths 生命周期管理策略关联目录的绝对路径列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PathInfo [] getPaths() {
        return this.Paths;
    }

    /**
     * Set 生命周期管理策略关联目录的绝对路径列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Paths 生命周期管理策略关联目录的绝对路径列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaths(PathInfo [] Paths) {
        this.Paths = Paths;
    }

    public LifecyclePolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LifecyclePolicy(LifecyclePolicy source) {
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.LifecyclePolicyID != null) {
            this.LifecyclePolicyID = new String(source.LifecyclePolicyID);
        }
        if (source.LifecyclePolicyName != null) {
            this.LifecyclePolicyName = new String(source.LifecyclePolicyName);
        }
        if (source.LifecycleRules != null) {
            this.LifecycleRules = new LifecycleRule[source.LifecycleRules.length];
            for (int i = 0; i < source.LifecycleRules.length; i++) {
                this.LifecycleRules[i] = new LifecycleRule(source.LifecycleRules[i]);
            }
        }
        if (source.Paths != null) {
            this.Paths = new PathInfo[source.Paths.length];
            for (int i = 0; i < source.Paths.length; i++) {
                this.Paths[i] = new PathInfo(source.Paths[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "LifecyclePolicyID", this.LifecyclePolicyID);
        this.setParamSimple(map, prefix + "LifecyclePolicyName", this.LifecyclePolicyName);
        this.setParamArrayObj(map, prefix + "LifecycleRules.", this.LifecycleRules);
        this.setParamArrayObj(map, prefix + "Paths.", this.Paths);

    }
}

