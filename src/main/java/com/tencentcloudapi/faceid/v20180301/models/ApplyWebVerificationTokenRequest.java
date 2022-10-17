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

public class ApplyWebVerificationTokenRequest extends AbstractModel{

    /**
    * 核验结束后重定向的Web回跳地址。
    */
    @SerializedName("RedirectUrl")
    @Expose
    private String RedirectUrl;

    /**
    * 人脸比对照片的腾讯云对象存储地址，可以使用以下两种方式：
1. 调用CreateUploadUrl接口生成，确保成功上传照片后再调用此接口。
2. 使用已有的腾讯云对象存储地址，如果是私有读写桶，请使用预签名URL授予下载权限，对象存储地域需要和入参Region保持一致。
    */
    @SerializedName("CompareImageUrl")
    @Expose
    private String CompareImageUrl;

    /**
    * 人脸比对照片（CompareImageUrl）内容的MD5散列值。
    */
    @SerializedName("CompareImageMd5")
    @Expose
    private String CompareImageMd5;

    /**
     * Get 核验结束后重定向的Web回跳地址。 
     * @return RedirectUrl 核验结束后重定向的Web回跳地址。
     */
    public String getRedirectUrl() {
        return this.RedirectUrl;
    }

    /**
     * Set 核验结束后重定向的Web回跳地址。
     * @param RedirectUrl 核验结束后重定向的Web回跳地址。
     */
    public void setRedirectUrl(String RedirectUrl) {
        this.RedirectUrl = RedirectUrl;
    }

    /**
     * Get 人脸比对照片的腾讯云对象存储地址，可以使用以下两种方式：
1. 调用CreateUploadUrl接口生成，确保成功上传照片后再调用此接口。
2. 使用已有的腾讯云对象存储地址，如果是私有读写桶，请使用预签名URL授予下载权限，对象存储地域需要和入参Region保持一致。 
     * @return CompareImageUrl 人脸比对照片的腾讯云对象存储地址，可以使用以下两种方式：
1. 调用CreateUploadUrl接口生成，确保成功上传照片后再调用此接口。
2. 使用已有的腾讯云对象存储地址，如果是私有读写桶，请使用预签名URL授予下载权限，对象存储地域需要和入参Region保持一致。
     */
    public String getCompareImageUrl() {
        return this.CompareImageUrl;
    }

    /**
     * Set 人脸比对照片的腾讯云对象存储地址，可以使用以下两种方式：
1. 调用CreateUploadUrl接口生成，确保成功上传照片后再调用此接口。
2. 使用已有的腾讯云对象存储地址，如果是私有读写桶，请使用预签名URL授予下载权限，对象存储地域需要和入参Region保持一致。
     * @param CompareImageUrl 人脸比对照片的腾讯云对象存储地址，可以使用以下两种方式：
1. 调用CreateUploadUrl接口生成，确保成功上传照片后再调用此接口。
2. 使用已有的腾讯云对象存储地址，如果是私有读写桶，请使用预签名URL授予下载权限，对象存储地域需要和入参Region保持一致。
     */
    public void setCompareImageUrl(String CompareImageUrl) {
        this.CompareImageUrl = CompareImageUrl;
    }

    /**
     * Get 人脸比对照片（CompareImageUrl）内容的MD5散列值。 
     * @return CompareImageMd5 人脸比对照片（CompareImageUrl）内容的MD5散列值。
     */
    public String getCompareImageMd5() {
        return this.CompareImageMd5;
    }

    /**
     * Set 人脸比对照片（CompareImageUrl）内容的MD5散列值。
     * @param CompareImageMd5 人脸比对照片（CompareImageUrl）内容的MD5散列值。
     */
    public void setCompareImageMd5(String CompareImageMd5) {
        this.CompareImageMd5 = CompareImageMd5;
    }

    public ApplyWebVerificationTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyWebVerificationTokenRequest(ApplyWebVerificationTokenRequest source) {
        if (source.RedirectUrl != null) {
            this.RedirectUrl = new String(source.RedirectUrl);
        }
        if (source.CompareImageUrl != null) {
            this.CompareImageUrl = new String(source.CompareImageUrl);
        }
        if (source.CompareImageMd5 != null) {
            this.CompareImageMd5 = new String(source.CompareImageMd5);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RedirectUrl", this.RedirectUrl);
        this.setParamSimple(map, prefix + "CompareImageUrl", this.CompareImageUrl);
        this.setParamSimple(map, prefix + "CompareImageMd5", this.CompareImageMd5);

    }
}

