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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListStoragesResponse extends AbstractModel {

    /**
    * <p>CFS列表</p>
    */
    @SerializedName("CFSFileSystems")
    @Expose
    private CFSFileSystemInfo [] CFSFileSystems;

    /**
    * <p>COS列表</p>
    */
    @SerializedName("COSBuckets")
    @Expose
    private COSBucketInfo [] COSBuckets;

    /**
    * <p>CFS Turbo 文件系统列表</p>
    */
    @SerializedName("CFSTurboFileSystems")
    @Expose
    private CFSTurboFileSystemInfo [] CFSTurboFileSystems;

    /**
    * <p>GooseFS 集群列表（状态为 ACTIVE 的可用集群）</p>
    */
    @SerializedName("GooseFSClusters")
    @Expose
    private GooseFSClustersInfo [] GooseFSClusters;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>CFS列表</p> 
     * @return CFSFileSystems <p>CFS列表</p>
     */
    public CFSFileSystemInfo [] getCFSFileSystems() {
        return this.CFSFileSystems;
    }

    /**
     * Set <p>CFS列表</p>
     * @param CFSFileSystems <p>CFS列表</p>
     */
    public void setCFSFileSystems(CFSFileSystemInfo [] CFSFileSystems) {
        this.CFSFileSystems = CFSFileSystems;
    }

    /**
     * Get <p>COS列表</p> 
     * @return COSBuckets <p>COS列表</p>
     */
    public COSBucketInfo [] getCOSBuckets() {
        return this.COSBuckets;
    }

    /**
     * Set <p>COS列表</p>
     * @param COSBuckets <p>COS列表</p>
     */
    public void setCOSBuckets(COSBucketInfo [] COSBuckets) {
        this.COSBuckets = COSBuckets;
    }

    /**
     * Get <p>CFS Turbo 文件系统列表</p> 
     * @return CFSTurboFileSystems <p>CFS Turbo 文件系统列表</p>
     */
    public CFSTurboFileSystemInfo [] getCFSTurboFileSystems() {
        return this.CFSTurboFileSystems;
    }

    /**
     * Set <p>CFS Turbo 文件系统列表</p>
     * @param CFSTurboFileSystems <p>CFS Turbo 文件系统列表</p>
     */
    public void setCFSTurboFileSystems(CFSTurboFileSystemInfo [] CFSTurboFileSystems) {
        this.CFSTurboFileSystems = CFSTurboFileSystems;
    }

    /**
     * Get <p>GooseFS 集群列表（状态为 ACTIVE 的可用集群）</p> 
     * @return GooseFSClusters <p>GooseFS 集群列表（状态为 ACTIVE 的可用集群）</p>
     */
    public GooseFSClustersInfo [] getGooseFSClusters() {
        return this.GooseFSClusters;
    }

    /**
     * Set <p>GooseFS 集群列表（状态为 ACTIVE 的可用集群）</p>
     * @param GooseFSClusters <p>GooseFS 集群列表（状态为 ACTIVE 的可用集群）</p>
     */
    public void setGooseFSClusters(GooseFSClustersInfo [] GooseFSClusters) {
        this.GooseFSClusters = GooseFSClusters;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ListStoragesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListStoragesResponse(ListStoragesResponse source) {
        if (source.CFSFileSystems != null) {
            this.CFSFileSystems = new CFSFileSystemInfo[source.CFSFileSystems.length];
            for (int i = 0; i < source.CFSFileSystems.length; i++) {
                this.CFSFileSystems[i] = new CFSFileSystemInfo(source.CFSFileSystems[i]);
            }
        }
        if (source.COSBuckets != null) {
            this.COSBuckets = new COSBucketInfo[source.COSBuckets.length];
            for (int i = 0; i < source.COSBuckets.length; i++) {
                this.COSBuckets[i] = new COSBucketInfo(source.COSBuckets[i]);
            }
        }
        if (source.CFSTurboFileSystems != null) {
            this.CFSTurboFileSystems = new CFSTurboFileSystemInfo[source.CFSTurboFileSystems.length];
            for (int i = 0; i < source.CFSTurboFileSystems.length; i++) {
                this.CFSTurboFileSystems[i] = new CFSTurboFileSystemInfo(source.CFSTurboFileSystems[i]);
            }
        }
        if (source.GooseFSClusters != null) {
            this.GooseFSClusters = new GooseFSClustersInfo[source.GooseFSClusters.length];
            for (int i = 0; i < source.GooseFSClusters.length; i++) {
                this.GooseFSClusters[i] = new GooseFSClustersInfo(source.GooseFSClusters[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "CFSFileSystems.", this.CFSFileSystems);
        this.setParamArrayObj(map, prefix + "COSBuckets.", this.COSBuckets);
        this.setParamArrayObj(map, prefix + "CFSTurboFileSystems.", this.CFSTurboFileSystems);
        this.setParamArrayObj(map, prefix + "GooseFSClusters.", this.GooseFSClusters);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

