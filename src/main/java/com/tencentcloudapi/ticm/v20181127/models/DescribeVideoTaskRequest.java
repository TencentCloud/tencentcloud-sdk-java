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
package com.tencentcloudapi.ticm.v20181127.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVideoTaskRequest extends AbstractModel {

    /**
    * 需要查询的视频审核的任务ID
    */
    @SerializedName("VodTaskId")
    @Expose
    private String VodTaskId;

    /**
     * Get 需要查询的视频审核的任务ID 
     * @return VodTaskId 需要查询的视频审核的任务ID
     */
    public String getVodTaskId() {
        return this.VodTaskId;
    }

    /**
     * Set 需要查询的视频审核的任务ID
     * @param VodTaskId 需要查询的视频审核的任务ID
     */
    public void setVodTaskId(String VodTaskId) {
        this.VodTaskId = VodTaskId;
    }

    public DescribeVideoTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVideoTaskRequest(DescribeVideoTaskRequest source) {
        if (source.VodTaskId != null) {
            this.VodTaskId = new String(source.VodTaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VodTaskId", this.VodTaskId);

    }
}

