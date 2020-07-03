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
package com.tencentcloudapi.tiia.v20190529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetectLabelResponse extends AbstractModel{

    /**
    * Web网络版标签结果数组。如未选择WEB场景，则为空。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Labels")
    @Expose
    private DetectLabelItem [] Labels;

    /**
    * Camera摄像头版标签结果数组。如未选择CAMERA场景，则为空。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CameraLabels")
    @Expose
    private DetectLabelItem [] CameraLabels;

    /**
    * Album相册版标签结果数组。如未选择ALBUM场景，则为空。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlbumLabels")
    @Expose
    private DetectLabelItem [] AlbumLabels;

    /**
    * News新闻版标签结果数组。如未选择NEWS场景，则为空。
新闻版目前为测试阶段，暂不提供每个标签的一级、二级分类信息的输出。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NewsLabels")
    @Expose
    private DetectLabelItem [] NewsLabels;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Web网络版标签结果数组。如未选择WEB场景，则为空。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Labels Web网络版标签结果数组。如未选择WEB场景，则为空。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DetectLabelItem [] getLabels() {
        return this.Labels;
    }

    /**
     * Set Web网络版标签结果数组。如未选择WEB场景，则为空。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Labels Web网络版标签结果数组。如未选择WEB场景，则为空。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabels(DetectLabelItem [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get Camera摄像头版标签结果数组。如未选择CAMERA场景，则为空。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CameraLabels Camera摄像头版标签结果数组。如未选择CAMERA场景，则为空。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DetectLabelItem [] getCameraLabels() {
        return this.CameraLabels;
    }

    /**
     * Set Camera摄像头版标签结果数组。如未选择CAMERA场景，则为空。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CameraLabels Camera摄像头版标签结果数组。如未选择CAMERA场景，则为空。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCameraLabels(DetectLabelItem [] CameraLabels) {
        this.CameraLabels = CameraLabels;
    }

    /**
     * Get Album相册版标签结果数组。如未选择ALBUM场景，则为空。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlbumLabels Album相册版标签结果数组。如未选择ALBUM场景，则为空。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DetectLabelItem [] getAlbumLabels() {
        return this.AlbumLabels;
    }

    /**
     * Set Album相册版标签结果数组。如未选择ALBUM场景，则为空。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlbumLabels Album相册版标签结果数组。如未选择ALBUM场景，则为空。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlbumLabels(DetectLabelItem [] AlbumLabels) {
        this.AlbumLabels = AlbumLabels;
    }

    /**
     * Get News新闻版标签结果数组。如未选择NEWS场景，则为空。
新闻版目前为测试阶段，暂不提供每个标签的一级、二级分类信息的输出。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NewsLabels News新闻版标签结果数组。如未选择NEWS场景，则为空。
新闻版目前为测试阶段，暂不提供每个标签的一级、二级分类信息的输出。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DetectLabelItem [] getNewsLabels() {
        return this.NewsLabels;
    }

    /**
     * Set News新闻版标签结果数组。如未选择NEWS场景，则为空。
新闻版目前为测试阶段，暂不提供每个标签的一级、二级分类信息的输出。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NewsLabels News新闻版标签结果数组。如未选择NEWS场景，则为空。
新闻版目前为测试阶段，暂不提供每个标签的一级、二级分类信息的输出。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNewsLabels(DetectLabelItem [] NewsLabels) {
        this.NewsLabels = NewsLabels;
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
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "CameraLabels.", this.CameraLabels);
        this.setParamArrayObj(map, prefix + "AlbumLabels.", this.AlbumLabels);
        this.setParamArrayObj(map, prefix + "NewsLabels.", this.NewsLabels);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

