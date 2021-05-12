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
package com.tencentcloudapi.dc.v20180410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BGPStatus extends AbstractModel{

    /**
    * 腾讯侧主互联IP BGP状态
    */
    @SerializedName("TencentAddressBgpState")
    @Expose
    private String TencentAddressBgpState;

    /**
    * 腾讯侧备互联IP BGP状态
    */
    @SerializedName("TencentBackupAddressBgpState")
    @Expose
    private String TencentBackupAddressBgpState;

    /**
     * Get 腾讯侧主互联IP BGP状态 
     * @return TencentAddressBgpState 腾讯侧主互联IP BGP状态
     */
    public String getTencentAddressBgpState() {
        return this.TencentAddressBgpState;
    }

    /**
     * Set 腾讯侧主互联IP BGP状态
     * @param TencentAddressBgpState 腾讯侧主互联IP BGP状态
     */
    public void setTencentAddressBgpState(String TencentAddressBgpState) {
        this.TencentAddressBgpState = TencentAddressBgpState;
    }

    /**
     * Get 腾讯侧备互联IP BGP状态 
     * @return TencentBackupAddressBgpState 腾讯侧备互联IP BGP状态
     */
    public String getTencentBackupAddressBgpState() {
        return this.TencentBackupAddressBgpState;
    }

    /**
     * Set 腾讯侧备互联IP BGP状态
     * @param TencentBackupAddressBgpState 腾讯侧备互联IP BGP状态
     */
    public void setTencentBackupAddressBgpState(String TencentBackupAddressBgpState) {
        this.TencentBackupAddressBgpState = TencentBackupAddressBgpState;
    }

    public BGPStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BGPStatus(BGPStatus source) {
        if (source.TencentAddressBgpState != null) {
            this.TencentAddressBgpState = new String(source.TencentAddressBgpState);
        }
        if (source.TencentBackupAddressBgpState != null) {
            this.TencentBackupAddressBgpState = new String(source.TencentBackupAddressBgpState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TencentAddressBgpState", this.TencentAddressBgpState);
        this.setParamSimple(map, prefix + "TencentBackupAddressBgpState", this.TencentBackupAddressBgpState);

    }
}

