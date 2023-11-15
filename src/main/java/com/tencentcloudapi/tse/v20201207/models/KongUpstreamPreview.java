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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KongUpstreamPreview extends AbstractModel {

    /**
    * 服务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 服务名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 后端配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Target")
    @Expose
    private KongTarget [] Target;

    /**
     * Get 服务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ID 服务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 服务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ID 服务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get 服务名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 服务名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 服务名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 服务名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 后端配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Target 后端配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KongTarget [] getTarget() {
        return this.Target;
    }

    /**
     * Set 后端配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Target 后端配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTarget(KongTarget [] Target) {
        this.Target = Target;
    }

    public KongUpstreamPreview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KongUpstreamPreview(KongUpstreamPreview source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Target != null) {
            this.Target = new KongTarget[source.Target.length];
            for (int i = 0; i < source.Target.length; i++) {
                this.Target[i] = new KongTarget(source.Target[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Target.", this.Target);

    }
}

