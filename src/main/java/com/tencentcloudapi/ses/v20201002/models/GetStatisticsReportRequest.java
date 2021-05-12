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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetStatisticsReportRequest extends AbstractModel{

    /**
    * 开始日期
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * 结束日期
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * 发信域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 收件方邮箱类型，例如gmail.com
    */
    @SerializedName("ReceivingMailboxType")
    @Expose
    private String ReceivingMailboxType;

    /**
     * Get 开始日期 
     * @return StartDate 开始日期
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set 开始日期
     * @param StartDate 开始日期
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get 结束日期 
     * @return EndDate 结束日期
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set 结束日期
     * @param EndDate 结束日期
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get 发信域名 
     * @return Domain 发信域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 发信域名
     * @param Domain 发信域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 收件方邮箱类型，例如gmail.com 
     * @return ReceivingMailboxType 收件方邮箱类型，例如gmail.com
     */
    public String getReceivingMailboxType() {
        return this.ReceivingMailboxType;
    }

    /**
     * Set 收件方邮箱类型，例如gmail.com
     * @param ReceivingMailboxType 收件方邮箱类型，例如gmail.com
     */
    public void setReceivingMailboxType(String ReceivingMailboxType) {
        this.ReceivingMailboxType = ReceivingMailboxType;
    }

    public GetStatisticsReportRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetStatisticsReportRequest(GetStatisticsReportRequest source) {
        if (source.StartDate != null) {
            this.StartDate = new String(source.StartDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.ReceivingMailboxType != null) {
            this.ReceivingMailboxType = new String(source.ReceivingMailboxType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "ReceivingMailboxType", this.ReceivingMailboxType);

    }
}

