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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetDetectInfoEnhancedResponse extends AbstractModel{

    /**
    * 文本类信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Text")
    @Expose
    private DetectInfoText Text;

    /**
    * 身份证照片信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdCardData")
    @Expose
    private DetectInfoIdCardData IdCardData;

    /**
    * 最佳帧信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BestFrame")
    @Expose
    private DetectInfoBestFrame BestFrame;

    /**
    * 视频信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VideoData")
    @Expose
    private DetectInfoVideoData VideoData;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 文本类信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Text 文本类信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DetectInfoText getText() {
        return this.Text;
    }

    /**
     * Set 文本类信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Text 文本类信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setText(DetectInfoText Text) {
        this.Text = Text;
    }

    /**
     * Get 身份证照片信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdCardData 身份证照片信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DetectInfoIdCardData getIdCardData() {
        return this.IdCardData;
    }

    /**
     * Set 身份证照片信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdCardData 身份证照片信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdCardData(DetectInfoIdCardData IdCardData) {
        this.IdCardData = IdCardData;
    }

    /**
     * Get 最佳帧信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BestFrame 最佳帧信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DetectInfoBestFrame getBestFrame() {
        return this.BestFrame;
    }

    /**
     * Set 最佳帧信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BestFrame 最佳帧信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBestFrame(DetectInfoBestFrame BestFrame) {
        this.BestFrame = BestFrame;
    }

    /**
     * Get 视频信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VideoData 视频信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DetectInfoVideoData getVideoData() {
        return this.VideoData;
    }

    /**
     * Set 视频信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VideoData 视频信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideoData(DetectInfoVideoData VideoData) {
        this.VideoData = VideoData;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Text.", this.Text);
        this.setParamObj(map, prefix + "IdCardData.", this.IdCardData);
        this.setParamObj(map, prefix + "BestFrame.", this.BestFrame);
        this.setParamObj(map, prefix + "VideoData.", this.VideoData);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

