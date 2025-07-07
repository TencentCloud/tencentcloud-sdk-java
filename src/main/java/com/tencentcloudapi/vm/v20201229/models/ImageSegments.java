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
package com.tencentcloudapi.vm.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageSegments extends AbstractModel {

    /**
    * 该字段用于返回视频片段的截帧时间，单位为秒。对于点播文件，该参数代表对应截取图片相对于视频的偏移时间，如0（代表不偏移），5（视频开始后5秒），10（视频开始后10秒）；对于直播文件，该参数则返回对应图片的Unix时间戳，如：1594650717。
    */
    @SerializedName("OffsetTime")
    @Expose
    private String OffsetTime;

    /**
    * 该字段用于返回视频片段的具体截帧审核结果，详细内容敬请参考ImageResult数据结构的描述。
    */
    @SerializedName("Result")
    @Expose
    private ImageResult Result;

    /**
    * 该字段用于返回视频片段的具体截帧审核时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 该字段用于返回视频片段的截帧时间，单位为豪秒。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OffsetusTime")
    @Expose
    private String OffsetusTime;

    /**
     * Get 该字段用于返回视频片段的截帧时间，单位为秒。对于点播文件，该参数代表对应截取图片相对于视频的偏移时间，如0（代表不偏移），5（视频开始后5秒），10（视频开始后10秒）；对于直播文件，该参数则返回对应图片的Unix时间戳，如：1594650717。 
     * @return OffsetTime 该字段用于返回视频片段的截帧时间，单位为秒。对于点播文件，该参数代表对应截取图片相对于视频的偏移时间，如0（代表不偏移），5（视频开始后5秒），10（视频开始后10秒）；对于直播文件，该参数则返回对应图片的Unix时间戳，如：1594650717。
     */
    public String getOffsetTime() {
        return this.OffsetTime;
    }

    /**
     * Set 该字段用于返回视频片段的截帧时间，单位为秒。对于点播文件，该参数代表对应截取图片相对于视频的偏移时间，如0（代表不偏移），5（视频开始后5秒），10（视频开始后10秒）；对于直播文件，该参数则返回对应图片的Unix时间戳，如：1594650717。
     * @param OffsetTime 该字段用于返回视频片段的截帧时间，单位为秒。对于点播文件，该参数代表对应截取图片相对于视频的偏移时间，如0（代表不偏移），5（视频开始后5秒），10（视频开始后10秒）；对于直播文件，该参数则返回对应图片的Unix时间戳，如：1594650717。
     */
    public void setOffsetTime(String OffsetTime) {
        this.OffsetTime = OffsetTime;
    }

    /**
     * Get 该字段用于返回视频片段的具体截帧审核结果，详细内容敬请参考ImageResult数据结构的描述。 
     * @return Result 该字段用于返回视频片段的具体截帧审核结果，详细内容敬请参考ImageResult数据结构的描述。
     */
    public ImageResult getResult() {
        return this.Result;
    }

    /**
     * Set 该字段用于返回视频片段的具体截帧审核结果，详细内容敬请参考ImageResult数据结构的描述。
     * @param Result 该字段用于返回视频片段的具体截帧审核结果，详细内容敬请参考ImageResult数据结构的描述。
     */
    public void setResult(ImageResult Result) {
        this.Result = Result;
    }

    /**
     * Get 该字段用于返回视频片段的具体截帧审核时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedAt 该字段用于返回视频片段的具体截帧审核时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 该字段用于返回视频片段的具体截帧审核时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedAt 该字段用于返回视频片段的具体截帧审核时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 该字段用于返回视频片段的截帧时间，单位为豪秒。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OffsetusTime 该字段用于返回视频片段的截帧时间，单位为豪秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOffsetusTime() {
        return this.OffsetusTime;
    }

    /**
     * Set 该字段用于返回视频片段的截帧时间，单位为豪秒。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OffsetusTime 该字段用于返回视频片段的截帧时间，单位为豪秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOffsetusTime(String OffsetusTime) {
        this.OffsetusTime = OffsetusTime;
    }

    public ImageSegments() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageSegments(ImageSegments source) {
        if (source.OffsetTime != null) {
            this.OffsetTime = new String(source.OffsetTime);
        }
        if (source.Result != null) {
            this.Result = new ImageResult(source.Result);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.OffsetusTime != null) {
            this.OffsetusTime = new String(source.OffsetusTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OffsetTime", this.OffsetTime);
        this.setParamObj(map, prefix + "Result.", this.Result);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "OffsetusTime", this.OffsetusTime);

    }
}

