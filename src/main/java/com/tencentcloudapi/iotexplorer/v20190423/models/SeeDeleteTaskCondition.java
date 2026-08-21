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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SeeDeleteTaskCondition extends AbstractModel {

    /**
    * <p>条件类型。</p><p>枚举值：</p><ul><li>TaskId： 精确匹配任务 ID</li><li>TimeRange： 匹配任务时间范围与指定范围有重合的任务。值的格式为 <code>UnixTimestampStart,UnixTimestampEnd</code>，其中起止时间均为秒级 UNIX 时间戳，且结束时间不早于起始时间</li><li>CreateTimeBefore： 匹配在指定时间前创建的任务。值为秒级 UNIX 时间戳</li><li>COSURI： 精确匹配任务来源 COS URI，值必须以 <code>cos://</code> 开头</li><li>COSURIPrefix： 按前缀匹配任务来源 COS URI，值必须以 <code>cos://</code> 开头</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>条件值列表。同一条件内的多个值之间为 OR 关系，至少传入一个非空值。</p>
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get <p>条件类型。</p><p>枚举值：</p><ul><li>TaskId： 精确匹配任务 ID</li><li>TimeRange： 匹配任务时间范围与指定范围有重合的任务。值的格式为 <code>UnixTimestampStart,UnixTimestampEnd</code>，其中起止时间均为秒级 UNIX 时间戳，且结束时间不早于起始时间</li><li>CreateTimeBefore： 匹配在指定时间前创建的任务。值为秒级 UNIX 时间戳</li><li>COSURI： 精确匹配任务来源 COS URI，值必须以 <code>cos://</code> 开头</li><li>COSURIPrefix： 按前缀匹配任务来源 COS URI，值必须以 <code>cos://</code> 开头</li></ul> 
     * @return Type <p>条件类型。</p><p>枚举值：</p><ul><li>TaskId： 精确匹配任务 ID</li><li>TimeRange： 匹配任务时间范围与指定范围有重合的任务。值的格式为 <code>UnixTimestampStart,UnixTimestampEnd</code>，其中起止时间均为秒级 UNIX 时间戳，且结束时间不早于起始时间</li><li>CreateTimeBefore： 匹配在指定时间前创建的任务。值为秒级 UNIX 时间戳</li><li>COSURI： 精确匹配任务来源 COS URI，值必须以 <code>cos://</code> 开头</li><li>COSURIPrefix： 按前缀匹配任务来源 COS URI，值必须以 <code>cos://</code> 开头</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>条件类型。</p><p>枚举值：</p><ul><li>TaskId： 精确匹配任务 ID</li><li>TimeRange： 匹配任务时间范围与指定范围有重合的任务。值的格式为 <code>UnixTimestampStart,UnixTimestampEnd</code>，其中起止时间均为秒级 UNIX 时间戳，且结束时间不早于起始时间</li><li>CreateTimeBefore： 匹配在指定时间前创建的任务。值为秒级 UNIX 时间戳</li><li>COSURI： 精确匹配任务来源 COS URI，值必须以 <code>cos://</code> 开头</li><li>COSURIPrefix： 按前缀匹配任务来源 COS URI，值必须以 <code>cos://</code> 开头</li></ul>
     * @param Type <p>条件类型。</p><p>枚举值：</p><ul><li>TaskId： 精确匹配任务 ID</li><li>TimeRange： 匹配任务时间范围与指定范围有重合的任务。值的格式为 <code>UnixTimestampStart,UnixTimestampEnd</code>，其中起止时间均为秒级 UNIX 时间戳，且结束时间不早于起始时间</li><li>CreateTimeBefore： 匹配在指定时间前创建的任务。值为秒级 UNIX 时间戳</li><li>COSURI： 精确匹配任务来源 COS URI，值必须以 <code>cos://</code> 开头</li><li>COSURIPrefix： 按前缀匹配任务来源 COS URI，值必须以 <code>cos://</code> 开头</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>条件值列表。同一条件内的多个值之间为 OR 关系，至少传入一个非空值。</p> 
     * @return Values <p>条件值列表。同一条件内的多个值之间为 OR 关系，至少传入一个非空值。</p>
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set <p>条件值列表。同一条件内的多个值之间为 OR 关系，至少传入一个非空值。</p>
     * @param Values <p>条件值列表。同一条件内的多个值之间为 OR 关系，至少传入一个非空值。</p>
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public SeeDeleteTaskCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SeeDeleteTaskCondition(SeeDeleteTaskCondition source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

