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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosPublishInputInfo extends AbstractModel{

    /**
    * 发布生成的对象存储文件所在的 COS Bucket 名，如 TopRankVideo-125xxx88。
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * 发布生成的对象存储文件所在的 COS Bucket 所属园区，如 ap-chongqing。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 发布生成的视频在 COS 存储的对象键。对象键（ObjectKey）是对象（Object）在存储桶（Bucket）中的唯一标识。
    */
    @SerializedName("VideoKey")
    @Expose
    private String VideoKey;

    /**
    * 发布生成的封面在 COS 存储的对象键。
    */
    @SerializedName("CoverKey")
    @Expose
    private String CoverKey;

    /**
     * Get 发布生成的对象存储文件所在的 COS Bucket 名，如 TopRankVideo-125xxx88。 
     * @return Bucket 发布生成的对象存储文件所在的 COS Bucket 名，如 TopRankVideo-125xxx88。
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set 发布生成的对象存储文件所在的 COS Bucket 名，如 TopRankVideo-125xxx88。
     * @param Bucket 发布生成的对象存储文件所在的 COS Bucket 名，如 TopRankVideo-125xxx88。
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get 发布生成的对象存储文件所在的 COS Bucket 所属园区，如 ap-chongqing。 
     * @return Region 发布生成的对象存储文件所在的 COS Bucket 所属园区，如 ap-chongqing。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 发布生成的对象存储文件所在的 COS Bucket 所属园区，如 ap-chongqing。
     * @param Region 发布生成的对象存储文件所在的 COS Bucket 所属园区，如 ap-chongqing。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 发布生成的视频在 COS 存储的对象键。对象键（ObjectKey）是对象（Object）在存储桶（Bucket）中的唯一标识。 
     * @return VideoKey 发布生成的视频在 COS 存储的对象键。对象键（ObjectKey）是对象（Object）在存储桶（Bucket）中的唯一标识。
     */
    public String getVideoKey() {
        return this.VideoKey;
    }

    /**
     * Set 发布生成的视频在 COS 存储的对象键。对象键（ObjectKey）是对象（Object）在存储桶（Bucket）中的唯一标识。
     * @param VideoKey 发布生成的视频在 COS 存储的对象键。对象键（ObjectKey）是对象（Object）在存储桶（Bucket）中的唯一标识。
     */
    public void setVideoKey(String VideoKey) {
        this.VideoKey = VideoKey;
    }

    /**
     * Get 发布生成的封面在 COS 存储的对象键。 
     * @return CoverKey 发布生成的封面在 COS 存储的对象键。
     */
    public String getCoverKey() {
        return this.CoverKey;
    }

    /**
     * Set 发布生成的封面在 COS 存储的对象键。
     * @param CoverKey 发布生成的封面在 COS 存储的对象键。
     */
    public void setCoverKey(String CoverKey) {
        this.CoverKey = CoverKey;
    }

    public CosPublishInputInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosPublishInputInfo(CosPublishInputInfo source) {
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.VideoKey != null) {
            this.VideoKey = new String(source.VideoKey);
        }
        if (source.CoverKey != null) {
            this.CoverKey = new String(source.CoverKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "VideoKey", this.VideoKey);
        this.setParamSimple(map, prefix + "CoverKey", this.CoverKey);

    }
}

