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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VirusInfo extends AbstractModel{

    /**
    * 软件安全类型，分别为0-未知、 1-安全软件、2-风险软件、3-病毒软件
    */
    @SerializedName("SafeType")
    @Expose
    private Long SafeType;

    /**
    * 病毒名称， utf8编码，非病毒时值为空
    */
    @SerializedName("VirusName")
    @Expose
    private String VirusName;

    /**
    * 病毒描述，utf8编码，非病毒时值为空
    */
    @SerializedName("VirusDesc")
    @Expose
    private String VirusDesc;

    /**
     * Get 软件安全类型，分别为0-未知、 1-安全软件、2-风险软件、3-病毒软件 
     * @return SafeType 软件安全类型，分别为0-未知、 1-安全软件、2-风险软件、3-病毒软件
     */
    public Long getSafeType() {
        return this.SafeType;
    }

    /**
     * Set 软件安全类型，分别为0-未知、 1-安全软件、2-风险软件、3-病毒软件
     * @param SafeType 软件安全类型，分别为0-未知、 1-安全软件、2-风险软件、3-病毒软件
     */
    public void setSafeType(Long SafeType) {
        this.SafeType = SafeType;
    }

    /**
     * Get 病毒名称， utf8编码，非病毒时值为空 
     * @return VirusName 病毒名称， utf8编码，非病毒时值为空
     */
    public String getVirusName() {
        return this.VirusName;
    }

    /**
     * Set 病毒名称， utf8编码，非病毒时值为空
     * @param VirusName 病毒名称， utf8编码，非病毒时值为空
     */
    public void setVirusName(String VirusName) {
        this.VirusName = VirusName;
    }

    /**
     * Get 病毒描述，utf8编码，非病毒时值为空 
     * @return VirusDesc 病毒描述，utf8编码，非病毒时值为空
     */
    public String getVirusDesc() {
        return this.VirusDesc;
    }

    /**
     * Set 病毒描述，utf8编码，非病毒时值为空
     * @param VirusDesc 病毒描述，utf8编码，非病毒时值为空
     */
    public void setVirusDesc(String VirusDesc) {
        this.VirusDesc = VirusDesc;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SafeType", this.SafeType);
        this.setParamSimple(map, prefix + "VirusName", this.VirusName);
        this.setParamSimple(map, prefix + "VirusDesc", this.VirusDesc);

    }
}

