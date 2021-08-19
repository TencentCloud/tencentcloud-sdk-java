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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupUrlResponse extends AbstractModel{

    /**
    * 外网下载地址（6小时内链接有效），该字段正在逐步废弃中。
    */
    @SerializedName("DownloadUrl")
    @Expose
    private String [] DownloadUrl;

    /**
    * 内网下载地址（6小时内链接有效），该字段正在逐步废弃中。
    */
    @SerializedName("InnerDownloadUrl")
    @Expose
    private String [] InnerDownloadUrl;

    /**
    * 文件名称，该字段正在逐步废弃中。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Filenames")
    @Expose
    private String [] Filenames;

    /**
    * 备份文件信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackupInfos")
    @Expose
    private BackupDownloadInfo [] BackupInfos;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 外网下载地址（6小时内链接有效），该字段正在逐步废弃中。 
     * @return DownloadUrl 外网下载地址（6小时内链接有效），该字段正在逐步废弃中。
     */
    public String [] getDownloadUrl() {
        return this.DownloadUrl;
    }

    /**
     * Set 外网下载地址（6小时内链接有效），该字段正在逐步废弃中。
     * @param DownloadUrl 外网下载地址（6小时内链接有效），该字段正在逐步废弃中。
     */
    public void setDownloadUrl(String [] DownloadUrl) {
        this.DownloadUrl = DownloadUrl;
    }

    /**
     * Get 内网下载地址（6小时内链接有效），该字段正在逐步废弃中。 
     * @return InnerDownloadUrl 内网下载地址（6小时内链接有效），该字段正在逐步废弃中。
     */
    public String [] getInnerDownloadUrl() {
        return this.InnerDownloadUrl;
    }

    /**
     * Set 内网下载地址（6小时内链接有效），该字段正在逐步废弃中。
     * @param InnerDownloadUrl 内网下载地址（6小时内链接有效），该字段正在逐步废弃中。
     */
    public void setInnerDownloadUrl(String [] InnerDownloadUrl) {
        this.InnerDownloadUrl = InnerDownloadUrl;
    }

    /**
     * Get 文件名称，该字段正在逐步废弃中。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Filenames 文件名称，该字段正在逐步废弃中。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getFilenames() {
        return this.Filenames;
    }

    /**
     * Set 文件名称，该字段正在逐步废弃中。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Filenames 文件名称，该字段正在逐步废弃中。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilenames(String [] Filenames) {
        this.Filenames = Filenames;
    }

    /**
     * Get 备份文件信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackupInfos 备份文件信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BackupDownloadInfo [] getBackupInfos() {
        return this.BackupInfos;
    }

    /**
     * Set 备份文件信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackupInfos 备份文件信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackupInfos(BackupDownloadInfo [] BackupInfos) {
        this.BackupInfos = BackupInfos;
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

    public DescribeBackupUrlResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupUrlResponse(DescribeBackupUrlResponse source) {
        if (source.DownloadUrl != null) {
            this.DownloadUrl = new String[source.DownloadUrl.length];
            for (int i = 0; i < source.DownloadUrl.length; i++) {
                this.DownloadUrl[i] = new String(source.DownloadUrl[i]);
            }
        }
        if (source.InnerDownloadUrl != null) {
            this.InnerDownloadUrl = new String[source.InnerDownloadUrl.length];
            for (int i = 0; i < source.InnerDownloadUrl.length; i++) {
                this.InnerDownloadUrl[i] = new String(source.InnerDownloadUrl[i]);
            }
        }
        if (source.Filenames != null) {
            this.Filenames = new String[source.Filenames.length];
            for (int i = 0; i < source.Filenames.length; i++) {
                this.Filenames[i] = new String(source.Filenames[i]);
            }
        }
        if (source.BackupInfos != null) {
            this.BackupInfos = new BackupDownloadInfo[source.BackupInfos.length];
            for (int i = 0; i < source.BackupInfos.length; i++) {
                this.BackupInfos[i] = new BackupDownloadInfo(source.BackupInfos[i]);
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
        this.setParamArraySimple(map, prefix + "DownloadUrl.", this.DownloadUrl);
        this.setParamArraySimple(map, prefix + "InnerDownloadUrl.", this.InnerDownloadUrl);
        this.setParamArraySimple(map, prefix + "Filenames.", this.Filenames);
        this.setParamArrayObj(map, prefix + "BackupInfos.", this.BackupInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

