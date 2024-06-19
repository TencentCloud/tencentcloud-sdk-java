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
package com.tencentcloudapi.tcm.v20210413.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class APM extends AbstractModel {

    /**
    * 是否启用
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * 地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * APM 实例，如果创建时传入的参数为空，则表示自动创建 APM 实例。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 是否要删除APM实例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NeedDelete")
    @Expose
    private Boolean NeedDelete;

    /**
     * Get 是否启用 
     * @return Enable 是否启用
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set 是否启用
     * @param Enable 是否启用
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get APM 实例，如果创建时传入的参数为空，则表示自动创建 APM 实例。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId APM 实例，如果创建时传入的参数为空，则表示自动创建 APM 实例。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set APM 实例，如果创建时传入的参数为空，则表示自动创建 APM 实例。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId APM 实例，如果创建时传入的参数为空，则表示自动创建 APM 实例。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 是否要删除APM实例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NeedDelete 是否要删除APM实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getNeedDelete() {
        return this.NeedDelete;
    }

    /**
     * Set 是否要删除APM实例
注意：此字段可能返回 null，表示取不到有效值。
     * @param NeedDelete 是否要删除APM实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNeedDelete(Boolean NeedDelete) {
        this.NeedDelete = NeedDelete;
    }

    public APM() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public APM(APM source) {
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.NeedDelete != null) {
            this.NeedDelete = new Boolean(source.NeedDelete);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "NeedDelete", this.NeedDelete);

    }
}

