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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetectAIFakeFacesRequest extends AbstractModel {

    /**
    * 传入需要进行检测的带有人脸的图片或视频，使用base64编码的形式。
- 图片的Base64值：
建议整体图像480x640的分辨率，脸部 大小 100X100 以上。
Base64编码后的图片数据大小不超过3M，仅支持jpg、png格式。
请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。

- 视频的Base64值：
Base64编码后的大小不超过8M，支持mp4、avi、flv格式。
请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。
视频时长最大支持20s，建议时长2～5s。
建议视频分辨率为480x640，帧率在25fps~30fps之间。
    */
    @SerializedName("FaceInput")
    @Expose
    private String FaceInput;

    /**
    * 传入的类型。
- 取值范围：
1：传入的是图片类型。
2：传入的是视频类型。
其他：返回错误码InvalidParameter。
    */
    @SerializedName("FaceInputType")
    @Expose
    private Long FaceInputType;

    /**
    * 是否需要对请求信息进行全包体加密。
- 支持的加密算法:AES-256-CBC、SM4-GCM。
- 有加密需求的用户可使用此参数，详情请点击左侧链接。
    */
    @SerializedName("Encryption")
    @Expose
    private Encryption Encryption;

    /**
    * 加密后的密文。
- 加密前的数据格式如下:{"FaceInput":"AAAAA","FaceInputType":1}。
    */
    @SerializedName("EncryptedBody")
    @Expose
    private String EncryptedBody;

    /**
     * Get 传入需要进行检测的带有人脸的图片或视频，使用base64编码的形式。
- 图片的Base64值：
建议整体图像480x640的分辨率，脸部 大小 100X100 以上。
Base64编码后的图片数据大小不超过3M，仅支持jpg、png格式。
请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。

- 视频的Base64值：
Base64编码后的大小不超过8M，支持mp4、avi、flv格式。
请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。
视频时长最大支持20s，建议时长2～5s。
建议视频分辨率为480x640，帧率在25fps~30fps之间。 
     * @return FaceInput 传入需要进行检测的带有人脸的图片或视频，使用base64编码的形式。
- 图片的Base64值：
建议整体图像480x640的分辨率，脸部 大小 100X100 以上。
Base64编码后的图片数据大小不超过3M，仅支持jpg、png格式。
请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。

- 视频的Base64值：
Base64编码后的大小不超过8M，支持mp4、avi、flv格式。
请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。
视频时长最大支持20s，建议时长2～5s。
建议视频分辨率为480x640，帧率在25fps~30fps之间。
     */
    public String getFaceInput() {
        return this.FaceInput;
    }

    /**
     * Set 传入需要进行检测的带有人脸的图片或视频，使用base64编码的形式。
- 图片的Base64值：
建议整体图像480x640的分辨率，脸部 大小 100X100 以上。
Base64编码后的图片数据大小不超过3M，仅支持jpg、png格式。
请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。

- 视频的Base64值：
Base64编码后的大小不超过8M，支持mp4、avi、flv格式。
请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。
视频时长最大支持20s，建议时长2～5s。
建议视频分辨率为480x640，帧率在25fps~30fps之间。
     * @param FaceInput 传入需要进行检测的带有人脸的图片或视频，使用base64编码的形式。
- 图片的Base64值：
建议整体图像480x640的分辨率，脸部 大小 100X100 以上。
Base64编码后的图片数据大小不超过3M，仅支持jpg、png格式。
请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。

- 视频的Base64值：
Base64编码后的大小不超过8M，支持mp4、avi、flv格式。
请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。
视频时长最大支持20s，建议时长2～5s。
建议视频分辨率为480x640，帧率在25fps~30fps之间。
     */
    public void setFaceInput(String FaceInput) {
        this.FaceInput = FaceInput;
    }

    /**
     * Get 传入的类型。
- 取值范围：
1：传入的是图片类型。
2：传入的是视频类型。
其他：返回错误码InvalidParameter。 
     * @return FaceInputType 传入的类型。
- 取值范围：
1：传入的是图片类型。
2：传入的是视频类型。
其他：返回错误码InvalidParameter。
     */
    public Long getFaceInputType() {
        return this.FaceInputType;
    }

    /**
     * Set 传入的类型。
- 取值范围：
1：传入的是图片类型。
2：传入的是视频类型。
其他：返回错误码InvalidParameter。
     * @param FaceInputType 传入的类型。
- 取值范围：
1：传入的是图片类型。
2：传入的是视频类型。
其他：返回错误码InvalidParameter。
     */
    public void setFaceInputType(Long FaceInputType) {
        this.FaceInputType = FaceInputType;
    }

    /**
     * Get 是否需要对请求信息进行全包体加密。
- 支持的加密算法:AES-256-CBC、SM4-GCM。
- 有加密需求的用户可使用此参数，详情请点击左侧链接。 
     * @return Encryption 是否需要对请求信息进行全包体加密。
- 支持的加密算法:AES-256-CBC、SM4-GCM。
- 有加密需求的用户可使用此参数，详情请点击左侧链接。
     */
    public Encryption getEncryption() {
        return this.Encryption;
    }

    /**
     * Set 是否需要对请求信息进行全包体加密。
- 支持的加密算法:AES-256-CBC、SM4-GCM。
- 有加密需求的用户可使用此参数，详情请点击左侧链接。
     * @param Encryption 是否需要对请求信息进行全包体加密。
- 支持的加密算法:AES-256-CBC、SM4-GCM。
- 有加密需求的用户可使用此参数，详情请点击左侧链接。
     */
    public void setEncryption(Encryption Encryption) {
        this.Encryption = Encryption;
    }

    /**
     * Get 加密后的密文。
- 加密前的数据格式如下:{"FaceInput":"AAAAA","FaceInputType":1}。 
     * @return EncryptedBody 加密后的密文。
- 加密前的数据格式如下:{"FaceInput":"AAAAA","FaceInputType":1}。
     */
    public String getEncryptedBody() {
        return this.EncryptedBody;
    }

    /**
     * Set 加密后的密文。
- 加密前的数据格式如下:{"FaceInput":"AAAAA","FaceInputType":1}。
     * @param EncryptedBody 加密后的密文。
- 加密前的数据格式如下:{"FaceInput":"AAAAA","FaceInputType":1}。
     */
    public void setEncryptedBody(String EncryptedBody) {
        this.EncryptedBody = EncryptedBody;
    }

    public DetectAIFakeFacesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetectAIFakeFacesRequest(DetectAIFakeFacesRequest source) {
        if (source.FaceInput != null) {
            this.FaceInput = new String(source.FaceInput);
        }
        if (source.FaceInputType != null) {
            this.FaceInputType = new Long(source.FaceInputType);
        }
        if (source.Encryption != null) {
            this.Encryption = new Encryption(source.Encryption);
        }
        if (source.EncryptedBody != null) {
            this.EncryptedBody = new String(source.EncryptedBody);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FaceInput", this.FaceInput);
        this.setParamSimple(map, prefix + "FaceInputType", this.FaceInputType);
        this.setParamObj(map, prefix + "Encryption.", this.Encryption);
        this.setParamSimple(map, prefix + "EncryptedBody", this.EncryptedBody);

    }
}

