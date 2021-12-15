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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteLiveVideoListRequest extends AbstractModel{

    /**
    * 视频ID 列表, 大小限制(100)
    */
    @SerializedName("IntIDs")
    @Expose
    private Long [] IntIDs;

    /**
     * Get 视频ID 列表, 大小限制(100) 
     * @return IntIDs 视频ID 列表, 大小限制(100)
     */
    public Long [] getIntIDs() {
        return this.IntIDs;
    }

    /**
     * Set 视频ID 列表, 大小限制(100)
     * @param IntIDs 视频ID 列表, 大小限制(100)
     */
    public void setIntIDs(Long [] IntIDs) {
        this.IntIDs = IntIDs;
    }

    public DeleteLiveVideoListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteLiveVideoListRequest(DeleteLiveVideoListRequest source) {
        if (source.IntIDs != null) {
            this.IntIDs = new Long[source.IntIDs.length];
            for (int i = 0; i < source.IntIDs.length; i++) {
                this.IntIDs[i] = new Long(source.IntIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "IntIDs.", this.IntIDs);

    }
}

