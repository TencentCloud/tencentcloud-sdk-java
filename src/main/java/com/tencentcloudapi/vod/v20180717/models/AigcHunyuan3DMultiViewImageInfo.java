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

public class AigcHunyuan3DMultiViewImageInfo extends AbstractModel {

    /**
    * <p>输入的文件类型。取值有： <li>File：点播媒体文件；</li> <li>Url：可访问的 Url；</li></p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>文件 ID，即该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 <a href="/document/product/266/7830">视频上传完成事件通知</a> 或 <a href="https://console.cloud.tencent.com/vod/media">云点播控制台</a> 获取该字段。当 Type 取值为 File 时，本参数有效。说明：图片格式的取值为：支持 jpg、jpeg、png、bmp、webp。</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p>可访问的文件 URL。当 Type 取值为 Url 时，本参数有效。说明：图片格式的取值为：支持 jpg、jpeg、png、bmp、webp。</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>视角图片类型。</p><p>枚举值：</p><ul><li><p>front： 正视图 （必填）</p></li><li><p>back： 背视图</p></li><li><p>left： 左视图</p></li><li><p>right： 右视图</p></li><li><p>top： 顶视图</p></li><li><p>bottom： 底视图</p></li><li><p>left_front： 左前 45°</p></li><li><p>right_front： 右前 45°</p></li><li><p>必须包含 front 视角；</p></li><li><p>同一 ViewType 不允许重复。</p></li></ul>
    */
    @SerializedName("ViewType")
    @Expose
    private String ViewType;

    /**
     * Get <p>输入的文件类型。取值有： <li>File：点播媒体文件；</li> <li>Url：可访问的 Url；</li></p> 
     * @return Type <p>输入的文件类型。取值有： <li>File：点播媒体文件；</li> <li>Url：可访问的 Url；</li></p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>输入的文件类型。取值有： <li>File：点播媒体文件；</li> <li>Url：可访问的 Url；</li></p>
     * @param Type <p>输入的文件类型。取值有： <li>File：点播媒体文件；</li> <li>Url：可访问的 Url；</li></p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>文件 ID，即该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 <a href="/document/product/266/7830">视频上传完成事件通知</a> 或 <a href="https://console.cloud.tencent.com/vod/media">云点播控制台</a> 获取该字段。当 Type 取值为 File 时，本参数有效。说明：图片格式的取值为：支持 jpg、jpeg、png、bmp、webp。</p> 
     * @return FileId <p>文件 ID，即该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 <a href="/document/product/266/7830">视频上传完成事件通知</a> 或 <a href="https://console.cloud.tencent.com/vod/media">云点播控制台</a> 获取该字段。当 Type 取值为 File 时，本参数有效。说明：图片格式的取值为：支持 jpg、jpeg、png、bmp、webp。</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>文件 ID，即该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 <a href="/document/product/266/7830">视频上传完成事件通知</a> 或 <a href="https://console.cloud.tencent.com/vod/media">云点播控制台</a> 获取该字段。当 Type 取值为 File 时，本参数有效。说明：图片格式的取值为：支持 jpg、jpeg、png、bmp、webp。</p>
     * @param FileId <p>文件 ID，即该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 <a href="/document/product/266/7830">视频上传完成事件通知</a> 或 <a href="https://console.cloud.tencent.com/vod/media">云点播控制台</a> 获取该字段。当 Type 取值为 File 时，本参数有效。说明：图片格式的取值为：支持 jpg、jpeg、png、bmp、webp。</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <p>可访问的文件 URL。当 Type 取值为 Url 时，本参数有效。说明：图片格式的取值为：支持 jpg、jpeg、png、bmp、webp。</p> 
     * @return Url <p>可访问的文件 URL。当 Type 取值为 Url 时，本参数有效。说明：图片格式的取值为：支持 jpg、jpeg、png、bmp、webp。</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>可访问的文件 URL。当 Type 取值为 Url 时，本参数有效。说明：图片格式的取值为：支持 jpg、jpeg、png、bmp、webp。</p>
     * @param Url <p>可访问的文件 URL。当 Type 取值为 Url 时，本参数有效。说明：图片格式的取值为：支持 jpg、jpeg、png、bmp、webp。</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>视角图片类型。</p><p>枚举值：</p><ul><li><p>front： 正视图 （必填）</p></li><li><p>back： 背视图</p></li><li><p>left： 左视图</p></li><li><p>right： 右视图</p></li><li><p>top： 顶视图</p></li><li><p>bottom： 底视图</p></li><li><p>left_front： 左前 45°</p></li><li><p>right_front： 右前 45°</p></li><li><p>必须包含 front 视角；</p></li><li><p>同一 ViewType 不允许重复。</p></li></ul> 
     * @return ViewType <p>视角图片类型。</p><p>枚举值：</p><ul><li><p>front： 正视图 （必填）</p></li><li><p>back： 背视图</p></li><li><p>left： 左视图</p></li><li><p>right： 右视图</p></li><li><p>top： 顶视图</p></li><li><p>bottom： 底视图</p></li><li><p>left_front： 左前 45°</p></li><li><p>right_front： 右前 45°</p></li><li><p>必须包含 front 视角；</p></li><li><p>同一 ViewType 不允许重复。</p></li></ul>
     */
    public String getViewType() {
        return this.ViewType;
    }

    /**
     * Set <p>视角图片类型。</p><p>枚举值：</p><ul><li><p>front： 正视图 （必填）</p></li><li><p>back： 背视图</p></li><li><p>left： 左视图</p></li><li><p>right： 右视图</p></li><li><p>top： 顶视图</p></li><li><p>bottom： 底视图</p></li><li><p>left_front： 左前 45°</p></li><li><p>right_front： 右前 45°</p></li><li><p>必须包含 front 视角；</p></li><li><p>同一 ViewType 不允许重复。</p></li></ul>
     * @param ViewType <p>视角图片类型。</p><p>枚举值：</p><ul><li><p>front： 正视图 （必填）</p></li><li><p>back： 背视图</p></li><li><p>left： 左视图</p></li><li><p>right： 右视图</p></li><li><p>top： 顶视图</p></li><li><p>bottom： 底视图</p></li><li><p>left_front： 左前 45°</p></li><li><p>right_front： 右前 45°</p></li><li><p>必须包含 front 视角；</p></li><li><p>同一 ViewType 不允许重复。</p></li></ul>
     */
    public void setViewType(String ViewType) {
        this.ViewType = ViewType;
    }

    public AigcHunyuan3DMultiViewImageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcHunyuan3DMultiViewImageInfo(AigcHunyuan3DMultiViewImageInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.ViewType != null) {
            this.ViewType = new String(source.ViewType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "ViewType", this.ViewType);

    }
}

