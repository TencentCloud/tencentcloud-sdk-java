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

public class AddCustomPersonImageResponse extends AbstractModel{

    /**
    * 自定义人物Id
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * 自定义人脸图片信息
    */
    @SerializedName("ImageInfo")
    @Expose
    private PersonImageInfo ImageInfo;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 自定义人物Id 
     * @return PersonId 自定义人物Id
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 自定义人物Id
     * @param PersonId 自定义人物Id
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get 自定义人脸图片信息 
     * @return ImageInfo 自定义人脸图片信息
     */
    public PersonImageInfo getImageInfo() {
        return this.ImageInfo;
    }

    /**
     * Set 自定义人脸图片信息
     * @param ImageInfo 自定义人脸图片信息
     */
    public void setImageInfo(PersonImageInfo ImageInfo) {
        this.ImageInfo = ImageInfo;
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

    public AddCustomPersonImageResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddCustomPersonImageResponse(AddCustomPersonImageResponse source) {
        if (source.PersonId != null) {
            this.PersonId = new String(source.PersonId);
        }
        if (source.ImageInfo != null) {
            this.ImageInfo = new PersonImageInfo(source.ImageInfo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamObj(map, prefix + "ImageInfo.", this.ImageInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

