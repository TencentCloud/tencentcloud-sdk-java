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
package com.tencentcloudapi.nlp.v20190408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClassifyContentResponse extends AbstractModel{

    /**
    * 一级分类。（请参见附录[三级分类体系表](https://cloud.tencent.com/document/product/271/94286)）
    */
    @SerializedName("FirstClassification")
    @Expose
    private Category FirstClassification;

    /**
    * 二级分类。（请参见附录[三级分类体系表](https://cloud.tencent.com/document/product/271/94286)）
    */
    @SerializedName("SecondClassification")
    @Expose
    private Category SecondClassification;

    /**
    * 三级分类。（请参见附录[三级分类体系表](https://cloud.tencent.com/document/product/271/94286)）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ThirdClassification")
    @Expose
    private Category ThirdClassification;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 一级分类。（请参见附录[三级分类体系表](https://cloud.tencent.com/document/product/271/94286)） 
     * @return FirstClassification 一级分类。（请参见附录[三级分类体系表](https://cloud.tencent.com/document/product/271/94286)）
     */
    public Category getFirstClassification() {
        return this.FirstClassification;
    }

    /**
     * Set 一级分类。（请参见附录[三级分类体系表](https://cloud.tencent.com/document/product/271/94286)）
     * @param FirstClassification 一级分类。（请参见附录[三级分类体系表](https://cloud.tencent.com/document/product/271/94286)）
     */
    public void setFirstClassification(Category FirstClassification) {
        this.FirstClassification = FirstClassification;
    }

    /**
     * Get 二级分类。（请参见附录[三级分类体系表](https://cloud.tencent.com/document/product/271/94286)） 
     * @return SecondClassification 二级分类。（请参见附录[三级分类体系表](https://cloud.tencent.com/document/product/271/94286)）
     */
    public Category getSecondClassification() {
        return this.SecondClassification;
    }

    /**
     * Set 二级分类。（请参见附录[三级分类体系表](https://cloud.tencent.com/document/product/271/94286)）
     * @param SecondClassification 二级分类。（请参见附录[三级分类体系表](https://cloud.tencent.com/document/product/271/94286)）
     */
    public void setSecondClassification(Category SecondClassification) {
        this.SecondClassification = SecondClassification;
    }

    /**
     * Get 三级分类。（请参见附录[三级分类体系表](https://cloud.tencent.com/document/product/271/94286)）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ThirdClassification 三级分类。（请参见附录[三级分类体系表](https://cloud.tencent.com/document/product/271/94286)）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Category getThirdClassification() {
        return this.ThirdClassification;
    }

    /**
     * Set 三级分类。（请参见附录[三级分类体系表](https://cloud.tencent.com/document/product/271/94286)）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ThirdClassification 三级分类。（请参见附录[三级分类体系表](https://cloud.tencent.com/document/product/271/94286)）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setThirdClassification(Category ThirdClassification) {
        this.ThirdClassification = ThirdClassification;
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

    public ClassifyContentResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClassifyContentResponse(ClassifyContentResponse source) {
        if (source.FirstClassification != null) {
            this.FirstClassification = new Category(source.FirstClassification);
        }
        if (source.SecondClassification != null) {
            this.SecondClassification = new Category(source.SecondClassification);
        }
        if (source.ThirdClassification != null) {
            this.ThirdClassification = new Category(source.ThirdClassification);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "FirstClassification.", this.FirstClassification);
        this.setParamObj(map, prefix + "SecondClassification.", this.SecondClassification);
        this.setParamObj(map, prefix + "ThirdClassification.", this.ThirdClassification);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

