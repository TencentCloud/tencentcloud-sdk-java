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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDBDiagReportTaskRequest extends AbstractModel {

    /**
    * <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。TDSQL MySQL数据库类型，实例ID应填写为“实例ID&amp;分片ID”的格式。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>开始时间，如“2020-11-08T14:00:00+08:00”。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间，如“2020-11-09T14:00:00+08:00”。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>是否发送邮件: 0 - 否，1 - 是。</p>
    */
    @SerializedName("SendMailFlag")
    @Expose
    private Long SendMailFlag;

    /**
    * <p>接收邮件的联系人ID数组。</p>
    */
    @SerializedName("ContactPerson")
    @Expose
    private Long [] ContactPerson;

    /**
    * <p>接收邮件的联系组ID数组。</p>
    */
    @SerializedName("ContactGroup")
    @Expose
    private Long [] ContactGroup;

    /**
    * <p>服务产品类型，支持值：&quot;mysql&quot; - 云数据库 MySQL；&quot;cynosdb&quot; - 云数据库 TDSQL-C for MySQL，&quot;redis&quot; - 云数据库 Redis，&quot;mongodb&quot; - 云数据库 MongoDB，&quot;mariadb&quot; - 云数据库 MariaDB，&quot;dcdb&quot; - 云数据库 TDSQL MySQL，默认为&quot;mysql&quot;。</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。TDSQL MySQL数据库类型，实例ID应填写为“实例ID&amp;分片ID”的格式。</p> 
     * @return InstanceId <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。TDSQL MySQL数据库类型，实例ID应填写为“实例ID&amp;分片ID”的格式。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。TDSQL MySQL数据库类型，实例ID应填写为“实例ID&amp;分片ID”的格式。</p>
     * @param InstanceId <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。TDSQL MySQL数据库类型，实例ID应填写为“实例ID&amp;分片ID”的格式。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>开始时间，如“2020-11-08T14:00:00+08:00”。</p> 
     * @return StartTime <p>开始时间，如“2020-11-08T14:00:00+08:00”。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间，如“2020-11-08T14:00:00+08:00”。</p>
     * @param StartTime <p>开始时间，如“2020-11-08T14:00:00+08:00”。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间，如“2020-11-09T14:00:00+08:00”。</p> 
     * @return EndTime <p>结束时间，如“2020-11-09T14:00:00+08:00”。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间，如“2020-11-09T14:00:00+08:00”。</p>
     * @param EndTime <p>结束时间，如“2020-11-09T14:00:00+08:00”。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>是否发送邮件: 0 - 否，1 - 是。</p> 
     * @return SendMailFlag <p>是否发送邮件: 0 - 否，1 - 是。</p>
     */
    public Long getSendMailFlag() {
        return this.SendMailFlag;
    }

    /**
     * Set <p>是否发送邮件: 0 - 否，1 - 是。</p>
     * @param SendMailFlag <p>是否发送邮件: 0 - 否，1 - 是。</p>
     */
    public void setSendMailFlag(Long SendMailFlag) {
        this.SendMailFlag = SendMailFlag;
    }

    /**
     * Get <p>接收邮件的联系人ID数组。</p> 
     * @return ContactPerson <p>接收邮件的联系人ID数组。</p>
     */
    public Long [] getContactPerson() {
        return this.ContactPerson;
    }

    /**
     * Set <p>接收邮件的联系人ID数组。</p>
     * @param ContactPerson <p>接收邮件的联系人ID数组。</p>
     */
    public void setContactPerson(Long [] ContactPerson) {
        this.ContactPerson = ContactPerson;
    }

    /**
     * Get <p>接收邮件的联系组ID数组。</p> 
     * @return ContactGroup <p>接收邮件的联系组ID数组。</p>
     */
    public Long [] getContactGroup() {
        return this.ContactGroup;
    }

    /**
     * Set <p>接收邮件的联系组ID数组。</p>
     * @param ContactGroup <p>接收邮件的联系组ID数组。</p>
     */
    public void setContactGroup(Long [] ContactGroup) {
        this.ContactGroup = ContactGroup;
    }

    /**
     * Get <p>服务产品类型，支持值：&quot;mysql&quot; - 云数据库 MySQL；&quot;cynosdb&quot; - 云数据库 TDSQL-C for MySQL，&quot;redis&quot; - 云数据库 Redis，&quot;mongodb&quot; - 云数据库 MongoDB，&quot;mariadb&quot; - 云数据库 MariaDB，&quot;dcdb&quot; - 云数据库 TDSQL MySQL，默认为&quot;mysql&quot;。</p> 
     * @return Product <p>服务产品类型，支持值：&quot;mysql&quot; - 云数据库 MySQL；&quot;cynosdb&quot; - 云数据库 TDSQL-C for MySQL，&quot;redis&quot; - 云数据库 Redis，&quot;mongodb&quot; - 云数据库 MongoDB，&quot;mariadb&quot; - 云数据库 MariaDB，&quot;dcdb&quot; - 云数据库 TDSQL MySQL，默认为&quot;mysql&quot;。</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>服务产品类型，支持值：&quot;mysql&quot; - 云数据库 MySQL；&quot;cynosdb&quot; - 云数据库 TDSQL-C for MySQL，&quot;redis&quot; - 云数据库 Redis，&quot;mongodb&quot; - 云数据库 MongoDB，&quot;mariadb&quot; - 云数据库 MariaDB，&quot;dcdb&quot; - 云数据库 TDSQL MySQL，默认为&quot;mysql&quot;。</p>
     * @param Product <p>服务产品类型，支持值：&quot;mysql&quot; - 云数据库 MySQL；&quot;cynosdb&quot; - 云数据库 TDSQL-C for MySQL，&quot;redis&quot; - 云数据库 Redis，&quot;mongodb&quot; - 云数据库 MongoDB，&quot;mariadb&quot; - 云数据库 MariaDB，&quot;dcdb&quot; - 云数据库 TDSQL MySQL，默认为&quot;mysql&quot;。</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public CreateDBDiagReportTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDBDiagReportTaskRequest(CreateDBDiagReportTaskRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.SendMailFlag != null) {
            this.SendMailFlag = new Long(source.SendMailFlag);
        }
        if (source.ContactPerson != null) {
            this.ContactPerson = new Long[source.ContactPerson.length];
            for (int i = 0; i < source.ContactPerson.length; i++) {
                this.ContactPerson[i] = new Long(source.ContactPerson[i]);
            }
        }
        if (source.ContactGroup != null) {
            this.ContactGroup = new Long[source.ContactGroup.length];
            for (int i = 0; i < source.ContactGroup.length; i++) {
                this.ContactGroup[i] = new Long(source.ContactGroup[i]);
            }
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
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SendMailFlag", this.SendMailFlag);
        this.setParamArraySimple(map, prefix + "ContactPerson.", this.ContactPerson);
        this.setParamArraySimple(map, prefix + "ContactGroup.", this.ContactGroup);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

