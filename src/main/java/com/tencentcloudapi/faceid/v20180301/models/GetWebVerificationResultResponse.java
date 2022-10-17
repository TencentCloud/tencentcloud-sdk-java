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

public class GetWebVerificationResultResponse extends AbstractModel{

    /**
    * 本次核验最终结果。0为核验通过，是同一人。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorCode")
    @Expose
    private Long ErrorCode;

    /**
    * 本次核验最终结果描述。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * 视频流中采集的最佳人脸照片临时地址，下载有效时间10分钟，如果需要存储请及时下载。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VideoBestFrameUrl")
    @Expose
    private String VideoBestFrameUrl;

    /**
    * 视频流中采集的最佳人脸照片内容MD5散列值，可以使用此值校验文件内容是否一致。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VideoBestFrameMd5")
    @Expose
    private String VideoBestFrameMd5;

    /**
    * 本次核验流程的详细信息列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VerificationDetailList")
    @Expose
    private VerificationDetail [] VerificationDetailList;

    /**
    * 视频流中采集的视频临时地址，下载有效时间10分钟，如果需要存储请及时下载。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VideoUrl")
    @Expose
    private String VideoUrl;

    /**
    * 视频流中采集的视频内容MD5散列值，可以使用此值校验文件内容是否一致。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VideoMd5")
    @Expose
    private String VideoMd5;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 本次核验最终结果。0为核验通过，是同一人。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorCode 本次核验最终结果。0为核验通过，是同一人。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set 本次核验最终结果。0为核验通过，是同一人。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorCode 本次核验最终结果。0为核验通过，是同一人。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorCode(Long ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get 本次核验最终结果描述。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorMsg 本次核验最终结果描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set 本次核验最终结果描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorMsg 本次核验最终结果描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    /**
     * Get 视频流中采集的最佳人脸照片临时地址，下载有效时间10分钟，如果需要存储请及时下载。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VideoBestFrameUrl 视频流中采集的最佳人脸照片临时地址，下载有效时间10分钟，如果需要存储请及时下载。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVideoBestFrameUrl() {
        return this.VideoBestFrameUrl;
    }

    /**
     * Set 视频流中采集的最佳人脸照片临时地址，下载有效时间10分钟，如果需要存储请及时下载。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VideoBestFrameUrl 视频流中采集的最佳人脸照片临时地址，下载有效时间10分钟，如果需要存储请及时下载。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideoBestFrameUrl(String VideoBestFrameUrl) {
        this.VideoBestFrameUrl = VideoBestFrameUrl;
    }

    /**
     * Get 视频流中采集的最佳人脸照片内容MD5散列值，可以使用此值校验文件内容是否一致。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VideoBestFrameMd5 视频流中采集的最佳人脸照片内容MD5散列值，可以使用此值校验文件内容是否一致。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVideoBestFrameMd5() {
        return this.VideoBestFrameMd5;
    }

    /**
     * Set 视频流中采集的最佳人脸照片内容MD5散列值，可以使用此值校验文件内容是否一致。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VideoBestFrameMd5 视频流中采集的最佳人脸照片内容MD5散列值，可以使用此值校验文件内容是否一致。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideoBestFrameMd5(String VideoBestFrameMd5) {
        this.VideoBestFrameMd5 = VideoBestFrameMd5;
    }

    /**
     * Get 本次核验流程的详细信息列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VerificationDetailList 本次核验流程的详细信息列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VerificationDetail [] getVerificationDetailList() {
        return this.VerificationDetailList;
    }

    /**
     * Set 本次核验流程的详细信息列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VerificationDetailList 本次核验流程的详细信息列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVerificationDetailList(VerificationDetail [] VerificationDetailList) {
        this.VerificationDetailList = VerificationDetailList;
    }

    /**
     * Get 视频流中采集的视频临时地址，下载有效时间10分钟，如果需要存储请及时下载。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VideoUrl 视频流中采集的视频临时地址，下载有效时间10分钟，如果需要存储请及时下载。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVideoUrl() {
        return this.VideoUrl;
    }

    /**
     * Set 视频流中采集的视频临时地址，下载有效时间10分钟，如果需要存储请及时下载。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VideoUrl 视频流中采集的视频临时地址，下载有效时间10分钟，如果需要存储请及时下载。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideoUrl(String VideoUrl) {
        this.VideoUrl = VideoUrl;
    }

    /**
     * Get 视频流中采集的视频内容MD5散列值，可以使用此值校验文件内容是否一致。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VideoMd5 视频流中采集的视频内容MD5散列值，可以使用此值校验文件内容是否一致。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVideoMd5() {
        return this.VideoMd5;
    }

    /**
     * Set 视频流中采集的视频内容MD5散列值，可以使用此值校验文件内容是否一致。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VideoMd5 视频流中采集的视频内容MD5散列值，可以使用此值校验文件内容是否一致。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideoMd5(String VideoMd5) {
        this.VideoMd5 = VideoMd5;
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

    public GetWebVerificationResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetWebVerificationResultResponse(GetWebVerificationResultResponse source) {
        if (source.ErrorCode != null) {
            this.ErrorCode = new Long(source.ErrorCode);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
        if (source.VideoBestFrameUrl != null) {
            this.VideoBestFrameUrl = new String(source.VideoBestFrameUrl);
        }
        if (source.VideoBestFrameMd5 != null) {
            this.VideoBestFrameMd5 = new String(source.VideoBestFrameMd5);
        }
        if (source.VerificationDetailList != null) {
            this.VerificationDetailList = new VerificationDetail[source.VerificationDetailList.length];
            for (int i = 0; i < source.VerificationDetailList.length; i++) {
                this.VerificationDetailList[i] = new VerificationDetail(source.VerificationDetailList[i]);
            }
        }
        if (source.VideoUrl != null) {
            this.VideoUrl = new String(source.VideoUrl);
        }
        if (source.VideoMd5 != null) {
            this.VideoMd5 = new String(source.VideoMd5);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);
        this.setParamSimple(map, prefix + "VideoBestFrameUrl", this.VideoBestFrameUrl);
        this.setParamSimple(map, prefix + "VideoBestFrameMd5", this.VideoBestFrameMd5);
        this.setParamArrayObj(map, prefix + "VerificationDetailList.", this.VerificationDetailList);
        this.setParamSimple(map, prefix + "VideoUrl", this.VideoUrl);
        this.setParamSimple(map, prefix + "VideoMd5", this.VideoMd5);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

