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
package com.tencentcloudapi.dbdc.v20201029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataDisk extends AbstractModel {

    /**
    * <p>磁盘类型</p><p>枚举值：</p><ul><li>CLOUD_HSSD： 增强型云硬盘</li><li>LOCAL_NVME： 本地硬盘</li></ul>
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * <p>磁盘大小</p><p>单位：GiB</p>
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * <p>磁盘名称</p><p>DataDisk 作为输入参数时，DiskName 无效。</p>
    */
    @SerializedName("DiskName")
    @Expose
    private String DiskName;

    /**
    * <p>数据盘是否加密</p><p>枚举值：</p><ul><li>false： 不加密</li><li>true： 加密</li></ul>
    */
    @SerializedName("Encrypt")
    @Expose
    private Boolean Encrypt;

    /**
    * <p>磁盘ID</p><p>入参限制：该参数目前仅用于 DescribeDBCustomNodes 等查询类接口的返回参数，不可用于 CreateDBCustomNodes 等写接口的入参。</p>
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * <p>数据盘快照ID</p><p>入参限制：选择的数据盘快照大小需小于数据盘大小</p>
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * <p>自定义的数据盘标识（如 data / log / backup）</p>
    */
    @SerializedName("ClientDiskKey")
    @Expose
    private String ClientDiskKey;

    /**
     * Get <p>磁盘类型</p><p>枚举值：</p><ul><li>CLOUD_HSSD： 增强型云硬盘</li><li>LOCAL_NVME： 本地硬盘</li></ul> 
     * @return DiskType <p>磁盘类型</p><p>枚举值：</p><ul><li>CLOUD_HSSD： 增强型云硬盘</li><li>LOCAL_NVME： 本地硬盘</li></ul>
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set <p>磁盘类型</p><p>枚举值：</p><ul><li>CLOUD_HSSD： 增强型云硬盘</li><li>LOCAL_NVME： 本地硬盘</li></ul>
     * @param DiskType <p>磁盘类型</p><p>枚举值：</p><ul><li>CLOUD_HSSD： 增强型云硬盘</li><li>LOCAL_NVME： 本地硬盘</li></ul>
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get <p>磁盘大小</p><p>单位：GiB</p> 
     * @return DiskSize <p>磁盘大小</p><p>单位：GiB</p>
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set <p>磁盘大小</p><p>单位：GiB</p>
     * @param DiskSize <p>磁盘大小</p><p>单位：GiB</p>
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get <p>磁盘名称</p><p>DataDisk 作为输入参数时，DiskName 无效。</p> 
     * @return DiskName <p>磁盘名称</p><p>DataDisk 作为输入参数时，DiskName 无效。</p>
     */
    public String getDiskName() {
        return this.DiskName;
    }

    /**
     * Set <p>磁盘名称</p><p>DataDisk 作为输入参数时，DiskName 无效。</p>
     * @param DiskName <p>磁盘名称</p><p>DataDisk 作为输入参数时，DiskName 无效。</p>
     */
    public void setDiskName(String DiskName) {
        this.DiskName = DiskName;
    }

    /**
     * Get <p>数据盘是否加密</p><p>枚举值：</p><ul><li>false： 不加密</li><li>true： 加密</li></ul> 
     * @return Encrypt <p>数据盘是否加密</p><p>枚举值：</p><ul><li>false： 不加密</li><li>true： 加密</li></ul>
     */
    public Boolean getEncrypt() {
        return this.Encrypt;
    }

    /**
     * Set <p>数据盘是否加密</p><p>枚举值：</p><ul><li>false： 不加密</li><li>true： 加密</li></ul>
     * @param Encrypt <p>数据盘是否加密</p><p>枚举值：</p><ul><li>false： 不加密</li><li>true： 加密</li></ul>
     */
    public void setEncrypt(Boolean Encrypt) {
        this.Encrypt = Encrypt;
    }

    /**
     * Get <p>磁盘ID</p><p>入参限制：该参数目前仅用于 DescribeDBCustomNodes 等查询类接口的返回参数，不可用于 CreateDBCustomNodes 等写接口的入参。</p> 
     * @return DiskId <p>磁盘ID</p><p>入参限制：该参数目前仅用于 DescribeDBCustomNodes 等查询类接口的返回参数，不可用于 CreateDBCustomNodes 等写接口的入参。</p>
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set <p>磁盘ID</p><p>入参限制：该参数目前仅用于 DescribeDBCustomNodes 等查询类接口的返回参数，不可用于 CreateDBCustomNodes 等写接口的入参。</p>
     * @param DiskId <p>磁盘ID</p><p>入参限制：该参数目前仅用于 DescribeDBCustomNodes 等查询类接口的返回参数，不可用于 CreateDBCustomNodes 等写接口的入参。</p>
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * Get <p>数据盘快照ID</p><p>入参限制：选择的数据盘快照大小需小于数据盘大小</p> 
     * @return SnapshotId <p>数据盘快照ID</p><p>入参限制：选择的数据盘快照大小需小于数据盘大小</p>
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set <p>数据盘快照ID</p><p>入参限制：选择的数据盘快照大小需小于数据盘大小</p>
     * @param SnapshotId <p>数据盘快照ID</p><p>入参限制：选择的数据盘快照大小需小于数据盘大小</p>
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get <p>自定义的数据盘标识（如 data / log / backup）</p> 
     * @return ClientDiskKey <p>自定义的数据盘标识（如 data / log / backup）</p>
     */
    public String getClientDiskKey() {
        return this.ClientDiskKey;
    }

    /**
     * Set <p>自定义的数据盘标识（如 data / log / backup）</p>
     * @param ClientDiskKey <p>自定义的数据盘标识（如 data / log / backup）</p>
     */
    public void setClientDiskKey(String ClientDiskKey) {
        this.ClientDiskKey = ClientDiskKey;
    }

    public DataDisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataDisk(DataDisk source) {
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.DiskName != null) {
            this.DiskName = new String(source.DiskName);
        }
        if (source.Encrypt != null) {
            this.Encrypt = new Boolean(source.Encrypt);
        }
        if (source.DiskId != null) {
            this.DiskId = new String(source.DiskId);
        }
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
        if (source.ClientDiskKey != null) {
            this.ClientDiskKey = new String(source.ClientDiskKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskName", this.DiskName);
        this.setParamSimple(map, prefix + "Encrypt", this.Encrypt);
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "ClientDiskKey", this.ClientDiskKey);

    }
}

