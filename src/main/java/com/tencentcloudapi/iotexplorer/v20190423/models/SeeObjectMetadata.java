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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SeeObjectMetadata extends AbstractModel {

    /**
    * <p>对象 Key</p>
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * <p>对象的 COS URI</p>
    */
    @SerializedName("COSURI")
    @Expose
    private String COSURI;

    /**
    * <p>对象的 MIME 类型</p>
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
    * <p>对象大小，单位：字节</p>
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * <p>对象的 ETag</p>
    */
    @SerializedName("ETag")
    @Expose
    private String ETag;

    /**
    * <p>对象最后修改时间，秒级 UNIX 时间戳</p>
    */
    @SerializedName("LastModified")
    @Expose
    private Long LastModified;

    /**
    * <p>对象的自定义元数据列表</p>
    */
    @SerializedName("Metadata")
    @Expose
    private SeeObjectMetadataEntry [] Metadata;

    /**
     * Get <p>对象 Key</p> 
     * @return Key <p>对象 Key</p>
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set <p>对象 Key</p>
     * @param Key <p>对象 Key</p>
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get <p>对象的 COS URI</p> 
     * @return COSURI <p>对象的 COS URI</p>
     */
    public String getCOSURI() {
        return this.COSURI;
    }

    /**
     * Set <p>对象的 COS URI</p>
     * @param COSURI <p>对象的 COS URI</p>
     */
    public void setCOSURI(String COSURI) {
        this.COSURI = COSURI;
    }

    /**
     * Get <p>对象的 MIME 类型</p> 
     * @return ContentType <p>对象的 MIME 类型</p>
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set <p>对象的 MIME 类型</p>
     * @param ContentType <p>对象的 MIME 类型</p>
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get <p>对象大小，单位：字节</p> 
     * @return Size <p>对象大小，单位：字节</p>
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set <p>对象大小，单位：字节</p>
     * @param Size <p>对象大小，单位：字节</p>
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get <p>对象的 ETag</p> 
     * @return ETag <p>对象的 ETag</p>
     */
    public String getETag() {
        return this.ETag;
    }

    /**
     * Set <p>对象的 ETag</p>
     * @param ETag <p>对象的 ETag</p>
     */
    public void setETag(String ETag) {
        this.ETag = ETag;
    }

    /**
     * Get <p>对象最后修改时间，秒级 UNIX 时间戳</p> 
     * @return LastModified <p>对象最后修改时间，秒级 UNIX 时间戳</p>
     */
    public Long getLastModified() {
        return this.LastModified;
    }

    /**
     * Set <p>对象最后修改时间，秒级 UNIX 时间戳</p>
     * @param LastModified <p>对象最后修改时间，秒级 UNIX 时间戳</p>
     */
    public void setLastModified(Long LastModified) {
        this.LastModified = LastModified;
    }

    /**
     * Get <p>对象的自定义元数据列表</p> 
     * @return Metadata <p>对象的自定义元数据列表</p>
     */
    public SeeObjectMetadataEntry [] getMetadata() {
        return this.Metadata;
    }

    /**
     * Set <p>对象的自定义元数据列表</p>
     * @param Metadata <p>对象的自定义元数据列表</p>
     */
    public void setMetadata(SeeObjectMetadataEntry [] Metadata) {
        this.Metadata = Metadata;
    }

    public SeeObjectMetadata() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SeeObjectMetadata(SeeObjectMetadata source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.COSURI != null) {
            this.COSURI = new String(source.COSURI);
        }
        if (source.ContentType != null) {
            this.ContentType = new String(source.ContentType);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.ETag != null) {
            this.ETag = new String(source.ETag);
        }
        if (source.LastModified != null) {
            this.LastModified = new Long(source.LastModified);
        }
        if (source.Metadata != null) {
            this.Metadata = new SeeObjectMetadataEntry[source.Metadata.length];
            for (int i = 0; i < source.Metadata.length; i++) {
                this.Metadata[i] = new SeeObjectMetadataEntry(source.Metadata[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "COSURI", this.COSURI);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "ETag", this.ETag);
        this.setParamSimple(map, prefix + "LastModified", this.LastModified);
        this.setParamArrayObj(map, prefix + "Metadata.", this.Metadata);

    }
}

