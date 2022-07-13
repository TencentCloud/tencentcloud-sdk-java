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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterVersion extends AbstractModel{

    /**
    * 集群的Flink版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Flink")
    @Expose
    private String Flink;

    /**
    * 集群支持的Flink版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportedFlink")
    @Expose
    private String [] SupportedFlink;

    /**
     * Get 集群的Flink版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Flink 集群的Flink版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlink() {
        return this.Flink;
    }

    /**
     * Set 集群的Flink版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param Flink 集群的Flink版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlink(String Flink) {
        this.Flink = Flink;
    }

    /**
     * Get 集群支持的Flink版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportedFlink 集群支持的Flink版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSupportedFlink() {
        return this.SupportedFlink;
    }

    /**
     * Set 集群支持的Flink版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportedFlink 集群支持的Flink版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportedFlink(String [] SupportedFlink) {
        this.SupportedFlink = SupportedFlink;
    }

    public ClusterVersion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterVersion(ClusterVersion source) {
        if (source.Flink != null) {
            this.Flink = new String(source.Flink);
        }
        if (source.SupportedFlink != null) {
            this.SupportedFlink = new String[source.SupportedFlink.length];
            for (int i = 0; i < source.SupportedFlink.length; i++) {
                this.SupportedFlink[i] = new String(source.SupportedFlink[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Flink", this.Flink);
        this.setParamArraySimple(map, prefix + "SupportedFlink.", this.SupportedFlink);

    }
}

