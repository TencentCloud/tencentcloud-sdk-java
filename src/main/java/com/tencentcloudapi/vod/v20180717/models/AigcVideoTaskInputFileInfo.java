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
    * 输入的视频文件类型。取值有： <li>File：点播媒体文件；</li> <li>Url：可访问的 URL；</li> 
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 媒体文件 ID，即该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 [视频上传完成事件通知](/document/product/266/7830) 或 [云点播控制台](https://console.cloud.tencent.com/vod/media) 获取该字段。当 Type 取值为 File 时，本参数有效。说明：
1. 推荐使用小于10M的图片；
2. 图片格式的取值为：jpeg，jpg, png。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 可访问的文件 URL。当 Type 取值为 Url 时，本参数有效。
说明：
1. 推荐使用小于10M的图片；
2. 图片格式的取值为：jpeg，jpg, png。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 参考类型，GV模型适用。
注意：

当使用GV模型时，可作为参考方式,可选asset(素材)、style(风格)。
    */
    @SerializedName("ReferenceType")
    @Expose
    private String ReferenceType;

    /**
    * 主体id.
适用模型：Vidu-q2.
当需要对图片标识主体时，需要每个图片都带主体id，后续生成时可以通过@主体id的方式使用。
    */
    @SerializedName("ObjectId")
    @Expose
    private String ObjectId;

    /**
    * 适用于Vidu-q2模型。
当全部图片携带主体id时，可针对主体设置音色id。 音色列表：https://shengshu.feishu.cn/sheets/EgFvs6DShhiEBStmjzccr5gonOg
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
     * Get 输入的视频文件类型。取值有： <li>File：点播媒体文件；</li> <li>Url：可访问的 URL；</li>  
     * @return Type 输入的视频文件类型。取值有： <li>File：点播媒体文件；</li> <li>Url：可访问的 URL；</li> 
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 输入的视频文件类型。取值有： <li>File：点播媒体文件；</li> <li>Url：可访问的 URL；</li> 
     * @param Type 输入的视频文件类型。取值有： <li>File：点播媒体文件；</li> <li>Url：可访问的 URL；</li> 
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 媒体文件 ID，即该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 [视频上传完成事件通知](/document/product/266/7830) 或 [云点播控制台](https://console.cloud.tencent.com/vod/media) 获取该字段。当 Type 取值为 File 时，本参数有效。说明：
1. 推荐使用小于10M的图片；
2. 图片格式的取值为：jpeg，jpg, png。 
     * @return FileId 媒体文件 ID，即该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 [视频上传完成事件通知](/document/product/266/7830) 或 [云点播控制台](https://console.cloud.tencent.com/vod/media) 获取该字段。当 Type 取值为 File 时，本参数有效。说明：
1. 推荐使用小于10M的图片；
2. 图片格式的取值为：jpeg，jpg, png。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 媒体文件 ID，即该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 [视频上传完成事件通知](/document/product/266/7830) 或 [云点播控制台](https://console.cloud.tencent.com/vod/media) 获取该字段。当 Type 取值为 File 时，本参数有效。说明：
1. 推荐使用小于10M的图片；
2. 图片格式的取值为：jpeg，jpg, png。
     * @param FileId 媒体文件 ID，即该文件在云点播上的全局唯一标识符，在上传成功后由云点播后台分配。可以在 [视频上传完成事件通知](/document/product/266/7830) 或 [云点播控制台](https://console.cloud.tencent.com/vod/media) 获取该字段。当 Type 取值为 File 时，本参数有效。说明：
1. 推荐使用小于10M的图片；
2. 图片格式的取值为：jpeg，jpg, png。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get 可访问的文件 URL。当 Type 取值为 Url 时，本参数有效。
说明：
1. 推荐使用小于10M的图片；
2. 图片格式的取值为：jpeg，jpg, png。 
     * @return Url 可访问的文件 URL。当 Type 取值为 Url 时，本参数有效。
说明：
1. 推荐使用小于10M的图片；
2. 图片格式的取值为：jpeg，jpg, png。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 可访问的文件 URL。当 Type 取值为 Url 时，本参数有效。
说明：
1. 推荐使用小于10M的图片；
2. 图片格式的取值为：jpeg，jpg, png。
     * @param Url 可访问的文件 URL。当 Type 取值为 Url 时，本参数有效。
说明：
1. 推荐使用小于10M的图片；
2. 图片格式的取值为：jpeg，jpg, png。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 参考类型，GV模型适用。
注意：

当使用GV模型时，可作为参考方式,可选asset(素材)、style(风格)。 
     * @return ReferenceType 参考类型，GV模型适用。
注意：

当使用GV模型时，可作为参考方式,可选asset(素材)、style(风格)。
     */
    public String getReferenceType() {
        return this.ReferenceType;
    }

    /**
     * Set 参考类型，GV模型适用。
注意：

当使用GV模型时，可作为参考方式,可选asset(素材)、style(风格)。
     * @param ReferenceType 参考类型，GV模型适用。
注意：

当使用GV模型时，可作为参考方式,可选asset(素材)、style(风格)。
     */
    public void setReferenceType(String ReferenceType) {
        this.ReferenceType = ReferenceType;
    }

    /**
     * Get 主体id.
适用模型：Vidu-q2.
当需要对图片标识主体时，需要每个图片都带主体id，后续生成时可以通过@主体id的方式使用。 
     * @return ObjectId 主体id.
适用模型：Vidu-q2.
当需要对图片标识主体时，需要每个图片都带主体id，后续生成时可以通过@主体id的方式使用。
     */
    public String getObjectId() {
        return this.ObjectId;
    }

    /**
     * Set 主体id.
适用模型：Vidu-q2.
当需要对图片标识主体时，需要每个图片都带主体id，后续生成时可以通过@主体id的方式使用。
     * @param ObjectId 主体id.
适用模型：Vidu-q2.
当需要对图片标识主体时，需要每个图片都带主体id，后续生成时可以通过@主体id的方式使用。
     */
    public void setObjectId(String ObjectId) {
        this.ObjectId = ObjectId;
    }

    /**
     * Get 适用于Vidu-q2模型。
当全部图片携带主体id时，可针对主体设置音色id。 音色列表：https://shengshu.feishu.cn/sheets/EgFvs6DShhiEBStmjzccr5gonOg 
     * @return VoiceId 适用于Vidu-q2模型。
当全部图片携带主体id时，可针对主体设置音色id。 音色列表：https://shengshu.feishu.cn/sheets/EgFvs6DShhiEBStmjzccr5gonOg
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set 适用于Vidu-q2模型。
当全部图片携带主体id时，可针对主体设置音色id。 音色列表：https://shengshu.feishu.cn/sheets/EgFvs6DShhiEBStmjzccr5gonOg
     * @param VoiceId 适用于Vidu-q2模型。
当全部图片携带主体id时，可针对主体设置音色id。 音色列表：https://shengshu.feishu.cn/sheets/EgFvs6DShhiEBStmjzccr5gonOg
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "ReferenceType", this.ReferenceType);
        this.setParamSimple(map, prefix + "ObjectId", this.ObjectId);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);

    }
}

