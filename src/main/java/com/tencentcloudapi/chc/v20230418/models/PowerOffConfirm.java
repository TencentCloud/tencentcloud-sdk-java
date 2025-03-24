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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PowerOffConfirm extends AbstractModel {

    /**
    * 联系人
    */
    @SerializedName("ConfirmContact")
    @Expose
    private String ConfirmContact;

    /**
    * 联系人电话
    */
    @SerializedName("ConfirmContactNumber")
    @Expose
    private String ConfirmContactNumber;

    /**
     * Get 联系人 
     * @return ConfirmContact 联系人
     */
    public String getConfirmContact() {
        return this.ConfirmContact;
    }

    /**
     * Set 联系人
     * @param ConfirmContact 联系人
     */
    public void setConfirmContact(String ConfirmContact) {
        this.ConfirmContact = ConfirmContact;
    }

    /**
     * Get 联系人电话 
     * @return ConfirmContactNumber 联系人电话
     */
    public String getConfirmContactNumber() {
        return this.ConfirmContactNumber;
    }

    /**
     * Set 联系人电话
     * @param ConfirmContactNumber 联系人电话
     */
    public void setConfirmContactNumber(String ConfirmContactNumber) {
        this.ConfirmContactNumber = ConfirmContactNumber;
    }

    public PowerOffConfirm() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PowerOffConfirm(PowerOffConfirm source) {
        if (source.ConfirmContact != null) {
            this.ConfirmContact = new String(source.ConfirmContact);
        }
        if (source.ConfirmContactNumber != null) {
            this.ConfirmContactNumber = new String(source.ConfirmContactNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfirmContact", this.ConfirmContact);
        this.setParamSimple(map, prefix + "ConfirmContactNumber", this.ConfirmContactNumber);

    }
}

