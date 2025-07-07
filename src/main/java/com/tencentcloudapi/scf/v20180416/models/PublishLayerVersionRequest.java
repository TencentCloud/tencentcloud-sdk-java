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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PublishLayerVersionRequest extends AbstractModel {

    /**
    * 层名称，支持26个英文字母大小写、数字、连接符和下划线，第一个字符只能以字母开头，最后一个字符不能为连接符或者下划线，名称长度1-64
    */
    @SerializedName("LayerName")
    @Expose
    private String LayerName;

    /**
    * 层适用的运行时，可多选，可选的值对应函数的 Runtime 可选值。
    */
    @SerializedName("CompatibleRuntimes")
    @Expose
    private String [] CompatibleRuntimes;

    /**
    * 层的文件来源或文件内容
    */
    @SerializedName("Content")
    @Expose
    private Code Content;

    /**
    * 层的版本的描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 层的软件许可证
    */
    @SerializedName("LicenseInfo")
    @Expose
    private String LicenseInfo;

    /**
    * 层Tag 参数，以键值对数组形式传入
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get 层名称，支持26个英文字母大小写、数字、连接符和下划线，第一个字符只能以字母开头，最后一个字符不能为连接符或者下划线，名称长度1-64 
     * @return LayerName 层名称，支持26个英文字母大小写、数字、连接符和下划线，第一个字符只能以字母开头，最后一个字符不能为连接符或者下划线，名称长度1-64
     */
    public String getLayerName() {
        return this.LayerName;
    }

    /**
     * Set 层名称，支持26个英文字母大小写、数字、连接符和下划线，第一个字符只能以字母开头，最后一个字符不能为连接符或者下划线，名称长度1-64
     * @param LayerName 层名称，支持26个英文字母大小写、数字、连接符和下划线，第一个字符只能以字母开头，最后一个字符不能为连接符或者下划线，名称长度1-64
     */
    public void setLayerName(String LayerName) {
        this.LayerName = LayerName;
    }

    /**
     * Get 层适用的运行时，可多选，可选的值对应函数的 Runtime 可选值。 
     * @return CompatibleRuntimes 层适用的运行时，可多选，可选的值对应函数的 Runtime 可选值。
     */
    public String [] getCompatibleRuntimes() {
        return this.CompatibleRuntimes;
    }

    /**
     * Set 层适用的运行时，可多选，可选的值对应函数的 Runtime 可选值。
     * @param CompatibleRuntimes 层适用的运行时，可多选，可选的值对应函数的 Runtime 可选值。
     */
    public void setCompatibleRuntimes(String [] CompatibleRuntimes) {
        this.CompatibleRuntimes = CompatibleRuntimes;
    }

    /**
     * Get 层的文件来源或文件内容 
     * @return Content 层的文件来源或文件内容
     */
    public Code getContent() {
        return this.Content;
    }

    /**
     * Set 层的文件来源或文件内容
     * @param Content 层的文件来源或文件内容
     */
    public void setContent(Code Content) {
        this.Content = Content;
    }

    /**
     * Get 层的版本的描述 
     * @return Description 层的版本的描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 层的版本的描述
     * @param Description 层的版本的描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 层的软件许可证 
     * @return LicenseInfo 层的软件许可证
     */
    public String getLicenseInfo() {
        return this.LicenseInfo;
    }

    /**
     * Set 层的软件许可证
     * @param LicenseInfo 层的软件许可证
     */
    public void setLicenseInfo(String LicenseInfo) {
        this.LicenseInfo = LicenseInfo;
    }

    /**
     * Get 层Tag 参数，以键值对数组形式传入 
     * @return Tags 层Tag 参数，以键值对数组形式传入
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 层Tag 参数，以键值对数组形式传入
     * @param Tags 层Tag 参数，以键值对数组形式传入
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public PublishLayerVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PublishLayerVersionRequest(PublishLayerVersionRequest source) {
        if (source.LayerName != null) {
            this.LayerName = new String(source.LayerName);
        }
        if (source.CompatibleRuntimes != null) {
            this.CompatibleRuntimes = new String[source.CompatibleRuntimes.length];
            for (int i = 0; i < source.CompatibleRuntimes.length; i++) {
                this.CompatibleRuntimes[i] = new String(source.CompatibleRuntimes[i]);
            }
        }
        if (source.Content != null) {
            this.Content = new Code(source.Content);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.LicenseInfo != null) {
            this.LicenseInfo = new String(source.LicenseInfo);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LayerName", this.LayerName);
        this.setParamArraySimple(map, prefix + "CompatibleRuntimes.", this.CompatibleRuntimes);
        this.setParamObj(map, prefix + "Content.", this.Content);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "LicenseInfo", this.LicenseInfo);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

