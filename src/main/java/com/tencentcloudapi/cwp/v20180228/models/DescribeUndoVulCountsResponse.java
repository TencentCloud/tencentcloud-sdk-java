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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUndoVulCountsResponse extends AbstractModel{

    /**
    * 未处理的漏洞数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UndoVulCount")
    @Expose
    private Long UndoVulCount;

    /**
    * 未处理的主机数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UndoHostCount")
    @Expose
    private Long UndoHostCount;

    /**
    * 普通版主机数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotProfessionCount")
    @Expose
    private Long NotProfessionCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 未处理的漏洞数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UndoVulCount 未处理的漏洞数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUndoVulCount() {
        return this.UndoVulCount;
    }

    /**
     * Set 未处理的漏洞数
注意：此字段可能返回 null，表示取不到有效值。
     * @param UndoVulCount 未处理的漏洞数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUndoVulCount(Long UndoVulCount) {
        this.UndoVulCount = UndoVulCount;
    }

    /**
     * Get 未处理的主机数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UndoHostCount 未处理的主机数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUndoHostCount() {
        return this.UndoHostCount;
    }

    /**
     * Set 未处理的主机数
注意：此字段可能返回 null，表示取不到有效值。
     * @param UndoHostCount 未处理的主机数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUndoHostCount(Long UndoHostCount) {
        this.UndoHostCount = UndoHostCount;
    }

    /**
     * Get 普通版主机数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NotProfessionCount 普通版主机数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNotProfessionCount() {
        return this.NotProfessionCount;
    }

    /**
     * Set 普通版主机数
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotProfessionCount 普通版主机数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotProfessionCount(Long NotProfessionCount) {
        this.NotProfessionCount = NotProfessionCount;
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

    public DescribeUndoVulCountsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUndoVulCountsResponse(DescribeUndoVulCountsResponse source) {
        if (source.UndoVulCount != null) {
            this.UndoVulCount = new Long(source.UndoVulCount);
        }
        if (source.UndoHostCount != null) {
            this.UndoHostCount = new Long(source.UndoHostCount);
        }
        if (source.NotProfessionCount != null) {
            this.NotProfessionCount = new Long(source.NotProfessionCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UndoVulCount", this.UndoVulCount);
        this.setParamSimple(map, prefix + "UndoHostCount", this.UndoHostCount);
        this.setParamSimple(map, prefix + "NotProfessionCount", this.NotProfessionCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

