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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSealResponse extends AbstractModel {

    /**
    * <p>电子印章ID，为32位字符串。<br>建议开发者保留此印章ID，后续指定签署区印章或者操作印章需此印章ID。<br>可登录腾讯电子签控制台，在 &quot;印章&quot;-&gt;&quot;印章中心&quot;选择查看的印章，在&quot;印章详情&quot; 中查看某个印章的SealId(在页面中展示为印章ID)。</p>
    */
    @SerializedName("SealId")
    @Expose
    private String SealId;

    /**
    * <p>电子印章预览链接地址，地址默认失效时间为24小时。</p>
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * <p>人脸验证操作人链接，用法可以参考&quot;<a href="https://qian.tencent.com/developers/company/openwxminiprogram/">跳转电子签小程序配置</a>&quot;，默认为空。</p>
    */
    @SerializedName("SealOperatorVerifyPath")
    @Expose
    private String SealOperatorVerifyPath;

    /**
    * <p>人脸验证操作人二维码链接，扫码后会跳转到腾讯电子签小程序进行人脸验证，默认为空。</p>
    */
    @SerializedName("SealOperatorVerifyQrcodeUrl")
    @Expose
    private String SealOperatorVerifyQrcodeUrl;

    /**
    * <p>创建印章预览逻辑，返回的是印章加盖在示例文件上的效果图片链接。链接有效期为90天。</p>
    */
    @SerializedName("PreviewFileUrl")
    @Expose
    private String PreviewFileUrl;

    /**
    * <p>创建印章预览逻辑，返回的是印章加盖在示例文件上的效果PDF文件链接。链接有效期为90天。</p>
    */
    @SerializedName("PreviewPdfUrl")
    @Expose
    private String PreviewPdfUrl;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>电子印章ID，为32位字符串。<br>建议开发者保留此印章ID，后续指定签署区印章或者操作印章需此印章ID。<br>可登录腾讯电子签控制台，在 &quot;印章&quot;-&gt;&quot;印章中心&quot;选择查看的印章，在&quot;印章详情&quot; 中查看某个印章的SealId(在页面中展示为印章ID)。</p> 
     * @return SealId <p>电子印章ID，为32位字符串。<br>建议开发者保留此印章ID，后续指定签署区印章或者操作印章需此印章ID。<br>可登录腾讯电子签控制台，在 &quot;印章&quot;-&gt;&quot;印章中心&quot;选择查看的印章，在&quot;印章详情&quot; 中查看某个印章的SealId(在页面中展示为印章ID)。</p>
     */
    public String getSealId() {
        return this.SealId;
    }

    /**
     * Set <p>电子印章ID，为32位字符串。<br>建议开发者保留此印章ID，后续指定签署区印章或者操作印章需此印章ID。<br>可登录腾讯电子签控制台，在 &quot;印章&quot;-&gt;&quot;印章中心&quot;选择查看的印章，在&quot;印章详情&quot; 中查看某个印章的SealId(在页面中展示为印章ID)。</p>
     * @param SealId <p>电子印章ID，为32位字符串。<br>建议开发者保留此印章ID，后续指定签署区印章或者操作印章需此印章ID。<br>可登录腾讯电子签控制台，在 &quot;印章&quot;-&gt;&quot;印章中心&quot;选择查看的印章，在&quot;印章详情&quot; 中查看某个印章的SealId(在页面中展示为印章ID)。</p>
     */
    public void setSealId(String SealId) {
        this.SealId = SealId;
    }

    /**
     * Get <p>电子印章预览链接地址，地址默认失效时间为24小时。</p> 
     * @return ImageUrl <p>电子印章预览链接地址，地址默认失效时间为24小时。</p>
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set <p>电子印章预览链接地址，地址默认失效时间为24小时。</p>
     * @param ImageUrl <p>电子印章预览链接地址，地址默认失效时间为24小时。</p>
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get <p>人脸验证操作人链接，用法可以参考&quot;<a href="https://qian.tencent.com/developers/company/openwxminiprogram/">跳转电子签小程序配置</a>&quot;，默认为空。</p> 
     * @return SealOperatorVerifyPath <p>人脸验证操作人链接，用法可以参考&quot;<a href="https://qian.tencent.com/developers/company/openwxminiprogram/">跳转电子签小程序配置</a>&quot;，默认为空。</p>
     */
    public String getSealOperatorVerifyPath() {
        return this.SealOperatorVerifyPath;
    }

    /**
     * Set <p>人脸验证操作人链接，用法可以参考&quot;<a href="https://qian.tencent.com/developers/company/openwxminiprogram/">跳转电子签小程序配置</a>&quot;，默认为空。</p>
     * @param SealOperatorVerifyPath <p>人脸验证操作人链接，用法可以参考&quot;<a href="https://qian.tencent.com/developers/company/openwxminiprogram/">跳转电子签小程序配置</a>&quot;，默认为空。</p>
     */
    public void setSealOperatorVerifyPath(String SealOperatorVerifyPath) {
        this.SealOperatorVerifyPath = SealOperatorVerifyPath;
    }

    /**
     * Get <p>人脸验证操作人二维码链接，扫码后会跳转到腾讯电子签小程序进行人脸验证，默认为空。</p> 
     * @return SealOperatorVerifyQrcodeUrl <p>人脸验证操作人二维码链接，扫码后会跳转到腾讯电子签小程序进行人脸验证，默认为空。</p>
     */
    public String getSealOperatorVerifyQrcodeUrl() {
        return this.SealOperatorVerifyQrcodeUrl;
    }

    /**
     * Set <p>人脸验证操作人二维码链接，扫码后会跳转到腾讯电子签小程序进行人脸验证，默认为空。</p>
     * @param SealOperatorVerifyQrcodeUrl <p>人脸验证操作人二维码链接，扫码后会跳转到腾讯电子签小程序进行人脸验证，默认为空。</p>
     */
    public void setSealOperatorVerifyQrcodeUrl(String SealOperatorVerifyQrcodeUrl) {
        this.SealOperatorVerifyQrcodeUrl = SealOperatorVerifyQrcodeUrl;
    }

    /**
     * Get <p>创建印章预览逻辑，返回的是印章加盖在示例文件上的效果图片链接。链接有效期为90天。</p> 
     * @return PreviewFileUrl <p>创建印章预览逻辑，返回的是印章加盖在示例文件上的效果图片链接。链接有效期为90天。</p>
     */
    public String getPreviewFileUrl() {
        return this.PreviewFileUrl;
    }

    /**
     * Set <p>创建印章预览逻辑，返回的是印章加盖在示例文件上的效果图片链接。链接有效期为90天。</p>
     * @param PreviewFileUrl <p>创建印章预览逻辑，返回的是印章加盖在示例文件上的效果图片链接。链接有效期为90天。</p>
     */
    public void setPreviewFileUrl(String PreviewFileUrl) {
        this.PreviewFileUrl = PreviewFileUrl;
    }

    /**
     * Get <p>创建印章预览逻辑，返回的是印章加盖在示例文件上的效果PDF文件链接。链接有效期为90天。</p> 
     * @return PreviewPdfUrl <p>创建印章预览逻辑，返回的是印章加盖在示例文件上的效果PDF文件链接。链接有效期为90天。</p>
     */
    public String getPreviewPdfUrl() {
        return this.PreviewPdfUrl;
    }

    /**
     * Set <p>创建印章预览逻辑，返回的是印章加盖在示例文件上的效果PDF文件链接。链接有效期为90天。</p>
     * @param PreviewPdfUrl <p>创建印章预览逻辑，返回的是印章加盖在示例文件上的效果PDF文件链接。链接有效期为90天。</p>
     */
    public void setPreviewPdfUrl(String PreviewPdfUrl) {
        this.PreviewPdfUrl = PreviewPdfUrl;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreateSealResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSealResponse(CreateSealResponse source) {
        if (source.SealId != null) {
            this.SealId = new String(source.SealId);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.SealOperatorVerifyPath != null) {
            this.SealOperatorVerifyPath = new String(source.SealOperatorVerifyPath);
        }
        if (source.SealOperatorVerifyQrcodeUrl != null) {
            this.SealOperatorVerifyQrcodeUrl = new String(source.SealOperatorVerifyQrcodeUrl);
        }
        if (source.PreviewFileUrl != null) {
            this.PreviewFileUrl = new String(source.PreviewFileUrl);
        }
        if (source.PreviewPdfUrl != null) {
            this.PreviewPdfUrl = new String(source.PreviewPdfUrl);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SealId", this.SealId);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "SealOperatorVerifyPath", this.SealOperatorVerifyPath);
        this.setParamSimple(map, prefix + "SealOperatorVerifyQrcodeUrl", this.SealOperatorVerifyQrcodeUrl);
        this.setParamSimple(map, prefix + "PreviewFileUrl", this.PreviewFileUrl);
        this.setParamSimple(map, prefix + "PreviewPdfUrl", this.PreviewPdfUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

