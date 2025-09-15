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

public class VODInputInfo extends AbstractModel {

    /**
    * 媒体处理对象文件所在的 *Bucket ID*
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * 媒体处理对象文件所在的 Bucket 所属园区
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 媒体处理对象文件的输入路径
    */
    @SerializedName("Object")
    @Expose
    private String Object;

    /**
    * 点播专业版应用Id
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get 媒体处理对象文件所在的 *Bucket ID* 
     * @return Bucket 媒体处理对象文件所在的 *Bucket ID*
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set 媒体处理对象文件所在的 *Bucket ID*
     * @param Bucket 媒体处理对象文件所在的 *Bucket ID*
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get 媒体处理对象文件所在的 Bucket 所属园区 
     * @return Region 媒体处理对象文件所在的 Bucket 所属园区
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 媒体处理对象文件所在的 Bucket 所属园区
     * @param Region 媒体处理对象文件所在的 Bucket 所属园区
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 媒体处理对象文件的输入路径 
     * @return Object 媒体处理对象文件的输入路径
     */
    public String getObject() {
        return this.Object;
    }

    /**
     * Set 媒体处理对象文件的输入路径
     * @param Object 媒体处理对象文件的输入路径
     */
    public void setObject(String Object) {
        this.Object = Object;
    }

    /**
     * Get 点播专业版应用Id 
     * @return SubAppId 点播专业版应用Id
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 点播专业版应用Id
     * @param SubAppId 点播专业版应用Id
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    public VODInputInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VODInputInfo(VODInputInfo source) {
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Object != null) {
            this.Object = new String(source.Object);
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
        this.setParamSimple(map, prefix + "Object", this.Object);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

