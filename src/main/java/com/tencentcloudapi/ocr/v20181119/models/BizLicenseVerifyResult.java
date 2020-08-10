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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BizLicenseVerifyResult extends AbstractModel{

    /**
    * “0“：一致
“-1”：此号未查询到结果
    */
    @SerializedName("RegNum")
    @Expose
    private String RegNum;

    /**
    * “0“：一致
“-1”：不一致
“”：不验真
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * “0“：一致
“-1”：不一致
“”：不验真
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
     * Get “0“：一致
“-1”：此号未查询到结果 
     * @return RegNum “0“：一致
“-1”：此号未查询到结果
     */
    public String getRegNum() {
        return this.RegNum;
    }

    /**
     * Set “0“：一致
“-1”：此号未查询到结果
     * @param RegNum “0“：一致
“-1”：此号未查询到结果
     */
    public void setRegNum(String RegNum) {
        this.RegNum = RegNum;
    }

    /**
     * Get “0“：一致
“-1”：不一致
“”：不验真 
     * @return Name “0“：一致
“-1”：不一致
“”：不验真
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set “0“：一致
“-1”：不一致
“”：不验真
     * @param Name “0“：一致
“-1”：不一致
“”：不验真
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get “0“：一致
“-1”：不一致
“”：不验真 
     * @return Address “0“：一致
“-1”：不一致
“”：不验真
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set “0“：一致
“-1”：不一致
“”：不验真
     * @param Address “0“：一致
“-1”：不一致
“”：不验真
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegNum", this.RegNum);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Address", this.Address);

    }
}

