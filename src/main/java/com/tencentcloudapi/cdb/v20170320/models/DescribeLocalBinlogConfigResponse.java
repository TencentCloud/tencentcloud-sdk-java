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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLocalBinlogConfigResponse extends AbstractModel{

    /**
    * 实例binlog保留策略。
    */
    @SerializedName("LocalBinlogConfig")
    @Expose
    private LocalBinlogConfig LocalBinlogConfig;

    /**
    * 该地域默认binlog保留策略。
    */
    @SerializedName("LocalBinlogConfigDefault")
    @Expose
    private LocalBinlogConfigDefault LocalBinlogConfigDefault;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 实例binlog保留策略。 
     * @return LocalBinlogConfig 实例binlog保留策略。
     */
    public LocalBinlogConfig getLocalBinlogConfig() {
        return this.LocalBinlogConfig;
    }

    /**
     * Set 实例binlog保留策略。
     * @param LocalBinlogConfig 实例binlog保留策略。
     */
    public void setLocalBinlogConfig(LocalBinlogConfig LocalBinlogConfig) {
        this.LocalBinlogConfig = LocalBinlogConfig;
    }

    /**
     * Get 该地域默认binlog保留策略。 
     * @return LocalBinlogConfigDefault 该地域默认binlog保留策略。
     */
    public LocalBinlogConfigDefault getLocalBinlogConfigDefault() {
        return this.LocalBinlogConfigDefault;
    }

    /**
     * Set 该地域默认binlog保留策略。
     * @param LocalBinlogConfigDefault 该地域默认binlog保留策略。
     */
    public void setLocalBinlogConfigDefault(LocalBinlogConfigDefault LocalBinlogConfigDefault) {
        this.LocalBinlogConfigDefault = LocalBinlogConfigDefault;
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

    public DescribeLocalBinlogConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLocalBinlogConfigResponse(DescribeLocalBinlogConfigResponse source) {
        if (source.LocalBinlogConfig != null) {
            this.LocalBinlogConfig = new LocalBinlogConfig(source.LocalBinlogConfig);
        }
        if (source.LocalBinlogConfigDefault != null) {
            this.LocalBinlogConfigDefault = new LocalBinlogConfigDefault(source.LocalBinlogConfigDefault);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "LocalBinlogConfig.", this.LocalBinlogConfig);
        this.setParamObj(map, prefix + "LocalBinlogConfigDefault.", this.LocalBinlogConfigDefault);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

