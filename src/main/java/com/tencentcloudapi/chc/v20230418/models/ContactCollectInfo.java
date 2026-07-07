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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContactCollectInfo extends AbstractModel {

    /**
    * 业务联系人姓名
    */
    @SerializedName("ContactName")
    @Expose
    private String ContactName;

    /**
    * 联系人电话
    */
    @SerializedName("ContactPhone")
    @Expose
    private String ContactPhone;

    /**
     * Get 业务联系人姓名 
     * @return ContactName 业务联系人姓名
     */
    public String getContactName() {
        return this.ContactName;
    }

    /**
     * Set 业务联系人姓名
     * @param ContactName 业务联系人姓名
     */
    public void setContactName(String ContactName) {
        this.ContactName = ContactName;
    }

    /**
     * Get 联系人电话 
     * @return ContactPhone 联系人电话
     */
    public String getContactPhone() {
        return this.ContactPhone;
    }

    /**
     * Set 联系人电话
     * @param ContactPhone 联系人电话
     */
    public void setContactPhone(String ContactPhone) {
        this.ContactPhone = ContactPhone;
    }

    public ContactCollectInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContactCollectInfo(ContactCollectInfo source) {
        if (source.ContactName != null) {
            this.ContactName = new String(source.ContactName);
        }
        if (source.ContactPhone != null) {
            this.ContactPhone = new String(source.ContactPhone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContactName", this.ContactName);
        this.setParamSimple(map, prefix + "ContactPhone", this.ContactPhone);

    }
}

