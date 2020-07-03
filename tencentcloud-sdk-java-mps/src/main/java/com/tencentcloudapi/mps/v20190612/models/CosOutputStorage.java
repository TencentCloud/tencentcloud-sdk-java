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

public class CosOutputStorage extends AbstractModel{

    /**
    * 视频处理生成的文件输出的目标 Bucket 名，如 TopRankVideo-125xxx88。如果不填，表示继承上层。
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * 视频处理生成的文件输出的目标 Bucket 的园区，如 ap-chongqing。如果不填，表示继承上层。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get 视频处理生成的文件输出的目标 Bucket 名，如 TopRankVideo-125xxx88。如果不填，表示继承上层。 
     * @return Bucket 视频处理生成的文件输出的目标 Bucket 名，如 TopRankVideo-125xxx88。如果不填，表示继承上层。
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set 视频处理生成的文件输出的目标 Bucket 名，如 TopRankVideo-125xxx88。如果不填，表示继承上层。
     * @param Bucket 视频处理生成的文件输出的目标 Bucket 名，如 TopRankVideo-125xxx88。如果不填，表示继承上层。
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get 视频处理生成的文件输出的目标 Bucket 的园区，如 ap-chongqing。如果不填，表示继承上层。 
     * @return Region 视频处理生成的文件输出的目标 Bucket 的园区，如 ap-chongqing。如果不填，表示继承上层。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 视频处理生成的文件输出的目标 Bucket 的园区，如 ap-chongqing。如果不填，表示继承上层。
     * @param Region 视频处理生成的文件输出的目标 Bucket 的园区，如 ap-chongqing。如果不填，表示继承上层。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

