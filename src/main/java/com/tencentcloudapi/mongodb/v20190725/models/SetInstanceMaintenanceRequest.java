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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetInstanceMaintenanceRequest extends AbstractModel {

    /**
    * <p>指定实例ID。例如：cmgo-p8vn****。请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制实例 ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>维护时间窗开始时间。取值范围为&quot;00:00-23:00&quot;的任意整点或半点，如00:00或00:30。</p>
    */
    @SerializedName("MaintenanceStart")
    @Expose
    private String MaintenanceStart;

    /**
    * <p>维护时间窗结束时间。</p><ul><li>取值范围为&quot;00:00-23:00&quot;的任意整点或半点，维护时间持续时长最小为30分钟，最大为3小时。</li><li>结束时间务必是基于开始时间向后的时间。</li></ul>
    */
    @SerializedName("MaintenanceEnd")
    @Expose
    private String MaintenanceEnd;

    /**
    * <p>指定每周内维护时间窗口的具体日期。  格式：请输入 1-7 之间的数字代表周一到周日（例如：1 代表周一），多个日期请用英文逗号 , 分隔。 示例：输入 1,3,5 表示维护窗口周期在每周的周一、周三、周五。 默认值：不设置，则默认为全周期 (1,2,3,4,5,6,7)。</p>
    */
    @SerializedName("MaintenanceDays")
    @Expose
    private String MaintenanceDays;

    /**
     * Get <p>指定实例ID。例如：cmgo-p8vn****。请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制实例 ID。</p> 
     * @return InstanceId <p>指定实例ID。例如：cmgo-p8vn****。请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制实例 ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>指定实例ID。例如：cmgo-p8vn****。请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制实例 ID。</p>
     * @param InstanceId <p>指定实例ID。例如：cmgo-p8vn****。请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制实例 ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>维护时间窗开始时间。取值范围为&quot;00:00-23:00&quot;的任意整点或半点，如00:00或00:30。</p> 
     * @return MaintenanceStart <p>维护时间窗开始时间。取值范围为&quot;00:00-23:00&quot;的任意整点或半点，如00:00或00:30。</p>
     */
    public String getMaintenanceStart() {
        return this.MaintenanceStart;
    }

    /**
     * Set <p>维护时间窗开始时间。取值范围为&quot;00:00-23:00&quot;的任意整点或半点，如00:00或00:30。</p>
     * @param MaintenanceStart <p>维护时间窗开始时间。取值范围为&quot;00:00-23:00&quot;的任意整点或半点，如00:00或00:30。</p>
     */
    public void setMaintenanceStart(String MaintenanceStart) {
        this.MaintenanceStart = MaintenanceStart;
    }

    /**
     * Get <p>维护时间窗结束时间。</p><ul><li>取值范围为&quot;00:00-23:00&quot;的任意整点或半点，维护时间持续时长最小为30分钟，最大为3小时。</li><li>结束时间务必是基于开始时间向后的时间。</li></ul> 
     * @return MaintenanceEnd <p>维护时间窗结束时间。</p><ul><li>取值范围为&quot;00:00-23:00&quot;的任意整点或半点，维护时间持续时长最小为30分钟，最大为3小时。</li><li>结束时间务必是基于开始时间向后的时间。</li></ul>
     */
    public String getMaintenanceEnd() {
        return this.MaintenanceEnd;
    }

    /**
     * Set <p>维护时间窗结束时间。</p><ul><li>取值范围为&quot;00:00-23:00&quot;的任意整点或半点，维护时间持续时长最小为30分钟，最大为3小时。</li><li>结束时间务必是基于开始时间向后的时间。</li></ul>
     * @param MaintenanceEnd <p>维护时间窗结束时间。</p><ul><li>取值范围为&quot;00:00-23:00&quot;的任意整点或半点，维护时间持续时长最小为30分钟，最大为3小时。</li><li>结束时间务必是基于开始时间向后的时间。</li></ul>
     */
    public void setMaintenanceEnd(String MaintenanceEnd) {
        this.MaintenanceEnd = MaintenanceEnd;
    }

    /**
     * Get <p>指定每周内维护时间窗口的具体日期。  格式：请输入 1-7 之间的数字代表周一到周日（例如：1 代表周一），多个日期请用英文逗号 , 分隔。 示例：输入 1,3,5 表示维护窗口周期在每周的周一、周三、周五。 默认值：不设置，则默认为全周期 (1,2,3,4,5,6,7)。</p> 
     * @return MaintenanceDays <p>指定每周内维护时间窗口的具体日期。  格式：请输入 1-7 之间的数字代表周一到周日（例如：1 代表周一），多个日期请用英文逗号 , 分隔。 示例：输入 1,3,5 表示维护窗口周期在每周的周一、周三、周五。 默认值：不设置，则默认为全周期 (1,2,3,4,5,6,7)。</p>
     */
    public String getMaintenanceDays() {
        return this.MaintenanceDays;
    }

    /**
     * Set <p>指定每周内维护时间窗口的具体日期。  格式：请输入 1-7 之间的数字代表周一到周日（例如：1 代表周一），多个日期请用英文逗号 , 分隔。 示例：输入 1,3,5 表示维护窗口周期在每周的周一、周三、周五。 默认值：不设置，则默认为全周期 (1,2,3,4,5,6,7)。</p>
     * @param MaintenanceDays <p>指定每周内维护时间窗口的具体日期。  格式：请输入 1-7 之间的数字代表周一到周日（例如：1 代表周一），多个日期请用英文逗号 , 分隔。 示例：输入 1,3,5 表示维护窗口周期在每周的周一、周三、周五。 默认值：不设置，则默认为全周期 (1,2,3,4,5,6,7)。</p>
     */
    public void setMaintenanceDays(String MaintenanceDays) {
        this.MaintenanceDays = MaintenanceDays;
    }

    public SetInstanceMaintenanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetInstanceMaintenanceRequest(SetInstanceMaintenanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.MaintenanceStart != null) {
            this.MaintenanceStart = new String(source.MaintenanceStart);
        }
        if (source.MaintenanceEnd != null) {
            this.MaintenanceEnd = new String(source.MaintenanceEnd);
        }
        if (source.MaintenanceDays != null) {
            this.MaintenanceDays = new String(source.MaintenanceDays);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "MaintenanceStart", this.MaintenanceStart);
        this.setParamSimple(map, prefix + "MaintenanceEnd", this.MaintenanceEnd);
        this.setParamSimple(map, prefix + "MaintenanceDays", this.MaintenanceDays);

    }
}

