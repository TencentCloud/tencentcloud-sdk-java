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
package com.tencentcloudapi.goosefs.v20220519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttachFileSystemBucketRequest extends AbstractModel{

    /**
    * 无
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * 关联新Bucket
    */
    @SerializedName("Bucket")
    @Expose
    private MappedBucket Bucket;

    /**
     * Get 无 
     * @return FileSystemId 无
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set 无
     * @param FileSystemId 无
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get 关联新Bucket 
     * @return Bucket 关联新Bucket
     */
    public MappedBucket getBucket() {
        return this.Bucket;
    }

    /**
     * Set 关联新Bucket
     * @param Bucket 关联新Bucket
     */
    public void setBucket(MappedBucket Bucket) {
        this.Bucket = Bucket;
    }

    public AttachFileSystemBucketRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttachFileSystemBucketRequest(AttachFileSystemBucketRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.Bucket != null) {
            this.Bucket = new MappedBucket(source.Bucket);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamObj(map, prefix + "Bucket.", this.Bucket);

    }
}

