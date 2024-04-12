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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAttributeLabelResponse extends AbstractModel {

    /**
    * 属性ID
    */
    @SerializedName("AttributeBizId")
    @Expose
    private String AttributeBizId;

    /**
    * 属性标识
    */
    @SerializedName("AttrKey")
    @Expose
    private String AttrKey;

    /**
    * 属性名称
    */
    @SerializedName("AttrName")
    @Expose
    private String AttrName;

    /**
    * 标签数量
    */
    @SerializedName("LabelNumber")
    @Expose
    private String LabelNumber;

    /**
    * 标签名称
    */
    @SerializedName("Labels")
    @Expose
    private AttributeLabel [] Labels;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 属性ID 
     * @return AttributeBizId 属性ID
     */
    public String getAttributeBizId() {
        return this.AttributeBizId;
    }

    /**
     * Set 属性ID
     * @param AttributeBizId 属性ID
     */
    public void setAttributeBizId(String AttributeBizId) {
        this.AttributeBizId = AttributeBizId;
    }

    /**
     * Get 属性标识 
     * @return AttrKey 属性标识
     */
    public String getAttrKey() {
        return this.AttrKey;
    }

    /**
     * Set 属性标识
     * @param AttrKey 属性标识
     */
    public void setAttrKey(String AttrKey) {
        this.AttrKey = AttrKey;
    }

    /**
     * Get 属性名称 
     * @return AttrName 属性名称
     */
    public String getAttrName() {
        return this.AttrName;
    }

    /**
     * Set 属性名称
     * @param AttrName 属性名称
     */
    public void setAttrName(String AttrName) {
        this.AttrName = AttrName;
    }

    /**
     * Get 标签数量 
     * @return LabelNumber 标签数量
     */
    public String getLabelNumber() {
        return this.LabelNumber;
    }

    /**
     * Set 标签数量
     * @param LabelNumber 标签数量
     */
    public void setLabelNumber(String LabelNumber) {
        this.LabelNumber = LabelNumber;
    }

    /**
     * Get 标签名称 
     * @return Labels 标签名称
     */
    public AttributeLabel [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 标签名称
     * @param Labels 标签名称
     */
    public void setLabels(AttributeLabel [] Labels) {
        this.Labels = Labels;
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

    public DescribeAttributeLabelResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAttributeLabelResponse(DescribeAttributeLabelResponse source) {
        if (source.AttributeBizId != null) {
            this.AttributeBizId = new String(source.AttributeBizId);
        }
        if (source.AttrKey != null) {
            this.AttrKey = new String(source.AttrKey);
        }
        if (source.AttrName != null) {
            this.AttrName = new String(source.AttrName);
        }
        if (source.LabelNumber != null) {
            this.LabelNumber = new String(source.LabelNumber);
        }
        if (source.Labels != null) {
            this.Labels = new AttributeLabel[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new AttributeLabel(source.Labels[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AttributeBizId", this.AttributeBizId);
        this.setParamSimple(map, prefix + "AttrKey", this.AttrKey);
        this.setParamSimple(map, prefix + "AttrName", this.AttrName);
        this.setParamSimple(map, prefix + "LabelNumber", this.LabelNumber);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

