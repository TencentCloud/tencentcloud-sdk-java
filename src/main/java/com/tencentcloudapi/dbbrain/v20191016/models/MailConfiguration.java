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

public class MailConfiguration extends AbstractModel{

    /**
    * 是否开启邮件发送: 0, 否; 1, 是。
    */
    @SerializedName("SendMail")
    @Expose
    private Long SendMail;

    /**
    * 地域配置, 如["ap-guangzhou", "ap-shanghai"]。巡检的邮件发送模版，配置需要发送巡检邮件的地域；订阅的邮件发送模版，配置当前订阅实例的所属地域。
    */
    @SerializedName("Region")
    @Expose
    private String [] Region;

    /**
    * 发送指定的健康等级的报告, 如["HEALTH", "SUB_HEALTH", "RISK", "HIGH_RISK"]。
    */
    @SerializedName("HealthStatus")
    @Expose
    private String [] HealthStatus;

    /**
    * 联系人id, 联系人/联系组不能都为空。
    */
    @SerializedName("ContactPerson")
    @Expose
    private Long [] ContactPerson;

    /**
    * 联系组id, 联系人/联系组不能都为空。
    */
    @SerializedName("ContactGroup")
    @Expose
    private Long [] ContactGroup;

    /**
     * Get 是否开启邮件发送: 0, 否; 1, 是。 
     * @return SendMail 是否开启邮件发送: 0, 否; 1, 是。
     */
    public Long getSendMail() {
        return this.SendMail;
    }

    /**
     * Set 是否开启邮件发送: 0, 否; 1, 是。
     * @param SendMail 是否开启邮件发送: 0, 否; 1, 是。
     */
    public void setSendMail(Long SendMail) {
        this.SendMail = SendMail;
    }

    /**
     * Get 地域配置, 如["ap-guangzhou", "ap-shanghai"]。巡检的邮件发送模版，配置需要发送巡检邮件的地域；订阅的邮件发送模版，配置当前订阅实例的所属地域。 
     * @return Region 地域配置, 如["ap-guangzhou", "ap-shanghai"]。巡检的邮件发送模版，配置需要发送巡检邮件的地域；订阅的邮件发送模版，配置当前订阅实例的所属地域。
     */
    public String [] getRegion() {
        return this.Region;
    }

    /**
     * Set 地域配置, 如["ap-guangzhou", "ap-shanghai"]。巡检的邮件发送模版，配置需要发送巡检邮件的地域；订阅的邮件发送模版，配置当前订阅实例的所属地域。
     * @param Region 地域配置, 如["ap-guangzhou", "ap-shanghai"]。巡检的邮件发送模版，配置需要发送巡检邮件的地域；订阅的邮件发送模版，配置当前订阅实例的所属地域。
     */
    public void setRegion(String [] Region) {
        this.Region = Region;
    }

    /**
     * Get 发送指定的健康等级的报告, 如["HEALTH", "SUB_HEALTH", "RISK", "HIGH_RISK"]。 
     * @return HealthStatus 发送指定的健康等级的报告, 如["HEALTH", "SUB_HEALTH", "RISK", "HIGH_RISK"]。
     */
    public String [] getHealthStatus() {
        return this.HealthStatus;
    }

    /**
     * Set 发送指定的健康等级的报告, 如["HEALTH", "SUB_HEALTH", "RISK", "HIGH_RISK"]。
     * @param HealthStatus 发送指定的健康等级的报告, 如["HEALTH", "SUB_HEALTH", "RISK", "HIGH_RISK"]。
     */
    public void setHealthStatus(String [] HealthStatus) {
        this.HealthStatus = HealthStatus;
    }

    /**
     * Get 联系人id, 联系人/联系组不能都为空。 
     * @return ContactPerson 联系人id, 联系人/联系组不能都为空。
     */
    public Long [] getContactPerson() {
        return this.ContactPerson;
    }

    /**
     * Set 联系人id, 联系人/联系组不能都为空。
     * @param ContactPerson 联系人id, 联系人/联系组不能都为空。
     */
    public void setContactPerson(Long [] ContactPerson) {
        this.ContactPerson = ContactPerson;
    }

    /**
     * Get 联系组id, 联系人/联系组不能都为空。 
     * @return ContactGroup 联系组id, 联系人/联系组不能都为空。
     */
    public Long [] getContactGroup() {
        return this.ContactGroup;
    }

    /**
     * Set 联系组id, 联系人/联系组不能都为空。
     * @param ContactGroup 联系组id, 联系人/联系组不能都为空。
     */
    public void setContactGroup(Long [] ContactGroup) {
        this.ContactGroup = ContactGroup;
    }

    public MailConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MailConfiguration(MailConfiguration source) {
        if (source.SendMail != null) {
            this.SendMail = new Long(source.SendMail);
        }
        if (source.Region != null) {
            this.Region = new String[source.Region.length];
            for (int i = 0; i < source.Region.length; i++) {
                this.Region[i] = new String(source.Region[i]);
            }
        }
        if (source.HealthStatus != null) {
            this.HealthStatus = new String[source.HealthStatus.length];
            for (int i = 0; i < source.HealthStatus.length; i++) {
                this.HealthStatus[i] = new String(source.HealthStatus[i]);
            }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SendMail", this.SendMail);
        this.setParamArraySimple(map, prefix + "Region.", this.Region);
        this.setParamArraySimple(map, prefix + "HealthStatus.", this.HealthStatus);
        this.setParamArraySimple(map, prefix + "ContactPerson.", this.ContactPerson);
        this.setParamArraySimple(map, prefix + "ContactGroup.", this.ContactGroup);

    }
}

