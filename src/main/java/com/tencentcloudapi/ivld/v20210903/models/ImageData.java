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
package com.tencentcloudapi.ivld.v20210903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageData extends AbstractModel{

    /**
    * 图片中出现的可视文本识别结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcrSet")
    @Expose
    private ImageOcr [] OcrSet;

    /**
    * 图片中出现的帧标签识别结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrameTagSet")
    @Expose
    private MultiLevelTag FrameTagSet;

    /**
    * 图片中出现的层级人物识别结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MultiLevelPersonInfoSet")
    @Expose
    private MultiLevelPersonInfo [] MultiLevelPersonInfoSet;

    /**
    * 图片中出现的台标识别结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TvLogo")
    @Expose
    private ImageLogo TvLogo;

    /**
    * 图片中出现的来源信息识别结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceLogo")
    @Expose
    private ImageLogo SourceLogo;

    /**
     * Get 图片中出现的可视文本识别结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OcrSet 图片中出现的可视文本识别结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageOcr [] getOcrSet() {
        return this.OcrSet;
    }

    /**
     * Set 图片中出现的可视文本识别结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrSet 图片中出现的可视文本识别结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrSet(ImageOcr [] OcrSet) {
        this.OcrSet = OcrSet;
    }

    /**
     * Get 图片中出现的帧标签识别结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrameTagSet 图片中出现的帧标签识别结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MultiLevelTag getFrameTagSet() {
        return this.FrameTagSet;
    }

    /**
     * Set 图片中出现的帧标签识别结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrameTagSet 图片中出现的帧标签识别结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrameTagSet(MultiLevelTag FrameTagSet) {
        this.FrameTagSet = FrameTagSet;
    }

    /**
     * Get 图片中出现的层级人物识别结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MultiLevelPersonInfoSet 图片中出现的层级人物识别结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MultiLevelPersonInfo [] getMultiLevelPersonInfoSet() {
        return this.MultiLevelPersonInfoSet;
    }

    /**
     * Set 图片中出现的层级人物识别结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param MultiLevelPersonInfoSet 图片中出现的层级人物识别结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMultiLevelPersonInfoSet(MultiLevelPersonInfo [] MultiLevelPersonInfoSet) {
        this.MultiLevelPersonInfoSet = MultiLevelPersonInfoSet;
    }

    /**
     * Get 图片中出现的台标识别结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TvLogo 图片中出现的台标识别结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageLogo getTvLogo() {
        return this.TvLogo;
    }

    /**
     * Set 图片中出现的台标识别结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param TvLogo 图片中出现的台标识别结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTvLogo(ImageLogo TvLogo) {
        this.TvLogo = TvLogo;
    }

    /**
     * Get 图片中出现的来源信息识别结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceLogo 图片中出现的来源信息识别结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageLogo getSourceLogo() {
        return this.SourceLogo;
    }

    /**
     * Set 图片中出现的来源信息识别结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceLogo 图片中出现的来源信息识别结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceLogo(ImageLogo SourceLogo) {
        this.SourceLogo = SourceLogo;
    }

    public ImageData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageData(ImageData source) {
        if (source.OcrSet != null) {
            this.OcrSet = new ImageOcr[source.OcrSet.length];
            for (int i = 0; i < source.OcrSet.length; i++) {
                this.OcrSet[i] = new ImageOcr(source.OcrSet[i]);
            }
        }
        if (source.FrameTagSet != null) {
            this.FrameTagSet = new MultiLevelTag(source.FrameTagSet);
        }
        if (source.MultiLevelPersonInfoSet != null) {
            this.MultiLevelPersonInfoSet = new MultiLevelPersonInfo[source.MultiLevelPersonInfoSet.length];
            for (int i = 0; i < source.MultiLevelPersonInfoSet.length; i++) {
                this.MultiLevelPersonInfoSet[i] = new MultiLevelPersonInfo(source.MultiLevelPersonInfoSet[i]);
            }
        }
        if (source.TvLogo != null) {
            this.TvLogo = new ImageLogo(source.TvLogo);
        }
        if (source.SourceLogo != null) {
            this.SourceLogo = new ImageLogo(source.SourceLogo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "OcrSet.", this.OcrSet);
        this.setParamObj(map, prefix + "FrameTagSet.", this.FrameTagSet);
        this.setParamArrayObj(map, prefix + "MultiLevelPersonInfoSet.", this.MultiLevelPersonInfoSet);
        this.setParamObj(map, prefix + "TvLogo.", this.TvLogo);
        this.setParamObj(map, prefix + "SourceLogo.", this.SourceLogo);

    }
}

