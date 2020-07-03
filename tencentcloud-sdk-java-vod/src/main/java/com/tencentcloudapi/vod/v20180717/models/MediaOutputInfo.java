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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaOutputInfo extends AbstractModel{

    /**
    * 输出文件 Bucket 所属地域，如 ap-guangzhou  。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 输出文件 Bucket 。
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * 输出文件目录，目录名必须以 "/" 结尾。
    */
    @SerializedName("Dir")
    @Expose
    private String Dir;

    /**
     * Get 输出文件 Bucket 所属地域，如 ap-guangzhou  。 
     * @return Region 输出文件 Bucket 所属地域，如 ap-guangzhou  。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 输出文件 Bucket 所属地域，如 ap-guangzhou  。
     * @param Region 输出文件 Bucket 所属地域，如 ap-guangzhou  。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 输出文件 Bucket 。 
     * @return Bucket 输出文件 Bucket 。
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set 输出文件 Bucket 。
     * @param Bucket 输出文件 Bucket 。
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get 输出文件目录，目录名必须以 "/" 结尾。 
     * @return Dir 输出文件目录，目录名必须以 "/" 结尾。
     */
    public String getDir() {
        return this.Dir;
    }

    /**
     * Set 输出文件目录，目录名必须以 "/" 结尾。
     * @param Dir 输出文件目录，目录名必须以 "/" 结尾。
     */
    public void setDir(String Dir) {
        this.Dir = Dir;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Dir", this.Dir);

    }
}

