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

public class CreateDBDiagReportTaskRequest extends AbstractModel{

    /**
    * 实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 开始时间，如“2020-11-08T14:00:00+08:00”。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间，如“2020-11-09T14:00:00+08:00”。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 是否发送邮件: 0 - 否，1 - 是。
    */
    @SerializedName("SendMailFlag")
    @Expose
    private Long SendMailFlag;

    /**
    * 接收邮件的联系人ID数组。
    */
    @SerializedName("ContactPerson")
    @Expose
    private Long [] ContactPerson;

    /**
    * 接收邮件的联系组ID数组。
    */
    @SerializedName("ContactGroup")
    @Expose
    private Long [] ContactGroup;

    /**
    * 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 CynosDB  for MySQL，默认值为"mysql"。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get 实例ID。 
     * @return InstanceId 实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。
     * @param InstanceId 实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 开始时间，如“2020-11-08T14:00:00+08:00”。 
     * @return StartTime 开始时间，如“2020-11-08T14:00:00+08:00”。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间，如“2020-11-08T14:00:00+08:00”。
     * @param StartTime 开始时间，如“2020-11-08T14:00:00+08:00”。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，如“2020-11-09T14:00:00+08:00”。 
     * @return EndTime 结束时间，如“2020-11-09T14:00:00+08:00”。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，如“2020-11-09T14:00:00+08:00”。
     * @param EndTime 结束时间，如“2020-11-09T14:00:00+08:00”。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 是否发送邮件: 0 - 否，1 - 是。 
     * @return SendMailFlag 是否发送邮件: 0 - 否，1 - 是。
     */
    public Long getSendMailFlag() {
        return this.SendMailFlag;
    }

    /**
     * Set 是否发送邮件: 0 - 否，1 - 是。
     * @param SendMailFlag 是否发送邮件: 0 - 否，1 - 是。
     */
    public void setSendMailFlag(Long SendMailFlag) {
        this.SendMailFlag = SendMailFlag;
    }

    /**
     * Get 接收邮件的联系人ID数组。 
     * @return ContactPerson 接收邮件的联系人ID数组。
     */
    public Long [] getContactPerson() {
        return this.ContactPerson;
    }

    /**
     * Set 接收邮件的联系人ID数组。
     * @param ContactPerson 接收邮件的联系人ID数组。
     */
    public void setContactPerson(Long [] ContactPerson) {
        this.ContactPerson = ContactPerson;
    }

    /**
     * Get 接收邮件的联系组ID数组。 
     * @return ContactGroup 接收邮件的联系组ID数组。
     */
    public Long [] getContactGroup() {
        return this.ContactGroup;
    }

    /**
     * Set 接收邮件的联系组ID数组。
     * @param ContactGroup 接收邮件的联系组ID数组。
     */
    public void setContactGroup(Long [] ContactGroup) {
        this.ContactGroup = ContactGroup;
    }

    /**
     * Get 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 CynosDB  for MySQL，默认值为"mysql"。 
     * @return Product 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 CynosDB  for MySQL，默认值为"mysql"。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 CynosDB  for MySQL，默认值为"mysql"。
     * @param Product 服务产品类型，支持值包括： "mysql" - 云数据库 MySQL， "cynosdb" - 云数据库 CynosDB  for MySQL，默认值为"mysql"。
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

