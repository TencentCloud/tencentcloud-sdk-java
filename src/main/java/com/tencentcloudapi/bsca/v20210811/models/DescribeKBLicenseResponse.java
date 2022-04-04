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
package com.tencentcloudapi.bsca.v20210811.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeKBLicenseResponse extends AbstractModel{

    /**
    * 许可证列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LicenseList")
    @Expose
    private LicenseUnion [] LicenseList;

    /**
    * 用于匹配的License表达式
    */
    @SerializedName("NormalizedLicenseExpression")
    @Expose
    private String NormalizedLicenseExpression;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 许可证列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LicenseList 许可证列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LicenseUnion [] getLicenseList() {
        return this.LicenseList;
    }

    /**
     * Set 许可证列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param LicenseList 许可证列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLicenseList(LicenseUnion [] LicenseList) {
        this.LicenseList = LicenseList;
    }

    /**
     * Get 用于匹配的License表达式 
     * @return NormalizedLicenseExpression 用于匹配的License表达式
     */
    public String getNormalizedLicenseExpression() {
        return this.NormalizedLicenseExpression;
    }

    /**
     * Set 用于匹配的License表达式
     * @param NormalizedLicenseExpression 用于匹配的License表达式
     */
    public void setNormalizedLicenseExpression(String NormalizedLicenseExpression) {
        this.NormalizedLicenseExpression = NormalizedLicenseExpression;
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

    public DescribeKBLicenseResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKBLicenseResponse(DescribeKBLicenseResponse source) {
        if (source.LicenseList != null) {
            this.LicenseList = new LicenseUnion[source.LicenseList.length];
            for (int i = 0; i < source.LicenseList.length; i++) {
                this.LicenseList[i] = new LicenseUnion(source.LicenseList[i]);
            }
        }
        if (source.NormalizedLicenseExpression != null) {
            this.NormalizedLicenseExpression = new String(source.NormalizedLicenseExpression);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "LicenseList.", this.LicenseList);
        this.setParamSimple(map, prefix + "NormalizedLicenseExpression", this.NormalizedLicenseExpression);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

