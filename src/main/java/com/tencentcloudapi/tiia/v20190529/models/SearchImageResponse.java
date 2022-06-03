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

public class SearchImageResponse extends AbstractModel{

    /**
    * 返回结果数量。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 图片信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageInfos")
    @Expose
    private ImageInfo [] ImageInfos;

    /**
    * 输入图的主体信息。
若启用主体识别且在请求中指定了类目ID或主体区域，以指定的主体为准。若启用主体识别且没有指定，以最大面积主体为准。
注意：此字段可能返回 null，表示取不到有效值。服务类型为商品图像搜索时生效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Object")
    @Expose
    private ObjectInfo Object;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回结果数量。 
     * @return Count 返回结果数量。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 返回结果数量。
     * @param Count 返回结果数量。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 图片信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageInfos 图片信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageInfo [] getImageInfos() {
        return this.ImageInfos;
    }

    /**
     * Set 图片信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageInfos 图片信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageInfos(ImageInfo [] ImageInfos) {
        this.ImageInfos = ImageInfos;
    }

    /**
     * Get 输入图的主体信息。
若启用主体识别且在请求中指定了类目ID或主体区域，以指定的主体为准。若启用主体识别且没有指定，以最大面积主体为准。
注意：此字段可能返回 null，表示取不到有效值。服务类型为商品图像搜索时生效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Object 输入图的主体信息。
若启用主体识别且在请求中指定了类目ID或主体区域，以指定的主体为准。若启用主体识别且没有指定，以最大面积主体为准。
注意：此字段可能返回 null，表示取不到有效值。服务类型为商品图像搜索时生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ObjectInfo getObject() {
        return this.Object;
    }

    /**
     * Set 输入图的主体信息。
若启用主体识别且在请求中指定了类目ID或主体区域，以指定的主体为准。若启用主体识别且没有指定，以最大面积主体为准。
注意：此字段可能返回 null，表示取不到有效值。服务类型为商品图像搜索时生效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Object 输入图的主体信息。
若启用主体识别且在请求中指定了类目ID或主体区域，以指定的主体为准。若启用主体识别且没有指定，以最大面积主体为准。
注意：此字段可能返回 null，表示取不到有效值。服务类型为商品图像搜索时生效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObject(ObjectInfo Object) {
        this.Object = Object;
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

    public SearchImageResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchImageResponse(SearchImageResponse source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.ImageInfos != null) {
            this.ImageInfos = new ImageInfo[source.ImageInfos.length];
            for (int i = 0; i < source.ImageInfos.length; i++) {
                this.ImageInfos[i] = new ImageInfo(source.ImageInfos[i]);
            }
        }
        if (source.Object != null) {
            this.Object = new ObjectInfo(source.Object);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamArrayObj(map, prefix + "ImageInfos.", this.ImageInfos);
        this.setParamObj(map, prefix + "Object.", this.Object);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

