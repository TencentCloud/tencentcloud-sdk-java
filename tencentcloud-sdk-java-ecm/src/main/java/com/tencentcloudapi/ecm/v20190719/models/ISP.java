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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ISP extends AbstractModel{

    /**
    * 运营商ID
    */
    @SerializedName("ISPId")
    @Expose
    private String ISPId;

    /**
    * 运营商名称
    */
    @SerializedName("ISPName")
    @Expose
    private String ISPName;

    /**
     * Get 运营商ID 
     * @return ISPId 运营商ID
     */
    public String getISPId() {
        return this.ISPId;
    }

    /**
     * Set 运营商ID
     * @param ISPId 运营商ID
     */
    public void setISPId(String ISPId) {
        this.ISPId = ISPId;
    }

    /**
     * Get 运营商名称 
     * @return ISPName 运营商名称
     */
    public String getISPName() {
        return this.ISPName;
    }

    /**
     * Set 运营商名称
     * @param ISPName 运营商名称
     */
    public void setISPName(String ISPName) {
        this.ISPName = ISPName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ISPId", this.ISPId);
        this.setParamSimple(map, prefix + "ISPName", this.ISPName);

    }
}

