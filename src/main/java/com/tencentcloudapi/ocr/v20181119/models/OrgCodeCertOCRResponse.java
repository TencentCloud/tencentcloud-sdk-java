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

public class OrgCodeCertOCRResponse  extends AbstractModel{

    /**
    * 代码
    */
    @SerializedName("OrgCode")
    @Expose
    private String OrgCode;

    /**
    * 机构名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 地址
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 有效期
    */
    @SerializedName("ValidDate")
    @Expose
    private String ValidDate;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取代码
     * @return OrgCode 代码
     */
    public String getOrgCode() {
        return this.OrgCode;
    }

    /**
     * 设置代码
     * @param OrgCode 代码
     */
    public void setOrgCode(String OrgCode) {
        this.OrgCode = OrgCode;
    }

    /**
     * 获取机构名称
     * @return Name 机构名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置机构名称
     * @param Name 机构名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取地址
     * @return Address 地址
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * 设置地址
     * @param Address 地址
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * 获取有效期
     * @return ValidDate 有效期
     */
    public String getValidDate() {
        return this.ValidDate;
    }

    /**
     * 设置有效期
     * @param ValidDate 有效期
     */
    public void setValidDate(String ValidDate) {
        this.ValidDate = ValidDate;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrgCode", this.OrgCode);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "ValidDate", this.ValidDate);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

