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

public class AigcImageTaskInputFileInfo extends AbstractModel {

    /**
    * <p>输入的文件类型。取值有： <li>File：点播媒体文件；</li> <li>Url：可访问的 Url；</li>  <li>Base64：图片或视频转换的Base64字符串；</li></p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>图片文件的媒体文件 ID，即该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 <a href="/document/product/266/7830">视频上传完成事件通知</a> 或 <a href="https://console.cloud.tencent.com/vod/media">云点播控制台</a> 获取该字段。当 Type 取值为 File 时，本参数有效。<br>说明：</p><ol><li>推荐使用小于7M的图片；</li><li>图片格式的取值为：jpeg，jpg, png, webp。</li></ol>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p>可访问的文件 URL。当 Type 取值为 Url 时，本参数有效。<br>说明：</p><ol><li>推荐使用小于7M的图片；</li><li>图片格式的取值为：jpeg，jpg, png, webp。</li></ol>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>可访问的文件 Base64。当 Type 取值为 Base64 时，本参数有效。说明：</p><ol><li>所有文件的文件大小总和不能超过 7 MB，避免转为 Base64 后超出云 API 的 10 MB包大小上限；</li><li>图片格式应为：jpeg，jpg, png, webp；</li><li>不要有data:image/jpeg;base64,之类的前缀。</li></ol>
    */
    @SerializedName("Base64")
    @Expose
    private String Base64;

    /**
    * <p>输入图片的描述信息，用于帮助模型理解图片。仅GEM 2.5、GEM 3.0 有效。</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p><strong>仅当 ModelName 为 OG 时有效</strong>。图片类型。</p><p>枚举值：</p><ul><li>mask： 图片蒙版。</li></ul>
    */
    @SerializedName("ReferenceType")
    @Expose
    private String ReferenceType;

    /**
     * Get <p>输入的文件类型。取值有： <li>File：点播媒体文件；</li> <li>Url：可访问的 Url；</li>  <li>Base64：图片或视频转换的Base64字符串；</li></p> 
     * @return Type <p>输入的文件类型。取值有： <li>File：点播媒体文件；</li> <li>Url：可访问的 Url；</li>  <li>Base64：图片或视频转换的Base64字符串；</li></p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>输入的文件类型。取值有： <li>File：点播媒体文件；</li> <li>Url：可访问的 Url；</li>  <li>Base64：图片或视频转换的Base64字符串；</li></p>
     * @param Type <p>输入的文件类型。取值有： <li>File：点播媒体文件；</li> <li>Url：可访问的 Url；</li>  <li>Base64：图片或视频转换的Base64字符串；</li></p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>图片文件的媒体文件 ID，即该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 <a href="/document/product/266/7830">视频上传完成事件通知</a> 或 <a href="https://console.cloud.tencent.com/vod/media">云点播控制台</a> 获取该字段。当 Type 取值为 File 时，本参数有效。<br>说明：</p><ol><li>推荐使用小于7M的图片；</li><li>图片格式的取值为：jpeg，jpg, png, webp。</li></ol> 
     * @return FileId <p>图片文件的媒体文件 ID，即该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 <a href="/document/product/266/7830">视频上传完成事件通知</a> 或 <a href="https://console.cloud.tencent.com/vod/media">云点播控制台</a> 获取该字段。当 Type 取值为 File 时，本参数有效。<br>说明：</p><ol><li>推荐使用小于7M的图片；</li><li>图片格式的取值为：jpeg，jpg, png, webp。</li></ol>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>图片文件的媒体文件 ID，即该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 <a href="/document/product/266/7830">视频上传完成事件通知</a> 或 <a href="https://console.cloud.tencent.com/vod/media">云点播控制台</a> 获取该字段。当 Type 取值为 File 时，本参数有效。<br>说明：</p><ol><li>推荐使用小于7M的图片；</li><li>图片格式的取值为：jpeg，jpg, png, webp。</li></ol>
     * @param FileId <p>图片文件的媒体文件 ID，即该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 <a href="/document/product/266/7830">视频上传完成事件通知</a> 或 <a href="https://console.cloud.tencent.com/vod/media">云点播控制台</a> 获取该字段。当 Type 取值为 File 时，本参数有效。<br>说明：</p><ol><li>推荐使用小于7M的图片；</li><li>图片格式的取值为：jpeg，jpg, png, webp。</li></ol>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <p>可访问的文件 URL。当 Type 取值为 Url 时，本参数有效。<br>说明：</p><ol><li>推荐使用小于7M的图片；</li><li>图片格式的取值为：jpeg，jpg, png, webp。</li></ol> 
     * @return Url <p>可访问的文件 URL。当 Type 取值为 Url 时，本参数有效。<br>说明：</p><ol><li>推荐使用小于7M的图片；</li><li>图片格式的取值为：jpeg，jpg, png, webp。</li></ol>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>可访问的文件 URL。当 Type 取值为 Url 时，本参数有效。<br>说明：</p><ol><li>推荐使用小于7M的图片；</li><li>图片格式的取值为：jpeg，jpg, png, webp。</li></ol>
     * @param Url <p>可访问的文件 URL。当 Type 取值为 Url 时，本参数有效。<br>说明：</p><ol><li>推荐使用小于7M的图片；</li><li>图片格式的取值为：jpeg，jpg, png, webp。</li></ol>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>可访问的文件 Base64。当 Type 取值为 Base64 时，本参数有效。说明：</p><ol><li>所有文件的文件大小总和不能超过 7 MB，避免转为 Base64 后超出云 API 的 10 MB包大小上限；</li><li>图片格式应为：jpeg，jpg, png, webp；</li><li>不要有data:image/jpeg;base64,之类的前缀。</li></ol> 
     * @return Base64 <p>可访问的文件 Base64。当 Type 取值为 Base64 时，本参数有效。说明：</p><ol><li>所有文件的文件大小总和不能超过 7 MB，避免转为 Base64 后超出云 API 的 10 MB包大小上限；</li><li>图片格式应为：jpeg，jpg, png, webp；</li><li>不要有data:image/jpeg;base64,之类的前缀。</li></ol>
     */
    public String getBase64() {
        return this.Base64;
    }

    /**
     * Set <p>可访问的文件 Base64。当 Type 取值为 Base64 时，本参数有效。说明：</p><ol><li>所有文件的文件大小总和不能超过 7 MB，避免转为 Base64 后超出云 API 的 10 MB包大小上限；</li><li>图片格式应为：jpeg，jpg, png, webp；</li><li>不要有data:image/jpeg;base64,之类的前缀。</li></ol>
     * @param Base64 <p>可访问的文件 Base64。当 Type 取值为 Base64 时，本参数有效。说明：</p><ol><li>所有文件的文件大小总和不能超过 7 MB，避免转为 Base64 后超出云 API 的 10 MB包大小上限；</li><li>图片格式应为：jpeg，jpg, png, webp；</li><li>不要有data:image/jpeg;base64,之类的前缀。</li></ol>
     */
    public void setBase64(String Base64) {
        this.Base64 = Base64;
    }

    /**
     * Get <p>输入图片的描述信息，用于帮助模型理解图片。仅GEM 2.5、GEM 3.0 有效。</p> 
     * @return Text <p>输入图片的描述信息，用于帮助模型理解图片。仅GEM 2.5、GEM 3.0 有效。</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>输入图片的描述信息，用于帮助模型理解图片。仅GEM 2.5、GEM 3.0 有效。</p>
     * @param Text <p>输入图片的描述信息，用于帮助模型理解图片。仅GEM 2.5、GEM 3.0 有效。</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p><strong>仅当 ModelName 为 OG 时有效</strong>。图片类型。</p><p>枚举值：</p><ul><li>mask： 图片蒙版。</li></ul> 
     * @return ReferenceType <p><strong>仅当 ModelName 为 OG 时有效</strong>。图片类型。</p><p>枚举值：</p><ul><li>mask： 图片蒙版。</li></ul>
     */
    public String getReferenceType() {
        return this.ReferenceType;
    }

    /**
     * Set <p><strong>仅当 ModelName 为 OG 时有效</strong>。图片类型。</p><p>枚举值：</p><ul><li>mask： 图片蒙版。</li></ul>
     * @param ReferenceType <p><strong>仅当 ModelName 为 OG 时有效</strong>。图片类型。</p><p>枚举值：</p><ul><li>mask： 图片蒙版。</li></ul>
     */
    public void setReferenceType(String ReferenceType) {
        this.ReferenceType = ReferenceType;
    }

    public AigcImageTaskInputFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcImageTaskInputFileInfo(AigcImageTaskInputFileInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Base64 != null) {
            this.Base64 = new String(source.Base64);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.ReferenceType != null) {
            this.ReferenceType = new String(source.ReferenceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Base64", this.Base64);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "ReferenceType", this.ReferenceType);

    }
}

