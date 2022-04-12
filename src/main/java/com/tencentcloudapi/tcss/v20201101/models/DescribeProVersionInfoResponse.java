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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProVersionInfoResponse extends AbstractModel{

    /**
    * 专业版开始时间，补充购买时才不为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 专业版结束时间，补充购买时才不为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 需购买的机器核数
    */
    @SerializedName("CoresCnt")
    @Expose
    private Long CoresCnt;

    /**
    * 弹性计费上限
    */
    @SerializedName("MaxPostPayCoresCnt")
    @Expose
    private Long MaxPostPayCoresCnt;

    /**
    * 资源ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 购买状态
待购: Pending
已购: Normal
隔离: Isolate
    */
    @SerializedName("BuyStatus")
    @Expose
    private String BuyStatus;

    /**
    * 是否曾经购买过(false:未曾 true:曾经购买过)
    */
    @SerializedName("IsPurchased")
    @Expose
    private Boolean IsPurchased;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 专业版开始时间，补充购买时才不为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 专业版开始时间，补充购买时才不为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 专业版开始时间，补充购买时才不为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 专业版开始时间，补充购买时才不为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 专业版结束时间，补充购买时才不为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 专业版结束时间，补充购买时才不为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 专业版结束时间，补充购买时才不为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 专业版结束时间，补充购买时才不为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 需购买的机器核数 
     * @return CoresCnt 需购买的机器核数
     */
    public Long getCoresCnt() {
        return this.CoresCnt;
    }

    /**
     * Set 需购买的机器核数
     * @param CoresCnt 需购买的机器核数
     */
    public void setCoresCnt(Long CoresCnt) {
        this.CoresCnt = CoresCnt;
    }

    /**
     * Get 弹性计费上限 
     * @return MaxPostPayCoresCnt 弹性计费上限
     */
    public Long getMaxPostPayCoresCnt() {
        return this.MaxPostPayCoresCnt;
    }

    /**
     * Set 弹性计费上限
     * @param MaxPostPayCoresCnt 弹性计费上限
     */
    public void setMaxPostPayCoresCnt(Long MaxPostPayCoresCnt) {
        this.MaxPostPayCoresCnt = MaxPostPayCoresCnt;
    }

    /**
     * Get 资源ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceId 资源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceId 资源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 购买状态
待购: Pending
已购: Normal
隔离: Isolate 
     * @return BuyStatus 购买状态
待购: Pending
已购: Normal
隔离: Isolate
     */
    public String getBuyStatus() {
        return this.BuyStatus;
    }

    /**
     * Set 购买状态
待购: Pending
已购: Normal
隔离: Isolate
     * @param BuyStatus 购买状态
待购: Pending
已购: Normal
隔离: Isolate
     */
    public void setBuyStatus(String BuyStatus) {
        this.BuyStatus = BuyStatus;
    }

    /**
     * Get 是否曾经购买过(false:未曾 true:曾经购买过) 
     * @return IsPurchased 是否曾经购买过(false:未曾 true:曾经购买过)
     */
    public Boolean getIsPurchased() {
        return this.IsPurchased;
    }

    /**
     * Set 是否曾经购买过(false:未曾 true:曾经购买过)
     * @param IsPurchased 是否曾经购买过(false:未曾 true:曾经购买过)
     */
    public void setIsPurchased(Boolean IsPurchased) {
        this.IsPurchased = IsPurchased;
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

    public DescribeProVersionInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProVersionInfoResponse(DescribeProVersionInfoResponse source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CoresCnt != null) {
            this.CoresCnt = new Long(source.CoresCnt);
        }
        if (source.MaxPostPayCoresCnt != null) {
            this.MaxPostPayCoresCnt = new Long(source.MaxPostPayCoresCnt);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.BuyStatus != null) {
            this.BuyStatus = new String(source.BuyStatus);
        }
        if (source.IsPurchased != null) {
            this.IsPurchased = new Boolean(source.IsPurchased);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CoresCnt", this.CoresCnt);
        this.setParamSimple(map, prefix + "MaxPostPayCoresCnt", this.MaxPostPayCoresCnt);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "BuyStatus", this.BuyStatus);
        this.setParamSimple(map, prefix + "IsPurchased", this.IsPurchased);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

