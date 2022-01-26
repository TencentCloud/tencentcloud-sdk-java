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

public class DeleteCustomPersonImageRequest extends AbstractModel{

    /**
    * 自定义人物Id
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * 自定义人脸图片Id
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

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
     * Get 自定义人脸图片Id 
     * @return ImageId 自定义人脸图片Id
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 自定义人脸图片Id
     * @param ImageId 自定义人脸图片Id
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    public DeleteCustomPersonImageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCustomPersonImageRequest(DeleteCustomPersonImageRequest source) {
        if (source.PersonId != null) {
            this.PersonId = new String(source.PersonId);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);

    }
}

