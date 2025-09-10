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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventStaffElement extends AbstractModel {

    /**
    * 座席邮箱账号
    */
    @SerializedName("Mail")
    @Expose
    private String Mail;

    /**
    * 座席工号
    */
    @SerializedName("StaffNumber")
    @Expose
    private String StaffNumber;

    /**
     * Get 座席邮箱账号 
     * @return Mail 座席邮箱账号
     */
    public String getMail() {
        return this.Mail;
    }

    /**
     * Set 座席邮箱账号
     * @param Mail 座席邮箱账号
     */
    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    /**
     * Get 座席工号 
     * @return StaffNumber 座席工号
     */
    public String getStaffNumber() {
        return this.StaffNumber;
    }

    /**
     * Set 座席工号
     * @param StaffNumber 座席工号
     */
    public void setStaffNumber(String StaffNumber) {
        this.StaffNumber = StaffNumber;
    }

    public EventStaffElement() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventStaffElement(EventStaffElement source) {
        if (source.Mail != null) {
            this.Mail = new String(source.Mail);
        }
        if (source.StaffNumber != null) {
            this.StaffNumber = new String(source.StaffNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mail", this.Mail);
        this.setParamSimple(map, prefix + "StaffNumber", this.StaffNumber);

    }
}

