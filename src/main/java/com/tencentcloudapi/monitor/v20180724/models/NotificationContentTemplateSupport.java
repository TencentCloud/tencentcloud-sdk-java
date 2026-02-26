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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NotificationContentTemplateSupport extends AbstractModel {

    /**
    * 监控类型
    */
    @SerializedName("MonitorType")
    @Expose
    private String MonitorType;

    /**
    * 支持的变量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Variables")
    @Expose
    private NotificationContentTemplateSupportDetail [] Variables;

    /**
    * 支持的函数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Functions")
    @Expose
    private NotificationContentTemplateSupportDetail [] Functions;

    /**
     * Get 监控类型 
     * @return MonitorType 监控类型
     */
    public String getMonitorType() {
        return this.MonitorType;
    }

    /**
     * Set 监控类型
     * @param MonitorType 监控类型
     */
    public void setMonitorType(String MonitorType) {
        this.MonitorType = MonitorType;
    }

    /**
     * Get 支持的变量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Variables 支持的变量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NotificationContentTemplateSupportDetail [] getVariables() {
        return this.Variables;
    }

    /**
     * Set 支持的变量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Variables 支持的变量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVariables(NotificationContentTemplateSupportDetail [] Variables) {
        this.Variables = Variables;
    }

    /**
     * Get 支持的函数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Functions 支持的函数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NotificationContentTemplateSupportDetail [] getFunctions() {
        return this.Functions;
    }

    /**
     * Set 支持的函数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Functions 支持的函数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFunctions(NotificationContentTemplateSupportDetail [] Functions) {
        this.Functions = Functions;
    }

    public NotificationContentTemplateSupport() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NotificationContentTemplateSupport(NotificationContentTemplateSupport source) {
        if (source.MonitorType != null) {
            this.MonitorType = new String(source.MonitorType);
        }
        if (source.Variables != null) {
            this.Variables = new NotificationContentTemplateSupportDetail[source.Variables.length];
            for (int i = 0; i < source.Variables.length; i++) {
                this.Variables[i] = new NotificationContentTemplateSupportDetail(source.Variables[i]);
            }
        }
        if (source.Functions != null) {
            this.Functions = new NotificationContentTemplateSupportDetail[source.Functions.length];
            for (int i = 0; i < source.Functions.length; i++) {
                this.Functions[i] = new NotificationContentTemplateSupportDetail(source.Functions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MonitorType", this.MonitorType);
        this.setParamArrayObj(map, prefix + "Variables.", this.Variables);
        this.setParamArrayObj(map, prefix + "Functions.", this.Functions);

    }
}

