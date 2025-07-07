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

public class CosFileUploadTrigger extends AbstractModel {

    /**
    * 工作流绑定的 COS Bucket 名，如 TopRankVideo-125xxx88。
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * 工作流绑定的 COS Bucket 所属园区，如 ap-chongiqng。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 工作流绑定的输入路径目录，必须为绝对路径，即以 `/` 开头和结尾。如`/movie/201907/`，不填代表根目录`/`。
    */
    @SerializedName("Dir")
    @Expose
    private String Dir;

    /**
    * 工作流允许触发的文件格式列表，如 ["mp4", "flv", "mov"]。不填代表所有格式的文件都可以触发工作流。
    */
    @SerializedName("Formats")
    @Expose
    private String [] Formats;

    /**
     * Get 工作流绑定的 COS Bucket 名，如 TopRankVideo-125xxx88。 
     * @return Bucket 工作流绑定的 COS Bucket 名，如 TopRankVideo-125xxx88。
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set 工作流绑定的 COS Bucket 名，如 TopRankVideo-125xxx88。
     * @param Bucket 工作流绑定的 COS Bucket 名，如 TopRankVideo-125xxx88。
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get 工作流绑定的 COS Bucket 所属园区，如 ap-chongiqng。 
     * @return Region 工作流绑定的 COS Bucket 所属园区，如 ap-chongiqng。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 工作流绑定的 COS Bucket 所属园区，如 ap-chongiqng。
     * @param Region 工作流绑定的 COS Bucket 所属园区，如 ap-chongiqng。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 工作流绑定的输入路径目录，必须为绝对路径，即以 `/` 开头和结尾。如`/movie/201907/`，不填代表根目录`/`。 
     * @return Dir 工作流绑定的输入路径目录，必须为绝对路径，即以 `/` 开头和结尾。如`/movie/201907/`，不填代表根目录`/`。
     */
    public String getDir() {
        return this.Dir;
    }

    /**
     * Set 工作流绑定的输入路径目录，必须为绝对路径，即以 `/` 开头和结尾。如`/movie/201907/`，不填代表根目录`/`。
     * @param Dir 工作流绑定的输入路径目录，必须为绝对路径，即以 `/` 开头和结尾。如`/movie/201907/`，不填代表根目录`/`。
     */
    public void setDir(String Dir) {
        this.Dir = Dir;
    }

    /**
     * Get 工作流允许触发的文件格式列表，如 ["mp4", "flv", "mov"]。不填代表所有格式的文件都可以触发工作流。 
     * @return Formats 工作流允许触发的文件格式列表，如 ["mp4", "flv", "mov"]。不填代表所有格式的文件都可以触发工作流。
     */
    public String [] getFormats() {
        return this.Formats;
    }

    /**
     * Set 工作流允许触发的文件格式列表，如 ["mp4", "flv", "mov"]。不填代表所有格式的文件都可以触发工作流。
     * @param Formats 工作流允许触发的文件格式列表，如 ["mp4", "flv", "mov"]。不填代表所有格式的文件都可以触发工作流。
     */
    public void setFormats(String [] Formats) {
        this.Formats = Formats;
    }

    public CosFileUploadTrigger() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosFileUploadTrigger(CosFileUploadTrigger source) {
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Dir != null) {
            this.Dir = new String(source.Dir);
        }
        if (source.Formats != null) {
            this.Formats = new String[source.Formats.length];
            for (int i = 0; i < source.Formats.length; i++) {
                this.Formats[i] = new String(source.Formats[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Dir", this.Dir);
        this.setParamArraySimple(map, prefix + "Formats.", this.Formats);

    }
}

