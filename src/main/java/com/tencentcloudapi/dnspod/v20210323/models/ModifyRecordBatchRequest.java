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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRecordBatchRequest extends AbstractModel {

    /**
    * <p>记录ID数组。可以通过接口DescribeRecordList查到所有的解析记录列表以及对应的RecordId。单次最多修改5000条记录。</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/1427/56166">DescribeRecordList</a></p>
    */
    @SerializedName("RecordIdList")
    @Expose
    private Long [] RecordIdList;

    /**
    * <p>要修改的字段，可选值为 [“sub_domain”、”record_type”、”area”、”value”、”mx”、”ttl”、”status”] 中的某一个。</p>
    */
    @SerializedName("Change")
    @Expose
    private String Change;

    /**
    * <p>修改为，具体依赖 change 字段，必填参数。</p>
    */
    @SerializedName("ChangeTo")
    @Expose
    private String ChangeTo;

    /**
    * <p>要修改到的记录值，仅当 change 字段为 “record_type” 时为必填参数。</p>
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * <p>MX 优先级，当记录类型是 MX、HTTPS、SVCB 时必填，范围0-65535。</p>
    */
    @SerializedName("MX")
    @Expose
    private String MX;

    /**
     * Get <p>记录ID数组。可以通过接口DescribeRecordList查到所有的解析记录列表以及对应的RecordId。单次最多修改5000条记录。</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/1427/56166">DescribeRecordList</a></p> 
     * @return RecordIdList <p>记录ID数组。可以通过接口DescribeRecordList查到所有的解析记录列表以及对应的RecordId。单次最多修改5000条记录。</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/1427/56166">DescribeRecordList</a></p>
     */
    public Long [] getRecordIdList() {
        return this.RecordIdList;
    }

    /**
     * Set <p>记录ID数组。可以通过接口DescribeRecordList查到所有的解析记录列表以及对应的RecordId。单次最多修改5000条记录。</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/1427/56166">DescribeRecordList</a></p>
     * @param RecordIdList <p>记录ID数组。可以通过接口DescribeRecordList查到所有的解析记录列表以及对应的RecordId。单次最多修改5000条记录。</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/1427/56166">DescribeRecordList</a></p>
     */
    public void setRecordIdList(Long [] RecordIdList) {
        this.RecordIdList = RecordIdList;
    }

    /**
     * Get <p>要修改的字段，可选值为 [“sub_domain”、”record_type”、”area”、”value”、”mx”、”ttl”、”status”] 中的某一个。</p> 
     * @return Change <p>要修改的字段，可选值为 [“sub_domain”、”record_type”、”area”、”value”、”mx”、”ttl”、”status”] 中的某一个。</p>
     */
    public String getChange() {
        return this.Change;
    }

    /**
     * Set <p>要修改的字段，可选值为 [“sub_domain”、”record_type”、”area”、”value”、”mx”、”ttl”、”status”] 中的某一个。</p>
     * @param Change <p>要修改的字段，可选值为 [“sub_domain”、”record_type”、”area”、”value”、”mx”、”ttl”、”status”] 中的某一个。</p>
     */
    public void setChange(String Change) {
        this.Change = Change;
    }

    /**
     * Get <p>修改为，具体依赖 change 字段，必填参数。</p> 
     * @return ChangeTo <p>修改为，具体依赖 change 字段，必填参数。</p>
     */
    public String getChangeTo() {
        return this.ChangeTo;
    }

    /**
     * Set <p>修改为，具体依赖 change 字段，必填参数。</p>
     * @param ChangeTo <p>修改为，具体依赖 change 字段，必填参数。</p>
     */
    public void setChangeTo(String ChangeTo) {
        this.ChangeTo = ChangeTo;
    }

    /**
     * Get <p>要修改到的记录值，仅当 change 字段为 “record_type” 时为必填参数。</p> 
     * @return Value <p>要修改到的记录值，仅当 change 字段为 “record_type” 时为必填参数。</p>
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set <p>要修改到的记录值，仅当 change 字段为 “record_type” 时为必填参数。</p>
     * @param Value <p>要修改到的记录值，仅当 change 字段为 “record_type” 时为必填参数。</p>
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get <p>MX 优先级，当记录类型是 MX、HTTPS、SVCB 时必填，范围0-65535。</p> 
     * @return MX <p>MX 优先级，当记录类型是 MX、HTTPS、SVCB 时必填，范围0-65535。</p>
     */
    public String getMX() {
        return this.MX;
    }

    /**
     * Set <p>MX 优先级，当记录类型是 MX、HTTPS、SVCB 时必填，范围0-65535。</p>
     * @param MX <p>MX 优先级，当记录类型是 MX、HTTPS、SVCB 时必填，范围0-65535。</p>
     */
    public void setMX(String MX) {
        this.MX = MX;
    }

    public ModifyRecordBatchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRecordBatchRequest(ModifyRecordBatchRequest source) {
        if (source.RecordIdList != null) {
            this.RecordIdList = new Long[source.RecordIdList.length];
            for (int i = 0; i < source.RecordIdList.length; i++) {
                this.RecordIdList[i] = new Long(source.RecordIdList[i]);
            }
        }
        if (source.Change != null) {
            this.Change = new String(source.Change);
        }
        if (source.ChangeTo != null) {
            this.ChangeTo = new String(source.ChangeTo);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.MX != null) {
            this.MX = new String(source.MX);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RecordIdList.", this.RecordIdList);
        this.setParamSimple(map, prefix + "Change", this.Change);
        this.setParamSimple(map, prefix + "ChangeTo", this.ChangeTo);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "MX", this.MX);

    }
}

