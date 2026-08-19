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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplyPathLifecyclePolicyRequest extends AbstractModel {

    /**
    * <p>生命周期管理策略ID</p>
    */
    @SerializedName("LifecyclePolicyID")
    @Expose
    private String LifecyclePolicyID;

    /**
    * <p>生命周期管理策略所关联的目录路径列表，每个路径必须以 /cfs/ 开头，代表文件存储实例内部的逻辑路径，而非本地挂载点路径。</p><p>示例：</p><ul><li>若挂载的是CFS根目录 /，需关联挂载路径下的 test1/test2，则入参值为 /cfs/test1/test2</li><li>若挂载的是CFS子目录 /subdir，需关联挂载路径下的 test1/test2，则入参值为 /cfs/subdir/test1/test2</li></ul>
    */
    @SerializedName("Paths")
    @Expose
    private PathInfo [] Paths;

    /**
     * Get <p>生命周期管理策略ID</p> 
     * @return LifecyclePolicyID <p>生命周期管理策略ID</p>
     */
    public String getLifecyclePolicyID() {
        return this.LifecyclePolicyID;
    }

    /**
     * Set <p>生命周期管理策略ID</p>
     * @param LifecyclePolicyID <p>生命周期管理策略ID</p>
     */
    public void setLifecyclePolicyID(String LifecyclePolicyID) {
        this.LifecyclePolicyID = LifecyclePolicyID;
    }

    /**
     * Get <p>生命周期管理策略所关联的目录路径列表，每个路径必须以 /cfs/ 开头，代表文件存储实例内部的逻辑路径，而非本地挂载点路径。</p><p>示例：</p><ul><li>若挂载的是CFS根目录 /，需关联挂载路径下的 test1/test2，则入参值为 /cfs/test1/test2</li><li>若挂载的是CFS子目录 /subdir，需关联挂载路径下的 test1/test2，则入参值为 /cfs/subdir/test1/test2</li></ul> 
     * @return Paths <p>生命周期管理策略所关联的目录路径列表，每个路径必须以 /cfs/ 开头，代表文件存储实例内部的逻辑路径，而非本地挂载点路径。</p><p>示例：</p><ul><li>若挂载的是CFS根目录 /，需关联挂载路径下的 test1/test2，则入参值为 /cfs/test1/test2</li><li>若挂载的是CFS子目录 /subdir，需关联挂载路径下的 test1/test2，则入参值为 /cfs/subdir/test1/test2</li></ul>
     */
    public PathInfo [] getPaths() {
        return this.Paths;
    }

    /**
     * Set <p>生命周期管理策略所关联的目录路径列表，每个路径必须以 /cfs/ 开头，代表文件存储实例内部的逻辑路径，而非本地挂载点路径。</p><p>示例：</p><ul><li>若挂载的是CFS根目录 /，需关联挂载路径下的 test1/test2，则入参值为 /cfs/test1/test2</li><li>若挂载的是CFS子目录 /subdir，需关联挂载路径下的 test1/test2，则入参值为 /cfs/subdir/test1/test2</li></ul>
     * @param Paths <p>生命周期管理策略所关联的目录路径列表，每个路径必须以 /cfs/ 开头，代表文件存储实例内部的逻辑路径，而非本地挂载点路径。</p><p>示例：</p><ul><li>若挂载的是CFS根目录 /，需关联挂载路径下的 test1/test2，则入参值为 /cfs/test1/test2</li><li>若挂载的是CFS子目录 /subdir，需关联挂载路径下的 test1/test2，则入参值为 /cfs/subdir/test1/test2</li></ul>
     */
    public void setPaths(PathInfo [] Paths) {
        this.Paths = Paths;
    }

    public ApplyPathLifecyclePolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyPathLifecyclePolicyRequest(ApplyPathLifecyclePolicyRequest source) {
        if (source.LifecyclePolicyID != null) {
            this.LifecyclePolicyID = new String(source.LifecyclePolicyID);
        }
        if (source.Paths != null) {
            this.Paths = new PathInfo[source.Paths.length];
            for (int i = 0; i < source.Paths.length; i++) {
                this.Paths[i] = new PathInfo(source.Paths[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LifecyclePolicyID", this.LifecyclePolicyID);
        this.setParamArrayObj(map, prefix + "Paths.", this.Paths);

    }
}

