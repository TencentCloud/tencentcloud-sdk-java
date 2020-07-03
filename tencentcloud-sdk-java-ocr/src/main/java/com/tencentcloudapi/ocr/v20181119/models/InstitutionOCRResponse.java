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

public class InstitutionOCRResponse extends AbstractModel{

    /**
    * 注册号
    */
    @SerializedName("RegId")
    @Expose
    private String RegId;

    /**
    * 有效期
    */
    @SerializedName("ValidDate")
    @Expose
    private String ValidDate;

    /**
    * 住所
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 法定代表人
    */
    @SerializedName("LegalPerson")
    @Expose
    private String LegalPerson;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 注册号 
     * @return RegId 注册号
     */
    public String getRegId() {
        return this.RegId;
    }

    /**
     * Set 注册号
     * @param RegId 注册号
     */
    public void setRegId(String RegId) {
        this.RegId = RegId;
    }

    /**
     * Get 有效期 
     * @return ValidDate 有效期
     */
    public String getValidDate() {
        return this.ValidDate;
    }

    /**
     * Set 有效期
     * @param ValidDate 有效期
     */
    public void setValidDate(String ValidDate) {
        this.ValidDate = ValidDate;
    }

    /**
     * Get 住所 
     * @return Location 住所
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set 住所
     * @param Location 住所
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 法定代表人 
     * @return LegalPerson 法定代表人
     */
    public String getLegalPerson() {
        return this.LegalPerson;
    }

    /**
     * Set 法定代表人
     * @param LegalPerson 法定代表人
     */
    public void setLegalPerson(String LegalPerson) {
        this.LegalPerson = LegalPerson;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegId", this.RegId);
        this.setParamSimple(map, prefix + "ValidDate", this.ValidDate);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "LegalPerson", this.LegalPerson);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

