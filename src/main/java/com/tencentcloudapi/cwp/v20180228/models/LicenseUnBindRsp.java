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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LicenseUnBindRsp extends AbstractModel{

    /**
    * QUUID 云服务器uuid,轻量服务器uuid,边缘计算 uuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 失败原因
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
     * Get QUUID 云服务器uuid,轻量服务器uuid,边缘计算 uuid 
     * @return Quuid QUUID 云服务器uuid,轻量服务器uuid,边缘计算 uuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set QUUID 云服务器uuid,轻量服务器uuid,边缘计算 uuid
     * @param Quuid QUUID 云服务器uuid,轻量服务器uuid,边缘计算 uuid
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 失败原因 
     * @return ErrMsg 失败原因
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set 失败原因
     * @param ErrMsg 失败原因
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    public LicenseUnBindRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LicenseUnBindRsp(LicenseUnBindRsp source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);

    }
}

