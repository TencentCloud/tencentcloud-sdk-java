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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRecordBatchRequest extends AbstractModel{

    /**
    * 记录ID数组
    */
    @SerializedName("RecordIdList")
    @Expose
    private Long [] RecordIdList;

    /**
    * 要修改的字段，可选值为 [“sub_domain”、”record_type”、”area”、”value”、”mx”、”ttl”、”status”] 中的某一个。
    */
    @SerializedName("Change")
    @Expose
    private String Change;

    /**
    * 修改为，具体依赖 change 字段，必填参数。
    */
    @SerializedName("ChangeTo")
    @Expose
    private String ChangeTo;

    /**
    * 要修改到的记录值，仅当 change 字段为 “record_type” 时为必填参数。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * MX记录优先级，仅当修改为 MX 记录时为必填参数。
    */
    @SerializedName("MX")
    @Expose
    private String MX;

    /**
     * Get 记录ID数组 
     * @return RecordIdList 记录ID数组
     */
    public Long [] getRecordIdList() {
        return this.RecordIdList;
    }

    /**
     * Set 记录ID数组
     * @param RecordIdList 记录ID数组
     */
    public void setRecordIdList(Long [] RecordIdList) {
        this.RecordIdList = RecordIdList;
    }

    /**
     * Get 要修改的字段，可选值为 [“sub_domain”、”record_type”、”area”、”value”、”mx”、”ttl”、”status”] 中的某一个。 
     * @return Change 要修改的字段，可选值为 [“sub_domain”、”record_type”、”area”、”value”、”mx”、”ttl”、”status”] 中的某一个。
     */
    public String getChange() {
        return this.Change;
    }

    /**
     * Set 要修改的字段，可选值为 [“sub_domain”、”record_type”、”area”、”value”、”mx”、”ttl”、”status”] 中的某一个。
     * @param Change 要修改的字段，可选值为 [“sub_domain”、”record_type”、”area”、”value”、”mx”、”ttl”、”status”] 中的某一个。
     */
    public void setChange(String Change) {
        this.Change = Change;
    }

    /**
     * Get 修改为，具体依赖 change 字段，必填参数。 
     * @return ChangeTo 修改为，具体依赖 change 字段，必填参数。
     */
    public String getChangeTo() {
        return this.ChangeTo;
    }

    /**
     * Set 修改为，具体依赖 change 字段，必填参数。
     * @param ChangeTo 修改为，具体依赖 change 字段，必填参数。
     */
    public void setChangeTo(String ChangeTo) {
        this.ChangeTo = ChangeTo;
    }

    /**
     * Get 要修改到的记录值，仅当 change 字段为 “record_type” 时为必填参数。 
     * @return Value 要修改到的记录值，仅当 change 字段为 “record_type” 时为必填参数。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 要修改到的记录值，仅当 change 字段为 “record_type” 时为必填参数。
     * @param Value 要修改到的记录值，仅当 change 字段为 “record_type” 时为必填参数。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get MX记录优先级，仅当修改为 MX 记录时为必填参数。 
     * @return MX MX记录优先级，仅当修改为 MX 记录时为必填参数。
     */
    public String getMX() {
        return this.MX;
    }

    /**
     * Set MX记录优先级，仅当修改为 MX 记录时为必填参数。
     * @param MX MX记录优先级，仅当修改为 MX 记录时为必填参数。
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

