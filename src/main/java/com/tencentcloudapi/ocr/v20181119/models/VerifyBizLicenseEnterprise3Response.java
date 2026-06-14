/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifyBizLicenseEnterprise3Response extends AbstractModel {

    /**
    * <p>0 成功，计费<br>1 系统异常，不计费<br>2 查询无结果，不计费</p>
    */
    @SerializedName("StatusCode")
    @Expose
    private Long StatusCode;

    /**
    * <p>验证结果<br>1：三要素完全匹配<br>0：三要素不完全匹配<br>仅StatusCode为0时返回</p>
    */
    @SerializedName("VerifyResult")
    @Expose
    private Long VerifyResult;

    /**
    * <p>企业状态</p><p>枚举值：</p><ul><li>1： 开业（在营）/ 在营</li><li>2： 迁出 / 非在营</li><li>3： 注销</li><li>4： 吊销</li><li>5： 撤销</li><li>6： 停业</li><li>7： 撤销登记</li><li>0： 其他</li><li>/： 无法查询</li></ul><p>企业状态  当VerifyType参数为ENT_2META时，可返回：  0-7,  /   当VerifyType参数为ENT_3META时，可返回  1，2</p>
    */
    @SerializedName("OperatingStatus")
    @Expose
    private String OperatingStatus;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>0 成功，计费<br>1 系统异常，不计费<br>2 查询无结果，不计费</p> 
     * @return StatusCode <p>0 成功，计费<br>1 系统异常，不计费<br>2 查询无结果，不计费</p>
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set <p>0 成功，计费<br>1 系统异常，不计费<br>2 查询无结果，不计费</p>
     * @param StatusCode <p>0 成功，计费<br>1 系统异常，不计费<br>2 查询无结果，不计费</p>
     */
    public void setStatusCode(Long StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get <p>验证结果<br>1：三要素完全匹配<br>0：三要素不完全匹配<br>仅StatusCode为0时返回</p> 
     * @return VerifyResult <p>验证结果<br>1：三要素完全匹配<br>0：三要素不完全匹配<br>仅StatusCode为0时返回</p>
     */
    public Long getVerifyResult() {
        return this.VerifyResult;
    }

    /**
     * Set <p>验证结果<br>1：三要素完全匹配<br>0：三要素不完全匹配<br>仅StatusCode为0时返回</p>
     * @param VerifyResult <p>验证结果<br>1：三要素完全匹配<br>0：三要素不完全匹配<br>仅StatusCode为0时返回</p>
     */
    public void setVerifyResult(Long VerifyResult) {
        this.VerifyResult = VerifyResult;
    }

    /**
     * Get <p>企业状态</p><p>枚举值：</p><ul><li>1： 开业（在营）/ 在营</li><li>2： 迁出 / 非在营</li><li>3： 注销</li><li>4： 吊销</li><li>5： 撤销</li><li>6： 停业</li><li>7： 撤销登记</li><li>0： 其他</li><li>/： 无法查询</li></ul><p>企业状态  当VerifyType参数为ENT_2META时，可返回：  0-7,  /   当VerifyType参数为ENT_3META时，可返回  1，2</p> 
     * @return OperatingStatus <p>企业状态</p><p>枚举值：</p><ul><li>1： 开业（在营）/ 在营</li><li>2： 迁出 / 非在营</li><li>3： 注销</li><li>4： 吊销</li><li>5： 撤销</li><li>6： 停业</li><li>7： 撤销登记</li><li>0： 其他</li><li>/： 无法查询</li></ul><p>企业状态  当VerifyType参数为ENT_2META时，可返回：  0-7,  /   当VerifyType参数为ENT_3META时，可返回  1，2</p>
     */
    public String getOperatingStatus() {
        return this.OperatingStatus;
    }

    /**
     * Set <p>企业状态</p><p>枚举值：</p><ul><li>1： 开业（在营）/ 在营</li><li>2： 迁出 / 非在营</li><li>3： 注销</li><li>4： 吊销</li><li>5： 撤销</li><li>6： 停业</li><li>7： 撤销登记</li><li>0： 其他</li><li>/： 无法查询</li></ul><p>企业状态  当VerifyType参数为ENT_2META时，可返回：  0-7,  /   当VerifyType参数为ENT_3META时，可返回  1，2</p>
     * @param OperatingStatus <p>企业状态</p><p>枚举值：</p><ul><li>1： 开业（在营）/ 在营</li><li>2： 迁出 / 非在营</li><li>3： 注销</li><li>4： 吊销</li><li>5： 撤销</li><li>6： 停业</li><li>7： 撤销登记</li><li>0： 其他</li><li>/： 无法查询</li></ul><p>企业状态  当VerifyType参数为ENT_2META时，可返回：  0-7,  /   当VerifyType参数为ENT_3META时，可返回  1，2</p>
     */
    public void setOperatingStatus(String OperatingStatus) {
        this.OperatingStatus = OperatingStatus;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public VerifyBizLicenseEnterprise3Response() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyBizLicenseEnterprise3Response(VerifyBizLicenseEnterprise3Response source) {
        if (source.StatusCode != null) {
            this.StatusCode = new Long(source.StatusCode);
        }
        if (source.VerifyResult != null) {
            this.VerifyResult = new Long(source.VerifyResult);
        }
        if (source.OperatingStatus != null) {
            this.OperatingStatus = new String(source.OperatingStatus);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "VerifyResult", this.VerifyResult);
        this.setParamSimple(map, prefix + "OperatingStatus", this.OperatingStatus);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

