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
    * <p>媒体处理对象文件所在的 <em>Bucket ID</em></p>
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * <p>媒体处理对象文件所在的 Bucket 所属园区</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>媒体处理对象文件的输入路径</p>
    */
    @SerializedName("Object")
    @Expose
    private String Object;

    /**
    * <p>点播应用Id。</p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>是否使用VOD标准版。<br>注意：不填表示使用VOD专业版。</p><p>枚举值：</p><ul><li>0： 使用VOD专业版</li><li>1： 使用VOD标准版，可使用FileId发起任务</li></ul><p>默认值：0</p>
    */
    @SerializedName("VodBasic")
    @Expose
    private Long VodBasic;

    /**
    * <p>VOD标准版FileId</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
     * Get <p>媒体处理对象文件所在的 <em>Bucket ID</em></p> 
     * @return Bucket <p>媒体处理对象文件所在的 <em>Bucket ID</em></p>
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set <p>媒体处理对象文件所在的 <em>Bucket ID</em></p>
     * @param Bucket <p>媒体处理对象文件所在的 <em>Bucket ID</em></p>
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get <p>媒体处理对象文件所在的 Bucket 所属园区</p> 
     * @return Region <p>媒体处理对象文件所在的 Bucket 所属园区</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>媒体处理对象文件所在的 Bucket 所属园区</p>
     * @param Region <p>媒体处理对象文件所在的 Bucket 所属园区</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>媒体处理对象文件的输入路径</p> 
     * @return Object <p>媒体处理对象文件的输入路径</p>
     */
    public String getObject() {
        return this.Object;
    }

    /**
     * Set <p>媒体处理对象文件的输入路径</p>
     * @param Object <p>媒体处理对象文件的输入路径</p>
     */
    public void setObject(String Object) {
        this.Object = Object;
    }

    /**
     * Get <p>点播应用Id。</p> 
     * @return SubAppId <p>点播应用Id。</p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p>点播应用Id。</p>
     * @param SubAppId <p>点播应用Id。</p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>是否使用VOD标准版。<br>注意：不填表示使用VOD专业版。</p><p>枚举值：</p><ul><li>0： 使用VOD专业版</li><li>1： 使用VOD标准版，可使用FileId发起任务</li></ul><p>默认值：0</p> 
     * @return VodBasic <p>是否使用VOD标准版。<br>注意：不填表示使用VOD专业版。</p><p>枚举值：</p><ul><li>0： 使用VOD专业版</li><li>1： 使用VOD标准版，可使用FileId发起任务</li></ul><p>默认值：0</p>
     */
    public Long getVodBasic() {
        return this.VodBasic;
    }

    /**
     * Set <p>是否使用VOD标准版。<br>注意：不填表示使用VOD专业版。</p><p>枚举值：</p><ul><li>0： 使用VOD专业版</li><li>1： 使用VOD标准版，可使用FileId发起任务</li></ul><p>默认值：0</p>
     * @param VodBasic <p>是否使用VOD标准版。<br>注意：不填表示使用VOD专业版。</p><p>枚举值：</p><ul><li>0： 使用VOD专业版</li><li>1： 使用VOD标准版，可使用FileId发起任务</li></ul><p>默认值：0</p>
     */
    public void setVodBasic(Long VodBasic) {
        this.VodBasic = VodBasic;
    }

    /**
     * Get <p>VOD标准版FileId</p> 
     * @return FileId <p>VOD标准版FileId</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>VOD标准版FileId</p>
     * @param FileId <p>VOD标准版FileId</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
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
        if (source.VodBasic != null) {
            this.VodBasic = new Long(source.VodBasic);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
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
        this.setParamSimple(map, prefix + "VodBasic", this.VodBasic);
        this.setParamSimple(map, prefix + "FileId", this.FileId);

    }
}

