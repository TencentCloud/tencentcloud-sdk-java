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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TemplateMonitor extends AbstractModel{

    /**
    * 监控指标ID
    */
    @SerializedName("MonitorId")
    @Expose
    private Long MonitorId;

    /**
    * 监控指标对象类型ID
    */
    @SerializedName("ObjectTypeId")
    @Expose
    private Long ObjectTypeId;

    /**
    * 指标名称
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 中文指标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetricChineseName")
    @Expose
    private String MetricChineseName;

    /**
     * Get 监控指标ID 
     * @return MonitorId 监控指标ID
     */
    public Long getMonitorId() {
        return this.MonitorId;
    }

    /**
     * Set 监控指标ID
     * @param MonitorId 监控指标ID
     */
    public void setMonitorId(Long MonitorId) {
        this.MonitorId = MonitorId;
    }

    /**
     * Get 监控指标对象类型ID 
     * @return ObjectTypeId 监控指标对象类型ID
     */
    public Long getObjectTypeId() {
        return this.ObjectTypeId;
    }

    /**
     * Set 监控指标对象类型ID
     * @param ObjectTypeId 监控指标对象类型ID
     */
    public void setObjectTypeId(Long ObjectTypeId) {
        this.ObjectTypeId = ObjectTypeId;
    }

    /**
     * Get 指标名称 
     * @return MetricName 指标名称
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 指标名称
     * @param MetricName 指标名称
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 中文指标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetricChineseName 中文指标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMetricChineseName() {
        return this.MetricChineseName;
    }

    /**
     * Set 中文指标
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetricChineseName 中文指标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetricChineseName(String MetricChineseName) {
        this.MetricChineseName = MetricChineseName;
    }

    public TemplateMonitor() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TemplateMonitor(TemplateMonitor source) {
        if (source.MonitorId != null) {
            this.MonitorId = new Long(source.MonitorId);
        }
        if (source.ObjectTypeId != null) {
            this.ObjectTypeId = new Long(source.ObjectTypeId);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.MetricChineseName != null) {
            this.MetricChineseName = new String(source.MetricChineseName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MonitorId", this.MonitorId);
        this.setParamSimple(map, prefix + "ObjectTypeId", this.ObjectTypeId);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "MetricChineseName", this.MetricChineseName);

    }
}

