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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosInputInfo extends AbstractModel{

    /**
    * 视频处理对象文件所在的 COS Bucket 名，如 TopRankVideo-125xxx88。
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * 视频处理对象文件所在的 COS Bucket 所属园区，如 ap-chongqing。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 视频处理对象文件的输入路径，如`/movie/201907/WildAnimal.mov`。
    */
    @SerializedName("Object")
    @Expose
    private String Object;

    /**
     * Get 视频处理对象文件所在的 COS Bucket 名，如 TopRankVideo-125xxx88。 
     * @return Bucket 视频处理对象文件所在的 COS Bucket 名，如 TopRankVideo-125xxx88。
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set 视频处理对象文件所在的 COS Bucket 名，如 TopRankVideo-125xxx88。
     * @param Bucket 视频处理对象文件所在的 COS Bucket 名，如 TopRankVideo-125xxx88。
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get 视频处理对象文件所在的 COS Bucket 所属园区，如 ap-chongqing。 
     * @return Region 视频处理对象文件所在的 COS Bucket 所属园区，如 ap-chongqing。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 视频处理对象文件所在的 COS Bucket 所属园区，如 ap-chongqing。
     * @param Region 视频处理对象文件所在的 COS Bucket 所属园区，如 ap-chongqing。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 视频处理对象文件的输入路径，如`/movie/201907/WildAnimal.mov`。 
     * @return Object 视频处理对象文件的输入路径，如`/movie/201907/WildAnimal.mov`。
     */
    public String getObject() {
        return this.Object;
    }

    /**
     * Set 视频处理对象文件的输入路径，如`/movie/201907/WildAnimal.mov`。
     * @param Object 视频处理对象文件的输入路径，如`/movie/201907/WildAnimal.mov`。
     */
    public void setObject(String Object) {
        this.Object = Object;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Object", this.Object);

    }
}

