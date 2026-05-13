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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSkillScanResultRequest extends AbstractModel {

    /**
    * ZIP 文件的 SHA256 Hash
参数格式：sha256:<64位hex>
    */
    @SerializedName("ContentHash")
    @Expose
    private String ContentHash;

    /**
    * 指定引擎版本号
取值参考：由 CreateSkillScan 接口返回
    */
    @SerializedName("EngineVersion")
    @Expose
    private Long EngineVersion;

    /**
    * 报告签名地址有效期
单位：小时
默认值：8760（1年）
补充说明：对返回的 ReportURL 生效
    */
    @SerializedName("ReportURLExpireHours")
    @Expose
    private Long ReportURLExpireHours;

    /**
     * Get ZIP 文件的 SHA256 Hash
参数格式：sha256:<64位hex> 
     * @return ContentHash ZIP 文件的 SHA256 Hash
参数格式：sha256:<64位hex>
     */
    public String getContentHash() {
        return this.ContentHash;
    }

    /**
     * Set ZIP 文件的 SHA256 Hash
参数格式：sha256:<64位hex>
     * @param ContentHash ZIP 文件的 SHA256 Hash
参数格式：sha256:<64位hex>
     */
    public void setContentHash(String ContentHash) {
        this.ContentHash = ContentHash;
    }

    /**
     * Get 指定引擎版本号
取值参考：由 CreateSkillScan 接口返回 
     * @return EngineVersion 指定引擎版本号
取值参考：由 CreateSkillScan 接口返回
     */
    public Long getEngineVersion() {
        return this.EngineVersion;
    }

    /**
     * Set 指定引擎版本号
取值参考：由 CreateSkillScan 接口返回
     * @param EngineVersion 指定引擎版本号
取值参考：由 CreateSkillScan 接口返回
     */
    public void setEngineVersion(Long EngineVersion) {
        this.EngineVersion = EngineVersion;
    }

    /**
     * Get 报告签名地址有效期
单位：小时
默认值：8760（1年）
补充说明：对返回的 ReportURL 生效 
     * @return ReportURLExpireHours 报告签名地址有效期
单位：小时
默认值：8760（1年）
补充说明：对返回的 ReportURL 生效
     */
    public Long getReportURLExpireHours() {
        return this.ReportURLExpireHours;
    }

    /**
     * Set 报告签名地址有效期
单位：小时
默认值：8760（1年）
补充说明：对返回的 ReportURL 生效
     * @param ReportURLExpireHours 报告签名地址有效期
单位：小时
默认值：8760（1年）
补充说明：对返回的 ReportURL 生效
     */
    public void setReportURLExpireHours(Long ReportURLExpireHours) {
        this.ReportURLExpireHours = ReportURLExpireHours;
    }

    public DescribeSkillScanResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSkillScanResultRequest(DescribeSkillScanResultRequest source) {
        if (source.ContentHash != null) {
            this.ContentHash = new String(source.ContentHash);
        }
        if (source.EngineVersion != null) {
            this.EngineVersion = new Long(source.EngineVersion);
        }
        if (source.ReportURLExpireHours != null) {
            this.ReportURLExpireHours = new Long(source.ReportURLExpireHours);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContentHash", this.ContentHash);
        this.setParamSimple(map, prefix + "EngineVersion", this.EngineVersion);
        this.setParamSimple(map, prefix + "ReportURLExpireHours", this.ReportURLExpireHours);

    }
}

