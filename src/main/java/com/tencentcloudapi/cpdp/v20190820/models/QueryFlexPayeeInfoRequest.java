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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryFlexPayeeInfoRequest extends AbstractModel{

    /**
    * 收款用户ID
    */
    @SerializedName("PayeeId")
    @Expose
    private String PayeeId;

    /**
    * 外部用户ID
    */
    @SerializedName("OutUserId")
    @Expose
    private String OutUserId;

    /**
     * Get 收款用户ID 
     * @return PayeeId 收款用户ID
     */
    public String getPayeeId() {
        return this.PayeeId;
    }

    /**
     * Set 收款用户ID
     * @param PayeeId 收款用户ID
     */
    public void setPayeeId(String PayeeId) {
        this.PayeeId = PayeeId;
    }

    /**
     * Get 外部用户ID 
     * @return OutUserId 外部用户ID
     */
    public String getOutUserId() {
        return this.OutUserId;
    }

    /**
     * Set 外部用户ID
     * @param OutUserId 外部用户ID
     */
    public void setOutUserId(String OutUserId) {
        this.OutUserId = OutUserId;
    }

    public QueryFlexPayeeInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryFlexPayeeInfoRequest(QueryFlexPayeeInfoRequest source) {
        if (source.PayeeId != null) {
            this.PayeeId = new String(source.PayeeId);
        }
        if (source.OutUserId != null) {
            this.OutUserId = new String(source.OutUserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayeeId", this.PayeeId);
        this.setParamSimple(map, prefix + "OutUserId", this.OutUserId);

    }
}

