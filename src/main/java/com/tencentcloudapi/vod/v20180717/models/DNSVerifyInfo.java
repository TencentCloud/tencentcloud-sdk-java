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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DNSVerifyInfo extends AbstractModel {

    /**
    * 子解析。
    */
    @SerializedName("SubDomain")
    @Expose
    private String SubDomain;

    /**
    * 解析值。
    */
    @SerializedName("Record")
    @Expose
    private String Record;

    /**
    * 解析类型。
    */
    @SerializedName("RecordType")
    @Expose
    private String RecordType;

    /**
     * Get 子解析。 
     * @return SubDomain 子解析。
     */
    public String getSubDomain() {
        return this.SubDomain;
    }

    /**
     * Set 子解析。
     * @param SubDomain 子解析。
     */
    public void setSubDomain(String SubDomain) {
        this.SubDomain = SubDomain;
    }

    /**
     * Get 解析值。 
     * @return Record 解析值。
     */
    public String getRecord() {
        return this.Record;
    }

    /**
     * Set 解析值。
     * @param Record 解析值。
     */
    public void setRecord(String Record) {
        this.Record = Record;
    }

    /**
     * Get 解析类型。 
     * @return RecordType 解析类型。
     */
    public String getRecordType() {
        return this.RecordType;
    }

    /**
     * Set 解析类型。
     * @param RecordType 解析类型。
     */
    public void setRecordType(String RecordType) {
        this.RecordType = RecordType;
    }

    public DNSVerifyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DNSVerifyInfo(DNSVerifyInfo source) {
        if (source.SubDomain != null) {
            this.SubDomain = new String(source.SubDomain);
        }
        if (source.Record != null) {
            this.Record = new String(source.Record);
        }
        if (source.RecordType != null) {
            this.RecordType = new String(source.RecordType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubDomain", this.SubDomain);
        this.setParamSimple(map, prefix + "Record", this.Record);
        this.setParamSimple(map, prefix + "RecordType", this.RecordType);

    }
}

