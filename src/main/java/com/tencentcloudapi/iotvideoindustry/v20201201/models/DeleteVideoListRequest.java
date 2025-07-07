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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteVideoListRequest extends AbstractModel {

    /**
    * 视频ID列表长度限制100内
    */
    @SerializedName("InitIDs")
    @Expose
    private Long [] InitIDs;

    /**
     * Get 视频ID列表长度限制100内 
     * @return InitIDs 视频ID列表长度限制100内
     */
    public Long [] getInitIDs() {
        return this.InitIDs;
    }

    /**
     * Set 视频ID列表长度限制100内
     * @param InitIDs 视频ID列表长度限制100内
     */
    public void setInitIDs(Long [] InitIDs) {
        this.InitIDs = InitIDs;
    }

    public DeleteVideoListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteVideoListRequest(DeleteVideoListRequest source) {
        if (source.InitIDs != null) {
            this.InitIDs = new Long[source.InitIDs.length];
            for (int i = 0; i < source.InitIDs.length; i++) {
                this.InitIDs[i] = new Long(source.InitIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InitIDs.", this.InitIDs);

    }
}

