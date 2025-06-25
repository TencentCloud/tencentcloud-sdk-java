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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAuditConfigRequest extends AbstractModel {

    /**
    * 实例 ID。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 审计日志保存时长。支持值包括：
7 - 一周
30 - 一个月；
180 - 六个月；
365 - 一年；
1095 - 三年；
1825 - 五年；
    */
    @SerializedName("LogExpireDay")
    @Expose
    private Long LogExpireDay;

    /**
    * 是否关闭审计服务。可选值：true - 关闭审计服务；false - 不关闭审计服务。默认值为 false。
说明：
1. 当关闭审计服务时，会删除用户的审计日志和文件，并删除该实例的所有审计策略。
2. CloseAudit、LogExpireDay 必须至少提供一个，如果两个都提供则按照 CloseAudit 优先的逻辑处理。
3. 可通过设置此参数来关闭审计服务，已关闭后不能通过此接口来开启审计服务。
    */
    @SerializedName("CloseAudit")
    @Expose
    private Boolean CloseAudit;

    /**
    * 高频审计日志保存时长。支持值包括：
7 - 一周
30 - 一个月；
180 - 六个月；
365 - 一年；
1095 - 三年；
1825 - 五年；
    */
    @SerializedName("HighLogExpireDay")
    @Expose
    private Long HighLogExpireDay;

    /**
     * Get 实例 ID。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。 
     * @return InstanceId 实例 ID。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。
     * @param InstanceId 实例 ID。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 审计日志保存时长。支持值包括：
7 - 一周
30 - 一个月；
180 - 六个月；
365 - 一年；
1095 - 三年；
1825 - 五年； 
     * @return LogExpireDay 审计日志保存时长。支持值包括：
7 - 一周
30 - 一个月；
180 - 六个月；
365 - 一年；
1095 - 三年；
1825 - 五年；
     */
    public Long getLogExpireDay() {
        return this.LogExpireDay;
    }

    /**
     * Set 审计日志保存时长。支持值包括：
7 - 一周
30 - 一个月；
180 - 六个月；
365 - 一年；
1095 - 三年；
1825 - 五年；
     * @param LogExpireDay 审计日志保存时长。支持值包括：
7 - 一周
30 - 一个月；
180 - 六个月；
365 - 一年；
1095 - 三年；
1825 - 五年；
     */
    public void setLogExpireDay(Long LogExpireDay) {
        this.LogExpireDay = LogExpireDay;
    }

    /**
     * Get 是否关闭审计服务。可选值：true - 关闭审计服务；false - 不关闭审计服务。默认值为 false。
说明：
1. 当关闭审计服务时，会删除用户的审计日志和文件，并删除该实例的所有审计策略。
2. CloseAudit、LogExpireDay 必须至少提供一个，如果两个都提供则按照 CloseAudit 优先的逻辑处理。
3. 可通过设置此参数来关闭审计服务，已关闭后不能通过此接口来开启审计服务。 
     * @return CloseAudit 是否关闭审计服务。可选值：true - 关闭审计服务；false - 不关闭审计服务。默认值为 false。
说明：
1. 当关闭审计服务时，会删除用户的审计日志和文件，并删除该实例的所有审计策略。
2. CloseAudit、LogExpireDay 必须至少提供一个，如果两个都提供则按照 CloseAudit 优先的逻辑处理。
3. 可通过设置此参数来关闭审计服务，已关闭后不能通过此接口来开启审计服务。
     */
    public Boolean getCloseAudit() {
        return this.CloseAudit;
    }

    /**
     * Set 是否关闭审计服务。可选值：true - 关闭审计服务；false - 不关闭审计服务。默认值为 false。
说明：
1. 当关闭审计服务时，会删除用户的审计日志和文件，并删除该实例的所有审计策略。
2. CloseAudit、LogExpireDay 必须至少提供一个，如果两个都提供则按照 CloseAudit 优先的逻辑处理。
3. 可通过设置此参数来关闭审计服务，已关闭后不能通过此接口来开启审计服务。
     * @param CloseAudit 是否关闭审计服务。可选值：true - 关闭审计服务；false - 不关闭审计服务。默认值为 false。
说明：
1. 当关闭审计服务时，会删除用户的审计日志和文件，并删除该实例的所有审计策略。
2. CloseAudit、LogExpireDay 必须至少提供一个，如果两个都提供则按照 CloseAudit 优先的逻辑处理。
3. 可通过设置此参数来关闭审计服务，已关闭后不能通过此接口来开启审计服务。
     */
    public void setCloseAudit(Boolean CloseAudit) {
        this.CloseAudit = CloseAudit;
    }

    /**
     * Get 高频审计日志保存时长。支持值包括：
7 - 一周
30 - 一个月；
180 - 六个月；
365 - 一年；
1095 - 三年；
1825 - 五年； 
     * @return HighLogExpireDay 高频审计日志保存时长。支持值包括：
7 - 一周
30 - 一个月；
180 - 六个月；
365 - 一年；
1095 - 三年；
1825 - 五年；
     */
    public Long getHighLogExpireDay() {
        return this.HighLogExpireDay;
    }

    /**
     * Set 高频审计日志保存时长。支持值包括：
7 - 一周
30 - 一个月；
180 - 六个月；
365 - 一年；
1095 - 三年；
1825 - 五年；
     * @param HighLogExpireDay 高频审计日志保存时长。支持值包括：
7 - 一周
30 - 一个月；
180 - 六个月；
365 - 一年；
1095 - 三年；
1825 - 五年；
     */
    public void setHighLogExpireDay(Long HighLogExpireDay) {
        this.HighLogExpireDay = HighLogExpireDay;
    }

    public ModifyAuditConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAuditConfigRequest(ModifyAuditConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.LogExpireDay != null) {
            this.LogExpireDay = new Long(source.LogExpireDay);
        }
        if (source.CloseAudit != null) {
            this.CloseAudit = new Boolean(source.CloseAudit);
        }
        if (source.HighLogExpireDay != null) {
            this.HighLogExpireDay = new Long(source.HighLogExpireDay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "LogExpireDay", this.LogExpireDay);
        this.setParamSimple(map, prefix + "CloseAudit", this.CloseAudit);
        this.setParamSimple(map, prefix + "HighLogExpireDay", this.HighLogExpireDay);

    }
}

