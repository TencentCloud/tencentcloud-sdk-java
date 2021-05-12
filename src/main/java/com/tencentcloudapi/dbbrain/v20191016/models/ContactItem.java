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

public class ContactItem extends AbstractModel{

    /**
    * 联系人id。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 联系人姓名。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 联系人绑定的邮箱。
    */
    @SerializedName("Mail")
    @Expose
    private String Mail;

    /**
     * Get 联系人id。 
     * @return Id 联系人id。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 联系人id。
     * @param Id 联系人id。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 联系人姓名。 
     * @return Name 联系人姓名。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 联系人姓名。
     * @param Name 联系人姓名。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 联系人绑定的邮箱。 
     * @return Mail 联系人绑定的邮箱。
     */
    public String getMail() {
        return this.Mail;
    }

    /**
     * Set 联系人绑定的邮箱。
     * @param Mail 联系人绑定的邮箱。
     */
    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    public ContactItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContactItem(ContactItem source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Mail != null) {
            this.Mail = new String(source.Mail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Mail", this.Mail);

    }
}

