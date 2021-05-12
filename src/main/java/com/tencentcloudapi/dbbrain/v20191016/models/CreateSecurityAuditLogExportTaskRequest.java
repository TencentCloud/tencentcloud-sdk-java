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
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSecurityAuditLogExportTaskRequest extends AbstractModel{

    /**
    * 安全审计组Id。
    */
    @SerializedName("SecAuditGroupId")
    @Expose
    private String SecAuditGroupId;

    /**
    * 导出日志开始时间，例如2020-12-28 00:00:00。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 导出日志结束时间，例如2020-12-28 01:00:00。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 服务产品类型，支持值："mysql" - 云数据库 MySQL。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 日志风险等级列表，支持值包括：0 无风险；1 低风险；2 中风险；3 高风险。
    */
    @SerializedName("DangerLevels")
    @Expose
    private Long [] DangerLevels;

    /**
     * Get 安全审计组Id。 
     * @return SecAuditGroupId 安全审计组Id。
     */
    public String getSecAuditGroupId() {
        return this.SecAuditGroupId;
    }

    /**
     * Set 安全审计组Id。
     * @param SecAuditGroupId 安全审计组Id。
     */
    public void setSecAuditGroupId(String SecAuditGroupId) {
        this.SecAuditGroupId = SecAuditGroupId;
    }

    /**
     * Get 导出日志开始时间，例如2020-12-28 00:00:00。 
     * @return StartTime 导出日志开始时间，例如2020-12-28 00:00:00。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 导出日志开始时间，例如2020-12-28 00:00:00。
     * @param StartTime 导出日志开始时间，例如2020-12-28 00:00:00。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 导出日志结束时间，例如2020-12-28 01:00:00。 
     * @return EndTime 导出日志结束时间，例如2020-12-28 01:00:00。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 导出日志结束时间，例如2020-12-28 01:00:00。
     * @param EndTime 导出日志结束时间，例如2020-12-28 01:00:00。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 服务产品类型，支持值："mysql" - 云数据库 MySQL。 
     * @return Product 服务产品类型，支持值："mysql" - 云数据库 MySQL。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 服务产品类型，支持值："mysql" - 云数据库 MySQL。
     * @param Product 服务产品类型，支持值："mysql" - 云数据库 MySQL。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 日志风险等级列表，支持值包括：0 无风险；1 低风险；2 中风险；3 高风险。 
     * @return DangerLevels 日志风险等级列表，支持值包括：0 无风险；1 低风险；2 中风险；3 高风险。
     */
    public Long [] getDangerLevels() {
        return this.DangerLevels;
    }

    /**
     * Set 日志风险等级列表，支持值包括：0 无风险；1 低风险；2 中风险；3 高风险。
     * @param DangerLevels 日志风险等级列表，支持值包括：0 无风险；1 低风险；2 中风险；3 高风险。
     */
    public void setDangerLevels(Long [] DangerLevels) {
        this.DangerLevels = DangerLevels;
    }

    public CreateSecurityAuditLogExportTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSecurityAuditLogExportTaskRequest(CreateSecurityAuditLogExportTaskRequest source) {
        if (source.SecAuditGroupId != null) {
            this.SecAuditGroupId = new String(source.SecAuditGroupId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.DangerLevels != null) {
            this.DangerLevels = new Long[source.DangerLevels.length];
            for (int i = 0; i < source.DangerLevels.length; i++) {
                this.DangerLevels[i] = new Long(source.DangerLevels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecAuditGroupId", this.SecAuditGroupId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamArraySimple(map, prefix + "DangerLevels.", this.DangerLevels);

    }
}

