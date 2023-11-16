/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class JustInTimeTranscodeTemplate extends AbstractModel {

    /**
    * 模板类型。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 模板名。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 模板描述。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 视频参数配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VideoConfigure")
    @Expose
    private VideoConfigureInfo VideoConfigure;

    /**
    * 水印参数配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WatermarkConfigure")
    @Expose
    private WatermarkConfigureData WatermarkConfigure;

    /**
     * Get 模板类型。 
     * @return Type 模板类型。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 模板类型。
     * @param Type 模板类型。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 模板名。 
     * @return Name 模板名。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 模板名。
     * @param Name 模板名。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 模板描述。 
     * @return Comment 模板描述。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 模板描述。
     * @param Comment 模板描述。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 视频参数配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VideoConfigure 视频参数配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VideoConfigureInfo getVideoConfigure() {
        return this.VideoConfigure;
    }

    /**
     * Set 视频参数配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VideoConfigure 视频参数配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideoConfigure(VideoConfigureInfo VideoConfigure) {
        this.VideoConfigure = VideoConfigure;
    }

    /**
     * Get 水印参数配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WatermarkConfigure 水印参数配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WatermarkConfigureData getWatermarkConfigure() {
        return this.WatermarkConfigure;
    }

    /**
     * Set 水印参数配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param WatermarkConfigure 水印参数配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWatermarkConfigure(WatermarkConfigureData WatermarkConfigure) {
        this.WatermarkConfigure = WatermarkConfigure;
    }

    public JustInTimeTranscodeTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JustInTimeTranscodeTemplate(JustInTimeTranscodeTemplate source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.VideoConfigure != null) {
            this.VideoConfigure = new VideoConfigureInfo(source.VideoConfigure);
        }
        if (source.WatermarkConfigure != null) {
            this.WatermarkConfigure = new WatermarkConfigureData(source.WatermarkConfigure);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamObj(map, prefix + "VideoConfigure.", this.VideoConfigure);
        this.setParamObj(map, prefix + "WatermarkConfigure.", this.WatermarkConfigure);

    }
}

