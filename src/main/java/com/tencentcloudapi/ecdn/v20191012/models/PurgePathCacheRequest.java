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
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PurgePathCacheRequest extends AbstractModel{

    /**
    * 要刷新的目录列表，必须包含协议头部。
    */
    @SerializedName("Paths")
    @Expose
    private String [] Paths;

    /**
    * 刷新类型，flush 代表刷新有更新的资源，delete 表示刷新全部资源。
    */
    @SerializedName("FlushType")
    @Expose
    private String FlushType;

    /**
     * Get 要刷新的目录列表，必须包含协议头部。 
     * @return Paths 要刷新的目录列表，必须包含协议头部。
     */
    public String [] getPaths() {
        return this.Paths;
    }

    /**
     * Set 要刷新的目录列表，必须包含协议头部。
     * @param Paths 要刷新的目录列表，必须包含协议头部。
     */
    public void setPaths(String [] Paths) {
        this.Paths = Paths;
    }

    /**
     * Get 刷新类型，flush 代表刷新有更新的资源，delete 表示刷新全部资源。 
     * @return FlushType 刷新类型，flush 代表刷新有更新的资源，delete 表示刷新全部资源。
     */
    public String getFlushType() {
        return this.FlushType;
    }

    /**
     * Set 刷新类型，flush 代表刷新有更新的资源，delete 表示刷新全部资源。
     * @param FlushType 刷新类型，flush 代表刷新有更新的资源，delete 表示刷新全部资源。
     */
    public void setFlushType(String FlushType) {
        this.FlushType = FlushType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Paths.", this.Paths);
        this.setParamSimple(map, prefix + "FlushType", this.FlushType);

    }
}

