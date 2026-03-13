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

public class VerifyBizLicenseEnterprise4Response extends AbstractModel {

    /**
    * <p>请求状态</p><p>枚举值：</p><ul><li>0： 成功，计费</li><li>1： 系统异常，不计费</li></ul>
    */
    @SerializedName("StatusCode")
    @Expose
    private Long StatusCode;

    /**
    * <p>验证结果<br>1：四要素完全匹配<br>0：四要素不完全匹配<br>仅StatusCode为0时返回</p>
    */
    @SerializedName("VerifyResult")
    @Expose
    private Long VerifyResult;

    /**
    * <p>统一社会信用代码是否一致<br>仅StatusCode为0时返回</p>
    */
    @SerializedName("IsCreditCodeConsistent")
    @Expose
    private Boolean IsCreditCodeConsistent;

    /**
    * <p>企业名称是否一致<br>仅StatusCode为0时返回</p>
    */
    @SerializedName("IsEntNameConsistent")
    @Expose
    private Boolean IsEntNameConsistent;

    /**
    * <p>法人代表是否一致<br>仅StatusCode为0时返回，企业名称与统一社会信用代码均未查得时，固定返回false</p>
    */
    @SerializedName("IsLrNameConsistent")
    @Expose
    private Boolean IsLrNameConsistent;

    /**
    * <p>注册登记证件号码是否一致<br>仅StatusCode为0时返回，企业名称与统一社会信用代码均未查得时，固定返回false</p>
    */
    @SerializedName("IsIdNumConsistent")
    @Expose
    private Boolean IsIdNumConsistent;

    /**
    * <p>经营状态</p><p>枚举值：</p><ul><li>1： 开业（在营）</li><li>2： 迁出</li><li>3： 注销</li><li>4： 吊销</li><li>5： 撤销</li><li>6： 停业</li><li>0： 其他</li><li>-10002： 企业信息不正确，无法查询</li></ul>
    */
    @SerializedName("OperatingStatus")
    @Expose
    private String OperatingStatus;

    /**
    * <p>营业期限：一般包括营业开始时间和结束时间</p><p>参数格式：yyyy-MM-dd/yyyy-MM-dd</p><p>无固定期限的格式为：yyyy-MM-dd/<br>部分企业历史数据可能为空，将返回：/<br>企业信息不正确，无法查询，将返回：-10002</p>
    */
    @SerializedName("OperatingPeriod")
    @Expose
    private String OperatingPeriod;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>请求状态</p><p>枚举值：</p><ul><li>0： 成功，计费</li><li>1： 系统异常，不计费</li></ul> 
     * @return StatusCode <p>请求状态</p><p>枚举值：</p><ul><li>0： 成功，计费</li><li>1： 系统异常，不计费</li></ul>
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set <p>请求状态</p><p>枚举值：</p><ul><li>0： 成功，计费</li><li>1： 系统异常，不计费</li></ul>
     * @param StatusCode <p>请求状态</p><p>枚举值：</p><ul><li>0： 成功，计费</li><li>1： 系统异常，不计费</li></ul>
     */
    public void setStatusCode(Long StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get <p>验证结果<br>1：四要素完全匹配<br>0：四要素不完全匹配<br>仅StatusCode为0时返回</p> 
     * @return VerifyResult <p>验证结果<br>1：四要素完全匹配<br>0：四要素不完全匹配<br>仅StatusCode为0时返回</p>
     */
    public Long getVerifyResult() {
        return this.VerifyResult;
    }

    /**
     * Set <p>验证结果<br>1：四要素完全匹配<br>0：四要素不完全匹配<br>仅StatusCode为0时返回</p>
     * @param VerifyResult <p>验证结果<br>1：四要素完全匹配<br>0：四要素不完全匹配<br>仅StatusCode为0时返回</p>
     */
    public void setVerifyResult(Long VerifyResult) {
        this.VerifyResult = VerifyResult;
    }

    /**
     * Get <p>统一社会信用代码是否一致<br>仅StatusCode为0时返回</p> 
     * @return IsCreditCodeConsistent <p>统一社会信用代码是否一致<br>仅StatusCode为0时返回</p>
     */
    public Boolean getIsCreditCodeConsistent() {
        return this.IsCreditCodeConsistent;
    }

    /**
     * Set <p>统一社会信用代码是否一致<br>仅StatusCode为0时返回</p>
     * @param IsCreditCodeConsistent <p>统一社会信用代码是否一致<br>仅StatusCode为0时返回</p>
     */
    public void setIsCreditCodeConsistent(Boolean IsCreditCodeConsistent) {
        this.IsCreditCodeConsistent = IsCreditCodeConsistent;
    }

    /**
     * Get <p>企业名称是否一致<br>仅StatusCode为0时返回</p> 
     * @return IsEntNameConsistent <p>企业名称是否一致<br>仅StatusCode为0时返回</p>
     */
    public Boolean getIsEntNameConsistent() {
        return this.IsEntNameConsistent;
    }

    /**
     * Set <p>企业名称是否一致<br>仅StatusCode为0时返回</p>
     * @param IsEntNameConsistent <p>企业名称是否一致<br>仅StatusCode为0时返回</p>
     */
    public void setIsEntNameConsistent(Boolean IsEntNameConsistent) {
        this.IsEntNameConsistent = IsEntNameConsistent;
    }

    /**
     * Get <p>法人代表是否一致<br>仅StatusCode为0时返回，企业名称与统一社会信用代码均未查得时，固定返回false</p> 
     * @return IsLrNameConsistent <p>法人代表是否一致<br>仅StatusCode为0时返回，企业名称与统一社会信用代码均未查得时，固定返回false</p>
     */
    public Boolean getIsLrNameConsistent() {
        return this.IsLrNameConsistent;
    }

    /**
     * Set <p>法人代表是否一致<br>仅StatusCode为0时返回，企业名称与统一社会信用代码均未查得时，固定返回false</p>
     * @param IsLrNameConsistent <p>法人代表是否一致<br>仅StatusCode为0时返回，企业名称与统一社会信用代码均未查得时，固定返回false</p>
     */
    public void setIsLrNameConsistent(Boolean IsLrNameConsistent) {
        this.IsLrNameConsistent = IsLrNameConsistent;
    }

    /**
     * Get <p>注册登记证件号码是否一致<br>仅StatusCode为0时返回，企业名称与统一社会信用代码均未查得时，固定返回false</p> 
     * @return IsIdNumConsistent <p>注册登记证件号码是否一致<br>仅StatusCode为0时返回，企业名称与统一社会信用代码均未查得时，固定返回false</p>
     */
    public Boolean getIsIdNumConsistent() {
        return this.IsIdNumConsistent;
    }

    /**
     * Set <p>注册登记证件号码是否一致<br>仅StatusCode为0时返回，企业名称与统一社会信用代码均未查得时，固定返回false</p>
     * @param IsIdNumConsistent <p>注册登记证件号码是否一致<br>仅StatusCode为0时返回，企业名称与统一社会信用代码均未查得时，固定返回false</p>
     */
    public void setIsIdNumConsistent(Boolean IsIdNumConsistent) {
        this.IsIdNumConsistent = IsIdNumConsistent;
    }

    /**
     * Get <p>经营状态</p><p>枚举值：</p><ul><li>1： 开业（在营）</li><li>2： 迁出</li><li>3： 注销</li><li>4： 吊销</li><li>5： 撤销</li><li>6： 停业</li><li>0： 其他</li><li>-10002： 企业信息不正确，无法查询</li></ul> 
     * @return OperatingStatus <p>经营状态</p><p>枚举值：</p><ul><li>1： 开业（在营）</li><li>2： 迁出</li><li>3： 注销</li><li>4： 吊销</li><li>5： 撤销</li><li>6： 停业</li><li>0： 其他</li><li>-10002： 企业信息不正确，无法查询</li></ul>
     */
    public String getOperatingStatus() {
        return this.OperatingStatus;
    }

    /**
     * Set <p>经营状态</p><p>枚举值：</p><ul><li>1： 开业（在营）</li><li>2： 迁出</li><li>3： 注销</li><li>4： 吊销</li><li>5： 撤销</li><li>6： 停业</li><li>0： 其他</li><li>-10002： 企业信息不正确，无法查询</li></ul>
     * @param OperatingStatus <p>经营状态</p><p>枚举值：</p><ul><li>1： 开业（在营）</li><li>2： 迁出</li><li>3： 注销</li><li>4： 吊销</li><li>5： 撤销</li><li>6： 停业</li><li>0： 其他</li><li>-10002： 企业信息不正确，无法查询</li></ul>
     */
    public void setOperatingStatus(String OperatingStatus) {
        this.OperatingStatus = OperatingStatus;
    }

    /**
     * Get <p>营业期限：一般包括营业开始时间和结束时间</p><p>参数格式：yyyy-MM-dd/yyyy-MM-dd</p><p>无固定期限的格式为：yyyy-MM-dd/<br>部分企业历史数据可能为空，将返回：/<br>企业信息不正确，无法查询，将返回：-10002</p> 
     * @return OperatingPeriod <p>营业期限：一般包括营业开始时间和结束时间</p><p>参数格式：yyyy-MM-dd/yyyy-MM-dd</p><p>无固定期限的格式为：yyyy-MM-dd/<br>部分企业历史数据可能为空，将返回：/<br>企业信息不正确，无法查询，将返回：-10002</p>
     */
    public String getOperatingPeriod() {
        return this.OperatingPeriod;
    }

    /**
     * Set <p>营业期限：一般包括营业开始时间和结束时间</p><p>参数格式：yyyy-MM-dd/yyyy-MM-dd</p><p>无固定期限的格式为：yyyy-MM-dd/<br>部分企业历史数据可能为空，将返回：/<br>企业信息不正确，无法查询，将返回：-10002</p>
     * @param OperatingPeriod <p>营业期限：一般包括营业开始时间和结束时间</p><p>参数格式：yyyy-MM-dd/yyyy-MM-dd</p><p>无固定期限的格式为：yyyy-MM-dd/<br>部分企业历史数据可能为空，将返回：/<br>企业信息不正确，无法查询，将返回：-10002</p>
     */
    public void setOperatingPeriod(String OperatingPeriod) {
        this.OperatingPeriod = OperatingPeriod;
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

    public VerifyBizLicenseEnterprise4Response() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyBizLicenseEnterprise4Response(VerifyBizLicenseEnterprise4Response source) {
        if (source.StatusCode != null) {
            this.StatusCode = new Long(source.StatusCode);
        }
        if (source.VerifyResult != null) {
            this.VerifyResult = new Long(source.VerifyResult);
        }
        if (source.IsCreditCodeConsistent != null) {
            this.IsCreditCodeConsistent = new Boolean(source.IsCreditCodeConsistent);
        }
        if (source.IsEntNameConsistent != null) {
            this.IsEntNameConsistent = new Boolean(source.IsEntNameConsistent);
        }
        if (source.IsLrNameConsistent != null) {
            this.IsLrNameConsistent = new Boolean(source.IsLrNameConsistent);
        }
        if (source.IsIdNumConsistent != null) {
            this.IsIdNumConsistent = new Boolean(source.IsIdNumConsistent);
        }
        if (source.OperatingStatus != null) {
            this.OperatingStatus = new String(source.OperatingStatus);
        }
        if (source.OperatingPeriod != null) {
            this.OperatingPeriod = new String(source.OperatingPeriod);
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
        this.setParamSimple(map, prefix + "IsCreditCodeConsistent", this.IsCreditCodeConsistent);
        this.setParamSimple(map, prefix + "IsEntNameConsistent", this.IsEntNameConsistent);
        this.setParamSimple(map, prefix + "IsLrNameConsistent", this.IsLrNameConsistent);
        this.setParamSimple(map, prefix + "IsIdNumConsistent", this.IsIdNumConsistent);
        this.setParamSimple(map, prefix + "OperatingStatus", this.OperatingStatus);
        this.setParamSimple(map, prefix + "OperatingPeriod", this.OperatingPeriod);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

