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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListFilesRequest extends AbstractModel {

    /**
    * 点播[应用](/document/product/266/14574) ID。
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 对象键匹配前缀，限定响应中只包含指定前缀的对象键。
    */
    @SerializedName("Prefix")
    @Expose
    private String Prefix;

    /**
    * 一个字符的分隔符，用于对对象键进行分组。所有对象键中从 prefix 或从头（如未指定 prefix）到首个 delimiter 之间相同的部分将作为 CommonPrefixes 下的一个 Prefix 节点。被分组的对象键不再出现在后续对象列表中。
    */
    @SerializedName("Delimiter")
    @Expose
    private String Delimiter;

    /**
    * ys 	 单次返回最大的条目数量，默认值为100，最小为1，最大为100。
    */
    @SerializedName("MaxKeys")
    @Expose
    private Long MaxKeys;

    /**
    * 起始对象键标记
    */
    @SerializedName("Marker")
    @Expose
    private String Marker;

    /**
    * 文件类型。匹配集合中的任意元素： <li>Video: 视频文件</li> <li>Audio: 音频文件</li> <li>Image: 图片文件</li>
    */
    @SerializedName("Categories")
    @Expose
    private String [] Categories;

    /**
     * Get 点播[应用](/document/product/266/14574) ID。 
     * @return SubAppId 点播[应用](/document/product/266/14574) ID。
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 点播[应用](/document/product/266/14574) ID。
     * @param SubAppId 点播[应用](/document/product/266/14574) ID。
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 对象键匹配前缀，限定响应中只包含指定前缀的对象键。 
     * @return Prefix 对象键匹配前缀，限定响应中只包含指定前缀的对象键。
     */
    public String getPrefix() {
        return this.Prefix;
    }

    /**
     * Set 对象键匹配前缀，限定响应中只包含指定前缀的对象键。
     * @param Prefix 对象键匹配前缀，限定响应中只包含指定前缀的对象键。
     */
    public void setPrefix(String Prefix) {
        this.Prefix = Prefix;
    }

    /**
     * Get 一个字符的分隔符，用于对对象键进行分组。所有对象键中从 prefix 或从头（如未指定 prefix）到首个 delimiter 之间相同的部分将作为 CommonPrefixes 下的一个 Prefix 节点。被分组的对象键不再出现在后续对象列表中。 
     * @return Delimiter 一个字符的分隔符，用于对对象键进行分组。所有对象键中从 prefix 或从头（如未指定 prefix）到首个 delimiter 之间相同的部分将作为 CommonPrefixes 下的一个 Prefix 节点。被分组的对象键不再出现在后续对象列表中。
     */
    public String getDelimiter() {
        return this.Delimiter;
    }

    /**
     * Set 一个字符的分隔符，用于对对象键进行分组。所有对象键中从 prefix 或从头（如未指定 prefix）到首个 delimiter 之间相同的部分将作为 CommonPrefixes 下的一个 Prefix 节点。被分组的对象键不再出现在后续对象列表中。
     * @param Delimiter 一个字符的分隔符，用于对对象键进行分组。所有对象键中从 prefix 或从头（如未指定 prefix）到首个 delimiter 之间相同的部分将作为 CommonPrefixes 下的一个 Prefix 节点。被分组的对象键不再出现在后续对象列表中。
     */
    public void setDelimiter(String Delimiter) {
        this.Delimiter = Delimiter;
    }

    /**
     * Get ys 	 单次返回最大的条目数量，默认值为100，最小为1，最大为100。 
     * @return MaxKeys ys 	 单次返回最大的条目数量，默认值为100，最小为1，最大为100。
     */
    public Long getMaxKeys() {
        return this.MaxKeys;
    }

    /**
     * Set ys 	 单次返回最大的条目数量，默认值为100，最小为1，最大为100。
     * @param MaxKeys ys 	 单次返回最大的条目数量，默认值为100，最小为1，最大为100。
     */
    public void setMaxKeys(Long MaxKeys) {
        this.MaxKeys = MaxKeys;
    }

    /**
     * Get 起始对象键标记 
     * @return Marker 起始对象键标记
     */
    public String getMarker() {
        return this.Marker;
    }

    /**
     * Set 起始对象键标记
     * @param Marker 起始对象键标记
     */
    public void setMarker(String Marker) {
        this.Marker = Marker;
    }

    /**
     * Get 文件类型。匹配集合中的任意元素： <li>Video: 视频文件</li> <li>Audio: 音频文件</li> <li>Image: 图片文件</li> 
     * @return Categories 文件类型。匹配集合中的任意元素： <li>Video: 视频文件</li> <li>Audio: 音频文件</li> <li>Image: 图片文件</li>
     */
    public String [] getCategories() {
        return this.Categories;
    }

    /**
     * Set 文件类型。匹配集合中的任意元素： <li>Video: 视频文件</li> <li>Audio: 音频文件</li> <li>Image: 图片文件</li>
     * @param Categories 文件类型。匹配集合中的任意元素： <li>Video: 视频文件</li> <li>Audio: 音频文件</li> <li>Image: 图片文件</li>
     */
    public void setCategories(String [] Categories) {
        this.Categories = Categories;
    }

    public ListFilesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListFilesRequest(ListFilesRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Prefix != null) {
            this.Prefix = new String(source.Prefix);
        }
        if (source.Delimiter != null) {
            this.Delimiter = new String(source.Delimiter);
        }
        if (source.MaxKeys != null) {
            this.MaxKeys = new Long(source.MaxKeys);
        }
        if (source.Marker != null) {
            this.Marker = new String(source.Marker);
        }
        if (source.Categories != null) {
            this.Categories = new String[source.Categories.length];
            for (int i = 0; i < source.Categories.length; i++) {
                this.Categories[i] = new String(source.Categories[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Prefix", this.Prefix);
        this.setParamSimple(map, prefix + "Delimiter", this.Delimiter);
        this.setParamSimple(map, prefix + "MaxKeys", this.MaxKeys);
        this.setParamSimple(map, prefix + "Marker", this.Marker);
        this.setParamArraySimple(map, prefix + "Categories.", this.Categories);

    }
}

