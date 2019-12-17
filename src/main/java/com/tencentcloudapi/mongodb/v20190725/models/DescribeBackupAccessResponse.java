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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupAccessResponse extends AbstractModel{

    /**
    * 实例所属地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 备份文件所在存储桶
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * 备份文件的存储信息
    */
    @SerializedName("Files")
    @Expose
    private BackupFile [] Files;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 实例所属地域 
     * @return Region 实例所属地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 实例所属地域
     * @param Region 实例所属地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 备份文件所在存储桶 
     * @return Bucket 备份文件所在存储桶
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set 备份文件所在存储桶
     * @param Bucket 备份文件所在存储桶
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get 备份文件的存储信息 
     * @return Files 备份文件的存储信息
     */
    public BackupFile [] getFiles() {
        return this.Files;
    }

    /**
     * Set 备份文件的存储信息
     * @param Files 备份文件的存储信息
     */
    public void setFiles(BackupFile [] Files) {
        this.Files = Files;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamArrayObj(map, prefix + "Files.", this.Files);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

