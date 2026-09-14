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

public class SeeObjectListing extends AbstractModel {

    /**
    * <p>对象列表</p>
    */
    @SerializedName("Contents")
    @Expose
    private SeeObjectSummary [] Contents;

    /**
    * <p>子目录路径列表</p>
    */
    @SerializedName("CommonPrefixes")
    @Expose
    private String [] CommonPrefixes;

    /**
    * <p>本次列举使用的目录分隔符</p>
    */
    @SerializedName("Delimiter")
    @Expose
    private String Delimiter;

    /**
    * <p>是否还有后续分页数据</p>
    */
    @SerializedName("IsTruncated")
    @Expose
    private Boolean IsTruncated;

    /**
    * <p>本次列举使用的分页标记</p>
    */
    @SerializedName("Marker")
    @Expose
    private String Marker;

    /**
    * <p>本次列举的最大对象数量</p>
    */
    @SerializedName("MaxKeys")
    @Expose
    private Long MaxKeys;

    /**
    * <p>下一页的分页标记</p>
    */
    @SerializedName("NextMarker")
    @Expose
    private String NextMarker;

    /**
    * <p>本次列举的对象路径前缀</p>
    */
    @SerializedName("Prefix")
    @Expose
    private String Prefix;

    /**
     * Get <p>对象列表</p> 
     * @return Contents <p>对象列表</p>
     */
    public SeeObjectSummary [] getContents() {
        return this.Contents;
    }

    /**
     * Set <p>对象列表</p>
     * @param Contents <p>对象列表</p>
     */
    public void setContents(SeeObjectSummary [] Contents) {
        this.Contents = Contents;
    }

    /**
     * Get <p>子目录路径列表</p> 
     * @return CommonPrefixes <p>子目录路径列表</p>
     */
    public String [] getCommonPrefixes() {
        return this.CommonPrefixes;
    }

    /**
     * Set <p>子目录路径列表</p>
     * @param CommonPrefixes <p>子目录路径列表</p>
     */
    public void setCommonPrefixes(String [] CommonPrefixes) {
        this.CommonPrefixes = CommonPrefixes;
    }

    /**
     * Get <p>本次列举使用的目录分隔符</p> 
     * @return Delimiter <p>本次列举使用的目录分隔符</p>
     */
    public String getDelimiter() {
        return this.Delimiter;
    }

    /**
     * Set <p>本次列举使用的目录分隔符</p>
     * @param Delimiter <p>本次列举使用的目录分隔符</p>
     */
    public void setDelimiter(String Delimiter) {
        this.Delimiter = Delimiter;
    }

    /**
     * Get <p>是否还有后续分页数据</p> 
     * @return IsTruncated <p>是否还有后续分页数据</p>
     */
    public Boolean getIsTruncated() {
        return this.IsTruncated;
    }

    /**
     * Set <p>是否还有后续分页数据</p>
     * @param IsTruncated <p>是否还有后续分页数据</p>
     */
    public void setIsTruncated(Boolean IsTruncated) {
        this.IsTruncated = IsTruncated;
    }

    /**
     * Get <p>本次列举使用的分页标记</p> 
     * @return Marker <p>本次列举使用的分页标记</p>
     */
    public String getMarker() {
        return this.Marker;
    }

    /**
     * Set <p>本次列举使用的分页标记</p>
     * @param Marker <p>本次列举使用的分页标记</p>
     */
    public void setMarker(String Marker) {
        this.Marker = Marker;
    }

    /**
     * Get <p>本次列举的最大对象数量</p> 
     * @return MaxKeys <p>本次列举的最大对象数量</p>
     */
    public Long getMaxKeys() {
        return this.MaxKeys;
    }

    /**
     * Set <p>本次列举的最大对象数量</p>
     * @param MaxKeys <p>本次列举的最大对象数量</p>
     */
    public void setMaxKeys(Long MaxKeys) {
        this.MaxKeys = MaxKeys;
    }

    /**
     * Get <p>下一页的分页标记</p> 
     * @return NextMarker <p>下一页的分页标记</p>
     */
    public String getNextMarker() {
        return this.NextMarker;
    }

    /**
     * Set <p>下一页的分页标记</p>
     * @param NextMarker <p>下一页的分页标记</p>
     */
    public void setNextMarker(String NextMarker) {
        this.NextMarker = NextMarker;
    }

    /**
     * Get <p>本次列举的对象路径前缀</p> 
     * @return Prefix <p>本次列举的对象路径前缀</p>
     */
    public String getPrefix() {
        return this.Prefix;
    }

    /**
     * Set <p>本次列举的对象路径前缀</p>
     * @param Prefix <p>本次列举的对象路径前缀</p>
     */
    public void setPrefix(String Prefix) {
        this.Prefix = Prefix;
    }

    public SeeObjectListing() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SeeObjectListing(SeeObjectListing source) {
        if (source.Contents != null) {
            this.Contents = new SeeObjectSummary[source.Contents.length];
            for (int i = 0; i < source.Contents.length; i++) {
                this.Contents[i] = new SeeObjectSummary(source.Contents[i]);
            }
        }
        if (source.CommonPrefixes != null) {
            this.CommonPrefixes = new String[source.CommonPrefixes.length];
            for (int i = 0; i < source.CommonPrefixes.length; i++) {
                this.CommonPrefixes[i] = new String(source.CommonPrefixes[i]);
            }
        }
        if (source.Delimiter != null) {
            this.Delimiter = new String(source.Delimiter);
        }
        if (source.IsTruncated != null) {
            this.IsTruncated = new Boolean(source.IsTruncated);
        }
        if (source.Marker != null) {
            this.Marker = new String(source.Marker);
        }
        if (source.MaxKeys != null) {
            this.MaxKeys = new Long(source.MaxKeys);
        }
        if (source.NextMarker != null) {
            this.NextMarker = new String(source.NextMarker);
        }
        if (source.Prefix != null) {
            this.Prefix = new String(source.Prefix);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Contents.", this.Contents);
        this.setParamArraySimple(map, prefix + "CommonPrefixes.", this.CommonPrefixes);
        this.setParamSimple(map, prefix + "Delimiter", this.Delimiter);
        this.setParamSimple(map, prefix + "IsTruncated", this.IsTruncated);
        this.setParamSimple(map, prefix + "Marker", this.Marker);
        this.setParamSimple(map, prefix + "MaxKeys", this.MaxKeys);
        this.setParamSimple(map, prefix + "NextMarker", this.NextMarker);
        this.setParamSimple(map, prefix + "Prefix", this.Prefix);

    }
}

