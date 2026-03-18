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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CalculateBackupSaveSecExpiresResponse extends AbstractModel {

    /**
    * 将被删除的备份文件总数
    */
    @SerializedName("WillDeleteBackupFileCount")
    @Expose
    private Long WillDeleteBackupFileCount;

    /**
    * 将被删除的备份文件列表
    */
    @SerializedName("WillDeleteBackupFiles")
    @Expose
    private WillDeleteItem [] WillDeleteBackupFiles;

    /**
    * 将被删除的Binlog文件总数
    */
    @SerializedName("WillDeleteBinlogFileCount")
    @Expose
    private Long WillDeleteBinlogFileCount;

    /**
    * 将被删除的Binlog文件列表
    */
    @SerializedName("WillDeleteBinlogFiles")
    @Expose
    private WillDeleteItem [] WillDeleteBinlogFiles;

    /**
    * 将被删除的Redolog文件总数
    */
    @SerializedName("WillDeleteRedoLogFileCount")
    @Expose
    private Long WillDeleteRedoLogFileCount;

    /**
    * 将被删除的Redolog文件列表
    */
    @SerializedName("WillDeleteRedoLogFiles")
    @Expose
    private WillDeleteItem [] WillDeleteRedoLogFiles;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 将被删除的备份文件总数 
     * @return WillDeleteBackupFileCount 将被删除的备份文件总数
     */
    public Long getWillDeleteBackupFileCount() {
        return this.WillDeleteBackupFileCount;
    }

    /**
     * Set 将被删除的备份文件总数
     * @param WillDeleteBackupFileCount 将被删除的备份文件总数
     */
    public void setWillDeleteBackupFileCount(Long WillDeleteBackupFileCount) {
        this.WillDeleteBackupFileCount = WillDeleteBackupFileCount;
    }

    /**
     * Get 将被删除的备份文件列表 
     * @return WillDeleteBackupFiles 将被删除的备份文件列表
     */
    public WillDeleteItem [] getWillDeleteBackupFiles() {
        return this.WillDeleteBackupFiles;
    }

    /**
     * Set 将被删除的备份文件列表
     * @param WillDeleteBackupFiles 将被删除的备份文件列表
     */
    public void setWillDeleteBackupFiles(WillDeleteItem [] WillDeleteBackupFiles) {
        this.WillDeleteBackupFiles = WillDeleteBackupFiles;
    }

    /**
     * Get 将被删除的Binlog文件总数 
     * @return WillDeleteBinlogFileCount 将被删除的Binlog文件总数
     */
    public Long getWillDeleteBinlogFileCount() {
        return this.WillDeleteBinlogFileCount;
    }

    /**
     * Set 将被删除的Binlog文件总数
     * @param WillDeleteBinlogFileCount 将被删除的Binlog文件总数
     */
    public void setWillDeleteBinlogFileCount(Long WillDeleteBinlogFileCount) {
        this.WillDeleteBinlogFileCount = WillDeleteBinlogFileCount;
    }

    /**
     * Get 将被删除的Binlog文件列表 
     * @return WillDeleteBinlogFiles 将被删除的Binlog文件列表
     */
    public WillDeleteItem [] getWillDeleteBinlogFiles() {
        return this.WillDeleteBinlogFiles;
    }

    /**
     * Set 将被删除的Binlog文件列表
     * @param WillDeleteBinlogFiles 将被删除的Binlog文件列表
     */
    public void setWillDeleteBinlogFiles(WillDeleteItem [] WillDeleteBinlogFiles) {
        this.WillDeleteBinlogFiles = WillDeleteBinlogFiles;
    }

    /**
     * Get 将被删除的Redolog文件总数 
     * @return WillDeleteRedoLogFileCount 将被删除的Redolog文件总数
     */
    public Long getWillDeleteRedoLogFileCount() {
        return this.WillDeleteRedoLogFileCount;
    }

    /**
     * Set 将被删除的Redolog文件总数
     * @param WillDeleteRedoLogFileCount 将被删除的Redolog文件总数
     */
    public void setWillDeleteRedoLogFileCount(Long WillDeleteRedoLogFileCount) {
        this.WillDeleteRedoLogFileCount = WillDeleteRedoLogFileCount;
    }

    /**
     * Get 将被删除的Redolog文件列表 
     * @return WillDeleteRedoLogFiles 将被删除的Redolog文件列表
     */
    public WillDeleteItem [] getWillDeleteRedoLogFiles() {
        return this.WillDeleteRedoLogFiles;
    }

    /**
     * Set 将被删除的Redolog文件列表
     * @param WillDeleteRedoLogFiles 将被删除的Redolog文件列表
     */
    public void setWillDeleteRedoLogFiles(WillDeleteItem [] WillDeleteRedoLogFiles) {
        this.WillDeleteRedoLogFiles = WillDeleteRedoLogFiles;
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

    public CalculateBackupSaveSecExpiresResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CalculateBackupSaveSecExpiresResponse(CalculateBackupSaveSecExpiresResponse source) {
        if (source.WillDeleteBackupFileCount != null) {
            this.WillDeleteBackupFileCount = new Long(source.WillDeleteBackupFileCount);
        }
        if (source.WillDeleteBackupFiles != null) {
            this.WillDeleteBackupFiles = new WillDeleteItem[source.WillDeleteBackupFiles.length];
            for (int i = 0; i < source.WillDeleteBackupFiles.length; i++) {
                this.WillDeleteBackupFiles[i] = new WillDeleteItem(source.WillDeleteBackupFiles[i]);
            }
        }
        if (source.WillDeleteBinlogFileCount != null) {
            this.WillDeleteBinlogFileCount = new Long(source.WillDeleteBinlogFileCount);
        }
        if (source.WillDeleteBinlogFiles != null) {
            this.WillDeleteBinlogFiles = new WillDeleteItem[source.WillDeleteBinlogFiles.length];
            for (int i = 0; i < source.WillDeleteBinlogFiles.length; i++) {
                this.WillDeleteBinlogFiles[i] = new WillDeleteItem(source.WillDeleteBinlogFiles[i]);
            }
        }
        if (source.WillDeleteRedoLogFileCount != null) {
            this.WillDeleteRedoLogFileCount = new Long(source.WillDeleteRedoLogFileCount);
        }
        if (source.WillDeleteRedoLogFiles != null) {
            this.WillDeleteRedoLogFiles = new WillDeleteItem[source.WillDeleteRedoLogFiles.length];
            for (int i = 0; i < source.WillDeleteRedoLogFiles.length; i++) {
                this.WillDeleteRedoLogFiles[i] = new WillDeleteItem(source.WillDeleteRedoLogFiles[i]);
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
        this.setParamSimple(map, prefix + "WillDeleteBackupFileCount", this.WillDeleteBackupFileCount);
        this.setParamArrayObj(map, prefix + "WillDeleteBackupFiles.", this.WillDeleteBackupFiles);
        this.setParamSimple(map, prefix + "WillDeleteBinlogFileCount", this.WillDeleteBinlogFileCount);
        this.setParamArrayObj(map, prefix + "WillDeleteBinlogFiles.", this.WillDeleteBinlogFiles);
        this.setParamSimple(map, prefix + "WillDeleteRedoLogFileCount", this.WillDeleteRedoLogFileCount);
        this.setParamArrayObj(map, prefix + "WillDeleteRedoLogFiles.", this.WillDeleteRedoLogFiles);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

