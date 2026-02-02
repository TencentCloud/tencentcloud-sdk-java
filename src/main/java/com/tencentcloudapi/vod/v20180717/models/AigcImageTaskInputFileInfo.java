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
    * 输入的视频文件类型。取值有： <li>File：点播媒体文件；</li> <li>Url：可访问的 Url；</li> 
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 图片文件的媒体文件 ID，即该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 [视频上传完成事件通知](/document/product/266/7830) 或 [云点播控制台](https://console.cloud.tencent.com/vod/media) 获取该字段。当 Type 取值为 File 时，本参数有效。
说明：
1. 推荐使用小于7M的图片；
2. 图片格式的取值为：jpeg，jpg, png, webp。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 可访问的文件 URL。当 Type 取值为 Url 时，本参数有效。
说明：
1. 推荐使用小于7M的图片；
2. 图片格式的取值为：jpeg，jpg, png, webp。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 输入图片的描述信息，用于帮助模型理解图片。仅GEM 2.5、GEM 3.0 有效。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
     * Get 输入的视频文件类型。取值有： <li>File：点播媒体文件；</li> <li>Url：可访问的 Url；</li>  
     * @return Type 输入的视频文件类型。取值有： <li>File：点播媒体文件；</li> <li>Url：可访问的 Url；</li> 
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 输入的视频文件类型。取值有： <li>File：点播媒体文件；</li> <li>Url：可访问的 Url；</li> 
     * @param Type 输入的视频文件类型。取值有： <li>File：点播媒体文件；</li> <li>Url：可访问的 Url；</li> 
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 图片文件的媒体文件 ID，即该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 [视频上传完成事件通知](/document/product/266/7830) 或 [云点播控制台](https://console.cloud.tencent.com/vod/media) 获取该字段。当 Type 取值为 File 时，本参数有效。
说明：
1. 推荐使用小于7M的图片；
2. 图片格式的取值为：jpeg，jpg, png, webp。 
     * @return FileId 图片文件的媒体文件 ID，即该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 [视频上传完成事件通知](/document/product/266/7830) 或 [云点播控制台](https://console.cloud.tencent.com/vod/media) 获取该字段。当 Type 取值为 File 时，本参数有效。
说明：
1. 推荐使用小于7M的图片；
2. 图片格式的取值为：jpeg，jpg, png, webp。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 图片文件的媒体文件 ID，即该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 [视频上传完成事件通知](/document/product/266/7830) 或 [云点播控制台](https://console.cloud.tencent.com/vod/media) 获取该字段。当 Type 取值为 File 时，本参数有效。
说明：
1. 推荐使用小于7M的图片；
2. 图片格式的取值为：jpeg，jpg, png, webp。
     * @param FileId 图片文件的媒体文件 ID，即该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 [视频上传完成事件通知](/document/product/266/7830) 或 [云点播控制台](https://console.cloud.tencent.com/vod/media) 获取该字段。当 Type 取值为 File 时，本参数有效。
说明：
1. 推荐使用小于7M的图片；
2. 图片格式的取值为：jpeg，jpg, png, webp。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get 可访问的文件 URL。当 Type 取值为 Url 时，本参数有效。
说明：
1. 推荐使用小于7M的图片；
2. 图片格式的取值为：jpeg，jpg, png, webp。 
     * @return Url 可访问的文件 URL。当 Type 取值为 Url 时，本参数有效。
说明：
1. 推荐使用小于7M的图片；
2. 图片格式的取值为：jpeg，jpg, png, webp。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 可访问的文件 URL。当 Type 取值为 Url 时，本参数有效。
说明：
1. 推荐使用小于7M的图片；
2. 图片格式的取值为：jpeg，jpg, png, webp。
     * @param Url 可访问的文件 URL。当 Type 取值为 Url 时，本参数有效。
说明：
1. 推荐使用小于7M的图片；
2. 图片格式的取值为：jpeg，jpg, png, webp。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 输入图片的描述信息，用于帮助模型理解图片。仅GEM 2.5、GEM 3.0 有效。 
     * @return Text 输入图片的描述信息，用于帮助模型理解图片。仅GEM 2.5、GEM 3.0 有效。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 输入图片的描述信息，用于帮助模型理解图片。仅GEM 2.5、GEM 3.0 有效。
     * @param Text 输入图片的描述信息，用于帮助模型理解图片。仅GEM 2.5、GEM 3.0 有效。
     */
    public void setText(String Text) {
        this.Text = Text;
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
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Text", this.Text);

    }
}

