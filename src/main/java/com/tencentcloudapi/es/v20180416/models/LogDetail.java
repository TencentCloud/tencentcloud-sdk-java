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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogDetail extends AbstractModel {

    /**
    * 日志异常名
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 日志异常处理建议
    */
    @SerializedName("Advise")
    @Expose
    private String Advise;

    /**
    * 日志异常名出现次数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get 日志异常名 
     * @return Key 日志异常名
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 日志异常名
     * @param Key 日志异常名
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 日志异常处理建议 
     * @return Advise 日志异常处理建议
     */
    public String getAdvise() {
        return this.Advise;
    }

    /**
     * Set 日志异常处理建议
     * @param Advise 日志异常处理建议
     */
    public void setAdvise(String Advise) {
        this.Advise = Advise;
    }

    /**
     * Get 日志异常名出现次数 
     * @return Count 日志异常名出现次数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 日志异常名出现次数
     * @param Count 日志异常名出现次数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public LogDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogDetail(LogDetail source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Advise != null) {
            this.Advise = new String(source.Advise);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Advise", this.Advise);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

