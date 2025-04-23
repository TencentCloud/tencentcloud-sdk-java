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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogConfigListPage extends AbstractModel {

    /**
    * 记录
    */
    @SerializedName("Records")
    @Expose
    private LogConfig [] Records;

    /**
    * 翻页游标
    */
    @SerializedName("ContinueToken")
    @Expose
    private String ContinueToken;

    /**
     * Get 记录 
     * @return Records 记录
     */
    public LogConfig [] getRecords() {
        return this.Records;
    }

    /**
     * Set 记录
     * @param Records 记录
     */
    public void setRecords(LogConfig [] Records) {
        this.Records = Records;
    }

    /**
     * Get 翻页游标 
     * @return ContinueToken 翻页游标
     */
    public String getContinueToken() {
        return this.ContinueToken;
    }

    /**
     * Set 翻页游标
     * @param ContinueToken 翻页游标
     */
    public void setContinueToken(String ContinueToken) {
        this.ContinueToken = ContinueToken;
    }

    public LogConfigListPage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogConfigListPage(LogConfigListPage source) {
        if (source.Records != null) {
            this.Records = new LogConfig[source.Records.length];
            for (int i = 0; i < source.Records.length; i++) {
                this.Records[i] = new LogConfig(source.Records[i]);
            }
        }
        if (source.ContinueToken != null) {
            this.ContinueToken = new String(source.ContinueToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Records.", this.Records);
        this.setParamSimple(map, prefix + "ContinueToken", this.ContinueToken);

    }
}

