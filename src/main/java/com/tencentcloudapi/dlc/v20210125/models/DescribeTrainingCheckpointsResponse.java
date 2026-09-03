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

public class DescribeTrainingCheckpointsResponse extends AbstractModel {

    /**
    * <p>当前层级文件/目录列表</p>
    */
    @SerializedName("Items")
    @Expose
    private SharedMountFileItem [] Items;

    /**
    * <p>当前挂载路径</p>
    */
    @SerializedName("MountPath")
    @Expose
    private String MountPath;

    /**
    * <p>当前浏览的子路径</p>
    */
    @SerializedName("SubPath")
    @Expose
    private String SubPath;

    /**
    * <p>存储类型：COS / CFS / CFS_TURBO / GOOSEFS</p>
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * <p>存储路径（COS 桶路径或 CFS/GooseFSx 挂载路径）</p>
    */
    @SerializedName("StoragePath")
    @Expose
    private String StoragePath;

    /**
    * <p>错误或提示信息（仅在请求异常时有值）</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>快照时间戳（仅 CFS/GooseFSx 存储时有值）</p>
    */
    @SerializedName("SnapshotTimestamp")
    @Expose
    private Long SnapshotTimestamp;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>当前层级文件/目录列表</p> 
     * @return Items <p>当前层级文件/目录列表</p>
     */
    public SharedMountFileItem [] getItems() {
        return this.Items;
    }

    /**
     * Set <p>当前层级文件/目录列表</p>
     * @param Items <p>当前层级文件/目录列表</p>
     */
    public void setItems(SharedMountFileItem [] Items) {
        this.Items = Items;
    }

    /**
     * Get <p>当前挂载路径</p> 
     * @return MountPath <p>当前挂载路径</p>
     */
    public String getMountPath() {
        return this.MountPath;
    }

    /**
     * Set <p>当前挂载路径</p>
     * @param MountPath <p>当前挂载路径</p>
     */
    public void setMountPath(String MountPath) {
        this.MountPath = MountPath;
    }

    /**
     * Get <p>当前浏览的子路径</p> 
     * @return SubPath <p>当前浏览的子路径</p>
     */
    public String getSubPath() {
        return this.SubPath;
    }

    /**
     * Set <p>当前浏览的子路径</p>
     * @param SubPath <p>当前浏览的子路径</p>
     */
    public void setSubPath(String SubPath) {
        this.SubPath = SubPath;
    }

    /**
     * Get <p>存储类型：COS / CFS / CFS_TURBO / GOOSEFS</p> 
     * @return StorageType <p>存储类型：COS / CFS / CFS_TURBO / GOOSEFS</p>
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>存储类型：COS / CFS / CFS_TURBO / GOOSEFS</p>
     * @param StorageType <p>存储类型：COS / CFS / CFS_TURBO / GOOSEFS</p>
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>存储路径（COS 桶路径或 CFS/GooseFSx 挂载路径）</p> 
     * @return StoragePath <p>存储路径（COS 桶路径或 CFS/GooseFSx 挂载路径）</p>
     */
    public String getStoragePath() {
        return this.StoragePath;
    }

    /**
     * Set <p>存储路径（COS 桶路径或 CFS/GooseFSx 挂载路径）</p>
     * @param StoragePath <p>存储路径（COS 桶路径或 CFS/GooseFSx 挂载路径）</p>
     */
    public void setStoragePath(String StoragePath) {
        this.StoragePath = StoragePath;
    }

    /**
     * Get <p>错误或提示信息（仅在请求异常时有值）</p> 
     * @return Message <p>错误或提示信息（仅在请求异常时有值）</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>错误或提示信息（仅在请求异常时有值）</p>
     * @param Message <p>错误或提示信息（仅在请求异常时有值）</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>快照时间戳（仅 CFS/GooseFSx 存储时有值）</p> 
     * @return SnapshotTimestamp <p>快照时间戳（仅 CFS/GooseFSx 存储时有值）</p>
     */
    public Long getSnapshotTimestamp() {
        return this.SnapshotTimestamp;
    }

    /**
     * Set <p>快照时间戳（仅 CFS/GooseFSx 存储时有值）</p>
     * @param SnapshotTimestamp <p>快照时间戳（仅 CFS/GooseFSx 存储时有值）</p>
     */
    public void setSnapshotTimestamp(Long SnapshotTimestamp) {
        this.SnapshotTimestamp = SnapshotTimestamp;
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

    public DescribeTrainingCheckpointsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTrainingCheckpointsResponse(DescribeTrainingCheckpointsResponse source) {
        if (source.Items != null) {
            this.Items = new SharedMountFileItem[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new SharedMountFileItem(source.Items[i]);
            }
        }
        if (source.MountPath != null) {
            this.MountPath = new String(source.MountPath);
        }
        if (source.SubPath != null) {
            this.SubPath = new String(source.SubPath);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.StoragePath != null) {
            this.StoragePath = new String(source.StoragePath);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.SnapshotTimestamp != null) {
            this.SnapshotTimestamp = new Long(source.SnapshotTimestamp);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "MountPath", this.MountPath);
        this.setParamSimple(map, prefix + "SubPath", this.SubPath);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "StoragePath", this.StoragePath);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "SnapshotTimestamp", this.SnapshotTimestamp);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

