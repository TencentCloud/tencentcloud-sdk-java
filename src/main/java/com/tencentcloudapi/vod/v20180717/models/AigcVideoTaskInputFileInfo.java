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

public class AigcVideoTaskInputFileInfo extends AbstractModel {

    /**
    * <p>输入的视频文件类型。取值有： <li>File：点播媒体文件；</li> <li>Url：可访问的 Url；</li></p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>文件分类。取值为：</p><ul><li>Image: 图片；<strong>注意，要使用Usage字段定义图片类型</strong>。</li><li>Video: 视频。</li></ul>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * <p>媒体文件 ID，即该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 <a href="/document/product/266/7830">视频上传完成事件通知</a> 或 <a href="https://console.cloud.tencent.com/vod/media">云点播控制台</a> 获取该字段。当 Type 取值为 File 时，本参数有效。说明：</p><ol><li>推荐使用小于10M的图片；</li><li>图片格式的取值为：jpeg，jpg, png。</li></ol>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * <p>可访问的文件 URL。当 Type 取值为 Url 时，本参数有效。<br>说明：</p><ol><li>推荐使用小于10M的图片；</li><li>图片格式的取值为：jpeg，jpg, png。</li></ol>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>参考类型，GV模型适用。<br>注意：<br>当使用 GV 模型时，可作为参考方式，可选值：asset 表示素材、style 表示风格；<br>当使用 Kling 模型以及 Category 为 Video 时，可区分参考视频类型，feature 表示特征参考视频，base 表示待编辑视频。</p>
    */
    @SerializedName("ReferenceType")
    @Expose
    private String ReferenceType;

    /**
    * <p>用法：Vidu主体Id。<br>Vidu主体Id：prompt可以通过 @主体Id 的方式使用。当 Category 为 Image 时有效。</p>
    */
    @SerializedName("ObjectId")
    @Expose
    private String ObjectId;

    /**
    * <p>适用于 Vidu-q2 模型。<br>当全部图片携带主体 Id 时，可针对主体设置音色 Id。 当 Category 为 Image 时有效。音色列表：https://shengshu.feishu.cn/sheets/EgFvs6DShhiEBStmjzccr5gonOg</p>
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * <p>是否保留视频原声。当 Category 为 Video 时有效。取值如下：</p><li>Enabled：保留</li><li>Disabled：不保留</li>
    */
    @SerializedName("KeepOriginalSound")
    @Expose
    private String KeepOriginalSound;

    /**
    * <p>用于区分输入是首帧或参考帧。可选值：</p><ul><li>FirstFrame：首帧；</li><li>Reference：参考帧；</li></ul><p><strong>注意，默认是FirstFrame</strong></p>
    */
    @SerializedName("Usage")
    @Expose
    private String Usage;

    /**
     * Get <p>输入的视频文件类型。取值有： <li>File：点播媒体文件；</li> <li>Url：可访问的 Url；</li></p> 
     * @return Type <p>输入的视频文件类型。取值有： <li>File：点播媒体文件；</li> <li>Url：可访问的 Url；</li></p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>输入的视频文件类型。取值有： <li>File：点播媒体文件；</li> <li>Url：可访问的 Url；</li></p>
     * @param Type <p>输入的视频文件类型。取值有： <li>File：点播媒体文件；</li> <li>Url：可访问的 Url；</li></p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>文件分类。取值为：</p><ul><li>Image: 图片；<strong>注意，要使用Usage字段定义图片类型</strong>。</li><li>Video: 视频。</li></ul> 
     * @return Category <p>文件分类。取值为：</p><ul><li>Image: 图片；<strong>注意，要使用Usage字段定义图片类型</strong>。</li><li>Video: 视频。</li></ul>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set <p>文件分类。取值为：</p><ul><li>Image: 图片；<strong>注意，要使用Usage字段定义图片类型</strong>。</li><li>Video: 视频。</li></ul>
     * @param Category <p>文件分类。取值为：</p><ul><li>Image: 图片；<strong>注意，要使用Usage字段定义图片类型</strong>。</li><li>Video: 视频。</li></ul>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get <p>媒体文件 ID，即该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 <a href="/document/product/266/7830">视频上传完成事件通知</a> 或 <a href="https://console.cloud.tencent.com/vod/media">云点播控制台</a> 获取该字段。当 Type 取值为 File 时，本参数有效。说明：</p><ol><li>推荐使用小于10M的图片；</li><li>图片格式的取值为：jpeg，jpg, png。</li></ol> 
     * @return FileId <p>媒体文件 ID，即该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 <a href="/document/product/266/7830">视频上传完成事件通知</a> 或 <a href="https://console.cloud.tencent.com/vod/media">云点播控制台</a> 获取该字段。当 Type 取值为 File 时，本参数有效。说明：</p><ol><li>推荐使用小于10M的图片；</li><li>图片格式的取值为：jpeg，jpg, png。</li></ol>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>媒体文件 ID，即该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 <a href="/document/product/266/7830">视频上传完成事件通知</a> 或 <a href="https://console.cloud.tencent.com/vod/media">云点播控制台</a> 获取该字段。当 Type 取值为 File 时，本参数有效。说明：</p><ol><li>推荐使用小于10M的图片；</li><li>图片格式的取值为：jpeg，jpg, png。</li></ol>
     * @param FileId <p>媒体文件 ID，即该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 <a href="/document/product/266/7830">视频上传完成事件通知</a> 或 <a href="https://console.cloud.tencent.com/vod/media">云点播控制台</a> 获取该字段。当 Type 取值为 File 时，本参数有效。说明：</p><ol><li>推荐使用小于10M的图片；</li><li>图片格式的取值为：jpeg，jpg, png。</li></ol>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get <p>可访问的文件 URL。当 Type 取值为 Url 时，本参数有效。<br>说明：</p><ol><li>推荐使用小于10M的图片；</li><li>图片格式的取值为：jpeg，jpg, png。</li></ol> 
     * @return Url <p>可访问的文件 URL。当 Type 取值为 Url 时，本参数有效。<br>说明：</p><ol><li>推荐使用小于10M的图片；</li><li>图片格式的取值为：jpeg，jpg, png。</li></ol>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>可访问的文件 URL。当 Type 取值为 Url 时，本参数有效。<br>说明：</p><ol><li>推荐使用小于10M的图片；</li><li>图片格式的取值为：jpeg，jpg, png。</li></ol>
     * @param Url <p>可访问的文件 URL。当 Type 取值为 Url 时，本参数有效。<br>说明：</p><ol><li>推荐使用小于10M的图片；</li><li>图片格式的取值为：jpeg，jpg, png。</li></ol>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>参考类型，GV模型适用。<br>注意：<br>当使用 GV 模型时，可作为参考方式，可选值：asset 表示素材、style 表示风格；<br>当使用 Kling 模型以及 Category 为 Video 时，可区分参考视频类型，feature 表示特征参考视频，base 表示待编辑视频。</p> 
     * @return ReferenceType <p>参考类型，GV模型适用。<br>注意：<br>当使用 GV 模型时，可作为参考方式，可选值：asset 表示素材、style 表示风格；<br>当使用 Kling 模型以及 Category 为 Video 时，可区分参考视频类型，feature 表示特征参考视频，base 表示待编辑视频。</p>
     */
    public String getReferenceType() {
        return this.ReferenceType;
    }

    /**
     * Set <p>参考类型，GV模型适用。<br>注意：<br>当使用 GV 模型时，可作为参考方式，可选值：asset 表示素材、style 表示风格；<br>当使用 Kling 模型以及 Category 为 Video 时，可区分参考视频类型，feature 表示特征参考视频，base 表示待编辑视频。</p>
     * @param ReferenceType <p>参考类型，GV模型适用。<br>注意：<br>当使用 GV 模型时，可作为参考方式，可选值：asset 表示素材、style 表示风格；<br>当使用 Kling 模型以及 Category 为 Video 时，可区分参考视频类型，feature 表示特征参考视频，base 表示待编辑视频。</p>
     */
    public void setReferenceType(String ReferenceType) {
        this.ReferenceType = ReferenceType;
    }

    /**
     * Get <p>用法：Vidu主体Id。<br>Vidu主体Id：prompt可以通过 @主体Id 的方式使用。当 Category 为 Image 时有效。</p> 
     * @return ObjectId <p>用法：Vidu主体Id。<br>Vidu主体Id：prompt可以通过 @主体Id 的方式使用。当 Category 为 Image 时有效。</p>
     */
    public String getObjectId() {
        return this.ObjectId;
    }

    /**
     * Set <p>用法：Vidu主体Id。<br>Vidu主体Id：prompt可以通过 @主体Id 的方式使用。当 Category 为 Image 时有效。</p>
     * @param ObjectId <p>用法：Vidu主体Id。<br>Vidu主体Id：prompt可以通过 @主体Id 的方式使用。当 Category 为 Image 时有效。</p>
     */
    public void setObjectId(String ObjectId) {
        this.ObjectId = ObjectId;
    }

    /**
     * Get <p>适用于 Vidu-q2 模型。<br>当全部图片携带主体 Id 时，可针对主体设置音色 Id。 当 Category 为 Image 时有效。音色列表：https://shengshu.feishu.cn/sheets/EgFvs6DShhiEBStmjzccr5gonOg</p> 
     * @return VoiceId <p>适用于 Vidu-q2 模型。<br>当全部图片携带主体 Id 时，可针对主体设置音色 Id。 当 Category 为 Image 时有效。音色列表：https://shengshu.feishu.cn/sheets/EgFvs6DShhiEBStmjzccr5gonOg</p>
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set <p>适用于 Vidu-q2 模型。<br>当全部图片携带主体 Id 时，可针对主体设置音色 Id。 当 Category 为 Image 时有效。音色列表：https://shengshu.feishu.cn/sheets/EgFvs6DShhiEBStmjzccr5gonOg</p>
     * @param VoiceId <p>适用于 Vidu-q2 模型。<br>当全部图片携带主体 Id 时，可针对主体设置音色 Id。 当 Category 为 Image 时有效。音色列表：https://shengshu.feishu.cn/sheets/EgFvs6DShhiEBStmjzccr5gonOg</p>
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * Get <p>是否保留视频原声。当 Category 为 Video 时有效。取值如下：</p><li>Enabled：保留</li><li>Disabled：不保留</li> 
     * @return KeepOriginalSound <p>是否保留视频原声。当 Category 为 Video 时有效。取值如下：</p><li>Enabled：保留</li><li>Disabled：不保留</li>
     */
    public String getKeepOriginalSound() {
        return this.KeepOriginalSound;
    }

    /**
     * Set <p>是否保留视频原声。当 Category 为 Video 时有效。取值如下：</p><li>Enabled：保留</li><li>Disabled：不保留</li>
     * @param KeepOriginalSound <p>是否保留视频原声。当 Category 为 Video 时有效。取值如下：</p><li>Enabled：保留</li><li>Disabled：不保留</li>
     */
    public void setKeepOriginalSound(String KeepOriginalSound) {
        this.KeepOriginalSound = KeepOriginalSound;
    }

    /**
     * Get <p>用于区分输入是首帧或参考帧。可选值：</p><ul><li>FirstFrame：首帧；</li><li>Reference：参考帧；</li></ul><p><strong>注意，默认是FirstFrame</strong></p> 
     * @return Usage <p>用于区分输入是首帧或参考帧。可选值：</p><ul><li>FirstFrame：首帧；</li><li>Reference：参考帧；</li></ul><p><strong>注意，默认是FirstFrame</strong></p>
     */
    public String getUsage() {
        return this.Usage;
    }

    /**
     * Set <p>用于区分输入是首帧或参考帧。可选值：</p><ul><li>FirstFrame：首帧；</li><li>Reference：参考帧；</li></ul><p><strong>注意，默认是FirstFrame</strong></p>
     * @param Usage <p>用于区分输入是首帧或参考帧。可选值：</p><ul><li>FirstFrame：首帧；</li><li>Reference：参考帧；</li></ul><p><strong>注意，默认是FirstFrame</strong></p>
     */
    public void setUsage(String Usage) {
        this.Usage = Usage;
    }

    public AigcVideoTaskInputFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcVideoTaskInputFileInfo(AigcVideoTaskInputFileInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.ReferenceType != null) {
            this.ReferenceType = new String(source.ReferenceType);
        }
        if (source.ObjectId != null) {
            this.ObjectId = new String(source.ObjectId);
        }
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
        if (source.KeepOriginalSound != null) {
            this.KeepOriginalSound = new String(source.KeepOriginalSound);
        }
        if (source.Usage != null) {
            this.Usage = new String(source.Usage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "ReferenceType", this.ReferenceType);
        this.setParamSimple(map, prefix + "ObjectId", this.ObjectId);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamSimple(map, prefix + "KeepOriginalSound", this.KeepOriginalSound);
        this.setParamSimple(map, prefix + "Usage", this.Usage);

    }
}

