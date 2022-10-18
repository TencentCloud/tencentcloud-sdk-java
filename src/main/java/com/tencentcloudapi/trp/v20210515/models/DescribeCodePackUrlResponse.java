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
package com.tencentcloudapi.trp.v20210515.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCodePackUrlResponse extends AbstractModel{

    /**
    * 文字码包地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 图片码包地址，可能为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImgUrl")
    @Expose
    private String ImgUrl;

    /**
    * 文字码包Key，用于上传导入
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileKey")
    @Expose
    private String FileKey;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 文字码包地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Url 文字码包地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 文字码包地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Url 文字码包地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 图片码包地址，可能为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImgUrl 图片码包地址，可能为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImgUrl() {
        return this.ImgUrl;
    }

    /**
     * Set 图片码包地址，可能为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImgUrl 图片码包地址，可能为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImgUrl(String ImgUrl) {
        this.ImgUrl = ImgUrl;
    }

    /**
     * Get 文字码包Key，用于上传导入
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileKey 文字码包Key，用于上传导入
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileKey() {
        return this.FileKey;
    }

    /**
     * Set 文字码包Key，用于上传导入
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileKey 文字码包Key，用于上传导入
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileKey(String FileKey) {
        this.FileKey = FileKey;
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

    public DescribeCodePackUrlResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCodePackUrlResponse(DescribeCodePackUrlResponse source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.ImgUrl != null) {
            this.ImgUrl = new String(source.ImgUrl);
        }
        if (source.FileKey != null) {
            this.FileKey = new String(source.FileKey);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "ImgUrl", this.ImgUrl);
        this.setParamSimple(map, prefix + "FileKey", this.FileKey);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

