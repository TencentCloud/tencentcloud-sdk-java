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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VODOutputStorage extends AbstractModel {

    /**
    * <p>媒体处理生成的文件输出的目标 <em>Bucket ID</em></p>
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * <p>媒体处理生成的文件输出的目标 Bucket 的园区</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>点播专业版应用Id</p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get <p>媒体处理生成的文件输出的目标 <em>Bucket ID</em></p> 
     * @return Bucket <p>媒体处理生成的文件输出的目标 <em>Bucket ID</em></p>
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set <p>媒体处理生成的文件输出的目标 <em>Bucket ID</em></p>
     * @param Bucket <p>媒体处理生成的文件输出的目标 <em>Bucket ID</em></p>
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get <p>媒体处理生成的文件输出的目标 Bucket 的园区</p> 
     * @return Region <p>媒体处理生成的文件输出的目标 Bucket 的园区</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>媒体处理生成的文件输出的目标 Bucket 的园区</p>
     * @param Region <p>媒体处理生成的文件输出的目标 Bucket 的园区</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>点播专业版应用Id</p> 
     * @return SubAppId <p>点播专业版应用Id</p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p>点播专业版应用Id</p>
     * @param SubAppId <p>点播专业版应用Id</p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    public VODOutputStorage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VODOutputStorage(VODOutputStorage source) {
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

