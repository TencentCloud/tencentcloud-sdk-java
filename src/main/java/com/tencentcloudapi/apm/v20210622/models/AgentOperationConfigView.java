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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentOperationConfigView extends AbstractModel {

    /**
    * 当前接口配置是否开启了接口白名单配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetentionValid")
    @Expose
    private Boolean RetentionValid;

    /**
    * RetentionValid为false时生效，接口配置中的黑名单配置，配置中的接口不采集
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IgnoreOperation")
    @Expose
    private String IgnoreOperation;

    /**
    * RetentionValid为true时生效，接口配置中的白名单配置，仅采集配置中的接口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetentionOperation")
    @Expose
    private String RetentionOperation;

    /**
     * Get 当前接口配置是否开启了接口白名单配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RetentionValid 当前接口配置是否开启了接口白名单配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getRetentionValid() {
        return this.RetentionValid;
    }

    /**
     * Set 当前接口配置是否开启了接口白名单配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param RetentionValid 当前接口配置是否开启了接口白名单配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetentionValid(Boolean RetentionValid) {
        this.RetentionValid = RetentionValid;
    }

    /**
     * Get RetentionValid为false时生效，接口配置中的黑名单配置，配置中的接口不采集
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IgnoreOperation RetentionValid为false时生效，接口配置中的黑名单配置，配置中的接口不采集
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIgnoreOperation() {
        return this.IgnoreOperation;
    }

    /**
     * Set RetentionValid为false时生效，接口配置中的黑名单配置，配置中的接口不采集
注意：此字段可能返回 null，表示取不到有效值。
     * @param IgnoreOperation RetentionValid为false时生效，接口配置中的黑名单配置，配置中的接口不采集
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIgnoreOperation(String IgnoreOperation) {
        this.IgnoreOperation = IgnoreOperation;
    }

    /**
     * Get RetentionValid为true时生效，接口配置中的白名单配置，仅采集配置中的接口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RetentionOperation RetentionValid为true时生效，接口配置中的白名单配置，仅采集配置中的接口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRetentionOperation() {
        return this.RetentionOperation;
    }

    /**
     * Set RetentionValid为true时生效，接口配置中的白名单配置，仅采集配置中的接口
注意：此字段可能返回 null，表示取不到有效值。
     * @param RetentionOperation RetentionValid为true时生效，接口配置中的白名单配置，仅采集配置中的接口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetentionOperation(String RetentionOperation) {
        this.RetentionOperation = RetentionOperation;
    }

    public AgentOperationConfigView() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentOperationConfigView(AgentOperationConfigView source) {
        if (source.RetentionValid != null) {
            this.RetentionValid = new Boolean(source.RetentionValid);
        }
        if (source.IgnoreOperation != null) {
            this.IgnoreOperation = new String(source.IgnoreOperation);
        }
        if (source.RetentionOperation != null) {
            this.RetentionOperation = new String(source.RetentionOperation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RetentionValid", this.RetentionValid);
        this.setParamSimple(map, prefix + "IgnoreOperation", this.IgnoreOperation);
        this.setParamSimple(map, prefix + "RetentionOperation", this.RetentionOperation);

    }
}

