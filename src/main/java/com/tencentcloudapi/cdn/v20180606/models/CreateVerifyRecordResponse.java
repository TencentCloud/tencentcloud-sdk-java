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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVerifyRecordResponse extends AbstractModel {

    /**
    * 子解析
    */
    @SerializedName("SubDomain")
    @Expose
    private String SubDomain;

    /**
    * 解析值
    */
    @SerializedName("Record")
    @Expose
    private String Record;

    /**
    * 解析类型
    */
    @SerializedName("RecordType")
    @Expose
    private String RecordType;

    /**
    * 文件验证 URL 指引
    */
    @SerializedName("FileVerifyUrl")
    @Expose
    private String FileVerifyUrl;

    /**
    * 文件校验域名列表
    */
    @SerializedName("FileVerifyDomains")
    @Expose
    private String [] FileVerifyDomains;

    /**
    * 文件校验文件名
    */
    @SerializedName("FileVerifyName")
    @Expose
    private String FileVerifyName;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 子解析 
     * @return SubDomain 子解析
     */
    public String getSubDomain() {
        return this.SubDomain;
    }

    /**
     * Set 子解析
     * @param SubDomain 子解析
     */
    public void setSubDomain(String SubDomain) {
        this.SubDomain = SubDomain;
    }

    /**
     * Get 解析值 
     * @return Record 解析值
     */
    public String getRecord() {
        return this.Record;
    }

    /**
     * Set 解析值
     * @param Record 解析值
     */
    public void setRecord(String Record) {
        this.Record = Record;
    }

    /**
     * Get 解析类型 
     * @return RecordType 解析类型
     */
    public String getRecordType() {
        return this.RecordType;
    }

    /**
     * Set 解析类型
     * @param RecordType 解析类型
     */
    public void setRecordType(String RecordType) {
        this.RecordType = RecordType;
    }

    /**
     * Get 文件验证 URL 指引 
     * @return FileVerifyUrl 文件验证 URL 指引
     */
    public String getFileVerifyUrl() {
        return this.FileVerifyUrl;
    }

    /**
     * Set 文件验证 URL 指引
     * @param FileVerifyUrl 文件验证 URL 指引
     */
    public void setFileVerifyUrl(String FileVerifyUrl) {
        this.FileVerifyUrl = FileVerifyUrl;
    }

    /**
     * Get 文件校验域名列表 
     * @return FileVerifyDomains 文件校验域名列表
     */
    public String [] getFileVerifyDomains() {
        return this.FileVerifyDomains;
    }

    /**
     * Set 文件校验域名列表
     * @param FileVerifyDomains 文件校验域名列表
     */
    public void setFileVerifyDomains(String [] FileVerifyDomains) {
        this.FileVerifyDomains = FileVerifyDomains;
    }

    /**
     * Get 文件校验文件名 
     * @return FileVerifyName 文件校验文件名
     */
    public String getFileVerifyName() {
        return this.FileVerifyName;
    }

    /**
     * Set 文件校验文件名
     * @param FileVerifyName 文件校验文件名
     */
    public void setFileVerifyName(String FileVerifyName) {
        this.FileVerifyName = FileVerifyName;
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

    public CreateVerifyRecordResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVerifyRecordResponse(CreateVerifyRecordResponse source) {
        if (source.SubDomain != null) {
            this.SubDomain = new String(source.SubDomain);
        }
        if (source.Record != null) {
            this.Record = new String(source.Record);
        }
        if (source.RecordType != null) {
            this.RecordType = new String(source.RecordType);
        }
        if (source.FileVerifyUrl != null) {
            this.FileVerifyUrl = new String(source.FileVerifyUrl);
        }
        if (source.FileVerifyDomains != null) {
            this.FileVerifyDomains = new String[source.FileVerifyDomains.length];
            for (int i = 0; i < source.FileVerifyDomains.length; i++) {
                this.FileVerifyDomains[i] = new String(source.FileVerifyDomains[i]);
            }
        }
        if (source.FileVerifyName != null) {
            this.FileVerifyName = new String(source.FileVerifyName);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubDomain", this.SubDomain);
        this.setParamSimple(map, prefix + "Record", this.Record);
        this.setParamSimple(map, prefix + "RecordType", this.RecordType);
        this.setParamSimple(map, prefix + "FileVerifyUrl", this.FileVerifyUrl);
        this.setParamArraySimple(map, prefix + "FileVerifyDomains.", this.FileVerifyDomains);
        this.setParamSimple(map, prefix + "FileVerifyName", this.FileVerifyName);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

