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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupStreamListRequest extends AbstractModel {

    /**
    * 流名称，用于精确查询。
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
     * Get 流名称，用于精确查询。 
     * @return StreamName 流名称，用于精确查询。
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set 流名称，用于精确查询。
     * @param StreamName 流名称，用于精确查询。
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    public DescribeBackupStreamListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupStreamListRequest(DescribeBackupStreamListRequest source) {
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);

    }
}

