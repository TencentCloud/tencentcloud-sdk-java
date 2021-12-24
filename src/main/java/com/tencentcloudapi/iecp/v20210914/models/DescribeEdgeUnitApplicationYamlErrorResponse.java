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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEdgeUnitApplicationYamlErrorResponse extends AbstractModel{

    /**
    * 是否通过
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckPass")
    @Expose
    private Boolean CheckPass;

    /**
    * 错误类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrType")
    @Expose
    private Long ErrType;

    /**
    * 错误信息
    */
    @SerializedName("ErrInfo")
    @Expose
    private String ErrInfo;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 是否通过
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckPass 是否通过
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getCheckPass() {
        return this.CheckPass;
    }

    /**
     * Set 是否通过
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckPass 是否通过
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckPass(Boolean CheckPass) {
        this.CheckPass = CheckPass;
    }

    /**
     * Get 错误类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrType 错误类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getErrType() {
        return this.ErrType;
    }

    /**
     * Set 错误类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrType 错误类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrType(Long ErrType) {
        this.ErrType = ErrType;
    }

    /**
     * Get 错误信息 
     * @return ErrInfo 错误信息
     */
    public String getErrInfo() {
        return this.ErrInfo;
    }

    /**
     * Set 错误信息
     * @param ErrInfo 错误信息
     */
    public void setErrInfo(String ErrInfo) {
        this.ErrInfo = ErrInfo;
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

    public DescribeEdgeUnitApplicationYamlErrorResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEdgeUnitApplicationYamlErrorResponse(DescribeEdgeUnitApplicationYamlErrorResponse source) {
        if (source.CheckPass != null) {
            this.CheckPass = new Boolean(source.CheckPass);
        }
        if (source.ErrType != null) {
            this.ErrType = new Long(source.ErrType);
        }
        if (source.ErrInfo != null) {
            this.ErrInfo = new String(source.ErrInfo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CheckPass", this.CheckPass);
        this.setParamSimple(map, prefix + "ErrType", this.ErrType);
        this.setParamSimple(map, prefix + "ErrInfo", this.ErrInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

