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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetectAIFakeFacesRequest extends AbstractModel {

    /**
    * <p>传入需要检测的人脸图片或人脸视频（当前仅支持单人脸检测），使用base64编码的形式，如您的场景视频和图片都有，我们更建议您使用视频进行检测，为了提供更好的检测效果，请您注意以下输入数据的限制与建议：</p><ul><li><p>图片的Base64值：<br>建议整体图像480x640的分辨率，脸部大小在 100X100 以上，由手机前置摄像头拍摄。<br>Base64编码后的图片数据大小建议不超过3M、最大不可超过10M，仅支持jpg、png格式。<br>请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</p></li><li><p>视频的Base64值：<br>Base64编码后的大小建议在8M以内、最大不可超过10M，支持mp4、avi、flv格式，由手机前置摄像头拍摄。<br>视频建议时长为2～5s，最大不可超过20s。<br>视频分辨率建议为480x640（最大支持720p），帧率在25fps~30fps之间。<br>请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</p></li></ul><p>若您未使用Encryption进行加密传输，则本字段为必填参数。</p>
    */
    @SerializedName("FaceInput")
    @Expose
    private String FaceInput;

    /**
    * <p>传入的类型。</p><ul><li>取值范围：<br>1：传入的是图片类型。<br>2：传入的是视频类型。<br>其他：返回错误码InvalidParameter。</li></ul><p>若您未使用Encryption进行加密传输，则本字段为必填参数。</p>
    */
    @SerializedName("FaceInputType")
    @Expose
    private Long FaceInputType;

    /**
    * <p>是否需要对请求信息进行全包体加密。</p><ul><li>支持的加密算法:AES-256-CBC、SM4-GCM。</li><li>有加密需求的用户可使用此参数，详情请点击左侧链接。</li></ul>
    */
    @SerializedName("Encryption")
    @Expose
    private Encryption Encryption;

    /**
    * <p>加密后的密文。</p><ul><li>加密前的数据格式如下:{&quot;FaceInput&quot;:&quot;AAAAA&quot;,&quot;FaceInputType&quot;:1}。</li></ul>
    */
    @SerializedName("EncryptedBody")
    @Expose
    private String EncryptedBody;

    /**
     * Get <p>传入需要检测的人脸图片或人脸视频（当前仅支持单人脸检测），使用base64编码的形式，如您的场景视频和图片都有，我们更建议您使用视频进行检测，为了提供更好的检测效果，请您注意以下输入数据的限制与建议：</p><ul><li><p>图片的Base64值：<br>建议整体图像480x640的分辨率，脸部大小在 100X100 以上，由手机前置摄像头拍摄。<br>Base64编码后的图片数据大小建议不超过3M、最大不可超过10M，仅支持jpg、png格式。<br>请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</p></li><li><p>视频的Base64值：<br>Base64编码后的大小建议在8M以内、最大不可超过10M，支持mp4、avi、flv格式，由手机前置摄像头拍摄。<br>视频建议时长为2～5s，最大不可超过20s。<br>视频分辨率建议为480x640（最大支持720p），帧率在25fps~30fps之间。<br>请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</p></li></ul><p>若您未使用Encryption进行加密传输，则本字段为必填参数。</p> 
     * @return FaceInput <p>传入需要检测的人脸图片或人脸视频（当前仅支持单人脸检测），使用base64编码的形式，如您的场景视频和图片都有，我们更建议您使用视频进行检测，为了提供更好的检测效果，请您注意以下输入数据的限制与建议：</p><ul><li><p>图片的Base64值：<br>建议整体图像480x640的分辨率，脸部大小在 100X100 以上，由手机前置摄像头拍摄。<br>Base64编码后的图片数据大小建议不超过3M、最大不可超过10M，仅支持jpg、png格式。<br>请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</p></li><li><p>视频的Base64值：<br>Base64编码后的大小建议在8M以内、最大不可超过10M，支持mp4、avi、flv格式，由手机前置摄像头拍摄。<br>视频建议时长为2～5s，最大不可超过20s。<br>视频分辨率建议为480x640（最大支持720p），帧率在25fps~30fps之间。<br>请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</p></li></ul><p>若您未使用Encryption进行加密传输，则本字段为必填参数。</p>
     */
    public String getFaceInput() {
        return this.FaceInput;
    }

    /**
     * Set <p>传入需要检测的人脸图片或人脸视频（当前仅支持单人脸检测），使用base64编码的形式，如您的场景视频和图片都有，我们更建议您使用视频进行检测，为了提供更好的检测效果，请您注意以下输入数据的限制与建议：</p><ul><li><p>图片的Base64值：<br>建议整体图像480x640的分辨率，脸部大小在 100X100 以上，由手机前置摄像头拍摄。<br>Base64编码后的图片数据大小建议不超过3M、最大不可超过10M，仅支持jpg、png格式。<br>请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</p></li><li><p>视频的Base64值：<br>Base64编码后的大小建议在8M以内、最大不可超过10M，支持mp4、avi、flv格式，由手机前置摄像头拍摄。<br>视频建议时长为2～5s，最大不可超过20s。<br>视频分辨率建议为480x640（最大支持720p），帧率在25fps~30fps之间。<br>请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</p></li></ul><p>若您未使用Encryption进行加密传输，则本字段为必填参数。</p>
     * @param FaceInput <p>传入需要检测的人脸图片或人脸视频（当前仅支持单人脸检测），使用base64编码的形式，如您的场景视频和图片都有，我们更建议您使用视频进行检测，为了提供更好的检测效果，请您注意以下输入数据的限制与建议：</p><ul><li><p>图片的Base64值：<br>建议整体图像480x640的分辨率，脸部大小在 100X100 以上，由手机前置摄像头拍摄。<br>Base64编码后的图片数据大小建议不超过3M、最大不可超过10M，仅支持jpg、png格式。<br>请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</p></li><li><p>视频的Base64值：<br>Base64编码后的大小建议在8M以内、最大不可超过10M，支持mp4、avi、flv格式，由手机前置摄像头拍摄。<br>视频建议时长为2～5s，最大不可超过20s。<br>视频分辨率建议为480x640（最大支持720p），帧率在25fps~30fps之间。<br>请使用标准的Base64编码方式(带=补位)，编码规范参考RFC4648。</p></li></ul><p>若您未使用Encryption进行加密传输，则本字段为必填参数。</p>
     */
    public void setFaceInput(String FaceInput) {
        this.FaceInput = FaceInput;
    }

    /**
     * Get <p>传入的类型。</p><ul><li>取值范围：<br>1：传入的是图片类型。<br>2：传入的是视频类型。<br>其他：返回错误码InvalidParameter。</li></ul><p>若您未使用Encryption进行加密传输，则本字段为必填参数。</p> 
     * @return FaceInputType <p>传入的类型。</p><ul><li>取值范围：<br>1：传入的是图片类型。<br>2：传入的是视频类型。<br>其他：返回错误码InvalidParameter。</li></ul><p>若您未使用Encryption进行加密传输，则本字段为必填参数。</p>
     */
    public Long getFaceInputType() {
        return this.FaceInputType;
    }

    /**
     * Set <p>传入的类型。</p><ul><li>取值范围：<br>1：传入的是图片类型。<br>2：传入的是视频类型。<br>其他：返回错误码InvalidParameter。</li></ul><p>若您未使用Encryption进行加密传输，则本字段为必填参数。</p>
     * @param FaceInputType <p>传入的类型。</p><ul><li>取值范围：<br>1：传入的是图片类型。<br>2：传入的是视频类型。<br>其他：返回错误码InvalidParameter。</li></ul><p>若您未使用Encryption进行加密传输，则本字段为必填参数。</p>
     */
    public void setFaceInputType(Long FaceInputType) {
        this.FaceInputType = FaceInputType;
    }

    /**
     * Get <p>是否需要对请求信息进行全包体加密。</p><ul><li>支持的加密算法:AES-256-CBC、SM4-GCM。</li><li>有加密需求的用户可使用此参数，详情请点击左侧链接。</li></ul> 
     * @return Encryption <p>是否需要对请求信息进行全包体加密。</p><ul><li>支持的加密算法:AES-256-CBC、SM4-GCM。</li><li>有加密需求的用户可使用此参数，详情请点击左侧链接。</li></ul>
     */
    public Encryption getEncryption() {
        return this.Encryption;
    }

    /**
     * Set <p>是否需要对请求信息进行全包体加密。</p><ul><li>支持的加密算法:AES-256-CBC、SM4-GCM。</li><li>有加密需求的用户可使用此参数，详情请点击左侧链接。</li></ul>
     * @param Encryption <p>是否需要对请求信息进行全包体加密。</p><ul><li>支持的加密算法:AES-256-CBC、SM4-GCM。</li><li>有加密需求的用户可使用此参数，详情请点击左侧链接。</li></ul>
     */
    public void setEncryption(Encryption Encryption) {
        this.Encryption = Encryption;
    }

    /**
     * Get <p>加密后的密文。</p><ul><li>加密前的数据格式如下:{&quot;FaceInput&quot;:&quot;AAAAA&quot;,&quot;FaceInputType&quot;:1}。</li></ul> 
     * @return EncryptedBody <p>加密后的密文。</p><ul><li>加密前的数据格式如下:{&quot;FaceInput&quot;:&quot;AAAAA&quot;,&quot;FaceInputType&quot;:1}。</li></ul>
     */
    public String getEncryptedBody() {
        return this.EncryptedBody;
    }

    /**
     * Set <p>加密后的密文。</p><ul><li>加密前的数据格式如下:{&quot;FaceInput&quot;:&quot;AAAAA&quot;,&quot;FaceInputType&quot;:1}。</li></ul>
     * @param EncryptedBody <p>加密后的密文。</p><ul><li>加密前的数据格式如下:{&quot;FaceInput&quot;:&quot;AAAAA&quot;,&quot;FaceInputType&quot;:1}。</li></ul>
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

