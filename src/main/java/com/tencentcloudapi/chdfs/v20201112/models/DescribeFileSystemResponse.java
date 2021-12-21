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
package com.tencentcloudapi.chdfs.v20201112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFileSystemResponse extends AbstractModel{

    /**
    * 文件系统
    */
    @SerializedName("FileSystem")
    @Expose
    private FileSystem FileSystem;

    /**
    * 文件系统已使用容量（byte）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CapacityUsed")
    @Expose
    private Long CapacityUsed;

    /**
    * 已使用COS归档存储容量（byte）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ArchiveCapacityUsed")
    @Expose
    private Long ArchiveCapacityUsed;

    /**
    * 已使用COS标准存储容量（byte）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StandardCapacityUsed")
    @Expose
    private Long StandardCapacityUsed;

    /**
    * 已使用COS低频存储容量（byte）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DegradeCapacityUsed")
    @Expose
    private Long DegradeCapacityUsed;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 文件系统 
     * @return FileSystem 文件系统
     */
    public FileSystem getFileSystem() {
        return this.FileSystem;
    }

    /**
     * Set 文件系统
     * @param FileSystem 文件系统
     */
    public void setFileSystem(FileSystem FileSystem) {
        this.FileSystem = FileSystem;
    }

    /**
     * Get 文件系统已使用容量（byte）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CapacityUsed 文件系统已使用容量（byte）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCapacityUsed() {
        return this.CapacityUsed;
    }

    /**
     * Set 文件系统已使用容量（byte）
注意：此字段可能返回 null，表示取不到有效值。
     * @param CapacityUsed 文件系统已使用容量（byte）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCapacityUsed(Long CapacityUsed) {
        this.CapacityUsed = CapacityUsed;
    }

    /**
     * Get 已使用COS归档存储容量（byte）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ArchiveCapacityUsed 已使用COS归档存储容量（byte）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getArchiveCapacityUsed() {
        return this.ArchiveCapacityUsed;
    }

    /**
     * Set 已使用COS归档存储容量（byte）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ArchiveCapacityUsed 已使用COS归档存储容量（byte）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setArchiveCapacityUsed(Long ArchiveCapacityUsed) {
        this.ArchiveCapacityUsed = ArchiveCapacityUsed;
    }

    /**
     * Get 已使用COS标准存储容量（byte）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StandardCapacityUsed 已使用COS标准存储容量（byte）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStandardCapacityUsed() {
        return this.StandardCapacityUsed;
    }

    /**
     * Set 已使用COS标准存储容量（byte）
注意：此字段可能返回 null，表示取不到有效值。
     * @param StandardCapacityUsed 已使用COS标准存储容量（byte）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStandardCapacityUsed(Long StandardCapacityUsed) {
        this.StandardCapacityUsed = StandardCapacityUsed;
    }

    /**
     * Get 已使用COS低频存储容量（byte）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DegradeCapacityUsed 已使用COS低频存储容量（byte）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDegradeCapacityUsed() {
        return this.DegradeCapacityUsed;
    }

    /**
     * Set 已使用COS低频存储容量（byte）
注意：此字段可能返回 null，表示取不到有效值。
     * @param DegradeCapacityUsed 已使用COS低频存储容量（byte）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDegradeCapacityUsed(Long DegradeCapacityUsed) {
        this.DegradeCapacityUsed = DegradeCapacityUsed;
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

    public DescribeFileSystemResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFileSystemResponse(DescribeFileSystemResponse source) {
        if (source.FileSystem != null) {
            this.FileSystem = new FileSystem(source.FileSystem);
        }
        if (source.CapacityUsed != null) {
            this.CapacityUsed = new Long(source.CapacityUsed);
        }
        if (source.ArchiveCapacityUsed != null) {
            this.ArchiveCapacityUsed = new Long(source.ArchiveCapacityUsed);
        }
        if (source.StandardCapacityUsed != null) {
            this.StandardCapacityUsed = new Long(source.StandardCapacityUsed);
        }
        if (source.DegradeCapacityUsed != null) {
            this.DegradeCapacityUsed = new Long(source.DegradeCapacityUsed);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "FileSystem.", this.FileSystem);
        this.setParamSimple(map, prefix + "CapacityUsed", this.CapacityUsed);
        this.setParamSimple(map, prefix + "ArchiveCapacityUsed", this.ArchiveCapacityUsed);
        this.setParamSimple(map, prefix + "StandardCapacityUsed", this.StandardCapacityUsed);
        this.setParamSimple(map, prefix + "DegradeCapacityUsed", this.DegradeCapacityUsed);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

