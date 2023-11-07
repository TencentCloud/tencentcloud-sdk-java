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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSealByImageResponse extends AbstractModel {

    /**
    * 电子印章ID，为32位字符串。
建议开发者保留此印章ID，后续指定签署区印章或者操作印章需此印章ID。
    */
    @SerializedName("SealId")
    @Expose
    private String SealId;

    /**
    * 电子印章预览链接地址，地址默认失效时间为24小时。

注:`图片上传生成的电子印章无预览链接地址`
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 电子印章ID，为32位字符串。
建议开发者保留此印章ID，后续指定签署区印章或者操作印章需此印章ID。 
     * @return SealId 电子印章ID，为32位字符串。
建议开发者保留此印章ID，后续指定签署区印章或者操作印章需此印章ID。
     */
    public String getSealId() {
        return this.SealId;
    }

    /**
     * Set 电子印章ID，为32位字符串。
建议开发者保留此印章ID，后续指定签署区印章或者操作印章需此印章ID。
     * @param SealId 电子印章ID，为32位字符串。
建议开发者保留此印章ID，后续指定签署区印章或者操作印章需此印章ID。
     */
    public void setSealId(String SealId) {
        this.SealId = SealId;
    }

    /**
     * Get 电子印章预览链接地址，地址默认失效时间为24小时。

注:`图片上传生成的电子印章无预览链接地址`
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageUrl 电子印章预览链接地址，地址默认失效时间为24小时。

注:`图片上传生成的电子印章无预览链接地址`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 电子印章预览链接地址，地址默认失效时间为24小时。

注:`图片上传生成的电子印章无预览链接地址`
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageUrl 电子印章预览链接地址，地址默认失效时间为24小时。

注:`图片上传生成的电子印章无预览链接地址`
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
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

    public CreateSealByImageResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSealByImageResponse(CreateSealByImageResponse source) {
        if (source.SealId != null) {
            this.SealId = new String(source.SealId);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

