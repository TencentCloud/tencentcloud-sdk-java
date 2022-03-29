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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BoundK8SInfo extends AbstractModel{

    /**
    * 绑定的kubernetes集群ID
    */
    @SerializedName("BoundClusterId")
    @Expose
    private String BoundClusterId;

    /**
    * 绑定的kubernetes的集群类型，分tke和eks两种
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BoundClusterType")
    @Expose
    private String BoundClusterType;

    /**
    * 服务同步模式，all为全量同步，demand为按需同步
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SyncMode")
    @Expose
    private String SyncMode;

    /**
     * Get 绑定的kubernetes集群ID 
     * @return BoundClusterId 绑定的kubernetes集群ID
     */
    public String getBoundClusterId() {
        return this.BoundClusterId;
    }

    /**
     * Set 绑定的kubernetes集群ID
     * @param BoundClusterId 绑定的kubernetes集群ID
     */
    public void setBoundClusterId(String BoundClusterId) {
        this.BoundClusterId = BoundClusterId;
    }

    /**
     * Get 绑定的kubernetes的集群类型，分tke和eks两种
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BoundClusterType 绑定的kubernetes的集群类型，分tke和eks两种
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBoundClusterType() {
        return this.BoundClusterType;
    }

    /**
     * Set 绑定的kubernetes的集群类型，分tke和eks两种
注意：此字段可能返回 null，表示取不到有效值。
     * @param BoundClusterType 绑定的kubernetes的集群类型，分tke和eks两种
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBoundClusterType(String BoundClusterType) {
        this.BoundClusterType = BoundClusterType;
    }

    /**
     * Get 服务同步模式，all为全量同步，demand为按需同步
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SyncMode 服务同步模式，all为全量同步，demand为按需同步
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSyncMode() {
        return this.SyncMode;
    }

    /**
     * Set 服务同步模式，all为全量同步，demand为按需同步
注意：此字段可能返回 null，表示取不到有效值。
     * @param SyncMode 服务同步模式，all为全量同步，demand为按需同步
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSyncMode(String SyncMode) {
        this.SyncMode = SyncMode;
    }

    public BoundK8SInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BoundK8SInfo(BoundK8SInfo source) {
        if (source.BoundClusterId != null) {
            this.BoundClusterId = new String(source.BoundClusterId);
        }
        if (source.BoundClusterType != null) {
            this.BoundClusterType = new String(source.BoundClusterType);
        }
        if (source.SyncMode != null) {
            this.SyncMode = new String(source.SyncMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BoundClusterId", this.BoundClusterId);
        this.setParamSimple(map, prefix + "BoundClusterType", this.BoundClusterType);
        this.setParamSimple(map, prefix + "SyncMode", this.SyncMode);

    }
}

