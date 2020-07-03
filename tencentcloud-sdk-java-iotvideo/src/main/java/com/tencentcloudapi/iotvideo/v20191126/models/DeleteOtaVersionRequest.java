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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteOtaVersionRequest extends AbstractModel{

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 固件版本号，格式为x.y.z， x，y 范围0-63，z范围1~524288
    */
    @SerializedName("OtaVersion")
    @Expose
    private String OtaVersion;

    /**
    * 操作人
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 固件版本号，格式为x.y.z， x，y 范围0-63，z范围1~524288 
     * @return OtaVersion 固件版本号，格式为x.y.z， x，y 范围0-63，z范围1~524288
     */
    public String getOtaVersion() {
        return this.OtaVersion;
    }

    /**
     * Set 固件版本号，格式为x.y.z， x，y 范围0-63，z范围1~524288
     * @param OtaVersion 固件版本号，格式为x.y.z， x，y 范围0-63，z范围1~524288
     */
    public void setOtaVersion(String OtaVersion) {
        this.OtaVersion = OtaVersion;
    }

    /**
     * Get 操作人 
     * @return Operator 操作人
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作人
     * @param Operator 操作人
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "OtaVersion", this.OtaVersion);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

