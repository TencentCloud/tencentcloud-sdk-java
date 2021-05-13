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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommonName extends AbstractModel{

    /**
    * 子账户UIN
    */
    @SerializedName("SubaccountUin")
    @Expose
    private String SubaccountUin;

    /**
    * 子账户客户端证书中的CommonName字段
    */
    @SerializedName("CN")
    @Expose
    private String CN;

    /**
     * Get 子账户UIN 
     * @return SubaccountUin 子账户UIN
     */
    public String getSubaccountUin() {
        return this.SubaccountUin;
    }

    /**
     * Set 子账户UIN
     * @param SubaccountUin 子账户UIN
     */
    public void setSubaccountUin(String SubaccountUin) {
        this.SubaccountUin = SubaccountUin;
    }

    /**
     * Get 子账户客户端证书中的CommonName字段 
     * @return CN 子账户客户端证书中的CommonName字段
     */
    public String getCN() {
        return this.CN;
    }

    /**
     * Set 子账户客户端证书中的CommonName字段
     * @param CN 子账户客户端证书中的CommonName字段
     */
    public void setCN(String CN) {
        this.CN = CN;
    }

    public CommonName() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommonName(CommonName source) {
        if (source.SubaccountUin != null) {
            this.SubaccountUin = new String(source.SubaccountUin);
        }
        if (source.CN != null) {
            this.CN = new String(source.CN);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubaccountUin", this.SubaccountUin);
        this.setParamSimple(map, prefix + "CN", this.CN);

    }
}

