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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAuditServiceRequest extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>日志保存时长（天）</p><p>枚举值：</p><ul><li>7： 7天</li><li>30： 30天</li><li>90： 90天</li><li>180： 180天</li><li>365： 365天</li><li>1095： 1095天</li><li>1825： 1825天</li></ul>
    */
    @SerializedName("LogExpireDay")
    @Expose
    private Long LogExpireDay;

    /**
    * <p>高频存储时长（天）</p><p>枚举值：</p><ul><li>7： 7天</li><li>30： 30天</li><li>90： 90天</li><li>180： 180天</li><li>365： 365天</li><li>1095： 1095天</li><li>1825： 1825天</li></ul>
    */
    @SerializedName("HotLogExpireDay")
    @Expose
    private Long HotLogExpireDay;

    /**
    * <p>审计类型</p><p>枚举值：</p><ul><li>complex： 精细审计，审计日志更全面，包含对象类型、对象等，开启后对性能有一定影响</li><li>simple： 极速审计，审计日志覆盖绝大多数字段，开启审计后对性能影响较小</li></ul>
    */
    @SerializedName("AuditType")
    @Expose
    private String AuditType;

    /**
    * <p>产品名称</p><p>入参限制：postgres</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>日志保存时长（天）</p><p>枚举值：</p><ul><li>7： 7天</li><li>30： 30天</li><li>90： 90天</li><li>180： 180天</li><li>365： 365天</li><li>1095： 1095天</li><li>1825： 1825天</li></ul> 
     * @return LogExpireDay <p>日志保存时长（天）</p><p>枚举值：</p><ul><li>7： 7天</li><li>30： 30天</li><li>90： 90天</li><li>180： 180天</li><li>365： 365天</li><li>1095： 1095天</li><li>1825： 1825天</li></ul>
     */
    public Long getLogExpireDay() {
        return this.LogExpireDay;
    }

    /**
     * Set <p>日志保存时长（天）</p><p>枚举值：</p><ul><li>7： 7天</li><li>30： 30天</li><li>90： 90天</li><li>180： 180天</li><li>365： 365天</li><li>1095： 1095天</li><li>1825： 1825天</li></ul>
     * @param LogExpireDay <p>日志保存时长（天）</p><p>枚举值：</p><ul><li>7： 7天</li><li>30： 30天</li><li>90： 90天</li><li>180： 180天</li><li>365： 365天</li><li>1095： 1095天</li><li>1825： 1825天</li></ul>
     */
    public void setLogExpireDay(Long LogExpireDay) {
        this.LogExpireDay = LogExpireDay;
    }

    /**
     * Get <p>高频存储时长（天）</p><p>枚举值：</p><ul><li>7： 7天</li><li>30： 30天</li><li>90： 90天</li><li>180： 180天</li><li>365： 365天</li><li>1095： 1095天</li><li>1825： 1825天</li></ul> 
     * @return HotLogExpireDay <p>高频存储时长（天）</p><p>枚举值：</p><ul><li>7： 7天</li><li>30： 30天</li><li>90： 90天</li><li>180： 180天</li><li>365： 365天</li><li>1095： 1095天</li><li>1825： 1825天</li></ul>
     */
    public Long getHotLogExpireDay() {
        return this.HotLogExpireDay;
    }

    /**
     * Set <p>高频存储时长（天）</p><p>枚举值：</p><ul><li>7： 7天</li><li>30： 30天</li><li>90： 90天</li><li>180： 180天</li><li>365： 365天</li><li>1095： 1095天</li><li>1825： 1825天</li></ul>
     * @param HotLogExpireDay <p>高频存储时长（天）</p><p>枚举值：</p><ul><li>7： 7天</li><li>30： 30天</li><li>90： 90天</li><li>180： 180天</li><li>365： 365天</li><li>1095： 1095天</li><li>1825： 1825天</li></ul>
     */
    public void setHotLogExpireDay(Long HotLogExpireDay) {
        this.HotLogExpireDay = HotLogExpireDay;
    }

    /**
     * Get <p>审计类型</p><p>枚举值：</p><ul><li>complex： 精细审计，审计日志更全面，包含对象类型、对象等，开启后对性能有一定影响</li><li>simple： 极速审计，审计日志覆盖绝大多数字段，开启审计后对性能影响较小</li></ul> 
     * @return AuditType <p>审计类型</p><p>枚举值：</p><ul><li>complex： 精细审计，审计日志更全面，包含对象类型、对象等，开启后对性能有一定影响</li><li>simple： 极速审计，审计日志覆盖绝大多数字段，开启审计后对性能影响较小</li></ul>
     */
    public String getAuditType() {
        return this.AuditType;
    }

    /**
     * Set <p>审计类型</p><p>枚举值：</p><ul><li>complex： 精细审计，审计日志更全面，包含对象类型、对象等，开启后对性能有一定影响</li><li>simple： 极速审计，审计日志覆盖绝大多数字段，开启审计后对性能影响较小</li></ul>
     * @param AuditType <p>审计类型</p><p>枚举值：</p><ul><li>complex： 精细审计，审计日志更全面，包含对象类型、对象等，开启后对性能有一定影响</li><li>simple： 极速审计，审计日志覆盖绝大多数字段，开启审计后对性能影响较小</li></ul>
     */
    public void setAuditType(String AuditType) {
        this.AuditType = AuditType;
    }

    /**
     * Get <p>产品名称</p><p>入参限制：postgres</p> 
     * @return Product <p>产品名称</p><p>入参限制：postgres</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>产品名称</p><p>入参限制：postgres</p>
     * @param Product <p>产品名称</p><p>入参限制：postgres</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public ModifyAuditServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAuditServiceRequest(ModifyAuditServiceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.LogExpireDay != null) {
            this.LogExpireDay = new Long(source.LogExpireDay);
        }
        if (source.HotLogExpireDay != null) {
            this.HotLogExpireDay = new Long(source.HotLogExpireDay);
        }
        if (source.AuditType != null) {
            this.AuditType = new String(source.AuditType);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "LogExpireDay", this.LogExpireDay);
        this.setParamSimple(map, prefix + "HotLogExpireDay", this.HotLogExpireDay);
        this.setParamSimple(map, prefix + "AuditType", this.AuditType);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

