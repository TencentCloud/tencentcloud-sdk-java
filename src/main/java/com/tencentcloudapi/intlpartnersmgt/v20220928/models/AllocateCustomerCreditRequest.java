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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AllocateCustomerCreditRequest extends AbstractModel{

    /**
    * 分配客户信用的具体值
    */
    @SerializedName("AddedCredit")
    @Expose
    private Float AddedCredit;

    /**
    * 客户uin
    */
    @SerializedName("ClientUin")
    @Expose
    private Long ClientUin;

    /**
     * Get 分配客户信用的具体值 
     * @return AddedCredit 分配客户信用的具体值
     */
    public Float getAddedCredit() {
        return this.AddedCredit;
    }

    /**
     * Set 分配客户信用的具体值
     * @param AddedCredit 分配客户信用的具体值
     */
    public void setAddedCredit(Float AddedCredit) {
        this.AddedCredit = AddedCredit;
    }

    /**
     * Get 客户uin 
     * @return ClientUin 客户uin
     */
    public Long getClientUin() {
        return this.ClientUin;
    }

    /**
     * Set 客户uin
     * @param ClientUin 客户uin
     */
    public void setClientUin(Long ClientUin) {
        this.ClientUin = ClientUin;
    }

    public AllocateCustomerCreditRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AllocateCustomerCreditRequest(AllocateCustomerCreditRequest source) {
        if (source.AddedCredit != null) {
            this.AddedCredit = new Float(source.AddedCredit);
        }
        if (source.ClientUin != null) {
            this.ClientUin = new Long(source.ClientUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddedCredit", this.AddedCredit);
        this.setParamSimple(map, prefix + "ClientUin", this.ClientUin);

    }
}

