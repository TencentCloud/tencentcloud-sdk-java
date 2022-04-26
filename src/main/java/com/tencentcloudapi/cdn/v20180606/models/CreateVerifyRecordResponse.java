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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVerifyRecordResponse extends AbstractModel{

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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileVerifyUrl")
    @Expose
    private String FileVerifyUrl;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileVerifyUrl 文件验证 URL 指引
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileVerifyUrl() {
        return this.FileVerifyUrl;
    }

    /**
     * Set 文件验证 URL 指引
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileVerifyUrl 文件验证 URL 指引
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileVerifyUrl(String FileVerifyUrl) {
        this.FileVerifyUrl = FileVerifyUrl;
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

