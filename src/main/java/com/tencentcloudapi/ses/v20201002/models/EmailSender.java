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

public class EmailSender extends AbstractModel{

    /**
    * 发信地址
    */
    @SerializedName("EmailAddress")
    @Expose
    private String EmailAddress;

    /**
    * 发信人别名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EmailSenderName")
    @Expose
    private String EmailSenderName;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedTimestamp")
    @Expose
    private Long CreatedTimestamp;

    /**
     * Get 发信地址 
     * @return EmailAddress 发信地址
     */
    public String getEmailAddress() {
        return this.EmailAddress;
    }

    /**
     * Set 发信地址
     * @param EmailAddress 发信地址
     */
    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

    /**
     * Get 发信人别名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EmailSenderName 发信人别名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEmailSenderName() {
        return this.EmailSenderName;
    }

    /**
     * Set 发信人别名
注意：此字段可能返回 null，表示取不到有效值。
     * @param EmailSenderName 发信人别名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEmailSenderName(String EmailSenderName) {
        this.EmailSenderName = EmailSenderName;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedTimestamp 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreatedTimestamp() {
        return this.CreatedTimestamp;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedTimestamp 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedTimestamp(Long CreatedTimestamp) {
        this.CreatedTimestamp = CreatedTimestamp;
    }

    public EmailSender() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EmailSender(EmailSender source) {
        if (source.EmailAddress != null) {
            this.EmailAddress = new String(source.EmailAddress);
        }
        if (source.EmailSenderName != null) {
            this.EmailSenderName = new String(source.EmailSenderName);
        }
        if (source.CreatedTimestamp != null) {
            this.CreatedTimestamp = new Long(source.CreatedTimestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EmailAddress", this.EmailAddress);
        this.setParamSimple(map, prefix + "EmailSenderName", this.EmailSenderName);
        this.setParamSimple(map, prefix + "CreatedTimestamp", this.CreatedTimestamp);

    }
}

